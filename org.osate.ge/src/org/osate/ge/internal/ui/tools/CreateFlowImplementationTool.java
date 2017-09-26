package org.osate.ge.internal.ui.tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.inject.Named;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.osate.aadl2.Aadl2Factory;
import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.Feature;
import org.osate.aadl2.FlowElement;
import org.osate.aadl2.FlowEnd;
import org.osate.aadl2.FlowImplementation;
import org.osate.aadl2.FlowKind;
import org.osate.aadl2.FlowSegment;
import org.osate.aadl2.FlowSpecification;
import org.osate.aadl2.ModeFeature;
import org.osate.aadl2.NamedElement;
import org.osate.ge.BusinessObjectContext;
import org.osate.ge.di.Activate;
import org.osate.ge.graphics.Color;
import org.osate.ge.internal.di.Deactivate;
import org.osate.ge.internal.di.InternalNames;
import org.osate.ge.internal.di.SelectionChanged;
import org.osate.ge.internal.diagram.runtime.DiagramElement;
import org.osate.ge.internal.services.AadlModificationService;
import org.osate.ge.internal.services.ColoringService;
import org.osate.ge.internal.services.UiService;
import org.osate.ge.internal.ui.util.DialogPlacementHelper;

public class CreateFlowImplementationTool {
	private ColoringService.Coloring coloring = null;
	private BusinessObjectContext ciBoc;
	private ComponentImplementation ci;
	private CreateFlowImplementationDialog dlg;

	@Activate
	public void activate(@Named(InternalNames.SELECTED_DIAGRAM_ELEMENT) final BusinessObjectContext selectedBoc,
			final AadlModificationService aadlModService,
			final UiService uiService,
			final ColoringService coloringService) {
		try {
			ciBoc = ToolUtil.findComponentImplementationBoc(selectedBoc);
			if (ciBoc != null) {
				this.ci = (ComponentImplementation)ciBoc.getBusinessObject();
				this.coloring = coloringService.adjustColors();

				uiService.clearSelection();
				dlg = new CreateFlowImplementationDialog(Display.getCurrent().getActiveShell(), coloring, uiService);
				if (dlg.open() == Window.CANCEL) {
					return;
				}

				if (dlg != null) {
					aadlModService.modify(ci, (resource, ci) -> {
						ci.getOwnedFlowImplementations().add(dlg.createFlow());
						ci.setNoFlows(false);
						return null;
					});
				}
			}
		} finally {
			uiService.deactivateActiveTool();
		}
	}

	@Deactivate
	public void deactivate() {
		// Dispose of the coloring object
		if (coloring != null) {
			coloring.dispose();
			coloring = null;
		}

		// Close the dialog
		if (dlg != null) {
			dlg.close();
			dlg = null;
		}

		this.ciBoc = null;
		this.ci = null;
	}

	@SelectionChanged
	public void onSelectionChanged(@Named(InternalNames.SELECTED_DIAGRAM_ELEMENTS) final DiagramElement[] selectedDiagramElements) {
		if (dlg != null && dlg.getShell() != null && dlg.getShell().isVisible()) {
			// If the selection is a valid addition to the flow implementation, add it
			if(selectedDiagramElements.length > 1) {
				dlg.setMultipleElementsSelected(true);
			} else if(selectedDiagramElements.length == 1) {
				dlg.setMultipleElementsSelected(false);

				// Get the selected diagram element
				final DiagramElement selectedDiagramElement = selectedDiagramElements[0];
				dlg.addSelectedElement(selectedDiagramElement);
			}
		}
	}

	/**
	 * Determine message based on currently selected element
	 * @return
	 */
	private static class CreateFlowImplementationDialog extends TitleAreaDialog {
		private final ColoringService.Coloring coloring;
		private final UiService uiService;
		private final Aadl2Package pkg = Aadl2Factory.eINSTANCE.getAadl2Package();
		private Composite flowComposite;
		private StyledText flowLabel;
		private Button undoButton;
		private List<DiagramElement> userSelections = new ArrayList<>(); // Include the flow specification, flow segments, features and modes. First item should be the flow specification being implemented.
		private boolean multipleElementsSelected = false;

