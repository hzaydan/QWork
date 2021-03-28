package org.qwork.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArabicLexer extends Lexer {
    public static final int RULE_ID=13;
    public static final int RULE_WS=5;
    public static final int RULE_AHARAKAH=8;
    public static final int RULE_STRING=15;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_ANONLETTER=10;
    public static final int RULE_ADIGIT=7;
    public static final int RULE_ADIGITS=11;
    public static final int RULE_SL_COMMENT=17;
    public static final int RULE_KALEMAH=12;
    public static final int RULE_INT=14;
    public static final int RULE_AWORD=4;
    public static final int RULE_ML_COMMENT=16;
    public static final int RULE_ASHADDAH=9;
    public static final int RULE_ALETTER=6;
    public static final int EOF=-1;

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

    // $ANTLR start "RULE_ALETTER"
    public final void mRULE_ALETTER() throws RecognitionException {
        try {
            // InternalArabic.g:160:23: ( '\\u0621' .. '\\u064A' )
            // InternalArabic.g:160:25: '\\u0621' .. '\\u064A'
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
            // InternalArabic.g:162:22: ( '\\u0660' .. '\\u0669' )
            // InternalArabic.g:162:24: '\\u0660' .. '\\u0669'
            {
            matchRange('\u0660','\u0669'); 

            }

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
            // InternalArabic.g:164:15: ( ( '\\u064E' .. '\\u0650' | '\\u0652' ) )
            // InternalArabic.g:164:17: ( '\\u064E' .. '\\u0650' | '\\u0652' )
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
            int _type = RULE_ASHADDAH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArabic.g:166:15: ( '\\u0651' )
            // InternalArabic.g:166:17: '\\u0651'
            {
            match('\u0651'); 

            }

            state.type = _type;
            state.channel = _channel;
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
            // InternalArabic.g:168:17: ( ( '\\u0600' .. '\\u0620' | '\\u064B' .. '\\u06FF' ) )
            // InternalArabic.g:168:19: ( '\\u0600' .. '\\u0620' | '\\u064B' .. '\\u06FF' )
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

    // $ANTLR start "RULE_ADIGITS"
    public final void mRULE_ADIGITS() throws RecognitionException {
        try {
            int _type = RULE_ADIGITS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArabic.g:170:14: ( ( RULE_ADIGIT )+ )
            // InternalArabic.g:170:16: ( RULE_ADIGIT )+
            {
            // InternalArabic.g:170:16: ( RULE_ADIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0660' && LA1_0<='\u0669')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalArabic.g:170:16: RULE_ADIGIT
            	    {
            	    mRULE_ADIGIT(); 

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
    // $ANTLR end "RULE_ADIGITS"

    // $ANTLR start "RULE_AWORD"
    public final void mRULE_AWORD() throws RecognitionException {
        try {
            int _type = RULE_AWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArabic.g:172:12: ( ( RULE_ALETTER )+ )
            // InternalArabic.g:172:14: ( RULE_ALETTER )+
            {
            // InternalArabic.g:172:14: ( RULE_ALETTER )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0621' && LA2_0<='\u064A')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalArabic.g:172:14: RULE_ALETTER
            	    {
            	    mRULE_ALETTER(); 

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
            // InternalArabic.g:174:14: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // InternalArabic.g:174:16: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // InternalArabic.g:174:20: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\"') ) {
                    alt3=2;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalArabic.g:174:48: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
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
            // InternalArabic.g:176:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalArabic.g:176:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalArabic.g:176:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalArabic.g:176:11: '^'
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

            // InternalArabic.g:176:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
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
            	    break loop5;
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
            // InternalArabic.g:178:10: ( ( '0' .. '9' )+ )
            // InternalArabic.g:178:12: ( '0' .. '9' )+
            {
            // InternalArabic.g:178:12: ( '0' .. '9' )+
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
            	    // InternalArabic.g:178:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // InternalArabic.g:180:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalArabic.g:180:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalArabic.g:180:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalArabic.g:180:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalArabic.g:180:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalArabic.g:180:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalArabic.g:180:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalArabic.g:180:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalArabic.g:180:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalArabic.g:180:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalArabic.g:180:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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
            // InternalArabic.g:182:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalArabic.g:182:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalArabic.g:182:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalArabic.g:182:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // InternalArabic.g:184:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalArabic.g:184:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalArabic.g:184:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalArabic.g:184:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // InternalArabic.g:184:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalArabic.g:184:41: ( '\\r' )? '\\n'
                    {
                    // InternalArabic.g:184:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalArabic.g:184:41: '\\r'
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
            // InternalArabic.g:186:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalArabic.g:186:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalArabic.g:186:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // InternalArabic.g:188:16: ( . )
            // InternalArabic.g:188:18: .
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
        // InternalArabic.g:1:8: ( RULE_AHARAKAH | RULE_ASHADDAH | RULE_ANONLETTER | RULE_ADIGITS | RULE_AWORD | RULE_KALEMAH | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=13;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalArabic.g:1:10: RULE_AHARAKAH
                {
                mRULE_AHARAKAH(); 

                }
                break;
            case 2 :
                // InternalArabic.g:1:24: RULE_ASHADDAH
                {
                mRULE_ASHADDAH(); 

                }
                break;
            case 3 :
                // InternalArabic.g:1:38: RULE_ANONLETTER
                {
                mRULE_ANONLETTER(); 

                }
                break;
            case 4 :
                // InternalArabic.g:1:54: RULE_ADIGITS
                {
                mRULE_ADIGITS(); 

                }
                break;
            case 5 :
                // InternalArabic.g:1:67: RULE_AWORD
                {
                mRULE_AWORD(); 

                }
                break;
            case 6 :
                // InternalArabic.g:1:78: RULE_KALEMAH
                {
                mRULE_KALEMAH(); 

                }
                break;
            case 7 :
                // InternalArabic.g:1:91: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 8 :
                // InternalArabic.g:1:99: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 9 :
                // InternalArabic.g:1:108: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 10 :
                // InternalArabic.g:1:120: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 11 :
                // InternalArabic.g:1:136: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 12 :
                // InternalArabic.g:1:152: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 13 :
                // InternalArabic.g:1:160: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\3\uffff\1\20\2\uffff\2\15\2\uffff\2\15\21\uffff\1\34\1\uffff";
    static final String DFA15_eofS =
        "\37\uffff";
    static final String DFA15_minS =
        "\1\0\2\uffff\1\u0660\2\uffff\1\0\1\101\2\uffff\1\0\1\52\10\uffff\2\0\7\uffff\2\0";
    static final String DFA15_maxS =
        "\1\uffff\2\uffff\1\u0669\2\uffff\1\uffff\1\172\2\uffff\1\uffff\1\57\10\uffff\2\uffff\7\uffff\2\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\5\2\uffff\1\7\1\10\2\uffff\1\14\1\15\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\6\2\uffff";
    static final String DFA15_specialS =
        "\1\6\5\uffff\1\2\3\uffff\1\3\11\uffff\1\5\1\1\7\uffff\1\4\1\0}>";
    static final String[] DFA15_transitionS = {
            "\11\15\2\14\2\15\1\14\22\15\1\14\1\15\1\6\4\15\1\12\7\15\1\13\12\11\7\15\32\10\3\15\1\7\1\10\1\15\32\10\u0585\15\41\4\52\5\3\4\3\1\1\2\1\1\15\4\12\3\u0096\4\uf900\15",
            "",
            "",
            "\12\21",
            "",
            "",
            "\42\25\1\23\71\25\1\24\uffa3\25",
            "\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\0\30",
            "\1\31\4\uffff\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\42\36\1\35\uffdd\36",
            "\42\25\1\23\71\25\1\24\uffa3\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\42\25\1\23\71\25\1\24\uffa3\25",
            "\42\25\1\23\71\25\1\24\uffa3\25"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_AHARAKAH | RULE_ASHADDAH | RULE_ANONLETTER | RULE_ADIGITS | RULE_AWORD | RULE_KALEMAH | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_30 = input.LA(1);

                        s = -1;
                        if ( (LA15_30=='\"') ) {s = 19;}

                        else if ( (LA15_30=='\\') ) {s = 20;}

                        else if ( ((LA15_30>='\u0000' && LA15_30<='!')||(LA15_30>='#' && LA15_30<='[')||(LA15_30>=']' && LA15_30<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_21 = input.LA(1);

                        s = -1;
                        if ( (LA15_21=='\"') ) {s = 19;}

                        else if ( (LA15_21=='\\') ) {s = 20;}

                        else if ( ((LA15_21>='\u0000' && LA15_21<='!')||(LA15_21>='#' && LA15_21<='[')||(LA15_21>=']' && LA15_21<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_6 = input.LA(1);

                        s = -1;
                        if ( (LA15_6=='\"') ) {s = 19;}

                        else if ( (LA15_6=='\\') ) {s = 20;}

                        else if ( ((LA15_6>='\u0000' && LA15_6<='!')||(LA15_6>='#' && LA15_6<='[')||(LA15_6>=']' && LA15_6<='\uFFFF')) ) {s = 21;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_10 = input.LA(1);

                        s = -1;
                        if ( ((LA15_10>='\u0000' && LA15_10<='\uFFFF')) ) {s = 24;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_29 = input.LA(1);

                        s = -1;
                        if ( (LA15_29=='\"') ) {s = 19;}

                        else if ( (LA15_29=='\\') ) {s = 20;}

                        else if ( ((LA15_29>='\u0000' && LA15_29<='!')||(LA15_29>='#' && LA15_29<='[')||(LA15_29>=']' && LA15_29<='\uFFFF')) ) {s = 21;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_20 = input.LA(1);

                        s = -1;
                        if ( (LA15_20=='\"') ) {s = 29;}

                        else if ( ((LA15_20>='\u0000' && LA15_20<='!')||(LA15_20>='#' && LA15_20<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( ((LA15_0>='\u064E' && LA15_0<='\u0650')||LA15_0=='\u0652') ) {s = 1;}

                        else if ( (LA15_0=='\u0651') ) {s = 2;}

                        else if ( ((LA15_0>='\u0660' && LA15_0<='\u0669')) ) {s = 3;}

                        else if ( ((LA15_0>='\u0600' && LA15_0<='\u0620')||(LA15_0>='\u064B' && LA15_0<='\u064D')||(LA15_0>='\u0653' && LA15_0<='\u065F')||(LA15_0>='\u066A' && LA15_0<='\u06FF')) ) {s = 4;}

                        else if ( ((LA15_0>='\u0621' && LA15_0<='\u064A')) ) {s = 5;}

                        else if ( (LA15_0=='\"') ) {s = 6;}

                        else if ( (LA15_0=='^') ) {s = 7;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {s = 8;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 9;}

                        else if ( (LA15_0=='\'') ) {s = 10;}

                        else if ( (LA15_0=='/') ) {s = 11;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 12;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='.')||(LA15_0>=':' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\u05FF')||(LA15_0>='\u0700' && LA15_0<='\uFFFF')) ) {s = 13;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}