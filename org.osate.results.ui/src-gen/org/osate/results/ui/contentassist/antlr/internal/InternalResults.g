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
grammar InternalResults;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.osate.results.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.osate.results.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.osate.results.services.ResultsGrammarAccess;

}

@parser::members {
 
 	private ResultsGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(ResultsGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleResultReports
entryRuleResultReports 
:
{ before(grammarAccess.getResultReportsRule()); }
	 ruleResultReports
{ after(grammarAccess.getResultReportsRule()); } 
	 EOF 
;

// Rule ResultReports
ruleResultReports
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getResultReportsAccess().getAlternatives()); }
(rule__ResultReports__Alternatives)
{ after(grammarAccess.getResultReportsAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleResultReportCollection
entryRuleResultReportCollection 
:
{ before(grammarAccess.getResultReportCollectionRule()); }
	 ruleResultReportCollection
{ after(grammarAccess.getResultReportCollectionRule()); } 
	 EOF 
;

// Rule ResultReportCollection
ruleResultReportCollection
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getResultReportCollectionAccess().getGroup()); }
(rule__ResultReportCollection__Group__0)
{ after(grammarAccess.getResultReportCollectionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleResultReport
entryRuleResultReport 
:
{ before(grammarAccess.getResultReportRule()); }
	 ruleResultReport
{ after(grammarAccess.getResultReportRule()); } 
	 EOF 
;

// Rule ResultReport
ruleResultReport
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getResultReportAccess().getGroup()); }
(rule__ResultReport__Group__0)
{ after(grammarAccess.getResultReportAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleIssuesReport
entryRuleIssuesReport 
:
{ before(grammarAccess.getIssuesReportRule()); }
	 ruleIssuesReport
{ after(grammarAccess.getIssuesReportRule()); } 
	 EOF 
;

// Rule IssuesReport
ruleIssuesReport
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getIssuesReportAccess().getGroup()); }
(rule__IssuesReport__Group__0)
{ after(grammarAccess.getIssuesReportAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}





// Entry rule entryRuleResultContributor
entryRuleResultContributor 
:
{ before(grammarAccess.getResultContributorRule()); }
	 ruleResultContributor
{ after(grammarAccess.getResultContributorRule()); } 
	 EOF 
;

// Rule ResultContributor
ruleResultContributor
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getResultContributorAccess().getGroup()); }
(rule__ResultContributor__Group__0)
{ after(grammarAccess.getResultContributorAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleReportIssue
entryRuleReportIssue 
:
{ before(grammarAccess.getReportIssueRule()); }
	 ruleReportIssue
{ after(grammarAccess.getReportIssueRule()); } 
	 EOF 
;

// Rule ReportIssue
ruleReportIssue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getReportIssueAccess().getGroup()); }
(rule__ReportIssue__Group__0)
{ after(grammarAccess.getReportIssueAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleResultData
entryRuleResultData 
:
{ before(grammarAccess.getResultDataRule()); }
	 ruleResultData
{ after(grammarAccess.getResultDataRule()); } 
	 EOF 
;

// Rule ResultData
ruleResultData
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getResultDataAccess().getGroup()); }
(rule__ResultData__Group__0)
{ after(grammarAccess.getResultDataAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleURIID
entryRuleURIID 
:
{ before(grammarAccess.getURIIDRule()); }
	 ruleURIID
{ after(grammarAccess.getURIIDRule()); } 
	 EOF 
;

// Rule URIID
ruleURIID
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getURIIDAccess().getSTRINGTerminalRuleCall()); }
	RULE_STRING
{ after(grammarAccess.getURIIDAccess().getSTRINGTerminalRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule ReportIssueType
ruleReportIssueType
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReportIssueTypeAccess().getAlternatives()); }
(rule__ReportIssueType__Alternatives)
{ after(grammarAccess.getReportIssueTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__ResultReports__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportsAccess().getResultReportParserRuleCall_0()); }
	ruleResultReport
{ after(grammarAccess.getResultReportsAccess().getResultReportParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getResultReportsAccess().getResultReportCollectionParserRuleCall_1()); }
	ruleResultReportCollection
{ after(grammarAccess.getResultReportsAccess().getResultReportCollectionParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getResultReportsAccess().getIssuesReportParserRuleCall_2()); }
	ruleIssuesReport
{ after(grammarAccess.getResultReportsAccess().getIssuesReportParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ReportIssueType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReportIssueTypeAccess().getERROREnumLiteralDeclaration_0()); }
(	'error' 
)
{ after(grammarAccess.getReportIssueTypeAccess().getERROREnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getReportIssueTypeAccess().getWARNINGEnumLiteralDeclaration_1()); }
(	'warning' 
)
{ after(grammarAccess.getReportIssueTypeAccess().getWARNINGEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getReportIssueTypeAccess().getINFOEnumLiteralDeclaration_2()); }
(	'info' 
)
{ after(grammarAccess.getReportIssueTypeAccess().getINFOEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getReportIssueTypeAccess().getSUCCESSEnumLiteralDeclaration_3()); }
(	'success' 
)
{ after(grammarAccess.getReportIssueTypeAccess().getSUCCESSEnumLiteralDeclaration_3()); }
)

    |(
{ before(grammarAccess.getReportIssueTypeAccess().getFAILEnumLiteralDeclaration_4()); }
(	'fail' 
)
{ after(grammarAccess.getReportIssueTypeAccess().getFAILEnumLiteralDeclaration_4()); }
)

    |(
{ before(grammarAccess.getReportIssueTypeAccess().getUNKNOWNEnumLiteralDeclaration_5()); }
(	'unknown' 
)
{ after(grammarAccess.getReportIssueTypeAccess().getUNKNOWNEnumLiteralDeclaration_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__ResultReportCollection__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReportCollection__Group__0__Impl
	rule__ResultReportCollection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getReportsKeyword_0()); }

	'reports' 

{ after(grammarAccess.getResultReportCollectionAccess().getReportsKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReportCollection__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReportCollection__Group__1__Impl
	rule__ResultReportCollection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getNameAssignment_1()); }
(rule__ResultReportCollection__NameAssignment_1)
{ after(grammarAccess.getResultReportCollectionAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReportCollection__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReportCollection__Group__2__Impl
	rule__ResultReportCollection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getGroup_2()); }
(rule__ResultReportCollection__Group_2__0)?
{ after(grammarAccess.getResultReportCollectionAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReportCollection__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReportCollection__Group__3__Impl
	rule__ResultReportCollection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getLeftSquareBracketKeyword_3()); }

	'[' 

{ after(grammarAccess.getResultReportCollectionAccess().getLeftSquareBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReportCollection__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReportCollection__Group__4__Impl
	rule__ResultReportCollection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getTargetKeyword_4()); }

	'target' 

{ after(grammarAccess.getResultReportCollectionAccess().getTargetKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReportCollection__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReportCollection__Group__5__Impl
	rule__ResultReportCollection__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getTargetAssignment_5()); }
(rule__ResultReportCollection__TargetAssignment_5)
{ after(grammarAccess.getResultReportCollectionAccess().getTargetAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReportCollection__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReportCollection__Group__6__Impl
	rule__ResultReportCollection__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getGroup_6()); }
(rule__ResultReportCollection__Group_6__0)?
{ after(grammarAccess.getResultReportCollectionAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReportCollection__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReportCollection__Group__7__Impl
	rule__ResultReportCollection__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getContentAssignment_7()); }
(rule__ResultReportCollection__ContentAssignment_7)*
{ after(grammarAccess.getResultReportCollectionAccess().getContentAssignment_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReportCollection__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReportCollection__Group__8__Impl
	rule__ResultReportCollection__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getGroup_8()); }
(rule__ResultReportCollection__Group_8__0)?
{ after(grammarAccess.getResultReportCollectionAccess().getGroup_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReportCollection__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReportCollection__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getRightSquareBracketKeyword_9()); }

	']' 

{ after(grammarAccess.getResultReportCollectionAccess().getRightSquareBracketKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}






















rule__ResultReportCollection__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReportCollection__Group_2__0__Impl
	rule__ResultReportCollection__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getColonKeyword_2_0()); }

	':' 