		CreateFlowImplementationDialog(final Shell parentShell,
				final ColoringService.Coloring coloring,
				final UiService uiService) {
			super(parentShell);
			this.coloring = Objects.requireNonNull(coloring, "coloring must not be null");
			this.uiService = Objects.requireNonNull(uiService, "uiService must not be null");
			this.setHelpAvailable(false);
			setShellStyle(SWT.CLOSE | SWT.MODELESS | SWT.BORDER | SWT.TITLE | SWT.RESIZE);
		}

		// Returns whether the flow has both a start and end.
		private boolean isFlowComplete() {
			final FlowSpecification fs = getFlowSpecification();
			if(fs == null) {
				return false;
			}

			if(fs.getKind() == FlowKind.SOURCE) {
				return getSelectedBocsOtherThanFirst().stream().filter(boc -> boc.getBusinessObject() instanceof Feature).count() == 1;
			} else if(fs.getKind() == FlowKind.PATH) {
				return getSelectedBocsOtherThanFirst().stream().filter(boc -> boc.getBusinessObject() instanceof Feature).count() == 2;
			} else if(fs.getKind() == FlowKind.SINK) {
				return getSelectedBocsOtherThanFirst().stream().filter(boc -> boc.getBusinessObject() instanceof FlowSpecification && ((FlowSpecification)boc.getBusinessObject()).getKind() == FlowKind.SINK).count() == 1;
			}

			return false;
		}

		public void setMultipleElementsSelected(final boolean value) {
			multipleElementsSelected = value;
			updateMessage();
		}

		private boolean needsStartingFeature() {
			final FlowSpecification fs = getFlowSpecification();
			return fs == null ? false : (fs.getKind() == FlowKind.PATH || fs.getKind() == FlowKind.SINK);
		}

		private boolean needsEndingFeature() {
			final FlowSpecification fs = getFlowSpecification();
			return fs == null ? false : fs.getKind() == FlowKind.PATH || fs.getKind() == FlowKind.SOURCE;
		}

		private boolean needsEndingFlowSink() {
			final FlowSpecification fs = getFlowSpecification();
			return fs == null ? false : fs.getKind() == FlowKind.SINK;
		}

		private void updateMessage() {
			String msg;
			String error = null;
			if(userSelections.size() == 0) {
				msg = "Select a top-level flow specification to implement.";
			} else if(selectingFlowIn()) {
				msg = "Select a starting feature.";
			} else if(isFlowComplete()) {
				msg = "Select the OK button to create the flow implementation. Optionally, select a mode or mode transition.";
			} else if(needsEndingFeature()) {
				msg = "Select a flow element or ending feature. Optionally, select a mode or mode transition.";
			} else if(needsEndingFlowSink()) {
				msg = "Select a flow element or ending flow sink specification. Optionally, select a mode or mode transition.";
			} else {
				msg = ""; // Intended to be unreachable
			}

			if(multipleElementsSelected) {
				error = "Multiple diagram elements selected. Select a single diagram element.";
			}

			if(error == null) {
				setErrorMessage(null);
				setMessage(msg);
			} else {
				setErrorMessage(error + " " + msg);
			}
		}

		private List<DiagramElement> getSelectedBocsOtherThanFirst() {
			return userSelections.subList(1,  userSelections.size());
		}

