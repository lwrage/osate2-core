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
package org.osate.alisa.workbench.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.osate.alisa.workbench.services.AlisaGrammarAccess;

@SuppressWarnings("all")
public class AlisaSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AlisaGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_AParenthesizedExpression_LeftParenthesisKeyword_0_p;
	protected AbstractElementAlias match_AssurancePlan_AssureKeyword_7_1_0_q;
	protected AbstractElementAlias match_AssurancePlan_IssuesKeyword_7_4_0_q;
	protected AbstractElementAlias match_AssurancePlan___AssumeKeyword_7_3_0_SubsystemKeyword_7_3_1__q;
	protected AbstractElementAlias match_AssurancePlan___AssureKeyword_7_2_0_SubsystemKeyword_7_2_1__q;
	protected AbstractElementAlias match_AssuranceTask_CategoryKeyword_6_1_0_q;
	protected AbstractElementAlias match_AssuranceTask_IssuesKeyword_6_4_0_q;
	protected AbstractElementAlias match_AssuranceTask_PhaseKeyword_6_3_0_q;
	protected AbstractElementAlias match_AssuranceTask_QualityKeyword_6_2_0_q;
	protected AbstractElementAlias match_ResultIssue___LeftSquareBracketKeyword_5_0_RightSquareBracketKeyword_5_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AlisaGrammarAccess) access;
		match_AParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getAParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_AParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getAParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_AssurancePlan_AssureKeyword_7_1_0_q = new TokenAlias(false, true, grammarAccess.getAssurancePlanAccess().getAssureKeyword_7_1_0());
		match_AssurancePlan_IssuesKeyword_7_4_0_q = new TokenAlias(false, true, grammarAccess.getAssurancePlanAccess().getIssuesKeyword_7_4_0());
		match_AssurancePlan___AssumeKeyword_7_3_0_SubsystemKeyword_7_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAssurancePlanAccess().getAssumeKeyword_7_3_0()), new TokenAlias(false, false, grammarAccess.getAssurancePlanAccess().getSubsystemKeyword_7_3_1()));
		match_AssurancePlan___AssureKeyword_7_2_0_SubsystemKeyword_7_2_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAssurancePlanAccess().getAssureKeyword_7_2_0()), new TokenAlias(false, false, grammarAccess.getAssurancePlanAccess().getSubsystemKeyword_7_2_1()));
		match_AssuranceTask_CategoryKeyword_6_1_0_q = new TokenAlias(false, true, grammarAccess.getAssuranceTaskAccess().getCategoryKeyword_6_1_0());
		match_AssuranceTask_IssuesKeyword_6_4_0_q = new TokenAlias(false, true, grammarAccess.getAssuranceTaskAccess().getIssuesKeyword_6_4_0());
		match_AssuranceTask_PhaseKeyword_6_3_0_q = new TokenAlias(false, true, grammarAccess.getAssuranceTaskAccess().getPhaseKeyword_6_3_0());
		match_AssuranceTask_QualityKeyword_6_2_0_q = new TokenAlias(false, true, grammarAccess.getAssuranceTaskAccess().getQualityKeyword_6_2_0());
		match_ResultIssue___LeftSquareBracketKeyword_5_0_RightSquareBracketKeyword_5_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getResultIssueAccess().getLeftSquareBracketKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getResultIssueAccess().getRightSquareBracketKeyword_5_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_AParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_AParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AssurancePlan_AssureKeyword_7_1_0_q.equals(syntax))
				emit_AssurancePlan_AssureKeyword_7_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AssurancePlan_IssuesKeyword_7_4_0_q.equals(syntax))
				emit_AssurancePlan_IssuesKeyword_7_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AssurancePlan___AssumeKeyword_7_3_0_SubsystemKeyword_7_3_1__q.equals(syntax))
				emit_AssurancePlan___AssumeKeyword_7_3_0_SubsystemKeyword_7_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AssurancePlan___AssureKeyword_7_2_0_SubsystemKeyword_7_2_1__q.equals(syntax))
				emit_AssurancePlan___AssureKeyword_7_2_0_SubsystemKeyword_7_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AssuranceTask_CategoryKeyword_6_1_0_q.equals(syntax))
				emit_AssuranceTask_CategoryKeyword_6_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AssuranceTask_IssuesKeyword_6_4_0_q.equals(syntax))
				emit_AssuranceTask_IssuesKeyword_6_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AssuranceTask_PhaseKeyword_6_3_0_q.equals(syntax))
				emit_AssuranceTask_PhaseKeyword_6_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AssuranceTask_QualityKeyword_6_2_0_q.equals(syntax))
				emit_AssuranceTask_QualityKeyword_6_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ResultIssue___LeftSquareBracketKeyword_5_0_RightSquareBracketKeyword_5_2__q.equals(syntax))
				emit_ResultIssue___LeftSquareBracketKeyword_5_0_RightSquareBracketKeyword_5_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '#' '[' ']' (rule start)
	 *     (rule start) (ambiguity) '#' '[' elements+=AExpression
	 *     (rule start) (ambiguity) '@' property=[AbstractNamedValue|AADLPROPERTYREFERENCE]
	 *     (rule start) (ambiguity) 'false' (rule start)
	 *     (rule start) (ambiguity) 'null' (rule start)
	 *     (rule start) (ambiguity) 'this' (rule start)
	 *     (rule start) (ambiguity) '{' '}' (rule start)
	 *     (rule start) (ambiguity) '{' elements+=AExpression
	 *     (rule start) (ambiguity) feature=OpUnary
	 *     (rule start) (ambiguity) function=ID
	 *     (rule start) (ambiguity) value=AInt
	 *     (rule start) (ambiguity) value=AReal
	 *     (rule start) (ambiguity) value=NoQuoteString
	 *     (rule start) (ambiguity) value?='true'
	 *     (rule start) (ambiguity) variable=[AVariableDeclaration|ID]
	 *     (rule start) (ambiguity) {ABinaryOperation.leftOperand=}
	 */
	protected void emit_AParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '#' '[' ']' ')' (rule start)
	 *     (rule start) (ambiguity) '#' '[' elements+=AExpression
	 *     (rule start) (ambiguity) '@' property=[AbstractNamedValue|AADLPROPERTYREFERENCE]
	 *     (rule start) (ambiguity) 'false' ')' (rule start)
	 *     (rule start) (ambiguity) 'null' ')' (rule start)
	 *     (rule start) (ambiguity) 'this' ')' (rule start)
	 *     (rule start) (ambiguity) '{' '}' ')' (rule start)
	 *     (rule start) (ambiguity) '{' elements+=AExpression
	 *     (rule start) (ambiguity) feature=OpUnary
	 *     (rule start) (ambiguity) function=ID
	 *     (rule start) (ambiguity) value=AInt
	 *     (rule start) (ambiguity) value=AReal
	 *     (rule start) (ambiguity) value=NoQuoteString
	 *     (rule start) (ambiguity) value?='true'
	 *     (rule start) (ambiguity) variable=[AVariableDeclaration|ID]
	 *     (rule start) (ambiguity) {ABinaryOperation.leftOperand=}
	 */
	protected void emit_AParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'assure'?
	 *
	 * This ambiguous syntax occurs at:
	 *     assure+=[VerificationPlan|QualifiedName] (ambiguity) assure+=[VerificationPlan|QualifiedName]
	 */
	protected void emit_AssurancePlan_AssureKeyword_7_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'issues'?
	 *
	 * This ambiguous syntax occurs at:
	 *     issues+=STRING (ambiguity) issues+=STRING
	 */
	protected void emit_AssurancePlan_IssuesKeyword_7_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('assume' 'subsystem')?
	 *
	 * This ambiguous syntax occurs at:
	 *     assumeSubsystems+=[Subcomponent|ID] (ambiguity) assumeSubsystems+=[Subcomponent|ID]
	 */
	protected void emit_AssurancePlan___AssumeKeyword_7_3_0_SubsystemKeyword_7_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('assure' 'subsystem')?
	 *
	 * This ambiguous syntax occurs at:
	 *     assureSubsystems+=[Subcomponent|ID] (ambiguity) assureSubsystems+=[Subcomponent|ID]
	 */
	protected void emit_AssurancePlan___AssureKeyword_7_2_0_SubsystemKeyword_7_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'category'?
	 *
	 * This ambiguous syntax occurs at:
	 *     userCategory+=[UserCategory|ID] (ambiguity) userCategory+=[UserCategory|ID]
	 */
	protected void emit_AssuranceTask_CategoryKeyword_6_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'issues'?
	 *
	 * This ambiguous syntax occurs at:
	 *     issues+=STRING (ambiguity) issues+=STRING
	 */
	protected void emit_AssuranceTask_IssuesKeyword_6_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'phase'?
	 *
	 * This ambiguous syntax occurs at:
	 *     phaseCategory+=[PhaseCategory|ID] (ambiguity) phaseCategory+=[PhaseCategory|ID]
	 */
	protected void emit_AssuranceTask_PhaseKeyword_6_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'quality'?
	 *
	 * This ambiguous syntax occurs at:
	 *     qualityCategory+=[QualityCategory|ID] (ambiguity) qualityCategory+=[QualityCategory|ID]
	 */
	protected void emit_AssuranceTask_QualityKeyword_6_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     diagnosticId=STRING (ambiguity) (rule end)
	 *     exceptionType=STRING (ambiguity) (rule end)
	 *     message=STRING (ambiguity) (rule end)
	 *     target=[EObject|URIID] (ambiguity) (rule end)
	 */
	protected void emit_ResultIssue___LeftSquareBracketKeyword_5_0_RightSquareBracketKeyword_5_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
