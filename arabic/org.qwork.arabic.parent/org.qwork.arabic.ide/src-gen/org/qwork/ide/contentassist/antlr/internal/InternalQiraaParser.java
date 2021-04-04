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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_KALEMAH", "RULE_INT", "RULE_AWORD", "RULE_ALETTER", "RULE_AHARAKAH", "RULE_ADIGIT", "RULE_ASHADDAH", "RULE_ANONLETTER", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'\\u0631\\u062D\\u0645\\u0647'", "'\\u0623\\u0643\\u0631\\u0645\\u0647'", "'\\u0627\\u0644\\u0623\\u0648\\u0644'", "'\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A'", "'\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B'", "'\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631'", "'\\u0642\\u0627\\u0631\\u0626'", "'\\u0631\\u0627\\u0648'", "'\\u0639\\u0646'", "'\\u0627\\u0633\\u0645\\u0647'", "'\\u0644\\u0642\\u0628\\u0647'", "'\\u062A\\u0648\\u0641\\u064A'", "'\\u0627\\u0644\\u0644\\u0647'", "'\\u0637\\u0631\\u064A\\u0642'", "'\\u062A\\u0644\\u0627\\u0648\\u0629'", "'\\u0644'", "'\\u0645\\u0646'", "'\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645'", "'\\u0645\\u0631\\u062C\\u0639'", "'\\u0644\\u0644\\u0625\\u0645\\u0627\\u0645'", "'\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647'", "'\\u0627\\u0646\\u062A\\u0647\\u0649'", "'\\u0642\\u0648\\u0644\\u0647'", "'\\u0645\\u0639\\u0646\\u0627\\u0647'", "'\\u0642\\u064A\\u062F'", "'\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D'", "'\\u064A\\u0639\\u0646\\u064A'", "'\\u0648'", "'\\u0631\\u0645\\u0632'", "'\\u0642\\u0631\\u0623'", "'\\u0628'", "'\\u0641\\u064A'", "'\\u062A\\u0639\\u0627\\u0644\\u0649'", "'\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639'", "'\\u062D\\u0631\\u0641'", "'\\u0647\\u0648'", "'\\u0623\\u0648'", "'\\u0630\\u0627\\u062A\\u0647'", "'\\u062D\\u0631\\u0643\\u0629'", "'\\u0647\\u064A'", "'\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'", "'\\u0627\\u0644\\u0622\\u064A\\u0629'", "'\\u062E\\u0627\\u0644\\u0635'", "'\\u0645\\u0631\\u0643\\u0628'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_KALEMAH=5;
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
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int RULE_AWORD=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_AHARAKAH=9;
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
    public static final int RULE_ALETTER=8;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=4;
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
    // InternalQiraa.g:62:1: ruleQiraaModel : ( ( rule__QiraaModel__Alternatives )* ) ;
    public final void ruleQiraaModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:66:2: ( ( ( rule__QiraaModel__Alternatives )* ) )
            // InternalQiraa.g:67:2: ( ( rule__QiraaModel__Alternatives )* )
            {
            // InternalQiraa.g:67:2: ( ( rule__QiraaModel__Alternatives )* )
            // InternalQiraa.g:68:3: ( rule__QiraaModel__Alternatives )*
            {
             before(grammarAccess.getQiraaModelAccess().getAlternatives()); 
            // InternalQiraa.g:69:3: ( rule__QiraaModel__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=24 && LA1_0<=25)||LA1_0==31||(LA1_0>=35 && LA1_0<=36)||(LA1_0>=42 && LA1_0<=43)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQiraa.g:69:4: rule__QiraaModel__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__QiraaModel__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getQiraaModelAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleQaree"
    // InternalQiraa.g:78:1: entryRuleQaree : ruleQaree EOF ;
    public final void entryRuleQaree() throws RecognitionException {
        try {
            // InternalQiraa.g:79:1: ( ruleQaree EOF )
            // InternalQiraa.g:80:1: ruleQaree EOF
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
    // InternalQiraa.g:87:1: ruleQaree : ( ( rule__Qaree__Group__0 ) ) ;
    public final void ruleQaree() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:91:2: ( ( ( rule__Qaree__Group__0 ) ) )
            // InternalQiraa.g:92:2: ( ( rule__Qaree__Group__0 ) )
            {
            // InternalQiraa.g:92:2: ( ( rule__Qaree__Group__0 ) )
            // InternalQiraa.g:93:3: ( rule__Qaree__Group__0 )
            {
             before(grammarAccess.getQareeAccess().getGroup()); 
            // InternalQiraa.g:94:3: ( rule__Qaree__Group__0 )
            // InternalQiraa.g:94:4: rule__Qaree__Group__0
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
    // InternalQiraa.g:103:1: entryRuleRawee : ruleRawee EOF ;
    public final void entryRuleRawee() throws RecognitionException {
        try {
            // InternalQiraa.g:104:1: ( ruleRawee EOF )
            // InternalQiraa.g:105:1: ruleRawee EOF
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
    // InternalQiraa.g:112:1: ruleRawee : ( ( rule__Rawee__Group__0 ) ) ;
    public final void ruleRawee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:116:2: ( ( ( rule__Rawee__Group__0 ) ) )
            // InternalQiraa.g:117:2: ( ( rule__Rawee__Group__0 ) )
            {
            // InternalQiraa.g:117:2: ( ( rule__Rawee__Group__0 ) )
            // InternalQiraa.g:118:3: ( rule__Rawee__Group__0 )
            {
             before(grammarAccess.getRaweeAccess().getGroup()); 
            // InternalQiraa.g:119:3: ( rule__Rawee__Group__0 )
            // InternalQiraa.g:119:4: rule__Rawee__Group__0
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
    // InternalQiraa.g:128:1: entryRuleYokraaLah : ruleYokraaLah EOF ;
    public final void entryRuleYokraaLah() throws RecognitionException {
        try {
            // InternalQiraa.g:129:1: ( ruleYokraaLah EOF )
            // InternalQiraa.g:130:1: ruleYokraaLah EOF
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
    // InternalQiraa.g:137:1: ruleYokraaLah : ( ( rule__YokraaLah__Alternatives ) ) ;
    public final void ruleYokraaLah() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:141:2: ( ( ( rule__YokraaLah__Alternatives ) ) )
            // InternalQiraa.g:142:2: ( ( rule__YokraaLah__Alternatives ) )
            {
            // InternalQiraa.g:142:2: ( ( rule__YokraaLah__Alternatives ) )
            // InternalQiraa.g:143:3: ( rule__YokraaLah__Alternatives )
            {
             before(grammarAccess.getYokraaLahAccess().getAlternatives()); 
            // InternalQiraa.g:144:3: ( rule__YokraaLah__Alternatives )
            // InternalQiraa.g:144:4: rule__YokraaLah__Alternatives
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


    // $ANTLR start "rulePerson"
    // InternalQiraa.g:154:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:158:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalQiraa.g:159:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalQiraa.g:159:2: ( ( rule__Person__Group__0 ) )
            // InternalQiraa.g:160:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalQiraa.g:161:3: ( rule__Person__Group__0 )
            // InternalQiraa.g:161:4: rule__Person__Group__0
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
    // InternalQiraa.g:171:1: ruleDouaa : ( ( rule__Douaa__Group__0 ) ) ;
    public final void ruleDouaa() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:175:2: ( ( ( rule__Douaa__Group__0 ) ) )
            // InternalQiraa.g:176:2: ( ( rule__Douaa__Group__0 ) )
            {
            // InternalQiraa.g:176:2: ( ( rule__Douaa__Group__0 ) )
            // InternalQiraa.g:177:3: ( rule__Douaa__Group__0 )
            {
             before(grammarAccess.getDouaaAccess().getGroup()); 
            // InternalQiraa.g:178:3: ( rule__Douaa__Group__0 )
            // InternalQiraa.g:178:4: rule__Douaa__Group__0
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


    // $ANTLR start "entryRuleTareek"
    // InternalQiraa.g:187:1: entryRuleTareek : ruleTareek EOF ;
    public final void entryRuleTareek() throws RecognitionException {
        try {
            // InternalQiraa.g:188:1: ( ruleTareek EOF )
            // InternalQiraa.g:189:1: ruleTareek EOF
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
    // InternalQiraa.g:196:1: ruleTareek : ( ( rule__Tareek__Group__0 ) ) ;
    public final void ruleTareek() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:200:2: ( ( ( rule__Tareek__Group__0 ) ) )
            // InternalQiraa.g:201:2: ( ( rule__Tareek__Group__0 ) )
            {
            // InternalQiraa.g:201:2: ( ( rule__Tareek__Group__0 ) )
            // InternalQiraa.g:202:3: ( rule__Tareek__Group__0 )
            {
             before(grammarAccess.getTareekAccess().getGroup()); 
            // InternalQiraa.g:203:3: ( rule__Tareek__Group__0 )
            // InternalQiraa.g:203:4: rule__Tareek__Group__0
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


    // $ANTLR start "entryRuleIMAM"
    // InternalQiraa.g:212:1: entryRuleIMAM : ruleIMAM EOF ;
    public final void entryRuleIMAM() throws RecognitionException {
        try {
            // InternalQiraa.g:213:1: ( ruleIMAM EOF )
            // InternalQiraa.g:214:1: ruleIMAM EOF
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
    // InternalQiraa.g:221:1: ruleIMAM : ( ( rule__IMAM__Group__0 ) ) ;
    public final void ruleIMAM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:225:2: ( ( ( rule__IMAM__Group__0 ) ) )
            // InternalQiraa.g:226:2: ( ( rule__IMAM__Group__0 ) )
            {
            // InternalQiraa.g:226:2: ( ( rule__IMAM__Group__0 ) )
            // InternalQiraa.g:227:3: ( rule__IMAM__Group__0 )
            {
             before(grammarAccess.getIMAMAccess().getGroup()); 
            // InternalQiraa.g:228:3: ( rule__IMAM__Group__0 )
            // InternalQiraa.g:228:4: rule__IMAM__Group__0
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


    // $ANTLR start "entryRuleMarjeh"
    // InternalQiraa.g:237:1: entryRuleMarjeh : ruleMarjeh EOF ;
    public final void entryRuleMarjeh() throws RecognitionException {
        try {
            // InternalQiraa.g:238:1: ( ruleMarjeh EOF )
            // InternalQiraa.g:239:1: ruleMarjeh EOF
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
    // InternalQiraa.g:246:1: ruleMarjeh : ( ( rule__Marjeh__Group__0 ) ) ;
    public final void ruleMarjeh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:250:2: ( ( ( rule__Marjeh__Group__0 ) ) )
            // InternalQiraa.g:251:2: ( ( rule__Marjeh__Group__0 ) )
            {
            // InternalQiraa.g:251:2: ( ( rule__Marjeh__Group__0 ) )
            // InternalQiraa.g:252:3: ( rule__Marjeh__Group__0 )
            {
             before(grammarAccess.getMarjehAccess().getGroup()); 
            // InternalQiraa.g:253:3: ( rule__Marjeh__Group__0 )
            // InternalQiraa.g:253:4: rule__Marjeh__Group__0
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


    // $ANTLR start "entryRuleMaktah"
    // InternalQiraa.g:262:1: entryRuleMaktah : ruleMaktah EOF ;
    public final void entryRuleMaktah() throws RecognitionException {
        try {
            // InternalQiraa.g:263:1: ( ruleMaktah EOF )
            // InternalQiraa.g:264:1: ruleMaktah EOF
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
    // InternalQiraa.g:271:1: ruleMaktah : ( ( rule__Maktah__Group__0 ) ) ;
    public final void ruleMaktah() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:275:2: ( ( ( rule__Maktah__Group__0 ) ) )
            // InternalQiraa.g:276:2: ( ( rule__Maktah__Group__0 ) )
            {
            // InternalQiraa.g:276:2: ( ( rule__Maktah__Group__0 ) )
            // InternalQiraa.g:277:3: ( rule__Maktah__Group__0 )
            {
             before(grammarAccess.getMaktahAccess().getGroup()); 
            // InternalQiraa.g:278:3: ( rule__Maktah__Group__0 )
            // InternalQiraa.g:278:4: rule__Maktah__Group__0
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


    // $ANTLR start "entryRuleKayd"
    // InternalQiraa.g:287:1: entryRuleKayd : ruleKayd EOF ;
    public final void entryRuleKayd() throws RecognitionException {
        try {
            // InternalQiraa.g:288:1: ( ruleKayd EOF )
            // InternalQiraa.g:289:1: ruleKayd EOF
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
    // InternalQiraa.g:296:1: ruleKayd : ( ( rule__Kayd__Group__0 ) ) ;
    public final void ruleKayd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:300:2: ( ( ( rule__Kayd__Group__0 ) ) )
            // InternalQiraa.g:301:2: ( ( rule__Kayd__Group__0 ) )
            {
            // InternalQiraa.g:301:2: ( ( rule__Kayd__Group__0 ) )
            // InternalQiraa.g:302:3: ( rule__Kayd__Group__0 )
            {
             before(grammarAccess.getKaydAccess().getGroup()); 
            // InternalQiraa.g:303:3: ( rule__Kayd__Group__0 )
            // InternalQiraa.g:303:4: rule__Kayd__Group__0
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
    // InternalQiraa.g:312:1: entryRuleIstelah : ruleIstelah EOF ;
    public final void entryRuleIstelah() throws RecognitionException {
        try {
            // InternalQiraa.g:313:1: ( ruleIstelah EOF )
            // InternalQiraa.g:314:1: ruleIstelah EOF
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
    // InternalQiraa.g:321:1: ruleIstelah : ( ( rule__Istelah__Group__0 ) ) ;
    public final void ruleIstelah() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:325:2: ( ( ( rule__Istelah__Group__0 ) ) )
            // InternalQiraa.g:326:2: ( ( rule__Istelah__Group__0 ) )
            {
            // InternalQiraa.g:326:2: ( ( rule__Istelah__Group__0 ) )
            // InternalQiraa.g:327:3: ( rule__Istelah__Group__0 )
            {
             before(grammarAccess.getIstelahAccess().getGroup()); 
            // InternalQiraa.g:328:3: ( rule__Istelah__Group__0 )
            // InternalQiraa.g:328:4: rule__Istelah__Group__0
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
    // InternalQiraa.g:337:1: entryRuleRamz : ruleRamz EOF ;
    public final void entryRuleRamz() throws RecognitionException {
        try {
            // InternalQiraa.g:338:1: ( ruleRamz EOF )
            // InternalQiraa.g:339:1: ruleRamz EOF
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
    // InternalQiraa.g:346:1: ruleRamz : ( ( rule__Ramz__Group__0 ) ) ;
    public final void ruleRamz() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:350:2: ( ( ( rule__Ramz__Group__0 ) ) )
            // InternalQiraa.g:351:2: ( ( rule__Ramz__Group__0 ) )
            {
            // InternalQiraa.g:351:2: ( ( rule__Ramz__Group__0 ) )
            // InternalQiraa.g:352:3: ( rule__Ramz__Group__0 )
            {
             before(grammarAccess.getRamzAccess().getGroup()); 
            // InternalQiraa.g:353:3: ( rule__Ramz__Group__0 )
            // InternalQiraa.g:353:4: rule__Ramz__Group__0
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


    // $ANTLR start "entryRuleKaaedah"
    // InternalQiraa.g:362:1: entryRuleKaaedah : ruleKaaedah EOF ;
    public final void entryRuleKaaedah() throws RecognitionException {
        try {
            // InternalQiraa.g:363:1: ( ruleKaaedah EOF )
            // InternalQiraa.g:364:1: ruleKaaedah EOF
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
    // InternalQiraa.g:371:1: ruleKaaedah : ( ( rule__Kaaedah__Group__0 ) ) ;
    public final void ruleKaaedah() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:375:2: ( ( ( rule__Kaaedah__Group__0 ) ) )
            // InternalQiraa.g:376:2: ( ( rule__Kaaedah__Group__0 ) )
            {
            // InternalQiraa.g:376:2: ( ( rule__Kaaedah__Group__0 ) )
            // InternalQiraa.g:377:3: ( rule__Kaaedah__Group__0 )
            {
             before(grammarAccess.getKaaedahAccess().getGroup()); 
            // InternalQiraa.g:378:3: ( rule__Kaaedah__Group__0 )
            // InternalQiraa.g:378:4: rule__Kaaedah__Group__0
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


    // $ANTLR start "entryRuleHarfQuran"
    // InternalQiraa.g:387:1: entryRuleHarfQuran : ruleHarfQuran EOF ;
    public final void entryRuleHarfQuran() throws RecognitionException {
        try {
            // InternalQiraa.g:388:1: ( ruleHarfQuran EOF )
            // InternalQiraa.g:389:1: ruleHarfQuran EOF
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
    // InternalQiraa.g:396:1: ruleHarfQuran : ( ( rule__HarfQuran__Group__0 ) ) ;
    public final void ruleHarfQuran() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:400:2: ( ( ( rule__HarfQuran__Group__0 ) ) )
            // InternalQiraa.g:401:2: ( ( rule__HarfQuran__Group__0 ) )
            {
            // InternalQiraa.g:401:2: ( ( rule__HarfQuran__Group__0 ) )
            // InternalQiraa.g:402:3: ( rule__HarfQuran__Group__0 )
            {
             before(grammarAccess.getHarfQuranAccess().getGroup()); 
            // InternalQiraa.g:403:3: ( rule__HarfQuran__Group__0 )
            // InternalQiraa.g:403:4: rule__HarfQuran__Group__0
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
    // InternalQiraa.g:412:1: entryRuleMawdee : ruleMawdee EOF ;
    public final void entryRuleMawdee() throws RecognitionException {
        try {
            // InternalQiraa.g:413:1: ( ruleMawdee EOF )
            // InternalQiraa.g:414:1: ruleMawdee EOF
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
    // InternalQiraa.g:421:1: ruleMawdee : ( ( rule__Mawdee__Alternatives ) ) ;
    public final void ruleMawdee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:425:2: ( ( ( rule__Mawdee__Alternatives ) ) )
            // InternalQiraa.g:426:2: ( ( rule__Mawdee__Alternatives ) )
            {
            // InternalQiraa.g:426:2: ( ( rule__Mawdee__Alternatives ) )
            // InternalQiraa.g:427:3: ( rule__Mawdee__Alternatives )
            {
             before(grammarAccess.getMawdeeAccess().getAlternatives()); 
            // InternalQiraa.g:428:3: ( rule__Mawdee__Alternatives )
            // InternalQiraa.g:428:4: rule__Mawdee__Alternatives
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
    // InternalQiraa.g:437:1: entryRuleHarf : ruleHarf EOF ;
    public final void entryRuleHarf() throws RecognitionException {
        try {
            // InternalQiraa.g:438:1: ( ruleHarf EOF )
            // InternalQiraa.g:439:1: ruleHarf EOF
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
    // InternalQiraa.g:446:1: ruleHarf : ( ( rule__Harf__Group__0 ) ) ;
    public final void ruleHarf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:450:2: ( ( ( rule__Harf__Group__0 ) ) )
            // InternalQiraa.g:451:2: ( ( rule__Harf__Group__0 ) )
            {
            // InternalQiraa.g:451:2: ( ( rule__Harf__Group__0 ) )
            // InternalQiraa.g:452:3: ( rule__Harf__Group__0 )
            {
             before(grammarAccess.getHarfAccess().getGroup()); 
            // InternalQiraa.g:453:3: ( rule__Harf__Group__0 )
            // InternalQiraa.g:453:4: rule__Harf__Group__0
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
    // InternalQiraa.g:462:1: entryRuleHarakah : ruleHarakah EOF ;
    public final void entryRuleHarakah() throws RecognitionException {
        try {
            // InternalQiraa.g:463:1: ( ruleHarakah EOF )
            // InternalQiraa.g:464:1: ruleHarakah EOF
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
    // InternalQiraa.g:471:1: ruleHarakah : ( ( rule__Harakah__Group__0 ) ) ;
    public final void ruleHarakah() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:475:2: ( ( ( rule__Harakah__Group__0 ) ) )
            // InternalQiraa.g:476:2: ( ( rule__Harakah__Group__0 ) )
            {
            // InternalQiraa.g:476:2: ( ( rule__Harakah__Group__0 ) )
            // InternalQiraa.g:477:3: ( rule__Harakah__Group__0 )
            {
             before(grammarAccess.getHarakahAccess().getGroup()); 
            // InternalQiraa.g:478:3: ( rule__Harakah__Group__0 )
            // InternalQiraa.g:478:4: rule__Harakah__Group__0
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
    // InternalQiraa.g:487:1: entryRuleAyahStart : ruleAyahStart EOF ;
    public final void entryRuleAyahStart() throws RecognitionException {
        try {
            // InternalQiraa.g:488:1: ( ruleAyahStart EOF )
            // InternalQiraa.g:489:1: ruleAyahStart EOF
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
    // InternalQiraa.g:496:1: ruleAyahStart : ( ( rule__AyahStart__Group__0 ) ) ;
    public final void ruleAyahStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:500:2: ( ( ( rule__AyahStart__Group__0 ) ) )
            // InternalQiraa.g:501:2: ( ( rule__AyahStart__Group__0 ) )
            {
            // InternalQiraa.g:501:2: ( ( rule__AyahStart__Group__0 ) )
            // InternalQiraa.g:502:3: ( rule__AyahStart__Group__0 )
            {
             before(grammarAccess.getAyahStartAccess().getGroup()); 
            // InternalQiraa.g:503:3: ( rule__AyahStart__Group__0 )
            // InternalQiraa.g:503:4: rule__AyahStart__Group__0
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
    // InternalQiraa.g:512:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // InternalQiraa.g:513:1: ( rulePhrase EOF )
            // InternalQiraa.g:514:1: rulePhrase EOF
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
    // InternalQiraa.g:521:1: rulePhrase : ( ( rule__Phrase__Group__0 ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:525:2: ( ( ( rule__Phrase__Group__0 ) ) )
            // InternalQiraa.g:526:2: ( ( rule__Phrase__Group__0 ) )
            {
            // InternalQiraa.g:526:2: ( ( rule__Phrase__Group__0 ) )
            // InternalQiraa.g:527:3: ( rule__Phrase__Group__0 )
            {
             before(grammarAccess.getPhraseAccess().getGroup()); 
            // InternalQiraa.g:528:3: ( rule__Phrase__Group__0 )
            // InternalQiraa.g:528:4: rule__Phrase__Group__0
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


    // $ANTLR start "rule__QiraaModel__Alternatives"
    // InternalQiraa.g:536:1: rule__QiraaModel__Alternatives : ( ( ( rule__QiraaModel__QoraaAssignment_0 ) ) | ( ( rule__QiraaModel__TorokAssignment_1 ) ) | ( ( rule__QiraaModel__RowatAssignment_2 ) ) | ( ( rule__QiraaModel__ImamsAssignment_3 ) ) | ( ( rule__QiraaModel__MarjeeAssignment_4 ) ) | ( ( rule__QiraaModel__IstelahatAssignment_5 ) ) | ( ( rule__QiraaModel__KoyodAssignment_6 ) ) );
    public final void rule__QiraaModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:540:1: ( ( ( rule__QiraaModel__QoraaAssignment_0 ) ) | ( ( rule__QiraaModel__TorokAssignment_1 ) ) | ( ( rule__QiraaModel__RowatAssignment_2 ) ) | ( ( rule__QiraaModel__ImamsAssignment_3 ) ) | ( ( rule__QiraaModel__MarjeeAssignment_4 ) ) | ( ( rule__QiraaModel__IstelahatAssignment_5 ) ) | ( ( rule__QiraaModel__KoyodAssignment_6 ) ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            case 35:
                {
                alt2=4;
                }
                break;
            case 36:
                {
                alt2=5;
                }
                break;
            case 43:
                {
                alt2=6;
                }
                break;
            case 42:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQiraa.g:541:2: ( ( rule__QiraaModel__QoraaAssignment_0 ) )
                    {
                    // InternalQiraa.g:541:2: ( ( rule__QiraaModel__QoraaAssignment_0 ) )
                    // InternalQiraa.g:542:3: ( rule__QiraaModel__QoraaAssignment_0 )
                    {
                     before(grammarAccess.getQiraaModelAccess().getQoraaAssignment_0()); 
                    // InternalQiraa.g:543:3: ( rule__QiraaModel__QoraaAssignment_0 )
                    // InternalQiraa.g:543:4: rule__QiraaModel__QoraaAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QiraaModel__QoraaAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQiraaModelAccess().getQoraaAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQiraa.g:547:2: ( ( rule__QiraaModel__TorokAssignment_1 ) )
                    {
                    // InternalQiraa.g:547:2: ( ( rule__QiraaModel__TorokAssignment_1 ) )
                    // InternalQiraa.g:548:3: ( rule__QiraaModel__TorokAssignment_1 )
                    {
                     before(grammarAccess.getQiraaModelAccess().getTorokAssignment_1()); 
                    // InternalQiraa.g:549:3: ( rule__QiraaModel__TorokAssignment_1 )
                    // InternalQiraa.g:549:4: rule__QiraaModel__TorokAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__QiraaModel__TorokAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getQiraaModelAccess().getTorokAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQiraa.g:553:2: ( ( rule__QiraaModel__RowatAssignment_2 ) )
                    {
                    // InternalQiraa.g:553:2: ( ( rule__QiraaModel__RowatAssignment_2 ) )
                    // InternalQiraa.g:554:3: ( rule__QiraaModel__RowatAssignment_2 )
                    {
                     before(grammarAccess.getQiraaModelAccess().getRowatAssignment_2()); 
                    // InternalQiraa.g:555:3: ( rule__QiraaModel__RowatAssignment_2 )
                    // InternalQiraa.g:555:4: rule__QiraaModel__RowatAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__QiraaModel__RowatAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getQiraaModelAccess().getRowatAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQiraa.g:559:2: ( ( rule__QiraaModel__ImamsAssignment_3 ) )
                    {
                    // InternalQiraa.g:559:2: ( ( rule__QiraaModel__ImamsAssignment_3 ) )
                    // InternalQiraa.g:560:3: ( rule__QiraaModel__ImamsAssignment_3 )
                    {
                     before(grammarAccess.getQiraaModelAccess().getImamsAssignment_3()); 
                    // InternalQiraa.g:561:3: ( rule__QiraaModel__ImamsAssignment_3 )
                    // InternalQiraa.g:561:4: rule__QiraaModel__ImamsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__QiraaModel__ImamsAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getQiraaModelAccess().getImamsAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQiraa.g:565:2: ( ( rule__QiraaModel__MarjeeAssignment_4 ) )
                    {
                    // InternalQiraa.g:565:2: ( ( rule__QiraaModel__MarjeeAssignment_4 ) )
                    // InternalQiraa.g:566:3: ( rule__QiraaModel__MarjeeAssignment_4 )
                    {
                     before(grammarAccess.getQiraaModelAccess().getMarjeeAssignment_4()); 
                    // InternalQiraa.g:567:3: ( rule__QiraaModel__MarjeeAssignment_4 )
                    // InternalQiraa.g:567:4: rule__QiraaModel__MarjeeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__QiraaModel__MarjeeAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getQiraaModelAccess().getMarjeeAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQiraa.g:571:2: ( ( rule__QiraaModel__IstelahatAssignment_5 ) )
                    {
                    // InternalQiraa.g:571:2: ( ( rule__QiraaModel__IstelahatAssignment_5 ) )
                    // InternalQiraa.g:572:3: ( rule__QiraaModel__IstelahatAssignment_5 )
                    {
                     before(grammarAccess.getQiraaModelAccess().getIstelahatAssignment_5()); 
                    // InternalQiraa.g:573:3: ( rule__QiraaModel__IstelahatAssignment_5 )
                    // InternalQiraa.g:573:4: rule__QiraaModel__IstelahatAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__QiraaModel__IstelahatAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getQiraaModelAccess().getIstelahatAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQiraa.g:577:2: ( ( rule__QiraaModel__KoyodAssignment_6 ) )
                    {
                    // InternalQiraa.g:577:2: ( ( rule__QiraaModel__KoyodAssignment_6 ) )
                    // InternalQiraa.g:578:3: ( rule__QiraaModel__KoyodAssignment_6 )
                    {
                     before(grammarAccess.getQiraaModelAccess().getKoyodAssignment_6()); 
                    // InternalQiraa.g:579:3: ( rule__QiraaModel__KoyodAssignment_6 )
                    // InternalQiraa.g:579:4: rule__QiraaModel__KoyodAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__QiraaModel__KoyodAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getQiraaModelAccess().getKoyodAssignment_6()); 

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
    // $ANTLR end "rule__QiraaModel__Alternatives"


    // $ANTLR start "rule__YokraaLah__Alternatives"
    // InternalQiraa.g:587:1: rule__YokraaLah__Alternatives : ( ( ruleQaree ) | ( ruleRawee ) | ( ruleIstelah ) );
    public final void rule__YokraaLah__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:591:1: ( ( ruleQaree ) | ( ruleRawee ) | ( ruleIstelah ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt3=1;
                }
                break;
            case 25:
                {
                alt3=2;
                }
                break;
            case 43:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalQiraa.g:592:2: ( ruleQaree )
                    {
                    // InternalQiraa.g:592:2: ( ruleQaree )
                    // InternalQiraa.g:593:3: ruleQaree
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
                    // InternalQiraa.g:598:2: ( ruleRawee )
                    {
                    // InternalQiraa.g:598:2: ( ruleRawee )
                    // InternalQiraa.g:599:3: ruleRawee
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
                    // InternalQiraa.g:604:2: ( ruleIstelah )
                    {
                    // InternalQiraa.g:604:2: ( ruleIstelah )
                    // InternalQiraa.g:605:3: ruleIstelah
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


    // $ANTLR start "rule__Douaa__DAlternatives_0_0"
    // InternalQiraa.g:614:1: rule__Douaa__DAlternatives_0_0 : ( ( '\\u0631\\u062D\\u0645\\u0647' ) | ( '\\u0623\\u0643\\u0631\\u0645\\u0647' ) );
    public final void rule__Douaa__DAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:618:1: ( ( '\\u0631\\u062D\\u0645\\u0647' ) | ( '\\u0623\\u0643\\u0631\\u0645\\u0647' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQiraa.g:619:2: ( '\\u0631\\u062D\\u0645\\u0647' )
                    {
                    // InternalQiraa.g:619:2: ( '\\u0631\\u062D\\u0645\\u0647' )
                    // InternalQiraa.g:620:3: '\\u0631\\u062D\\u0645\\u0647'
                    {
                     before(grammarAccess.getDouaaAccess().getDArabicLetterRehArabicLetterHahArabicLetterMeemArabicLetterHehKeyword_0_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getDouaaAccess().getDArabicLetterRehArabicLetterHahArabicLetterMeemArabicLetterHehKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQiraa.g:625:2: ( '\\u0623\\u0643\\u0631\\u0645\\u0647' )
                    {
                    // InternalQiraa.g:625:2: ( '\\u0623\\u0643\\u0631\\u0645\\u0647' )
                    // InternalQiraa.g:626:3: '\\u0623\\u0643\\u0631\\u0645\\u0647'
                    {
                     before(grammarAccess.getDouaaAccess().getDArabicLetterAlefWithHamzaAboveArabicLetterKafArabicLetterRehArabicLetterMeemArabicLetterHehKeyword_0_0_1()); 
                    match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__Tareek__Alternatives_3"
    // InternalQiraa.g:635:1: rule__Tareek__Alternatives_3 : ( ( ( rule__Tareek__Group_3_0__0 ) ) | ( ( rule__Tareek__Group_3_1__0 ) ) );
    public final void rule__Tareek__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:639:1: ( ( ( rule__Tareek__Group_3_0__0 ) ) | ( ( rule__Tareek__Group_3_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==60) ) {
                alt5=1;
            }
            else if ( (LA5_0==61) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalQiraa.g:640:2: ( ( rule__Tareek__Group_3_0__0 ) )
                    {
                    // InternalQiraa.g:640:2: ( ( rule__Tareek__Group_3_0__0 ) )
                    // InternalQiraa.g:641:3: ( rule__Tareek__Group_3_0__0 )
                    {
                     before(grammarAccess.getTareekAccess().getGroup_3_0()); 
                    // InternalQiraa.g:642:3: ( rule__Tareek__Group_3_0__0 )
                    // InternalQiraa.g:642:4: rule__Tareek__Group_3_0__0
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
                    // InternalQiraa.g:646:2: ( ( rule__Tareek__Group_3_1__0 ) )
                    {
                    // InternalQiraa.g:646:2: ( ( rule__Tareek__Group_3_1__0 ) )
                    // InternalQiraa.g:647:3: ( rule__Tareek__Group_3_1__0 )
                    {
                     before(grammarAccess.getTareekAccess().getGroup_3_1()); 
                    // InternalQiraa.g:648:3: ( rule__Tareek__Group_3_1__0 )
                    // InternalQiraa.g:648:4: rule__Tareek__Group_3_1__0
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
    // InternalQiraa.g:656:1: rule__Mawdee__Alternatives : ( ( '\\u0627\\u0644\\u0623\\u0648\\u0644' ) | ( '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' ) | ( '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' ) | ( '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' ) );
    public final void rule__Mawdee__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:660:1: ( ( '\\u0627\\u0644\\u0623\\u0648\\u0644' ) | ( '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' ) | ( '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' ) | ( '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            case 23:
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
                    // InternalQiraa.g:661:2: ( '\\u0627\\u0644\\u0623\\u0648\\u0644' )
                    {
                    // InternalQiraa.g:661:2: ( '\\u0627\\u0644\\u0623\\u0648\\u0644' )
                    // InternalQiraa.g:662:3: '\\u0627\\u0644\\u0623\\u0648\\u0644'
                    {
                     before(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaAboveArabicLetterWawArabicLetterLamKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaAboveArabicLetterWawArabicLetterLamKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQiraa.g:667:2: ( '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' )
                    {
                    // InternalQiraa.g:667:2: ( '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' )
                    // InternalQiraa.g:668:3: '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A'
                    {
                     before(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterNoonArabicLetterYehKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterNoonArabicLetterYehKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQiraa.g:673:2: ( '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' )
                    {
                    // InternalQiraa.g:673:2: ( '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' )
                    // InternalQiraa.g:674:3: '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B'
                    {
                     before(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterLamArabicLetterThehKeyword_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterLamArabicLetterThehKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQiraa.g:679:2: ( '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' )
                    {
                    // InternalQiraa.g:679:2: ( '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' )
                    // InternalQiraa.g:680:3: '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631'
                    {
                     before(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaAboveArabicLetterKhahArabicLetterYehArabicLetterRehKeyword_3()); 
                    match(input,23,FOLLOW_2); 
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
    // InternalQiraa.g:689:1: rule__Harf__Alternatives_2 : ( ( ( rule__Harf__Group_2_0__0 ) ) | ( ( rule__Harf__Group_2_1__0 ) ) );
    public final void rule__Harf__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:693:1: ( ( ( rule__Harf__Group_2_0__0 ) ) | ( ( rule__Harf__Group_2_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==53) ) {
                alt7=1;
            }
            else if ( (LA7_0==55) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalQiraa.g:694:2: ( ( rule__Harf__Group_2_0__0 ) )
                    {
                    // InternalQiraa.g:694:2: ( ( rule__Harf__Group_2_0__0 ) )
                    // InternalQiraa.g:695:3: ( rule__Harf__Group_2_0__0 )
                    {
                     before(grammarAccess.getHarfAccess().getGroup_2_0()); 
                    // InternalQiraa.g:696:3: ( rule__Harf__Group_2_0__0 )
                    // InternalQiraa.g:696:4: rule__Harf__Group_2_0__0
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
                    // InternalQiraa.g:700:2: ( ( rule__Harf__Group_2_1__0 ) )
                    {
                    // InternalQiraa.g:700:2: ( ( rule__Harf__Group_2_1__0 ) )
                    // InternalQiraa.g:701:3: ( rule__Harf__Group_2_1__0 )
                    {
                     before(grammarAccess.getHarfAccess().getGroup_2_1()); 
                    // InternalQiraa.g:702:3: ( rule__Harf__Group_2_1__0 )
                    // InternalQiraa.g:702:4: rule__Harf__Group_2_1__0
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


    // $ANTLR start "rule__Qaree__Group__0"
    // InternalQiraa.g:710:1: rule__Qaree__Group__0 : rule__Qaree__Group__0__Impl rule__Qaree__Group__1 ;
    public final void rule__Qaree__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:714:1: ( rule__Qaree__Group__0__Impl rule__Qaree__Group__1 )
            // InternalQiraa.g:715:2: rule__Qaree__Group__0__Impl rule__Qaree__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:722:1: rule__Qaree__Group__0__Impl : ( '\\u0642\\u0627\\u0631\\u0626' ) ;
    public final void rule__Qaree__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:726:1: ( ( '\\u0642\\u0627\\u0631\\u0626' ) )
            // InternalQiraa.g:727:1: ( '\\u0642\\u0627\\u0631\\u0626' )
            {
            // InternalQiraa.g:727:1: ( '\\u0642\\u0627\\u0631\\u0626' )
            // InternalQiraa.g:728:2: '\\u0642\\u0627\\u0631\\u0626'
            {
             before(grammarAccess.getQareeAccess().getArabicLetterQafArabicLetterAlefArabicLetterRehArabicLetterYehWithHamzaAboveKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalQiraa.g:737:1: rule__Qaree__Group__1 : rule__Qaree__Group__1__Impl ;
    public final void rule__Qaree__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:741:1: ( rule__Qaree__Group__1__Impl )
            // InternalQiraa.g:742:2: rule__Qaree__Group__1__Impl
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
    // InternalQiraa.g:748:1: rule__Qaree__Group__1__Impl : ( rulePerson ) ;
    public final void rule__Qaree__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:752:1: ( ( rulePerson ) )
            // InternalQiraa.g:753:1: ( rulePerson )
            {
            // InternalQiraa.g:753:1: ( rulePerson )
            // InternalQiraa.g:754:2: rulePerson
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
    // InternalQiraa.g:764:1: rule__Rawee__Group__0 : rule__Rawee__Group__0__Impl rule__Rawee__Group__1 ;
    public final void rule__Rawee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:768:1: ( rule__Rawee__Group__0__Impl rule__Rawee__Group__1 )
            // InternalQiraa.g:769:2: rule__Rawee__Group__0__Impl rule__Rawee__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:776:1: rule__Rawee__Group__0__Impl : ( '\\u0631\\u0627\\u0648' ) ;
    public final void rule__Rawee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:780:1: ( ( '\\u0631\\u0627\\u0648' ) )
            // InternalQiraa.g:781:1: ( '\\u0631\\u0627\\u0648' )
            {
            // InternalQiraa.g:781:1: ( '\\u0631\\u0627\\u0648' )
            // InternalQiraa.g:782:2: '\\u0631\\u0627\\u0648'
            {
             before(grammarAccess.getRaweeAccess().getArabicLetterRehArabicLetterAlefArabicLetterWawKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalQiraa.g:791:1: rule__Rawee__Group__1 : rule__Rawee__Group__1__Impl rule__Rawee__Group__2 ;
    public final void rule__Rawee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:795:1: ( rule__Rawee__Group__1__Impl rule__Rawee__Group__2 )
            // InternalQiraa.g:796:2: rule__Rawee__Group__1__Impl rule__Rawee__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalQiraa.g:803:1: rule__Rawee__Group__1__Impl : ( rulePerson ) ;
    public final void rule__Rawee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:807:1: ( ( rulePerson ) )
            // InternalQiraa.g:808:1: ( rulePerson )
            {
            // InternalQiraa.g:808:1: ( rulePerson )
            // InternalQiraa.g:809:2: rulePerson
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
    // InternalQiraa.g:818:1: rule__Rawee__Group__2 : rule__Rawee__Group__2__Impl rule__Rawee__Group__3 ;
    public final void rule__Rawee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:822:1: ( rule__Rawee__Group__2__Impl rule__Rawee__Group__3 )
            // InternalQiraa.g:823:2: rule__Rawee__Group__2__Impl rule__Rawee__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:830:1: rule__Rawee__Group__2__Impl : ( '\\u0639\\u0646' ) ;
    public final void rule__Rawee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:834:1: ( ( '\\u0639\\u0646' ) )
            // InternalQiraa.g:835:1: ( '\\u0639\\u0646' )
            {
            // InternalQiraa.g:835:1: ( '\\u0639\\u0646' )
            // InternalQiraa.g:836:2: '\\u0639\\u0646'
            {
             before(grammarAccess.getRaweeAccess().getArabicLetterAinArabicLetterNoonKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalQiraa.g:845:1: rule__Rawee__Group__3 : rule__Rawee__Group__3__Impl ;
    public final void rule__Rawee__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:849:1: ( rule__Rawee__Group__3__Impl )
            // InternalQiraa.g:850:2: rule__Rawee__Group__3__Impl
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
    // InternalQiraa.g:856:1: rule__Rawee__Group__3__Impl : ( ( rule__Rawee__QareeAssignment_3 ) ) ;
    public final void rule__Rawee__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:860:1: ( ( ( rule__Rawee__QareeAssignment_3 ) ) )
            // InternalQiraa.g:861:1: ( ( rule__Rawee__QareeAssignment_3 ) )
            {
            // InternalQiraa.g:861:1: ( ( rule__Rawee__QareeAssignment_3 ) )
            // InternalQiraa.g:862:2: ( rule__Rawee__QareeAssignment_3 )
            {
             before(grammarAccess.getRaweeAccess().getQareeAssignment_3()); 
            // InternalQiraa.g:863:2: ( rule__Rawee__QareeAssignment_3 )
            // InternalQiraa.g:863:3: rule__Rawee__QareeAssignment_3
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


    // $ANTLR start "rule__Person__Group__0"
    // InternalQiraa.g:872:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:876:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalQiraa.g:877:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalQiraa.g:884:1: rule__Person__Group__0__Impl : ( ( rule__Person__NameAssignment_0 ) ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:888:1: ( ( ( rule__Person__NameAssignment_0 ) ) )
            // InternalQiraa.g:889:1: ( ( rule__Person__NameAssignment_0 ) )
            {
            // InternalQiraa.g:889:1: ( ( rule__Person__NameAssignment_0 ) )
            // InternalQiraa.g:890:2: ( rule__Person__NameAssignment_0 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_0()); 
            // InternalQiraa.g:891:2: ( rule__Person__NameAssignment_0 )
            // InternalQiraa.g:891:3: rule__Person__NameAssignment_0
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
    // InternalQiraa.g:899:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:903:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalQiraa.g:904:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalQiraa.g:911:1: rule__Person__Group__1__Impl : ( ( rule__Person__Group_1__0 )? ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:915:1: ( ( ( rule__Person__Group_1__0 )? ) )
            // InternalQiraa.g:916:1: ( ( rule__Person__Group_1__0 )? )
            {
            // InternalQiraa.g:916:1: ( ( rule__Person__Group_1__0 )? )
            // InternalQiraa.g:917:2: ( rule__Person__Group_1__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_1()); 
            // InternalQiraa.g:918:2: ( rule__Person__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalQiraa.g:918:3: rule__Person__Group_1__0
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
    // InternalQiraa.g:926:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:930:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalQiraa.g:931:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalQiraa.g:938:1: rule__Person__Group__2__Impl : ( ( rule__Person__Group_2__0 )? ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:942:1: ( ( ( rule__Person__Group_2__0 )? ) )
            // InternalQiraa.g:943:1: ( ( rule__Person__Group_2__0 )? )
            {
            // InternalQiraa.g:943:1: ( ( rule__Person__Group_2__0 )? )
            // InternalQiraa.g:944:2: ( rule__Person__Group_2__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_2()); 
            // InternalQiraa.g:945:2: ( rule__Person__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQiraa.g:945:3: rule__Person__Group_2__0
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
    // InternalQiraa.g:953:1: rule__Person__Group__3 : rule__Person__Group__3__Impl ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:957:1: ( rule__Person__Group__3__Impl )
            // InternalQiraa.g:958:2: rule__Person__Group__3__Impl
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
    // InternalQiraa.g:964:1: rule__Person__Group__3__Impl : ( ( rule__Person__Group_3__0 )? ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:968:1: ( ( ( rule__Person__Group_3__0 )? ) )
            // InternalQiraa.g:969:1: ( ( rule__Person__Group_3__0 )? )
            {
            // InternalQiraa.g:969:1: ( ( rule__Person__Group_3__0 )? )
            // InternalQiraa.g:970:2: ( rule__Person__Group_3__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_3()); 
            // InternalQiraa.g:971:2: ( rule__Person__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQiraa.g:971:3: rule__Person__Group_3__0
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
    // InternalQiraa.g:980:1: rule__Person__Group_1__0 : rule__Person__Group_1__0__Impl rule__Person__Group_1__1 ;
    public final void rule__Person__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:984:1: ( rule__Person__Group_1__0__Impl rule__Person__Group_1__1 )
            // InternalQiraa.g:985:2: rule__Person__Group_1__0__Impl rule__Person__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:992:1: rule__Person__Group_1__0__Impl : ( '\\u0627\\u0633\\u0645\\u0647' ) ;
    public final void rule__Person__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:996:1: ( ( '\\u0627\\u0633\\u0645\\u0647' ) )
            // InternalQiraa.g:997:1: ( '\\u0627\\u0633\\u0645\\u0647' )
            {
            // InternalQiraa.g:997:1: ( '\\u0627\\u0633\\u0645\\u0647' )
            // InternalQiraa.g:998:2: '\\u0627\\u0633\\u0645\\u0647'
            {
             before(grammarAccess.getPersonAccess().getArabicLetterAlefArabicLetterSeenArabicLetterMeemArabicLetterHehKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalQiraa.g:1007:1: rule__Person__Group_1__1 : rule__Person__Group_1__1__Impl ;
    public final void rule__Person__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1011:1: ( rule__Person__Group_1__1__Impl )
            // InternalQiraa.g:1012:2: rule__Person__Group_1__1__Impl
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
    // InternalQiraa.g:1018:1: rule__Person__Group_1__1__Impl : ( ( rule__Person__EsmAssignment_1_1 ) ) ;
    public final void rule__Person__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1022:1: ( ( ( rule__Person__EsmAssignment_1_1 ) ) )
            // InternalQiraa.g:1023:1: ( ( rule__Person__EsmAssignment_1_1 ) )
            {
            // InternalQiraa.g:1023:1: ( ( rule__Person__EsmAssignment_1_1 ) )
            // InternalQiraa.g:1024:2: ( rule__Person__EsmAssignment_1_1 )
            {
             before(grammarAccess.getPersonAccess().getEsmAssignment_1_1()); 
            // InternalQiraa.g:1025:2: ( rule__Person__EsmAssignment_1_1 )
            // InternalQiraa.g:1025:3: rule__Person__EsmAssignment_1_1
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
    // InternalQiraa.g:1034:1: rule__Person__Group_2__0 : rule__Person__Group_2__0__Impl rule__Person__Group_2__1 ;
    public final void rule__Person__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1038:1: ( rule__Person__Group_2__0__Impl rule__Person__Group_2__1 )
            // InternalQiraa.g:1039:2: rule__Person__Group_2__0__Impl rule__Person__Group_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:1046:1: rule__Person__Group_2__0__Impl : ( '\\u0644\\u0642\\u0628\\u0647' ) ;
    public final void rule__Person__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1050:1: ( ( '\\u0644\\u0642\\u0628\\u0647' ) )
            // InternalQiraa.g:1051:1: ( '\\u0644\\u0642\\u0628\\u0647' )
            {
            // InternalQiraa.g:1051:1: ( '\\u0644\\u0642\\u0628\\u0647' )
            // InternalQiraa.g:1052:2: '\\u0644\\u0642\\u0628\\u0647'
            {
             before(grammarAccess.getPersonAccess().getArabicLetterLamArabicLetterQafArabicLetterBehArabicLetterHehKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalQiraa.g:1061:1: rule__Person__Group_2__1 : rule__Person__Group_2__1__Impl ;
    public final void rule__Person__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1065:1: ( rule__Person__Group_2__1__Impl )
            // InternalQiraa.g:1066:2: rule__Person__Group_2__1__Impl
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
    // InternalQiraa.g:1072:1: rule__Person__Group_2__1__Impl : ( ( rule__Person__LakabAssignment_2_1 ) ) ;
    public final void rule__Person__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1076:1: ( ( ( rule__Person__LakabAssignment_2_1 ) ) )
            // InternalQiraa.g:1077:1: ( ( rule__Person__LakabAssignment_2_1 ) )
            {
            // InternalQiraa.g:1077:1: ( ( rule__Person__LakabAssignment_2_1 ) )
            // InternalQiraa.g:1078:2: ( rule__Person__LakabAssignment_2_1 )
            {
             before(grammarAccess.getPersonAccess().getLakabAssignment_2_1()); 
            // InternalQiraa.g:1079:2: ( rule__Person__LakabAssignment_2_1 )
            // InternalQiraa.g:1079:3: rule__Person__LakabAssignment_2_1
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
    // InternalQiraa.g:1088:1: rule__Person__Group_3__0 : rule__Person__Group_3__0__Impl rule__Person__Group_3__1 ;
    public final void rule__Person__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1092:1: ( rule__Person__Group_3__0__Impl rule__Person__Group_3__1 )
            // InternalQiraa.g:1093:2: rule__Person__Group_3__0__Impl rule__Person__Group_3__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalQiraa.g:1100:1: rule__Person__Group_3__0__Impl : ( '\\u062A\\u0648\\u0641\\u064A' ) ;
    public final void rule__Person__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1104:1: ( ( '\\u062A\\u0648\\u0641\\u064A' ) )
            // InternalQiraa.g:1105:1: ( '\\u062A\\u0648\\u0641\\u064A' )
            {
            // InternalQiraa.g:1105:1: ( '\\u062A\\u0648\\u0641\\u064A' )
            // InternalQiraa.g:1106:2: '\\u062A\\u0648\\u0641\\u064A'
            {
             before(grammarAccess.getPersonAccess().getArabicLetterTehArabicLetterWawArabicLetterFehArabicLetterYehKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQiraa.g:1115:1: rule__Person__Group_3__1 : rule__Person__Group_3__1__Impl ;
    public final void rule__Person__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1119:1: ( rule__Person__Group_3__1__Impl )
            // InternalQiraa.g:1120:2: rule__Person__Group_3__1__Impl
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
    // InternalQiraa.g:1126:1: rule__Person__Group_3__1__Impl : ( ( rule__Person__TowofiaAssignment_3_1 ) ) ;
    public final void rule__Person__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1130:1: ( ( ( rule__Person__TowofiaAssignment_3_1 ) ) )
            // InternalQiraa.g:1131:1: ( ( rule__Person__TowofiaAssignment_3_1 ) )
            {
            // InternalQiraa.g:1131:1: ( ( rule__Person__TowofiaAssignment_3_1 ) )
            // InternalQiraa.g:1132:2: ( rule__Person__TowofiaAssignment_3_1 )
            {
             before(grammarAccess.getPersonAccess().getTowofiaAssignment_3_1()); 
            // InternalQiraa.g:1133:2: ( rule__Person__TowofiaAssignment_3_1 )
            // InternalQiraa.g:1133:3: rule__Person__TowofiaAssignment_3_1
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
    // InternalQiraa.g:1142:1: rule__Douaa__Group__0 : rule__Douaa__Group__0__Impl rule__Douaa__Group__1 ;
    public final void rule__Douaa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1146:1: ( rule__Douaa__Group__0__Impl rule__Douaa__Group__1 )
            // InternalQiraa.g:1147:2: rule__Douaa__Group__0__Impl rule__Douaa__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalQiraa.g:1154:1: rule__Douaa__Group__0__Impl : ( ( rule__Douaa__DAssignment_0 ) ) ;
    public final void rule__Douaa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1158:1: ( ( ( rule__Douaa__DAssignment_0 ) ) )
            // InternalQiraa.g:1159:1: ( ( rule__Douaa__DAssignment_0 ) )
            {
            // InternalQiraa.g:1159:1: ( ( rule__Douaa__DAssignment_0 ) )
            // InternalQiraa.g:1160:2: ( rule__Douaa__DAssignment_0 )
            {
             before(grammarAccess.getDouaaAccess().getDAssignment_0()); 
            // InternalQiraa.g:1161:2: ( rule__Douaa__DAssignment_0 )
            // InternalQiraa.g:1161:3: rule__Douaa__DAssignment_0
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
    // InternalQiraa.g:1169:1: rule__Douaa__Group__1 : rule__Douaa__Group__1__Impl ;
    public final void rule__Douaa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1173:1: ( rule__Douaa__Group__1__Impl )
            // InternalQiraa.g:1174:2: rule__Douaa__Group__1__Impl
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
    // InternalQiraa.g:1180:1: rule__Douaa__Group__1__Impl : ( '\\u0627\\u0644\\u0644\\u0647' ) ;
    public final void rule__Douaa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1184:1: ( ( '\\u0627\\u0644\\u0644\\u0647' ) )
            // InternalQiraa.g:1185:1: ( '\\u0627\\u0644\\u0644\\u0647' )
            {
            // InternalQiraa.g:1185:1: ( '\\u0627\\u0644\\u0644\\u0647' )
            // InternalQiraa.g:1186:2: '\\u0627\\u0644\\u0644\\u0647'
            {
             before(grammarAccess.getDouaaAccess().getArabicLetterAlefArabicLetterLamArabicLetterLamArabicLetterHehKeyword_1()); 
            match(input,30,FOLLOW_2); 
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


    // $ANTLR start "rule__Tareek__Group__0"
    // InternalQiraa.g:1196:1: rule__Tareek__Group__0 : rule__Tareek__Group__0__Impl rule__Tareek__Group__1 ;
    public final void rule__Tareek__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1200:1: ( rule__Tareek__Group__0__Impl rule__Tareek__Group__1 )
            // InternalQiraa.g:1201:2: rule__Tareek__Group__0__Impl rule__Tareek__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQiraa.g:1208:1: rule__Tareek__Group__0__Impl : ( '\\u0637\\u0631\\u064A\\u0642' ) ;
    public final void rule__Tareek__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1212:1: ( ( '\\u0637\\u0631\\u064A\\u0642' ) )
            // InternalQiraa.g:1213:1: ( '\\u0637\\u0631\\u064A\\u0642' )
            {
            // InternalQiraa.g:1213:1: ( '\\u0637\\u0631\\u064A\\u0642' )
            // InternalQiraa.g:1214:2: '\\u0637\\u0631\\u064A\\u0642'
            {
             before(grammarAccess.getTareekAccess().getArabicLetterTahArabicLetterRehArabicLetterYehArabicLetterQafKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalQiraa.g:1223:1: rule__Tareek__Group__1 : rule__Tareek__Group__1__Impl rule__Tareek__Group__2 ;
    public final void rule__Tareek__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1227:1: ( rule__Tareek__Group__1__Impl rule__Tareek__Group__2 )
            // InternalQiraa.g:1228:2: rule__Tareek__Group__1__Impl rule__Tareek__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:1235:1: rule__Tareek__Group__1__Impl : ( '\\u062A\\u0644\\u0627\\u0648\\u0629' ) ;
    public final void rule__Tareek__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1239:1: ( ( '\\u062A\\u0644\\u0627\\u0648\\u0629' ) )
            // InternalQiraa.g:1240:1: ( '\\u062A\\u0644\\u0627\\u0648\\u0629' )
            {
            // InternalQiraa.g:1240:1: ( '\\u062A\\u0644\\u0627\\u0648\\u0629' )
            // InternalQiraa.g:1241:2: '\\u062A\\u0644\\u0627\\u0648\\u0629'
            {
             before(grammarAccess.getTareekAccess().getArabicLetterTehArabicLetterLamArabicLetterAlefArabicLetterWawArabicLetterTehMarbutaKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalQiraa.g:1250:1: rule__Tareek__Group__2 : rule__Tareek__Group__2__Impl rule__Tareek__Group__3 ;
    public final void rule__Tareek__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1254:1: ( rule__Tareek__Group__2__Impl rule__Tareek__Group__3 )
            // InternalQiraa.g:1255:2: rule__Tareek__Group__2__Impl rule__Tareek__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalQiraa.g:1262:1: rule__Tareek__Group__2__Impl : ( ( rule__Tareek__NameAssignment_2 ) ) ;
    public final void rule__Tareek__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1266:1: ( ( ( rule__Tareek__NameAssignment_2 ) ) )
            // InternalQiraa.g:1267:1: ( ( rule__Tareek__NameAssignment_2 ) )
            {
            // InternalQiraa.g:1267:1: ( ( rule__Tareek__NameAssignment_2 ) )
            // InternalQiraa.g:1268:2: ( rule__Tareek__NameAssignment_2 )
            {
             before(grammarAccess.getTareekAccess().getNameAssignment_2()); 
            // InternalQiraa.g:1269:2: ( rule__Tareek__NameAssignment_2 )
            // InternalQiraa.g:1269:3: rule__Tareek__NameAssignment_2
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
    // InternalQiraa.g:1277:1: rule__Tareek__Group__3 : rule__Tareek__Group__3__Impl ;
    public final void rule__Tareek__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1281:1: ( rule__Tareek__Group__3__Impl )
            // InternalQiraa.g:1282:2: rule__Tareek__Group__3__Impl
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
    // InternalQiraa.g:1288:1: rule__Tareek__Group__3__Impl : ( ( rule__Tareek__Alternatives_3 ) ) ;
    public final void rule__Tareek__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1292:1: ( ( ( rule__Tareek__Alternatives_3 ) ) )
            // InternalQiraa.g:1293:1: ( ( rule__Tareek__Alternatives_3 ) )
            {
            // InternalQiraa.g:1293:1: ( ( rule__Tareek__Alternatives_3 ) )
            // InternalQiraa.g:1294:2: ( rule__Tareek__Alternatives_3 )
            {
             before(grammarAccess.getTareekAccess().getAlternatives_3()); 
            // InternalQiraa.g:1295:2: ( rule__Tareek__Alternatives_3 )
            // InternalQiraa.g:1295:3: rule__Tareek__Alternatives_3
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
    // InternalQiraa.g:1304:1: rule__Tareek__Group_3_0__0 : rule__Tareek__Group_3_0__0__Impl rule__Tareek__Group_3_0__1 ;
    public final void rule__Tareek__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1308:1: ( rule__Tareek__Group_3_0__0__Impl rule__Tareek__Group_3_0__1 )
            // InternalQiraa.g:1309:2: rule__Tareek__Group_3_0__0__Impl rule__Tareek__Group_3_0__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalQiraa.g:1316:1: rule__Tareek__Group_3_0__0__Impl : ( ( rule__Tareek__SimpleAssignment_3_0_0 ) ) ;
    public final void rule__Tareek__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1320:1: ( ( ( rule__Tareek__SimpleAssignment_3_0_0 ) ) )
            // InternalQiraa.g:1321:1: ( ( rule__Tareek__SimpleAssignment_3_0_0 ) )
            {
            // InternalQiraa.g:1321:1: ( ( rule__Tareek__SimpleAssignment_3_0_0 ) )
            // InternalQiraa.g:1322:2: ( rule__Tareek__SimpleAssignment_3_0_0 )
            {
             before(grammarAccess.getTareekAccess().getSimpleAssignment_3_0_0()); 
            // InternalQiraa.g:1323:2: ( rule__Tareek__SimpleAssignment_3_0_0 )
            // InternalQiraa.g:1323:3: rule__Tareek__SimpleAssignment_3_0_0
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
    // InternalQiraa.g:1331:1: rule__Tareek__Group_3_0__1 : rule__Tareek__Group_3_0__1__Impl rule__Tareek__Group_3_0__2 ;
    public final void rule__Tareek__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1335:1: ( rule__Tareek__Group_3_0__1__Impl rule__Tareek__Group_3_0__2 )
            // InternalQiraa.g:1336:2: rule__Tareek__Group_3_0__1__Impl rule__Tareek__Group_3_0__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:1343:1: rule__Tareek__Group_3_0__1__Impl : ( '\\u0644' ) ;
    public final void rule__Tareek__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1347:1: ( ( '\\u0644' ) )
            // InternalQiraa.g:1348:1: ( '\\u0644' )
            {
            // InternalQiraa.g:1348:1: ( '\\u0644' )
            // InternalQiraa.g:1349:2: '\\u0644'
            {
             before(grammarAccess.getTareekAccess().getArabicLetterLamKeyword_3_0_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalQiraa.g:1358:1: rule__Tareek__Group_3_0__2 : rule__Tareek__Group_3_0__2__Impl ;
    public final void rule__Tareek__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1362:1: ( rule__Tareek__Group_3_0__2__Impl )
            // InternalQiraa.g:1363:2: rule__Tareek__Group_3_0__2__Impl
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
    // InternalQiraa.g:1369:1: rule__Tareek__Group_3_0__2__Impl : ( ( rule__Tareek__RefAssignment_3_0_2 ) ) ;
    public final void rule__Tareek__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1373:1: ( ( ( rule__Tareek__RefAssignment_3_0_2 ) ) )
            // InternalQiraa.g:1374:1: ( ( rule__Tareek__RefAssignment_3_0_2 ) )
            {
            // InternalQiraa.g:1374:1: ( ( rule__Tareek__RefAssignment_3_0_2 ) )
            // InternalQiraa.g:1375:2: ( rule__Tareek__RefAssignment_3_0_2 )
            {
             before(grammarAccess.getTareekAccess().getRefAssignment_3_0_2()); 
            // InternalQiraa.g:1376:2: ( rule__Tareek__RefAssignment_3_0_2 )
            // InternalQiraa.g:1376:3: rule__Tareek__RefAssignment_3_0_2
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
    // InternalQiraa.g:1385:1: rule__Tareek__Group_3_1__0 : rule__Tareek__Group_3_1__0__Impl rule__Tareek__Group_3_1__1 ;
    public final void rule__Tareek__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1389:1: ( rule__Tareek__Group_3_1__0__Impl rule__Tareek__Group_3_1__1 )
            // InternalQiraa.g:1390:2: rule__Tareek__Group_3_1__0__Impl rule__Tareek__Group_3_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:1397:1: rule__Tareek__Group_3_1__0__Impl : ( ( rule__Tareek__Group_3_1_0__0 ) ) ;
    public final void rule__Tareek__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1401:1: ( ( ( rule__Tareek__Group_3_1_0__0 ) ) )
            // InternalQiraa.g:1402:1: ( ( rule__Tareek__Group_3_1_0__0 ) )
            {
            // InternalQiraa.g:1402:1: ( ( rule__Tareek__Group_3_1_0__0 ) )
            // InternalQiraa.g:1403:2: ( rule__Tareek__Group_3_1_0__0 )
            {
             before(grammarAccess.getTareekAccess().getGroup_3_1_0()); 
            // InternalQiraa.g:1404:2: ( rule__Tareek__Group_3_1_0__0 )
            // InternalQiraa.g:1404:3: rule__Tareek__Group_3_1_0__0
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
    // InternalQiraa.g:1412:1: rule__Tareek__Group_3_1__1 : rule__Tareek__Group_3_1__1__Impl ;
    public final void rule__Tareek__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1416:1: ( rule__Tareek__Group_3_1__1__Impl )
            // InternalQiraa.g:1417:2: rule__Tareek__Group_3_1__1__Impl
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
    // InternalQiraa.g:1423:1: rule__Tareek__Group_3_1__1__Impl : ( ( ( rule__Tareek__RefsAssignment_3_1_1 ) ) ( ( rule__Tareek__RefsAssignment_3_1_1 )* ) ) ;
    public final void rule__Tareek__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1427:1: ( ( ( ( rule__Tareek__RefsAssignment_3_1_1 ) ) ( ( rule__Tareek__RefsAssignment_3_1_1 )* ) ) )
            // InternalQiraa.g:1428:1: ( ( ( rule__Tareek__RefsAssignment_3_1_1 ) ) ( ( rule__Tareek__RefsAssignment_3_1_1 )* ) )
            {
            // InternalQiraa.g:1428:1: ( ( ( rule__Tareek__RefsAssignment_3_1_1 ) ) ( ( rule__Tareek__RefsAssignment_3_1_1 )* ) )
            // InternalQiraa.g:1429:2: ( ( rule__Tareek__RefsAssignment_3_1_1 ) ) ( ( rule__Tareek__RefsAssignment_3_1_1 )* )
            {
            // InternalQiraa.g:1429:2: ( ( rule__Tareek__RefsAssignment_3_1_1 ) )
            // InternalQiraa.g:1430:3: ( rule__Tareek__RefsAssignment_3_1_1 )
            {
             before(grammarAccess.getTareekAccess().getRefsAssignment_3_1_1()); 
            // InternalQiraa.g:1431:3: ( rule__Tareek__RefsAssignment_3_1_1 )
            // InternalQiraa.g:1431:4: rule__Tareek__RefsAssignment_3_1_1
            {
            pushFollow(FOLLOW_12);
            rule__Tareek__RefsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTareekAccess().getRefsAssignment_3_1_1()); 

            }

            // InternalQiraa.g:1434:2: ( ( rule__Tareek__RefsAssignment_3_1_1 )* )
            // InternalQiraa.g:1435:3: ( rule__Tareek__RefsAssignment_3_1_1 )*
            {
             before(grammarAccess.getTareekAccess().getRefsAssignment_3_1_1()); 
            // InternalQiraa.g:1436:3: ( rule__Tareek__RefsAssignment_3_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_KALEMAH) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQiraa.g:1436:4: rule__Tareek__RefsAssignment_3_1_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Tareek__RefsAssignment_3_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalQiraa.g:1446:1: rule__Tareek__Group_3_1_0__0 : rule__Tareek__Group_3_1_0__0__Impl rule__Tareek__Group_3_1_0__1 ;
    public final void rule__Tareek__Group_3_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1450:1: ( rule__Tareek__Group_3_1_0__0__Impl rule__Tareek__Group_3_1_0__1 )
            // InternalQiraa.g:1451:2: rule__Tareek__Group_3_1_0__0__Impl rule__Tareek__Group_3_1_0__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalQiraa.g:1458:1: rule__Tareek__Group_3_1_0__0__Impl : ( ( rule__Tareek__ComplexAssignment_3_1_0_0 ) ) ;
    public final void rule__Tareek__Group_3_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1462:1: ( ( ( rule__Tareek__ComplexAssignment_3_1_0_0 ) ) )
            // InternalQiraa.g:1463:1: ( ( rule__Tareek__ComplexAssignment_3_1_0_0 ) )
            {
            // InternalQiraa.g:1463:1: ( ( rule__Tareek__ComplexAssignment_3_1_0_0 ) )
            // InternalQiraa.g:1464:2: ( rule__Tareek__ComplexAssignment_3_1_0_0 )
            {
             before(grammarAccess.getTareekAccess().getComplexAssignment_3_1_0_0()); 
            // InternalQiraa.g:1465:2: ( rule__Tareek__ComplexAssignment_3_1_0_0 )
            // InternalQiraa.g:1465:3: rule__Tareek__ComplexAssignment_3_1_0_0
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
    // InternalQiraa.g:1473:1: rule__Tareek__Group_3_1_0__1 : rule__Tareek__Group_3_1_0__1__Impl ;
    public final void rule__Tareek__Group_3_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1477:1: ( rule__Tareek__Group_3_1_0__1__Impl )
            // InternalQiraa.g:1478:2: rule__Tareek__Group_3_1_0__1__Impl
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
    // InternalQiraa.g:1484:1: rule__Tareek__Group_3_1_0__1__Impl : ( '\\u0645\\u0646' ) ;
    public final void rule__Tareek__Group_3_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1488:1: ( ( '\\u0645\\u0646' ) )
            // InternalQiraa.g:1489:1: ( '\\u0645\\u0646' )
            {
            // InternalQiraa.g:1489:1: ( '\\u0645\\u0646' )
            // InternalQiraa.g:1490:2: '\\u0645\\u0646'
            {
             before(grammarAccess.getTareekAccess().getArabicLetterMeemArabicLetterNoonKeyword_3_1_0_1()); 
            match(input,34,FOLLOW_2); 
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


    // $ANTLR start "rule__IMAM__Group__0"
    // InternalQiraa.g:1500:1: rule__IMAM__Group__0 : rule__IMAM__Group__0__Impl rule__IMAM__Group__1 ;
    public final void rule__IMAM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1504:1: ( rule__IMAM__Group__0__Impl rule__IMAM__Group__1 )
            // InternalQiraa.g:1505:2: rule__IMAM__Group__0__Impl rule__IMAM__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:1512:1: rule__IMAM__Group__0__Impl : ( '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' ) ;
    public final void rule__IMAM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1516:1: ( ( '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' ) )
            // InternalQiraa.g:1517:1: ( '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' )
            {
            // InternalQiraa.g:1517:1: ( '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' )
            // InternalQiraa.g:1518:2: '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645'
            {
             before(grammarAccess.getIMAMAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaBelowArabicLetterMeemArabicLetterAlefArabicLetterMeemKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalQiraa.g:1527:1: rule__IMAM__Group__1 : rule__IMAM__Group__1__Impl rule__IMAM__Group__2 ;
    public final void rule__IMAM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1531:1: ( rule__IMAM__Group__1__Impl rule__IMAM__Group__2 )
            // InternalQiraa.g:1532:2: rule__IMAM__Group__1__Impl rule__IMAM__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalQiraa.g:1539:1: rule__IMAM__Group__1__Impl : ( rulePerson ) ;
    public final void rule__IMAM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1543:1: ( ( rulePerson ) )
            // InternalQiraa.g:1544:1: ( rulePerson )
            {
            // InternalQiraa.g:1544:1: ( rulePerson )
            // InternalQiraa.g:1545:2: rulePerson
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
    // InternalQiraa.g:1554:1: rule__IMAM__Group__2 : rule__IMAM__Group__2__Impl ;
    public final void rule__IMAM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1558:1: ( rule__IMAM__Group__2__Impl )
            // InternalQiraa.g:1559:2: rule__IMAM__Group__2__Impl
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
    // InternalQiraa.g:1565:1: rule__IMAM__Group__2__Impl : ( ruleDouaa ) ;
    public final void rule__IMAM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1569:1: ( ( ruleDouaa ) )
            // InternalQiraa.g:1570:1: ( ruleDouaa )
            {
            // InternalQiraa.g:1570:1: ( ruleDouaa )
            // InternalQiraa.g:1571:2: ruleDouaa
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


    // $ANTLR start "rule__Marjeh__Group__0"
    // InternalQiraa.g:1581:1: rule__Marjeh__Group__0 : rule__Marjeh__Group__0__Impl rule__Marjeh__Group__1 ;
    public final void rule__Marjeh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1585:1: ( rule__Marjeh__Group__0__Impl rule__Marjeh__Group__1 )
            // InternalQiraa.g:1586:2: rule__Marjeh__Group__0__Impl rule__Marjeh__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:1593:1: rule__Marjeh__Group__0__Impl : ( '\\u0645\\u0631\\u062C\\u0639' ) ;
    public final void rule__Marjeh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1597:1: ( ( '\\u0645\\u0631\\u062C\\u0639' ) )
            // InternalQiraa.g:1598:1: ( '\\u0645\\u0631\\u062C\\u0639' )
            {
            // InternalQiraa.g:1598:1: ( '\\u0645\\u0631\\u062C\\u0639' )
            // InternalQiraa.g:1599:2: '\\u0645\\u0631\\u062C\\u0639'
            {
             before(grammarAccess.getMarjehAccess().getArabicLetterMeemArabicLetterRehArabicLetterJeemArabicLetterAinKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalQiraa.g:1608:1: rule__Marjeh__Group__1 : rule__Marjeh__Group__1__Impl rule__Marjeh__Group__2 ;
    public final void rule__Marjeh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1612:1: ( rule__Marjeh__Group__1__Impl rule__Marjeh__Group__2 )
            // InternalQiraa.g:1613:2: rule__Marjeh__Group__1__Impl rule__Marjeh__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalQiraa.g:1620:1: rule__Marjeh__Group__1__Impl : ( ( rule__Marjeh__NameAssignment_1 ) ) ;
    public final void rule__Marjeh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1624:1: ( ( ( rule__Marjeh__NameAssignment_1 ) ) )
            // InternalQiraa.g:1625:1: ( ( rule__Marjeh__NameAssignment_1 ) )
            {
            // InternalQiraa.g:1625:1: ( ( rule__Marjeh__NameAssignment_1 ) )
            // InternalQiraa.g:1626:2: ( rule__Marjeh__NameAssignment_1 )
            {
             before(grammarAccess.getMarjehAccess().getNameAssignment_1()); 
            // InternalQiraa.g:1627:2: ( rule__Marjeh__NameAssignment_1 )
            // InternalQiraa.g:1627:3: rule__Marjeh__NameAssignment_1
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
    // InternalQiraa.g:1635:1: rule__Marjeh__Group__2 : rule__Marjeh__Group__2__Impl rule__Marjeh__Group__3 ;
    public final void rule__Marjeh__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1639:1: ( rule__Marjeh__Group__2__Impl rule__Marjeh__Group__3 )
            // InternalQiraa.g:1640:2: rule__Marjeh__Group__2__Impl rule__Marjeh__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:1647:1: rule__Marjeh__Group__2__Impl : ( '\\u0644\\u0644\\u0625\\u0645\\u0627\\u0645' ) ;
    public final void rule__Marjeh__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1651:1: ( ( '\\u0644\\u0644\\u0625\\u0645\\u0627\\u0645' ) )
            // InternalQiraa.g:1652:1: ( '\\u0644\\u0644\\u0625\\u0645\\u0627\\u0645' )
            {
            // InternalQiraa.g:1652:1: ( '\\u0644\\u0644\\u0625\\u0645\\u0627\\u0645' )
            // InternalQiraa.g:1653:2: '\\u0644\\u0644\\u0625\\u0645\\u0627\\u0645'
            {
             before(grammarAccess.getMarjehAccess().getArabicLetterLamArabicLetterLamArabicLetterAlefWithHamzaBelowArabicLetterMeemArabicLetterAlefArabicLetterMeemKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMarjehAccess().getArabicLetterLamArabicLetterLamArabicLetterAlefWithHamzaBelowArabicLetterMeemArabicLetterAlefArabicLetterMeemKeyword_2()); 

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
    // InternalQiraa.g:1662:1: rule__Marjeh__Group__3 : rule__Marjeh__Group__3__Impl rule__Marjeh__Group__4 ;
    public final void rule__Marjeh__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1666:1: ( rule__Marjeh__Group__3__Impl rule__Marjeh__Group__4 )
            // InternalQiraa.g:1667:2: rule__Marjeh__Group__3__Impl rule__Marjeh__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalQiraa.g:1674:1: rule__Marjeh__Group__3__Impl : ( ( rule__Marjeh__RefAssignment_3 ) ) ;
    public final void rule__Marjeh__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1678:1: ( ( ( rule__Marjeh__RefAssignment_3 ) ) )
            // InternalQiraa.g:1679:1: ( ( rule__Marjeh__RefAssignment_3 ) )
            {
            // InternalQiraa.g:1679:1: ( ( rule__Marjeh__RefAssignment_3 ) )
            // InternalQiraa.g:1680:2: ( rule__Marjeh__RefAssignment_3 )
            {
             before(grammarAccess.getMarjehAccess().getRefAssignment_3()); 
            // InternalQiraa.g:1681:2: ( rule__Marjeh__RefAssignment_3 )
            // InternalQiraa.g:1681:3: rule__Marjeh__RefAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Marjeh__RefAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMarjehAccess().getRefAssignment_3()); 

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
    // InternalQiraa.g:1689:1: rule__Marjeh__Group__4 : rule__Marjeh__Group__4__Impl rule__Marjeh__Group__5 ;
    public final void rule__Marjeh__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1693:1: ( rule__Marjeh__Group__4__Impl rule__Marjeh__Group__5 )
            // InternalQiraa.g:1694:2: rule__Marjeh__Group__4__Impl rule__Marjeh__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalQiraa.g:1701:1: rule__Marjeh__Group__4__Impl : ( ruleDouaa ) ;
    public final void rule__Marjeh__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1705:1: ( ( ruleDouaa ) )
            // InternalQiraa.g:1706:1: ( ruleDouaa )
            {
            // InternalQiraa.g:1706:1: ( ruleDouaa )
            // InternalQiraa.g:1707:2: ruleDouaa
            {
             before(grammarAccess.getMarjehAccess().getDouaaParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleDouaa();

            state._fsp--;

             after(grammarAccess.getMarjehAccess().getDouaaParserRuleCall_4()); 

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
    // InternalQiraa.g:1716:1: rule__Marjeh__Group__5 : rule__Marjeh__Group__5__Impl rule__Marjeh__Group__6 ;
    public final void rule__Marjeh__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1720:1: ( rule__Marjeh__Group__5__Impl rule__Marjeh__Group__6 )
            // InternalQiraa.g:1721:2: rule__Marjeh__Group__5__Impl rule__Marjeh__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalQiraa.g:1728:1: rule__Marjeh__Group__5__Impl : ( '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647' ) ;
    public final void rule__Marjeh__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1732:1: ( ( '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647' ) )
            // InternalQiraa.g:1733:1: ( '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647' )
            {
            // InternalQiraa.g:1733:1: ( '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647' )
            // InternalQiraa.g:1734:2: '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647'
            {
             before(grammarAccess.getMarjehAccess().getArabicLetterTehArabicLetterFehArabicLetterSadArabicLetterYehArabicLetterLamArabicLetterHehKeyword_5()); 
            match(input,38,FOLLOW_2); 
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
    // InternalQiraa.g:1743:1: rule__Marjeh__Group__6 : rule__Marjeh__Group__6__Impl rule__Marjeh__Group__7 ;
    public final void rule__Marjeh__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1747:1: ( rule__Marjeh__Group__6__Impl rule__Marjeh__Group__7 )
            // InternalQiraa.g:1748:2: rule__Marjeh__Group__6__Impl rule__Marjeh__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalQiraa.g:1755:1: rule__Marjeh__Group__6__Impl : ( ( rule__Marjeh__RomozAssignment_6 )* ) ;
    public final void rule__Marjeh__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1759:1: ( ( ( rule__Marjeh__RomozAssignment_6 )* ) )
            // InternalQiraa.g:1760:1: ( ( rule__Marjeh__RomozAssignment_6 )* )
            {
            // InternalQiraa.g:1760:1: ( ( rule__Marjeh__RomozAssignment_6 )* )
            // InternalQiraa.g:1761:2: ( rule__Marjeh__RomozAssignment_6 )*
            {
             before(grammarAccess.getMarjehAccess().getRomozAssignment_6()); 
            // InternalQiraa.g:1762:2: ( rule__Marjeh__RomozAssignment_6 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==46) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQiraa.g:1762:3: rule__Marjeh__RomozAssignment_6
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Marjeh__RomozAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalQiraa.g:1770:1: rule__Marjeh__Group__7 : rule__Marjeh__Group__7__Impl rule__Marjeh__Group__8 ;
    public final void rule__Marjeh__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1774:1: ( rule__Marjeh__Group__7__Impl rule__Marjeh__Group__8 )
            // InternalQiraa.g:1775:2: rule__Marjeh__Group__7__Impl rule__Marjeh__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalQiraa.g:1782:1: rule__Marjeh__Group__7__Impl : ( ( ( rule__Marjeh__MakatehAssignment_7 ) ) ( ( rule__Marjeh__MakatehAssignment_7 )* ) ) ;
    public final void rule__Marjeh__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1786:1: ( ( ( ( rule__Marjeh__MakatehAssignment_7 ) ) ( ( rule__Marjeh__MakatehAssignment_7 )* ) ) )
            // InternalQiraa.g:1787:1: ( ( ( rule__Marjeh__MakatehAssignment_7 ) ) ( ( rule__Marjeh__MakatehAssignment_7 )* ) )
            {
            // InternalQiraa.g:1787:1: ( ( ( rule__Marjeh__MakatehAssignment_7 ) ) ( ( rule__Marjeh__MakatehAssignment_7 )* ) )
            // InternalQiraa.g:1788:2: ( ( rule__Marjeh__MakatehAssignment_7 ) ) ( ( rule__Marjeh__MakatehAssignment_7 )* )
            {
            // InternalQiraa.g:1788:2: ( ( rule__Marjeh__MakatehAssignment_7 ) )
            // InternalQiraa.g:1789:3: ( rule__Marjeh__MakatehAssignment_7 )
            {
             before(grammarAccess.getMarjehAccess().getMakatehAssignment_7()); 
            // InternalQiraa.g:1790:3: ( rule__Marjeh__MakatehAssignment_7 )
            // InternalQiraa.g:1790:4: rule__Marjeh__MakatehAssignment_7
            {
            pushFollow(FOLLOW_20);
            rule__Marjeh__MakatehAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMarjehAccess().getMakatehAssignment_7()); 

            }

            // InternalQiraa.g:1793:2: ( ( rule__Marjeh__MakatehAssignment_7 )* )
            // InternalQiraa.g:1794:3: ( rule__Marjeh__MakatehAssignment_7 )*
            {
             before(grammarAccess.getMarjehAccess().getMakatehAssignment_7()); 
            // InternalQiraa.g:1795:3: ( rule__Marjeh__MakatehAssignment_7 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==40) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalQiraa.g:1795:4: rule__Marjeh__MakatehAssignment_7
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Marjeh__MakatehAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMarjehAccess().getMakatehAssignment_7()); 

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
    // InternalQiraa.g:1804:1: rule__Marjeh__Group__8 : rule__Marjeh__Group__8__Impl ;
    public final void rule__Marjeh__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1808:1: ( rule__Marjeh__Group__8__Impl )
            // InternalQiraa.g:1809:2: rule__Marjeh__Group__8__Impl
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
    // InternalQiraa.g:1815:1: rule__Marjeh__Group__8__Impl : ( '\\u0627\\u0646\\u062A\\u0647\\u0649' ) ;
    public final void rule__Marjeh__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1819:1: ( ( '\\u0627\\u0646\\u062A\\u0647\\u0649' ) )
            // InternalQiraa.g:1820:1: ( '\\u0627\\u0646\\u062A\\u0647\\u0649' )
            {
            // InternalQiraa.g:1820:1: ( '\\u0627\\u0646\\u062A\\u0647\\u0649' )
            // InternalQiraa.g:1821:2: '\\u0627\\u0646\\u062A\\u0647\\u0649'
            {
             before(grammarAccess.getMarjehAccess().getArabicLetterAlefArabicLetterNoonArabicLetterTehArabicLetterHehArabicLetterAlefMaksuraKeyword_8()); 
            match(input,39,FOLLOW_2); 
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


    // $ANTLR start "rule__Maktah__Group__0"
    // InternalQiraa.g:1831:1: rule__Maktah__Group__0 : rule__Maktah__Group__0__Impl rule__Maktah__Group__1 ;
    public final void rule__Maktah__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1835:1: ( rule__Maktah__Group__0__Impl rule__Maktah__Group__1 )
            // InternalQiraa.g:1836:2: rule__Maktah__Group__0__Impl rule__Maktah__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:1843:1: rule__Maktah__Group__0__Impl : ( '\\u0642\\u0648\\u0644\\u0647' ) ;
    public final void rule__Maktah__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1847:1: ( ( '\\u0642\\u0648\\u0644\\u0647' ) )
            // InternalQiraa.g:1848:1: ( '\\u0642\\u0648\\u0644\\u0647' )
            {
            // InternalQiraa.g:1848:1: ( '\\u0642\\u0648\\u0644\\u0647' )
            // InternalQiraa.g:1849:2: '\\u0642\\u0648\\u0644\\u0647'
            {
             before(grammarAccess.getMaktahAccess().getArabicLetterQafArabicLetterWawArabicLetterLamArabicLetterHehKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMaktahAccess().getArabicLetterQafArabicLetterWawArabicLetterLamArabicLetterHehKeyword_0()); 

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
    // InternalQiraa.g:1858:1: rule__Maktah__Group__1 : rule__Maktah__Group__1__Impl rule__Maktah__Group__2 ;
    public final void rule__Maktah__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1862:1: ( rule__Maktah__Group__1__Impl rule__Maktah__Group__2 )
            // InternalQiraa.g:1863:2: rule__Maktah__Group__1__Impl rule__Maktah__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalQiraa.g:1870:1: rule__Maktah__Group__1__Impl : ( ( rule__Maktah__NassAssignment_1 ) ) ;
    public final void rule__Maktah__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1874:1: ( ( ( rule__Maktah__NassAssignment_1 ) ) )
            // InternalQiraa.g:1875:1: ( ( rule__Maktah__NassAssignment_1 ) )
            {
            // InternalQiraa.g:1875:1: ( ( rule__Maktah__NassAssignment_1 ) )
            // InternalQiraa.g:1876:2: ( rule__Maktah__NassAssignment_1 )
            {
             before(grammarAccess.getMaktahAccess().getNassAssignment_1()); 
            // InternalQiraa.g:1877:2: ( rule__Maktah__NassAssignment_1 )
            // InternalQiraa.g:1877:3: rule__Maktah__NassAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Maktah__NassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMaktahAccess().getNassAssignment_1()); 

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
    // InternalQiraa.g:1885:1: rule__Maktah__Group__2 : rule__Maktah__Group__2__Impl rule__Maktah__Group__3 ;
    public final void rule__Maktah__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1889:1: ( rule__Maktah__Group__2__Impl rule__Maktah__Group__3 )
            // InternalQiraa.g:1890:2: rule__Maktah__Group__2__Impl rule__Maktah__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalQiraa.g:1897:1: rule__Maktah__Group__2__Impl : ( '\\u0645\\u0639\\u0646\\u0627\\u0647' ) ;
    public final void rule__Maktah__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1901:1: ( ( '\\u0645\\u0639\\u0646\\u0627\\u0647' ) )
            // InternalQiraa.g:1902:1: ( '\\u0645\\u0639\\u0646\\u0627\\u0647' )
            {
            // InternalQiraa.g:1902:1: ( '\\u0645\\u0639\\u0646\\u0627\\u0647' )
            // InternalQiraa.g:1903:2: '\\u0645\\u0639\\u0646\\u0627\\u0647'
            {
             before(grammarAccess.getMaktahAccess().getArabicLetterMeemArabicLetterAinArabicLetterNoonArabicLetterAlefArabicLetterHehKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMaktahAccess().getArabicLetterMeemArabicLetterAinArabicLetterNoonArabicLetterAlefArabicLetterHehKeyword_2()); 

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
    // InternalQiraa.g:1912:1: rule__Maktah__Group__3 : rule__Maktah__Group__3__Impl ;
    public final void rule__Maktah__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1916:1: ( rule__Maktah__Group__3__Impl )
            // InternalQiraa.g:1917:2: rule__Maktah__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Maktah__Group__3__Impl();

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
    // InternalQiraa.g:1923:1: rule__Maktah__Group__3__Impl : ( ( rule__Maktah__KedahAssignment_3 ) ) ;
    public final void rule__Maktah__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1927:1: ( ( ( rule__Maktah__KedahAssignment_3 ) ) )
            // InternalQiraa.g:1928:1: ( ( rule__Maktah__KedahAssignment_3 ) )
            {
            // InternalQiraa.g:1928:1: ( ( rule__Maktah__KedahAssignment_3 ) )
            // InternalQiraa.g:1929:2: ( rule__Maktah__KedahAssignment_3 )
            {
             before(grammarAccess.getMaktahAccess().getKedahAssignment_3()); 
            // InternalQiraa.g:1930:2: ( rule__Maktah__KedahAssignment_3 )
            // InternalQiraa.g:1930:3: rule__Maktah__KedahAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Maktah__KedahAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMaktahAccess().getKedahAssignment_3()); 

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


    // $ANTLR start "rule__Kayd__Group__0"
    // InternalQiraa.g:1939:1: rule__Kayd__Group__0 : rule__Kayd__Group__0__Impl rule__Kayd__Group__1 ;
    public final void rule__Kayd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1943:1: ( rule__Kayd__Group__0__Impl rule__Kayd__Group__1 )
            // InternalQiraa.g:1944:2: rule__Kayd__Group__0__Impl rule__Kayd__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:1951:1: rule__Kayd__Group__0__Impl : ( '\\u0642\\u064A\\u062F' ) ;
    public final void rule__Kayd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1955:1: ( ( '\\u0642\\u064A\\u062F' ) )
            // InternalQiraa.g:1956:1: ( '\\u0642\\u064A\\u062F' )
            {
            // InternalQiraa.g:1956:1: ( '\\u0642\\u064A\\u062F' )
            // InternalQiraa.g:1957:2: '\\u0642\\u064A\\u062F'
            {
             before(grammarAccess.getKaydAccess().getArabicLetterQafArabicLetterYehArabicLetterDalKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQiraa.g:1966:1: rule__Kayd__Group__1 : rule__Kayd__Group__1__Impl ;
    public final void rule__Kayd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1970:1: ( rule__Kayd__Group__1__Impl )
            // InternalQiraa.g:1971:2: rule__Kayd__Group__1__Impl
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
    // InternalQiraa.g:1977:1: rule__Kayd__Group__1__Impl : ( ( rule__Kayd__NameAssignment_1 ) ) ;
    public final void rule__Kayd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1981:1: ( ( ( rule__Kayd__NameAssignment_1 ) ) )
            // InternalQiraa.g:1982:1: ( ( rule__Kayd__NameAssignment_1 ) )
            {
            // InternalQiraa.g:1982:1: ( ( rule__Kayd__NameAssignment_1 ) )
            // InternalQiraa.g:1983:2: ( rule__Kayd__NameAssignment_1 )
            {
             before(grammarAccess.getKaydAccess().getNameAssignment_1()); 
            // InternalQiraa.g:1984:2: ( rule__Kayd__NameAssignment_1 )
            // InternalQiraa.g:1984:3: rule__Kayd__NameAssignment_1
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
    // InternalQiraa.g:1993:1: rule__Istelah__Group__0 : rule__Istelah__Group__0__Impl rule__Istelah__Group__1 ;
    public final void rule__Istelah__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1997:1: ( rule__Istelah__Group__0__Impl rule__Istelah__Group__1 )
            // InternalQiraa.g:1998:2: rule__Istelah__Group__0__Impl rule__Istelah__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:2005:1: rule__Istelah__Group__0__Impl : ( '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ) ;
    public final void rule__Istelah__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2009:1: ( ( '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ) )
            // InternalQiraa.g:2010:1: ( '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' )
            {
            // InternalQiraa.g:2010:1: ( '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' )
            // InternalQiraa.g:2011:2: '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D'
            {
             before(grammarAccess.getIstelahAccess().getArabicLetterAlefArabicLetterSadArabicLetterTahArabicLetterLamArabicLetterAlefArabicLetterHahKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalQiraa.g:2020:1: rule__Istelah__Group__1 : rule__Istelah__Group__1__Impl rule__Istelah__Group__2 ;
    public final void rule__Istelah__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2024:1: ( rule__Istelah__Group__1__Impl rule__Istelah__Group__2 )
            // InternalQiraa.g:2025:2: rule__Istelah__Group__1__Impl rule__Istelah__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalQiraa.g:2032:1: rule__Istelah__Group__1__Impl : ( ( rule__Istelah__NameAssignment_1 ) ) ;
    public final void rule__Istelah__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2036:1: ( ( ( rule__Istelah__NameAssignment_1 ) ) )
            // InternalQiraa.g:2037:1: ( ( rule__Istelah__NameAssignment_1 ) )
            {
            // InternalQiraa.g:2037:1: ( ( rule__Istelah__NameAssignment_1 ) )
            // InternalQiraa.g:2038:2: ( rule__Istelah__NameAssignment_1 )
            {
             before(grammarAccess.getIstelahAccess().getNameAssignment_1()); 
            // InternalQiraa.g:2039:2: ( rule__Istelah__NameAssignment_1 )
            // InternalQiraa.g:2039:3: rule__Istelah__NameAssignment_1
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
    // InternalQiraa.g:2047:1: rule__Istelah__Group__2 : rule__Istelah__Group__2__Impl rule__Istelah__Group__3 ;
    public final void rule__Istelah__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2051:1: ( rule__Istelah__Group__2__Impl rule__Istelah__Group__3 )
            // InternalQiraa.g:2052:2: rule__Istelah__Group__2__Impl rule__Istelah__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:2059:1: rule__Istelah__Group__2__Impl : ( '\\u064A\\u0639\\u0646\\u064A' ) ;
    public final void rule__Istelah__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2063:1: ( ( '\\u064A\\u0639\\u0646\\u064A' ) )
            // InternalQiraa.g:2064:1: ( '\\u064A\\u0639\\u0646\\u064A' )
            {
            // InternalQiraa.g:2064:1: ( '\\u064A\\u0639\\u0646\\u064A' )
            // InternalQiraa.g:2065:2: '\\u064A\\u0639\\u0646\\u064A'
            {
             before(grammarAccess.getIstelahAccess().getArabicLetterYehArabicLetterAinArabicLetterNoonArabicLetterYehKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalQiraa.g:2074:1: rule__Istelah__Group__3 : rule__Istelah__Group__3__Impl rule__Istelah__Group__4 ;
    public final void rule__Istelah__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2078:1: ( rule__Istelah__Group__3__Impl rule__Istelah__Group__4 )
            // InternalQiraa.g:2079:2: rule__Istelah__Group__3__Impl rule__Istelah__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalQiraa.g:2086:1: rule__Istelah__Group__3__Impl : ( ( rule__Istelah__RefsAssignment_3 ) ) ;
    public final void rule__Istelah__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2090:1: ( ( ( rule__Istelah__RefsAssignment_3 ) ) )
            // InternalQiraa.g:2091:1: ( ( rule__Istelah__RefsAssignment_3 ) )
            {
            // InternalQiraa.g:2091:1: ( ( rule__Istelah__RefsAssignment_3 ) )
            // InternalQiraa.g:2092:2: ( rule__Istelah__RefsAssignment_3 )
            {
             before(grammarAccess.getIstelahAccess().getRefsAssignment_3()); 
            // InternalQiraa.g:2093:2: ( rule__Istelah__RefsAssignment_3 )
            // InternalQiraa.g:2093:3: rule__Istelah__RefsAssignment_3
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
    // InternalQiraa.g:2101:1: rule__Istelah__Group__4 : rule__Istelah__Group__4__Impl ;
    public final void rule__Istelah__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2105:1: ( rule__Istelah__Group__4__Impl )
            // InternalQiraa.g:2106:2: rule__Istelah__Group__4__Impl
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
    // InternalQiraa.g:2112:1: rule__Istelah__Group__4__Impl : ( ( rule__Istelah__Group_4__0 )* ) ;
    public final void rule__Istelah__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2116:1: ( ( ( rule__Istelah__Group_4__0 )* ) )
            // InternalQiraa.g:2117:1: ( ( rule__Istelah__Group_4__0 )* )
            {
            // InternalQiraa.g:2117:1: ( ( rule__Istelah__Group_4__0 )* )
            // InternalQiraa.g:2118:2: ( rule__Istelah__Group_4__0 )*
            {
             before(grammarAccess.getIstelahAccess().getGroup_4()); 
            // InternalQiraa.g:2119:2: ( rule__Istelah__Group_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==45) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalQiraa.g:2119:3: rule__Istelah__Group_4__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Istelah__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalQiraa.g:2128:1: rule__Istelah__Group_4__0 : rule__Istelah__Group_4__0__Impl rule__Istelah__Group_4__1 ;
    public final void rule__Istelah__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2132:1: ( rule__Istelah__Group_4__0__Impl rule__Istelah__Group_4__1 )
            // InternalQiraa.g:2133:2: rule__Istelah__Group_4__0__Impl rule__Istelah__Group_4__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:2140:1: rule__Istelah__Group_4__0__Impl : ( '\\u0648' ) ;
    public final void rule__Istelah__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2144:1: ( ( '\\u0648' ) )
            // InternalQiraa.g:2145:1: ( '\\u0648' )
            {
            // InternalQiraa.g:2145:1: ( '\\u0648' )
            // InternalQiraa.g:2146:2: '\\u0648'
            {
             before(grammarAccess.getIstelahAccess().getArabicLetterWawKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalQiraa.g:2155:1: rule__Istelah__Group_4__1 : rule__Istelah__Group_4__1__Impl ;
    public final void rule__Istelah__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2159:1: ( rule__Istelah__Group_4__1__Impl )
            // InternalQiraa.g:2160:2: rule__Istelah__Group_4__1__Impl
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
    // InternalQiraa.g:2166:1: rule__Istelah__Group_4__1__Impl : ( ( rule__Istelah__RefsAssignment_4_1 ) ) ;
    public final void rule__Istelah__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2170:1: ( ( ( rule__Istelah__RefsAssignment_4_1 ) ) )
            // InternalQiraa.g:2171:1: ( ( rule__Istelah__RefsAssignment_4_1 ) )
            {
            // InternalQiraa.g:2171:1: ( ( rule__Istelah__RefsAssignment_4_1 ) )
            // InternalQiraa.g:2172:2: ( rule__Istelah__RefsAssignment_4_1 )
            {
             before(grammarAccess.getIstelahAccess().getRefsAssignment_4_1()); 
            // InternalQiraa.g:2173:2: ( rule__Istelah__RefsAssignment_4_1 )
            // InternalQiraa.g:2173:3: rule__Istelah__RefsAssignment_4_1
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
    // InternalQiraa.g:2182:1: rule__Ramz__Group__0 : rule__Ramz__Group__0__Impl rule__Ramz__Group__1 ;
    public final void rule__Ramz__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2186:1: ( rule__Ramz__Group__0__Impl rule__Ramz__Group__1 )
            // InternalQiraa.g:2187:2: rule__Ramz__Group__0__Impl rule__Ramz__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalQiraa.g:2194:1: rule__Ramz__Group__0__Impl : ( '\\u0631\\u0645\\u0632' ) ;
    public final void rule__Ramz__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2198:1: ( ( '\\u0631\\u0645\\u0632' ) )
            // InternalQiraa.g:2199:1: ( '\\u0631\\u0645\\u0632' )
            {
            // InternalQiraa.g:2199:1: ( '\\u0631\\u0645\\u0632' )
            // InternalQiraa.g:2200:2: '\\u0631\\u0645\\u0632'
            {
             before(grammarAccess.getRamzAccess().getArabicLetterRehArabicLetterMeemArabicLetterZainKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalQiraa.g:2209:1: rule__Ramz__Group__1 : rule__Ramz__Group__1__Impl rule__Ramz__Group__2 ;
    public final void rule__Ramz__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2213:1: ( rule__Ramz__Group__1__Impl rule__Ramz__Group__2 )
            // InternalQiraa.g:2214:2: rule__Ramz__Group__1__Impl rule__Ramz__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalQiraa.g:2221:1: rule__Ramz__Group__1__Impl : ( ( rule__Ramz__NameAssignment_1 ) ) ;
    public final void rule__Ramz__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2225:1: ( ( ( rule__Ramz__NameAssignment_1 ) ) )
            // InternalQiraa.g:2226:1: ( ( rule__Ramz__NameAssignment_1 ) )
            {
            // InternalQiraa.g:2226:1: ( ( rule__Ramz__NameAssignment_1 ) )
            // InternalQiraa.g:2227:2: ( rule__Ramz__NameAssignment_1 )
            {
             before(grammarAccess.getRamzAccess().getNameAssignment_1()); 
            // InternalQiraa.g:2228:2: ( rule__Ramz__NameAssignment_1 )
            // InternalQiraa.g:2228:3: rule__Ramz__NameAssignment_1
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
    // InternalQiraa.g:2236:1: rule__Ramz__Group__2 : rule__Ramz__Group__2__Impl rule__Ramz__Group__3 ;
    public final void rule__Ramz__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2240:1: ( rule__Ramz__Group__2__Impl rule__Ramz__Group__3 )
            // InternalQiraa.g:2241:2: rule__Ramz__Group__2__Impl rule__Ramz__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:2248:1: rule__Ramz__Group__2__Impl : ( '\\u064A\\u0639\\u0646\\u064A' ) ;
    public final void rule__Ramz__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2252:1: ( ( '\\u064A\\u0639\\u0646\\u064A' ) )
            // InternalQiraa.g:2253:1: ( '\\u064A\\u0639\\u0646\\u064A' )
            {
            // InternalQiraa.g:2253:1: ( '\\u064A\\u0639\\u0646\\u064A' )
            // InternalQiraa.g:2254:2: '\\u064A\\u0639\\u0646\\u064A'
            {
             before(grammarAccess.getRamzAccess().getArabicLetterYehArabicLetterAinArabicLetterNoonArabicLetterYehKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalQiraa.g:2263:1: rule__Ramz__Group__3 : rule__Ramz__Group__3__Impl rule__Ramz__Group__4 ;
    public final void rule__Ramz__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2267:1: ( rule__Ramz__Group__3__Impl rule__Ramz__Group__4 )
            // InternalQiraa.g:2268:2: rule__Ramz__Group__3__Impl rule__Ramz__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalQiraa.g:2275:1: rule__Ramz__Group__3__Impl : ( ( rule__Ramz__RefsAssignment_3 ) ) ;
    public final void rule__Ramz__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2279:1: ( ( ( rule__Ramz__RefsAssignment_3 ) ) )
            // InternalQiraa.g:2280:1: ( ( rule__Ramz__RefsAssignment_3 ) )
            {
            // InternalQiraa.g:2280:1: ( ( rule__Ramz__RefsAssignment_3 ) )
            // InternalQiraa.g:2281:2: ( rule__Ramz__RefsAssignment_3 )
            {
             before(grammarAccess.getRamzAccess().getRefsAssignment_3()); 
            // InternalQiraa.g:2282:2: ( rule__Ramz__RefsAssignment_3 )
            // InternalQiraa.g:2282:3: rule__Ramz__RefsAssignment_3
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
    // InternalQiraa.g:2290:1: rule__Ramz__Group__4 : rule__Ramz__Group__4__Impl ;
    public final void rule__Ramz__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2294:1: ( rule__Ramz__Group__4__Impl )
            // InternalQiraa.g:2295:2: rule__Ramz__Group__4__Impl
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
    // InternalQiraa.g:2301:1: rule__Ramz__Group__4__Impl : ( ( rule__Ramz__Group_4__0 )* ) ;
    public final void rule__Ramz__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2305:1: ( ( ( rule__Ramz__Group_4__0 )* ) )
            // InternalQiraa.g:2306:1: ( ( rule__Ramz__Group_4__0 )* )
            {
            // InternalQiraa.g:2306:1: ( ( rule__Ramz__Group_4__0 )* )
            // InternalQiraa.g:2307:2: ( rule__Ramz__Group_4__0 )*
            {
             before(grammarAccess.getRamzAccess().getGroup_4()); 
            // InternalQiraa.g:2308:2: ( rule__Ramz__Group_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==45) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalQiraa.g:2308:3: rule__Ramz__Group_4__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Ramz__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalQiraa.g:2317:1: rule__Ramz__Group_4__0 : rule__Ramz__Group_4__0__Impl rule__Ramz__Group_4__1 ;
    public final void rule__Ramz__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2321:1: ( rule__Ramz__Group_4__0__Impl rule__Ramz__Group_4__1 )
            // InternalQiraa.g:2322:2: rule__Ramz__Group_4__0__Impl rule__Ramz__Group_4__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:2329:1: rule__Ramz__Group_4__0__Impl : ( '\\u0648' ) ;
    public final void rule__Ramz__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2333:1: ( ( '\\u0648' ) )
            // InternalQiraa.g:2334:1: ( '\\u0648' )
            {
            // InternalQiraa.g:2334:1: ( '\\u0648' )
            // InternalQiraa.g:2335:2: '\\u0648'
            {
             before(grammarAccess.getRamzAccess().getArabicLetterWawKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalQiraa.g:2344:1: rule__Ramz__Group_4__1 : rule__Ramz__Group_4__1__Impl ;
    public final void rule__Ramz__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2348:1: ( rule__Ramz__Group_4__1__Impl )
            // InternalQiraa.g:2349:2: rule__Ramz__Group_4__1__Impl
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
    // InternalQiraa.g:2355:1: rule__Ramz__Group_4__1__Impl : ( ( rule__Ramz__RefsAssignment_4_1 ) ) ;
    public final void rule__Ramz__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2359:1: ( ( ( rule__Ramz__RefsAssignment_4_1 ) ) )
            // InternalQiraa.g:2360:1: ( ( rule__Ramz__RefsAssignment_4_1 ) )
            {
            // InternalQiraa.g:2360:1: ( ( rule__Ramz__RefsAssignment_4_1 ) )
            // InternalQiraa.g:2361:2: ( rule__Ramz__RefsAssignment_4_1 )
            {
             before(grammarAccess.getRamzAccess().getRefsAssignment_4_1()); 
            // InternalQiraa.g:2362:2: ( rule__Ramz__RefsAssignment_4_1 )
            // InternalQiraa.g:2362:3: rule__Ramz__RefsAssignment_4_1
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


    // $ANTLR start "rule__Kaaedah__Group__0"
    // InternalQiraa.g:2371:1: rule__Kaaedah__Group__0 : rule__Kaaedah__Group__0__Impl rule__Kaaedah__Group__1 ;
    public final void rule__Kaaedah__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2375:1: ( rule__Kaaedah__Group__0__Impl rule__Kaaedah__Group__1 )
            // InternalQiraa.g:2376:2: rule__Kaaedah__Group__0__Impl rule__Kaaedah__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:2383:1: rule__Kaaedah__Group__0__Impl : ( '\\u0642\\u0631\\u0623' ) ;
    public final void rule__Kaaedah__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2387:1: ( ( '\\u0642\\u0631\\u0623' ) )
            // InternalQiraa.g:2388:1: ( '\\u0642\\u0631\\u0623' )
            {
            // InternalQiraa.g:2388:1: ( '\\u0642\\u0631\\u0623' )
            // InternalQiraa.g:2389:2: '\\u0642\\u0631\\u0623'
            {
             before(grammarAccess.getKaaedahAccess().getArabicLetterQafArabicLetterRehArabicLetterAlefWithHamzaAboveKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalQiraa.g:2398:1: rule__Kaaedah__Group__1 : rule__Kaaedah__Group__1__Impl rule__Kaaedah__Group__2 ;
    public final void rule__Kaaedah__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2402:1: ( rule__Kaaedah__Group__1__Impl rule__Kaaedah__Group__2 )
            // InternalQiraa.g:2403:2: rule__Kaaedah__Group__1__Impl rule__Kaaedah__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalQiraa.g:2410:1: rule__Kaaedah__Group__1__Impl : ( ( rule__Kaaedah__RefsAssignment_1 ) ) ;
    public final void rule__Kaaedah__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2414:1: ( ( ( rule__Kaaedah__RefsAssignment_1 ) ) )
            // InternalQiraa.g:2415:1: ( ( rule__Kaaedah__RefsAssignment_1 ) )
            {
            // InternalQiraa.g:2415:1: ( ( rule__Kaaedah__RefsAssignment_1 ) )
            // InternalQiraa.g:2416:2: ( rule__Kaaedah__RefsAssignment_1 )
            {
             before(grammarAccess.getKaaedahAccess().getRefsAssignment_1()); 
            // InternalQiraa.g:2417:2: ( rule__Kaaedah__RefsAssignment_1 )
            // InternalQiraa.g:2417:3: rule__Kaaedah__RefsAssignment_1
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
    // InternalQiraa.g:2425:1: rule__Kaaedah__Group__2 : rule__Kaaedah__Group__2__Impl rule__Kaaedah__Group__3 ;
    public final void rule__Kaaedah__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2429:1: ( rule__Kaaedah__Group__2__Impl rule__Kaaedah__Group__3 )
            // InternalQiraa.g:2430:2: rule__Kaaedah__Group__2__Impl rule__Kaaedah__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:2437:1: rule__Kaaedah__Group__2__Impl : ( '\\u0628' ) ;
    public final void rule__Kaaedah__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2441:1: ( ( '\\u0628' ) )
            // InternalQiraa.g:2442:1: ( '\\u0628' )
            {
            // InternalQiraa.g:2442:1: ( '\\u0628' )
            // InternalQiraa.g:2443:2: '\\u0628'
            {
             before(grammarAccess.getKaaedahAccess().getArabicLetterBehKeyword_2()); 
            match(input,48,FOLLOW_2); 
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
    // InternalQiraa.g:2452:1: rule__Kaaedah__Group__3 : rule__Kaaedah__Group__3__Impl rule__Kaaedah__Group__4 ;
    public final void rule__Kaaedah__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2456:1: ( rule__Kaaedah__Group__3__Impl rule__Kaaedah__Group__4 )
            // InternalQiraa.g:2457:2: rule__Kaaedah__Group__3__Impl rule__Kaaedah__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalQiraa.g:2464:1: rule__Kaaedah__Group__3__Impl : ( ( rule__Kaaedah__KaydAssignment_3 ) ) ;
    public final void rule__Kaaedah__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2468:1: ( ( ( rule__Kaaedah__KaydAssignment_3 ) ) )
            // InternalQiraa.g:2469:1: ( ( rule__Kaaedah__KaydAssignment_3 ) )
            {
            // InternalQiraa.g:2469:1: ( ( rule__Kaaedah__KaydAssignment_3 ) )
            // InternalQiraa.g:2470:2: ( rule__Kaaedah__KaydAssignment_3 )
            {
             before(grammarAccess.getKaaedahAccess().getKaydAssignment_3()); 
            // InternalQiraa.g:2471:2: ( rule__Kaaedah__KaydAssignment_3 )
            // InternalQiraa.g:2471:3: rule__Kaaedah__KaydAssignment_3
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
    // InternalQiraa.g:2479:1: rule__Kaaedah__Group__4 : rule__Kaaedah__Group__4__Impl rule__Kaaedah__Group__5 ;
    public final void rule__Kaaedah__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2483:1: ( rule__Kaaedah__Group__4__Impl rule__Kaaedah__Group__5 )
            // InternalQiraa.g:2484:2: rule__Kaaedah__Group__4__Impl rule__Kaaedah__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalQiraa.g:2491:1: rule__Kaaedah__Group__4__Impl : ( '\\u0641\\u064A' ) ;
    public final void rule__Kaaedah__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2495:1: ( ( '\\u0641\\u064A' ) )
            // InternalQiraa.g:2496:1: ( '\\u0641\\u064A' )
            {
            // InternalQiraa.g:2496:1: ( '\\u0641\\u064A' )
            // InternalQiraa.g:2497:2: '\\u0641\\u064A'
            {
             before(grammarAccess.getKaaedahAccess().getArabicLetterFehArabicLetterYehKeyword_4()); 
            match(input,49,FOLLOW_2); 
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
    // InternalQiraa.g:2506:1: rule__Kaaedah__Group__5 : rule__Kaaedah__Group__5__Impl ;
    public final void rule__Kaaedah__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2510:1: ( rule__Kaaedah__Group__5__Impl )
            // InternalQiraa.g:2511:2: rule__Kaaedah__Group__5__Impl
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
    // InternalQiraa.g:2517:1: rule__Kaaedah__Group__5__Impl : ( ( rule__Kaaedah__HarfAssignment_5 ) ) ;
    public final void rule__Kaaedah__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2521:1: ( ( ( rule__Kaaedah__HarfAssignment_5 ) ) )
            // InternalQiraa.g:2522:1: ( ( rule__Kaaedah__HarfAssignment_5 ) )
            {
            // InternalQiraa.g:2522:1: ( ( rule__Kaaedah__HarfAssignment_5 ) )
            // InternalQiraa.g:2523:2: ( rule__Kaaedah__HarfAssignment_5 )
            {
             before(grammarAccess.getKaaedahAccess().getHarfAssignment_5()); 
            // InternalQiraa.g:2524:2: ( rule__Kaaedah__HarfAssignment_5 )
            // InternalQiraa.g:2524:3: rule__Kaaedah__HarfAssignment_5
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


    // $ANTLR start "rule__HarfQuran__Group__0"
    // InternalQiraa.g:2533:1: rule__HarfQuran__Group__0 : rule__HarfQuran__Group__0__Impl rule__HarfQuran__Group__1 ;
    public final void rule__HarfQuran__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2537:1: ( rule__HarfQuran__Group__0__Impl rule__HarfQuran__Group__1 )
            // InternalQiraa.g:2538:2: rule__HarfQuran__Group__0__Impl rule__HarfQuran__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalQiraa.g:2545:1: rule__HarfQuran__Group__0__Impl : ( ( rule__HarfQuran__WordAssignment_0 ) ) ;
    public final void rule__HarfQuran__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2549:1: ( ( ( rule__HarfQuran__WordAssignment_0 ) ) )
            // InternalQiraa.g:2550:1: ( ( rule__HarfQuran__WordAssignment_0 ) )
            {
            // InternalQiraa.g:2550:1: ( ( rule__HarfQuran__WordAssignment_0 ) )
            // InternalQiraa.g:2551:2: ( rule__HarfQuran__WordAssignment_0 )
            {
             before(grammarAccess.getHarfQuranAccess().getWordAssignment_0()); 
            // InternalQiraa.g:2552:2: ( rule__HarfQuran__WordAssignment_0 )
            // InternalQiraa.g:2552:3: rule__HarfQuran__WordAssignment_0
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
    // InternalQiraa.g:2560:1: rule__HarfQuran__Group__1 : rule__HarfQuran__Group__1__Impl rule__HarfQuran__Group__2 ;
    public final void rule__HarfQuran__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2564:1: ( rule__HarfQuran__Group__1__Impl rule__HarfQuran__Group__2 )
            // InternalQiraa.g:2565:2: rule__HarfQuran__Group__1__Impl rule__HarfQuran__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalQiraa.g:2572:1: rule__HarfQuran__Group__1__Impl : ( '\\u0645\\u0646' ) ;
    public final void rule__HarfQuran__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2576:1: ( ( '\\u0645\\u0646' ) )
            // InternalQiraa.g:2577:1: ( '\\u0645\\u0646' )
            {
            // InternalQiraa.g:2577:1: ( '\\u0645\\u0646' )
            // InternalQiraa.g:2578:2: '\\u0645\\u0646'
            {
             before(grammarAccess.getHarfQuranAccess().getArabicLetterMeemArabicLetterNoonKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalQiraa.g:2587:1: rule__HarfQuran__Group__2 : rule__HarfQuran__Group__2__Impl rule__HarfQuran__Group__3 ;
    public final void rule__HarfQuran__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2591:1: ( rule__HarfQuran__Group__2__Impl rule__HarfQuran__Group__3 )
            // InternalQiraa.g:2592:2: rule__HarfQuran__Group__2__Impl rule__HarfQuran__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalQiraa.g:2599:1: rule__HarfQuran__Group__2__Impl : ( '\\u0642\\u0648\\u0644\\u0647' ) ;
    public final void rule__HarfQuran__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2603:1: ( ( '\\u0642\\u0648\\u0644\\u0647' ) )
            // InternalQiraa.g:2604:1: ( '\\u0642\\u0648\\u0644\\u0647' )
            {
            // InternalQiraa.g:2604:1: ( '\\u0642\\u0648\\u0644\\u0647' )
            // InternalQiraa.g:2605:2: '\\u0642\\u0648\\u0644\\u0647'
            {
             before(grammarAccess.getHarfQuranAccess().getArabicLetterQafArabicLetterWawArabicLetterLamArabicLetterHehKeyword_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalQiraa.g:2614:1: rule__HarfQuran__Group__3 : rule__HarfQuran__Group__3__Impl rule__HarfQuran__Group__4 ;
    public final void rule__HarfQuran__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2618:1: ( rule__HarfQuran__Group__3__Impl rule__HarfQuran__Group__4 )
            // InternalQiraa.g:2619:2: rule__HarfQuran__Group__3__Impl rule__HarfQuran__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:2626:1: rule__HarfQuran__Group__3__Impl : ( '\\u062A\\u0639\\u0627\\u0644\\u0649' ) ;
    public final void rule__HarfQuran__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2630:1: ( ( '\\u062A\\u0639\\u0627\\u0644\\u0649' ) )
            // InternalQiraa.g:2631:1: ( '\\u062A\\u0639\\u0627\\u0644\\u0649' )
            {
            // InternalQiraa.g:2631:1: ( '\\u062A\\u0639\\u0627\\u0644\\u0649' )
            // InternalQiraa.g:2632:2: '\\u062A\\u0639\\u0627\\u0644\\u0649'
            {
             before(grammarAccess.getHarfQuranAccess().getArabicLetterTehArabicLetterAinArabicLetterAlefArabicLetterLamArabicLetterAlefMaksuraKeyword_3()); 
            match(input,50,FOLLOW_2); 
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
    // InternalQiraa.g:2641:1: rule__HarfQuran__Group__4 : rule__HarfQuran__Group__4__Impl rule__HarfQuran__Group__5 ;
    public final void rule__HarfQuran__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2645:1: ( rule__HarfQuran__Group__4__Impl rule__HarfQuran__Group__5 )
            // InternalQiraa.g:2646:2: rule__HarfQuran__Group__4__Impl rule__HarfQuran__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalQiraa.g:2653:1: rule__HarfQuran__Group__4__Impl : ( ( rule__HarfQuran__AyahAssignment_4 ) ) ;
    public final void rule__HarfQuran__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2657:1: ( ( ( rule__HarfQuran__AyahAssignment_4 ) ) )
            // InternalQiraa.g:2658:1: ( ( rule__HarfQuran__AyahAssignment_4 ) )
            {
            // InternalQiraa.g:2658:1: ( ( rule__HarfQuran__AyahAssignment_4 ) )
            // InternalQiraa.g:2659:2: ( rule__HarfQuran__AyahAssignment_4 )
            {
             before(grammarAccess.getHarfQuranAccess().getAyahAssignment_4()); 
            // InternalQiraa.g:2660:2: ( rule__HarfQuran__AyahAssignment_4 )
            // InternalQiraa.g:2660:3: rule__HarfQuran__AyahAssignment_4
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
    // InternalQiraa.g:2668:1: rule__HarfQuran__Group__5 : rule__HarfQuran__Group__5__Impl ;
    public final void rule__HarfQuran__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2672:1: ( rule__HarfQuran__Group__5__Impl )
            // InternalQiraa.g:2673:2: rule__HarfQuran__Group__5__Impl
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
    // InternalQiraa.g:2679:1: rule__HarfQuran__Group__5__Impl : ( ( rule__HarfQuran__Group_5__0 )? ) ;
    public final void rule__HarfQuran__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2683:1: ( ( ( rule__HarfQuran__Group_5__0 )? ) )
            // InternalQiraa.g:2684:1: ( ( rule__HarfQuran__Group_5__0 )? )
            {
            // InternalQiraa.g:2684:1: ( ( rule__HarfQuran__Group_5__0 )? )
            // InternalQiraa.g:2685:2: ( rule__HarfQuran__Group_5__0 )?
            {
             before(grammarAccess.getHarfQuranAccess().getGroup_5()); 
            // InternalQiraa.g:2686:2: ( rule__HarfQuran__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==51) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalQiraa.g:2686:3: rule__HarfQuran__Group_5__0
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
    // InternalQiraa.g:2695:1: rule__HarfQuran__Group_5__0 : rule__HarfQuran__Group_5__0__Impl rule__HarfQuran__Group_5__1 ;
    public final void rule__HarfQuran__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2699:1: ( rule__HarfQuran__Group_5__0__Impl rule__HarfQuran__Group_5__1 )
            // InternalQiraa.g:2700:2: rule__HarfQuran__Group_5__0__Impl rule__HarfQuran__Group_5__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalQiraa.g:2707:1: rule__HarfQuran__Group_5__0__Impl : ( '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' ) ;
    public final void rule__HarfQuran__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2711:1: ( ( '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' ) )
            // InternalQiraa.g:2712:1: ( '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' )
            {
            // InternalQiraa.g:2712:1: ( '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' )
            // InternalQiraa.g:2713:2: '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639'
            {
             before(grammarAccess.getHarfQuranAccess().getArabicLetterAlefArabicLetterLamArabicLetterMeemArabicLetterWawArabicLetterDadArabicLetterAinKeyword_5_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalQiraa.g:2722:1: rule__HarfQuran__Group_5__1 : rule__HarfQuran__Group_5__1__Impl ;
    public final void rule__HarfQuran__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2726:1: ( rule__HarfQuran__Group_5__1__Impl )
            // InternalQiraa.g:2727:2: rule__HarfQuran__Group_5__1__Impl
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
    // InternalQiraa.g:2733:1: rule__HarfQuran__Group_5__1__Impl : ( ( rule__HarfQuran__MawdeeAssignment_5_1 ) ) ;
    public final void rule__HarfQuran__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2737:1: ( ( ( rule__HarfQuran__MawdeeAssignment_5_1 ) ) )
            // InternalQiraa.g:2738:1: ( ( rule__HarfQuran__MawdeeAssignment_5_1 ) )
            {
            // InternalQiraa.g:2738:1: ( ( rule__HarfQuran__MawdeeAssignment_5_1 ) )
            // InternalQiraa.g:2739:2: ( rule__HarfQuran__MawdeeAssignment_5_1 )
            {
             before(grammarAccess.getHarfQuranAccess().getMawdeeAssignment_5_1()); 
            // InternalQiraa.g:2740:2: ( rule__HarfQuran__MawdeeAssignment_5_1 )
            // InternalQiraa.g:2740:3: rule__HarfQuran__MawdeeAssignment_5_1
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
    // InternalQiraa.g:2749:1: rule__Harf__Group__0 : rule__Harf__Group__0__Impl rule__Harf__Group__1 ;
    public final void rule__Harf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2753:1: ( rule__Harf__Group__0__Impl rule__Harf__Group__1 )
            // InternalQiraa.g:2754:2: rule__Harf__Group__0__Impl rule__Harf__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalQiraa.g:2761:1: rule__Harf__Group__0__Impl : ( '\\u062D\\u0631\\u0641' ) ;
    public final void rule__Harf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2765:1: ( ( '\\u062D\\u0631\\u0641' ) )
            // InternalQiraa.g:2766:1: ( '\\u062D\\u0631\\u0641' )
            {
            // InternalQiraa.g:2766:1: ( '\\u062D\\u0631\\u0641' )
            // InternalQiraa.g:2767:2: '\\u062D\\u0631\\u0641'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterHahArabicLetterRehArabicLetterFehKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalQiraa.g:2776:1: rule__Harf__Group__1 : rule__Harf__Group__1__Impl rule__Harf__Group__2 ;
    public final void rule__Harf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2780:1: ( rule__Harf__Group__1__Impl rule__Harf__Group__2 )
            // InternalQiraa.g:2781:2: rule__Harf__Group__1__Impl rule__Harf__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalQiraa.g:2788:1: rule__Harf__Group__1__Impl : ( ( rule__Harf__NameAssignment_1 ) ) ;
    public final void rule__Harf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2792:1: ( ( ( rule__Harf__NameAssignment_1 ) ) )
            // InternalQiraa.g:2793:1: ( ( rule__Harf__NameAssignment_1 ) )
            {
            // InternalQiraa.g:2793:1: ( ( rule__Harf__NameAssignment_1 ) )
            // InternalQiraa.g:2794:2: ( rule__Harf__NameAssignment_1 )
            {
             before(grammarAccess.getHarfAccess().getNameAssignment_1()); 
            // InternalQiraa.g:2795:2: ( rule__Harf__NameAssignment_1 )
            // InternalQiraa.g:2795:3: rule__Harf__NameAssignment_1
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
    // InternalQiraa.g:2803:1: rule__Harf__Group__2 : rule__Harf__Group__2__Impl ;
    public final void rule__Harf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2807:1: ( rule__Harf__Group__2__Impl )
            // InternalQiraa.g:2808:2: rule__Harf__Group__2__Impl
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
    // InternalQiraa.g:2814:1: rule__Harf__Group__2__Impl : ( ( rule__Harf__Alternatives_2 ) ) ;
    public final void rule__Harf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2818:1: ( ( ( rule__Harf__Alternatives_2 ) ) )
            // InternalQiraa.g:2819:1: ( ( rule__Harf__Alternatives_2 ) )
            {
            // InternalQiraa.g:2819:1: ( ( rule__Harf__Alternatives_2 ) )
            // InternalQiraa.g:2820:2: ( rule__Harf__Alternatives_2 )
            {
             before(grammarAccess.getHarfAccess().getAlternatives_2()); 
            // InternalQiraa.g:2821:2: ( rule__Harf__Alternatives_2 )
            // InternalQiraa.g:2821:3: rule__Harf__Alternatives_2
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
    // InternalQiraa.g:2830:1: rule__Harf__Group_2_0__0 : rule__Harf__Group_2_0__0__Impl rule__Harf__Group_2_0__1 ;
    public final void rule__Harf__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2834:1: ( rule__Harf__Group_2_0__0__Impl rule__Harf__Group_2_0__1 )
            // InternalQiraa.g:2835:2: rule__Harf__Group_2_0__0__Impl rule__Harf__Group_2_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalQiraa.g:2842:1: rule__Harf__Group_2_0__0__Impl : ( '\\u0647\\u0648' ) ;
    public final void rule__Harf__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2846:1: ( ( '\\u0647\\u0648' ) )
            // InternalQiraa.g:2847:1: ( '\\u0647\\u0648' )
            {
            // InternalQiraa.g:2847:1: ( '\\u0647\\u0648' )
            // InternalQiraa.g:2848:2: '\\u0647\\u0648'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterHehArabicLetterWawKeyword_2_0_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalQiraa.g:2857:1: rule__Harf__Group_2_0__1 : rule__Harf__Group_2_0__1__Impl rule__Harf__Group_2_0__2 ;
    public final void rule__Harf__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2861:1: ( rule__Harf__Group_2_0__1__Impl rule__Harf__Group_2_0__2 )
            // InternalQiraa.g:2862:2: rule__Harf__Group_2_0__1__Impl rule__Harf__Group_2_0__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalQiraa.g:2869:1: rule__Harf__Group_2_0__1__Impl : ( ( rule__Harf__ValuesAssignment_2_0_1 ) ) ;
    public final void rule__Harf__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2873:1: ( ( ( rule__Harf__ValuesAssignment_2_0_1 ) ) )
            // InternalQiraa.g:2874:1: ( ( rule__Harf__ValuesAssignment_2_0_1 ) )
            {
            // InternalQiraa.g:2874:1: ( ( rule__Harf__ValuesAssignment_2_0_1 ) )
            // InternalQiraa.g:2875:2: ( rule__Harf__ValuesAssignment_2_0_1 )
            {
             before(grammarAccess.getHarfAccess().getValuesAssignment_2_0_1()); 
            // InternalQiraa.g:2876:2: ( rule__Harf__ValuesAssignment_2_0_1 )
            // InternalQiraa.g:2876:3: rule__Harf__ValuesAssignment_2_0_1
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
    // InternalQiraa.g:2884:1: rule__Harf__Group_2_0__2 : rule__Harf__Group_2_0__2__Impl ;
    public final void rule__Harf__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2888:1: ( rule__Harf__Group_2_0__2__Impl )
            // InternalQiraa.g:2889:2: rule__Harf__Group_2_0__2__Impl
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
    // InternalQiraa.g:2895:1: rule__Harf__Group_2_0__2__Impl : ( ( rule__Harf__Group_2_0_2__0 )* ) ;
    public final void rule__Harf__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2899:1: ( ( ( rule__Harf__Group_2_0_2__0 )* ) )
            // InternalQiraa.g:2900:1: ( ( rule__Harf__Group_2_0_2__0 )* )
            {
            // InternalQiraa.g:2900:1: ( ( rule__Harf__Group_2_0_2__0 )* )
            // InternalQiraa.g:2901:2: ( rule__Harf__Group_2_0_2__0 )*
            {
             before(grammarAccess.getHarfAccess().getGroup_2_0_2()); 
            // InternalQiraa.g:2902:2: ( rule__Harf__Group_2_0_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==54) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalQiraa.g:2902:3: rule__Harf__Group_2_0_2__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Harf__Group_2_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalQiraa.g:2911:1: rule__Harf__Group_2_0_2__0 : rule__Harf__Group_2_0_2__0__Impl rule__Harf__Group_2_0_2__1 ;
    public final void rule__Harf__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2915:1: ( rule__Harf__Group_2_0_2__0__Impl rule__Harf__Group_2_0_2__1 )
            // InternalQiraa.g:2916:2: rule__Harf__Group_2_0_2__0__Impl rule__Harf__Group_2_0_2__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalQiraa.g:2923:1: rule__Harf__Group_2_0_2__0__Impl : ( '\\u0623\\u0648' ) ;
    public final void rule__Harf__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2927:1: ( ( '\\u0623\\u0648' ) )
            // InternalQiraa.g:2928:1: ( '\\u0623\\u0648' )
            {
            // InternalQiraa.g:2928:1: ( '\\u0623\\u0648' )
            // InternalQiraa.g:2929:2: '\\u0623\\u0648'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterAlefWithHamzaAboveArabicLetterWawKeyword_2_0_2_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalQiraa.g:2938:1: rule__Harf__Group_2_0_2__1 : rule__Harf__Group_2_0_2__1__Impl ;
    public final void rule__Harf__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2942:1: ( rule__Harf__Group_2_0_2__1__Impl )
            // InternalQiraa.g:2943:2: rule__Harf__Group_2_0_2__1__Impl
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
    // InternalQiraa.g:2949:1: rule__Harf__Group_2_0_2__1__Impl : ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) ) ;
    public final void rule__Harf__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2953:1: ( ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) ) )
            // InternalQiraa.g:2954:1: ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) )
            {
            // InternalQiraa.g:2954:1: ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) )
            // InternalQiraa.g:2955:2: ( rule__Harf__ValuesAssignment_2_0_2_1 )
            {
             before(grammarAccess.getHarfAccess().getValuesAssignment_2_0_2_1()); 
            // InternalQiraa.g:2956:2: ( rule__Harf__ValuesAssignment_2_0_2_1 )
            // InternalQiraa.g:2956:3: rule__Harf__ValuesAssignment_2_0_2_1
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
    // InternalQiraa.g:2965:1: rule__Harf__Group_2_1__0 : rule__Harf__Group_2_1__0__Impl rule__Harf__Group_2_1__1 ;
    public final void rule__Harf__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2969:1: ( rule__Harf__Group_2_1__0__Impl rule__Harf__Group_2_1__1 )
            // InternalQiraa.g:2970:2: rule__Harf__Group_2_1__0__Impl rule__Harf__Group_2_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalQiraa.g:2977:1: rule__Harf__Group_2_1__0__Impl : ( '\\u0630\\u0627\\u062A\\u0647' ) ;
    public final void rule__Harf__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2981:1: ( ( '\\u0630\\u0627\\u062A\\u0647' ) )
            // InternalQiraa.g:2982:1: ( '\\u0630\\u0627\\u062A\\u0647' )
            {
            // InternalQiraa.g:2982:1: ( '\\u0630\\u0627\\u062A\\u0647' )
            // InternalQiraa.g:2983:2: '\\u0630\\u0627\\u062A\\u0647'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterThalArabicLetterAlefArabicLetterTehArabicLetterHehKeyword_2_1_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalQiraa.g:2992:1: rule__Harf__Group_2_1__1 : rule__Harf__Group_2_1__1__Impl ;
    public final void rule__Harf__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:2996:1: ( rule__Harf__Group_2_1__1__Impl )
            // InternalQiraa.g:2997:2: rule__Harf__Group_2_1__1__Impl
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
    // InternalQiraa.g:3003:1: rule__Harf__Group_2_1__1__Impl : ( ( rule__Harf__RefAssignment_2_1_1 ) ) ;
    public final void rule__Harf__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3007:1: ( ( ( rule__Harf__RefAssignment_2_1_1 ) ) )
            // InternalQiraa.g:3008:1: ( ( rule__Harf__RefAssignment_2_1_1 ) )
            {
            // InternalQiraa.g:3008:1: ( ( rule__Harf__RefAssignment_2_1_1 ) )
            // InternalQiraa.g:3009:2: ( rule__Harf__RefAssignment_2_1_1 )
            {
             before(grammarAccess.getHarfAccess().getRefAssignment_2_1_1()); 
            // InternalQiraa.g:3010:2: ( rule__Harf__RefAssignment_2_1_1 )
            // InternalQiraa.g:3010:3: rule__Harf__RefAssignment_2_1_1
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
    // InternalQiraa.g:3019:1: rule__Harakah__Group__0 : rule__Harakah__Group__0__Impl rule__Harakah__Group__1 ;
    public final void rule__Harakah__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3023:1: ( rule__Harakah__Group__0__Impl rule__Harakah__Group__1 )
            // InternalQiraa.g:3024:2: rule__Harakah__Group__0__Impl rule__Harakah__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:3031:1: rule__Harakah__Group__0__Impl : ( '\\u062D\\u0631\\u0643\\u0629' ) ;
    public final void rule__Harakah__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3035:1: ( ( '\\u062D\\u0631\\u0643\\u0629' ) )
            // InternalQiraa.g:3036:1: ( '\\u062D\\u0631\\u0643\\u0629' )
            {
            // InternalQiraa.g:3036:1: ( '\\u062D\\u0631\\u0643\\u0629' )
            // InternalQiraa.g:3037:2: '\\u062D\\u0631\\u0643\\u0629'
            {
             before(grammarAccess.getHarakahAccess().getArabicLetterHahArabicLetterRehArabicLetterKafArabicLetterTehMarbutaKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalQiraa.g:3046:1: rule__Harakah__Group__1 : rule__Harakah__Group__1__Impl rule__Harakah__Group__2 ;
    public final void rule__Harakah__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3050:1: ( rule__Harakah__Group__1__Impl rule__Harakah__Group__2 )
            // InternalQiraa.g:3051:2: rule__Harakah__Group__1__Impl rule__Harakah__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalQiraa.g:3058:1: rule__Harakah__Group__1__Impl : ( ( rule__Harakah__NameAssignment_1 ) ) ;
    public final void rule__Harakah__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3062:1: ( ( ( rule__Harakah__NameAssignment_1 ) ) )
            // InternalQiraa.g:3063:1: ( ( rule__Harakah__NameAssignment_1 ) )
            {
            // InternalQiraa.g:3063:1: ( ( rule__Harakah__NameAssignment_1 ) )
            // InternalQiraa.g:3064:2: ( rule__Harakah__NameAssignment_1 )
            {
             before(grammarAccess.getHarakahAccess().getNameAssignment_1()); 
            // InternalQiraa.g:3065:2: ( rule__Harakah__NameAssignment_1 )
            // InternalQiraa.g:3065:3: rule__Harakah__NameAssignment_1
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
    // InternalQiraa.g:3073:1: rule__Harakah__Group__2 : rule__Harakah__Group__2__Impl rule__Harakah__Group__3 ;
    public final void rule__Harakah__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3077:1: ( rule__Harakah__Group__2__Impl rule__Harakah__Group__3 )
            // InternalQiraa.g:3078:2: rule__Harakah__Group__2__Impl rule__Harakah__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalQiraa.g:3085:1: rule__Harakah__Group__2__Impl : ( '\\u0647\\u064A' ) ;
    public final void rule__Harakah__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3089:1: ( ( '\\u0647\\u064A' ) )
            // InternalQiraa.g:3090:1: ( '\\u0647\\u064A' )
            {
            // InternalQiraa.g:3090:1: ( '\\u0647\\u064A' )
            // InternalQiraa.g:3091:2: '\\u0647\\u064A'
            {
             before(grammarAccess.getHarakahAccess().getArabicLetterHehArabicLetterYehKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalQiraa.g:3100:1: rule__Harakah__Group__3 : rule__Harakah__Group__3__Impl ;
    public final void rule__Harakah__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3104:1: ( rule__Harakah__Group__3__Impl )
            // InternalQiraa.g:3105:2: rule__Harakah__Group__3__Impl
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
    // InternalQiraa.g:3111:1: rule__Harakah__Group__3__Impl : ( ( rule__Harakah__ValueAssignment_3 ) ) ;
    public final void rule__Harakah__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3115:1: ( ( ( rule__Harakah__ValueAssignment_3 ) ) )
            // InternalQiraa.g:3116:1: ( ( rule__Harakah__ValueAssignment_3 ) )
            {
            // InternalQiraa.g:3116:1: ( ( rule__Harakah__ValueAssignment_3 ) )
            // InternalQiraa.g:3117:2: ( rule__Harakah__ValueAssignment_3 )
            {
             before(grammarAccess.getHarakahAccess().getValueAssignment_3()); 
            // InternalQiraa.g:3118:2: ( rule__Harakah__ValueAssignment_3 )
            // InternalQiraa.g:3118:3: rule__Harakah__ValueAssignment_3
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
    // InternalQiraa.g:3127:1: rule__AyahStart__Group__0 : rule__AyahStart__Group__0__Impl rule__AyahStart__Group__1 ;
    public final void rule__AyahStart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3131:1: ( rule__AyahStart__Group__0__Impl rule__AyahStart__Group__1 )
            // InternalQiraa.g:3132:2: rule__AyahStart__Group__0__Impl rule__AyahStart__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalQiraa.g:3139:1: rule__AyahStart__Group__0__Impl : ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ) ;
    public final void rule__AyahStart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3143:1: ( ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ) )
            // InternalQiraa.g:3144:1: ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' )
            {
            // InternalQiraa.g:3144:1: ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' )
            // InternalQiraa.g:3145:2: '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'
            {
             before(grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterSeenArabicLetterWawArabicLetterRehArabicLetterTehMarbutaKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalQiraa.g:3154:1: rule__AyahStart__Group__1 : rule__AyahStart__Group__1__Impl rule__AyahStart__Group__2 ;
    public final void rule__AyahStart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3158:1: ( rule__AyahStart__Group__1__Impl rule__AyahStart__Group__2 )
            // InternalQiraa.g:3159:2: rule__AyahStart__Group__1__Impl rule__AyahStart__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalQiraa.g:3166:1: rule__AyahStart__Group__1__Impl : ( ( rule__AyahStart__SurahAssignment_1 ) ) ;
    public final void rule__AyahStart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3170:1: ( ( ( rule__AyahStart__SurahAssignment_1 ) ) )
            // InternalQiraa.g:3171:1: ( ( rule__AyahStart__SurahAssignment_1 ) )
            {
            // InternalQiraa.g:3171:1: ( ( rule__AyahStart__SurahAssignment_1 ) )
            // InternalQiraa.g:3172:2: ( rule__AyahStart__SurahAssignment_1 )
            {
             before(grammarAccess.getAyahStartAccess().getSurahAssignment_1()); 
            // InternalQiraa.g:3173:2: ( rule__AyahStart__SurahAssignment_1 )
            // InternalQiraa.g:3173:3: rule__AyahStart__SurahAssignment_1
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
    // InternalQiraa.g:3181:1: rule__AyahStart__Group__2 : rule__AyahStart__Group__2__Impl rule__AyahStart__Group__3 ;
    public final void rule__AyahStart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3185:1: ( rule__AyahStart__Group__2__Impl rule__AyahStart__Group__3 )
            // InternalQiraa.g:3186:2: rule__AyahStart__Group__2__Impl rule__AyahStart__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalQiraa.g:3193:1: rule__AyahStart__Group__2__Impl : ( '\\u0627\\u0644\\u0622\\u064A\\u0629' ) ;
    public final void rule__AyahStart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3197:1: ( ( '\\u0627\\u0644\\u0622\\u064A\\u0629' ) )
            // InternalQiraa.g:3198:1: ( '\\u0627\\u0644\\u0622\\u064A\\u0629' )
            {
            // InternalQiraa.g:3198:1: ( '\\u0627\\u0644\\u0622\\u064A\\u0629' )
            // InternalQiraa.g:3199:2: '\\u0627\\u0644\\u0622\\u064A\\u0629'
            {
             before(grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithMaddaAboveArabicLetterYehArabicLetterTehMarbutaKeyword_2()); 
            match(input,59,FOLLOW_2); 
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
    // InternalQiraa.g:3208:1: rule__AyahStart__Group__3 : rule__AyahStart__Group__3__Impl rule__AyahStart__Group__4 ;
    public final void rule__AyahStart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3212:1: ( rule__AyahStart__Group__3__Impl rule__AyahStart__Group__4 )
            // InternalQiraa.g:3213:2: rule__AyahStart__Group__3__Impl rule__AyahStart__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:3220:1: rule__AyahStart__Group__3__Impl : ( ( rule__AyahStart__AyahAssignment_3 ) ) ;
    public final void rule__AyahStart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3224:1: ( ( ( rule__AyahStart__AyahAssignment_3 ) ) )
            // InternalQiraa.g:3225:1: ( ( rule__AyahStart__AyahAssignment_3 ) )
            {
            // InternalQiraa.g:3225:1: ( ( rule__AyahStart__AyahAssignment_3 ) )
            // InternalQiraa.g:3226:2: ( rule__AyahStart__AyahAssignment_3 )
            {
             before(grammarAccess.getAyahStartAccess().getAyahAssignment_3()); 
            // InternalQiraa.g:3227:2: ( rule__AyahStart__AyahAssignment_3 )
            // InternalQiraa.g:3227:3: rule__AyahStart__AyahAssignment_3
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
    // InternalQiraa.g:3235:1: rule__AyahStart__Group__4 : rule__AyahStart__Group__4__Impl ;
    public final void rule__AyahStart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3239:1: ( rule__AyahStart__Group__4__Impl )
            // InternalQiraa.g:3240:2: rule__AyahStart__Group__4__Impl
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
    // InternalQiraa.g:3246:1: rule__AyahStart__Group__4__Impl : ( ( rule__AyahStart__NameAssignment_4 ) ) ;
    public final void rule__AyahStart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3250:1: ( ( ( rule__AyahStart__NameAssignment_4 ) ) )
            // InternalQiraa.g:3251:1: ( ( rule__AyahStart__NameAssignment_4 ) )
            {
            // InternalQiraa.g:3251:1: ( ( rule__AyahStart__NameAssignment_4 ) )
            // InternalQiraa.g:3252:2: ( rule__AyahStart__NameAssignment_4 )
            {
             before(grammarAccess.getAyahStartAccess().getNameAssignment_4()); 
            // InternalQiraa.g:3253:2: ( rule__AyahStart__NameAssignment_4 )
            // InternalQiraa.g:3253:3: rule__AyahStart__NameAssignment_4
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
    // InternalQiraa.g:3262:1: rule__Phrase__Group__0 : rule__Phrase__Group__0__Impl rule__Phrase__Group__1 ;
    public final void rule__Phrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3266:1: ( rule__Phrase__Group__0__Impl rule__Phrase__Group__1 )
            // InternalQiraa.g:3267:2: rule__Phrase__Group__0__Impl rule__Phrase__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalQiraa.g:3274:1: rule__Phrase__Group__0__Impl : ( ( rule__Phrase__WordsAssignment_0 ) ) ;
    public final void rule__Phrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3278:1: ( ( ( rule__Phrase__WordsAssignment_0 ) ) )
            // InternalQiraa.g:3279:1: ( ( rule__Phrase__WordsAssignment_0 ) )
            {
            // InternalQiraa.g:3279:1: ( ( rule__Phrase__WordsAssignment_0 ) )
            // InternalQiraa.g:3280:2: ( rule__Phrase__WordsAssignment_0 )
            {
             before(grammarAccess.getPhraseAccess().getWordsAssignment_0()); 
            // InternalQiraa.g:3281:2: ( rule__Phrase__WordsAssignment_0 )
            // InternalQiraa.g:3281:3: rule__Phrase__WordsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__WordsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getWordsAssignment_0()); 

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
    // InternalQiraa.g:3289:1: rule__Phrase__Group__1 : rule__Phrase__Group__1__Impl ;
    public final void rule__Phrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3293:1: ( rule__Phrase__Group__1__Impl )
            // InternalQiraa.g:3294:2: rule__Phrase__Group__1__Impl
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
    // InternalQiraa.g:3300:1: rule__Phrase__Group__1__Impl : ( ( rule__Phrase__Group_1__0 )* ) ;
    public final void rule__Phrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3304:1: ( ( ( rule__Phrase__Group_1__0 )* ) )
            // InternalQiraa.g:3305:1: ( ( rule__Phrase__Group_1__0 )* )
            {
            // InternalQiraa.g:3305:1: ( ( rule__Phrase__Group_1__0 )* )
            // InternalQiraa.g:3306:2: ( rule__Phrase__Group_1__0 )*
            {
             before(grammarAccess.getPhraseAccess().getGroup_1()); 
            // InternalQiraa.g:3307:2: ( rule__Phrase__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_WS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalQiraa.g:3307:3: rule__Phrase__Group_1__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__Phrase__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getPhraseAccess().getGroup_1()); 

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


    // $ANTLR start "rule__Phrase__Group_1__0"
    // InternalQiraa.g:3316:1: rule__Phrase__Group_1__0 : rule__Phrase__Group_1__0__Impl rule__Phrase__Group_1__1 ;
    public final void rule__Phrase__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3320:1: ( rule__Phrase__Group_1__0__Impl rule__Phrase__Group_1__1 )
            // InternalQiraa.g:3321:2: rule__Phrase__Group_1__0__Impl rule__Phrase__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__Phrase__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group_1__1();

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
    // $ANTLR end "rule__Phrase__Group_1__0"


    // $ANTLR start "rule__Phrase__Group_1__0__Impl"
    // InternalQiraa.g:3328:1: rule__Phrase__Group_1__0__Impl : ( RULE_WS ) ;
    public final void rule__Phrase__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3332:1: ( ( RULE_WS ) )
            // InternalQiraa.g:3333:1: ( RULE_WS )
            {
            // InternalQiraa.g:3333:1: ( RULE_WS )
            // InternalQiraa.g:3334:2: RULE_WS
            {
             before(grammarAccess.getPhraseAccess().getWSTerminalRuleCall_1_0()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getWSTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Phrase__Group_1__0__Impl"


    // $ANTLR start "rule__Phrase__Group_1__1"
    // InternalQiraa.g:3343:1: rule__Phrase__Group_1__1 : rule__Phrase__Group_1__1__Impl ;
    public final void rule__Phrase__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3347:1: ( rule__Phrase__Group_1__1__Impl )
            // InternalQiraa.g:3348:2: rule__Phrase__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__Group_1__1__Impl();

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
    // $ANTLR end "rule__Phrase__Group_1__1"


    // $ANTLR start "rule__Phrase__Group_1__1__Impl"
    // InternalQiraa.g:3354:1: rule__Phrase__Group_1__1__Impl : ( ( rule__Phrase__WordsAssignment_1_1 ) ) ;
    public final void rule__Phrase__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3358:1: ( ( ( rule__Phrase__WordsAssignment_1_1 ) ) )
            // InternalQiraa.g:3359:1: ( ( rule__Phrase__WordsAssignment_1_1 ) )
            {
            // InternalQiraa.g:3359:1: ( ( rule__Phrase__WordsAssignment_1_1 ) )
            // InternalQiraa.g:3360:2: ( rule__Phrase__WordsAssignment_1_1 )
            {
             before(grammarAccess.getPhraseAccess().getWordsAssignment_1_1()); 
            // InternalQiraa.g:3361:2: ( rule__Phrase__WordsAssignment_1_1 )
            // InternalQiraa.g:3361:3: rule__Phrase__WordsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__WordsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getWordsAssignment_1_1()); 

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
    // $ANTLR end "rule__Phrase__Group_1__1__Impl"


    // $ANTLR start "rule__QiraaModel__QoraaAssignment_0"
    // InternalQiraa.g:3370:1: rule__QiraaModel__QoraaAssignment_0 : ( ruleQaree ) ;
    public final void rule__QiraaModel__QoraaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3374:1: ( ( ruleQaree ) )
            // InternalQiraa.g:3375:2: ( ruleQaree )
            {
            // InternalQiraa.g:3375:2: ( ruleQaree )
            // InternalQiraa.g:3376:3: ruleQaree
            {
             before(grammarAccess.getQiraaModelAccess().getQoraaQareeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQaree();

            state._fsp--;

             after(grammarAccess.getQiraaModelAccess().getQoraaQareeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__QiraaModel__QoraaAssignment_0"


    // $ANTLR start "rule__QiraaModel__TorokAssignment_1"
    // InternalQiraa.g:3385:1: rule__QiraaModel__TorokAssignment_1 : ( ruleTareek ) ;
    public final void rule__QiraaModel__TorokAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3389:1: ( ( ruleTareek ) )
            // InternalQiraa.g:3390:2: ( ruleTareek )
            {
            // InternalQiraa.g:3390:2: ( ruleTareek )
            // InternalQiraa.g:3391:3: ruleTareek
            {
             before(grammarAccess.getQiraaModelAccess().getTorokTareekParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTareek();

            state._fsp--;

             after(grammarAccess.getQiraaModelAccess().getTorokTareekParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__QiraaModel__TorokAssignment_1"


    // $ANTLR start "rule__QiraaModel__RowatAssignment_2"
    // InternalQiraa.g:3400:1: rule__QiraaModel__RowatAssignment_2 : ( ruleRawee ) ;
    public final void rule__QiraaModel__RowatAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3404:1: ( ( ruleRawee ) )
            // InternalQiraa.g:3405:2: ( ruleRawee )
            {
            // InternalQiraa.g:3405:2: ( ruleRawee )
            // InternalQiraa.g:3406:3: ruleRawee
            {
             before(grammarAccess.getQiraaModelAccess().getRowatRaweeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRawee();

            state._fsp--;

             after(grammarAccess.getQiraaModelAccess().getRowatRaweeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__QiraaModel__RowatAssignment_2"


    // $ANTLR start "rule__QiraaModel__ImamsAssignment_3"
    // InternalQiraa.g:3415:1: rule__QiraaModel__ImamsAssignment_3 : ( ruleIMAM ) ;
    public final void rule__QiraaModel__ImamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3419:1: ( ( ruleIMAM ) )
            // InternalQiraa.g:3420:2: ( ruleIMAM )
            {
            // InternalQiraa.g:3420:2: ( ruleIMAM )
            // InternalQiraa.g:3421:3: ruleIMAM
            {
             before(grammarAccess.getQiraaModelAccess().getImamsIMAMParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIMAM();

            state._fsp--;

             after(grammarAccess.getQiraaModelAccess().getImamsIMAMParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__QiraaModel__ImamsAssignment_3"


    // $ANTLR start "rule__QiraaModel__MarjeeAssignment_4"
    // InternalQiraa.g:3430:1: rule__QiraaModel__MarjeeAssignment_4 : ( ruleMarjeh ) ;
    public final void rule__QiraaModel__MarjeeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3434:1: ( ( ruleMarjeh ) )
            // InternalQiraa.g:3435:2: ( ruleMarjeh )
            {
            // InternalQiraa.g:3435:2: ( ruleMarjeh )
            // InternalQiraa.g:3436:3: ruleMarjeh
            {
             before(grammarAccess.getQiraaModelAccess().getMarjeeMarjehParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMarjeh();

            state._fsp--;

             after(grammarAccess.getQiraaModelAccess().getMarjeeMarjehParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__QiraaModel__MarjeeAssignment_4"


    // $ANTLR start "rule__QiraaModel__IstelahatAssignment_5"
    // InternalQiraa.g:3445:1: rule__QiraaModel__IstelahatAssignment_5 : ( ruleIstelah ) ;
    public final void rule__QiraaModel__IstelahatAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3449:1: ( ( ruleIstelah ) )
            // InternalQiraa.g:3450:2: ( ruleIstelah )
            {
            // InternalQiraa.g:3450:2: ( ruleIstelah )
            // InternalQiraa.g:3451:3: ruleIstelah
            {
             before(grammarAccess.getQiraaModelAccess().getIstelahatIstelahParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleIstelah();

            state._fsp--;

             after(grammarAccess.getQiraaModelAccess().getIstelahatIstelahParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__QiraaModel__IstelahatAssignment_5"


    // $ANTLR start "rule__QiraaModel__KoyodAssignment_6"
    // InternalQiraa.g:3460:1: rule__QiraaModel__KoyodAssignment_6 : ( ruleKayd ) ;
    public final void rule__QiraaModel__KoyodAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3464:1: ( ( ruleKayd ) )
            // InternalQiraa.g:3465:2: ( ruleKayd )
            {
            // InternalQiraa.g:3465:2: ( ruleKayd )
            // InternalQiraa.g:3466:3: ruleKayd
            {
             before(grammarAccess.getQiraaModelAccess().getKoyodKaydParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleKayd();

            state._fsp--;

             after(grammarAccess.getQiraaModelAccess().getKoyodKaydParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__QiraaModel__KoyodAssignment_6"


    // $ANTLR start "rule__Rawee__QareeAssignment_3"
    // InternalQiraa.g:3475:1: rule__Rawee__QareeAssignment_3 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Rawee__QareeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3479:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:3480:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:3480:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3481:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getRaweeAccess().getQareeQareeCrossReference_3_0()); 
            // InternalQiraa.g:3482:3: ( RULE_KALEMAH )
            // InternalQiraa.g:3483:4: RULE_KALEMAH
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


    // $ANTLR start "rule__Person__NameAssignment_0"
    // InternalQiraa.g:3494:1: rule__Person__NameAssignment_0 : ( RULE_KALEMAH ) ;
    public final void rule__Person__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3498:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3499:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:3499:2: ( RULE_KALEMAH )
            // InternalQiraa.g:3500:3: RULE_KALEMAH
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
    // InternalQiraa.g:3509:1: rule__Person__EsmAssignment_1_1 : ( RULE_KALEMAH ) ;
    public final void rule__Person__EsmAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3513:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3514:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:3514:2: ( RULE_KALEMAH )
            // InternalQiraa.g:3515:3: RULE_KALEMAH
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
    // InternalQiraa.g:3524:1: rule__Person__LakabAssignment_2_1 : ( RULE_KALEMAH ) ;
    public final void rule__Person__LakabAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3528:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3529:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:3529:2: ( RULE_KALEMAH )
            // InternalQiraa.g:3530:3: RULE_KALEMAH
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
    // InternalQiraa.g:3539:1: rule__Person__TowofiaAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Person__TowofiaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3543:1: ( ( RULE_INT ) )
            // InternalQiraa.g:3544:2: ( RULE_INT )
            {
            // InternalQiraa.g:3544:2: ( RULE_INT )
            // InternalQiraa.g:3545:3: RULE_INT
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
    // InternalQiraa.g:3554:1: rule__Douaa__DAssignment_0 : ( ( rule__Douaa__DAlternatives_0_0 ) ) ;
    public final void rule__Douaa__DAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3558:1: ( ( ( rule__Douaa__DAlternatives_0_0 ) ) )
            // InternalQiraa.g:3559:2: ( ( rule__Douaa__DAlternatives_0_0 ) )
            {
            // InternalQiraa.g:3559:2: ( ( rule__Douaa__DAlternatives_0_0 ) )
            // InternalQiraa.g:3560:3: ( rule__Douaa__DAlternatives_0_0 )
            {
             before(grammarAccess.getDouaaAccess().getDAlternatives_0_0()); 
            // InternalQiraa.g:3561:3: ( rule__Douaa__DAlternatives_0_0 )
            // InternalQiraa.g:3561:4: rule__Douaa__DAlternatives_0_0
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


    // $ANTLR start "rule__Tareek__NameAssignment_2"
    // InternalQiraa.g:3569:1: rule__Tareek__NameAssignment_2 : ( RULE_KALEMAH ) ;
    public final void rule__Tareek__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3573:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3574:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:3574:2: ( RULE_KALEMAH )
            // InternalQiraa.g:3575:3: RULE_KALEMAH
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
    // InternalQiraa.g:3584:1: rule__Tareek__SimpleAssignment_3_0_0 : ( ( '\\u062E\\u0627\\u0644\\u0635' ) ) ;
    public final void rule__Tareek__SimpleAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3588:1: ( ( ( '\\u062E\\u0627\\u0644\\u0635' ) ) )
            // InternalQiraa.g:3589:2: ( ( '\\u062E\\u0627\\u0644\\u0635' ) )
            {
            // InternalQiraa.g:3589:2: ( ( '\\u062E\\u0627\\u0644\\u0635' ) )
            // InternalQiraa.g:3590:3: ( '\\u062E\\u0627\\u0644\\u0635' )
            {
             before(grammarAccess.getTareekAccess().getSimpleArabicLetterKhahArabicLetterAlefArabicLetterLamArabicLetterSadKeyword_3_0_0_0()); 
            // InternalQiraa.g:3591:3: ( '\\u062E\\u0627\\u0644\\u0635' )
            // InternalQiraa.g:3592:4: '\\u062E\\u0627\\u0644\\u0635'
            {
             before(grammarAccess.getTareekAccess().getSimpleArabicLetterKhahArabicLetterAlefArabicLetterLamArabicLetterSadKeyword_3_0_0_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalQiraa.g:3603:1: rule__Tareek__RefAssignment_3_0_2 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Tareek__RefAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3607:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:3608:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:3608:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3609:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getTareekAccess().getRefYokraaLahCrossReference_3_0_2_0()); 
            // InternalQiraa.g:3610:3: ( RULE_KALEMAH )
            // InternalQiraa.g:3611:4: RULE_KALEMAH
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
    // InternalQiraa.g:3622:1: rule__Tareek__ComplexAssignment_3_1_0_0 : ( ( '\\u0645\\u0631\\u0643\\u0628' ) ) ;
    public final void rule__Tareek__ComplexAssignment_3_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3626:1: ( ( ( '\\u0645\\u0631\\u0643\\u0628' ) ) )
            // InternalQiraa.g:3627:2: ( ( '\\u0645\\u0631\\u0643\\u0628' ) )
            {
            // InternalQiraa.g:3627:2: ( ( '\\u0645\\u0631\\u0643\\u0628' ) )
            // InternalQiraa.g:3628:3: ( '\\u0645\\u0631\\u0643\\u0628' )
            {
             before(grammarAccess.getTareekAccess().getComplexArabicLetterMeemArabicLetterRehArabicLetterKafArabicLetterBehKeyword_3_1_0_0_0()); 
            // InternalQiraa.g:3629:3: ( '\\u0645\\u0631\\u0643\\u0628' )
            // InternalQiraa.g:3630:4: '\\u0645\\u0631\\u0643\\u0628'
            {
             before(grammarAccess.getTareekAccess().getComplexArabicLetterMeemArabicLetterRehArabicLetterKafArabicLetterBehKeyword_3_1_0_0_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalQiraa.g:3641:1: rule__Tareek__RefsAssignment_3_1_1 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Tareek__RefsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3645:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:3646:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:3646:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3647:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getTareekAccess().getRefsTareekCrossReference_3_1_1_0()); 
            // InternalQiraa.g:3648:3: ( RULE_KALEMAH )
            // InternalQiraa.g:3649:4: RULE_KALEMAH
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


    // $ANTLR start "rule__Marjeh__NameAssignment_1"
    // InternalQiraa.g:3660:1: rule__Marjeh__NameAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Marjeh__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3664:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3665:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:3665:2: ( RULE_KALEMAH )
            // InternalQiraa.g:3666:3: RULE_KALEMAH
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


    // $ANTLR start "rule__Marjeh__RefAssignment_3"
    // InternalQiraa.g:3675:1: rule__Marjeh__RefAssignment_3 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Marjeh__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3679:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:3680:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:3680:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3681:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getMarjehAccess().getRefIMAMCrossReference_3_0()); 
            // InternalQiraa.g:3682:3: ( RULE_KALEMAH )
            // InternalQiraa.g:3683:4: RULE_KALEMAH
            {
             before(grammarAccess.getMarjehAccess().getRefIMAMKALEMAHTerminalRuleCall_3_0_1()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getMarjehAccess().getRefIMAMKALEMAHTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMarjehAccess().getRefIMAMCrossReference_3_0()); 

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
    // $ANTLR end "rule__Marjeh__RefAssignment_3"


    // $ANTLR start "rule__Marjeh__RomozAssignment_6"
    // InternalQiraa.g:3694:1: rule__Marjeh__RomozAssignment_6 : ( ruleRamz ) ;
    public final void rule__Marjeh__RomozAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3698:1: ( ( ruleRamz ) )
            // InternalQiraa.g:3699:2: ( ruleRamz )
            {
            // InternalQiraa.g:3699:2: ( ruleRamz )
            // InternalQiraa.g:3700:3: ruleRamz
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


    // $ANTLR start "rule__Marjeh__MakatehAssignment_7"
    // InternalQiraa.g:3709:1: rule__Marjeh__MakatehAssignment_7 : ( ruleMaktah ) ;
    public final void rule__Marjeh__MakatehAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3713:1: ( ( ruleMaktah ) )
            // InternalQiraa.g:3714:2: ( ruleMaktah )
            {
            // InternalQiraa.g:3714:2: ( ruleMaktah )
            // InternalQiraa.g:3715:3: ruleMaktah
            {
             before(grammarAccess.getMarjehAccess().getMakatehMaktahParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleMaktah();

            state._fsp--;

             after(grammarAccess.getMarjehAccess().getMakatehMaktahParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Marjeh__MakatehAssignment_7"


    // $ANTLR start "rule__Maktah__NassAssignment_1"
    // InternalQiraa.g:3724:1: rule__Maktah__NassAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Maktah__NassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3728:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3729:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:3729:2: ( RULE_KALEMAH )
            // InternalQiraa.g:3730:3: RULE_KALEMAH
            {
             before(grammarAccess.getMaktahAccess().getNassKALEMAHTerminalRuleCall_1_0()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getMaktahAccess().getNassKALEMAHTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Maktah__NassAssignment_1"


    // $ANTLR start "rule__Maktah__KedahAssignment_3"
    // InternalQiraa.g:3739:1: rule__Maktah__KedahAssignment_3 : ( ruleKaaedah ) ;
    public final void rule__Maktah__KedahAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3743:1: ( ( ruleKaaedah ) )
            // InternalQiraa.g:3744:2: ( ruleKaaedah )
            {
            // InternalQiraa.g:3744:2: ( ruleKaaedah )
            // InternalQiraa.g:3745:3: ruleKaaedah
            {
             before(grammarAccess.getMaktahAccess().getKedahKaaedahParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleKaaedah();

            state._fsp--;

             after(grammarAccess.getMaktahAccess().getKedahKaaedahParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Maktah__KedahAssignment_3"


    // $ANTLR start "rule__Kayd__NameAssignment_1"
    // InternalQiraa.g:3754:1: rule__Kayd__NameAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Kayd__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3758:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3759:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:3759:2: ( RULE_KALEMAH )
            // InternalQiraa.g:3760:3: RULE_KALEMAH
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
    // InternalQiraa.g:3769:1: rule__Istelah__NameAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Istelah__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3773:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3774:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:3774:2: ( RULE_KALEMAH )
            // InternalQiraa.g:3775:3: RULE_KALEMAH
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
    // InternalQiraa.g:3784:1: rule__Istelah__RefsAssignment_3 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Istelah__RefsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3788:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:3789:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:3789:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3790:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getIstelahAccess().getRefsYokraaLahCrossReference_3_0()); 
            // InternalQiraa.g:3791:3: ( RULE_KALEMAH )
            // InternalQiraa.g:3792:4: RULE_KALEMAH
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
    // InternalQiraa.g:3803:1: rule__Istelah__RefsAssignment_4_1 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Istelah__RefsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3807:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:3808:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:3808:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3809:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getIstelahAccess().getRefsYokraaLahCrossReference_4_1_0()); 
            // InternalQiraa.g:3810:3: ( RULE_KALEMAH )
            // InternalQiraa.g:3811:4: RULE_KALEMAH
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
    // InternalQiraa.g:3822:1: rule__Ramz__NameAssignment_1 : ( RULE_AWORD ) ;
    public final void rule__Ramz__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3826:1: ( ( RULE_AWORD ) )
            // InternalQiraa.g:3827:2: ( RULE_AWORD )
            {
            // InternalQiraa.g:3827:2: ( RULE_AWORD )
            // InternalQiraa.g:3828:3: RULE_AWORD
            {
             before(grammarAccess.getRamzAccess().getNameAWORDTerminalRuleCall_1_0()); 
            match(input,RULE_AWORD,FOLLOW_2); 
             after(grammarAccess.getRamzAccess().getNameAWORDTerminalRuleCall_1_0()); 

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
    // InternalQiraa.g:3837:1: rule__Ramz__RefsAssignment_3 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Ramz__RefsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3841:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:3842:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:3842:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3843:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getRamzAccess().getRefsYokraaLahCrossReference_3_0()); 
            // InternalQiraa.g:3844:3: ( RULE_KALEMAH )
            // InternalQiraa.g:3845:4: RULE_KALEMAH
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
    // InternalQiraa.g:3856:1: rule__Ramz__RefsAssignment_4_1 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Ramz__RefsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3860:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:3861:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:3861:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3862:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getRamzAccess().getRefsYokraaLahCrossReference_4_1_0()); 
            // InternalQiraa.g:3863:3: ( RULE_KALEMAH )
            // InternalQiraa.g:3864:4: RULE_KALEMAH
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


    // $ANTLR start "rule__Kaaedah__RefsAssignment_1"
    // InternalQiraa.g:3875:1: rule__Kaaedah__RefsAssignment_1 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Kaaedah__RefsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3879:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:3880:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:3880:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3881:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getKaaedahAccess().getRefsYokraaLahWaRamzCrossReference_1_0()); 
            // InternalQiraa.g:3882:3: ( RULE_KALEMAH )
            // InternalQiraa.g:3883:4: RULE_KALEMAH
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
    // InternalQiraa.g:3894:1: rule__Kaaedah__KaydAssignment_3 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Kaaedah__KaydAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3898:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:3899:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:3899:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3900:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getKaaedahAccess().getKaydKaydCrossReference_3_0()); 
            // InternalQiraa.g:3901:3: ( RULE_KALEMAH )
            // InternalQiraa.g:3902:4: RULE_KALEMAH
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
    // InternalQiraa.g:3913:1: rule__Kaaedah__HarfAssignment_5 : ( ruleHarfQuran ) ;
    public final void rule__Kaaedah__HarfAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3917:1: ( ( ruleHarfQuran ) )
            // InternalQiraa.g:3918:2: ( ruleHarfQuran )
            {
            // InternalQiraa.g:3918:2: ( ruleHarfQuran )
            // InternalQiraa.g:3919:3: ruleHarfQuran
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


    // $ANTLR start "rule__HarfQuran__WordAssignment_0"
    // InternalQiraa.g:3928:1: rule__HarfQuran__WordAssignment_0 : ( RULE_AWORD ) ;
    public final void rule__HarfQuran__WordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3932:1: ( ( RULE_AWORD ) )
            // InternalQiraa.g:3933:2: ( RULE_AWORD )
            {
            // InternalQiraa.g:3933:2: ( RULE_AWORD )
            // InternalQiraa.g:3934:3: RULE_AWORD
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
    // InternalQiraa.g:3943:1: rule__HarfQuran__AyahAssignment_4 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__HarfQuran__AyahAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3947:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:3948:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:3948:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:3949:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getHarfQuranAccess().getAyahAyahStartCrossReference_4_0()); 
            // InternalQiraa.g:3950:3: ( RULE_KALEMAH )
            // InternalQiraa.g:3951:4: RULE_KALEMAH
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
    // InternalQiraa.g:3962:1: rule__HarfQuran__MawdeeAssignment_5_1 : ( ruleMawdee ) ;
    public final void rule__HarfQuran__MawdeeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3966:1: ( ( ruleMawdee ) )
            // InternalQiraa.g:3967:2: ( ruleMawdee )
            {
            // InternalQiraa.g:3967:2: ( ruleMawdee )
            // InternalQiraa.g:3968:3: ruleMawdee
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
    // InternalQiraa.g:3977:1: rule__Harf__NameAssignment_1 : ( RULE_AWORD ) ;
    public final void rule__Harf__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3981:1: ( ( RULE_AWORD ) )
            // InternalQiraa.g:3982:2: ( RULE_AWORD )
            {
            // InternalQiraa.g:3982:2: ( RULE_AWORD )
            // InternalQiraa.g:3983:3: RULE_AWORD
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
    // InternalQiraa.g:3992:1: rule__Harf__ValuesAssignment_2_0_1 : ( RULE_ALETTER ) ;
    public final void rule__Harf__ValuesAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:3996:1: ( ( RULE_ALETTER ) )
            // InternalQiraa.g:3997:2: ( RULE_ALETTER )
            {
            // InternalQiraa.g:3997:2: ( RULE_ALETTER )
            // InternalQiraa.g:3998:3: RULE_ALETTER
            {
             before(grammarAccess.getHarfAccess().getValuesALETTERTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_ALETTER,FOLLOW_2); 
             after(grammarAccess.getHarfAccess().getValuesALETTERTerminalRuleCall_2_0_1_0()); 

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
    // InternalQiraa.g:4007:1: rule__Harf__ValuesAssignment_2_0_2_1 : ( RULE_ALETTER ) ;
    public final void rule__Harf__ValuesAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4011:1: ( ( RULE_ALETTER ) )
            // InternalQiraa.g:4012:2: ( RULE_ALETTER )
            {
            // InternalQiraa.g:4012:2: ( RULE_ALETTER )
            // InternalQiraa.g:4013:3: RULE_ALETTER
            {
             before(grammarAccess.getHarfAccess().getValuesALETTERTerminalRuleCall_2_0_2_1_0()); 
            match(input,RULE_ALETTER,FOLLOW_2); 
             after(grammarAccess.getHarfAccess().getValuesALETTERTerminalRuleCall_2_0_2_1_0()); 

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
    // InternalQiraa.g:4022:1: rule__Harf__RefAssignment_2_1_1 : ( ( RULE_AWORD ) ) ;
    public final void rule__Harf__RefAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4026:1: ( ( ( RULE_AWORD ) ) )
            // InternalQiraa.g:4027:2: ( ( RULE_AWORD ) )
            {
            // InternalQiraa.g:4027:2: ( ( RULE_AWORD ) )
            // InternalQiraa.g:4028:3: ( RULE_AWORD )
            {
             before(grammarAccess.getHarfAccess().getRefHarfCrossReference_2_1_1_0()); 
            // InternalQiraa.g:4029:3: ( RULE_AWORD )
            // InternalQiraa.g:4030:4: RULE_AWORD
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
    // InternalQiraa.g:4041:1: rule__Harakah__NameAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Harakah__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4045:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:4046:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:4046:2: ( RULE_KALEMAH )
            // InternalQiraa.g:4047:3: RULE_KALEMAH
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
    // InternalQiraa.g:4056:1: rule__Harakah__ValueAssignment_3 : ( RULE_AHARAKAH ) ;
    public final void rule__Harakah__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4060:1: ( ( RULE_AHARAKAH ) )
            // InternalQiraa.g:4061:2: ( RULE_AHARAKAH )
            {
            // InternalQiraa.g:4061:2: ( RULE_AHARAKAH )
            // InternalQiraa.g:4062:3: RULE_AHARAKAH
            {
             before(grammarAccess.getHarakahAccess().getValueAHARAKAHTerminalRuleCall_3_0()); 
            match(input,RULE_AHARAKAH,FOLLOW_2); 
             after(grammarAccess.getHarakahAccess().getValueAHARAKAHTerminalRuleCall_3_0()); 

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
    // InternalQiraa.g:4071:1: rule__AyahStart__SurahAssignment_1 : ( RULE_INT ) ;
    public final void rule__AyahStart__SurahAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4075:1: ( ( RULE_INT ) )
            // InternalQiraa.g:4076:2: ( RULE_INT )
            {
            // InternalQiraa.g:4076:2: ( RULE_INT )
            // InternalQiraa.g:4077:3: RULE_INT
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
    // InternalQiraa.g:4086:1: rule__AyahStart__AyahAssignment_3 : ( RULE_INT ) ;
    public final void rule__AyahStart__AyahAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4090:1: ( ( RULE_INT ) )
            // InternalQiraa.g:4091:2: ( RULE_INT )
            {
            // InternalQiraa.g:4091:2: ( RULE_INT )
            // InternalQiraa.g:4092:3: RULE_INT
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
    // InternalQiraa.g:4101:1: rule__AyahStart__NameAssignment_4 : ( RULE_KALEMAH ) ;
    public final void rule__AyahStart__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4105:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:4106:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:4106:2: ( RULE_KALEMAH )
            // InternalQiraa.g:4107:3: RULE_KALEMAH
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


    // $ANTLR start "rule__Phrase__WordsAssignment_0"
    // InternalQiraa.g:4116:1: rule__Phrase__WordsAssignment_0 : ( RULE_AWORD ) ;
    public final void rule__Phrase__WordsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4120:1: ( ( RULE_AWORD ) )
            // InternalQiraa.g:4121:2: ( RULE_AWORD )
            {
            // InternalQiraa.g:4121:2: ( RULE_AWORD )
            // InternalQiraa.g:4122:3: RULE_AWORD
            {
             before(grammarAccess.getPhraseAccess().getWordsAWORDTerminalRuleCall_0_0()); 
            match(input,RULE_AWORD,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getWordsAWORDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Phrase__WordsAssignment_0"


    // $ANTLR start "rule__Phrase__WordsAssignment_1_1"
    // InternalQiraa.g:4131:1: rule__Phrase__WordsAssignment_1_1 : ( RULE_AWORD ) ;
    public final void rule__Phrase__WordsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:4135:1: ( ( RULE_AWORD ) )
            // InternalQiraa.g:4136:2: ( RULE_AWORD )
            {
            // InternalQiraa.g:4136:2: ( RULE_AWORD )
            // InternalQiraa.g:4137:3: RULE_AWORD
            {
             before(grammarAccess.getPhraseAccess().getWordsAWORDTerminalRuleCall_1_1_0()); 
            match(input,RULE_AWORD,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getWordsAWORDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Phrase__WordsAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000C1883000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000410000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000012L});

}