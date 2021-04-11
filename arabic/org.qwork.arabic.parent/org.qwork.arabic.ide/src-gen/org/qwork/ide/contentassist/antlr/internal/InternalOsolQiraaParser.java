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
import org.qwork.services.OsolQiraaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOsolQiraaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_KALEMAH", "RULE_INT", "RULE_AWORD", "RULE_BASMALAH", "RULE_ALETTER", "RULE_AHARAKAH", "RULE_ATANWEEN", "RULE_ASHADDAH", "RULE_ALIGATURES", "RULE_ADIGIT", "RULE_ANONLETTER", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\u0631\\u062D\\u0645\\u0647'", "'\\u0623\\u0643\\u0631\\u0645\\u0647'", "'\\u0627\\u0644\\u0623\\u0648\\u0644'", "'\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A'", "'\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B'", "'\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631'", "'\\u0627\\u0633\\u0645\\u0647'", "'\\u0644\\u0642\\u0628\\u0647'", "'\\u062A\\u0648\\u0641\\u064A'", "'\\u0627\\u0644\\u0644\\u0647'", "'\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645'", "'\\u0642\\u0627\\u0631\\u0626'", "'\\u0631\\u0627\\u0648'", "'\\u0639\\u0646'", "'\\u0637\\u0631\\u064A\\u0642'", "'\\u062A\\u0644\\u0627\\u0648\\u0629'", "'\\u0644'", "'\\u0645\\u0646'", "'\\u0642\\u064A\\u062F'", "'\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D'", "'\\u064A\\u0639\\u0646\\u064A'", "'\\u0648'", "'\\u0631\\u0645\\u0632'", "'\\u062D\\u0631\\u0641'", "'\\u0647\\u0648'", "'\\u0623\\u0648'", "'\\u0630\\u0627\\u062A\\u0647'", "'\\u062D\\u0631\\u0643\\u0629'", "'\\u0647\\u064A'", "'\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'", "'\\u0627\\u0644\\u0622\\u064A\\u0629'", "'\\u062E\\u0627\\u0644\\u0635'", "'\\u0645\\u0631\\u0643\\u0628'"
    };
    public static final int T__50=50;
    public static final int RULE_KALEMAH=4;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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
    public static final int RULE_BASMALAH=7;
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


        public InternalOsolQiraaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOsolQiraaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOsolQiraaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOsolQiraa.g"; }


    	private OsolQiraaGrammarAccess grammarAccess;

    	public void setGrammarAccess(OsolQiraaGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleOsolQiraaModel"
    // InternalOsolQiraa.g:53:1: entryRuleOsolQiraaModel : ruleOsolQiraaModel EOF ;
    public final void entryRuleOsolQiraaModel() throws RecognitionException {
        try {
            // InternalOsolQiraa.g:54:1: ( ruleOsolQiraaModel EOF )
            // InternalOsolQiraa.g:55:1: ruleOsolQiraaModel EOF
            {
             before(grammarAccess.getOsolQiraaModelRule()); 
            pushFollow(FOLLOW_1);
            ruleOsolQiraaModel();

            state._fsp--;

             after(grammarAccess.getOsolQiraaModelRule()); 
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
    // $ANTLR end "entryRuleOsolQiraaModel"


    // $ANTLR start "ruleOsolQiraaModel"
    // InternalOsolQiraa.g:62:1: ruleOsolQiraaModel : ( ( rule__OsolQiraaModel__Alternatives )* ) ;
    public final void ruleOsolQiraaModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:66:2: ( ( ( rule__OsolQiraaModel__Alternatives )* ) )
            // InternalOsolQiraa.g:67:2: ( ( rule__OsolQiraaModel__Alternatives )* )
            {
            // InternalOsolQiraa.g:67:2: ( ( rule__OsolQiraaModel__Alternatives )* )
            // InternalOsolQiraa.g:68:3: ( rule__OsolQiraaModel__Alternatives )*
            {
             before(grammarAccess.getOsolQiraaModelAccess().getAlternatives()); 
            // InternalOsolQiraa.g:69:3: ( rule__OsolQiraaModel__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=31 && LA1_0<=33)||LA1_0==35||(LA1_0>=39 && LA1_0<=40)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOsolQiraa.g:69:4: rule__OsolQiraaModel__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__OsolQiraaModel__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getOsolQiraaModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOsolQiraaModel"


    // $ANTLR start "rulePerson"
    // InternalOsolQiraa.g:79:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:83:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalOsolQiraa.g:84:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalOsolQiraa.g:84:2: ( ( rule__Person__Group__0 ) )
            // InternalOsolQiraa.g:85:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalOsolQiraa.g:86:3: ( rule__Person__Group__0 )
            // InternalOsolQiraa.g:86:4: rule__Person__Group__0
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
    // InternalOsolQiraa.g:96:1: ruleDouaa : ( ( rule__Douaa__Group__0 ) ) ;
    public final void ruleDouaa() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:100:2: ( ( ( rule__Douaa__Group__0 ) ) )
            // InternalOsolQiraa.g:101:2: ( ( rule__Douaa__Group__0 ) )
            {
            // InternalOsolQiraa.g:101:2: ( ( rule__Douaa__Group__0 ) )
            // InternalOsolQiraa.g:102:3: ( rule__Douaa__Group__0 )
            {
             before(grammarAccess.getDouaaAccess().getGroup()); 
            // InternalOsolQiraa.g:103:3: ( rule__Douaa__Group__0 )
            // InternalOsolQiraa.g:103:4: rule__Douaa__Group__0
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
    // InternalOsolQiraa.g:112:1: entryRuleIMAM : ruleIMAM EOF ;
    public final void entryRuleIMAM() throws RecognitionException {
        try {
            // InternalOsolQiraa.g:113:1: ( ruleIMAM EOF )
            // InternalOsolQiraa.g:114:1: ruleIMAM EOF
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
    // InternalOsolQiraa.g:121:1: ruleIMAM : ( ( rule__IMAM__Group__0 ) ) ;
    public final void ruleIMAM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:125:2: ( ( ( rule__IMAM__Group__0 ) ) )
            // InternalOsolQiraa.g:126:2: ( ( rule__IMAM__Group__0 ) )
            {
            // InternalOsolQiraa.g:126:2: ( ( rule__IMAM__Group__0 ) )
            // InternalOsolQiraa.g:127:3: ( rule__IMAM__Group__0 )
            {
             before(grammarAccess.getIMAMAccess().getGroup()); 
            // InternalOsolQiraa.g:128:3: ( rule__IMAM__Group__0 )
            // InternalOsolQiraa.g:128:4: rule__IMAM__Group__0
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
    // InternalOsolQiraa.g:137:1: entryRuleQaree : ruleQaree EOF ;
    public final void entryRuleQaree() throws RecognitionException {
        try {
            // InternalOsolQiraa.g:138:1: ( ruleQaree EOF )
            // InternalOsolQiraa.g:139:1: ruleQaree EOF
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
    // InternalOsolQiraa.g:146:1: ruleQaree : ( ( rule__Qaree__Group__0 ) ) ;
    public final void ruleQaree() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:150:2: ( ( ( rule__Qaree__Group__0 ) ) )
            // InternalOsolQiraa.g:151:2: ( ( rule__Qaree__Group__0 ) )
            {
            // InternalOsolQiraa.g:151:2: ( ( rule__Qaree__Group__0 ) )
            // InternalOsolQiraa.g:152:3: ( rule__Qaree__Group__0 )
            {
             before(grammarAccess.getQareeAccess().getGroup()); 
            // InternalOsolQiraa.g:153:3: ( rule__Qaree__Group__0 )
            // InternalOsolQiraa.g:153:4: rule__Qaree__Group__0
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
    // InternalOsolQiraa.g:162:1: entryRuleRawee : ruleRawee EOF ;
    public final void entryRuleRawee() throws RecognitionException {
        try {
            // InternalOsolQiraa.g:163:1: ( ruleRawee EOF )
            // InternalOsolQiraa.g:164:1: ruleRawee EOF
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
    // InternalOsolQiraa.g:171:1: ruleRawee : ( ( rule__Rawee__Group__0 ) ) ;
    public final void ruleRawee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:175:2: ( ( ( rule__Rawee__Group__0 ) ) )
            // InternalOsolQiraa.g:176:2: ( ( rule__Rawee__Group__0 ) )
            {
            // InternalOsolQiraa.g:176:2: ( ( rule__Rawee__Group__0 ) )
            // InternalOsolQiraa.g:177:3: ( rule__Rawee__Group__0 )
            {
             before(grammarAccess.getRaweeAccess().getGroup()); 
            // InternalOsolQiraa.g:178:3: ( rule__Rawee__Group__0 )
            // InternalOsolQiraa.g:178:4: rule__Rawee__Group__0
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
    // InternalOsolQiraa.g:187:1: entryRuleYokraaLah : ruleYokraaLah EOF ;
    public final void entryRuleYokraaLah() throws RecognitionException {
        try {
            // InternalOsolQiraa.g:188:1: ( ruleYokraaLah EOF )
            // InternalOsolQiraa.g:189:1: ruleYokraaLah EOF
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
    // InternalOsolQiraa.g:196:1: ruleYokraaLah : ( ( rule__YokraaLah__Alternatives ) ) ;
    public final void ruleYokraaLah() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:200:2: ( ( ( rule__YokraaLah__Alternatives ) ) )
            // InternalOsolQiraa.g:201:2: ( ( rule__YokraaLah__Alternatives ) )
            {
            // InternalOsolQiraa.g:201:2: ( ( rule__YokraaLah__Alternatives ) )
            // InternalOsolQiraa.g:202:3: ( rule__YokraaLah__Alternatives )
            {
             before(grammarAccess.getYokraaLahAccess().getAlternatives()); 
            // InternalOsolQiraa.g:203:3: ( rule__YokraaLah__Alternatives )
            // InternalOsolQiraa.g:203:4: rule__YokraaLah__Alternatives
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
    // InternalOsolQiraa.g:212:1: entryRuleTareek : ruleTareek EOF ;
    public final void entryRuleTareek() throws RecognitionException {
        try {
            // InternalOsolQiraa.g:213:1: ( ruleTareek EOF )
            // InternalOsolQiraa.g:214:1: ruleTareek EOF
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
    // InternalOsolQiraa.g:221:1: ruleTareek : ( ( rule__Tareek__Group__0 ) ) ;
    public final void ruleTareek() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:225:2: ( ( ( rule__Tareek__Group__0 ) ) )
            // InternalOsolQiraa.g:226:2: ( ( rule__Tareek__Group__0 ) )
            {
            // InternalOsolQiraa.g:226:2: ( ( rule__Tareek__Group__0 ) )
            // InternalOsolQiraa.g:227:3: ( rule__Tareek__Group__0 )
            {
             before(grammarAccess.getTareekAccess().getGroup()); 
            // InternalOsolQiraa.g:228:3: ( rule__Tareek__Group__0 )
            // InternalOsolQiraa.g:228:4: rule__Tareek__Group__0
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
    // InternalOsolQiraa.g:237:1: entryRuleKayd : ruleKayd EOF ;
    public final void entryRuleKayd() throws RecognitionException {
        try {
            // InternalOsolQiraa.g:238:1: ( ruleKayd EOF )
            // InternalOsolQiraa.g:239:1: ruleKayd EOF
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
    // InternalOsolQiraa.g:246:1: ruleKayd : ( ( rule__Kayd__Group__0 ) ) ;
    public final void ruleKayd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:250:2: ( ( ( rule__Kayd__Group__0 ) ) )
            // InternalOsolQiraa.g:251:2: ( ( rule__Kayd__Group__0 ) )
            {
            // InternalOsolQiraa.g:251:2: ( ( rule__Kayd__Group__0 ) )
            // InternalOsolQiraa.g:252:3: ( rule__Kayd__Group__0 )
            {
             before(grammarAccess.getKaydAccess().getGroup()); 
            // InternalOsolQiraa.g:253:3: ( rule__Kayd__Group__0 )
            // InternalOsolQiraa.g:253:4: rule__Kayd__Group__0
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
    // InternalOsolQiraa.g:262:1: entryRuleIstelah : ruleIstelah EOF ;
    public final void entryRuleIstelah() throws RecognitionException {
        try {
            // InternalOsolQiraa.g:263:1: ( ruleIstelah EOF )
            // InternalOsolQiraa.g:264:1: ruleIstelah EOF
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
    // InternalOsolQiraa.g:271:1: ruleIstelah : ( ( rule__Istelah__Group__0 ) ) ;
    public final void ruleIstelah() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:275:2: ( ( ( rule__Istelah__Group__0 ) ) )
            // InternalOsolQiraa.g:276:2: ( ( rule__Istelah__Group__0 ) )
            {
            // InternalOsolQiraa.g:276:2: ( ( rule__Istelah__Group__0 ) )
            // InternalOsolQiraa.g:277:3: ( rule__Istelah__Group__0 )
            {
             before(grammarAccess.getIstelahAccess().getGroup()); 
            // InternalOsolQiraa.g:278:3: ( rule__Istelah__Group__0 )
            // InternalOsolQiraa.g:278:4: rule__Istelah__Group__0
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
    // InternalOsolQiraa.g:287:1: entryRuleRamz : ruleRamz EOF ;
    public final void entryRuleRamz() throws RecognitionException {
        try {
            // InternalOsolQiraa.g:288:1: ( ruleRamz EOF )
            // InternalOsolQiraa.g:289:1: ruleRamz EOF
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
    // InternalOsolQiraa.g:296:1: ruleRamz : ( ( rule__Ramz__Group__0 ) ) ;
    public final void ruleRamz() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:300:2: ( ( ( rule__Ramz__Group__0 ) ) )
            // InternalOsolQiraa.g:301:2: ( ( rule__Ramz__Group__0 ) )
            {
            // InternalOsolQiraa.g:301:2: ( ( rule__Ramz__Group__0 ) )
            // InternalOsolQiraa.g:302:3: ( rule__Ramz__Group__0 )
            {
             before(grammarAccess.getRamzAccess().getGroup()); 
            // InternalOsolQiraa.g:303:3: ( rule__Ramz__Group__0 )
            // InternalOsolQiraa.g:303:4: rule__Ramz__Group__0
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


    // $ANTLR start "entryRuleMawdee"
    // InternalOsolQiraa.g:312:1: entryRuleMawdee : ruleMawdee EOF ;
    public final void entryRuleMawdee() throws RecognitionException {
        try {
            // InternalOsolQiraa.g:313:1: ( ruleMawdee EOF )
            // InternalOsolQiraa.g:314:1: ruleMawdee EOF
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
    // InternalOsolQiraa.g:321:1: ruleMawdee : ( ( rule__Mawdee__Alternatives ) ) ;
    public final void ruleMawdee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:325:2: ( ( ( rule__Mawdee__Alternatives ) ) )
            // InternalOsolQiraa.g:326:2: ( ( rule__Mawdee__Alternatives ) )
            {
            // InternalOsolQiraa.g:326:2: ( ( rule__Mawdee__Alternatives ) )
            // InternalOsolQiraa.g:327:3: ( rule__Mawdee__Alternatives )
            {
             before(grammarAccess.getMawdeeAccess().getAlternatives()); 
            // InternalOsolQiraa.g:328:3: ( rule__Mawdee__Alternatives )
            // InternalOsolQiraa.g:328:4: rule__Mawdee__Alternatives
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
    // InternalOsolQiraa.g:337:1: entryRuleHarf : ruleHarf EOF ;
    public final void entryRuleHarf() throws RecognitionException {
        try {
            // InternalOsolQiraa.g:338:1: ( ruleHarf EOF )
            // InternalOsolQiraa.g:339:1: ruleHarf EOF
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
    // InternalOsolQiraa.g:346:1: ruleHarf : ( ( rule__Harf__Group__0 ) ) ;
    public final void ruleHarf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:350:2: ( ( ( rule__Harf__Group__0 ) ) )
            // InternalOsolQiraa.g:351:2: ( ( rule__Harf__Group__0 ) )
            {
            // InternalOsolQiraa.g:351:2: ( ( rule__Harf__Group__0 ) )
            // InternalOsolQiraa.g:352:3: ( rule__Harf__Group__0 )
            {
             before(grammarAccess.getHarfAccess().getGroup()); 
            // InternalOsolQiraa.g:353:3: ( rule__Harf__Group__0 )
            // InternalOsolQiraa.g:353:4: rule__Harf__Group__0
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
    // InternalOsolQiraa.g:362:1: entryRuleHarakah : ruleHarakah EOF ;
    public final void entryRuleHarakah() throws RecognitionException {
        try {
            // InternalOsolQiraa.g:363:1: ( ruleHarakah EOF )
            // InternalOsolQiraa.g:364:1: ruleHarakah EOF
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
    // InternalOsolQiraa.g:371:1: ruleHarakah : ( ( rule__Harakah__Group__0 ) ) ;
    public final void ruleHarakah() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:375:2: ( ( ( rule__Harakah__Group__0 ) ) )
            // InternalOsolQiraa.g:376:2: ( ( rule__Harakah__Group__0 ) )
            {
            // InternalOsolQiraa.g:376:2: ( ( rule__Harakah__Group__0 ) )
            // InternalOsolQiraa.g:377:3: ( rule__Harakah__Group__0 )
            {
             before(grammarAccess.getHarakahAccess().getGroup()); 
            // InternalOsolQiraa.g:378:3: ( rule__Harakah__Group__0 )
            // InternalOsolQiraa.g:378:4: rule__Harakah__Group__0
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
    // InternalOsolQiraa.g:387:1: entryRuleAyahStart : ruleAyahStart EOF ;
    public final void entryRuleAyahStart() throws RecognitionException {
        try {
            // InternalOsolQiraa.g:388:1: ( ruleAyahStart EOF )
            // InternalOsolQiraa.g:389:1: ruleAyahStart EOF
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
    // InternalOsolQiraa.g:396:1: ruleAyahStart : ( ( rule__AyahStart__Group__0 ) ) ;
    public final void ruleAyahStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:400:2: ( ( ( rule__AyahStart__Group__0 ) ) )
            // InternalOsolQiraa.g:401:2: ( ( rule__AyahStart__Group__0 ) )
            {
            // InternalOsolQiraa.g:401:2: ( ( rule__AyahStart__Group__0 ) )
            // InternalOsolQiraa.g:402:3: ( rule__AyahStart__Group__0 )
            {
             before(grammarAccess.getAyahStartAccess().getGroup()); 
            // InternalOsolQiraa.g:403:3: ( rule__AyahStart__Group__0 )
            // InternalOsolQiraa.g:403:4: rule__AyahStart__Group__0
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
    // InternalOsolQiraa.g:412:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // InternalOsolQiraa.g:413:1: ( rulePhrase EOF )
            // InternalOsolQiraa.g:414:1: rulePhrase EOF
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
    // InternalOsolQiraa.g:421:1: rulePhrase : ( ( rule__Phrase__Group__0 ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:425:2: ( ( ( rule__Phrase__Group__0 ) ) )
            // InternalOsolQiraa.g:426:2: ( ( rule__Phrase__Group__0 ) )
            {
            // InternalOsolQiraa.g:426:2: ( ( rule__Phrase__Group__0 ) )
            // InternalOsolQiraa.g:427:3: ( rule__Phrase__Group__0 )
            {
             before(grammarAccess.getPhraseAccess().getGroup()); 
            // InternalOsolQiraa.g:428:3: ( rule__Phrase__Group__0 )
            // InternalOsolQiraa.g:428:4: rule__Phrase__Group__0
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


    // $ANTLR start "rule__OsolQiraaModel__Alternatives"
    // InternalOsolQiraa.g:436:1: rule__OsolQiraaModel__Alternatives : ( ( ( rule__OsolQiraaModel__QoraaAssignment_0 ) ) | ( ( rule__OsolQiraaModel__TorokAssignment_1 ) ) | ( ( rule__OsolQiraaModel__RowatAssignment_2 ) ) | ( ( rule__OsolQiraaModel__ImamsAssignment_3 ) ) | ( ( rule__OsolQiraaModel__IstelahatAssignment_4 ) ) | ( ( rule__OsolQiraaModel__KoyodAssignment_5 ) ) );
    public final void rule__OsolQiraaModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:440:1: ( ( ( rule__OsolQiraaModel__QoraaAssignment_0 ) ) | ( ( rule__OsolQiraaModel__TorokAssignment_1 ) ) | ( ( rule__OsolQiraaModel__RowatAssignment_2 ) ) | ( ( rule__OsolQiraaModel__ImamsAssignment_3 ) ) | ( ( rule__OsolQiraaModel__IstelahatAssignment_4 ) ) | ( ( rule__OsolQiraaModel__KoyodAssignment_5 ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt2=1;
                }
                break;
            case 35:
                {
                alt2=2;
                }
                break;
            case 33:
                {
                alt2=3;
                }
                break;
            case 31:
                {
                alt2=4;
                }
                break;
            case 40:
                {
                alt2=5;
                }
                break;
            case 39:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalOsolQiraa.g:441:2: ( ( rule__OsolQiraaModel__QoraaAssignment_0 ) )
                    {
                    // InternalOsolQiraa.g:441:2: ( ( rule__OsolQiraaModel__QoraaAssignment_0 ) )
                    // InternalOsolQiraa.g:442:3: ( rule__OsolQiraaModel__QoraaAssignment_0 )
                    {
                     before(grammarAccess.getOsolQiraaModelAccess().getQoraaAssignment_0()); 
                    // InternalOsolQiraa.g:443:3: ( rule__OsolQiraaModel__QoraaAssignment_0 )
                    // InternalOsolQiraa.g:443:4: rule__OsolQiraaModel__QoraaAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OsolQiraaModel__QoraaAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOsolQiraaModelAccess().getQoraaAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOsolQiraa.g:447:2: ( ( rule__OsolQiraaModel__TorokAssignment_1 ) )
                    {
                    // InternalOsolQiraa.g:447:2: ( ( rule__OsolQiraaModel__TorokAssignment_1 ) )
                    // InternalOsolQiraa.g:448:3: ( rule__OsolQiraaModel__TorokAssignment_1 )
                    {
                     before(grammarAccess.getOsolQiraaModelAccess().getTorokAssignment_1()); 
                    // InternalOsolQiraa.g:449:3: ( rule__OsolQiraaModel__TorokAssignment_1 )
                    // InternalOsolQiraa.g:449:4: rule__OsolQiraaModel__TorokAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OsolQiraaModel__TorokAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOsolQiraaModelAccess().getTorokAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOsolQiraa.g:453:2: ( ( rule__OsolQiraaModel__RowatAssignment_2 ) )
                    {
                    // InternalOsolQiraa.g:453:2: ( ( rule__OsolQiraaModel__RowatAssignment_2 ) )
                    // InternalOsolQiraa.g:454:3: ( rule__OsolQiraaModel__RowatAssignment_2 )
                    {
                     before(grammarAccess.getOsolQiraaModelAccess().getRowatAssignment_2()); 
                    // InternalOsolQiraa.g:455:3: ( rule__OsolQiraaModel__RowatAssignment_2 )
                    // InternalOsolQiraa.g:455:4: rule__OsolQiraaModel__RowatAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__OsolQiraaModel__RowatAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getOsolQiraaModelAccess().getRowatAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOsolQiraa.g:459:2: ( ( rule__OsolQiraaModel__ImamsAssignment_3 ) )
                    {
                    // InternalOsolQiraa.g:459:2: ( ( rule__OsolQiraaModel__ImamsAssignment_3 ) )
                    // InternalOsolQiraa.g:460:3: ( rule__OsolQiraaModel__ImamsAssignment_3 )
                    {
                     before(grammarAccess.getOsolQiraaModelAccess().getImamsAssignment_3()); 
                    // InternalOsolQiraa.g:461:3: ( rule__OsolQiraaModel__ImamsAssignment_3 )
                    // InternalOsolQiraa.g:461:4: rule__OsolQiraaModel__ImamsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__OsolQiraaModel__ImamsAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getOsolQiraaModelAccess().getImamsAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOsolQiraa.g:465:2: ( ( rule__OsolQiraaModel__IstelahatAssignment_4 ) )
                    {
                    // InternalOsolQiraa.g:465:2: ( ( rule__OsolQiraaModel__IstelahatAssignment_4 ) )
                    // InternalOsolQiraa.g:466:3: ( rule__OsolQiraaModel__IstelahatAssignment_4 )
                    {
                     before(grammarAccess.getOsolQiraaModelAccess().getIstelahatAssignment_4()); 
                    // InternalOsolQiraa.g:467:3: ( rule__OsolQiraaModel__IstelahatAssignment_4 )
                    // InternalOsolQiraa.g:467:4: rule__OsolQiraaModel__IstelahatAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__OsolQiraaModel__IstelahatAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getOsolQiraaModelAccess().getIstelahatAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOsolQiraa.g:471:2: ( ( rule__OsolQiraaModel__KoyodAssignment_5 ) )
                    {
                    // InternalOsolQiraa.g:471:2: ( ( rule__OsolQiraaModel__KoyodAssignment_5 ) )
                    // InternalOsolQiraa.g:472:3: ( rule__OsolQiraaModel__KoyodAssignment_5 )
                    {
                     before(grammarAccess.getOsolQiraaModelAccess().getKoyodAssignment_5()); 
                    // InternalOsolQiraa.g:473:3: ( rule__OsolQiraaModel__KoyodAssignment_5 )
                    // InternalOsolQiraa.g:473:4: rule__OsolQiraaModel__KoyodAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__OsolQiraaModel__KoyodAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getOsolQiraaModelAccess().getKoyodAssignment_5()); 

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
    // $ANTLR end "rule__OsolQiraaModel__Alternatives"


    // $ANTLR start "rule__Douaa__DAlternatives_0_0"
    // InternalOsolQiraa.g:481:1: rule__Douaa__DAlternatives_0_0 : ( ( '\\u0631\\u062D\\u0645\\u0647' ) | ( '\\u0623\\u0643\\u0631\\u0645\\u0647' ) );
    public final void rule__Douaa__DAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:485:1: ( ( '\\u0631\\u062D\\u0645\\u0647' ) | ( '\\u0623\\u0643\\u0631\\u0645\\u0647' ) )
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
                    // InternalOsolQiraa.g:486:2: ( '\\u0631\\u062D\\u0645\\u0647' )
                    {
                    // InternalOsolQiraa.g:486:2: ( '\\u0631\\u062D\\u0645\\u0647' )
                    // InternalOsolQiraa.g:487:3: '\\u0631\\u062D\\u0645\\u0647'
                    {
                     before(grammarAccess.getDouaaAccess().getDArabicLetterRehArabicLetterHahArabicLetterMeemArabicLetterHehKeyword_0_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getDouaaAccess().getDArabicLetterRehArabicLetterHahArabicLetterMeemArabicLetterHehKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOsolQiraa.g:492:2: ( '\\u0623\\u0643\\u0631\\u0645\\u0647' )
                    {
                    // InternalOsolQiraa.g:492:2: ( '\\u0623\\u0643\\u0631\\u0645\\u0647' )
                    // InternalOsolQiraa.g:493:3: '\\u0623\\u0643\\u0631\\u0645\\u0647'
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
    // InternalOsolQiraa.g:502:1: rule__YokraaLah__Alternatives : ( ( ruleQaree ) | ( ruleRawee ) | ( ruleIstelah ) );
    public final void rule__YokraaLah__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:506:1: ( ( ruleQaree ) | ( ruleRawee ) | ( ruleIstelah ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt4=1;
                }
                break;
            case 33:
                {
                alt4=2;
                }
                break;
            case 40:
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
                    // InternalOsolQiraa.g:507:2: ( ruleQaree )
                    {
                    // InternalOsolQiraa.g:507:2: ( ruleQaree )
                    // InternalOsolQiraa.g:508:3: ruleQaree
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
                    // InternalOsolQiraa.g:513:2: ( ruleRawee )
                    {
                    // InternalOsolQiraa.g:513:2: ( ruleRawee )
                    // InternalOsolQiraa.g:514:3: ruleRawee
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
                    // InternalOsolQiraa.g:519:2: ( ruleIstelah )
                    {
                    // InternalOsolQiraa.g:519:2: ( ruleIstelah )
                    // InternalOsolQiraa.g:520:3: ruleIstelah
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
    // InternalOsolQiraa.g:529:1: rule__Tareek__Alternatives_3 : ( ( ( rule__Tareek__Group_3_0__0 ) ) | ( ( rule__Tareek__Group_3_1__0 ) ) );
    public final void rule__Tareek__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:533:1: ( ( ( rule__Tareek__Group_3_0__0 ) ) | ( ( rule__Tareek__Group_3_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==52) ) {
                alt5=1;
            }
            else if ( (LA5_0==53) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalOsolQiraa.g:534:2: ( ( rule__Tareek__Group_3_0__0 ) )
                    {
                    // InternalOsolQiraa.g:534:2: ( ( rule__Tareek__Group_3_0__0 ) )
                    // InternalOsolQiraa.g:535:3: ( rule__Tareek__Group_3_0__0 )
                    {
                     before(grammarAccess.getTareekAccess().getGroup_3_0()); 
                    // InternalOsolQiraa.g:536:3: ( rule__Tareek__Group_3_0__0 )
                    // InternalOsolQiraa.g:536:4: rule__Tareek__Group_3_0__0
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
                    // InternalOsolQiraa.g:540:2: ( ( rule__Tareek__Group_3_1__0 ) )
                    {
                    // InternalOsolQiraa.g:540:2: ( ( rule__Tareek__Group_3_1__0 ) )
                    // InternalOsolQiraa.g:541:3: ( rule__Tareek__Group_3_1__0 )
                    {
                     before(grammarAccess.getTareekAccess().getGroup_3_1()); 
                    // InternalOsolQiraa.g:542:3: ( rule__Tareek__Group_3_1__0 )
                    // InternalOsolQiraa.g:542:4: rule__Tareek__Group_3_1__0
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
    // InternalOsolQiraa.g:550:1: rule__Mawdee__Alternatives : ( ( '\\u0627\\u0644\\u0623\\u0648\\u0644' ) | ( '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' ) | ( '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' ) | ( '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' ) );
    public final void rule__Mawdee__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:554:1: ( ( '\\u0627\\u0644\\u0623\\u0648\\u0644' ) | ( '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' ) | ( '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' ) | ( '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' ) )
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
                    // InternalOsolQiraa.g:555:2: ( '\\u0627\\u0644\\u0623\\u0648\\u0644' )
                    {
                    // InternalOsolQiraa.g:555:2: ( '\\u0627\\u0644\\u0623\\u0648\\u0644' )
                    // InternalOsolQiraa.g:556:3: '\\u0627\\u0644\\u0623\\u0648\\u0644'
                    {
                     before(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaAboveArabicLetterWawArabicLetterLamKeyword_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaAboveArabicLetterWawArabicLetterLamKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOsolQiraa.g:561:2: ( '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' )
                    {
                    // InternalOsolQiraa.g:561:2: ( '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' )
                    // InternalOsolQiraa.g:562:3: '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A'
                    {
                     before(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterNoonArabicLetterYehKeyword_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterNoonArabicLetterYehKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOsolQiraa.g:567:2: ( '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' )
                    {
                    // InternalOsolQiraa.g:567:2: ( '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' )
                    // InternalOsolQiraa.g:568:3: '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B'
                    {
                     before(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterLamArabicLetterThehKeyword_2()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterLamArabicLetterThehKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOsolQiraa.g:573:2: ( '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' )
                    {
                    // InternalOsolQiraa.g:573:2: ( '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' )
                    // InternalOsolQiraa.g:574:3: '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631'
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
    // InternalOsolQiraa.g:583:1: rule__Harf__Alternatives_2 : ( ( ( rule__Harf__Group_2_0__0 ) ) | ( ( rule__Harf__Group_2_1__0 ) ) );
    public final void rule__Harf__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:587:1: ( ( ( rule__Harf__Group_2_0__0 ) ) | ( ( rule__Harf__Group_2_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==45) ) {
                alt7=1;
            }
            else if ( (LA7_0==47) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOsolQiraa.g:588:2: ( ( rule__Harf__Group_2_0__0 ) )
                    {
                    // InternalOsolQiraa.g:588:2: ( ( rule__Harf__Group_2_0__0 ) )
                    // InternalOsolQiraa.g:589:3: ( rule__Harf__Group_2_0__0 )
                    {
                     before(grammarAccess.getHarfAccess().getGroup_2_0()); 
                    // InternalOsolQiraa.g:590:3: ( rule__Harf__Group_2_0__0 )
                    // InternalOsolQiraa.g:590:4: rule__Harf__Group_2_0__0
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
                    // InternalOsolQiraa.g:594:2: ( ( rule__Harf__Group_2_1__0 ) )
                    {
                    // InternalOsolQiraa.g:594:2: ( ( rule__Harf__Group_2_1__0 ) )
                    // InternalOsolQiraa.g:595:3: ( rule__Harf__Group_2_1__0 )
                    {
                     before(grammarAccess.getHarfAccess().getGroup_2_1()); 
                    // InternalOsolQiraa.g:596:3: ( rule__Harf__Group_2_1__0 )
                    // InternalOsolQiraa.g:596:4: rule__Harf__Group_2_1__0
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


    // $ANTLR start "rule__Person__Group__0"
    // InternalOsolQiraa.g:604:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:608:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalOsolQiraa.g:609:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalOsolQiraa.g:616:1: rule__Person__Group__0__Impl : ( ( rule__Person__NameAssignment_0 ) ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:620:1: ( ( ( rule__Person__NameAssignment_0 ) ) )
            // InternalOsolQiraa.g:621:1: ( ( rule__Person__NameAssignment_0 ) )
            {
            // InternalOsolQiraa.g:621:1: ( ( rule__Person__NameAssignment_0 ) )
            // InternalOsolQiraa.g:622:2: ( rule__Person__NameAssignment_0 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_0()); 
            // InternalOsolQiraa.g:623:2: ( rule__Person__NameAssignment_0 )
            // InternalOsolQiraa.g:623:3: rule__Person__NameAssignment_0
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
    // InternalOsolQiraa.g:631:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:635:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalOsolQiraa.g:636:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalOsolQiraa.g:643:1: rule__Person__Group__1__Impl : ( ( rule__Person__Group_1__0 )? ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:647:1: ( ( ( rule__Person__Group_1__0 )? ) )
            // InternalOsolQiraa.g:648:1: ( ( rule__Person__Group_1__0 )? )
            {
            // InternalOsolQiraa.g:648:1: ( ( rule__Person__Group_1__0 )? )
            // InternalOsolQiraa.g:649:2: ( rule__Person__Group_1__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_1()); 
            // InternalOsolQiraa.g:650:2: ( rule__Person__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOsolQiraa.g:650:3: rule__Person__Group_1__0
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
    // InternalOsolQiraa.g:658:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:662:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalOsolQiraa.g:663:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalOsolQiraa.g:670:1: rule__Person__Group__2__Impl : ( ( rule__Person__Group_2__0 )? ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:674:1: ( ( ( rule__Person__Group_2__0 )? ) )
            // InternalOsolQiraa.g:675:1: ( ( rule__Person__Group_2__0 )? )
            {
            // InternalOsolQiraa.g:675:1: ( ( rule__Person__Group_2__0 )? )
            // InternalOsolQiraa.g:676:2: ( rule__Person__Group_2__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_2()); 
            // InternalOsolQiraa.g:677:2: ( rule__Person__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOsolQiraa.g:677:3: rule__Person__Group_2__0
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
    // InternalOsolQiraa.g:685:1: rule__Person__Group__3 : rule__Person__Group__3__Impl ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:689:1: ( rule__Person__Group__3__Impl )
            // InternalOsolQiraa.g:690:2: rule__Person__Group__3__Impl
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
    // InternalOsolQiraa.g:696:1: rule__Person__Group__3__Impl : ( ( rule__Person__Group_3__0 )? ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:700:1: ( ( ( rule__Person__Group_3__0 )? ) )
            // InternalOsolQiraa.g:701:1: ( ( rule__Person__Group_3__0 )? )
            {
            // InternalOsolQiraa.g:701:1: ( ( rule__Person__Group_3__0 )? )
            // InternalOsolQiraa.g:702:2: ( rule__Person__Group_3__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_3()); 
            // InternalOsolQiraa.g:703:2: ( rule__Person__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOsolQiraa.g:703:3: rule__Person__Group_3__0
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
    // InternalOsolQiraa.g:712:1: rule__Person__Group_1__0 : rule__Person__Group_1__0__Impl rule__Person__Group_1__1 ;
    public final void rule__Person__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:716:1: ( rule__Person__Group_1__0__Impl rule__Person__Group_1__1 )
            // InternalOsolQiraa.g:717:2: rule__Person__Group_1__0__Impl rule__Person__Group_1__1
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
    // InternalOsolQiraa.g:724:1: rule__Person__Group_1__0__Impl : ( '\\u0627\\u0633\\u0645\\u0647' ) ;
    public final void rule__Person__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:728:1: ( ( '\\u0627\\u0633\\u0645\\u0647' ) )
            // InternalOsolQiraa.g:729:1: ( '\\u0627\\u0633\\u0645\\u0647' )
            {
            // InternalOsolQiraa.g:729:1: ( '\\u0627\\u0633\\u0645\\u0647' )
            // InternalOsolQiraa.g:730:2: '\\u0627\\u0633\\u0645\\u0647'
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
    // InternalOsolQiraa.g:739:1: rule__Person__Group_1__1 : rule__Person__Group_1__1__Impl ;
    public final void rule__Person__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:743:1: ( rule__Person__Group_1__1__Impl )
            // InternalOsolQiraa.g:744:2: rule__Person__Group_1__1__Impl
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
    // InternalOsolQiraa.g:750:1: rule__Person__Group_1__1__Impl : ( ( rule__Person__EsmAssignment_1_1 ) ) ;
    public final void rule__Person__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:754:1: ( ( ( rule__Person__EsmAssignment_1_1 ) ) )
            // InternalOsolQiraa.g:755:1: ( ( rule__Person__EsmAssignment_1_1 ) )
            {
            // InternalOsolQiraa.g:755:1: ( ( rule__Person__EsmAssignment_1_1 ) )
            // InternalOsolQiraa.g:756:2: ( rule__Person__EsmAssignment_1_1 )
            {
             before(grammarAccess.getPersonAccess().getEsmAssignment_1_1()); 
            // InternalOsolQiraa.g:757:2: ( rule__Person__EsmAssignment_1_1 )
            // InternalOsolQiraa.g:757:3: rule__Person__EsmAssignment_1_1
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
    // InternalOsolQiraa.g:766:1: rule__Person__Group_2__0 : rule__Person__Group_2__0__Impl rule__Person__Group_2__1 ;
    public final void rule__Person__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:770:1: ( rule__Person__Group_2__0__Impl rule__Person__Group_2__1 )
            // InternalOsolQiraa.g:771:2: rule__Person__Group_2__0__Impl rule__Person__Group_2__1
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
    // InternalOsolQiraa.g:778:1: rule__Person__Group_2__0__Impl : ( '\\u0644\\u0642\\u0628\\u0647' ) ;
    public final void rule__Person__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:782:1: ( ( '\\u0644\\u0642\\u0628\\u0647' ) )
            // InternalOsolQiraa.g:783:1: ( '\\u0644\\u0642\\u0628\\u0647' )
            {
            // InternalOsolQiraa.g:783:1: ( '\\u0644\\u0642\\u0628\\u0647' )
            // InternalOsolQiraa.g:784:2: '\\u0644\\u0642\\u0628\\u0647'
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
    // InternalOsolQiraa.g:793:1: rule__Person__Group_2__1 : rule__Person__Group_2__1__Impl ;
    public final void rule__Person__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:797:1: ( rule__Person__Group_2__1__Impl )
            // InternalOsolQiraa.g:798:2: rule__Person__Group_2__1__Impl
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
    // InternalOsolQiraa.g:804:1: rule__Person__Group_2__1__Impl : ( ( rule__Person__LakabAssignment_2_1 ) ) ;
    public final void rule__Person__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:808:1: ( ( ( rule__Person__LakabAssignment_2_1 ) ) )
            // InternalOsolQiraa.g:809:1: ( ( rule__Person__LakabAssignment_2_1 ) )
            {
            // InternalOsolQiraa.g:809:1: ( ( rule__Person__LakabAssignment_2_1 ) )
            // InternalOsolQiraa.g:810:2: ( rule__Person__LakabAssignment_2_1 )
            {
             before(grammarAccess.getPersonAccess().getLakabAssignment_2_1()); 
            // InternalOsolQiraa.g:811:2: ( rule__Person__LakabAssignment_2_1 )
            // InternalOsolQiraa.g:811:3: rule__Person__LakabAssignment_2_1
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
    // InternalOsolQiraa.g:820:1: rule__Person__Group_3__0 : rule__Person__Group_3__0__Impl rule__Person__Group_3__1 ;
    public final void rule__Person__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:824:1: ( rule__Person__Group_3__0__Impl rule__Person__Group_3__1 )
            // InternalOsolQiraa.g:825:2: rule__Person__Group_3__0__Impl rule__Person__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalOsolQiraa.g:832:1: rule__Person__Group_3__0__Impl : ( '\\u062A\\u0648\\u0641\\u064A' ) ;
    public final void rule__Person__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:836:1: ( ( '\\u062A\\u0648\\u0641\\u064A' ) )
            // InternalOsolQiraa.g:837:1: ( '\\u062A\\u0648\\u0641\\u064A' )
            {
            // InternalOsolQiraa.g:837:1: ( '\\u062A\\u0648\\u0641\\u064A' )
            // InternalOsolQiraa.g:838:2: '\\u062A\\u0648\\u0641\\u064A'
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
    // InternalOsolQiraa.g:847:1: rule__Person__Group_3__1 : rule__Person__Group_3__1__Impl ;
    public final void rule__Person__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:851:1: ( rule__Person__Group_3__1__Impl )
            // InternalOsolQiraa.g:852:2: rule__Person__Group_3__1__Impl
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
    // InternalOsolQiraa.g:858:1: rule__Person__Group_3__1__Impl : ( ( rule__Person__TowofiaAssignment_3_1 ) ) ;
    public final void rule__Person__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:862:1: ( ( ( rule__Person__TowofiaAssignment_3_1 ) ) )
            // InternalOsolQiraa.g:863:1: ( ( rule__Person__TowofiaAssignment_3_1 ) )
            {
            // InternalOsolQiraa.g:863:1: ( ( rule__Person__TowofiaAssignment_3_1 ) )
            // InternalOsolQiraa.g:864:2: ( rule__Person__TowofiaAssignment_3_1 )
            {
             before(grammarAccess.getPersonAccess().getTowofiaAssignment_3_1()); 
            // InternalOsolQiraa.g:865:2: ( rule__Person__TowofiaAssignment_3_1 )
            // InternalOsolQiraa.g:865:3: rule__Person__TowofiaAssignment_3_1
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
    // InternalOsolQiraa.g:874:1: rule__Douaa__Group__0 : rule__Douaa__Group__0__Impl rule__Douaa__Group__1 ;
    public final void rule__Douaa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:878:1: ( rule__Douaa__Group__0__Impl rule__Douaa__Group__1 )
            // InternalOsolQiraa.g:879:2: rule__Douaa__Group__0__Impl rule__Douaa__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalOsolQiraa.g:886:1: rule__Douaa__Group__0__Impl : ( ( rule__Douaa__DAssignment_0 ) ) ;
    public final void rule__Douaa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:890:1: ( ( ( rule__Douaa__DAssignment_0 ) ) )
            // InternalOsolQiraa.g:891:1: ( ( rule__Douaa__DAssignment_0 ) )
            {
            // InternalOsolQiraa.g:891:1: ( ( rule__Douaa__DAssignment_0 ) )
            // InternalOsolQiraa.g:892:2: ( rule__Douaa__DAssignment_0 )
            {
             before(grammarAccess.getDouaaAccess().getDAssignment_0()); 
            // InternalOsolQiraa.g:893:2: ( rule__Douaa__DAssignment_0 )
            // InternalOsolQiraa.g:893:3: rule__Douaa__DAssignment_0
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
    // InternalOsolQiraa.g:901:1: rule__Douaa__Group__1 : rule__Douaa__Group__1__Impl ;
    public final void rule__Douaa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:905:1: ( rule__Douaa__Group__1__Impl )
            // InternalOsolQiraa.g:906:2: rule__Douaa__Group__1__Impl
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
    // InternalOsolQiraa.g:912:1: rule__Douaa__Group__1__Impl : ( '\\u0627\\u0644\\u0644\\u0647' ) ;
    public final void rule__Douaa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:916:1: ( ( '\\u0627\\u0644\\u0644\\u0647' ) )
            // InternalOsolQiraa.g:917:1: ( '\\u0627\\u0644\\u0644\\u0647' )
            {
            // InternalOsolQiraa.g:917:1: ( '\\u0627\\u0644\\u0644\\u0647' )
            // InternalOsolQiraa.g:918:2: '\\u0627\\u0644\\u0644\\u0647'
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


    // $ANTLR start "rule__IMAM__Group__0"
    // InternalOsolQiraa.g:928:1: rule__IMAM__Group__0 : rule__IMAM__Group__0__Impl rule__IMAM__Group__1 ;
    public final void rule__IMAM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:932:1: ( rule__IMAM__Group__0__Impl rule__IMAM__Group__1 )
            // InternalOsolQiraa.g:933:2: rule__IMAM__Group__0__Impl rule__IMAM__Group__1
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
    // InternalOsolQiraa.g:940:1: rule__IMAM__Group__0__Impl : ( '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' ) ;
    public final void rule__IMAM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:944:1: ( ( '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' ) )
            // InternalOsolQiraa.g:945:1: ( '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' )
            {
            // InternalOsolQiraa.g:945:1: ( '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' )
            // InternalOsolQiraa.g:946:2: '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645'
            {
             before(grammarAccess.getIMAMAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaBelowArabicLetterMeemArabicLetterAlefArabicLetterMeemKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalOsolQiraa.g:955:1: rule__IMAM__Group__1 : rule__IMAM__Group__1__Impl rule__IMAM__Group__2 ;
    public final void rule__IMAM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:959:1: ( rule__IMAM__Group__1__Impl rule__IMAM__Group__2 )
            // InternalOsolQiraa.g:960:2: rule__IMAM__Group__1__Impl rule__IMAM__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalOsolQiraa.g:967:1: rule__IMAM__Group__1__Impl : ( rulePerson ) ;
    public final void rule__IMAM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:971:1: ( ( rulePerson ) )
            // InternalOsolQiraa.g:972:1: ( rulePerson )
            {
            // InternalOsolQiraa.g:972:1: ( rulePerson )
            // InternalOsolQiraa.g:973:2: rulePerson
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
    // InternalOsolQiraa.g:982:1: rule__IMAM__Group__2 : rule__IMAM__Group__2__Impl ;
    public final void rule__IMAM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:986:1: ( rule__IMAM__Group__2__Impl )
            // InternalOsolQiraa.g:987:2: rule__IMAM__Group__2__Impl
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
    // InternalOsolQiraa.g:993:1: rule__IMAM__Group__2__Impl : ( ruleDouaa ) ;
    public final void rule__IMAM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:997:1: ( ( ruleDouaa ) )
            // InternalOsolQiraa.g:998:1: ( ruleDouaa )
            {
            // InternalOsolQiraa.g:998:1: ( ruleDouaa )
            // InternalOsolQiraa.g:999:2: ruleDouaa
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
    // InternalOsolQiraa.g:1009:1: rule__Qaree__Group__0 : rule__Qaree__Group__0__Impl rule__Qaree__Group__1 ;
    public final void rule__Qaree__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1013:1: ( rule__Qaree__Group__0__Impl rule__Qaree__Group__1 )
            // InternalOsolQiraa.g:1014:2: rule__Qaree__Group__0__Impl rule__Qaree__Group__1
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
    // InternalOsolQiraa.g:1021:1: rule__Qaree__Group__0__Impl : ( '\\u0642\\u0627\\u0631\\u0626' ) ;
    public final void rule__Qaree__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1025:1: ( ( '\\u0642\\u0627\\u0631\\u0626' ) )
            // InternalOsolQiraa.g:1026:1: ( '\\u0642\\u0627\\u0631\\u0626' )
            {
            // InternalOsolQiraa.g:1026:1: ( '\\u0642\\u0627\\u0631\\u0626' )
            // InternalOsolQiraa.g:1027:2: '\\u0642\\u0627\\u0631\\u0626'
            {
             before(grammarAccess.getQareeAccess().getArabicLetterQafArabicLetterAlefArabicLetterRehArabicLetterYehWithHamzaAboveKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalOsolQiraa.g:1036:1: rule__Qaree__Group__1 : rule__Qaree__Group__1__Impl ;
    public final void rule__Qaree__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1040:1: ( rule__Qaree__Group__1__Impl )
            // InternalOsolQiraa.g:1041:2: rule__Qaree__Group__1__Impl
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
    // InternalOsolQiraa.g:1047:1: rule__Qaree__Group__1__Impl : ( rulePerson ) ;
    public final void rule__Qaree__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1051:1: ( ( rulePerson ) )
            // InternalOsolQiraa.g:1052:1: ( rulePerson )
            {
            // InternalOsolQiraa.g:1052:1: ( rulePerson )
            // InternalOsolQiraa.g:1053:2: rulePerson
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
    // InternalOsolQiraa.g:1063:1: rule__Rawee__Group__0 : rule__Rawee__Group__0__Impl rule__Rawee__Group__1 ;
    public final void rule__Rawee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1067:1: ( rule__Rawee__Group__0__Impl rule__Rawee__Group__1 )
            // InternalOsolQiraa.g:1068:2: rule__Rawee__Group__0__Impl rule__Rawee__Group__1
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
    // InternalOsolQiraa.g:1075:1: rule__Rawee__Group__0__Impl : ( '\\u0631\\u0627\\u0648' ) ;
    public final void rule__Rawee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1079:1: ( ( '\\u0631\\u0627\\u0648' ) )
            // InternalOsolQiraa.g:1080:1: ( '\\u0631\\u0627\\u0648' )
            {
            // InternalOsolQiraa.g:1080:1: ( '\\u0631\\u0627\\u0648' )
            // InternalOsolQiraa.g:1081:2: '\\u0631\\u0627\\u0648'
            {
             before(grammarAccess.getRaweeAccess().getArabicLetterRehArabicLetterAlefArabicLetterWawKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalOsolQiraa.g:1090:1: rule__Rawee__Group__1 : rule__Rawee__Group__1__Impl rule__Rawee__Group__2 ;
    public final void rule__Rawee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1094:1: ( rule__Rawee__Group__1__Impl rule__Rawee__Group__2 )
            // InternalOsolQiraa.g:1095:2: rule__Rawee__Group__1__Impl rule__Rawee__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalOsolQiraa.g:1102:1: rule__Rawee__Group__1__Impl : ( rulePerson ) ;
    public final void rule__Rawee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1106:1: ( ( rulePerson ) )
            // InternalOsolQiraa.g:1107:1: ( rulePerson )
            {
            // InternalOsolQiraa.g:1107:1: ( rulePerson )
            // InternalOsolQiraa.g:1108:2: rulePerson
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
    // InternalOsolQiraa.g:1117:1: rule__Rawee__Group__2 : rule__Rawee__Group__2__Impl rule__Rawee__Group__3 ;
    public final void rule__Rawee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1121:1: ( rule__Rawee__Group__2__Impl rule__Rawee__Group__3 )
            // InternalOsolQiraa.g:1122:2: rule__Rawee__Group__2__Impl rule__Rawee__Group__3
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
    // InternalOsolQiraa.g:1129:1: rule__Rawee__Group__2__Impl : ( '\\u0639\\u0646' ) ;
    public final void rule__Rawee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1133:1: ( ( '\\u0639\\u0646' ) )
            // InternalOsolQiraa.g:1134:1: ( '\\u0639\\u0646' )
            {
            // InternalOsolQiraa.g:1134:1: ( '\\u0639\\u0646' )
            // InternalOsolQiraa.g:1135:2: '\\u0639\\u0646'
            {
             before(grammarAccess.getRaweeAccess().getArabicLetterAinArabicLetterNoonKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalOsolQiraa.g:1144:1: rule__Rawee__Group__3 : rule__Rawee__Group__3__Impl ;
    public final void rule__Rawee__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1148:1: ( rule__Rawee__Group__3__Impl )
            // InternalOsolQiraa.g:1149:2: rule__Rawee__Group__3__Impl
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
    // InternalOsolQiraa.g:1155:1: rule__Rawee__Group__3__Impl : ( ( rule__Rawee__QareeAssignment_3 ) ) ;
    public final void rule__Rawee__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1159:1: ( ( ( rule__Rawee__QareeAssignment_3 ) ) )
            // InternalOsolQiraa.g:1160:1: ( ( rule__Rawee__QareeAssignment_3 ) )
            {
            // InternalOsolQiraa.g:1160:1: ( ( rule__Rawee__QareeAssignment_3 ) )
            // InternalOsolQiraa.g:1161:2: ( rule__Rawee__QareeAssignment_3 )
            {
             before(grammarAccess.getRaweeAccess().getQareeAssignment_3()); 
            // InternalOsolQiraa.g:1162:2: ( rule__Rawee__QareeAssignment_3 )
            // InternalOsolQiraa.g:1162:3: rule__Rawee__QareeAssignment_3
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
    // InternalOsolQiraa.g:1171:1: rule__Tareek__Group__0 : rule__Tareek__Group__0__Impl rule__Tareek__Group__1 ;
    public final void rule__Tareek__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1175:1: ( rule__Tareek__Group__0__Impl rule__Tareek__Group__1 )
            // InternalOsolQiraa.g:1176:2: rule__Tareek__Group__0__Impl rule__Tareek__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalOsolQiraa.g:1183:1: rule__Tareek__Group__0__Impl : ( '\\u0637\\u0631\\u064A\\u0642' ) ;
    public final void rule__Tareek__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1187:1: ( ( '\\u0637\\u0631\\u064A\\u0642' ) )
            // InternalOsolQiraa.g:1188:1: ( '\\u0637\\u0631\\u064A\\u0642' )
            {
            // InternalOsolQiraa.g:1188:1: ( '\\u0637\\u0631\\u064A\\u0642' )
            // InternalOsolQiraa.g:1189:2: '\\u0637\\u0631\\u064A\\u0642'
            {
             before(grammarAccess.getTareekAccess().getArabicLetterTahArabicLetterRehArabicLetterYehArabicLetterQafKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalOsolQiraa.g:1198:1: rule__Tareek__Group__1 : rule__Tareek__Group__1__Impl rule__Tareek__Group__2 ;
    public final void rule__Tareek__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1202:1: ( rule__Tareek__Group__1__Impl rule__Tareek__Group__2 )
            // InternalOsolQiraa.g:1203:2: rule__Tareek__Group__1__Impl rule__Tareek__Group__2
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
    // InternalOsolQiraa.g:1210:1: rule__Tareek__Group__1__Impl : ( '\\u062A\\u0644\\u0627\\u0648\\u0629' ) ;
    public final void rule__Tareek__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1214:1: ( ( '\\u062A\\u0644\\u0627\\u0648\\u0629' ) )
            // InternalOsolQiraa.g:1215:1: ( '\\u062A\\u0644\\u0627\\u0648\\u0629' )
            {
            // InternalOsolQiraa.g:1215:1: ( '\\u062A\\u0644\\u0627\\u0648\\u0629' )
            // InternalOsolQiraa.g:1216:2: '\\u062A\\u0644\\u0627\\u0648\\u0629'
            {
             before(grammarAccess.getTareekAccess().getArabicLetterTehArabicLetterLamArabicLetterAlefArabicLetterWawArabicLetterTehMarbutaKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalOsolQiraa.g:1225:1: rule__Tareek__Group__2 : rule__Tareek__Group__2__Impl rule__Tareek__Group__3 ;
    public final void rule__Tareek__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1229:1: ( rule__Tareek__Group__2__Impl rule__Tareek__Group__3 )
            // InternalOsolQiraa.g:1230:2: rule__Tareek__Group__2__Impl rule__Tareek__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalOsolQiraa.g:1237:1: rule__Tareek__Group__2__Impl : ( ( rule__Tareek__NameAssignment_2 ) ) ;
    public final void rule__Tareek__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1241:1: ( ( ( rule__Tareek__NameAssignment_2 ) ) )
            // InternalOsolQiraa.g:1242:1: ( ( rule__Tareek__NameAssignment_2 ) )
            {
            // InternalOsolQiraa.g:1242:1: ( ( rule__Tareek__NameAssignment_2 ) )
            // InternalOsolQiraa.g:1243:2: ( rule__Tareek__NameAssignment_2 )
            {
             before(grammarAccess.getTareekAccess().getNameAssignment_2()); 
            // InternalOsolQiraa.g:1244:2: ( rule__Tareek__NameAssignment_2 )
            // InternalOsolQiraa.g:1244:3: rule__Tareek__NameAssignment_2
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
    // InternalOsolQiraa.g:1252:1: rule__Tareek__Group__3 : rule__Tareek__Group__3__Impl ;
    public final void rule__Tareek__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1256:1: ( rule__Tareek__Group__3__Impl )
            // InternalOsolQiraa.g:1257:2: rule__Tareek__Group__3__Impl
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
    // InternalOsolQiraa.g:1263:1: rule__Tareek__Group__3__Impl : ( ( rule__Tareek__Alternatives_3 ) ) ;
    public final void rule__Tareek__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1267:1: ( ( ( rule__Tareek__Alternatives_3 ) ) )
            // InternalOsolQiraa.g:1268:1: ( ( rule__Tareek__Alternatives_3 ) )
            {
            // InternalOsolQiraa.g:1268:1: ( ( rule__Tareek__Alternatives_3 ) )
            // InternalOsolQiraa.g:1269:2: ( rule__Tareek__Alternatives_3 )
            {
             before(grammarAccess.getTareekAccess().getAlternatives_3()); 
            // InternalOsolQiraa.g:1270:2: ( rule__Tareek__Alternatives_3 )
            // InternalOsolQiraa.g:1270:3: rule__Tareek__Alternatives_3
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
    // InternalOsolQiraa.g:1279:1: rule__Tareek__Group_3_0__0 : rule__Tareek__Group_3_0__0__Impl rule__Tareek__Group_3_0__1 ;
    public final void rule__Tareek__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1283:1: ( rule__Tareek__Group_3_0__0__Impl rule__Tareek__Group_3_0__1 )
            // InternalOsolQiraa.g:1284:2: rule__Tareek__Group_3_0__0__Impl rule__Tareek__Group_3_0__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalOsolQiraa.g:1291:1: rule__Tareek__Group_3_0__0__Impl : ( ( rule__Tareek__SimpleAssignment_3_0_0 ) ) ;
    public final void rule__Tareek__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1295:1: ( ( ( rule__Tareek__SimpleAssignment_3_0_0 ) ) )
            // InternalOsolQiraa.g:1296:1: ( ( rule__Tareek__SimpleAssignment_3_0_0 ) )
            {
            // InternalOsolQiraa.g:1296:1: ( ( rule__Tareek__SimpleAssignment_3_0_0 ) )
            // InternalOsolQiraa.g:1297:2: ( rule__Tareek__SimpleAssignment_3_0_0 )
            {
             before(grammarAccess.getTareekAccess().getSimpleAssignment_3_0_0()); 
            // InternalOsolQiraa.g:1298:2: ( rule__Tareek__SimpleAssignment_3_0_0 )
            // InternalOsolQiraa.g:1298:3: rule__Tareek__SimpleAssignment_3_0_0
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
    // InternalOsolQiraa.g:1306:1: rule__Tareek__Group_3_0__1 : rule__Tareek__Group_3_0__1__Impl rule__Tareek__Group_3_0__2 ;
    public final void rule__Tareek__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1310:1: ( rule__Tareek__Group_3_0__1__Impl rule__Tareek__Group_3_0__2 )
            // InternalOsolQiraa.g:1311:2: rule__Tareek__Group_3_0__1__Impl rule__Tareek__Group_3_0__2
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
    // InternalOsolQiraa.g:1318:1: rule__Tareek__Group_3_0__1__Impl : ( '\\u0644' ) ;
    public final void rule__Tareek__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1322:1: ( ( '\\u0644' ) )
            // InternalOsolQiraa.g:1323:1: ( '\\u0644' )
            {
            // InternalOsolQiraa.g:1323:1: ( '\\u0644' )
            // InternalOsolQiraa.g:1324:2: '\\u0644'
            {
             before(grammarAccess.getTareekAccess().getArabicLetterLamKeyword_3_0_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalOsolQiraa.g:1333:1: rule__Tareek__Group_3_0__2 : rule__Tareek__Group_3_0__2__Impl ;
    public final void rule__Tareek__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1337:1: ( rule__Tareek__Group_3_0__2__Impl )
            // InternalOsolQiraa.g:1338:2: rule__Tareek__Group_3_0__2__Impl
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
    // InternalOsolQiraa.g:1344:1: rule__Tareek__Group_3_0__2__Impl : ( ( rule__Tareek__RefAssignment_3_0_2 ) ) ;
    public final void rule__Tareek__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1348:1: ( ( ( rule__Tareek__RefAssignment_3_0_2 ) ) )
            // InternalOsolQiraa.g:1349:1: ( ( rule__Tareek__RefAssignment_3_0_2 ) )
            {
            // InternalOsolQiraa.g:1349:1: ( ( rule__Tareek__RefAssignment_3_0_2 ) )
            // InternalOsolQiraa.g:1350:2: ( rule__Tareek__RefAssignment_3_0_2 )
            {
             before(grammarAccess.getTareekAccess().getRefAssignment_3_0_2()); 
            // InternalOsolQiraa.g:1351:2: ( rule__Tareek__RefAssignment_3_0_2 )
            // InternalOsolQiraa.g:1351:3: rule__Tareek__RefAssignment_3_0_2
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
    // InternalOsolQiraa.g:1360:1: rule__Tareek__Group_3_1__0 : rule__Tareek__Group_3_1__0__Impl rule__Tareek__Group_3_1__1 ;
    public final void rule__Tareek__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1364:1: ( rule__Tareek__Group_3_1__0__Impl rule__Tareek__Group_3_1__1 )
            // InternalOsolQiraa.g:1365:2: rule__Tareek__Group_3_1__0__Impl rule__Tareek__Group_3_1__1
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
    // InternalOsolQiraa.g:1372:1: rule__Tareek__Group_3_1__0__Impl : ( ( rule__Tareek__Group_3_1_0__0 ) ) ;
    public final void rule__Tareek__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1376:1: ( ( ( rule__Tareek__Group_3_1_0__0 ) ) )
            // InternalOsolQiraa.g:1377:1: ( ( rule__Tareek__Group_3_1_0__0 ) )
            {
            // InternalOsolQiraa.g:1377:1: ( ( rule__Tareek__Group_3_1_0__0 ) )
            // InternalOsolQiraa.g:1378:2: ( rule__Tareek__Group_3_1_0__0 )
            {
             before(grammarAccess.getTareekAccess().getGroup_3_1_0()); 
            // InternalOsolQiraa.g:1379:2: ( rule__Tareek__Group_3_1_0__0 )
            // InternalOsolQiraa.g:1379:3: rule__Tareek__Group_3_1_0__0
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
    // InternalOsolQiraa.g:1387:1: rule__Tareek__Group_3_1__1 : rule__Tareek__Group_3_1__1__Impl ;
    public final void rule__Tareek__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1391:1: ( rule__Tareek__Group_3_1__1__Impl )
            // InternalOsolQiraa.g:1392:2: rule__Tareek__Group_3_1__1__Impl
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
    // InternalOsolQiraa.g:1398:1: rule__Tareek__Group_3_1__1__Impl : ( ( ( rule__Tareek__RefsAssignment_3_1_1 ) ) ( ( rule__Tareek__RefsAssignment_3_1_1 )* ) ) ;
    public final void rule__Tareek__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1402:1: ( ( ( ( rule__Tareek__RefsAssignment_3_1_1 ) ) ( ( rule__Tareek__RefsAssignment_3_1_1 )* ) ) )
            // InternalOsolQiraa.g:1403:1: ( ( ( rule__Tareek__RefsAssignment_3_1_1 ) ) ( ( rule__Tareek__RefsAssignment_3_1_1 )* ) )
            {
            // InternalOsolQiraa.g:1403:1: ( ( ( rule__Tareek__RefsAssignment_3_1_1 ) ) ( ( rule__Tareek__RefsAssignment_3_1_1 )* ) )
            // InternalOsolQiraa.g:1404:2: ( ( rule__Tareek__RefsAssignment_3_1_1 ) ) ( ( rule__Tareek__RefsAssignment_3_1_1 )* )
            {
            // InternalOsolQiraa.g:1404:2: ( ( rule__Tareek__RefsAssignment_3_1_1 ) )
            // InternalOsolQiraa.g:1405:3: ( rule__Tareek__RefsAssignment_3_1_1 )
            {
             before(grammarAccess.getTareekAccess().getRefsAssignment_3_1_1()); 
            // InternalOsolQiraa.g:1406:3: ( rule__Tareek__RefsAssignment_3_1_1 )
            // InternalOsolQiraa.g:1406:4: rule__Tareek__RefsAssignment_3_1_1
            {
            pushFollow(FOLLOW_13);
            rule__Tareek__RefsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTareekAccess().getRefsAssignment_3_1_1()); 

            }

            // InternalOsolQiraa.g:1409:2: ( ( rule__Tareek__RefsAssignment_3_1_1 )* )
            // InternalOsolQiraa.g:1410:3: ( rule__Tareek__RefsAssignment_3_1_1 )*
            {
             before(grammarAccess.getTareekAccess().getRefsAssignment_3_1_1()); 
            // InternalOsolQiraa.g:1411:3: ( rule__Tareek__RefsAssignment_3_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_KALEMAH) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOsolQiraa.g:1411:4: rule__Tareek__RefsAssignment_3_1_1
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalOsolQiraa.g:1421:1: rule__Tareek__Group_3_1_0__0 : rule__Tareek__Group_3_1_0__0__Impl rule__Tareek__Group_3_1_0__1 ;
    public final void rule__Tareek__Group_3_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1425:1: ( rule__Tareek__Group_3_1_0__0__Impl rule__Tareek__Group_3_1_0__1 )
            // InternalOsolQiraa.g:1426:2: rule__Tareek__Group_3_1_0__0__Impl rule__Tareek__Group_3_1_0__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalOsolQiraa.g:1433:1: rule__Tareek__Group_3_1_0__0__Impl : ( ( rule__Tareek__ComplexAssignment_3_1_0_0 ) ) ;
    public final void rule__Tareek__Group_3_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1437:1: ( ( ( rule__Tareek__ComplexAssignment_3_1_0_0 ) ) )
            // InternalOsolQiraa.g:1438:1: ( ( rule__Tareek__ComplexAssignment_3_1_0_0 ) )
            {
            // InternalOsolQiraa.g:1438:1: ( ( rule__Tareek__ComplexAssignment_3_1_0_0 ) )
            // InternalOsolQiraa.g:1439:2: ( rule__Tareek__ComplexAssignment_3_1_0_0 )
            {
             before(grammarAccess.getTareekAccess().getComplexAssignment_3_1_0_0()); 
            // InternalOsolQiraa.g:1440:2: ( rule__Tareek__ComplexAssignment_3_1_0_0 )
            // InternalOsolQiraa.g:1440:3: rule__Tareek__ComplexAssignment_3_1_0_0
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
    // InternalOsolQiraa.g:1448:1: rule__Tareek__Group_3_1_0__1 : rule__Tareek__Group_3_1_0__1__Impl ;
    public final void rule__Tareek__Group_3_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1452:1: ( rule__Tareek__Group_3_1_0__1__Impl )
            // InternalOsolQiraa.g:1453:2: rule__Tareek__Group_3_1_0__1__Impl
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
    // InternalOsolQiraa.g:1459:1: rule__Tareek__Group_3_1_0__1__Impl : ( '\\u0645\\u0646' ) ;
    public final void rule__Tareek__Group_3_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1463:1: ( ( '\\u0645\\u0646' ) )
            // InternalOsolQiraa.g:1464:1: ( '\\u0645\\u0646' )
            {
            // InternalOsolQiraa.g:1464:1: ( '\\u0645\\u0646' )
            // InternalOsolQiraa.g:1465:2: '\\u0645\\u0646'
            {
             before(grammarAccess.getTareekAccess().getArabicLetterMeemArabicLetterNoonKeyword_3_1_0_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalOsolQiraa.g:1475:1: rule__Kayd__Group__0 : rule__Kayd__Group__0__Impl rule__Kayd__Group__1 ;
    public final void rule__Kayd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1479:1: ( rule__Kayd__Group__0__Impl rule__Kayd__Group__1 )
            // InternalOsolQiraa.g:1480:2: rule__Kayd__Group__0__Impl rule__Kayd__Group__1
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
    // InternalOsolQiraa.g:1487:1: rule__Kayd__Group__0__Impl : ( '\\u0642\\u064A\\u062F' ) ;
    public final void rule__Kayd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1491:1: ( ( '\\u0642\\u064A\\u062F' ) )
            // InternalOsolQiraa.g:1492:1: ( '\\u0642\\u064A\\u062F' )
            {
            // InternalOsolQiraa.g:1492:1: ( '\\u0642\\u064A\\u062F' )
            // InternalOsolQiraa.g:1493:2: '\\u0642\\u064A\\u062F'
            {
             before(grammarAccess.getKaydAccess().getArabicLetterQafArabicLetterYehArabicLetterDalKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalOsolQiraa.g:1502:1: rule__Kayd__Group__1 : rule__Kayd__Group__1__Impl ;
    public final void rule__Kayd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1506:1: ( rule__Kayd__Group__1__Impl )
            // InternalOsolQiraa.g:1507:2: rule__Kayd__Group__1__Impl
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
    // InternalOsolQiraa.g:1513:1: rule__Kayd__Group__1__Impl : ( ( rule__Kayd__NameAssignment_1 ) ) ;
    public final void rule__Kayd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1517:1: ( ( ( rule__Kayd__NameAssignment_1 ) ) )
            // InternalOsolQiraa.g:1518:1: ( ( rule__Kayd__NameAssignment_1 ) )
            {
            // InternalOsolQiraa.g:1518:1: ( ( rule__Kayd__NameAssignment_1 ) )
            // InternalOsolQiraa.g:1519:2: ( rule__Kayd__NameAssignment_1 )
            {
             before(grammarAccess.getKaydAccess().getNameAssignment_1()); 
            // InternalOsolQiraa.g:1520:2: ( rule__Kayd__NameAssignment_1 )
            // InternalOsolQiraa.g:1520:3: rule__Kayd__NameAssignment_1
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
    // InternalOsolQiraa.g:1529:1: rule__Istelah__Group__0 : rule__Istelah__Group__0__Impl rule__Istelah__Group__1 ;
    public final void rule__Istelah__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1533:1: ( rule__Istelah__Group__0__Impl rule__Istelah__Group__1 )
            // InternalOsolQiraa.g:1534:2: rule__Istelah__Group__0__Impl rule__Istelah__Group__1
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
    // InternalOsolQiraa.g:1541:1: rule__Istelah__Group__0__Impl : ( '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ) ;
    public final void rule__Istelah__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1545:1: ( ( '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ) )
            // InternalOsolQiraa.g:1546:1: ( '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' )
            {
            // InternalOsolQiraa.g:1546:1: ( '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' )
            // InternalOsolQiraa.g:1547:2: '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D'
            {
             before(grammarAccess.getIstelahAccess().getArabicLetterAlefArabicLetterSadArabicLetterTahArabicLetterLamArabicLetterAlefArabicLetterHahKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalOsolQiraa.g:1556:1: rule__Istelah__Group__1 : rule__Istelah__Group__1__Impl rule__Istelah__Group__2 ;
    public final void rule__Istelah__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1560:1: ( rule__Istelah__Group__1__Impl rule__Istelah__Group__2 )
            // InternalOsolQiraa.g:1561:2: rule__Istelah__Group__1__Impl rule__Istelah__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalOsolQiraa.g:1568:1: rule__Istelah__Group__1__Impl : ( ( rule__Istelah__NameAssignment_1 ) ) ;
    public final void rule__Istelah__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1572:1: ( ( ( rule__Istelah__NameAssignment_1 ) ) )
            // InternalOsolQiraa.g:1573:1: ( ( rule__Istelah__NameAssignment_1 ) )
            {
            // InternalOsolQiraa.g:1573:1: ( ( rule__Istelah__NameAssignment_1 ) )
            // InternalOsolQiraa.g:1574:2: ( rule__Istelah__NameAssignment_1 )
            {
             before(grammarAccess.getIstelahAccess().getNameAssignment_1()); 
            // InternalOsolQiraa.g:1575:2: ( rule__Istelah__NameAssignment_1 )
            // InternalOsolQiraa.g:1575:3: rule__Istelah__NameAssignment_1
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
    // InternalOsolQiraa.g:1583:1: rule__Istelah__Group__2 : rule__Istelah__Group__2__Impl rule__Istelah__Group__3 ;
    public final void rule__Istelah__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1587:1: ( rule__Istelah__Group__2__Impl rule__Istelah__Group__3 )
            // InternalOsolQiraa.g:1588:2: rule__Istelah__Group__2__Impl rule__Istelah__Group__3
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
    // InternalOsolQiraa.g:1595:1: rule__Istelah__Group__2__Impl : ( '\\u064A\\u0639\\u0646\\u064A' ) ;
    public final void rule__Istelah__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1599:1: ( ( '\\u064A\\u0639\\u0646\\u064A' ) )
            // InternalOsolQiraa.g:1600:1: ( '\\u064A\\u0639\\u0646\\u064A' )
            {
            // InternalOsolQiraa.g:1600:1: ( '\\u064A\\u0639\\u0646\\u064A' )
            // InternalOsolQiraa.g:1601:2: '\\u064A\\u0639\\u0646\\u064A'
            {
             before(grammarAccess.getIstelahAccess().getArabicLetterYehArabicLetterAinArabicLetterNoonArabicLetterYehKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalOsolQiraa.g:1610:1: rule__Istelah__Group__3 : rule__Istelah__Group__3__Impl rule__Istelah__Group__4 ;
    public final void rule__Istelah__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1614:1: ( rule__Istelah__Group__3__Impl rule__Istelah__Group__4 )
            // InternalOsolQiraa.g:1615:2: rule__Istelah__Group__3__Impl rule__Istelah__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalOsolQiraa.g:1622:1: rule__Istelah__Group__3__Impl : ( ( rule__Istelah__RefsAssignment_3 ) ) ;
    public final void rule__Istelah__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1626:1: ( ( ( rule__Istelah__RefsAssignment_3 ) ) )
            // InternalOsolQiraa.g:1627:1: ( ( rule__Istelah__RefsAssignment_3 ) )
            {
            // InternalOsolQiraa.g:1627:1: ( ( rule__Istelah__RefsAssignment_3 ) )
            // InternalOsolQiraa.g:1628:2: ( rule__Istelah__RefsAssignment_3 )
            {
             before(grammarAccess.getIstelahAccess().getRefsAssignment_3()); 
            // InternalOsolQiraa.g:1629:2: ( rule__Istelah__RefsAssignment_3 )
            // InternalOsolQiraa.g:1629:3: rule__Istelah__RefsAssignment_3
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
    // InternalOsolQiraa.g:1637:1: rule__Istelah__Group__4 : rule__Istelah__Group__4__Impl ;
    public final void rule__Istelah__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1641:1: ( rule__Istelah__Group__4__Impl )
            // InternalOsolQiraa.g:1642:2: rule__Istelah__Group__4__Impl
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
    // InternalOsolQiraa.g:1648:1: rule__Istelah__Group__4__Impl : ( ( rule__Istelah__Group_4__0 )* ) ;
    public final void rule__Istelah__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1652:1: ( ( ( rule__Istelah__Group_4__0 )* ) )
            // InternalOsolQiraa.g:1653:1: ( ( rule__Istelah__Group_4__0 )* )
            {
            // InternalOsolQiraa.g:1653:1: ( ( rule__Istelah__Group_4__0 )* )
            // InternalOsolQiraa.g:1654:2: ( rule__Istelah__Group_4__0 )*
            {
             before(grammarAccess.getIstelahAccess().getGroup_4()); 
            // InternalOsolQiraa.g:1655:2: ( rule__Istelah__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==42) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOsolQiraa.g:1655:3: rule__Istelah__Group_4__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Istelah__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalOsolQiraa.g:1664:1: rule__Istelah__Group_4__0 : rule__Istelah__Group_4__0__Impl rule__Istelah__Group_4__1 ;
    public final void rule__Istelah__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1668:1: ( rule__Istelah__Group_4__0__Impl rule__Istelah__Group_4__1 )
            // InternalOsolQiraa.g:1669:2: rule__Istelah__Group_4__0__Impl rule__Istelah__Group_4__1
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
    // InternalOsolQiraa.g:1676:1: rule__Istelah__Group_4__0__Impl : ( '\\u0648' ) ;
    public final void rule__Istelah__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1680:1: ( ( '\\u0648' ) )
            // InternalOsolQiraa.g:1681:1: ( '\\u0648' )
            {
            // InternalOsolQiraa.g:1681:1: ( '\\u0648' )
            // InternalOsolQiraa.g:1682:2: '\\u0648'
            {
             before(grammarAccess.getIstelahAccess().getArabicLetterWawKeyword_4_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalOsolQiraa.g:1691:1: rule__Istelah__Group_4__1 : rule__Istelah__Group_4__1__Impl ;
    public final void rule__Istelah__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1695:1: ( rule__Istelah__Group_4__1__Impl )
            // InternalOsolQiraa.g:1696:2: rule__Istelah__Group_4__1__Impl
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
    // InternalOsolQiraa.g:1702:1: rule__Istelah__Group_4__1__Impl : ( ( rule__Istelah__RefsAssignment_4_1 ) ) ;
    public final void rule__Istelah__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1706:1: ( ( ( rule__Istelah__RefsAssignment_4_1 ) ) )
            // InternalOsolQiraa.g:1707:1: ( ( rule__Istelah__RefsAssignment_4_1 ) )
            {
            // InternalOsolQiraa.g:1707:1: ( ( rule__Istelah__RefsAssignment_4_1 ) )
            // InternalOsolQiraa.g:1708:2: ( rule__Istelah__RefsAssignment_4_1 )
            {
             before(grammarAccess.getIstelahAccess().getRefsAssignment_4_1()); 
            // InternalOsolQiraa.g:1709:2: ( rule__Istelah__RefsAssignment_4_1 )
            // InternalOsolQiraa.g:1709:3: rule__Istelah__RefsAssignment_4_1
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
    // InternalOsolQiraa.g:1718:1: rule__Ramz__Group__0 : rule__Ramz__Group__0__Impl rule__Ramz__Group__1 ;
    public final void rule__Ramz__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1722:1: ( rule__Ramz__Group__0__Impl rule__Ramz__Group__1 )
            // InternalOsolQiraa.g:1723:2: rule__Ramz__Group__0__Impl rule__Ramz__Group__1
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
    // InternalOsolQiraa.g:1730:1: rule__Ramz__Group__0__Impl : ( '\\u0631\\u0645\\u0632' ) ;
    public final void rule__Ramz__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1734:1: ( ( '\\u0631\\u0645\\u0632' ) )
            // InternalOsolQiraa.g:1735:1: ( '\\u0631\\u0645\\u0632' )
            {
            // InternalOsolQiraa.g:1735:1: ( '\\u0631\\u0645\\u0632' )
            // InternalOsolQiraa.g:1736:2: '\\u0631\\u0645\\u0632'
            {
             before(grammarAccess.getRamzAccess().getArabicLetterRehArabicLetterMeemArabicLetterZainKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalOsolQiraa.g:1745:1: rule__Ramz__Group__1 : rule__Ramz__Group__1__Impl rule__Ramz__Group__2 ;
    public final void rule__Ramz__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1749:1: ( rule__Ramz__Group__1__Impl rule__Ramz__Group__2 )
            // InternalOsolQiraa.g:1750:2: rule__Ramz__Group__1__Impl rule__Ramz__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalOsolQiraa.g:1757:1: rule__Ramz__Group__1__Impl : ( ( rule__Ramz__NameAssignment_1 ) ) ;
    public final void rule__Ramz__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1761:1: ( ( ( rule__Ramz__NameAssignment_1 ) ) )
            // InternalOsolQiraa.g:1762:1: ( ( rule__Ramz__NameAssignment_1 ) )
            {
            // InternalOsolQiraa.g:1762:1: ( ( rule__Ramz__NameAssignment_1 ) )
            // InternalOsolQiraa.g:1763:2: ( rule__Ramz__NameAssignment_1 )
            {
             before(grammarAccess.getRamzAccess().getNameAssignment_1()); 
            // InternalOsolQiraa.g:1764:2: ( rule__Ramz__NameAssignment_1 )
            // InternalOsolQiraa.g:1764:3: rule__Ramz__NameAssignment_1
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
    // InternalOsolQiraa.g:1772:1: rule__Ramz__Group__2 : rule__Ramz__Group__2__Impl rule__Ramz__Group__3 ;
    public final void rule__Ramz__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1776:1: ( rule__Ramz__Group__2__Impl rule__Ramz__Group__3 )
            // InternalOsolQiraa.g:1777:2: rule__Ramz__Group__2__Impl rule__Ramz__Group__3
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
    // InternalOsolQiraa.g:1784:1: rule__Ramz__Group__2__Impl : ( '\\u064A\\u0639\\u0646\\u064A' ) ;
    public final void rule__Ramz__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1788:1: ( ( '\\u064A\\u0639\\u0646\\u064A' ) )
            // InternalOsolQiraa.g:1789:1: ( '\\u064A\\u0639\\u0646\\u064A' )
            {
            // InternalOsolQiraa.g:1789:1: ( '\\u064A\\u0639\\u0646\\u064A' )
            // InternalOsolQiraa.g:1790:2: '\\u064A\\u0639\\u0646\\u064A'
            {
             before(grammarAccess.getRamzAccess().getArabicLetterYehArabicLetterAinArabicLetterNoonArabicLetterYehKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalOsolQiraa.g:1799:1: rule__Ramz__Group__3 : rule__Ramz__Group__3__Impl rule__Ramz__Group__4 ;
    public final void rule__Ramz__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1803:1: ( rule__Ramz__Group__3__Impl rule__Ramz__Group__4 )
            // InternalOsolQiraa.g:1804:2: rule__Ramz__Group__3__Impl rule__Ramz__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalOsolQiraa.g:1811:1: rule__Ramz__Group__3__Impl : ( ( rule__Ramz__RefsAssignment_3 ) ) ;
    public final void rule__Ramz__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1815:1: ( ( ( rule__Ramz__RefsAssignment_3 ) ) )
            // InternalOsolQiraa.g:1816:1: ( ( rule__Ramz__RefsAssignment_3 ) )
            {
            // InternalOsolQiraa.g:1816:1: ( ( rule__Ramz__RefsAssignment_3 ) )
            // InternalOsolQiraa.g:1817:2: ( rule__Ramz__RefsAssignment_3 )
            {
             before(grammarAccess.getRamzAccess().getRefsAssignment_3()); 
            // InternalOsolQiraa.g:1818:2: ( rule__Ramz__RefsAssignment_3 )
            // InternalOsolQiraa.g:1818:3: rule__Ramz__RefsAssignment_3
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
    // InternalOsolQiraa.g:1826:1: rule__Ramz__Group__4 : rule__Ramz__Group__4__Impl ;
    public final void rule__Ramz__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1830:1: ( rule__Ramz__Group__4__Impl )
            // InternalOsolQiraa.g:1831:2: rule__Ramz__Group__4__Impl
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
    // InternalOsolQiraa.g:1837:1: rule__Ramz__Group__4__Impl : ( ( rule__Ramz__Group_4__0 )* ) ;
    public final void rule__Ramz__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1841:1: ( ( ( rule__Ramz__Group_4__0 )* ) )
            // InternalOsolQiraa.g:1842:1: ( ( rule__Ramz__Group_4__0 )* )
            {
            // InternalOsolQiraa.g:1842:1: ( ( rule__Ramz__Group_4__0 )* )
            // InternalOsolQiraa.g:1843:2: ( rule__Ramz__Group_4__0 )*
            {
             before(grammarAccess.getRamzAccess().getGroup_4()); 
            // InternalOsolQiraa.g:1844:2: ( rule__Ramz__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==42) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOsolQiraa.g:1844:3: rule__Ramz__Group_4__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Ramz__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalOsolQiraa.g:1853:1: rule__Ramz__Group_4__0 : rule__Ramz__Group_4__0__Impl rule__Ramz__Group_4__1 ;
    public final void rule__Ramz__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1857:1: ( rule__Ramz__Group_4__0__Impl rule__Ramz__Group_4__1 )
            // InternalOsolQiraa.g:1858:2: rule__Ramz__Group_4__0__Impl rule__Ramz__Group_4__1
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
    // InternalOsolQiraa.g:1865:1: rule__Ramz__Group_4__0__Impl : ( '\\u0648' ) ;
    public final void rule__Ramz__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1869:1: ( ( '\\u0648' ) )
            // InternalOsolQiraa.g:1870:1: ( '\\u0648' )
            {
            // InternalOsolQiraa.g:1870:1: ( '\\u0648' )
            // InternalOsolQiraa.g:1871:2: '\\u0648'
            {
             before(grammarAccess.getRamzAccess().getArabicLetterWawKeyword_4_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalOsolQiraa.g:1880:1: rule__Ramz__Group_4__1 : rule__Ramz__Group_4__1__Impl ;
    public final void rule__Ramz__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1884:1: ( rule__Ramz__Group_4__1__Impl )
            // InternalOsolQiraa.g:1885:2: rule__Ramz__Group_4__1__Impl
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
    // InternalOsolQiraa.g:1891:1: rule__Ramz__Group_4__1__Impl : ( ( rule__Ramz__RefsAssignment_4_1 ) ) ;
    public final void rule__Ramz__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1895:1: ( ( ( rule__Ramz__RefsAssignment_4_1 ) ) )
            // InternalOsolQiraa.g:1896:1: ( ( rule__Ramz__RefsAssignment_4_1 ) )
            {
            // InternalOsolQiraa.g:1896:1: ( ( rule__Ramz__RefsAssignment_4_1 ) )
            // InternalOsolQiraa.g:1897:2: ( rule__Ramz__RefsAssignment_4_1 )
            {
             before(grammarAccess.getRamzAccess().getRefsAssignment_4_1()); 
            // InternalOsolQiraa.g:1898:2: ( rule__Ramz__RefsAssignment_4_1 )
            // InternalOsolQiraa.g:1898:3: rule__Ramz__RefsAssignment_4_1
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


    // $ANTLR start "rule__Harf__Group__0"
    // InternalOsolQiraa.g:1907:1: rule__Harf__Group__0 : rule__Harf__Group__0__Impl rule__Harf__Group__1 ;
    public final void rule__Harf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1911:1: ( rule__Harf__Group__0__Impl rule__Harf__Group__1 )
            // InternalOsolQiraa.g:1912:2: rule__Harf__Group__0__Impl rule__Harf__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalOsolQiraa.g:1919:1: rule__Harf__Group__0__Impl : ( '\\u062D\\u0631\\u0641' ) ;
    public final void rule__Harf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1923:1: ( ( '\\u062D\\u0631\\u0641' ) )
            // InternalOsolQiraa.g:1924:1: ( '\\u062D\\u0631\\u0641' )
            {
            // InternalOsolQiraa.g:1924:1: ( '\\u062D\\u0631\\u0641' )
            // InternalOsolQiraa.g:1925:2: '\\u062D\\u0631\\u0641'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterHahArabicLetterRehArabicLetterFehKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalOsolQiraa.g:1934:1: rule__Harf__Group__1 : rule__Harf__Group__1__Impl rule__Harf__Group__2 ;
    public final void rule__Harf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1938:1: ( rule__Harf__Group__1__Impl rule__Harf__Group__2 )
            // InternalOsolQiraa.g:1939:2: rule__Harf__Group__1__Impl rule__Harf__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalOsolQiraa.g:1946:1: rule__Harf__Group__1__Impl : ( ( rule__Harf__NameAssignment_1 ) ) ;
    public final void rule__Harf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1950:1: ( ( ( rule__Harf__NameAssignment_1 ) ) )
            // InternalOsolQiraa.g:1951:1: ( ( rule__Harf__NameAssignment_1 ) )
            {
            // InternalOsolQiraa.g:1951:1: ( ( rule__Harf__NameAssignment_1 ) )
            // InternalOsolQiraa.g:1952:2: ( rule__Harf__NameAssignment_1 )
            {
             before(grammarAccess.getHarfAccess().getNameAssignment_1()); 
            // InternalOsolQiraa.g:1953:2: ( rule__Harf__NameAssignment_1 )
            // InternalOsolQiraa.g:1953:3: rule__Harf__NameAssignment_1
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
    // InternalOsolQiraa.g:1961:1: rule__Harf__Group__2 : rule__Harf__Group__2__Impl ;
    public final void rule__Harf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1965:1: ( rule__Harf__Group__2__Impl )
            // InternalOsolQiraa.g:1966:2: rule__Harf__Group__2__Impl
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
    // InternalOsolQiraa.g:1972:1: rule__Harf__Group__2__Impl : ( ( rule__Harf__Alternatives_2 ) ) ;
    public final void rule__Harf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1976:1: ( ( ( rule__Harf__Alternatives_2 ) ) )
            // InternalOsolQiraa.g:1977:1: ( ( rule__Harf__Alternatives_2 ) )
            {
            // InternalOsolQiraa.g:1977:1: ( ( rule__Harf__Alternatives_2 ) )
            // InternalOsolQiraa.g:1978:2: ( rule__Harf__Alternatives_2 )
            {
             before(grammarAccess.getHarfAccess().getAlternatives_2()); 
            // InternalOsolQiraa.g:1979:2: ( rule__Harf__Alternatives_2 )
            // InternalOsolQiraa.g:1979:3: rule__Harf__Alternatives_2
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
    // InternalOsolQiraa.g:1988:1: rule__Harf__Group_2_0__0 : rule__Harf__Group_2_0__0__Impl rule__Harf__Group_2_0__1 ;
    public final void rule__Harf__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:1992:1: ( rule__Harf__Group_2_0__0__Impl rule__Harf__Group_2_0__1 )
            // InternalOsolQiraa.g:1993:2: rule__Harf__Group_2_0__0__Impl rule__Harf__Group_2_0__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalOsolQiraa.g:2000:1: rule__Harf__Group_2_0__0__Impl : ( '\\u0647\\u0648' ) ;
    public final void rule__Harf__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2004:1: ( ( '\\u0647\\u0648' ) )
            // InternalOsolQiraa.g:2005:1: ( '\\u0647\\u0648' )
            {
            // InternalOsolQiraa.g:2005:1: ( '\\u0647\\u0648' )
            // InternalOsolQiraa.g:2006:2: '\\u0647\\u0648'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterHehArabicLetterWawKeyword_2_0_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalOsolQiraa.g:2015:1: rule__Harf__Group_2_0__1 : rule__Harf__Group_2_0__1__Impl rule__Harf__Group_2_0__2 ;
    public final void rule__Harf__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2019:1: ( rule__Harf__Group_2_0__1__Impl rule__Harf__Group_2_0__2 )
            // InternalOsolQiraa.g:2020:2: rule__Harf__Group_2_0__1__Impl rule__Harf__Group_2_0__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalOsolQiraa.g:2027:1: rule__Harf__Group_2_0__1__Impl : ( ( rule__Harf__ValuesAssignment_2_0_1 ) ) ;
    public final void rule__Harf__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2031:1: ( ( ( rule__Harf__ValuesAssignment_2_0_1 ) ) )
            // InternalOsolQiraa.g:2032:1: ( ( rule__Harf__ValuesAssignment_2_0_1 ) )
            {
            // InternalOsolQiraa.g:2032:1: ( ( rule__Harf__ValuesAssignment_2_0_1 ) )
            // InternalOsolQiraa.g:2033:2: ( rule__Harf__ValuesAssignment_2_0_1 )
            {
             before(grammarAccess.getHarfAccess().getValuesAssignment_2_0_1()); 
            // InternalOsolQiraa.g:2034:2: ( rule__Harf__ValuesAssignment_2_0_1 )
            // InternalOsolQiraa.g:2034:3: rule__Harf__ValuesAssignment_2_0_1
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
    // InternalOsolQiraa.g:2042:1: rule__Harf__Group_2_0__2 : rule__Harf__Group_2_0__2__Impl ;
    public final void rule__Harf__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2046:1: ( rule__Harf__Group_2_0__2__Impl )
            // InternalOsolQiraa.g:2047:2: rule__Harf__Group_2_0__2__Impl
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
    // InternalOsolQiraa.g:2053:1: rule__Harf__Group_2_0__2__Impl : ( ( rule__Harf__Group_2_0_2__0 )* ) ;
    public final void rule__Harf__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2057:1: ( ( ( rule__Harf__Group_2_0_2__0 )* ) )
            // InternalOsolQiraa.g:2058:1: ( ( rule__Harf__Group_2_0_2__0 )* )
            {
            // InternalOsolQiraa.g:2058:1: ( ( rule__Harf__Group_2_0_2__0 )* )
            // InternalOsolQiraa.g:2059:2: ( rule__Harf__Group_2_0_2__0 )*
            {
             before(grammarAccess.getHarfAccess().getGroup_2_0_2()); 
            // InternalOsolQiraa.g:2060:2: ( rule__Harf__Group_2_0_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==46) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalOsolQiraa.g:2060:3: rule__Harf__Group_2_0_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Harf__Group_2_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalOsolQiraa.g:2069:1: rule__Harf__Group_2_0_2__0 : rule__Harf__Group_2_0_2__0__Impl rule__Harf__Group_2_0_2__1 ;
    public final void rule__Harf__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2073:1: ( rule__Harf__Group_2_0_2__0__Impl rule__Harf__Group_2_0_2__1 )
            // InternalOsolQiraa.g:2074:2: rule__Harf__Group_2_0_2__0__Impl rule__Harf__Group_2_0_2__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalOsolQiraa.g:2081:1: rule__Harf__Group_2_0_2__0__Impl : ( '\\u0623\\u0648' ) ;
    public final void rule__Harf__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2085:1: ( ( '\\u0623\\u0648' ) )
            // InternalOsolQiraa.g:2086:1: ( '\\u0623\\u0648' )
            {
            // InternalOsolQiraa.g:2086:1: ( '\\u0623\\u0648' )
            // InternalOsolQiraa.g:2087:2: '\\u0623\\u0648'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterAlefWithHamzaAboveArabicLetterWawKeyword_2_0_2_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalOsolQiraa.g:2096:1: rule__Harf__Group_2_0_2__1 : rule__Harf__Group_2_0_2__1__Impl ;
    public final void rule__Harf__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2100:1: ( rule__Harf__Group_2_0_2__1__Impl )
            // InternalOsolQiraa.g:2101:2: rule__Harf__Group_2_0_2__1__Impl
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
    // InternalOsolQiraa.g:2107:1: rule__Harf__Group_2_0_2__1__Impl : ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) ) ;
    public final void rule__Harf__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2111:1: ( ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) ) )
            // InternalOsolQiraa.g:2112:1: ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) )
            {
            // InternalOsolQiraa.g:2112:1: ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) )
            // InternalOsolQiraa.g:2113:2: ( rule__Harf__ValuesAssignment_2_0_2_1 )
            {
             before(grammarAccess.getHarfAccess().getValuesAssignment_2_0_2_1()); 
            // InternalOsolQiraa.g:2114:2: ( rule__Harf__ValuesAssignment_2_0_2_1 )
            // InternalOsolQiraa.g:2114:3: rule__Harf__ValuesAssignment_2_0_2_1
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
    // InternalOsolQiraa.g:2123:1: rule__Harf__Group_2_1__0 : rule__Harf__Group_2_1__0__Impl rule__Harf__Group_2_1__1 ;
    public final void rule__Harf__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2127:1: ( rule__Harf__Group_2_1__0__Impl rule__Harf__Group_2_1__1 )
            // InternalOsolQiraa.g:2128:2: rule__Harf__Group_2_1__0__Impl rule__Harf__Group_2_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalOsolQiraa.g:2135:1: rule__Harf__Group_2_1__0__Impl : ( '\\u0630\\u0627\\u062A\\u0647' ) ;
    public final void rule__Harf__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2139:1: ( ( '\\u0630\\u0627\\u062A\\u0647' ) )
            // InternalOsolQiraa.g:2140:1: ( '\\u0630\\u0627\\u062A\\u0647' )
            {
            // InternalOsolQiraa.g:2140:1: ( '\\u0630\\u0627\\u062A\\u0647' )
            // InternalOsolQiraa.g:2141:2: '\\u0630\\u0627\\u062A\\u0647'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterThalArabicLetterAlefArabicLetterTehArabicLetterHehKeyword_2_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalOsolQiraa.g:2150:1: rule__Harf__Group_2_1__1 : rule__Harf__Group_2_1__1__Impl ;
    public final void rule__Harf__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2154:1: ( rule__Harf__Group_2_1__1__Impl )
            // InternalOsolQiraa.g:2155:2: rule__Harf__Group_2_1__1__Impl
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
    // InternalOsolQiraa.g:2161:1: rule__Harf__Group_2_1__1__Impl : ( ( rule__Harf__RefAssignment_2_1_1 ) ) ;
    public final void rule__Harf__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2165:1: ( ( ( rule__Harf__RefAssignment_2_1_1 ) ) )
            // InternalOsolQiraa.g:2166:1: ( ( rule__Harf__RefAssignment_2_1_1 ) )
            {
            // InternalOsolQiraa.g:2166:1: ( ( rule__Harf__RefAssignment_2_1_1 ) )
            // InternalOsolQiraa.g:2167:2: ( rule__Harf__RefAssignment_2_1_1 )
            {
             before(grammarAccess.getHarfAccess().getRefAssignment_2_1_1()); 
            // InternalOsolQiraa.g:2168:2: ( rule__Harf__RefAssignment_2_1_1 )
            // InternalOsolQiraa.g:2168:3: rule__Harf__RefAssignment_2_1_1
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
    // InternalOsolQiraa.g:2177:1: rule__Harakah__Group__0 : rule__Harakah__Group__0__Impl rule__Harakah__Group__1 ;
    public final void rule__Harakah__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2181:1: ( rule__Harakah__Group__0__Impl rule__Harakah__Group__1 )
            // InternalOsolQiraa.g:2182:2: rule__Harakah__Group__0__Impl rule__Harakah__Group__1
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
    // InternalOsolQiraa.g:2189:1: rule__Harakah__Group__0__Impl : ( '\\u062D\\u0631\\u0643\\u0629' ) ;
    public final void rule__Harakah__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2193:1: ( ( '\\u062D\\u0631\\u0643\\u0629' ) )
            // InternalOsolQiraa.g:2194:1: ( '\\u062D\\u0631\\u0643\\u0629' )
            {
            // InternalOsolQiraa.g:2194:1: ( '\\u062D\\u0631\\u0643\\u0629' )
            // InternalOsolQiraa.g:2195:2: '\\u062D\\u0631\\u0643\\u0629'
            {
             before(grammarAccess.getHarakahAccess().getArabicLetterHahArabicLetterRehArabicLetterKafArabicLetterTehMarbutaKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalOsolQiraa.g:2204:1: rule__Harakah__Group__1 : rule__Harakah__Group__1__Impl rule__Harakah__Group__2 ;
    public final void rule__Harakah__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2208:1: ( rule__Harakah__Group__1__Impl rule__Harakah__Group__2 )
            // InternalOsolQiraa.g:2209:2: rule__Harakah__Group__1__Impl rule__Harakah__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalOsolQiraa.g:2216:1: rule__Harakah__Group__1__Impl : ( ( rule__Harakah__NameAssignment_1 ) ) ;
    public final void rule__Harakah__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2220:1: ( ( ( rule__Harakah__NameAssignment_1 ) ) )
            // InternalOsolQiraa.g:2221:1: ( ( rule__Harakah__NameAssignment_1 ) )
            {
            // InternalOsolQiraa.g:2221:1: ( ( rule__Harakah__NameAssignment_1 ) )
            // InternalOsolQiraa.g:2222:2: ( rule__Harakah__NameAssignment_1 )
            {
             before(grammarAccess.getHarakahAccess().getNameAssignment_1()); 
            // InternalOsolQiraa.g:2223:2: ( rule__Harakah__NameAssignment_1 )
            // InternalOsolQiraa.g:2223:3: rule__Harakah__NameAssignment_1
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
    // InternalOsolQiraa.g:2231:1: rule__Harakah__Group__2 : rule__Harakah__Group__2__Impl rule__Harakah__Group__3 ;
    public final void rule__Harakah__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2235:1: ( rule__Harakah__Group__2__Impl rule__Harakah__Group__3 )
            // InternalOsolQiraa.g:2236:2: rule__Harakah__Group__2__Impl rule__Harakah__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalOsolQiraa.g:2243:1: rule__Harakah__Group__2__Impl : ( '\\u0647\\u064A' ) ;
    public final void rule__Harakah__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2247:1: ( ( '\\u0647\\u064A' ) )
            // InternalOsolQiraa.g:2248:1: ( '\\u0647\\u064A' )
            {
            // InternalOsolQiraa.g:2248:1: ( '\\u0647\\u064A' )
            // InternalOsolQiraa.g:2249:2: '\\u0647\\u064A'
            {
             before(grammarAccess.getHarakahAccess().getArabicLetterHehArabicLetterYehKeyword_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalOsolQiraa.g:2258:1: rule__Harakah__Group__3 : rule__Harakah__Group__3__Impl ;
    public final void rule__Harakah__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2262:1: ( rule__Harakah__Group__3__Impl )
            // InternalOsolQiraa.g:2263:2: rule__Harakah__Group__3__Impl
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
    // InternalOsolQiraa.g:2269:1: rule__Harakah__Group__3__Impl : ( ( rule__Harakah__ValueAssignment_3 ) ) ;
    public final void rule__Harakah__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2273:1: ( ( ( rule__Harakah__ValueAssignment_3 ) ) )
            // InternalOsolQiraa.g:2274:1: ( ( rule__Harakah__ValueAssignment_3 ) )
            {
            // InternalOsolQiraa.g:2274:1: ( ( rule__Harakah__ValueAssignment_3 ) )
            // InternalOsolQiraa.g:2275:2: ( rule__Harakah__ValueAssignment_3 )
            {
             before(grammarAccess.getHarakahAccess().getValueAssignment_3()); 
            // InternalOsolQiraa.g:2276:2: ( rule__Harakah__ValueAssignment_3 )
            // InternalOsolQiraa.g:2276:3: rule__Harakah__ValueAssignment_3
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
    // InternalOsolQiraa.g:2285:1: rule__AyahStart__Group__0 : rule__AyahStart__Group__0__Impl rule__AyahStart__Group__1 ;
    public final void rule__AyahStart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2289:1: ( rule__AyahStart__Group__0__Impl rule__AyahStart__Group__1 )
            // InternalOsolQiraa.g:2290:2: rule__AyahStart__Group__0__Impl rule__AyahStart__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalOsolQiraa.g:2297:1: rule__AyahStart__Group__0__Impl : ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ) ;
    public final void rule__AyahStart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2301:1: ( ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ) )
            // InternalOsolQiraa.g:2302:1: ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' )
            {
            // InternalOsolQiraa.g:2302:1: ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' )
            // InternalOsolQiraa.g:2303:2: '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'
            {
             before(grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterSeenArabicLetterWawArabicLetterRehArabicLetterTehMarbutaKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalOsolQiraa.g:2312:1: rule__AyahStart__Group__1 : rule__AyahStart__Group__1__Impl rule__AyahStart__Group__2 ;
    public final void rule__AyahStart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2316:1: ( rule__AyahStart__Group__1__Impl rule__AyahStart__Group__2 )
            // InternalOsolQiraa.g:2317:2: rule__AyahStart__Group__1__Impl rule__AyahStart__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalOsolQiraa.g:2324:1: rule__AyahStart__Group__1__Impl : ( ( rule__AyahStart__SurahAssignment_1 ) ) ;
    public final void rule__AyahStart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2328:1: ( ( ( rule__AyahStart__SurahAssignment_1 ) ) )
            // InternalOsolQiraa.g:2329:1: ( ( rule__AyahStart__SurahAssignment_1 ) )
            {
            // InternalOsolQiraa.g:2329:1: ( ( rule__AyahStart__SurahAssignment_1 ) )
            // InternalOsolQiraa.g:2330:2: ( rule__AyahStart__SurahAssignment_1 )
            {
             before(grammarAccess.getAyahStartAccess().getSurahAssignment_1()); 
            // InternalOsolQiraa.g:2331:2: ( rule__AyahStart__SurahAssignment_1 )
            // InternalOsolQiraa.g:2331:3: rule__AyahStart__SurahAssignment_1
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
    // InternalOsolQiraa.g:2339:1: rule__AyahStart__Group__2 : rule__AyahStart__Group__2__Impl rule__AyahStart__Group__3 ;
    public final void rule__AyahStart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2343:1: ( rule__AyahStart__Group__2__Impl rule__AyahStart__Group__3 )
            // InternalOsolQiraa.g:2344:2: rule__AyahStart__Group__2__Impl rule__AyahStart__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalOsolQiraa.g:2351:1: rule__AyahStart__Group__2__Impl : ( '\\u0627\\u0644\\u0622\\u064A\\u0629' ) ;
    public final void rule__AyahStart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2355:1: ( ( '\\u0627\\u0644\\u0622\\u064A\\u0629' ) )
            // InternalOsolQiraa.g:2356:1: ( '\\u0627\\u0644\\u0622\\u064A\\u0629' )
            {
            // InternalOsolQiraa.g:2356:1: ( '\\u0627\\u0644\\u0622\\u064A\\u0629' )
            // InternalOsolQiraa.g:2357:2: '\\u0627\\u0644\\u0622\\u064A\\u0629'
            {
             before(grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithMaddaAboveArabicLetterYehArabicLetterTehMarbutaKeyword_2()); 
            match(input,51,FOLLOW_2); 
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
    // InternalOsolQiraa.g:2366:1: rule__AyahStart__Group__3 : rule__AyahStart__Group__3__Impl rule__AyahStart__Group__4 ;
    public final void rule__AyahStart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2370:1: ( rule__AyahStart__Group__3__Impl rule__AyahStart__Group__4 )
            // InternalOsolQiraa.g:2371:2: rule__AyahStart__Group__3__Impl rule__AyahStart__Group__4
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
    // InternalOsolQiraa.g:2378:1: rule__AyahStart__Group__3__Impl : ( ( rule__AyahStart__AyahAssignment_3 ) ) ;
    public final void rule__AyahStart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2382:1: ( ( ( rule__AyahStart__AyahAssignment_3 ) ) )
            // InternalOsolQiraa.g:2383:1: ( ( rule__AyahStart__AyahAssignment_3 ) )
            {
            // InternalOsolQiraa.g:2383:1: ( ( rule__AyahStart__AyahAssignment_3 ) )
            // InternalOsolQiraa.g:2384:2: ( rule__AyahStart__AyahAssignment_3 )
            {
             before(grammarAccess.getAyahStartAccess().getAyahAssignment_3()); 
            // InternalOsolQiraa.g:2385:2: ( rule__AyahStart__AyahAssignment_3 )
            // InternalOsolQiraa.g:2385:3: rule__AyahStart__AyahAssignment_3
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
    // InternalOsolQiraa.g:2393:1: rule__AyahStart__Group__4 : rule__AyahStart__Group__4__Impl ;
    public final void rule__AyahStart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2397:1: ( rule__AyahStart__Group__4__Impl )
            // InternalOsolQiraa.g:2398:2: rule__AyahStart__Group__4__Impl
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
    // InternalOsolQiraa.g:2404:1: rule__AyahStart__Group__4__Impl : ( ( rule__AyahStart__NameAssignment_4 ) ) ;
    public final void rule__AyahStart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2408:1: ( ( ( rule__AyahStart__NameAssignment_4 ) ) )
            // InternalOsolQiraa.g:2409:1: ( ( rule__AyahStart__NameAssignment_4 ) )
            {
            // InternalOsolQiraa.g:2409:1: ( ( rule__AyahStart__NameAssignment_4 ) )
            // InternalOsolQiraa.g:2410:2: ( rule__AyahStart__NameAssignment_4 )
            {
             before(grammarAccess.getAyahStartAccess().getNameAssignment_4()); 
            // InternalOsolQiraa.g:2411:2: ( rule__AyahStart__NameAssignment_4 )
            // InternalOsolQiraa.g:2411:3: rule__AyahStart__NameAssignment_4
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
    // InternalOsolQiraa.g:2420:1: rule__Phrase__Group__0 : rule__Phrase__Group__0__Impl rule__Phrase__Group__1 ;
    public final void rule__Phrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2424:1: ( rule__Phrase__Group__0__Impl rule__Phrase__Group__1 )
            // InternalOsolQiraa.g:2425:2: rule__Phrase__Group__0__Impl rule__Phrase__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalOsolQiraa.g:2432:1: rule__Phrase__Group__0__Impl : ( ( rule__Phrase__BasmalahAssignment_0 )? ) ;
    public final void rule__Phrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2436:1: ( ( ( rule__Phrase__BasmalahAssignment_0 )? ) )
            // InternalOsolQiraa.g:2437:1: ( ( rule__Phrase__BasmalahAssignment_0 )? )
            {
            // InternalOsolQiraa.g:2437:1: ( ( rule__Phrase__BasmalahAssignment_0 )? )
            // InternalOsolQiraa.g:2438:2: ( rule__Phrase__BasmalahAssignment_0 )?
            {
             before(grammarAccess.getPhraseAccess().getBasmalahAssignment_0()); 
            // InternalOsolQiraa.g:2439:2: ( rule__Phrase__BasmalahAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_BASMALAH) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOsolQiraa.g:2439:3: rule__Phrase__BasmalahAssignment_0
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
    // InternalOsolQiraa.g:2447:1: rule__Phrase__Group__1 : rule__Phrase__Group__1__Impl ;
    public final void rule__Phrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2451:1: ( rule__Phrase__Group__1__Impl )
            // InternalOsolQiraa.g:2452:2: rule__Phrase__Group__1__Impl
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
    // InternalOsolQiraa.g:2458:1: rule__Phrase__Group__1__Impl : ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) ) ;
    public final void rule__Phrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2462:1: ( ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) ) )
            // InternalOsolQiraa.g:2463:1: ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) )
            {
            // InternalOsolQiraa.g:2463:1: ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) )
            // InternalOsolQiraa.g:2464:2: ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* )
            {
            // InternalOsolQiraa.g:2464:2: ( ( rule__Phrase__WordsAssignment_1 ) )
            // InternalOsolQiraa.g:2465:3: ( rule__Phrase__WordsAssignment_1 )
            {
             before(grammarAccess.getPhraseAccess().getWordsAssignment_1()); 
            // InternalOsolQiraa.g:2466:3: ( rule__Phrase__WordsAssignment_1 )
            // InternalOsolQiraa.g:2466:4: rule__Phrase__WordsAssignment_1
            {
            pushFollow(FOLLOW_24);
            rule__Phrase__WordsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getWordsAssignment_1()); 

            }

            // InternalOsolQiraa.g:2469:2: ( ( rule__Phrase__WordsAssignment_1 )* )
            // InternalOsolQiraa.g:2470:3: ( rule__Phrase__WordsAssignment_1 )*
            {
             before(grammarAccess.getPhraseAccess().getWordsAssignment_1()); 
            // InternalOsolQiraa.g:2471:3: ( rule__Phrase__WordsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_AWORD) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOsolQiraa.g:2471:4: rule__Phrase__WordsAssignment_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Phrase__WordsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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


    // $ANTLR start "rule__OsolQiraaModel__QoraaAssignment_0"
    // InternalOsolQiraa.g:2481:1: rule__OsolQiraaModel__QoraaAssignment_0 : ( ruleQaree ) ;
    public final void rule__OsolQiraaModel__QoraaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2485:1: ( ( ruleQaree ) )
            // InternalOsolQiraa.g:2486:2: ( ruleQaree )
            {
            // InternalOsolQiraa.g:2486:2: ( ruleQaree )
            // InternalOsolQiraa.g:2487:3: ruleQaree
            {
             before(grammarAccess.getOsolQiraaModelAccess().getQoraaQareeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQaree();

            state._fsp--;

             after(grammarAccess.getOsolQiraaModelAccess().getQoraaQareeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OsolQiraaModel__QoraaAssignment_0"


    // $ANTLR start "rule__OsolQiraaModel__TorokAssignment_1"
    // InternalOsolQiraa.g:2496:1: rule__OsolQiraaModel__TorokAssignment_1 : ( ruleTareek ) ;
    public final void rule__OsolQiraaModel__TorokAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2500:1: ( ( ruleTareek ) )
            // InternalOsolQiraa.g:2501:2: ( ruleTareek )
            {
            // InternalOsolQiraa.g:2501:2: ( ruleTareek )
            // InternalOsolQiraa.g:2502:3: ruleTareek
            {
             before(grammarAccess.getOsolQiraaModelAccess().getTorokTareekParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTareek();

            state._fsp--;

             after(grammarAccess.getOsolQiraaModelAccess().getTorokTareekParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OsolQiraaModel__TorokAssignment_1"


    // $ANTLR start "rule__OsolQiraaModel__RowatAssignment_2"
    // InternalOsolQiraa.g:2511:1: rule__OsolQiraaModel__RowatAssignment_2 : ( ruleRawee ) ;
    public final void rule__OsolQiraaModel__RowatAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2515:1: ( ( ruleRawee ) )
            // InternalOsolQiraa.g:2516:2: ( ruleRawee )
            {
            // InternalOsolQiraa.g:2516:2: ( ruleRawee )
            // InternalOsolQiraa.g:2517:3: ruleRawee
            {
             before(grammarAccess.getOsolQiraaModelAccess().getRowatRaweeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRawee();

            state._fsp--;

             after(grammarAccess.getOsolQiraaModelAccess().getRowatRaweeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OsolQiraaModel__RowatAssignment_2"


    // $ANTLR start "rule__OsolQiraaModel__ImamsAssignment_3"
    // InternalOsolQiraa.g:2526:1: rule__OsolQiraaModel__ImamsAssignment_3 : ( ruleIMAM ) ;
    public final void rule__OsolQiraaModel__ImamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2530:1: ( ( ruleIMAM ) )
            // InternalOsolQiraa.g:2531:2: ( ruleIMAM )
            {
            // InternalOsolQiraa.g:2531:2: ( ruleIMAM )
            // InternalOsolQiraa.g:2532:3: ruleIMAM
            {
             before(grammarAccess.getOsolQiraaModelAccess().getImamsIMAMParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIMAM();

            state._fsp--;

             after(grammarAccess.getOsolQiraaModelAccess().getImamsIMAMParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OsolQiraaModel__ImamsAssignment_3"


    // $ANTLR start "rule__OsolQiraaModel__IstelahatAssignment_4"
    // InternalOsolQiraa.g:2541:1: rule__OsolQiraaModel__IstelahatAssignment_4 : ( ruleIstelah ) ;
    public final void rule__OsolQiraaModel__IstelahatAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2545:1: ( ( ruleIstelah ) )
            // InternalOsolQiraa.g:2546:2: ( ruleIstelah )
            {
            // InternalOsolQiraa.g:2546:2: ( ruleIstelah )
            // InternalOsolQiraa.g:2547:3: ruleIstelah
            {
             before(grammarAccess.getOsolQiraaModelAccess().getIstelahatIstelahParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleIstelah();

            state._fsp--;

             after(grammarAccess.getOsolQiraaModelAccess().getIstelahatIstelahParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OsolQiraaModel__IstelahatAssignment_4"


    // $ANTLR start "rule__OsolQiraaModel__KoyodAssignment_5"
    // InternalOsolQiraa.g:2556:1: rule__OsolQiraaModel__KoyodAssignment_5 : ( ruleKayd ) ;
    public final void rule__OsolQiraaModel__KoyodAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2560:1: ( ( ruleKayd ) )
            // InternalOsolQiraa.g:2561:2: ( ruleKayd )
            {
            // InternalOsolQiraa.g:2561:2: ( ruleKayd )
            // InternalOsolQiraa.g:2562:3: ruleKayd
            {
             before(grammarAccess.getOsolQiraaModelAccess().getKoyodKaydParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleKayd();

            state._fsp--;

             after(grammarAccess.getOsolQiraaModelAccess().getKoyodKaydParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OsolQiraaModel__KoyodAssignment_5"


    // $ANTLR start "rule__Person__NameAssignment_0"
    // InternalOsolQiraa.g:2571:1: rule__Person__NameAssignment_0 : ( RULE_KALEMAH ) ;
    public final void rule__Person__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2575:1: ( ( RULE_KALEMAH ) )
            // InternalOsolQiraa.g:2576:2: ( RULE_KALEMAH )
            {
            // InternalOsolQiraa.g:2576:2: ( RULE_KALEMAH )
            // InternalOsolQiraa.g:2577:3: RULE_KALEMAH
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
    // InternalOsolQiraa.g:2586:1: rule__Person__EsmAssignment_1_1 : ( RULE_KALEMAH ) ;
    public final void rule__Person__EsmAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2590:1: ( ( RULE_KALEMAH ) )
            // InternalOsolQiraa.g:2591:2: ( RULE_KALEMAH )
            {
            // InternalOsolQiraa.g:2591:2: ( RULE_KALEMAH )
            // InternalOsolQiraa.g:2592:3: RULE_KALEMAH
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
    // InternalOsolQiraa.g:2601:1: rule__Person__LakabAssignment_2_1 : ( RULE_KALEMAH ) ;
    public final void rule__Person__LakabAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2605:1: ( ( RULE_KALEMAH ) )
            // InternalOsolQiraa.g:2606:2: ( RULE_KALEMAH )
            {
            // InternalOsolQiraa.g:2606:2: ( RULE_KALEMAH )
            // InternalOsolQiraa.g:2607:3: RULE_KALEMAH
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
    // InternalOsolQiraa.g:2616:1: rule__Person__TowofiaAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Person__TowofiaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2620:1: ( ( RULE_INT ) )
            // InternalOsolQiraa.g:2621:2: ( RULE_INT )
            {
            // InternalOsolQiraa.g:2621:2: ( RULE_INT )
            // InternalOsolQiraa.g:2622:3: RULE_INT
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
    // InternalOsolQiraa.g:2631:1: rule__Douaa__DAssignment_0 : ( ( rule__Douaa__DAlternatives_0_0 ) ) ;
    public final void rule__Douaa__DAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2635:1: ( ( ( rule__Douaa__DAlternatives_0_0 ) ) )
            // InternalOsolQiraa.g:2636:2: ( ( rule__Douaa__DAlternatives_0_0 ) )
            {
            // InternalOsolQiraa.g:2636:2: ( ( rule__Douaa__DAlternatives_0_0 ) )
            // InternalOsolQiraa.g:2637:3: ( rule__Douaa__DAlternatives_0_0 )
            {
             before(grammarAccess.getDouaaAccess().getDAlternatives_0_0()); 
            // InternalOsolQiraa.g:2638:3: ( rule__Douaa__DAlternatives_0_0 )
            // InternalOsolQiraa.g:2638:4: rule__Douaa__DAlternatives_0_0
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
    // InternalOsolQiraa.g:2646:1: rule__Rawee__QareeAssignment_3 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Rawee__QareeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2650:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalOsolQiraa.g:2651:2: ( ( RULE_KALEMAH ) )
            {
            // InternalOsolQiraa.g:2651:2: ( ( RULE_KALEMAH ) )
            // InternalOsolQiraa.g:2652:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getRaweeAccess().getQareeQareeCrossReference_3_0()); 
            // InternalOsolQiraa.g:2653:3: ( RULE_KALEMAH )
            // InternalOsolQiraa.g:2654:4: RULE_KALEMAH
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
    // InternalOsolQiraa.g:2665:1: rule__Tareek__NameAssignment_2 : ( RULE_KALEMAH ) ;
    public final void rule__Tareek__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2669:1: ( ( RULE_KALEMAH ) )
            // InternalOsolQiraa.g:2670:2: ( RULE_KALEMAH )
            {
            // InternalOsolQiraa.g:2670:2: ( RULE_KALEMAH )
            // InternalOsolQiraa.g:2671:3: RULE_KALEMAH
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
    // InternalOsolQiraa.g:2680:1: rule__Tareek__SimpleAssignment_3_0_0 : ( ( '\\u062E\\u0627\\u0644\\u0635' ) ) ;
    public final void rule__Tareek__SimpleAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2684:1: ( ( ( '\\u062E\\u0627\\u0644\\u0635' ) ) )
            // InternalOsolQiraa.g:2685:2: ( ( '\\u062E\\u0627\\u0644\\u0635' ) )
            {
            // InternalOsolQiraa.g:2685:2: ( ( '\\u062E\\u0627\\u0644\\u0635' ) )
            // InternalOsolQiraa.g:2686:3: ( '\\u062E\\u0627\\u0644\\u0635' )
            {
             before(grammarAccess.getTareekAccess().getSimpleArabicLetterKhahArabicLetterAlefArabicLetterLamArabicLetterSadKeyword_3_0_0_0()); 
            // InternalOsolQiraa.g:2687:3: ( '\\u062E\\u0627\\u0644\\u0635' )
            // InternalOsolQiraa.g:2688:4: '\\u062E\\u0627\\u0644\\u0635'
            {
             before(grammarAccess.getTareekAccess().getSimpleArabicLetterKhahArabicLetterAlefArabicLetterLamArabicLetterSadKeyword_3_0_0_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalOsolQiraa.g:2699:1: rule__Tareek__RefAssignment_3_0_2 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Tareek__RefAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2703:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalOsolQiraa.g:2704:2: ( ( RULE_KALEMAH ) )
            {
            // InternalOsolQiraa.g:2704:2: ( ( RULE_KALEMAH ) )
            // InternalOsolQiraa.g:2705:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getTareekAccess().getRefYokraaLahCrossReference_3_0_2_0()); 
            // InternalOsolQiraa.g:2706:3: ( RULE_KALEMAH )
            // InternalOsolQiraa.g:2707:4: RULE_KALEMAH
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
    // InternalOsolQiraa.g:2718:1: rule__Tareek__ComplexAssignment_3_1_0_0 : ( ( '\\u0645\\u0631\\u0643\\u0628' ) ) ;
    public final void rule__Tareek__ComplexAssignment_3_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2722:1: ( ( ( '\\u0645\\u0631\\u0643\\u0628' ) ) )
            // InternalOsolQiraa.g:2723:2: ( ( '\\u0645\\u0631\\u0643\\u0628' ) )
            {
            // InternalOsolQiraa.g:2723:2: ( ( '\\u0645\\u0631\\u0643\\u0628' ) )
            // InternalOsolQiraa.g:2724:3: ( '\\u0645\\u0631\\u0643\\u0628' )
            {
             before(grammarAccess.getTareekAccess().getComplexArabicLetterMeemArabicLetterRehArabicLetterKafArabicLetterBehKeyword_3_1_0_0_0()); 
            // InternalOsolQiraa.g:2725:3: ( '\\u0645\\u0631\\u0643\\u0628' )
            // InternalOsolQiraa.g:2726:4: '\\u0645\\u0631\\u0643\\u0628'
            {
             before(grammarAccess.getTareekAccess().getComplexArabicLetterMeemArabicLetterRehArabicLetterKafArabicLetterBehKeyword_3_1_0_0_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalOsolQiraa.g:2737:1: rule__Tareek__RefsAssignment_3_1_1 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Tareek__RefsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2741:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalOsolQiraa.g:2742:2: ( ( RULE_KALEMAH ) )
            {
            // InternalOsolQiraa.g:2742:2: ( ( RULE_KALEMAH ) )
            // InternalOsolQiraa.g:2743:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getTareekAccess().getRefsTareekCrossReference_3_1_1_0()); 
            // InternalOsolQiraa.g:2744:3: ( RULE_KALEMAH )
            // InternalOsolQiraa.g:2745:4: RULE_KALEMAH
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
    // InternalOsolQiraa.g:2756:1: rule__Kayd__NameAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Kayd__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2760:1: ( ( RULE_KALEMAH ) )
            // InternalOsolQiraa.g:2761:2: ( RULE_KALEMAH )
            {
            // InternalOsolQiraa.g:2761:2: ( RULE_KALEMAH )
            // InternalOsolQiraa.g:2762:3: RULE_KALEMAH
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
    // InternalOsolQiraa.g:2771:1: rule__Istelah__NameAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Istelah__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2775:1: ( ( RULE_KALEMAH ) )
            // InternalOsolQiraa.g:2776:2: ( RULE_KALEMAH )
            {
            // InternalOsolQiraa.g:2776:2: ( RULE_KALEMAH )
            // InternalOsolQiraa.g:2777:3: RULE_KALEMAH
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
    // InternalOsolQiraa.g:2786:1: rule__Istelah__RefsAssignment_3 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Istelah__RefsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2790:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalOsolQiraa.g:2791:2: ( ( RULE_KALEMAH ) )
            {
            // InternalOsolQiraa.g:2791:2: ( ( RULE_KALEMAH ) )
            // InternalOsolQiraa.g:2792:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getIstelahAccess().getRefsYokraaLahCrossReference_3_0()); 
            // InternalOsolQiraa.g:2793:3: ( RULE_KALEMAH )
            // InternalOsolQiraa.g:2794:4: RULE_KALEMAH
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
    // InternalOsolQiraa.g:2805:1: rule__Istelah__RefsAssignment_4_1 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Istelah__RefsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2809:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalOsolQiraa.g:2810:2: ( ( RULE_KALEMAH ) )
            {
            // InternalOsolQiraa.g:2810:2: ( ( RULE_KALEMAH ) )
            // InternalOsolQiraa.g:2811:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getIstelahAccess().getRefsYokraaLahCrossReference_4_1_0()); 
            // InternalOsolQiraa.g:2812:3: ( RULE_KALEMAH )
            // InternalOsolQiraa.g:2813:4: RULE_KALEMAH
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
    // InternalOsolQiraa.g:2824:1: rule__Ramz__NameAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Ramz__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2828:1: ( ( RULE_KALEMAH ) )
            // InternalOsolQiraa.g:2829:2: ( RULE_KALEMAH )
            {
            // InternalOsolQiraa.g:2829:2: ( RULE_KALEMAH )
            // InternalOsolQiraa.g:2830:3: RULE_KALEMAH
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
    // InternalOsolQiraa.g:2839:1: rule__Ramz__RefsAssignment_3 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Ramz__RefsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2843:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalOsolQiraa.g:2844:2: ( ( RULE_KALEMAH ) )
            {
            // InternalOsolQiraa.g:2844:2: ( ( RULE_KALEMAH ) )
            // InternalOsolQiraa.g:2845:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getRamzAccess().getRefsYokraaLahCrossReference_3_0()); 
            // InternalOsolQiraa.g:2846:3: ( RULE_KALEMAH )
            // InternalOsolQiraa.g:2847:4: RULE_KALEMAH
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
    // InternalOsolQiraa.g:2858:1: rule__Ramz__RefsAssignment_4_1 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Ramz__RefsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2862:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalOsolQiraa.g:2863:2: ( ( RULE_KALEMAH ) )
            {
            // InternalOsolQiraa.g:2863:2: ( ( RULE_KALEMAH ) )
            // InternalOsolQiraa.g:2864:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getRamzAccess().getRefsYokraaLahCrossReference_4_1_0()); 
            // InternalOsolQiraa.g:2865:3: ( RULE_KALEMAH )
            // InternalOsolQiraa.g:2866:4: RULE_KALEMAH
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


    // $ANTLR start "rule__Harf__NameAssignment_1"
    // InternalOsolQiraa.g:2877:1: rule__Harf__NameAssignment_1 : ( RULE_AWORD ) ;
    public final void rule__Harf__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2881:1: ( ( RULE_AWORD ) )
            // InternalOsolQiraa.g:2882:2: ( RULE_AWORD )
            {
            // InternalOsolQiraa.g:2882:2: ( RULE_AWORD )
            // InternalOsolQiraa.g:2883:3: RULE_AWORD
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
    // InternalOsolQiraa.g:2892:1: rule__Harf__ValuesAssignment_2_0_1 : ( RULE_AWORD ) ;
    public final void rule__Harf__ValuesAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2896:1: ( ( RULE_AWORD ) )
            // InternalOsolQiraa.g:2897:2: ( RULE_AWORD )
            {
            // InternalOsolQiraa.g:2897:2: ( RULE_AWORD )
            // InternalOsolQiraa.g:2898:3: RULE_AWORD
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
    // InternalOsolQiraa.g:2907:1: rule__Harf__ValuesAssignment_2_0_2_1 : ( RULE_AWORD ) ;
    public final void rule__Harf__ValuesAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2911:1: ( ( RULE_AWORD ) )
            // InternalOsolQiraa.g:2912:2: ( RULE_AWORD )
            {
            // InternalOsolQiraa.g:2912:2: ( RULE_AWORD )
            // InternalOsolQiraa.g:2913:3: RULE_AWORD
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
    // InternalOsolQiraa.g:2922:1: rule__Harf__RefAssignment_2_1_1 : ( ( RULE_AWORD ) ) ;
    public final void rule__Harf__RefAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2926:1: ( ( ( RULE_AWORD ) ) )
            // InternalOsolQiraa.g:2927:2: ( ( RULE_AWORD ) )
            {
            // InternalOsolQiraa.g:2927:2: ( ( RULE_AWORD ) )
            // InternalOsolQiraa.g:2928:3: ( RULE_AWORD )
            {
             before(grammarAccess.getHarfAccess().getRefHarfCrossReference_2_1_1_0()); 
            // InternalOsolQiraa.g:2929:3: ( RULE_AWORD )
            // InternalOsolQiraa.g:2930:4: RULE_AWORD
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
    // InternalOsolQiraa.g:2941:1: rule__Harakah__NameAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Harakah__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2945:1: ( ( RULE_KALEMAH ) )
            // InternalOsolQiraa.g:2946:2: ( RULE_KALEMAH )
            {
            // InternalOsolQiraa.g:2946:2: ( RULE_KALEMAH )
            // InternalOsolQiraa.g:2947:3: RULE_KALEMAH
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
    // InternalOsolQiraa.g:2956:1: rule__Harakah__ValueAssignment_3 : ( RULE_AWORD ) ;
    public final void rule__Harakah__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2960:1: ( ( RULE_AWORD ) )
            // InternalOsolQiraa.g:2961:2: ( RULE_AWORD )
            {
            // InternalOsolQiraa.g:2961:2: ( RULE_AWORD )
            // InternalOsolQiraa.g:2962:3: RULE_AWORD
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
    // InternalOsolQiraa.g:2971:1: rule__AyahStart__SurahAssignment_1 : ( RULE_INT ) ;
    public final void rule__AyahStart__SurahAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2975:1: ( ( RULE_INT ) )
            // InternalOsolQiraa.g:2976:2: ( RULE_INT )
            {
            // InternalOsolQiraa.g:2976:2: ( RULE_INT )
            // InternalOsolQiraa.g:2977:3: RULE_INT
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
    // InternalOsolQiraa.g:2986:1: rule__AyahStart__AyahAssignment_3 : ( RULE_INT ) ;
    public final void rule__AyahStart__AyahAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:2990:1: ( ( RULE_INT ) )
            // InternalOsolQiraa.g:2991:2: ( RULE_INT )
            {
            // InternalOsolQiraa.g:2991:2: ( RULE_INT )
            // InternalOsolQiraa.g:2992:3: RULE_INT
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
    // InternalOsolQiraa.g:3001:1: rule__AyahStart__NameAssignment_4 : ( RULE_KALEMAH ) ;
    public final void rule__AyahStart__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:3005:1: ( ( RULE_KALEMAH ) )
            // InternalOsolQiraa.g:3006:2: ( RULE_KALEMAH )
            {
            // InternalOsolQiraa.g:3006:2: ( RULE_KALEMAH )
            // InternalOsolQiraa.g:3007:3: RULE_KALEMAH
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
    // InternalOsolQiraa.g:3016:1: rule__Phrase__BasmalahAssignment_0 : ( RULE_BASMALAH ) ;
    public final void rule__Phrase__BasmalahAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:3020:1: ( ( RULE_BASMALAH ) )
            // InternalOsolQiraa.g:3021:2: ( RULE_BASMALAH )
            {
            // InternalOsolQiraa.g:3021:2: ( RULE_BASMALAH )
            // InternalOsolQiraa.g:3022:3: RULE_BASMALAH
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
    // InternalOsolQiraa.g:3031:1: rule__Phrase__WordsAssignment_1 : ( RULE_AWORD ) ;
    public final void rule__Phrase__WordsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOsolQiraa.g:3035:1: ( ( RULE_AWORD ) )
            // InternalOsolQiraa.g:3036:2: ( RULE_AWORD )
            {
            // InternalOsolQiraa.g:3036:2: ( RULE_AWORD )
            // InternalOsolQiraa.g:3037:3: RULE_AWORD
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000018B80000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000042L});

}