package org.qwork.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAbjadLexer extends Lexer {
    public static final int RULE_AHARAKAH=8;
    public static final int RULE_STRING=14;
    public static final int RULE_ANONLETTER=12;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__19=19;
    public static final int RULE_KALEMAH=7;
    public static final int T__18=18;
    public static final int RULE_ASHADDAH=11;
    public static final int RULE_ALETTER=6;
    public static final int EOF=-1;
    public static final int RULE_ID=13;
    public static final int RULE_WS=4;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_ADIGIT=10;
    public static final int RULE_INT=9;
    public static final int RULE_AWORD=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
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

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "RULE_ALETTER"
    public final void mRULE_ALETTER() throws RecognitionException {
        try {
            int _type = RULE_ALETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAbjad.g:1039:14: ( '\\u0621' .. '\\u064A' )
            // InternalAbjad.g:1039:16: '\\u0621' .. '\\u064A'
            {
            matchRange('\u0621','\u064A'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALETTER"

    // $ANTLR start "RULE_ADIGIT"
    public final void mRULE_ADIGIT() throws RecognitionException {
        try {
            int _type = RULE_ADIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAbjad.g:1041:13: ( '\\u0660' .. '\\u0669' )
            // InternalAbjad.g:1041:15: '\\u0660' .. '\\u0669'
            {
            matchRange('\u0660','\u0669'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ADIGIT"

    // $ANTLR start "RULE_AHARAKAH"
    public final void mRULE_AHARAKAH() throws RecognitionException {
        try {
            int _type = RULE_AHARAKAH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAbjad.g:1043:15: ( ( '\\u064E' .. '\\u0650' | '\\u0652' ) )
            // InternalAbjad.g:1043:17: ( '\\u064E' .. '\\u0650' | '\\u0652' )
            {
            if ( (input.LA(1)>='\u064E' && input.LA(1)<='\u0650')||input.LA(1)=='\u0652' ) {
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
    // $ANTLR end "RULE_AHARAKAH"

    // $ANTLR start "RULE_ASHADDAH"
    public final void mRULE_ASHADDAH() throws RecognitionException {
        try {
            // InternalAbjad.g:1045:24: ( '\\u0651' )
            // InternalAbjad.g:1045:26: '\\u0651'
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
            int _type = RULE_ANONLETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAbjad.g:1047:17: ( ( '\\u0600' .. '\\u0620' | '\\u064B' .. '\\u06FF' ) )
            // InternalAbjad.g:1047:19: ( '\\u0600' .. '\\u0620' | '\\u064B' .. '\\u06FF' )
            {
            if ( (input.LA(1)>='\u0600' && input.LA(1)<='\u0620')||(input.LA(1)>='\u064B' && input.LA(1)<='\u06FF') ) {
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
    // $ANTLR end "RULE_ANONLETTER"

    // $ANTLR start "RULE_AWORD"
    public final void mRULE_AWORD() throws RecognitionException {
        try {
            int _type = RULE_AWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAbjad.g:1049:12: ( ( RULE_ALETTER | RULE_AHARAKAH | RULE_ASHADDAH )+ )
            // InternalAbjad.g:1049:14: ( RULE_ALETTER | RULE_AHARAKAH | RULE_ASHADDAH )+
            {
            // InternalAbjad.g:1049:14: ( RULE_ALETTER | RULE_AHARAKAH | RULE_ASHADDAH )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0621' && LA1_0<='\u064A')||(LA1_0>='\u064E' && LA1_0<='\u0652')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAbjad.g:
            	    {
            	    if ( (input.LA(1)>='\u0621' && input.LA(1)<='\u064A')||(input.LA(1)>='\u064E' && input.LA(1)<='\u0652') ) {
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

    // $ANTLR start "RULE_KALEMAH"
    public final void mRULE_KALEMAH() throws RecognitionException {
        try {
            int _type = RULE_KALEMAH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAbjad.g:1051:14: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // InternalAbjad.g:1051:16: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // InternalAbjad.g:1051:20: ( options {greedy=false; } : . )*
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
            	    // InternalAbjad.g:1051:48: .
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAbjad.g:1053:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAbjad.g:1053:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAbjad.g:1053:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAbjad.g:1053:11: '^'
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

            // InternalAbjad.g:1053:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalAbjad.g:1055:10: ( ( '0' .. '9' )+ )
            // InternalAbjad.g:1055:12: ( '0' .. '9' )+
            {
            // InternalAbjad.g:1055:12: ( '0' .. '9' )+
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
            	    // InternalAbjad.g:1055:13: '0' .. '9'
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
            // InternalAbjad.g:1057:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAbjad.g:1057:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAbjad.g:1057:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalAbjad.g:1057:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAbjad.g:1057:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalAbjad.g:1057:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAbjad.g:1057:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalAbjad.g:1057:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAbjad.g:1057:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalAbjad.g:1057:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAbjad.g:1057:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalAbjad.g:1059:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAbjad.g:1059:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAbjad.g:1059:24: ( options {greedy=false; } : . )*
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
            	    // InternalAbjad.g:1059:52: .
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAbjad.g:1061:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAbjad.g:1061:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAbjad.g:1061:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAbjad.g:1061:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalAbjad.g:1061:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAbjad.g:1061:41: ( '\\r' )? '\\n'
                    {
                    // InternalAbjad.g:1061:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalAbjad.g:1061:41: '\\r'
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
            // InternalAbjad.g:1063:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAbjad.g:1063:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAbjad.g:1063:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalAbjad.g:1065:16: ( . )
            // InternalAbjad.g:1065:18: .
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
        // InternalAbjad.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_ALETTER | RULE_ADIGIT | RULE_AHARAKAH | RULE_ANONLETTER | RULE_AWORD | RULE_KALEMAH | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=21;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalAbjad.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // InternalAbjad.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // InternalAbjad.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // InternalAbjad.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // InternalAbjad.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // InternalAbjad.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // InternalAbjad.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // InternalAbjad.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // InternalAbjad.g:1:58: RULE_ALETTER
                {
                mRULE_ALETTER(); 

                }
                break;
            case 10 :
                // InternalAbjad.g:1:71: RULE_ADIGIT
                {
                mRULE_ADIGIT(); 

                }
                break;
            case 11 :
                // InternalAbjad.g:1:83: RULE_AHARAKAH
                {
                mRULE_AHARAKAH(); 

                }
                break;
            case 12 :
                // InternalAbjad.g:1:97: RULE_ANONLETTER
                {
                mRULE_ANONLETTER(); 

                }
                break;
            case 13 :
                // InternalAbjad.g:1:113: RULE_AWORD
                {
                mRULE_AWORD(); 

                }
                break;
            case 14 :
                // InternalAbjad.g:1:124: RULE_KALEMAH
                {
                mRULE_KALEMAH(); 

                }
                break;
            case 15 :
                // InternalAbjad.g:1:137: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // InternalAbjad.g:1:145: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 17 :
                // InternalAbjad.g:1:154: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 18 :
                // InternalAbjad.g:1:166: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 19 :
                // InternalAbjad.g:1:182: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 20 :
                // InternalAbjad.g:1:198: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 21 :
                // InternalAbjad.g:1:206: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\6\24\1\uffff\1\34\1\35\1\uffff\2\22\2\uffff\2\22\2\uffff\1\25\2\uffff\1\51\1\52\1\53\2\25\14\uffff\1\62\1\25\3\uffff\3\25\1\uffff\1\57\2\uffff\1\67\1\70\2\25\2\uffff\1\25\1\74\1\75\2\uffff";
    static final String DFA14_eofS =
        "\76\uffff";
    static final String DFA14_minS =
        "\1\0\6\u0621\1\uffff\2\u0621\1\uffff\1\0\1\101\2\uffff\1\0\1\52\2\uffff\1\u0641\2\uffff\3\u0621\1\u062a\1\u0622\4\uffff\2\0\6\uffff\1\u0621\1\u0629\3\uffff\1\u0647\1\u0648\1\u064a\1\uffff\2\0\1\uffff\2\u0621\1\u0631\1\u0629\2\uffff\1\u0629\2\u0621\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\6\u0652\1\uffff\2\u0652\1\uffff\1\uffff\1\172\2\uffff\1\uffff\1\57\2\uffff\1\u0643\2\uffff\3\u0652\1\u062a\1\u0633\4\uffff\2\uffff\6\uffff\1\u0652\1\u0629\3\uffff\1\u0647\1\u0648\1\u064a\1\uffff\2\uffff\1\uffff\2\u0652\1\u0631\1\u0629\2\uffff\1\u0629\2\u0652\2\uffff";
    static final String DFA14_acceptS =
        "\7\uffff\1\12\2\uffff\1\14\2\uffff\1\17\1\20\2\uffff\1\24\1\25\1\uffff\1\11\1\15\5\uffff\1\12\1\13\1\14\1\16\2\uffff\1\17\1\20\1\21\1\22\1\23\1\24\2\uffff\1\2\1\6\1\3\3\uffff\1\16\2\uffff\1\1\4\uffff\1\5\1\4\3\uffff\1\10\1\7";
    static final String DFA14_specialS =
        "\1\4\12\uffff\1\3\3\uffff\1\5\17\uffff\1\0\1\2\17\uffff\1\6\1\1\14\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\21\1\22\1\13\4\22\1\17\7\22\1\20\12\16\7\22\32\15\3\22\1\14\1\15\1\22\32\15\u0585\22\41\12\2\6\1\3\3\6\1\5\5\6\1\1\2\6\1\4\26\6\1\2\3\6\3\12\3\10\1\11\1\10\15\12\12\7\u0096\12\uf900\22",
            "\20\25\1\23\31\25\3\uffff\5\25",
            "\47\25\1\26\1\25\1\27\3\uffff\5\25",
            "\47\25\1\30\2\25\3\uffff\5\25",
            "\6\25\1\31\43\25\3\uffff\5\25",
            "\43\25\1\32\6\25\3\uffff\5\25",
            "\52\25\3\uffff\5\25",
            "",
            "\52\25\3\uffff\5\25",
            "\52\25\3\uffff\5\25",
            "",
            "\42\40\1\36\71\40\1\37\uffa3\40",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\0\43",
            "\1\44\4\uffff\1\45",
            "",
            "",
            "\1\47\1\uffff\1\50",
            "",
            "",
            "\52\25\3\uffff\5\25",
            "\52\25\3\uffff\5\25",
            "\52\25\3\uffff\5\25",
            "\1\54",
            "\1\56\20\uffff\1\55",
            "",
            "",
            "",
            "",
            "\42\61\1\60\uffdd\61",
            "\42\40\1\36\71\40\1\37\uffa3\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\25\3\uffff\5\25",
            "\1\63",
            "",
            "",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "",
            "\42\40\1\36\71\40\1\37\uffa3\40",
            "\42\40\1\36\71\40\1\37\uffa3\40",
            "",
            "\52\25\3\uffff\5\25",
            "\52\25\3\uffff\5\25",
            "\1\71",
            "\1\72",
            "",
            "",
            "\1\73",
            "\52\25\3\uffff\5\25",
            "\52\25\3\uffff\5\25",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_ALETTER | RULE_ADIGIT | RULE_AHARAKAH | RULE_ANONLETTER | RULE_AWORD | RULE_KALEMAH | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_31 = input.LA(1);

                        s = -1;
                        if ( (LA14_31=='\"') ) {s = 48;}

                        else if ( ((LA14_31>='\u0000' && LA14_31<='!')||(LA14_31>='#' && LA14_31<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_49 = input.LA(1);

                        s = -1;
                        if ( (LA14_49=='\"') ) {s = 30;}

                        else if ( (LA14_49=='\\') ) {s = 31;}

                        else if ( ((LA14_49>='\u0000' && LA14_49<='!')||(LA14_49>='#' && LA14_49<='[')||(LA14_49>=']' && LA14_49<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_32 = input.LA(1);

                        s = -1;
                        if ( (LA14_32=='\"') ) {s = 30;}

                        else if ( (LA14_32=='\\') ) {s = 31;}

                        else if ( ((LA14_32>='\u0000' && LA14_32<='!')||(LA14_32>='#' && LA14_32<='[')||(LA14_32>=']' && LA14_32<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_11 = input.LA(1);

                        s = -1;
                        if ( (LA14_11=='\"') ) {s = 30;}

                        else if ( (LA14_11=='\\') ) {s = 31;}

                        else if ( ((LA14_11>='\u0000' && LA14_11<='!')||(LA14_11>='#' && LA14_11<='[')||(LA14_11>=']' && LA14_11<='\uFFFF')) ) {s = 32;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='\u062D') ) {s = 1;}

                        else if ( (LA14_0=='\u0647') ) {s = 2;}

                        else if ( (LA14_0=='\u0623') ) {s = 3;}

                        else if ( (LA14_0=='\u0630') ) {s = 4;}

                        else if ( (LA14_0=='\u0627') ) {s = 5;}

                        else if ( ((LA14_0>='\u0621' && LA14_0<='\u0622')||(LA14_0>='\u0624' && LA14_0<='\u0626')||(LA14_0>='\u0628' && LA14_0<='\u062C')||(LA14_0>='\u062E' && LA14_0<='\u062F')||(LA14_0>='\u0631' && LA14_0<='\u0646')||(LA14_0>='\u0648' && LA14_0<='\u064A')) ) {s = 6;}

                        else if ( ((LA14_0>='\u0660' && LA14_0<='\u0669')) ) {s = 7;}

                        else if ( ((LA14_0>='\u064E' && LA14_0<='\u0650')||LA14_0=='\u0652') ) {s = 8;}

                        else if ( (LA14_0=='\u0651') ) {s = 9;}

                        else if ( ((LA14_0>='\u0600' && LA14_0<='\u0620')||(LA14_0>='\u064B' && LA14_0<='\u064D')||(LA14_0>='\u0653' && LA14_0<='\u065F')||(LA14_0>='\u066A' && LA14_0<='\u06FF')) ) {s = 10;}

                        else if ( (LA14_0=='\"') ) {s = 11;}

                        else if ( (LA14_0=='^') ) {s = 12;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {s = 13;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 14;}

                        else if ( (LA14_0=='\'') ) {s = 15;}

                        else if ( (LA14_0=='/') ) {s = 16;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 17;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='.')||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\u05FF')||(LA14_0>='\u0700' && LA14_0<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_15 = input.LA(1);

                        s = -1;
                        if ( ((LA14_15>='\u0000' && LA14_15<='\uFFFF')) ) {s = 35;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_48 = input.LA(1);

                        s = -1;
                        if ( (LA14_48=='\"') ) {s = 30;}

                        else if ( (LA14_48=='\\') ) {s = 31;}

                        else if ( ((LA14_48>='\u0000' && LA14_48<='!')||(LA14_48>='#' && LA14_48<='[')||(LA14_48>=']' && LA14_48<='\uFFFF')) ) {s = 32;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}