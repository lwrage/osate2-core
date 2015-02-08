/*
* generated by Xtext
*/
package org.osate.alisa.common.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.osate.alisa.common.services.CommonGrammarAccess;

public class CommonParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private CommonGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.osate.alisa.common.parser.antlr.internal.InternalCommonParser createParser(XtextTokenStream stream) {
		return new org.osate.alisa.common.parser.antlr.internal.InternalCommonParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Description";
	}
	
	public CommonGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CommonGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
