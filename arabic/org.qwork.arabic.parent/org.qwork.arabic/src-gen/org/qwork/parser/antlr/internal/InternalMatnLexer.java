package org.qwork.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMatnLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_KALEMAH=7;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=16;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int RULE_AWORD=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__21=21;
    public static final int RULE_BASMALAH=4;
    public static final int RULE_AHARAKAH=9;
    public static final int RULE_STRING=17;
    public static final int RULE_ANONLETTER=14;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_ASHADDAH=11;
    public static final int T__35=35;
    public static final int RULE_ALETTER=8;
    public static final int RULE_ATANWEEN=10;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ALIGATURES=12;
    public static final int RULE_WS=19;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_ADIGIT=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalMatnLexer() {;} 
    public InternalMatnLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMatnLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMatn.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMatn.g:11:7: ( '*' )
            // InternalMatn.g:11:9: '*'
            {
            match('*'); 

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
            // InternalMatn.g:12:7: ( '(' )
            // InternalMatn.g:12:9: '('
            {
            match('('); 

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
            // InternalMatn.g:13:7: ( ')' )
            // InternalMatn.g:13:9: ')'
            {
            match(')'); 

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
            // InternalMatn.g:14:7: ( '-' )
            // InternalMatn.g:14:9: '-'
            {
            match('-'); 

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
            // InternalMatn.g:15:7: ( '...' )
            // InternalMatn.g:15:9: '...'
            {
            match("..."); 


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
            // InternalMatn.g:16:7: ( '\\u0627\\u0633\\u0645\\u0647' )
            // InternalMatn.g:16:9: '\\u0627\\u0633\\u0645\\u0647'
            {
            match("\u0627\u0633\u0645\u0647"); 


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
            // InternalMatn.g:17:7: ( '\\u0644\\u0642\\u0628\\u0647' )
            // InternalMatn.g:17:9: '\\u0644\\u0642\\u0628\\u0647'
            {
            match("\u0644\u0642\u0628\u0647"); 


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
            // InternalMatn.g:18:7: ( '\\u062A\\u0648\\u0641\\u064A' )
            // InternalMatn.g:18:9: '\\u062A\\u0648\\u0641\\u064A'
            {
            match("\u062A\u0648\u0641\u064A"); 


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
            // InternalMatn.g:19:7: ( '\\u0631\\u062D\\u0645\\u0647' )
            // InternalMatn.g:19:9: '\\u0631\\u062D\\u0645\\u0647'
            {
            match("\u0631\u062D\u0645\u0647"); 


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
            // InternalMatn.g:20:7: ( '\\u0623\\u0643\\u0631\\u0645\\u0647' )
            // InternalMatn.g:20:9: '\\u0623\\u0643\\u0631\\u0645\\u0647'
            {
            match("\u0623\u0643\u0631\u0645\u0647"); 


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
            // InternalMatn.g:21:7: ( '\\u0627\\u0644\\u0644\\u0647' )
            // InternalMatn.g:21:9: '\\u0627\\u0644\\u0644\\u0647'
            {
            match("\u0627\u0644\u0644\u0647"); 


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
            // InternalMatn.g:22:7: ( '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' )
            // InternalMatn.g:22:9: '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645'
            {
            match("\u0627\u0644\u0625\u0645\u0627\u0645"); 


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
            // InternalMatn.g:23:7: ( '\\u0642\\u0627\\u0631\\u0626' )
            // InternalMatn.g:23:9: '\\u0642\\u0627\\u0631\\u0626'
            {
            match("\u0642\u0627\u0631\u0626"); 


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
            // InternalMatn.g:24:7: ( '\\u0631\\u0627\\u0648' )
            // InternalMatn.g:24:9: '\\u0631\\u0627\\u0648'
            {
            match("\u0631\u0627\u0648"); 


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
            // InternalMatn.g:25:7: ( '\\u0639\\u0646' )
            // InternalMatn.g:25:9: '\\u0639\\u0646'
            {
            match("\u0639\u0646"); 


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
            // InternalMatn.g:26:7: ( '\\u0637\\u0631\\u064A\\u0642' )
            // InternalMatn.g:26:9: '\\u0637\\u0631\\u064A\\u0642'
            {
            match("\u0637\u0631\u064A\u0642"); 


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
            // InternalMatn.g:27:7: ( '\\u062A\\u0644\\u0627\\u0648\\u0629' )
            // InternalMatn.g:27:9: '\\u062A\\u0644\\u0627\\u0648\\u0629'
            {
            match("\u062A\u0644\u0627\u0648\u0629"); 


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
            // InternalMatn.g:28:7: ( '\\u062E\\u0627\\u0644\\u0635' )
            // InternalMatn.g:28:9: '\\u062E\\u0627\\u0644\\u0635'
            {
            match("\u062E\u0627\u0644\u0635"); 


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
            // InternalMatn.g:29:7: ( '\\u0644' )
            // InternalMatn.g:29:9: '\\u0644'
            {
            match('\u0644'); 

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
            // InternalMatn.g:30:7: ( '\\u0645\\u0631\\u0643\\u0628' )
            // InternalMatn.g:30:9: '\\u0645\\u0631\\u0643\\u0628'
            {
            match("\u0645\u0631\u0643\u0628"); 


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
            // InternalMatn.g:31:7: ( '\\u0645\\u0646' )
            // InternalMatn.g:31:9: '\\u0645\\u0646'
            {
            match("\u0645\u0646"); 


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
            // InternalMatn.g:32:7: ( '\\u0642\\u064A\\u062F' )
            // InternalMatn.g:32:9: '\\u0642\\u064A\\u062F'
            {
            match("\u0642\u064A\u062F"); 


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
            // InternalMatn.g:33:7: ( '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' )
            // InternalMatn.g:33:9: '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D'
            {
            match("\u0627\u0635\u0637\u0644\u0627\u062D"); 


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
            // InternalMatn.g:34:7: ( '\\u064A\\u0639\\u0646\\u064A' )
            // InternalMatn.g:34:9: '\\u064A\\u0639\\u0646\\u064A'
            {
            match("\u064A\u0639\u0646\u064A"); 


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
            // InternalMatn.g:35:7: ( '\\u0648' )
            // InternalMatn.g:35:9: '\\u0648'
            {
            match('\u0648'); 

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
            // InternalMatn.g:36:7: ( '\\u0631\\u0645\\u0632' )
            // InternalMatn.g:36:9: '\\u0631\\u0645\\u0632'
            {
            match("\u0631\u0645\u0632"); 


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
            // InternalMatn.g:37:7: ( '\\u0627\\u0644\\u0623\\u0648\\u0644' )
            // InternalMatn.g:37:9: '\\u0627\\u0644\\u0623\\u0648\\u0644'
            {
            match("\u0627\u0644\u0623\u0648\u0644"); 


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
            // InternalMatn.g:38:7: ( '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' )
            // InternalMatn.g:38:9: '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A'
            {
            match("\u0627\u0644\u062B\u0627\u0646\u064A"); 


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
            // InternalMatn.g:39:7: ( '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' )
            // InternalMatn.g:39:9: '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B'
            {
            match("\u0627\u0644\u062B\u0627\u0644\u062B"); 


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
            // InternalMatn.g:40:7: ( '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' )
            // InternalMatn.g:40:9: '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631'
            {
            match("\u0627\u0644\u0623\u062E\u064A\u0631"); 


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
            // InternalMatn.g:41:7: ( '\\u062D\\u0631\\u0641' )
            // InternalMatn.g:41:9: '\\u062D\\u0631\\u0641'
            {
            match("\u062D\u0631\u0641"); 


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
            // InternalMatn.g:42:7: ( '\\u0647\\u0648' )
            // InternalMatn.g:42:9: '\\u0647\\u0648'
            {
            match("\u0647\u0648"); 


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
            // InternalMatn.g:43:7: ( '\\u0623\\u0648' )
            // InternalMatn.g:43:9: '\\u0623\\u0648'
            {
            match("\u0623\u0648"); 


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
            // InternalMatn.g:44:7: ( '\\u0630\\u0627\\u062A\\u0647' )
            // InternalMatn.g:44:9: '\\u0630\\u0627\\u062A\\u0647'
            {
            match("\u0630\u0627\u062A\u0647"); 


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
            // InternalMatn.g:45:7: ( '\\u062D\\u0631\\u0643\\u0629' )
            // InternalMatn.g:45:9: '\\u062D\\u0631\\u0643\\u0629'
            {
            match("\u062D\u0631\u0643\u0629"); 


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
            // InternalMatn.g:46:7: ( '\\u0647\\u064A' )
            // InternalMatn.g:46:9: '\\u0647\\u064A'
            {
            match("\u0647\u064A"); 


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
            // InternalMatn.g:47:7: ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' )
            // InternalMatn.g:47:9: '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'
            {
            match("\u0627\u0644\u0633\u0648\u0631\u0629"); 


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
            // InternalMatn.g:48:7: ( '\\u0627\\u0644\\u0622\\u064A\\u0629' )
            // InternalMatn.g:48:9: '\\u0627\\u0644\\u0622\\u064A\\u0629'
            {
            match("\u0627\u0644\u0622\u064A\u0629"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "RULE_BASMALAH"
    public final void mRULE_BASMALAH() throws RecognitionException {
        try {
            int _type = RULE_BASMALAH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMatn.g:1347:15: ( '\\u0628\\u0650\\u0633\\u0652\\u0645\\u0650 \\u0627\\u0644\\u0644\\u0651\\u064E\\u0647\\u0650 \\u0627\\u0644\\u0631\\u0651\\u064E\\u062D\\u0652\\u0645\\u064E\\u0646\\u0650 \\u0627\\u0644\\u0631\\u0651\\u064E\\u062D\\u0650\\u064A\\u0645\\u0650' )
            // InternalMatn.g:1347:17: '\\u0628\\u0650\\u0633\\u0652\\u0645\\u0650 \\u0627\\u0644\\u0644\\u0651\\u064E\\u0647\\u0650 \\u0627\\u0644\\u0631\\u0651\\u064E\\u062D\\u0652\\u0645\\u064E\\u0646\\u0650 \\u0627\\u0644\\u0631\\u0651\\u064E\\u062D\\u0650\\u064A\\u0645\\u0650'
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
            // InternalMatn.g:1349:12: ( ( RULE_ALETTER | RULE_AHARAKAH | RULE_ATANWEEN | RULE_ASHADDAH )+ )
            // InternalMatn.g:1349:14: ( RULE_ALETTER | RULE_AHARAKAH | RULE_ATANWEEN | RULE_ASHADDAH )+
            {
            // InternalMatn.g:1349:14: ( RULE_ALETTER | RULE_AHARAKAH | RULE_ATANWEEN | RULE_ASHADDAH )+
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
            	    // InternalMatn.g:
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
            // InternalMatn.g:1351:26: ( '\\uFDF0' .. '\\uFDFD' )
            // InternalMatn.g:1351:28: '\\uFDF0' .. '\\uFDFD'
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
            // InternalMatn.g:1353:23: ( '\\u0621' .. '\\u064A' )
            // InternalMatn.g:1353:25: '\\u0621' .. '\\u064A'
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
            // InternalMatn.g:1355:22: ( '\\u0660' .. '\\u0669' )
            // InternalMatn.g:1355:24: '\\u0660' .. '\\u0669'
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
            // InternalMatn.g:1357:24: ( '\\u064B' .. '\\u064D' )
            // InternalMatn.g:1357:26: '\\u064B' .. '\\u064D'
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
            // InternalMatn.g:1359:24: ( ( '\\u064E' .. '\\u0650' | '\\u0652' ) )
            // InternalMatn.g:1359:26: ( '\\u064E' .. '\\u0650' | '\\u0652' )
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
            // InternalMatn.g:1361:24: ( '\\u0651' )
            // InternalMatn.g:1361:26: '\\u0651'
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
            // InternalMatn.g:1363:26: ( ( '\\u0600' .. '\\u0620' | '\\u064B' .. '\\u06FF' ) )
            // InternalMatn.g:1363:28: ( '\\u0600' .. '\\u0620' | '\\u064B' .. '\\u06FF' )
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
            // InternalMatn.g:1365:14: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // InternalMatn.g:1365:16: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // InternalMatn.g:1365:20: ( options {greedy=false; } : . )*
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
            	    // InternalMatn.g:1365:48: .
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
            // InternalMatn.g:1367:17: ( 'deactivated' )
            // InternalMatn.g:1367:19: 'deactivated'
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
            // InternalMatn.g:1369:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMatn.g:1369:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMatn.g:1369:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMatn.g:1369:11: '^'
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

            // InternalMatn.g:1369:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMatn.g:
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
            // InternalMatn.g:1371:10: ( ( '0' .. '9' )+ )
            // InternalMatn.g:1371:12: ( '0' .. '9' )+
            {
            // InternalMatn.g:1371:12: ( '0' .. '9' )+
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
            	    // InternalMatn.g:1371:13: '0' .. '9'
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
            // InternalMatn.g:1373:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMatn.g:1373:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMatn.g:1373:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalMatn.g:1373:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMatn.g:1373:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalMatn.g:1373:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMatn.g:1373:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalMatn.g:1373:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMatn.g:1373:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalMatn.g:1373:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMatn.g:1373:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalMatn.g:1375:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMatn.g:1375:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMatn.g:1375:24: ( options {greedy=false; } : . )*
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
            	    // InternalMatn.g:1375:52: .
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
            // InternalMatn.g:1377:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMatn.g:1377:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMatn.g:1377:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalMatn.g:
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
            // InternalMatn.g:1379:16: ( . )
            // InternalMatn.g:1379:18: .
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
        // InternalMatn.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | RULE_BASMALAH | RULE_AWORD | RULE_KALEMAH | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=48;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // InternalMatn.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // InternalMatn.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // InternalMatn.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // InternalMatn.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // InternalMatn.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // InternalMatn.g:1:40: T__26
                {
                mT__26(); 

                }
                break;
            case 7 :
                // InternalMatn.g:1:46: T__27
                {
                mT__27(); 

                }
                break;
            case 8 :
                // InternalMatn.g:1:52: T__28
                {
                mT__28(); 

                }
                break;
            case 9 :
                // InternalMatn.g:1:58: T__29
                {
                mT__29(); 

                }
                break;
            case 10 :
                // InternalMatn.g:1:64: T__30
                {
                mT__30(); 

                }
                break;
            case 11 :
                // InternalMatn.g:1:70: T__31
                {
                mT__31(); 

                }
                break;
            case 12 :
                // InternalMatn.g:1:76: T__32
                {
                mT__32(); 

                }
                break;
            case 13 :
                // InternalMatn.g:1:82: T__33
                {
                mT__33(); 

                }
                break;
            case 14 :
                // InternalMatn.g:1:88: T__34
                {
                mT__34(); 

                }
                break;
            case 15 :
                // InternalMatn.g:1:94: T__35
                {
                mT__35(); 

                }
                break;
            case 16 :
                // InternalMatn.g:1:100: T__36
                {
                mT__36(); 

                }
                break;
            case 17 :
                // InternalMatn.g:1:106: T__37
                {
                mT__37(); 

                }
                break;
            case 18 :
                // InternalMatn.g:1:112: T__38
                {
                mT__38(); 

                }
                break;
            case 19 :
                // InternalMatn.g:1:118: T__39
                {
                mT__39(); 

                }
                break;
            case 20 :
                // InternalMatn.g:1:124: T__40
                {
                mT__40(); 

                }
                break;
            case 21 :
                // InternalMatn.g:1:130: T__41
                {
                mT__41(); 

                }
                break;
            case 22 :
                // InternalMatn.g:1:136: T__42
                {
                mT__42(); 

                }
                break;
            case 23 :
                // InternalMatn.g:1:142: T__43
                {
                mT__43(); 

                }
                break;
            case 24 :
                // InternalMatn.g:1:148: T__44
                {
                mT__44(); 

                }
                break;
            case 25 :
                // InternalMatn.g:1:154: T__45
                {
                mT__45(); 

                }
                break;
            case 26 :
                // InternalMatn.g:1:160: T__46
                {
                mT__46(); 

                }
                break;
            case 27 :
                // InternalMatn.g:1:166: T__47
                {
                mT__47(); 

                }
                break;
            case 28 :
                // InternalMatn.g:1:172: T__48
                {
                mT__48(); 

                }
                break;
            case 29 :
                // InternalMatn.g:1:178: T__49
                {
                mT__49(); 

                }
                break;
            case 30 :
                // InternalMatn.g:1:184: T__50
                {
                mT__50(); 

                }
                break;
            case 31 :
                // InternalMatn.g:1:190: T__51
                {
                mT__51(); 

                }
                break;
            case 32 :
                // InternalMatn.g:1:196: T__52
                {
                mT__52(); 

                }
                break;
            case 33 :
                // InternalMatn.g:1:202: T__53
                {
                mT__53(); 

                }
                break;
            case 34 :
                // InternalMatn.g:1:208: T__54
                {
                mT__54(); 

                }
                break;
            case 35 :
                // InternalMatn.g:1:214: T__55
                {
                mT__55(); 

                }
                break;
            case 36 :
                // InternalMatn.g:1:220: T__56
                {
                mT__56(); 

                }
                break;
            case 37 :
                // InternalMatn.g:1:226: T__57
                {
                mT__57(); 

                }
                break;
            case 38 :
                // InternalMatn.g:1:232: T__58
                {
                mT__58(); 

                }
                break;
            case 39 :
                // InternalMatn.g:1:238: RULE_BASMALAH
                {
                mRULE_BASMALAH(); 

                }
                break;
            case 40 :
                // InternalMatn.g:1:252: RULE_AWORD
                {
                mRULE_AWORD(); 

                }
                break;
            case 41 :
                // InternalMatn.g:1:263: RULE_KALEMAH
                {
                mRULE_KALEMAH(); 

                }
                break;
            case 42 :
                // InternalMatn.g:1:276: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 43 :
                // InternalMatn.g:1:292: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 44 :
                // InternalMatn.g:1:300: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 45 :
                // InternalMatn.g:1:309: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 46 :
                // InternalMatn.g:1:321: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 47 :
                // InternalMatn.g:1:337: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 48 :
                // InternalMatn.g:1:345: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\5\uffff\1\37\1\50\1\52\11\50\1\72\4\50\1\uffff\1\37\1\104\1\37\2\uffff\2\37\7\uffff\3\50\1\uffff\1\50\1\uffff\6\50\1\130\2\50\1\133\3\50\1\137\1\50\1\uffff\1\50\1\143\1\144\2\50\3\uffff\1\104\5\uffff\14\50\1\170\1\171\1\50\1\uffff\1\50\1\174\1\uffff\3\50\1\uffff\1\50\1\u0081\1\50\2\uffff\2\50\1\uffff\1\147\1\uffff\1\104\1\u0086\1\u0087\7\50\1\u0090\1\u0091\1\50\1\u0093\2\uffff\1\50\1\u0095\1\uffff\1\u0096\1\u0097\1\u0098\1\u0099\1\uffff\1\u009a\1\u009b\1\50\1\104\2\uffff\1\50\1\u009f\4\50\1\u00a4\1\50\2\uffff\1\u00a6\1\uffff\1\u00a7\7\uffff\1\50\1\104\1\u00aa\1\uffff\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\uffff\1\u00af\2\uffff\1\50\1\104\7\uffff\4\104\1\u00b6\1\uffff";
    static final String DFA11_eofS =
        "\u00b7\uffff";
    static final String DFA11_minS =
        "\1\0\4\uffff\1\56\1\u0633\1\u0621\1\u0644\1\u0627\1\u0643\1\u0627\1\u0646\1\u0631\1\u0627\1\u0631\1\u0639\1\u0621\1\u0631\1\u0648\1\u0627\1\u0650\1\uffff\1\0\1\145\1\101\2\uffff\1\0\1\52\7\uffff\1\u0645\1\u0622\1\u0637\1\uffff\1\u0628\1\uffff\1\u0641\1\u0627\1\u0645\1\u0648\1\u0632\1\u0631\1\u0621\1\u0631\1\u062f\1\u0621\1\u064a\1\u0644\1\u0643\1\u0621\1\u0646\1\uffff\1\u0641\2\u0621\1\u062a\1\u0633\1\uffff\2\0\1\141\5\uffff\2\u0647\1\u0645\1\u062e\1\u0627\1\u0648\1\u064a\1\u0644\1\u0647\1\u064a\1\u0648\1\u0647\2\u0621\1\u0645\1\uffff\1\u0626\1\u0621\1\uffff\1\u0642\1\u0635\1\u0628\1\uffff\1\u064a\1\u0621\1\u0629\2\uffff\1\u0647\1\u0652\1\uffff\2\0\1\143\2\u0621\1\u0627\1\u0644\1\u064a\1\u0644\1\u0631\1\u0629\1\u0627\2\u0621\1\u0629\1\u0621\2\uffff\1\u0647\1\u0621\1\uffff\4\u0621\1\uffff\2\u0621\1\u0645\1\164\2\uffff\1\u0645\1\u0621\1\u0631\1\u064a\1\u062b\1\u0629\1\u0621\1\u062d\2\uffff\1\u0621\1\uffff\1\u0621\7\uffff\1\u0650\1\151\1\u0621\1\uffff\4\u0621\1\uffff\1\u0621\2\uffff\1\40\1\166\7\uffff\1\141\1\164\1\145\1\144\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\uffff\4\uffff\1\56\1\u0644\1\u0652\1\u0648\1\u0645\1\u0648\1\u064a\1\u0646\1\u0631\1\u0627\1\u0646\1\u0639\1\u0652\1\u0631\1\u064a\1\u0627\1\u0650\1\uffff\1\uffff\1\145\1\172\2\uffff\1\uffff\1\52\7\uffff\1\u0645\1\u0644\1\u0637\1\uffff\1\u0628\1\uffff\1\u0641\1\u0627\1\u0645\1\u0648\1\u0632\1\u0631\1\u0652\1\u0631\1\u062f\1\u0652\1\u064a\1\u0644\1\u0643\1\u0652\1\u0646\1\uffff\1\u0643\2\u0652\1\u062a\1\u0633\1\uffff\2\uffff\1\141\5\uffff\2\u0647\1\u0645\1\u0648\1\u0627\1\u0648\1\u064a\1\u0644\1\u0647\1\u064a\1\u0648\1\u0647\2\u0652\1\u0645\1\uffff\1\u0626\1\u0652\1\uffff\1\u0642\1\u0635\1\u0628\1\uffff\1\u064a\1\u0652\1\u0629\2\uffff\1\u0647\1\u0652\1\uffff\2\uffff\1\143\2\u0652\1\u0627\1\u0644\1\u064a\1\u0646\1\u0631\1\u0629\1\u0627\2\u0652\1\u0629\1\u0652\2\uffff\1\u0647\1\u0652\1\uffff\4\u0652\1\uffff\2\u0652\1\u0645\1\164\2\uffff\1\u0645\1\u0652\1\u0631\1\u064a\1\u062b\1\u0629\1\u0652\1\u062d\2\uffff\1\u0652\1\uffff\1\u0652\7\uffff\1\u0650\1\151\1\u0652\1\uffff\4\u0652\1\uffff\1\u0652\2\uffff\1\40\1\166\7\uffff\1\141\1\164\1\145\1\144\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\21\uffff\1\50\3\uffff\1\53\1\54\2\uffff\1\57\1\60\1\1\1\2\1\3\1\4\1\5\3\uffff\1\50\1\uffff\1\23\17\uffff\1\31\5\uffff\1\51\3\uffff\1\53\1\54\1\55\1\56\1\57\17\uffff\1\41\2\uffff\1\17\3\uffff\1\25\3\uffff\1\40\1\44\2\uffff\1\51\20\uffff\1\16\1\32\2\uffff\1\26\4\uffff\1\37\4\uffff\1\6\1\13\10\uffff\1\7\1\10\1\uffff\1\11\1\uffff\1\15\1\20\1\22\1\24\1\30\1\43\1\42\3\uffff\1\33\4\uffff\1\46\1\uffff\1\21\1\12\2\uffff\1\14\1\36\1\34\1\35\1\45\1\27\1\47\5\uffff\1\52";
    static final String DFA11_specialS =
        "\1\2\26\uffff\1\5\4\uffff\1\3\44\uffff\1\4\1\1\45\uffff\1\6\1\0\115\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\27\4\37\1\34\1\2\1\3\1\1\2\37\1\4\1\5\1\35\12\33\7\37\32\32\3\37\1\31\1\32\1\37\3\32\1\30\26\32\u05a6\37\2\26\1\12\3\26\1\6\1\25\1\26\1\10\2\26\1\22\1\16\1\26\1\24\1\11\5\26\1\15\1\26\1\14\10\26\1\13\1\26\1\7\1\17\1\26\1\23\1\21\1\26\1\20\10\26\uf9ad\37",
            "",
            "",
            "",
            "",
            "\1\44",
            "\1\45\1\uffff\1\47\16\uffff\1\46",
            "\41\50\1\51\20\50",
            "\1\54\3\uffff\1\53",
            "\1\56\5\uffff\1\55\27\uffff\1\57",
            "\1\60\4\uffff\1\61",
            "\1\62\42\uffff\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67\24\uffff\1\70",
            "\1\71",
            "\62\50",
            "\1\73",
            "\1\74\1\uffff\1\75",
            "\1\76",
            "\1\77",
            "",
            "\42\102\1\100\71\102\1\101\uffa3\102",
            "\1\103",
            "\32\104\4\uffff\1\104\1\uffff\32\104",
            "",
            "",
            "\0\106",
            "\1\107",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111",
            "\1\117\1\114\1\uffff\1\113\5\uffff\1\115\7\uffff\1\116\20\uffff\1\112",
            "\1\120",
            "",
            "\1\121",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\62\50",
            "\1\131",
            "\1\132",
            "\62\50",
            "\1\134",
            "\1\135",
            "\1\136",
            "\62\50",
            "\1\140",
            "",
            "\1\141\1\uffff\1\142",
            "\62\50",
            "\62\50",
            "\1\145",
            "\1\146",
            "",
            "\42\151\1\150\uffdd\151",
            "\42\102\1\100\71\102\1\101\uffa3\102",
            "\1\152",
            "",
            "",
            "",
            "",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\157\31\uffff\1\156",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\62\50",
            "\62\50",
            "\1\172",
            "",
            "\1\173",
            "\62\50",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "\1\u0080",
            "\62\50",
            "\1\u0082",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "",
            "\42\102\1\100\71\102\1\101\uffa3\102",
            "\42\102\1\100\71\102\1\101\uffa3\102",
            "\1\u0085",
            "\62\50",
            "\62\50",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008c\1\uffff\1\u008b",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\62\50",
            "\62\50",
            "\1\u0092",
            "\62\50",
            "",
            "",
            "\1\u0094",
            "\62\50",
            "",
            "\62\50",
            "\62\50",
            "\62\50",
            "\62\50",
            "",
            "\62\50",
            "\62\50",
            "\1\u009c",
            "\1\u009d",
            "",
            "",
            "\1\u009e",
            "\62\50",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\62\50",
            "\1\u00a5",
            "",
            "",
            "\62\50",
            "",
            "\62\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\62\50",
            "",
            "\62\50",
            "\62\50",
            "\62\50",
            "\62\50",
            "",
            "\62\50",
            "",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
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
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | RULE_BASMALAH | RULE_AWORD | RULE_KALEMAH | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_105 = input.LA(1);

                        s = -1;
                        if ( (LA11_105=='\"') ) {s = 64;}

                        else if ( (LA11_105=='\\') ) {s = 65;}

                        else if ( ((LA11_105>='\u0000' && LA11_105<='!')||(LA11_105>='#' && LA11_105<='[')||(LA11_105>=']' && LA11_105<='\uFFFF')) ) {s = 66;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_66 = input.LA(1);

                        s = -1;
                        if ( (LA11_66=='\"') ) {s = 64;}

                        else if ( (LA11_66=='\\') ) {s = 65;}

                        else if ( ((LA11_66>='\u0000' && LA11_66<='!')||(LA11_66>='#' && LA11_66<='[')||(LA11_66>=']' && LA11_66<='\uFFFF')) ) {s = 66;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='*') ) {s = 1;}

                        else if ( (LA11_0=='(') ) {s = 2;}

                        else if ( (LA11_0==')') ) {s = 3;}

                        else if ( (LA11_0=='-') ) {s = 4;}

                        else if ( (LA11_0=='.') ) {s = 5;}

                        else if ( (LA11_0=='\u0627') ) {s = 6;}

                        else if ( (LA11_0=='\u0644') ) {s = 7;}

                        else if ( (LA11_0=='\u062A') ) {s = 8;}

                        else if ( (LA11_0=='\u0631') ) {s = 9;}

                        else if ( (LA11_0=='\u0623') ) {s = 10;}

                        else if ( (LA11_0=='\u0642') ) {s = 11;}

                        else if ( (LA11_0=='\u0639') ) {s = 12;}

                        else if ( (LA11_0=='\u0637') ) {s = 13;}

                        else if ( (LA11_0=='\u062E') ) {s = 14;}

                        else if ( (LA11_0=='\u0645') ) {s = 15;}

                        else if ( (LA11_0=='\u064A') ) {s = 16;}

                        else if ( (LA11_0=='\u0648') ) {s = 17;}

                        else if ( (LA11_0=='\u062D') ) {s = 18;}

                        else if ( (LA11_0=='\u0647') ) {s = 19;}

                        else if ( (LA11_0=='\u0630') ) {s = 20;}

                        else if ( (LA11_0=='\u0628') ) {s = 21;}

                        else if ( ((LA11_0>='\u0621' && LA11_0<='\u0622')||(LA11_0>='\u0624' && LA11_0<='\u0626')||LA11_0=='\u0629'||(LA11_0>='\u062B' && LA11_0<='\u062C')||LA11_0=='\u062F'||(LA11_0>='\u0632' && LA11_0<='\u0636')||LA11_0=='\u0638'||(LA11_0>='\u063A' && LA11_0<='\u0641')||LA11_0=='\u0643'||LA11_0=='\u0646'||LA11_0=='\u0649'||(LA11_0>='\u064B' && LA11_0<='\u0652')) ) {s = 22;}

                        else if ( (LA11_0=='\"') ) {s = 23;}

                        else if ( (LA11_0=='d') ) {s = 24;}

                        else if ( (LA11_0=='^') ) {s = 25;}

                        else if ( ((LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='c')||(LA11_0>='e' && LA11_0<='z')) ) {s = 26;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 27;}

                        else if ( (LA11_0=='\'') ) {s = 28;}

                        else if ( (LA11_0=='/') ) {s = 29;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 30;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='#' && LA11_0<='&')||(LA11_0>='+' && LA11_0<=',')||(LA11_0>=':' && LA11_0<='@')||(LA11_0>='[' && LA11_0<=']')||LA11_0=='`'||(LA11_0>='{' && LA11_0<='\u0620')||(LA11_0>='\u0653' && LA11_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_28 = input.LA(1);

                        s = -1;
                        if ( ((LA11_28>='\u0000' && LA11_28<='\uFFFF')) ) {s = 70;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_65 = input.LA(1);

                        s = -1;
                        if ( (LA11_65=='\"') ) {s = 104;}

                        else if ( ((LA11_65>='\u0000' && LA11_65<='!')||(LA11_65>='#' && LA11_65<='\uFFFF')) ) {s = 105;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_23 = input.LA(1);

                        s = -1;
                        if ( (LA11_23=='\"') ) {s = 64;}

                        else if ( (LA11_23=='\\') ) {s = 65;}

                        else if ( ((LA11_23>='\u0000' && LA11_23<='!')||(LA11_23>='#' && LA11_23<='[')||(LA11_23>=']' && LA11_23<='\uFFFF')) ) {s = 66;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_104 = input.LA(1);

                        s = -1;
                        if ( (LA11_104=='\"') ) {s = 64;}

                        else if ( (LA11_104=='\\') ) {s = 65;}

                        else if ( ((LA11_104>='\u0000' && LA11_104<='!')||(LA11_104>='#' && LA11_104<='[')||(LA11_104>=']' && LA11_104<='\uFFFF')) ) {s = 66;}

                        else s = 103;

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