package org.qwork.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArabicLexer extends Lexer {
    public static final int RULE_BASMALAH=4;
    public static final int RULE_AHARAKAH=7;
    public static final int RULE_STRING=17;
    public static final int RULE_ANONLETTER=12;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_KALEMAH=13;
    public static final int RULE_ASHADDAH=9;
    public static final int RULE_ALETTER=6;
    public static final int RULE_ATANWEEN=8;
    public static final int EOF=-1;
    public static final int RULE_ALIGATURES=10;
    public static final int RULE_ID=15;
    public static final int RULE_WS=19;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_ADIGIT=11;
    public static final int RULE_INT=16;
    public static final int RULE_AWORD=5;
    public static final int RULE_ML_COMMENT=18;

    // delegates
    // delegators

    public InternalArabicLexer() {;} 
    public InternalArabicLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalArabicLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalArabic.g"; }

    // $ANTLR start "RULE_BASMALAH"
    public final void mRULE_BASMALAH() throws RecognitionException {
        try {
            int _type = RULE_BASMALAH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArabic.g:215:15: ( '\\u0628\\u0650\\u0633\\u0652\\u0645\\u0650 \\u0627\\u0644\\u0644\\u0651\\u064E\\u0647\\u0650 \\u0627\\u0644\\u0631\\u0651\\u064E\\u062D\\u0652\\u0645\\u064E\\u0646\\u0650 \\u0627\\u0644\\u0631\\u0651\\u064E\\u062D\\u0650\\u064A\\u0645\\u0650' )
            // InternalArabic.g:215:17: '\\u0628\\u0650\\u0633\\u0652\\u0645\\u0650 \\u0627\\u0644\\u0644\\u0651\\u064E\\u0647\\u0650 \\u0627\\u0644\\u0631\\u0651\\u064E\\u062D\\u0652\\u0645\\u064E\\u0646\\u0650 \\u0627\\u0644\\u0631\\u0651\\u064E\\u062D\\u0650\\u064A\\u0645\\u0650'
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
            // InternalArabic.g:217:12: ( ( RULE_ALETTER | RULE_AHARAKAH | RULE_ATANWEEN | RULE_ASHADDAH )+ )
            // InternalArabic.g:217:14: ( RULE_ALETTER | RULE_AHARAKAH | RULE_ATANWEEN | RULE_ASHADDAH )+
            {
            // InternalArabic.g:217:14: ( RULE_ALETTER | RULE_AHARAKAH | RULE_ATANWEEN | RULE_ASHADDAH )+
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
            	    // InternalArabic.g:
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
            // InternalArabic.g:219:26: ( '\\uFDF0' .. '\\uFDFD' )
            // InternalArabic.g:219:28: '\\uFDF0' .. '\\uFDFD'
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
            // InternalArabic.g:221:23: ( '\\u0621' .. '\\u064A' )
            // InternalArabic.g:221:25: '\\u0621' .. '\\u064A'
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
            // InternalArabic.g:223:22: ( '\\u0660' .. '\\u0669' )
            // InternalArabic.g:223:24: '\\u0660' .. '\\u0669'
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
            // InternalArabic.g:225:24: ( '\\u064B' .. '\\u064D' )
            // InternalArabic.g:225:26: '\\u064B' .. '\\u064D'
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
            // InternalArabic.g:227:24: ( ( '\\u064E' .. '\\u0650' | '\\u0652' ) )
            // InternalArabic.g:227:26: ( '\\u064E' .. '\\u0650' | '\\u0652' )
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
            // InternalArabic.g:229:24: ( '\\u0651' )
            // InternalArabic.g:229:26: '\\u0651'
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
            // InternalArabic.g:231:26: ( ( '\\u0600' .. '\\u0620' | '\\u064B' .. '\\u06FF' ) )
            // InternalArabic.g:231:28: ( '\\u0600' .. '\\u0620' | '\\u064B' .. '\\u06FF' )
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
            // InternalArabic.g:233:14: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // InternalArabic.g:233:16: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // InternalArabic.g:233:20: ( options {greedy=false; } : . )*
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
            	    // InternalArabic.g:233:48: .
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
            // InternalArabic.g:235:17: ( 'deactivated' )
            // InternalArabic.g:235:19: 'deactivated'
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
            // InternalArabic.g:237:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalArabic.g:237:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalArabic.g:237:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalArabic.g:237:11: '^'
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

            // InternalArabic.g:237:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalArabic.g:
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
            // InternalArabic.g:239:10: ( ( '0' .. '9' )+ )
            // InternalArabic.g:239:12: ( '0' .. '9' )+
            {
            // InternalArabic.g:239:12: ( '0' .. '9' )+
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
            	    // InternalArabic.g:239:13: '0' .. '9'
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
            // InternalArabic.g:241:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalArabic.g:241:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalArabic.g:241:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalArabic.g:241:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalArabic.g:241:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalArabic.g:241:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalArabic.g:241:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalArabic.g:241:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalArabic.g:241:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalArabic.g:241:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalArabic.g:241:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalArabic.g:243:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalArabic.g:243:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalArabic.g:243:24: ( options {greedy=false; } : . )*
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
            	    // InternalArabic.g:243:52: .
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
            // InternalArabic.g:245:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalArabic.g:245:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalArabic.g:245:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalArabic.g:
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
            // InternalArabic.g:247:16: ( . )
            // InternalArabic.g:247:18: .
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
        // InternalArabic.g:1:8: ( RULE_BASMALAH | RULE_AWORD | RULE_KALEMAH | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=10;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // InternalArabic.g:1:10: RULE_BASMALAH
                {
                mRULE_BASMALAH(); 

                }
                break;
            case 2 :
                // InternalArabic.g:1:24: RULE_AWORD
                {
                mRULE_AWORD(); 

                }
                break;
            case 3 :
                // InternalArabic.g:1:35: RULE_KALEMAH
                {
                mRULE_KALEMAH(); 

                }
                break;
            case 4 :
                // InternalArabic.g:1:48: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 5 :
                // InternalArabic.g:1:64: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 6 :
                // InternalArabic.g:1:72: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 7 :
                // InternalArabic.g:1:81: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 8 :
                // InternalArabic.g:1:93: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 9 :
                // InternalArabic.g:1:109: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 10 :
                // InternalArabic.g:1:117: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\15\1\uffff\1\13\1\22\1\13\2\uffff\2\13\2\uffff\1\15\4\uffff\1\22\5\uffff\1\15\1\uffff\1\30\1\uffff\1\22\1\15\1\22\1\15\1\22\1\15\1\22\1\uffff\4\22\1\50\1\uffff";
    static final String DFA11_eofS =
        "\51\uffff";
    static final String DFA11_minS =
        "\1\0\1\u0650\1\uffff\1\0\1\145\1\101\2\uffff\1\0\1\52\2\uffff\1\u0633\2\uffff\2\0\1\141\5\uffff\1\u0652\1\uffff\2\0\1\143\1\u0645\1\164\1\u0650\1\151\1\40\1\166\1\uffff\1\141\1\164\1\145\1\144\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\u0650\1\uffff\1\uffff\1\145\1\172\2\uffff\1\uffff\1\52\2\uffff\1\u0633\2\uffff\2\uffff\1\141\5\uffff\1\u0652\1\uffff\2\uffff\1\143\1\u0645\1\164\1\u0650\1\151\1\40\1\166\1\uffff\1\141\1\164\1\145\1\144\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\3\uffff\1\5\1\6\2\uffff\1\11\1\12\1\uffff\1\2\1\3\3\uffff\1\5\1\6\1\7\1\10\1\11\1\uffff\1\3\11\uffff\1\1\5\uffff\1\4";
    static final String DFA11_specialS =
        "\1\2\2\uffff\1\4\4\uffff\1\5\6\uffff\1\3\1\1\10\uffff\1\6\1\0\16\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\13\2\12\2\13\1\12\22\13\1\12\1\13\1\3\4\13\1\10\7\13\1\11\12\7\7\13\32\6\3\13\1\5\1\6\1\13\3\6\1\4\26\6\u05a6\13\7\2\1\1\52\2\uf9ad\13",
            "\1\14",
            "",
            "\42\20\1\16\71\20\1\17\uffa3\20",
            "\1\21",
            "\32\22\4\uffff\1\22\1\uffff\32\22",
            "",
            "",
            "\0\24",
            "\1\25",
            "",
            "",
            "\1\27",
            "",
            "",
            "\42\32\1\31\uffdd\32",
            "\42\20\1\16\71\20\1\17\uffa3\20",
            "\1\33",
            "",
            "",
            "",
            "",
            "",
            "\1\34",
            "",
            "\42\20\1\16\71\20\1\17\uffa3\20",
            "\42\20\1\16\71\20\1\17\uffa3\20",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
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
            return "1:1: Tokens : ( RULE_BASMALAH | RULE_AWORD | RULE_KALEMAH | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_26 = input.LA(1);

                        s = -1;
                        if ( (LA11_26=='\"') ) {s = 14;}

                        else if ( (LA11_26=='\\') ) {s = 15;}

                        else if ( ((LA11_26>='\u0000' && LA11_26<='!')||(LA11_26>='#' && LA11_26<='[')||(LA11_26>=']' && LA11_26<='\uFFFF')) ) {s = 16;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_16 = input.LA(1);

                        s = -1;
                        if ( (LA11_16=='\"') ) {s = 14;}

                        else if ( (LA11_16=='\\') ) {s = 15;}

                        else if ( ((LA11_16>='\u0000' && LA11_16<='!')||(LA11_16>='#' && LA11_16<='[')||(LA11_16>=']' && LA11_16<='\uFFFF')) ) {s = 16;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='\u0628') ) {s = 1;}

                        else if ( ((LA11_0>='\u0621' && LA11_0<='\u0627')||(LA11_0>='\u0629' && LA11_0<='\u0652')) ) {s = 2;}

                        else if ( (LA11_0=='\"') ) {s = 3;}

                        else if ( (LA11_0=='d') ) {s = 4;}

                        else if ( (LA11_0=='^') ) {s = 5;}

                        else if ( ((LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='c')||(LA11_0>='e' && LA11_0<='z')) ) {s = 6;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 7;}

                        else if ( (LA11_0=='\'') ) {s = 8;}

                        else if ( (LA11_0=='/') ) {s = 9;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 10;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='#' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='.')||(LA11_0>=':' && LA11_0<='@')||(LA11_0>='[' && LA11_0<=']')||LA11_0=='`'||(LA11_0>='{' && LA11_0<='\u0620')||(LA11_0>='\u0653' && LA11_0<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_15 = input.LA(1);

                        s = -1;
                        if ( (LA11_15=='\"') ) {s = 25;}

                        else if ( ((LA11_15>='\u0000' && LA11_15<='!')||(LA11_15>='#' && LA11_15<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_3 = input.LA(1);

                        s = -1;
                        if ( (LA11_3=='\"') ) {s = 14;}

                        else if ( (LA11_3=='\\') ) {s = 15;}

                        else if ( ((LA11_3>='\u0000' && LA11_3<='!')||(LA11_3>='#' && LA11_3<='[')||(LA11_3>=']' && LA11_3<='\uFFFF')) ) {s = 16;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_8 = input.LA(1);

                        s = -1;
                        if ( ((LA11_8>='\u0000' && LA11_8<='\uFFFF')) ) {s = 20;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_25 = input.LA(1);

                        s = -1;
                        if ( (LA11_25=='\"') ) {s = 14;}

                        else if ( (LA11_25=='\\') ) {s = 15;}

                        else if ( ((LA11_25>='\u0000' && LA11_25<='!')||(LA11_25>='#' && LA11_25<='[')||(LA11_25>=']' && LA11_25<='\uFFFF')) ) {s = 16;}

                        else s = 24;

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