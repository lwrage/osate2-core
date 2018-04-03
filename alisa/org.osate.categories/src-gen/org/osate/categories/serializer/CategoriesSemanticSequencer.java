/**
 * Copyright 2015 Carnegie Mellon University. All Rights Reserved.
 *
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 *
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 *
 * See COPYRIGHT file for full details.
 */
package org.osate.categories.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.osate.categories.categories.Categories;
import org.osate.categories.categories.CategoriesDefinitions;
import org.osate.categories.categories.CategoriesPackage;
import org.osate.categories.categories.Category;
import org.osate.categories.categories.CategoryFilter;
import org.osate.categories.services.CategoriesGrammarAccess;

@SuppressWarnings("all")
public class CategoriesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CategoriesGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CategoriesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CategoriesPackage.CATEGORIES:
				sequence_Categories(context, (Categories) semanticObject); 
				return; 
			case CategoriesPackage.CATEGORIES_DEFINITIONS:
				sequence_CategoriesDefinitions(context, (CategoriesDefinitions) semanticObject); 
				return; 
			case CategoriesPackage.CATEGORY:
				sequence_Category(context, (Category) semanticObject); 
				return; 
			case CategoriesPackage.CATEGORY_FILTER:
				sequence_CategoryFilter(context, (CategoryFilter) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     CategoriesDefinitions returns CategoriesDefinitions
	 *
	 * Constraint:
	 *     ((categories+=Categories+ categoryFilters+=CategoryFilter+) | categoryFilters+=CategoryFilter+)?
	 */
	protected void sequence_CategoriesDefinitions(ISerializationContext context, CategoriesDefinitions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Categories returns Categories
	 *
	 * Constraint:
	 *     (name=ID category+=Category+)
	 */
	protected void sequence_Categories(ISerializationContext context, Categories semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CategoryFilter returns CategoryFilter
	 *
	 * Constraint:
	 *     (name=ID category+=[Category|CatRef]* anyCategory?='any'?)
	 */
	protected void sequence_CategoryFilter(ISerializationContext context, CategoryFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Category returns Category
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Category(ISerializationContext context, Category semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CategoriesPackage.Literals.CATEGORY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CategoriesPackage.Literals.CATEGORY__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
