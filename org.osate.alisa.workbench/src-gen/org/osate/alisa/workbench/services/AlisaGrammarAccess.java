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
package org.osate.alisa.workbench.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.osate.alisa.common.services.CommonGrammarAccess;

@Singleton
public class AlisaGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class AlisaWorkAreaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AlisaWorkArea");
		private final Assignment cCasesAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cCasesAlternatives_0 = (Alternatives)cCasesAssignment.eContents().get(0);
		private final RuleCall cCasesAssurancePlanParserRuleCall_0_0 = (RuleCall)cCasesAlternatives_0.eContents().get(0);
		private final RuleCall cCasesAssuranceTaskParserRuleCall_0_1 = (RuleCall)cCasesAlternatives_0.eContents().get(1);
		
		//AlisaWorkArea:
		//	cases+=(AssurancePlan | AssuranceTask)*;
		@Override public ParserRule getRule() { return rule; }

		//cases+=(AssurancePlan | AssuranceTask)*
		public Assignment getCasesAssignment() { return cCasesAssignment; }

		//AssurancePlan | AssuranceTask
		public Alternatives getCasesAlternatives_0() { return cCasesAlternatives_0; }

		//AssurancePlan
		public RuleCall getCasesAssurancePlanParserRuleCall_0_0() { return cCasesAssurancePlanParserRuleCall_0_0; }

		//AssuranceTask
		public RuleCall getCasesAssuranceTaskParserRuleCall_0_1() { return cCasesAssuranceTaskParserRuleCall_0_1; }
	}

	public class AssurancePlanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AssurancePlan");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAssuranceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cPlanKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameQualifiedNameParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cTitleAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cTitleSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cTitleAssignment_3_1.eContents().get(0);
		private final Keyword cForKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTargetAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cTargetComponentImplementationCrossReference_5_0 = (CrossReference)cTargetAssignment_5.eContents().get(0);
		private final RuleCall cTargetComponentImplementationAadlClassifierReferenceParserRuleCall_5_0_1 = (RuleCall)cTargetComponentImplementationCrossReference_5_0.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final UnorderedGroup cUnorderedGroup_7 = (UnorderedGroup)cGroup.eContents().get(7);
		private final Assignment cDescriptionAssignment_7_0 = (Assignment)cUnorderedGroup_7.eContents().get(0);
		private final RuleCall cDescriptionDescriptionParserRuleCall_7_0_0 = (RuleCall)cDescriptionAssignment_7_0.eContents().get(0);
		private final Group cGroup_7_1 = (Group)cUnorderedGroup_7.eContents().get(1);
		private final Keyword cAssureKeyword_7_1_0 = (Keyword)cGroup_7_1.eContents().get(0);
		private final Keyword cOwnKeyword_7_1_1 = (Keyword)cGroup_7_1.eContents().get(1);
		private final Assignment cAssureOwnAssignment_7_1_2 = (Assignment)cGroup_7_1.eContents().get(2);
		private final CrossReference cAssureOwnVerificationPlanCrossReference_7_1_2_0 = (CrossReference)cAssureOwnAssignment_7_1_2.eContents().get(0);
		private final RuleCall cAssureOwnVerificationPlanQualifiedNameParserRuleCall_7_1_2_0_1 = (RuleCall)cAssureOwnVerificationPlanCrossReference_7_1_2_0.eContents().get(1);
		private final Group cGroup_7_2 = (Group)cUnorderedGroup_7.eContents().get(2);
		private final Keyword cAssureKeyword_7_2_0 = (Keyword)cGroup_7_2.eContents().get(0);
		private final Keyword cGlobalKeyword_7_2_1 = (Keyword)cGroup_7_2.eContents().get(1);
		private final Assignment cAssureGlobalAssignment_7_2_2 = (Assignment)cGroup_7_2.eContents().get(2);
		private final CrossReference cAssureGlobalVerificationPlanCrossReference_7_2_2_0 = (CrossReference)cAssureGlobalAssignment_7_2_2.eContents().get(0);
		private final RuleCall cAssureGlobalVerificationPlanQualifiedNameParserRuleCall_7_2_2_0_1 = (RuleCall)cAssureGlobalVerificationPlanCrossReference_7_2_2_0.eContents().get(1);
		private final Group cGroup_7_3 = (Group)cUnorderedGroup_7.eContents().get(3);
		private final Keyword cAssureKeyword_7_3_0 = (Keyword)cGroup_7_3.eContents().get(0);
		private final Keyword cSubsystemKeyword_7_3_1 = (Keyword)cGroup_7_3.eContents().get(1);
		private final Keyword cPlansKeyword_7_3_2 = (Keyword)cGroup_7_3.eContents().get(2);
		private final Assignment cAssureSubsystemPlansAssignment_7_3_3 = (Assignment)cGroup_7_3.eContents().get(3);
		private final CrossReference cAssureSubsystemPlansAssurancePlanCrossReference_7_3_3_0 = (CrossReference)cAssureSubsystemPlansAssignment_7_3_3.eContents().get(0);
		private final RuleCall cAssureSubsystemPlansAssurancePlanQualifiedNameParserRuleCall_7_3_3_0_1 = (RuleCall)cAssureSubsystemPlansAssurancePlanCrossReference_7_3_3_0.eContents().get(1);
		private final Group cGroup_7_4 = (Group)cUnorderedGroup_7.eContents().get(4);
		private final Keyword cAssumeKeyword_7_4_0 = (Keyword)cGroup_7_4.eContents().get(0);
		private final Keyword cSubsystemsKeyword_7_4_1 = (Keyword)cGroup_7_4.eContents().get(1);
		private final Alternatives cAlternatives_7_4_2 = (Alternatives)cGroup_7_4.eContents().get(2);
		private final Assignment cAssumeSubsystemsAssignment_7_4_2_0 = (Assignment)cAlternatives_7_4_2.eContents().get(0);
		private final CrossReference cAssumeSubsystemsComponentClassifierCrossReference_7_4_2_0_0 = (CrossReference)cAssumeSubsystemsAssignment_7_4_2_0.eContents().get(0);
		private final RuleCall cAssumeSubsystemsComponentClassifierAadlClassifierReferenceParserRuleCall_7_4_2_0_0_1 = (RuleCall)cAssumeSubsystemsComponentClassifierCrossReference_7_4_2_0_0.eContents().get(1);
		private final Assignment cAssumeAllAssignment_7_4_2_1 = (Assignment)cAlternatives_7_4_2.eContents().get(1);
		private final Keyword cAssumeAllAllKeyword_7_4_2_1_0 = (Keyword)cAssumeAllAssignment_7_4_2_1.eContents().get(0);
		private final Group cGroup_7_5 = (Group)cUnorderedGroup_7.eContents().get(5);
		private final Keyword cIssuesKeyword_7_5_0 = (Keyword)cGroup_7_5.eContents().get(0);
		private final Assignment cIssuesAssignment_7_5_1 = (Assignment)cGroup_7_5.eContents().get(1);
		private final RuleCall cIssuesSTRINGTerminalRuleCall_7_5_1_0 = (RuleCall)cIssuesAssignment_7_5_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//AssurancePlan:
		//	"assurance" "plan" name=QualifiedName (":" title=STRING)? "for"
		//	target=[aadl2::ComponentImplementation|AadlClassifierReference] "[" (description=Description? & ("assure" "own"
		//	assureOwn+=[Verify::VerificationPlan|QualifiedName]+)? & ("assure" "global"
		//	assureGlobal+=[Verify::VerificationPlan|QualifiedName]+)? & ("assure" "subsystem" "plans"
		//	assureSubsystemPlans+=[AssurancePlan|QualifiedName]+)? & ("assume" "subsystems"
		//	(assumeSubsystems+=[aadl2::ComponentClassifier|AadlClassifierReference]+ | assumeAll?="all"))? & ("issues"
		//	issues+=STRING+)?) "]";
		@Override public ParserRule getRule() { return rule; }

		//"assurance" "plan" name=QualifiedName (":" title=STRING)? "for"
		//target=[aadl2::ComponentImplementation|AadlClassifierReference] "[" (description=Description? & ("assure" "own"
		//assureOwn+=[Verify::VerificationPlan|QualifiedName]+)? & ("assure" "global"
		//assureGlobal+=[Verify::VerificationPlan|QualifiedName]+)? & ("assure" "subsystem" "plans"
		//assureSubsystemPlans+=[AssurancePlan|QualifiedName]+)? & ("assume" "subsystems"
		//(assumeSubsystems+=[aadl2::ComponentClassifier|AadlClassifierReference]+ | assumeAll?="all"))? & ("issues"
		//issues+=STRING+)?) "]"
		public Group getGroup() { return cGroup; }

		//"assurance"
		public Keyword getAssuranceKeyword_0() { return cAssuranceKeyword_0; }

		//"plan"
		public Keyword getPlanKeyword_1() { return cPlanKeyword_1; }

		//name=QualifiedName
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_2_0() { return cNameQualifiedNameParserRuleCall_2_0; }

		//(":" title=STRING)?
		public Group getGroup_3() { return cGroup_3; }

		//":"
		public Keyword getColonKeyword_3_0() { return cColonKeyword_3_0; }

		//title=STRING
		public Assignment getTitleAssignment_3_1() { return cTitleAssignment_3_1; }

		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_3_1_0() { return cTitleSTRINGTerminalRuleCall_3_1_0; }

		//"for"
		public Keyword getForKeyword_4() { return cForKeyword_4; }

		//target=[aadl2::ComponentImplementation|AadlClassifierReference]
		public Assignment getTargetAssignment_5() { return cTargetAssignment_5; }

		//[aadl2::ComponentImplementation|AadlClassifierReference]
		public CrossReference getTargetComponentImplementationCrossReference_5_0() { return cTargetComponentImplementationCrossReference_5_0; }

		//AadlClassifierReference
		public RuleCall getTargetComponentImplementationAadlClassifierReferenceParserRuleCall_5_0_1() { return cTargetComponentImplementationAadlClassifierReferenceParserRuleCall_5_0_1; }

		//"["
		public Keyword getLeftSquareBracketKeyword_6() { return cLeftSquareBracketKeyword_6; }

		//description=Description? & ("assure" "own" assureOwn+=[Verify::VerificationPlan|QualifiedName]+)? & ("assure" "global"
		//assureGlobal+=[Verify::VerificationPlan|QualifiedName]+)? & ("assure" "subsystem" "plans"
		//assureSubsystemPlans+=[AssurancePlan|QualifiedName]+)? & ("assume" "subsystems"
		//(assumeSubsystems+=[aadl2::ComponentClassifier|AadlClassifierReference]+ | assumeAll?="all"))? & ("issues"
		//issues+=STRING+)?
		public UnorderedGroup getUnorderedGroup_7() { return cUnorderedGroup_7; }

		//description=Description?
		public Assignment getDescriptionAssignment_7_0() { return cDescriptionAssignment_7_0; }

		//Description
		public RuleCall getDescriptionDescriptionParserRuleCall_7_0_0() { return cDescriptionDescriptionParserRuleCall_7_0_0; }

		//("assure" "own" assureOwn+=[Verify::VerificationPlan|QualifiedName]+)?
		public Group getGroup_7_1() { return cGroup_7_1; }

		//"assure"
		public Keyword getAssureKeyword_7_1_0() { return cAssureKeyword_7_1_0; }

		//"own"
		public Keyword getOwnKeyword_7_1_1() { return cOwnKeyword_7_1_1; }

		//assureOwn+=[Verify::VerificationPlan|QualifiedName]+
		public Assignment getAssureOwnAssignment_7_1_2() { return cAssureOwnAssignment_7_1_2; }

		//[Verify::VerificationPlan|QualifiedName]
		public CrossReference getAssureOwnVerificationPlanCrossReference_7_1_2_0() { return cAssureOwnVerificationPlanCrossReference_7_1_2_0; }

		//QualifiedName
		public RuleCall getAssureOwnVerificationPlanQualifiedNameParserRuleCall_7_1_2_0_1() { return cAssureOwnVerificationPlanQualifiedNameParserRuleCall_7_1_2_0_1; }

		//("assure" "global" assureGlobal+=[Verify::VerificationPlan|QualifiedName]+)?
		public Group getGroup_7_2() { return cGroup_7_2; }

		//"assure"
		public Keyword getAssureKeyword_7_2_0() { return cAssureKeyword_7_2_0; }

		//"global"
		public Keyword getGlobalKeyword_7_2_1() { return cGlobalKeyword_7_2_1; }

		//assureGlobal+=[Verify::VerificationPlan|QualifiedName]+
		public Assignment getAssureGlobalAssignment_7_2_2() { return cAssureGlobalAssignment_7_2_2; }

		//[Verify::VerificationPlan|QualifiedName]
		public CrossReference getAssureGlobalVerificationPlanCrossReference_7_2_2_0() { return cAssureGlobalVerificationPlanCrossReference_7_2_2_0; }

		//QualifiedName
		public RuleCall getAssureGlobalVerificationPlanQualifiedNameParserRuleCall_7_2_2_0_1() { return cAssureGlobalVerificationPlanQualifiedNameParserRuleCall_7_2_2_0_1; }

		//("assure" "subsystem" "plans" assureSubsystemPlans+=[AssurancePlan|QualifiedName]+)?
		public Group getGroup_7_3() { return cGroup_7_3; }

		//"assure"
		public Keyword getAssureKeyword_7_3_0() { return cAssureKeyword_7_3_0; }

		//"subsystem"
		public Keyword getSubsystemKeyword_7_3_1() { return cSubsystemKeyword_7_3_1; }

		//"plans"
		public Keyword getPlansKeyword_7_3_2() { return cPlansKeyword_7_3_2; }

		//assureSubsystemPlans+=[AssurancePlan|QualifiedName]+
		public Assignment getAssureSubsystemPlansAssignment_7_3_3() { return cAssureSubsystemPlansAssignment_7_3_3; }

		//[AssurancePlan|QualifiedName]
		public CrossReference getAssureSubsystemPlansAssurancePlanCrossReference_7_3_3_0() { return cAssureSubsystemPlansAssurancePlanCrossReference_7_3_3_0; }

		//QualifiedName
		public RuleCall getAssureSubsystemPlansAssurancePlanQualifiedNameParserRuleCall_7_3_3_0_1() { return cAssureSubsystemPlansAssurancePlanQualifiedNameParserRuleCall_7_3_3_0_1; }

		//("assume" "subsystems" (assumeSubsystems+=[aadl2::ComponentClassifier|AadlClassifierReference]+ | assumeAll?="all"))?
		public Group getGroup_7_4() { return cGroup_7_4; }

		//"assume"
		public Keyword getAssumeKeyword_7_4_0() { return cAssumeKeyword_7_4_0; }

		//"subsystems"
		public Keyword getSubsystemsKeyword_7_4_1() { return cSubsystemsKeyword_7_4_1; }

		//assumeSubsystems+=[aadl2::ComponentClassifier|AadlClassifierReference]+ | assumeAll?="all"
		public Alternatives getAlternatives_7_4_2() { return cAlternatives_7_4_2; }

		//assumeSubsystems+=[aadl2::ComponentClassifier|AadlClassifierReference]+
		public Assignment getAssumeSubsystemsAssignment_7_4_2_0() { return cAssumeSubsystemsAssignment_7_4_2_0; }

		//[aadl2::ComponentClassifier|AadlClassifierReference]
		public CrossReference getAssumeSubsystemsComponentClassifierCrossReference_7_4_2_0_0() { return cAssumeSubsystemsComponentClassifierCrossReference_7_4_2_0_0; }

		//AadlClassifierReference
		public RuleCall getAssumeSubsystemsComponentClassifierAadlClassifierReferenceParserRuleCall_7_4_2_0_0_1() { return cAssumeSubsystemsComponentClassifierAadlClassifierReferenceParserRuleCall_7_4_2_0_0_1; }

		//assumeAll?="all"
		public Assignment getAssumeAllAssignment_7_4_2_1() { return cAssumeAllAssignment_7_4_2_1; }

		//"all"
		public Keyword getAssumeAllAllKeyword_7_4_2_1_0() { return cAssumeAllAllKeyword_7_4_2_1_0; }

		//("issues" issues+=STRING+)?
		public Group getGroup_7_5() { return cGroup_7_5; }

		//"issues"
		public Keyword getIssuesKeyword_7_5_0() { return cIssuesKeyword_7_5_0; }

		//issues+=STRING+
		public Assignment getIssuesAssignment_7_5_1() { return cIssuesAssignment_7_5_1; }

		//STRING
		public RuleCall getIssuesSTRINGTerminalRuleCall_7_5_1_0() { return cIssuesSTRINGTerminalRuleCall_7_5_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_8() { return cRightSquareBracketKeyword_8; }
	}

	public class AssuranceTaskElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AssuranceTask");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAssuranceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cTaskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cTitleAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cTitleSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cTitleAssignment_3_1.eContents().get(0);
		private final Keyword cForKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cAssurancePlanAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cAssurancePlanAssurancePlanCrossReference_5_0 = (CrossReference)cAssurancePlanAssignment_5.eContents().get(0);
		private final RuleCall cAssurancePlanAssurancePlanQualifiedNameParserRuleCall_5_0_1 = (RuleCall)cAssurancePlanAssurancePlanCrossReference_5_0.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final UnorderedGroup cUnorderedGroup_7 = (UnorderedGroup)cGroup.eContents().get(7);
		private final Group cGroup_7_0 = (Group)cUnorderedGroup_7.eContents().get(0);
		private final Keyword cDescriptionKeyword_7_0_0 = (Keyword)cGroup_7_0.eContents().get(0);
		private final Assignment cDescriptionAssignment_7_0_1 = (Assignment)cGroup_7_0.eContents().get(1);
		private final RuleCall cDescriptionDescriptionParserRuleCall_7_0_1_0 = (RuleCall)cDescriptionAssignment_7_0_1.eContents().get(0);
		private final Group cGroup_7_1 = (Group)cUnorderedGroup_7.eContents().get(1);
		private final Keyword cFilterKeyword_7_1_0 = (Keyword)cGroup_7_1.eContents().get(0);
		private final Assignment cFilterAssignment_7_1_1 = (Assignment)cGroup_7_1.eContents().get(1);
		private final CrossReference cFilterCategoryCrossReference_7_1_1_0 = (CrossReference)cFilterAssignment_7_1_1.eContents().get(0);
		private final RuleCall cFilterCategoryIDTerminalRuleCall_7_1_1_0_1 = (RuleCall)cFilterCategoryCrossReference_7_1_1_0.eContents().get(1);
		private final Assignment cStrictFilterAssignment_7_1_2 = (Assignment)cGroup_7_1.eContents().get(2);
		private final Keyword cStrictFilterOnlyKeyword_7_1_2_0 = (Keyword)cStrictFilterAssignment_7_1_2.eContents().get(0);
		private final Group cGroup_7_2 = (Group)cUnorderedGroup_7.eContents().get(2);
		private final Keyword cIssuesKeyword_7_2_0 = (Keyword)cGroup_7_2.eContents().get(0);
		private final Assignment cIssuesAssignment_7_2_1 = (Assignment)cGroup_7_2.eContents().get(1);
		private final RuleCall cIssuesSTRINGTerminalRuleCall_7_2_1_0 = (RuleCall)cIssuesAssignment_7_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		////OrSelectionConditionExpr returns SelectionConditionExpr:
		////	AndSelectionConditionExpr (=> ({AndSelectionConditionExpr.left=current} 'or') right=OrSelectionConditionExpr)*;
		////
		////AndSelectionConditionExpr returns SelectionConditionExpr:
		////	SelectionCategoryReference (=> ({AndSelectionConditionExpr.left=current} 'and') right=AndSelectionConditionExpr)*;
		////
		////SelectionCategoryReference:
		////	cat=[categories::Category|ID];
		//AssuranceTask:
		//	"assurance" "task" name=ID (":" title=STRING)? "for" assurancePlan=[AssurancePlan|QualifiedName] "[" (("description"
		//	description=Description)? & ("filter" filter+=[categories::Category]+ strictFilter?="only"?)? & ("issues"
		//	issues+=STRING+)?) "]";
		@Override public ParserRule getRule() { return rule; }

		//"assurance" "task" name=ID (":" title=STRING)? "for" assurancePlan=[AssurancePlan|QualifiedName] "[" (("description"
		//description=Description)? & ("filter" filter+=[categories::Category]+ strictFilter?="only"?)? & ("issues"
		//issues+=STRING+)?) "]"
		public Group getGroup() { return cGroup; }

		//"assurance"
		public Keyword getAssuranceKeyword_0() { return cAssuranceKeyword_0; }

		//"task"
		public Keyword getTaskKeyword_1() { return cTaskKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//(":" title=STRING)?
		public Group getGroup_3() { return cGroup_3; }

		//":"
		public Keyword getColonKeyword_3_0() { return cColonKeyword_3_0; }

		//title=STRING
		public Assignment getTitleAssignment_3_1() { return cTitleAssignment_3_1; }

		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_3_1_0() { return cTitleSTRINGTerminalRuleCall_3_1_0; }

		//"for"
		public Keyword getForKeyword_4() { return cForKeyword_4; }

		//assurancePlan=[AssurancePlan|QualifiedName]
		public Assignment getAssurancePlanAssignment_5() { return cAssurancePlanAssignment_5; }

		//[AssurancePlan|QualifiedName]
		public CrossReference getAssurancePlanAssurancePlanCrossReference_5_0() { return cAssurancePlanAssurancePlanCrossReference_5_0; }

		//QualifiedName
		public RuleCall getAssurancePlanAssurancePlanQualifiedNameParserRuleCall_5_0_1() { return cAssurancePlanAssurancePlanQualifiedNameParserRuleCall_5_0_1; }

		//"["
		public Keyword getLeftSquareBracketKeyword_6() { return cLeftSquareBracketKeyword_6; }

		//("description" description=Description)? & ("filter" filter+=[categories::Category]+ strictFilter?="only"?)? & ("issues"
		//issues+=STRING+)?
		public UnorderedGroup getUnorderedGroup_7() { return cUnorderedGroup_7; }

		//("description" description=Description)?
		public Group getGroup_7_0() { return cGroup_7_0; }

		//"description"
		public Keyword getDescriptionKeyword_7_0_0() { return cDescriptionKeyword_7_0_0; }

		//description=Description
		public Assignment getDescriptionAssignment_7_0_1() { return cDescriptionAssignment_7_0_1; }

		//Description
		public RuleCall getDescriptionDescriptionParserRuleCall_7_0_1_0() { return cDescriptionDescriptionParserRuleCall_7_0_1_0; }

		//("filter" filter+=[categories::Category]+ strictFilter?="only"?)?
		public Group getGroup_7_1() { return cGroup_7_1; }

		//"filter"
		public Keyword getFilterKeyword_7_1_0() { return cFilterKeyword_7_1_0; }

		//filter+=[categories::Category]+
		public Assignment getFilterAssignment_7_1_1() { return cFilterAssignment_7_1_1; }

		//[categories::Category]
		public CrossReference getFilterCategoryCrossReference_7_1_1_0() { return cFilterCategoryCrossReference_7_1_1_0; }

		//ID
		public RuleCall getFilterCategoryIDTerminalRuleCall_7_1_1_0_1() { return cFilterCategoryIDTerminalRuleCall_7_1_1_0_1; }

		//strictFilter?="only"?
		public Assignment getStrictFilterAssignment_7_1_2() { return cStrictFilterAssignment_7_1_2; }

		//"only"
		public Keyword getStrictFilterOnlyKeyword_7_1_2_0() { return cStrictFilterOnlyKeyword_7_1_2_0; }

		//("issues" issues+=STRING+)?
		public Group getGroup_7_2() { return cGroup_7_2; }

		//"issues"
		public Keyword getIssuesKeyword_7_2_0() { return cIssuesKeyword_7_2_0; }

		//issues+=STRING+
		public Assignment getIssuesAssignment_7_2_1() { return cIssuesAssignment_7_2_1; }

		//STRING
		public RuleCall getIssuesSTRINGTerminalRuleCall_7_2_1_0() { return cIssuesSTRINGTerminalRuleCall_7_2_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_8() { return cRightSquareBracketKeyword_8; }
	}
	
	
	private final AlisaWorkAreaElements pAlisaWorkArea;
	private final AssurancePlanElements pAssurancePlan;
	private final AssuranceTaskElements pAssuranceTask;
	
	private final Grammar grammar;

	private final CommonGrammarAccess gaCommon;

	@Inject
	public AlisaGrammarAccess(GrammarProvider grammarProvider,
		CommonGrammarAccess gaCommon) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaCommon = gaCommon;
		this.pAlisaWorkArea = new AlisaWorkAreaElements();
		this.pAssurancePlan = new AssurancePlanElements();
		this.pAssuranceTask = new AssuranceTaskElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.osate.alisa.workbench.Alisa".equals(grammar.getName())) {
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
	

	public CommonGrammarAccess getCommonGrammarAccess() {
		return gaCommon;
	}

	
	//AlisaWorkArea:
	//	cases+=(AssurancePlan | AssuranceTask)*;
	public AlisaWorkAreaElements getAlisaWorkAreaAccess() {
		return pAlisaWorkArea;
	}
	
	public ParserRule getAlisaWorkAreaRule() {
		return getAlisaWorkAreaAccess().getRule();
	}

	//AssurancePlan:
	//	"assurance" "plan" name=QualifiedName (":" title=STRING)? "for"
	//	target=[aadl2::ComponentImplementation|AadlClassifierReference] "[" (description=Description? & ("assure" "own"
	//	assureOwn+=[Verify::VerificationPlan|QualifiedName]+)? & ("assure" "global"
	//	assureGlobal+=[Verify::VerificationPlan|QualifiedName]+)? & ("assure" "subsystem" "plans"
	//	assureSubsystemPlans+=[AssurancePlan|QualifiedName]+)? & ("assume" "subsystems"
	//	(assumeSubsystems+=[aadl2::ComponentClassifier|AadlClassifierReference]+ | assumeAll?="all"))? & ("issues"
	//	issues+=STRING+)?) "]";
	public AssurancePlanElements getAssurancePlanAccess() {
		return pAssurancePlan;
	}
	
	public ParserRule getAssurancePlanRule() {
		return getAssurancePlanAccess().getRule();
	}

	////OrSelectionConditionExpr returns SelectionConditionExpr:
	////	AndSelectionConditionExpr (=> ({AndSelectionConditionExpr.left=current} 'or') right=OrSelectionConditionExpr)*;
	////
	////AndSelectionConditionExpr returns SelectionConditionExpr:
	////	SelectionCategoryReference (=> ({AndSelectionConditionExpr.left=current} 'and') right=AndSelectionConditionExpr)*;
	////
	////SelectionCategoryReference:
	////	cat=[categories::Category|ID];
	//AssuranceTask:
	//	"assurance" "task" name=ID (":" title=STRING)? "for" assurancePlan=[AssurancePlan|QualifiedName] "[" (("description"
	//	description=Description)? & ("filter" filter+=[categories::Category]+ strictFilter?="only"?)? & ("issues"
	//	issues+=STRING+)?) "]";
	public AssuranceTaskElements getAssuranceTaskAccess() {
		return pAssuranceTask;
	}
	
	public ParserRule getAssuranceTaskRule() {
		return getAssuranceTaskAccess().getRule();
	}

	//Description:
	//	"description" description+=DescriptionElement+;
	public CommonGrammarAccess.DescriptionElements getDescriptionAccess() {
		return gaCommon.getDescriptionAccess();
	}
	
	public ParserRule getDescriptionRule() {
		return getDescriptionAccess().getRule();
	}

	//DescriptionElement:
	//	text=STRING | showValue=ShowValue | thisTarget?="this" | image=ImageReference;
	public CommonGrammarAccess.DescriptionElementElements getDescriptionElementAccess() {
		return gaCommon.getDescriptionElementAccess();
	}
	
	public ParserRule getDescriptionElementRule() {
		return getDescriptionElementAccess().getRule();
	}

	//Rationale:
	//	"rationale" text=STRING;
	public CommonGrammarAccess.RationaleElements getRationaleAccess() {
		return gaCommon.getRationaleAccess();
	}
	
	public ParserRule getRationaleRule() {
		return getRationaleAccess().getRule();
	}

	//Uncertainty:
	//	"uncertainty" "[" ("volatility" volatility=Number & "costimpact" costimpact=Number & "scheduleimpact"
	//	scheduleimpact=Number & "familiarity" familiarity=Number & "timecriticality" timecriticality=Number & "riskindex"
	//	riskindex=Number & "maturityindex" maturityindex=Number) "]";
	public CommonGrammarAccess.UncertaintyElements getUncertaintyAccess() {
		return gaCommon.getUncertaintyAccess();
	}
	
	public ParserRule getUncertaintyRule() {
		return getUncertaintyAccess().getRule();
	}

	//ValDeclaration returns AVariableDeclaration:
	//	{ValDeclaration} "val" (=> (type=ID name=ID) | name=ID) "=" right=AExpression?;
	public CommonGrammarAccess.ValDeclarationElements getValDeclarationAccess() {
		return gaCommon.getValDeclarationAccess();
	}
	
	public ParserRule getValDeclarationRule() {
		return getValDeclarationAccess().getRule();
	}

	//ComputeDeclaration returns AVariableDeclaration:
	//	{ComputeDeclaration} "compute" (=> (type=ID name=ID) | name=ID);
	public CommonGrammarAccess.ComputeDeclarationElements getComputeDeclarationAccess() {
		return gaCommon.getComputeDeclarationAccess();
	}
	
	public ParserRule getComputeDeclarationRule() {
		return getComputeDeclarationAccess().getRule();
	}

	//APropertyReference returns AExpression:
	//	{APropertyReference} "@" property=[aadl2::AbstractNamedValue|AADLPROPERTYREFERENCE];
	public CommonGrammarAccess.APropertyReferenceElements getAPropertyReferenceAccess() {
		return gaCommon.getAPropertyReferenceAccess();
	}
	
	public ParserRule getAPropertyReferenceRule() {
		return getAPropertyReferenceAccess().getRule();
	}

	//AVariableReference returns AExpression:
	//	{AVariableReference} variable=[AVariableDeclaration];
	public CommonGrammarAccess.AVariableReferenceElements getAVariableReferenceAccess() {
		return gaCommon.getAVariableReferenceAccess();
	}
	
	public ParserRule getAVariableReferenceRule() {
		return getAVariableReferenceAccess().getRule();
	}

	//ShowValue:
	//	ref=[AVariableDeclaration] ("%" unit=[aadl2::UnitLiteral])?;
	public CommonGrammarAccess.ShowValueElements getShowValueAccess() {
		return gaCommon.getShowValueAccess();
	}
	
	public ParserRule getShowValueRule() {
		return getShowValueAccess().getRule();
	}

	//ImageReference:
	//	"img" imgfile=IMGREF;
	public CommonGrammarAccess.ImageReferenceElements getImageReferenceAccess() {
		return gaCommon.getImageReferenceAccess();
	}
	
	public ParserRule getImageReferenceRule() {
		return getImageReferenceAccess().getRule();
	}

	//IMGREF:
	//	(ID "/")* ID "." ID;
	public CommonGrammarAccess.IMGREFElements getIMGREFAccess() {
		return gaCommon.getIMGREFAccess();
	}
	
	public ParserRule getIMGREFRule() {
		return getIMGREFAccess().getRule();
	}

	//// Expressions
	//AExpression returns aadl2::PropertyExpression:
	//	AOrExpression;
	public CommonGrammarAccess.AExpressionElements getAExpressionAccess() {
		return gaCommon.getAExpressionAccess();
	}
	
	public ParserRule getAExpressionRule() {
		return getAExpressionAccess().getRule();
	}

	//AOrExpression returns aadl2::PropertyExpression:
	//	AAndExpression (=> ({ABinaryOperation.leftOperand=current} feature=OpOr) rightOperand=AAndExpression)*;
	public CommonGrammarAccess.AOrExpressionElements getAOrExpressionAccess() {
		return gaCommon.getAOrExpressionAccess();
	}
	
	public ParserRule getAOrExpressionRule() {
		return getAOrExpressionAccess().getRule();
	}

	//OpOr:
	//	"||";
	public CommonGrammarAccess.OpOrElements getOpOrAccess() {
		return gaCommon.getOpOrAccess();
	}
	
	public ParserRule getOpOrRule() {
		return getOpOrAccess().getRule();
	}

	//AAndExpression returns aadl2::PropertyExpression:
	//	AEqualityExpression (=> ({ABinaryOperation.leftOperand=current} feature=OpAnd) rightOperand=AEqualityExpression)*;
	public CommonGrammarAccess.AAndExpressionElements getAAndExpressionAccess() {
		return gaCommon.getAAndExpressionAccess();
	}
	
	public ParserRule getAAndExpressionRule() {
		return getAAndExpressionAccess().getRule();
	}

	//OpAnd:
	//	"&&";
	public CommonGrammarAccess.OpAndElements getOpAndAccess() {
		return gaCommon.getOpAndAccess();
	}
	
	public ParserRule getOpAndRule() {
		return getOpAndAccess().getRule();
	}

	//AEqualityExpression returns aadl2::PropertyExpression:
	//	ARelationalExpression (=> ({ABinaryOperation.leftOperand=current} feature=OpEquality)
	//	rightOperand=ARelationalExpression)*;
	public CommonGrammarAccess.AEqualityExpressionElements getAEqualityExpressionAccess() {
		return gaCommon.getAEqualityExpressionAccess();
	}
	
	public ParserRule getAEqualityExpressionRule() {
		return getAEqualityExpressionAccess().getRule();
	}

	//OpEquality:
	//	"==" | "!=";
	public CommonGrammarAccess.OpEqualityElements getOpEqualityAccess() {
		return gaCommon.getOpEqualityAccess();
	}
	
	public ParserRule getOpEqualityRule() {
		return getOpEqualityAccess().getRule();
	}

	//ARelationalExpression returns aadl2::PropertyExpression:
	//	AOtherOperatorExpression (=> ({ABinaryOperation.leftOperand=current} feature=OpCompare)
	//	rightOperand=AOtherOperatorExpression)*;
	public CommonGrammarAccess.ARelationalExpressionElements getARelationalExpressionAccess() {
		return gaCommon.getARelationalExpressionAccess();
	}
	
	public ParserRule getARelationalExpressionRule() {
		return getARelationalExpressionAccess().getRule();
	}

	//OpCompare:
	//	">=" | "<" "=" | ">" | "<";
	public CommonGrammarAccess.OpCompareElements getOpCompareAccess() {
		return gaCommon.getOpCompareAccess();
	}
	
	public ParserRule getOpCompareRule() {
		return getOpCompareAccess().getRule();
	}

	//AOtherOperatorExpression returns aadl2::PropertyExpression:
	//	AAdditiveExpression (=> ({ABinaryOperation.leftOperand=current} feature=OpOther) rightOperand=AAdditiveExpression)*;
	public CommonGrammarAccess.AOtherOperatorExpressionElements getAOtherOperatorExpressionAccess() {
		return gaCommon.getAOtherOperatorExpressionAccess();
	}
	
	public ParserRule getAOtherOperatorExpressionRule() {
		return getAOtherOperatorExpressionAccess().getRule();
	}

	//OpOther:
	//	"->" | "..<" | ">" ".." | ".." | "=>" | ">" (=> (">" ">") | ">") | "<" (=> ("<" "<") | "<" | "=>") | "<>" | "?:";
	public CommonGrammarAccess.OpOtherElements getOpOtherAccess() {
		return gaCommon.getOpOtherAccess();
	}
	
	public ParserRule getOpOtherRule() {
		return getOpOtherAccess().getRule();
	}

	//AAdditiveExpression returns aadl2::PropertyExpression:
	//	AMultiplicativeExpression (=> ({ABinaryOperation.leftOperand=current} feature=OpAdd)
	//	rightOperand=AMultiplicativeExpression)*;
	public CommonGrammarAccess.AAdditiveExpressionElements getAAdditiveExpressionAccess() {
		return gaCommon.getAAdditiveExpressionAccess();
	}
	
	public ParserRule getAAdditiveExpressionRule() {
		return getAAdditiveExpressionAccess().getRule();
	}

	//OpAdd:
	//	"+" | "-";
	public CommonGrammarAccess.OpAddElements getOpAddAccess() {
		return gaCommon.getOpAddAccess();
	}
	
	public ParserRule getOpAddRule() {
		return getOpAddAccess().getRule();
	}

	//AMultiplicativeExpression returns aadl2::PropertyExpression:
	//	AUnaryOperation (=> ({ABinaryOperation.leftOperand=current} feature=OpMulti) rightOperand=AUnaryOperation)*;
	public CommonGrammarAccess.AMultiplicativeExpressionElements getAMultiplicativeExpressionAccess() {
		return gaCommon.getAMultiplicativeExpressionAccess();
	}
	
	public ParserRule getAMultiplicativeExpressionRule() {
		return getAMultiplicativeExpressionAccess().getRule();
	}

	//OpMulti:
	//	"*" | "**" | "/" | "%";
	public CommonGrammarAccess.OpMultiElements getOpMultiAccess() {
		return gaCommon.getOpMultiAccess();
	}
	
	public ParserRule getOpMultiRule() {
		return getOpMultiAccess().getRule();
	}

	//AUnaryOperation returns aadl2::PropertyExpression:
	//	{AUnaryOperation} feature=OpUnary operand=AUnaryOperation | APrimaryExpression;
	public CommonGrammarAccess.AUnaryOperationElements getAUnaryOperationAccess() {
		return gaCommon.getAUnaryOperationAccess();
	}
	
	public ParserRule getAUnaryOperationRule() {
		return getAUnaryOperationAccess().getRule();
	}

	//OpUnary:
	//	"!" | "-" | "+";
	public CommonGrammarAccess.OpUnaryElements getOpUnaryAccess() {
		return gaCommon.getOpUnaryAccess();
	}
	
	public ParserRule getOpUnaryRule() {
		return getOpUnaryAccess().getRule();
	}

	//APrimaryExpression returns aadl2::PropertyExpression:
	//	ALiteral | AVariableReference | APropertyReference | AParenthesizedExpression;
	public CommonGrammarAccess.APrimaryExpressionElements getAPrimaryExpressionAccess() {
		return gaCommon.getAPrimaryExpressionAccess();
	}
	
	public ParserRule getAPrimaryExpressionRule() {
		return getAPrimaryExpressionAccess().getRule();
	}

	//ALiteral returns aadl2::PropertyExpression:
	//	ASetTerm | AListTerm | ABooleanLiteral | ARealTerm | AIntegerTerm | ANullLiteral | StringTerm;
	public CommonGrammarAccess.ALiteralElements getALiteralAccess() {
		return gaCommon.getALiteralAccess();
	}
	
	public ParserRule getALiteralRule() {
		return getALiteralAccess().getRule();
	}

	//AIntegerTerm returns aadl2::IntegerLiteral:
	//	value=AInt unit=[aadl2::UnitLiteral]?;
	public CommonGrammarAccess.AIntegerTermElements getAIntegerTermAccess() {
		return gaCommon.getAIntegerTermAccess();
	}
	
	public ParserRule getAIntegerTermRule() {
		return getAIntegerTermAccess().getRule();
	}

	//AInt returns aadl2::Integer:
	//	INTEGER_LIT;
	public CommonGrammarAccess.AIntElements getAIntAccess() {
		return gaCommon.getAIntAccess();
	}
	
	public ParserRule getAIntRule() {
		return getAIntAccess().getRule();
	}

	//ARealTerm returns aadl2::RealLiteral:
	//	value=AReal unit=[aadl2::UnitLiteral]?;
	public CommonGrammarAccess.ARealTermElements getARealTermAccess() {
		return gaCommon.getARealTermAccess();
	}
	
	public ParserRule getARealTermRule() {
		return getARealTermAccess().getRule();
	}

	//AReal returns aadl2::Real:
	//	REAL_LIT;
	public CommonGrammarAccess.ARealElements getARealAccess() {
		return gaCommon.getARealAccess();
	}
	
	public ParserRule getARealRule() {
		return getARealAccess().getRule();
	}

	//ANumericRangeTerm returns aadl2::RangeValue:
	//	minimum= //(RealTerm|IntegerTerm| SignedConstant | ConstantValue)  
	//	NumAlt ".." maximum= //(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
	//	NumAlt ("delta" delta= //(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
	//	NumAlt)?;
	public CommonGrammarAccess.ANumericRangeTermElements getANumericRangeTermAccess() {
		return gaCommon.getANumericRangeTermAccess();
	}
	
	public ParserRule getANumericRangeTermRule() {
		return getANumericRangeTermAccess().getRule();
	}

	//NumAlt returns aadl2::PropertyExpression:
	//	ARealTerm | AIntegerTerm;
	public CommonGrammarAccess.NumAltElements getNumAltAccess() {
		return gaCommon.getNumAltAccess();
	}
	
	public ParserRule getNumAltRule() {
		return getNumAltAccess().getRule();
	}

	//ASetTerm returns aadl2::PropertyExpression: //	{ASetLiteral} '#' '{' (elements+=AExpression (',' elements+=AExpression )*)? '}'
	//	{ASetLiteral} "{" (elements+=AExpression ("," elements+=AExpression)*)? "}";
	public CommonGrammarAccess.ASetTermElements getASetTermAccess() {
		return gaCommon.getASetTermAccess();
	}
	
	public ParserRule getASetTermRule() {
		return getASetTermAccess().getRule();
	}

	//AListTerm returns aadl2::PropertyExpression:
	//	{AListTerm} "#" "[" (elements+=AExpression ("," elements+=AExpression)*)? "]";
	public CommonGrammarAccess.AListTermElements getAListTermAccess() {
		return gaCommon.getAListTermAccess();
	}
	
	public ParserRule getAListTermRule() {
		return getAListTermAccess().getRule();
	}

	//AParenthesizedExpression returns aadl2::PropertyExpression:
	//	"(" AExpression ")";
	public CommonGrammarAccess.AParenthesizedExpressionElements getAParenthesizedExpressionAccess() {
		return gaCommon.getAParenthesizedExpressionAccess();
	}
	
	public ParserRule getAParenthesizedExpressionRule() {
		return getAParenthesizedExpressionAccess().getRule();
	}

	//ABooleanLiteral returns aadl2::PropertyExpression:
	//	{aadl2::BooleanLiteral} (value?="true" | "false");
	public CommonGrammarAccess.ABooleanLiteralElements getABooleanLiteralAccess() {
		return gaCommon.getABooleanLiteralAccess();
	}
	
	public ParserRule getABooleanLiteralRule() {
		return getABooleanLiteralAccess().getRule();
	}

	//ANullLiteral returns aadl2::PropertyExpression:
	//	{ANullLiteral} "null";
	public CommonGrammarAccess.ANullLiteralElements getANullLiteralAccess() {
		return gaCommon.getANullLiteralAccess();
	}
	
	public ParserRule getANullLiteralRule() {
		return getANullLiteralAccess().getRule();
	}

	//StringTerm returns aadl2::StringLiteral:
	//	value=NoQuoteString;
	public CommonGrammarAccess.StringTermElements getStringTermAccess() {
		return gaCommon.getStringTermAccess();
	}
	
	public ParserRule getStringTermRule() {
		return getStringTermAccess().getRule();
	}

	//NoQuoteString: // remove quotes from string in ValueConverter
	//	STRING;
	public CommonGrammarAccess.NoQuoteStringElements getNoQuoteStringAccess() {
		return gaCommon.getNoQuoteStringAccess();
	}
	
	public ParserRule getNoQuoteStringRule() {
		return getNoQuoteStringAccess().getRule();
	}

	//ComponentCategory returns aadl2::ComponentCategory:
	//	"abstract" | "bus" | "data" | "device" | "memory" | "process" | "processor" | "subprogram" | "subprogram" "group" |
	//	"system" | "thread" "group" | "thread" | "virtual" "bus" | "virtual" "processor";
	public CommonGrammarAccess.ComponentCategoryElements getComponentCategoryAccess() {
		return gaCommon.getComponentCategoryAccess();
	}
	
	public ParserRule getComponentCategoryRule() {
		return getComponentCategoryAccess().getRule();
	}

	//terminal fragment EXPONENT:
	//	("e" | "E") ("+" | "-")? DIGIT+;
	public TerminalRule getEXPONENTRule() {
		return gaCommon.getEXPONENTRule();
	} 

	//terminal fragment INT_EXPONENT:
	//	("e" | "E") "+"? DIGIT+;
	public TerminalRule getINT_EXPONENTRule() {
		return gaCommon.getINT_EXPONENTRule();
	} 

	//terminal REAL_LIT:
	//	DIGIT+ ("_" DIGIT+)* ("." DIGIT+ ("_" DIGIT+)* EXPONENT?);
	public TerminalRule getREAL_LITRule() {
		return gaCommon.getREAL_LITRule();
	} 

	//terminal INTEGER_LIT:
	//	DIGIT+ ("_" DIGIT+)* ("#" BASED_INTEGER "#" INT_EXPONENT? | INT_EXPONENT?);
	public TerminalRule getINTEGER_LITRule() {
		return gaCommon.getINTEGER_LITRule();
	} 

	//terminal fragment DIGIT:
	//	"0".."9";
	public TerminalRule getDIGITRule() {
		return gaCommon.getDIGITRule();
	} 

	//terminal fragment EXTENDED_DIGIT:
	//	"0".."9" | "a".."f" | "A".."F";
	public TerminalRule getEXTENDED_DIGITRule() {
		return gaCommon.getEXTENDED_DIGITRule();
	} 

	//terminal fragment BASED_INTEGER:
	//	EXTENDED_DIGIT ("_"? EXTENDED_DIGIT)*;
	public TerminalRule getBASED_INTEGERRule() {
		return gaCommon.getBASED_INTEGERRule();
	} 

	//// Qualified classifier reference
	//AadlClassifierReference:
	//	ID ("::" ID)+ ("." ID)?;
	public CommonGrammarAccess.AadlClassifierReferenceElements getAadlClassifierReferenceAccess() {
		return gaCommon.getAadlClassifierReferenceAccess();
	}
	
	public ParserRule getAadlClassifierReferenceRule() {
		return getAadlClassifierReferenceAccess().getRule();
	}

	//AADLPROPERTYREFERENCE:
	//	ID ("::" ID)?;
	public CommonGrammarAccess.AADLPROPERTYREFERENCEElements getAADLPROPERTYREFERENCEAccess() {
		return gaCommon.getAADLPROPERTYREFERENCEAccess();
	}
	
	public ParserRule getAADLPROPERTYREFERENCERule() {
		return getAADLPROPERTYREFERENCEAccess().getRule();
	}

	//URIID:
	//	STRING;
	public CommonGrammarAccess.URIIDElements getURIIDAccess() {
		return gaCommon.getURIIDAccess();
	}
	
	public ParserRule getURIIDRule() {
		return getURIIDAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)*;
	public CommonGrammarAccess.QualifiedNameElements getQualifiedNameAccess() {
		return gaCommon.getQualifiedNameAccess();
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//Number hidden():
	//	HEX | (INT | DECIMAL) ("." (INT | DECIMAL))?;
	public CommonGrammarAccess.NumberElements getNumberAccess() {
		return gaCommon.getNumberAccess();
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}

	//terminal HEX:
	//	("0x" | "0X") ("0".."9" | "a".."f" | "A".."F" | "_")+ ("#" (("b" | "B") ("i" | "I") | ("l" | "L")))?;
	public TerminalRule getHEXRule() {
		return gaCommon.getHEXRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9" ("0".."9" | "_")*;
	public TerminalRule getINTRule() {
		return gaCommon.getINTRule();
	} 

	//terminal DECIMAL:
	//	INT (("e" | "E") ("+" | "-")? INT)? (("b" | "B") ("i" | "I" | "d" | "D") | ("l" | "L" | "d" | "D" | "f" | "F"))?;
	public TerminalRule getDECIMALRule() {
		return gaCommon.getDECIMALRule();
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaCommon.getIDRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaCommon.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaCommon.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaCommon.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaCommon.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaCommon.getANY_OTHERRule();
	} 
}
