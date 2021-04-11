package org.qwork.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAbjadLexer extends Lexer {
    public static final int RULE_BASMALAH=7;
    public static final int RULE_AHARAKAH=9;
    public static final int RULE_STRING=17;
    public static final int RULE_ANONLETTER=14;
    public static final int RULE_SL_COMMENT=15;
    public static final int RULE_KALEMAH=5;
    public static final int RULE_ASHADDAH=11;
    public static final int RULE_ALETTER=8;
    public static final int RULE_ATANWEEN=10;
    public static final int EOF=-1;
    public static final int RULE_ALIGATURES=12;
    public static final int RULE_ID=16;
    public static final int RULE_WS=19;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_ADIGIT=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int RULE_AWORD=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalAbjadLexer() {;} 
    public InternalAbjadLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAbjadLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAbjad.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAbjad.g:11:7: ( '\\u062D\\u0631\\u0641' )
            // InternalAbjad.g:11:9: '\\u062D\\u0631\\u0641'
            {
            match("\u062D\u0631\u0641"); 


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
            // InternalAbjad.g:12:7: ( '\\u0647\\u0648' )
            // InternalAbjad.g:12:9: '\\u0647\\u0648'
            {
            match("\u0647\u0648"); 


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
            // InternalAbjad.g:13:7: ( '\\u0623\\u0648' )
            // InternalAbjad.g:13:9: '\\u0623\\u0648'
            {
            match("\u0623\u0648"); 


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
            // InternalAbjad.g:14:7: ( '\\u0630\\u0627\\u062A\\u0647' )
            // InternalAbjad.g:14:9: '\\u0630\\u0627\\u062A\\u0647'
            {
            match("\u0630\u0627\u062A\u0647"); 


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
            // InternalAbjad.g:15:7: ( '\\u062D\\u0631\\u0643\\u0629' )
            // InternalAbjad.g:15:9: '\\u062D\\u0631\\u0643\\u0629'
            {
            match("\u062D\u0631\u0643\u0629"); 


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
            // InternalAbjad.g:16:7: ( '\\u0647\\u064A' )
            // InternalAbjad.g:16:9: '\\u0647\\u064A'
            {
            match("\u0647\u064A"); 


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
            // InternalAbjad.g:17:7: ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' )
            // InternalAbjad.g:17:9: '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'
            {
            match("\u0627\u0644\u0633\u0648\u0631\u0629"); 


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
            // InternalAbjad.g:18:7: ( '\\u0627\\u0644\\u0622\\u064A\\u0629' )
            // InternalAbjad.g:18:9: '\\u0627\\u0644\\u0622\\u064A\\u0629'
            {
            match("\u0627\u0644\u0622\u064A\u0629"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "RULE_BASMALAH"
    public final void mRULE_BASMALAH() throws RecognitionException {
        try {
            int _type = RULE_BASMALAH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAbjad.g:431:15: ( '\\u0628\\u0650\\u0633\\u0652\\u0645\\u0650 \\u0627\\u0644\\u0644\\u0651\\u064E\\u0647\\u0650 \\u0627\\u0644\\u0631\\u0651\\u064E\\u062D\\u0652\\u0645\\u064E\\u0646\\u0650 \\u0627\\u0644\\u0631\\u0651\\u064E\\u062D\\u0650\\u064A\\u0645\\u0650' )
            // InternalAbjad.g:431:17: '\\u0628\\u0650\\u0633\\u0652\\u0645\\u0650 \\u0627\\u0644\\u0644\\u0651\\u064E\\u0647\\u0650 \\u0627\\u0644\\u0631\\u0651\\u064E\\u062D\\u0652\\u0645\\u064E\\u0646\\u0650 \\u0627\\u0644\\u0631\\u0651\\u064E\\u062D\\u0650\\u064A\\u0645\\u0650'
            {
            match("\u0628\u0650\u0633\u0652\u0645\u0650 \u0627\u0644\u0644\u0651\u064E\u0647\u0650 \u0627\u0644\u0631\u0651\u064E\u062D\u0652\u0645\u064E\u0646\u0650 \u0627\u0644\u0631\u0651\u064E\u062D\u0650\u064A\u0645\u0650"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BASMALAH"

    // $ANTLR start "RULE_AWORD"
    public final void mRULE_AWORD() throws RecognitionException {
        try {
            int _type = RULE_AWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAbjad.g:433:12: ( ( RULE_ALETTER | RULE_AHARAKAH | RULE_ATANWEEN | RULE_ASHADDAH )+ )
            // InternalAbjad.g:433:14: ( RULE_ALETTER | RULE_AHARAKAH | RULE_ATANWEEN | RULE_ASHADDAH )+
            {
            // InternalAbjad.g:433:14: ( RULE_ALETTER | RULE_AHARAKAH | RULE_ATANWEEN | RULE_ASHADDAH )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0621' && LA1_0<='\u0652')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAbjad.g:
            	    {
            	    if ( (input.LA(1)>='\u0621' && input.LA(1)<='\u0652') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AWORD"

    // $ANTLR start "RULE_ALIGATURES"
    public final void mRULE_ALIGATURES() throws RecognitionException {
        try {
            // InternalAbjad.g:435:26: ( '\\uFDF0' .. '\\uFDFD' )
            // InternalAbjad.g:435:28: '\\uFDF0' .. '\\uFDFD'
            {
            matchRange('\uFDF0','\uFDFD'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALIGATURES"

    // $ANTLR start "RULE_ALETTER"
    public final void mRULE_ALETTER() throws RecognitionException {
        try {
            // InternalAbjad.g:437:23: ( '\\u0621' .. '\\u064A' )
            // InternalAbjad.g:437:25: '\\u0621' .. '\\u064A'
            {
            matchRange('\u0621','\u064A'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALETTER"

    // $ANTLR start "RULE_ADIGIT"
    public final void mRULE_ADIGIT() throws RecognitionException {
        try {
            // InternalAbjad.g:439:22: ( '\\u0660' .. '\\u0669' )
            // InternalAbjad.g:439:24: '\\u0660' .. '\\u0669'
            {
            matchRange('\u0660','\u0669'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ADIGIT"

    // $ANTLR start "RULE_ATANWEEN"
    public final void mRULE_ATANWEEN() throws RecognitionException {
        try {
            // InternalAbjad.g:441:24: ( '\\u064B' .. '\\u064D' )
            // InternalAbjad.g:441:26: '\\u064B' .. '\\u064D'
            {
            matchRange('\u064B','\u064D'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ATANWEEN"

    // $ANTLR start "RULE_AHARAKAH"
    public final void mRULE_AHARAKAH() throws RecognitionException {
        try {
            // InternalAbjad.g:443:24: ( ( '\\u064E' .. '\\u0650' | '\\u0652' ) )
            // InternalAbjad.g:443:26: ( '\\u064E' .. '\\u0650' | '\\u0652' )
            {
            if ( (input.LA(1)>='\u064E' && input.LA(1)<='\u0650')||input.LA(1)=='\u0652' ) {
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
    // $ANTLR end "RULE_AHARAKAH"

    // $ANTLR start "RULE_ASHADDAH"
    public final void mRULE_ASHADDAH() throws RecognitionException {
        try {
            // InternalAbjad.g:445:24: ( '\\u0651' )
            // InternalAbjad.g:445:26: '\\u0651'
            {
            match('\u0651'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASHADDAH"

    // $ANTLR start "RULE_ANONLETTER"
    public final void mRULE_ANONLETTER() throws RecognitionException {
        try {
            // InternalAbjad.g:447:26: ( ( '\\u0600' .. '\\u0620' | '\\u064B' .. '\\u06FF' ) )
            // InternalAbjad.g:447:28: ( '\\u0600' .. '\\u0620' | '\\u064B' .. '\\u06FF' )
            {
            if ( (input.LA(1)>='\u0600' && input.LA(1)<='\u0620')||(input.LA(1)>='\u064B' && input.LA(1)<='\u06FF') ) {
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
    // $ANTLR end "RULE_ANONLETTER"

    // $ANTLR start "RULE_KALEMAH"
    public final void mRULE_KALEMAH() throws RecognitionException {
        try {
            int _type = RULE_KALEMAH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAbjad.g:449:14: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // InternalAbjad.g:449:16: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // InternalAbjad.g:449:20: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\"') ) {
                    alt2=2;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAbjad.g:449:48: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KALEMAH"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAbjad.g:451:17: ( 'deactivated' )
            // InternalAbjad.g:451:19: 'deactivated'
            {
            match("deactivated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAbjad.g:453:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAbjad.g:453:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAbjad.g:453:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAbjad.g:453:11: '^'
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

            // InternalAbjad.g:453:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAbjad.g:
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
            	    break loop4;
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
            // InternalAbjad.g:455:10: ( ( '0' .. '9' )+ )
            // InternalAbjad.g:455:12: ( '0' .. '9' )+
            {
            // InternalAbjad.g:455:12: ( '0' .. '9' )+
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
            	    // InternalAbjad.g:455:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // InternalAbjad.g:457:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAbjad.g:457:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAbjad.g:457:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAbjad.g:457:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAbjad.g:457:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalAbjad.g:457:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAbjad.g:457:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalAbjad.g:457:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAbjad.g:457:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalAbjad.g:457:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAbjad.g:457:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // InternalAbjad.g:459:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAbjad.g:459:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAbjad.g:459:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAbjad.g:459:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAbjad.g:461:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAbjad.g:461:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAbjad.g:461:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAbjad.g:
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // InternalAbjad.g:463:16: ( . )
            // InternalAbjad.g:463:18: .
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
        // InternalAbjad.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_BASMALAH | RULE_AWORD | RULE_KALEMAH | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=18;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // InternalAbjad.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // InternalAbjad.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // InternalAbjad.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // InternalAbjad.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // InternalAbjad.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // InternalAbjad.g:1:40: T__26
                {
                mT__26(); 

                }
                break;
            case 7 :
                // InternalAbjad.g:1:46: T__27
                {
                mT__27(); 

                }
                break;
            case 8 :
                // InternalAbjad.g:1:52: T__28
                {
                mT__28(); 

                }
                break;
            case 9 :
                // InternalAbjad.g:1:58: RULE_BASMALAH
                {
                mRULE_BASMALAH(); 

                }
                break;
            case 10 :
                // InternalAbjad.g:1:72: RULE_AWORD
                {
                mRULE_AWORD(); 

                }
                break;
            case 11 :
                // InternalAbjad.g:1:83: RULE_KALEMAH
                {
                mRULE_KALEMAH(); 

                }
                break;
            case 12 :
                // InternalAbjad.g:1:96: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 13 :
                // InternalAbjad.g:1:112: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 14 :
                // InternalAbjad.g:1:120: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 15 :
                // InternalAbjad.g:1:129: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 16 :
                // InternalAbjad.g:1:141: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 17 :
                // InternalAbjad.g:1:157: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // InternalAbjad.g:1:165: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\6\22\1\uffff\1\20\1\35\1\20\2\uffff\2\20\2\uffff\1\22\1\uffff\1\44\1\45\1\46\3\22\3\uffff\1\35\5\uffff\1\57\1\22\3\uffff\4\22\1\uffff\1\53\1\uffff\1\35\1\uffff\1\66\1\67\3\22\1\35\2\uffff\1\22\1\75\1\22\1\35\1\100\1\uffff\1\22\1\35\2\uffff\4\35\1\107\1\uffff";
    static final String DFA11_eofS =
        "\110\uffff";
    static final String DFA11_minS =
        "\1\0\1\u0631\2\u0648\1\u0627\1\u0644\1\u0650\1\uffff\1\0\1\145\1\101\2\uffff\1\0\1\52\2\uffff\1\u0641\1\uffff\3\u0621\1\u062a\1\u0622\1\u0633\1\uffff\2\0\1\141\5\uffff\1\u0621\1\u0629\3\uffff\1\u0647\1\u0648\1\u064a\1\u0652\1\uffff\2\0\1\143\1\uffff\2\u0621\1\u0631\1\u0629\1\u0645\1\164\2\uffff\1\u0629\1\u0621\1\u0650\1\151\1\u0621\1\uffff\1\40\1\166\2\uffff\1\141\1\164\1\145\1\144\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\u0631\1\u064a\1\u0648\1\u0627\1\u0644\1\u0650\1\uffff\1\uffff\1\145\1\172\2\uffff\1\uffff\1\52\2\uffff\1\u0643\1\uffff\3\u0652\1\u062a\2\u0633\1\uffff\2\uffff\1\141\5\uffff\1\u0652\1\u0629\3\uffff\1\u0647\1\u0648\1\u064a\1\u0652\1\uffff\2\uffff\1\143\1\uffff\2\u0652\1\u0631\1\u0629\1\u0645\1\164\2\uffff\1\u0629\1\u0652\1\u0650\1\151\1\u0652\1\uffff\1\40\1\166\2\uffff\1\141\1\164\1\145\1\144\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\7\uffff\1\12\3\uffff\1\15\1\16\2\uffff\1\21\1\22\1\uffff\1\12\6\uffff\1\13\3\uffff\1\15\1\16\1\17\1\20\1\21\2\uffff\1\2\1\6\1\3\4\uffff\1\13\3\uffff\1\1\6\uffff\1\5\1\4\5\uffff\1\10\2\uffff\1\7\1\11\5\uffff\1\14";
    static final String DFA11_specialS =
        "\1\0\7\uffff\1\5\4\uffff\1\1\14\uffff\1\2\1\4\20\uffff\1\6\1\3\32\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\20\2\17\2\20\1\17\22\20\1\17\1\20\1\10\4\20\1\15\7\20\1\16\12\14\7\20\32\13\3\20\1\12\1\13\1\20\3\13\1\11\26\13\u05a6\20\2\7\1\3\3\7\1\5\1\6\4\7\1\1\2\7\1\4\26\7\1\2\13\7\uf9ad\20",
            "\1\21",
            "\1\23\1\uffff\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "",
            "\42\33\1\31\71\33\1\32\uffa3\33",
            "\1\34",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\0\37",
            "\1\40",
            "",
            "",
            "\1\42\1\uffff\1\43",
            "",
            "\62\22",
            "\62\22",
            "\62\22",
            "\1\47",
            "\1\51\20\uffff\1\50",
            "\1\52",
            "",
            "\42\55\1\54\uffdd\55",
            "\42\33\1\31\71\33\1\32\uffa3\33",
            "\1\56",
            "",
            "",
            "",
            "",
            "",
            "\62\22",
            "\1\60",
            "",
            "",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "\42\33\1\31\71\33\1\32\uffa3\33",
            "\42\33\1\31\71\33\1\32\uffa3\33",
            "\1\65",
            "",
            "\62\22",
            "\62\22",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "\1\74",
            "\62\22",
            "\1\76",
            "\1\77",
            "\62\22",
            "",
            "\1\101",
            "\1\102",
            "",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_BASMALAH | RULE_AWORD | RULE_KALEMAH | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='\u062D') ) {s = 1;}

                        else if ( (LA11_0=='\u0647') ) {s = 2;}

                        else if ( (LA11_0=='\u0623') ) {s = 3;}

                        else if ( (LA11_0=='\u0630') ) {s = 4;}

                        else if ( (LA11_0=='\u0627') ) {s = 5;}

                        else if ( (LA11_0=='\u0628') ) {s = 6;}

                        else if ( ((LA11_0>='\u0621' && LA11_0<='\u0622')||(LA11_0>='\u0624' && LA11_0<='\u0626')||(LA11_0>='\u0629' && LA11_0<='\u062C')||(LA11_0>='\u062E' && LA11_0<='\u062F')||(LA11_0>='\u0631' && LA11_0<='\u0646')||(LA11_0>='\u0648' && LA11_0<='\u0652')) ) {s = 7;}

                        else if ( (LA11_0=='\"') ) {s = 8;}

                        else if ( (LA11_0=='d') ) {s = 9;}

                        else if ( (LA11_0=='^') ) {s = 10;}

                        else if ( ((LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='c')||(LA11_0>='e' && LA11_0<='z')) ) {s = 11;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 12;}

                        else if ( (LA11_0=='\'') ) {s = 13;}

                        else if ( (LA11_0=='/') ) {s = 14;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 15;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='#' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='.')||(LA11_0>=':' && LA11_0<='@')||(LA11_0>='[' && LA11_0<=']')||LA11_0=='`'||(LA11_0>='{' && LA11_0<='\u0620')||(LA11_0>='\u0653' && LA11_0<='\uFFFF')) ) {s = 16;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_13 = input.LA(1);

                        s = -1;
                        if ( ((LA11_13>='\u0000' && LA11_13<='\uFFFF')) ) {s = 31;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_26 = input.LA(1);

                        s = -1;
                        if ( (LA11_26=='\"') ) {s = 44;}

                        else if ( ((LA11_26>='\u0000' && LA11_26<='!')||(LA11_26>='#' && LA11_26<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_45 = input.LA(1);

                        s = -1;
                        if ( (LA11_45=='\"') ) {s = 25;}

                        else if ( (LA11_45=='\\') ) {s = 26;}

                        else if ( ((LA11_45>='\u0000' && LA11_45<='!')||(LA11_45>='#' && LA11_45<='[')||(LA11_45>=']' && LA11_45<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_27 = input.LA(1);

                        s = -1;
                        if ( (LA11_27=='\"') ) {s = 25;}

                        else if ( (LA11_27=='\\') ) {s = 26;}

                        else if ( ((LA11_27>='\u0000' && LA11_27<='!')||(LA11_27>='#' && LA11_27<='[')||(LA11_27>=']' && LA11_27<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_8 = input.LA(1);

                        s = -1;
                        if ( (LA11_8=='\"') ) {s = 25;}

                        else if ( (LA11_8=='\\') ) {s = 26;}

                        else if ( ((LA11_8>='\u0000' && LA11_8<='!')||(LA11_8>='#' && LA11_8<='[')||(LA11_8>=']' && LA11_8<='\uFFFF')) ) {s = 27;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_44 = input.LA(1);

                        s = -1;
                        if ( (LA11_44=='\"') ) {s = 25;}

                        else if ( (LA11_44=='\\') ) {s = 26;}

                        else if ( ((LA11_44>='\u0000' && LA11_44<='!')||(LA11_44>='#' && LA11_44<='[')||(LA11_44>=']' && LA11_44<='\uFFFF')) ) {s = 27;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}