{ after(grammarAccess.getResultReportCollectionAccess().getColonKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReportCollection__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReportCollection__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getTitleAssignment_2_1()); }
(rule__ResultReportCollection__TitleAssignment_2_1)
{ after(grammarAccess.getResultReportCollectionAccess().getTitleAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ResultReportCollection__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReportCollection__Group_6__0__Impl
	rule__ResultReportCollection__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getDescriptionKeyword_6_0()); }

	'description' 

{ after(grammarAccess.getResultReportCollectionAccess().getDescriptionKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReportCollection__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReportCollection__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getDecriptionAssignment_6_1()); }
(rule__ResultReportCollection__DecriptionAssignment_6_1)
{ after(grammarAccess.getResultReportCollectionAccess().getDecriptionAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ResultReportCollection__Group_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReportCollection__Group_8__0__Impl
	rule__ResultReportCollection__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__Group_8__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getIssuesKeyword_8_0()); }

	'issues' 

{ after(grammarAccess.getResultReportCollectionAccess().getIssuesKeyword_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReportCollection__Group_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReportCollection__Group_8__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__Group_8__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getIssuesAssignment_8_1()); }
(rule__ResultReportCollection__IssuesAssignment_8_1)*
{ after(grammarAccess.getResultReportCollectionAccess().getIssuesAssignment_8_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ResultReport__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group__0__Impl
	rule__ResultReport__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getReportKeyword_0()); }

	'report' 

