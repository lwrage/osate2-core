package org.osate.ge.internal.graphiti.services.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.eclipse.emf.common.command.AbstractCommand;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.Context;
import org.osate.aadl2.EndToEndFlow;
import org.osate.aadl2.EndToEndFlowSegment;
import org.osate.aadl2.Feature;
import org.osate.aadl2.FlowImplementation;
import org.osate.aadl2.FlowSegment;
import org.osate.aadl2.FlowSpecification;
import org.osate.aadl2.ModalElement;
import org.osate.aadl2.ModalPath;
import org.osate.aadl2.ModeBinding;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.Subcomponent;
import org.osate.ge.BusinessObjectContext;
import org.osate.ge.graphics.Color;
import org.osate.ge.internal.diagram.runtime.DiagramElement;
import org.osate.ge.internal.graphiti.diagram.GraphitiAgeDiagram;
import org.osate.ge.internal.graphiti.services.GraphitiService;
import org.osate.ge.internal.services.ColoringService;
import org.osate.ge.internal.util.AadlHelper;

public class DefaultColoringService implements ColoringService {
	private static final Color inSelectedModeColor = Color.PURPLE;
	private static final Color inSelectedFlowColor = new Color(0, 100, 0);
	private static final Color inSelectedModeAndFlowColor = Color.CYAN.darker();
	private final GraphitiService graphitiService;
	private final LinkedList<ColoringCalculator> coloringCalculators = new LinkedList<ColoringCalculator>();
	private String highlightedModeQualifiedName; // Qualified name of the highlighted mode/mode transition
	private NamedElement highlightedFlow; // Highlighted flow implementation/end to end flow

	private static interface ColoringCalculator {
		Color getForegroundColor(final DiagramElement de);
	}

	private class SimpleColoring implements Coloring, ColoringCalculator {
		private final Map<DiagramElement, Color> foregroundColors = new HashMap<>();

		@Override
		public void dispose() {
			coloringCalculators.remove(this);
			refreshColoring(foregroundColors.keySet());
		}

		@Override
		public void setForeground(final DiagramElement de, final Color color) {
			if(color == null) {
				foregroundColors.remove(de);
			} else {
				foregroundColors.put(de, color);
			}

			// Refresh Coloring
			refreshColoring(Collections.singleton(de));
		}

		@Override
		public void clear() {
			final List<DiagramElement> elements = new ArrayList<>(foregroundColors.keySet());
			for(final DiagramElement de : elements) {
				setForeground(de, null);
			}
		}

		@Override
		public Color getForegroundColor(final DiagramElement de) {
			return foregroundColors.get(de);
		}

		private void refreshColoring(final Collection<DiagramElement> diagramElements) {
			graphitiService.getEditingDomain().getCommandStack().execute(new AbstractCommand() {
				@Override
				protected boolean prepare() {
					return true;
				}

				@Override
				public void execute() {
					// Refresh Coloring
					for(final DiagramElement de : diagramElements) {
						graphitiService.getGraphitiAgeDiagram().refreshStyle(de);
					}
				}

				@Override
				public boolean canUndo() {
					return false;
				}

				@Override
				public void redo() {
				}
			});
		}
	};

