package org.osate.xtext.aadl2.errormodel.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.NamedElement;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorType;
import org.osate.xtext.aadl2.errormodel.errorModel.TypeMappingSet;
import org.osate.xtext.aadl2.errormodel.errorModel.TypeSet;
import org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformationSet;

public class ErrorModelQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	// Enable to limit indexing to global items
	// Duplicates checking only applies to global items
	@Override
	public QualifiedName getFullyQualifiedName(final EObject obj) {
		if (obj instanceof ErrorBehaviorStateMachine || obj instanceof TypeMappingSet
				|| obj instanceof ErrorModelLibrary || obj instanceof ErrorType || obj instanceof TypeSet
				|| obj instanceof TypeTransformationSet) {
			/*
			 * It is important that we return null if obj is not in an AadlPackage.  This happens when serializing an aadl file
			 * with an error model annex.  See EMV2AnnexUnparser.  If this check is not here, then a ClassCastException occurs
			 * during serialization.
			 */
			if (((NamedElement) obj).getName() == null){// || EcoreUtil2.getContainerOfType(obj, AadlPackage.class) == null) {
				return null;
			}
			return getConverter().toQualifiedName(getTheName((NamedElement) obj));
		}
		return null;
	}

	protected String getTheName(NamedElement namedElement) {
		NamedElement root = namedElement.getElementRoot();
		if (namedElement instanceof ErrorModelLibrary) {
			if (namedElement == root) return namedElement.getName();
			return "emv2$" + root.getName();
		}
		if (root instanceof ErrorModelLibrary) return root.getName() + "::" + namedElement.getName();
		return "emv2$" + root.getName() + "::" + namedElement.getName();
	}
}