		public FlowImplementation createFlow() {
			// Create a flow implementation based on the state of the dialog
			final FlowImplementation flowImpl = (FlowImplementation)pkg.getEFactoryInstance().create(pkg.getFlowImplementation());
			flowImpl.setSpecification(getFlowSpecification());

			if(flowImpl.getSpecification() != null) {
				flowImpl.setKind(flowImpl.getSpecification().getKind());
			}

			if(userSelections.size() > 1) {
				final List<DiagramElement> modesAndSegmentBocs = getSelectedBocsOtherThanFirst();
				final List<BusinessObjectContext> featureBocs = modesAndSegmentBocs.stream().filter(boc -> boc.getBusinessObject() instanceof Feature).collect(Collectors.toCollection(ArrayList::new));
				final List<BusinessObjectContext> flowElementBocs = modesAndSegmentBocs.stream().filter(boc -> boc.getBusinessObject() instanceof FlowElement).collect(Collectors.toCollection(ArrayList::new));
				final List<BusinessObjectContext> modeFeatureBocs = modesAndSegmentBocs.stream().filter(boc -> boc.getBusinessObject() instanceof ModeFeature).collect(Collectors.toCollection(ArrayList::new));

				int nextFeatureIndex = 0;
				if(needsStartingFeature() && featureBocs.size() > nextFeatureIndex) {
					final FlowEnd inEnd = flowImpl.createInEnd();
					final BusinessObjectContext tmpBoc = featureBocs.get(nextFeatureIndex);
					inEnd.setContext(ToolUtil.findContext(tmpBoc));
					inEnd.setFeature((Feature)tmpBoc.getBusinessObject());
					nextFeatureIndex++;
				}

				if(needsEndingFeature() && featureBocs.size() > nextFeatureIndex) {
					final FlowEnd outEnd = flowImpl.createOutEnd();
					final BusinessObjectContext tmpBoc = featureBocs.get(nextFeatureIndex);
					outEnd.setContext(ToolUtil.findContext(tmpBoc));
					outEnd.setFeature((Feature)tmpBoc.getBusinessObject());
					nextFeatureIndex++;
				}

				for(final BusinessObjectContext tmpBoc : flowElementBocs) {
					final FlowSegment newFlowSegment = flowImpl.createOwnedFlowSegment();
					newFlowSegment.setContext(ToolUtil.findContext(tmpBoc));
					newFlowSegment.setFlowElement((FlowElement)tmpBoc.getBusinessObject());
				}

				for(final BusinessObjectContext tmpModeFeature : modeFeatureBocs) {
					flowImpl.getInModeOrTransitions().add((ModeFeature)tmpModeFeature.getBusinessObject());
				}
			}

			return flowImpl;
		}

		private boolean selectingFlowSpecificationToImplement() {
			return userSelections.size() == 0;
		}

		private boolean selectingFlowIn() {
			return needsStartingFeature() && userSelections.size() == 1;
		}

		/**
		 * @param de - the business object context for the selected diagram element
		 * @return - true or false depending if the selected element was added to the flow implementation
		 */
		public void addSelectedElement(final DiagramElement de) {
			// Decide whether to add the element to the selection list
			boolean add = false;
			final Object bo = de.getBusinessObject();
			if(selectingFlowSpecificationToImplement()) {
				if(bo instanceof FlowSpecification) {
					add = true;
				}
			} else if(selectingFlowIn()) {
				if(bo instanceof Feature) {
					add = true;
				}
			} else { // Selecting flow segments and modes
				if(bo instanceof ModeFeature ||
						(!isFlowComplete() && (bo instanceof FlowElement || bo instanceof Feature))) {
					add = true;
				}
			}

			if(add) {
				// Don't allow duplicate selections
				if(!userSelections.contains(de)) {
					userSelections.add(de);
				}

				// Update the UI
				update();
			}
		}

		private static String getName(final NamedElement ne) {
			return ne.getName() == null ? "<unknown>" : ne.getName();
		}

		private static String flowEndToString(final FlowEnd flowEnd) {
			final StringBuilder sb = new StringBuilder();
			if(flowEnd.getContext() != null) {
				sb.append(getName(flowEnd.getContext()));
				sb.append('.');
			}

			if(flowEnd.getFeature() != null) {
				sb.append(getName(flowEnd.getFeature()));
			}

			return sb.toString();
		}

		private static String flowSegmentToString(final FlowSegment flowSegment) {
			final StringBuilder sb = new StringBuilder();
			if(flowSegment.getContext() != null) {
				sb.append(getName(flowSegment.getContext()));
				sb.append('.');
			}

			if(flowSegment.getFlowElement() != null) {
				sb.append(getName(flowSegment.getFlowElement()));
			}

			return sb.toString();
		}

