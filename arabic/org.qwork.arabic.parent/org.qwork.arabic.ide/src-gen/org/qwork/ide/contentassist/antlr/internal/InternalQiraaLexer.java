package org.qwork.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQiraaLexer extends Lexer {
    public static final int RULE_AHARAKAH=8;
    public static final int RULE_STRING=15;
    public static final int RULE_ANONLETTER=12;
    public static final int RULE_SL_COMMENT=17;
    public static final int T__19=19;
    public static final int RULE_KALEMAH=7;
    public static final int RULE_ASHADDAH=11;
    public static final int RULE_ALETTER=6;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=13;
    public static final int RULE_WS=4;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_ADIGITS=9;
    public static final int RULE_ADIGIT=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=14;
    public static final int T__29=29;
    public static final int RULE_AWORD=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=16;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalQiraaLexer() {;} 
    public InternalQiraaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalQiraaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalQiraa.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQiraa.g:11:7: ( '\\u062D\\u0631\\u0641' )
            // InternalQiraa.g:11:9: '\\u062D\\u0631\\u0641'
            {
            match("\u062D\u0631\u0641"); 


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
            // InternalQiraa.g:12:7: ( '\\u0647\\u0648' )
            // InternalQiraa.g:12:9: '\\u0647\\u0648'
            {
            match("\u0647\u0648"); 


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
            // InternalQiraa.g:13:7: ( '\\u0623\\u0648' )
            // InternalQiraa.g:13:9: '\\u0623\\u0648'
            {
            match("\u0623\u0648"); 


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
            // InternalQiraa.g:14:7: ( '\\u0630\\u0627\\u062A\\u0647' )
            // InternalQiraa.g:14:9: '\\u0630\\u0627\\u062A\\u0647'
            {
            match("\u0630\u0627\u062A\u0647"); 


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
            // InternalQiraa.g:15:7: ( '\\u062D\\u0631\\u0643\\u0629' )
            // InternalQiraa.g:15:9: '\\u062D\\u0631\\u0643\\u0629'
            {
            match("\u062D\u0631\u0643\u0629"); 


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
            // InternalQiraa.g:16:7: ( '\\u0647\\u064A' )
            // InternalQiraa.g:16:9: '\\u0647\\u064A'
            {
            match("\u0647\u064A"); 


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
            // InternalQiraa.g:17:7: ( '\\u0642\\u0627\\u0631\\u0626' )
            // InternalQiraa.g:17:9: '\\u0642\\u0627\\u0631\\u0626'
            {
            match("\u0642\u0627\u0631\u0626"); 


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
            // InternalQiraa.g:18:7: ( '\\u0631\\u0627\\u0648' )
            // InternalQiraa.g:18:9: '\\u0631\\u0627\\u0648'
            {
            match("\u0631\u0627\u0648"); 


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
            // InternalQiraa.g:19:7: ( '\\u0639\\u0646' )
            // InternalQiraa.g:19:9: '\\u0639\\u0646'
            {
            match("\u0639\u0646"); 


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
            // InternalQiraa.g:20:7: ( '\\u0627\\u0633\\u0645\\u0647' )
            // InternalQiraa.g:20:9: '\\u0627\\u0633\\u0645\\u0647'
            {
            match("\u0627\u0633\u0645\u0647"); 


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
            // InternalQiraa.g:21:7: ( '\\u0644\\u0642\\u0628\\u0647' )
            // InternalQiraa.g:21:9: '\\u0644\\u0642\\u0628\\u0647'
            {
            match("\u0644\u0642\u0628\u0647"); 


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
            // InternalQiraa.g:22:7: ( '\\u062A\\u0648\\u0641\\u064A' )
            // InternalQiraa.g:22:9: '\\u062A\\u0648\\u0641\\u064A'
            {
            match("\u062A\u0648\u0641\u064A"); 


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
            // InternalQiraa.g:23:7: ( '\\u0637\\u0631\\u064A\\u0642' )
            // InternalQiraa.g:23:9: '\\u0637\\u0631\\u064A\\u0642'
            {
            match("\u0637\u0631\u064A\u0642"); 


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
            // InternalQiraa.g:24:7: ( '\\u0645\\u0646' )
            // InternalQiraa.g:24:9: '\\u0645\\u0646'
            {
            match("\u0645\u0646"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "RULE_ALETTER"
    public final void mRULE_ALETTER() throws RecognitionException {
        try {
            int _type = RULE_ALETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQiraa.g:1669:14: ( '\\u0621' .. '\\u064A' )
            // InternalQiraa.g:1669:16: '\\u0621' .. '\\u064A'
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
            // InternalQiraa.g:1671:22: ( '\\u0660' .. '\\u0669' )
            // InternalQiraa.g:1671:24: '\\u0660' .. '\\u0669'
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
            // InternalQiraa.g:1673:15: ( ( '\\u064E' .. '\\u0650' | '\\u0652' ) )
            // InternalQiraa.g:1673:17: ( '\\u064E' .. '\\u0650' | '\\u0652' )
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
            // InternalQiraa.g:1675:15: ( '\\u0651' )
            // InternalQiraa.g:1675:17: '\\u0651'
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
            // InternalQiraa.g:1677:17: ( ( '\\u0600' .. '\\u0620' | '\\u064B' .. '\\u06FF' ) )
            // InternalQiraa.g:1677:19: ( '\\u0600' .. '\\u0620' | '\\u064B' .. '\\u06FF' )
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
            // InternalQiraa.g:1679:14: ( ( RULE_ADIGIT )+ )
            // InternalQiraa.g:1679:16: ( RULE_ADIGIT )+
            {
            // InternalQiraa.g:1679:16: ( RULE_ADIGIT )+
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
            	    // InternalQiraa.g:1679:16: RULE_ADIGIT
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
            // InternalQiraa.g:1681:12: ( ( RULE_ALETTER )+ )
            // InternalQiraa.g:1681:14: ( RULE_ALETTER )+
            {
            // InternalQiraa.g:1681:14: ( RULE_ALETTER )+
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
            	    // InternalQiraa.g:1681:14: RULE_ALETTER
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
            // InternalQiraa.g:1683:14: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // InternalQiraa.g:1683:16: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // InternalQiraa.g:1683:20: ( options {greedy=false; } : . )*
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
            	    // InternalQiraa.g:1683:48: .
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
            // InternalQiraa.g:1685:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalQiraa.g:1685:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalQiraa.g:1685:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalQiraa.g:1685:11: '^'
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

            // InternalQiraa.g:1685:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalQiraa.g:
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
            // InternalQiraa.g:1687:10: ( ( '0' .. '9' )+ )
            // InternalQiraa.g:1687:12: ( '0' .. '9' )+
            {
            // InternalQiraa.g:1687:12: ( '0' .. '9' )+
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
            	    // InternalQiraa.g:1687:13: '0' .. '9'
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
            // InternalQiraa.g:1689:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalQiraa.g:1689:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalQiraa.g:1689:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalQiraa.g:1689:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalQiraa.g:1689:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalQiraa.g:1689:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalQiraa.g:1689:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalQiraa.g:1689:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalQiraa.g:1689:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalQiraa.g:1689:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalQiraa.g:1689:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalQiraa.g:1691:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalQiraa.g:1691:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalQiraa.g:1691:24: ( options {greedy=false; } : . )*
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
            	    // InternalQiraa.g:1691:52: .
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
            // InternalQiraa.g:1693:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalQiraa.g:1693:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalQiraa.g:1693:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQiraa.g:1693:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalQiraa.g:1693:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalQiraa.g:1693:41: ( '\\r' )? '\\n'
                    {
                    // InternalQiraa.g:1693:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalQiraa.g:1693:41: '\\r'
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
            // InternalQiraa.g:1695:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalQiraa.g:1695:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalQiraa.g:1695:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalQiraa.g:
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
            // InternalQiraa.g:1697:16: ( . )
            // InternalQiraa.g:1697:18: .
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
        // InternalQiraa.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_ALETTER | RULE_AHARAKAH | RULE_ASHADDAH | RULE_ANONLETTER | RULE_ADIGITS | RULE_AWORD | RULE_KALEMAH | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=28;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalQiraa.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // InternalQiraa.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // InternalQiraa.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // InternalQiraa.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // InternalQiraa.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // InternalQiraa.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // InternalQiraa.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // InternalQiraa.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // InternalQiraa.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // InternalQiraa.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // InternalQiraa.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // InternalQiraa.g:1:76: T__30
                {
                mT__30(); 

                }
                break;
            case 13 :
                // InternalQiraa.g:1:82: T__31
                {
                mT__31(); 

                }
                break;
            case 14 :
                // InternalQiraa.g:1:88: T__32
                {
                mT__32(); 

                }
                break;
            case 15 :
                // InternalQiraa.g:1:94: RULE_ALETTER
                {
                mRULE_ALETTER(); 

                }
                break;
            case 16 :
                // InternalQiraa.g:1:107: RULE_AHARAKAH
                {
                mRULE_AHARAKAH(); 

                }
                break;
            case 17 :
                // InternalQiraa.g:1:121: RULE_ASHADDAH
                {
                mRULE_ASHADDAH(); 

                }
                break;
            case 18 :
                // InternalQiraa.g:1:135: RULE_ANONLETTER
                {
                mRULE_ANONLETTER(); 

                }
                break;
            case 19 :
                // InternalQiraa.g:1:151: RULE_ADIGITS
                {
                mRULE_ADIGITS(); 

                }
                break;
            case 20 :
                // InternalQiraa.g:1:164: RULE_AWORD
                {
                mRULE_AWORD(); 

                }
                break;
            case 21 :
                // InternalQiraa.g:1:175: RULE_KALEMAH
                {
                mRULE_KALEMAH(); 

                }
                break;
            case 22 :
                // InternalQiraa.g:1:188: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // InternalQiraa.g:1:196: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // InternalQiraa.g:1:205: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // InternalQiraa.g:1:217: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // InternalQiraa.g:1:233: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // InternalQiraa.g:1:249: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // InternalQiraa.g:1:257: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\15\33\2\uffff\1\53\1\uffff\2\31\2\uffff\2\31\2\uffff\1\34\2\uffff\1\70\1\71\1\72\3\34\1\76\4\34\1\103\15\uffff\1\107\1\34\3\uffff\2\34\1\113\1\uffff\4\34\2\uffff\1\104\2\uffff\1\120\1\121\1\122\1\uffff\1\123\1\124\1\125\1\126\7\uffff";
    static final String DFA15_eofS =
        "\127\uffff";
    static final String DFA15_minS =
        "\1\0\15\u0621\2\uffff\1\u0660\1\uffff\1\0\1\101\2\uffff\1\0\1\52\2\uffff\1\u0641\2\uffff\3\u0621\1\u062a\1\u0631\1\u0648\1\u0621\1\u0645\1\u0628\1\u0641\1\u064a\1\u0621\5\uffff\2\0\6\uffff\1\u0621\1\u0629\3\uffff\1\u0647\1\u0626\1\u0621\1\uffff\2\u0647\1\u064a\1\u0642\2\uffff\2\0\1\uffff\3\u0621\1\uffff\4\u0621\7\uffff";
    static final String DFA15_maxS =
        "\1\uffff\15\u064a\2\uffff\1\u0669\1\uffff\1\uffff\1\172\2\uffff\1\uffff\1\57\2\uffff\1\u0643\2\uffff\3\u064a\1\u062a\1\u0631\1\u0648\1\u064a\1\u0645\1\u0628\1\u0641\2\u064a\5\uffff\2\uffff\6\uffff\1\u064a\1\u0629\3\uffff\1\u0647\1\u0626\1\u064a\1\uffff\2\u0647\1\u064a\1\u0642\2\uffff\2\uffff\1\uffff\3\u064a\1\uffff\4\u064a\7\uffff";
    static final String DFA15_acceptS =
        "\16\uffff\1\20\1\21\1\uffff\1\22\2\uffff\1\26\1\27\2\uffff\1\33\1\34\1\uffff\1\17\1\24\14\uffff\1\20\1\21\1\22\1\23\1\25\2\uffff\1\26\1\27\1\30\1\31\1\32\1\33\2\uffff\1\2\1\6\1\3\3\uffff\1\11\4\uffff\1\16\1\25\2\uffff\1\1\3\uffff\1\10\4\uffff\1\5\1\4\1\7\1\12\1\13\1\14\1\15";
    static final String DFA15_specialS =
        "\1\4\21\uffff\1\3\3\uffff\1\6\27\uffff\1\5\1\1\25\uffff\1\2\1\0\20\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\31\2\30\2\31\1\30\22\31\1\30\1\31\1\22\4\31\1\26\7\31\1\27\12\25\7\31\32\24\3\31\1\23\1\24\1\31\32\24\u0585\31\41\21\2\15\1\3\3\15\1\10\2\15\1\12\2\15\1\1\2\15\1\4\1\6\5\15\1\13\1\15\1\7\10\15\1\5\1\15\1\11\1\14\1\15\1\2\3\15\3\21\3\16\1\17\1\16\15\21\12\20\u0096\21\uf900\31",
            "\20\34\1\32\31\34",
            "\47\34\1\35\1\34\1\36",
            "\47\34\1\37\2\34",
            "\6\34\1\40\43\34",
            "\6\34\1\41\43\34",
            "\6\34\1\42\43\34",
            "\45\34\1\43\4\34",
            "\22\34\1\44\27\34",
            "\41\34\1\45\10\34",
            "\47\34\1\46\2\34",
            "\20\34\1\47\31\34",
            "\45\34\1\50\4\34",
            "\52\34",
            "",
            "",
            "\12\54",
            "",
            "\42\57\1\55\71\57\1\56\uffa3\57",
            "\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\0\62",
            "\1\63\4\uffff\1\64",
            "",
            "",
            "\1\66\1\uffff\1\67",
            "",
            "",
            "\52\34",
            "\52\34",
            "\52\34",
            "\1\73",
            "\1\74",
            "\1\75",
            "\52\34",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\52\34",
            "",
            "",
            "",
            "",
            "",
            "\42\106\1\105\uffdd\106",
            "\42\57\1\55\71\57\1\56\uffa3\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\34",
            "\1\110",
            "",
            "",
            "",
            "\1\111",
            "\1\112",
            "\52\34",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "",
            "\42\57\1\55\71\57\1\56\uffa3\57",
            "\42\57\1\55\71\57\1\56\uffa3\57",
            "",
            "\52\34",
            "\52\34",
            "\52\34",
            "",
            "\52\34",
            "\52\34",
            "\52\34",
            "\52\34",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_ALETTER | RULE_AHARAKAH | RULE_ASHADDAH | RULE_ANONLETTER | RULE_ADIGITS | RULE_AWORD | RULE_KALEMAH | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_70 = input.LA(1);

                        s = -1;
                        if ( (LA15_70=='\"') ) {s = 45;}

                        else if ( (LA15_70=='\\') ) {s = 46;}

                        else if ( ((LA15_70>='\u0000' && LA15_70<='!')||(LA15_70>='#' && LA15_70<='[')||(LA15_70>=']' && LA15_70<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_47 = input.LA(1);

                        s = -1;
                        if ( (LA15_47=='\"') ) {s = 45;}

                        else if ( (LA15_47=='\\') ) {s = 46;}

                        else if ( ((LA15_47>='\u0000' && LA15_47<='!')||(LA15_47>='#' && LA15_47<='[')||(LA15_47>=']' && LA15_47<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_69 = input.LA(1);

                        s = -1;
                        if ( (LA15_69=='\"') ) {s = 45;}

                        else if ( (LA15_69=='\\') ) {s = 46;}

                        else if ( ((LA15_69>='\u0000' && LA15_69<='!')||(LA15_69>='#' && LA15_69<='[')||(LA15_69>=']' && LA15_69<='\uFFFF')) ) {s = 47;}

                        else s = 68;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_18 = input.LA(1);

                        s = -1;
                        if ( (LA15_18=='\"') ) {s = 45;}

                        else if ( (LA15_18=='\\') ) {s = 46;}

                        else if ( ((LA15_18>='\u0000' && LA15_18<='!')||(LA15_18>='#' && LA15_18<='[')||(LA15_18>=']' && LA15_18<='\uFFFF')) ) {s = 47;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='\u062D') ) {s = 1;}

                        else if ( (LA15_0=='\u0647') ) {s = 2;}

                        else if ( (LA15_0=='\u0623') ) {s = 3;}

                        else if ( (LA15_0=='\u0630') ) {s = 4;}

                        else if ( (LA15_0=='\u0642') ) {s = 5;}

                        else if ( (LA15_0=='\u0631') ) {s = 6;}

                        else if ( (LA15_0=='\u0639') ) {s = 7;}

                        else if ( (LA15_0=='\u0627') ) {s = 8;}

                        else if ( (LA15_0=='\u0644') ) {s = 9;}

                        else if ( (LA15_0=='\u062A') ) {s = 10;}

                        else if ( (LA15_0=='\u0637') ) {s = 11;}

                        else if ( (LA15_0=='\u0645') ) {s = 12;}

                        else if ( ((LA15_0>='\u0621' && LA15_0<='\u0622')||(LA15_0>='\u0624' && LA15_0<='\u0626')||(LA15_0>='\u0628' && LA15_0<='\u0629')||(LA15_0>='\u062B' && LA15_0<='\u062C')||(LA15_0>='\u062E' && LA15_0<='\u062F')||(LA15_0>='\u0632' && LA15_0<='\u0636')||LA15_0=='\u0638'||(LA15_0>='\u063A' && LA15_0<='\u0641')||LA15_0=='\u0643'||LA15_0=='\u0646'||(LA15_0>='\u0648' && LA15_0<='\u064A')) ) {s = 13;}

                        else if ( ((LA15_0>='\u064E' && LA15_0<='\u0650')||LA15_0=='\u0652') ) {s = 14;}

                        else if ( (LA15_0=='\u0651') ) {s = 15;}

                        else if ( ((LA15_0>='\u0660' && LA15_0<='\u0669')) ) {s = 16;}

                        else if ( ((LA15_0>='\u0600' && LA15_0<='\u0620')||(LA15_0>='\u064B' && LA15_0<='\u064D')||(LA15_0>='\u0653' && LA15_0<='\u065F')||(LA15_0>='\u066A' && LA15_0<='\u06FF')) ) {s = 17;}

                        else if ( (LA15_0=='\"') ) {s = 18;}

                        else if ( (LA15_0=='^') ) {s = 19;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {s = 20;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 21;}

                        else if ( (LA15_0=='\'') ) {s = 22;}

                        else if ( (LA15_0=='/') ) {s = 23;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 24;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='.')||(LA15_0>=':' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\u05FF')||(LA15_0>='\u0700' && LA15_0<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_46 = input.LA(1);

                        s = -1;
                        if ( (LA15_46=='\"') ) {s = 69;}

                        else if ( ((LA15_46>='\u0000' && LA15_46<='!')||(LA15_46>='#' && LA15_46<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_22 = input.LA(1);

                        s = -1;
                        if ( ((LA15_22>='\u0000' && LA15_22<='\uFFFF')) ) {s = 50;}

                        else s = 25;

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