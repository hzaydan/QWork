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
import org.qwork.services.QiraaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQiraaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_AWORD", "RULE_BASMALAH", "RULE_KALEMAH", "RULE_INT", "RULE_ALETTER", "RULE_AHARAKAH", "RULE_ATANWEEN", "RULE_ASHADDAH", "RULE_ALIGATURES", "RULE_ADIGIT", "RULE_ANONLETTER", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\u0631\\u062D\\u0645\\u0647'", "'\\u0623\\u0643\\u0631\\u0645\\u0647'", "'\\u0627\\u0644\\u0623\\u0648\\u0644'", "'\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A'", "'\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B'", "'\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631'", "'\\u0645\\u0631\\u062C\\u0639'", "'\\u0645\\u0628\\u0646\\u064A'", "'\\u0639\\u0644\\u0649'", "'\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647'", "'\\u0627\\u0646\\u062A\\u0647\\u0649'", "'\\u0642\\u0648\\u0644\\u0647'", "'\\u0645\\u0639\\u0646\\u0627\\u0647'", "'\\u0642\\u0631\\u0623'", "'\\u0628'", "'\\u0641\\u064A'", "'*'", "'('", "')'", "'-'", "'...'", "'\\u0627\\u0633\\u0645\\u0647'", "'\\u0644\\u0642\\u0628\\u0647'", "'\\u062A\\u0648\\u0641\\u064A'", "'\\u0627\\u0644\\u0644\\u0647'", "'\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645'", "'\\u0642\\u0627\\u0631\\u0626'", "'\\u0631\\u0627\\u0648'", "'\\u0639\\u0646'", "'\\u0637\\u0631\\u064A\\u0642'", "'\\u062A\\u0644\\u0627\\u0648\\u0629'", "'\\u0644'", "'\\u0645\\u0646'", "'\\u0642\\u064A\\u062F'", "'\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D'", "'\\u064A\\u0639\\u0646\\u064A'", "'\\u0648'", "'\\u0631\\u0645\\u0632'", "'\\u062A\\u0639\\u0627\\u0644\\u0649'", "'\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639'", "'\\u062D\\u0631\\u0641'", "'\\u0647\\u0648'", "'\\u0623\\u0648'", "'\\u0630\\u0627\\u062A\\u0647'", "'\\u062D\\u0631\\u0643\\u0629'", "'\\u0647\\u064A'", "'\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'", "'\\u0627\\u0644\\u0622\\u064A\\u0629'", "'\\u062E\\u0627\\u0644\\u0635'", "'\\u0645\\u0631\\u0643\\u0628'"
    };
    public static final int T__50=50;
    public static final int RULE_KALEMAH=6;
    public static final int T__59=59;
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
    public static final int RULE_ID=16;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int RULE_AWORD=4;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int RULE_BASMALAH=5;
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


        public InternalQiraaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQiraaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQiraaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQiraa.g"; }


    	private QiraaGrammarAccess grammarAccess;

    	public void setGrammarAccess(QiraaGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleQiraaModel"
    // InternalQiraa.g:53:1: entryRuleQiraaModel : ruleQiraaModel EOF ;
    public final void entryRuleQiraaModel() throws RecognitionException {
        try {
            // InternalQiraa.g:54:1: ( ruleQiraaModel EOF )
            // InternalQiraa.g:55:1: ruleQiraaModel EOF
            {
             before(grammarAccess.getQiraaModelRule()); 
            pushFollow(FOLLOW_1);
            ruleQiraaModel();

            state._fsp--;

             after(grammarAccess.getQiraaModelRule()); 
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
    // $ANTLR end "entryRuleQiraaModel"


    // $ANTLR start "ruleQiraaModel"
    // InternalQiraa.g:62:1: ruleQiraaModel : ( ( rule__QiraaModel__MarjeeAssignment )* ) ;
    public final void ruleQiraaModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:66:2: ( ( ( rule__QiraaModel__MarjeeAssignment )* ) )
            // InternalQiraa.g:67:2: ( ( rule__QiraaModel__MarjeeAssignment )* )
            {
            // InternalQiraa.g:67:2: ( ( rule__QiraaModel__MarjeeAssignment )* )
            // InternalQiraa.g:68:3: ( rule__QiraaModel__MarjeeAssignment )*
            {
             before(grammarAccess.getQiraaModelAccess().getMarjeeAssignment()); 
            // InternalQiraa.g:69:3: ( rule__QiraaModel__MarjeeAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQiraa.g:69:4: rule__QiraaModel__MarjeeAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__QiraaModel__MarjeeAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getQiraaModelAccess().getMarjeeAssignment()); 

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
    // $ANTLR end "ruleQiraaModel"


    // $ANTLR start "entryRuleMarjeh"
    // InternalQiraa.g:78:1: entryRuleMarjeh : ruleMarjeh EOF ;
    public final void entryRuleMarjeh() throws RecognitionException {
        try {
            // InternalQiraa.g:79:1: ( ruleMarjeh EOF )
            // InternalQiraa.g:80:1: ruleMarjeh EOF
            {
             before(grammarAccess.getMarjehRule()); 
            pushFollow(FOLLOW_1);
            ruleMarjeh();

            state._fsp--;

             after(grammarAccess.getMarjehRule()); 
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
    // $ANTLR end "entryRuleMarjeh"


    // $ANTLR start "ruleMarjeh"
    // InternalQiraa.g:87:1: ruleMarjeh : ( ( rule__Marjeh__Group__0 ) ) ;
    public final void ruleMarjeh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:91:2: ( ( ( rule__Marjeh__Group__0 ) ) )
            // InternalQiraa.g:92:2: ( ( rule__Marjeh__Group__0 ) )
            {
            // InternalQiraa.g:92:2: ( ( rule__Marjeh__Group__0 ) )
            // InternalQiraa.g:93:3: ( rule__Marjeh__Group__0 )
            {
             before(grammarAccess.getMarjehAccess().getGroup()); 
            // InternalQiraa.g:94:3: ( rule__Marjeh__Group__0 )
            // InternalQiraa.g:94:4: rule__Marjeh__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Marjeh__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMarjehAccess().getGroup()); 

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
    // $ANTLR end "ruleMarjeh"


    // $ANTLR start "entryRuleTafsil"
    // InternalQiraa.g:103:1: entryRuleTafsil : ruleTafsil EOF ;
    public final void entryRuleTafsil() throws RecognitionException {
        try {
            // InternalQiraa.g:104:1: ( ruleTafsil EOF )
            // InternalQiraa.g:105:1: ruleTafsil EOF
            {
             before(grammarAccess.getTafsilRule()); 
            pushFollow(FOLLOW_1);
            ruleTafsil();

            state._fsp--;

             after(grammarAccess.getTafsilRule()); 
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
    // $ANTLR end "entryRuleTafsil"


    // $ANTLR start "ruleTafsil"
    // InternalQiraa.g:112:1: ruleTafsil : ( ( rule__Tafsil__Group__0 ) ) ;
    public final void ruleTafsil() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:116:2: ( ( ( rule__Tafsil__Group__0 ) ) )
            // InternalQiraa.g:117:2: ( ( rule__Tafsil__Group__0 ) )
            {
            // InternalQiraa.g:117:2: ( ( rule__Tafsil__Group__0 ) )
            // InternalQiraa.g:118:3: ( rule__Tafsil__Group__0 )
            {
             before(grammarAccess.getTafsilAccess().getGroup()); 
            // InternalQiraa.g:119:3: ( rule__Tafsil__Group__0 )
            // InternalQiraa.g:119:4: rule__Tafsil__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tafsil__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTafsilAccess().getGroup()); 

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
    // $ANTLR end "ruleTafsil"


    // $ANTLR start "entryRuleKaaedah"
    // InternalQiraa.g:128:1: entryRuleKaaedah : ruleKaaedah EOF ;
    public final void entryRuleKaaedah() throws RecognitionException {
        try {
            // InternalQiraa.g:129:1: ( ruleKaaedah EOF )
            // InternalQiraa.g:130:1: ruleKaaedah EOF
            {
             before(grammarAccess.getKaaedahRule()); 
            pushFollow(FOLLOW_1);
            ruleKaaedah();

            state._fsp--;

             after(grammarAccess.getKaaedahRule()); 
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
    // $ANTLR end "entryRuleKaaedah"


    // $ANTLR start "ruleKaaedah"
    // InternalQiraa.g:137:1: ruleKaaedah : ( ( rule__Kaaedah__Group__0 ) ) ;
    public final void ruleKaaedah() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:141:2: ( ( ( rule__Kaaedah__Group__0 ) ) )
            // InternalQiraa.g:142:2: ( ( rule__Kaaedah__Group__0 ) )
            {
            // InternalQiraa.g:142:2: ( ( rule__Kaaedah__Group__0 ) )
            // InternalQiraa.g:143:3: ( rule__Kaaedah__Group__0 )
            {
             before(grammarAccess.getKaaedahAccess().getGroup()); 
            // InternalQiraa.g:144:3: ( rule__Kaaedah__Group__0 )
            // InternalQiraa.g:144:4: rule__Kaaedah__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Kaaedah__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKaaedahAccess().getGroup()); 

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
    // $ANTLR end "ruleKaaedah"


    // $ANTLR start "entryRuleMatn"
    // InternalQiraa.g:153:1: entryRuleMatn : ruleMatn EOF ;
    public final void entryRuleMatn() throws RecognitionException {
        try {
            // InternalQiraa.g:154:1: ( ruleMatn EOF )
            // InternalQiraa.g:155:1: ruleMatn EOF
            {
             before(grammarAccess.getMatnRule()); 
            pushFollow(FOLLOW_1);
            ruleMatn();

            state._fsp--;

             after(grammarAccess.getMatnRule()); 
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
    // $ANTLR end "entryRuleMatn"


    // $ANTLR start "ruleMatn"
    // InternalQiraa.g:162:1: ruleMatn : ( ( rule__Matn__Group__0 ) ) ;
    public final void ruleMatn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:166:2: ( ( ( rule__Matn__Group__0 ) ) )
            // InternalQiraa.g:167:2: ( ( rule__Matn__Group__0 ) )
            {
            // InternalQiraa.g:167:2: ( ( rule__Matn__Group__0 ) )
            // InternalQiraa.g:168:3: ( rule__Matn__Group__0 )
            {
             before(grammarAccess.getMatnAccess().getGroup()); 
            // InternalQiraa.g:169:3: ( rule__Matn__Group__0 )
            // InternalQiraa.g:169:4: rule__Matn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Matn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatnAccess().getGroup()); 

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
    // $ANTLR end "ruleMatn"


    // $ANTLR start "entryRuleMaktah"
    // InternalQiraa.g:178:1: entryRuleMaktah : ruleMaktah EOF ;
    public final void entryRuleMaktah() throws RecognitionException {
        try {
            // InternalQiraa.g:179:1: ( ruleMaktah EOF )
            // InternalQiraa.g:180:1: ruleMaktah EOF
            {
             before(grammarAccess.getMaktahRule()); 
            pushFollow(FOLLOW_1);
            ruleMaktah();

            state._fsp--;

             after(grammarAccess.getMaktahRule()); 
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
    // $ANTLR end "entryRuleMaktah"


    // $ANTLR start "ruleMaktah"
    // InternalQiraa.g:187:1: ruleMaktah : ( ( rule__Maktah__Group__0 ) ) ;
    public final void ruleMaktah() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:191:2: ( ( ( rule__Maktah__Group__0 ) ) )
            // InternalQiraa.g:192:2: ( ( rule__Maktah__Group__0 ) )
            {
            // InternalQiraa.g:192:2: ( ( rule__Maktah__Group__0 ) )
            // InternalQiraa.g:193:3: ( rule__Maktah__Group__0 )
            {
             before(grammarAccess.getMaktahAccess().getGroup()); 
            // InternalQiraa.g:194:3: ( rule__Maktah__Group__0 )
            // InternalQiraa.g:194:4: rule__Maktah__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Maktah__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaktahAccess().getGroup()); 

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
    // $ANTLR end "ruleMaktah"


    // $ANTLR start "entryRuleBayt"
    // InternalQiraa.g:203:1: entryRuleBayt : ruleBayt EOF ;
    public final void entryRuleBayt() throws RecognitionException {
        try {
            // InternalQiraa.g:204:1: ( ruleBayt EOF )
            // InternalQiraa.g:205:1: ruleBayt EOF
            {
             before(grammarAccess.getBaytRule()); 
            pushFollow(FOLLOW_1);
            ruleBayt();

            state._fsp--;

             after(grammarAccess.getBaytRule()); 
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
    // $ANTLR end "entryRuleBayt"


    // $ANTLR start "ruleBayt"
    // InternalQiraa.g:212:1: ruleBayt : ( ( rule__Bayt__Group__0 ) ) ;
    public final void ruleBayt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:216:2: ( ( ( rule__Bayt__Group__0 ) ) )
            // InternalQiraa.g:217:2: ( ( rule__Bayt__Group__0 ) )
            {
            // InternalQiraa.g:217:2: ( ( rule__Bayt__Group__0 ) )
            // InternalQiraa.g:218:3: ( rule__Bayt__Group__0 )
            {
             before(grammarAccess.getBaytAccess().getGroup()); 
            // InternalQiraa.g:219:3: ( rule__Bayt__Group__0 )
            // InternalQiraa.g:219:4: rule__Bayt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bayt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaytAccess().getGroup()); 

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
    // $ANTLR end "ruleBayt"


    // $ANTLR start "entryRuleAWORDS"
    // InternalQiraa.g:228:1: entryRuleAWORDS : ruleAWORDS EOF ;
    public final void entryRuleAWORDS() throws RecognitionException {
        try {
            // InternalQiraa.g:229:1: ( ruleAWORDS EOF )
            // InternalQiraa.g:230:1: ruleAWORDS EOF
            {
             before(grammarAccess.getAWORDSRule()); 
            pushFollow(FOLLOW_1);
            ruleAWORDS();

            state._fsp--;

             after(grammarAccess.getAWORDSRule()); 
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
    // $ANTLR end "entryRuleAWORDS"


    // $ANTLR start "ruleAWORDS"
    // InternalQiraa.g:237:1: ruleAWORDS : ( ( ( RULE_AWORD ) ) ( ( RULE_AWORD )* ) ) ;
    public final void ruleAWORDS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:241:2: ( ( ( ( RULE_AWORD ) ) ( ( RULE_AWORD )* ) ) )
            // InternalQiraa.g:242:2: ( ( ( RULE_AWORD ) ) ( ( RULE_AWORD )* ) )
            {
            // InternalQiraa.g:242:2: ( ( ( RULE_AWORD ) ) ( ( RULE_AWORD )* ) )
            // InternalQiraa.g:243:3: ( ( RULE_AWORD ) ) ( ( RULE_AWORD )* )
            {
            // InternalQiraa.g:243:3: ( ( RULE_AWORD ) )
            // InternalQiraa.g:244:4: ( RULE_AWORD )
            {
             before(grammarAccess.getAWORDSAccess().getAWORDTerminalRuleCall()); 
            // InternalQiraa.g:245:4: ( RULE_AWORD )
            // InternalQiraa.g:245:5: RULE_AWORD
            {
            match(input,RULE_AWORD,FOLLOW_4); 

            }

             after(grammarAccess.getAWORDSAccess().getAWORDTerminalRuleCall()); 

            }

            // InternalQiraa.g:248:3: ( ( RULE_AWORD )* )
            // InternalQiraa.g:249:4: ( RULE_AWORD )*
            {
             before(grammarAccess.getAWORDSAccess().getAWORDTerminalRuleCall()); 
            // InternalQiraa.g:250:4: ( RULE_AWORD )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_AWORD) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalQiraa.g:250:5: RULE_AWORD
            	    {
            	    match(input,RULE_AWORD,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getAWORDSAccess().getAWORDTerminalRuleCall()); 

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
    // $ANTLR end "ruleAWORDS"


    // $ANTLR start "rulePerson"
    // InternalQiraa.g:261:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:265:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalQiraa.g:266:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalQiraa.g:266:2: ( ( rule__Person__Group__0 ) )
            // InternalQiraa.g:267:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalQiraa.g:268:3: ( rule__Person__Group__0 )
            // InternalQiraa.g:268:4: rule__Person__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "ruleDouaa"
    // InternalQiraa.g:278:1: ruleDouaa : ( ( rule__Douaa__Group__0 ) ) ;
    public final void ruleDouaa() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:282:2: ( ( ( rule__Douaa__Group__0 ) ) )
            // InternalQiraa.g:283:2: ( ( rule__Douaa__Group__0 ) )
            {
            // InternalQiraa.g:283:2: ( ( rule__Douaa__Group__0 ) )
            // InternalQiraa.g:284:3: ( rule__Douaa__Group__0 )
            {
             before(grammarAccess.getDouaaAccess().getGroup()); 
            // InternalQiraa.g:285:3: ( rule__Douaa__Group__0 )
            // InternalQiraa.g:285:4: rule__Douaa__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Douaa__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDouaaAccess().getGroup()); 

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
    // $ANTLR end "ruleDouaa"


    // $ANTLR start "entryRuleIMAM"
    // InternalQiraa.g:294:1: entryRuleIMAM : ruleIMAM EOF ;
    public final void entryRuleIMAM() throws RecognitionException {
        try {
            // InternalQiraa.g:295:1: ( ruleIMAM EOF )
            // InternalQiraa.g:296:1: ruleIMAM EOF
            {
             before(grammarAccess.getIMAMRule()); 
            pushFollow(FOLLOW_1);
            ruleIMAM();

            state._fsp--;

             after(grammarAccess.getIMAMRule()); 
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
    // $ANTLR end "entryRuleIMAM"


    // $ANTLR start "ruleIMAM"
    // InternalQiraa.g:303:1: ruleIMAM : ( ( rule__IMAM__Group__0 ) ) ;
    public final void ruleIMAM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:307:2: ( ( ( rule__IMAM__Group__0 ) ) )
            // InternalQiraa.g:308:2: ( ( rule__IMAM__Group__0 ) )
            {
            // InternalQiraa.g:308:2: ( ( rule__IMAM__Group__0 ) )
            // InternalQiraa.g:309:3: ( rule__IMAM__Group__0 )
            {
             before(grammarAccess.getIMAMAccess().getGroup()); 
            // InternalQiraa.g:310:3: ( rule__IMAM__Group__0 )
            // InternalQiraa.g:310:4: rule__IMAM__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IMAM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIMAMAccess().getGroup()); 

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
    // $ANTLR end "ruleIMAM"


    // $ANTLR start "entryRuleQaree"
    // InternalQiraa.g:319:1: entryRuleQaree : ruleQaree EOF ;
    public final void entryRuleQaree() throws RecognitionException {
        try {
            // InternalQiraa.g:320:1: ( ruleQaree EOF )
            // InternalQiraa.g:321:1: ruleQaree EOF
            {
             before(grammarAccess.getQareeRule()); 
            pushFollow(FOLLOW_1);
            ruleQaree();

            state._fsp--;

             after(grammarAccess.getQareeRule()); 
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
    // $ANTLR end "entryRuleQaree"


    // $ANTLR start "ruleQaree"
    // InternalQiraa.g:328:1: ruleQaree : ( ( rule__Qaree__Group__0 ) ) ;
    public final void ruleQaree() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:332:2: ( ( ( rule__Qaree__Group__0 ) ) )
            // InternalQiraa.g:333:2: ( ( rule__Qaree__Group__0 ) )
            {
            // InternalQiraa.g:333:2: ( ( rule__Qaree__Group__0 ) )
            // InternalQiraa.g:334:3: ( rule__Qaree__Group__0 )
            {
             before(grammarAccess.getQareeAccess().getGroup()); 
            // InternalQiraa.g:335:3: ( rule__Qaree__Group__0 )
            // InternalQiraa.g:335:4: rule__Qaree__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Qaree__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQareeAccess().getGroup()); 

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
    // $ANTLR end "ruleQaree"


    // $ANTLR start "entryRuleRawee"
    // InternalQiraa.g:344:1: entryRuleRawee : ruleRawee EOF ;
    public final void entryRuleRawee() throws RecognitionException {
        try {
            // InternalQiraa.g:345:1: ( ruleRawee EOF )
            // InternalQiraa.g:346:1: ruleRawee EOF
            {
             before(grammarAccess.getRaweeRule()); 
            pushFollow(FOLLOW_1);
            ruleRawee();

            state._fsp--;

             after(grammarAccess.getRaweeRule()); 
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
    // $ANTLR end "entryRuleRawee"


    // $ANTLR start "ruleRawee"
    // InternalQiraa.g:353:1: ruleRawee : ( ( rule__Rawee__Group__0 ) ) ;
    public final void ruleRawee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:357:2: ( ( ( rule__Rawee__Group__0 ) ) )
            // InternalQiraa.g:358:2: ( ( rule__Rawee__Group__0 ) )
            {
            // InternalQiraa.g:358:2: ( ( rule__Rawee__Group__0 ) )
            // InternalQiraa.g:359:3: ( rule__Rawee__Group__0 )
            {
             before(grammarAccess.getRaweeAccess().getGroup()); 
            // InternalQiraa.g:360:3: ( rule__Rawee__Group__0 )
            // InternalQiraa.g:360:4: rule__Rawee__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rawee__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRaweeAccess().getGroup()); 

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
    // $ANTLR end "ruleRawee"


    // $ANTLR start "entryRuleYokraaLah"
    // InternalQiraa.g:369:1: entryRuleYokraaLah : ruleYokraaLah EOF ;
    public final void entryRuleYokraaLah() throws RecognitionException {
        try {
            // InternalQiraa.g:370:1: ( ruleYokraaLah EOF )
            // InternalQiraa.g:371:1: ruleYokraaLah EOF
            {
             before(grammarAccess.getYokraaLahRule()); 
            pushFollow(FOLLOW_1);
            ruleYokraaLah();

            state._fsp--;

             after(grammarAccess.getYokraaLahRule()); 
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
    // $ANTLR end "entryRuleYokraaLah"


    // $ANTLR start "ruleYokraaLah"
    // InternalQiraa.g:378:1: ruleYokraaLah : ( ( rule__YokraaLah__Alternatives ) ) ;
    public final void ruleYokraaLah() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:382:2: ( ( ( rule__YokraaLah__Alternatives ) ) )
            // InternalQiraa.g:383:2: ( ( rule__YokraaLah__Alternatives ) )
            {
            // InternalQiraa.g:383:2: ( ( rule__YokraaLah__Alternatives ) )
            // InternalQiraa.g:384:3: ( rule__YokraaLah__Alternatives )
            {
             before(grammarAccess.getYokraaLahAccess().getAlternatives()); 
            // InternalQiraa.g:385:3: ( rule__YokraaLah__Alternatives )
            // InternalQiraa.g:385:4: rule__YokraaLah__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__YokraaLah__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getYokraaLahAccess().getAlternatives()); 

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
    // $ANTLR end "ruleYokraaLah"


    // $ANTLR start "entryRuleTareek"
    // InternalQiraa.g:394:1: entryRuleTareek : ruleTareek EOF ;
    public final void entryRuleTareek() throws RecognitionException {
        try {
            // InternalQiraa.g:395:1: ( ruleTareek EOF )
            // InternalQiraa.g:396:1: ruleTareek EOF
            {
             before(grammarAccess.getTareekRule()); 
            pushFollow(FOLLOW_1);
            ruleTareek();

            state._fsp--;

             after(grammarAccess.getTareekRule()); 
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
    // $ANTLR end "entryRuleTareek"


    // $ANTLR start "ruleTareek"
    // InternalQiraa.g:403:1: ruleTareek : ( ( rule__Tareek__Group__0 ) ) ;
    public final void ruleTareek() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:407:2: ( ( ( rule__Tareek__Group__0 ) ) )
            // InternalQiraa.g:408:2: ( ( rule__Tareek__Group__0 ) )
            {
            // InternalQiraa.g:408:2: ( ( rule__Tareek__Group__0 ) )
            // InternalQiraa.g:409:3: ( rule__Tareek__Group__0 )
            {
             before(grammarAccess.getTareekAccess().getGroup()); 
            // InternalQiraa.g:410:3: ( rule__Tareek__Group__0 )
            // InternalQiraa.g:410:4: rule__Tareek__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tareek__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTareekAccess().getGroup()); 

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
    // $ANTLR end "ruleTareek"


    // $ANTLR start "entryRuleKayd"
    // InternalQiraa.g:419:1: entryRuleKayd : ruleKayd EOF ;
    public final void entryRuleKayd() throws RecognitionException {
        try {
            // InternalQiraa.g:420:1: ( ruleKayd EOF )
            // InternalQiraa.g:421:1: ruleKayd EOF
            {
             before(grammarAccess.getKaydRule()); 
            pushFollow(FOLLOW_1);
            ruleKayd();

            state._fsp--;

             after(grammarAccess.getKaydRule()); 
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
    // $ANTLR end "entryRuleKayd"


    // $ANTLR start "ruleKayd"
    // InternalQiraa.g:428:1: ruleKayd : ( ( rule__Kayd__Group__0 ) ) ;
    public final void ruleKayd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:432:2: ( ( ( rule__Kayd__Group__0 ) ) )
            // InternalQiraa.g:433:2: ( ( rule__Kayd__Group__0 ) )
            {
            // InternalQiraa.g:433:2: ( ( rule__Kayd__Group__0 ) )
            // InternalQiraa.g:434:3: ( rule__Kayd__Group__0 )
            {
             before(grammarAccess.getKaydAccess().getGroup()); 
            // InternalQiraa.g:435:3: ( rule__Kayd__Group__0 )
            // InternalQiraa.g:435:4: rule__Kayd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Kayd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKaydAccess().getGroup()); 

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
    // $ANTLR end "ruleKayd"


    // $ANTLR start "entryRuleIstelah"
    // InternalQiraa.g:444:1: entryRuleIstelah : ruleIstelah EOF ;
    public final void entryRuleIstelah() throws RecognitionException {
        try {
            // InternalQiraa.g:445:1: ( ruleIstelah EOF )
            // InternalQiraa.g:446:1: ruleIstelah EOF
            {
             before(grammarAccess.getIstelahRule()); 
            pushFollow(FOLLOW_1);
            ruleIstelah();

            state._fsp--;

             after(grammarAccess.getIstelahRule()); 
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
    // $ANTLR end "entryRuleIstelah"


    // $ANTLR start "ruleIstelah"
    // InternalQiraa.g:453:1: ruleIstelah : ( ( rule__Istelah__Group__0 ) ) ;
    public final void ruleIstelah() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:457:2: ( ( ( rule__Istelah__Group__0 ) ) )
            // InternalQiraa.g:458:2: ( ( rule__Istelah__Group__0 ) )
            {
            // InternalQiraa.g:458:2: ( ( rule__Istelah__Group__0 ) )
            // InternalQiraa.g:459:3: ( rule__Istelah__Group__0 )
            {
             before(grammarAccess.getIstelahAccess().getGroup()); 
            // InternalQiraa.g:460:3: ( rule__Istelah__Group__0 )
            // InternalQiraa.g:460:4: rule__Istelah__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Istelah__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIstelahAccess().getGroup()); 

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
    // $ANTLR end "ruleIstelah"


    // $ANTLR start "entryRuleRamz"
    // InternalQiraa.g:469:1: entryRuleRamz : ruleRamz EOF ;
    public final void entryRuleRamz() throws RecognitionException {
        try {
            // InternalQiraa.g:470:1: ( ruleRamz EOF )
            // InternalQiraa.g:471:1: ruleRamz EOF
            {
             before(grammarAccess.getRamzRule()); 
            pushFollow(FOLLOW_1);
            ruleRamz();

            state._fsp--;

             after(grammarAccess.getRamzRule()); 
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
    // $ANTLR end "entryRuleRamz"


    // $ANTLR start "ruleRamz"
    // InternalQiraa.g:478:1: ruleRamz : ( ( rule__Ramz__Group__0 ) ) ;
    public final void ruleRamz() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:482:2: ( ( ( rule__Ramz__Group__0 ) ) )
            // InternalQiraa.g:483:2: ( ( rule__Ramz__Group__0 ) )
            {
            // InternalQiraa.g:483:2: ( ( rule__Ramz__Group__0 ) )
            // InternalQiraa.g:484:3: ( rule__Ramz__Group__0 )
            {
             before(grammarAccess.getRamzAccess().getGroup()); 
            // InternalQiraa.g:485:3: ( rule__Ramz__Group__0 )
            // InternalQiraa.g:485:4: rule__Ramz__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ramz__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRamzAccess().getGroup()); 

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
    // $ANTLR end "ruleRamz"


    // $ANTLR start "entryRuleHarfQuran"
    // InternalQiraa.g:494:1: entryRuleHarfQuran : ruleHarfQuran EOF ;
    public final void entryRuleHarfQuran() throws RecognitionException {
        try {
            // InternalQiraa.g:495:1: ( ruleHarfQuran EOF )
            // InternalQiraa.g:496:1: ruleHarfQuran EOF
            {
             before(grammarAccess.getHarfQuranRule()); 
            pushFollow(FOLLOW_1);
            ruleHarfQuran();

            state._fsp--;

             after(grammarAccess.getHarfQuranRule()); 
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
    // $ANTLR end "entryRuleHarfQuran"


    // $ANTLR start "ruleHarfQuran"
    // InternalQiraa.g:503:1: ruleHarfQuran : ( ( rule__HarfQuran__Group__0 ) ) ;
    public final void ruleHarfQuran() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:507:2: ( ( ( rule__HarfQuran__Group__0 ) ) )
            // InternalQiraa.g:508:2: ( ( rule__HarfQuran__Group__0 ) )
            {
            // InternalQiraa.g:508:2: ( ( rule__HarfQuran__Group__0 ) )
            // InternalQiraa.g:509:3: ( rule__HarfQuran__Group__0 )
            {
             before(grammarAccess.getHarfQuranAccess().getGroup()); 
            // InternalQiraa.g:510:3: ( rule__HarfQuran__Group__0 )
            // InternalQiraa.g:510:4: rule__HarfQuran__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HarfQuran__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHarfQuranAccess().getGroup()); 

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
    // $ANTLR end "ruleHarfQuran"


    // $ANTLR start "entryRuleMawdee"
    // InternalQiraa.g:519:1: entryRuleMawdee : ruleMawdee EOF ;
    public final void entryRuleMawdee() throws RecognitionException {
        try {
            // InternalQiraa.g:520:1: ( ruleMawdee EOF )
            // InternalQiraa.g:521:1: ruleMawdee EOF
            {
             before(grammarAccess.getMawdeeRule()); 
            pushFollow(FOLLOW_1);
            ruleMawdee();

            state._fsp--;

             after(grammarAccess.getMawdeeRule()); 
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
    // $ANTLR end "entryRuleMawdee"


    // $ANTLR start "ruleMawdee"
    // InternalQiraa.g:528:1: ruleMawdee : ( ( rule__Mawdee__Alternatives ) ) ;
    public final void ruleMawdee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:532:2: ( ( ( rule__Mawdee__Alternatives ) ) )
            // InternalQiraa.g:533:2: ( ( rule__Mawdee__Alternatives ) )
            {
            // InternalQiraa.g:533:2: ( ( rule__Mawdee__Alternatives ) )
            // InternalQiraa.g:534:3: ( rule__Mawdee__Alternatives )
            {
             before(grammarAccess.getMawdeeAccess().getAlternatives()); 
            // InternalQiraa.g:535:3: ( rule__Mawdee__Alternatives )
            // InternalQiraa.g:535:4: rule__Mawdee__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Mawdee__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMawdeeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMawdee"


    // $ANTLR start "entryRuleHarf"
    // InternalQiraa.g:544:1: entryRuleHarf : ruleHarf EOF ;
    public final void entryRuleHarf() throws RecognitionException {
        try {
            // InternalQiraa.g:545:1: ( ruleHarf EOF )
            // InternalQiraa.g:546:1: ruleHarf EOF
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
    // InternalQiraa.g:553:1: ruleHarf : ( ( rule__Harf__Group__0 ) ) ;
    public final void ruleHarf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:557:2: ( ( ( rule__Harf__Group__0 ) ) )
            // InternalQiraa.g:558:2: ( ( rule__Harf__Group__0 ) )
            {
            // InternalQiraa.g:558:2: ( ( rule__Harf__Group__0 ) )
            // InternalQiraa.g:559:3: ( rule__Harf__Group__0 )
            {
             before(grammarAccess.getHarfAccess().getGroup()); 
            // InternalQiraa.g:560:3: ( rule__Harf__Group__0 )
            // InternalQiraa.g:560:4: rule__Harf__Group__0
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
    // InternalQiraa.g:569:1: entryRuleHarakah : ruleHarakah EOF ;
    public final void entryRuleHarakah() throws RecognitionException {
        try {
            // InternalQiraa.g:570:1: ( ruleHarakah EOF )
            // InternalQiraa.g:571:1: ruleHarakah EOF
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
    // InternalQiraa.g:578:1: ruleHarakah : ( ( rule__Harakah__Group__0 ) ) ;
    public final void ruleHarakah() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:582:2: ( ( ( rule__Harakah__Group__0 ) ) )
            // InternalQiraa.g:583:2: ( ( rule__Harakah__Group__0 ) )
            {
            // InternalQiraa.g:583:2: ( ( rule__Harakah__Group__0 ) )
            // InternalQiraa.g:584:3: ( rule__Harakah__Group__0 )
            {
             before(grammarAccess.getHarakahAccess().getGroup()); 
            // InternalQiraa.g:585:3: ( rule__Harakah__Group__0 )
            // InternalQiraa.g:585:4: rule__Harakah__Group__0
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
    // InternalQiraa.g:594:1: entryRuleAyahStart : ruleAyahStart EOF ;
    public final void entryRuleAyahStart() throws RecognitionException {
        try {
            // InternalQiraa.g:595:1: ( ruleAyahStart EOF )
            // InternalQiraa.g:596:1: ruleAyahStart EOF
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
    // InternalQiraa.g:603:1: ruleAyahStart : ( ( rule__AyahStart__Group__0 ) ) ;
    public final void ruleAyahStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:607:2: ( ( ( rule__AyahStart__Group__0 ) ) )
            // InternalQiraa.g:608:2: ( ( rule__AyahStart__Group__0 ) )
            {
            // InternalQiraa.g:608:2: ( ( rule__AyahStart__Group__0 ) )
            // InternalQiraa.g:609:3: ( rule__AyahStart__Group__0 )
            {
             before(grammarAccess.getAyahStartAccess().getGroup()); 
            // InternalQiraa.g:610:3: ( rule__AyahStart__Group__0 )
            // InternalQiraa.g:610:4: rule__AyahStart__Group__0
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
    // InternalQiraa.g:619:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // InternalQiraa.g:620:1: ( rulePhrase EOF )
            // InternalQiraa.g:621:1: rulePhrase EOF
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
    // InternalQiraa.g:628:1: rulePhrase : ( ( rule__Phrase__Group__0 ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:632:2: ( ( ( rule__Phrase__Group__0 ) ) )
            // InternalQiraa.g:633:2: ( ( rule__Phrase__Group__0 ) )
            {
            // InternalQiraa.g:633:2: ( ( rule__Phrase__Group__0 ) )
            // InternalQiraa.g:634:3: ( rule__Phrase__Group__0 )
            {
             before(grammarAccess.getPhraseAccess().getGroup()); 
            // InternalQiraa.g:635:3: ( rule__Phrase__Group__0 )
            // InternalQiraa.g:635:4: rule__Phrase__Group__0
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


    // $ANTLR start "rule__Douaa__DAlternatives_0_0"
    // InternalQiraa.g:643:1: rule__Douaa__DAlternatives_0_0 : ( ( '\\u0631\\u062D\\u0645\\u0647' ) | ( '\\u0623\\u0643\\u0631\\u0645\\u0647' ) );
    public final void rule__Douaa__DAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:647:1: ( ( '\\u0631\\u062D\\u0645\\u0647' ) | ( '\\u0623\\u0643\\u0631\\u0645\\u0647' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQiraa.g:648:2: ( '\\u0631\\u062D\\u0645\\u0647' )
                    {
                    // InternalQiraa.g:648:2: ( '\\u0631\\u062D\\u0645\\u0647' )
                    // InternalQiraa.g:649:3: '\\u0631\\u062D\\u0645\\u0647'
                    {
                     before(grammarAccess.getDouaaAccess().getDArabicLetterRehArabicLetterHahArabicLetterMeemArabicLetterHehKeyword_0_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getDouaaAccess().getDArabicLetterRehArabicLetterHahArabicLetterMeemArabicLetterHehKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQiraa.g:654:2: ( '\\u0623\\u0643\\u0631\\u0645\\u0647' )
                    {
                    // InternalQiraa.g:654:2: ( '\\u0623\\u0643\\u0631\\u0645\\u0647' )
                    // InternalQiraa.g:655:3: '\\u0623\\u0643\\u0631\\u0645\\u0647'
                    {
                     before(grammarAccess.getDouaaAccess().getDArabicLetterAlefWithHamzaAboveArabicLetterKafArabicLetterRehArabicLetterMeemArabicLetterHehKeyword_0_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getDouaaAccess().getDArabicLetterAlefWithHamzaAboveArabicLetterKafArabicLetterRehArabicLetterMeemArabicLetterHehKeyword_0_0_1()); 

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
    // $ANTLR end "rule__Douaa__DAlternatives_0_0"


    // $ANTLR start "rule__YokraaLah__Alternatives"
    // InternalQiraa.g:664:1: rule__YokraaLah__Alternatives : ( ( ruleQaree ) | ( ruleRawee ) | ( ruleIstelah ) );
    public final void rule__YokraaLah__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:668:1: ( ( ruleQaree ) | ( ruleRawee ) | ( ruleIstelah ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt4=1;
                }
                break;
            case 48:
                {
                alt4=2;
                }
                break;
            case 55:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalQiraa.g:669:2: ( ruleQaree )
                    {
                    // InternalQiraa.g:669:2: ( ruleQaree )
                    // InternalQiraa.g:670:3: ruleQaree
                    {
                     before(grammarAccess.getYokraaLahAccess().getQareeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleQaree();

                    state._fsp--;

                     after(grammarAccess.getYokraaLahAccess().getQareeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQiraa.g:675:2: ( ruleRawee )
                    {
                    // InternalQiraa.g:675:2: ( ruleRawee )
                    // InternalQiraa.g:676:3: ruleRawee
                    {
                     before(grammarAccess.getYokraaLahAccess().getRaweeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRawee();

                    state._fsp--;

                     after(grammarAccess.getYokraaLahAccess().getRaweeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQiraa.g:681:2: ( ruleIstelah )
                    {
                    // InternalQiraa.g:681:2: ( ruleIstelah )
                    // InternalQiraa.g:682:3: ruleIstelah
                    {
                     before(grammarAccess.getYokraaLahAccess().getIstelahParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIstelah();

                    state._fsp--;

                     after(grammarAccess.getYokraaLahAccess().getIstelahParserRuleCall_2()); 

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
    // $ANTLR end "rule__YokraaLah__Alternatives"


    // $ANTLR start "rule__Tareek__Alternatives_3"
    // InternalQiraa.g:691:1: rule__Tareek__Alternatives_3 : ( ( ( rule__Tareek__Group_3_0__0 ) ) | ( ( rule__Tareek__Group_3_1__0 ) ) );
    public final void rule__Tareek__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:695:1: ( ( ( rule__Tareek__Group_3_0__0 ) ) | ( ( rule__Tareek__Group_3_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==69) ) {
                alt5=1;
            }
            else if ( (LA5_0==70) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalQiraa.g:696:2: ( ( rule__Tareek__Group_3_0__0 ) )
                    {
                    // InternalQiraa.g:696:2: ( ( rule__Tareek__Group_3_0__0 ) )
                    // InternalQiraa.g:697:3: ( rule__Tareek__Group_3_0__0 )
                    {
                     before(grammarAccess.getTareekAccess().getGroup_3_0()); 
                    // InternalQiraa.g:698:3: ( rule__Tareek__Group_3_0__0 )
                    // InternalQiraa.g:698:4: rule__Tareek__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tareek__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTareekAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQiraa.g:702:2: ( ( rule__Tareek__Group_3_1__0 ) )
                    {
                    // InternalQiraa.g:702:2: ( ( rule__Tareek__Group_3_1__0 ) )
                    // InternalQiraa.g:703:3: ( rule__Tareek__Group_3_1__0 )
                    {
                     before(grammarAccess.getTareekAccess().getGroup_3_1()); 
                    // InternalQiraa.g:704:3: ( rule__Tareek__Group_3_1__0 )
                    // InternalQiraa.g:704:4: rule__Tareek__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tareek__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTareekAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Tareek__Alternatives_3"


    // $ANTLR start "rule__Mawdee__Alternatives"
    // InternalQiraa.g:712:1: rule__Mawdee__Alternatives : ( ( '\\u0627\\u0644\\u0623\\u0648\\u0644' ) | ( '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' ) | ( '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' ) | ( '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' ) );
    public final void rule__Mawdee__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:716:1: ( ( '\\u0627\\u0644\\u0623\\u0648\\u0644' ) | ( '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' ) | ( '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' ) | ( '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            case 26:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalQiraa.g:717:2: ( '\\u0627\\u0644\\u0623\\u0648\\u0644' )
                    {
                    // InternalQiraa.g:717:2: ( '\\u0627\\u0644\\u0623\\u0648\\u0644' )
                    // InternalQiraa.g:718:3: '\\u0627\\u0644\\u0623\\u0648\\u0644'
                    {
                     before(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaAboveArabicLetterWawArabicLetterLamKeyword_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaAboveArabicLetterWawArabicLetterLamKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQiraa.g:723:2: ( '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' )
                    {
                    // InternalQiraa.g:723:2: ( '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' )
                    // InternalQiraa.g:724:3: '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A'
                    {
                     before(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterNoonArabicLetterYehKeyword_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterNoonArabicLetterYehKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQiraa.g:729:2: ( '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' )
                    {
                    // InternalQiraa.g:729:2: ( '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' )
                    // InternalQiraa.g:730:3: '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B'
                    {
                     before(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterLamArabicLetterThehKeyword_2()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterLamArabicLetterThehKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQiraa.g:735:2: ( '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' )
                    {
                    // InternalQiraa.g:735:2: ( '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' )
                    // InternalQiraa.g:736:3: '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631'
                    {
                     before(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaAboveArabicLetterKhahArabicLetterYehArabicLetterRehKeyword_3()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaAboveArabicLetterKhahArabicLetterYehArabicLetterRehKeyword_3()); 

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
    // $ANTLR end "rule__Mawdee__Alternatives"


    // $ANTLR start "rule__Harf__Alternatives_2"
    // InternalQiraa.g:745:1: rule__Harf__Alternatives_2 : ( ( ( rule__Harf__Group_2_0__0 ) ) | ( ( rule__Harf__Group_2_1__0 ) ) );
    public final void rule__Harf__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:749:1: ( ( ( rule__Harf__Group_2_0__0 ) ) | ( ( rule__Harf__Group_2_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==62) ) {
                alt7=1;
            }
            else if ( (LA7_0==64) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalQiraa.g:750:2: ( ( rule__Harf__Group_2_0__0 ) )
                    {
                    // InternalQiraa.g:750:2: ( ( rule__Harf__Group_2_0__0 ) )
                    // InternalQiraa.g:751:3: ( rule__Harf__Group_2_0__0 )
                    {
                     before(grammarAccess.getHarfAccess().getGroup_2_0()); 
                    // InternalQiraa.g:752:3: ( rule__Harf__Group_2_0__0 )
                    // InternalQiraa.g:752:4: rule__Harf__Group_2_0__0
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
                    // InternalQiraa.g:756:2: ( ( rule__Harf__Group_2_1__0 ) )
                    {
                    // InternalQiraa.g:756:2: ( ( rule__Harf__Group_2_1__0 ) )
                    // InternalQiraa.g:757:3: ( rule__Harf__Group_2_1__0 )
                    {
                     before(grammarAccess.getHarfAccess().getGroup_2_1()); 
                    // InternalQiraa.g:758:3: ( rule__Harf__Group_2_1__0 )
                    // InternalQiraa.g:758:4: rule__Harf__Group_2_1__0
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


    // $ANTLR start "rule__Marjeh__Group__0"
    // InternalQiraa.g:766:1: rule__Marjeh__Group__0 : rule__Marjeh__Group__0__Impl rule__Marjeh__Group__1 ;
    public final void rule__Marjeh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:770:1: ( rule__Marjeh__Group__0__Impl rule__Marjeh__Group__1 )
            // InternalQiraa.g:771:2: rule__Marjeh__Group__0__Impl rule__Marjeh__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Marjeh__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Marjeh__Group__1();

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
    // $ANTLR end "rule__Marjeh__Group__0"


    // $ANTLR start "rule__Marjeh__Group__0__Impl"
    // InternalQiraa.g:778:1: rule__Marjeh__Group__0__Impl : ( '\\u0645\\u0631\\u062C\\u0639' ) ;
    public final void rule__Marjeh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:782:1: ( ( '\\u0645\\u0631\\u062C\\u0639' ) )
            // InternalQiraa.g:783:1: ( '\\u0645\\u0631\\u062C\\u0639' )
            {
            // InternalQiraa.g:783:1: ( '\\u0645\\u0631\\u062C\\u0639' )
            // InternalQiraa.g:784:2: '\\u0645\\u0631\\u062C\\u0639'
            {
             before(grammarAccess.getMarjehAccess().getArabicLetterMeemArabicLetterRehArabicLetterJeemArabicLetterAinKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMarjehAccess().getArabicLetterMeemArabicLetterRehArabicLetterJeemArabicLetterAinKeyword_0()); 

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
    // $ANTLR end "rule__Marjeh__Group__0__Impl"


    // $ANTLR start "rule__Marjeh__Group__1"
    // InternalQiraa.g:793:1: rule__Marjeh__Group__1 : rule__Marjeh__Group__1__Impl rule__Marjeh__Group__2 ;
    public final void rule__Marjeh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:797:1: ( rule__Marjeh__Group__1__Impl rule__Marjeh__Group__2 )
            // InternalQiraa.g:798:2: rule__Marjeh__Group__1__Impl rule__Marjeh__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Marjeh__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Marjeh__Group__2();

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
    // $ANTLR end "rule__Marjeh__Group__1"


    // $ANTLR start "rule__Marjeh__Group__1__Impl"
    // InternalQiraa.g:805:1: rule__Marjeh__Group__1__Impl : ( ( rule__Marjeh__NameAssignment_1 ) ) ;
    public final void rule__Marjeh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:809:1: ( ( ( rule__Marjeh__NameAssignment_1 ) ) )
            // InternalQiraa.g:810:1: ( ( rule__Marjeh__NameAssignment_1 ) )
            {
            // InternalQiraa.g:810:1: ( ( rule__Marjeh__NameAssignment_1 ) )
            // InternalQiraa.g:811:2: ( rule__Marjeh__NameAssignment_1 )
            {
             before(grammarAccess.getMarjehAccess().getNameAssignment_1()); 
            // InternalQiraa.g:812:2: ( rule__Marjeh__NameAssignment_1 )
            // InternalQiraa.g:812:3: rule__Marjeh__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Marjeh__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMarjehAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Marjeh__Group__1__Impl"


    // $ANTLR start "rule__Marjeh__Group__2"
    // InternalQiraa.g:820:1: rule__Marjeh__Group__2 : rule__Marjeh__Group__2__Impl rule__Marjeh__Group__3 ;
    public final void rule__Marjeh__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:824:1: ( rule__Marjeh__Group__2__Impl rule__Marjeh__Group__3 )
            // InternalQiraa.g:825:2: rule__Marjeh__Group__2__Impl rule__Marjeh__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Marjeh__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Marjeh__Group__3();

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
    // $ANTLR end "rule__Marjeh__Group__2"


    // $ANTLR start "rule__Marjeh__Group__2__Impl"
    // InternalQiraa.g:832:1: rule__Marjeh__Group__2__Impl : ( '\\u0645\\u0628\\u0646\\u064A' ) ;
    public final void rule__Marjeh__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:836:1: ( ( '\\u0645\\u0628\\u0646\\u064A' ) )
            // InternalQiraa.g:837:1: ( '\\u0645\\u0628\\u0646\\u064A' )
            {
            // InternalQiraa.g:837:1: ( '\\u0645\\u0628\\u0646\\u064A' )
            // InternalQiraa.g:838:2: '\\u0645\\u0628\\u0646\\u064A'
            {
             before(grammarAccess.getMarjehAccess().getArabicLetterMeemArabicLetterBehArabicLetterNoonArabicLetterYehKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMarjehAccess().getArabicLetterMeemArabicLetterBehArabicLetterNoonArabicLetterYehKeyword_2()); 

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
    // $ANTLR end "rule__Marjeh__Group__2__Impl"


    // $ANTLR start "rule__Marjeh__Group__3"
    // InternalQiraa.g:847:1: rule__Marjeh__Group__3 : rule__Marjeh__Group__3__Impl rule__Marjeh__Group__4 ;
    public final void rule__Marjeh__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:851:1: ( rule__Marjeh__Group__3__Impl rule__Marjeh__Group__4 )
            // InternalQiraa.g:852:2: rule__Marjeh__Group__3__Impl rule__Marjeh__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Marjeh__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Marjeh__Group__4();

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
    // $ANTLR end "rule__Marjeh__Group__3"


    // $ANTLR start "rule__Marjeh__Group__3__Impl"
    // InternalQiraa.g:859:1: rule__Marjeh__Group__3__Impl : ( '\\u0639\\u0644\\u0649' ) ;
    public final void rule__Marjeh__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:863:1: ( ( '\\u0639\\u0644\\u0649' ) )
            // InternalQiraa.g:864:1: ( '\\u0639\\u0644\\u0649' )
            {
            // InternalQiraa.g:864:1: ( '\\u0639\\u0644\\u0649' )
            // InternalQiraa.g:865:2: '\\u0639\\u0644\\u0649'
            {
             before(grammarAccess.getMarjehAccess().getArabicLetterAinArabicLetterLamArabicLetterAlefMaksuraKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMarjehAccess().getArabicLetterAinArabicLetterLamArabicLetterAlefMaksuraKeyword_3()); 

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
    // $ANTLR end "rule__Marjeh__Group__3__Impl"


    // $ANTLR start "rule__Marjeh__Group__4"
    // InternalQiraa.g:874:1: rule__Marjeh__Group__4 : rule__Marjeh__Group__4__Impl rule__Marjeh__Group__5 ;
    public final void rule__Marjeh__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:878:1: ( rule__Marjeh__Group__4__Impl rule__Marjeh__Group__5 )
            // InternalQiraa.g:879:2: rule__Marjeh__Group__4__Impl rule__Marjeh__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Marjeh__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Marjeh__Group__5();

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
    // $ANTLR end "rule__Marjeh__Group__4"


    // $ANTLR start "rule__Marjeh__Group__4__Impl"
    // InternalQiraa.g:886:1: rule__Marjeh__Group__4__Impl : ( ( rule__Marjeh__MatnAssignment_4 ) ) ;
    public final void rule__Marjeh__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:890:1: ( ( ( rule__Marjeh__MatnAssignment_4 ) ) )
            // InternalQiraa.g:891:1: ( ( rule__Marjeh__MatnAssignment_4 ) )
            {
            // InternalQiraa.g:891:1: ( ( rule__Marjeh__MatnAssignment_4 ) )
            // InternalQiraa.g:892:2: ( rule__Marjeh__MatnAssignment_4 )
            {
             before(grammarAccess.getMarjehAccess().getMatnAssignment_4()); 
            // InternalQiraa.g:893:2: ( rule__Marjeh__MatnAssignment_4 )
            // InternalQiraa.g:893:3: rule__Marjeh__MatnAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Marjeh__MatnAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMarjehAccess().getMatnAssignment_4()); 

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
    // $ANTLR end "rule__Marjeh__Group__4__Impl"


    // $ANTLR start "rule__Marjeh__Group__5"
    // InternalQiraa.g:901:1: rule__Marjeh__Group__5 : rule__Marjeh__Group__5__Impl rule__Marjeh__Group__6 ;
    public final void rule__Marjeh__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:905:1: ( rule__Marjeh__Group__5__Impl rule__Marjeh__Group__6 )
            // InternalQiraa.g:906:2: rule__Marjeh__Group__5__Impl rule__Marjeh__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Marjeh__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Marjeh__Group__6();

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
    // $ANTLR end "rule__Marjeh__Group__5"


    // $ANTLR start "rule__Marjeh__Group__5__Impl"
    // InternalQiraa.g:913:1: rule__Marjeh__Group__5__Impl : ( '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647' ) ;
    public final void rule__Marjeh__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:917:1: ( ( '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647' ) )
            // InternalQiraa.g:918:1: ( '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647' )
            {
            // InternalQiraa.g:918:1: ( '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647' )
            // InternalQiraa.g:919:2: '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647'
            {
             before(grammarAccess.getMarjehAccess().getArabicLetterTehArabicLetterFehArabicLetterSadArabicLetterYehArabicLetterLamArabicLetterHehKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMarjehAccess().getArabicLetterTehArabicLetterFehArabicLetterSadArabicLetterYehArabicLetterLamArabicLetterHehKeyword_5()); 

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
    // $ANTLR end "rule__Marjeh__Group__5__Impl"


    // $ANTLR start "rule__Marjeh__Group__6"
    // InternalQiraa.g:928:1: rule__Marjeh__Group__6 : rule__Marjeh__Group__6__Impl rule__Marjeh__Group__7 ;
    public final void rule__Marjeh__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:932:1: ( rule__Marjeh__Group__6__Impl rule__Marjeh__Group__7 )
            // InternalQiraa.g:933:2: rule__Marjeh__Group__6__Impl rule__Marjeh__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Marjeh__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Marjeh__Group__7();

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
    // $ANTLR end "rule__Marjeh__Group__6"


    // $ANTLR start "rule__Marjeh__Group__6__Impl"
    // InternalQiraa.g:940:1: rule__Marjeh__Group__6__Impl : ( ( rule__Marjeh__RomozAssignment_6 )* ) ;
    public final void rule__Marjeh__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:944:1: ( ( ( rule__Marjeh__RomozAssignment_6 )* ) )
            // InternalQiraa.g:945:1: ( ( rule__Marjeh__RomozAssignment_6 )* )
            {
            // InternalQiraa.g:945:1: ( ( rule__Marjeh__RomozAssignment_6 )* )
            // InternalQiraa.g:946:2: ( rule__Marjeh__RomozAssignment_6 )*
            {
             before(grammarAccess.getMarjehAccess().getRomozAssignment_6()); 
            // InternalQiraa.g:947:2: ( rule__Marjeh__RomozAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==58) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalQiraa.g:947:3: rule__Marjeh__RomozAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Marjeh__RomozAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMarjehAccess().getRomozAssignment_6()); 

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
    // $ANTLR end "rule__Marjeh__Group__6__Impl"


    // $ANTLR start "rule__Marjeh__Group__7"
    // InternalQiraa.g:955:1: rule__Marjeh__Group__7 : rule__Marjeh__Group__7__Impl rule__Marjeh__Group__8 ;
    public final void rule__Marjeh__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:959:1: ( rule__Marjeh__Group__7__Impl rule__Marjeh__Group__8 )
            // InternalQiraa.g:960:2: rule__Marjeh__Group__7__Impl rule__Marjeh__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Marjeh__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Marjeh__Group__8();

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
    // $ANTLR end "rule__Marjeh__Group__7"


    // $ANTLR start "rule__Marjeh__Group__7__Impl"
    // InternalQiraa.g:967:1: rule__Marjeh__Group__7__Impl : ( ( ( rule__Marjeh__TafsilAssignment_7 ) ) ( ( rule__Marjeh__TafsilAssignment_7 )* ) ) ;
    public final void rule__Marjeh__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:971:1: ( ( ( ( rule__Marjeh__TafsilAssignment_7 ) ) ( ( rule__Marjeh__TafsilAssignment_7 )* ) ) )
            // InternalQiraa.g:972:1: ( ( ( rule__Marjeh__TafsilAssignment_7 ) ) ( ( rule__Marjeh__TafsilAssignment_7 )* ) )
            {
            // InternalQiraa.g:972:1: ( ( ( rule__Marjeh__TafsilAssignment_7 ) ) ( ( rule__Marjeh__TafsilAssignment_7 )* ) )
            // InternalQiraa.g:973:2: ( ( rule__Marjeh__TafsilAssignment_7 ) ) ( ( rule__Marjeh__TafsilAssignment_7 )* )
            {
            // InternalQiraa.g:973:2: ( ( rule__Marjeh__TafsilAssignment_7 ) )
            // InternalQiraa.g:974:3: ( rule__Marjeh__TafsilAssignment_7 )
            {
             before(grammarAccess.getMarjehAccess().getTafsilAssignment_7()); 
            // InternalQiraa.g:975:3: ( rule__Marjeh__TafsilAssignment_7 )
            // InternalQiraa.g:975:4: rule__Marjeh__TafsilAssignment_7
            {
            pushFollow(FOLLOW_13);
            rule__Marjeh__TafsilAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMarjehAccess().getTafsilAssignment_7()); 

            }

            // InternalQiraa.g:978:2: ( ( rule__Marjeh__TafsilAssignment_7 )* )
            // InternalQiraa.g:979:3: ( rule__Marjeh__TafsilAssignment_7 )*
            {
             before(grammarAccess.getMarjehAccess().getTafsilAssignment_7()); 
            // InternalQiraa.g:980:3: ( rule__Marjeh__TafsilAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalQiraa.g:980:4: rule__Marjeh__TafsilAssignment_7
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Marjeh__TafsilAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMarjehAccess().getTafsilAssignment_7()); 

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
    // $ANTLR end "rule__Marjeh__Group__7__Impl"


    // $ANTLR start "rule__Marjeh__Group__8"
    // InternalQiraa.g:989:1: rule__Marjeh__Group__8 : rule__Marjeh__Group__8__Impl ;
    public final void rule__Marjeh__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:993:1: ( rule__Marjeh__Group__8__Impl )
            // InternalQiraa.g:994:2: rule__Marjeh__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Marjeh__Group__8__Impl();

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
    // $ANTLR end "rule__Marjeh__Group__8"


    // $ANTLR start "rule__Marjeh__Group__8__Impl"
    // InternalQiraa.g:1000:1: rule__Marjeh__Group__8__Impl : ( '\\u0627\\u0646\\u062A\\u0647\\u0649' ) ;
    public final void rule__Marjeh__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1004:1: ( ( '\\u0627\\u0646\\u062A\\u0647\\u0649' ) )
            // InternalQiraa.g:1005:1: ( '\\u0627\\u0646\\u062A\\u0647\\u0649' )
            {
            // InternalQiraa.g:1005:1: ( '\\u0627\\u0646\\u062A\\u0647\\u0649' )
            // InternalQiraa.g:1006:2: '\\u0627\\u0646\\u062A\\u0647\\u0649'
            {
             before(grammarAccess.getMarjehAccess().getArabicLetterAlefArabicLetterNoonArabicLetterTehArabicLetterHehArabicLetterAlefMaksuraKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMarjehAccess().getArabicLetterAlefArabicLetterNoonArabicLetterTehArabicLetterHehArabicLetterAlefMaksuraKeyword_8()); 

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
    // $ANTLR end "rule__Marjeh__Group__8__Impl"


    // $ANTLR start "rule__Tafsil__Group__0"
    // InternalQiraa.g:1016:1: rule__Tafsil__Group__0 : rule__Tafsil__Group__0__Impl rule__Tafsil__Group__1 ;
    public final void rule__Tafsil__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1020:1: ( rule__Tafsil__Group__0__Impl rule__Tafsil__Group__1 )
            // InternalQiraa.g:1021:2: rule__Tafsil__Group__0__Impl rule__Tafsil__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Tafsil__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tafsil__Group__1();

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
    // $ANTLR end "rule__Tafsil__Group__0"


    // $ANTLR start "rule__Tafsil__Group__0__Impl"
    // InternalQiraa.g:1028:1: rule__Tafsil__Group__0__Impl : ( '\\u0642\\u0648\\u0644\\u0647' ) ;
    public final void rule__Tafsil__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1032:1: ( ( '\\u0642\\u0648\\u0644\\u0647' ) )
            // InternalQiraa.g:1033:1: ( '\\u0642\\u0648\\u0644\\u0647' )
            {
            // InternalQiraa.g:1033:1: ( '\\u0642\\u0648\\u0644\\u0647' )
            // InternalQiraa.g:1034:2: '\\u0642\\u0648\\u0644\\u0647'
            {
             before(grammarAccess.getTafsilAccess().getArabicLetterQafArabicLetterWawArabicLetterLamArabicLetterHehKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTafsilAccess().getArabicLetterQafArabicLetterWawArabicLetterLamArabicLetterHehKeyword_0()); 

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
    // $ANTLR end "rule__Tafsil__Group__0__Impl"


    // $ANTLR start "rule__Tafsil__Group__1"
    // InternalQiraa.g:1043:1: rule__Tafsil__Group__1 : rule__Tafsil__Group__1__Impl rule__Tafsil__Group__2 ;
    public final void rule__Tafsil__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1047:1: ( rule__Tafsil__Group__1__Impl rule__Tafsil__Group__2 )
            // InternalQiraa.g:1048:2: rule__Tafsil__Group__1__Impl rule__Tafsil__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Tafsil__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tafsil__Group__2();

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
    // $ANTLR end "rule__Tafsil__Group__1"


    // $ANTLR start "rule__Tafsil__Group__1__Impl"
    // InternalQiraa.g:1055:1: rule__Tafsil__Group__1__Impl : ( ( rule__Tafsil__NassAssignment_1 ) ) ;
    public final void rule__Tafsil__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1059:1: ( ( ( rule__Tafsil__NassAssignment_1 ) ) )
            // InternalQiraa.g:1060:1: ( ( rule__Tafsil__NassAssignment_1 ) )
            {
            // InternalQiraa.g:1060:1: ( ( rule__Tafsil__NassAssignment_1 ) )
            // InternalQiraa.g:1061:2: ( rule__Tafsil__NassAssignment_1 )
            {
             before(grammarAccess.getTafsilAccess().getNassAssignment_1()); 
            // InternalQiraa.g:1062:2: ( rule__Tafsil__NassAssignment_1 )
            // InternalQiraa.g:1062:3: rule__Tafsil__NassAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tafsil__NassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTafsilAccess().getNassAssignment_1()); 

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
    // $ANTLR end "rule__Tafsil__Group__1__Impl"


    // $ANTLR start "rule__Tafsil__Group__2"
    // InternalQiraa.g:1070:1: rule__Tafsil__Group__2 : rule__Tafsil__Group__2__Impl rule__Tafsil__Group__3 ;
    public final void rule__Tafsil__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1074:1: ( rule__Tafsil__Group__2__Impl rule__Tafsil__Group__3 )
            // InternalQiraa.g:1075:2: rule__Tafsil__Group__2__Impl rule__Tafsil__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Tafsil__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tafsil__Group__3();

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
    // $ANTLR end "rule__Tafsil__Group__2"


    // $ANTLR start "rule__Tafsil__Group__2__Impl"
    // InternalQiraa.g:1082:1: rule__Tafsil__Group__2__Impl : ( '\\u0645\\u0639\\u0646\\u0627\\u0647' ) ;
    public final void rule__Tafsil__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1086:1: ( ( '\\u0645\\u0639\\u0646\\u0627\\u0647' ) )
            // InternalQiraa.g:1087:1: ( '\\u0645\\u0639\\u0646\\u0627\\u0647' )
            {
            // InternalQiraa.g:1087:1: ( '\\u0645\\u0639\\u0646\\u0627\\u0647' )
            // InternalQiraa.g:1088:2: '\\u0645\\u0639\\u0646\\u0627\\u0647'
            {
             before(grammarAccess.getTafsilAccess().getArabicLetterMeemArabicLetterAinArabicLetterNoonArabicLetterAlefArabicLetterHehKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTafsilAccess().getArabicLetterMeemArabicLetterAinArabicLetterNoonArabicLetterAlefArabicLetterHehKeyword_2()); 

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
    // $ANTLR end "rule__Tafsil__Group__2__Impl"


    // $ANTLR start "rule__Tafsil__Group__3"
    // InternalQiraa.g:1097:1: rule__Tafsil__Group__3 : rule__Tafsil__Group__3__Impl ;
    public final void rule__Tafsil__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1101:1: ( rule__Tafsil__Group__3__Impl )
            // InternalQiraa.g:1102:2: rule__Tafsil__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tafsil__Group__3__Impl();

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
    // $ANTLR end "rule__Tafsil__Group__3"


    // $ANTLR start "rule__Tafsil__Group__3__Impl"
    // InternalQiraa.g:1108:1: rule__Tafsil__Group__3__Impl : ( ( rule__Tafsil__KedahAssignment_3 ) ) ;
    public final void rule__Tafsil__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1112:1: ( ( ( rule__Tafsil__KedahAssignment_3 ) ) )
            // InternalQiraa.g:1113:1: ( ( rule__Tafsil__KedahAssignment_3 ) )
            {
            // InternalQiraa.g:1113:1: ( ( rule__Tafsil__KedahAssignment_3 ) )
            // InternalQiraa.g:1114:2: ( rule__Tafsil__KedahAssignment_3 )
            {
             before(grammarAccess.getTafsilAccess().getKedahAssignment_3()); 
            // InternalQiraa.g:1115:2: ( rule__Tafsil__KedahAssignment_3 )
            // InternalQiraa.g:1115:3: rule__Tafsil__KedahAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Tafsil__KedahAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTafsilAccess().getKedahAssignment_3()); 

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
    // $ANTLR end "rule__Tafsil__Group__3__Impl"


    // $ANTLR start "rule__Kaaedah__Group__0"
    // InternalQiraa.g:1124:1: rule__Kaaedah__Group__0 : rule__Kaaedah__Group__0__Impl rule__Kaaedah__Group__1 ;
    public final void rule__Kaaedah__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1128:1: ( rule__Kaaedah__Group__0__Impl rule__Kaaedah__Group__1 )
            // InternalQiraa.g:1129:2: rule__Kaaedah__Group__0__Impl rule__Kaaedah__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Kaaedah__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kaaedah__Group__1();

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
    // $ANTLR end "rule__Kaaedah__Group__0"


    // $ANTLR start "rule__Kaaedah__Group__0__Impl"
    // InternalQiraa.g:1136:1: rule__Kaaedah__Group__0__Impl : ( '\\u0642\\u0631\\u0623' ) ;
    public final void rule__Kaaedah__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1140:1: ( ( '\\u0642\\u0631\\u0623' ) )
            // InternalQiraa.g:1141:1: ( '\\u0642\\u0631\\u0623' )
            {
            // InternalQiraa.g:1141:1: ( '\\u0642\\u0631\\u0623' )
            // InternalQiraa.g:1142:2: '\\u0642\\u0631\\u0623'
            {
             before(grammarAccess.getKaaedahAccess().getArabicLetterQafArabicLetterRehArabicLetterAlefWithHamzaAboveKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getKaaedahAccess().getArabicLetterQafArabicLetterRehArabicLetterAlefWithHamzaAboveKeyword_0()); 

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
    // $ANTLR end "rule__Kaaedah__Group__0__Impl"


    // $ANTLR start "rule__Kaaedah__Group__1"
    // InternalQiraa.g:1151:1: rule__Kaaedah__Group__1 : rule__Kaaedah__Group__1__Impl rule__Kaaedah__Group__2 ;
    public final void rule__Kaaedah__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1155:1: ( rule__Kaaedah__Group__1__Impl rule__Kaaedah__Group__2 )
            // InternalQiraa.g:1156:2: rule__Kaaedah__Group__1__Impl rule__Kaaedah__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Kaaedah__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kaaedah__Group__2();

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
    // $ANTLR end "rule__Kaaedah__Group__1"


    // $ANTLR start "rule__Kaaedah__Group__1__Impl"
    // InternalQiraa.g:1163:1: rule__Kaaedah__Group__1__Impl : ( ( rule__Kaaedah__RefsAssignment_1 ) ) ;
    public final void rule__Kaaedah__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1167:1: ( ( ( rule__Kaaedah__RefsAssignment_1 ) ) )
            // InternalQiraa.g:1168:1: ( ( rule__Kaaedah__RefsAssignment_1 ) )
            {
            // InternalQiraa.g:1168:1: ( ( rule__Kaaedah__RefsAssignment_1 ) )
            // InternalQiraa.g:1169:2: ( rule__Kaaedah__RefsAssignment_1 )
            {
             before(grammarAccess.getKaaedahAccess().getRefsAssignment_1()); 
            // InternalQiraa.g:1170:2: ( rule__Kaaedah__RefsAssignment_1 )
            // InternalQiraa.g:1170:3: rule__Kaaedah__RefsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Kaaedah__RefsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKaaedahAccess().getRefsAssignment_1()); 

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
    // $ANTLR end "rule__Kaaedah__Group__1__Impl"


    // $ANTLR start "rule__Kaaedah__Group__2"
    // InternalQiraa.g:1178:1: rule__Kaaedah__Group__2 : rule__Kaaedah__Group__2__Impl rule__Kaaedah__Group__3 ;
    public final void rule__Kaaedah__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1182:1: ( rule__Kaaedah__Group__2__Impl rule__Kaaedah__Group__3 )
            // InternalQiraa.g:1183:2: rule__Kaaedah__Group__2__Impl rule__Kaaedah__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Kaaedah__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kaaedah__Group__3();

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
    // $ANTLR end "rule__Kaaedah__Group__2"


    // $ANTLR start "rule__Kaaedah__Group__2__Impl"
    // InternalQiraa.g:1190:1: rule__Kaaedah__Group__2__Impl : ( '\\u0628' ) ;
    public final void rule__Kaaedah__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1194:1: ( ( '\\u0628' ) )
            // InternalQiraa.g:1195:1: ( '\\u0628' )
            {
            // InternalQiraa.g:1195:1: ( '\\u0628' )
            // InternalQiraa.g:1196:2: '\\u0628'
            {
             before(grammarAccess.getKaaedahAccess().getArabicLetterBehKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getKaaedahAccess().getArabicLetterBehKeyword_2()); 

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
    // $ANTLR end "rule__Kaaedah__Group__2__Impl"


    // $ANTLR start "rule__Kaaedah__Group__3"
    // InternalQiraa.g:1205:1: rule__Kaaedah__Group__3 : rule__Kaaedah__Group__3__Impl rule__Kaaedah__Group__4 ;
    public final void rule__Kaaedah__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1209:1: ( rule__Kaaedah__Group__3__Impl rule__Kaaedah__Group__4 )
            // InternalQiraa.g:1210:2: rule__Kaaedah__Group__3__Impl rule__Kaaedah__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Kaaedah__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kaaedah__Group__4();

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
    // $ANTLR end "rule__Kaaedah__Group__3"


    // $ANTLR start "rule__Kaaedah__Group__3__Impl"
    // InternalQiraa.g:1217:1: rule__Kaaedah__Group__3__Impl : ( ( rule__Kaaedah__KaydAssignment_3 ) ) ;
    public final void rule__Kaaedah__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1221:1: ( ( ( rule__Kaaedah__KaydAssignment_3 ) ) )
            // InternalQiraa.g:1222:1: ( ( rule__Kaaedah__KaydAssignment_3 ) )
            {
            // InternalQiraa.g:1222:1: ( ( rule__Kaaedah__KaydAssignment_3 ) )
            // InternalQiraa.g:1223:2: ( rule__Kaaedah__KaydAssignment_3 )
            {
             before(grammarAccess.getKaaedahAccess().getKaydAssignment_3()); 
            // InternalQiraa.g:1224:2: ( rule__Kaaedah__KaydAssignment_3 )
            // InternalQiraa.g:1224:3: rule__Kaaedah__KaydAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Kaaedah__KaydAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getKaaedahAccess().getKaydAssignment_3()); 

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
    // $ANTLR end "rule__Kaaedah__Group__3__Impl"


    // $ANTLR start "rule__Kaaedah__Group__4"
    // InternalQiraa.g:1232:1: rule__Kaaedah__Group__4 : rule__Kaaedah__Group__4__Impl rule__Kaaedah__Group__5 ;
    public final void rule__Kaaedah__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1236:1: ( rule__Kaaedah__Group__4__Impl rule__Kaaedah__Group__5 )
            // InternalQiraa.g:1237:2: rule__Kaaedah__Group__4__Impl rule__Kaaedah__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Kaaedah__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kaaedah__Group__5();

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
    // $ANTLR end "rule__Kaaedah__Group__4"


    // $ANTLR start "rule__Kaaedah__Group__4__Impl"
    // InternalQiraa.g:1244:1: rule__Kaaedah__Group__4__Impl : ( '\\u0641\\u064A' ) ;
    public final void rule__Kaaedah__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1248:1: ( ( '\\u0641\\u064A' ) )
            // InternalQiraa.g:1249:1: ( '\\u0641\\u064A' )
            {
            // InternalQiraa.g:1249:1: ( '\\u0641\\u064A' )
            // InternalQiraa.g:1250:2: '\\u0641\\u064A'
            {
             before(grammarAccess.getKaaedahAccess().getArabicLetterFehArabicLetterYehKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getKaaedahAccess().getArabicLetterFehArabicLetterYehKeyword_4()); 

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
    // $ANTLR end "rule__Kaaedah__Group__4__Impl"


    // $ANTLR start "rule__Kaaedah__Group__5"
    // InternalQiraa.g:1259:1: rule__Kaaedah__Group__5 : rule__Kaaedah__Group__5__Impl ;
    public final void rule__Kaaedah__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1263:1: ( rule__Kaaedah__Group__5__Impl )
            // InternalQiraa.g:1264:2: rule__Kaaedah__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Kaaedah__Group__5__Impl();

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
    // $ANTLR end "rule__Kaaedah__Group__5"


    // $ANTLR start "rule__Kaaedah__Group__5__Impl"
    // InternalQiraa.g:1270:1: rule__Kaaedah__Group__5__Impl : ( ( rule__Kaaedah__HarfAssignment_5 ) ) ;
    public final void rule__Kaaedah__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1274:1: ( ( ( rule__Kaaedah__HarfAssignment_5 ) ) )
            // InternalQiraa.g:1275:1: ( ( rule__Kaaedah__HarfAssignment_5 ) )
            {
            // InternalQiraa.g:1275:1: ( ( rule__Kaaedah__HarfAssignment_5 ) )
            // InternalQiraa.g:1276:2: ( rule__Kaaedah__HarfAssignment_5 )
            {
             before(grammarAccess.getKaaedahAccess().getHarfAssignment_5()); 
            // InternalQiraa.g:1277:2: ( rule__Kaaedah__HarfAssignment_5 )
            // InternalQiraa.g:1277:3: rule__Kaaedah__HarfAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Kaaedah__HarfAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getKaaedahAccess().getHarfAssignment_5()); 

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
    // $ANTLR end "rule__Kaaedah__Group__5__Impl"


    // $ANTLR start "rule__Matn__Group__0"
    // InternalQiraa.g:1286:1: rule__Matn__Group__0 : rule__Matn__Group__0__Impl rule__Matn__Group__1 ;
    public final void rule__Matn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1290:1: ( rule__Matn__Group__0__Impl rule__Matn__Group__1 )
            // InternalQiraa.g:1291:2: rule__Matn__Group__0__Impl rule__Matn__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Matn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matn__Group__1();

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
    // $ANTLR end "rule__Matn__Group__0"


    // $ANTLR start "rule__Matn__Group__0__Impl"
    // InternalQiraa.g:1298:1: rule__Matn__Group__0__Impl : ( RULE_BASMALAH ) ;
    public final void rule__Matn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1302:1: ( ( RULE_BASMALAH ) )
            // InternalQiraa.g:1303:1: ( RULE_BASMALAH )
            {
            // InternalQiraa.g:1303:1: ( RULE_BASMALAH )
            // InternalQiraa.g:1304:2: RULE_BASMALAH
            {
             before(grammarAccess.getMatnAccess().getBASMALAHTerminalRuleCall_0()); 
            match(input,RULE_BASMALAH,FOLLOW_2); 
             after(grammarAccess.getMatnAccess().getBASMALAHTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Matn__Group__0__Impl"


    // $ANTLR start "rule__Matn__Group__1"
    // InternalQiraa.g:1313:1: rule__Matn__Group__1 : rule__Matn__Group__1__Impl rule__Matn__Group__2 ;
    public final void rule__Matn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1317:1: ( rule__Matn__Group__1__Impl rule__Matn__Group__2 )
            // InternalQiraa.g:1318:2: rule__Matn__Group__1__Impl rule__Matn__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Matn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matn__Group__2();

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
    // $ANTLR end "rule__Matn__Group__1"


    // $ANTLR start "rule__Matn__Group__1__Impl"
    // InternalQiraa.g:1325:1: rule__Matn__Group__1__Impl : ( ( rule__Matn__NameAssignment_1 ) ) ;
    public final void rule__Matn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1329:1: ( ( ( rule__Matn__NameAssignment_1 ) ) )
            // InternalQiraa.g:1330:1: ( ( rule__Matn__NameAssignment_1 ) )
            {
            // InternalQiraa.g:1330:1: ( ( rule__Matn__NameAssignment_1 ) )
            // InternalQiraa.g:1331:2: ( rule__Matn__NameAssignment_1 )
            {
             before(grammarAccess.getMatnAccess().getNameAssignment_1()); 
            // InternalQiraa.g:1332:2: ( rule__Matn__NameAssignment_1 )
            // InternalQiraa.g:1332:3: rule__Matn__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Matn__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMatnAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Matn__Group__1__Impl"


    // $ANTLR start "rule__Matn__Group__2"
    // InternalQiraa.g:1340:1: rule__Matn__Group__2 : rule__Matn__Group__2__Impl ;
    public final void rule__Matn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1344:1: ( rule__Matn__Group__2__Impl )
            // InternalQiraa.g:1345:2: rule__Matn__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Matn__Group__2__Impl();

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
    // $ANTLR end "rule__Matn__Group__2"


    // $ANTLR start "rule__Matn__Group__2__Impl"
    // InternalQiraa.g:1351:1: rule__Matn__Group__2__Impl : ( ( ( rule__Matn__MakatehAssignment_2 ) ) ( ( rule__Matn__MakatehAssignment_2 )* ) ) ;
    public final void rule__Matn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1355:1: ( ( ( ( rule__Matn__MakatehAssignment_2 ) ) ( ( rule__Matn__MakatehAssignment_2 )* ) ) )
            // InternalQiraa.g:1356:1: ( ( ( rule__Matn__MakatehAssignment_2 ) ) ( ( rule__Matn__MakatehAssignment_2 )* ) )
            {
            // InternalQiraa.g:1356:1: ( ( ( rule__Matn__MakatehAssignment_2 ) ) ( ( rule__Matn__MakatehAssignment_2 )* ) )
            // InternalQiraa.g:1357:2: ( ( rule__Matn__MakatehAssignment_2 ) ) ( ( rule__Matn__MakatehAssignment_2 )* )
            {
            // InternalQiraa.g:1357:2: ( ( rule__Matn__MakatehAssignment_2 ) )
            // InternalQiraa.g:1358:3: ( rule__Matn__MakatehAssignment_2 )
            {
             before(grammarAccess.getMatnAccess().getMakatehAssignment_2()); 
            // InternalQiraa.g:1359:3: ( rule__Matn__MakatehAssignment_2 )
            // InternalQiraa.g:1359:4: rule__Matn__MakatehAssignment_2
            {
            pushFollow(FOLLOW_19);
            rule__Matn__MakatehAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMatnAccess().getMakatehAssignment_2()); 

            }

            // InternalQiraa.g:1362:2: ( ( rule__Matn__MakatehAssignment_2 )* )
            // InternalQiraa.g:1363:3: ( rule__Matn__MakatehAssignment_2 )*
            {
             before(grammarAccess.getMatnAccess().getMakatehAssignment_2()); 
            // InternalQiraa.g:1364:3: ( rule__Matn__MakatehAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==37) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalQiraa.g:1364:4: rule__Matn__MakatehAssignment_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Matn__MakatehAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMatnAccess().getMakatehAssignment_2()); 

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
    // $ANTLR end "rule__Matn__Group__2__Impl"


    // $ANTLR start "rule__Maktah__Group__0"
    // InternalQiraa.g:1374:1: rule__Maktah__Group__0 : rule__Maktah__Group__0__Impl rule__Maktah__Group__1 ;
    public final void rule__Maktah__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1378:1: ( rule__Maktah__Group__0__Impl rule__Maktah__Group__1 )
            // InternalQiraa.g:1379:2: rule__Maktah__Group__0__Impl rule__Maktah__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Maktah__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Maktah__Group__1();

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
    // $ANTLR end "rule__Maktah__Group__0"


    // $ANTLR start "rule__Maktah__Group__0__Impl"
    // InternalQiraa.g:1386:1: rule__Maktah__Group__0__Impl : ( '*' ) ;
    public final void rule__Maktah__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1390:1: ( ( '*' ) )
            // InternalQiraa.g:1391:1: ( '*' )
            {
            // InternalQiraa.g:1391:1: ( '*' )
            // InternalQiraa.g:1392:2: '*'
            {
             before(grammarAccess.getMaktahAccess().getAsteriskKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMaktahAccess().getAsteriskKeyword_0()); 

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
    // $ANTLR end "rule__Maktah__Group__0__Impl"


    // $ANTLR start "rule__Maktah__Group__1"
    // InternalQiraa.g:1401:1: rule__Maktah__Group__1 : rule__Maktah__Group__1__Impl rule__Maktah__Group__2 ;
    public final void rule__Maktah__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1405:1: ( rule__Maktah__Group__1__Impl rule__Maktah__Group__2 )
            // InternalQiraa.g:1406:2: rule__Maktah__Group__1__Impl rule__Maktah__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Maktah__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Maktah__Group__2();

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
    // $ANTLR end "rule__Maktah__Group__1"


    // $ANTLR start "rule__Maktah__Group__1__Impl"
    // InternalQiraa.g:1413:1: rule__Maktah__Group__1__Impl : ( '*' ) ;
    public final void rule__Maktah__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1417:1: ( ( '*' ) )
            // InternalQiraa.g:1418:1: ( '*' )
            {
            // InternalQiraa.g:1418:1: ( '*' )
            // InternalQiraa.g:1419:2: '*'
            {
             before(grammarAccess.getMaktahAccess().getAsteriskKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMaktahAccess().getAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__Maktah__Group__1__Impl"


    // $ANTLR start "rule__Maktah__Group__2"
    // InternalQiraa.g:1428:1: rule__Maktah__Group__2 : rule__Maktah__Group__2__Impl rule__Maktah__Group__3 ;
    public final void rule__Maktah__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1432:1: ( rule__Maktah__Group__2__Impl rule__Maktah__Group__3 )
            // InternalQiraa.g:1433:2: rule__Maktah__Group__2__Impl rule__Maktah__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Maktah__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Maktah__Group__3();

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
    // $ANTLR end "rule__Maktah__Group__2"


    // $ANTLR start "rule__Maktah__Group__2__Impl"
    // InternalQiraa.g:1440:1: rule__Maktah__Group__2__Impl : ( '*' ) ;
    public final void rule__Maktah__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1444:1: ( ( '*' ) )
            // InternalQiraa.g:1445:1: ( '*' )
            {
            // InternalQiraa.g:1445:1: ( '*' )
            // InternalQiraa.g:1446:2: '*'
            {
             before(grammarAccess.getMaktahAccess().getAsteriskKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMaktahAccess().getAsteriskKeyword_2()); 

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
    // $ANTLR end "rule__Maktah__Group__2__Impl"


    // $ANTLR start "rule__Maktah__Group__3"
    // InternalQiraa.g:1455:1: rule__Maktah__Group__3 : rule__Maktah__Group__3__Impl rule__Maktah__Group__4 ;
    public final void rule__Maktah__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1459:1: ( rule__Maktah__Group__3__Impl rule__Maktah__Group__4 )
            // InternalQiraa.g:1460:2: rule__Maktah__Group__3__Impl rule__Maktah__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Maktah__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Maktah__Group__4();

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
    // $ANTLR end "rule__Maktah__Group__3"


    // $ANTLR start "rule__Maktah__Group__3__Impl"
    // InternalQiraa.g:1467:1: rule__Maktah__Group__3__Impl : ( ( rule__Maktah__NameAssignment_3 ) ) ;
    public final void rule__Maktah__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1471:1: ( ( ( rule__Maktah__NameAssignment_3 ) ) )
            // InternalQiraa.g:1472:1: ( ( rule__Maktah__NameAssignment_3 ) )
            {
            // InternalQiraa.g:1472:1: ( ( rule__Maktah__NameAssignment_3 ) )
            // InternalQiraa.g:1473:2: ( rule__Maktah__NameAssignment_3 )
            {
             before(grammarAccess.getMaktahAccess().getNameAssignment_3()); 
            // InternalQiraa.g:1474:2: ( rule__Maktah__NameAssignment_3 )
            // InternalQiraa.g:1474:3: rule__Maktah__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Maktah__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMaktahAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Maktah__Group__3__Impl"


    // $ANTLR start "rule__Maktah__Group__4"
    // InternalQiraa.g:1482:1: rule__Maktah__Group__4 : rule__Maktah__Group__4__Impl rule__Maktah__Group__5 ;
    public final void rule__Maktah__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1486:1: ( rule__Maktah__Group__4__Impl rule__Maktah__Group__5 )
            // InternalQiraa.g:1487:2: rule__Maktah__Group__4__Impl rule__Maktah__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Maktah__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Maktah__Group__5();

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
    // $ANTLR end "rule__Maktah__Group__4"


    // $ANTLR start "rule__Maktah__Group__4__Impl"
    // InternalQiraa.g:1494:1: rule__Maktah__Group__4__Impl : ( '(' ) ;
    public final void rule__Maktah__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1498:1: ( ( '(' ) )
            // InternalQiraa.g:1499:1: ( '(' )
            {
            // InternalQiraa.g:1499:1: ( '(' )
            // InternalQiraa.g:1500:2: '('
            {
             before(grammarAccess.getMaktahAccess().getLeftParenthesisKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMaktahAccess().getLeftParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Maktah__Group__4__Impl"


    // $ANTLR start "rule__Maktah__Group__5"
    // InternalQiraa.g:1509:1: rule__Maktah__Group__5 : rule__Maktah__Group__5__Impl rule__Maktah__Group__6 ;
    public final void rule__Maktah__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1513:1: ( rule__Maktah__Group__5__Impl rule__Maktah__Group__6 )
            // InternalQiraa.g:1514:2: rule__Maktah__Group__5__Impl rule__Maktah__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Maktah__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Maktah__Group__6();

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
    // $ANTLR end "rule__Maktah__Group__5"


    // $ANTLR start "rule__Maktah__Group__5__Impl"
    // InternalQiraa.g:1521:1: rule__Maktah__Group__5__Impl : ( ( rule__Maktah__AbyatCountAssignment_5 ) ) ;
    public final void rule__Maktah__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1525:1: ( ( ( rule__Maktah__AbyatCountAssignment_5 ) ) )
            // InternalQiraa.g:1526:1: ( ( rule__Maktah__AbyatCountAssignment_5 ) )
            {
            // InternalQiraa.g:1526:1: ( ( rule__Maktah__AbyatCountAssignment_5 ) )
            // InternalQiraa.g:1527:2: ( rule__Maktah__AbyatCountAssignment_5 )
            {
             before(grammarAccess.getMaktahAccess().getAbyatCountAssignment_5()); 
            // InternalQiraa.g:1528:2: ( rule__Maktah__AbyatCountAssignment_5 )
            // InternalQiraa.g:1528:3: rule__Maktah__AbyatCountAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Maktah__AbyatCountAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMaktahAccess().getAbyatCountAssignment_5()); 

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
    // $ANTLR end "rule__Maktah__Group__5__Impl"


    // $ANTLR start "rule__Maktah__Group__6"
    // InternalQiraa.g:1536:1: rule__Maktah__Group__6 : rule__Maktah__Group__6__Impl rule__Maktah__Group__7 ;
    public final void rule__Maktah__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1540:1: ( rule__Maktah__Group__6__Impl rule__Maktah__Group__7 )
            // InternalQiraa.g:1541:2: rule__Maktah__Group__6__Impl rule__Maktah__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Maktah__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Maktah__Group__7();

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
    // $ANTLR end "rule__Maktah__Group__6"


    // $ANTLR start "rule__Maktah__Group__6__Impl"
    // InternalQiraa.g:1548:1: rule__Maktah__Group__6__Impl : ( ')' ) ;
    public final void rule__Maktah__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1552:1: ( ( ')' ) )
            // InternalQiraa.g:1553:1: ( ')' )
            {
            // InternalQiraa.g:1553:1: ( ')' )
            // InternalQiraa.g:1554:2: ')'
            {
             before(grammarAccess.getMaktahAccess().getRightParenthesisKeyword_6()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMaktahAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Maktah__Group__6__Impl"


    // $ANTLR start "rule__Maktah__Group__7"
    // InternalQiraa.g:1563:1: rule__Maktah__Group__7 : rule__Maktah__Group__7__Impl ;
    public final void rule__Maktah__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1567:1: ( rule__Maktah__Group__7__Impl )
            // InternalQiraa.g:1568:2: rule__Maktah__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Maktah__Group__7__Impl();

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
    // $ANTLR end "rule__Maktah__Group__7"


    // $ANTLR start "rule__Maktah__Group__7__Impl"
    // InternalQiraa.g:1574:1: rule__Maktah__Group__7__Impl : ( ( ( rule__Maktah__AbyatAssignment_7 ) ) ( ( rule__Maktah__AbyatAssignment_7 )* ) ) ;
    public final void rule__Maktah__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1578:1: ( ( ( ( rule__Maktah__AbyatAssignment_7 ) ) ( ( rule__Maktah__AbyatAssignment_7 )* ) ) )
            // InternalQiraa.g:1579:1: ( ( ( rule__Maktah__AbyatAssignment_7 ) ) ( ( rule__Maktah__AbyatAssignment_7 )* ) )
            {
            // InternalQiraa.g:1579:1: ( ( ( rule__Maktah__AbyatAssignment_7 ) ) ( ( rule__Maktah__AbyatAssignment_7 )* ) )
            // InternalQiraa.g:1580:2: ( ( rule__Maktah__AbyatAssignment_7 ) ) ( ( rule__Maktah__AbyatAssignment_7 )* )
            {
            // InternalQiraa.g:1580:2: ( ( rule__Maktah__AbyatAssignment_7 ) )
            // InternalQiraa.g:1581:3: ( rule__Maktah__AbyatAssignment_7 )
            {
             before(grammarAccess.getMaktahAccess().getAbyatAssignment_7()); 
            // InternalQiraa.g:1582:3: ( rule__Maktah__AbyatAssignment_7 )
            // InternalQiraa.g:1582:4: rule__Maktah__AbyatAssignment_7
            {
            pushFollow(FOLLOW_23);
            rule__Maktah__AbyatAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMaktahAccess().getAbyatAssignment_7()); 

            }

            // InternalQiraa.g:1585:2: ( ( rule__Maktah__AbyatAssignment_7 )* )
            // InternalQiraa.g:1586:3: ( rule__Maktah__AbyatAssignment_7 )*
            {
             before(grammarAccess.getMaktahAccess().getAbyatAssignment_7()); 
            // InternalQiraa.g:1587:3: ( rule__Maktah__AbyatAssignment_7 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_INT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQiraa.g:1587:4: rule__Maktah__AbyatAssignment_7
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Maktah__AbyatAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMaktahAccess().getAbyatAssignment_7()); 

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
    // $ANTLR end "rule__Maktah__Group__7__Impl"


    // $ANTLR start "rule__Bayt__Group__0"
    // InternalQiraa.g:1597:1: rule__Bayt__Group__0 : rule__Bayt__Group__0__Impl rule__Bayt__Group__1 ;
    public final void rule__Bayt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1601:1: ( rule__Bayt__Group__0__Impl rule__Bayt__Group__1 )
            // InternalQiraa.g:1602:2: rule__Bayt__Group__0__Impl rule__Bayt__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Bayt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bayt__Group__1();

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
    // $ANTLR end "rule__Bayt__Group__0"


    // $ANTLR start "rule__Bayt__Group__0__Impl"
    // InternalQiraa.g:1609:1: rule__Bayt__Group__0__Impl : ( ( rule__Bayt__RakmAssignment_0 ) ) ;
    public final void rule__Bayt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1613:1: ( ( ( rule__Bayt__RakmAssignment_0 ) ) )
            // InternalQiraa.g:1614:1: ( ( rule__Bayt__RakmAssignment_0 ) )
            {
            // InternalQiraa.g:1614:1: ( ( rule__Bayt__RakmAssignment_0 ) )
            // InternalQiraa.g:1615:2: ( rule__Bayt__RakmAssignment_0 )
            {
             before(grammarAccess.getBaytAccess().getRakmAssignment_0()); 
            // InternalQiraa.g:1616:2: ( rule__Bayt__RakmAssignment_0 )
            // InternalQiraa.g:1616:3: rule__Bayt__RakmAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Bayt__RakmAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBaytAccess().getRakmAssignment_0()); 

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
    // $ANTLR end "rule__Bayt__Group__0__Impl"


    // $ANTLR start "rule__Bayt__Group__1"
    // InternalQiraa.g:1624:1: rule__Bayt__Group__1 : rule__Bayt__Group__1__Impl rule__Bayt__Group__2 ;
    public final void rule__Bayt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1628:1: ( rule__Bayt__Group__1__Impl rule__Bayt__Group__2 )
            // InternalQiraa.g:1629:2: rule__Bayt__Group__1__Impl rule__Bayt__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Bayt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bayt__Group__2();

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
    // $ANTLR end "rule__Bayt__Group__1"


    // $ANTLR start "rule__Bayt__Group__1__Impl"
    // InternalQiraa.g:1636:1: rule__Bayt__Group__1__Impl : ( '-' ) ;
    public final void rule__Bayt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1640:1: ( ( '-' ) )
            // InternalQiraa.g:1641:1: ( '-' )
            {
            // InternalQiraa.g:1641:1: ( '-' )
            // InternalQiraa.g:1642:2: '-'
            {
             before(grammarAccess.getBaytAccess().getHyphenMinusKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBaytAccess().getHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__Bayt__Group__1__Impl"


    // $ANTLR start "rule__Bayt__Group__2"
    // InternalQiraa.g:1651:1: rule__Bayt__Group__2 : rule__Bayt__Group__2__Impl rule__Bayt__Group__3 ;
    public final void rule__Bayt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1655:1: ( rule__Bayt__Group__2__Impl rule__Bayt__Group__3 )
            // InternalQiraa.g:1656:2: rule__Bayt__Group__2__Impl rule__Bayt__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Bayt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bayt__Group__3();

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
    // $ANTLR end "rule__Bayt__Group__2"


    // $ANTLR start "rule__Bayt__Group__2__Impl"
    // InternalQiraa.g:1663:1: rule__Bayt__Group__2__Impl : ( ( ( rule__Bayt__SadrAssignment_2 ) ) ( ( rule__Bayt__SadrAssignment_2 )* ) ) ;
    public final void rule__Bayt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1667:1: ( ( ( ( rule__Bayt__SadrAssignment_2 ) ) ( ( rule__Bayt__SadrAssignment_2 )* ) ) )
            // InternalQiraa.g:1668:1: ( ( ( rule__Bayt__SadrAssignment_2 ) ) ( ( rule__Bayt__SadrAssignment_2 )* ) )
            {
            // InternalQiraa.g:1668:1: ( ( ( rule__Bayt__SadrAssignment_2 ) ) ( ( rule__Bayt__SadrAssignment_2 )* ) )
            // InternalQiraa.g:1669:2: ( ( rule__Bayt__SadrAssignment_2 ) ) ( ( rule__Bayt__SadrAssignment_2 )* )
            {
            // InternalQiraa.g:1669:2: ( ( rule__Bayt__SadrAssignment_2 ) )
            // InternalQiraa.g:1670:3: ( rule__Bayt__SadrAssignment_2 )
            {
             before(grammarAccess.getBaytAccess().getSadrAssignment_2()); 
            // InternalQiraa.g:1671:3: ( rule__Bayt__SadrAssignment_2 )
            // InternalQiraa.g:1671:4: rule__Bayt__SadrAssignment_2
            {
            pushFollow(FOLLOW_4);
            rule__Bayt__SadrAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBaytAccess().getSadrAssignment_2()); 

            }

            // InternalQiraa.g:1674:2: ( ( rule__Bayt__SadrAssignment_2 )* )
            // InternalQiraa.g:1675:3: ( rule__Bayt__SadrAssignment_2 )*
            {
             before(grammarAccess.getBaytAccess().getSadrAssignment_2()); 
            // InternalQiraa.g:1676:3: ( rule__Bayt__SadrAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_AWORD) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQiraa.g:1676:4: rule__Bayt__SadrAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Bayt__SadrAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getBaytAccess().getSadrAssignment_2()); 

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
    // $ANTLR end "rule__Bayt__Group__2__Impl"


    // $ANTLR start "rule__Bayt__Group__3"
    // InternalQiraa.g:1685:1: rule__Bayt__Group__3 : rule__Bayt__Group__3__Impl rule__Bayt__Group__4 ;
    public final void rule__Bayt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1689:1: ( rule__Bayt__Group__3__Impl rule__Bayt__Group__4 )
            // InternalQiraa.g:1690:2: rule__Bayt__Group__3__Impl rule__Bayt__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Bayt__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bayt__Group__4();

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
    // $ANTLR end "rule__Bayt__Group__3"


    // $ANTLR start "rule__Bayt__Group__3__Impl"
    // InternalQiraa.g:1697:1: rule__Bayt__Group__3__Impl : ( '...' ) ;
    public final void rule__Bayt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1701:1: ( ( '...' ) )
            // InternalQiraa.g:1702:1: ( '...' )
            {
            // InternalQiraa.g:1702:1: ( '...' )
            // InternalQiraa.g:1703:2: '...'
            {
             before(grammarAccess.getBaytAccess().getFullStopFullStopFullStopKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBaytAccess().getFullStopFullStopFullStopKeyword_3()); 

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
    // $ANTLR end "rule__Bayt__Group__3__Impl"


    // $ANTLR start "rule__Bayt__Group__4"
    // InternalQiraa.g:1712:1: rule__Bayt__Group__4 : rule__Bayt__Group__4__Impl ;
    public final void rule__Bayt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1716:1: ( rule__Bayt__Group__4__Impl )
            // InternalQiraa.g:1717:2: rule__Bayt__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bayt__Group__4__Impl();

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
    // $ANTLR end "rule__Bayt__Group__4"


    // $ANTLR start "rule__Bayt__Group__4__Impl"
    // InternalQiraa.g:1723:1: rule__Bayt__Group__4__Impl : ( ( ( rule__Bayt__AjozAssignment_4 ) ) ( ( rule__Bayt__AjozAssignment_4 )* ) ) ;
    public final void rule__Bayt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1727:1: ( ( ( ( rule__Bayt__AjozAssignment_4 ) ) ( ( rule__Bayt__AjozAssignment_4 )* ) ) )
            // InternalQiraa.g:1728:1: ( ( ( rule__Bayt__AjozAssignment_4 ) ) ( ( rule__Bayt__AjozAssignment_4 )* ) )
            {
            // InternalQiraa.g:1728:1: ( ( ( rule__Bayt__AjozAssignment_4 ) ) ( ( rule__Bayt__AjozAssignment_4 )* ) )
            // InternalQiraa.g:1729:2: ( ( rule__Bayt__AjozAssignment_4 ) ) ( ( rule__Bayt__AjozAssignment_4 )* )
            {
            // InternalQiraa.g:1729:2: ( ( rule__Bayt__AjozAssignment_4 ) )
            // InternalQiraa.g:1730:3: ( rule__Bayt__AjozAssignment_4 )
            {
             before(grammarAccess.getBaytAccess().getAjozAssignment_4()); 
            // InternalQiraa.g:1731:3: ( rule__Bayt__AjozAssignment_4 )
            // InternalQiraa.g:1731:4: rule__Bayt__AjozAssignment_4
            {
            pushFollow(FOLLOW_4);
            rule__Bayt__AjozAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBaytAccess().getAjozAssignment_4()); 

            }

            // InternalQiraa.g:1734:2: ( ( rule__Bayt__AjozAssignment_4 )* )
            // InternalQiraa.g:1735:3: ( rule__Bayt__AjozAssignment_4 )*
            {
             before(grammarAccess.getBaytAccess().getAjozAssignment_4()); 
            // InternalQiraa.g:1736:3: ( rule__Bayt__AjozAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_AWORD) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalQiraa.g:1736:4: rule__Bayt__AjozAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Bayt__AjozAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getBaytAccess().getAjozAssignment_4()); 

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
    // $ANTLR end "rule__Bayt__Group__4__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalQiraa.g:1746:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1750:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalQiraa.g:1751:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__1();

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
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // InternalQiraa.g:1758:1: rule__Person__Group__0__Impl : ( ( rule__Person__NameAssignment_0 ) ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1762:1: ( ( ( rule__Person__NameAssignment_0 ) ) )
            // InternalQiraa.g:1763:1: ( ( rule__Person__NameAssignment_0 ) )
            {
            // InternalQiraa.g:1763:1: ( ( rule__Person__NameAssignment_0 ) )
            // InternalQiraa.g:1764:2: ( rule__Person__NameAssignment_0 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_0()); 
            // InternalQiraa.g:1765:2: ( rule__Person__NameAssignment_0 )
            // InternalQiraa.g:1765:3: rule__Person__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Person__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // InternalQiraa.g:1773:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1777:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalQiraa.g:1778:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Person__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__2();

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
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // InternalQiraa.g:1785:1: rule__Person__Group__1__Impl : ( ( rule__Person__Group_1__0 )? ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1789:1: ( ( ( rule__Person__Group_1__0 )? ) )
            // InternalQiraa.g:1790:1: ( ( rule__Person__Group_1__0 )? )
            {
            // InternalQiraa.g:1790:1: ( ( rule__Person__Group_1__0 )? )
            // InternalQiraa.g:1791:2: ( rule__Person__Group_1__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_1()); 
            // InternalQiraa.g:1792:2: ( rule__Person__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==42) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalQiraa.g:1792:3: rule__Person__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Person__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__2"
    // InternalQiraa.g:1800:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1804:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalQiraa.g:1805:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Person__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__3();

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
    // $ANTLR end "rule__Person__Group__2"


    // $ANTLR start "rule__Person__Group__2__Impl"
    // InternalQiraa.g:1812:1: rule__Person__Group__2__Impl : ( ( rule__Person__Group_2__0 )? ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1816:1: ( ( ( rule__Person__Group_2__0 )? ) )
            // InternalQiraa.g:1817:1: ( ( rule__Person__Group_2__0 )? )
            {
            // InternalQiraa.g:1817:1: ( ( rule__Person__Group_2__0 )? )
            // InternalQiraa.g:1818:2: ( rule__Person__Group_2__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_2()); 
            // InternalQiraa.g:1819:2: ( rule__Person__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==43) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQiraa.g:1819:3: rule__Person__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Person__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Person__Group__2__Impl"


    // $ANTLR start "rule__Person__Group__3"
    // InternalQiraa.g:1827:1: rule__Person__Group__3 : rule__Person__Group__3__Impl ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1831:1: ( rule__Person__Group__3__Impl )
            // InternalQiraa.g:1832:2: rule__Person__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__3__Impl();

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
    // $ANTLR end "rule__Person__Group__3"


    // $ANTLR start "rule__Person__Group__3__Impl"
    // InternalQiraa.g:1838:1: rule__Person__Group__3__Impl : ( ( rule__Person__Group_3__0 )? ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1842:1: ( ( ( rule__Person__Group_3__0 )? ) )
            // InternalQiraa.g:1843:1: ( ( rule__Person__Group_3__0 )? )
            {
            // InternalQiraa.g:1843:1: ( ( rule__Person__Group_3__0 )? )
            // InternalQiraa.g:1844:2: ( rule__Person__Group_3__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_3()); 
            // InternalQiraa.g:1845:2: ( rule__Person__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==44) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalQiraa.g:1845:3: rule__Person__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Person__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Person__Group__3__Impl"


    // $ANTLR start "rule__Person__Group_1__0"
    // InternalQiraa.g:1854:1: rule__Person__Group_1__0 : rule__Person__Group_1__0__Impl rule__Person__Group_1__1 ;
    public final void rule__Person__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1858:1: ( rule__Person__Group_1__0__Impl rule__Person__Group_1__1 )
            // InternalQiraa.g:1859:2: rule__Person__Group_1__0__Impl rule__Person__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Person__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_1__1();

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
    // $ANTLR end "rule__Person__Group_1__0"


    // $ANTLR start "rule__Person__Group_1__0__Impl"
    // InternalQiraa.g:1866:1: rule__Person__Group_1__0__Impl : ( '\\u0627\\u0633\\u0645\\u0647' ) ;
    public final void rule__Person__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1870:1: ( ( '\\u0627\\u0633\\u0645\\u0647' ) )
            // InternalQiraa.g:1871:1: ( '\\u0627\\u0633\\u0645\\u0647' )
            {
            // InternalQiraa.g:1871:1: ( '\\u0627\\u0633\\u0645\\u0647' )
            // InternalQiraa.g:1872:2: '\\u0627\\u0633\\u0645\\u0647'
            {
             before(grammarAccess.getPersonAccess().getArabicLetterAlefArabicLetterSeenArabicLetterMeemArabicLetterHehKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getArabicLetterAlefArabicLetterSeenArabicLetterMeemArabicLetterHehKeyword_1_0()); 

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
    // $ANTLR end "rule__Person__Group_1__0__Impl"


    // $ANTLR start "rule__Person__Group_1__1"
    // InternalQiraa.g:1881:1: rule__Person__Group_1__1 : rule__Person__Group_1__1__Impl ;
    public final void rule__Person__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1885:1: ( rule__Person__Group_1__1__Impl )
            // InternalQiraa.g:1886:2: rule__Person__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group_1__1__Impl();

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
    // $ANTLR end "rule__Person__Group_1__1"


    // $ANTLR start "rule__Person__Group_1__1__Impl"
    // InternalQiraa.g:1892:1: rule__Person__Group_1__1__Impl : ( ( rule__Person__EsmAssignment_1_1 ) ) ;
    public final void rule__Person__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1896:1: ( ( ( rule__Person__EsmAssignment_1_1 ) ) )
            // InternalQiraa.g:1897:1: ( ( rule__Person__EsmAssignment_1_1 ) )
            {
            // InternalQiraa.g:1897:1: ( ( rule__Person__EsmAssignment_1_1 ) )
            // InternalQiraa.g:1898:2: ( rule__Person__EsmAssignment_1_1 )
            {
             before(grammarAccess.getPersonAccess().getEsmAssignment_1_1()); 
            // InternalQiraa.g:1899:2: ( rule__Person__EsmAssignment_1_1 )
            // InternalQiraa.g:1899:3: rule__Person__EsmAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__EsmAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getEsmAssignment_1_1()); 

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
    // $ANTLR end "rule__Person__Group_1__1__Impl"


    // $ANTLR start "rule__Person__Group_2__0"
    // InternalQiraa.g:1908:1: rule__Person__Group_2__0 : rule__Person__Group_2__0__Impl rule__Person__Group_2__1 ;
    public final void rule__Person__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1912:1: ( rule__Person__Group_2__0__Impl rule__Person__Group_2__1 )
            // InternalQiraa.g:1913:2: rule__Person__Group_2__0__Impl rule__Person__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Person__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_2__1();

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
    // $ANTLR end "rule__Person__Group_2__0"


    // $ANTLR start "rule__Person__Group_2__0__Impl"
    // InternalQiraa.g:1920:1: rule__Person__Group_2__0__Impl : ( '\\u0644\\u0642\\u0628\\u0647' ) ;
    public final void rule__Person__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1924:1: ( ( '\\u0644\\u0642\\u0628\\u0647' ) )
            // InternalQiraa.g:1925:1: ( '\\u0644\\u0642\\u0628\\u0647' )
            {
            // InternalQiraa.g:1925:1: ( '\\u0644\\u0642\\u0628\\u0647' )
            // InternalQiraa.g:1926:2: '\\u0644\\u0642\\u0628\\u0647'
            {
             before(grammarAccess.getPersonAccess().getArabicLetterLamArabicLetterQafArabicLetterBehArabicLetterHehKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getArabicLetterLamArabicLetterQafArabicLetterBehArabicLetterHehKeyword_2_0()); 

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
    // $ANTLR end "rule__Person__Group_2__0__Impl"


    // $ANTLR start "rule__Person__Group_2__1"
    // InternalQiraa.g:1935:1: rule__Person__Group_2__1 : rule__Person__Group_2__1__Impl ;
    public final void rule__Person__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1939:1: ( rule__Person__Group_2__1__Impl )
            // InternalQiraa.g:1940:2: rule__Person__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group_2__1__Impl();

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
    // $ANTLR end "rule__Person__Group_2__1"


    // $ANTLR start "rule__Person__Group_2__1__Impl"
    // InternalQiraa.g:1946:1: rule__Person__Group_2__1__Impl : ( ( rule__Person__LakabAssignment_2_1 ) ) ;
    public final void rule__Person__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1950:1: ( ( ( rule__Person__LakabAssignment_2_1 ) ) )
            // InternalQiraa.g:1951:1: ( ( rule__Person__LakabAssignment_2_1 ) )
            {
            // InternalQiraa.g:1951:1: ( ( rule__Person__LakabAssignment_2_1 ) )
            // InternalQiraa.g:1952:2: ( rule__Person__LakabAssignment_2_1 )
            {
             before(grammarAccess.getPersonAccess().getLakabAssignment_2_1()); 
            // InternalQiraa.g:1953:2: ( rule__Person__LakabAssignment_2_1 )
            // InternalQiraa.g:1953:3: rule__Person__LakabAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__LakabAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getLakabAssignment_2_1()); 

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
    // $ANTLR end "rule__Person__Group_2__1__Impl"


    // $ANTLR start "rule__Person__Group_3__0"
    // InternalQiraa.g:1962:1: rule__Person__Group_3__0 : rule__Person__Group_3__0__Impl rule__Person__Group_3__1 ;
    public final void rule__Person__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1966:1: ( rule__Person__Group_3__0__Impl rule__Person__Group_3__1 )
            // InternalQiraa.g:1967:2: rule__Person__Group_3__0__Impl rule__Person__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Person__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_3__1();

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
    // $ANTLR end "rule__Person__Group_3__0"


    // $ANTLR start "rule__Person__Group_3__0__Impl"
    // InternalQiraa.g:1974:1: rule__Person__Group_3__0__Impl : ( '\\u062A\\u0648\\u0641\\u064A' ) ;
    public final void rule__Person__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1978:1: ( ( '\\u062A\\u0648\\u0641\\u064A' ) )
            // InternalQiraa.g:1979:1: ( '\\u062A\\u0648\\u0641\\u064A' )
            {
            // InternalQiraa.g:1979:1: ( '\\u062A\\u0648\\u0641\\u064A' )
            // InternalQiraa.g:1980:2: '\\u062A\\u0648\\u0641\\u064A'
            {
             before(grammarAccess.getPersonAccess().getArabicLetterTehArabicLetterWawArabicLetterFehArabicLetterYehKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getArabicLetterTehArabicLetterWawArabicLetterFehArabicLetterYehKeyword_3_0()); 

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
    // $ANTLR end "rule__Person__Group_3__0__Impl"


    // $ANTLR start "rule__Person__Group_3__1"
    // InternalQiraa.g:1989:1: rule__Person__Group_3__1 : rule__Person__Group_3__1__Impl ;
    public final void rule__Person__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1993:1: ( rule__Person__Group_3__1__Impl )
            // InternalQiraa.g:1994:2: rule__Person__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group_3__1__Impl();

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
    // $ANTLR end "rule__Person__Group_3__1"


    // $ANTLR start "rule__Person__Group_3__1__Impl"
    // InternalQiraa.g:2000:1: rule__Person__Group_3__1__Impl : ( ( rule__Person__TowofiaAssignment_3_1 ) ) ;
    public final void rule__Person__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2004:1: ( ( ( rule__Person__TowofiaAssignment_3_1 ) ) )
            // InternalQiraa.g:2005:1: ( ( rule__Person__TowofiaAssignment_3_1 ) )
            {
            // InternalQiraa.g:2005:1: ( ( rule__Person__TowofiaAssignment_3_1 ) )
            // InternalQiraa.g:2006:2: ( rule__Person__TowofiaAssignment_3_1 )
            {
             before(grammarAccess.getPersonAccess().getTowofiaAssignment_3_1()); 
            // InternalQiraa.g:2007:2: ( rule__Person__TowofiaAssignment_3_1 )
            // InternalQiraa.g:2007:3: rule__Person__TowofiaAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__TowofiaAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getTowofiaAssignment_3_1()); 

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
    // $ANTLR end "rule__Person__Group_3__1__Impl"


    // $ANTLR start "rule__Douaa__Group__0"
    // InternalQiraa.g:2016:1: rule__Douaa__Group__0 : rule__Douaa__Group__0__Impl rule__Douaa__Group__1 ;
    public final void rule__Douaa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2020:1: ( rule__Douaa__Group__0__Impl rule__Douaa__Group__1 )
            // InternalQiraa.g:2021:2: rule__Douaa__Group__0__Impl rule__Douaa__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Douaa__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Douaa__Group__1();

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
    // $ANTLR end "rule__Douaa__Group__0"


    // $ANTLR start "rule__Douaa__Group__0__Impl"
    // InternalQiraa.g:2028:1: rule__Douaa__Group__0__Impl : ( ( rule__Douaa__DAssignment_0 ) ) ;
    public final void rule__Douaa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2032:1: ( ( ( rule__Douaa__DAssignment_0 ) ) )
            // InternalQiraa.g:2033:1: ( ( rule__Douaa__DAssignment_0 ) )
            {
            // InternalQiraa.g:2033:1: ( ( rule__Douaa__DAssignment_0 ) )
            // InternalQiraa.g:2034:2: ( rule__Douaa__DAssignment_0 )
            {
             before(grammarAccess.getDouaaAccess().getDAssignment_0()); 
            // InternalQiraa.g:2035:2: ( rule__Douaa__DAssignment_0 )
            // InternalQiraa.g:2035:3: rule__Douaa__DAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Douaa__DAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDouaaAccess().getDAssignment_0()); 

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
    // $ANTLR end "rule__Douaa__Group__0__Impl"


    // $ANTLR start "rule__Douaa__Group__1"
    // InternalQiraa.g:2043:1: rule__Douaa__Group__1 : rule__Douaa__Group__1__Impl ;
    public final void rule__Douaa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2047:1: ( rule__Douaa__Group__1__Impl )
            // InternalQiraa.g:2048:2: rule__Douaa__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Douaa__Group__1__Impl();

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
    // $ANTLR end "rule__Douaa__Group__1"


    // $ANTLR start "rule__Douaa__Group__1__Impl"
    // InternalQiraa.g:2054:1: rule__Douaa__Group__1__Impl : ( '\\u0627\\u0644\\u0644\\u0647' ) ;
    public final void rule__Douaa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2058:1: ( ( '\\u0627\\u0644\\u0644\\u0647' ) )
            // InternalQiraa.g:2059:1: ( '\\u0627\\u0644\\u0644\\u0647' )
            {
            // InternalQiraa.g:2059:1: ( '\\u0627\\u0644\\u0644\\u0647' )
            // InternalQiraa.g:2060:2: '\\u0627\\u0644\\u0644\\u0647'
            {
             before(grammarAccess.getDouaaAccess().getArabicLetterAlefArabicLetterLamArabicLetterLamArabicLetterHehKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDouaaAccess().getArabicLetterAlefArabicLetterLamArabicLetterLamArabicLetterHehKeyword_1()); 

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
    // $ANTLR end "rule__Douaa__Group__1__Impl"


    // $ANTLR start "rule__IMAM__Group__0"
    // InternalQiraa.g:2070:1: rule__IMAM__Group__0 : rule__IMAM__Group__0__Impl rule__IMAM__Group__1 ;
    public final void rule__IMAM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2074:1: ( rule__IMAM__Group__0__Impl rule__IMAM__Group__1 )
            // InternalQiraa.g:2075:2: rule__IMAM__Group__0__Impl rule__IMAM__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__IMAM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IMAM__Group__1();

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
    // $ANTLR end "rule__IMAM__Group__0"


    // $ANTLR start "rule__IMAM__Group__0__Impl"
    // InternalQiraa.g:2082:1: rule__IMAM__Group__0__Impl : ( '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' ) ;
    public final void rule__IMAM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2086:1: ( ( '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' ) )
            // InternalQiraa.g:2087:1: ( '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' )
            {
            // InternalQiraa.g:2087:1: ( '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' )
            // InternalQiraa.g:2088:2: '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645'
            {
             before(grammarAccess.getIMAMAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaBelowArabicLetterMeemArabicLetterAlefArabicLetterMeemKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getIMAMAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaBelowArabicLetterMeemArabicLetterAlefArabicLetterMeemKeyword_0()); 

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
    // $ANTLR end "rule__IMAM__Group__0__Impl"


    // $ANTLR start "rule__IMAM__Group__1"
    // InternalQiraa.g:2097:1: rule__IMAM__Group__1 : rule__IMAM__Group__1__Impl rule__IMAM__Group__2 ;
    public final void rule__IMAM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2101:1: ( rule__IMAM__Group__1__Impl rule__IMAM__Group__2 )
            // InternalQiraa.g:2102:2: rule__IMAM__Group__1__Impl rule__IMAM__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__IMAM__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IMAM__Group__2();

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
    // $ANTLR end "rule__IMAM__Group__1"


    // $ANTLR start "rule__IMAM__Group__1__Impl"
    // InternalQiraa.g:2109:1: rule__IMAM__Group__1__Impl : ( rulePerson ) ;
    public final void rule__IMAM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2113:1: ( ( rulePerson ) )
            // InternalQiraa.g:2114:1: ( rulePerson )
            {
            // InternalQiraa.g:2114:1: ( rulePerson )
            // InternalQiraa.g:2115:2: rulePerson
            {
             before(grammarAccess.getIMAMAccess().getPersonParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getIMAMAccess().getPersonParserRuleCall_1()); 

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
    // $ANTLR end "rule__IMAM__Group__1__Impl"


    // $ANTLR start "rule__IMAM__Group__2"
    // InternalQiraa.g:2124:1: rule__IMAM__Group__2 : rule__IMAM__Group__2__Impl ;
    public final void rule__IMAM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2128:1: ( rule__IMAM__Group__2__Impl )
            // InternalQiraa.g:2129:2: rule__IMAM__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IMAM__Group__2__Impl();

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
    // $ANTLR end "rule__IMAM__Group__2"


    // $ANTLR start "rule__IMAM__Group__2__Impl"
    // InternalQiraa.g:2135:1: rule__IMAM__Group__2__Impl : ( ruleDouaa ) ;
    public final void rule__IMAM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2139:1: ( ( ruleDouaa ) )
            // InternalQiraa.g:2140:1: ( ruleDouaa )
            {
            // InternalQiraa.g:2140:1: ( ruleDouaa )
            // InternalQiraa.g:2141:2: ruleDouaa
            {
             before(grammarAccess.getIMAMAccess().getDouaaParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleDouaa();

            state._fsp--;

             after(grammarAccess.getIMAMAccess().getDouaaParserRuleCall_2()); 

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
    // $ANTLR end "rule__IMAM__Group__2__Impl"


    // $ANTLR start "rule__Qaree__Group__0"
    // InternalQiraa.g:2151:1: rule__Qaree__Group__0 : rule__Qaree__Group__0__Impl rule__Qaree__Group__1 ;
    public final void rule__Qaree__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2155:1: ( rule__Qaree__Group__0__Impl rule__Qaree__Group__1 )
            // InternalQiraa.g:2156:2: rule__Qaree__Group__0__Impl rule__Qaree__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Qaree__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qaree__Group__1();

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
    // $ANTLR end "rule__Qaree__Group__0"


    // $ANTLR start "rule__Qaree__Group__0__Impl"
    // InternalQiraa.g:2163:1: rule__Qaree__Group__0__Impl : ( '\\u0642\\u0627\\u0631\\u0626' ) ;
    public final void rule__Qaree__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2167:1: ( ( '\\u0642\\u0627\\u0631\\u0626' ) )
            // InternalQiraa.g:2168:1: ( '\\u0642\\u0627\\u0631\\u0626' )
            {
            // InternalQiraa.g:2168:1: ( '\\u0642\\u0627\\u0631\\u0626' )
            // InternalQiraa.g:2169:2: '\\u0642\\u0627\\u0631\\u0626'
            {
             before(grammarAccess.getQareeAccess().getArabicLetterQafArabicLetterAlefArabicLetterRehArabicLetterYehWithHamzaAboveKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getQareeAccess().getArabicLetterQafArabicLetterAlefArabicLetterRehArabicLetterYehWithHamzaAboveKeyword_0()); 

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
    // $ANTLR end "rule__Qaree__Group__0__Impl"


    // $ANTLR start "rule__Qaree__Group__1"
    // InternalQiraa.g:2178:1: rule__Qaree__Group__1 : rule__Qaree__Group__1__Impl ;
    public final void rule__Qaree__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2182:1: ( rule__Qaree__Group__1__Impl )
            // InternalQiraa.g:2183:2: rule__Qaree__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qaree__Group__1__Impl();

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
    // $ANTLR end "rule__Qaree__Group__1"


    // $ANTLR start "rule__Qaree__Group__1__Impl"
    // InternalQiraa.g:2189:1: rule__Qaree__Group__1__Impl : ( rulePerson ) ;
    public final void rule__Qaree__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2193:1: ( ( rulePerson ) )
            // InternalQiraa.g:2194:1: ( rulePerson )
            {
            // InternalQiraa.g:2194:1: ( rulePerson )
            // InternalQiraa.g:2195:2: rulePerson
            {
             before(grammarAccess.getQareeAccess().getPersonParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getQareeAccess().getPersonParserRuleCall_1()); 

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
    // $ANTLR end "rule__Qaree__Group__1__Impl"


    // $ANTLR start "rule__Rawee__Group__0"
    // InternalQiraa.g:2205:1: rule__Rawee__Group__0 : rule__Rawee__Group__0__Impl rule__Rawee__Group__1 ;
    public final void rule__Rawee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2209:1: ( rule__Rawee__Group__0__Impl rule__Rawee__Group__1 )
            // InternalQiraa.g:2210:2: rule__Rawee__Group__0__Impl rule__Rawee__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Rawee__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rawee__Group__1();

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
    // $ANTLR end "rule__Rawee__Group__0"


    // $ANTLR start "rule__Rawee__Group__0__Impl"
    // InternalQiraa.g:2217:1: rule__Rawee__Group__0__Impl : ( '\\u0631\\u0627\\u0648' ) ;
    public final void rule__Rawee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2221:1: ( ( '\\u0631\\u0627\\u0648' ) )
            // InternalQiraa.g:2222:1: ( '\\u0631\\u0627\\u0648' )
            {
            // InternalQiraa.g:2222:1: ( '\\u0631\\u0627\\u0648' )
            // InternalQiraa.g:2223:2: '\\u0631\\u0627\\u0648'
            {
             before(grammarAccess.getRaweeAccess().getArabicLetterRehArabicLetterAlefArabicLetterWawKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRaweeAccess().getArabicLetterRehArabicLetterAlefArabicLetterWawKeyword_0()); 

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
    // $ANTLR end "rule__Rawee__Group__0__Impl"


    // $ANTLR start "rule__Rawee__Group__1"
    // InternalQiraa.g:2232:1: rule__Rawee__Group__1 : rule__Rawee__Group__1__Impl rule__Rawee__Group__2 ;
    public final void rule__Rawee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2236:1: ( rule__Rawee__Group__1__Impl rule__Rawee__Group__2 )
            // InternalQiraa.g:2237:2: rule__Rawee__Group__1__Impl rule__Rawee__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Rawee__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rawee__Group__2();

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
    // $ANTLR end "rule__Rawee__Group__1"


    // $ANTLR start "rule__Rawee__Group__1__Impl"
    // InternalQiraa.g:2244:1: rule__Rawee__Group__1__Impl : ( rulePerson ) ;
    public final void rule__Rawee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2248:1: ( ( rulePerson ) )
            // InternalQiraa.g:2249:1: ( rulePerson )
            {
            // InternalQiraa.g:2249:1: ( rulePerson )
            // InternalQiraa.g:2250:2: rulePerson
            {
             before(grammarAccess.getRaweeAccess().getPersonParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getRaweeAccess().getPersonParserRuleCall_1()); 

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
    // $ANTLR end "rule__Rawee__Group__1__Impl"


    // $ANTLR start "rule__Rawee__Group__2"
    // InternalQiraa.g:2259:1: rule__Rawee__Group__2 : rule__Rawee__Group__2__Impl rule__Rawee__Group__3 ;
    public final void rule__Rawee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2263:1: ( rule__Rawee__Group__2__Impl rule__Rawee__Group__3 )
            // InternalQiraa.g:2264:2: rule__Rawee__Group__2__Impl rule__Rawee__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Rawee__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rawee__Group__3();

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
    // $ANTLR end "rule__Rawee__Group__2"


    // $ANTLR start "rule__Rawee__Group__2__Impl"
    // InternalQiraa.g:2271:1: rule__Rawee__Group__2__Impl : ( '\\u0639\\u0646' ) ;
    public final void rule__Rawee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2275:1: ( ( '\\u0639\\u0646' ) )
            // InternalQiraa.g:2276:1: ( '\\u0639\\u0646' )
            {
            // InternalQiraa.g:2276:1: ( '\\u0639\\u0646' )
            // InternalQiraa.g:2277:2: '\\u0639\\u0646'
            {
             before(grammarAccess.getRaweeAccess().getArabicLetterAinArabicLetterNoonKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRaweeAccess().getArabicLetterAinArabicLetterNoonKeyword_2()); 

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
    // $ANTLR end "rule__Rawee__Group__2__Impl"


    // $ANTLR start "rule__Rawee__Group__3"
    // InternalQiraa.g:2286:1: rule__Rawee__Group__3 : rule__Rawee__Group__3__Impl ;
    public final void rule__Rawee__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2290:1: ( rule__Rawee__Group__3__Impl )
            // InternalQiraa.g:2291:2: rule__Rawee__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rawee__Group__3__Impl();

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
    // $ANTLR end "rule__Rawee__Group__3"


    // $ANTLR start "rule__Rawee__Group__3__Impl"
    // InternalQiraa.g:2297:1: rule__Rawee__Group__3__Impl : ( ( rule__Rawee__QareeAssignment_3 ) ) ;
    public final void rule__Rawee__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2301:1: ( ( ( rule__Rawee__QareeAssignment_3 ) ) )
            // InternalQiraa.g:2302:1: ( ( rule__Rawee__QareeAssignment_3 ) )
            {
            // InternalQiraa.g:2302:1: ( ( rule__Rawee__QareeAssignment_3 ) )
            // InternalQiraa.g:2303:2: ( rule__Rawee__QareeAssignment_3 )
            {
             before(grammarAccess.getRaweeAccess().getQareeAssignment_3()); 
            // InternalQiraa.g:2304:2: ( rule__Rawee__QareeAssignment_3 )
            // InternalQiraa.g:2304:3: rule__Rawee__QareeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rawee__QareeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRaweeAccess().getQareeAssignment_3()); 

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
    // $ANTLR end "rule__Rawee__Group__3__Impl"


    // $ANTLR start "rule__Tareek__Group__0"
    // InternalQiraa.g:2313:1: rule__Tareek__Group__0 : rule__Tareek__Group__0__Impl rule__Tareek__Group__1 ;
    public final void rule__Tareek__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2317:1: ( rule__Tareek__Group__0__Impl rule__Tareek__Group__1 )
            // InternalQiraa.g:2318:2: rule__Tareek__Group__0__Impl rule__Tareek__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Tareek__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tareek__Group__1();

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
    // $ANTLR end "rule__Tareek__Group__0"


    // $ANTLR start "rule__Tareek__Group__0__Impl"
    // InternalQiraa.g:2325:1: rule__Tareek__Group__0__Impl : ( '\\u0637\\u0631\\u064A\\u0642' ) ;
    public final void rule__Tareek__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2329:1: ( ( '\\u0637\\u0631\\u064A\\u0642' ) )
            // InternalQiraa.g:2330:1: ( '\\u0637\\u0631\\u064A\\u0642' )
            {
            // InternalQiraa.g:2330:1: ( '\\u0637\\u0631\\u064A\\u0642' )
            // InternalQiraa.g:2331:2: '\\u0637\\u0631\\u064A\\u0642'
            {
             before(grammarAccess.getTareekAccess().getArabicLetterTahArabicLetterRehArabicLetterYehArabicLetterQafKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTareekAccess().getArabicLetterTahArabicLetterRehArabicLetterYehArabicLetterQafKeyword_0()); 

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
    // $ANTLR end "rule__Tareek__Group__0__Impl"


    // $ANTLR start "rule__Tareek__Group__1"
    // InternalQiraa.g:2340:1: rule__Tareek__Group__1 : rule__Tareek__Group__1__Impl rule__Tareek__Group__2 ;
    public final void rule__Tareek__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2344:1: ( rule__Tareek__Group__1__Impl rule__Tareek__Group__2 )
            // InternalQiraa.g:2345:2: rule__Tareek__Group__1__Impl rule__Tareek__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Tareek__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tareek__Group__2();

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
    // $ANTLR end "rule__Tareek__Group__1"


    // $ANTLR start "rule__Tareek__Group__1__Impl"
    // InternalQiraa.g:2352:1: rule__Tareek__Group__1__Impl : ( '\\u062A\\u0644\\u0627\\u0648\\u0629' ) ;
    public final void rule__Tareek__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2356:1: ( ( '\\u062A\\u0644\\u0627\\u0648\\u0629' ) )
            // InternalQiraa.g:2357:1: ( '\\u062A\\u0644\\u0627\\u0648\\u0629' )
            {
            // InternalQiraa.g:2357:1: ( '\\u062A\\u0644\\u0627\\u0648\\u0629' )
            // InternalQiraa.g:2358:2: '\\u062A\\u0644\\u0627\\u0648\\u0629'
            {
             before(grammarAccess.getTareekAccess().getArabicLetterTehArabicLetterLamArabicLetterAlefArabicLetterWawArabicLetterTehMarbutaKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTareekAccess().getArabicLetterTehArabicLetterLamArabicLetterAlefArabicLetterWawArabicLetterTehMarbutaKeyword_1()); 

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
    // $ANTLR end "rule__Tareek__Group__1__Impl"


    // $ANTLR start "rule__Tareek__Group__2"
    // InternalQiraa.g:2367:1: rule__Tareek__Group__2 : rule__Tareek__Group__2__Impl rule__Tareek__Group__3 ;
    public final void rule__Tareek__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2371:1: ( rule__Tareek__Group__2__Impl rule__Tareek__Group__3 )
            // InternalQiraa.g:2372:2: rule__Tareek__Group__2__Impl rule__Tareek__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Tareek__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tareek__Group__3();

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
    // $ANTLR end "rule__Tareek__Group__2"


    // $ANTLR start "rule__Tareek__Group__2__Impl"
    // InternalQiraa.g:2379:1: rule__Tareek__Group__2__Impl : ( ( rule__Tareek__NameAssignment_2 ) ) ;
    public final void rule__Tareek__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2383:1: ( ( ( rule__Tareek__NameAssignment_2 ) ) )
            // InternalQiraa.g:2384:1: ( ( rule__Tareek__NameAssignment_2 ) )
            {
            // InternalQiraa.g:2384:1: ( ( rule__Tareek__NameAssignment_2 ) )
            // InternalQiraa.g:2385:2: ( rule__Tareek__NameAssignment_2 )
            {
             before(grammarAccess.getTareekAccess().getNameAssignment_2()); 
            // InternalQiraa.g:2386:2: ( rule__Tareek__NameAssignment_2 )
            // InternalQiraa.g:2386:3: rule__Tareek__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Tareek__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTareekAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Tareek__Group__2__Impl"


    // $ANTLR start "rule__Tareek__Group__3"
    // InternalQiraa.g:2394:1: rule__Tareek__Group__3 : rule__Tareek__Group__3__Impl ;
    public final void rule__Tareek__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2398:1: ( rule__Tareek__Group__3__Impl )
            // InternalQiraa.g:2399:2: rule__Tareek__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tareek__Group__3__Impl();

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
    // $ANTLR end "rule__Tareek__Group__3"


    // $ANTLR start "rule__Tareek__Group__3__Impl"
    // InternalQiraa.g:2405:1: rule__Tareek__Group__3__Impl : ( ( rule__Tareek__Alternatives_3 ) ) ;
    public final void rule__Tareek__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2409:1: ( ( ( rule__Tareek__Alternatives_3 ) ) )
            // InternalQiraa.g:2410:1: ( ( rule__Tareek__Alternatives_3 ) )
            {
            // InternalQiraa.g:2410:1: ( ( rule__Tareek__Alternatives_3 ) )
            // InternalQiraa.g:2411:2: ( rule__Tareek__Alternatives_3 )
            {
             before(grammarAccess.getTareekAccess().getAlternatives_3()); 
            // InternalQiraa.g:2412:2: ( rule__Tareek__Alternatives_3 )
            // InternalQiraa.g:2412:3: rule__Tareek__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Tareek__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getTareekAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Tareek__Group__3__Impl"


    // $ANTLR start "rule__Tareek__Group_3_0__0"
    // InternalQiraa.g:2421:1: rule__Tareek__Group_3_0__0 : rule__Tareek__Group_3_0__0__Impl rule__Tareek__Group_3_0__1 ;
    public final void rule__Tareek__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2425:1: ( rule__Tareek__Group_3_0__0__Impl rule__Tareek__Group_3_0__1 )
            // InternalQiraa.g:2426:2: rule__Tareek__Group_3_0__0__Impl rule__Tareek__Group_3_0__1
            {
            pushFollow(FOLLOW_32);
            rule__Tareek__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tareek__Group_3_0__1();

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
    // $ANTLR end "rule__Tareek__Group_3_0__0"


    // $ANTLR start "rule__Tareek__Group_3_0__0__Impl"
    // InternalQiraa.g:2433:1: rule__Tareek__Group_3_0__0__Impl : ( ( rule__Tareek__SimpleAssignment_3_0_0 ) ) ;
    public final void rule__Tareek__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2437:1: ( ( ( rule__Tareek__SimpleAssignment_3_0_0 ) ) )
            // InternalQiraa.g:2438:1: ( ( rule__Tareek__SimpleAssignment_3_0_0 ) )
            {
            // InternalQiraa.g:2438:1: ( ( rule__Tareek__SimpleAssignment_3_0_0 ) )
            // InternalQiraa.g:2439:2: ( rule__Tareek__SimpleAssignment_3_0_0 )
            {
             before(grammarAccess.getTareekAccess().getSimpleAssignment_3_0_0()); 
            // InternalQiraa.g:2440:2: ( rule__Tareek__SimpleAssignment_3_0_0 )
            // InternalQiraa.g:2440:3: rule__Tareek__SimpleAssignment_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Tareek__SimpleAssignment_3_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTareekAccess().getSimpleAssignment_3_0_0()); 

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
    // $ANTLR end "rule__Tareek__Group_3_0__0__Impl"


    // $ANTLR start "rule__Tareek__Group_3_0__1"
    // InternalQiraa.g:2448:1: rule__Tareek__Group_3_0__1 : rule__Tareek__Group_3_0__1__Impl rule__Tareek__Group_3_0__2 ;
    public final void rule__Tareek__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2452:1: ( rule__Tareek__Group_3_0__1__Impl rule__Tareek__Group_3_0__2 )
            // InternalQiraa.g:2453:2: rule__Tareek__Group_3_0__1__Impl rule__Tareek__Group_3_0__2
            {
            pushFollow(FOLLOW_5);
            rule__Tareek__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tareek__Group_3_0__2();

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
    // $ANTLR end "rule__Tareek__Group_3_0__1"


    // $ANTLR start "rule__Tareek__Group_3_0__1__Impl"
    // InternalQiraa.g:2460:1: rule__Tareek__Group_3_0__1__Impl : ( '\\u0644' ) ;
    public final void rule__Tareek__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2464:1: ( ( '\\u0644' ) )
            // InternalQiraa.g:2465:1: ( '\\u0644' )
            {
            // InternalQiraa.g:2465:1: ( '\\u0644' )
            // InternalQiraa.g:2466:2: '\\u0644'
            {
             before(grammarAccess.getTareekAccess().getArabicLetterLamKeyword_3_0_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTareekAccess().getArabicLetterLamKeyword_3_0_1()); 

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
    // $ANTLR end "rule__Tareek__Group_3_0__1__Impl"


    // $ANTLR start "rule__Tareek__Group_3_0__2"
    // InternalQiraa.g:2475:1: rule__Tareek__Group_3_0__2 : rule__Tareek__Group_3_0__2__Impl ;
    public final void rule__Tareek__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2479:1: ( rule__Tareek__Group_3_0__2__Impl )
            // InternalQiraa.g:2480:2: rule__Tareek__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tareek__Group_3_0__2__Impl();

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
    // $ANTLR end "rule__Tareek__Group_3_0__2"


    // $ANTLR start "rule__Tareek__Group_3_0__2__Impl"
    // InternalQiraa.g:2486:1: rule__Tareek__Group_3_0__2__Impl : ( ( rule__Tareek__RefAssignment_3_0_2 ) ) ;
    public final void rule__Tareek__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2490:1: ( ( ( rule__Tareek__RefAssignment_3_0_2 ) ) )
            // InternalQiraa.g:2491:1: ( ( rule__Tareek__RefAssignment_3_0_2 ) )
            {
            // InternalQiraa.g:2491:1: ( ( rule__Tareek__RefAssignment_3_0_2 ) )
            // InternalQiraa.g:2492:2: ( rule__Tareek__RefAssignment_3_0_2 )
            {
             before(grammarAccess.getTareekAccess().getRefAssignment_3_0_2()); 
            // InternalQiraa.g:2493:2: ( rule__Tareek__RefAssignment_3_0_2 )
            // InternalQiraa.g:2493:3: rule__Tareek__RefAssignment_3_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Tareek__RefAssignment_3_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTareekAccess().getRefAssignment_3_0_2()); 

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
    // $ANTLR end "rule__Tareek__Group_3_0__2__Impl"


    // $ANTLR start "rule__Tareek__Group_3_1__0"
    // InternalQiraa.g:2502:1: rule__Tareek__Group_3_1__0 : rule__Tareek__Group_3_1__0__Impl rule__Tareek__Group_3_1__1 ;
    public final void rule__Tareek__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2506:1: ( rule__Tareek__Group_3_1__0__Impl rule__Tareek__Group_3_1__1 )
            // InternalQiraa.g:2507:2: rule__Tareek__Group_3_1__0__Impl rule__Tareek__Group_3_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Tareek__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tareek__Group_3_1__1();

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
    // $ANTLR end "rule__Tareek__Group_3_1__0"


    // $ANTLR start "rule__Tareek__Group_3_1__0__Impl"
    // InternalQiraa.g:2514:1: rule__Tareek__Group_3_1__0__Impl : ( ( rule__Tareek__Group_3_1_0__0 ) ) ;
    public final void rule__Tareek__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2518:1: ( ( ( rule__Tareek__Group_3_1_0__0 ) ) )
            // InternalQiraa.g:2519:1: ( ( rule__Tareek__Group_3_1_0__0 ) )
            {
            // InternalQiraa.g:2519:1: ( ( rule__Tareek__Group_3_1_0__0 ) )
            // InternalQiraa.g:2520:2: ( rule__Tareek__Group_3_1_0__0 )
            {
             before(grammarAccess.getTareekAccess().getGroup_3_1_0()); 
            // InternalQiraa.g:2521:2: ( rule__Tareek__Group_3_1_0__0 )
            // InternalQiraa.g:2521:3: rule__Tareek__Group_3_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Tareek__Group_3_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getTareekAccess().getGroup_3_1_0()); 

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
    // $ANTLR end "rule__Tareek__Group_3_1__0__Impl"


    // $ANTLR start "rule__Tareek__Group_3_1__1"
    // InternalQiraa.g:2529:1: rule__Tareek__Group_3_1__1 : rule__Tareek__Group_3_1__1__Impl ;
    public final void rule__Tareek__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2533:1: ( rule__Tareek__Group_3_1__1__Impl )
            // InternalQiraa.g:2534:2: rule__Tareek__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tareek__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Tareek__Group_3_1__1"


    // $ANTLR start "rule__Tareek__Group_3_1__1__Impl"
    // InternalQiraa.g:2540:1: rule__Tareek__Group_3_1__1__Impl : ( ( ( rule__Tareek__RefsAssignment_3_1_1 ) ) ( ( rule__Tareek__RefsAssignment_3_1_1 )* ) ) ;
    public final void rule__Tareek__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2544:1: ( ( ( ( rule__Tareek__RefsAssignment_3_1_1 ) ) ( ( rule__Tareek__RefsAssignment_3_1_1 )* ) ) )
            // InternalQiraa.g:2545:1: ( ( ( rule__Tareek__RefsAssignment_3_1_1 ) ) ( ( rule__Tareek__RefsAssignment_3_1_1 )* ) )
            {
            // InternalQiraa.g:2545:1: ( ( ( rule__Tareek__RefsAssignment_3_1_1 ) ) ( ( rule__Tareek__RefsAssignment_3_1_1 )* ) )
            // InternalQiraa.g:2546:2: ( ( rule__Tareek__RefsAssignment_3_1_1 ) ) ( ( rule__Tareek__RefsAssignment_3_1_1 )* )
            {
            // InternalQiraa.g:2546:2: ( ( rule__Tareek__RefsAssignment_3_1_1 ) )
            // InternalQiraa.g:2547:3: ( rule__Tareek__RefsAssignment_3_1_1 )
            {
             before(grammarAccess.getTareekAccess().getRefsAssignment_3_1_1()); 
            // InternalQiraa.g:2548:3: ( rule__Tareek__RefsAssignment_3_1_1 )
            // InternalQiraa.g:2548:4: rule__Tareek__RefsAssignment_3_1_1
            {
            pushFollow(FOLLOW_33);
            rule__Tareek__RefsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTareekAccess().getRefsAssignment_3_1_1()); 

            }

            // InternalQiraa.g:2551:2: ( ( rule__Tareek__RefsAssignment_3_1_1 )* )
            // InternalQiraa.g:2552:3: ( rule__Tareek__RefsAssignment_3_1_1 )*
            {
             before(grammarAccess.getTareekAccess().getRefsAssignment_3_1_1()); 
            // InternalQiraa.g:2553:3: ( rule__Tareek__RefsAssignment_3_1_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_KALEMAH) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalQiraa.g:2553:4: rule__Tareek__RefsAssignment_3_1_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Tareek__RefsAssignment_3_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTareekAccess().getRefsAssignment_3_1_1()); 

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
    // $ANTLR end "rule__Tareek__Group_3_1__1__Impl"


    // $ANTLR start "rule__Tareek__Group_3_1_0__0"
    // InternalQiraa.g:2563:1: rule__Tareek__Group_3_1_0__0 : rule__Tareek__Group_3_1_0__0__Impl rule__Tareek__Group_3_1_0__1 ;
    public final void rule__Tareek__Group_3_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2567:1: ( rule__Tareek__Group_3_1_0__0__Impl rule__Tareek__Group_3_1_0__1 )
            // InternalQiraa.g:2568:2: rule__Tareek__Group_3_1_0__0__Impl rule__Tareek__Group_3_1_0__1
            {
            pushFollow(FOLLOW_34);
            rule__Tareek__Group_3_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tareek__Group_3_1_0__1();

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
    // $ANTLR end "rule__Tareek__Group_3_1_0__0"


    // $ANTLR start "rule__Tareek__Group_3_1_0__0__Impl"
    // InternalQiraa.g:2575:1: rule__Tareek__Group_3_1_0__0__Impl : ( ( rule__Tareek__ComplexAssignment_3_1_0_0 ) ) ;
    public final void rule__Tareek__Group_3_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2579:1: ( ( ( rule__Tareek__ComplexAssignment_3_1_0_0 ) ) )
            // InternalQiraa.g:2580:1: ( ( rule__Tareek__ComplexAssignment_3_1_0_0 ) )
            {
            // InternalQiraa.g:2580:1: ( ( rule__Tareek__ComplexAssignment_3_1_0_0 ) )
            // InternalQiraa.g:2581:2: ( rule__Tareek__ComplexAssignment_3_1_0_0 )
            {
             before(grammarAccess.getTareekAccess().getComplexAssignment_3_1_0_0()); 
            // InternalQiraa.g:2582:2: ( rule__Tareek__ComplexAssignment_3_1_0_0 )
            // InternalQiraa.g:2582:3: rule__Tareek__ComplexAssignment_3_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Tareek__ComplexAssignment_3_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTareekAccess().getComplexAssignment_3_1_0_0()); 

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
    // $ANTLR end "rule__Tareek__Group_3_1_0__0__Impl"


    // $ANTLR start "rule__Tareek__Group_3_1_0__1"
    // InternalQiraa.g:2590:1: rule__Tareek__Group_3_1_0__1 : rule__Tareek__Group_3_1_0__1__Impl ;
    public final void rule__Tareek__Group_3_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2594:1: ( rule__Tareek__Group_3_1_0__1__Impl )
            // InternalQiraa.g:2595:2: rule__Tareek__Group_3_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tareek__Group_3_1_0__1__Impl();

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
    // $ANTLR end "rule__Tareek__Group_3_1_0__1"


    // $ANTLR start "rule__Tareek__Group_3_1_0__1__Impl"
    // InternalQiraa.g:2601:1: rule__Tareek__Group_3_1_0__1__Impl : ( '\\u0645\\u0646' ) ;
    public final void rule__Tareek__Group_3_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2605:1: ( ( '\\u0645\\u0646' ) )
            // InternalQiraa.g:2606:1: ( '\\u0645\\u0646' )
            {
            // InternalQiraa.g:2606:1: ( '\\u0645\\u0646' )
            // InternalQiraa.g:2607:2: '\\u0645\\u0646'
            {
             before(grammarAccess.getTareekAccess().getArabicLetterMeemArabicLetterNoonKeyword_3_1_0_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getTareekAccess().getArabicLetterMeemArabicLetterNoonKeyword_3_1_0_1()); 

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
    // $ANTLR end "rule__Tareek__Group_3_1_0__1__Impl"


    // $ANTLR start "rule__Kayd__Group__0"
    // InternalQiraa.g:2617:1: rule__Kayd__Group__0 : rule__Kayd__Group__0__Impl rule__Kayd__Group__1 ;
    public final void rule__Kayd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2621:1: ( rule__Kayd__Group__0__Impl rule__Kayd__Group__1 )
            // InternalQiraa.g:2622:2: rule__Kayd__Group__0__Impl rule__Kayd__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Kayd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kayd__Group__1();

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
    // $ANTLR end "rule__Kayd__Group__0"


    // $ANTLR start "rule__Kayd__Group__0__Impl"
    // InternalQiraa.g:2629:1: rule__Kayd__Group__0__Impl : ( '\\u0642\\u064A\\u062F' ) ;
    public final void rule__Kayd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2633:1: ( ( '\\u0642\\u064A\\u062F' ) )
            // InternalQiraa.g:2634:1: ( '\\u0642\\u064A\\u062F' )
            {
            // InternalQiraa.g:2634:1: ( '\\u0642\\u064A\\u062F' )
            // InternalQiraa.g:2635:2: '\\u0642\\u064A\\u062F'
            {
             before(grammarAccess.getKaydAccess().getArabicLetterQafArabicLetterYehArabicLetterDalKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getKaydAccess().getArabicLetterQafArabicLetterYehArabicLetterDalKeyword_0()); 

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
    // $ANTLR end "rule__Kayd__Group__0__Impl"


    // $ANTLR start "rule__Kayd__Group__1"
    // InternalQiraa.g:2644:1: rule__Kayd__Group__1 : rule__Kayd__Group__1__Impl ;
    public final void rule__Kayd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2648:1: ( rule__Kayd__Group__1__Impl )
            // InternalQiraa.g:2649:2: rule__Kayd__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Kayd__Group__1__Impl();

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
    // $ANTLR end "rule__Kayd__Group__1"


    // $ANTLR start "rule__Kayd__Group__1__Impl"
    // InternalQiraa.g:2655:1: rule__Kayd__Group__1__Impl : ( ( rule__Kayd__NameAssignment_1 ) ) ;
    public final void rule__Kayd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2659:1: ( ( ( rule__Kayd__NameAssignment_1 ) ) )
            // InternalQiraa.g:2660:1: ( ( rule__Kayd__NameAssignment_1 ) )
            {
            // InternalQiraa.g:2660:1: ( ( rule__Kayd__NameAssignment_1 ) )
            // InternalQiraa.g:2661:2: ( rule__Kayd__NameAssignment_1 )
            {
             before(grammarAccess.getKaydAccess().getNameAssignment_1()); 
            // InternalQiraa.g:2662:2: ( rule__Kayd__NameAssignment_1 )
            // InternalQiraa.g:2662:3: rule__Kayd__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Kayd__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKaydAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Kayd__Group__1__Impl"


    // $ANTLR start "rule__Istelah__Group__0"
    // InternalQiraa.g:2671:1: rule__Istelah__Group__0 : rule__Istelah__Group__0__Impl rule__Istelah__Group__1 ;
    public final void rule__Istelah__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2675:1: ( rule__Istelah__Group__0__Impl rule__Istelah__Group__1 )
            // InternalQiraa.g:2676:2: rule__Istelah__Group__0__Impl rule__Istelah__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Istelah__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Istelah__Group__1();

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
    // $ANTLR end "rule__Istelah__Group__0"


    // $ANTLR start "rule__Istelah__Group__0__Impl"
    // InternalQiraa.g:2683:1: rule__Istelah__Group__0__Impl : ( '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ) ;
    public final void rule__Istelah__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2687:1: ( ( '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ) )
            // InternalQiraa.g:2688:1: ( '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' )
            {
            // InternalQiraa.g:2688:1: ( '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' )
            // InternalQiraa.g:2689:2: '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D'
            {
             before(grammarAccess.getIstelahAccess().getArabicLetterAlefArabicLetterSadArabicLetterTahArabicLetterLamArabicLetterAlefArabicLetterHahKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getIstelahAccess().getArabicLetterAlefArabicLetterSadArabicLetterTahArabicLetterLamArabicLetterAlefArabicLetterHahKeyword_0()); 

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
    // $ANTLR end "rule__Istelah__Group__0__Impl"


    // $ANTLR start "rule__Istelah__Group__1"
    // InternalQiraa.g:2698:1: rule__Istelah__Group__1 : rule__Istelah__Group__1__Impl rule__Istelah__Group__2 ;
    public final void rule__Istelah__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2702:1: ( rule__Istelah__Group__1__Impl rule__Istelah__Group__2 )
            // InternalQiraa.g:2703:2: rule__Istelah__Group__1__Impl rule__Istelah__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Istelah__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Istelah__Group__2();

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
    // $ANTLR end "rule__Istelah__Group__1"


    // $ANTLR start "rule__Istelah__Group__1__Impl"
    // InternalQiraa.g:2710:1: rule__Istelah__Group__1__Impl : ( ( rule__Istelah__NameAssignment_1 ) ) ;
    public final void rule__Istelah__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2714:1: ( ( ( rule__Istelah__NameAssignment_1 ) ) )
            // InternalQiraa.g:2715:1: ( ( rule__Istelah__NameAssignment_1 ) )
            {
            // InternalQiraa.g:2715:1: ( ( rule__Istelah__NameAssignment_1 ) )
            // InternalQiraa.g:2716:2: ( rule__Istelah__NameAssignment_1 )
            {
             before(grammarAccess.getIstelahAccess().getNameAssignment_1()); 
            // InternalQiraa.g:2717:2: ( rule__Istelah__NameAssignment_1 )
            // InternalQiraa.g:2717:3: rule__Istelah__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Istelah__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIstelahAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Istelah__Group__1__Impl"


    // $ANTLR start "rule__Istelah__Group__2"
    // InternalQiraa.g:2725:1: rule__Istelah__Group__2 : rule__Istelah__Group__2__Impl rule__Istelah__Group__3 ;
    public final void rule__Istelah__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2729:1: ( rule__Istelah__Group__2__Impl rule__Istelah__Group__3 )
            // InternalQiraa.g:2730:2: rule__Istelah__Group__2__Impl rule__Istelah__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Istelah__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Istelah__Group__3();

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
    // $ANTLR end "rule__Istelah__Group__2"


    // $ANTLR start "rule__Istelah__Group__2__Impl"
    // InternalQiraa.g:2737:1: rule__Istelah__Group__2__Impl : ( '\\u064A\\u0639\\u0646\\u064A' ) ;
    public final void rule__Istelah__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2741:1: ( ( '\\u064A\\u0639\\u0646\\u064A' ) )
            // InternalQiraa.g:2742:1: ( '\\u064A\\u0639\\u0646\\u064A' )
            {
            // InternalQiraa.g:2742:1: ( '\\u064A\\u0639\\u0646\\u064A' )
            // InternalQiraa.g:2743:2: '\\u064A\\u0639\\u0646\\u064A'
            {
             before(grammarAccess.getIstelahAccess().getArabicLetterYehArabicLetterAinArabicLetterNoonArabicLetterYehKeyword_2()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getIstelahAccess().getArabicLetterYehArabicLetterAinArabicLetterNoonArabicLetterYehKeyword_2()); 

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
    // $ANTLR end "rule__Istelah__Group__2__Impl"


    // $ANTLR start "rule__Istelah__Group__3"
    // InternalQiraa.g:2752:1: rule__Istelah__Group__3 : rule__Istelah__Group__3__Impl rule__Istelah__Group__4 ;
    public final void rule__Istelah__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2756:1: ( rule__Istelah__Group__3__Impl rule__Istelah__Group__4 )
            // InternalQiraa.g:2757:2: rule__Istelah__Group__3__Impl rule__Istelah__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__Istelah__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Istelah__Group__4();

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
    // $ANTLR end "rule__Istelah__Group__3"


    // $ANTLR start "rule__Istelah__Group__3__Impl"
    // InternalQiraa.g:2764:1: rule__Istelah__Group__3__Impl : ( ( rule__Istelah__RefsAssignment_3 ) ) ;
    public final void rule__Istelah__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2768:1: ( ( ( rule__Istelah__RefsAssignment_3 ) ) )
            // InternalQiraa.g:2769:1: ( ( rule__Istelah__RefsAssignment_3 ) )
            {
            // InternalQiraa.g:2769:1: ( ( rule__Istelah__RefsAssignment_3 ) )
            // InternalQiraa.g:2770:2: ( rule__Istelah__RefsAssignment_3 )
            {
             before(grammarAccess.getIstelahAccess().getRefsAssignment_3()); 
            // InternalQiraa.g:2771:2: ( rule__Istelah__RefsAssignment_3 )
            // InternalQiraa.g:2771:3: rule__Istelah__RefsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Istelah__RefsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIstelahAccess().getRefsAssignment_3()); 

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
    // $ANTLR end "rule__Istelah__Group__3__Impl"


    // $ANTLR start "rule__Istelah__Group__4"
    // InternalQiraa.g:2779:1: rule__Istelah__Group__4 : rule__Istelah__Group__4__Impl ;
    public final void rule__Istelah__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2783:1: ( rule__Istelah__Group__4__Impl )
            // InternalQiraa.g:2784:2: rule__Istelah__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Istelah__Group__4__Impl();

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
    // $ANTLR end "rule__Istelah__Group__4"


    // $ANTLR start "rule__Istelah__Group__4__Impl"
    // InternalQiraa.g:2790:1: rule__Istelah__Group__4__Impl : ( ( rule__Istelah__Group_4__0 )* ) ;
    public final void rule__Istelah__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2794:1: ( ( ( rule__Istelah__Group_4__0 )* ) )
            // InternalQiraa.g:2795:1: ( ( rule__Istelah__Group_4__0 )* )
            {
            // InternalQiraa.g:2795:1: ( ( rule__Istelah__Group_4__0 )* )
            // InternalQiraa.g:2796:2: ( rule__Istelah__Group_4__0 )*
            {
             before(grammarAccess.getIstelahAccess().getGroup_4()); 
            // InternalQiraa.g:2797:2: ( rule__Istelah__Group_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==57) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalQiraa.g:2797:3: rule__Istelah__Group_4__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Istelah__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getIstelahAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Istelah__Group__4__Impl"


    // $ANTLR start "rule__Istelah__Group_4__0"
    // InternalQiraa.g:2806:1: rule__Istelah__Group_4__0 : rule__Istelah__Group_4__0__Impl rule__Istelah__Group_4__1 ;
    public final void rule__Istelah__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2810:1: ( rule__Istelah__Group_4__0__Impl rule__Istelah__Group_4__1 )
            // InternalQiraa.g:2811:2: rule__Istelah__Group_4__0__Impl rule__Istelah__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Istelah__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Istelah__Group_4__1();

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
    // $ANTLR end "rule__Istelah__Group_4__0"


    // $ANTLR start "rule__Istelah__Group_4__0__Impl"
    // InternalQiraa.g:2818:1: rule__Istelah__Group_4__0__Impl : ( '\\u0648' ) ;
    public final void rule__Istelah__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2822:1: ( ( '\\u0648' ) )
            // InternalQiraa.g:2823:1: ( '\\u0648' )
            {
            // InternalQiraa.g:2823:1: ( '\\u0648' )
            // InternalQiraa.g:2824:2: '\\u0648'
            {
             before(grammarAccess.getIstelahAccess().getArabicLetterWawKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getIstelahAccess().getArabicLetterWawKeyword_4_0()); 

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
    // $ANTLR end "rule__Istelah__Group_4__0__Impl"


    // $ANTLR start "rule__Istelah__Group_4__1"
    // InternalQiraa.g:2833:1: rule__Istelah__Group_4__1 : rule__Istelah__Group_4__1__Impl ;
    public final void rule__Istelah__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2837:1: ( rule__Istelah__Group_4__1__Impl )
            // InternalQiraa.g:2838:2: rule__Istelah__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Istelah__Group_4__1__Impl();

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
    // $ANTLR end "rule__Istelah__Group_4__1"


    // $ANTLR start "rule__Istelah__Group_4__1__Impl"
    // InternalQiraa.g:2844:1: rule__Istelah__Group_4__1__Impl : ( ( rule__Istelah__RefsAssignment_4_1 ) ) ;
    public final void rule__Istelah__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2848:1: ( ( ( rule__Istelah__RefsAssignment_4_1 ) ) )
            // InternalQiraa.g:2849:1: ( ( rule__Istelah__RefsAssignment_4_1 ) )
            {
            // InternalQiraa.g:2849:1: ( ( rule__Istelah__RefsAssignment_4_1 ) )
            // InternalQiraa.g:2850:2: ( rule__Istelah__RefsAssignment_4_1 )
            {
             before(grammarAccess.getIstelahAccess().getRefsAssignment_4_1()); 
            // InternalQiraa.g:2851:2: ( rule__Istelah__RefsAssignment_4_1 )
            // InternalQiraa.g:2851:3: rule__Istelah__RefsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Istelah__RefsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIstelahAccess().getRefsAssignment_4_1()); 

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
    // $ANTLR end "rule__Istelah__Group_4__1__Impl"


    // $ANTLR start "rule__Ramz__Group__0"
    // InternalQiraa.g:2860:1: rule__Ramz__Group__0 : rule__Ramz__Group__0__Impl rule__Ramz__Group__1 ;
    public final void rule__Ramz__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2864:1: ( rule__Ramz__Group__0__Impl rule__Ramz__Group__1 )
            // InternalQiraa.g:2865:2: rule__Ramz__Group__0__Impl rule__Ramz__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Ramz__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ramz__Group__1();

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
    // $ANTLR end "rule__Ramz__Group__0"


    // $ANTLR start "rule__Ramz__Group__0__Impl"
    // InternalQiraa.g:2872:1: rule__Ramz__Group__0__Impl : ( '\\u0631\\u0645\\u0632' ) ;
    public final void rule__Ramz__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2876:1: ( ( '\\u0631\\u0645\\u0632' ) )
            // InternalQiraa.g:2877:1: ( '\\u0631\\u0645\\u0632' )
            {
            // InternalQiraa.g:2877:1: ( '\\u0631\\u0645\\u0632' )
            // InternalQiraa.g:2878:2: '\\u0631\\u0645\\u0632'
            {
             before(grammarAccess.getRamzAccess().getArabicLetterRehArabicLetterMeemArabicLetterZainKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getRamzAccess().getArabicLetterRehArabicLetterMeemArabicLetterZainKeyword_0()); 

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
    // $ANTLR end "rule__Ramz__Group__0__Impl"


    // $ANTLR start "rule__Ramz__Group__1"
    // InternalQiraa.g:2887:1: rule__Ramz__Group__1 : rule__Ramz__Group__1__Impl rule__Ramz__Group__2 ;
    public final void rule__Ramz__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2891:1: ( rule__Ramz__Group__1__Impl rule__Ramz__Group__2 )
            // InternalQiraa.g:2892:2: rule__Ramz__Group__1__Impl rule__Ramz__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Ramz__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ramz__Group__2();

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
    // $ANTLR end "rule__Ramz__Group__1"


    // $ANTLR start "rule__Ramz__Group__1__Impl"
    // InternalQiraa.g:2899:1: rule__Ramz__Group__1__Impl : ( ( rule__Ramz__NameAssignment_1 ) ) ;
    public final void rule__Ramz__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2903:1: ( ( ( rule__Ramz__NameAssignment_1 ) ) )
            // InternalQiraa.g:2904:1: ( ( rule__Ramz__NameAssignment_1 ) )
            {
            // InternalQiraa.g:2904:1: ( ( rule__Ramz__NameAssignment_1 ) )
            // InternalQiraa.g:2905:2: ( rule__Ramz__NameAssignment_1 )
            {
             before(grammarAccess.getRamzAccess().getNameAssignment_1()); 
            // InternalQiraa.g:2906:2: ( rule__Ramz__NameAssignment_1 )
            // InternalQiraa.g:2906:3: rule__Ramz__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ramz__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRamzAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Ramz__Group__1__Impl"


    // $ANTLR start "rule__Ramz__Group__2"
    // InternalQiraa.g:2914:1: rule__Ramz__Group__2 : rule__Ramz__Group__2__Impl rule__Ramz__Group__3 ;
    public final void rule__Ramz__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2918:1: ( rule__Ramz__Group__2__Impl rule__Ramz__Group__3 )
            // InternalQiraa.g:2919:2: rule__Ramz__Group__2__Impl rule__Ramz__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Ramz__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ramz__Group__3();

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
    // $ANTLR end "rule__Ramz__Group__2"


    // $ANTLR start "rule__Ramz__Group__2__Impl"
    // InternalQiraa.g:2926:1: rule__Ramz__Group__2__Impl : ( '\\u064A\\u0639\\u0646\\u064A' ) ;
    public final void rule__Ramz__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2930:1: ( ( '\\u064A\\u0639\\u0646\\u064A' ) )
            // InternalQiraa.g:2931:1: ( '\\u064A\\u0639\\u0646\\u064A' )
            {
            // InternalQiraa.g:2931:1: ( '\\u064A\\u0639\\u0646\\u064A' )
            // InternalQiraa.g:2932:2: '\\u064A\\u0639\\u0646\\u064A'
            {
             before(grammarAccess.getRamzAccess().getArabicLetterYehArabicLetterAinArabicLetterNoonArabicLetterYehKeyword_2()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getRamzAccess().getArabicLetterYehArabicLetterAinArabicLetterNoonArabicLetterYehKeyword_2()); 

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
    // $ANTLR end "rule__Ramz__Group__2__Impl"


    // $ANTLR start "rule__Ramz__Group__3"
    // InternalQiraa.g:2941:1: rule__Ramz__Group__3 : rule__Ramz__Group__3__Impl rule__Ramz__Group__4 ;
    public final void rule__Ramz__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2945:1: ( rule__Ramz__Group__3__Impl rule__Ramz__Group__4 )
            // InternalQiraa.g:2946:2: rule__Ramz__Group__3__Impl rule__Ramz__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__Ramz__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ramz__Group__4();

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
    // $ANTLR end "rule__Ramz__Group__3"


    // $ANTLR start "rule__Ramz__Group__3__Impl"
    // InternalQiraa.g:2953:1: rule__Ramz__Group__3__Impl : ( ( rule__Ramz__RefsAssignment_3 ) ) ;
    public final void rule__Ramz__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2957:1: ( ( ( rule__Ramz__RefsAssignment_3 ) ) )
            // InternalQiraa.g:2958:1: ( ( rule__Ramz__RefsAssignment_3 ) )
            {
            // InternalQiraa.g:2958:1: ( ( rule__Ramz__RefsAssignment_3 ) )
            // InternalQiraa.g:2959:2: ( rule__Ramz__RefsAssignment_3 )
            {
             before(grammarAccess.getRamzAccess().getRefsAssignment_3()); 
            // InternalQiraa.g:2960:2: ( rule__Ramz__RefsAssignment_3 )
            // InternalQiraa.g:2960:3: rule__Ramz__RefsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Ramz__RefsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRamzAccess().getRefsAssignment_3()); 

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
    // $ANTLR end "rule__Ramz__Group__3__Impl"


    // $ANTLR start "rule__Ramz__Group__4"
    // InternalQiraa.g:2968:1: rule__Ramz__Group__4 : rule__Ramz__Group__4__Impl ;
    public final void rule__Ramz__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2972:1: ( rule__Ramz__Group__4__Impl )
            // InternalQiraa.g:2973:2: rule__Ramz__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ramz__Group__4__Impl();

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
    // $ANTLR end "rule__Ramz__Group__4"


    // $ANTLR start "rule__Ramz__Group__4__Impl"
    // InternalQiraa.g:2979:1: rule__Ramz__Group__4__Impl : ( ( rule__Ramz__Group_4__0 )* ) ;
    public final void rule__Ramz__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2983:1: ( ( ( rule__Ramz__Group_4__0 )* ) )
            // InternalQiraa.g:2984:1: ( ( rule__Ramz__Group_4__0 )* )
            {
            // InternalQiraa.g:2984:1: ( ( rule__Ramz__Group_4__0 )* )
            // InternalQiraa.g:2985:2: ( rule__Ramz__Group_4__0 )*
            {
             before(grammarAccess.getRamzAccess().getGroup_4()); 
            // InternalQiraa.g:2986:2: ( rule__Ramz__Group_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==57) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalQiraa.g:2986:3: rule__Ramz__Group_4__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Ramz__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getRamzAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Ramz__Group__4__Impl"


    // $ANTLR start "rule__Ramz__Group_4__0"
    // InternalQiraa.g:2995:1: rule__Ramz__Group_4__0 : rule__Ramz__Group_4__0__Impl rule__Ramz__Group_4__1 ;
    public final void rule__Ramz__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2999:1: ( rule__Ramz__Group_4__0__Impl rule__Ramz__Group_4__1 )
            // InternalQiraa.g:3000:2: rule__Ramz__Group_4__0__Impl rule__Ramz__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Ramz__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ramz__Group_4__1();

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
    // $ANTLR end "rule__Ramz__Group_4__0"


    // $ANTLR start "rule__Ramz__Group_4__0__Impl"
    // InternalQiraa.g:3007:1: rule__Ramz__Group_4__0__Impl : ( '\\u0648' ) ;
    public final void rule__Ramz__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3011:1: ( ( '\\u0648' ) )
            // InternalQiraa.g:3012:1: ( '\\u0648' )
            {
            // InternalQiraa.g:3012:1: ( '\\u0648' )
            // InternalQiraa.g:3013:2: '\\u0648'
            {
             before(grammarAccess.getRamzAccess().getArabicLetterWawKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getRamzAccess().getArabicLetterWawKeyword_4_0()); 

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
    // $ANTLR end "rule__Ramz__Group_4__0__Impl"


    // $ANTLR start "rule__Ramz__Group_4__1"
    // InternalQiraa.g:3022:1: rule__Ramz__Group_4__1 : rule__Ramz__Group_4__1__Impl ;
    public final void rule__Ramz__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3026:1: ( rule__Ramz__Group_4__1__Impl )
            // InternalQiraa.g:3027:2: rule__Ramz__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ramz__Group_4__1__Impl();

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
    // $ANTLR end "rule__Ramz__Group_4__1"


    // $ANTLR start "rule__Ramz__Group_4__1__Impl"
    // InternalQiraa.g:3033:1: rule__Ramz__Group_4__1__Impl : ( ( rule__Ramz__RefsAssignment_4_1 ) ) ;
    public final void rule__Ramz__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3037:1: ( ( ( rule__Ramz__RefsAssignment_4_1 ) ) )
            // InternalQiraa.g:3038:1: ( ( rule__Ramz__RefsAssignment_4_1 ) )
            {
            // InternalQiraa.g:3038:1: ( ( rule__Ramz__RefsAssignment_4_1 ) )
            // InternalQiraa.g:3039:2: ( rule__Ramz__RefsAssignment_4_1 )
            {
             before(grammarAccess.getRamzAccess().getRefsAssignment_4_1()); 
            // InternalQiraa.g:3040:2: ( rule__Ramz__RefsAssignment_4_1 )
            // InternalQiraa.g:3040:3: rule__Ramz__RefsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Ramz__RefsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRamzAccess().getRefsAssignment_4_1()); 

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
    // $ANTLR end "rule__Ramz__Group_4__1__Impl"


    // $ANTLR start "rule__HarfQuran__Group__0"
    // InternalQiraa.g:3049:1: rule__HarfQuran__Group__0 : rule__HarfQuran__Group__0__Impl rule__HarfQuran__Group__1 ;
    public final void rule__HarfQuran__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3053:1: ( rule__HarfQuran__Group__0__Impl rule__HarfQuran__Group__1 )
            // InternalQiraa.g:3054:2: rule__HarfQuran__Group__0__Impl rule__HarfQuran__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__HarfQuran__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HarfQuran__Group__1();

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
    // $ANTLR end "rule__HarfQuran__Group__0"


    // $ANTLR start "rule__HarfQuran__Group__0__Impl"
    // InternalQiraa.g:3061:1: rule__HarfQuran__Group__0__Impl : ( ( rule__HarfQuran__WordAssignment_0 ) ) ;
    public final void rule__HarfQuran__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3065:1: ( ( ( rule__HarfQuran__WordAssignment_0 ) ) )
            // InternalQiraa.g:3066:1: ( ( rule__HarfQuran__WordAssignment_0 ) )
            {
            // InternalQiraa.g:3066:1: ( ( rule__HarfQuran__WordAssignment_0 ) )
            // InternalQiraa.g:3067:2: ( rule__HarfQuran__WordAssignment_0 )
            {
             before(grammarAccess.getHarfQuranAccess().getWordAssignment_0()); 
            // InternalQiraa.g:3068:2: ( rule__HarfQuran__WordAssignment_0 )
            // InternalQiraa.g:3068:3: rule__HarfQuran__WordAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__HarfQuran__WordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHarfQuranAccess().getWordAssignment_0()); 

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
    // $ANTLR end "rule__HarfQuran__Group__0__Impl"


    // $ANTLR start "rule__HarfQuran__Group__1"
    // InternalQiraa.g:3076:1: rule__HarfQuran__Group__1 : rule__HarfQuran__Group__1__Impl rule__HarfQuran__Group__2 ;
    public final void rule__HarfQuran__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3080:1: ( rule__HarfQuran__Group__1__Impl rule__HarfQuran__Group__2 )
            // InternalQiraa.g:3081:2: rule__HarfQuran__Group__1__Impl rule__HarfQuran__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__HarfQuran__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HarfQuran__Group__2();

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
    // $ANTLR end "rule__HarfQuran__Group__1"


    // $ANTLR start "rule__HarfQuran__Group__1__Impl"
    // InternalQiraa.g:3088:1: rule__HarfQuran__Group__1__Impl : ( '\\u0645\\u0646' ) ;
    public final void rule__HarfQuran__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3092:1: ( ( '\\u0645\\u0646' ) )
            // InternalQiraa.g:3093:1: ( '\\u0645\\u0646' )
            {
            // InternalQiraa.g:3093:1: ( '\\u0645\\u0646' )
            // InternalQiraa.g:3094:2: '\\u0645\\u0646'
            {
             before(grammarAccess.getHarfQuranAccess().getArabicLetterMeemArabicLetterNoonKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getHarfQuranAccess().getArabicLetterMeemArabicLetterNoonKeyword_1()); 

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
    // $ANTLR end "rule__HarfQuran__Group__1__Impl"


    // $ANTLR start "rule__HarfQuran__Group__2"
    // InternalQiraa.g:3103:1: rule__HarfQuran__Group__2 : rule__HarfQuran__Group__2__Impl rule__HarfQuran__Group__3 ;
    public final void rule__HarfQuran__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3107:1: ( rule__HarfQuran__Group__2__Impl rule__HarfQuran__Group__3 )
            // InternalQiraa.g:3108:2: rule__HarfQuran__Group__2__Impl rule__HarfQuran__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__HarfQuran__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HarfQuran__Group__3();

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
    // $ANTLR end "rule__HarfQuran__Group__2"


    // $ANTLR start "rule__HarfQuran__Group__2__Impl"
    // InternalQiraa.g:3115:1: rule__HarfQuran__Group__2__Impl : ( '\\u0642\\u0648\\u0644\\u0647' ) ;
    public final void rule__HarfQuran__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3119:1: ( ( '\\u0642\\u0648\\u0644\\u0647' ) )
            // InternalQiraa.g:3120:1: ( '\\u0642\\u0648\\u0644\\u0647' )
            {
            // InternalQiraa.g:3120:1: ( '\\u0642\\u0648\\u0644\\u0647' )
            // InternalQiraa.g:3121:2: '\\u0642\\u0648\\u0644\\u0647'
            {
             before(grammarAccess.getHarfQuranAccess().getArabicLetterQafArabicLetterWawArabicLetterLamArabicLetterHehKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getHarfQuranAccess().getArabicLetterQafArabicLetterWawArabicLetterLamArabicLetterHehKeyword_2()); 

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
    // $ANTLR end "rule__HarfQuran__Group__2__Impl"


    // $ANTLR start "rule__HarfQuran__Group__3"
    // InternalQiraa.g:3130:1: rule__HarfQuran__Group__3 : rule__HarfQuran__Group__3__Impl rule__HarfQuran__Group__4 ;
    public final void rule__HarfQuran__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3134:1: ( rule__HarfQuran__Group__3__Impl rule__HarfQuran__Group__4 )
            // InternalQiraa.g:3135:2: rule__HarfQuran__Group__3__Impl rule__HarfQuran__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__HarfQuran__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HarfQuran__Group__4();

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
    // $ANTLR end "rule__HarfQuran__Group__3"


    // $ANTLR start "rule__HarfQuran__Group__3__Impl"
    // InternalQiraa.g:3142:1: rule__HarfQuran__Group__3__Impl : ( '\\u062A\\u0639\\u0627\\u0644\\u0649' ) ;
    public final void rule__HarfQuran__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3146:1: ( ( '\\u062A\\u0639\\u0627\\u0644\\u0649' ) )
            // InternalQiraa.g:3147:1: ( '\\u062A\\u0639\\u0627\\u0644\\u0649' )
            {
            // InternalQiraa.g:3147:1: ( '\\u062A\\u0639\\u0627\\u0644\\u0649' )
            // InternalQiraa.g:3148:2: '\\u062A\\u0639\\u0627\\u0644\\u0649'
            {
             before(grammarAccess.getHarfQuranAccess().getArabicLetterTehArabicLetterAinArabicLetterAlefArabicLetterLamArabicLetterAlefMaksuraKeyword_3()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getHarfQuranAccess().getArabicLetterTehArabicLetterAinArabicLetterAlefArabicLetterLamArabicLetterAlefMaksuraKeyword_3()); 

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
    // $ANTLR end "rule__HarfQuran__Group__3__Impl"


    // $ANTLR start "rule__HarfQuran__Group__4"
    // InternalQiraa.g:3157:1: rule__HarfQuran__Group__4 : rule__HarfQuran__Group__4__Impl rule__HarfQuran__Group__5 ;
    public final void rule__HarfQuran__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3161:1: ( rule__HarfQuran__Group__4__Impl rule__HarfQuran__Group__5 )
            // InternalQiraa.g:3162:2: rule__HarfQuran__Group__4__Impl rule__HarfQuran__Group__5
            {
            pushFollow(FOLLOW_40);
            rule__HarfQuran__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HarfQuran__Group__5();

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
    // $ANTLR end "rule__HarfQuran__Group__4"


    // $ANTLR start "rule__HarfQuran__Group__4__Impl"
    // InternalQiraa.g:3169:1: rule__HarfQuran__Group__4__Impl : ( ( rule__HarfQuran__AyahAssignment_4 ) ) ;
    public final void rule__HarfQuran__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3173:1: ( ( ( rule__HarfQuran__AyahAssignment_4 ) ) )
            // InternalQiraa.g:3174:1: ( ( rule__HarfQuran__AyahAssignment_4 ) )
            {
            // InternalQiraa.g:3174:1: ( ( rule__HarfQuran__AyahAssignment_4 ) )
            // InternalQiraa.g:3175:2: ( rule__HarfQuran__AyahAssignment_4 )
            {
             before(grammarAccess.getHarfQuranAccess().getAyahAssignment_4()); 
            // InternalQiraa.g:3176:2: ( rule__HarfQuran__AyahAssignment_4 )
            // InternalQiraa.g:3176:3: rule__HarfQuran__AyahAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__HarfQuran__AyahAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHarfQuranAccess().getAyahAssignment_4()); 

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
    // $ANTLR end "rule__HarfQuran__Group__4__Impl"


    // $ANTLR start "rule__HarfQuran__Group__5"
    // InternalQiraa.g:3184:1: rule__HarfQuran__Group__5 : rule__HarfQuran__Group__5__Impl ;
    public final void rule__HarfQuran__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3188:1: ( rule__HarfQuran__Group__5__Impl )
            // InternalQiraa.g:3189:2: rule__HarfQuran__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HarfQuran__Group__5__Impl();

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
    // $ANTLR end "rule__HarfQuran__Group__5"


    // $ANTLR start "rule__HarfQuran__Group__5__Impl"
    // InternalQiraa.g:3195:1: rule__HarfQuran__Group__5__Impl : ( ( rule__HarfQuran__Group_5__0 )? ) ;
    public final void rule__HarfQuran__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3199:1: ( ( ( rule__HarfQuran__Group_5__0 )? ) )
            // InternalQiraa.g:3200:1: ( ( rule__HarfQuran__Group_5__0 )? )
            {
            // InternalQiraa.g:3200:1: ( ( rule__HarfQuran__Group_5__0 )? )
            // InternalQiraa.g:3201:2: ( rule__HarfQuran__Group_5__0 )?
            {
             before(grammarAccess.getHarfQuranAccess().getGroup_5()); 
            // InternalQiraa.g:3202:2: ( rule__HarfQuran__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==60) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalQiraa.g:3202:3: rule__HarfQuran__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HarfQuran__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHarfQuranAccess().getGroup_5()); 

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
    // $ANTLR end "rule__HarfQuran__Group__5__Impl"


    // $ANTLR start "rule__HarfQuran__Group_5__0"
    // InternalQiraa.g:3211:1: rule__HarfQuran__Group_5__0 : rule__HarfQuran__Group_5__0__Impl rule__HarfQuran__Group_5__1 ;
    public final void rule__HarfQuran__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3215:1: ( rule__HarfQuran__Group_5__0__Impl rule__HarfQuran__Group_5__1 )
            // InternalQiraa.g:3216:2: rule__HarfQuran__Group_5__0__Impl rule__HarfQuran__Group_5__1
            {
            pushFollow(FOLLOW_41);
            rule__HarfQuran__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HarfQuran__Group_5__1();

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
    // $ANTLR end "rule__HarfQuran__Group_5__0"


    // $ANTLR start "rule__HarfQuran__Group_5__0__Impl"
    // InternalQiraa.g:3223:1: rule__HarfQuran__Group_5__0__Impl : ( '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' ) ;
    public final void rule__HarfQuran__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3227:1: ( ( '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' ) )
            // InternalQiraa.g:3228:1: ( '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' )
            {
            // InternalQiraa.g:3228:1: ( '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' )
            // InternalQiraa.g:3229:2: '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639'
            {
             before(grammarAccess.getHarfQuranAccess().getArabicLetterAlefArabicLetterLamArabicLetterMeemArabicLetterWawArabicLetterDadArabicLetterAinKeyword_5_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getHarfQuranAccess().getArabicLetterAlefArabicLetterLamArabicLetterMeemArabicLetterWawArabicLetterDadArabicLetterAinKeyword_5_0()); 

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
    // $ANTLR end "rule__HarfQuran__Group_5__0__Impl"


    // $ANTLR start "rule__HarfQuran__Group_5__1"
    // InternalQiraa.g:3238:1: rule__HarfQuran__Group_5__1 : rule__HarfQuran__Group_5__1__Impl ;
    public final void rule__HarfQuran__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3242:1: ( rule__HarfQuran__Group_5__1__Impl )
            // InternalQiraa.g:3243:2: rule__HarfQuran__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HarfQuran__Group_5__1__Impl();

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
    // $ANTLR end "rule__HarfQuran__Group_5__1"


    // $ANTLR start "rule__HarfQuran__Group_5__1__Impl"
    // InternalQiraa.g:3249:1: rule__HarfQuran__Group_5__1__Impl : ( ( rule__HarfQuran__MawdeeAssignment_5_1 ) ) ;
    public final void rule__HarfQuran__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3253:1: ( ( ( rule__HarfQuran__MawdeeAssignment_5_1 ) ) )
            // InternalQiraa.g:3254:1: ( ( rule__HarfQuran__MawdeeAssignment_5_1 ) )
            {
            // InternalQiraa.g:3254:1: ( ( rule__HarfQuran__MawdeeAssignment_5_1 ) )
            // InternalQiraa.g:3255:2: ( rule__HarfQuran__MawdeeAssignment_5_1 )
            {
             before(grammarAccess.getHarfQuranAccess().getMawdeeAssignment_5_1()); 
            // InternalQiraa.g:3256:2: ( rule__HarfQuran__MawdeeAssignment_5_1 )
            // InternalQiraa.g:3256:3: rule__HarfQuran__MawdeeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__HarfQuran__MawdeeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getHarfQuranAccess().getMawdeeAssignment_5_1()); 

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
    // $ANTLR end "rule__HarfQuran__Group_5__1__Impl"


    // $ANTLR start "rule__Harf__Group__0"
    // InternalQiraa.g:3265:1: rule__Harf__Group__0 : rule__Harf__Group__0__Impl rule__Harf__Group__1 ;
    public final void rule__Harf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3269:1: ( rule__Harf__Group__0__Impl rule__Harf__Group__1 )
            // InternalQiraa.g:3270:2: rule__Harf__Group__0__Impl rule__Harf__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalQiraa.g:3277:1: rule__Harf__Group__0__Impl : ( '\\u062D\\u0631\\u0641' ) ;
    public final void rule__Harf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3281:1: ( ( '\\u062D\\u0631\\u0641' ) )
            // InternalQiraa.g:3282:1: ( '\\u062D\\u0631\\u0641' )
            {
            // InternalQiraa.g:3282:1: ( '\\u062D\\u0631\\u0641' )
            // InternalQiraa.g:3283:2: '\\u062D\\u0631\\u0641'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterHahArabicLetterRehArabicLetterFehKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalQiraa.g:3292:1: rule__Harf__Group__1 : rule__Harf__Group__1__Impl rule__Harf__Group__2 ;
    public final void rule__Harf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3296:1: ( rule__Harf__Group__1__Impl rule__Harf__Group__2 )
            // InternalQiraa.g:3297:2: rule__Harf__Group__1__Impl rule__Harf__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalQiraa.g:3304:1: rule__Harf__Group__1__Impl : ( ( rule__Harf__NameAssignment_1 ) ) ;
    public final void rule__Harf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3308:1: ( ( ( rule__Harf__NameAssignment_1 ) ) )
            // InternalQiraa.g:3309:1: ( ( rule__Harf__NameAssignment_1 ) )
            {
            // InternalQiraa.g:3309:1: ( ( rule__Harf__NameAssignment_1 ) )
            // InternalQiraa.g:3310:2: ( rule__Harf__NameAssignment_1 )
            {
             before(grammarAccess.getHarfAccess().getNameAssignment_1()); 
            // InternalQiraa.g:3311:2: ( rule__Harf__NameAssignment_1 )
            // InternalQiraa.g:3311:3: rule__Harf__NameAssignment_1
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
    // InternalQiraa.g:3319:1: rule__Harf__Group__2 : rule__Harf__Group__2__Impl ;
    public final void rule__Harf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3323:1: ( rule__Harf__Group__2__Impl )
            // InternalQiraa.g:3324:2: rule__Harf__Group__2__Impl
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
    // InternalQiraa.g:3330:1: rule__Harf__Group__2__Impl : ( ( rule__Harf__Alternatives_2 ) ) ;
    public final void rule__Harf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3334:1: ( ( ( rule__Harf__Alternatives_2 ) ) )
            // InternalQiraa.g:3335:1: ( ( rule__Harf__Alternatives_2 ) )
            {
            // InternalQiraa.g:3335:1: ( ( rule__Harf__Alternatives_2 ) )
            // InternalQiraa.g:3336:2: ( rule__Harf__Alternatives_2 )
            {
             before(grammarAccess.getHarfAccess().getAlternatives_2()); 
            // InternalQiraa.g:3337:2: ( rule__Harf__Alternatives_2 )
            // InternalQiraa.g:3337:3: rule__Harf__Alternatives_2
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
    // InternalQiraa.g:3346:1: rule__Harf__Group_2_0__0 : rule__Harf__Group_2_0__0__Impl rule__Harf__Group_2_0__1 ;
    public final void rule__Harf__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3350:1: ( rule__Harf__Group_2_0__0__Impl rule__Harf__Group_2_0__1 )
            // InternalQiraa.g:3351:2: rule__Harf__Group_2_0__0__Impl rule__Harf__Group_2_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalQiraa.g:3358:1: rule__Harf__Group_2_0__0__Impl : ( '\\u0647\\u0648' ) ;
    public final void rule__Harf__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3362:1: ( ( '\\u0647\\u0648' ) )
            // InternalQiraa.g:3363:1: ( '\\u0647\\u0648' )
            {
            // InternalQiraa.g:3363:1: ( '\\u0647\\u0648' )
            // InternalQiraa.g:3364:2: '\\u0647\\u0648'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterHehArabicLetterWawKeyword_2_0_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalQiraa.g:3373:1: rule__Harf__Group_2_0__1 : rule__Harf__Group_2_0__1__Impl rule__Harf__Group_2_0__2 ;
    public final void rule__Harf__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3377:1: ( rule__Harf__Group_2_0__1__Impl rule__Harf__Group_2_0__2 )
            // InternalQiraa.g:3378:2: rule__Harf__Group_2_0__1__Impl rule__Harf__Group_2_0__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalQiraa.g:3385:1: rule__Harf__Group_2_0__1__Impl : ( ( rule__Harf__ValuesAssignment_2_0_1 ) ) ;
    public final void rule__Harf__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3389:1: ( ( ( rule__Harf__ValuesAssignment_2_0_1 ) ) )
            // InternalQiraa.g:3390:1: ( ( rule__Harf__ValuesAssignment_2_0_1 ) )
            {
            // InternalQiraa.g:3390:1: ( ( rule__Harf__ValuesAssignment_2_0_1 ) )
            // InternalQiraa.g:3391:2: ( rule__Harf__ValuesAssignment_2_0_1 )
            {
             before(grammarAccess.getHarfAccess().getValuesAssignment_2_0_1()); 
            // InternalQiraa.g:3392:2: ( rule__Harf__ValuesAssignment_2_0_1 )
            // InternalQiraa.g:3392:3: rule__Harf__ValuesAssignment_2_0_1
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
    // InternalQiraa.g:3400:1: rule__Harf__Group_2_0__2 : rule__Harf__Group_2_0__2__Impl ;
    public final void rule__Harf__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3404:1: ( rule__Harf__Group_2_0__2__Impl )
            // InternalQiraa.g:3405:2: rule__Harf__Group_2_0__2__Impl
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
    // InternalQiraa.g:3411:1: rule__Harf__Group_2_0__2__Impl : ( ( rule__Harf__Group_2_0_2__0 )* ) ;
    public final void rule__Harf__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3415:1: ( ( ( rule__Harf__Group_2_0_2__0 )* ) )
            // InternalQiraa.g:3416:1: ( ( rule__Harf__Group_2_0_2__0 )* )
            {
            // InternalQiraa.g:3416:1: ( ( rule__Harf__Group_2_0_2__0 )* )
            // InternalQiraa.g:3417:2: ( rule__Harf__Group_2_0_2__0 )*
            {
             before(grammarAccess.getHarfAccess().getGroup_2_0_2()); 
            // InternalQiraa.g:3418:2: ( rule__Harf__Group_2_0_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==63) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalQiraa.g:3418:3: rule__Harf__Group_2_0_2__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__Harf__Group_2_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalQiraa.g:3427:1: rule__Harf__Group_2_0_2__0 : rule__Harf__Group_2_0_2__0__Impl rule__Harf__Group_2_0_2__1 ;
    public final void rule__Harf__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3431:1: ( rule__Harf__Group_2_0_2__0__Impl rule__Harf__Group_2_0_2__1 )
            // InternalQiraa.g:3432:2: rule__Harf__Group_2_0_2__0__Impl rule__Harf__Group_2_0_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalQiraa.g:3439:1: rule__Harf__Group_2_0_2__0__Impl : ( '\\u0623\\u0648' ) ;
    public final void rule__Harf__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3443:1: ( ( '\\u0623\\u0648' ) )
            // InternalQiraa.g:3444:1: ( '\\u0623\\u0648' )
            {
            // InternalQiraa.g:3444:1: ( '\\u0623\\u0648' )
            // InternalQiraa.g:3445:2: '\\u0623\\u0648'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterAlefWithHamzaAboveArabicLetterWawKeyword_2_0_2_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalQiraa.g:3454:1: rule__Harf__Group_2_0_2__1 : rule__Harf__Group_2_0_2__1__Impl ;
    public final void rule__Harf__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3458:1: ( rule__Harf__Group_2_0_2__1__Impl )
            // InternalQiraa.g:3459:2: rule__Harf__Group_2_0_2__1__Impl
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
    // InternalQiraa.g:3465:1: rule__Harf__Group_2_0_2__1__Impl : ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) ) ;
    public final void rule__Harf__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3469:1: ( ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) ) )
            // InternalQiraa.g:3470:1: ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) )
            {
            // InternalQiraa.g:3470:1: ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) )
            // InternalQiraa.g:3471:2: ( rule__Harf__ValuesAssignment_2_0_2_1 )
            {
             before(grammarAccess.getHarfAccess().getValuesAssignment_2_0_2_1()); 
            // InternalQiraa.g:3472:2: ( rule__Harf__ValuesAssignment_2_0_2_1 )
            // InternalQiraa.g:3472:3: rule__Harf__ValuesAssignment_2_0_2_1
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
    // InternalQiraa.g:3481:1: rule__Harf__Group_2_1__0 : rule__Harf__Group_2_1__0__Impl rule__Harf__Group_2_1__1 ;
    public final void rule__Harf__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3485:1: ( rule__Harf__Group_2_1__0__Impl rule__Harf__Group_2_1__1 )
            // InternalQiraa.g:3486:2: rule__Harf__Group_2_1__0__Impl rule__Harf__Group_2_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalQiraa.g:3493:1: rule__Harf__Group_2_1__0__Impl : ( '\\u0630\\u0627\\u062A\\u0647' ) ;
    public final void rule__Harf__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3497:1: ( ( '\\u0630\\u0627\\u062A\\u0647' ) )
            // InternalQiraa.g:3498:1: ( '\\u0630\\u0627\\u062A\\u0647' )
            {
            // InternalQiraa.g:3498:1: ( '\\u0630\\u0627\\u062A\\u0647' )
            // InternalQiraa.g:3499:2: '\\u0630\\u0627\\u062A\\u0647'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterThalArabicLetterAlefArabicLetterTehArabicLetterHehKeyword_2_1_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalQiraa.g:3508:1: rule__Harf__Group_2_1__1 : rule__Harf__Group_2_1__1__Impl ;
    public final void rule__Harf__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3512:1: ( rule__Harf__Group_2_1__1__Impl )
            // InternalQiraa.g:3513:2: rule__Harf__Group_2_1__1__Impl
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
    // InternalQiraa.g:3519:1: rule__Harf__Group_2_1__1__Impl : ( ( rule__Harf__RefAssignment_2_1_1 ) ) ;
    public final void rule__Harf__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3523:1: ( ( ( rule__Harf__RefAssignment_2_1_1 ) ) )
            // InternalQiraa.g:3524:1: ( ( rule__Harf__RefAssignment_2_1_1 ) )
            {
            // InternalQiraa.g:3524:1: ( ( rule__Harf__RefAssignment_2_1_1 ) )
            // InternalQiraa.g:3525:2: ( rule__Harf__RefAssignment_2_1_1 )
            {
             before(grammarAccess.getHarfAccess().getRefAssignment_2_1_1()); 
            // InternalQiraa.g:3526:2: ( rule__Harf__RefAssignment_2_1_1 )
            // InternalQiraa.g:3526:3: rule__Harf__RefAssignment_2_1_1
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
    // InternalQiraa.g:3535:1: rule__Harakah__Group__0 : rule__Harakah__Group__0__Impl rule__Harakah__Group__1 ;
    public final void rule__Harakah__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3539:1: ( rule__Harakah__Group__0__Impl rule__Harakah__Group__1 )
            // InternalQiraa.g:3540:2: rule__Harakah__Group__0__Impl rule__Harakah__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalQiraa.g:3547:1: rule__Harakah__Group__0__Impl : ( '\\u062D\\u0631\\u0643\\u0629' ) ;
    public final void rule__Harakah__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3551:1: ( ( '\\u062D\\u0631\\u0643\\u0629' ) )
            // InternalQiraa.g:3552:1: ( '\\u062D\\u0631\\u0643\\u0629' )
            {
            // InternalQiraa.g:3552:1: ( '\\u062D\\u0631\\u0643\\u0629' )
            // InternalQiraa.g:3553:2: '\\u062D\\u0631\\u0643\\u0629'
            {
             before(grammarAccess.getHarakahAccess().getArabicLetterHahArabicLetterRehArabicLetterKafArabicLetterTehMarbutaKeyword_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalQiraa.g:3562:1: rule__Harakah__Group__1 : rule__Harakah__Group__1__Impl rule__Harakah__Group__2 ;
    public final void rule__Harakah__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3566:1: ( rule__Harakah__Group__1__Impl rule__Harakah__Group__2 )
            // InternalQiraa.g:3567:2: rule__Harakah__Group__1__Impl rule__Harakah__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalQiraa.g:3574:1: rule__Harakah__Group__1__Impl : ( ( rule__Harakah__NameAssignment_1 ) ) ;
    public final void rule__Harakah__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3578:1: ( ( ( rule__Harakah__NameAssignment_1 ) ) )
            // InternalQiraa.g:3579:1: ( ( rule__Harakah__NameAssignment_1 ) )
            {
            // InternalQiraa.g:3579:1: ( ( rule__Harakah__NameAssignment_1 ) )
            // InternalQiraa.g:3580:2: ( rule__Harakah__NameAssignment_1 )
            {
             before(grammarAccess.getHarakahAccess().getNameAssignment_1()); 
            // InternalQiraa.g:3581:2: ( rule__Harakah__NameAssignment_1 )
            // InternalQiraa.g:3581:3: rule__Harakah__NameAssignment_1
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
    // InternalQiraa.g:3589:1: rule__Harakah__Group__2 : rule__Harakah__Group__2__Impl rule__Harakah__Group__3 ;
    public final void rule__Harakah__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3593:1: ( rule__Harakah__Group__2__Impl rule__Harakah__Group__3 )
            // InternalQiraa.g:3594:2: rule__Harakah__Group__2__Impl rule__Harakah__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalQiraa.g:3601:1: rule__Harakah__Group__2__Impl : ( '\\u0647\\u064A' ) ;
    public final void rule__Harakah__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3605:1: ( ( '\\u0647\\u064A' ) )
            // InternalQiraa.g:3606:1: ( '\\u0647\\u064A' )
            {
            // InternalQiraa.g:3606:1: ( '\\u0647\\u064A' )
            // InternalQiraa.g:3607:2: '\\u0647\\u064A'
            {
             before(grammarAccess.getHarakahAccess().getArabicLetterHehArabicLetterYehKeyword_2()); 
            match(input,66,FOLLOW_2); 
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
    // InternalQiraa.g:3616:1: rule__Harakah__Group__3 : rule__Harakah__Group__3__Impl ;
    public final void rule__Harakah__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3620:1: ( rule__Harakah__Group__3__Impl )
            // InternalQiraa.g:3621:2: rule__Harakah__Group__3__Impl
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
    // InternalQiraa.g:3627:1: rule__Harakah__Group__3__Impl : ( ( rule__Harakah__ValueAssignment_3 ) ) ;
    public final void rule__Harakah__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3631:1: ( ( ( rule__Harakah__ValueAssignment_3 ) ) )
            // InternalQiraa.g:3632:1: ( ( rule__Harakah__ValueAssignment_3 ) )
            {
            // InternalQiraa.g:3632:1: ( ( rule__Harakah__ValueAssignment_3 ) )
            // InternalQiraa.g:3633:2: ( rule__Harakah__ValueAssignment_3 )
            {
             before(grammarAccess.getHarakahAccess().getValueAssignment_3()); 
            // InternalQiraa.g:3634:2: ( rule__Harakah__ValueAssignment_3 )
            // InternalQiraa.g:3634:3: rule__Harakah__ValueAssignment_3
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
    // InternalQiraa.g:3643:1: rule__AyahStart__Group__0 : rule__AyahStart__Group__0__Impl rule__AyahStart__Group__1 ;
    public final void rule__AyahStart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3647:1: ( rule__AyahStart__Group__0__Impl rule__AyahStart__Group__1 )
            // InternalQiraa.g:3648:2: rule__AyahStart__Group__0__Impl rule__AyahStart__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalQiraa.g:3655:1: rule__AyahStart__Group__0__Impl : ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ) ;
    public final void rule__AyahStart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3659:1: ( ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ) )
            // InternalQiraa.g:3660:1: ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' )
            {
            // InternalQiraa.g:3660:1: ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' )
            // InternalQiraa.g:3661:2: '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'
            {
             before(grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterSeenArabicLetterWawArabicLetterRehArabicLetterTehMarbutaKeyword_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalQiraa.g:3670:1: rule__AyahStart__Group__1 : rule__AyahStart__Group__1__Impl rule__AyahStart__Group__2 ;
    public final void rule__AyahStart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3674:1: ( rule__AyahStart__Group__1__Impl rule__AyahStart__Group__2 )
            // InternalQiraa.g:3675:2: rule__AyahStart__Group__1__Impl rule__AyahStart__Group__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalQiraa.g:3682:1: rule__AyahStart__Group__1__Impl : ( ( rule__AyahStart__SurahAssignment_1 ) ) ;
    public final void rule__AyahStart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3686:1: ( ( ( rule__AyahStart__SurahAssignment_1 ) ) )
            // InternalQiraa.g:3687:1: ( ( rule__AyahStart__SurahAssignment_1 ) )
            {
            // InternalQiraa.g:3687:1: ( ( rule__AyahStart__SurahAssignment_1 ) )
            // InternalQiraa.g:3688:2: ( rule__AyahStart__SurahAssignment_1 )
            {
             before(grammarAccess.getAyahStartAccess().getSurahAssignment_1()); 
            // InternalQiraa.g:3689:2: ( rule__AyahStart__SurahAssignment_1 )
            // InternalQiraa.g:3689:3: rule__AyahStart__SurahAssignment_1
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
    // InternalQiraa.g:3697:1: rule__AyahStart__Group__2 : rule__AyahStart__Group__2__Impl rule__AyahStart__Group__3 ;
    public final void rule__AyahStart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3701:1: ( rule__AyahStart__Group__2__Impl rule__AyahStart__Group__3 )
            // InternalQiraa.g:3702:2: rule__AyahStart__Group__2__Impl rule__AyahStart__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalQiraa.g:3709:1: rule__AyahStart__Group__2__Impl : ( '\\u0627\\u0644\\u0622\\u064A\\u0629' ) ;
    public final void rule__AyahStart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3713:1: ( ( '\\u0627\\u0644\\u0622\\u064A\\u0629' ) )
            // InternalQiraa.g:3714:1: ( '\\u0627\\u0644\\u0622\\u064A\\u0629' )
            {
            // InternalQiraa.g:3714:1: ( '\\u0627\\u0644\\u0622\\u064A\\u0629' )
            // InternalQiraa.g:3715:2: '\\u0627\\u0644\\u0622\\u064A\\u0629'
            {
             before(grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithMaddaAboveArabicLetterYehArabicLetterTehMarbutaKeyword_2()); 
            match(input,68,FOLLOW_2); 
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
    // InternalQiraa.g:3724:1: rule__AyahStart__Group__3 : rule__AyahStart__Group__3__Impl rule__AyahStart__Group__4 ;
    public final void rule__AyahStart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3728:1: ( rule__AyahStart__Group__3__Impl rule__AyahStart__Group__4 )
            // InternalQiraa.g:3729:2: rule__AyahStart__Group__3__Impl rule__AyahStart__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalQiraa.g:3736:1: rule__AyahStart__Group__3__Impl : ( ( rule__AyahStart__AyahAssignment_3 ) ) ;
    public final void rule__AyahStart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3740:1: ( ( ( rule__AyahStart__AyahAssignment_3 ) ) )
            // InternalQiraa.g:3741:1: ( ( rule__AyahStart__AyahAssignment_3 ) )
            {
            // InternalQiraa.g:3741:1: ( ( rule__AyahStart__AyahAssignment_3 ) )
            // InternalQiraa.g:3742:2: ( rule__AyahStart__AyahAssignment_3 )
            {
             before(grammarAccess.getAyahStartAccess().getAyahAssignment_3()); 
            // InternalQiraa.g:3743:2: ( rule__AyahStart__AyahAssignment_3 )
            // InternalQiraa.g:3743:3: rule__AyahStart__AyahAssignment_3
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
    // InternalQiraa.g:3751:1: rule__AyahStart__Group__4 : rule__AyahStart__Group__4__Impl ;
    public final void rule__AyahStart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3755:1: ( rule__AyahStart__Group__4__Impl )
            // InternalQiraa.g:3756:2: rule__AyahStart__Group__4__Impl
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
    // InternalQiraa.g:3762:1: rule__AyahStart__Group__4__Impl : ( ( rule__AyahStart__NameAssignment_4 ) ) ;
    public final void rule__AyahStart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3766:1: ( ( ( rule__AyahStart__NameAssignment_4 ) ) )
            // InternalQiraa.g:3767:1: ( ( rule__AyahStart__NameAssignment_4 ) )
            {
            // InternalQiraa.g:3767:1: ( ( rule__AyahStart__NameAssignment_4 ) )
            // InternalQiraa.g:3768:2: ( rule__AyahStart__NameAssignment_4 )
            {
             before(grammarAccess.getAyahStartAccess().getNameAssignment_4()); 
            // InternalQiraa.g:3769:2: ( rule__AyahStart__NameAssignment_4 )
            // InternalQiraa.g:3769:3: rule__AyahStart__NameAssignment_4
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
    // InternalQiraa.g:3778:1: rule__Phrase__Group__0 : rule__Phrase__Group__0__Impl rule__Phrase__Group__1 ;
    public final void rule__Phrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3782:1: ( rule__Phrase__Group__0__Impl rule__Phrase__Group__1 )
            // InternalQiraa.g:3783:2: rule__Phrase__Group__0__Impl rule__Phrase__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalQiraa.g:3790:1: rule__Phrase__Group__0__Impl : ( ( rule__Phrase__BasmalahAssignment_0 )? ) ;
    public final void rule__Phrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3794:1: ( ( ( rule__Phrase__BasmalahAssignment_0 )? ) )
            // InternalQiraa.g:3795:1: ( ( rule__Phrase__BasmalahAssignment_0 )? )
            {
            // InternalQiraa.g:3795:1: ( ( rule__Phrase__BasmalahAssignment_0 )? )
            // InternalQiraa.g:3796:2: ( rule__Phrase__BasmalahAssignment_0 )?
            {
             before(grammarAccess.getPhraseAccess().getBasmalahAssignment_0()); 
            // InternalQiraa.g:3797:2: ( rule__Phrase__BasmalahAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_BASMALAH) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalQiraa.g:3797:3: rule__Phrase__BasmalahAssignment_0
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
    // InternalQiraa.g:3805:1: rule__Phrase__Group__1 : rule__Phrase__Group__1__Impl ;
    public final void rule__Phrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3809:1: ( rule__Phrase__Group__1__Impl )
            // InternalQiraa.g:3810:2: rule__Phrase__Group__1__Impl
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
    // InternalQiraa.g:3816:1: rule__Phrase__Group__1__Impl : ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) ) ;
    public final void rule__Phrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3820:1: ( ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) ) )
            // InternalQiraa.g:3821:1: ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) )
            {
            // InternalQiraa.g:3821:1: ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) )
            // InternalQiraa.g:3822:2: ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* )
            {
            // InternalQiraa.g:3822:2: ( ( rule__Phrase__WordsAssignment_1 ) )
            // InternalQiraa.g:3823:3: ( rule__Phrase__WordsAssignment_1 )
            {
             before(grammarAccess.getPhraseAccess().getWordsAssignment_1()); 
            // InternalQiraa.g:3824:3: ( rule__Phrase__WordsAssignment_1 )
            // InternalQiraa.g:3824:4: rule__Phrase__WordsAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__Phrase__WordsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getWordsAssignment_1()); 

            }

            // InternalQiraa.g:3827:2: ( ( rule__Phrase__WordsAssignment_1 )* )
            // InternalQiraa.g:3828:3: ( rule__Phrase__WordsAssignment_1 )*
            {
             before(grammarAccess.getPhraseAccess().getWordsAssignment_1()); 
            // InternalQiraa.g:3829:3: ( rule__Phrase__WordsAssignment_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_AWORD) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalQiraa.g:3829:4: rule__Phrase__WordsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Phrase__WordsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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


    // $ANTLR start "rule__QiraaModel__MarjeeAssignment"
    // InternalQiraa.g:3839:1: rule__QiraaModel__MarjeeAssignment : ( ruleMarjeh ) ;
    public final void rule__QiraaModel__MarjeeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3843:1: ( ( ruleMarjeh ) )
            // InternalQiraa.g:3844:2: ( ruleMarjeh )
            {
            // InternalQiraa.g:3844:2: ( ruleMarjeh )
            // InternalQiraa.g:3845:3: ruleMarjeh
            {
             before(grammarAccess.getQiraaModelAccess().getMarjeeMarjehParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMarjeh();

            state._fsp--;

             after(grammarAccess.getQiraaModelAccess().getMarjeeMarjehParserRuleCall_0()); 

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
    // $ANTLR end "rule__QiraaModel__MarjeeAssignment"


    // $ANTLR start "rule__Marjeh__NameAssignment_1"
    // InternalQiraa.g:3854:1: rule__Marjeh__NameAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Marjeh__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3858:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3859:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:3859:2: ( RULE_KALEMAH )
            // InternalQiraa.g:3860:3: RULE_KALEMAH
            {
             before(grammarAccess.getMarjehAccess().getNameKALEMAHTerminalRuleCall_1_0()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getMarjehAccess().getNameKALEMAHTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Marjeh__NameAssignment_1"


    // $ANTLR start "rule__Marjeh__MatnAssignment_4"
    // InternalQiraa.g:3869:1: rule__Marjeh__MatnAssignment_4 : ( ( ruleAWORDS ) ) ;
    public final void rule__Marjeh__MatnAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3873:1: ( ( ( ruleAWORDS ) ) )
            // InternalQiraa.g:3874:2: ( ( ruleAWORDS ) )
            {
            // InternalQiraa.g:3874:2: ( ( ruleAWORDS ) )
            // InternalQiraa.g:3875:3: ( ruleAWORDS )
            {
             before(grammarAccess.getMarjehAccess().getMatnMatnCrossReference_4_0()); 
            // InternalQiraa.g:3876:3: ( ruleAWORDS )
            // InternalQiraa.g:3877:4: ruleAWORDS
            {
             before(grammarAccess.getMarjehAccess().getMatnMatnAWORDSParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleAWORDS();

            state._fsp--;

             after(grammarAccess.getMarjehAccess().getMatnMatnAWORDSParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getMarjehAccess().getMatnMatnCrossReference_4_0()); 

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
    // $ANTLR end "rule__Marjeh__MatnAssignment_4"


    // $ANTLR start "rule__Marjeh__RomozAssignment_6"
    // InternalQiraa.g:3888:1: rule__Marjeh__RomozAssignment_6 : ( ruleRamz ) ;
    public final void rule__Marjeh__RomozAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3892:1: ( ( ruleRamz ) )
            // InternalQiraa.g:3893:2: ( ruleRamz )
            {
            // InternalQiraa.g:3893:2: ( ruleRamz )
            // InternalQiraa.g:3894:3: ruleRamz
            {
             before(grammarAccess.getMarjehAccess().getRomozRamzParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRamz();

            state._fsp--;

             after(grammarAccess.getMarjehAccess().getRomozRamzParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Marjeh__RomozAssignment_6"


    // $ANTLR start "rule__Marjeh__TafsilAssignment_7"
    // InternalQiraa.g:3903:1: rule__Marjeh__TafsilAssignment_7 : ( ruleTafsil ) ;
    public final void rule__Marjeh__TafsilAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3907:1: ( ( ruleTafsil ) )
            // InternalQiraa.g:3908:2: ( ruleTafsil )
            {
            // InternalQiraa.g:3908:2: ( ruleTafsil )
            // InternalQiraa.g:3909:3: ruleTafsil
            {
             before(grammarAccess.getMarjehAccess().getTafsilTafsilParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTafsil();

            state._fsp--;

             after(grammarAccess.getMarjehAccess().getTafsilTafsilParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Marjeh__TafsilAssignment_7"


    // $ANTLR start "rule__Tafsil__NassAssignment_1"
    // InternalQiraa.g:3918:1: rule__Tafsil__NassAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Tafsil__NassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3922:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3923:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:3923:2: ( RULE_KALEMAH )
            // InternalQiraa.g:3924:3: RULE_KALEMAH
            {
             before(grammarAccess.getTafsilAccess().getNassKALEMAHTerminalRuleCall_1_0()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getTafsilAccess().getNassKALEMAHTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Tafsil__NassAssignment_1"


    // $ANTLR start "rule__Tafsil__KedahAssignment_3"
    // InternalQiraa.g:3933:1: rule__Tafsil__KedahAssignment_3 : ( ruleKaaedah ) ;
    public final void rule__Tafsil__KedahAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3937:1: ( ( ruleKaaedah ) )
            // InternalQiraa.g:3938:2: ( ruleKaaedah )
            {
            // InternalQiraa.g:3938:2: ( ruleKaaedah )
            // InternalQiraa.g:3939:3: ruleKaaedah
            {
             before(grammarAccess.getTafsilAccess().getKedahKaaedahParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleKaaedah();

            state._fsp--;

             after(grammarAccess.getTafsilAccess().getKedahKaaedahParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Tafsil__KedahAssignment_3"


    // $ANTLR start "rule__Kaaedah__RefsAssignment_1"
    // InternalQiraa.g:3948:1: rule__Kaaedah__RefsAssignment_1 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Kaaedah__RefsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3952:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:3953:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:3953:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3954:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getKaaedahAccess().getRefsYokraaLahWaRamzCrossReference_1_0()); 
            // InternalQiraa.g:3955:3: ( RULE_KALEMAH )
            // InternalQiraa.g:3956:4: RULE_KALEMAH
            {
             before(grammarAccess.getKaaedahAccess().getRefsYokraaLahWaRamzKALEMAHTerminalRuleCall_1_0_1()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getKaaedahAccess().getRefsYokraaLahWaRamzKALEMAHTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getKaaedahAccess().getRefsYokraaLahWaRamzCrossReference_1_0()); 

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
    // $ANTLR end "rule__Kaaedah__RefsAssignment_1"


    // $ANTLR start "rule__Kaaedah__KaydAssignment_3"
    // InternalQiraa.g:3967:1: rule__Kaaedah__KaydAssignment_3 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Kaaedah__KaydAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3971:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:3972:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:3972:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3973:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getKaaedahAccess().getKaydKaydCrossReference_3_0()); 
            // InternalQiraa.g:3974:3: ( RULE_KALEMAH )
            // InternalQiraa.g:3975:4: RULE_KALEMAH
            {
             before(grammarAccess.getKaaedahAccess().getKaydKaydKALEMAHTerminalRuleCall_3_0_1()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getKaaedahAccess().getKaydKaydKALEMAHTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getKaaedahAccess().getKaydKaydCrossReference_3_0()); 

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
    // $ANTLR end "rule__Kaaedah__KaydAssignment_3"


    // $ANTLR start "rule__Kaaedah__HarfAssignment_5"
    // InternalQiraa.g:3986:1: rule__Kaaedah__HarfAssignment_5 : ( ruleHarfQuran ) ;
    public final void rule__Kaaedah__HarfAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3990:1: ( ( ruleHarfQuran ) )
            // InternalQiraa.g:3991:2: ( ruleHarfQuran )
            {
            // InternalQiraa.g:3991:2: ( ruleHarfQuran )
            // InternalQiraa.g:3992:3: ruleHarfQuran
            {
             before(grammarAccess.getKaaedahAccess().getHarfHarfQuranParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleHarfQuran();

            state._fsp--;

             after(grammarAccess.getKaaedahAccess().getHarfHarfQuranParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Kaaedah__HarfAssignment_5"


    // $ANTLR start "rule__Matn__NameAssignment_1"
    // InternalQiraa.g:4001:1: rule__Matn__NameAssignment_1 : ( ruleAWORDS ) ;
    public final void rule__Matn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4005:1: ( ( ruleAWORDS ) )
            // InternalQiraa.g:4006:2: ( ruleAWORDS )
            {
            // InternalQiraa.g:4006:2: ( ruleAWORDS )
            // InternalQiraa.g:4007:3: ruleAWORDS
            {
             before(grammarAccess.getMatnAccess().getNameAWORDSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAWORDS();

            state._fsp--;

             after(grammarAccess.getMatnAccess().getNameAWORDSParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Matn__NameAssignment_1"


    // $ANTLR start "rule__Matn__MakatehAssignment_2"
    // InternalQiraa.g:4016:1: rule__Matn__MakatehAssignment_2 : ( ruleMaktah ) ;
    public final void rule__Matn__MakatehAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4020:1: ( ( ruleMaktah ) )
            // InternalQiraa.g:4021:2: ( ruleMaktah )
            {
            // InternalQiraa.g:4021:2: ( ruleMaktah )
            // InternalQiraa.g:4022:3: ruleMaktah
            {
             before(grammarAccess.getMatnAccess().getMakatehMaktahParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMaktah();

            state._fsp--;

             after(grammarAccess.getMatnAccess().getMakatehMaktahParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Matn__MakatehAssignment_2"


    // $ANTLR start "rule__Maktah__NameAssignment_3"
    // InternalQiraa.g:4031:1: rule__Maktah__NameAssignment_3 : ( ruleAWORDS ) ;
    public final void rule__Maktah__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4035:1: ( ( ruleAWORDS ) )
            // InternalQiraa.g:4036:2: ( ruleAWORDS )
            {
            // InternalQiraa.g:4036:2: ( ruleAWORDS )
            // InternalQiraa.g:4037:3: ruleAWORDS
            {
             before(grammarAccess.getMaktahAccess().getNameAWORDSParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAWORDS();

            state._fsp--;

             after(grammarAccess.getMaktahAccess().getNameAWORDSParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Maktah__NameAssignment_3"


    // $ANTLR start "rule__Maktah__AbyatCountAssignment_5"
    // InternalQiraa.g:4046:1: rule__Maktah__AbyatCountAssignment_5 : ( RULE_INT ) ;
    public final void rule__Maktah__AbyatCountAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4050:1: ( ( RULE_INT ) )
            // InternalQiraa.g:4051:2: ( RULE_INT )
            {
            // InternalQiraa.g:4051:2: ( RULE_INT )
            // InternalQiraa.g:4052:3: RULE_INT
            {
             before(grammarAccess.getMaktahAccess().getAbyatCountINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMaktahAccess().getAbyatCountINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Maktah__AbyatCountAssignment_5"


    // $ANTLR start "rule__Maktah__AbyatAssignment_7"
    // InternalQiraa.g:4061:1: rule__Maktah__AbyatAssignment_7 : ( ruleBayt ) ;
    public final void rule__Maktah__AbyatAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4065:1: ( ( ruleBayt ) )
            // InternalQiraa.g:4066:2: ( ruleBayt )
            {
            // InternalQiraa.g:4066:2: ( ruleBayt )
            // InternalQiraa.g:4067:3: ruleBayt
            {
             before(grammarAccess.getMaktahAccess().getAbyatBaytParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleBayt();

            state._fsp--;

             after(grammarAccess.getMaktahAccess().getAbyatBaytParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Maktah__AbyatAssignment_7"


    // $ANTLR start "rule__Bayt__RakmAssignment_0"
    // InternalQiraa.g:4076:1: rule__Bayt__RakmAssignment_0 : ( RULE_INT ) ;
    public final void rule__Bayt__RakmAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4080:1: ( ( RULE_INT ) )
            // InternalQiraa.g:4081:2: ( RULE_INT )
            {
            // InternalQiraa.g:4081:2: ( RULE_INT )
            // InternalQiraa.g:4082:3: RULE_INT
            {
             before(grammarAccess.getBaytAccess().getRakmINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBaytAccess().getRakmINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Bayt__RakmAssignment_0"


    // $ANTLR start "rule__Bayt__SadrAssignment_2"
    // InternalQiraa.g:4091:1: rule__Bayt__SadrAssignment_2 : ( RULE_AWORD ) ;
    public final void rule__Bayt__SadrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4095:1: ( ( RULE_AWORD ) )
            // InternalQiraa.g:4096:2: ( RULE_AWORD )
            {
            // InternalQiraa.g:4096:2: ( RULE_AWORD )
            // InternalQiraa.g:4097:3: RULE_AWORD
            {
             before(grammarAccess.getBaytAccess().getSadrAWORDTerminalRuleCall_2_0()); 
            match(input,RULE_AWORD,FOLLOW_2); 
             after(grammarAccess.getBaytAccess().getSadrAWORDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Bayt__SadrAssignment_2"


    // $ANTLR start "rule__Bayt__AjozAssignment_4"
    // InternalQiraa.g:4106:1: rule__Bayt__AjozAssignment_4 : ( RULE_AWORD ) ;
    public final void rule__Bayt__AjozAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4110:1: ( ( RULE_AWORD ) )
            // InternalQiraa.g:4111:2: ( RULE_AWORD )
            {
            // InternalQiraa.g:4111:2: ( RULE_AWORD )
            // InternalQiraa.g:4112:3: RULE_AWORD
            {
             before(grammarAccess.getBaytAccess().getAjozAWORDTerminalRuleCall_4_0()); 
            match(input,RULE_AWORD,FOLLOW_2); 
             after(grammarAccess.getBaytAccess().getAjozAWORDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Bayt__AjozAssignment_4"


    // $ANTLR start "rule__Person__NameAssignment_0"
    // InternalQiraa.g:4121:1: rule__Person__NameAssignment_0 : ( RULE_KALEMAH ) ;
    public final void rule__Person__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4125:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:4126:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:4126:2: ( RULE_KALEMAH )
            // InternalQiraa.g:4127:3: RULE_KALEMAH
            {
             before(grammarAccess.getPersonAccess().getNameKALEMAHTerminalRuleCall_0_0()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getNameKALEMAHTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Person__NameAssignment_0"


    // $ANTLR start "rule__Person__EsmAssignment_1_1"
    // InternalQiraa.g:4136:1: rule__Person__EsmAssignment_1_1 : ( RULE_KALEMAH ) ;
    public final void rule__Person__EsmAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4140:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:4141:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:4141:2: ( RULE_KALEMAH )
            // InternalQiraa.g:4142:3: RULE_KALEMAH
            {
             before(grammarAccess.getPersonAccess().getEsmKALEMAHTerminalRuleCall_1_1_0()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getEsmKALEMAHTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Person__EsmAssignment_1_1"


    // $ANTLR start "rule__Person__LakabAssignment_2_1"
    // InternalQiraa.g:4151:1: rule__Person__LakabAssignment_2_1 : ( RULE_KALEMAH ) ;
    public final void rule__Person__LakabAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4155:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:4156:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:4156:2: ( RULE_KALEMAH )
            // InternalQiraa.g:4157:3: RULE_KALEMAH
            {
             before(grammarAccess.getPersonAccess().getLakabKALEMAHTerminalRuleCall_2_1_0()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLakabKALEMAHTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Person__LakabAssignment_2_1"


    // $ANTLR start "rule__Person__TowofiaAssignment_3_1"
    // InternalQiraa.g:4166:1: rule__Person__TowofiaAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Person__TowofiaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4170:1: ( ( RULE_INT ) )
            // InternalQiraa.g:4171:2: ( RULE_INT )
            {
            // InternalQiraa.g:4171:2: ( RULE_INT )
            // InternalQiraa.g:4172:3: RULE_INT
            {
             before(grammarAccess.getPersonAccess().getTowofiaINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getTowofiaINTTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Person__TowofiaAssignment_3_1"


    // $ANTLR start "rule__Douaa__DAssignment_0"
    // InternalQiraa.g:4181:1: rule__Douaa__DAssignment_0 : ( ( rule__Douaa__DAlternatives_0_0 ) ) ;
    public final void rule__Douaa__DAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4185:1: ( ( ( rule__Douaa__DAlternatives_0_0 ) ) )
            // InternalQiraa.g:4186:2: ( ( rule__Douaa__DAlternatives_0_0 ) )
            {
            // InternalQiraa.g:4186:2: ( ( rule__Douaa__DAlternatives_0_0 ) )
            // InternalQiraa.g:4187:3: ( rule__Douaa__DAlternatives_0_0 )
            {
             before(grammarAccess.getDouaaAccess().getDAlternatives_0_0()); 
            // InternalQiraa.g:4188:3: ( rule__Douaa__DAlternatives_0_0 )
            // InternalQiraa.g:4188:4: rule__Douaa__DAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Douaa__DAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDouaaAccess().getDAlternatives_0_0()); 

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
    // $ANTLR end "rule__Douaa__DAssignment_0"


    // $ANTLR start "rule__Rawee__QareeAssignment_3"
    // InternalQiraa.g:4196:1: rule__Rawee__QareeAssignment_3 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Rawee__QareeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4200:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:4201:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:4201:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:4202:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getRaweeAccess().getQareeQareeCrossReference_3_0()); 
            // InternalQiraa.g:4203:3: ( RULE_KALEMAH )
            // InternalQiraa.g:4204:4: RULE_KALEMAH
            {
             before(grammarAccess.getRaweeAccess().getQareeQareeKALEMAHTerminalRuleCall_3_0_1()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getRaweeAccess().getQareeQareeKALEMAHTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRaweeAccess().getQareeQareeCrossReference_3_0()); 

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
    // $ANTLR end "rule__Rawee__QareeAssignment_3"


    // $ANTLR start "rule__Tareek__NameAssignment_2"
    // InternalQiraa.g:4215:1: rule__Tareek__NameAssignment_2 : ( RULE_KALEMAH ) ;
    public final void rule__Tareek__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4219:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:4220:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:4220:2: ( RULE_KALEMAH )
            // InternalQiraa.g:4221:3: RULE_KALEMAH
            {
             before(grammarAccess.getTareekAccess().getNameKALEMAHTerminalRuleCall_2_0()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getTareekAccess().getNameKALEMAHTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Tareek__NameAssignment_2"


    // $ANTLR start "rule__Tareek__SimpleAssignment_3_0_0"
    // InternalQiraa.g:4230:1: rule__Tareek__SimpleAssignment_3_0_0 : ( ( '\\u062E\\u0627\\u0644\\u0635' ) ) ;
    public final void rule__Tareek__SimpleAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4234:1: ( ( ( '\\u062E\\u0627\\u0644\\u0635' ) ) )
            // InternalQiraa.g:4235:2: ( ( '\\u062E\\u0627\\u0644\\u0635' ) )
            {
            // InternalQiraa.g:4235:2: ( ( '\\u062E\\u0627\\u0644\\u0635' ) )
            // InternalQiraa.g:4236:3: ( '\\u062E\\u0627\\u0644\\u0635' )
            {
             before(grammarAccess.getTareekAccess().getSimpleArabicLetterKhahArabicLetterAlefArabicLetterLamArabicLetterSadKeyword_3_0_0_0()); 
            // InternalQiraa.g:4237:3: ( '\\u062E\\u0627\\u0644\\u0635' )
            // InternalQiraa.g:4238:4: '\\u062E\\u0627\\u0644\\u0635'
            {
             before(grammarAccess.getTareekAccess().getSimpleArabicLetterKhahArabicLetterAlefArabicLetterLamArabicLetterSadKeyword_3_0_0_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getTareekAccess().getSimpleArabicLetterKhahArabicLetterAlefArabicLetterLamArabicLetterSadKeyword_3_0_0_0()); 

            }

             after(grammarAccess.getTareekAccess().getSimpleArabicLetterKhahArabicLetterAlefArabicLetterLamArabicLetterSadKeyword_3_0_0_0()); 

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
    // $ANTLR end "rule__Tareek__SimpleAssignment_3_0_0"


    // $ANTLR start "rule__Tareek__RefAssignment_3_0_2"
    // InternalQiraa.g:4249:1: rule__Tareek__RefAssignment_3_0_2 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Tareek__RefAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4253:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:4254:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:4254:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:4255:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getTareekAccess().getRefYokraaLahCrossReference_3_0_2_0()); 
            // InternalQiraa.g:4256:3: ( RULE_KALEMAH )
            // InternalQiraa.g:4257:4: RULE_KALEMAH
            {
             before(grammarAccess.getTareekAccess().getRefYokraaLahKALEMAHTerminalRuleCall_3_0_2_0_1()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getTareekAccess().getRefYokraaLahKALEMAHTerminalRuleCall_3_0_2_0_1()); 

            }

             after(grammarAccess.getTareekAccess().getRefYokraaLahCrossReference_3_0_2_0()); 

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
    // $ANTLR end "rule__Tareek__RefAssignment_3_0_2"


    // $ANTLR start "rule__Tareek__ComplexAssignment_3_1_0_0"
    // InternalQiraa.g:4268:1: rule__Tareek__ComplexAssignment_3_1_0_0 : ( ( '\\u0645\\u0631\\u0643\\u0628' ) ) ;
    public final void rule__Tareek__ComplexAssignment_3_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4272:1: ( ( ( '\\u0645\\u0631\\u0643\\u0628' ) ) )
            // InternalQiraa.g:4273:2: ( ( '\\u0645\\u0631\\u0643\\u0628' ) )
            {
            // InternalQiraa.g:4273:2: ( ( '\\u0645\\u0631\\u0643\\u0628' ) )
            // InternalQiraa.g:4274:3: ( '\\u0645\\u0631\\u0643\\u0628' )
            {
             before(grammarAccess.getTareekAccess().getComplexArabicLetterMeemArabicLetterRehArabicLetterKafArabicLetterBehKeyword_3_1_0_0_0()); 
            // InternalQiraa.g:4275:3: ( '\\u0645\\u0631\\u0643\\u0628' )
            // InternalQiraa.g:4276:4: '\\u0645\\u0631\\u0643\\u0628'
            {
             before(grammarAccess.getTareekAccess().getComplexArabicLetterMeemArabicLetterRehArabicLetterKafArabicLetterBehKeyword_3_1_0_0_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getTareekAccess().getComplexArabicLetterMeemArabicLetterRehArabicLetterKafArabicLetterBehKeyword_3_1_0_0_0()); 

            }

             after(grammarAccess.getTareekAccess().getComplexArabicLetterMeemArabicLetterRehArabicLetterKafArabicLetterBehKeyword_3_1_0_0_0()); 

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
    // $ANTLR end "rule__Tareek__ComplexAssignment_3_1_0_0"


    // $ANTLR start "rule__Tareek__RefsAssignment_3_1_1"
    // InternalQiraa.g:4287:1: rule__Tareek__RefsAssignment_3_1_1 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Tareek__RefsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4291:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:4292:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:4292:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:4293:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getTareekAccess().getRefsTareekCrossReference_3_1_1_0()); 
            // InternalQiraa.g:4294:3: ( RULE_KALEMAH )
            // InternalQiraa.g:4295:4: RULE_KALEMAH
            {
             before(grammarAccess.getTareekAccess().getRefsTareekKALEMAHTerminalRuleCall_3_1_1_0_1()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getTareekAccess().getRefsTareekKALEMAHTerminalRuleCall_3_1_1_0_1()); 

            }

             after(grammarAccess.getTareekAccess().getRefsTareekCrossReference_3_1_1_0()); 

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
    // $ANTLR end "rule__Tareek__RefsAssignment_3_1_1"


    // $ANTLR start "rule__Kayd__NameAssignment_1"
    // InternalQiraa.g:4306:1: rule__Kayd__NameAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Kayd__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4310:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:4311:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:4311:2: ( RULE_KALEMAH )
            // InternalQiraa.g:4312:3: RULE_KALEMAH
            {
             before(grammarAccess.getKaydAccess().getNameKALEMAHTerminalRuleCall_1_0()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getKaydAccess().getNameKALEMAHTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Kayd__NameAssignment_1"


    // $ANTLR start "rule__Istelah__NameAssignment_1"
    // InternalQiraa.g:4321:1: rule__Istelah__NameAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Istelah__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4325:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:4326:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:4326:2: ( RULE_KALEMAH )
            // InternalQiraa.g:4327:3: RULE_KALEMAH
            {
             before(grammarAccess.getIstelahAccess().getNameKALEMAHTerminalRuleCall_1_0()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getIstelahAccess().getNameKALEMAHTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Istelah__NameAssignment_1"


    // $ANTLR start "rule__Istelah__RefsAssignment_3"
    // InternalQiraa.g:4336:1: rule__Istelah__RefsAssignment_3 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Istelah__RefsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4340:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:4341:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:4341:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:4342:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getIstelahAccess().getRefsYokraaLahCrossReference_3_0()); 
            // InternalQiraa.g:4343:3: ( RULE_KALEMAH )
            // InternalQiraa.g:4344:4: RULE_KALEMAH
            {
             before(grammarAccess.getIstelahAccess().getRefsYokraaLahKALEMAHTerminalRuleCall_3_0_1()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getIstelahAccess().getRefsYokraaLahKALEMAHTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getIstelahAccess().getRefsYokraaLahCrossReference_3_0()); 

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
    // $ANTLR end "rule__Istelah__RefsAssignment_3"


    // $ANTLR start "rule__Istelah__RefsAssignment_4_1"
    // InternalQiraa.g:4355:1: rule__Istelah__RefsAssignment_4_1 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Istelah__RefsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4359:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:4360:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:4360:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:4361:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getIstelahAccess().getRefsYokraaLahCrossReference_4_1_0()); 
            // InternalQiraa.g:4362:3: ( RULE_KALEMAH )
            // InternalQiraa.g:4363:4: RULE_KALEMAH
            {
             before(grammarAccess.getIstelahAccess().getRefsYokraaLahKALEMAHTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getIstelahAccess().getRefsYokraaLahKALEMAHTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getIstelahAccess().getRefsYokraaLahCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Istelah__RefsAssignment_4_1"


    // $ANTLR start "rule__Ramz__NameAssignment_1"
    // InternalQiraa.g:4374:1: rule__Ramz__NameAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Ramz__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4378:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:4379:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:4379:2: ( RULE_KALEMAH )
            // InternalQiraa.g:4380:3: RULE_KALEMAH
            {
             before(grammarAccess.getRamzAccess().getNameKALEMAHTerminalRuleCall_1_0()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getRamzAccess().getNameKALEMAHTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Ramz__NameAssignment_1"


    // $ANTLR start "rule__Ramz__RefsAssignment_3"
    // InternalQiraa.g:4389:1: rule__Ramz__RefsAssignment_3 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Ramz__RefsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4393:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:4394:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:4394:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:4395:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getRamzAccess().getRefsYokraaLahCrossReference_3_0()); 
            // InternalQiraa.g:4396:3: ( RULE_KALEMAH )
            // InternalQiraa.g:4397:4: RULE_KALEMAH
            {
             before(grammarAccess.getRamzAccess().getRefsYokraaLahKALEMAHTerminalRuleCall_3_0_1()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getRamzAccess().getRefsYokraaLahKALEMAHTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRamzAccess().getRefsYokraaLahCrossReference_3_0()); 

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
    // $ANTLR end "rule__Ramz__RefsAssignment_3"


    // $ANTLR start "rule__Ramz__RefsAssignment_4_1"
    // InternalQiraa.g:4408:1: rule__Ramz__RefsAssignment_4_1 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Ramz__RefsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4412:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:4413:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:4413:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:4414:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getRamzAccess().getRefsYokraaLahCrossReference_4_1_0()); 
            // InternalQiraa.g:4415:3: ( RULE_KALEMAH )
            // InternalQiraa.g:4416:4: RULE_KALEMAH
            {
             before(grammarAccess.getRamzAccess().getRefsYokraaLahKALEMAHTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getRamzAccess().getRefsYokraaLahKALEMAHTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getRamzAccess().getRefsYokraaLahCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Ramz__RefsAssignment_4_1"


    // $ANTLR start "rule__HarfQuran__WordAssignment_0"
    // InternalQiraa.g:4427:1: rule__HarfQuran__WordAssignment_0 : ( RULE_AWORD ) ;
    public final void rule__HarfQuran__WordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4431:1: ( ( RULE_AWORD ) )
            // InternalQiraa.g:4432:2: ( RULE_AWORD )
            {
            // InternalQiraa.g:4432:2: ( RULE_AWORD )
            // InternalQiraa.g:4433:3: RULE_AWORD
            {
             before(grammarAccess.getHarfQuranAccess().getWordAWORDTerminalRuleCall_0_0()); 
            match(input,RULE_AWORD,FOLLOW_2); 
             after(grammarAccess.getHarfQuranAccess().getWordAWORDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__HarfQuran__WordAssignment_0"


    // $ANTLR start "rule__HarfQuran__AyahAssignment_4"
    // InternalQiraa.g:4442:1: rule__HarfQuran__AyahAssignment_4 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__HarfQuran__AyahAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4446:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:4447:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:4447:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:4448:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getHarfQuranAccess().getAyahAyahStartCrossReference_4_0()); 
            // InternalQiraa.g:4449:3: ( RULE_KALEMAH )
            // InternalQiraa.g:4450:4: RULE_KALEMAH
            {
             before(grammarAccess.getHarfQuranAccess().getAyahAyahStartKALEMAHTerminalRuleCall_4_0_1()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getHarfQuranAccess().getAyahAyahStartKALEMAHTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getHarfQuranAccess().getAyahAyahStartCrossReference_4_0()); 

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
    // $ANTLR end "rule__HarfQuran__AyahAssignment_4"


    // $ANTLR start "rule__HarfQuran__MawdeeAssignment_5_1"
    // InternalQiraa.g:4461:1: rule__HarfQuran__MawdeeAssignment_5_1 : ( ruleMawdee ) ;
    public final void rule__HarfQuran__MawdeeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4465:1: ( ( ruleMawdee ) )
            // InternalQiraa.g:4466:2: ( ruleMawdee )
            {
            // InternalQiraa.g:4466:2: ( ruleMawdee )
            // InternalQiraa.g:4467:3: ruleMawdee
            {
             before(grammarAccess.getHarfQuranAccess().getMawdeeMawdeeParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMawdee();

            state._fsp--;

             after(grammarAccess.getHarfQuranAccess().getMawdeeMawdeeParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__HarfQuran__MawdeeAssignment_5_1"


    // $ANTLR start "rule__Harf__NameAssignment_1"
    // InternalQiraa.g:4476:1: rule__Harf__NameAssignment_1 : ( RULE_AWORD ) ;
    public final void rule__Harf__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4480:1: ( ( RULE_AWORD ) )
            // InternalQiraa.g:4481:2: ( RULE_AWORD )
            {
            // InternalQiraa.g:4481:2: ( RULE_AWORD )
            // InternalQiraa.g:4482:3: RULE_AWORD
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
    // InternalQiraa.g:4491:1: rule__Harf__ValuesAssignment_2_0_1 : ( RULE_AWORD ) ;
    public final void rule__Harf__ValuesAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4495:1: ( ( RULE_AWORD ) )
            // InternalQiraa.g:4496:2: ( RULE_AWORD )
            {
            // InternalQiraa.g:4496:2: ( RULE_AWORD )
            // InternalQiraa.g:4497:3: RULE_AWORD
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
    // InternalQiraa.g:4506:1: rule__Harf__ValuesAssignment_2_0_2_1 : ( RULE_AWORD ) ;
    public final void rule__Harf__ValuesAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4510:1: ( ( RULE_AWORD ) )
            // InternalQiraa.g:4511:2: ( RULE_AWORD )
            {
            // InternalQiraa.g:4511:2: ( RULE_AWORD )
            // InternalQiraa.g:4512:3: RULE_AWORD
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
    // InternalQiraa.g:4521:1: rule__Harf__RefAssignment_2_1_1 : ( ( RULE_AWORD ) ) ;
    public final void rule__Harf__RefAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4525:1: ( ( ( RULE_AWORD ) ) )
            // InternalQiraa.g:4526:2: ( ( RULE_AWORD ) )
            {
            // InternalQiraa.g:4526:2: ( ( RULE_AWORD ) )
            // InternalQiraa.g:4527:3: ( RULE_AWORD )
            {
             before(grammarAccess.getHarfAccess().getRefHarfCrossReference_2_1_1_0()); 
            // InternalQiraa.g:4528:3: ( RULE_AWORD )
            // InternalQiraa.g:4529:4: RULE_AWORD
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
    // InternalQiraa.g:4540:1: rule__Harakah__NameAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Harakah__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4544:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:4545:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:4545:2: ( RULE_KALEMAH )
            // InternalQiraa.g:4546:3: RULE_KALEMAH
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
    // InternalQiraa.g:4555:1: rule__Harakah__ValueAssignment_3 : ( RULE_AWORD ) ;
    public final void rule__Harakah__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4559:1: ( ( RULE_AWORD ) )
            // InternalQiraa.g:4560:2: ( RULE_AWORD )
            {
            // InternalQiraa.g:4560:2: ( RULE_AWORD )
            // InternalQiraa.g:4561:3: RULE_AWORD
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
    // InternalQiraa.g:4570:1: rule__AyahStart__SurahAssignment_1 : ( RULE_INT ) ;
    public final void rule__AyahStart__SurahAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4574:1: ( ( RULE_INT ) )
            // InternalQiraa.g:4575:2: ( RULE_INT )
            {
            // InternalQiraa.g:4575:2: ( RULE_INT )
            // InternalQiraa.g:4576:3: RULE_INT
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
    // InternalQiraa.g:4585:1: rule__AyahStart__AyahAssignment_3 : ( RULE_INT ) ;
    public final void rule__AyahStart__AyahAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4589:1: ( ( RULE_INT ) )
            // InternalQiraa.g:4590:2: ( RULE_INT )
            {
            // InternalQiraa.g:4590:2: ( RULE_INT )
            // InternalQiraa.g:4591:3: RULE_INT
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
    // InternalQiraa.g:4600:1: rule__AyahStart__NameAssignment_4 : ( RULE_KALEMAH ) ;
    public final void rule__AyahStart__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4604:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:4605:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:4605:2: ( RULE_KALEMAH )
            // InternalQiraa.g:4606:3: RULE_KALEMAH
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
    // InternalQiraa.g:4615:1: rule__Phrase__BasmalahAssignment_0 : ( RULE_BASMALAH ) ;
    public final void rule__Phrase__BasmalahAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4619:1: ( ( RULE_BASMALAH ) )
            // InternalQiraa.g:4620:2: ( RULE_BASMALAH )
            {
            // InternalQiraa.g:4620:2: ( RULE_BASMALAH )
            // InternalQiraa.g:4621:3: RULE_BASMALAH
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
    // InternalQiraa.g:4630:1: rule__Phrase__WordsAssignment_1 : ( RULE_AWORD ) ;
    public final void rule__Phrase__WordsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4634:1: ( ( RULE_AWORD ) )
            // InternalQiraa.g:4635:2: ( RULE_AWORD )
            {
            // InternalQiraa.g:4635:2: ( RULE_AWORD )
            // InternalQiraa.g:4636:3: RULE_AWORD
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0400000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0400000100000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});

}