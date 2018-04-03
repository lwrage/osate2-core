package org.osate.ge.internal.ui.properties;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Adapters;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.util.Strings;
import org.osate.aadl2.Aadl2Factory;
import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.BusFeatureClassifier;
import org.osate.aadl2.BusSubcomponentType;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentCategory;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.DataClassifier;
import org.osate.aadl2.DataSubcomponentType;
import org.osate.aadl2.Feature;
import org.osate.aadl2.FeatureClassifier;
import org.osate.aadl2.FeatureGroup;
import org.osate.aadl2.FeatureGroupType;
import org.osate.aadl2.FeatureType;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.PackageSection;
import org.osate.aadl2.Prototype;
import org.osate.aadl2.SubprogramClassifier;
import org.osate.aadl2.SubprogramGroupSubcomponentType;
import org.osate.aadl2.SubprogramSubcomponentType;
import org.osate.ge.BusinessObjectSelection;
import org.osate.ge.internal.CreateOperation;
import org.osate.ge.internal.graphiti.features.SimpleCreateOperation;
import org.osate.ge.internal.services.NamingService;
import org.osate.ge.internal.ui.dialogs.ClassifierOperationDialog;
import org.osate.ge.internal.ui.dialogs.DefaultCreateSelectClassifierDialogModel;
import org.osate.ge.internal.ui.util.InternalPropertySectionUtil;
import org.osate.ge.internal.ui.util.SelectionUtil;
import org.osate.ge.internal.util.AadlImportsUtil;
import org.osate.ge.internal.util.ScopedEMFIndexRetrieval;
import org.osate.ge.internal.util.classifiers.ClassifierOperation;
import org.osate.ge.internal.util.classifiers.ClassifierOperationExecutor;
import org.osate.ge.internal.util.classifiers.ClassifierOperationPartType;
import org.osate.ge.ui.properties.PropertySectionUtil;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class SetFeatureClassifierPropertySection extends AbstractPropertySection {
	public static class Filter implements IFilter {
		@Override
		public boolean select(final Object toTest) {
			return PropertySectionUtil.isBoCompatible(toTest, bo -> {
				if (bo instanceof Feature) {
					final Feature feature = (Feature) bo;
					return featureTypeToClassifierSetterMap.containsKey(feature.eClass());
				}

				return false;
			});
		}
	}

	private static Map<EClass, FeatureClassifierSetterInfo> featureTypeToClassifierSetterMap = new HashMap<EClass, FeatureClassifierSetterInfo>();

	static {
		final Aadl2Package p = Aadl2Factory.eINSTANCE.getAadl2Package();
		featureTypeToClassifierSetterMap.put(p.getBusAccess(), new FeatureClassifierSetterInfo(
				p.getBusSubcomponentType(), BusSubcomponentType.class, "setBusFeatureClassifier"));
		featureTypeToClassifierSetterMap.put(p.getBusAccess(), new FeatureClassifierSetterInfo(
				p.getBusSubcomponentType(), BusFeatureClassifier.class, "setBusFeatureClassifier"));
		featureTypeToClassifierSetterMap.put(p.getDataAccess(), new FeatureClassifierSetterInfo(
				p.getDataSubcomponentType(), DataSubcomponentType.class, "setDataFeatureClassifier"));
		featureTypeToClassifierSetterMap.put(p.getSubprogramAccess(), new FeatureClassifierSetterInfo(
				p.getSubprogramSubcomponentType(), SubprogramSubcomponentType.class, "setSubprogramFeatureClassifier"));
		featureTypeToClassifierSetterMap.put(p.getSubprogramGroupAccess(),
				new FeatureClassifierSetterInfo(p.getSubprogramGroupSubcomponentType(),
						SubprogramGroupSubcomponentType.class, "setSubprogramGroupFeatureClassifier"));
		featureTypeToClassifierSetterMap.put(p.getAbstractFeature(), new FeatureClassifierSetterInfo(
				p.getFeatureClassifier(), FeatureClassifier.class, "setAbstractFeatureClassifier"));
		featureTypeToClassifierSetterMap.put(p.getFeatureGroup(),
				new FeatureClassifierSetterInfo(p.getFeatureType(), FeatureType.class, "setFeatureType"));
		featureTypeToClassifierSetterMap.put(p.getParameter(), new FeatureClassifierSetterInfo(
				p.getDataSubcomponentType(), DataSubcomponentType.class, "setDataFeatureClassifier"));
		featureTypeToClassifierSetterMap.put(p.getDataPort(), new FeatureClassifierSetterInfo(
				p.getDataSubcomponentType(), DataSubcomponentType.class, "setDataFeatureClassifier"));
		featureTypeToClassifierSetterMap.put(p.getEventDataPort(), new FeatureClassifierSetterInfo(
				p.getDataSubcomponentType(), DataSubcomponentType.class, "setDataFeatureClassifier"));
		featureTypeToClassifierSetterMap.put(p.getEventDataSource(),
				new FeatureClassifierSetterInfo(p.getDataClassifier(), DataClassifier.class, "setDataClassifier"));
		featureTypeToClassifierSetterMap.put(p.getPortProxy(),
				new FeatureClassifierSetterInfo(p.getDataClassifier(), DataClassifier.class, "setDataClassifier"));
		featureTypeToClassifierSetterMap.put(p.getSubprogramProxy(), new FeatureClassifierSetterInfo(
				p.getSubprogramClassifier(), SubprogramClassifier.class, "setSubprogramClassifier"));
	}

	private static class FeatureClassifierSetterInfo {
		private final EClass classifierEClass;
		private final Class<?> classifierClass;
		private final String setterName;

		public FeatureClassifierSetterInfo(final EClass classifierEClass, final Class<?> classifierClass,
				final String setterName) {
			this.classifierEClass = classifierEClass;
			this.classifierClass = classifierClass;
			this.setterName = setterName;
		}
	}

	private BusinessObjectSelection selectedBos;
	private Label curFeatureClassifier;
	private Button chooseBtn;

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		FormData fd;

		final Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		final Composite container = getWidgetFactory().createComposite(composite);
		final Label sectionLabel = InternalPropertySectionUtil.createSectionLabel(composite, getWidgetFactory(),
				"Classifier:");

		container.setLayout(new FormLayout());
		fd = new FormData();
		fd.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
		fd.top = new FormAttachment(sectionLabel, 0, SWT.CENTER);
		container.setLayoutData(fd);

		curFeatureClassifier = getWidgetFactory().createLabel(container, new String());
		fd = new FormData();
		fd.left = new FormAttachment(0, 0);
		fd.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
		curFeatureClassifier.setLayoutData(fd);

		chooseBtn = InternalPropertySectionUtil.createButton(getWidgetFactory(), container, null, setClassifierListener,
				"Choose...", SWT.PUSH);

		fd = new FormData();
		fd.left = new FormAttachment(curFeatureClassifier, ITabbedPropertyConstants.HSPACE);
		fd.top = new FormAttachment(curFeatureClassifier, 0, SWT.CENTER);
		chooseBtn.setLayoutData(fd);
	}

	final SelectionListener setClassifierListener = new SelectionAdapter() {
		@Override
		public void widgetSelected(final SelectionEvent e) {
			final List<Feature> features = selectedBos.boStream(Feature.class).collect(Collectors.toList());
			final Iterator<Feature> it = features.iterator();
			final Feature feature = it.next();
			final List<Object> potentialFeatureClassifiers = new ArrayList<>(getPotentialFeatureClassifiers(feature));
			// List will contain classifiers that are available to all selected elements
			while (it.hasNext()) {
				potentialFeatureClassifiers.retainAll(getPotentialFeatureClassifiers(it.next()));
			}

			final boolean firstIsFeatureGroup = features.get(0) instanceof FeatureGroup;
			final boolean consistent = features.stream()
					.allMatch(f -> f instanceof FeatureGroup == firstIsFeatureGroup); // TODO: rename
			if (!consistent) {
				// TODO: Error message?
				return;
			}


			// TODO: Check before casting
			final AadlPackage featurePkg = (AadlPackage) feature.getElementRoot();
			final SimpleCreateOperation createOp = new SimpleCreateOperation();
			final IProject project = SelectionUtil.getProject(featurePkg.eResource()); // TODO: Check result
			final Bundle bundle = FrameworkUtil.getBundle(getClass());
			final IEclipseContext context = EclipseContextFactory.getServiceContext(bundle.getBundleContext())
					.createChild();
			final NamingService namingService = Objects.requireNonNull(context.getActive(NamingService.class),
					"Unable to retrieve naming service");

			// TODO: Set component category based on feature. Could have multiple categories.. Need to exist dialog to allow selection.
			final Supplier<Classifier> selectedSubcomponentTypeSupplier = promptForFeatureType(createOp,
					potentialFeatureClassifiers, ComponentCategory.DATA, project, namingService,
					featurePkg.eResource().getResourceSet(), featurePkg, firstIsFeatureGroup);
			if (selectedSubcomponentTypeSupplier != null) {
				selectedBos.modifyWithPreSteps(Feature.class, featureToModify -> {
					// TODO: The supplier only works for classifiers
					EObject selectedType = selectedSubcomponentTypeSupplier
							.get();
					if (selectedType != null) {
						selectedType = EcoreUtil.resolve((EObject) selectedType, featureToModify);
					}

					setFeatureClassifier(featureToModify, selectedType);
				}, createOp.getStepMap());
			}
		}

		// TODO: Need to support prototypes
		/**
		 * The result is a supplier for a classifier which should be used as the feature type.
		 * @param createOp
		 * @param potentialBaseClassifiers
		 * @param category
		 * @param project
		 * @param namingService
		 * @param rs
		 * @param defaultPackage
		 * @return
		 */
		private Supplier<Classifier> promptForFeatureType(final CreateOperation createOp,
				final Collection<?> potentialBaseClassifiers, final ComponentCategory category, final IProject project,
				final NamingService namingService, final ResourceSet rs, final AadlPackage defaultPackage, final boolean isFeatureGroup) {

			// TODO: Improve filtering based on whether the port is being refined
			final ClassifierOperationDialog.Model model = new DefaultCreateSelectClassifierDialogModel(project,
					namingService, rs, "Select Feature Classifier") {
				@Override
				public String getTitle() {
					return "Select Feature Classifier";
				}

				@Override
				public Collection<?> getBaseSelectOptions(final ClassifierOperationPartType primaryOperation) {
					// TODO: Share with SetSubcomponentClassifier? Some of the code is identical
					if (primaryOperation == ClassifierOperationPartType.NEW_COMPONENT_TYPE) {
						// TODO: Check the type of potential feature classifiers
						return potentialBaseClassifiers.stream()
								.filter(o -> o instanceof ComponentType || (o instanceof IEObjectDescription
										&& ((IEObjectDescription) o).getEObjectOrProxy() instanceof ComponentType))
								.collect(Collectors.toList());
					} else if (primaryOperation == ClassifierOperationPartType.NEW_FEATURE_GROUP_TYPE) {
						// TODO: Check the type of potential feature classifiers
						return potentialBaseClassifiers.stream()
								.filter(o -> o instanceof FeatureGroupType || (o instanceof IEObjectDescription
										&& ((IEObjectDescription) o).getEObjectOrProxy() instanceof FeatureGroupType))
								.collect(Collectors.toList());
					} else {
						return potentialBaseClassifiers;
					}
				}

				@Override
				public Collection<?> getUnfilteredBaseSelectOptions(
						final ClassifierOperationPartType primaryOperation) {
					return null;
				}

				@Override
				public Collection<?> getPrimarySelectOptions() {
					return potentialBaseClassifiers;
				}

				@Override
				public Collection<?> getUnfilteredPrimarySelectOptions() {
					return null;
				}
			};

			final EnumSet<ClassifierOperationPartType> allowedOperations;
			if (isFeatureGroup) {
				allowedOperations = EnumSet.of(ClassifierOperationPartType.NONE, ClassifierOperationPartType.EXISTING,
						ClassifierOperationPartType.NEW_FEATURE_GROUP_TYPE);
			} else {
				allowedOperations = EnumSet.of(ClassifierOperationPartType.NONE, ClassifierOperationPartType.EXISTING,
						ClassifierOperationPartType.NEW_COMPONENT_TYPE,
						ClassifierOperationPartType.NEW_COMPONENT_IMPLEMENTATION);
			}

			// TODO: Default value

			// Show the dialog to determine the operation
			final ClassifierOperation operation = ClassifierOperationDialog.show(Display.getCurrent().getActiveShell(),
					new ClassifierOperationDialog.ArgumentBuilder(model, allowedOperations)
					.defaultPackage(defaultPackage).showPrimaryPackageSelector(true)
					.componentCategory(category).create());

			if (operation == null) {
				return null;
			}

			final ClassifierOperationExecutor opExec = new ClassifierOperationExecutor(namingService, rs, project);
			return opExec.execute(createOp, operation, null);
		}

		private void setFeatureClassifier(final NamedElement feature, final Object classifier) {
			if (classifier != null) {
				// Import its package if necessary
				final AadlPackage pkg = (AadlPackage) feature.getElementRoot();
				if (classifier instanceof Classifier && ((Classifier) classifier).getNamespace() != null
						&& pkg != null) {
					final PackageSection section = pkg.getPublicSection();
					final AadlPackage selectedClassifierPkg = (AadlPackage) ((Classifier) classifier).getNamespace()
							.getOwner();
					if (selectedClassifierPkg != null && pkg != selectedClassifierPkg) {
						AadlImportsUtil.addImportIfNeeded(section, selectedClassifierPkg);
					}
				}
			}

			final FeatureClassifierSetterInfo setterInfo = featureTypeToClassifierSetterMap.get(feature.eClass());
			try {
				final Method method = feature.getClass().getMethod(setterInfo.setterName, setterInfo.classifierClass);
				method.invoke(feature, classifier);
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			} catch (SecurityException e) {
				throw new RuntimeException(e);
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			} catch (IllegalArgumentException e) {
				throw new RuntimeException(e);
			} catch (InvocationTargetException e) {
				throw new RuntimeException(e);
			}
		}
	};

	@Override
	public void setInput(final IWorkbenchPart part, final ISelection selection) {
		super.setInput(part, selection);
		selectedBos = Adapters.adapt(selection, BusinessObjectSelection.class);
	}

	@Override
	public void refresh() {
		final List<Feature> features = selectedBos.boStream(Feature.class).collect(Collectors.toList());
		curFeatureClassifier.setText(getFeatureClassifierLabel(features));
	}

	private static String getFeatureClassifierLabel(final List<Feature> features) {
		final Iterator<Feature> it = features.iterator();
		final EObject fc = getAllFeatureClassifier(it.next());
		while (it.hasNext()) {
			// If feature classifiers are not the same, set to multiple
			if (fc != getAllFeatureClassifier(it.next())) {
				return "<Multiple>";
			}
		}

		return getFeatureClassifierName(fc);
	}

	private static EObject getAllFeatureClassifier(Feature feature) {
		if(feature instanceof FeatureGroup) {
			final FeatureGroup fg = (FeatureGroup)feature;
			return fg.getAllClassifier();
		}

		FeatureClassifier result;
		do {
			result = feature.getFeatureClassifier();
			feature = feature.getRefined();
		} while (feature != null && result == null);

		return result;
	}

	private static String getFeatureClassifierName(final EObject fc) {
		if (fc == null) {
			return "<None>";
		} else if (fc instanceof NamedElement) {
			return Strings.emptyIfNull(((NamedElement) fc).getQualifiedName());
		} else if (fc instanceof Prototype) {
			return "<Prototype>";
		} else {
			return "";
		}
	}

	/**
	 * Return a list of EObjectDescriptions and NamedElements for potential classifiers for the specified feature
	 * @return
	 */
	private List<Object> getPotentialFeatureClassifiers(final NamedElement feature) {
		final List<Object> featureClassifiers = new ArrayList<Object>();
		featureClassifiers.add(null);

		final FeatureClassifierSetterInfo setterInfo = featureTypeToClassifierSetterMap.get(feature.eClass());
		// Populate the list with valid classifier descriptions
		for (final IEObjectDescription desc : ScopedEMFIndexRetrieval.getAllEObjectsByType(feature.eResource(),
				setterInfo.classifierEClass)) {
			featureClassifiers.add(desc);
		}

		// Add any prototypes that are of the appropriate type
		if (feature.getContainingClassifier() instanceof ComponentClassifier) {
			for (final Prototype p : ((ComponentClassifier) feature.getContainingClassifier()).getAllPrototypes()) {
				if (setterInfo.classifierEClass.isInstance(p)) {
					featureClassifiers.add(p);
				}
			}
		}

		return featureClassifiers;
	}
}
