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
package org.osate.categories.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.osate.categories.services.CategoriesGrammarAccess;

public class CategoriesParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private CategoriesGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.osate.categories.parser.antlr.internal.InternalCategoriesParser createParser(XtextTokenStream stream) {
		return new org.osate.categories.parser.antlr.internal.InternalCategoriesParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "CategoriesDefinitions";
	}
	
	public CategoriesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CategoriesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
