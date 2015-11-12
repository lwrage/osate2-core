package org.osate.categories.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.osate.categories.services.CategoriesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCategoriesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Requirement", "Categories", "Component", "Selection", "Category", "Filters", "Quality", "Method", "Phase", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Category=8;
    public static final int Phase=12;
    public static final int Selection=7;
    public static final int RULE_STRING=19;
    public static final int RULE_SL_COMMENT=21;
    public static final int Filters=9;
    public static final int Quality=10;
    public static final int RightCurlyBracket=16;
    public static final int Component=6;
    public static final int EOF=-1;
    public static final int RightSquareBracket=14;
    public static final int RULE_ID=17;
    public static final int Categories=5;
    public static final int RULE_WS=22;
    public static final int LeftCurlyBracket=15;
    public static final int Method=11;
    public static final int RULE_ANY_OTHER=23;
    public static final int Requirement=4;
    public static final int RULE_INT=18;
    public static final int RULE_ML_COMMENT=20;
    public static final int LeftSquareBracket=13;

    // delegates
    // delegators


        public InternalCategoriesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCategoriesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCategoriesParser.tokenNames; }
    public String getGrammarFileName() { return "../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g"; }




    	private CategoriesGrammarAccess grammarAccess;
    	 	
    	public InternalCategoriesParser(TokenStream input, CategoriesGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "CategoriesDefinitions";	
    	} 
    	   	   	
    	@Override
    	protected CategoriesGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleCategoriesDefinitions"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:61:1: entryRuleCategoriesDefinitions returns [EObject current=null] : iv_ruleCategoriesDefinitions= ruleCategoriesDefinitions EOF ;
    public final EObject entryRuleCategoriesDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategoriesDefinitions = null;


        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:62:2: (iv_ruleCategoriesDefinitions= ruleCategoriesDefinitions EOF )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:63:2: iv_ruleCategoriesDefinitions= ruleCategoriesDefinitions EOF
            {
             newCompositeNode(grammarAccess.getCategoriesDefinitionsRule()); 
            pushFollow(FOLLOW_ruleCategoriesDefinitions_in_entryRuleCategoriesDefinitions67);
            iv_ruleCategoriesDefinitions=ruleCategoriesDefinitions();

            state._fsp--;

             current =iv_ruleCategoriesDefinitions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategoriesDefinitions77); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCategoriesDefinitions"


    // $ANTLR start "ruleCategoriesDefinitions"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:70:1: ruleCategoriesDefinitions returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_requirementcategories_1_0= ruleRequirementCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_componentcategories_2_0= ruleComponentCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_methodcategories_3_0= ruleMethodCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_selectioncategories_4_0= ruleSelectionCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_phasecategories_5_0= rulePhaseCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_qualitycategories_6_0= ruleQualityCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_categoryfilter_7_0= ruleCategoryFilters ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleCategoriesDefinitions() throws RecognitionException {
        EObject current = null;

        EObject lv_requirementcategories_1_0 = null;

        EObject lv_componentcategories_2_0 = null;

        EObject lv_methodcategories_3_0 = null;

        EObject lv_selectioncategories_4_0 = null;

        EObject lv_phasecategories_5_0 = null;

        EObject lv_qualitycategories_6_0 = null;

        EObject lv_categoryfilter_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:73:28: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_requirementcategories_1_0= ruleRequirementCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_componentcategories_2_0= ruleComponentCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_methodcategories_3_0= ruleMethodCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_selectioncategories_4_0= ruleSelectionCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_phasecategories_5_0= rulePhaseCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_qualitycategories_6_0= ruleQualityCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_categoryfilter_7_0= ruleCategoryFilters ) ) ) ) ) )* ) ) ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:74:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_requirementcategories_1_0= ruleRequirementCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_componentcategories_2_0= ruleComponentCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_methodcategories_3_0= ruleMethodCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_selectioncategories_4_0= ruleSelectionCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_phasecategories_5_0= rulePhaseCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_qualitycategories_6_0= ruleQualityCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_categoryfilter_7_0= ruleCategoryFilters ) ) ) ) ) )* ) ) )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:74:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_requirementcategories_1_0= ruleRequirementCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_componentcategories_2_0= ruleComponentCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_methodcategories_3_0= ruleMethodCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_selectioncategories_4_0= ruleSelectionCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_phasecategories_5_0= rulePhaseCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_qualitycategories_6_0= ruleQualityCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_categoryfilter_7_0= ruleCategoryFilters ) ) ) ) ) )* ) ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:76:1: ( ( ( ({...}? => ( ({...}? => ( (lv_requirementcategories_1_0= ruleRequirementCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_componentcategories_2_0= ruleComponentCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_methodcategories_3_0= ruleMethodCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_selectioncategories_4_0= ruleSelectionCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_phasecategories_5_0= rulePhaseCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_qualitycategories_6_0= ruleQualityCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_categoryfilter_7_0= ruleCategoryFilters ) ) ) ) ) )* ) )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:76:1: ( ( ( ({...}? => ( ({...}? => ( (lv_requirementcategories_1_0= ruleRequirementCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_componentcategories_2_0= ruleComponentCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_methodcategories_3_0= ruleMethodCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_selectioncategories_4_0= ruleSelectionCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_phasecategories_5_0= rulePhaseCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_qualitycategories_6_0= ruleQualityCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_categoryfilter_7_0= ruleCategoryFilters ) ) ) ) ) )* ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:77:2: ( ( ({...}? => ( ({...}? => ( (lv_requirementcategories_1_0= ruleRequirementCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_componentcategories_2_0= ruleComponentCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_methodcategories_3_0= ruleMethodCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_selectioncategories_4_0= ruleSelectionCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_phasecategories_5_0= rulePhaseCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_qualitycategories_6_0= ruleQualityCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_categoryfilter_7_0= ruleCategoryFilters ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup());
            	
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:80:2: ( ( ({...}? => ( ({...}? => ( (lv_requirementcategories_1_0= ruleRequirementCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_componentcategories_2_0= ruleComponentCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_methodcategories_3_0= ruleMethodCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_selectioncategories_4_0= ruleSelectionCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_phasecategories_5_0= rulePhaseCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_qualitycategories_6_0= ruleQualityCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_categoryfilter_7_0= ruleCategoryFilters ) ) ) ) ) )* )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:81:3: ( ({...}? => ( ({...}? => ( (lv_requirementcategories_1_0= ruleRequirementCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_componentcategories_2_0= ruleComponentCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_methodcategories_3_0= ruleMethodCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_selectioncategories_4_0= ruleSelectionCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_phasecategories_5_0= rulePhaseCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_qualitycategories_6_0= ruleQualityCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_categoryfilter_7_0= ruleCategoryFilters ) ) ) ) ) )*
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:81:3: ( ({...}? => ( ({...}? => ( (lv_requirementcategories_1_0= ruleRequirementCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_componentcategories_2_0= ruleComponentCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_methodcategories_3_0= ruleMethodCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_selectioncategories_4_0= ruleSelectionCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_phasecategories_5_0= rulePhaseCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_qualitycategories_6_0= ruleQualityCategories ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_categoryfilter_7_0= ruleCategoryFilters ) ) ) ) ) )*
            loop1:
            do {
                int alt1=8;
                int LA1_0 = input.LA(1);

                if ( LA1_0 ==Requirement && getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 ==Component && getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 ==Method && getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 2) ) {
                    alt1=3;
                }
                else if ( LA1_0 ==Selection && getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 3) ) {
                    alt1=4;
                }
                else if ( LA1_0 ==Phase && getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 4) ) {
                    alt1=5;
                }
                else if ( LA1_0 ==Quality && getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 5) ) {
                    alt1=6;
                }
                else if ( LA1_0 ==Category && getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 6) ) {
                    alt1=7;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:83:4: ({...}? => ( ({...}? => ( (lv_requirementcategories_1_0= ruleRequirementCategories ) ) ) ) )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:83:4: ({...}? => ( ({...}? => ( (lv_requirementcategories_1_0= ruleRequirementCategories ) ) ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:84:5: {...}? => ( ({...}? => ( (lv_requirementcategories_1_0= ruleRequirementCategories ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCategoriesDefinitions", "getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:84:116: ( ({...}? => ( (lv_requirementcategories_1_0= ruleRequirementCategories ) ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:85:6: ({...}? => ( (lv_requirementcategories_1_0= ruleRequirementCategories ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:88:6: ({...}? => ( (lv_requirementcategories_1_0= ruleRequirementCategories ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:88:7: {...}? => ( (lv_requirementcategories_1_0= ruleRequirementCategories ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCategoriesDefinitions", "true");
            	    }
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:88:16: ( (lv_requirementcategories_1_0= ruleRequirementCategories ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:89:1: (lv_requirementcategories_1_0= ruleRequirementCategories )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:89:1: (lv_requirementcategories_1_0= ruleRequirementCategories )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:90:3: lv_requirementcategories_1_0= ruleRequirementCategories
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCategoriesDefinitionsAccess().getRequirementcategoriesRequirementCategoriesParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequirementCategories_in_ruleCategoriesDefinitions167);
            	    lv_requirementcategories_1_0=ruleRequirementCategories();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCategoriesDefinitionsRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"requirementcategories",
            	            		lv_requirementcategories_1_0, 
            	            		"RequirementCategories");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:113:4: ({...}? => ( ({...}? => ( (lv_componentcategories_2_0= ruleComponentCategories ) ) ) ) )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:113:4: ({...}? => ( ({...}? => ( (lv_componentcategories_2_0= ruleComponentCategories ) ) ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:114:5: {...}? => ( ({...}? => ( (lv_componentcategories_2_0= ruleComponentCategories ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCategoriesDefinitions", "getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:114:116: ( ({...}? => ( (lv_componentcategories_2_0= ruleComponentCategories ) ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:115:6: ({...}? => ( (lv_componentcategories_2_0= ruleComponentCategories ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:118:6: ({...}? => ( (lv_componentcategories_2_0= ruleComponentCategories ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:118:7: {...}? => ( (lv_componentcategories_2_0= ruleComponentCategories ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCategoriesDefinitions", "true");
            	    }
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:118:16: ( (lv_componentcategories_2_0= ruleComponentCategories ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:119:1: (lv_componentcategories_2_0= ruleComponentCategories )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:119:1: (lv_componentcategories_2_0= ruleComponentCategories )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:120:3: lv_componentcategories_2_0= ruleComponentCategories
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCategoriesDefinitionsAccess().getComponentcategoriesComponentCategoriesParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponentCategories_in_ruleCategoriesDefinitions242);
            	    lv_componentcategories_2_0=ruleComponentCategories();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCategoriesDefinitionsRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"componentcategories",
            	            		lv_componentcategories_2_0, 
            	            		"ComponentCategories");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:143:4: ({...}? => ( ({...}? => ( (lv_methodcategories_3_0= ruleMethodCategories ) ) ) ) )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:143:4: ({...}? => ( ({...}? => ( (lv_methodcategories_3_0= ruleMethodCategories ) ) ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:144:5: {...}? => ( ({...}? => ( (lv_methodcategories_3_0= ruleMethodCategories ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCategoriesDefinitions", "getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:144:116: ( ({...}? => ( (lv_methodcategories_3_0= ruleMethodCategories ) ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:145:6: ({...}? => ( (lv_methodcategories_3_0= ruleMethodCategories ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:148:6: ({...}? => ( (lv_methodcategories_3_0= ruleMethodCategories ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:148:7: {...}? => ( (lv_methodcategories_3_0= ruleMethodCategories ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCategoriesDefinitions", "true");
            	    }
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:148:16: ( (lv_methodcategories_3_0= ruleMethodCategories ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:149:1: (lv_methodcategories_3_0= ruleMethodCategories )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:149:1: (lv_methodcategories_3_0= ruleMethodCategories )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:150:3: lv_methodcategories_3_0= ruleMethodCategories
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCategoriesDefinitionsAccess().getMethodcategoriesMethodCategoriesParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethodCategories_in_ruleCategoriesDefinitions317);
            	    lv_methodcategories_3_0=ruleMethodCategories();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCategoriesDefinitionsRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"methodcategories",
            	            		lv_methodcategories_3_0, 
            	            		"MethodCategories");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:173:4: ({...}? => ( ({...}? => ( (lv_selectioncategories_4_0= ruleSelectionCategories ) ) ) ) )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:173:4: ({...}? => ( ({...}? => ( (lv_selectioncategories_4_0= ruleSelectionCategories ) ) ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:174:5: {...}? => ( ({...}? => ( (lv_selectioncategories_4_0= ruleSelectionCategories ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCategoriesDefinitions", "getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 3)");
            	    }
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:174:116: ( ({...}? => ( (lv_selectioncategories_4_0= ruleSelectionCategories ) ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:175:6: ({...}? => ( (lv_selectioncategories_4_0= ruleSelectionCategories ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 3);
            	    	 				
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:178:6: ({...}? => ( (lv_selectioncategories_4_0= ruleSelectionCategories ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:178:7: {...}? => ( (lv_selectioncategories_4_0= ruleSelectionCategories ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCategoriesDefinitions", "true");
            	    }
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:178:16: ( (lv_selectioncategories_4_0= ruleSelectionCategories ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:179:1: (lv_selectioncategories_4_0= ruleSelectionCategories )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:179:1: (lv_selectioncategories_4_0= ruleSelectionCategories )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:180:3: lv_selectioncategories_4_0= ruleSelectionCategories
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCategoriesDefinitionsAccess().getSelectioncategoriesSelectionCategoriesParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSelectionCategories_in_ruleCategoriesDefinitions392);
            	    lv_selectioncategories_4_0=ruleSelectionCategories();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCategoriesDefinitionsRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"selectioncategories",
            	            		lv_selectioncategories_4_0, 
            	            		"SelectionCategories");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:203:4: ({...}? => ( ({...}? => ( (lv_phasecategories_5_0= rulePhaseCategories ) ) ) ) )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:203:4: ({...}? => ( ({...}? => ( (lv_phasecategories_5_0= rulePhaseCategories ) ) ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:204:5: {...}? => ( ({...}? => ( (lv_phasecategories_5_0= rulePhaseCategories ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleCategoriesDefinitions", "getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 4)");
            	    }
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:204:116: ( ({...}? => ( (lv_phasecategories_5_0= rulePhaseCategories ) ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:205:6: ({...}? => ( (lv_phasecategories_5_0= rulePhaseCategories ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 4);
            	    	 				
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:208:6: ({...}? => ( (lv_phasecategories_5_0= rulePhaseCategories ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:208:7: {...}? => ( (lv_phasecategories_5_0= rulePhaseCategories ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCategoriesDefinitions", "true");
            	    }
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:208:16: ( (lv_phasecategories_5_0= rulePhaseCategories ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:209:1: (lv_phasecategories_5_0= rulePhaseCategories )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:209:1: (lv_phasecategories_5_0= rulePhaseCategories )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:210:3: lv_phasecategories_5_0= rulePhaseCategories
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCategoriesDefinitionsAccess().getPhasecategoriesPhaseCategoriesParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePhaseCategories_in_ruleCategoriesDefinitions467);
            	    lv_phasecategories_5_0=rulePhaseCategories();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCategoriesDefinitionsRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"phasecategories",
            	            		lv_phasecategories_5_0, 
            	            		"PhaseCategories");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:233:4: ({...}? => ( ({...}? => ( (lv_qualitycategories_6_0= ruleQualityCategories ) ) ) ) )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:233:4: ({...}? => ( ({...}? => ( (lv_qualitycategories_6_0= ruleQualityCategories ) ) ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:234:5: {...}? => ( ({...}? => ( (lv_qualitycategories_6_0= ruleQualityCategories ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleCategoriesDefinitions", "getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 5)");
            	    }
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:234:116: ( ({...}? => ( (lv_qualitycategories_6_0= ruleQualityCategories ) ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:235:6: ({...}? => ( (lv_qualitycategories_6_0= ruleQualityCategories ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 5);
            	    	 				
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:238:6: ({...}? => ( (lv_qualitycategories_6_0= ruleQualityCategories ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:238:7: {...}? => ( (lv_qualitycategories_6_0= ruleQualityCategories ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCategoriesDefinitions", "true");
            	    }
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:238:16: ( (lv_qualitycategories_6_0= ruleQualityCategories ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:239:1: (lv_qualitycategories_6_0= ruleQualityCategories )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:239:1: (lv_qualitycategories_6_0= ruleQualityCategories )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:240:3: lv_qualitycategories_6_0= ruleQualityCategories
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCategoriesDefinitionsAccess().getQualitycategoriesQualityCategoriesParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualityCategories_in_ruleCategoriesDefinitions542);
            	    lv_qualitycategories_6_0=ruleQualityCategories();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCategoriesDefinitionsRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"qualitycategories",
            	            		lv_qualitycategories_6_0, 
            	            		"QualityCategories");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:263:4: ({...}? => ( ({...}? => ( (lv_categoryfilter_7_0= ruleCategoryFilters ) ) ) ) )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:263:4: ({...}? => ( ({...}? => ( (lv_categoryfilter_7_0= ruleCategoryFilters ) ) ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:264:5: {...}? => ( ({...}? => ( (lv_categoryfilter_7_0= ruleCategoryFilters ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleCategoriesDefinitions", "getUnorderedGroupHelper().canSelect(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 6)");
            	    }
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:264:116: ( ({...}? => ( (lv_categoryfilter_7_0= ruleCategoryFilters ) ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:265:6: ({...}? => ( (lv_categoryfilter_7_0= ruleCategoryFilters ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), 6);
            	    	 				
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:268:6: ({...}? => ( (lv_categoryfilter_7_0= ruleCategoryFilters ) ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:268:7: {...}? => ( (lv_categoryfilter_7_0= ruleCategoryFilters ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCategoriesDefinitions", "true");
            	    }
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:268:16: ( (lv_categoryfilter_7_0= ruleCategoryFilters ) )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:269:1: (lv_categoryfilter_7_0= ruleCategoryFilters )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:269:1: (lv_categoryfilter_7_0= ruleCategoryFilters )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:270:3: lv_categoryfilter_7_0= ruleCategoryFilters
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCategoriesDefinitionsAccess().getCategoryfilterCategoryFiltersParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCategoryFilters_in_ruleCategoriesDefinitions617);
            	    lv_categoryfilter_7_0=ruleCategoryFilters();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCategoriesDefinitionsRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"categoryfilter",
            	            		lv_categoryfilter_7_0, 
            	            		"CategoryFilters");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup());
            	

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategoriesDefinitions"


    // $ANTLR start "entryRuleRequirementCategories"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:308:1: entryRuleRequirementCategories returns [EObject current=null] : iv_ruleRequirementCategories= ruleRequirementCategories EOF ;
    public final EObject entryRuleRequirementCategories() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementCategories = null;


        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:309:2: (iv_ruleRequirementCategories= ruleRequirementCategories EOF )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:310:2: iv_ruleRequirementCategories= ruleRequirementCategories EOF
            {
             newCompositeNode(grammarAccess.getRequirementCategoriesRule()); 
            pushFollow(FOLLOW_ruleRequirementCategories_in_entryRuleRequirementCategories691);
            iv_ruleRequirementCategories=ruleRequirementCategories();

            state._fsp--;

             current =iv_ruleRequirementCategories; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirementCategories701); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirementCategories"


    // $ANTLR start "ruleRequirementCategories"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:317:1: ruleRequirementCategories returns [EObject current=null] : ( () otherlv_1= Requirement otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleRequirementCategory ) )+ otherlv_5= RightSquareBracket ) ;
    public final EObject ruleRequirementCategories() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_category_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:320:28: ( ( () otherlv_1= Requirement otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleRequirementCategory ) )+ otherlv_5= RightSquareBracket ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:321:1: ( () otherlv_1= Requirement otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleRequirementCategory ) )+ otherlv_5= RightSquareBracket )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:321:1: ( () otherlv_1= Requirement otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleRequirementCategory ) )+ otherlv_5= RightSquareBracket )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:321:2: () otherlv_1= Requirement otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleRequirementCategory ) )+ otherlv_5= RightSquareBracket
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:321:2: ()
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:322:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRequirementCategoriesAccess().getRequirementCategoriesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,Requirement,FOLLOW_Requirement_in_ruleRequirementCategories748); 

                	newLeafNode(otherlv_1, grammarAccess.getRequirementCategoriesAccess().getRequirementKeyword_1());
                
            otherlv_2=(Token)match(input,Categories,FOLLOW_Categories_in_ruleRequirementCategories760); 

                	newLeafNode(otherlv_2, grammarAccess.getRequirementCategoriesAccess().getCategoriesKeyword_2());
                
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleRequirementCategories772); 

                	newLeafNode(otherlv_3, grammarAccess.getRequirementCategoriesAccess().getLeftSquareBracketKeyword_3());
                
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:342:1: ( (lv_category_4_0= ruleRequirementCategory ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:343:1: (lv_category_4_0= ruleRequirementCategory )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:343:1: (lv_category_4_0= ruleRequirementCategory )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:344:3: lv_category_4_0= ruleRequirementCategory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementCategoriesAccess().getCategoryRequirementCategoryParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequirementCategory_in_ruleRequirementCategories792);
            	    lv_category_4_0=ruleRequirementCategory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRequirementCategoriesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"category",
            	            		lv_category_4_0, 
            	            		"RequirementCategory");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleRequirementCategories806); 

                	newLeafNode(otherlv_5, grammarAccess.getRequirementCategoriesAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirementCategories"


    // $ANTLR start "entryRuleMethodCategories"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:373:1: entryRuleMethodCategories returns [EObject current=null] : iv_ruleMethodCategories= ruleMethodCategories EOF ;
    public final EObject entryRuleMethodCategories() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCategories = null;


        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:374:2: (iv_ruleMethodCategories= ruleMethodCategories EOF )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:375:2: iv_ruleMethodCategories= ruleMethodCategories EOF
            {
             newCompositeNode(grammarAccess.getMethodCategoriesRule()); 
            pushFollow(FOLLOW_ruleMethodCategories_in_entryRuleMethodCategories840);
            iv_ruleMethodCategories=ruleMethodCategories();

            state._fsp--;

             current =iv_ruleMethodCategories; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodCategories850); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodCategories"


    // $ANTLR start "ruleMethodCategories"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:382:1: ruleMethodCategories returns [EObject current=null] : ( () otherlv_1= Method otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleMethodCategory ) )+ otherlv_5= RightSquareBracket ) ;
    public final EObject ruleMethodCategories() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_category_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:385:28: ( ( () otherlv_1= Method otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleMethodCategory ) )+ otherlv_5= RightSquareBracket ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:386:1: ( () otherlv_1= Method otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleMethodCategory ) )+ otherlv_5= RightSquareBracket )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:386:1: ( () otherlv_1= Method otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleMethodCategory ) )+ otherlv_5= RightSquareBracket )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:386:2: () otherlv_1= Method otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleMethodCategory ) )+ otherlv_5= RightSquareBracket
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:386:2: ()
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:387:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMethodCategoriesAccess().getMethodCategoriesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,Method,FOLLOW_Method_in_ruleMethodCategories897); 

                	newLeafNode(otherlv_1, grammarAccess.getMethodCategoriesAccess().getMethodKeyword_1());
                
            otherlv_2=(Token)match(input,Categories,FOLLOW_Categories_in_ruleMethodCategories909); 

                	newLeafNode(otherlv_2, grammarAccess.getMethodCategoriesAccess().getCategoriesKeyword_2());
                
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleMethodCategories921); 

                	newLeafNode(otherlv_3, grammarAccess.getMethodCategoriesAccess().getLeftSquareBracketKeyword_3());
                
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:407:1: ( (lv_category_4_0= ruleMethodCategory ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:408:1: (lv_category_4_0= ruleMethodCategory )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:408:1: (lv_category_4_0= ruleMethodCategory )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:409:3: lv_category_4_0= ruleMethodCategory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodCategoriesAccess().getCategoryMethodCategoryParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethodCategory_in_ruleMethodCategories941);
            	    lv_category_4_0=ruleMethodCategory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodCategoriesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"category",
            	            		lv_category_4_0, 
            	            		"MethodCategory");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleMethodCategories955); 

                	newLeafNode(otherlv_5, grammarAccess.getMethodCategoriesAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodCategories"


    // $ANTLR start "entryRuleSelectionCategories"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:438:1: entryRuleSelectionCategories returns [EObject current=null] : iv_ruleSelectionCategories= ruleSelectionCategories EOF ;
    public final EObject entryRuleSelectionCategories() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionCategories = null;


        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:439:2: (iv_ruleSelectionCategories= ruleSelectionCategories EOF )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:440:2: iv_ruleSelectionCategories= ruleSelectionCategories EOF
            {
             newCompositeNode(grammarAccess.getSelectionCategoriesRule()); 
            pushFollow(FOLLOW_ruleSelectionCategories_in_entryRuleSelectionCategories989);
            iv_ruleSelectionCategories=ruleSelectionCategories();

            state._fsp--;

             current =iv_ruleSelectionCategories; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectionCategories999); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectionCategories"


    // $ANTLR start "ruleSelectionCategories"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:447:1: ruleSelectionCategories returns [EObject current=null] : ( () otherlv_1= Selection otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleSelectionCategory ) )+ otherlv_5= RightSquareBracket ) ;
    public final EObject ruleSelectionCategories() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_category_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:450:28: ( ( () otherlv_1= Selection otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleSelectionCategory ) )+ otherlv_5= RightSquareBracket ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:451:1: ( () otherlv_1= Selection otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleSelectionCategory ) )+ otherlv_5= RightSquareBracket )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:451:1: ( () otherlv_1= Selection otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleSelectionCategory ) )+ otherlv_5= RightSquareBracket )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:451:2: () otherlv_1= Selection otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleSelectionCategory ) )+ otherlv_5= RightSquareBracket
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:451:2: ()
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:452:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSelectionCategoriesAccess().getSelectionCategoriesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,Selection,FOLLOW_Selection_in_ruleSelectionCategories1046); 

                	newLeafNode(otherlv_1, grammarAccess.getSelectionCategoriesAccess().getSelectionKeyword_1());
                
            otherlv_2=(Token)match(input,Categories,FOLLOW_Categories_in_ruleSelectionCategories1058); 

                	newLeafNode(otherlv_2, grammarAccess.getSelectionCategoriesAccess().getCategoriesKeyword_2());
                
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleSelectionCategories1070); 

                	newLeafNode(otherlv_3, grammarAccess.getSelectionCategoriesAccess().getLeftSquareBracketKeyword_3());
                
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:472:1: ( (lv_category_4_0= ruleSelectionCategory ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:473:1: (lv_category_4_0= ruleSelectionCategory )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:473:1: (lv_category_4_0= ruleSelectionCategory )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:474:3: lv_category_4_0= ruleSelectionCategory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectionCategoriesAccess().getCategorySelectionCategoryParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSelectionCategory_in_ruleSelectionCategories1090);
            	    lv_category_4_0=ruleSelectionCategory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSelectionCategoriesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"category",
            	            		lv_category_4_0, 
            	            		"SelectionCategory");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleSelectionCategories1104); 

                	newLeafNode(otherlv_5, grammarAccess.getSelectionCategoriesAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectionCategories"


    // $ANTLR start "entryRuleQualityCategories"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:503:1: entryRuleQualityCategories returns [EObject current=null] : iv_ruleQualityCategories= ruleQualityCategories EOF ;
    public final EObject entryRuleQualityCategories() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualityCategories = null;


        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:504:2: (iv_ruleQualityCategories= ruleQualityCategories EOF )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:505:2: iv_ruleQualityCategories= ruleQualityCategories EOF
            {
             newCompositeNode(grammarAccess.getQualityCategoriesRule()); 
            pushFollow(FOLLOW_ruleQualityCategories_in_entryRuleQualityCategories1138);
            iv_ruleQualityCategories=ruleQualityCategories();

            state._fsp--;

             current =iv_ruleQualityCategories; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualityCategories1148); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualityCategories"


    // $ANTLR start "ruleQualityCategories"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:512:1: ruleQualityCategories returns [EObject current=null] : ( () otherlv_1= Quality otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleQualityCategory ) )+ otherlv_5= RightSquareBracket ) ;
    public final EObject ruleQualityCategories() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_category_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:515:28: ( ( () otherlv_1= Quality otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleQualityCategory ) )+ otherlv_5= RightSquareBracket ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:516:1: ( () otherlv_1= Quality otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleQualityCategory ) )+ otherlv_5= RightSquareBracket )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:516:1: ( () otherlv_1= Quality otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleQualityCategory ) )+ otherlv_5= RightSquareBracket )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:516:2: () otherlv_1= Quality otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleQualityCategory ) )+ otherlv_5= RightSquareBracket
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:516:2: ()
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:517:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQualityCategoriesAccess().getQualityCategoriesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,Quality,FOLLOW_Quality_in_ruleQualityCategories1195); 

                	newLeafNode(otherlv_1, grammarAccess.getQualityCategoriesAccess().getQualityKeyword_1());
                
            otherlv_2=(Token)match(input,Categories,FOLLOW_Categories_in_ruleQualityCategories1207); 

                	newLeafNode(otherlv_2, grammarAccess.getQualityCategoriesAccess().getCategoriesKeyword_2());
                
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleQualityCategories1219); 

                	newLeafNode(otherlv_3, grammarAccess.getQualityCategoriesAccess().getLeftSquareBracketKeyword_3());
                
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:537:1: ( (lv_category_4_0= ruleQualityCategory ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:538:1: (lv_category_4_0= ruleQualityCategory )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:538:1: (lv_category_4_0= ruleQualityCategory )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:539:3: lv_category_4_0= ruleQualityCategory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQualityCategoriesAccess().getCategoryQualityCategoryParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualityCategory_in_ruleQualityCategories1239);
            	    lv_category_4_0=ruleQualityCategory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQualityCategoriesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"category",
            	            		lv_category_4_0, 
            	            		"QualityCategory");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleQualityCategories1253); 

                	newLeafNode(otherlv_5, grammarAccess.getQualityCategoriesAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualityCategories"


    // $ANTLR start "entryRulePhaseCategories"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:568:1: entryRulePhaseCategories returns [EObject current=null] : iv_rulePhaseCategories= rulePhaseCategories EOF ;
    public final EObject entryRulePhaseCategories() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhaseCategories = null;


        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:569:2: (iv_rulePhaseCategories= rulePhaseCategories EOF )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:570:2: iv_rulePhaseCategories= rulePhaseCategories EOF
            {
             newCompositeNode(grammarAccess.getPhaseCategoriesRule()); 
            pushFollow(FOLLOW_rulePhaseCategories_in_entryRulePhaseCategories1287);
            iv_rulePhaseCategories=rulePhaseCategories();

            state._fsp--;

             current =iv_rulePhaseCategories; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhaseCategories1297); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhaseCategories"


    // $ANTLR start "rulePhaseCategories"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:577:1: rulePhaseCategories returns [EObject current=null] : ( () otherlv_1= Phase otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= rulePhaseCategory ) )+ otherlv_5= RightSquareBracket ) ;
    public final EObject rulePhaseCategories() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_category_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:580:28: ( ( () otherlv_1= Phase otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= rulePhaseCategory ) )+ otherlv_5= RightSquareBracket ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:581:1: ( () otherlv_1= Phase otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= rulePhaseCategory ) )+ otherlv_5= RightSquareBracket )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:581:1: ( () otherlv_1= Phase otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= rulePhaseCategory ) )+ otherlv_5= RightSquareBracket )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:581:2: () otherlv_1= Phase otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= rulePhaseCategory ) )+ otherlv_5= RightSquareBracket
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:581:2: ()
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:582:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPhaseCategoriesAccess().getQualityCategoriesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,Phase,FOLLOW_Phase_in_rulePhaseCategories1344); 

                	newLeafNode(otherlv_1, grammarAccess.getPhaseCategoriesAccess().getPhaseKeyword_1());
                
            otherlv_2=(Token)match(input,Categories,FOLLOW_Categories_in_rulePhaseCategories1356); 

                	newLeafNode(otherlv_2, grammarAccess.getPhaseCategoriesAccess().getCategoriesKeyword_2());
                
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rulePhaseCategories1368); 

                	newLeafNode(otherlv_3, grammarAccess.getPhaseCategoriesAccess().getLeftSquareBracketKeyword_3());
                
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:602:1: ( (lv_category_4_0= rulePhaseCategory ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:603:1: (lv_category_4_0= rulePhaseCategory )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:603:1: (lv_category_4_0= rulePhaseCategory )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:604:3: lv_category_4_0= rulePhaseCategory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPhaseCategoriesAccess().getCategoryPhaseCategoryParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePhaseCategory_in_rulePhaseCategories1388);
            	    lv_category_4_0=rulePhaseCategory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPhaseCategoriesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"category",
            	            		lv_category_4_0, 
            	            		"PhaseCategory");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rulePhaseCategories1402); 

                	newLeafNode(otherlv_5, grammarAccess.getPhaseCategoriesAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhaseCategories"


    // $ANTLR start "entryRuleComponentCategories"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:633:1: entryRuleComponentCategories returns [EObject current=null] : iv_ruleComponentCategories= ruleComponentCategories EOF ;
    public final EObject entryRuleComponentCategories() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentCategories = null;


        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:634:2: (iv_ruleComponentCategories= ruleComponentCategories EOF )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:635:2: iv_ruleComponentCategories= ruleComponentCategories EOF
            {
             newCompositeNode(grammarAccess.getComponentCategoriesRule()); 
            pushFollow(FOLLOW_ruleComponentCategories_in_entryRuleComponentCategories1436);
            iv_ruleComponentCategories=ruleComponentCategories();

            state._fsp--;

             current =iv_ruleComponentCategories; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentCategories1446); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentCategories"


    // $ANTLR start "ruleComponentCategories"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:642:1: ruleComponentCategories returns [EObject current=null] : ( () otherlv_1= Component otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleComponentCategory ) )+ otherlv_5= RightSquareBracket ) ;
    public final EObject ruleComponentCategories() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_category_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:645:28: ( ( () otherlv_1= Component otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleComponentCategory ) )+ otherlv_5= RightSquareBracket ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:646:1: ( () otherlv_1= Component otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleComponentCategory ) )+ otherlv_5= RightSquareBracket )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:646:1: ( () otherlv_1= Component otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleComponentCategory ) )+ otherlv_5= RightSquareBracket )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:646:2: () otherlv_1= Component otherlv_2= Categories otherlv_3= LeftSquareBracket ( (lv_category_4_0= ruleComponentCategory ) )+ otherlv_5= RightSquareBracket
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:646:2: ()
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:647:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComponentCategoriesAccess().getComponentCategoriesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,Component,FOLLOW_Component_in_ruleComponentCategories1493); 

                	newLeafNode(otherlv_1, grammarAccess.getComponentCategoriesAccess().getComponentKeyword_1());
                
            otherlv_2=(Token)match(input,Categories,FOLLOW_Categories_in_ruleComponentCategories1505); 

                	newLeafNode(otherlv_2, grammarAccess.getComponentCategoriesAccess().getCategoriesKeyword_2());
                
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleComponentCategories1517); 

                	newLeafNode(otherlv_3, grammarAccess.getComponentCategoriesAccess().getLeftSquareBracketKeyword_3());
                
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:667:1: ( (lv_category_4_0= ruleComponentCategory ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:668:1: (lv_category_4_0= ruleComponentCategory )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:668:1: (lv_category_4_0= ruleComponentCategory )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:669:3: lv_category_4_0= ruleComponentCategory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentCategoriesAccess().getCategoryComponentCategoryParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponentCategory_in_ruleComponentCategories1537);
            	    lv_category_4_0=ruleComponentCategory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentCategoriesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"category",
            	            		lv_category_4_0, 
            	            		"ComponentCategory");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleComponentCategories1551); 

                	newLeafNode(otherlv_5, grammarAccess.getComponentCategoriesAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentCategories"


    // $ANTLR start "entryRuleRequirementCategory"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:698:1: entryRuleRequirementCategory returns [EObject current=null] : iv_ruleRequirementCategory= ruleRequirementCategory EOF ;
    public final EObject entryRuleRequirementCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementCategory = null;


        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:699:2: (iv_ruleRequirementCategory= ruleRequirementCategory EOF )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:700:2: iv_ruleRequirementCategory= ruleRequirementCategory EOF
            {
             newCompositeNode(grammarAccess.getRequirementCategoryRule()); 
            pushFollow(FOLLOW_ruleRequirementCategory_in_entryRuleRequirementCategory1585);
            iv_ruleRequirementCategory=ruleRequirementCategory();

            state._fsp--;

             current =iv_ruleRequirementCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirementCategory1595); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirementCategory"


    // $ANTLR start "ruleRequirementCategory"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:707:1: ruleRequirementCategory returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRequirementCategory() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:710:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:711:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:711:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:711:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:711:2: ()
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:712:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRequirementCategoryAccess().getRequirementCategoryAction_0(),
                        current);
                

            }

            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:717:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:718:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:718:1: (lv_name_1_0= RULE_ID )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:719:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirementCategory1646); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRequirementCategoryAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRequirementCategoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirementCategory"


    // $ANTLR start "entryRuleMethodCategory"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:743:1: entryRuleMethodCategory returns [EObject current=null] : iv_ruleMethodCategory= ruleMethodCategory EOF ;
    public final EObject entryRuleMethodCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCategory = null;


        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:744:2: (iv_ruleMethodCategory= ruleMethodCategory EOF )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:745:2: iv_ruleMethodCategory= ruleMethodCategory EOF
            {
             newCompositeNode(grammarAccess.getMethodCategoryRule()); 
            pushFollow(FOLLOW_ruleMethodCategory_in_entryRuleMethodCategory1686);
            iv_ruleMethodCategory=ruleMethodCategory();

            state._fsp--;

             current =iv_ruleMethodCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodCategory1696); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodCategory"


    // $ANTLR start "ruleMethodCategory"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:752:1: ruleMethodCategory returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMethodCategory() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:755:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:756:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:756:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:756:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:756:2: ()
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:757:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMethodCategoryAccess().getMethodCategoryAction_0(),
                        current);
                

            }

            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:762:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:763:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:763:1: (lv_name_1_0= RULE_ID )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:764:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodCategory1747); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMethodCategoryAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodCategoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodCategory"


    // $ANTLR start "entryRuleSelectionCategory"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:788:1: entryRuleSelectionCategory returns [EObject current=null] : iv_ruleSelectionCategory= ruleSelectionCategory EOF ;
    public final EObject entryRuleSelectionCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionCategory = null;


        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:789:2: (iv_ruleSelectionCategory= ruleSelectionCategory EOF )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:790:2: iv_ruleSelectionCategory= ruleSelectionCategory EOF
            {
             newCompositeNode(grammarAccess.getSelectionCategoryRule()); 
            pushFollow(FOLLOW_ruleSelectionCategory_in_entryRuleSelectionCategory1787);
            iv_ruleSelectionCategory=ruleSelectionCategory();

            state._fsp--;

             current =iv_ruleSelectionCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectionCategory1797); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectionCategory"


    // $ANTLR start "ruleSelectionCategory"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:797:1: ruleSelectionCategory returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSelectionCategory() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:800:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:801:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:801:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:801:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:801:2: ()
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:802:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSelectionCategoryAccess().getSelectionCategoryAction_0(),
                        current);
                

            }

            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:807:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:808:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:808:1: (lv_name_1_0= RULE_ID )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:809:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectionCategory1848); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSelectionCategoryAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectionCategoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectionCategory"


    // $ANTLR start "entryRuleQualityCategory"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:833:1: entryRuleQualityCategory returns [EObject current=null] : iv_ruleQualityCategory= ruleQualityCategory EOF ;
    public final EObject entryRuleQualityCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualityCategory = null;


        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:834:2: (iv_ruleQualityCategory= ruleQualityCategory EOF )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:835:2: iv_ruleQualityCategory= ruleQualityCategory EOF
            {
             newCompositeNode(grammarAccess.getQualityCategoryRule()); 
            pushFollow(FOLLOW_ruleQualityCategory_in_entryRuleQualityCategory1888);
            iv_ruleQualityCategory=ruleQualityCategory();

            state._fsp--;

             current =iv_ruleQualityCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualityCategory1898); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualityCategory"


    // $ANTLR start "ruleQualityCategory"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:842:1: ruleQualityCategory returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleQualityCategory() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:845:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:846:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:846:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:846:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:846:2: ()
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:847:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQualityCategoryAccess().getQualityCategoryAction_0(),
                        current);
                

            }

            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:852:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:853:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:853:1: (lv_name_1_0= RULE_ID )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:854:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualityCategory1949); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQualityCategoryAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQualityCategoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualityCategory"


    // $ANTLR start "entryRulePhaseCategory"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:878:1: entryRulePhaseCategory returns [EObject current=null] : iv_rulePhaseCategory= rulePhaseCategory EOF ;
    public final EObject entryRulePhaseCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhaseCategory = null;


        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:879:2: (iv_rulePhaseCategory= rulePhaseCategory EOF )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:880:2: iv_rulePhaseCategory= rulePhaseCategory EOF
            {
             newCompositeNode(grammarAccess.getPhaseCategoryRule()); 
            pushFollow(FOLLOW_rulePhaseCategory_in_entryRulePhaseCategory1989);
            iv_rulePhaseCategory=rulePhaseCategory();

            state._fsp--;

             current =iv_rulePhaseCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhaseCategory1999); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhaseCategory"


    // $ANTLR start "rulePhaseCategory"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:887:1: rulePhaseCategory returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePhaseCategory() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:890:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:891:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:891:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:891:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:891:2: ()
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:892:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPhaseCategoryAccess().getPhaseCategoryAction_0(),
                        current);
                

            }

            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:897:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:898:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:898:1: (lv_name_1_0= RULE_ID )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:899:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePhaseCategory2050); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPhaseCategoryAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPhaseCategoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhaseCategory"


    // $ANTLR start "entryRuleComponentCategory"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:923:1: entryRuleComponentCategory returns [EObject current=null] : iv_ruleComponentCategory= ruleComponentCategory EOF ;
    public final EObject entryRuleComponentCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentCategory = null;


        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:924:2: (iv_ruleComponentCategory= ruleComponentCategory EOF )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:925:2: iv_ruleComponentCategory= ruleComponentCategory EOF
            {
             newCompositeNode(grammarAccess.getComponentCategoryRule()); 
            pushFollow(FOLLOW_ruleComponentCategory_in_entryRuleComponentCategory2090);
            iv_ruleComponentCategory=ruleComponentCategory();

            state._fsp--;

             current =iv_ruleComponentCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentCategory2100); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentCategory"


    // $ANTLR start "ruleComponentCategory"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:932:1: ruleComponentCategory returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleComponentCategory() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:935:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:936:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:936:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:936:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:936:2: ()
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:937:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComponentCategoryAccess().getComponentCategoryAction_0(),
                        current);
                

            }

            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:942:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:943:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:943:1: (lv_name_1_0= RULE_ID )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:944:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponentCategory2151); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComponentCategoryAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentCategoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentCategory"


    // $ANTLR start "entryRuleCategoryFilters"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:968:1: entryRuleCategoryFilters returns [EObject current=null] : iv_ruleCategoryFilters= ruleCategoryFilters EOF ;
    public final EObject entryRuleCategoryFilters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategoryFilters = null;


        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:969:2: (iv_ruleCategoryFilters= ruleCategoryFilters EOF )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:970:2: iv_ruleCategoryFilters= ruleCategoryFilters EOF
            {
             newCompositeNode(grammarAccess.getCategoryFiltersRule()); 
            pushFollow(FOLLOW_ruleCategoryFilters_in_entryRuleCategoryFilters2191);
            iv_ruleCategoryFilters=ruleCategoryFilters();

            state._fsp--;

             current =iv_ruleCategoryFilters; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategoryFilters2201); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCategoryFilters"


    // $ANTLR start "ruleCategoryFilters"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:977:1: ruleCategoryFilters returns [EObject current=null] : (otherlv_0= Category otherlv_1= Filters otherlv_2= LeftSquareBracket ( (lv_filters_3_0= ruleCategorySet ) )+ otherlv_4= RightSquareBracket ) ;
    public final EObject ruleCategoryFilters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_filters_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:980:28: ( (otherlv_0= Category otherlv_1= Filters otherlv_2= LeftSquareBracket ( (lv_filters_3_0= ruleCategorySet ) )+ otherlv_4= RightSquareBracket ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:981:1: (otherlv_0= Category otherlv_1= Filters otherlv_2= LeftSquareBracket ( (lv_filters_3_0= ruleCategorySet ) )+ otherlv_4= RightSquareBracket )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:981:1: (otherlv_0= Category otherlv_1= Filters otherlv_2= LeftSquareBracket ( (lv_filters_3_0= ruleCategorySet ) )+ otherlv_4= RightSquareBracket )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:982:2: otherlv_0= Category otherlv_1= Filters otherlv_2= LeftSquareBracket ( (lv_filters_3_0= ruleCategorySet ) )+ otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,Category,FOLLOW_Category_in_ruleCategoryFilters2239); 

                	newLeafNode(otherlv_0, grammarAccess.getCategoryFiltersAccess().getCategoryKeyword_0());
                
            otherlv_1=(Token)match(input,Filters,FOLLOW_Filters_in_ruleCategoryFilters2251); 

                	newLeafNode(otherlv_1, grammarAccess.getCategoryFiltersAccess().getFiltersKeyword_1());
                
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleCategoryFilters2263); 

                	newLeafNode(otherlv_2, grammarAccess.getCategoryFiltersAccess().getLeftSquareBracketKeyword_2());
                
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:996:1: ( (lv_filters_3_0= ruleCategorySet ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:997:1: (lv_filters_3_0= ruleCategorySet )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:997:1: (lv_filters_3_0= ruleCategorySet )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:998:3: lv_filters_3_0= ruleCategorySet
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCategoryFiltersAccess().getFiltersCategorySetParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCategorySet_in_ruleCategoryFilters2283);
            	    lv_filters_3_0=ruleCategorySet();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCategoryFiltersRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"filters",
            	            		lv_filters_3_0, 
            	            		"CategorySet");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleCategoryFilters2297); 

                	newLeafNode(otherlv_4, grammarAccess.getCategoryFiltersAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategoryFilters"


    // $ANTLR start "entryRuleCategorySet"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1027:1: entryRuleCategorySet returns [EObject current=null] : iv_ruleCategorySet= ruleCategorySet EOF ;
    public final EObject entryRuleCategorySet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategorySet = null;


        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1028:2: (iv_ruleCategorySet= ruleCategorySet EOF )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1029:2: iv_ruleCategorySet= ruleCategorySet EOF
            {
             newCompositeNode(grammarAccess.getCategorySetRule()); 
            pushFollow(FOLLOW_ruleCategorySet_in_entryRuleCategorySet2331);
            iv_ruleCategorySet=ruleCategorySet();

            state._fsp--;

             current =iv_ruleCategorySet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategorySet2341); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCategorySet"


    // $ANTLR start "ruleCategorySet"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1036:1: ruleCategorySet returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftCurlyBracket ( ( ruleCatRef ) )* otherlv_4= RightCurlyBracket ) ;
    public final EObject ruleCategorySet() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1039:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftCurlyBracket ( ( ruleCatRef ) )* otherlv_4= RightCurlyBracket ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1040:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftCurlyBracket ( ( ruleCatRef ) )* otherlv_4= RightCurlyBracket )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1040:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftCurlyBracket ( ( ruleCatRef ) )* otherlv_4= RightCurlyBracket )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1040:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftCurlyBracket ( ( ruleCatRef ) )* otherlv_4= RightCurlyBracket
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1040:2: ()
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1041:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCategorySetAccess().getCategorySetAction_0(),
                        current);
                

            }

            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1046:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1047:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1047:1: (lv_name_1_0= RULE_ID )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1048:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCategorySet2392); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCategorySetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCategorySetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleCategorySet2410); 

                	newLeafNode(otherlv_2, grammarAccess.getCategorySetAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1069:1: ( ( ruleCatRef ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1070:1: ( ruleCatRef )
            	    {
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1070:1: ( ruleCatRef )
            	    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1071:3: ruleCatRef
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCategorySetRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getCategorySetAccess().getElementsCategoryCrossReference_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCatRef_in_ruleCategorySet2432);
            	    ruleCatRef();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleCategorySet2446); 

                	newLeafNode(otherlv_4, grammarAccess.getCategorySetAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategorySet"


    // $ANTLR start "entryRuleCatRef"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1097:1: entryRuleCatRef returns [String current=null] : iv_ruleCatRef= ruleCatRef EOF ;
    public final String entryRuleCatRef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCatRef = null;


        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1098:1: (iv_ruleCatRef= ruleCatRef EOF )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1099:2: iv_ruleCatRef= ruleCatRef EOF
            {
             newCompositeNode(grammarAccess.getCatRefRule()); 
            pushFollow(FOLLOW_ruleCatRef_in_entryRuleCatRef2481);
            iv_ruleCatRef=ruleCatRef();

            state._fsp--;

             current =iv_ruleCatRef.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCatRef2492); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCatRef"


    // $ANTLR start "ruleCatRef"
    // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1106:1: ruleCatRef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleCatRef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1110:6: (this_ID_0= RULE_ID )
            // ../org.osate.categories/src-gen/org/osate/categories/parser/antlr/internal/InternalCategoriesParser.g:1111:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCatRef2531); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getCatRefAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCatRef"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCategoriesDefinitions_in_entryRuleCategoriesDefinitions67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategoriesDefinitions77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirementCategories_in_ruleCategoriesDefinitions167 = new BitSet(new long[]{0x0000000000001DD2L});
    public static final BitSet FOLLOW_ruleComponentCategories_in_ruleCategoriesDefinitions242 = new BitSet(new long[]{0x0000000000001DD2L});
    public static final BitSet FOLLOW_ruleMethodCategories_in_ruleCategoriesDefinitions317 = new BitSet(new long[]{0x0000000000001DD2L});
    public static final BitSet FOLLOW_ruleSelectionCategories_in_ruleCategoriesDefinitions392 = new BitSet(new long[]{0x0000000000001DD2L});
    public static final BitSet FOLLOW_rulePhaseCategories_in_ruleCategoriesDefinitions467 = new BitSet(new long[]{0x0000000000001DD2L});
    public static final BitSet FOLLOW_ruleQualityCategories_in_ruleCategoriesDefinitions542 = new BitSet(new long[]{0x0000000000001DD2L});
    public static final BitSet FOLLOW_ruleCategoryFilters_in_ruleCategoriesDefinitions617 = new BitSet(new long[]{0x0000000000001DD2L});
    public static final BitSet FOLLOW_ruleRequirementCategories_in_entryRuleRequirementCategories691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirementCategories701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Requirement_in_ruleRequirementCategories748 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Categories_in_ruleRequirementCategories760 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleRequirementCategories772 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleRequirementCategory_in_ruleRequirementCategories792 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleRequirementCategories806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodCategories_in_entryRuleMethodCategories840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodCategories850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Method_in_ruleMethodCategories897 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Categories_in_ruleMethodCategories909 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleMethodCategories921 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleMethodCategory_in_ruleMethodCategories941 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleMethodCategories955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionCategories_in_entryRuleSelectionCategories989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectionCategories999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Selection_in_ruleSelectionCategories1046 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Categories_in_ruleSelectionCategories1058 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleSelectionCategories1070 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleSelectionCategory_in_ruleSelectionCategories1090 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleSelectionCategories1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualityCategories_in_entryRuleQualityCategories1138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualityCategories1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Quality_in_ruleQualityCategories1195 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Categories_in_ruleQualityCategories1207 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleQualityCategories1219 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleQualityCategory_in_ruleQualityCategories1239 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleQualityCategories1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhaseCategories_in_entryRulePhaseCategories1287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhaseCategories1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Phase_in_rulePhaseCategories1344 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Categories_in_rulePhaseCategories1356 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rulePhaseCategories1368 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rulePhaseCategory_in_rulePhaseCategories1388 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rulePhaseCategories1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentCategories_in_entryRuleComponentCategories1436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentCategories1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Component_in_ruleComponentCategories1493 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Categories_in_ruleComponentCategories1505 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleComponentCategories1517 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleComponentCategory_in_ruleComponentCategories1537 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleComponentCategories1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirementCategory_in_entryRuleRequirementCategory1585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirementCategory1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirementCategory1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodCategory_in_entryRuleMethodCategory1686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodCategory1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodCategory1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionCategory_in_entryRuleSelectionCategory1787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectionCategory1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectionCategory1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualityCategory_in_entryRuleQualityCategory1888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualityCategory1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualityCategory1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhaseCategory_in_entryRulePhaseCategory1989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhaseCategory1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePhaseCategory2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentCategory_in_entryRuleComponentCategory2090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentCategory2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponentCategory2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategoryFilters_in_entryRuleCategoryFilters2191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategoryFilters2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Category_in_ruleCategoryFilters2239 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Filters_in_ruleCategoryFilters2251 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleCategoryFilters2263 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleCategorySet_in_ruleCategoryFilters2283 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleCategoryFilters2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategorySet_in_entryRuleCategorySet2331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategorySet2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCategorySet2392 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleCategorySet2410 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_ruleCatRef_in_ruleCategorySet2432 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleCategorySet2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCatRef_in_entryRuleCatRef2481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCatRef2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCatRef2531 = new BitSet(new long[]{0x0000000000000002L});

}