{ after(grammarAccess.getResultReportAccess().getReportKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReport__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group__1__Impl
	rule__ResultReport__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getNameAssignment_1()); }
(rule__ResultReport__NameAssignment_1)
{ after(grammarAccess.getResultReportAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReport__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group__2__Impl
	rule__ResultReport__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getGroup_2()); }
(rule__ResultReport__Group_2__0)?
{ after(grammarAccess.getResultReportAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReport__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group__3__Impl
	rule__ResultReport__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getLeftSquareBracketKeyword_3()); }

	'[' 

{ after(grammarAccess.getResultReportAccess().getLeftSquareBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReport__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group__4__Impl
	rule__ResultReport__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getTargetKeyword_4()); }

	'target' 

{ after(grammarAccess.getResultReportAccess().getTargetKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReport__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group__5__Impl
	rule__ResultReport__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getTargetAssignment_5()); }
(rule__ResultReport__TargetAssignment_5)
{ after(grammarAccess.getResultReportAccess().getTargetAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReport__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group__6__Impl
	rule__ResultReport__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getGroup_6()); }
(rule__ResultReport__Group_6__0)?
{ after(grammarAccess.getResultReportAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReport__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group__7__Impl
	rule__ResultReport__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getGroup_7()); }
(rule__ResultReport__Group_7__0)?
{ after(grammarAccess.getResultReportAccess().getGroup_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReport__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group__8__Impl
	rule__ResultReport__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getGroup_8()); }
(rule__ResultReport__Group_8__0)?
{ after(grammarAccess.getResultReportAccess().getGroup_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReport__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group__9__Impl
	rule__ResultReport__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getGroup_9()); }
(rule__ResultReport__Group_9__0)?
{ after(grammarAccess.getResultReportAccess().getGroup_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReport__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getRightSquareBracketKeyword_10()); }

	']' 

{ after(grammarAccess.getResultReportAccess().getRightSquareBracketKeyword_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}
























rule__ResultReport__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group_2__0__Impl
	rule__ResultReport__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getColonKeyword_2_0()); }

	':' 

{ after(grammarAccess.getResultReportAccess().getColonKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReport__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getTitleAssignment_2_1()); }
(rule__ResultReport__TitleAssignment_2_1)
{ after(grammarAccess.getResultReportAccess().getTitleAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ResultReport__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group_6__0__Impl
	rule__ResultReport__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getDescriptionKeyword_6_0()); }

	'description' 

