package org.qwork.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQAyahStartLexer extends Lexer {
    public static final int RULE_BASMALAH=6;
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
    public static final int RULE_INT=4;
    public static final int RULE_AWORD=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalQAyahStartLexer() {;} 
    public InternalQAyahStartLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalQAyahStartLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalQAyahStart.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQAyahStart.g:11:7: ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' )
            // InternalQAyahStart.g:11:9: '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'
            {
            match("\u0627\u0644\u0633\u0648\u0631\u0629"); 


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
            // InternalQAyahStart.g:12:7: ( '\\u0627\\u0644\\u0622\\u064A\\u0629' )
            // InternalQAyahStart.g:12:9: '\\u0627\\u0644\\u0622\\u064A\\u0629'
            {
            match("\u0627\u0644\u0622\u064A\u0629"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "RULE_BASMALAH"
    public final void mRULE_BASMALAH() throws RecognitionException {
        try {
            int _type = RULE_BASMALAH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQAyahStart.g:420:15: ( '\\u0628\\u0650\\u0633\\u0652\\u0645\\u0650 \\u0627\\u0644\\u0644\\u0651\\u064E\\u0647\\u0650 \\u0627\\u0644\\u0631\\u0651\\u064E\\u062D\\u0652\\u0645\\u064E\\u0646\\u0650 \\u0627\\u0644\\u0631\\u0651\\u064E\\u062D\\u0650\\u064A\\u0645\\u0650' )
            // InternalQAyahStart.g:420:17: '\\u0628\\u0650\\u0633\\u0652\\u0645\\u0650 \\u0627\\u0644\\u0644\\u0651\\u064E\\u0647\\u0650 \\u0627\\u0644\\u0631\\u0651\\u064E\\u062D\\u0652\\u0645\\u064E\\u0646\\u0650 \\u0627\\u0644\\u0631\\u0651\\u064E\\u062D\\u0650\\u064A\\u0645\\u0650'
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
            // InternalQAyahStart.g:422:12: ( ( RULE_ALETTER | RULE_AHARAKAH | RULE_ATANWEEN | RULE_ASHADDAH )+ )
            // InternalQAyahStart.g:422:14: ( RULE_ALETTER | RULE_AHARAKAH | RULE_ATANWEEN | RULE_ASHADDAH )+
            {
            // InternalQAyahStart.g:422:14: ( RULE_ALETTER | RULE_AHARAKAH | RULE_ATANWEEN | RULE_ASHADDAH )+
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
            	    // InternalQAyahStart.g:
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
            // InternalQAyahStart.g:424:26: ( '\\uFDF0' .. '\\uFDFD' )
            // InternalQAyahStart.g:424:28: '\\uFDF0' .. '\\uFDFD'
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
            // InternalQAyahStart.g:426:23: ( '\\u0621' .. '\\u064A' )
            // InternalQAyahStart.g:426:25: '\\u0621' .. '\\u064A'
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
            // InternalQAyahStart.g:428:22: ( '\\u0660' .. '\\u0669' )
            // InternalQAyahStart.g:428:24: '\\u0660' .. '\\u0669'
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
            // InternalQAyahStart.g:430:24: ( '\\u064B' .. '\\u064D' )
            // InternalQAyahStart.g:430:26: '\\u064B' .. '\\u064D'
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
            // InternalQAyahStart.g:432:24: ( ( '\\u064E' .. '\\u0650' | '\\u0652' ) )
            // InternalQAyahStart.g:432:26: ( '\\u064E' .. '\\u0650' | '\\u0652' )
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
            // InternalQAyahStart.g:434:24: ( '\\u0651' )
            // InternalQAyahStart.g:434:26: '\\u0651'
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
            // InternalQAyahStart.g:436:26: ( ( '\\u0600' .. '\\u0620' | '\\u064B' .. '\\u06FF' ) )
            // InternalQAyahStart.g:436:28: ( '\\u0600' .. '\\u0620' | '\\u064B' .. '\\u06FF' )
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
            // InternalQAyahStart.g:438:14: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // InternalQAyahStart.g:438:16: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // InternalQAyahStart.g:438:20: ( options {greedy=false; } : . )*
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
            	    // InternalQAyahStart.g:438:48: .
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
            // InternalQAyahStart.g:440:17: ( 'deactivated' )
            // InternalQAyahStart.g:440:19: 'deactivated'
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
            // InternalQAyahStart.g:442:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalQAyahStart.g:442:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalQAyahStart.g:442:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQAyahStart.g:442:11: '^'
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

            // InternalQAyahStart.g:442:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalQAyahStart.g:
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
            // InternalQAyahStart.g:444:10: ( ( '0' .. '9' )+ )
            // InternalQAyahStart.g:444:12: ( '0' .. '9' )+
            {
            // InternalQAyahStart.g:444:12: ( '0' .. '9' )+
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
            	    // InternalQAyahStart.g:444:13: '0' .. '9'
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
            // InternalQAyahStart.g:446:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalQAyahStart.g:446:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalQAyahStart.g:446:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalQAyahStart.g:446:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalQAyahStart.g:446:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalQAyahStart.g:446:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalQAyahStart.g:446:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalQAyahStart.g:446:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalQAyahStart.g:446:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalQAyahStart.g:446:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalQAyahStart.g:446:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalQAyahStart.g:448:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalQAyahStart.g:448:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalQAyahStart.g:448:24: ( options {greedy=false; } : . )*
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
            	    // InternalQAyahStart.g:448:52: .
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
            // InternalQAyahStart.g:450:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalQAyahStart.g:450:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalQAyahStart.g:450:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalQAyahStart.g:
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
            // InternalQAyahStart.g:452:16: ( . )
            // InternalQAyahStart.g:452:18: .
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
        // InternalQAyahStart.g:1:8: ( T__21 | T__22 | RULE_BASMALAH | RULE_AWORD | RULE_KALEMAH | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=12;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // InternalQAyahStart.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // InternalQAyahStart.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // InternalQAyahStart.g:1:22: RULE_BASMALAH
                {
                mRULE_BASMALAH(); 

                }
                break;
            case 4 :
                // InternalQAyahStart.g:1:36: RULE_AWORD
                {
                mRULE_AWORD(); 

                }
                break;
            case 5 :
                // InternalQAyahStart.g:1:47: RULE_KALEMAH
                {
                mRULE_KALEMAH(); 

                }
                break;
            case 6 :
                // InternalQAyahStart.g:1:60: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 7 :
                // InternalQAyahStart.g:1:76: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 8 :
                // InternalQAyahStart.g:1:84: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 9 :
                // InternalQAyahStart.g:1:93: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 10 :
                // InternalQAyahStart.g:1:105: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 11 :
                // InternalQAyahStart.g:1:121: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 12 :
                // InternalQAyahStart.g:1:129: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\2\16\1\uffff\1\14\1\24\1\14\2\uffff\2\14\2\uffff\1\16\1\uffff\1\16\3\uffff\1\24\5\uffff\3\16\1\uffff\1\34\1\uffff\1\24\3\16\1\24\1\16\1\51\1\16\1\24\1\54\1\uffff\1\16\1\24\2\uffff\4\24\1\63\1\uffff";
    static final String DFA11_eofS =
        "\64\uffff";
    static final String DFA11_minS =
        "\1\0\1\u0644\1\u0650\1\uffff\1\0\1\145\1\101\2\uffff\1\0\1\52\2\uffff\1\u0622\1\uffff\1\u0633\1\uffff\2\0\1\141\5\uffff\1\u0648\1\u064a\1\u0652\1\uffff\2\0\1\143\1\u0631\1\u0629\1\u0645\1\164\1\u0629\1\u0621\1\u0650\1\151\1\u0621\1\uffff\1\40\1\166\2\uffff\1\141\1\164\1\145\1\144\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\u0644\1\u0650\1\uffff\1\uffff\1\145\1\172\2\uffff\1\uffff\1\52\2\uffff\1\u0633\1\uffff\1\u0633\1\uffff\2\uffff\1\141\5\uffff\1\u0648\1\u064a\1\u0652\1\uffff\2\uffff\1\143\1\u0631\1\u0629\1\u0645\1\164\1\u0629\1\u0652\1\u0650\1\151\1\u0652\1\uffff\1\40\1\166\2\uffff\1\141\1\164\1\145\1\144\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\3\uffff\1\4\3\uffff\1\7\1\10\2\uffff\1\13\1\14\1\uffff\1\4\1\uffff\1\5\3\uffff\1\7\1\10\1\11\1\12\1\13\3\uffff\1\5\14\uffff\1\2\2\uffff\1\1\1\3\5\uffff\1\6";
    static final String DFA11_specialS =
        "\1\3\3\uffff\1\4\4\uffff\1\5\7\uffff\1\2\1\1\12\uffff\1\6\1\0\25\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\14\2\13\2\14\1\13\22\14\1\13\1\14\1\4\4\14\1\11\7\14\1\12\12\10\7\14\32\7\3\14\1\6\1\7\1\14\3\7\1\5\26\7\u05a6\14\6\3\1\1\1\2\52\3\uf9ad\14",
            "\1\15",
            "\1\17",
            "",
            "\42\22\1\20\71\22\1\21\uffa3\22",
            "\1\23",
            "\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\0\26",
            "\1\27",
            "",
            "",
            "\1\32\20\uffff\1\31",
            "",
            "\1\33",
            "",
            "\42\36\1\35\uffdd\36",
            "\42\22\1\20\71\22\1\21\uffa3\22",
            "\1\37",
            "",
            "",
            "",
            "",
            "",
            "\1\40",
            "\1\41",
            "\1\42",
            "",
            "\42\22\1\20\71\22\1\21\uffa3\22",
            "\42\22\1\20\71\22\1\21\uffa3\22",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\62\16",
            "\1\52",
            "\1\53",
            "\62\16",
            "",
            "\1\55",
            "\1\56",
            "",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
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
            return "1:1: Tokens : ( T__21 | T__22 | RULE_BASMALAH | RULE_AWORD | RULE_KALEMAH | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_30 = input.LA(1);

                        s = -1;
                        if ( (LA11_30=='\"') ) {s = 16;}

                        else if ( (LA11_30=='\\') ) {s = 17;}

                        else if ( ((LA11_30>='\u0000' && LA11_30<='!')||(LA11_30>='#' && LA11_30<='[')||(LA11_30>=']' && LA11_30<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_18 = input.LA(1);

                        s = -1;
                        if ( (LA11_18=='\"') ) {s = 16;}

                        else if ( (LA11_18=='\\') ) {s = 17;}

                        else if ( ((LA11_18>='\u0000' && LA11_18<='!')||(LA11_18>='#' && LA11_18<='[')||(LA11_18>=']' && LA11_18<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_17 = input.LA(1);

                        s = -1;
                        if ( (LA11_17=='\"') ) {s = 29;}

                        else if ( ((LA11_17>='\u0000' && LA11_17<='!')||(LA11_17>='#' && LA11_17<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='\u0627') ) {s = 1;}

                        else if ( (LA11_0=='\u0628') ) {s = 2;}

                        else if ( ((LA11_0>='\u0621' && LA11_0<='\u0626')||(LA11_0>='\u0629' && LA11_0<='\u0652')) ) {s = 3;}

                        else if ( (LA11_0=='\"') ) {s = 4;}

                        else if ( (LA11_0=='d') ) {s = 5;}

                        else if ( (LA11_0=='^') ) {s = 6;}

                        else if ( ((LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='c')||(LA11_0>='e' && LA11_0<='z')) ) {s = 7;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 8;}

                        else if ( (LA11_0=='\'') ) {s = 9;}

                        else if ( (LA11_0=='/') ) {s = 10;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 11;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='#' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='.')||(LA11_0>=':' && LA11_0<='@')||(LA11_0>='[' && LA11_0<=']')||LA11_0=='`'||(LA11_0>='{' && LA11_0<='\u0620')||(LA11_0>='\u0653' && LA11_0<='\uFFFF')) ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_4 = input.LA(1);

                        s = -1;
                        if ( (LA11_4=='\"') ) {s = 16;}

                        else if ( (LA11_4=='\\') ) {s = 17;}

                        else if ( ((LA11_4>='\u0000' && LA11_4<='!')||(LA11_4>='#' && LA11_4<='[')||(LA11_4>=']' && LA11_4<='\uFFFF')) ) {s = 18;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_9 = input.LA(1);

                        s = -1;
                        if ( ((LA11_9>='\u0000' && LA11_9<='\uFFFF')) ) {s = 22;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_29 = input.LA(1);

                        s = -1;
                        if ( (LA11_29=='\"') ) {s = 16;}

                        else if ( (LA11_29=='\\') ) {s = 17;}

                        else if ( ((LA11_29>='\u0000' && LA11_29<='!')||(LA11_29>='#' && LA11_29<='[')||(LA11_29>=']' && LA11_29<='\uFFFF')) ) {s = 18;}

                        else s = 28;

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