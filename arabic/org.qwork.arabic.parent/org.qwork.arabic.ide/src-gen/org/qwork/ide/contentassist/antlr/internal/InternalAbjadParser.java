package org.qwork.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.qwork.services.AbjadGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAbjadParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_AWORD", "RULE_KALEMAH", "RULE_INT", "RULE_BASMALAH", "RULE_ALETTER", "RULE_AHARAKAH", "RULE_ATANWEEN", "RULE_ASHADDAH", "RULE_ALIGATURES", "RULE_ADIGIT", "RULE_ANONLETTER", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\u062D\\u0631\\u0641'", "'\\u0647\\u0648'", "'\\u0623\\u0648'", "'\\u0630\\u0627\\u062A\\u0647'", "'\\u062D\\u0631\\u0643\\u0629'", "'\\u0647\\u064A'", "'\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'", "'\\u0627\\u0644\\u0622\\u064A\\u0629'"
    };
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


        public InternalAbjadParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAbjadParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAbjadParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAbjad.g"; }


    	private AbjadGrammarAccess grammarAccess;

    	public void setGrammarAccess(AbjadGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleAbjadModel"
    // InternalAbjad.g:53:1: entryRuleAbjadModel : ruleAbjadModel EOF ;
    public final void entryRuleAbjadModel() throws RecognitionException {
        try {
            // InternalAbjad.g:54:1: ( ruleAbjadModel EOF )
            // InternalAbjad.g:55:1: ruleAbjadModel EOF
            {
             before(grammarAccess.getAbjadModelRule()); 
            pushFollow(FOLLOW_1);
            ruleAbjadModel();

            state._fsp--;

             after(grammarAccess.getAbjadModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbjadModel"


    // $ANTLR start "ruleAbjadModel"
    // InternalAbjad.g:62:1: ruleAbjadModel : ( ( rule__AbjadModel__Alternatives )* ) ;
    public final void ruleAbjadModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:66:2: ( ( ( rule__AbjadModel__Alternatives )* ) )
            // InternalAbjad.g:67:2: ( ( rule__AbjadModel__Alternatives )* )
            {
            // InternalAbjad.g:67:2: ( ( rule__AbjadModel__Alternatives )* )
            // InternalAbjad.g:68:3: ( rule__AbjadModel__Alternatives )*
            {
             before(grammarAccess.getAbjadModelAccess().getAlternatives()); 
            // InternalAbjad.g:69:3: ( rule__AbjadModel__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAbjad.g:69:4: rule__AbjadModel__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__AbjadModel__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getAbjadModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbjadModel"


    // $ANTLR start "entryRuleHarf"
    // InternalAbjad.g:78:1: entryRuleHarf : ruleHarf EOF ;
    public final void entryRuleHarf() throws RecognitionException {
        try {
            // InternalAbjad.g:79:1: ( ruleHarf EOF )
            // InternalAbjad.g:80:1: ruleHarf EOF
            {
             before(grammarAccess.getHarfRule()); 
            pushFollow(FOLLOW_1);
            ruleHarf();

            state._fsp--;

             after(grammarAccess.getHarfRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHarf"


    // $ANTLR start "ruleHarf"
    // InternalAbjad.g:87:1: ruleHarf : ( ( rule__Harf__Group__0 ) ) ;
    public final void ruleHarf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:91:2: ( ( ( rule__Harf__Group__0 ) ) )
            // InternalAbjad.g:92:2: ( ( rule__Harf__Group__0 ) )
            {
            // InternalAbjad.g:92:2: ( ( rule__Harf__Group__0 ) )
            // InternalAbjad.g:93:3: ( rule__Harf__Group__0 )
            {
             before(grammarAccess.getHarfAccess().getGroup()); 
            // InternalAbjad.g:94:3: ( rule__Harf__Group__0 )
            // InternalAbjad.g:94:4: rule__Harf__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Harf__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHarfAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHarf"


    // $ANTLR start "entryRuleHarakah"
    // InternalAbjad.g:103:1: entryRuleHarakah : ruleHarakah EOF ;
    public final void entryRuleHarakah() throws RecognitionException {
        try {
            // InternalAbjad.g:104:1: ( ruleHarakah EOF )
            // InternalAbjad.g:105:1: ruleHarakah EOF
            {
             before(grammarAccess.getHarakahRule()); 
            pushFollow(FOLLOW_1);
            ruleHarakah();

            state._fsp--;

             after(grammarAccess.getHarakahRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHarakah"


    // $ANTLR start "ruleHarakah"
    // InternalAbjad.g:112:1: ruleHarakah : ( ( rule__Harakah__Group__0 ) ) ;
    public final void ruleHarakah() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:116:2: ( ( ( rule__Harakah__Group__0 ) ) )
            // InternalAbjad.g:117:2: ( ( rule__Harakah__Group__0 ) )
            {
            // InternalAbjad.g:117:2: ( ( rule__Harakah__Group__0 ) )
            // InternalAbjad.g:118:3: ( rule__Harakah__Group__0 )
            {
             before(grammarAccess.getHarakahAccess().getGroup()); 
            // InternalAbjad.g:119:3: ( rule__Harakah__Group__0 )
            // InternalAbjad.g:119:4: rule__Harakah__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Harakah__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHarakahAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHarakah"


    // $ANTLR start "entryRuleAyahStart"
    // InternalAbjad.g:128:1: entryRuleAyahStart : ruleAyahStart EOF ;
    public final void entryRuleAyahStart() throws RecognitionException {
        try {
            // InternalAbjad.g:129:1: ( ruleAyahStart EOF )
            // InternalAbjad.g:130:1: ruleAyahStart EOF
            {
             before(grammarAccess.getAyahStartRule()); 
            pushFollow(FOLLOW_1);
            ruleAyahStart();

            state._fsp--;

             after(grammarAccess.getAyahStartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAyahStart"


    // $ANTLR start "ruleAyahStart"
    // InternalAbjad.g:137:1: ruleAyahStart : ( ( rule__AyahStart__Group__0 ) ) ;
    public final void ruleAyahStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:141:2: ( ( ( rule__AyahStart__Group__0 ) ) )
            // InternalAbjad.g:142:2: ( ( rule__AyahStart__Group__0 ) )
            {
            // InternalAbjad.g:142:2: ( ( rule__AyahStart__Group__0 ) )
            // InternalAbjad.g:143:3: ( rule__AyahStart__Group__0 )
            {
             before(grammarAccess.getAyahStartAccess().getGroup()); 
            // InternalAbjad.g:144:3: ( rule__AyahStart__Group__0 )
            // InternalAbjad.g:144:4: rule__AyahStart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AyahStart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAyahStartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAyahStart"


    // $ANTLR start "entryRulePhrase"
    // InternalAbjad.g:153:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // InternalAbjad.g:154:1: ( rulePhrase EOF )
            // InternalAbjad.g:155:1: rulePhrase EOF
            {
             before(grammarAccess.getPhraseRule()); 
            pushFollow(FOLLOW_1);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePhrase"


    // $ANTLR start "rulePhrase"
    // InternalAbjad.g:162:1: rulePhrase : ( ( rule__Phrase__Group__0 ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:166:2: ( ( ( rule__Phrase__Group__0 ) ) )
            // InternalAbjad.g:167:2: ( ( rule__Phrase__Group__0 ) )
            {
            // InternalAbjad.g:167:2: ( ( rule__Phrase__Group__0 ) )
            // InternalAbjad.g:168:3: ( rule__Phrase__Group__0 )
            {
             before(grammarAccess.getPhraseAccess().getGroup()); 
            // InternalAbjad.g:169:3: ( rule__Phrase__Group__0 )
            // InternalAbjad.g:169:4: rule__Phrase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhrase"


    // $ANTLR start "rule__AbjadModel__Alternatives"
    // InternalAbjad.g:177:1: rule__AbjadModel__Alternatives : ( ( ( rule__AbjadModel__HouroufAssignment_0 ) ) | ( ( rule__AbjadModel__HarakatAssignment_1 ) ) );
    public final void rule__AbjadModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:181:1: ( ( ( rule__AbjadModel__HouroufAssignment_0 ) ) | ( ( rule__AbjadModel__HarakatAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAbjad.g:182:2: ( ( rule__AbjadModel__HouroufAssignment_0 ) )
                    {
                    // InternalAbjad.g:182:2: ( ( rule__AbjadModel__HouroufAssignment_0 ) )
                    // InternalAbjad.g:183:3: ( rule__AbjadModel__HouroufAssignment_0 )
                    {
                     before(grammarAccess.getAbjadModelAccess().getHouroufAssignment_0()); 
                    // InternalAbjad.g:184:3: ( rule__AbjadModel__HouroufAssignment_0 )
                    // InternalAbjad.g:184:4: rule__AbjadModel__HouroufAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbjadModel__HouroufAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbjadModelAccess().getHouroufAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAbjad.g:188:2: ( ( rule__AbjadModel__HarakatAssignment_1 ) )
                    {
                    // InternalAbjad.g:188:2: ( ( rule__AbjadModel__HarakatAssignment_1 ) )
                    // InternalAbjad.g:189:3: ( rule__AbjadModel__HarakatAssignment_1 )
                    {
                     before(grammarAccess.getAbjadModelAccess().getHarakatAssignment_1()); 
                    // InternalAbjad.g:190:3: ( rule__AbjadModel__HarakatAssignment_1 )
                    // InternalAbjad.g:190:4: rule__AbjadModel__HarakatAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbjadModel__HarakatAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbjadModelAccess().getHarakatAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbjadModel__Alternatives"


    // $ANTLR start "rule__Harf__Alternatives_2"
    // InternalAbjad.g:198:1: rule__Harf__Alternatives_2 : ( ( ( rule__Harf__Group_2_0__0 ) ) | ( ( rule__Harf__Group_2_1__0 ) ) );
    public final void rule__Harf__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:202:1: ( ( ( rule__Harf__Group_2_0__0 ) ) | ( ( rule__Harf__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAbjad.g:203:2: ( ( rule__Harf__Group_2_0__0 ) )
                    {
                    // InternalAbjad.g:203:2: ( ( rule__Harf__Group_2_0__0 ) )
                    // InternalAbjad.g:204:3: ( rule__Harf__Group_2_0__0 )
                    {
                     before(grammarAccess.getHarfAccess().getGroup_2_0()); 
                    // InternalAbjad.g:205:3: ( rule__Harf__Group_2_0__0 )
                    // InternalAbjad.g:205:4: rule__Harf__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Harf__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHarfAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAbjad.g:209:2: ( ( rule__Harf__Group_2_1__0 ) )
                    {
                    // InternalAbjad.g:209:2: ( ( rule__Harf__Group_2_1__0 ) )
                    // InternalAbjad.g:210:3: ( rule__Harf__Group_2_1__0 )
                    {
                     before(grammarAccess.getHarfAccess().getGroup_2_1()); 
                    // InternalAbjad.g:211:3: ( rule__Harf__Group_2_1__0 )
                    // InternalAbjad.g:211:4: rule__Harf__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Harf__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHarfAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Alternatives_2"


    // $ANTLR start "rule__Harf__Group__0"
    // InternalAbjad.g:219:1: rule__Harf__Group__0 : rule__Harf__Group__0__Impl rule__Harf__Group__1 ;
    public final void rule__Harf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:223:1: ( rule__Harf__Group__0__Impl rule__Harf__Group__1 )
            // InternalAbjad.g:224:2: rule__Harf__Group__0__Impl rule__Harf__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Harf__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Harf__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Group__0"


    // $ANTLR start "rule__Harf__Group__0__Impl"
    // InternalAbjad.g:231:1: rule__Harf__Group__0__Impl : ( '\\u062D\\u0631\\u0641' ) ;
    public final void rule__Harf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:235:1: ( ( '\\u062D\\u0631\\u0641' ) )
            // InternalAbjad.g:236:1: ( '\\u062D\\u0631\\u0641' )
            {
            // InternalAbjad.g:236:1: ( '\\u062D\\u0631\\u0641' )
            // InternalAbjad.g:237:2: '\\u062D\\u0631\\u0641'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterHahArabicLetterRehArabicLetterFehKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getHarfAccess().getArabicLetterHahArabicLetterRehArabicLetterFehKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Group__0__Impl"


    // $ANTLR start "rule__Harf__Group__1"
    // InternalAbjad.g:246:1: rule__Harf__Group__1 : rule__Harf__Group__1__Impl rule__Harf__Group__2 ;
    public final void rule__Harf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:250:1: ( rule__Harf__Group__1__Impl rule__Harf__Group__2 )
            // InternalAbjad.g:251:2: rule__Harf__Group__1__Impl rule__Harf__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Harf__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Harf__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Group__1"


    // $ANTLR start "rule__Harf__Group__1__Impl"
    // InternalAbjad.g:258:1: rule__Harf__Group__1__Impl : ( ( rule__Harf__NameAssignment_1 ) ) ;
    public final void rule__Harf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:262:1: ( ( ( rule__Harf__NameAssignment_1 ) ) )
            // InternalAbjad.g:263:1: ( ( rule__Harf__NameAssignment_1 ) )
            {
            // InternalAbjad.g:263:1: ( ( rule__Harf__NameAssignment_1 ) )
            // InternalAbjad.g:264:2: ( rule__Harf__NameAssignment_1 )
            {
             before(grammarAccess.getHarfAccess().getNameAssignment_1()); 
            // InternalAbjad.g:265:2: ( rule__Harf__NameAssignment_1 )
            // InternalAbjad.g:265:3: rule__Harf__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Harf__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHarfAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Group__1__Impl"


    // $ANTLR start "rule__Harf__Group__2"
    // InternalAbjad.g:273:1: rule__Harf__Group__2 : rule__Harf__Group__2__Impl ;
    public final void rule__Harf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:277:1: ( rule__Harf__Group__2__Impl )
            // InternalAbjad.g:278:2: rule__Harf__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Harf__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Group__2"


    // $ANTLR start "rule__Harf__Group__2__Impl"
    // InternalAbjad.g:284:1: rule__Harf__Group__2__Impl : ( ( rule__Harf__Alternatives_2 ) ) ;
    public final void rule__Harf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:288:1: ( ( ( rule__Harf__Alternatives_2 ) ) )
            // InternalAbjad.g:289:1: ( ( rule__Harf__Alternatives_2 ) )
            {
            // InternalAbjad.g:289:1: ( ( rule__Harf__Alternatives_2 ) )
            // InternalAbjad.g:290:2: ( rule__Harf__Alternatives_2 )
            {
             before(grammarAccess.getHarfAccess().getAlternatives_2()); 
            // InternalAbjad.g:291:2: ( rule__Harf__Alternatives_2 )
            // InternalAbjad.g:291:3: rule__Harf__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Harf__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getHarfAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Group__2__Impl"


    // $ANTLR start "rule__Harf__Group_2_0__0"
    // InternalAbjad.g:300:1: rule__Harf__Group_2_0__0 : rule__Harf__Group_2_0__0__Impl rule__Harf__Group_2_0__1 ;
    public final void rule__Harf__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:304:1: ( rule__Harf__Group_2_0__0__Impl rule__Harf__Group_2_0__1 )
            // InternalAbjad.g:305:2: rule__Harf__Group_2_0__0__Impl rule__Harf__Group_2_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Harf__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Harf__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Group_2_0__0"


    // $ANTLR start "rule__Harf__Group_2_0__0__Impl"
    // InternalAbjad.g:312:1: rule__Harf__Group_2_0__0__Impl : ( '\\u0647\\u0648' ) ;
    public final void rule__Harf__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:316:1: ( ( '\\u0647\\u0648' ) )
            // InternalAbjad.g:317:1: ( '\\u0647\\u0648' )
            {
            // InternalAbjad.g:317:1: ( '\\u0647\\u0648' )
            // InternalAbjad.g:318:2: '\\u0647\\u0648'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterHehArabicLetterWawKeyword_2_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getHarfAccess().getArabicLetterHehArabicLetterWawKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Group_2_0__0__Impl"


    // $ANTLR start "rule__Harf__Group_2_0__1"
    // InternalAbjad.g:327:1: rule__Harf__Group_2_0__1 : rule__Harf__Group_2_0__1__Impl rule__Harf__Group_2_0__2 ;
    public final void rule__Harf__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:331:1: ( rule__Harf__Group_2_0__1__Impl rule__Harf__Group_2_0__2 )
            // InternalAbjad.g:332:2: rule__Harf__Group_2_0__1__Impl rule__Harf__Group_2_0__2
            {
            pushFollow(FOLLOW_6);
            rule__Harf__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Harf__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Group_2_0__1"


    // $ANTLR start "rule__Harf__Group_2_0__1__Impl"
    // InternalAbjad.g:339:1: rule__Harf__Group_2_0__1__Impl : ( ( rule__Harf__ValuesAssignment_2_0_1 ) ) ;
    public final void rule__Harf__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:343:1: ( ( ( rule__Harf__ValuesAssignment_2_0_1 ) ) )
            // InternalAbjad.g:344:1: ( ( rule__Harf__ValuesAssignment_2_0_1 ) )
            {
            // InternalAbjad.g:344:1: ( ( rule__Harf__ValuesAssignment_2_0_1 ) )
            // InternalAbjad.g:345:2: ( rule__Harf__ValuesAssignment_2_0_1 )
            {
             before(grammarAccess.getHarfAccess().getValuesAssignment_2_0_1()); 
            // InternalAbjad.g:346:2: ( rule__Harf__ValuesAssignment_2_0_1 )
            // InternalAbjad.g:346:3: rule__Harf__ValuesAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Harf__ValuesAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getHarfAccess().getValuesAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Group_2_0__1__Impl"


    // $ANTLR start "rule__Harf__Group_2_0__2"
    // InternalAbjad.g:354:1: rule__Harf__Group_2_0__2 : rule__Harf__Group_2_0__2__Impl ;
    public final void rule__Harf__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:358:1: ( rule__Harf__Group_2_0__2__Impl )
            // InternalAbjad.g:359:2: rule__Harf__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Harf__Group_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Group_2_0__2"


    // $ANTLR start "rule__Harf__Group_2_0__2__Impl"
    // InternalAbjad.g:365:1: rule__Harf__Group_2_0__2__Impl : ( ( rule__Harf__Group_2_0_2__0 )* ) ;
    public final void rule__Harf__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:369:1: ( ( ( rule__Harf__Group_2_0_2__0 )* ) )
            // InternalAbjad.g:370:1: ( ( rule__Harf__Group_2_0_2__0 )* )
            {
            // InternalAbjad.g:370:1: ( ( rule__Harf__Group_2_0_2__0 )* )
            // InternalAbjad.g:371:2: ( rule__Harf__Group_2_0_2__0 )*
            {
             before(grammarAccess.getHarfAccess().getGroup_2_0_2()); 
            // InternalAbjad.g:372:2: ( rule__Harf__Group_2_0_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAbjad.g:372:3: rule__Harf__Group_2_0_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Harf__Group_2_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getHarfAccess().getGroup_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Group_2_0__2__Impl"


    // $ANTLR start "rule__Harf__Group_2_0_2__0"
    // InternalAbjad.g:381:1: rule__Harf__Group_2_0_2__0 : rule__Harf__Group_2_0_2__0__Impl rule__Harf__Group_2_0_2__1 ;
    public final void rule__Harf__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:385:1: ( rule__Harf__Group_2_0_2__0__Impl rule__Harf__Group_2_0_2__1 )
            // InternalAbjad.g:386:2: rule__Harf__Group_2_0_2__0__Impl rule__Harf__Group_2_0_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Harf__Group_2_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Harf__Group_2_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Group_2_0_2__0"


    // $ANTLR start "rule__Harf__Group_2_0_2__0__Impl"
    // InternalAbjad.g:393:1: rule__Harf__Group_2_0_2__0__Impl : ( '\\u0623\\u0648' ) ;
    public final void rule__Harf__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:397:1: ( ( '\\u0623\\u0648' ) )
            // InternalAbjad.g:398:1: ( '\\u0623\\u0648' )
            {
            // InternalAbjad.g:398:1: ( '\\u0623\\u0648' )
            // InternalAbjad.g:399:2: '\\u0623\\u0648'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterAlefWithHamzaAboveArabicLetterWawKeyword_2_0_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getHarfAccess().getArabicLetterAlefWithHamzaAboveArabicLetterWawKeyword_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Group_2_0_2__0__Impl"


    // $ANTLR start "rule__Harf__Group_2_0_2__1"
    // InternalAbjad.g:408:1: rule__Harf__Group_2_0_2__1 : rule__Harf__Group_2_0_2__1__Impl ;
    public final void rule__Harf__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:412:1: ( rule__Harf__Group_2_0_2__1__Impl )
            // InternalAbjad.g:413:2: rule__Harf__Group_2_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Harf__Group_2_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Group_2_0_2__1"


    // $ANTLR start "rule__Harf__Group_2_0_2__1__Impl"
    // InternalAbjad.g:419:1: rule__Harf__Group_2_0_2__1__Impl : ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) ) ;
    public final void rule__Harf__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:423:1: ( ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) ) )
            // InternalAbjad.g:424:1: ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) )
            {
            // InternalAbjad.g:424:1: ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) )
            // InternalAbjad.g:425:2: ( rule__Harf__ValuesAssignment_2_0_2_1 )
            {
             before(grammarAccess.getHarfAccess().getValuesAssignment_2_0_2_1()); 
            // InternalAbjad.g:426:2: ( rule__Harf__ValuesAssignment_2_0_2_1 )
            // InternalAbjad.g:426:3: rule__Harf__ValuesAssignment_2_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Harf__ValuesAssignment_2_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHarfAccess().getValuesAssignment_2_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Group_2_0_2__1__Impl"


    // $ANTLR start "rule__Harf__Group_2_1__0"
    // InternalAbjad.g:435:1: rule__Harf__Group_2_1__0 : rule__Harf__Group_2_1__0__Impl rule__Harf__Group_2_1__1 ;
    public final void rule__Harf__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:439:1: ( rule__Harf__Group_2_1__0__Impl rule__Harf__Group_2_1__1 )
            // InternalAbjad.g:440:2: rule__Harf__Group_2_1__0__Impl rule__Harf__Group_2_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Harf__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Harf__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Group_2_1__0"


    // $ANTLR start "rule__Harf__Group_2_1__0__Impl"
    // InternalAbjad.g:447:1: rule__Harf__Group_2_1__0__Impl : ( '\\u0630\\u0627\\u062A\\u0647' ) ;
    public final void rule__Harf__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:451:1: ( ( '\\u0630\\u0627\\u062A\\u0647' ) )
            // InternalAbjad.g:452:1: ( '\\u0630\\u0627\\u062A\\u0647' )
            {
            // InternalAbjad.g:452:1: ( '\\u0630\\u0627\\u062A\\u0647' )
            // InternalAbjad.g:453:2: '\\u0630\\u0627\\u062A\\u0647'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterThalArabicLetterAlefArabicLetterTehArabicLetterHehKeyword_2_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getHarfAccess().getArabicLetterThalArabicLetterAlefArabicLetterTehArabicLetterHehKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Group_2_1__0__Impl"


    // $ANTLR start "rule__Harf__Group_2_1__1"
    // InternalAbjad.g:462:1: rule__Harf__Group_2_1__1 : rule__Harf__Group_2_1__1__Impl ;
    public final void rule__Harf__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:466:1: ( rule__Harf__Group_2_1__1__Impl )
            // InternalAbjad.g:467:2: rule__Harf__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Harf__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Group_2_1__1"


    // $ANTLR start "rule__Harf__Group_2_1__1__Impl"
    // InternalAbjad.g:473:1: rule__Harf__Group_2_1__1__Impl : ( ( rule__Harf__RefAssignment_2_1_1 ) ) ;
    public final void rule__Harf__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:477:1: ( ( ( rule__Harf__RefAssignment_2_1_1 ) ) )
            // InternalAbjad.g:478:1: ( ( rule__Harf__RefAssignment_2_1_1 ) )
            {
            // InternalAbjad.g:478:1: ( ( rule__Harf__RefAssignment_2_1_1 ) )
            // InternalAbjad.g:479:2: ( rule__Harf__RefAssignment_2_1_1 )
            {
             before(grammarAccess.getHarfAccess().getRefAssignment_2_1_1()); 
            // InternalAbjad.g:480:2: ( rule__Harf__RefAssignment_2_1_1 )
            // InternalAbjad.g:480:3: rule__Harf__RefAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Harf__RefAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getHarfAccess().getRefAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__Group_2_1__1__Impl"


    // $ANTLR start "rule__Harakah__Group__0"
    // InternalAbjad.g:489:1: rule__Harakah__Group__0 : rule__Harakah__Group__0__Impl rule__Harakah__Group__1 ;
    public final void rule__Harakah__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:493:1: ( rule__Harakah__Group__0__Impl rule__Harakah__Group__1 )
            // InternalAbjad.g:494:2: rule__Harakah__Group__0__Impl rule__Harakah__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Harakah__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Harakah__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harakah__Group__0"


    // $ANTLR start "rule__Harakah__Group__0__Impl"
    // InternalAbjad.g:501:1: rule__Harakah__Group__0__Impl : ( '\\u062D\\u0631\\u0643\\u0629' ) ;
    public final void rule__Harakah__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:505:1: ( ( '\\u062D\\u0631\\u0643\\u0629' ) )
            // InternalAbjad.g:506:1: ( '\\u062D\\u0631\\u0643\\u0629' )
            {
            // InternalAbjad.g:506:1: ( '\\u062D\\u0631\\u0643\\u0629' )
            // InternalAbjad.g:507:2: '\\u062D\\u0631\\u0643\\u0629'
            {
             before(grammarAccess.getHarakahAccess().getArabicLetterHahArabicLetterRehArabicLetterKafArabicLetterTehMarbutaKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHarakahAccess().getArabicLetterHahArabicLetterRehArabicLetterKafArabicLetterTehMarbutaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harakah__Group__0__Impl"


    // $ANTLR start "rule__Harakah__Group__1"
    // InternalAbjad.g:516:1: rule__Harakah__Group__1 : rule__Harakah__Group__1__Impl rule__Harakah__Group__2 ;
    public final void rule__Harakah__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:520:1: ( rule__Harakah__Group__1__Impl rule__Harakah__Group__2 )
            // InternalAbjad.g:521:2: rule__Harakah__Group__1__Impl rule__Harakah__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Harakah__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Harakah__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harakah__Group__1"


    // $ANTLR start "rule__Harakah__Group__1__Impl"
    // InternalAbjad.g:528:1: rule__Harakah__Group__1__Impl : ( ( rule__Harakah__NameAssignment_1 ) ) ;
    public final void rule__Harakah__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:532:1: ( ( ( rule__Harakah__NameAssignment_1 ) ) )
            // InternalAbjad.g:533:1: ( ( rule__Harakah__NameAssignment_1 ) )
            {
            // InternalAbjad.g:533:1: ( ( rule__Harakah__NameAssignment_1 ) )
            // InternalAbjad.g:534:2: ( rule__Harakah__NameAssignment_1 )
            {
             before(grammarAccess.getHarakahAccess().getNameAssignment_1()); 
            // InternalAbjad.g:535:2: ( rule__Harakah__NameAssignment_1 )
            // InternalAbjad.g:535:3: rule__Harakah__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Harakah__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHarakahAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harakah__Group__1__Impl"


    // $ANTLR start "rule__Harakah__Group__2"
    // InternalAbjad.g:543:1: rule__Harakah__Group__2 : rule__Harakah__Group__2__Impl rule__Harakah__Group__3 ;
    public final void rule__Harakah__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:547:1: ( rule__Harakah__Group__2__Impl rule__Harakah__Group__3 )
            // InternalAbjad.g:548:2: rule__Harakah__Group__2__Impl rule__Harakah__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Harakah__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Harakah__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harakah__Group__2"


    // $ANTLR start "rule__Harakah__Group__2__Impl"
    // InternalAbjad.g:555:1: rule__Harakah__Group__2__Impl : ( '\\u0647\\u064A' ) ;
    public final void rule__Harakah__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:559:1: ( ( '\\u0647\\u064A' ) )
            // InternalAbjad.g:560:1: ( '\\u0647\\u064A' )
            {
            // InternalAbjad.g:560:1: ( '\\u0647\\u064A' )
            // InternalAbjad.g:561:2: '\\u0647\\u064A'
            {
             before(grammarAccess.getHarakahAccess().getArabicLetterHehArabicLetterYehKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getHarakahAccess().getArabicLetterHehArabicLetterYehKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harakah__Group__2__Impl"


    // $ANTLR start "rule__Harakah__Group__3"
    // InternalAbjad.g:570:1: rule__Harakah__Group__3 : rule__Harakah__Group__3__Impl ;
    public final void rule__Harakah__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:574:1: ( rule__Harakah__Group__3__Impl )
            // InternalAbjad.g:575:2: rule__Harakah__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Harakah__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harakah__Group__3"


    // $ANTLR start "rule__Harakah__Group__3__Impl"
    // InternalAbjad.g:581:1: rule__Harakah__Group__3__Impl : ( ( rule__Harakah__ValueAssignment_3 ) ) ;
    public final void rule__Harakah__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:585:1: ( ( ( rule__Harakah__ValueAssignment_3 ) ) )
            // InternalAbjad.g:586:1: ( ( rule__Harakah__ValueAssignment_3 ) )
            {
            // InternalAbjad.g:586:1: ( ( rule__Harakah__ValueAssignment_3 ) )
            // InternalAbjad.g:587:2: ( rule__Harakah__ValueAssignment_3 )
            {
             before(grammarAccess.getHarakahAccess().getValueAssignment_3()); 
            // InternalAbjad.g:588:2: ( rule__Harakah__ValueAssignment_3 )
            // InternalAbjad.g:588:3: rule__Harakah__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Harakah__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHarakahAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harakah__Group__3__Impl"


    // $ANTLR start "rule__AyahStart__Group__0"
    // InternalAbjad.g:597:1: rule__AyahStart__Group__0 : rule__AyahStart__Group__0__Impl rule__AyahStart__Group__1 ;
    public final void rule__AyahStart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:601:1: ( rule__AyahStart__Group__0__Impl rule__AyahStart__Group__1 )
            // InternalAbjad.g:602:2: rule__AyahStart__Group__0__Impl rule__AyahStart__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__AyahStart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AyahStart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AyahStart__Group__0"


    // $ANTLR start "rule__AyahStart__Group__0__Impl"
    // InternalAbjad.g:609:1: rule__AyahStart__Group__0__Impl : ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ) ;
    public final void rule__AyahStart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:613:1: ( ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ) )
            // InternalAbjad.g:614:1: ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' )
            {
            // InternalAbjad.g:614:1: ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' )
            // InternalAbjad.g:615:2: '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'
            {
             before(grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterSeenArabicLetterWawArabicLetterRehArabicLetterTehMarbutaKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterSeenArabicLetterWawArabicLetterRehArabicLetterTehMarbutaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AyahStart__Group__0__Impl"


    // $ANTLR start "rule__AyahStart__Group__1"
    // InternalAbjad.g:624:1: rule__AyahStart__Group__1 : rule__AyahStart__Group__1__Impl rule__AyahStart__Group__2 ;
    public final void rule__AyahStart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:628:1: ( rule__AyahStart__Group__1__Impl rule__AyahStart__Group__2 )
            // InternalAbjad.g:629:2: rule__AyahStart__Group__1__Impl rule__AyahStart__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__AyahStart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AyahStart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AyahStart__Group__1"


    // $ANTLR start "rule__AyahStart__Group__1__Impl"
    // InternalAbjad.g:636:1: rule__AyahStart__Group__1__Impl : ( ( rule__AyahStart__SurahAssignment_1 ) ) ;
    public final void rule__AyahStart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:640:1: ( ( ( rule__AyahStart__SurahAssignment_1 ) ) )
            // InternalAbjad.g:641:1: ( ( rule__AyahStart__SurahAssignment_1 ) )
            {
            // InternalAbjad.g:641:1: ( ( rule__AyahStart__SurahAssignment_1 ) )
            // InternalAbjad.g:642:2: ( rule__AyahStart__SurahAssignment_1 )
            {
             before(grammarAccess.getAyahStartAccess().getSurahAssignment_1()); 
            // InternalAbjad.g:643:2: ( rule__AyahStart__SurahAssignment_1 )
            // InternalAbjad.g:643:3: rule__AyahStart__SurahAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AyahStart__SurahAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAyahStartAccess().getSurahAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AyahStart__Group__1__Impl"


    // $ANTLR start "rule__AyahStart__Group__2"
    // InternalAbjad.g:651:1: rule__AyahStart__Group__2 : rule__AyahStart__Group__2__Impl rule__AyahStart__Group__3 ;
    public final void rule__AyahStart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:655:1: ( rule__AyahStart__Group__2__Impl rule__AyahStart__Group__3 )
            // InternalAbjad.g:656:2: rule__AyahStart__Group__2__Impl rule__AyahStart__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__AyahStart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AyahStart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AyahStart__Group__2"


    // $ANTLR start "rule__AyahStart__Group__2__Impl"
    // InternalAbjad.g:663:1: rule__AyahStart__Group__2__Impl : ( '\\u0627\\u0644\\u0622\\u064A\\u0629' ) ;
    public final void rule__AyahStart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:667:1: ( ( '\\u0627\\u0644\\u0622\\u064A\\u0629' ) )
            // InternalAbjad.g:668:1: ( '\\u0627\\u0644\\u0622\\u064A\\u0629' )
            {
            // InternalAbjad.g:668:1: ( '\\u0627\\u0644\\u0622\\u064A\\u0629' )
            // InternalAbjad.g:669:2: '\\u0627\\u0644\\u0622\\u064A\\u0629'
            {
             before(grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithMaddaAboveArabicLetterYehArabicLetterTehMarbutaKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithMaddaAboveArabicLetterYehArabicLetterTehMarbutaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AyahStart__Group__2__Impl"


    // $ANTLR start "rule__AyahStart__Group__3"
    // InternalAbjad.g:678:1: rule__AyahStart__Group__3 : rule__AyahStart__Group__3__Impl rule__AyahStart__Group__4 ;
    public final void rule__AyahStart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:682:1: ( rule__AyahStart__Group__3__Impl rule__AyahStart__Group__4 )
            // InternalAbjad.g:683:2: rule__AyahStart__Group__3__Impl rule__AyahStart__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__AyahStart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AyahStart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AyahStart__Group__3"


    // $ANTLR start "rule__AyahStart__Group__3__Impl"
    // InternalAbjad.g:690:1: rule__AyahStart__Group__3__Impl : ( ( rule__AyahStart__AyahAssignment_3 ) ) ;
    public final void rule__AyahStart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:694:1: ( ( ( rule__AyahStart__AyahAssignment_3 ) ) )
            // InternalAbjad.g:695:1: ( ( rule__AyahStart__AyahAssignment_3 ) )
            {
            // InternalAbjad.g:695:1: ( ( rule__AyahStart__AyahAssignment_3 ) )
            // InternalAbjad.g:696:2: ( rule__AyahStart__AyahAssignment_3 )
            {
             before(grammarAccess.getAyahStartAccess().getAyahAssignment_3()); 
            // InternalAbjad.g:697:2: ( rule__AyahStart__AyahAssignment_3 )
            // InternalAbjad.g:697:3: rule__AyahStart__AyahAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AyahStart__AyahAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAyahStartAccess().getAyahAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AyahStart__Group__3__Impl"


    // $ANTLR start "rule__AyahStart__Group__4"
    // InternalAbjad.g:705:1: rule__AyahStart__Group__4 : rule__AyahStart__Group__4__Impl ;
    public final void rule__AyahStart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:709:1: ( rule__AyahStart__Group__4__Impl )
            // InternalAbjad.g:710:2: rule__AyahStart__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AyahStart__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AyahStart__Group__4"


    // $ANTLR start "rule__AyahStart__Group__4__Impl"
    // InternalAbjad.g:716:1: rule__AyahStart__Group__4__Impl : ( ( rule__AyahStart__NameAssignment_4 ) ) ;
    public final void rule__AyahStart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:720:1: ( ( ( rule__AyahStart__NameAssignment_4 ) ) )
            // InternalAbjad.g:721:1: ( ( rule__AyahStart__NameAssignment_4 ) )
            {
            // InternalAbjad.g:721:1: ( ( rule__AyahStart__NameAssignment_4 ) )
            // InternalAbjad.g:722:2: ( rule__AyahStart__NameAssignment_4 )
            {
             before(grammarAccess.getAyahStartAccess().getNameAssignment_4()); 
            // InternalAbjad.g:723:2: ( rule__AyahStart__NameAssignment_4 )
            // InternalAbjad.g:723:3: rule__AyahStart__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AyahStart__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAyahStartAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AyahStart__Group__4__Impl"


    // $ANTLR start "rule__Phrase__Group__0"
    // InternalAbjad.g:732:1: rule__Phrase__Group__0 : rule__Phrase__Group__0__Impl rule__Phrase__Group__1 ;
    public final void rule__Phrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:736:1: ( rule__Phrase__Group__0__Impl rule__Phrase__Group__1 )
            // InternalAbjad.g:737:2: rule__Phrase__Group__0__Impl rule__Phrase__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Phrase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__0"


    // $ANTLR start "rule__Phrase__Group__0__Impl"
    // InternalAbjad.g:744:1: rule__Phrase__Group__0__Impl : ( ( rule__Phrase__BasmalahAssignment_0 )? ) ;
    public final void rule__Phrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:748:1: ( ( ( rule__Phrase__BasmalahAssignment_0 )? ) )
            // InternalAbjad.g:749:1: ( ( rule__Phrase__BasmalahAssignment_0 )? )
            {
            // InternalAbjad.g:749:1: ( ( rule__Phrase__BasmalahAssignment_0 )? )
            // InternalAbjad.g:750:2: ( rule__Phrase__BasmalahAssignment_0 )?
            {
             before(grammarAccess.getPhraseAccess().getBasmalahAssignment_0()); 
            // InternalAbjad.g:751:2: ( rule__Phrase__BasmalahAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_BASMALAH) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAbjad.g:751:3: rule__Phrase__BasmalahAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Phrase__BasmalahAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhraseAccess().getBasmalahAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__0__Impl"


    // $ANTLR start "rule__Phrase__Group__1"
    // InternalAbjad.g:759:1: rule__Phrase__Group__1 : rule__Phrase__Group__1__Impl ;
    public final void rule__Phrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:763:1: ( rule__Phrase__Group__1__Impl )
            // InternalAbjad.g:764:2: rule__Phrase__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__1"


    // $ANTLR start "rule__Phrase__Group__1__Impl"
    // InternalAbjad.g:770:1: rule__Phrase__Group__1__Impl : ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) ) ;
    public final void rule__Phrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:774:1: ( ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) ) )
            // InternalAbjad.g:775:1: ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) )
            {
            // InternalAbjad.g:775:1: ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) )
            // InternalAbjad.g:776:2: ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* )
            {
            // InternalAbjad.g:776:2: ( ( rule__Phrase__WordsAssignment_1 ) )
            // InternalAbjad.g:777:3: ( rule__Phrase__WordsAssignment_1 )
            {
             before(grammarAccess.getPhraseAccess().getWordsAssignment_1()); 
            // InternalAbjad.g:778:3: ( rule__Phrase__WordsAssignment_1 )
            // InternalAbjad.g:778:4: rule__Phrase__WordsAssignment_1
            {
            pushFollow(FOLLOW_12);
            rule__Phrase__WordsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getWordsAssignment_1()); 

            }

            // InternalAbjad.g:781:2: ( ( rule__Phrase__WordsAssignment_1 )* )
            // InternalAbjad.g:782:3: ( rule__Phrase__WordsAssignment_1 )*
            {
             before(grammarAccess.getPhraseAccess().getWordsAssignment_1()); 
            // InternalAbjad.g:783:3: ( rule__Phrase__WordsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_AWORD) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAbjad.g:783:4: rule__Phrase__WordsAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Phrase__WordsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPhraseAccess().getWordsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__1__Impl"


    // $ANTLR start "rule__AbjadModel__HouroufAssignment_0"
    // InternalAbjad.g:793:1: rule__AbjadModel__HouroufAssignment_0 : ( ruleHarf ) ;
    public final void rule__AbjadModel__HouroufAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:797:1: ( ( ruleHarf ) )
            // InternalAbjad.g:798:2: ( ruleHarf )
            {
            // InternalAbjad.g:798:2: ( ruleHarf )
            // InternalAbjad.g:799:3: ruleHarf
            {
             before(grammarAccess.getAbjadModelAccess().getHouroufHarfParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHarf();

            state._fsp--;

             after(grammarAccess.getAbjadModelAccess().getHouroufHarfParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbjadModel__HouroufAssignment_0"


    // $ANTLR start "rule__AbjadModel__HarakatAssignment_1"
    // InternalAbjad.g:808:1: rule__AbjadModel__HarakatAssignment_1 : ( ruleHarakah ) ;
    public final void rule__AbjadModel__HarakatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:812:1: ( ( ruleHarakah ) )
            // InternalAbjad.g:813:2: ( ruleHarakah )
            {
            // InternalAbjad.g:813:2: ( ruleHarakah )
            // InternalAbjad.g:814:3: ruleHarakah
            {
             before(grammarAccess.getAbjadModelAccess().getHarakatHarakahParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHarakah();

            state._fsp--;

             after(grammarAccess.getAbjadModelAccess().getHarakatHarakahParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbjadModel__HarakatAssignment_1"


    // $ANTLR start "rule__Harf__NameAssignment_1"
    // InternalAbjad.g:823:1: rule__Harf__NameAssignment_1 : ( RULE_AWORD ) ;
    public final void rule__Harf__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:827:1: ( ( RULE_AWORD ) )
            // InternalAbjad.g:828:2: ( RULE_AWORD )
            {
            // InternalAbjad.g:828:2: ( RULE_AWORD )
            // InternalAbjad.g:829:3: RULE_AWORD
            {
             before(grammarAccess.getHarfAccess().getNameAWORDTerminalRuleCall_1_0()); 
            match(input,RULE_AWORD,FOLLOW_2); 
             after(grammarAccess.getHarfAccess().getNameAWORDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__NameAssignment_1"


    // $ANTLR start "rule__Harf__ValuesAssignment_2_0_1"
    // InternalAbjad.g:838:1: rule__Harf__ValuesAssignment_2_0_1 : ( RULE_AWORD ) ;
    public final void rule__Harf__ValuesAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:842:1: ( ( RULE_AWORD ) )
            // InternalAbjad.g:843:2: ( RULE_AWORD )
            {
            // InternalAbjad.g:843:2: ( RULE_AWORD )
            // InternalAbjad.g:844:3: RULE_AWORD
            {
             before(grammarAccess.getHarfAccess().getValuesAWORDTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_AWORD,FOLLOW_2); 
             after(grammarAccess.getHarfAccess().getValuesAWORDTerminalRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__ValuesAssignment_2_0_1"


    // $ANTLR start "rule__Harf__ValuesAssignment_2_0_2_1"
    // InternalAbjad.g:853:1: rule__Harf__ValuesAssignment_2_0_2_1 : ( RULE_AWORD ) ;
    public final void rule__Harf__ValuesAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:857:1: ( ( RULE_AWORD ) )
            // InternalAbjad.g:858:2: ( RULE_AWORD )
            {
            // InternalAbjad.g:858:2: ( RULE_AWORD )
            // InternalAbjad.g:859:3: RULE_AWORD
            {
             before(grammarAccess.getHarfAccess().getValuesAWORDTerminalRuleCall_2_0_2_1_0()); 
            match(input,RULE_AWORD,FOLLOW_2); 
             after(grammarAccess.getHarfAccess().getValuesAWORDTerminalRuleCall_2_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__ValuesAssignment_2_0_2_1"


    // $ANTLR start "rule__Harf__RefAssignment_2_1_1"
    // InternalAbjad.g:868:1: rule__Harf__RefAssignment_2_1_1 : ( ( RULE_AWORD ) ) ;
    public final void rule__Harf__RefAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:872:1: ( ( ( RULE_AWORD ) ) )
            // InternalAbjad.g:873:2: ( ( RULE_AWORD ) )
            {
            // InternalAbjad.g:873:2: ( ( RULE_AWORD ) )
            // InternalAbjad.g:874:3: ( RULE_AWORD )
            {
             before(grammarAccess.getHarfAccess().getRefHarfCrossReference_2_1_1_0()); 
            // InternalAbjad.g:875:3: ( RULE_AWORD )
            // InternalAbjad.g:876:4: RULE_AWORD
            {
             before(grammarAccess.getHarfAccess().getRefHarfAWORDTerminalRuleCall_2_1_1_0_1()); 
            match(input,RULE_AWORD,FOLLOW_2); 
             after(grammarAccess.getHarfAccess().getRefHarfAWORDTerminalRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getHarfAccess().getRefHarfCrossReference_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harf__RefAssignment_2_1_1"


    // $ANTLR start "rule__Harakah__NameAssignment_1"
    // InternalAbjad.g:887:1: rule__Harakah__NameAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Harakah__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:891:1: ( ( RULE_KALEMAH ) )
            // InternalAbjad.g:892:2: ( RULE_KALEMAH )
            {
            // InternalAbjad.g:892:2: ( RULE_KALEMAH )
            // InternalAbjad.g:893:3: RULE_KALEMAH
            {
             before(grammarAccess.getHarakahAccess().getNameKALEMAHTerminalRuleCall_1_0()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getHarakahAccess().getNameKALEMAHTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harakah__NameAssignment_1"


    // $ANTLR start "rule__Harakah__ValueAssignment_3"
    // InternalAbjad.g:902:1: rule__Harakah__ValueAssignment_3 : ( RULE_AWORD ) ;
    public final void rule__Harakah__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:906:1: ( ( RULE_AWORD ) )
            // InternalAbjad.g:907:2: ( RULE_AWORD )
            {
            // InternalAbjad.g:907:2: ( RULE_AWORD )
            // InternalAbjad.g:908:3: RULE_AWORD
            {
             before(grammarAccess.getHarakahAccess().getValueAWORDTerminalRuleCall_3_0()); 
            match(input,RULE_AWORD,FOLLOW_2); 
             after(grammarAccess.getHarakahAccess().getValueAWORDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Harakah__ValueAssignment_3"


    // $ANTLR start "rule__AyahStart__SurahAssignment_1"
    // InternalAbjad.g:917:1: rule__AyahStart__SurahAssignment_1 : ( RULE_INT ) ;
    public final void rule__AyahStart__SurahAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:921:1: ( ( RULE_INT ) )
            // InternalAbjad.g:922:2: ( RULE_INT )
            {
            // InternalAbjad.g:922:2: ( RULE_INT )
            // InternalAbjad.g:923:3: RULE_INT
            {
             before(grammarAccess.getAyahStartAccess().getSurahINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAyahStartAccess().getSurahINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AyahStart__SurahAssignment_1"


    // $ANTLR start "rule__AyahStart__AyahAssignment_3"
    // InternalAbjad.g:932:1: rule__AyahStart__AyahAssignment_3 : ( RULE_INT ) ;
    public final void rule__AyahStart__AyahAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:936:1: ( ( RULE_INT ) )
            // InternalAbjad.g:937:2: ( RULE_INT )
            {
            // InternalAbjad.g:937:2: ( RULE_INT )
            // InternalAbjad.g:938:3: RULE_INT
            {
             before(grammarAccess.getAyahStartAccess().getAyahINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAyahStartAccess().getAyahINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AyahStart__AyahAssignment_3"


    // $ANTLR start "rule__AyahStart__NameAssignment_4"
    // InternalAbjad.g:947:1: rule__AyahStart__NameAssignment_4 : ( RULE_KALEMAH ) ;
    public final void rule__AyahStart__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:951:1: ( ( RULE_KALEMAH ) )
            // InternalAbjad.g:952:2: ( RULE_KALEMAH )
            {
            // InternalAbjad.g:952:2: ( RULE_KALEMAH )
            // InternalAbjad.g:953:3: RULE_KALEMAH
            {
             before(grammarAccess.getAyahStartAccess().getNameKALEMAHTerminalRuleCall_4_0()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getAyahStartAccess().getNameKALEMAHTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AyahStart__NameAssignment_4"


    // $ANTLR start "rule__Phrase__BasmalahAssignment_0"
    // InternalAbjad.g:962:1: rule__Phrase__BasmalahAssignment_0 : ( RULE_BASMALAH ) ;
    public final void rule__Phrase__BasmalahAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:966:1: ( ( RULE_BASMALAH ) )
            // InternalAbjad.g:967:2: ( RULE_BASMALAH )
            {
            // InternalAbjad.g:967:2: ( RULE_BASMALAH )
            // InternalAbjad.g:968:3: RULE_BASMALAH
            {
             before(grammarAccess.getPhraseAccess().getBasmalahBASMALAHTerminalRuleCall_0_0()); 
            match(input,RULE_BASMALAH,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getBasmalahBASMALAHTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__BasmalahAssignment_0"


    // $ANTLR start "rule__Phrase__WordsAssignment_1"
    // InternalAbjad.g:977:1: rule__Phrase__WordsAssignment_1 : ( RULE_AWORD ) ;
    public final void rule__Phrase__WordsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAbjad.g:981:1: ( ( RULE_AWORD ) )
            // InternalAbjad.g:982:2: ( RULE_AWORD )
            {
            // InternalAbjad.g:982:2: ( RULE_AWORD )
            // InternalAbjad.g:983:3: RULE_AWORD
            {
             before(grammarAccess.getPhraseAccess().getWordsAWORDTerminalRuleCall_1_0()); 
            match(input,RULE_AWORD,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getWordsAWORDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__WordsAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});

}