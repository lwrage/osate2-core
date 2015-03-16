/*
* generated by Xtext
*/
package org.osate.results.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class ResultsGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ResultReportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ResultReport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTitleAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTitleSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cTitleAssignment_2_1.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cRootKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cRootAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cRootEObjectCrossReference_5_0 = (CrossReference)cRootAssignment_5.eContents().get(0);
		private final RuleCall cRootEObjectURIIDParserRuleCall_5_0_1 = (RuleCall)cRootEObjectCrossReference_5_0.eContents().get(1);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cDescriptionKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cDecriptionAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cDecriptionSTRINGTerminalRuleCall_6_1_0 = (RuleCall)cDecriptionAssignment_6_1.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cHeadingKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cHeadingAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cHeadingSTRINGTerminalRuleCall_7_1_0 = (RuleCall)cHeadingAssignment_7_1.eContents().get(0);
		private final Assignment cContentAssignment_7_2 = (Assignment)cGroup_7.eContents().get(2);
		private final RuleCall cContentResultReportEntryParserRuleCall_7_2_0 = (RuleCall)cContentAssignment_7_2.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cDataKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cResultDataAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cResultDataResultDataParserRuleCall_8_1_0 = (RuleCall)cResultDataAssignment_8_1.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cIssuesKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cIssueAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cIssueReportIssueParserRuleCall_9_1_0 = (RuleCall)cIssueAssignment_9_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//// Collection of reports for an instance model (root), e.g., for colelction of end to end flows
		//ResultReport:
		//	"report" name=ID (":" title=STRING)? "[" "root" root= // system instance or other root object
		//	[ecore::EObject|URIID] ("description" decription=STRING)? ("heading" heading=STRING content+=ResultReportEntry*)?
		//	("data" resultData=ResultData)? ("issues" issue+=ReportIssue*)? "]";
		public ParserRule getRule() { return rule; }

		//"report" name=ID (":" title=STRING)? "[" "root" root= // system instance or other root object
		//[ecore::EObject|URIID] ("description" decription=STRING)? ("heading" heading=STRING content+=ResultReportEntry*)?
		//("data" resultData=ResultData)? ("issues" issue+=ReportIssue*)? "]"
		public Group getGroup() { return cGroup; }

		//"report"
		public Keyword getReportKeyword_0() { return cReportKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//(":" title=STRING)?
		public Group getGroup_2() { return cGroup_2; }

		//":"
		public Keyword getColonKeyword_2_0() { return cColonKeyword_2_0; }

		//title=STRING
		public Assignment getTitleAssignment_2_1() { return cTitleAssignment_2_1; }

		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_2_1_0() { return cTitleSTRINGTerminalRuleCall_2_1_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_3() { return cLeftSquareBracketKeyword_3; }

		//"root"
		public Keyword getRootKeyword_4() { return cRootKeyword_4; }

		//root= // system instance or other root object
		//[ecore::EObject|URIID]
		public Assignment getRootAssignment_5() { return cRootAssignment_5; }

		//// system instance or other root object
		//[ecore::EObject|URIID]
		public CrossReference getRootEObjectCrossReference_5_0() { return cRootEObjectCrossReference_5_0; }

		//URIID
		public RuleCall getRootEObjectURIIDParserRuleCall_5_0_1() { return cRootEObjectURIIDParserRuleCall_5_0_1; }

		//("description" decription=STRING)?
		public Group getGroup_6() { return cGroup_6; }

		//"description"
		public Keyword getDescriptionKeyword_6_0() { return cDescriptionKeyword_6_0; }

		//decription=STRING
		public Assignment getDecriptionAssignment_6_1() { return cDecriptionAssignment_6_1; }

		//STRING
		public RuleCall getDecriptionSTRINGTerminalRuleCall_6_1_0() { return cDecriptionSTRINGTerminalRuleCall_6_1_0; }

		//("heading" heading=STRING content+=ResultReportEntry*)?
		public Group getGroup_7() { return cGroup_7; }

		//"heading"
		public Keyword getHeadingKeyword_7_0() { return cHeadingKeyword_7_0; }

		//heading=STRING
		public Assignment getHeadingAssignment_7_1() { return cHeadingAssignment_7_1; }

		//STRING
		public RuleCall getHeadingSTRINGTerminalRuleCall_7_1_0() { return cHeadingSTRINGTerminalRuleCall_7_1_0; }

		//content+=ResultReportEntry*
		public Assignment getContentAssignment_7_2() { return cContentAssignment_7_2; }

		//ResultReportEntry
		public RuleCall getContentResultReportEntryParserRuleCall_7_2_0() { return cContentResultReportEntryParserRuleCall_7_2_0; }

		//("data" resultData=ResultData)?
		public Group getGroup_8() { return cGroup_8; }

		//"data"
		public Keyword getDataKeyword_8_0() { return cDataKeyword_8_0; }

		//resultData=ResultData
		public Assignment getResultDataAssignment_8_1() { return cResultDataAssignment_8_1; }

		//ResultData
		public RuleCall getResultDataResultDataParserRuleCall_8_1_0() { return cResultDataResultDataParserRuleCall_8_1_0; }

		//("issues" issue+=ReportIssue*)?
		public Group getGroup_9() { return cGroup_9; }

		//"issues"
		public Keyword getIssuesKeyword_9_0() { return cIssuesKeyword_9_0; }

		//issue+=ReportIssue*
		public Assignment getIssueAssignment_9_1() { return cIssueAssignment_9_1; }

		//ReportIssue
		public RuleCall getIssueReportIssueParserRuleCall_9_1_0() { return cIssueReportIssueParserRuleCall_9_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_10() { return cRightSquareBracketKeyword_10; }
	}

	public class ResultReportEntryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ResultReportEntry");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntryKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTitleAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTitleSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cTitleAssignment_2_1.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cTargetKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTargetAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cTargetEObjectCrossReference_5_0 = (CrossReference)cTargetAssignment_5.eContents().get(0);
		private final RuleCall cTargetEObjectURIIDParserRuleCall_5_0_1 = (RuleCall)cTargetEObjectCrossReference_5_0.eContents().get(1);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cDescriptionKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cDecriptionAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cDecriptionSTRINGTerminalRuleCall_6_1_0 = (RuleCall)cDecriptionAssignment_6_1.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cHeadingKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cHeadingAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cHeadingSTRINGTerminalRuleCall_7_1_0 = (RuleCall)cHeadingAssignment_7_1.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cResultKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cResultDataAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cResultDataResultDataParserRuleCall_8_1_0 = (RuleCall)cResultDataAssignment_8_1.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cIssuesKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cIssueAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cIssueReportIssueParserRuleCall_9_1_0 = (RuleCall)cIssueAssignment_9_1.eContents().get(0);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cLeftSquareBracketKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Assignment cRowAssignment_10_1 = (Assignment)cGroup_10.eContents().get(1);
		private final RuleCall cRowResultContributorParserRuleCall_10_1_0 = (RuleCall)cRowAssignment_10_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_10_2 = (Keyword)cGroup_10.eContents().get(2);
		private final Keyword cRightSquareBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//// one report of an analysis for one item in the instance model.
		//// it may be a report per SOM or per end to end flow
		//// result represents the result data that can be queried
		//ResultReportEntry:
		//	"entry" name=ID (":" title=STRING)? "[" "target" target= // system instance or other root object
		//	[ecore::EObject|URIID] ("description" decription=STRING)? ("heading" heading=STRING)? ("result" resultData=ResultData)?
		//	("issues" issue+=ReportIssue*)? ("[" row+=ResultContributor+ "]")? "]";
		public ParserRule getRule() { return rule; }

		//"entry" name=ID (":" title=STRING)? "[" "target" target= // system instance or other root object
		//[ecore::EObject|URIID] ("description" decription=STRING)? ("heading" heading=STRING)? ("result" resultData=ResultData)?
		//("issues" issue+=ReportIssue*)? ("[" row+=ResultContributor+ "]")? "]"
		public Group getGroup() { return cGroup; }

		//"entry"
		public Keyword getEntryKeyword_0() { return cEntryKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//(":" title=STRING)?
		public Group getGroup_2() { return cGroup_2; }

		//":"
		public Keyword getColonKeyword_2_0() { return cColonKeyword_2_0; }

		//title=STRING
		public Assignment getTitleAssignment_2_1() { return cTitleAssignment_2_1; }

		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_2_1_0() { return cTitleSTRINGTerminalRuleCall_2_1_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_3() { return cLeftSquareBracketKeyword_3; }

		//"target"
		public Keyword getTargetKeyword_4() { return cTargetKeyword_4; }

		//target= // system instance or other root object
		//[ecore::EObject|URIID]
		public Assignment getTargetAssignment_5() { return cTargetAssignment_5; }

		//// system instance or other root object
		//[ecore::EObject|URIID]
		public CrossReference getTargetEObjectCrossReference_5_0() { return cTargetEObjectCrossReference_5_0; }

		//URIID
		public RuleCall getTargetEObjectURIIDParserRuleCall_5_0_1() { return cTargetEObjectURIIDParserRuleCall_5_0_1; }

		//("description" decription=STRING)?
		public Group getGroup_6() { return cGroup_6; }

		//"description"
		public Keyword getDescriptionKeyword_6_0() { return cDescriptionKeyword_6_0; }

		//decription=STRING
		public Assignment getDecriptionAssignment_6_1() { return cDecriptionAssignment_6_1; }

		//STRING
		public RuleCall getDecriptionSTRINGTerminalRuleCall_6_1_0() { return cDecriptionSTRINGTerminalRuleCall_6_1_0; }

		//("heading" heading=STRING)?
		public Group getGroup_7() { return cGroup_7; }

		//"heading"
		public Keyword getHeadingKeyword_7_0() { return cHeadingKeyword_7_0; }

		//heading=STRING
		public Assignment getHeadingAssignment_7_1() { return cHeadingAssignment_7_1; }

		//STRING
		public RuleCall getHeadingSTRINGTerminalRuleCall_7_1_0() { return cHeadingSTRINGTerminalRuleCall_7_1_0; }

		//("result" resultData=ResultData)?
		public Group getGroup_8() { return cGroup_8; }

		//"result"
		public Keyword getResultKeyword_8_0() { return cResultKeyword_8_0; }

		//resultData=ResultData
		public Assignment getResultDataAssignment_8_1() { return cResultDataAssignment_8_1; }

		//ResultData
		public RuleCall getResultDataResultDataParserRuleCall_8_1_0() { return cResultDataResultDataParserRuleCall_8_1_0; }

		//("issues" issue+=ReportIssue*)?
		public Group getGroup_9() { return cGroup_9; }

		//"issues"
		public Keyword getIssuesKeyword_9_0() { return cIssuesKeyword_9_0; }

		//issue+=ReportIssue*
		public Assignment getIssueAssignment_9_1() { return cIssueAssignment_9_1; }

		//ReportIssue
		public RuleCall getIssueReportIssueParserRuleCall_9_1_0() { return cIssueReportIssueParserRuleCall_9_1_0; }

		//("[" row+=ResultContributor+ "]")?
		public Group getGroup_10() { return cGroup_10; }

		//"["
		public Keyword getLeftSquareBracketKeyword_10_0() { return cLeftSquareBracketKeyword_10_0; }

		//row+=ResultContributor+
		public Assignment getRowAssignment_10_1() { return cRowAssignment_10_1; }

		//ResultContributor
		public RuleCall getRowResultContributorParserRuleCall_10_1_0() { return cRowResultContributorParserRuleCall_10_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_10_2() { return cRightSquareBracketKeyword_10_2; }

		//"]"
		public Keyword getRightSquareBracketKeyword_11() { return cRightSquareBracketKeyword_11; }
	}

	public class ResultContributorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ResultContributor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContributorKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cContributorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cContributorEObjectCrossReference_1_0 = (CrossReference)cContributorAssignment_1.eContents().get(0);
		private final RuleCall cContributorEObjectURIIDParserRuleCall_1_0_1 = (RuleCall)cContributorEObjectCrossReference_1_0.eContents().get(1);
		private final Keyword cDataKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCellAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCellSTRINGTerminalRuleCall_3_0 = (RuleCall)cCellAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cIssuesKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cIssueAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cIssueReportIssueParserRuleCall_4_1_0 = (RuleCall)cIssueAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cLeftSquareBracketKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSubcontributorAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSubcontributorResultContributorParserRuleCall_5_1_0 = (RuleCall)cSubcontributorAssignment_5_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5_2 = (Keyword)cGroup_5.eContents().get(2);
		
		//// one row to represent a contributor to the result calculation.
		//// this structure can be nested
		//// each contributor can have issues reported
		//// user may dfine a subclass of this to add analysis specific data representations
		//ResultContributor:
		//	"contributor" contributor= // instance model element or declarative model element
		//	[ecore::EObject|URIID] "data" cell+=STRING+ ("issues" issue+=ReportIssue*)? ("[" subcontributor+=ResultContributor*
		//	"]")?;
		public ParserRule getRule() { return rule; }

		//"contributor" contributor= // instance model element or declarative model element
		//[ecore::EObject|URIID] "data" cell+=STRING+ ("issues" issue+=ReportIssue*)? ("[" subcontributor+=ResultContributor*
		//"]")?
		public Group getGroup() { return cGroup; }

		//"contributor"
		public Keyword getContributorKeyword_0() { return cContributorKeyword_0; }

		//contributor= // instance model element or declarative model element
		//[ecore::EObject|URIID]
		public Assignment getContributorAssignment_1() { return cContributorAssignment_1; }

		//// instance model element or declarative model element
		//[ecore::EObject|URIID]
		public CrossReference getContributorEObjectCrossReference_1_0() { return cContributorEObjectCrossReference_1_0; }

		//URIID
		public RuleCall getContributorEObjectURIIDParserRuleCall_1_0_1() { return cContributorEObjectURIIDParserRuleCall_1_0_1; }

		//"data"
		public Keyword getDataKeyword_2() { return cDataKeyword_2; }

		//cell+=STRING+
		public Assignment getCellAssignment_3() { return cCellAssignment_3; }

		//STRING
		public RuleCall getCellSTRINGTerminalRuleCall_3_0() { return cCellSTRINGTerminalRuleCall_3_0; }

		//("issues" issue+=ReportIssue*)?
		public Group getGroup_4() { return cGroup_4; }

		//"issues"
		public Keyword getIssuesKeyword_4_0() { return cIssuesKeyword_4_0; }

		//issue+=ReportIssue*
		public Assignment getIssueAssignment_4_1() { return cIssueAssignment_4_1; }

		//ReportIssue
		public RuleCall getIssueReportIssueParserRuleCall_4_1_0() { return cIssueReportIssueParserRuleCall_4_1_0; }

		//("[" subcontributor+=ResultContributor* "]")?
		public Group getGroup_5() { return cGroup_5; }

		//"["
		public Keyword getLeftSquareBracketKeyword_5_0() { return cLeftSquareBracketKeyword_5_0; }

		//subcontributor+=ResultContributor*
		public Assignment getSubcontributorAssignment_5_1() { return cSubcontributorAssignment_5_1; }

		//ResultContributor
		public RuleCall getSubcontributorResultContributorParserRuleCall_5_1_0() { return cSubcontributorResultContributorParserRuleCall_5_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_5_2() { return cRightSquareBracketKeyword_5_2; }
	}

	public class ReportIssueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ReportIssue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIssueTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cIssueTypeReportIssueTypeEnumRuleCall_0_0 = (RuleCall)cIssueTypeAssignment_0.eContents().get(0);
		private final Assignment cTitleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTitleSTRINGTerminalRuleCall_1_0 = (RuleCall)cTitleAssignment_1.eContents().get(0);
		private final Assignment cTargetAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTargetEObjectCrossReference_2_0 = (CrossReference)cTargetAssignment_2.eContents().get(0);
		private final RuleCall cTargetEObjectURIIDParserRuleCall_2_0_1 = (RuleCall)cTargetEObjectCrossReference_2_0.eContents().get(1);
		
		//// This is similar to diagnostics
		//ReportIssue:
		//	issueType=ReportIssueType title=STRING target=[ecore::EObject|URIID];
		public ParserRule getRule() { return rule; }

		//issueType=ReportIssueType title=STRING target=[ecore::EObject|URIID]
		public Group getGroup() { return cGroup; }

		//issueType=ReportIssueType
		public Assignment getIssueTypeAssignment_0() { return cIssueTypeAssignment_0; }

		//ReportIssueType
		public RuleCall getIssueTypeReportIssueTypeEnumRuleCall_0_0() { return cIssueTypeReportIssueTypeEnumRuleCall_0_0; }

		//title=STRING
		public Assignment getTitleAssignment_1() { return cTitleAssignment_1; }

		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_1_0() { return cTitleSTRINGTerminalRuleCall_1_0; }

		//target=[ecore::EObject|URIID]
		public Assignment getTargetAssignment_2() { return cTargetAssignment_2; }

		//[ecore::EObject|URIID]
		public CrossReference getTargetEObjectCrossReference_2_0() { return cTargetEObjectCrossReference_2_0; }

		//URIID
		public RuleCall getTargetEObjectURIIDParserRuleCall_2_0_1() { return cTargetEObjectURIIDParserRuleCall_2_0_1; }
	}

	public class ResultDataElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ResultData");
		private final Assignment cDataAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cDataNameValuePairParserRuleCall_0 = (RuleCall)cDataAssignment.eContents().get(0);
		
		//ResultData:
		//	data+=NameValuePair+;
		public ParserRule getRule() { return rule; }

		//data+=NameValuePair+
		public Assignment getDataAssignment() { return cDataAssignment; }

		//NameValuePair
		public RuleCall getDataNameValuePairParserRuleCall_0() { return cDataNameValuePairParserRuleCall_0; }
	}

	public class NameValuePairElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NameValuePair");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//NameValuePair:
		//	name=ID "=" value=STRING;
		public ParserRule getRule() { return rule; }

		//name=ID "=" value=STRING
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//value=STRING
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_0() { return cValueSTRINGTerminalRuleCall_2_0; }
	}

	public class URIIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "URIID");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		////terminal URIID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'#'|'@'|'/'|':')*;
		//URIID:
		//	STRING;
		public ParserRule getRule() { return rule; }

		////terminal URIID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'#'|'@'|'/'|':')*;
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	
	
	public class ReportIssueTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "ReportIssueType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cERROREnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cERRORErrorKeyword_0_0 = (Keyword)cERROREnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cWARNINGEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cWARNINGWarningKeyword_1_0 = (Keyword)cWARNINGEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cSUCCESSEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cSUCCESSSuccessKeyword_2_0 = (Keyword)cSUCCESSEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cINFOEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cINFOInfoKeyword_3_0 = (Keyword)cINFOEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum ReportIssueType:
		//	ERROR="error" | WARNING="warning" | SUCCESS="success" | INFO="info";
		public EnumRule getRule() { return rule; }

		//ERROR="error" | WARNING="warning" | SUCCESS="success" | INFO="info"
		public Alternatives getAlternatives() { return cAlternatives; }

		//ERROR="error"
		public EnumLiteralDeclaration getERROREnumLiteralDeclaration_0() { return cERROREnumLiteralDeclaration_0; }

		//"error"
		public Keyword getERRORErrorKeyword_0_0() { return cERRORErrorKeyword_0_0; }

		//WARNING="warning"
		public EnumLiteralDeclaration getWARNINGEnumLiteralDeclaration_1() { return cWARNINGEnumLiteralDeclaration_1; }

		//"warning"
		public Keyword getWARNINGWarningKeyword_1_0() { return cWARNINGWarningKeyword_1_0; }

		//SUCCESS="success"
		public EnumLiteralDeclaration getSUCCESSEnumLiteralDeclaration_2() { return cSUCCESSEnumLiteralDeclaration_2; }

		//"success"
		public Keyword getSUCCESSSuccessKeyword_2_0() { return cSUCCESSSuccessKeyword_2_0; }

		//INFO="info"
		public EnumLiteralDeclaration getINFOEnumLiteralDeclaration_3() { return cINFOEnumLiteralDeclaration_3; }

		//"info"
		public Keyword getINFOInfoKeyword_3_0() { return cINFOInfoKeyword_3_0; }
	}
	
	private final ResultReportElements pResultReport;
	private final ResultReportEntryElements pResultReportEntry;
	private final ResultContributorElements pResultContributor;
	private final ReportIssueElements pReportIssue;
	private final ResultDataElements pResultData;
	private final NameValuePairElements pNameValuePair;
	private final ReportIssueTypeElements unknownRuleReportIssueType;
	private final URIIDElements pURIID;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ResultsGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pResultReport = new ResultReportElements();
		this.pResultReportEntry = new ResultReportEntryElements();
		this.pResultContributor = new ResultContributorElements();
		this.pReportIssue = new ReportIssueElements();
		this.pResultData = new ResultDataElements();
		this.pNameValuePair = new NameValuePairElements();
		this.unknownRuleReportIssueType = new ReportIssueTypeElements();
		this.pURIID = new URIIDElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.osate.results.Results".equals(grammar.getName())) {
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
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//// Collection of reports for an instance model (root), e.g., for colelction of end to end flows
	//ResultReport:
	//	"report" name=ID (":" title=STRING)? "[" "root" root= // system instance or other root object
	//	[ecore::EObject|URIID] ("description" decription=STRING)? ("heading" heading=STRING content+=ResultReportEntry*)?
	//	("data" resultData=ResultData)? ("issues" issue+=ReportIssue*)? "]";
	public ResultReportElements getResultReportAccess() {
		return pResultReport;
	}
	
	public ParserRule getResultReportRule() {
		return getResultReportAccess().getRule();
	}

	//// one report of an analysis for one item in the instance model.
	//// it may be a report per SOM or per end to end flow
	//// result represents the result data that can be queried
	//ResultReportEntry:
	//	"entry" name=ID (":" title=STRING)? "[" "target" target= // system instance or other root object
	//	[ecore::EObject|URIID] ("description" decription=STRING)? ("heading" heading=STRING)? ("result" resultData=ResultData)?
	//	("issues" issue+=ReportIssue*)? ("[" row+=ResultContributor+ "]")? "]";
	public ResultReportEntryElements getResultReportEntryAccess() {
		return pResultReportEntry;
	}
	
	public ParserRule getResultReportEntryRule() {
		return getResultReportEntryAccess().getRule();
	}

	//// one row to represent a contributor to the result calculation.
	//// this structure can be nested
	//// each contributor can have issues reported
	//// user may dfine a subclass of this to add analysis specific data representations
	//ResultContributor:
	//	"contributor" contributor= // instance model element or declarative model element
	//	[ecore::EObject|URIID] "data" cell+=STRING+ ("issues" issue+=ReportIssue*)? ("[" subcontributor+=ResultContributor*
	//	"]")?;
	public ResultContributorElements getResultContributorAccess() {
		return pResultContributor;
	}
	
	public ParserRule getResultContributorRule() {
		return getResultContributorAccess().getRule();
	}

	//// This is similar to diagnostics
	//ReportIssue:
	//	issueType=ReportIssueType title=STRING target=[ecore::EObject|URIID];
	public ReportIssueElements getReportIssueAccess() {
		return pReportIssue;
	}
	
	public ParserRule getReportIssueRule() {
		return getReportIssueAccess().getRule();
	}

	//ResultData:
	//	data+=NameValuePair+;
	public ResultDataElements getResultDataAccess() {
		return pResultData;
	}
	
	public ParserRule getResultDataRule() {
		return getResultDataAccess().getRule();
	}

	//NameValuePair:
	//	name=ID "=" value=STRING;
	public NameValuePairElements getNameValuePairAccess() {
		return pNameValuePair;
	}
	
	public ParserRule getNameValuePairRule() {
		return getNameValuePairAccess().getRule();
	}

	//enum ReportIssueType:
	//	ERROR="error" | WARNING="warning" | SUCCESS="success" | INFO="info";
	public ReportIssueTypeElements getReportIssueTypeAccess() {
		return unknownRuleReportIssueType;
	}
	
	public EnumRule getReportIssueTypeRule() {
		return getReportIssueTypeAccess().getRule();
	}

	////terminal URIID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'#'|'@'|'/'|':')*;
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