{ after(grammarAccess.getResultReportAccess().getDescriptionKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReport__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getDecriptionAssignment_6_1()); }
(rule__ResultReport__DecriptionAssignment_6_1)
{ after(grammarAccess.getResultReportAccess().getDecriptionAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ResultReport__Group_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group_7__0__Impl
	rule__ResultReport__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getHeadingKeyword_7_0()); }

	'heading' 

{ after(grammarAccess.getResultReportAccess().getHeadingKeyword_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReport__Group_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group_7__1__Impl
	rule__ResultReport__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getHeadingAssignment_7_1()); }
(rule__ResultReport__HeadingAssignment_7_1)
{ after(grammarAccess.getResultReportAccess().getHeadingAssignment_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReport__Group_7__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group_7__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group_7__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getContentAssignment_7_2()); }
(rule__ResultReport__ContentAssignment_7_2)*
{ after(grammarAccess.getResultReportAccess().getContentAssignment_7_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__ResultReport__Group_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group_8__0__Impl
	rule__ResultReport__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group_8__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getResultsKeyword_8_0()); }

	'results' 

{ after(grammarAccess.getResultReportAccess().getResultsKeyword_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReport__Group_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group_8__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group_8__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getResultReportAccess().getResultDataAssignment_8_1()); }
(rule__ResultReport__ResultDataAssignment_8_1)
{ after(grammarAccess.getResultReportAccess().getResultDataAssignment_8_1()); }
)
(
{ before(grammarAccess.getResultReportAccess().getResultDataAssignment_8_1()); }
(rule__ResultReport__ResultDataAssignment_8_1)*
{ after(grammarAccess.getResultReportAccess().getResultDataAssignment_8_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ResultReport__Group_9__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group_9__0__Impl
	rule__ResultReport__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group_9__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getIssuesKeyword_9_0()); }

	'issues' 

{ after(grammarAccess.getResultReportAccess().getIssuesKeyword_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultReport__Group_9__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultReport__Group_9__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__Group_9__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getIssuesAssignment_9_1()); }
(rule__ResultReport__IssuesAssignment_9_1)*
{ after(grammarAccess.getResultReportAccess().getIssuesAssignment_9_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__IssuesReport__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IssuesReport__Group__0__Impl
	rule__IssuesReport__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IssuesReport__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIssuesReportAccess().getIssuesKeyword_0()); }

	'issues' 

{ after(grammarAccess.getIssuesReportAccess().getIssuesKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IssuesReport__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IssuesReport__Group__1__Impl
	rule__IssuesReport__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IssuesReport__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIssuesReportAccess().getNameAssignment_1()); }
(rule__IssuesReport__NameAssignment_1)
{ after(grammarAccess.getIssuesReportAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IssuesReport__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IssuesReport__Group__2__Impl
	rule__IssuesReport__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__IssuesReport__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIssuesReportAccess().getGroup_2()); }
(rule__IssuesReport__Group_2__0)?
{ after(grammarAccess.getIssuesReportAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IssuesReport__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IssuesReport__Group__3__Impl
	rule__IssuesReport__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__IssuesReport__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIssuesReportAccess().getLeftSquareBracketKeyword_3()); }

	'[' 

{ after(grammarAccess.getIssuesReportAccess().getLeftSquareBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IssuesReport__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IssuesReport__Group__4__Impl
	rule__IssuesReport__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__IssuesReport__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIssuesReportAccess().getTargetKeyword_4()); }

	'target' 

{ after(grammarAccess.getIssuesReportAccess().getTargetKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IssuesReport__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IssuesReport__Group__5__Impl
	rule__IssuesReport__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__IssuesReport__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIssuesReportAccess().getTargetAssignment_5()); }
(rule__IssuesReport__TargetAssignment_5)
{ after(grammarAccess.getIssuesReportAccess().getTargetAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IssuesReport__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IssuesReport__Group__6__Impl
	rule__IssuesReport__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__IssuesReport__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIssuesReportAccess().getGroup_6()); }
(rule__IssuesReport__Group_6__0)?
{ after(grammarAccess.getIssuesReportAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IssuesReport__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IssuesReport__Group__7__Impl
	rule__IssuesReport__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__IssuesReport__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIssuesReportAccess().getIssuesAssignment_7()); }
(rule__IssuesReport__IssuesAssignment_7)*
{ after(grammarAccess.getIssuesReportAccess().getIssuesAssignment_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IssuesReport__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IssuesReport__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IssuesReport__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIssuesReportAccess().getRightSquareBracketKeyword_8()); }

	']' 

{ after(grammarAccess.getIssuesReportAccess().getRightSquareBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__IssuesReport__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IssuesReport__Group_2__0__Impl
	rule__IssuesReport__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IssuesReport__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIssuesReportAccess().getColonKeyword_2_0()); }

	':' 

{ after(grammarAccess.getIssuesReportAccess().getColonKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IssuesReport__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IssuesReport__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IssuesReport__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIssuesReportAccess().getTitleAssignment_2_1()); }
(rule__IssuesReport__TitleAssignment_2_1)
{ after(grammarAccess.getIssuesReportAccess().getTitleAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__IssuesReport__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IssuesReport__Group_6__0__Impl
	rule__IssuesReport__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IssuesReport__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIssuesReportAccess().getDescriptionKeyword_6_0()); }

	'description' 

{ after(grammarAccess.getIssuesReportAccess().getDescriptionKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IssuesReport__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IssuesReport__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IssuesReport__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIssuesReportAccess().getDecriptionAssignment_6_1()); }
(rule__IssuesReport__DecriptionAssignment_6_1)
{ after(grammarAccess.getIssuesReportAccess().getDecriptionAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ResultContributor__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultContributor__Group__0__Impl
	rule__ResultContributor__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultContributor__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultContributorAccess().getContributorKeyword_0()); }

	'contributor' 

{ after(grammarAccess.getResultContributorAccess().getContributorKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultContributor__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultContributor__Group__1__Impl
	rule__ResultContributor__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultContributor__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultContributorAccess().getContributorAssignment_1()); }
(rule__ResultContributor__ContributorAssignment_1)
{ after(grammarAccess.getResultContributorAccess().getContributorAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultContributor__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultContributor__Group__2__Impl
	rule__ResultContributor__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultContributor__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultContributorAccess().getLeftSquareBracketKeyword_2()); }

	'[' 

{ after(grammarAccess.getResultContributorAccess().getLeftSquareBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultContributor__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultContributor__Group__3__Impl
	rule__ResultContributor__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultContributor__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultContributorAccess().getDataKeyword_3()); }

	'data' 

{ after(grammarAccess.getResultContributorAccess().getDataKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultContributor__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultContributor__Group__4__Impl
	rule__ResultContributor__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultContributor__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getResultContributorAccess().getCellAssignment_4()); }
(rule__ResultContributor__CellAssignment_4)
{ after(grammarAccess.getResultContributorAccess().getCellAssignment_4()); }
)
(
{ before(grammarAccess.getResultContributorAccess().getCellAssignment_4()); }
(rule__ResultContributor__CellAssignment_4)*
{ after(grammarAccess.getResultContributorAccess().getCellAssignment_4()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultContributor__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultContributor__Group__5__Impl
	rule__ResultContributor__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultContributor__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultContributorAccess().getGroup_5()); }
(rule__ResultContributor__Group_5__0)?
{ after(grammarAccess.getResultContributorAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultContributor__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultContributor__Group__6__Impl
	rule__ResultContributor__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultContributor__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultContributorAccess().getSubcontributorAssignment_6()); }
(rule__ResultContributor__SubcontributorAssignment_6)*
{ after(grammarAccess.getResultContributorAccess().getSubcontributorAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultContributor__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultContributor__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultContributor__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultContributorAccess().getRightSquareBracketKeyword_7()); }

	']' 

{ after(grammarAccess.getResultContributorAccess().getRightSquareBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__ResultContributor__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultContributor__Group_5__0__Impl
	rule__ResultContributor__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultContributor__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultContributorAccess().getIssuesKeyword_5_0()); }

	'issues' 

{ after(grammarAccess.getResultContributorAccess().getIssuesKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultContributor__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultContributor__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultContributor__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultContributorAccess().getIssuesAssignment_5_1()); }
(rule__ResultContributor__IssuesAssignment_5_1)*
{ after(grammarAccess.getResultContributorAccess().getIssuesAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ReportIssue__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReportIssue__Group__0__Impl
	rule__ReportIssue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReportIssue__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReportIssueAccess().getIssueTypeAssignment_0()); }
(rule__ReportIssue__IssueTypeAssignment_0)
{ after(grammarAccess.getReportIssueAccess().getIssueTypeAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ReportIssue__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReportIssue__Group__1__Impl
	rule__ReportIssue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ReportIssue__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReportIssueAccess().getTitleAssignment_1()); }
(rule__ReportIssue__TitleAssignment_1)
{ after(grammarAccess.getReportIssueAccess().getTitleAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ReportIssue__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ReportIssue__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReportIssue__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReportIssueAccess().getTargetAssignment_2()); }
(rule__ReportIssue__TargetAssignment_2)
{ after(grammarAccess.getReportIssueAccess().getTargetAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__ResultData__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultData__Group__0__Impl
	rule__ResultData__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultData__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultDataAccess().getNameAssignment_0()); }
(rule__ResultData__NameAssignment_0)
{ after(grammarAccess.getResultDataAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultData__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultData__Group__1__Impl
	rule__ResultData__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultData__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultDataAccess().getEqualsSignKeyword_1()); }

	'=' 

{ after(grammarAccess.getResultDataAccess().getEqualsSignKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ResultData__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ResultData__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ResultData__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultDataAccess().getValueAssignment_2()); }
(rule__ResultData__ValueAssignment_2)
{ after(grammarAccess.getResultDataAccess().getValueAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__ResultReportCollection__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getResultReportCollectionAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__TitleAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getTitleSTRINGTerminalRuleCall_2_1_0()); }
	RULE_STRING{ after(grammarAccess.getResultReportCollectionAccess().getTitleSTRINGTerminalRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__TargetAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getTargetEObjectCrossReference_5_0()); }
(
{ before(grammarAccess.getResultReportCollectionAccess().getTargetEObjectURIIDParserRuleCall_5_0_1()); }
	ruleURIID{ after(grammarAccess.getResultReportCollectionAccess().getTargetEObjectURIIDParserRuleCall_5_0_1()); }
)
{ after(grammarAccess.getResultReportCollectionAccess().getTargetEObjectCrossReference_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__DecriptionAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getDecriptionSTRINGTerminalRuleCall_6_1_0()); }
	RULE_STRING{ after(grammarAccess.getResultReportCollectionAccess().getDecriptionSTRINGTerminalRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__ContentAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getContentResultReportParserRuleCall_7_0()); }
	ruleResultReport{ after(grammarAccess.getResultReportCollectionAccess().getContentResultReportParserRuleCall_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReportCollection__IssuesAssignment_8_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportCollectionAccess().getIssuesReportIssueParserRuleCall_8_1_0()); }
	ruleReportIssue{ after(grammarAccess.getResultReportCollectionAccess().getIssuesReportIssueParserRuleCall_8_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getResultReportAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__TitleAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getTitleSTRINGTerminalRuleCall_2_1_0()); }
	RULE_STRING{ after(grammarAccess.getResultReportAccess().getTitleSTRINGTerminalRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__TargetAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getTargetEObjectCrossReference_5_0()); }
(
{ before(grammarAccess.getResultReportAccess().getTargetEObjectURIIDParserRuleCall_5_0_1()); }
	ruleURIID{ after(grammarAccess.getResultReportAccess().getTargetEObjectURIIDParserRuleCall_5_0_1()); }
)
{ after(grammarAccess.getResultReportAccess().getTargetEObjectCrossReference_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__DecriptionAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getDecriptionSTRINGTerminalRuleCall_6_1_0()); }
	RULE_STRING{ after(grammarAccess.getResultReportAccess().getDecriptionSTRINGTerminalRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__HeadingAssignment_7_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getHeadingSTRINGTerminalRuleCall_7_1_0()); }
	RULE_STRING{ after(grammarAccess.getResultReportAccess().getHeadingSTRINGTerminalRuleCall_7_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__ContentAssignment_7_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getContentResultContributorParserRuleCall_7_2_0()); }
	ruleResultContributor{ after(grammarAccess.getResultReportAccess().getContentResultContributorParserRuleCall_7_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__ResultDataAssignment_8_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getResultDataResultDataParserRuleCall_8_1_0()); }
	ruleResultData{ after(grammarAccess.getResultReportAccess().getResultDataResultDataParserRuleCall_8_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ResultReport__IssuesAssignment_9_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultReportAccess().getIssuesReportIssueParserRuleCall_9_1_0()); }
	ruleReportIssue{ after(grammarAccess.getResultReportAccess().getIssuesReportIssueParserRuleCall_9_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IssuesReport__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIssuesReportAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getIssuesReportAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IssuesReport__TitleAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIssuesReportAccess().getTitleSTRINGTerminalRuleCall_2_1_0()); }
	RULE_STRING{ after(grammarAccess.getIssuesReportAccess().getTitleSTRINGTerminalRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IssuesReport__TargetAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIssuesReportAccess().getTargetEObjectCrossReference_5_0()); }
(
{ before(grammarAccess.getIssuesReportAccess().getTargetEObjectURIIDParserRuleCall_5_0_1()); }
	ruleURIID{ after(grammarAccess.getIssuesReportAccess().getTargetEObjectURIIDParserRuleCall_5_0_1()); }
)
{ after(grammarAccess.getIssuesReportAccess().getTargetEObjectCrossReference_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IssuesReport__DecriptionAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIssuesReportAccess().getDecriptionSTRINGTerminalRuleCall_6_1_0()); }
	RULE_STRING{ after(grammarAccess.getIssuesReportAccess().getDecriptionSTRINGTerminalRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IssuesReport__IssuesAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIssuesReportAccess().getIssuesReportIssueParserRuleCall_7_0()); }
	ruleReportIssue{ after(grammarAccess.getIssuesReportAccess().getIssuesReportIssueParserRuleCall_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ResultContributor__ContributorAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultContributorAccess().getContributorEObjectCrossReference_1_0()); }
(
{ before(grammarAccess.getResultContributorAccess().getContributorEObjectURIIDParserRuleCall_1_0_1()); }
	ruleURIID{ after(grammarAccess.getResultContributorAccess().getContributorEObjectURIIDParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getResultContributorAccess().getContributorEObjectCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ResultContributor__CellAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultContributorAccess().getCellSTRINGTerminalRuleCall_4_0()); }
	RULE_STRING{ after(grammarAccess.getResultContributorAccess().getCellSTRINGTerminalRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ResultContributor__IssuesAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultContributorAccess().getIssuesReportIssueParserRuleCall_5_1_0()); }
	ruleReportIssue{ after(grammarAccess.getResultContributorAccess().getIssuesReportIssueParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ResultContributor__SubcontributorAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultContributorAccess().getSubcontributorResultContributorParserRuleCall_6_0()); }
	ruleResultContributor{ after(grammarAccess.getResultContributorAccess().getSubcontributorResultContributorParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ReportIssue__IssueTypeAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReportIssueAccess().getIssueTypeReportIssueTypeEnumRuleCall_0_0()); }
	ruleReportIssueType{ after(grammarAccess.getReportIssueAccess().getIssueTypeReportIssueTypeEnumRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ReportIssue__TitleAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReportIssueAccess().getTitleSTRINGTerminalRuleCall_1_0()); }
	RULE_STRING{ after(grammarAccess.getReportIssueAccess().getTitleSTRINGTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ReportIssue__TargetAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getReportIssueAccess().getTargetEObjectCrossReference_2_0()); }
(
{ before(grammarAccess.getReportIssueAccess().getTargetEObjectURIIDParserRuleCall_2_0_1()); }
	ruleURIID{ after(grammarAccess.getReportIssueAccess().getTargetEObjectURIIDParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getReportIssueAccess().getTargetEObjectCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ResultData__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultDataAccess().getNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getResultDataAccess().getNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ResultData__ValueAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getResultDataAccess().getValueSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getResultDataAccess().getValueSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


