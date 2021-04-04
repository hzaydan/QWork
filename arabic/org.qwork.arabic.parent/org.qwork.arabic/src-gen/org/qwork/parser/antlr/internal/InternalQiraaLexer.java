package org.qwork.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQiraaLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_KALEMAH=4;
    public static final int T__59=59;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int RULE_AWORD=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_AHARAKAH=8;
    public static final int RULE_STRING=14;
    public static final int RULE_ANONLETTER=12;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_ASHADDAH=11;
    public static final int T__35=35;
    public static final int RULE_ALETTER=7;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_ADIGIT=10;
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

    public InternalQiraaLexer() {;} 
    public InternalQiraaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalQiraaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalQiraa.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQiraa.g:11:7: ( '\\u0642\\u0627\\u0631\\u0626' )
            // InternalQiraa.g:11:9: '\\u0642\\u0627\\u0631\\u0626'
            {
            match("\u0642\u0627\u0631\u0626"); 


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
            // InternalQiraa.g:12:7: ( '\\u0631\\u0627\\u0648' )
            // InternalQiraa.g:12:9: '\\u0631\\u0627\\u0648'
            {
            match("\u0631\u0627\u0648"); 


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
            // InternalQiraa.g:13:7: ( '\\u0639\\u0646' )
            // InternalQiraa.g:13:9: '\\u0639\\u0646'
            {
            match("\u0639\u0646"); 


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
            // InternalQiraa.g:14:7: ( '\\u0627\\u0633\\u0645\\u0647' )
            // InternalQiraa.g:14:9: '\\u0627\\u0633\\u0645\\u0647'
            {
            match("\u0627\u0633\u0645\u0647"); 


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
            // InternalQiraa.g:15:7: ( '\\u0644\\u0642\\u0628\\u0647' )
            // InternalQiraa.g:15:9: '\\u0644\\u0642\\u0628\\u0647'
            {
            match("\u0644\u0642\u0628\u0647"); 


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
            // InternalQiraa.g:16:7: ( '\\u062A\\u0648\\u0641\\u064A' )
            // InternalQiraa.g:16:9: '\\u062A\\u0648\\u0641\\u064A'
            {
            match("\u062A\u0648\u0641\u064A"); 


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
            // InternalQiraa.g:17:7: ( '\\u0631\\u062D\\u0645\\u0647' )
            // InternalQiraa.g:17:9: '\\u0631\\u062D\\u0645\\u0647'
            {
            match("\u0631\u062D\u0645\u0647"); 


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
            // InternalQiraa.g:18:7: ( '\\u0623\\u0643\\u0631\\u0645\\u0647' )
            // InternalQiraa.g:18:9: '\\u0623\\u0643\\u0631\\u0645\\u0647'
            {
            match("\u0623\u0643\u0631\u0645\u0647"); 


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
            // InternalQiraa.g:19:7: ( '\\u0627\\u0644\\u0644\\u0647' )
            // InternalQiraa.g:19:9: '\\u0627\\u0644\\u0644\\u0647'
            {
            match("\u0627\u0644\u0644\u0647"); 


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
            // InternalQiraa.g:20:7: ( '\\u0637\\u0631\\u064A\\u0642' )
            // InternalQiraa.g:20:9: '\\u0637\\u0631\\u064A\\u0642'
            {
            match("\u0637\u0631\u064A\u0642"); 


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
            // InternalQiraa.g:21:7: ( '\\u062A\\u0644\\u0627\\u0648\\u0629' )
            // InternalQiraa.g:21:9: '\\u062A\\u0644\\u0627\\u0648\\u0629'
            {
            match("\u062A\u0644\u0627\u0648\u0629"); 


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
            // InternalQiraa.g:22:7: ( '\\u062E\\u0627\\u0644\\u0635' )
            // InternalQiraa.g:22:9: '\\u062E\\u0627\\u0644\\u0635'
            {
            match("\u062E\u0627\u0644\u0635"); 


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
            // InternalQiraa.g:23:7: ( '\\u0644' )
            // InternalQiraa.g:23:9: '\\u0644'
            {
            match('\u0644'); 

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
            // InternalQiraa.g:24:7: ( '\\u0645\\u0631\\u0643\\u0628' )
            // InternalQiraa.g:24:9: '\\u0645\\u0631\\u0643\\u0628'
            {
            match("\u0645\u0631\u0643\u0628"); 


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
            // InternalQiraa.g:25:7: ( '\\u0645\\u0646' )
            // InternalQiraa.g:25:9: '\\u0645\\u0646'
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

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQiraa.g:26:7: ( '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' )
            // InternalQiraa.g:26:9: '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645'
            {
            match("\u0627\u0644\u0625\u0645\u0627\u0645"); 


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
            // InternalQiraa.g:27:7: ( '\\u0645\\u0631\\u062C\\u0639' )
            // InternalQiraa.g:27:9: '\\u0645\\u0631\\u062C\\u0639'
            {
            match("\u0645\u0631\u062C\u0639"); 


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
            // InternalQiraa.g:28:7: ( '\\u0644\\u0644\\u0625\\u0645\\u0627\\u0645' )
            // InternalQiraa.g:28:9: '\\u0644\\u0644\\u0625\\u0645\\u0627\\u0645'
            {
            match("\u0644\u0644\u0625\u0645\u0627\u0645"); 


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
            // InternalQiraa.g:29:7: ( '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647' )
            // InternalQiraa.g:29:9: '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647'
            {
            match("\u062A\u0641\u0635\u064A\u0644\u0647"); 


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
            // InternalQiraa.g:30:7: ( '\\u0627\\u0646\\u062A\\u0647\\u0649' )
            // InternalQiraa.g:30:9: '\\u0627\\u0646\\u062A\\u0647\\u0649'
            {
            match("\u0627\u0646\u062A\u0647\u0649"); 


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
            // InternalQiraa.g:31:7: ( '\\u0642\\u0648\\u0644\\u0647' )
            // InternalQiraa.g:31:9: '\\u0642\\u0648\\u0644\\u0647'
            {
            match("\u0642\u0648\u0644\u0647"); 


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
            // InternalQiraa.g:32:7: ( '\\u0645\\u0639\\u0646\\u0627\\u0647' )
            // InternalQiraa.g:32:9: '\\u0645\\u0639\\u0646\\u0627\\u0647'
            {
            match("\u0645\u0639\u0646\u0627\u0647"); 


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
            // InternalQiraa.g:33:7: ( '\\u0642\\u064A\\u062F' )
            // InternalQiraa.g:33:9: '\\u0642\\u064A\\u062F'
            {
            match("\u0642\u064A\u062F"); 


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
            // InternalQiraa.g:34:7: ( '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' )
            // InternalQiraa.g:34:9: '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D'
            {
            match("\u0627\u0635\u0637\u0644\u0627\u062D"); 


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
            // InternalQiraa.g:35:7: ( '\\u064A\\u0639\\u0646\\u064A' )
            // InternalQiraa.g:35:9: '\\u064A\\u0639\\u0646\\u064A'
            {
            match("\u064A\u0639\u0646\u064A"); 


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
            // InternalQiraa.g:36:7: ( '\\u0648' )
            // InternalQiraa.g:36:9: '\\u0648'
            {
            match('\u0648'); 

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
            // InternalQiraa.g:37:7: ( '\\u0631\\u0645\\u0632' )
            // InternalQiraa.g:37:9: '\\u0631\\u0645\\u0632'
            {
            match("\u0631\u0645\u0632"); 


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
            // InternalQiraa.g:38:7: ( '\\u0642\\u0631\\u0623' )
            // InternalQiraa.g:38:9: '\\u0642\\u0631\\u0623'
            {
            match("\u0642\u0631\u0623"); 


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
            // InternalQiraa.g:39:7: ( '\\u0628' )
            // InternalQiraa.g:39:9: '\\u0628'
            {
            match('\u0628'); 

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
            // InternalQiraa.g:40:7: ( '\\u0641\\u064A' )
            // InternalQiraa.g:40:9: '\\u0641\\u064A'
            {
            match("\u0641\u064A"); 


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
            // InternalQiraa.g:41:7: ( '\\u062A\\u0639\\u0627\\u0644\\u0649' )
            // InternalQiraa.g:41:9: '\\u062A\\u0639\\u0627\\u0644\\u0649'
            {
            match("\u062A\u0639\u0627\u0644\u0649"); 


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
            // InternalQiraa.g:42:7: ( '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' )
            // InternalQiraa.g:42:9: '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639'
            {
            match("\u0627\u0644\u0645\u0648\u0636\u0639"); 


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
            // InternalQiraa.g:43:7: ( '\\u0627\\u0644\\u0623\\u0648\\u0644' )
            // InternalQiraa.g:43:9: '\\u0627\\u0644\\u0623\\u0648\\u0644'
            {
            match("\u0627\u0644\u0623\u0648\u0644"); 


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
            // InternalQiraa.g:44:7: ( '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' )
            // InternalQiraa.g:44:9: '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A'
            {
            match("\u0627\u0644\u062B\u0627\u0646\u064A"); 


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
            // InternalQiraa.g:45:7: ( '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' )
            // InternalQiraa.g:45:9: '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B'
            {
            match("\u0627\u0644\u062B\u0627\u0644\u062B"); 


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
            // InternalQiraa.g:46:7: ( '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' )
            // InternalQiraa.g:46:9: '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631'
            {
            match("\u0627\u0644\u0623\u062E\u064A\u0631"); 


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
            // InternalQiraa.g:47:7: ( '\\u062D\\u0631\\u0641' )
            // InternalQiraa.g:47:9: '\\u062D\\u0631\\u0641'
            {
            match("\u062D\u0631\u0641"); 


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
            // InternalQiraa.g:48:7: ( '\\u0647\\u0648' )
            // InternalQiraa.g:48:9: '\\u0647\\u0648'
            {
            match("\u0647\u0648"); 


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
            // InternalQiraa.g:49:7: ( '\\u0623\\u0648' )
            // InternalQiraa.g:49:9: '\\u0623\\u0648'
            {
            match("\u0623\u0648"); 


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
            // InternalQiraa.g:50:7: ( '\\u0630\\u0627\\u062A\\u0647' )
            // InternalQiraa.g:50:9: '\\u0630\\u0627\\u062A\\u0647'
            {
            match("\u0630\u0627\u062A\u0647"); 


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
            // InternalQiraa.g:51:7: ( '\\u062D\\u0631\\u0643\\u0629' )
            // InternalQiraa.g:51:9: '\\u062D\\u0631\\u0643\\u0629'
            {
            match("\u062D\u0631\u0643\u0629"); 


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
            // InternalQiraa.g:52:7: ( '\\u0647\\u064A' )
            // InternalQiraa.g:52:9: '\\u0647\\u064A'
            {
            match("\u0647\u064A"); 


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
            // InternalQiraa.g:53:7: ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' )
            // InternalQiraa.g:53:9: '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'
            {
            match("\u0627\u0644\u0633\u0648\u0631\u0629"); 


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
            // InternalQiraa.g:54:7: ( '\\u0627\\u0644\\u0622\\u064A\\u0629' )
            // InternalQiraa.g:54:9: '\\u0627\\u0644\\u0622\\u064A\\u0629'
            {
            match("\u0627\u0644\u0622\u064A\u0629"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "RULE_ALETTER"
    public final void mRULE_ALETTER() throws RecognitionException {
        try {
            int _type = RULE_ALETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQiraa.g:1554:14: ( '\\u0621' .. '\\u064A' )
            // InternalQiraa.g:1554:16: '\\u0621' .. '\\u064A'
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
            // InternalQiraa.g:1556:13: ( '\\u0660' .. '\\u0669' )
            // InternalQiraa.g:1556:15: '\\u0660' .. '\\u0669'
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
            // InternalQiraa.g:1558:15: ( ( '\\u064E' .. '\\u0650' | '\\u0652' ) )
            // InternalQiraa.g:1558:17: ( '\\u064E' .. '\\u0650' | '\\u0652' )
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
            // InternalQiraa.g:1560:24: ( '\\u0651' )
            // InternalQiraa.g:1560:26: '\\u0651'
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
            // InternalQiraa.g:1562:17: ( ( '\\u0600' .. '\\u0620' | '\\u064B' .. '\\u06FF' ) )
            // InternalQiraa.g:1562:19: ( '\\u0600' .. '\\u0620' | '\\u064B' .. '\\u06FF' )
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
            // InternalQiraa.g:1564:12: ( ( RULE_ALETTER | RULE_AHARAKAH | RULE_ASHADDAH )+ )
            // InternalQiraa.g:1564:14: ( RULE_ALETTER | RULE_AHARAKAH | RULE_ASHADDAH )+
            {
            // InternalQiraa.g:1564:14: ( RULE_ALETTER | RULE_AHARAKAH | RULE_ASHADDAH )+
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
            	    // InternalQiraa.g:
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
            // InternalQiraa.g:1566:14: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // InternalQiraa.g:1566:16: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // InternalQiraa.g:1566:20: ( options {greedy=false; } : . )*
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
            	    // InternalQiraa.g:1566:48: .
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
            // InternalQiraa.g:1568:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalQiraa.g:1568:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalQiraa.g:1568:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQiraa.g:1568:11: '^'
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

            // InternalQiraa.g:1568:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            // InternalQiraa.g:1570:10: ( ( '0' .. '9' )+ )
            // InternalQiraa.g:1570:12: ( '0' .. '9' )+
            {
            // InternalQiraa.g:1570:12: ( '0' .. '9' )+
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
            	    // InternalQiraa.g:1570:13: '0' .. '9'
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
            // InternalQiraa.g:1572:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalQiraa.g:1572:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalQiraa.g:1572:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalQiraa.g:1572:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalQiraa.g:1572:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalQiraa.g:1572:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalQiraa.g:1572:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalQiraa.g:1572:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalQiraa.g:1572:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalQiraa.g:1572:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalQiraa.g:1572:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalQiraa.g:1574:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalQiraa.g:1574:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalQiraa.g:1574:24: ( options {greedy=false; } : . )*
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
            	    // InternalQiraa.g:1574:52: .
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
            // InternalQiraa.g:1576:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalQiraa.g:1576:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalQiraa.g:1576:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalQiraa.g:1576:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalQiraa.g:1576:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalQiraa.g:1576:41: ( '\\r' )? '\\n'
                    {
                    // InternalQiraa.g:1576:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalQiraa.g:1576:41: '\\r'
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
            // InternalQiraa.g:1578:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalQiraa.g:1578:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalQiraa.g:1578:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalQiraa.g:1580:16: ( . )
            // InternalQiraa.g:1580:18: .
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
        // InternalQiraa.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | RULE_ALETTER | RULE_ADIGIT | RULE_AHARAKAH | RULE_ANONLETTER | RULE_AWORD | RULE_KALEMAH | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=57;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalQiraa.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // InternalQiraa.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // InternalQiraa.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // InternalQiraa.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // InternalQiraa.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // InternalQiraa.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // InternalQiraa.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // InternalQiraa.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // InternalQiraa.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // InternalQiraa.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // InternalQiraa.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // InternalQiraa.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // InternalQiraa.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // InternalQiraa.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // InternalQiraa.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // InternalQiraa.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // InternalQiraa.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // InternalQiraa.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // InternalQiraa.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // InternalQiraa.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // InternalQiraa.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // InternalQiraa.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // InternalQiraa.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // InternalQiraa.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // InternalQiraa.g:1:154: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // InternalQiraa.g:1:160: T__43
                {
                mT__43(); 

                }
                break;
            case 27 :
                // InternalQiraa.g:1:166: T__44
                {
                mT__44(); 

                }
                break;
            case 28 :
                // InternalQiraa.g:1:172: T__45
                {
                mT__45(); 

                }
                break;
            case 29 :
                // InternalQiraa.g:1:178: T__46
                {
                mT__46(); 

                }
                break;
            case 30 :
                // InternalQiraa.g:1:184: T__47
                {
                mT__47(); 

                }
                break;
            case 31 :
                // InternalQiraa.g:1:190: T__48
                {
                mT__48(); 

                }
                break;
            case 32 :
                // InternalQiraa.g:1:196: T__49
                {
                mT__49(); 

                }
                break;
            case 33 :
                // InternalQiraa.g:1:202: T__50
                {
                mT__50(); 

                }
                break;
            case 34 :
                // InternalQiraa.g:1:208: T__51
                {
                mT__51(); 

                }
                break;
            case 35 :
                // InternalQiraa.g:1:214: T__52
                {
                mT__52(); 

                }
                break;
            case 36 :
                // InternalQiraa.g:1:220: T__53
                {
                mT__53(); 

                }
                break;
            case 37 :
                // InternalQiraa.g:1:226: T__54
                {
                mT__54(); 

                }
                break;
            case 38 :
                // InternalQiraa.g:1:232: T__55
                {
                mT__55(); 

                }
                break;
            case 39 :
                // InternalQiraa.g:1:238: T__56
                {
                mT__56(); 

                }
                break;
            case 40 :
                // InternalQiraa.g:1:244: T__57
                {
                mT__57(); 

                }
                break;
            case 41 :
                // InternalQiraa.g:1:250: T__58
                {
                mT__58(); 

                }
                break;
            case 42 :
                // InternalQiraa.g:1:256: T__59
                {
                mT__59(); 

                }
                break;
            case 43 :
                // InternalQiraa.g:1:262: T__60
                {
                mT__60(); 

                }
                break;
            case 44 :
                // InternalQiraa.g:1:268: T__61
                {
                mT__61(); 

                }
                break;
            case 45 :
                // InternalQiraa.g:1:274: RULE_ALETTER
                {
                mRULE_ALETTER(); 

                }
                break;
            case 46 :
                // InternalQiraa.g:1:287: RULE_ADIGIT
                {
                mRULE_ADIGIT(); 

                }
                break;
            case 47 :
                // InternalQiraa.g:1:299: RULE_AHARAKAH
                {
                mRULE_AHARAKAH(); 

                }
                break;
            case 48 :
                // InternalQiraa.g:1:313: RULE_ANONLETTER
                {
                mRULE_ANONLETTER(); 

                }
                break;
            case 49 :
                // InternalQiraa.g:1:329: RULE_AWORD
                {
                mRULE_AWORD(); 

                }
                break;
            case 50 :
                // InternalQiraa.g:1:340: RULE_KALEMAH
                {
                mRULE_KALEMAH(); 

                }
                break;
            case 51 :
                // InternalQiraa.g:1:353: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 52 :
                // InternalQiraa.g:1:361: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 53 :
                // InternalQiraa.g:1:370: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 54 :
                // InternalQiraa.g:1:382: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 55 :
                // InternalQiraa.g:1:398: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 56 :
                // InternalQiraa.g:1:414: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 57 :
                // InternalQiraa.g:1:422: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\4\43\1\57\6\43\1\74\1\75\5\43\1\uffff\1\104\1\105\1\uffff\2\36\2\uffff\2\36\2\uffff\4\44\2\uffff\3\44\1\126\6\44\1\uffff\5\44\1\150\3\44\1\155\2\44\2\uffff\1\160\1\44\1\163\1\164\1\44\14\uffff\2\44\1\173\1\174\1\175\1\44\1\177\1\uffff\21\44\1\uffff\4\44\1\uffff\2\44\1\uffff\1\u0098\1\44\2\uffff\1\44\1\uffff\1\166\1\uffff\1\u009b\1\u009c\3\uffff\1\u009d\1\uffff\1\u009e\1\u009f\11\44\1\u00aa\1\44\1\u00ac\4\44\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\44\1\u00b6\1\uffff\1\u00b7\1\u00b8\5\uffff\2\44\1\u00bb\4\44\1\u00c0\1\u00c1\1\44\1\uffff\1\44\1\uffff\1\u00c4\1\44\1\u00c6\1\u00c7\4\uffff\1\u00c8\3\uffff\1\u00c9\1\u00ca\1\uffff\1\u00cb\1\u00cc\1\u00cd\1\u00ce\2\uffff\1\u00cf\1\u00d0\1\uffff\1\u00d1\14\uffff";
    static final String DFA14_eofS =
        "\u00d2\uffff";
    static final String DFA14_minS =
        "\1\0\22\u0621\1\uffff\2\u0621\1\uffff\1\0\1\101\2\uffff\1\0\1\52\2\uffff\1\u0631\1\u0644\1\u062f\1\u0623\2\uffff\1\u0648\1\u0645\1\u0632\1\u0621\1\u0645\1\u0622\1\u062a\1\u0637\1\u0628\1\u0625\1\uffff\1\u0641\1\u0627\1\u0635\1\u0627\1\u0631\1\u0621\1\u064a\1\u0644\1\u062c\1\u0621\2\u0646\2\uffff\1\u0621\1\u0641\2\u0621\1\u062a\4\uffff\2\0\6\uffff\1\u0626\1\u0647\3\u0621\1\u0647\1\u0621\1\uffff\2\u0647\1\u0645\1\u0648\1\u062e\1\u0627\1\u0648\1\u064a\1\u0647\1\u0644\1\u0647\1\u0645\1\u064a\1\u0648\1\u064a\1\u0644\1\u0645\1\uffff\1\u0642\1\u0635\1\u0628\1\u0639\1\uffff\1\u0627\1\u064a\1\uffff\1\u0621\1\u0629\2\uffff\1\u0647\1\uffff\2\0\2\u0621\3\uffff\1\u0621\1\uffff\2\u0621\1\u0627\1\u0636\1\u0644\1\u064a\1\u0644\1\u0631\1\u0629\1\u0649\1\u0627\1\u0621\1\u0627\1\u0621\1\u0629\1\u0644\1\u0649\1\u0647\4\u0621\1\u0647\1\u0621\1\uffff\2\u0621\5\uffff\1\u0645\1\u0639\1\u0621\1\u0631\1\u064a\1\u062b\1\u0629\2\u0621\1\u062d\1\uffff\1\u0645\1\uffff\1\u0621\1\u0647\2\u0621\4\uffff\1\u0621\3\uffff\2\u0621\1\uffff\4\u0621\2\uffff\2\u0621\1\uffff\1\u0621\14\uffff";
    static final String DFA14_maxS =
        "\1\uffff\22\u0652\1\uffff\2\u0652\1\uffff\1\uffff\1\172\2\uffff\1\uffff\1\57\2\uffff\1\u0631\1\u0644\1\u062f\1\u0623\2\uffff\1\u0648\1\u0645\1\u0632\1\u0652\2\u0645\1\u062a\1\u0637\1\u0628\1\u0625\1\uffff\1\u0641\1\u0627\1\u0635\1\u0627\1\u0631\1\u0652\1\u064a\1\u0644\1\u0643\1\u0652\2\u0646\2\uffff\1\u0652\1\u0643\2\u0652\1\u062a\4\uffff\2\uffff\6\uffff\1\u0626\1\u0647\3\u0652\1\u0647\1\u0652\1\uffff\2\u0647\1\u0645\2\u0648\1\u0627\1\u0648\1\u064a\1\u0647\1\u0644\1\u0647\1\u0645\1\u064a\1\u0648\1\u064a\1\u0644\1\u0645\1\uffff\1\u0642\1\u0635\1\u0628\1\u0639\1\uffff\1\u0627\1\u064a\1\uffff\1\u0652\1\u0629\2\uffff\1\u0647\1\uffff\2\uffff\2\u0652\3\uffff\1\u0652\1\uffff\2\u0652\1\u0627\1\u0636\1\u0644\1\u064a\1\u0646\1\u0631\1\u0629\1\u0649\1\u0627\1\u0652\1\u0627\1\u0652\1\u0629\1\u0644\1\u0649\1\u0647\4\u0652\1\u0647\1\u0652\1\uffff\2\u0652\5\uffff\1\u0645\1\u0639\1\u0652\1\u0631\1\u064a\1\u062b\1\u0629\2\u0652\1\u062d\1\uffff\1\u0645\1\uffff\1\u0652\1\u0647\2\u0652\4\uffff\1\u0652\3\uffff\2\u0652\1\uffff\4\u0652\2\uffff\2\u0652\1\uffff\1\u0652\14\uffff";
    static final String DFA14_acceptS =
        "\23\uffff\1\56\2\uffff\1\60\2\uffff\1\63\1\64\2\uffff\1\70\1\71\4\uffff\1\55\1\61\12\uffff\1\15\14\uffff\1\32\1\35\5\uffff\1\56\1\57\1\60\1\62\2\uffff\1\63\1\64\1\65\1\66\1\67\1\70\7\uffff\1\3\21\uffff\1\47\4\uffff\1\17\2\uffff\1\36\2\uffff\1\46\1\52\1\uffff\1\62\4\uffff\1\27\1\34\1\2\1\uffff\1\33\30\uffff\1\45\2\uffff\1\1\1\25\1\7\1\4\1\11\12\uffff\1\5\1\uffff\1\6\4\uffff\1\12\1\14\1\16\1\21\1\uffff\1\31\1\51\1\50\2\uffff\1\41\4\uffff\1\54\1\24\2\uffff\1\13\1\uffff\1\37\1\10\1\26\1\20\1\40\1\44\1\42\1\43\1\53\1\30\1\22\1\23";
    static final String DFA14_specialS =
        "\1\2\26\uffff\1\6\3\uffff\1\5\53\uffff\1\3\1\1\56\uffff\1\4\1\0\131\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\1\36\1\27\4\36\1\33\7\36\1\34\12\32\7\36\32\31\3\36\1\30\1\31\1\36\32\31\u0585\36\41\26\2\22\1\7\3\22\1\4\1\15\1\22\1\6\2\22\1\17\1\11\1\22\1\21\1\2\5\22\1\10\1\22\1\3\7\22\1\16\1\1\1\22\1\5\1\12\1\22\1\20\1\14\1\22\1\13\3\26\3\24\1\25\1\24\15\26\12\23\u0096\26\uf900\36",
            "\6\44\1\37\11\44\1\42\26\44\1\40\1\44\1\41\3\uffff\5\44",
            "\6\44\1\45\5\44\1\46\27\44\1\47\5\44\3\uffff\5\44",
            "\45\44\1\50\4\44\3\uffff\5\44",
            "\22\44\1\51\1\44\1\54\16\44\1\52\1\44\1\53\4\44\3\uffff\5\44",
            "\41\44\1\55\1\44\1\56\6\44\3\uffff\5\44",
            "\30\44\1\63\7\44\1\62\2\44\1\61\3\44\1\60\2\44\3\uffff\5\44",
            "\42\44\1\64\4\44\1\65\2\44\3\uffff\5\44",
            "\20\44\1\66\31\44\3\uffff\5\44",
            "\6\44\1\67\43\44\3\uffff\5\44",
            "\20\44\1\70\7\44\1\72\14\44\1\71\4\44\3\uffff\5\44",
            "\30\44\1\73\21\44\3\uffff\5\44",
            "\52\44\3\uffff\5\44",
            "\52\44\3\uffff\5\44",
            "\51\44\1\76\3\uffff\5\44",
            "\20\44\1\77\31\44\3\uffff\5\44",
            "\47\44\1\100\1\44\1\101\3\uffff\5\44",
            "\6\44\1\102\43\44\3\uffff\5\44",
            "\52\44\3\uffff\5\44",
            "",
            "\52\44\3\uffff\5\44",
            "\52\44\3\uffff\5\44",
            "",
            "\42\110\1\106\71\110\1\107\uffa3\110",
            "\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "",
            "\0\113",
            "\1\114\4\uffff\1\115",
            "",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\52\44\3\uffff\5\44",
            "\1\127",
            "\1\136\1\133\1\uffff\1\131\5\uffff\1\134\7\uffff\1\135\20\uffff\1\130\1\132",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\52\44\3\uffff\5\44",
            "\1\151",
            "\1\152",
            "\1\154\26\uffff\1\153",
            "\52\44\3\uffff\5\44",
            "\1\156",
            "\1\157",
            "",
            "",
            "\52\44\3\uffff\5\44",
            "\1\161\1\uffff\1\162",
            "\52\44\3\uffff\5\44",
            "\52\44\3\uffff\5\44",
            "\1\165",
            "",
            "",
            "",
            "",
            "\42\170\1\167\uffdd\170",
            "\42\110\1\106\71\110\1\107\uffa3\110",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\171",
            "\1\172",
            "\52\44\3\uffff\5\44",
            "\52\44\3\uffff\5\44",
            "\52\44\3\uffff\5\44",
            "\1\176",
            "\52\44\3\uffff\5\44",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0085\31\uffff\1\u0084",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "\1\u0096",
            "\1\u0097",
            "",
            "\52\44\3\uffff\5\44",
            "\1\u0099",
            "",
            "",
            "\1\u009a",
            "",
            "\42\110\1\106\71\110\1\107\uffa3\110",
            "\42\110\1\106\71\110\1\107\uffa3\110",
            "\52\44\3\uffff\5\44",
            "\52\44\3\uffff\5\44",
            "",
            "",
            "",
            "\52\44\3\uffff\5\44",
            "",
            "\52\44\3\uffff\5\44",
            "\52\44\3\uffff\5\44",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a5\1\uffff\1\u00a4",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\52\44\3\uffff\5\44",
            "\1\u00ab",
            "\52\44\3\uffff\5\44",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\52\44\3\uffff\5\44",
            "\52\44\3\uffff\5\44",
            "\52\44\3\uffff\5\44",
            "\52\44\3\uffff\5\44",
            "\1\u00b5",
            "\52\44\3\uffff\5\44",
            "",
            "\52\44\3\uffff\5\44",
            "\52\44\3\uffff\5\44",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\52\44\3\uffff\5\44",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\52\44\3\uffff\5\44",
            "\52\44\3\uffff\5\44",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "",
            "\52\44\3\uffff\5\44",
            "\1\u00c5",
            "\52\44\3\uffff\5\44",
            "\52\44\3\uffff\5\44",
            "",
            "",
            "",
            "",
            "\52\44\3\uffff\5\44",
            "",
            "",
            "",
            "\52\44\3\uffff\5\44",
            "\52\44\3\uffff\5\44",
            "",
            "\52\44\3\uffff\5\44",
            "\52\44\3\uffff\5\44",
            "\52\44\3\uffff\5\44",
            "\52\44\3\uffff\5\44",
            "",
            "",
            "\52\44\3\uffff\5\44",
            "\52\44\3\uffff\5\44",
            "",
            "\52\44\3\uffff\5\44",
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
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | RULE_ALETTER | RULE_ADIGIT | RULE_AHARAKAH | RULE_ANONLETTER | RULE_AWORD | RULE_KALEMAH | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_120 = input.LA(1);

                        s = -1;
                        if ( (LA14_120=='\"') ) {s = 70;}

                        else if ( (LA14_120=='\\') ) {s = 71;}

                        else if ( ((LA14_120>='\u0000' && LA14_120<='!')||(LA14_120>='#' && LA14_120<='[')||(LA14_120>=']' && LA14_120<='\uFFFF')) ) {s = 72;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_72 = input.LA(1);

                        s = -1;
                        if ( (LA14_72=='\"') ) {s = 70;}

                        else if ( (LA14_72=='\\') ) {s = 71;}

                        else if ( ((LA14_72>='\u0000' && LA14_72<='!')||(LA14_72>='#' && LA14_72<='[')||(LA14_72>=']' && LA14_72<='\uFFFF')) ) {s = 72;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='\u0642') ) {s = 1;}

                        else if ( (LA14_0=='\u0631') ) {s = 2;}

                        else if ( (LA14_0=='\u0639') ) {s = 3;}

                        else if ( (LA14_0=='\u0627') ) {s = 4;}

                        else if ( (LA14_0=='\u0644') ) {s = 5;}

                        else if ( (LA14_0=='\u062A') ) {s = 6;}

                        else if ( (LA14_0=='\u0623') ) {s = 7;}

                        else if ( (LA14_0=='\u0637') ) {s = 8;}

                        else if ( (LA14_0=='\u062E') ) {s = 9;}

                        else if ( (LA14_0=='\u0645') ) {s = 10;}

                        else if ( (LA14_0=='\u064A') ) {s = 11;}

                        else if ( (LA14_0=='\u0648') ) {s = 12;}

                        else if ( (LA14_0=='\u0628') ) {s = 13;}

                        else if ( (LA14_0=='\u0641') ) {s = 14;}

                        else if ( (LA14_0=='\u062D') ) {s = 15;}

                        else if ( (LA14_0=='\u0647') ) {s = 16;}

                        else if ( (LA14_0=='\u0630') ) {s = 17;}

                        else if ( ((LA14_0>='\u0621' && LA14_0<='\u0622')||(LA14_0>='\u0624' && LA14_0<='\u0626')||LA14_0=='\u0629'||(LA14_0>='\u062B' && LA14_0<='\u062C')||LA14_0=='\u062F'||(LA14_0>='\u0632' && LA14_0<='\u0636')||LA14_0=='\u0638'||(LA14_0>='\u063A' && LA14_0<='\u0640')||LA14_0=='\u0643'||LA14_0=='\u0646'||LA14_0=='\u0649') ) {s = 18;}

                        else if ( ((LA14_0>='\u0660' && LA14_0<='\u0669')) ) {s = 19;}

                        else if ( ((LA14_0>='\u064E' && LA14_0<='\u0650')||LA14_0=='\u0652') ) {s = 20;}

                        else if ( (LA14_0=='\u0651') ) {s = 21;}

                        else if ( ((LA14_0>='\u0600' && LA14_0<='\u0620')||(LA14_0>='\u064B' && LA14_0<='\u064D')||(LA14_0>='\u0653' && LA14_0<='\u065F')||(LA14_0>='\u066A' && LA14_0<='\u06FF')) ) {s = 22;}

                        else if ( (LA14_0=='\"') ) {s = 23;}

                        else if ( (LA14_0=='^') ) {s = 24;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {s = 25;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 26;}

                        else if ( (LA14_0=='\'') ) {s = 27;}

                        else if ( (LA14_0=='/') ) {s = 28;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 29;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='.')||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\u05FF')||(LA14_0>='\u0700' && LA14_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_71 = input.LA(1);

                        s = -1;
                        if ( (LA14_71=='\"') ) {s = 119;}

                        else if ( ((LA14_71>='\u0000' && LA14_71<='!')||(LA14_71>='#' && LA14_71<='\uFFFF')) ) {s = 120;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_119 = input.LA(1);

                        s = -1;
                        if ( (LA14_119=='\"') ) {s = 70;}

                        else if ( (LA14_119=='\\') ) {s = 71;}

                        else if ( ((LA14_119>='\u0000' && LA14_119<='!')||(LA14_119>='#' && LA14_119<='[')||(LA14_119>=']' && LA14_119<='\uFFFF')) ) {s = 72;}

                        else s = 118;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_27 = input.LA(1);

                        s = -1;
                        if ( ((LA14_27>='\u0000' && LA14_27<='\uFFFF')) ) {s = 75;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_23 = input.LA(1);

                        s = -1;
                        if ( (LA14_23=='\"') ) {s = 70;}

                        else if ( (LA14_23=='\\') ) {s = 71;}

                        else if ( ((LA14_23>='\u0000' && LA14_23<='!')||(LA14_23>='#' && LA14_23<='[')||(LA14_23>=']' && LA14_23<='\uFFFF')) ) {s = 72;}

                        else s = 30;

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