		/**
		 * Updates the UI
		 */
		private void update() {
			getButton(IDialogConstants.OK_ID).setEnabled(isFlowComplete());
			undoButton.setEnabled(userSelections.size() > 0);

			updateMessage();

			// Update the flow implementation string
			final FlowImplementation fi = createFlow();
			if(fi.getSpecification() == null) {
				flowLabel.setStyleRange(null);
				flowLabel.setText("");
			} else {
				final FlowSpecification flowSpec = fi.getSpecification();
				String flowStr = flowSpec.getName() + ":" + "  flow ";
				final int kindStartIndex = flowStr.length();
				flowStr += fi.getKind() + " ";
				final int kindEndIndex = flowStr.length();

				if(needsStartingFeature() && fi.getInEnd() != null) {
					flowStr += flowEndToString(fi.getInEnd()) + " -> ";
				}

				for(final FlowSegment seg : fi.getOwnedFlowSegments()) {
					flowStr += flowSegmentToString(seg) + " ";
					if(!(seg.getFlowElement() instanceof FlowSpecification && ((FlowSpecification)seg.getFlowElement()).getKind() == FlowKind.SINK)) {
						flowStr += "-> ";
					}
				}

				if(needsEndingFeature() && fi.getOutEnd() != null) {
					flowStr += " " + flowEndToString(fi.getOutEnd());
				}

				final int modeStartIndex = flowStr.length();
				if(fi.getInModeOrTransitions().size() > 0) {
					flowStr += " in modes (" + fi.getInModeOrTransitions().stream().map(mf -> mf.getName()).collect(Collectors.joining(", ")) + ")";
				}
				final int modeEndIndex = flowStr.length();

				flowStr += ";";

				flowLabel.setText(flowStr);

				// Adjust style of label
				flowLabel.setStyleRange(new StyleRange(kindStartIndex, kindEndIndex-kindStartIndex, Display.getCurrent().getSystemColor(SWT.COLOR_DARK_RED), null, SWT.BOLD));
				if (modeStartIndex != modeEndIndex) {
					flowLabel.setStyleRange(new StyleRange(modeStartIndex, 10, Display.getCurrent().getSystemColor(SWT.COLOR_DARK_RED), null, SWT.BOLD));
				}
			}

			// Update diagram element highlighting
			coloring.clear();
			for(int i = 0; i < userSelections.size(); i++) {
				final DiagramElement de = userSelections.get(i);
				if(i == 0) {
					coloring.setForeground(de, Color.ORANGE.darker());
				} else if(de instanceof ModeFeature) {
					coloring.setForeground(de, Color.MAGENTA.brighter());
				} else {
					coloring.setForeground(de, Color.MAGENTA.darker());
				}
			}
		}

		private FlowSpecification getFlowSpecification() {
			// The flow specification should be the first thing selected by the user
			if(userSelections.size() == 0) {
				return null;
			}

			final BusinessObjectContext boc = userSelections.get(0);
			return (FlowSpecification)boc.getBusinessObject();
		}

		@Override
		protected void configureShell(final Shell newShell) {
			super.configureShell(newShell);
			newShell.setText("Create Flow Implementation");
			newShell.setLocation(DialogPlacementHelper.getOffsetRectangleLocation(Display.getCurrent().getActiveShell().getBounds(), 50, 50));
			newShell.setSize(540, 250);
			newShell.setMinimumSize(300, 215);
		}

		@Override
		public void create() {
			super.create();
			setTitle("Select Elements");

			update();
		}

		@Override
		protected Control createDialogArea(final Composite parent) {
			flowComposite = (Composite)super.createDialogArea(parent);
			GridLayout layout = (GridLayout)flowComposite.getLayout();
			layout.marginLeft = 10;
			layout.marginTop = 5;

			flowLabel = new StyledText(flowComposite, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.MULTI);
			flowLabel.setEditable(false);
			flowLabel.setEnabled(false);
			flowLabel.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
			flowLabel.setMargins(5, 5, 5, 5);
			flowLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

			return flowComposite;
		}

		@Override
		protected Control createButtonBar(final Composite parent) {
			final Composite buttonBar = new Composite(parent, SWT.NONE);
			final GridLayout buttonBarLayout = new GridLayout();
			buttonBarLayout.numColumns = 2;
			buttonBar.setLayout(buttonBarLayout);
			final GridData buttonBarData = new GridData(SWT.FILL, SWT.BOTTOM, true, false);
			buttonBar.setLayoutData(buttonBarData);
			buttonBar.setFont(parent.getFont());

			undoButton = new Button(buttonBar, SWT.PUSH);
			undoButton.setEnabled(false);
			undoButton.setText("Undo");
			undoButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(final SelectionEvent e) {
					if(userSelections.size() > 0) {
						userSelections.remove(userSelections.size()-1);
						update();
						uiService.clearSelection();
					}
				}
			});

			final GridData removeBtnData = new GridData(SWT.LEFT, SWT.CENTER, true, true);
			removeBtnData.horizontalIndent = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
			undoButton.setLayoutData(removeBtnData);

			final Control buttonControl = super.createButtonBar(buttonBar);
			buttonControl.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
			final Button okBtn = getButton(IDialogConstants.OK_ID);
			okBtn.setEnabled(false);
			return buttonBar;
		}
	}


}
