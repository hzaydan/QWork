package org.qwork.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQAyahStartLexer extends Lexer {
    public static final int RULE_AHARAKAH=10;
    public static final int RULE_STRING=14;
    public static final int RULE_ANONLETTER=12;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__19=19;
    public static final int RULE_KALEMAH=5;
    public static final int T__18=18;
    public static final int RULE_ASHADDAH=11;
    public static final int RULE_ALETTER=8;
    public static final int EOF=-1;
    public static final int RULE_ID=13;
    public static final int RULE_WS=7;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_ADIGIT=9;
    public static final int RULE_INT=4;
    public static final int RULE_AWORD=6;
    public static final int RULE_ML_COMMENT=15;

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

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "RULE_ALETTER"
    public final void mRULE_ALETTER() throws RecognitionException {
        try {
            // InternalQAyahStart.g:241:23: ( '\\u0621' .. '\\u064A' )
            // InternalQAyahStart.g:241:25: '\\u0621' .. '\\u064A'
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
            int _type = RULE_ADIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQAyahStart.g:243:13: ( '\\u0660' .. '\\u0669' )
            // InternalQAyahStart.g:243:15: '\\u0660' .. '\\u0669'
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
            // InternalQAyahStart.g:245:24: ( ( '\\u064E' .. '\\u0650' | '\\u0652' ) )
            // InternalQAyahStart.g:245:26: ( '\\u064E' .. '\\u0650' | '\\u0652' )
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
            // InternalQAyahStart.g:247:24: ( '\\u0651' )
            // InternalQAyahStart.g:247:26: '\\u0651'
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
            // InternalQAyahStart.g:249:17: ( ( '\\u0600' .. '\\u0620' | '\\u064B' .. '\\u06FF' ) )
            // InternalQAyahStart.g:249:19: ( '\\u0600' .. '\\u0620' | '\\u064B' .. '\\u06FF' )
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
            // InternalQAyahStart.g:251:12: ( ( RULE_ALETTER | RULE_AHARAKAH | RULE_ASHADDAH )+ )
            // InternalQAyahStart.g:251:14: ( RULE_ALETTER | RULE_AHARAKAH | RULE_ASHADDAH )+
            {
            // InternalQAyahStart.g:251:14: ( RULE_ALETTER | RULE_AHARAKAH | RULE_ASHADDAH )+
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
            	    // InternalQAyahStart.g:
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
            // InternalQAyahStart.g:253:14: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // InternalQAyahStart.g:253:16: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // InternalQAyahStart.g:253:20: ( options {greedy=false; } : . )*
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
            	    // InternalQAyahStart.g:253:48: .
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
            // InternalQAyahStart.g:255:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalQAyahStart.g:255:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalQAyahStart.g:255:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQAyahStart.g:255:11: '^'
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

            // InternalQAyahStart.g:255:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalQAyahStart.g:257:10: ( ( '0' .. '9' )+ )
            // InternalQAyahStart.g:257:12: ( '0' .. '9' )+
            {
            // InternalQAyahStart.g:257:12: ( '0' .. '9' )+
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
            	    // InternalQAyahStart.g:257:13: '0' .. '9'
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
            // InternalQAyahStart.g:259:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalQAyahStart.g:259:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalQAyahStart.g:259:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalQAyahStart.g:259:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalQAyahStart.g:259:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalQAyahStart.g:259:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalQAyahStart.g:259:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalQAyahStart.g:259:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalQAyahStart.g:259:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalQAyahStart.g:259:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalQAyahStart.g:259:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalQAyahStart.g:261:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalQAyahStart.g:261:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalQAyahStart.g:261:24: ( options {greedy=false; } : . )*
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
            	    // InternalQAyahStart.g:261:52: .
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
            // InternalQAyahStart.g:263:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalQAyahStart.g:263:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalQAyahStart.g:263:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalQAyahStart.g:263:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalQAyahStart.g:263:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalQAyahStart.g:263:41: ( '\\r' )? '\\n'
                    {
                    // InternalQAyahStart.g:263:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalQAyahStart.g:263:41: '\\r'
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
            // InternalQAyahStart.g:265:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalQAyahStart.g:265:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalQAyahStart.g:265:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalQAyahStart.g:267:16: ( . )
            // InternalQAyahStart.g:267:18: .
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
        // InternalQAyahStart.g:1:8: ( T__18 | T__19 | RULE_ADIGIT | RULE_ANONLETTER | RULE_AWORD | RULE_KALEMAH | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=13;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalQAyahStart.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // InternalQAyahStart.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // InternalQAyahStart.g:1:22: RULE_ADIGIT
                {
                mRULE_ADIGIT(); 

                }
                break;
            case 4 :
                // InternalQAyahStart.g:1:34: RULE_ANONLETTER
                {
                mRULE_ANONLETTER(); 

                }
                break;
            case 5 :
                // InternalQAyahStart.g:1:50: RULE_AWORD
                {
                mRULE_AWORD(); 

                }
                break;
            case 6 :
                // InternalQAyahStart.g:1:61: RULE_KALEMAH
                {
                mRULE_KALEMAH(); 

                }
                break;
            case 7 :
                // InternalQAyahStart.g:1:74: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 8 :
                // InternalQAyahStart.g:1:82: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 9 :
                // InternalQAyahStart.g:1:91: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 10 :
                // InternalQAyahStart.g:1:103: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 11 :
                // InternalQAyahStart.g:1:119: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 12 :
                // InternalQAyahStart.g:1:135: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 13 :
                // InternalQAyahStart.g:1:143: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\17\1\uffff\1\21\2\uffff\2\15\2\uffff\2\15\2\uffff\1\17\14\uffff\2\17\1\37\2\uffff\3\17\1\45\1\46\2\uffff";
    static final String DFA14_eofS =
        "\47\uffff";
    static final String DFA14_minS =
        "\1\0\1\u0644\1\uffff\1\u0621\2\uffff\1\0\1\101\2\uffff\1\0\1\52\2\uffff\1\u0622\3\uffff\2\0\7\uffff\1\u0648\1\u064a\2\0\1\uffff\1\u0631\2\u0629\2\u0621\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\u0644\1\uffff\1\u0652\2\uffff\1\uffff\1\172\2\uffff\1\uffff\1\57\2\uffff\1\u0633\3\uffff\2\uffff\7\uffff\1\u0648\1\u064a\2\uffff\1\uffff\1\u0631\2\u0629\2\u0652\2\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\3\1\uffff\1\4\1\5\2\uffff\1\7\1\10\2\uffff\1\14\1\15\1\uffff\1\5\1\3\1\4\2\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\4\uffff\1\6\5\uffff\1\2\1\1";
    static final String DFA14_specialS =
        "\1\0\5\uffff\1\5\3\uffff\1\4\7\uffff\1\6\1\2\11\uffff\1\3\1\1\10\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\15\2\14\2\15\1\14\22\15\1\14\1\15\1\6\4\15\1\12\7\15\1\13\12\11\7\15\32\10\3\15\1\7\1\10\1\15\32\10\u0585\15\41\4\6\5\1\1\43\5\3\4\5\3\15\4\12\2\u0096\4\uf900\15",
            "\1\16",
            "",
            "\52\17\3\uffff\5\17",
            "",
            "",
            "\42\23\1\24\71\23\1\22\uffa3\23",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\0\27",
            "\1\30\4\uffff\1\31",
            "",
            "",
            "\1\34\20\uffff\1\33",
            "",
            "",
            "",
            "\42\36\1\35\uffdd\36",
            "\42\23\1\24\71\23\1\22\uffa3\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\40",
            "\1\41",
            "\42\23\1\24\71\23\1\22\uffa3\23",
            "\42\23\1\24\71\23\1\22\uffa3\23",
            "",
            "\1\42",
            "\1\43",
            "\1\44",
            "\52\17\3\uffff\5\17",
            "\52\17\3\uffff\5\17",
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
            return "1:1: Tokens : ( T__18 | T__19 | RULE_ADIGIT | RULE_ANONLETTER | RULE_AWORD | RULE_KALEMAH | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='\u0627') ) {s = 1;}

                        else if ( ((LA14_0>='\u0660' && LA14_0<='\u0669')) ) {s = 2;}

                        else if ( ((LA14_0>='\u064E' && LA14_0<='\u0652')) ) {s = 3;}

                        else if ( ((LA14_0>='\u0600' && LA14_0<='\u0620')||(LA14_0>='\u064B' && LA14_0<='\u064D')||(LA14_0>='\u0653' && LA14_0<='\u065F')||(LA14_0>='\u066A' && LA14_0<='\u06FF')) ) {s = 4;}

                        else if ( ((LA14_0>='\u0621' && LA14_0<='\u0626')||(LA14_0>='\u0628' && LA14_0<='\u064A')) ) {s = 5;}

                        else if ( (LA14_0=='\"') ) {s = 6;}

                        else if ( (LA14_0=='^') ) {s = 7;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {s = 8;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 9;}

                        else if ( (LA14_0=='\'') ) {s = 10;}

                        else if ( (LA14_0=='/') ) {s = 11;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 12;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='.')||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\u05FF')||(LA14_0>='\u0700' && LA14_0<='\uFFFF')) ) {s = 13;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_30 = input.LA(1);

                        s = -1;
                        if ( (LA14_30=='\"') ) {s = 20;}

                        else if ( (LA14_30=='\\') ) {s = 18;}

                        else if ( ((LA14_30>='\u0000' && LA14_30<='!')||(LA14_30>='#' && LA14_30<='[')||(LA14_30>=']' && LA14_30<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_19 = input.LA(1);

                        s = -1;
                        if ( (LA14_19=='\"') ) {s = 20;}

                        else if ( (LA14_19=='\\') ) {s = 18;}

                        else if ( ((LA14_19>='\u0000' && LA14_19<='!')||(LA14_19>='#' && LA14_19<='[')||(LA14_19>=']' && LA14_19<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_29 = input.LA(1);

                        s = -1;
                        if ( (LA14_29=='\"') ) {s = 20;}

                        else if ( (LA14_29=='\\') ) {s = 18;}

                        else if ( ((LA14_29>='\u0000' && LA14_29<='!')||(LA14_29>='#' && LA14_29<='[')||(LA14_29>=']' && LA14_29<='\uFFFF')) ) {s = 19;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_10 = input.LA(1);

                        s = -1;
                        if ( ((LA14_10>='\u0000' && LA14_10<='\uFFFF')) ) {s = 23;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_6 = input.LA(1);

                        s = -1;
                        if ( (LA14_6=='\\') ) {s = 18;}

                        else if ( ((LA14_6>='\u0000' && LA14_6<='!')||(LA14_6>='#' && LA14_6<='[')||(LA14_6>=']' && LA14_6<='\uFFFF')) ) {s = 19;}

                        else if ( (LA14_6=='\"') ) {s = 20;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_18 = input.LA(1);

                        s = -1;
                        if ( (LA14_18=='\"') ) {s = 29;}

                        else if ( ((LA14_18>='\u0000' && LA14_18<='!')||(LA14_18>='#' && LA14_18<='\uFFFF')) ) {s = 30;}

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