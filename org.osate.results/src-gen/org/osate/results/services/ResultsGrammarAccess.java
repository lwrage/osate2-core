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

import org.osate.alisa.common.services.CommonGrammarAccess;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class ResultsGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ResultReportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.results.Results.ResultReport");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cResultDataReportParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cResultReportCollectionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cIssuesReportParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//ResultReport:
		//	ResultDataReport | ResultReportCollection | IssuesReport;
		@Override public ParserRule getRule() { return rule; }

		//ResultDataReport | ResultReportCollection | IssuesReport
		public Alternatives getAlternatives() { return cAlternatives; }

		//ResultDataReport
		public RuleCall getResultDataReportParserRuleCall_0() { return cResultDataReportParserRuleCall_0; }

		//ResultReportCollection
		public RuleCall getResultReportCollectionParserRuleCall_1() { return cResultReportCollectionParserRuleCall_1; }

		//IssuesReport
		public RuleCall getIssuesReportParserRuleCall_2() { return cIssuesReportParserRuleCall_2; }
	}

	public class ResultReportCollectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.results.Results.ResultReportCollection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReportsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTitleAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTitleSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cTitleAssignment_2_1.eContents().get(0);
		private final Keyword cForKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTargetAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cTargetEObjectCrossReference_4_0 = (CrossReference)cTargetAssignment_4.eContents().get(0);
		private final RuleCall cTargetEObjectURIIDParserRuleCall_4_0_1 = (RuleCall)cTargetEObjectCrossReference_4_0.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cDescriptionKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cDescriptionAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_6_1_0 = (RuleCall)cDescriptionAssignment_6_1.eContents().get(0);
		private final Assignment cContentAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cContentResultReportParserRuleCall_7_0 = (RuleCall)cContentAssignment_7.eContents().get(0);
		private final Assignment cIssuesAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cIssuesResultIssueParserRuleCall_8_0 = (RuleCall)cIssuesAssignment_8.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//// Collection of reports for an instance model (root), e.g., for collection of end to end flows
		//ResultReportCollection:
		//	'reports' name=ID (':' title=STRING)?
		//	'for' target=[ecore::EObject|URIID] // system instance or other EObject
		//	'[' ('description' description=STRING)?
		//	content+=ResultReport*
		//	issues+=ResultIssue*
		//	']';
		@Override public ParserRule getRule() { return rule; }

		//'reports' name=ID (':' title=STRING)? 'for' target=[ecore::EObject|URIID] // system instance or other EObject
		//'[' ('description' description=STRING)? content+=ResultReport* issues+=ResultIssue* ']'
		public Group getGroup() { return cGroup; }

		//'reports'
		public Keyword getReportsKeyword_0() { return cReportsKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//(':' title=STRING)?
		public Group getGroup_2() { return cGroup_2; }

		//':'
		public Keyword getColonKeyword_2_0() { return cColonKeyword_2_0; }

		//title=STRING
		public Assignment getTitleAssignment_2_1() { return cTitleAssignment_2_1; }

		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_2_1_0() { return cTitleSTRINGTerminalRuleCall_2_1_0; }

		//'for'
		public Keyword getForKeyword_3() { return cForKeyword_3; }

		//target=[ecore::EObject|URIID]
		public Assignment getTargetAssignment_4() { return cTargetAssignment_4; }

		//[ecore::EObject|URIID]
		public CrossReference getTargetEObjectCrossReference_4_0() { return cTargetEObjectCrossReference_4_0; }

		//URIID
		public RuleCall getTargetEObjectURIIDParserRuleCall_4_0_1() { return cTargetEObjectURIIDParserRuleCall_4_0_1; }

		//// system instance or other EObject
		//'['
		public Keyword getLeftSquareBracketKeyword_5() { return cLeftSquareBracketKeyword_5; }

		//('description' description=STRING)?
		public Group getGroup_6() { return cGroup_6; }

		//'description'
		public Keyword getDescriptionKeyword_6_0() { return cDescriptionKeyword_6_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_6_1() { return cDescriptionAssignment_6_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_6_1_0() { return cDescriptionSTRINGTerminalRuleCall_6_1_0; }

		//content+=ResultReport*
		public Assignment getContentAssignment_7() { return cContentAssignment_7; }

		//ResultReport
		public RuleCall getContentResultReportParserRuleCall_7_0() { return cContentResultReportParserRuleCall_7_0; }

		//issues+=ResultIssue*
		public Assignment getIssuesAssignment_8() { return cIssuesAssignment_8; }

		//ResultIssue
		public RuleCall getIssuesResultIssueParserRuleCall_8_0() { return cIssuesResultIssueParserRuleCall_8_0; }

		//']'
		public Keyword getRightSquareBracketKeyword_9() { return cRightSquareBracketKeyword_9; }
	}

	public class ResultDataReportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.results.Results.ResultDataReport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTitleAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTitleSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cTitleAssignment_2_1.eContents().get(0);
		private final Keyword cForKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTargetAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cTargetEObjectCrossReference_4_0 = (CrossReference)cTargetAssignment_4.eContents().get(0);
		private final RuleCall cTargetEObjectURIIDParserRuleCall_4_0_1 = (RuleCall)cTargetEObjectCrossReference_4_0.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cDescriptionKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cDescriptionAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_6_1_0 = (RuleCall)cDescriptionAssignment_6_1.eContents().get(0);
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
		private final Assignment cIssuesAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cIssuesResultIssueParserRuleCall_9_0 = (RuleCall)cIssuesAssignment_9.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//// one report of an analysis for one item in the instance model.
		//// it may be a report per SOM or per end to end flow
		//// result represents the result data that can be queried
		//ResultDataReport:
		//	'report' name=ID (':' title=STRING)?
		//	'for' target=[ecore::EObject|URIID] // system instance or other EObject
		//	'[' ('description' description=STRING)? ('heading' heading=STRING
		//	content+=ResultContributor*)? ('results' resultData+=ResultData+)?
		//	issues+=ResultIssue*
		//	']';
		@Override public ParserRule getRule() { return rule; }

		//'report' name=ID (':' title=STRING)? 'for' target=[ecore::EObject|URIID] // system instance or other EObject
		//'[' ('description' description=STRING)? ('heading' heading=STRING content+=ResultContributor*)? ('results'
		//resultData+=ResultData+)? issues+=ResultIssue* ']'
		public Group getGroup() { return cGroup; }

		//'report'
		public Keyword getReportKeyword_0() { return cReportKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//(':' title=STRING)?
		public Group getGroup_2() { return cGroup_2; }

		//':'
		public Keyword getColonKeyword_2_0() { return cColonKeyword_2_0; }

		//title=STRING
		public Assignment getTitleAssignment_2_1() { return cTitleAssignment_2_1; }

		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_2_1_0() { return cTitleSTRINGTerminalRuleCall_2_1_0; }

		//'for'
		public Keyword getForKeyword_3() { return cForKeyword_3; }

		//target=[ecore::EObject|URIID]
		public Assignment getTargetAssignment_4() { return cTargetAssignment_4; }

		//[ecore::EObject|URIID]
		public CrossReference getTargetEObjectCrossReference_4_0() { return cTargetEObjectCrossReference_4_0; }

		//URIID
		public RuleCall getTargetEObjectURIIDParserRuleCall_4_0_1() { return cTargetEObjectURIIDParserRuleCall_4_0_1; }

		//// system instance or other EObject
		//'['
		public Keyword getLeftSquareBracketKeyword_5() { return cLeftSquareBracketKeyword_5; }

		//('description' description=STRING)?
		public Group getGroup_6() { return cGroup_6; }

		//'description'
		public Keyword getDescriptionKeyword_6_0() { return cDescriptionKeyword_6_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_6_1() { return cDescriptionAssignment_6_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_6_1_0() { return cDescriptionSTRINGTerminalRuleCall_6_1_0; }

		//('heading' heading=STRING content+=ResultContributor*)?
		public Group getGroup_7() { return cGroup_7; }

		//'heading'
		public Keyword getHeadingKeyword_7_0() { return cHeadingKeyword_7_0; }

		//heading=STRING
		public Assignment getHeadingAssignment_7_1() { return cHeadingAssignment_7_1; }

		//STRING
		public RuleCall getHeadingSTRINGTerminalRuleCall_7_1_0() { return cHeadingSTRINGTerminalRuleCall_7_1_0; }

		//content+=ResultContributor*
		public Assignment getContentAssignment_7_2() { return cContentAssignment_7_2; }

		//ResultContributor
		public RuleCall getContentResultContributorParserRuleCall_7_2_0() { return cContentResultContributorParserRuleCall_7_2_0; }

		//('results' resultData+=ResultData+)?
		public Group getGroup_8() { return cGroup_8; }

		//'results'
		public Keyword getResultsKeyword_8_0() { return cResultsKeyword_8_0; }

		//resultData+=ResultData+
		public Assignment getResultDataAssignment_8_1() { return cResultDataAssignment_8_1; }

		//ResultData
		public RuleCall getResultDataResultDataParserRuleCall_8_1_0() { return cResultDataResultDataParserRuleCall_8_1_0; }

		//issues+=ResultIssue*
		public Assignment getIssuesAssignment_9() { return cIssuesAssignment_9; }

		//ResultIssue
		public RuleCall getIssuesResultIssueParserRuleCall_9_0() { return cIssuesResultIssueParserRuleCall_9_0; }

		//']'
		public Keyword getRightSquareBracketKeyword_10() { return cRightSquareBracketKeyword_10; }
	}

	public class ResultContributorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.results.Results.ResultContributor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContributorKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTargetAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTargetEObjectCrossReference_1_0 = (CrossReference)cTargetAssignment_1.eContents().get(0);
		private final RuleCall cTargetEObjectURIIDParserRuleCall_1_0_1 = (RuleCall)cTargetEObjectCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cResultsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cResultDataAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cResultDataResultDataParserRuleCall_3_1_0 = (RuleCall)cResultDataAssignment_3_1.eContents().get(0);
		private final Assignment cIssuesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIssuesResultIssueParserRuleCall_4_0 = (RuleCall)cIssuesAssignment_4.eContents().get(0);
		private final Assignment cSubcontributorAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSubcontributorResultContributorParserRuleCall_5_0 = (RuleCall)cSubcontributorAssignment_5.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//// one row to represent a contributor to the result calculation.
		//// this structure can be nested
		//// each contributor can have issues reported
		//// user may define a subclass of this to add analysis specific data representations
		//ResultContributor:
		//	'contributor' target=[ecore::EObject|URIID] // instance model element or declarative model element
		//	'[' ('results' resultData+=ResultData+)?
		//	issues+=ResultIssue*
		//	subcontributor+=ResultContributor*
		//	']';
		@Override public ParserRule getRule() { return rule; }

		//'contributor' target=[ecore::EObject|URIID] // instance model element or declarative model element
		//'[' ('results' resultData+=ResultData+)? issues+=ResultIssue* subcontributor+=ResultContributor* ']'
		public Group getGroup() { return cGroup; }

		//'contributor'
		public Keyword getContributorKeyword_0() { return cContributorKeyword_0; }

		//target=[ecore::EObject|URIID]
		public Assignment getTargetAssignment_1() { return cTargetAssignment_1; }

		//[ecore::EObject|URIID]
		public CrossReference getTargetEObjectCrossReference_1_0() { return cTargetEObjectCrossReference_1_0; }

		//URIID
		public RuleCall getTargetEObjectURIIDParserRuleCall_1_0_1() { return cTargetEObjectURIIDParserRuleCall_1_0_1; }

		//// instance model element or declarative model element
		//'['
		public Keyword getLeftSquareBracketKeyword_2() { return cLeftSquareBracketKeyword_2; }

		//('results' resultData+=ResultData+)?
		public Group getGroup_3() { return cGroup_3; }

		//'results'
		public Keyword getResultsKeyword_3_0() { return cResultsKeyword_3_0; }

		//resultData+=ResultData+
		public Assignment getResultDataAssignment_3_1() { return cResultDataAssignment_3_1; }

		//ResultData
		public RuleCall getResultDataResultDataParserRuleCall_3_1_0() { return cResultDataResultDataParserRuleCall_3_1_0; }

		//issues+=ResultIssue*
		public Assignment getIssuesAssignment_4() { return cIssuesAssignment_4; }

		//ResultIssue
		public RuleCall getIssuesResultIssueParserRuleCall_4_0() { return cIssuesResultIssueParserRuleCall_4_0; }

		//subcontributor+=ResultContributor*
		public Assignment getSubcontributorAssignment_5() { return cSubcontributorAssignment_5; }

		//ResultContributor
		public RuleCall getSubcontributorResultContributorParserRuleCall_5_0() { return cSubcontributorResultContributorParserRuleCall_5_0; }

		//']'
		public Keyword getRightSquareBracketKeyword_6() { return cRightSquareBracketKeyword_6; }
	}

	public class ResultDataElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.results.Results.ResultData");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueRLiteralParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//// default implementation of result data
		//// a set of name value pairs with the values expressed as strings
		//// user can create a subclass of this to provide a specialized representation
		//ResultData:
		//	name=ID '=' value=RLiteral;
		@Override public ParserRule getRule() { return rule; }

		//name=ID '=' value=RLiteral
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//value=RLiteral
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//RLiteral
		public RuleCall getValueRLiteralParserRuleCall_2_0() { return cValueRLiteralParserRuleCall_2_0; }
	}

	public class IssuesReportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.results.Results.IssuesReport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIssuesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cForKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTargetAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cTargetEObjectCrossReference_2_1_0 = (CrossReference)cTargetAssignment_2_1.eContents().get(0);
		private final RuleCall cTargetEObjectURIIDParserRuleCall_2_1_0_1 = (RuleCall)cTargetEObjectCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLeftSquareBracketKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cDescriptionKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cDescriptionAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_3_1_1_0 = (RuleCall)cDescriptionAssignment_3_1_1.eContents().get(0);
		private final Assignment cIssuesAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cIssuesResultIssueParserRuleCall_3_2_0 = (RuleCall)cIssuesAssignment_3_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		
		//IssuesReport:
		//	'issues' name=ID ('for' target=[ecore::EObject|URIID])? ('[' ('description' description=STRING)?
		//	issues+=ResultIssue* ']')?;
		@Override public ParserRule getRule() { return rule; }

		//'issues' name=ID ('for' target=[ecore::EObject|URIID])? ('[' ('description' description=STRING)? issues+=ResultIssue*
		//']')?
		public Group getGroup() { return cGroup; }

		//'issues'
		public Keyword getIssuesKeyword_0() { return cIssuesKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//('for' target=[ecore::EObject|URIID])?
		public Group getGroup_2() { return cGroup_2; }

		//'for'
		public Keyword getForKeyword_2_0() { return cForKeyword_2_0; }

		//target=[ecore::EObject|URIID]
		public Assignment getTargetAssignment_2_1() { return cTargetAssignment_2_1; }

		//[ecore::EObject|URIID]
		public CrossReference getTargetEObjectCrossReference_2_1_0() { return cTargetEObjectCrossReference_2_1_0; }

		//URIID
		public RuleCall getTargetEObjectURIIDParserRuleCall_2_1_0_1() { return cTargetEObjectURIIDParserRuleCall_2_1_0_1; }

		//('[' ('description' description=STRING)? issues+=ResultIssue* ']')?
		public Group getGroup_3() { return cGroup_3; }

		//'['
		public Keyword getLeftSquareBracketKeyword_3_0() { return cLeftSquareBracketKeyword_3_0; }

		//('description' description=STRING)?
		public Group getGroup_3_1() { return cGroup_3_1; }

		//'description'
		public Keyword getDescriptionKeyword_3_1_0() { return cDescriptionKeyword_3_1_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_3_1_1() { return cDescriptionAssignment_3_1_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_3_1_1_0() { return cDescriptionSTRINGTerminalRuleCall_3_1_1_0; }

		//issues+=ResultIssue*
		public Assignment getIssuesAssignment_3_2() { return cIssuesAssignment_3_2; }

		//ResultIssue
		public RuleCall getIssuesResultIssueParserRuleCall_3_2_0() { return cIssuesResultIssueParserRuleCall_3_2_0; }

		//']'
		public Keyword getRightSquareBracketKeyword_3_3() { return cRightSquareBracketKeyword_3_3; }
	}

	public class RLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.results.Results.RLiteral");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cRBooleanLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRRealTermParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cRIntegerTermParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cRStringTermParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//RLiteral aadl2::PropertyExpression:
		//	RBooleanLiteral | RRealTerm | RIntegerTerm | RStringTerm;
		@Override public ParserRule getRule() { return rule; }

		//RBooleanLiteral | RRealTerm | RIntegerTerm | RStringTerm
		public Alternatives getAlternatives() { return cAlternatives; }

		//RBooleanLiteral
		public RuleCall getRBooleanLiteralParserRuleCall_0() { return cRBooleanLiteralParserRuleCall_0; }

		//RRealTerm
		public RuleCall getRRealTermParserRuleCall_1() { return cRRealTermParserRuleCall_1; }

		//RIntegerTerm
		public RuleCall getRIntegerTermParserRuleCall_2() { return cRIntegerTermParserRuleCall_2; }

		//RStringTerm
		public RuleCall getRStringTermParserRuleCall_3() { return cRStringTermParserRuleCall_3; }
	}

	public class RIntegerTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.results.Results.RIntegerTerm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cValueAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cValueRSignedIntParserRuleCall_0_0 = (RuleCall)cValueAssignment_0.eContents().get(0);
		private final Assignment cUnitAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cUnitUnitLiteralCrossReference_1_0 = (CrossReference)cUnitAssignment_1.eContents().get(0);
		private final RuleCall cUnitUnitLiteralIDTerminalRuleCall_1_0_1 = (RuleCall)cUnitUnitLiteralCrossReference_1_0.eContents().get(1);
		
		//RIntegerTerm aadl2::IntegerLiteral:
		//	value=RSignedInt unit=[aadl2::UnitLiteral]?;
		@Override public ParserRule getRule() { return rule; }

		//value=RSignedInt unit=[aadl2::UnitLiteral]?
		public Group getGroup() { return cGroup; }

		//value=RSignedInt
		public Assignment getValueAssignment_0() { return cValueAssignment_0; }

		//RSignedInt
		public RuleCall getValueRSignedIntParserRuleCall_0_0() { return cValueRSignedIntParserRuleCall_0_0; }

		//unit=[aadl2::UnitLiteral]?
		public Assignment getUnitAssignment_1() { return cUnitAssignment_1; }

		//[aadl2::UnitLiteral]
		public CrossReference getUnitUnitLiteralCrossReference_1_0() { return cUnitUnitLiteralCrossReference_1_0; }

		//ID
		public RuleCall getUnitUnitLiteralIDTerminalRuleCall_1_0_1() { return cUnitUnitLiteralIDTerminalRuleCall_1_0_1; }
	}

	public class RSignedIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.results.Results.RSignedInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Keyword cPlusSignKeyword_0_0 = (Keyword)cAlternatives_0.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_0_1 = (Keyword)cAlternatives_0.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//RSignedInt aadl2::Integer:
		//	('+' | '-')? INT;
		@Override public ParserRule getRule() { return rule; }

		//('+' | '-')? INT
		public Group getGroup() { return cGroup; }

		//('+' | '-')?
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//'+'
		public Keyword getPlusSignKeyword_0_0() { return cPlusSignKeyword_0_0; }

		//'-'
		public Keyword getHyphenMinusKeyword_0_1() { return cHyphenMinusKeyword_0_1; }

		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}

	public class RRealTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.results.Results.RRealTerm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cValueAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cValueRSignedRealParserRuleCall_0_0 = (RuleCall)cValueAssignment_0.eContents().get(0);
		private final Assignment cUnitAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cUnitUnitLiteralCrossReference_1_0 = (CrossReference)cUnitAssignment_1.eContents().get(0);
		private final RuleCall cUnitUnitLiteralIDTerminalRuleCall_1_0_1 = (RuleCall)cUnitUnitLiteralCrossReference_1_0.eContents().get(1);
		
		//RRealTerm aadl2::RealLiteral:
		//	value=RSignedReal unit=[aadl2::UnitLiteral]?;
		@Override public ParserRule getRule() { return rule; }

		//value=RSignedReal unit=[aadl2::UnitLiteral]?
		public Group getGroup() { return cGroup; }

		//value=RSignedReal
		public Assignment getValueAssignment_0() { return cValueAssignment_0; }

		//RSignedReal
		public RuleCall getValueRSignedRealParserRuleCall_0_0() { return cValueRSignedRealParserRuleCall_0_0; }

		//unit=[aadl2::UnitLiteral]?
		public Assignment getUnitAssignment_1() { return cUnitAssignment_1; }

		//[aadl2::UnitLiteral]
		public CrossReference getUnitUnitLiteralCrossReference_1_0() { return cUnitUnitLiteralCrossReference_1_0; }

		//ID
		public RuleCall getUnitUnitLiteralIDTerminalRuleCall_1_0_1() { return cUnitUnitLiteralIDTerminalRuleCall_1_0_1; }
	}

	public class RSignedRealElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.results.Results.RSignedReal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Keyword cPlusSignKeyword_0_0 = (Keyword)cAlternatives_0.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_0_1 = (Keyword)cAlternatives_0.eContents().get(1);
		private final RuleCall cREAL_LITTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//RSignedReal aadl2::Real:
		//	('+' | '-')? REAL_LIT;
		@Override public ParserRule getRule() { return rule; }

		//('+' | '-')? REAL_LIT
		public Group getGroup() { return cGroup; }

		//('+' | '-')?
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//'+'
		public Keyword getPlusSignKeyword_0_0() { return cPlusSignKeyword_0_0; }

		//'-'
		public Keyword getHyphenMinusKeyword_0_1() { return cHyphenMinusKeyword_0_1; }

		//REAL_LIT
		public RuleCall getREAL_LITTerminalRuleCall_1() { return cREAL_LITTerminalRuleCall_1; }
	}

	public class RBooleanLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.results.Results.RBooleanLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBooleanLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final Keyword cValueTrueKeyword_1_0_0 = (Keyword)cValueAssignment_1_0.eContents().get(0);
		private final Keyword cFalseKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		
		//RBooleanLiteral aadl2::PropertyExpression:
		//	{aadl2::BooleanLiteral} (value?='true' | 'false');
		@Override public ParserRule getRule() { return rule; }

		//{aadl2::BooleanLiteral} (value?='true' | 'false')
		public Group getGroup() { return cGroup; }

		//{aadl2::BooleanLiteral}
		public Action getBooleanLiteralAction_0() { return cBooleanLiteralAction_0; }

		//value?='true' | 'false'
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//value?='true'
		public Assignment getValueAssignment_1_0() { return cValueAssignment_1_0; }

		//'true'
		public Keyword getValueTrueKeyword_1_0_0() { return cValueTrueKeyword_1_0_0; }

		//'false'
		public Keyword getFalseKeyword_1_1() { return cFalseKeyword_1_1; }
	}

	public class RStringTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.results.Results.RStringTerm");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueNoQuoteStringParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//RStringTerm aadl2::StringLiteral:
		//	value=NoQuoteString;
		@Override public ParserRule getRule() { return rule; }

		//value=NoQuoteString
		public Assignment getValueAssignment() { return cValueAssignment; }

		//NoQuoteString
		public RuleCall getValueNoQuoteStringParserRuleCall_0() { return cValueNoQuoteStringParserRuleCall_0; }
	}

	public class NoQuoteStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.osate.results.Results.NoQuoteString");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//NoQuoteString:
		//	STRING;
		@Override public ParserRule getRule() { return rule; }

		//// remove quotes from string in ValueConverter
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	
	
	private final ResultReportElements pResultReport;
	private final ResultReportCollectionElements pResultReportCollection;
	private final ResultDataReportElements pResultDataReport;
	private final ResultContributorElements pResultContributor;
	private final ResultDataElements pResultData;
	private final IssuesReportElements pIssuesReport;
	private final RLiteralElements pRLiteral;
	private final RIntegerTermElements pRIntegerTerm;
	private final RSignedIntElements pRSignedInt;
	private final RRealTermElements pRRealTerm;
	private final RSignedRealElements pRSignedReal;
	private final RBooleanLiteralElements pRBooleanLiteral;
	private final RStringTermElements pRStringTerm;
	private final NoQuoteStringElements pNoQuoteString;
	
	private final Grammar grammar;

	private final CommonGrammarAccess gaCommon;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ResultsGrammarAccess(GrammarProvider grammarProvider,
		CommonGrammarAccess gaCommon,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaCommon = gaCommon;
		this.gaTerminals = gaTerminals;
		this.pResultReport = new ResultReportElements();
		this.pResultReportCollection = new ResultReportCollectionElements();
		this.pResultDataReport = new ResultDataReportElements();
		this.pResultContributor = new ResultContributorElements();
		this.pResultData = new ResultDataElements();
		this.pIssuesReport = new IssuesReportElements();
		this.pRLiteral = new RLiteralElements();
		this.pRIntegerTerm = new RIntegerTermElements();
		this.pRSignedInt = new RSignedIntElements();
		this.pRRealTerm = new RRealTermElements();
		this.pRSignedReal = new RSignedRealElements();
		this.pRBooleanLiteral = new RBooleanLiteralElements();
		this.pRStringTerm = new RStringTermElements();
		this.pNoQuoteString = new NoQuoteStringElements();
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
	

	public CommonGrammarAccess getCommonGrammarAccess() {
		return gaCommon;
	}

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ResultReport:
	//	ResultDataReport | ResultReportCollection | IssuesReport;
	public ResultReportElements getResultReportAccess() {
		return pResultReport;
	}
	
	public ParserRule getResultReportRule() {
		return getResultReportAccess().getRule();
	}

	//// Collection of reports for an instance model (root), e.g., for collection of end to end flows
	//ResultReportCollection:
	//	'reports' name=ID (':' title=STRING)?
	//	'for' target=[ecore::EObject|URIID] // system instance or other EObject
	//	'[' ('description' description=STRING)?
	//	content+=ResultReport*
	//	issues+=ResultIssue*
	//	']';
	public ResultReportCollectionElements getResultReportCollectionAccess() {
		return pResultReportCollection;
	}
	
	public ParserRule getResultReportCollectionRule() {
		return getResultReportCollectionAccess().getRule();
	}

	//// one report of an analysis for one item in the instance model.
	//// it may be a report per SOM or per end to end flow
	//// result represents the result data that can be queried
	//ResultDataReport:
	//	'report' name=ID (':' title=STRING)?
	//	'for' target=[ecore::EObject|URIID] // system instance or other EObject
	//	'[' ('description' description=STRING)? ('heading' heading=STRING
	//	content+=ResultContributor*)? ('results' resultData+=ResultData+)?
	//	issues+=ResultIssue*
	//	']';
	public ResultDataReportElements getResultDataReportAccess() {
		return pResultDataReport;
	}
	
	public ParserRule getResultDataReportRule() {
		return getResultDataReportAccess().getRule();
	}

	//// one row to represent a contributor to the result calculation.
	//// this structure can be nested
	//// each contributor can have issues reported
	//// user may define a subclass of this to add analysis specific data representations
	//ResultContributor:
	//	'contributor' target=[ecore::EObject|URIID] // instance model element or declarative model element
	//	'[' ('results' resultData+=ResultData+)?
	//	issues+=ResultIssue*
	//	subcontributor+=ResultContributor*
	//	']';
	public ResultContributorElements getResultContributorAccess() {
		return pResultContributor;
	}
	
	public ParserRule getResultContributorRule() {
		return getResultContributorAccess().getRule();
	}

	//// default implementation of result data
	//// a set of name value pairs with the values expressed as strings
	//// user can create a subclass of this to provide a specialized representation
	//ResultData:
	//	name=ID '=' value=RLiteral;
	public ResultDataElements getResultDataAccess() {
		return pResultData;
	}
	
	public ParserRule getResultDataRule() {
		return getResultDataAccess().getRule();
	}

	//IssuesReport:
	//	'issues' name=ID ('for' target=[ecore::EObject|URIID])? ('[' ('description' description=STRING)?
	//	issues+=ResultIssue* ']')?;
	public IssuesReportElements getIssuesReportAccess() {
		return pIssuesReport;
	}
	
	public ParserRule getIssuesReportRule() {
		return getIssuesReportAccess().getRule();
	}

	//RLiteral aadl2::PropertyExpression:
	//	RBooleanLiteral | RRealTerm | RIntegerTerm | RStringTerm;
	public RLiteralElements getRLiteralAccess() {
		return pRLiteral;
	}
	
	public ParserRule getRLiteralRule() {
		return getRLiteralAccess().getRule();
	}

	//RIntegerTerm aadl2::IntegerLiteral:
	//	value=RSignedInt unit=[aadl2::UnitLiteral]?;
	public RIntegerTermElements getRIntegerTermAccess() {
		return pRIntegerTerm;
	}
	
	public ParserRule getRIntegerTermRule() {
		return getRIntegerTermAccess().getRule();
	}

	//RSignedInt aadl2::Integer:
	//	('+' | '-')? INT;
	public RSignedIntElements getRSignedIntAccess() {
		return pRSignedInt;
	}
	
	public ParserRule getRSignedIntRule() {
		return getRSignedIntAccess().getRule();
	}

	//RRealTerm aadl2::RealLiteral:
	//	value=RSignedReal unit=[aadl2::UnitLiteral]?;
	public RRealTermElements getRRealTermAccess() {
		return pRRealTerm;
	}
	
	public ParserRule getRRealTermRule() {
		return getRRealTermAccess().getRule();
	}

	//RSignedReal aadl2::Real:
	//	('+' | '-')? REAL_LIT;
	public RSignedRealElements getRSignedRealAccess() {
		return pRSignedReal;
	}
	
	public ParserRule getRSignedRealRule() {
		return getRSignedRealAccess().getRule();
	}

	//RBooleanLiteral aadl2::PropertyExpression:
	//	{aadl2::BooleanLiteral} (value?='true' | 'false');
	public RBooleanLiteralElements getRBooleanLiteralAccess() {
		return pRBooleanLiteral;
	}
	
	public ParserRule getRBooleanLiteralRule() {
		return getRBooleanLiteralAccess().getRule();
	}

	//RStringTerm aadl2::StringLiteral:
	//	value=NoQuoteString;
	public RStringTermElements getRStringTermAccess() {
		return pRStringTerm;
	}
	
	public ParserRule getRStringTermRule() {
		return getRStringTermAccess().getRule();
	}

	//NoQuoteString:
	//	STRING;
	public NoQuoteStringElements getNoQuoteStringAccess() {
		return pNoQuoteString;
	}
	
	public ParserRule getNoQuoteStringRule() {
		return getNoQuoteStringAccess().getRule();
	}

	//Description:
	//	'description' description+=DescriptionElement+;
	public CommonGrammarAccess.DescriptionElements getDescriptionAccess() {
		return gaCommon.getDescriptionAccess();
	}
	
	public ParserRule getDescriptionRule() {
		return getDescriptionAccess().getRule();
	}

	//DescriptionElement:
	//	text=STRING | => thisTarget?='this' | => image=ImageReference | showValue=ShowValue;
	public CommonGrammarAccess.DescriptionElementElements getDescriptionElementAccess() {
		return gaCommon.getDescriptionElementAccess();
	}
	
	public ParserRule getDescriptionElementRule() {
		return getDescriptionElementAccess().getRule();
	}

	//Rationale:
	//	'rationale' text=STRING;
	public CommonGrammarAccess.RationaleElements getRationaleAccess() {
		return gaCommon.getRationaleAccess();
	}
	
	public ParserRule getRationaleRule() {
		return getRationaleAccess().getRule();
	}

	//Uncertainty:
	//	'uncertainty'
	//	'[' (('volatility' volatility=INT)?
	//	& ('precedence' precedence=INT)?
	//	& ('impact' impact=INT)?)
	//	']';
	public CommonGrammarAccess.UncertaintyElements getUncertaintyAccess() {
		return gaCommon.getUncertaintyAccess();
	}
	
	public ParserRule getUncertaintyRule() {
		return getUncertaintyAccess().getRule();
	}

	//// This is similar to diagnostics
	//ResultIssue:
	//	issueType=ResultIssueType
	//	message=STRING ('target' target=[ecore::EObject|super::NoQuoteString])? ('exception' exceptionType=STRING)?
	//	('diagnosticId' diagnosticId=STRING)? ('[' issues+=ResultIssue* ']')?;
	public CommonGrammarAccess.ResultIssueElements getResultIssueAccess() {
		return gaCommon.getResultIssueAccess();
	}
	
	public ParserRule getResultIssueRule() {
		return getResultIssueAccess().getRule();
	}

	//enum ResultIssueType:
	//	TBD='tbd' | ERROR='error' | WARNING='warning' | INFO='info' | SUCCESS='success' | FAIL='fail';
	public CommonGrammarAccess.ResultIssueTypeElements getResultIssueTypeAccess() {
		return gaCommon.getResultIssueTypeAccess();
	}
	
	public EnumRule getResultIssueTypeRule() {
		return getResultIssueTypeAccess().getRule();
	}

	//TypeRef aadl2::PropertyType:
	//	{aadl2::AadlBoolean} 'boolean'
	//	| {aadl2::AadlInteger} 'integer' ('units' referencedUnitsType=[aadl2::UnitsType|AADLPROPERTYREFERENCE])?
	//	| {aadl2::AadlReal} 'real' ('units' referencedUnitsType=[aadl2::UnitsType|AADLPROPERTYREFERENCE])?
	//	| {aadl2::AadlString} 'string'
	//	| {ModelRef} 'model' 'element'
	//	| {TypeRef} ref=[aadl2::PropertyType|AADLPROPERTYREFERENCE];
	public CommonGrammarAccess.TypeRefElements getTypeRefAccess() {
		return gaCommon.getTypeRefAccess();
	}
	
	public ParserRule getTypeRefRule() {
		return getTypeRefAccess().getRule();
	}

	//PropertyRef aadl2::PropertyType:
	//	{PropertyRef} ref=[aadl2::Property|AADLPROPERTYREFERENCE];
	public CommonGrammarAccess.PropertyRefElements getPropertyRefAccess() {
		return gaCommon.getPropertyRefAccess();
	}
	
	public ParserRule getPropertyRefRule() {
		return getPropertyRefAccess().getRule();
	}

	//ValDeclaration AVariableDeclaration:
	//	{ValDeclaration} 'val' name=ID (':' (type=TypeRef | 'typeof' type=PropertyRef | range?='[' (type=TypeRef | 'typeof'
	//	type=PropertyRef) ']'))? '=' value=AExpression;
	public CommonGrammarAccess.ValDeclarationElements getValDeclarationAccess() {
		return gaCommon.getValDeclarationAccess();
	}
	
	public ParserRule getValDeclarationRule() {
		return getValDeclarationAccess().getRule();
	}

	//ComputeDeclaration AVariableDeclaration:
	//	{ComputeDeclaration}
	//	'compute' name=ID ':' (type=TypeRef | 'typeof' type=PropertyRef | range?='[' (type=TypeRef | 'typeof'
	//	type=PropertyRef) ']');
	public CommonGrammarAccess.ComputeDeclarationElements getComputeDeclarationAccess() {
		return gaCommon.getComputeDeclarationAccess();
	}
	
	public ParserRule getComputeDeclarationRule() {
		return getComputeDeclarationAccess().getRule();
	}

	//// Reference to property, property constant, or model element.
	//AModelOrPropertyReference AExpression:
	//	AModelReference (=> ({APropertyReference.modelElementReference=current} '#')
	//	property=[aadl2::AbstractNamedValue|AADLPROPERTYREFERENCE])?
	//	| APropertyReference;
	public CommonGrammarAccess.AModelOrPropertyReferenceElements getAModelOrPropertyReferenceAccess() {
		return gaCommon.getAModelOrPropertyReferenceAccess();
	}
	
	public ParserRule getAModelOrPropertyReferenceRule() {
		return getAModelOrPropertyReferenceAccess().getRule();
	}

	//AModelReference:
	//	modelElement=[aadl2::NamedElement|ThisKeyword] ({AModelReference.prev=current} '.'
	//	modelElement=[aadl2::NamedElement])*;
	public CommonGrammarAccess.AModelReferenceElements getAModelReferenceAccess() {
		return gaCommon.getAModelReferenceAccess();
	}
	
	public ParserRule getAModelReferenceRule() {
		return getAModelReferenceAccess().getRule();
	}

	//APropertyReference:
	//	{APropertyReference} '#' property=[aadl2::AbstractNamedValue|AADLPROPERTYREFERENCE];
	public CommonGrammarAccess.APropertyReferenceElements getAPropertyReferenceAccess() {
		return gaCommon.getAPropertyReferenceAccess();
	}
	
	public ParserRule getAPropertyReferenceRule() {
		return getAPropertyReferenceAccess().getRule();
	}

	//AVariableReference AExpression:
	//	{AVariableReference} variable=[AVariableDeclaration];
	public CommonGrammarAccess.AVariableReferenceElements getAVariableReferenceAccess() {
		return gaCommon.getAVariableReferenceAccess();
	}
	
	public ParserRule getAVariableReferenceRule() {
		return getAVariableReferenceAccess().getRule();
	}

	//ShowValue AUnitExpression:
	//	expression=AVariableReference ((convert?='%' | drop?='in') unit=[aadl2::UnitLiteral])?;
	public CommonGrammarAccess.ShowValueElements getShowValueAccess() {
		return gaCommon.getShowValueAccess();
	}
	
	public ParserRule getShowValueRule() {
		return getShowValueAccess().getRule();
	}

	//ImageReference:
	//	'img' imgfile=IMGREF;
	public CommonGrammarAccess.ImageReferenceElements getImageReferenceAccess() {
		return gaCommon.getImageReferenceAccess();
	}
	
	public ParserRule getImageReferenceRule() {
		return getImageReferenceAccess().getRule();
	}

	//IMGREF:
	//	(ID '/')* ID '.' ID;
	public CommonGrammarAccess.IMGREFElements getIMGREFAccess() {
		return gaCommon.getIMGREFAccess();
	}
	
	public ParserRule getIMGREFRule() {
		return getIMGREFAccess().getRule();
	}

	//enum Operation:
	//	OR='or' | ALT_OR='||'
	//	| AND='and' | ALT_AND='&&'
	//	| EQ='==' | NEQ='!='
	//	| GEQ='>=' | LEQ='<=' | GT='>' | LT='<' | IN='><'
	//	| PLUS='+' | MINUS='-'
	//	| MULT='*' | DIV='/' | INTDIV='div' | MOD='mod'
	//	| NOT='not';
	public CommonGrammarAccess.OperationElements getOperationAccess() {
		return gaCommon.getOperationAccess();
	}
	
	public EnumRule getOperationRule() {
		return getOperationAccess().getRule();
	}

	//AExpression aadl2::PropertyExpression:
	//	AOrExpression;
	public CommonGrammarAccess.AExpressionElements getAExpressionAccess() {
		return gaCommon.getAExpressionAccess();
	}
	
	public ParserRule getAExpressionRule() {
		return getAExpressionAccess().getRule();
	}

	//AOrExpression aadl2::PropertyExpression:
	//	AAndExpression (=> ({ABinaryOperation.left=current} operator=OpOr) right=AAndExpression)*;
	public CommonGrammarAccess.AOrExpressionElements getAOrExpressionAccess() {
		return gaCommon.getAOrExpressionAccess();
	}
	
	public ParserRule getAOrExpressionRule() {
		return getAOrExpressionAccess().getRule();
	}

	//OpOr Operation:
	//	'or' | '||';
	public CommonGrammarAccess.OpOrElements getOpOrAccess() {
		return gaCommon.getOpOrAccess();
	}
	
	public ParserRule getOpOrRule() {
		return getOpOrAccess().getRule();
	}

	//AAndExpression aadl2::PropertyExpression:
	//	AEqualityExpression (=> ({ABinaryOperation.left=current} operator=OpAnd) right=AEqualityExpression)*;
	public CommonGrammarAccess.AAndExpressionElements getAAndExpressionAccess() {
		return gaCommon.getAAndExpressionAccess();
	}
	
	public ParserRule getAAndExpressionRule() {
		return getAAndExpressionAccess().getRule();
	}

	//OpAnd Operation:
	//	'and' | '&&';
	public CommonGrammarAccess.OpAndElements getOpAndAccess() {
		return gaCommon.getOpAndAccess();
	}
	
	public ParserRule getOpAndRule() {
		return getOpAndAccess().getRule();
	}

	//AEqualityExpression aadl2::PropertyExpression:
	//	ARelationalExpression (=> ({ABinaryOperation.left=current} operator=OpEquality) right=ARelationalExpression)*;
	public CommonGrammarAccess.AEqualityExpressionElements getAEqualityExpressionAccess() {
		return gaCommon.getAEqualityExpressionAccess();
	}
	
	public ParserRule getAEqualityExpressionRule() {
		return getAEqualityExpressionAccess().getRule();
	}

	//OpEquality Operation:
	//	'==' | '!=';
	public CommonGrammarAccess.OpEqualityElements getOpEqualityAccess() {
		return gaCommon.getOpEqualityAccess();
	}
	
	public ParserRule getOpEqualityRule() {
		return getOpEqualityAccess().getRule();
	}

	//ARelationalExpression aadl2::PropertyExpression:
	//	AAdditiveExpression (=> ({ABinaryOperation.left=current} operator=OpCompare) right=AAdditiveExpression)*;
	public CommonGrammarAccess.ARelationalExpressionElements getARelationalExpressionAccess() {
		return gaCommon.getARelationalExpressionAccess();
	}
	
	public ParserRule getARelationalExpressionRule() {
		return getARelationalExpressionAccess().getRule();
	}

	//OpCompare Operation:
	//	'>=' | '<=' | '>' | '<' | '><';
	public CommonGrammarAccess.OpCompareElements getOpCompareAccess() {
		return gaCommon.getOpCompareAccess();
	}
	
	public ParserRule getOpCompareRule() {
		return getOpCompareAccess().getRule();
	}

	////AOtherOperatorExpression returns aadl2::PropertyExpression:
	////	AAdditiveExpression (=>({ABinaryOperation.leftOperand=current} feature=OpOther)
	////	rightOperand=AAdditiveExpression)*;
	////
	////OpOther:
	////	  '->' 
	////	| '..<'
	////	| '>' '..'
	////	| '..'
	////	| '=>' 
	////	| '>' (=>('>' '>') | '>') 
	////	| '<' (=>('<' '<') | '<' | '=>')
	////	| '<>'
	////	| '?:';
	//AAdditiveExpression aadl2::PropertyExpression:
	//	AMultiplicativeExpression (=> ({ABinaryOperation.left=current} operator=OpAdd) right=AMultiplicativeExpression)*;
	public CommonGrammarAccess.AAdditiveExpressionElements getAAdditiveExpressionAccess() {
		return gaCommon.getAAdditiveExpressionAccess();
	}
	
	public ParserRule getAAdditiveExpressionRule() {
		return getAAdditiveExpressionAccess().getRule();
	}

	//OpAdd Operation:
	//	'+' | '-';
	public CommonGrammarAccess.OpAddElements getOpAddAccess() {
		return gaCommon.getOpAddAccess();
	}
	
	public ParserRule getOpAddRule() {
		return getOpAddAccess().getRule();
	}

	//AMultiplicativeExpression aadl2::PropertyExpression:
	//	AUnaryOperation (=> ({ABinaryOperation.left=current} operator=OpMulti) right=AUnaryOperation)*;
	public CommonGrammarAccess.AMultiplicativeExpressionElements getAMultiplicativeExpressionAccess() {
		return gaCommon.getAMultiplicativeExpressionAccess();
	}
	
	public ParserRule getAMultiplicativeExpressionRule() {
		return getAMultiplicativeExpressionAccess().getRule();
	}

	//OpMulti Operation:
	//	'*' | '/' | 'div' | 'mod';
	public CommonGrammarAccess.OpMultiElements getOpMultiAccess() {
		return gaCommon.getOpMultiAccess();
	}
	
	public ParserRule getOpMultiRule() {
		return getOpMultiAccess().getRule();
	}

	//AUnaryOperation aadl2::PropertyExpression:
	//	{AUnaryOperation} => operator=OpUnary operand=AUnaryOperation | AUnitExpression;
	public CommonGrammarAccess.AUnaryOperationElements getAUnaryOperationAccess() {
		return gaCommon.getAUnaryOperationAccess();
	}
	
	public ParserRule getAUnaryOperationRule() {
		return getAUnaryOperationAccess().getRule();
	}

	//OpUnary Operation:
	//	"not" | "-" | "+";
	public CommonGrammarAccess.OpUnaryElements getOpUnaryAccess() {
		return gaCommon.getOpUnaryAccess();
	}
	
	public ParserRule getOpUnaryRule() {
		return getOpUnaryAccess().getRule();
	}

	//AUnitExpression aadl2::PropertyExpression:
	//	APrimaryExpression ({AUnitExpression.expression=current} (convert?='%' | drop?='in')? unit=[aadl2::UnitLiteral])?;
	public CommonGrammarAccess.AUnitExpressionElements getAUnitExpressionAccess() {
		return gaCommon.getAUnitExpressionAccess();
	}
	
	public ParserRule getAUnitExpressionRule() {
		return getAUnitExpressionAccess().getRule();
	}

	//APrimaryExpression aadl2::PropertyExpression:
	//	ALiteral | AVariableReference | AModelOrPropertyReference | AFunctionCall | ARangeExpression | AIfExpression
	//	| AParenthesizedExpression;
	public CommonGrammarAccess.APrimaryExpressionElements getAPrimaryExpressionAccess() {
		return gaCommon.getAPrimaryExpressionAccess();
	}
	
	public ParserRule getAPrimaryExpressionRule() {
		return getAPrimaryExpressionAccess().getRule();
	}

	//AFunctionCall aadl2::PropertyExpression:
	//	{AFunctionCall} function=QualifiedName '(' (arguments+=AExpression (',' arguments+=AExpression)*)? ')';
	public CommonGrammarAccess.AFunctionCallElements getAFunctionCallAccess() {
		return gaCommon.getAFunctionCallAccess();
	}
	
	public ParserRule getAFunctionCallRule() {
		return getAFunctionCallAccess().getRule();
	}

	//ARangeExpression aadl2::PropertyExpression:
	//	{ARange} '[' minimum=AExpression '..' maximum=AExpression (=> 'delta' delta=AExpression)? ']';
	public CommonGrammarAccess.ARangeExpressionElements getARangeExpressionAccess() {
		return gaCommon.getARangeExpressionAccess();
	}
	
	public ParserRule getARangeExpressionRule() {
		return getARangeExpressionAccess().getRule();
	}

	//AIfExpression aadl2::PropertyExpression:
	//	{AConditional} 'if' if=AExpression 'then' then=AExpression ('else' else=AExpression)? 'endif';
	public CommonGrammarAccess.AIfExpressionElements getAIfExpressionAccess() {
		return gaCommon.getAIfExpressionAccess();
	}
	
	public ParserRule getAIfExpressionRule() {
		return getAIfExpressionAccess().getRule();
	}

	//ALiteral aadl2::PropertyExpression:
	//	ABooleanLiteral | ARealTerm | AIntegerTerm | StringTerm;
	public CommonGrammarAccess.ALiteralElements getALiteralAccess() {
		return gaCommon.getALiteralAccess();
	}
	
	public ParserRule getALiteralRule() {
		return getALiteralAccess().getRule();
	}

	//AIntegerTerm aadl2::IntegerLiteral:
	//	value=AInt;
	public CommonGrammarAccess.AIntegerTermElements getAIntegerTermAccess() {
		return gaCommon.getAIntegerTermAccess();
	}
	
	public ParserRule getAIntegerTermRule() {
		return getAIntegerTermAccess().getRule();
	}

	//AInt aadl2::Integer:
	//	INT;
	public CommonGrammarAccess.AIntElements getAIntAccess() {
		return gaCommon.getAIntAccess();
	}
	
	public ParserRule getAIntRule() {
		return getAIntAccess().getRule();
	}

	//ARealTerm aadl2::RealLiteral:
	//	value=AReal;
	public CommonGrammarAccess.ARealTermElements getARealTermAccess() {
		return gaCommon.getARealTermAccess();
	}
	
	public ParserRule getARealTermRule() {
		return getARealTermAccess().getRule();
	}

	//AReal aadl2::Real:
	//	REAL_LIT;
	public CommonGrammarAccess.ARealElements getARealAccess() {
		return gaCommon.getARealAccess();
	}
	
	public ParserRule getARealRule() {
		return getARealAccess().getRule();
	}

	////ASetTerm returns aadl2::PropertyExpression:
	////	{ASetLiteral}  '{' (elements+=AExpression (',' elements+=AExpression )*)? '}'
	////;
	////
	////AListTerm returns aadl2::PropertyExpression:
	////	{AListTerm} '[' (elements+=AExpression (',' elements+=AExpression )*)? ']'
	////;
	//ABooleanLiteral aadl2::PropertyExpression:
	//	{aadl2::BooleanLiteral} (value?='true' | 'false');
	public CommonGrammarAccess.ABooleanLiteralElements getABooleanLiteralAccess() {
		return gaCommon.getABooleanLiteralAccess();
	}
	
	public ParserRule getABooleanLiteralRule() {
		return getABooleanLiteralAccess().getRule();
	}

	//StringTerm aadl2::StringLiteral:
	//	value=super::NoQuoteString;
	public CommonGrammarAccess.StringTermElements getStringTermAccess() {
		return gaCommon.getStringTermAccess();
	}
	
	public ParserRule getStringTermRule() {
		return getStringTermAccess().getRule();
	}

	//AParenthesizedExpression aadl2::PropertyExpression:
	//	'(' AExpression ')';
	public CommonGrammarAccess.AParenthesizedExpressionElements getAParenthesizedExpressionAccess() {
		return gaCommon.getAParenthesizedExpressionAccess();
	}
	
	public ParserRule getAParenthesizedExpressionRule() {
		return getAParenthesizedExpressionAccess().getRule();
	}

	//ComponentCategory aadl2::ComponentCategory:
	//	'abstract' | 'bus' | 'data'
	//	| 'device' | 'memory' | 'process' | 'processor' | 'subprogram'
	//	| 'subprogram' 'group' | 'system' | 'thread' 'group'
	//	| 'thread' | 'virtual' 'bus' | 'virtual' 'processor';
	public CommonGrammarAccess.ComponentCategoryElements getComponentCategoryAccess() {
		return gaCommon.getComponentCategoryAccess();
	}
	
	public ParserRule getComponentCategoryRule() {
		return getComponentCategoryAccess().getRule();
	}

	//terminal fragment EXPONENT:
	//	('e' | 'E') ('+' | '-')? DIGIT+;
	public TerminalRule getEXPONENTRule() {
		return gaCommon.getEXPONENTRule();
	} 

	//terminal fragment INT_EXPONENT:
	//	('e' | 'E') '+'? DIGIT+;
	public TerminalRule getINT_EXPONENTRule() {
		return gaCommon.getINT_EXPONENTRule();
	} 

	//terminal REAL_LIT:
	//	DIGIT+ ('_' DIGIT+)* ('.' DIGIT+ ('_' DIGIT+)* EXPONENT?);
	public TerminalRule getREAL_LITRule() {
		return gaCommon.getREAL_LITRule();
	} 

	//terminal fragment DIGIT:
	//	'0'..'9';
	public TerminalRule getDIGITRule() {
		return gaCommon.getDIGITRule();
	} 

	//terminal fragment EXTENDED_DIGIT:
	//	'0'..'9' | 'a'..'f' | 'A'..'F';
	public TerminalRule getEXTENDED_DIGITRule() {
		return gaCommon.getEXTENDED_DIGITRule();
	} 

	//terminal fragment BASED_INTEGER:
	//	EXTENDED_DIGIT ('_'? EXTENDED_DIGIT)*;
	public TerminalRule getBASED_INTEGERRule() {
		return gaCommon.getBASED_INTEGERRule();
	} 

	//// Qualified classifier reference
	//AadlClassifierReference:
	//	ID ('::' ID)+ ('.' ID)?;
	public CommonGrammarAccess.AadlClassifierReferenceElements getAadlClassifierReferenceAccess() {
		return gaCommon.getAadlClassifierReferenceAccess();
	}
	
	public ParserRule getAadlClassifierReferenceRule() {
		return getAadlClassifierReferenceAccess().getRule();
	}

	//AADLPROPERTYREFERENCE:
	//	ID ('::' ID)?;
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

	////terminal URIID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'#'|'@'|'/'|':')*;
	//QualifiedName:
	//	ID ('.' ID)*;
	public CommonGrammarAccess.QualifiedNameElements getQualifiedNameAccess() {
		return gaCommon.getQualifiedNameAccess();
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//ThisKeyword:
	//	'this';
	public CommonGrammarAccess.ThisKeywordElements getThisKeywordAccess() {
		return gaCommon.getThisKeywordAccess();
	}
	
	public ParserRule getThisKeywordRule() {
		return getThisKeywordAccess().getRule();
	}

	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
