package org.osate.organization.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOrganizationLexer extends Lexer {
    public static final int Organization=4;
    public static final int Description=5;
    public static final int Email=8;
    public static final int RULE_STRING=19;
    public static final int Full=11;
    public static final int Name=12;
    public static final int RULE_SL_COMMENT=21;
    public static final int Stakeholder=6;
    public static final int Phone=9;
    public static final int EOF=-1;
    public static final int RightSquareBracket=16;
    public static final int Supervisor=7;
    public static final int FullStop=14;
    public static final int RULE_ID=17;
    public static final int RULE_WS=22;
    public static final int Title=10;
    public static final int RULE_ANY_OTHER=23;
    public static final int Role=13;
    public static final int RULE_INT=18;
    public static final int RULE_ML_COMMENT=20;
    public static final int LeftSquareBracket=15;

    // delegates
    // delegators

    public InternalOrganizationLexer() {;} 
    public InternalOrganizationLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalOrganizationLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g"; }

    // $ANTLR start "Organization"
    public final void mOrganization() throws RecognitionException {
        try {
            int _type = Organization;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:19:14: ( ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'G' | 'g' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:19:16: ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'G' | 'g' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Organization"

    // $ANTLR start "Description"
    public final void mDescription() throws RecognitionException {
        try {
            int _type = Description;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:21:13: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:21:15: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Description"

    // $ANTLR start "Stakeholder"
    public final void mStakeholder() throws RecognitionException {
        try {
            int _type = Stakeholder;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:23:13: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'K' | 'k' ) ( 'E' | 'e' ) ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:23:15: ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'K' | 'k' ) ( 'E' | 'e' ) ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Stakeholder"

    // $ANTLR start "Supervisor"
    public final void mSupervisor() throws RecognitionException {
        try {
            int _type = Supervisor;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:25:12: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:25:14: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Supervisor"

    // $ANTLR start "Email"
    public final void mEmail() throws RecognitionException {
        try {
            int _type = Email;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:27:7: ( ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'L' | 'l' ) )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:27:9: ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Email"

    // $ANTLR start "Phone"
    public final void mPhone() throws RecognitionException {
        try {
            int _type = Phone;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:29:7: ( ( 'P' | 'p' ) ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'E' | 'e' ) )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:29:9: ( 'P' | 'p' ) ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Phone"

    // $ANTLR start "Title"
    public final void mTitle() throws RecognitionException {
        try {
            int _type = Title;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:31:7: ( ( 'T' | 't' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:31:9: ( 'T' | 't' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Title"

    // $ANTLR start "Full"
    public final void mFull() throws RecognitionException {
        try {
            int _type = Full;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:33:6: ( ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:33:8: ( 'F' | 'f' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Full"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:35:6: ( ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:35:8: ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name"

    // $ANTLR start "Role"
    public final void mRole() throws RecognitionException {
        try {
            int _type = Role;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:37:6: ( ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:37:8: ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Role"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:39:10: ( '.' )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:39:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:41:19: ( '[' )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:41:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:43:20: ( ']' )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:43:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:47:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:47:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:47:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:47:11: '^'
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

            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:47:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:
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
            	    break loop2;
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
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:49:10: ( ( '0' .. '9' )+ )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:49:12: ( '0' .. '9' )+
            {
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:49:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:49:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:51:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:51:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:51:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:51:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:51:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:51:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:51:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:51:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:51:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:51:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:51:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:53:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:53:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:53:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:53:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:55:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:55:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:55:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:55:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:55:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:55:41: ( '\\r' )? '\\n'
                    {
                    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:55:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:55:41: '\\r'
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
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:57:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:57:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:57:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:59:16: ( . )
            // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:59:18: .
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
        // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:8: ( Organization | Description | Stakeholder | Supervisor | Email | Phone | Title | Full | Name | Role | FullStop | LeftSquareBracket | RightSquareBracket | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=20;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:10: Organization
                {
                mOrganization(); 

                }
                break;
            case 2 :
                // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:23: Description
                {
                mDescription(); 

                }
                break;
            case 3 :
                // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:35: Stakeholder
                {
                mStakeholder(); 

                }
                break;
            case 4 :
                // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:47: Supervisor
                {
                mSupervisor(); 

                }
                break;
            case 5 :
                // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:58: Email
                {
                mEmail(); 

                }
                break;
            case 6 :
                // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:64: Phone
                {
                mPhone(); 

                }
                break;
            case 7 :
                // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:70: Title
                {
                mTitle(); 

                }
                break;
            case 8 :
                // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:76: Full
                {
                mFull(); 

                }
                break;
            case 9 :
                // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:81: Name
                {
                mName(); 

                }
                break;
            case 10 :
                // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:86: Role
                {
                mRole(); 

                }
                break;
            case 11 :
                // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:91: FullStop
                {
                mFullStop(); 

                }
                break;
            case 12 :
                // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:100: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 13 :
                // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:118: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 14 :
                // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:137: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:145: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 16 :
                // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:154: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 17 :
                // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:166: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 18 :
                // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:182: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 19 :
                // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:198: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 20 :
                // ../org.osate.organization/src-gen/org/osate/organization/parser/antlr/lexer/InternalOrganizationLexer.g:1:206: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\11\26\3\uffff\1\24\2\uffff\3\24\2\uffff\1\26\1\uffff\11"+
        "\26\10\uffff\21\26\1\103\1\104\1\105\4\26\1\112\1\113\1\114\3\uffff"+
        "\4\26\3\uffff\17\26\1\140\1\26\1\142\1\143\1\uffff\1\144\3\uffff";
    static final String DFA12_eofS =
        "\145\uffff";
    static final String DFA12_minS =
        "\1\0\1\122\1\105\1\124\1\115\1\110\1\111\1\125\1\101\1\117\3\uffff"+
        "\1\101\2\uffff\2\0\1\52\2\uffff\1\107\1\uffff\1\123\1\101\1\120"+
        "\1\101\1\117\1\124\1\114\1\115\1\114\10\uffff\1\101\1\103\1\113"+
        "\1\105\1\111\1\116\2\114\2\105\1\116\1\122\1\105\1\122\1\114\2\105"+
        "\3\60\2\111\1\110\1\126\3\60\3\uffff\1\132\1\120\1\117\1\111\3\uffff"+
        "\1\101\1\124\1\114\1\123\1\124\1\111\1\104\1\117\1\111\1\117\1\105"+
        "\1\122\1\117\1\116\1\122\1\60\1\116\2\60\1\uffff\1\60\3\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\162\1\145\1\165\1\155\1\150\1\151\1\165\1\141\1\157"+
        "\3\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\147\1\uffff\1\163"+
        "\1\141\1\160\1\141\1\157\1\164\1\154\1\155\1\154\10\uffff\1\141"+
        "\1\143\1\153\1\145\1\151\1\156\2\154\2\145\1\156\1\162\1\145\1\162"+
        "\1\154\2\145\3\172\2\151\1\150\1\166\3\172\3\uffff\1\172\1\160\1"+
        "\157\1\151\3\uffff\1\141\1\164\1\154\1\163\1\164\1\151\1\144\1\157"+
        "\1\151\1\157\1\145\1\162\1\157\1\156\1\162\1\172\1\156\2\172\1\uffff"+
        "\1\172\3\uffff";
    static final String DFA12_acceptS =
        "\12\uffff\1\13\1\14\1\15\1\uffff\1\16\1\17\3\uffff\1\23\1\24\1"+
        "\uffff\1\16\11\uffff\1\13\1\14\1\15\1\17\1\20\1\21\1\22\1\23\33"+
        "\uffff\1\10\1\11\1\12\4\uffff\1\5\1\6\1\7\23\uffff\1\4\1\uffff\1"+
        "\2\1\3\1\1";
    static final String DFA12_specialS =
        "\1\2\17\uffff\1\1\1\0\123\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\23\1\24\1\20\4\24\1\21\6\24\1"+
            "\12\1\22\12\17\7\24\3\16\1\2\1\4\1\7\7\16\1\10\1\1\1\5\1\16"+
            "\1\11\1\3\1\6\6\16\1\13\1\24\1\14\1\15\1\16\1\24\3\16\1\2\1"+
            "\4\1\7\7\16\1\10\1\1\1\5\1\16\1\11\1\3\1\6\6\16\uff85\24",
            "\1\25\37\uffff\1\25",
            "\1\27\37\uffff\1\27",
            "\1\30\1\31\36\uffff\1\30\1\31",
            "\1\32\37\uffff\1\32",
            "\1\33\37\uffff\1\33",
            "\1\34\37\uffff\1\34",
            "\1\35\37\uffff\1\35",
            "\1\36\37\uffff\1\36",
            "\1\37\37\uffff\1\37",
            "",
            "",
            "",
            "\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\0\44",
            "\0\44",
            "\1\45\4\uffff\1\46",
            "",
            "",
            "\1\50\37\uffff\1\50",
            "",
            "\1\51\37\uffff\1\51",
            "\1\52\37\uffff\1\52",
            "\1\53\37\uffff\1\53",
            "\1\54\37\uffff\1\54",
            "\1\55\37\uffff\1\55",
            "\1\56\37\uffff\1\56",
            "\1\57\37\uffff\1\57",
            "\1\60\37\uffff\1\60",
            "\1\61\37\uffff\1\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62\37\uffff\1\62",
            "\1\63\37\uffff\1\63",
            "\1\64\37\uffff\1\64",
            "\1\65\37\uffff\1\65",
            "\1\66\37\uffff\1\66",
            "\1\67\37\uffff\1\67",
            "\1\70\37\uffff\1\70",
            "\1\71\37\uffff\1\71",
            "\1\72\37\uffff\1\72",
            "\1\73\37\uffff\1\73",
            "\1\74\37\uffff\1\74",
            "\1\75\37\uffff\1\75",
            "\1\76\37\uffff\1\76",
            "\1\77\37\uffff\1\77",
            "\1\100\37\uffff\1\100",
            "\1\101\37\uffff\1\101",
            "\1\102\37\uffff\1\102",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\106\37\uffff\1\106",
            "\1\107\37\uffff\1\107",
            "\1\110\37\uffff\1\110",
            "\1\111\37\uffff\1\111",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "\1\115\37\uffff\1\115",
            "\1\116\37\uffff\1\116",
            "\1\117\37\uffff\1\117",
            "\1\120\37\uffff\1\120",
            "",
            "",
            "",
            "\1\121\37\uffff\1\121",
            "\1\122\37\uffff\1\122",
            "\1\123\37\uffff\1\123",
            "\1\124\37\uffff\1\124",
            "\1\125\37\uffff\1\125",
            "\1\126\37\uffff\1\126",
            "\1\127\37\uffff\1\127",
            "\1\130\37\uffff\1\130",
            "\1\131\37\uffff\1\131",
            "\1\132\37\uffff\1\132",
            "\1\133\37\uffff\1\133",
            "\1\134\37\uffff\1\134",
            "\1\135\37\uffff\1\135",
            "\1\136\37\uffff\1\136",
            "\1\137\37\uffff\1\137",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\141\37\uffff\1\141",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Organization | Description | Stakeholder | Supervisor | Email | Phone | Title | Full | Name | Role | FullStop | LeftSquareBracket | RightSquareBracket | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_17 = input.LA(1);

                        s = -1;
                        if ( ((LA12_17>='\u0000' && LA12_17<='\uFFFF')) ) {s = 36;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_16 = input.LA(1);

                        s = -1;
                        if ( ((LA12_16>='\u0000' && LA12_16<='\uFFFF')) ) {s = 36;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='O'||LA12_0=='o') ) {s = 1;}

                        else if ( (LA12_0=='D'||LA12_0=='d') ) {s = 2;}

                        else if ( (LA12_0=='S'||LA12_0=='s') ) {s = 3;}

                        else if ( (LA12_0=='E'||LA12_0=='e') ) {s = 4;}

                        else if ( (LA12_0=='P'||LA12_0=='p') ) {s = 5;}

                        else if ( (LA12_0=='T'||LA12_0=='t') ) {s = 6;}

                        else if ( (LA12_0=='F'||LA12_0=='f') ) {s = 7;}

                        else if ( (LA12_0=='N'||LA12_0=='n') ) {s = 8;}

                        else if ( (LA12_0=='R'||LA12_0=='r') ) {s = 9;}

                        else if ( (LA12_0=='.') ) {s = 10;}

                        else if ( (LA12_0=='[') ) {s = 11;}

                        else if ( (LA12_0==']') ) {s = 12;}

                        else if ( (LA12_0=='^') ) {s = 13;}

                        else if ( ((LA12_0>='A' && LA12_0<='C')||(LA12_0>='G' && LA12_0<='M')||LA12_0=='Q'||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='c')||(LA12_0>='g' && LA12_0<='m')||LA12_0=='q'||(LA12_0>='u' && LA12_0<='z')) ) {s = 14;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 15;}

                        else if ( (LA12_0=='\"') ) {s = 16;}

                        else if ( (LA12_0=='\'') ) {s = 17;}

                        else if ( (LA12_0=='/') ) {s = 18;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 19;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='-')||(LA12_0>=':' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}