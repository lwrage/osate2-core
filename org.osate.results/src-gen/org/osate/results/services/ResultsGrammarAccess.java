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
	
	
	public class ResultReportsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ResultReports");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cResultReportParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cResultReportCollectionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cIssuesReportParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//ResultReports:
		//	ResultReport | ResultReportCollection | IssuesReport;
		@Override public ParserRule getRule() { return rule; }

		//ResultReport | ResultReportCollection | IssuesReport
		public Alternatives getAlternatives() { return cAlternatives; }

		//ResultReport
		public RuleCall getResultReportParserRuleCall_0() { return cResultReportParserRuleCall_0; }

		//ResultReportCollection
		public RuleCall getResultReportCollectionParserRuleCall_1() { return cResultReportCollectionParserRuleCall_1; }

		//IssuesReport
		public RuleCall getIssuesReportParserRuleCall_2() { return cIssuesReportParserRuleCall_2; }
	}

	public class ResultReportCollectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ResultReportCollection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReportsKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Assignment cContentAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cContentResultReportParserRuleCall_7_0 = (RuleCall)cContentAssignment_7.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cIssuesKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cIssuesAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cIssuesReportIssueParserRuleCall_8_1_0 = (RuleCall)cIssuesAssignment_8_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//// Collection of reports for an instance model (root), e.g., for collection of end to end flows
		//ResultReportCollection:
		//	"reports" name=ID (":" title=STRING)? "[" "target" target= // system instance or other EObject
		//	[ecore::EObject|URIID] ("description" decription=STRING)? content+=ResultReport* ("issues" issues+=ReportIssue*)? "]";
		@Override public ParserRule getRule() { return rule; }

		//"reports" name=ID (":" title=STRING)? "[" "target" target= // system instance or other EObject
		//[ecore::EObject|URIID] ("description" decription=STRING)? content+=ResultReport* ("issues" issues+=ReportIssue*)? "]"
		public Group getGroup() { return cGroup; }

		//"reports"
		public Keyword getReportsKeyword_0() { return cReportsKeyword_0; }

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

		//target= // system instance or other EObject
		//[ecore::EObject|URIID]
		public Assignment getTargetAssignment_5() { return cTargetAssignment_5; }

		//// system instance or other EObject
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

		//content+=ResultReport*
		public Assignment getContentAssignment_7() { return cContentAssignment_7; }

		//ResultReport
		public RuleCall getContentResultReportParserRuleCall_7_0() { return cContentResultReportParserRuleCall_7_0; }

		//("issues" issues+=ReportIssue*)?
		public Group getGroup_8() { return cGroup_8; }

		//"issues"
		public Keyword getIssuesKeyword_8_0() { return cIssuesKeyword_8_0; }

		//issues+=ReportIssue*
		public Assignment getIssuesAssignment_8_1() { return cIssuesAssignment_8_1; }

		//ReportIssue
		public RuleCall getIssuesReportIssueParserRuleCall_8_1_0() { return cIssuesReportIssueParserRuleCall_8_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_9() { return cRightSquareBracketKeyword_9; }
	}

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
		private final Assignment cContentAssignment_7_2 = (Assignment)cGroup_7.eContents().get(2);
		private final RuleCall cContentResultContributorParserRuleCall_7_2_0 = (RuleCall)cContentAssignment_7_2.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cResultsKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cResultDataAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cResultDataResultDataParserRuleCall_8_1_0 = (RuleCall)cResultDataAssignment_8_1.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cIssuesKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cIssuesAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cIssuesReportIssueParserRuleCall_9_1_0 = (RuleCall)cIssuesAssignment_9_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//// one report of an analysis for one item in the instance model.
		//// it may be a report per SOM or per end to end flow
		//// result represents the result data that can be queried
		//ResultReport:
		//	"report" name=ID (":" title=STRING)? "[" "target" target= // system instance or other EObject
		//	[ecore::EObject|URIID] ("description" decription=STRING)? ("heading" heading=STRING content+=ResultContributor*)?
		//	("results" resultData+=ResultData+)? ("issues" issues+=ReportIssue*)? "]";
		@Override public ParserRule getRule() { return rule; }

		//"report" name=ID (":" title=STRING)? "[" "target" target= // system instance or other EObject
		//[ecore::EObject|URIID] ("description" decription=STRING)? ("heading" heading=STRING content+=ResultContributor*)?
		//("results" resultData+=ResultData+)? ("issues" issues+=ReportIssue*)? "]"
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

		//"target"
		public Keyword getTargetKeyword_4() { return cTargetKeyword_4; }

		//target= // system instance or other EObject
		//[ecore::EObject|URIID]
		public Assignment getTargetAssignment_5() { return cTargetAssignment_5; }

		//// system instance or other EObject
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

		//("heading" heading=STRING content+=ResultContributor*)?
		public Group getGroup_7() { return cGroup_7; }

		//"heading"
		public Keyword getHeadingKeyword_7_0() { return cHeadingKeyword_7_0; }

		//heading=STRING
		public Assignment getHeadingAssignment_7_1() { return cHeadingAssignment_7_1; }

		//STRING
		public RuleCall getHeadingSTRINGTerminalRuleCall_7_1_0() { return cHeadingSTRINGTerminalRuleCall_7_1_0; }

		//content+=ResultContributor*
		public Assignment getContentAssignment_7_2() { return cContentAssignment_7_2; }

		//ResultContributor
		public RuleCall getContentResultContributorParserRuleCall_7_2_0() { return cContentResultContributorParserRuleCall_7_2_0; }

		//("results" resultData+=ResultData+)?
		public Group getGroup_8() { return cGroup_8; }

		//"results"
		public Keyword getResultsKeyword_8_0() { return cResultsKeyword_8_0; }

		//resultData+=ResultData+
		public Assignment getResultDataAssignment_8_1() { return cResultDataAssignment_8_1; }

		//ResultData
		public RuleCall getResultDataResultDataParserRuleCall_8_1_0() { return cResultDataResultDataParserRuleCall_8_1_0; }

		//("issues" issues+=ReportIssue*)?
		public Group getGroup_9() { return cGroup_9; }

		//"issues"
		public Keyword getIssuesKeyword_9_0() { return cIssuesKeyword_9_0; }

		//issues+=ReportIssue*
		public Assignment getIssuesAssignment_9_1() { return cIssuesAssignment_9_1; }

		//ReportIssue
		public RuleCall getIssuesReportIssueParserRuleCall_9_1_0() { return cIssuesReportIssueParserRuleCall_9_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_10() { return cRightSquareBracketKeyword_10; }
	}

	public class IssuesReportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IssuesReport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIssuesKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Assignment cIssuesAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cIssuesReportIssueParserRuleCall_7_0 = (RuleCall)cIssuesAssignment_7.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//IssuesReport:
		//	"issues" name=ID (":" title=STRING)? "[" "target" target= // system instance or other EObject
		//	[ecore::EObject|URIID] ("description" decription=STRING)? issues+=ReportIssue* "]";
		@Override public ParserRule getRule() { return rule; }

		//"issues" name=ID (":" title=STRING)? "[" "target" target= // system instance or other EObject
		//[ecore::EObject|URIID] ("description" decription=STRING)? issues+=ReportIssue* "]"
		public Group getGroup() { return cGroup; }

		//"issues"
		public Keyword getIssuesKeyword_0() { return cIssuesKeyword_0; }

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

		//target= // system instance or other EObject
		//[ecore::EObject|URIID]
		public Assignment getTargetAssignment_5() { return cTargetAssignment_5; }

		//// system instance or other EObject
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

		//issues+=ReportIssue*
		public Assignment getIssuesAssignment_7() { return cIssuesAssignment_7; }

		//ReportIssue
		public RuleCall getIssuesReportIssueParserRuleCall_7_0() { return cIssuesReportIssueParserRuleCall_7_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_8() { return cRightSquareBracketKeyword_8; }
	}

	public class ResultIssueHolderElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ResultIssueHolder");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cResultReportsParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cResultContributorParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ResultIssueHolder:
		//	ResultReports | ResultContributor;
		@Override public ParserRule getRule() { return rule; }

		//ResultReports | ResultContributor
		public Alternatives getAlternatives() { return cAlternatives; }

		//ResultReports
		public RuleCall getResultReportsParserRuleCall_0() { return cResultReportsParserRuleCall_0; }

		//ResultContributor
		public RuleCall getResultContributorParserRuleCall_1() { return cResultContributorParserRuleCall_1; }
	}

	public class ResultContributorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ResultContributor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContributorKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cContributorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cContributorEObjectCrossReference_1_0 = (CrossReference)cContributorAssignment_1.eContents().get(0);
		private final RuleCall cContributorEObjectURIIDParserRuleCall_1_0_1 = (RuleCall)cContributorEObjectCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cDataKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cCellAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCellSTRINGTerminalRuleCall_4_0 = (RuleCall)cCellAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cIssuesKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cIssuesAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cIssuesReportIssueParserRuleCall_5_1_0 = (RuleCall)cIssuesAssignment_5_1.eContents().get(0);
		private final Assignment cSubcontributorAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cSubcontributorResultContributorParserRuleCall_6_0 = (RuleCall)cSubcontributorAssignment_6.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//// one row to represent a contributor to the result calculation.
		//// this structure can be nested
		//// each contributor can have issues reported
		//// user may define a subclass of this to add analysis specific data representations
		//ResultContributor:
		//	"contributor" contributor= // instance model element or declarative model element
		//	[ecore::EObject|URIID] "[" "data" cell+=STRING+ ("issues" issues+=ReportIssue*)? subcontributor+=ResultContributor*
		//	"]";
		@Override public ParserRule getRule() { return rule; }

		//"contributor" contributor= // instance model element or declarative model element
		//[ecore::EObject|URIID] "[" "data" cell+=STRING+ ("issues" issues+=ReportIssue*)? subcontributor+=ResultContributor* "]"
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

		//"["
		public Keyword getLeftSquareBracketKeyword_2() { return cLeftSquareBracketKeyword_2; }

		//"data"
		public Keyword getDataKeyword_3() { return cDataKeyword_3; }

		//cell+=STRING+
		public Assignment getCellAssignment_4() { return cCellAssignment_4; }

		//STRING
		public RuleCall getCellSTRINGTerminalRuleCall_4_0() { return cCellSTRINGTerminalRuleCall_4_0; }

		//("issues" issues+=ReportIssue*)?
		public Group getGroup_5() { return cGroup_5; }

		//"issues"
		public Keyword getIssuesKeyword_5_0() { return cIssuesKeyword_5_0; }

		//issues+=ReportIssue*
		public Assignment getIssuesAssignment_5_1() { return cIssuesAssignment_5_1; }

		//ReportIssue
		public RuleCall getIssuesReportIssueParserRuleCall_5_1_0() { return cIssuesReportIssueParserRuleCall_5_1_0; }

		//subcontributor+=ResultContributor*
		public Assignment getSubcontributorAssignment_6() { return cSubcontributorAssignment_6; }

		//ResultContributor
		public RuleCall getSubcontributorResultContributorParserRuleCall_6_0() { return cSubcontributorResultContributorParserRuleCall_6_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_7() { return cRightSquareBracketKeyword_7; }
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
		@Override public ParserRule getRule() { return rule; }

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
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//// default implementation of result data
		//// a set of name value pairs with the values expressed as strings
		//// user can create a subclass of this to provide a specialized representation
		//ResultData:
		//	name=ID "=" value=STRING;
		@Override public ParserRule getRule() { return rule; }

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
		@Override public ParserRule getRule() { return rule; }

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
		private final EnumLiteralDeclaration cINFOEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cINFOInfoKeyword_2_0 = (Keyword)cINFOEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cSUCCESSEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cSUCCESSSuccessKeyword_3_0 = (Keyword)cSUCCESSEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cFAILEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cFAILFailKeyword_4_0 = (Keyword)cFAILEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cUNKNOWNEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cUNKNOWNUnknownKeyword_5_0 = (Keyword)cUNKNOWNEnumLiteralDeclaration_5.eContents().get(0);
		
		//enum ReportIssueType:
		//	ERROR="error" | WARNING="warning" | INFO="info" | SUCCESS="success" | FAIL="fail" | UNKNOWN="unknown";
		public EnumRule getRule() { return rule; }

		//ERROR="error" | WARNING="warning" | INFO="info" | SUCCESS="success" | FAIL="fail" | UNKNOWN="unknown"
		public Alternatives getAlternatives() { return cAlternatives; }

		//ERROR="error"
		public EnumLiteralDeclaration getERROREnumLiteralDeclaration_0() { return cERROREnumLiteralDeclaration_0; }

		//"error"
		public Keyword getERRORErrorKeyword_0_0() { return cERRORErrorKeyword_0_0; }

		//WARNING="warning"
		public EnumLiteralDeclaration getWARNINGEnumLiteralDeclaration_1() { return cWARNINGEnumLiteralDeclaration_1; }

		//"warning"
		public Keyword getWARNINGWarningKeyword_1_0() { return cWARNINGWarningKeyword_1_0; }

		//INFO="info"
		public EnumLiteralDeclaration getINFOEnumLiteralDeclaration_2() { return cINFOEnumLiteralDeclaration_2; }

		//"info"
		public Keyword getINFOInfoKeyword_2_0() { return cINFOInfoKeyword_2_0; }

		//SUCCESS="success"
		public EnumLiteralDeclaration getSUCCESSEnumLiteralDeclaration_3() { return cSUCCESSEnumLiteralDeclaration_3; }

		//"success"
		public Keyword getSUCCESSSuccessKeyword_3_0() { return cSUCCESSSuccessKeyword_3_0; }

		//FAIL="fail"
		public EnumLiteralDeclaration getFAILEnumLiteralDeclaration_4() { return cFAILEnumLiteralDeclaration_4; }

		//"fail"
		public Keyword getFAILFailKeyword_4_0() { return cFAILFailKeyword_4_0; }

		//UNKNOWN="unknown"
		public EnumLiteralDeclaration getUNKNOWNEnumLiteralDeclaration_5() { return cUNKNOWNEnumLiteralDeclaration_5; }

		//"unknown"
		public Keyword getUNKNOWNUnknownKeyword_5_0() { return cUNKNOWNUnknownKeyword_5_0; }
	}
	
	private final ResultReportsElements pResultReports;
	private final ResultReportCollectionElements pResultReportCollection;
	private final ResultReportElements pResultReport;
	private final IssuesReportElements pIssuesReport;
	private final ResultIssueHolderElements pResultIssueHolder;
	private final ResultContributorElements pResultContributor;
	private final ReportIssueElements pReportIssue;
	private final ResultDataElements pResultData;
	private final ReportIssueTypeElements unknownRuleReportIssueType;
	private final URIIDElements pURIID;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ResultsGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pResultReports = new ResultReportsElements();
		this.pResultReportCollection = new ResultReportCollectionElements();
		this.pResultReport = new ResultReportElements();
		this.pIssuesReport = new IssuesReportElements();
		this.pResultIssueHolder = new ResultIssueHolderElements();
		this.pResultContributor = new ResultContributorElements();
		this.pReportIssue = new ReportIssueElements();
		this.pResultData = new ResultDataElements();
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
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ResultReports:
	//	ResultReport | ResultReportCollection | IssuesReport;
	public ResultReportsElements getResultReportsAccess() {
		return pResultReports;
	}
	
	public ParserRule getResultReportsRule() {
		return getResultReportsAccess().getRule();
	}

	//// Collection of reports for an instance model (root), e.g., for collection of end to end flows
	//ResultReportCollection:
	//	"reports" name=ID (":" title=STRING)? "[" "target" target= // system instance or other EObject
	//	[ecore::EObject|URIID] ("description" decription=STRING)? content+=ResultReport* ("issues" issues+=ReportIssue*)? "]";
	public ResultReportCollectionElements getResultReportCollectionAccess() {
		return pResultReportCollection;
	}
	
	public ParserRule getResultReportCollectionRule() {
		return getResultReportCollectionAccess().getRule();
	}

	//// one report of an analysis for one item in the instance model.
	//// it may be a report per SOM or per end to end flow
	//// result represents the result data that can be queried
	//ResultReport:
	//	"report" name=ID (":" title=STRING)? "[" "target" target= // system instance or other EObject
	//	[ecore::EObject|URIID] ("description" decription=STRING)? ("heading" heading=STRING content+=ResultContributor*)?
	//	("results" resultData+=ResultData+)? ("issues" issues+=ReportIssue*)? "]";
	public ResultReportElements getResultReportAccess() {
		return pResultReport;
	}
	
	public ParserRule getResultReportRule() {
		return getResultReportAccess().getRule();
	}

	//IssuesReport:
	//	"issues" name=ID (":" title=STRING)? "[" "target" target= // system instance or other EObject
	//	[ecore::EObject|URIID] ("description" decription=STRING)? issues+=ReportIssue* "]";
	public IssuesReportElements getIssuesReportAccess() {
		return pIssuesReport;
	}
	
	public ParserRule getIssuesReportRule() {
		return getIssuesReportAccess().getRule();
	}

	//ResultIssueHolder:
	//	ResultReports | ResultContributor;
	public ResultIssueHolderElements getResultIssueHolderAccess() {
		return pResultIssueHolder;
	}
	
	public ParserRule getResultIssueHolderRule() {
		return getResultIssueHolderAccess().getRule();
	}

	//// one row to represent a contributor to the result calculation.
	//// this structure can be nested
	//// each contributor can have issues reported
	//// user may define a subclass of this to add analysis specific data representations
	//ResultContributor:
	//	"contributor" contributor= // instance model element or declarative model element
	//	[ecore::EObject|URIID] "[" "data" cell+=STRING+ ("issues" issues+=ReportIssue*)? subcontributor+=ResultContributor*
	//	"]";
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

	//// default implementation of result data
	//// a set of name value pairs with the values expressed as strings
	//// user can create a subclass of this to provide a specialized representation
	//ResultData:
	//	name=ID "=" value=STRING;
	public ResultDataElements getResultDataAccess() {
		return pResultData;
	}
	
	public ParserRule getResultDataRule() {
		return getResultDataAccess().getRule();
	}

	//enum ReportIssueType:
	//	ERROR="error" | WARNING="warning" | INFO="info" | SUCCESS="success" | FAIL="fail" | UNKNOWN="unknown";
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
