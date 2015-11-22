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
package org.osate.categories.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class CategoriesGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class CategoriesDefinitionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CategoriesDefinitions");
		private final UnorderedGroup cUnorderedGroup = (UnorderedGroup)rule.eContents().get(1);
		private final Assignment cRequirementcategoriesAssignment_0 = (Assignment)cUnorderedGroup.eContents().get(0);
		private final RuleCall cRequirementcategoriesRequirementCategoriesParserRuleCall_0_0 = (RuleCall)cRequirementcategoriesAssignment_0.eContents().get(0);
		private final Assignment cMethodcategoriesAssignment_1 = (Assignment)cUnorderedGroup.eContents().get(1);
		private final RuleCall cMethodcategoriesMethodCategoriesParserRuleCall_1_0 = (RuleCall)cMethodcategoriesAssignment_1.eContents().get(0);
		private final Assignment cSelectioncategoriesAssignment_2 = (Assignment)cUnorderedGroup.eContents().get(2);
		private final RuleCall cSelectioncategoriesSelectionCategoriesParserRuleCall_2_0 = (RuleCall)cSelectioncategoriesAssignment_2.eContents().get(0);
		private final Assignment cPhasecategoriesAssignment_3 = (Assignment)cUnorderedGroup.eContents().get(3);
		private final RuleCall cPhasecategoriesPhaseCategoriesParserRuleCall_3_0 = (RuleCall)cPhasecategoriesAssignment_3.eContents().get(0);
		private final Assignment cQualitycategoriesAssignment_4 = (Assignment)cUnorderedGroup.eContents().get(4);
		private final RuleCall cQualitycategoriesQualityCategoriesParserRuleCall_4_0 = (RuleCall)cQualitycategoriesAssignment_4.eContents().get(0);
		private final Assignment cCategoryfilterAssignment_5 = (Assignment)cUnorderedGroup.eContents().get(5);
		private final RuleCall cCategoryfilterCategoryFiltersParserRuleCall_5_0 = (RuleCall)cCategoryfilterAssignment_5.eContents().get(0);
		
		//CategoriesDefinitions:
		//	requirementcategories=RequirementCategories? & methodcategories=MethodCategories? &
		//	selectioncategories=SelectionCategories? & phasecategories=PhaseCategories? & qualitycategories=QualityCategories? &
		//	categoryfilter=CategoryFilters?;
		@Override public ParserRule getRule() { return rule; }

		//requirementcategories=RequirementCategories? & methodcategories=MethodCategories? &
		//selectioncategories=SelectionCategories? & phasecategories=PhaseCategories? & qualitycategories=QualityCategories? &
		//categoryfilter=CategoryFilters?
		public UnorderedGroup getUnorderedGroup() { return cUnorderedGroup; }

		//requirementcategories=RequirementCategories?
		public Assignment getRequirementcategoriesAssignment_0() { return cRequirementcategoriesAssignment_0; }

		//RequirementCategories
		public RuleCall getRequirementcategoriesRequirementCategoriesParserRuleCall_0_0() { return cRequirementcategoriesRequirementCategoriesParserRuleCall_0_0; }

		//methodcategories=MethodCategories?
		public Assignment getMethodcategoriesAssignment_1() { return cMethodcategoriesAssignment_1; }

		//MethodCategories
		public RuleCall getMethodcategoriesMethodCategoriesParserRuleCall_1_0() { return cMethodcategoriesMethodCategoriesParserRuleCall_1_0; }

		//selectioncategories=SelectionCategories?
		public Assignment getSelectioncategoriesAssignment_2() { return cSelectioncategoriesAssignment_2; }

		//SelectionCategories
		public RuleCall getSelectioncategoriesSelectionCategoriesParserRuleCall_2_0() { return cSelectioncategoriesSelectionCategoriesParserRuleCall_2_0; }

		//phasecategories=PhaseCategories?
		public Assignment getPhasecategoriesAssignment_3() { return cPhasecategoriesAssignment_3; }

		//PhaseCategories
		public RuleCall getPhasecategoriesPhaseCategoriesParserRuleCall_3_0() { return cPhasecategoriesPhaseCategoriesParserRuleCall_3_0; }

		//qualitycategories=QualityCategories?
		public Assignment getQualitycategoriesAssignment_4() { return cQualitycategoriesAssignment_4; }

		//QualityCategories
		public RuleCall getQualitycategoriesQualityCategoriesParserRuleCall_4_0() { return cQualitycategoriesQualityCategoriesParserRuleCall_4_0; }

		//categoryfilter=CategoryFilters?
		public Assignment getCategoryfilterAssignment_5() { return cCategoryfilterAssignment_5; }

		//CategoryFilters
		public RuleCall getCategoryfilterCategoryFiltersParserRuleCall_5_0() { return cCategoryfilterCategoryFiltersParserRuleCall_5_0; }
	}

	public class RequirementCategoriesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RequirementCategories");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRequirementCategoriesAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cRequirementKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cCategoriesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cCategoryAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCategoryRequirementCategoryParserRuleCall_4_0 = (RuleCall)cCategoryAssignment_4.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		/// **
		// * requirement categories uses a label instead of name to make the category itself global
		// * / RequirementCategories returns Categories:
		//	{RequirementCategories} "requirement" "categories" "[" category+=RequirementCategory+ "]";
		@Override public ParserRule getRule() { return rule; }

		//{RequirementCategories} "requirement" "categories" "[" category+=RequirementCategory+ "]"
		public Group getGroup() { return cGroup; }

		//{RequirementCategories}
		public Action getRequirementCategoriesAction_0() { return cRequirementCategoriesAction_0; }

		//"requirement"
		public Keyword getRequirementKeyword_1() { return cRequirementKeyword_1; }

		//"categories"
		public Keyword getCategoriesKeyword_2() { return cCategoriesKeyword_2; }

		//"["
		public Keyword getLeftSquareBracketKeyword_3() { return cLeftSquareBracketKeyword_3; }

		//category+=RequirementCategory+
		public Assignment getCategoryAssignment_4() { return cCategoryAssignment_4; }

		//RequirementCategory
		public RuleCall getCategoryRequirementCategoryParserRuleCall_4_0() { return cCategoryRequirementCategoryParserRuleCall_4_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_5() { return cRightSquareBracketKeyword_5; }
	}

	public class MethodCategoriesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MethodCategories");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMethodCategoriesAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cMethodKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cCategoriesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cCategoryAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCategoryMethodCategoryParserRuleCall_4_0 = (RuleCall)cCategoryAssignment_4.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MethodCategories returns Categories:
		//	{MethodCategories} "method" "categories" "[" category+=MethodCategory+ "]";
		@Override public ParserRule getRule() { return rule; }

		//{MethodCategories} "method" "categories" "[" category+=MethodCategory+ "]"
		public Group getGroup() { return cGroup; }

		//{MethodCategories}
		public Action getMethodCategoriesAction_0() { return cMethodCategoriesAction_0; }

		//"method"
		public Keyword getMethodKeyword_1() { return cMethodKeyword_1; }

		//"categories"
		public Keyword getCategoriesKeyword_2() { return cCategoriesKeyword_2; }

		//"["
		public Keyword getLeftSquareBracketKeyword_3() { return cLeftSquareBracketKeyword_3; }

		//category+=MethodCategory+
		public Assignment getCategoryAssignment_4() { return cCategoryAssignment_4; }

		//MethodCategory
		public RuleCall getCategoryMethodCategoryParserRuleCall_4_0() { return cCategoryMethodCategoryParserRuleCall_4_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_5() { return cRightSquareBracketKeyword_5; }
	}

	public class SelectionCategoriesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SelectionCategories");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSelectionCategoriesAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSelectionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cCategoriesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cCategoryAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCategorySelectionCategoryParserRuleCall_4_0 = (RuleCall)cCategoryAssignment_4.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//SelectionCategories returns Categories:
		//	{SelectionCategories} "selection" "categories" "[" category+=SelectionCategory+ "]";
		@Override public ParserRule getRule() { return rule; }

		//{SelectionCategories} "selection" "categories" "[" category+=SelectionCategory+ "]"
		public Group getGroup() { return cGroup; }

		//{SelectionCategories}
		public Action getSelectionCategoriesAction_0() { return cSelectionCategoriesAction_0; }

		//"selection"
		public Keyword getSelectionKeyword_1() { return cSelectionKeyword_1; }

		//"categories"
		public Keyword getCategoriesKeyword_2() { return cCategoriesKeyword_2; }

		//"["
		public Keyword getLeftSquareBracketKeyword_3() { return cLeftSquareBracketKeyword_3; }

		//category+=SelectionCategory+
		public Assignment getCategoryAssignment_4() { return cCategoryAssignment_4; }

		//SelectionCategory
		public RuleCall getCategorySelectionCategoryParserRuleCall_4_0() { return cCategorySelectionCategoryParserRuleCall_4_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_5() { return cRightSquareBracketKeyword_5; }
	}

	public class QualityCategoriesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualityCategories");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cQualityCategoriesAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cQualityKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cCategoriesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cCategoryAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCategoryQualityCategoryParserRuleCall_4_0 = (RuleCall)cCategoryAssignment_4.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//QualityCategories returns Categories:
		//	{QualityCategories} "quality" "categories" "[" category+=QualityCategory+ "]";
		@Override public ParserRule getRule() { return rule; }

		//{QualityCategories} "quality" "categories" "[" category+=QualityCategory+ "]"
		public Group getGroup() { return cGroup; }

		//{QualityCategories}
		public Action getQualityCategoriesAction_0() { return cQualityCategoriesAction_0; }

		//"quality"
		public Keyword getQualityKeyword_1() { return cQualityKeyword_1; }

		//"categories"
		public Keyword getCategoriesKeyword_2() { return cCategoriesKeyword_2; }

		//"["
		public Keyword getLeftSquareBracketKeyword_3() { return cLeftSquareBracketKeyword_3; }

		//category+=QualityCategory+
		public Assignment getCategoryAssignment_4() { return cCategoryAssignment_4; }

		//QualityCategory
		public RuleCall getCategoryQualityCategoryParserRuleCall_4_0() { return cCategoryQualityCategoryParserRuleCall_4_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_5() { return cRightSquareBracketKeyword_5; }
	}

	public class PhaseCategoriesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PhaseCategories");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cQualityCategoriesAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPhaseKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cCategoriesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cCategoryAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCategoryPhaseCategoryParserRuleCall_4_0 = (RuleCall)cCategoryAssignment_4.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//PhaseCategories returns Categories:
		//	{QualityCategories} "phase" "categories" "[" category+=PhaseCategory+ "]";
		@Override public ParserRule getRule() { return rule; }

		//{QualityCategories} "phase" "categories" "[" category+=PhaseCategory+ "]"
		public Group getGroup() { return cGroup; }

		//{QualityCategories}
		public Action getQualityCategoriesAction_0() { return cQualityCategoriesAction_0; }

		//"phase"
		public Keyword getPhaseKeyword_1() { return cPhaseKeyword_1; }

		//"categories"
		public Keyword getCategoriesKeyword_2() { return cCategoriesKeyword_2; }

		//"["
		public Keyword getLeftSquareBracketKeyword_3() { return cLeftSquareBracketKeyword_3; }

		//category+=PhaseCategory+
		public Assignment getCategoryAssignment_4() { return cCategoryAssignment_4; }

		//PhaseCategory
		public RuleCall getCategoryPhaseCategoryParserRuleCall_4_0() { return cCategoryPhaseCategoryParserRuleCall_4_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_5() { return cRightSquareBracketKeyword_5; }
	}

	public class RequirementCategoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RequirementCategory");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRequirementCategoryAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		/// **
		// * Requirement category indicates the kind of requirement we are dealing with
		// * / RequirementCategory returns Category:
		//	{RequirementCategory} name= //('{' subCategories+=[RequirementCategory|CatRef]* '}')? 
		//	ID;
		@Override public ParserRule getRule() { return rule; }

		//{RequirementCategory} name= //('{' subCategories+=[RequirementCategory|CatRef]* '}')? 
		//ID
		public Group getGroup() { return cGroup; }

		//{RequirementCategory}
		public Action getRequirementCategoryAction_0() { return cRequirementCategoryAction_0; }

		//name= //('{' subCategories+=[RequirementCategory|CatRef]* '}')? 
		//ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		////('{' subCategories+=[RequirementCategory|CatRef]* '}')? 
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class MethodCategoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MethodCategory");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMethodCategoryAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		/// **
		// * Method category indicates the kind of verification we are dealing with
		// * / MethodCategory returns Category:
		//	{MethodCategory} name= //('{' subCategories+=[MethodCategory|CatRef]*'}')? 
		//	ID;
		@Override public ParserRule getRule() { return rule; }

		//{MethodCategory} name= //('{' subCategories+=[MethodCategory|CatRef]*'}')? 
		//ID
		public Group getGroup() { return cGroup; }

		//{MethodCategory}
		public Action getMethodCategoryAction_0() { return cMethodCategoryAction_0; }

		//name= //('{' subCategories+=[MethodCategory|CatRef]*'}')? 
		//ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		////('{' subCategories+=[MethodCategory|CatRef]*'}')? 
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class SelectionCategoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SelectionCategory");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSelectionCategoryAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		/// **
		// * selection category indicates a tag for verification activities 
		// * / SelectionCategory returns Category:
		//	{SelectionCategory} name= //('{' subCategories+=[SelectionCategory|CatRef]*'}')? 
		//	ID;
		@Override public ParserRule getRule() { return rule; }

		//{SelectionCategory} name= //('{' subCategories+=[SelectionCategory|CatRef]*'}')? 
		//ID
		public Group getGroup() { return cGroup; }

		//{SelectionCategory}
		public Action getSelectionCategoryAction_0() { return cSelectionCategoryAction_0; }

		//name= //('{' subCategories+=[SelectionCategory|CatRef]*'}')? 
		//ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		////('{' subCategories+=[SelectionCategory|CatRef]*'}')? 
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class QualityCategoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualityCategory");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cQualityCategoryAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		/// **
		// * quality category indicates a quality attribute 
		// * / QualityCategory returns Category:
		//	{QualityCategory} name= //('{' subCategories+=[QualityCategory|CatRef]*'}')? 
		//	ID;
		@Override public ParserRule getRule() { return rule; }

		//{QualityCategory} name= //('{' subCategories+=[QualityCategory|CatRef]*'}')? 
		//ID
		public Group getGroup() { return cGroup; }

		//{QualityCategory}
		public Action getQualityCategoryAction_0() { return cQualityCategoryAction_0; }

		//name= //('{' subCategories+=[QualityCategory|CatRef]*'}')? 
		//ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		////('{' subCategories+=[QualityCategory|CatRef]*'}')? 
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class PhaseCategoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PhaseCategory");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPhaseCategoryAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		/// **
		// * phase category indicates a development phase 
		// * / PhaseCategory returns Category:
		//	{PhaseCategory} name= //('{' subCategories+=[QualityCategory|CatRef]*'}')? 
		//	ID;
		@Override public ParserRule getRule() { return rule; }

		//{PhaseCategory} name= //('{' subCategories+=[QualityCategory|CatRef]*'}')? 
		//ID
		public Group getGroup() { return cGroup; }

		//{PhaseCategory}
		public Action getPhaseCategoryAction_0() { return cPhaseCategoryAction_0; }

		//name= //('{' subCategories+=[QualityCategory|CatRef]*'}')? 
		//ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		////('{' subCategories+=[QualityCategory|CatRef]*'}')? 
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class CategoryFiltersElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CategoryFilters");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCategoryKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cFiltersKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFiltersAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFiltersCategorySetParserRuleCall_3_0 = (RuleCall)cFiltersAssignment_3.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//CategoryFilters:
		//	"category" "filters" "[" filters+=CategorySet+ "]";
		@Override public ParserRule getRule() { return rule; }

		//"category" "filters" "[" filters+=CategorySet+ "]"
		public Group getGroup() { return cGroup; }

		//"category"
		public Keyword getCategoryKeyword_0() { return cCategoryKeyword_0; }

		//"filters"
		public Keyword getFiltersKeyword_1() { return cFiltersKeyword_1; }

		//"["
		public Keyword getLeftSquareBracketKeyword_2() { return cLeftSquareBracketKeyword_2; }

		//filters+=CategorySet+
		public Assignment getFiltersAssignment_3() { return cFiltersAssignment_3; }

		//CategorySet
		public RuleCall getFiltersCategorySetParserRuleCall_3_0() { return cFiltersCategorySetParserRuleCall_3_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }
	}

	public class CategorySetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CategorySet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCategorySetAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cElementsCategoryCrossReference_3_0 = (CrossReference)cElementsAssignment_3.eContents().get(0);
		private final RuleCall cElementsCategoryCatRefParserRuleCall_3_0_1 = (RuleCall)cElementsCategoryCrossReference_3_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//CategorySet returns Category:
		//	{CategorySet} name=ID "{" elements+=[Category|CatRef]* "}";
		@Override public ParserRule getRule() { return rule; }

		//{CategorySet} name=ID "{" elements+=[Category|CatRef]* "}"
		public Group getGroup() { return cGroup; }

		//{CategorySet}
		public Action getCategorySetAction_0() { return cCategorySetAction_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//elements+=[Category|CatRef]*
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }

		//[Category|CatRef]
		public CrossReference getElementsCategoryCrossReference_3_0() { return cElementsCategoryCrossReference_3_0; }

		//CatRef
		public RuleCall getElementsCategoryCatRefParserRuleCall_3_0_1() { return cElementsCategoryCatRefParserRuleCall_3_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class CatRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CatRef");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//// Category reference. Currently it is only a single ID
		//CatRef: //('.' ID)?
		//	ID;
		@Override public ParserRule getRule() { return rule; }

		////('.' ID)?
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	
	
	private final CategoriesDefinitionsElements pCategoriesDefinitions;
	private final RequirementCategoriesElements pRequirementCategories;
	private final MethodCategoriesElements pMethodCategories;
	private final SelectionCategoriesElements pSelectionCategories;
	private final QualityCategoriesElements pQualityCategories;
	private final PhaseCategoriesElements pPhaseCategories;
	private final RequirementCategoryElements pRequirementCategory;
	private final MethodCategoryElements pMethodCategory;
	private final SelectionCategoryElements pSelectionCategory;
	private final QualityCategoryElements pQualityCategory;
	private final PhaseCategoryElements pPhaseCategory;
	private final CategoryFiltersElements pCategoryFilters;
	private final CategorySetElements pCategorySet;
	private final CatRefElements pCatRef;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CategoriesGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pCategoriesDefinitions = new CategoriesDefinitionsElements();
		this.pRequirementCategories = new RequirementCategoriesElements();
		this.pMethodCategories = new MethodCategoriesElements();
		this.pSelectionCategories = new SelectionCategoriesElements();
		this.pQualityCategories = new QualityCategoriesElements();
		this.pPhaseCategories = new PhaseCategoriesElements();
		this.pRequirementCategory = new RequirementCategoryElements();
		this.pMethodCategory = new MethodCategoryElements();
		this.pSelectionCategory = new SelectionCategoryElements();
		this.pQualityCategory = new QualityCategoryElements();
		this.pPhaseCategory = new PhaseCategoryElements();
		this.pCategoryFilters = new CategoryFiltersElements();
		this.pCategorySet = new CategorySetElements();
		this.pCatRef = new CatRefElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.osate.categories.Categories".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//CategoriesDefinitions:
	//	requirementcategories=RequirementCategories? & methodcategories=MethodCategories? &
	//	selectioncategories=SelectionCategories? & phasecategories=PhaseCategories? & qualitycategories=QualityCategories? &
	//	categoryfilter=CategoryFilters?;
	public CategoriesDefinitionsElements getCategoriesDefinitionsAccess() {
		return pCategoriesDefinitions;
	}
	
	public ParserRule getCategoriesDefinitionsRule() {
		return getCategoriesDefinitionsAccess().getRule();
	}

	/// **
	// * requirement categories uses a label instead of name to make the category itself global
	// * / RequirementCategories returns Categories:
	//	{RequirementCategories} "requirement" "categories" "[" category+=RequirementCategory+ "]";
	public RequirementCategoriesElements getRequirementCategoriesAccess() {
		return pRequirementCategories;
	}
	
	public ParserRule getRequirementCategoriesRule() {
		return getRequirementCategoriesAccess().getRule();
	}

	//MethodCategories returns Categories:
	//	{MethodCategories} "method" "categories" "[" category+=MethodCategory+ "]";
	public MethodCategoriesElements getMethodCategoriesAccess() {
		return pMethodCategories;
	}
	
	public ParserRule getMethodCategoriesRule() {
		return getMethodCategoriesAccess().getRule();
	}

	//SelectionCategories returns Categories:
	//	{SelectionCategories} "selection" "categories" "[" category+=SelectionCategory+ "]";
	public SelectionCategoriesElements getSelectionCategoriesAccess() {
		return pSelectionCategories;
	}
	
	public ParserRule getSelectionCategoriesRule() {
		return getSelectionCategoriesAccess().getRule();
	}

	//QualityCategories returns Categories:
	//	{QualityCategories} "quality" "categories" "[" category+=QualityCategory+ "]";
	public QualityCategoriesElements getQualityCategoriesAccess() {
		return pQualityCategories;
	}
	
	public ParserRule getQualityCategoriesRule() {
		return getQualityCategoriesAccess().getRule();
	}

	//PhaseCategories returns Categories:
	//	{QualityCategories} "phase" "categories" "[" category+=PhaseCategory+ "]";
	public PhaseCategoriesElements getPhaseCategoriesAccess() {
		return pPhaseCategories;
	}
	
	public ParserRule getPhaseCategoriesRule() {
		return getPhaseCategoriesAccess().getRule();
	}

	/// **
	// * Requirement category indicates the kind of requirement we are dealing with
	// * / RequirementCategory returns Category:
	//	{RequirementCategory} name= //('{' subCategories+=[RequirementCategory|CatRef]* '}')? 
	//	ID;
	public RequirementCategoryElements getRequirementCategoryAccess() {
		return pRequirementCategory;
	}
	
	public ParserRule getRequirementCategoryRule() {
		return getRequirementCategoryAccess().getRule();
	}

	/// **
	// * Method category indicates the kind of verification we are dealing with
	// * / MethodCategory returns Category:
	//	{MethodCategory} name= //('{' subCategories+=[MethodCategory|CatRef]*'}')? 
	//	ID;
	public MethodCategoryElements getMethodCategoryAccess() {
		return pMethodCategory;
	}
	
	public ParserRule getMethodCategoryRule() {
		return getMethodCategoryAccess().getRule();
	}

	/// **
	// * selection category indicates a tag for verification activities 
	// * / SelectionCategory returns Category:
	//	{SelectionCategory} name= //('{' subCategories+=[SelectionCategory|CatRef]*'}')? 
	//	ID;
	public SelectionCategoryElements getSelectionCategoryAccess() {
		return pSelectionCategory;
	}
	
	public ParserRule getSelectionCategoryRule() {
		return getSelectionCategoryAccess().getRule();
	}

	/// **
	// * quality category indicates a quality attribute 
	// * / QualityCategory returns Category:
	//	{QualityCategory} name= //('{' subCategories+=[QualityCategory|CatRef]*'}')? 
	//	ID;
	public QualityCategoryElements getQualityCategoryAccess() {
		return pQualityCategory;
	}
	
	public ParserRule getQualityCategoryRule() {
		return getQualityCategoryAccess().getRule();
	}

	/// **
	// * phase category indicates a development phase 
	// * / PhaseCategory returns Category:
	//	{PhaseCategory} name= //('{' subCategories+=[QualityCategory|CatRef]*'}')? 
	//	ID;
	public PhaseCategoryElements getPhaseCategoryAccess() {
		return pPhaseCategory;
	}
	
	public ParserRule getPhaseCategoryRule() {
		return getPhaseCategoryAccess().getRule();
	}

	//CategoryFilters:
	//	"category" "filters" "[" filters+=CategorySet+ "]";
	public CategoryFiltersElements getCategoryFiltersAccess() {
		return pCategoryFilters;
	}
	
	public ParserRule getCategoryFiltersRule() {
		return getCategoryFiltersAccess().getRule();
	}

	//CategorySet returns Category:
	//	{CategorySet} name=ID "{" elements+=[Category|CatRef]* "}";
	public CategorySetElements getCategorySetAccess() {
		return pCategorySet;
	}
	
	public ParserRule getCategorySetRule() {
		return getCategorySetAccess().getRule();
	}

	//// Category reference. Currently it is only a single ID
	//CatRef: //('.' ID)?
	//	ID;
	public CatRefElements getCatRefAccess() {
		return pCatRef;
	}
	
	public ParserRule getCatRefRule() {
		return getCatRefAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
