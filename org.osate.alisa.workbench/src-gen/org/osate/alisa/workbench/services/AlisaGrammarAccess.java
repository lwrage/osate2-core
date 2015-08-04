/*
 * generated by Xtext
 */
package org.osate.alisa.workbench.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

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
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
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
		private final Group cGroup_7_0 = (Group)cUnorderedGroup_7.eContents().get(0);
		private final Keyword cDescriptionKeyword_7_0_0 = (Keyword)cGroup_7_0.eContents().get(0);
		private final Assignment cDescriptionAssignment_7_0_1 = (Assignment)cGroup_7_0.eContents().get(1);
		private final RuleCall cDescriptionDescriptionParserRuleCall_7_0_1_0 = (RuleCall)cDescriptionAssignment_7_0_1.eContents().get(0);
		private final Group cGroup_7_1 = (Group)cUnorderedGroup_7.eContents().get(1);
		private final Keyword cAssureKeyword_7_1_0 = (Keyword)cGroup_7_1.eContents().get(0);
		private final Keyword cAllKeyword_7_1_1 = (Keyword)cGroup_7_1.eContents().get(1);
		private final Assignment cAssureAllAssignment_7_1_2 = (Assignment)cGroup_7_1.eContents().get(2);
		private final CrossReference cAssureAllVerificationPlanCrossReference_7_1_2_0 = (CrossReference)cAssureAllAssignment_7_1_2.eContents().get(0);
		private final RuleCall cAssureAllVerificationPlanQualifiedNameParserRuleCall_7_1_2_0_1 = (RuleCall)cAssureAllVerificationPlanCrossReference_7_1_2_0.eContents().get(1);
		private final Group cGroup_7_2 = (Group)cUnorderedGroup_7.eContents().get(2);
		private final Keyword cAssureKeyword_7_2_0 = (Keyword)cGroup_7_2.eContents().get(0);
		private final Keyword cSubsystemKeyword_7_2_1 = (Keyword)cGroup_7_2.eContents().get(1);
		private final Keyword cPlansKeyword_7_2_2 = (Keyword)cGroup_7_2.eContents().get(2);
		private final Assignment cAssurePlansAssignment_7_2_3 = (Assignment)cGroup_7_2.eContents().get(3);
		private final CrossReference cAssurePlansAssurancePlanCrossReference_7_2_3_0 = (CrossReference)cAssurePlansAssignment_7_2_3.eContents().get(0);
		private final RuleCall cAssurePlansAssurancePlanQualifiedNameParserRuleCall_7_2_3_0_1 = (RuleCall)cAssurePlansAssurancePlanCrossReference_7_2_3_0.eContents().get(1);
		private final Group cGroup_7_3 = (Group)cUnorderedGroup_7.eContents().get(3);
		private final Keyword cAssumeKeyword_7_3_0 = (Keyword)cGroup_7_3.eContents().get(0);
		private final Keyword cSubsystemsKeyword_7_3_1 = (Keyword)cGroup_7_3.eContents().get(1);
		private final Assignment cAssumeSubsystemsAssignment_7_3_2 = (Assignment)cGroup_7_3.eContents().get(2);
		private final CrossReference cAssumeSubsystemsComponentClassifierCrossReference_7_3_2_0 = (CrossReference)cAssumeSubsystemsAssignment_7_3_2.eContents().get(0);
		private final RuleCall cAssumeSubsystemsComponentClassifierAadlClassifierReferenceParserRuleCall_7_3_2_0_1 = (RuleCall)cAssumeSubsystemsComponentClassifierCrossReference_7_3_2_0.eContents().get(1);
		private final Group cGroup_7_4 = (Group)cUnorderedGroup_7.eContents().get(4);
		private final Keyword cIssuesKeyword_7_4_0 = (Keyword)cGroup_7_4.eContents().get(0);
		private final Assignment cIssuesAssignment_7_4_1 = (Assignment)cGroup_7_4.eContents().get(1);
		private final RuleCall cIssuesSTRINGTerminalRuleCall_7_4_1_0 = (RuleCall)cIssuesAssignment_7_4_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//AssurancePlan:
		//	"assurance" "plan" name=ID (":" title=STRING)? "for" target=[aadl2::ComponentImplementation|AadlClassifierReference]
		//	"[" (("description" description=Description)? & ("assure" "all"
		//	assureAll+=[Verify::VerificationPlan|QualifiedName]+)? & ("assure" "subsystem" "plans"
		//	assurePlans+=[AssurancePlan|QualifiedName]+)? & ("assume" "subsystems"
		//	assumeSubsystems+=[aadl2::ComponentClassifier|AadlClassifierReference]+)? & ("issues" issues+=STRING+)?) "]";
		@Override public ParserRule getRule() { return rule; }

		//"assurance" "plan" name=ID (":" title=STRING)? "for" target=[aadl2::ComponentImplementation|AadlClassifierReference] "["
		//(("description" description=Description)? & ("assure" "all" assureAll+=[Verify::VerificationPlan|QualifiedName]+)? &
		//("assure" "subsystem" "plans" assurePlans+=[AssurancePlan|QualifiedName]+)? & ("assume" "subsystems"
		//assumeSubsystems+=[aadl2::ComponentClassifier|AadlClassifierReference]+)? & ("issues" issues+=STRING+)?) "]"
		public Group getGroup() { return cGroup; }

		//"assurance"
		public Keyword getAssuranceKeyword_0() { return cAssuranceKeyword_0; }

		//"plan"
		public Keyword getPlanKeyword_1() { return cPlanKeyword_1; }

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

		//target=[aadl2::ComponentImplementation|AadlClassifierReference]
		public Assignment getTargetAssignment_5() { return cTargetAssignment_5; }

		//[aadl2::ComponentImplementation|AadlClassifierReference]
		public CrossReference getTargetComponentImplementationCrossReference_5_0() { return cTargetComponentImplementationCrossReference_5_0; }

		//AadlClassifierReference
		public RuleCall getTargetComponentImplementationAadlClassifierReferenceParserRuleCall_5_0_1() { return cTargetComponentImplementationAadlClassifierReferenceParserRuleCall_5_0_1; }

		//"["
		public Keyword getLeftSquareBracketKeyword_6() { return cLeftSquareBracketKeyword_6; }

		//("description" description=Description)? & ("assure" "all" assureAll+=[Verify::VerificationPlan|QualifiedName]+)? &
		//("assure" "subsystem" "plans" assurePlans+=[AssurancePlan|QualifiedName]+)? & ("assume" "subsystems"
		//assumeSubsystems+=[aadl2::ComponentClassifier|AadlClassifierReference]+)? & ("issues" issues+=STRING+)?
		public UnorderedGroup getUnorderedGroup_7() { return cUnorderedGroup_7; }

		//("description" description=Description)?
		public Group getGroup_7_0() { return cGroup_7_0; }

		//"description"
		public Keyword getDescriptionKeyword_7_0_0() { return cDescriptionKeyword_7_0_0; }

		//description=Description
		public Assignment getDescriptionAssignment_7_0_1() { return cDescriptionAssignment_7_0_1; }

		//Description
		public RuleCall getDescriptionDescriptionParserRuleCall_7_0_1_0() { return cDescriptionDescriptionParserRuleCall_7_0_1_0; }

		//("assure" "all" assureAll+=[Verify::VerificationPlan|QualifiedName]+)?
		public Group getGroup_7_1() { return cGroup_7_1; }

		//"assure"
		public Keyword getAssureKeyword_7_1_0() { return cAssureKeyword_7_1_0; }

		//"all"
		public Keyword getAllKeyword_7_1_1() { return cAllKeyword_7_1_1; }

		//assureAll+=[Verify::VerificationPlan|QualifiedName]+
		public Assignment getAssureAllAssignment_7_1_2() { return cAssureAllAssignment_7_1_2; }

		//[Verify::VerificationPlan|QualifiedName]
		public CrossReference getAssureAllVerificationPlanCrossReference_7_1_2_0() { return cAssureAllVerificationPlanCrossReference_7_1_2_0; }

		//QualifiedName
		public RuleCall getAssureAllVerificationPlanQualifiedNameParserRuleCall_7_1_2_0_1() { return cAssureAllVerificationPlanQualifiedNameParserRuleCall_7_1_2_0_1; }

		//("assure" "subsystem" "plans" assurePlans+=[AssurancePlan|QualifiedName]+)?
		public Group getGroup_7_2() { return cGroup_7_2; }

		//"assure"
		public Keyword getAssureKeyword_7_2_0() { return cAssureKeyword_7_2_0; }

		//"subsystem"
		public Keyword getSubsystemKeyword_7_2_1() { return cSubsystemKeyword_7_2_1; }

		//"plans"
		public Keyword getPlansKeyword_7_2_2() { return cPlansKeyword_7_2_2; }

		//assurePlans+=[AssurancePlan|QualifiedName]+
		public Assignment getAssurePlansAssignment_7_2_3() { return cAssurePlansAssignment_7_2_3; }

		//[AssurancePlan|QualifiedName]
		public CrossReference getAssurePlansAssurancePlanCrossReference_7_2_3_0() { return cAssurePlansAssurancePlanCrossReference_7_2_3_0; }

		//QualifiedName
		public RuleCall getAssurePlansAssurancePlanQualifiedNameParserRuleCall_7_2_3_0_1() { return cAssurePlansAssurancePlanQualifiedNameParserRuleCall_7_2_3_0_1; }

		//("assume" "subsystems" assumeSubsystems+=[aadl2::ComponentClassifier|AadlClassifierReference]+)?
		public Group getGroup_7_3() { return cGroup_7_3; }

		//"assume"
		public Keyword getAssumeKeyword_7_3_0() { return cAssumeKeyword_7_3_0; }

		//"subsystems"
		public Keyword getSubsystemsKeyword_7_3_1() { return cSubsystemsKeyword_7_3_1; }

		//assumeSubsystems+=[aadl2::ComponentClassifier|AadlClassifierReference]+
		public Assignment getAssumeSubsystemsAssignment_7_3_2() { return cAssumeSubsystemsAssignment_7_3_2; }

		//[aadl2::ComponentClassifier|AadlClassifierReference]
		public CrossReference getAssumeSubsystemsComponentClassifierCrossReference_7_3_2_0() { return cAssumeSubsystemsComponentClassifierCrossReference_7_3_2_0; }

		//AadlClassifierReference
		public RuleCall getAssumeSubsystemsComponentClassifierAadlClassifierReferenceParserRuleCall_7_3_2_0_1() { return cAssumeSubsystemsComponentClassifierAadlClassifierReferenceParserRuleCall_7_3_2_0_1; }

		//("issues" issues+=STRING+)?
		public Group getGroup_7_4() { return cGroup_7_4; }

		//"issues"
		public Keyword getIssuesKeyword_7_4_0() { return cIssuesKeyword_7_4_0; }

		//issues+=STRING+
		public Assignment getIssuesAssignment_7_4_1() { return cIssuesAssignment_7_4_1; }

		//STRING
		public RuleCall getIssuesSTRINGTerminalRuleCall_7_4_1_0() { return cIssuesSTRINGTerminalRuleCall_7_4_1_0; }

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
		private final RuleCall cAssurancePlanAssurancePlanIDTerminalRuleCall_5_0_1 = (RuleCall)cAssurancePlanAssurancePlanCrossReference_5_0.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final UnorderedGroup cUnorderedGroup_7 = (UnorderedGroup)cGroup.eContents().get(7);
		private final Group cGroup_7_0 = (Group)cUnorderedGroup_7.eContents().get(0);
		private final Keyword cDescriptionKeyword_7_0_0 = (Keyword)cGroup_7_0.eContents().get(0);
		private final Assignment cDescriptionAssignment_7_0_1 = (Assignment)cGroup_7_0.eContents().get(1);
		private final RuleCall cDescriptionDescriptionParserRuleCall_7_0_1_0 = (RuleCall)cDescriptionAssignment_7_0_1.eContents().get(0);
		private final Alternatives cAlternatives_7_1 = (Alternatives)cUnorderedGroup_7.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_7_1_0 = (UnorderedGroup)cAlternatives_7_1.eContents().get(0);
		private final Group cGroup_7_1_0_0 = (Group)cUnorderedGroup_7_1_0.eContents().get(0);
		private final Keyword cFilterKeyword_7_1_0_0_0 = (Keyword)cGroup_7_1_0_0.eContents().get(0);
		private final Group cGroup_7_1_0_0_1 = (Group)cGroup_7_1_0_0.eContents().get(1);
		private final Keyword cRequirementsKeyword_7_1_0_0_1_0 = (Keyword)cGroup_7_1_0_0_1.eContents().get(0);
		private final Assignment cRequirementFilterAssignment_7_1_0_0_1_1 = (Assignment)cGroup_7_1_0_0_1.eContents().get(1);
		private final CrossReference cRequirementFilterRequirementCategoryCrossReference_7_1_0_0_1_1_0 = (CrossReference)cRequirementFilterAssignment_7_1_0_0_1_1.eContents().get(0);
		private final RuleCall cRequirementFilterRequirementCategoryIDTerminalRuleCall_7_1_0_0_1_1_0_1 = (RuleCall)cRequirementFilterRequirementCategoryCrossReference_7_1_0_0_1_1_0.eContents().get(1);
		private final Group cGroup_7_1_0_1 = (Group)cUnorderedGroup_7_1_0.eContents().get(1);
		private final Keyword cVerificationsKeyword_7_1_0_1_0 = (Keyword)cGroup_7_1_0_1.eContents().get(0);
		private final Assignment cVerificationFilterAssignment_7_1_0_1_1 = (Assignment)cGroup_7_1_0_1.eContents().get(1);
		private final CrossReference cVerificationFilterVerificationCategoryCrossReference_7_1_0_1_1_0 = (CrossReference)cVerificationFilterAssignment_7_1_0_1_1.eContents().get(0);
		private final RuleCall cVerificationFilterVerificationCategoryIDTerminalRuleCall_7_1_0_1_1_0_1 = (RuleCall)cVerificationFilterVerificationCategoryCrossReference_7_1_0_1_1_0.eContents().get(1);
		private final Group cGroup_7_1_0_2 = (Group)cUnorderedGroup_7_1_0.eContents().get(2);
		private final Keyword cSelectionsKeyword_7_1_0_2_0 = (Keyword)cGroup_7_1_0_2.eContents().get(0);
		private final Assignment cSelectionFilterAssignment_7_1_0_2_1 = (Assignment)cGroup_7_1_0_2.eContents().get(1);
		private final CrossReference cSelectionFilterSelectionCategoryCrossReference_7_1_0_2_1_0 = (CrossReference)cSelectionFilterAssignment_7_1_0_2_1.eContents().get(0);
		private final RuleCall cSelectionFilterSelectionCategoryIDTerminalRuleCall_7_1_0_2_1_0_1 = (RuleCall)cSelectionFilterSelectionCategoryCrossReference_7_1_0_2_1_0.eContents().get(1);
		private final Group cGroup_7_1_1 = (Group)cAlternatives_7_1.eContents().get(1);
		private final Keyword cClaimsKeyword_7_1_1_0 = (Keyword)cGroup_7_1_1.eContents().get(0);
		private final Assignment cClaimsAssignment_7_1_1_1 = (Assignment)cGroup_7_1_1.eContents().get(1);
		private final CrossReference cClaimsClaimCrossReference_7_1_1_1_0 = (CrossReference)cClaimsAssignment_7_1_1_1.eContents().get(0);
		private final RuleCall cClaimsClaimQualifiedNameParserRuleCall_7_1_1_1_0_1 = (RuleCall)cClaimsClaimCrossReference_7_1_1_1_0.eContents().get(1);
		private final Group cGroup_7_2 = (Group)cUnorderedGroup_7.eContents().get(2);
		private final Keyword cIssuesKeyword_7_2_0 = (Keyword)cGroup_7_2.eContents().get(0);
		private final Assignment cIssuesAssignment_7_2_1 = (Assignment)cGroup_7_2.eContents().get(1);
		private final RuleCall cIssuesSTRINGTerminalRuleCall_7_2_1_0 = (RuleCall)cIssuesAssignment_7_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//AssuranceTask:
		//	"assurance" "task" name=ID (":" title=STRING)? "for" assurancePlan=[AssurancePlan] "[" (("description"
		//	description=Description)? & ("filter" ("requirements" requirementFilter+=[categories::RequirementCategory]+)? &
		//	("verifications" verificationFilter+=[categories::VerificationCategory]+)? & ("selections"
		//	selectionFilter+=[categories::SelectionCategory]+)? | "claims" claims+=[Verify::Claim|QualifiedName]+) & ("issues"
		//	issues+=STRING+)?) "]";
		@Override public ParserRule getRule() { return rule; }

		//"assurance" "task" name=ID (":" title=STRING)? "for" assurancePlan=[AssurancePlan] "[" (("description"
		//description=Description)? & ("filter" ("requirements" requirementFilter+=[categories::RequirementCategory]+)? &
		//("verifications" verificationFilter+=[categories::VerificationCategory]+)? & ("selections"
		//selectionFilter+=[categories::SelectionCategory]+)? | "claims" claims+=[Verify::Claim|QualifiedName]+) & ("issues"
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

		//assurancePlan=[AssurancePlan]
		public Assignment getAssurancePlanAssignment_5() { return cAssurancePlanAssignment_5; }

		//[AssurancePlan]
		public CrossReference getAssurancePlanAssurancePlanCrossReference_5_0() { return cAssurancePlanAssurancePlanCrossReference_5_0; }

		//ID
		public RuleCall getAssurancePlanAssurancePlanIDTerminalRuleCall_5_0_1() { return cAssurancePlanAssurancePlanIDTerminalRuleCall_5_0_1; }

		//"["
		public Keyword getLeftSquareBracketKeyword_6() { return cLeftSquareBracketKeyword_6; }

		//("description" description=Description)? & ("filter" ("requirements"
		//requirementFilter+=[categories::RequirementCategory]+)? & ("verifications"
		//verificationFilter+=[categories::VerificationCategory]+)? & ("selections"
		//selectionFilter+=[categories::SelectionCategory]+)? | "claims" claims+=[Verify::Claim|QualifiedName]+) & ("issues"
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

		//"filter" ("requirements" requirementFilter+=[categories::RequirementCategory]+)? & ("verifications"
		//verificationFilter+=[categories::VerificationCategory]+)? & ("selections"
		//selectionFilter+=[categories::SelectionCategory]+)? | "claims" claims+=[Verify::Claim|QualifiedName]+
		public Alternatives getAlternatives_7_1() { return cAlternatives_7_1; }

		//"filter" ("requirements" requirementFilter+=[categories::RequirementCategory]+)? & ("verifications"
		//verificationFilter+=[categories::VerificationCategory]+)? & ("selections"
		//selectionFilter+=[categories::SelectionCategory]+)?
		public UnorderedGroup getUnorderedGroup_7_1_0() { return cUnorderedGroup_7_1_0; }

		//"filter" ("requirements" requirementFilter+=[categories::RequirementCategory]+)?
		public Group getGroup_7_1_0_0() { return cGroup_7_1_0_0; }

		//"filter"
		public Keyword getFilterKeyword_7_1_0_0_0() { return cFilterKeyword_7_1_0_0_0; }

		//("requirements" requirementFilter+=[categories::RequirementCategory]+)?
		public Group getGroup_7_1_0_0_1() { return cGroup_7_1_0_0_1; }

		//"requirements"
		public Keyword getRequirementsKeyword_7_1_0_0_1_0() { return cRequirementsKeyword_7_1_0_0_1_0; }

		//requirementFilter+=[categories::RequirementCategory]+
		public Assignment getRequirementFilterAssignment_7_1_0_0_1_1() { return cRequirementFilterAssignment_7_1_0_0_1_1; }

		//[categories::RequirementCategory]
		public CrossReference getRequirementFilterRequirementCategoryCrossReference_7_1_0_0_1_1_0() { return cRequirementFilterRequirementCategoryCrossReference_7_1_0_0_1_1_0; }

		//ID
		public RuleCall getRequirementFilterRequirementCategoryIDTerminalRuleCall_7_1_0_0_1_1_0_1() { return cRequirementFilterRequirementCategoryIDTerminalRuleCall_7_1_0_0_1_1_0_1; }

		//("verifications" verificationFilter+=[categories::VerificationCategory]+)?
		public Group getGroup_7_1_0_1() { return cGroup_7_1_0_1; }

		//"verifications"
		public Keyword getVerificationsKeyword_7_1_0_1_0() { return cVerificationsKeyword_7_1_0_1_0; }

		//verificationFilter+=[categories::VerificationCategory]+
		public Assignment getVerificationFilterAssignment_7_1_0_1_1() { return cVerificationFilterAssignment_7_1_0_1_1; }

		//[categories::VerificationCategory]
		public CrossReference getVerificationFilterVerificationCategoryCrossReference_7_1_0_1_1_0() { return cVerificationFilterVerificationCategoryCrossReference_7_1_0_1_1_0; }

		//ID
		public RuleCall getVerificationFilterVerificationCategoryIDTerminalRuleCall_7_1_0_1_1_0_1() { return cVerificationFilterVerificationCategoryIDTerminalRuleCall_7_1_0_1_1_0_1; }

		//("selections" selectionFilter+=[categories::SelectionCategory]+)?
		public Group getGroup_7_1_0_2() { return cGroup_7_1_0_2; }

		//"selections"
		public Keyword getSelectionsKeyword_7_1_0_2_0() { return cSelectionsKeyword_7_1_0_2_0; }

		//selectionFilter+=[categories::SelectionCategory]+
		public Assignment getSelectionFilterAssignment_7_1_0_2_1() { return cSelectionFilterAssignment_7_1_0_2_1; }

		//[categories::SelectionCategory]
		public CrossReference getSelectionFilterSelectionCategoryCrossReference_7_1_0_2_1_0() { return cSelectionFilterSelectionCategoryCrossReference_7_1_0_2_1_0; }

		//ID
		public RuleCall getSelectionFilterSelectionCategoryIDTerminalRuleCall_7_1_0_2_1_0_1() { return cSelectionFilterSelectionCategoryIDTerminalRuleCall_7_1_0_2_1_0_1; }

		//"claims" claims+=[Verify::Claim|QualifiedName]+
		public Group getGroup_7_1_1() { return cGroup_7_1_1; }

		//"claims"
		public Keyword getClaimsKeyword_7_1_1_0() { return cClaimsKeyword_7_1_1_0; }

		//claims+=[Verify::Claim|QualifiedName]+
		public Assignment getClaimsAssignment_7_1_1_1() { return cClaimsAssignment_7_1_1_1; }

		//[Verify::Claim|QualifiedName]
		public CrossReference getClaimsClaimCrossReference_7_1_1_1_0() { return cClaimsClaimCrossReference_7_1_1_1_0; }

		//QualifiedName
		public RuleCall getClaimsClaimQualifiedNameParserRuleCall_7_1_1_1_0_1() { return cClaimsClaimQualifiedNameParserRuleCall_7_1_1_1_0_1; }

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

	public class DescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Description");
		private final Assignment cDescriptionAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cDescriptionDescriptionElementParserRuleCall_0 = (RuleCall)cDescriptionAssignment.eContents().get(0);
		
		////OrSelectionConditionExpr returns SelectionConditionExpr:
		////	AndSelectionConditionExpr (=> ({AndSelectionConditionExpr.left=current} 'or') right=OrSelectionConditionExpr)*;
		////
		////AndSelectionConditionExpr returns SelectionConditionExpr:
		////	SelectionCategoryReference (=> ({AndSelectionConditionExpr.left=current} 'and') right=AndSelectionConditionExpr)*;
		////
		////SelectionCategoryReference:
		////	cat=[categories::Category|ID];
		//Description:
		//	description+=DescriptionElement+;
		@Override public ParserRule getRule() { return rule; }

		//description+=DescriptionElement+
		public Assignment getDescriptionAssignment() { return cDescriptionAssignment; }

		//DescriptionElement
		public RuleCall getDescriptionDescriptionElementParserRuleCall_0() { return cDescriptionDescriptionElementParserRuleCall_0; }
	}

	public class DescriptionElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DescriptionElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cTextAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cTextSTRINGTerminalRuleCall_0_0 = (RuleCall)cTextAssignment_0.eContents().get(0);
		private final Assignment cThisTargetAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cThisTargetThisKeyword_1_0 = (Keyword)cThisTargetAssignment_1.eContents().get(0);
		
		//DescriptionElement:
		//	text=STRING | thisTarget?="this";
		@Override public ParserRule getRule() { return rule; }

		//text=STRING | thisTarget?="this"
		public Alternatives getAlternatives() { return cAlternatives; }

		//text=STRING
		public Assignment getTextAssignment_0() { return cTextAssignment_0; }

		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_0_0() { return cTextSTRINGTerminalRuleCall_0_0; }

		//thisTarget?="this"
		public Assignment getThisTargetAssignment_1() { return cThisTargetAssignment_1; }

		//"this"
		public Keyword getThisTargetThisKeyword_1_0() { return cThisTargetThisKeyword_1_0; }
	}

	public class AadlClassifierReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AadlClassifierReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cColonColonKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cFullStopKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//// Qualified classifier reference
		//AadlClassifierReference:
		//	ID ("::" ID)+ ("." ID)?;
		@Override public ParserRule getRule() { return rule; }

		//ID ("::" ID)+ ("." ID)?
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("::" ID)+
		public Group getGroup_1() { return cGroup_1; }

		//"::"
		public Keyword getColonColonKeyword_1_0() { return cColonColonKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }

		//("." ID)?
		public Group getGroup_2() { return cGroup_2; }

		//"."
		public Keyword getFullStopKeyword_2_0() { return cFullStopKeyword_2_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_2_1() { return cIDTerminalRuleCall_2_1; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ("." ID)?;
		@Override public ParserRule getRule() { return rule; }

		//ID ("." ID)?
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)?
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class URIIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "URIID");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//URIID:
		//	STRING;
		@Override public ParserRule getRule() { return rule; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	
	
	private final AlisaWorkAreaElements pAlisaWorkArea;
	private final AssurancePlanElements pAssurancePlan;
	private final AssuranceTaskElements pAssuranceTask;
	private final DescriptionElements pDescription;
	private final DescriptionElementElements pDescriptionElement;
	private final AadlClassifierReferenceElements pAadlClassifierReference;
	private final QualifiedNameElements pQualifiedName;
	private final URIIDElements pURIID;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public AlisaGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pAlisaWorkArea = new AlisaWorkAreaElements();
		this.pAssurancePlan = new AssurancePlanElements();
		this.pAssuranceTask = new AssuranceTaskElements();
		this.pDescription = new DescriptionElements();
		this.pDescriptionElement = new DescriptionElementElements();
		this.pAadlClassifierReference = new AadlClassifierReferenceElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pURIID = new URIIDElements();
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
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
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
	//	"assurance" "plan" name=ID (":" title=STRING)? "for" target=[aadl2::ComponentImplementation|AadlClassifierReference]
	//	"[" (("description" description=Description)? & ("assure" "all"
	//	assureAll+=[Verify::VerificationPlan|QualifiedName]+)? & ("assure" "subsystem" "plans"
	//	assurePlans+=[AssurancePlan|QualifiedName]+)? & ("assume" "subsystems"
	//	assumeSubsystems+=[aadl2::ComponentClassifier|AadlClassifierReference]+)? & ("issues" issues+=STRING+)?) "]";
	public AssurancePlanElements getAssurancePlanAccess() {
		return pAssurancePlan;
	}
	
	public ParserRule getAssurancePlanRule() {
		return getAssurancePlanAccess().getRule();
	}

	//AssuranceTask:
	//	"assurance" "task" name=ID (":" title=STRING)? "for" assurancePlan=[AssurancePlan] "[" (("description"
	//	description=Description)? & ("filter" ("requirements" requirementFilter+=[categories::RequirementCategory]+)? &
	//	("verifications" verificationFilter+=[categories::VerificationCategory]+)? & ("selections"
	//	selectionFilter+=[categories::SelectionCategory]+)? | "claims" claims+=[Verify::Claim|QualifiedName]+) & ("issues"
	//	issues+=STRING+)?) "]";
	public AssuranceTaskElements getAssuranceTaskAccess() {
		return pAssuranceTask;
	}
	
	public ParserRule getAssuranceTaskRule() {
		return getAssuranceTaskAccess().getRule();
	}

	////OrSelectionConditionExpr returns SelectionConditionExpr:
	////	AndSelectionConditionExpr (=> ({AndSelectionConditionExpr.left=current} 'or') right=OrSelectionConditionExpr)*;
	////
	////AndSelectionConditionExpr returns SelectionConditionExpr:
	////	SelectionCategoryReference (=> ({AndSelectionConditionExpr.left=current} 'and') right=AndSelectionConditionExpr)*;
	////
	////SelectionCategoryReference:
	////	cat=[categories::Category|ID];
	//Description:
	//	description+=DescriptionElement+;
	public DescriptionElements getDescriptionAccess() {
		return pDescription;
	}
	
	public ParserRule getDescriptionRule() {
		return getDescriptionAccess().getRule();
	}

	//DescriptionElement:
	//	text=STRING | thisTarget?="this";
	public DescriptionElementElements getDescriptionElementAccess() {
		return pDescriptionElement;
	}
	
	public ParserRule getDescriptionElementRule() {
		return getDescriptionElementAccess().getRule();
	}

	//// Qualified classifier reference
	//AadlClassifierReference:
	//	ID ("::" ID)+ ("." ID)?;
	public AadlClassifierReferenceElements getAadlClassifierReferenceAccess() {
		return pAadlClassifierReference;
	}
	
	public ParserRule getAadlClassifierReferenceRule() {
		return getAadlClassifierReferenceAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)?;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//URIID:
	//	STRING;
	public URIIDElements getURIIDAccess() {
		return pURIID;
	}
	
	public ParserRule getURIIDRule() {
		return getURIIDAccess().getRule();
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
