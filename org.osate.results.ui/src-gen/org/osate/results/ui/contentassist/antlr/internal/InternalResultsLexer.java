package org.osate.results.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalResultsLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_INT_EXPONENT=10;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_BASED_INTEGER=12;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=7;
    public static final int RULE_DIGIT=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_REAL_LIT=6;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_EXPONENT=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int RULE_EXTENDED_DIGIT=11;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalResultsLexer() {;} 
    public InternalResultsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalResultsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalResults.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:11:7: ( 'this' )
            // InternalResults.g:11:9: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:12:7: ( '+' )
            // InternalResults.g:12:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:13:7: ( '-' )
            // InternalResults.g:13:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:14:7: ( 'false' )
            // InternalResults.g:14:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:15:7: ( 'or' )
            // InternalResults.g:15:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:16:7: ( '||' )
            // InternalResults.g:16:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:17:7: ( 'and' )
            // InternalResults.g:17:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:18:7: ( '&&' )
            // InternalResults.g:18:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:19:7: ( '==' )
            // InternalResults.g:19:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:20:7: ( '!=' )
            // InternalResults.g:20:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:21:7: ( '>=' )
            // InternalResults.g:21:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:22:7: ( '<=' )
            // InternalResults.g:22:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:23:7: ( '>' )
            // InternalResults.g:23:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:24:7: ( '<' )
            // InternalResults.g:24:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:25:7: ( '><' )
            // InternalResults.g:25:9: '><'
            {
            match("><"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:26:7: ( '*' )
            // InternalResults.g:26:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:27:7: ( '/' )
            // InternalResults.g:27:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:28:7: ( 'div' )
            // InternalResults.g:28:9: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:29:7: ( 'mod' )
            // InternalResults.g:29:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:30:7: ( 'not' )
            // InternalResults.g:30:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:31:7: ( 'tbd' )
            // InternalResults.g:31:9: 'tbd'
            {
            match("tbd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:32:7: ( 'error' )
            // InternalResults.g:32:9: 'error'
            {
            match("error"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:33:7: ( 'warning' )
            // InternalResults.g:33:9: 'warning'
            {
            match("warning"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:34:7: ( 'info' )
            // InternalResults.g:34:9: 'info'
            {
            match("info"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:35:7: ( 'success' )
            // InternalResults.g:35:9: 'success'
            {
            match("success"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:36:7: ( 'fail' )
            // InternalResults.g:36:9: 'fail'
            {
            match("fail"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:37:7: ( 'reports' )
            // InternalResults.g:37:9: 'reports'
            {
            match("reports"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:38:7: ( 'for' )
            // InternalResults.g:38:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:39:7: ( '[' )
            // InternalResults.g:39:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:40:7: ( ']' )
            // InternalResults.g:40:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:41:7: ( ':' )
            // InternalResults.g:41:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:42:7: ( 'description' )
            // InternalResults.g:42:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:43:7: ( 'report' )
            // InternalResults.g:43:9: 'report'
            {
            match("report"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:44:7: ( 'heading' )
            // InternalResults.g:44:9: 'heading'
            {
            match("heading"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:45:7: ( 'results' )
            // InternalResults.g:45:9: 'results'
            {
            match("results"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:46:7: ( 'contributor' )
            // InternalResults.g:46:9: 'contributor'
            {
            match("contributor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:47:7: ( '=' )
            // InternalResults.g:47:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:48:7: ( 'issues' )
            // InternalResults.g:48:9: 'issues'
            {
            match("issues"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:49:7: ( 'target' )
            // InternalResults.g:49:9: 'target'
            {
            match("target"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:50:7: ( 'exception' )
            // InternalResults.g:50:9: 'exception'
            {
            match("exception"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:51:7: ( 'diagnosticId' )
            // InternalResults.g:51:9: 'diagnosticId'
            {
            match("diagnosticId"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:52:7: ( 'boolean' )
            // InternalResults.g:52:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:53:7: ( 'integer' )
            // InternalResults.g:53:9: 'integer'
            {
            match("integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:54:7: ( 'units' )
            // InternalResults.g:54:9: 'units'
            {
            match("units"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:55:7: ( 'real' )
            // InternalResults.g:55:9: 'real'
            {
            match("real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:56:7: ( 'string' )
            // InternalResults.g:56:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:57:7: ( 'model' )
            // InternalResults.g:57:9: 'model'
            {
            match("model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:58:7: ( 'element' )
            // InternalResults.g:58:9: 'element'
            {
            match("element"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:59:7: ( '#' )
            // InternalResults.g:59:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:60:7: ( '.' )
            // InternalResults.g:60:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:61:7: ( 'img' )
            // InternalResults.g:61:9: 'img'
            {
            match("img"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:62:7: ( '(' )
            // InternalResults.g:62:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:63:7: ( ')' )
            // InternalResults.g:63:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:64:7: ( ',' )
            // InternalResults.g:64:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:65:7: ( '..' )
            // InternalResults.g:65:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:66:7: ( 'delta' )
            // InternalResults.g:66:9: 'delta'
            {
            match("delta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:67:7: ( 'if' )
            // InternalResults.g:67:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:68:7: ( 'then' )
            // InternalResults.g:68:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:69:7: ( 'endif' )
            // InternalResults.g:69:9: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:70:7: ( 'else' )
            // InternalResults.g:70:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:71:7: ( '::' )
            // InternalResults.g:71:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:72:7: ( 'true' )
            // InternalResults.g:72:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:73:7: ( '%' )
            // InternalResults.g:73:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:74:7: ( 'in' )
            // InternalResults.g:74:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // InternalResults.g:10847:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )
            // InternalResults.g:10847:26: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalResults.g:10847:36: ( '+' | '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalResults.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalResults.g:10847:47: ( RULE_DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalResults.g:10847:47: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

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


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_INT_EXPONENT"
    public final void mRULE_INT_EXPONENT() throws RecognitionException {
        try {
            // InternalResults.g:10849:28: ( ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+ )
            // InternalResults.g:10849:30: ( 'e' | 'E' ) ( '+' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalResults.g:10849:40: ( '+' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalResults.g:10849:40: '+'
                    {
                    match('+'); 

                    }
                    break;

            }

            // InternalResults.g:10849:45: ( RULE_DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalResults.g:10849:45: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

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


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT_EXPONENT"

    // $ANTLR start "RULE_REAL_LIT"
    public final void mRULE_REAL_LIT() throws RecognitionException {
        try {
            int _type = RULE_REAL_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:10851:15: ( ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )? )
            // InternalResults.g:10851:17: ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* '.' ( RULE_DIGIT )+ ( '_' ( RULE_DIGIT )+ )* ( RULE_EXPONENT )?
            {
            // InternalResults.g:10851:17: ( RULE_DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalResults.g:10851:17: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

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

            // InternalResults.g:10851:29: ( '_' ( RULE_DIGIT )+ )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='_') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalResults.g:10851:30: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalResults.g:10851:34: ( RULE_DIGIT )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalResults.g:10851:34: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

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


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match('.'); 
            // InternalResults.g:10851:52: ( RULE_DIGIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalResults.g:10851:52: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

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

            // InternalResults.g:10851:64: ( '_' ( RULE_DIGIT )+ )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='_') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalResults.g:10851:65: '_' ( RULE_DIGIT )+
            	    {
            	    match('_'); 
            	    // InternalResults.g:10851:69: ( RULE_DIGIT )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalResults.g:10851:69: RULE_DIGIT
            	    	    {
            	    	    mRULE_DIGIT(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt9 >= 1 ) break loop9;
            	                EarlyExitException eee =
            	                    new EarlyExitException(9, input);
            	                throw eee;
            	        }
            	        cnt9++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalResults.g:10851:83: ( RULE_EXPONENT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='E'||LA11_0=='e') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalResults.g:10851:83: RULE_EXPONENT
                    {
                    mRULE_EXPONENT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL_LIT"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalResults.g:10853:21: ( '0' .. '9' )
            // InternalResults.g:10853:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_EXTENDED_DIGIT"
    public final void mRULE_EXTENDED_DIGIT() throws RecognitionException {
        try {
            // InternalResults.g:10855:30: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalResults.g:10855:32: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXTENDED_DIGIT"

    // $ANTLR start "RULE_BASED_INTEGER"
    public final void mRULE_BASED_INTEGER() throws RecognitionException {
        try {
            // InternalResults.g:10857:29: ( RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )* )
            // InternalResults.g:10857:31: RULE_EXTENDED_DIGIT ( ( '_' )? RULE_EXTENDED_DIGIT )*
            {
            mRULE_EXTENDED_DIGIT(); 
            // InternalResults.g:10857:51: ( ( '_' )? RULE_EXTENDED_DIGIT )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='F')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='f')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalResults.g:10857:52: ( '_' )? RULE_EXTENDED_DIGIT
            	    {
            	    // InternalResults.g:10857:52: ( '_' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0=='_') ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalResults.g:10857:52: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    mRULE_EXTENDED_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BASED_INTEGER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:10859:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalResults.g:10859:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalResults.g:10859:11: ( '^' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='^') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalResults.g:10859:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalResults.g:10859:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalResults.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:10861:10: ( ( '0' .. '9' )+ )
            // InternalResults.g:10861:12: ( '0' .. '9' )+
            {
            // InternalResults.g:10861:12: ( '0' .. '9' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalResults.g:10861:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:10863:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalResults.g:10863:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalResults.g:10863:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\"') ) {
                alt19=1;
            }
            else if ( (LA19_0=='\'') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalResults.g:10863:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalResults.g:10863:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalResults.g:10863:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalResults.g:10863:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalResults.g:10863:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalResults.g:10863:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalResults.g:10863:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalResults.g:10863:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:10865:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalResults.g:10865:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalResults.g:10865:24: ( options {greedy=false; } : . )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='*') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='/') ) {
                        alt20=2;
                    }
                    else if ( ((LA20_1>='\u0000' && LA20_1<='.')||(LA20_1>='0' && LA20_1<='\uFFFF')) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>='\u0000' && LA20_0<=')')||(LA20_0>='+' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalResults.g:10865:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:10867:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalResults.g:10867:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalResults.g:10867:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalResults.g:10867:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalResults.g:10867:40: ( ( '\\r' )? '\\n' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\n'||LA23_0=='\r') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalResults.g:10867:41: ( '\\r' )? '\\n'
                    {
                    // InternalResults.g:10867:41: ( '\\r' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\r') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalResults.g:10867:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:10869:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalResults.g:10869:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalResults.g:10869:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalResults.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalResults.g:10871:16: ( . )
            // InternalResults.g:10871:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalResults.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_REAL_LIT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt25=72;
        alt25 = dfa25.predict(input);
        switch (alt25) {
            case 1 :
                // InternalResults.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalResults.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalResults.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalResults.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalResults.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalResults.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalResults.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalResults.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalResults.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalResults.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalResults.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalResults.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalResults.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalResults.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalResults.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalResults.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalResults.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalResults.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalResults.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalResults.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalResults.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalResults.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalResults.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalResults.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalResults.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalResults.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalResults.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalResults.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalResults.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalResults.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalResults.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalResults.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalResults.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalResults.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalResults.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalResults.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalResults.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalResults.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalResults.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalResults.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalResults.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // InternalResults.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // InternalResults.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // InternalResults.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // InternalResults.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // InternalResults.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // InternalResults.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // InternalResults.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // InternalResults.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // InternalResults.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // InternalResults.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // InternalResults.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // InternalResults.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // InternalResults.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // InternalResults.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // InternalResults.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // InternalResults.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // InternalResults.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // InternalResults.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // InternalResults.g:1:364: T__76
                {
                mT__76(); 

                }
                break;
            case 61 :
                // InternalResults.g:1:370: T__77
                {
                mT__77(); 

                }
                break;
            case 62 :
                // InternalResults.g:1:376: T__78
                {
                mT__78(); 

                }
                break;
            case 63 :
                // InternalResults.g:1:382: T__79
                {
                mT__79(); 

                }
                break;
            case 64 :
                // InternalResults.g:1:388: T__80
                {
                mT__80(); 

                }
                break;
            case 65 :
                // InternalResults.g:1:394: RULE_REAL_LIT
                {
                mRULE_REAL_LIT(); 

                }
                break;
            case 66 :
                // InternalResults.g:1:408: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 67 :
                // InternalResults.g:1:416: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 68 :
                // InternalResults.g:1:425: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 69 :
                // InternalResults.g:1:437: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 70 :
                // InternalResults.g:1:453: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 71 :
                // InternalResults.g:1:469: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 72 :
                // InternalResults.g:1:477: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA25_eotS =
        "\1\uffff\1\57\2\uffff\2\57\1\52\1\57\1\52\1\71\1\52\1\75\1\77\1\uffff\1\103\10\57\2\uffff\1\127\4\57\1\uffff\1\136\4\uffff\1\143\1\52\1\uffff\2\52\2\uffff\4\57\3\uffff\2\57\1\160\1\uffff\1\57\15\uffff\11\57\1\u0080\2\57\1\u0083\3\57\4\uffff\4\57\11\uffff\1\143\2\uffff\2\57\1\u008f\4\57\1\u0094\1\uffff\1\u0095\1\u0096\3\57\1\u009b\1\u009c\10\57\1\uffff\1\57\1\u00a6\1\uffff\11\57\1\u00b0\1\u00b1\1\uffff\1\57\1\u00b3\1\57\1\u00b5\3\uffff\4\57\2\uffff\3\57\1\u00bd\2\57\1\u00c0\2\57\1\uffff\4\57\1\u00c7\4\57\2\uffff\1\57\1\uffff\1\u00cd\1\uffff\2\57\1\u00d0\1\u00d1\1\u00d2\2\57\1\uffff\1\u00d5\1\57\1\uffff\6\57\1\uffff\3\57\1\u00e0\1\u00e1\1\uffff\2\57\3\uffff\2\57\1\uffff\2\57\1\u00e8\1\57\1\u00ea\1\u00ec\4\57\2\uffff\3\57\1\u00f4\1\u00f5\1\u00f6\1\uffff\1\u00f7\1\uffff\1\u00f8\1\uffff\1\u00f9\1\u00fa\1\57\1\u00fc\3\57\7\uffff\1\57\1\uffff\2\57\1\u0103\3\57\1\uffff\2\57\1\u0109\1\u010a\1\u010b\3\uffff";
    static final String DFA25_eofS =
        "\u010c\uffff";
    static final String DFA25_minS =
        "\1\0\1\141\2\uffff\1\141\1\162\1\174\1\156\1\46\2\75\1\74\1\75\1\uffff\1\52\1\145\2\157\1\154\1\141\1\146\1\164\1\145\2\uffff\1\72\1\145\2\157\1\156\1\uffff\1\56\4\uffff\1\56\1\101\1\uffff\2\0\2\uffff\1\145\1\144\1\162\1\165\3\uffff\1\151\1\162\1\60\1\uffff\1\144\15\uffff\1\141\1\154\1\144\1\164\1\162\1\143\1\145\1\144\1\162\1\60\1\163\1\147\1\60\1\143\1\162\1\141\4\uffff\1\141\1\156\1\157\1\151\11\uffff\1\56\2\uffff\1\163\1\156\1\60\1\147\1\145\1\163\1\154\1\60\1\uffff\2\60\1\147\1\143\1\164\2\60\1\157\1\145\1\155\1\145\1\151\1\156\1\157\1\145\1\uffff\1\165\1\60\1\uffff\1\143\1\151\1\157\1\165\1\154\1\144\1\164\1\154\1\164\2\60\1\uffff\1\145\1\60\1\145\1\60\3\uffff\1\156\1\162\1\141\1\154\2\uffff\1\162\1\160\1\145\1\60\1\146\1\151\1\60\1\147\1\145\1\uffff\1\145\1\156\1\162\1\154\1\60\1\151\1\162\1\145\1\163\2\uffff\1\164\1\uffff\1\60\1\uffff\1\157\1\151\3\60\1\164\1\156\1\uffff\1\60\1\156\1\uffff\1\145\2\163\1\147\2\164\1\uffff\1\156\1\151\1\141\2\60\1\uffff\1\163\1\160\3\uffff\1\151\1\164\1\uffff\1\147\1\162\1\60\1\163\2\60\1\163\1\147\1\142\1\156\2\uffff\2\164\1\157\3\60\1\uffff\1\60\1\uffff\1\60\1\uffff\2\60\1\165\1\60\2\151\1\156\7\uffff\1\164\1\uffff\1\143\1\157\1\60\1\157\1\111\1\156\1\uffff\1\162\1\144\3\60\3\uffff";
    static final String DFA25_maxS =
        "\1\uffff\1\162\2\uffff\1\157\1\162\1\174\1\156\1\46\4\75\1\uffff\1\57\1\151\2\157\1\170\1\141\1\163\1\165\1\145\2\uffff\1\72\1\145\2\157\1\156\1\uffff\1\56\4\uffff\1\137\1\172\1\uffff\2\uffff\2\uffff\1\151\1\144\1\162\1\165\3\uffff\1\154\1\162\1\172\1\uffff\1\144\15\uffff\1\166\1\163\1\144\1\164\1\162\1\143\1\163\1\144\1\162\1\172\1\163\1\147\1\172\1\143\1\162\1\163\4\uffff\1\141\1\156\1\157\1\151\11\uffff\1\137\2\uffff\1\163\1\156\1\172\1\147\1\145\1\163\1\154\1\172\1\uffff\2\172\1\147\1\143\1\164\2\172\1\157\1\145\1\155\1\145\1\151\1\156\1\157\1\145\1\uffff\1\165\1\172\1\uffff\1\143\1\151\1\157\1\165\1\154\1\144\1\164\1\154\1\164\2\172\1\uffff\1\145\1\172\1\145\1\172\3\uffff\1\156\1\162\1\141\1\154\2\uffff\1\162\1\160\1\145\1\172\1\146\1\151\1\172\1\147\1\145\1\uffff\1\145\1\156\1\162\1\154\1\172\1\151\1\162\1\145\1\163\2\uffff\1\164\1\uffff\1\172\1\uffff\1\157\1\151\3\172\1\164\1\156\1\uffff\1\172\1\156\1\uffff\1\145\2\163\1\147\2\164\1\uffff\1\156\1\151\1\141\2\172\1\uffff\1\163\1\160\3\uffff\1\151\1\164\1\uffff\1\147\1\162\1\172\1\163\2\172\1\163\1\147\1\142\1\156\2\uffff\2\164\1\157\3\172\1\uffff\1\172\1\uffff\1\172\1\uffff\2\172\1\165\1\172\2\151\1\156\7\uffff\1\164\1\uffff\1\143\1\157\1\172\1\157\1\111\1\156\1\uffff\1\162\1\144\3\172\3\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\1\3\11\uffff\1\20\11\uffff\1\35\1\36\5\uffff\1\61\1\uffff\1\64\1\65\1\66\1\77\2\uffff\1\102\2\uffff\1\107\1\110\4\uffff\1\102\1\2\1\3\3\uffff\1\6\1\uffff\1\10\1\11\1\45\1\12\1\13\1\17\1\15\1\14\1\16\1\20\1\105\1\106\1\21\20\uffff\1\35\1\36\1\75\1\37\4\uffff\1\61\1\67\1\62\1\64\1\65\1\66\1\77\1\103\1\101\1\uffff\1\104\1\107\10\uffff\1\5\17\uffff\1\100\2\uffff\1\71\13\uffff\1\25\4\uffff\1\34\1\7\1\22\4\uffff\1\23\1\24\11\uffff\1\63\11\uffff\1\1\1\72\1\uffff\1\76\1\uffff\1\32\7\uffff\1\74\2\uffff\1\30\6\uffff\1\55\5\uffff\1\4\2\uffff\1\70\1\57\1\26\2\uffff\1\73\12\uffff\1\54\1\47\6\uffff\1\46\1\uffff\1\56\1\uffff\1\41\7\uffff\1\60\1\27\1\53\1\31\1\33\1\43\1\42\1\uffff\1\52\6\uffff\1\50\5\uffff\1\40\1\44\1\51";
    static final String DFA25_specialS =
        "\1\2\46\uffff\1\0\1\1\u00e3\uffff}>";
    static final String[] DFA25_transitionS = {
            "\11\52\2\51\2\52\1\51\22\52\1\51\1\12\1\47\1\36\1\52\1\43\1\10\1\50\1\40\1\41\1\15\1\2\1\42\1\3\1\37\1\16\12\44\1\31\1\52\1\14\1\11\1\13\2\52\32\46\1\27\1\52\1\30\1\45\1\46\1\52\1\7\1\34\1\33\1\17\1\22\1\4\1\46\1\32\1\24\3\46\1\20\1\21\1\5\2\46\1\26\1\25\1\1\1\35\1\46\1\23\3\46\1\52\1\6\uff83\52",
            "\1\55\1\54\5\uffff\1\53\11\uffff\1\56",
            "",
            "",
            "\1\62\15\uffff\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\72",
            "\1\74\1\73",
            "\1\76",
            "",
            "\1\101\4\uffff\1\102",
            "\1\105\3\uffff\1\104",
            "\1\106",
            "\1\107",
            "\1\112\1\uffff\1\113\3\uffff\1\110\5\uffff\1\111",
            "\1\114",
            "\1\120\6\uffff\1\117\1\115\4\uffff\1\116",
            "\1\122\1\121",
            "\1\123",
            "",
            "",
            "\1\126",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "\1\135",
            "",
            "",
            "",
            "",
            "\1\144\1\uffff\12\145\45\uffff\1\144",
            "\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\0\146",
            "\0\146",
            "",
            "",
            "\1\151\3\uffff\1\150",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "",
            "",
            "\1\156\2\uffff\1\155",
            "\1\157",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\161",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\163\24\uffff\1\162",
            "\1\165\6\uffff\1\164",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172\15\uffff\1\173",
            "\1\174",
            "\1\175",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\5\57\1\176\15\57\1\177\6\57",
            "\1\u0081",
            "\1\u0082",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0084",
            "\1\u0085",
            "\1\u0088\16\uffff\1\u0086\2\uffff\1\u0087",
            "",
            "",
            "",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\144\1\uffff\12\145\45\uffff\1\144",
            "",
            "",
            "\1\u008d",
            "\1\u008e",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u009a\25\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "\1\u00a5",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00b2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00b4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00be",
            "\1\u00bf",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "",
            "\1\u00cc",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "",
            "",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00e9",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00eb\7\57",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00fb",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0100",
            "",
            "\1\u0101",
            "\1\u0102",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "",
            "\1\u0107",
            "\1\u0108",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_REAL_LIT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_39 = input.LA(1);

                        s = -1;
                        if ( ((LA25_39>='\u0000' && LA25_39<='\uFFFF')) ) {s = 102;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_40 = input.LA(1);

                        s = -1;
                        if ( ((LA25_40>='\u0000' && LA25_40<='\uFFFF')) ) {s = 102;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_0 = input.LA(1);

                        s = -1;
                        if ( (LA25_0=='t') ) {s = 1;}

                        else if ( (LA25_0=='+') ) {s = 2;}

                        else if ( (LA25_0=='-') ) {s = 3;}

                        else if ( (LA25_0=='f') ) {s = 4;}

                        else if ( (LA25_0=='o') ) {s = 5;}

                        else if ( (LA25_0=='|') ) {s = 6;}

                        else if ( (LA25_0=='a') ) {s = 7;}

                        else if ( (LA25_0=='&') ) {s = 8;}

                        else if ( (LA25_0=='=') ) {s = 9;}

                        else if ( (LA25_0=='!') ) {s = 10;}

                        else if ( (LA25_0=='>') ) {s = 11;}

                        else if ( (LA25_0=='<') ) {s = 12;}

                        else if ( (LA25_0=='*') ) {s = 13;}

                        else if ( (LA25_0=='/') ) {s = 14;}

                        else if ( (LA25_0=='d') ) {s = 15;}

                        else if ( (LA25_0=='m') ) {s = 16;}

                        else if ( (LA25_0=='n') ) {s = 17;}

                        else if ( (LA25_0=='e') ) {s = 18;}

                        else if ( (LA25_0=='w') ) {s = 19;}

                        else if ( (LA25_0=='i') ) {s = 20;}

                        else if ( (LA25_0=='s') ) {s = 21;}

                        else if ( (LA25_0=='r') ) {s = 22;}

                        else if ( (LA25_0=='[') ) {s = 23;}

                        else if ( (LA25_0==']') ) {s = 24;}

                        else if ( (LA25_0==':') ) {s = 25;}

                        else if ( (LA25_0=='h') ) {s = 26;}

                        else if ( (LA25_0=='c') ) {s = 27;}

                        else if ( (LA25_0=='b') ) {s = 28;}

                        else if ( (LA25_0=='u') ) {s = 29;}

                        else if ( (LA25_0=='#') ) {s = 30;}

                        else if ( (LA25_0=='.') ) {s = 31;}

                        else if ( (LA25_0=='(') ) {s = 32;}

                        else if ( (LA25_0==')') ) {s = 33;}

                        else if ( (LA25_0==',') ) {s = 34;}

                        else if ( (LA25_0=='%') ) {s = 35;}

                        else if ( ((LA25_0>='0' && LA25_0<='9')) ) {s = 36;}

                        else if ( (LA25_0=='^') ) {s = 37;}

                        else if ( ((LA25_0>='A' && LA25_0<='Z')||LA25_0=='_'||LA25_0=='g'||(LA25_0>='j' && LA25_0<='l')||(LA25_0>='p' && LA25_0<='q')||LA25_0=='v'||(LA25_0>='x' && LA25_0<='z')) ) {s = 38;}

                        else if ( (LA25_0=='\"') ) {s = 39;}

                        else if ( (LA25_0=='\'') ) {s = 40;}

                        else if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {s = 41;}

                        else if ( ((LA25_0>='\u0000' && LA25_0<='\b')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='\u001F')||LA25_0=='$'||LA25_0==';'||(LA25_0>='?' && LA25_0<='@')||LA25_0=='\\'||LA25_0=='`'||LA25_0=='{'||(LA25_0>='}' && LA25_0<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}