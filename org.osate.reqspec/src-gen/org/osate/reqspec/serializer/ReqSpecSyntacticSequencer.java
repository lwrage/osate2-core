package org.osate.reqspec.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.osate.reqspec.services.ReqSpecGrammarAccess;

@SuppressWarnings("all")
public class ReqSpecSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ReqSpecGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Hazard_LeftSquareBracketKeyword_3_0_1_a;
	protected AbstractElementAlias match_Hazard_LeftSquareBracketKeyword_3_0_1_p;
	protected AbstractElementAlias match_Requirement_ConstantsKeyword_5_2_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ReqSpecGrammarAccess) access;
		match_Hazard_LeftSquareBracketKeyword_3_0_1_a = new TokenAlias(true, true, grammarAccess.getHazardAccess().getLeftSquareBracketKeyword_3_0_1());
		match_Hazard_LeftSquareBracketKeyword_3_0_1_p = new TokenAlias(true, false, grammarAccess.getHazardAccess().getLeftSquareBracketKeyword_3_0_1());
		match_Requirement_ConstantsKeyword_5_2_0_q = new TokenAlias(false, true, grammarAccess.getRequirementAccess().getConstantsKeyword_5_2_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Hazard_LeftSquareBracketKeyword_3_0_1_a.equals(syntax))
				emit_Hazard_LeftSquareBracketKeyword_3_0_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Hazard_LeftSquareBracketKeyword_3_0_1_p.equals(syntax))
				emit_Hazard_LeftSquareBracketKeyword_3_0_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Requirement_ConstantsKeyword_5_2_0_q.equals(syntax))
				emit_Requirement_ConstantsKeyword_5_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '['*
	 */
	protected void emit_Hazard_LeftSquareBracketKeyword_3_0_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '['+
	 */
	protected void emit_Hazard_LeftSquareBracketKeyword_3_0_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'constants'?
	 */
	protected void emit_Requirement_ConstantsKeyword_5_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