	private class SelectedModeFlowColoringCalculator implements ColoringCalculator {
		@Override
		public Color getForegroundColor(final DiagramElement de) {
			final Object bo = de.getBusinessObject();

			final BusinessObjectContext possibleContextBoc;
			if(bo instanceof Feature) {
				return null;
			} else if(bo instanceof Subcomponent) {
				possibleContextBoc = de.getParent();
			} else if(bo instanceof FlowSpecification) {
				possibleContextBoc = de.getParent();
			} else {
				possibleContextBoc = null;
			}

			final Context context;
			final BusinessObjectContext contextBoc;
			final Object possibleContext = possibleContextBoc == null ? null : possibleContextBoc.getBusinessObject();
			if(possibleContext instanceof Context) {
				context = (Context)possibleContext;
				contextBoc = possibleContextBoc;
			} else {
				context = null;
				contextBoc = null;
			}

			// Exclude sub-subcomponents from highlighting...
			if(context instanceof Subcomponent) {
				if(contextBoc.getParent() != null && contextBoc.getParent().getBusinessObject() instanceof Subcomponent) {
					return null;
				}
			}

			// Check the mode of the element
			boolean inSelectedMode = false;
			final boolean isModeSelected = highlightedModeQualifiedName != null;
			if(isModeSelected) {
				if(bo instanceof ModalElement) {
					final ModalElement modalElement = (ModalElement)bo;
					if(context instanceof Subcomponent) {
						final Subcomponent sc = (Subcomponent)context;
						final boolean subcomponentIsInMode = isInMode(sc, highlightedModeQualifiedName);

						// If the subcomponent uses derived modes, then check that the element is in the derived mode
						final ComponentType ct = sc.getComponentType();
						final boolean elementIsInDerviedMode;
						if(ct != null && ct.isDerivedModes()) {
							String derivedModeName = "";
							for(final ModeBinding modeBinding : sc.getOwnedModeBindings()) {
								if(modeBinding.getParentMode() != null && highlightedModeQualifiedName.equalsIgnoreCase(modeBinding.getParentMode().getQualifiedName())) {
									derivedModeName = modeBinding.getDerivedMode() == null ? modeBinding.getParentMode().getQualifiedName() : modeBinding.getDerivedMode().getQualifiedName();
									break;
								}
							}

							elementIsInDerviedMode = derivedModeName == null ? false : isInMode(modalElement, derivedModeName);
						} else {
							elementIsInDerviedMode = true;
						}

						inSelectedMode = subcomponentIsInMode && elementIsInDerviedMode;
					} else {
						inSelectedMode = isInMode(modalElement, highlightedModeQualifiedName);
					}
				}
			}

			// Check whether the element is in the flow
			final boolean isFlowSelected = highlightedFlow != null;
			boolean inSelectedFlow = false;
			ModalPath selectedFlow = null;
			if(isFlowSelected) {
				if(bo instanceof NamedElement) {
					final NamedElement namedElement = (NamedElement)bo;

					// Check Flow Implementations
					if(highlightedFlow instanceof FlowImplementation) {
						final FlowImplementation flowImpl = ((FlowImplementation) highlightedFlow);
						final FlowSpecification flowSpec = flowImpl.getSpecification();
						if(flowSpec.getInEnd() != null && doesElementMatchFlowElement(namedElement, context, flowSpec.getInEnd().getFeature(), flowSpec.getInEnd().getContext() )) {
							inSelectedFlow = true;
						} else if(flowSpec.getOutEnd() != null && doesElementMatchFlowElement(namedElement, context, flowSpec.getOutEnd().getFeature(), flowSpec.getOutEnd().getContext())) {
							inSelectedFlow = true;
						} else {
							for(final FlowSegment fs : flowImpl.getOwnedFlowSegments()) {
								if(doesElementMatchFlowElement(namedElement, context, fs.getFlowElement(), fs.getContext())) {
									inSelectedFlow = true;
									break;
								}
							}
						}
					}

					// Check End to End Flows
					if(highlightedFlow instanceof EndToEndFlow) {
						inSelectedFlow = isInEndToEndFlow(namedElement, context, (EndToEndFlow)highlightedFlow);
					}
				}
			}

			boolean isFlowInMode =  (isModeSelected && selectedFlow != null) ? isInMode(selectedFlow, highlightedModeQualifiedName) : true;

			// Highlight accordingly
			if(inSelectedMode && (inSelectedFlow && isFlowInMode)) {
				return getInSelectedModeAndFlowColor();
			} else if(inSelectedMode) {
				return getInSelectedModeColor();
			} else if(inSelectedFlow && isFlowInMode) {
				return getInSelectedFlowColor();
			}

			return null;
		}
	};

	public DefaultColoringService(final GraphitiService graphitiService) {
		this.graphitiService = Objects.requireNonNull(graphitiService, "graphitiService must not be null");

		// Add coloring calculator to handle mode and flow behavior. It is contained here to replicate behavior of the highlighting service.
		// In the future this could be moved outside the coloring service
		this.coloringCalculators.add(new SelectedModeFlowColoringCalculator());
	}

	@Override
	public Coloring adjustColors() {
		final SimpleColoring newColoring = new SimpleColoring();
		coloringCalculators.addFirst(newColoring);
		return newColoring;
	}

	@Override
	public void setHighlightedMode(final NamedElement ne) {
		this.highlightedModeQualifiedName = ne == null ? null : ne.getQualifiedName();
		refreshDiagramColoring();
	}

	@Override
	public void setHighlightedFlow(final NamedElement ne) {
		this.highlightedFlow = ne;
		refreshDiagramColoring();
	}

	private boolean isInMode(final ModalElement modalElement, final String modeQualifiedName) {
		// Determine the total number of modes/mode transitions
		final int numModesSpecified = (modalElement instanceof ModalPath) ? (modalElement.getAllInModes().size() + ((ModalPath)modalElement).getAllInModeTransitions().size()) : modalElement.getAllInModes().size();

		if(numModesSpecified == 0 || listContainsElementWithQualifiedName(modalElement.getAllInModes(), modeQualifiedName)) {
			return true;
		} else {
			if(modalElement instanceof ModalPath) {
				final ModalPath modalPath = (ModalPath)modalElement;
				if(numModesSpecified == 0 || listContainsElementWithQualifiedName(modalPath.getAllInModeTransitions(), modeQualifiedName)) {
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public Color getForegroundColor(final DiagramElement de) {
		// Determine the appropriate color
		Color foregroundColor = null;
		for(final ColoringCalculator coloring : coloringCalculators) {
			foregroundColor = coloring.getForegroundColor(de);
			if(foregroundColor != null) {
				break;
			}
		}

		return foregroundColor;
	};

	private boolean isInEndToEndFlow(final NamedElement element, final Context context, final EndToEndFlow flow) {
		for(final EndToEndFlowSegment fs : flow.getAllFlowSegments()) {
			if(doesElementMatchFlowElement(element, context, fs.getFlowElement(), fs.getContext())) {
				return true;
			}

			// Handle referencing another ETEF
			if(fs.getContext() == null && fs.getFlowElement() instanceof EndToEndFlow) {
				if(isInEndToEndFlow(element, context, (EndToEndFlow)fs.getFlowElement())) {
					return true;
				}
			}
		}

		return false;
	}

	private boolean doesElementMatchFlowElement(NamedElement element, NamedElement context, NamedElement flowElement, NamedElement flowContext) {
		// Get refined element so that we can compare elements by qualified names
		element = AadlHelper.getRootRefinedElement(element);
		context = AadlHelper.getRootRefinedElement(context);
		flowElement = AadlHelper.getRootRefinedElement(flowElement);
		flowContext = AadlHelper.getRootRefinedElement(flowContext);

		if(areQualifiedNamesEqualOrBothNull(context, flowContext) && areQualifiedNamesEqualOrBothNull(element, flowElement)) {
			return true;
		}

		return false;
	}

	private boolean areQualifiedNamesEqualOrBothNull(final NamedElement e1, final NamedElement e2) {
		if(e1 == null && e2 == null) {
			return true;
		}

		if(e1 == null || e1.getQualifiedName() == null || e2 == null || e2.getQualifiedName() == null) {
			return false;
		}

		return e1.getQualifiedName().equalsIgnoreCase(e2.getQualifiedName());
	}

	private boolean listContainsElementWithQualifiedName(final List<? extends NamedElement> elements, final String qualifiedName) {
		for(final NamedElement el : elements) {
			if(qualifiedName.equalsIgnoreCase(el.getQualifiedName())) {
				return true;
			}
		}

		return false;
	}

	private Color getInSelectedModeColor() {
		return inSelectedModeColor;
	}

	private Color getInSelectedFlowColor() {
		return inSelectedFlowColor;
	}

	private Color getInSelectedModeAndFlowColor() {
		return inSelectedModeAndFlowColor;
	}

	private void refreshDiagramColoring() {
		if (graphitiService.getAgeDiagram() == null) {
			return;
		}

		graphitiService.getEditingDomain().getCommandStack().execute(new AbstractCommand() {
			@Override
			protected boolean prepare() {
				return true;
			}

			@Override
			public void execute() {
				// Refresh Coloring
				final GraphitiAgeDiagram graphitiAgeDiagram = graphitiService.getGraphitiAgeDiagram();
				graphitiAgeDiagram.refreshDiagramStyles();
			}

			@Override
			public boolean canUndo() {
				return false;
			}

			@Override
			public void redo() {
			}
		});
	}
}