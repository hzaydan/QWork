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
import org.qwork.services.MatnGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMatnParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_AWORD", "RULE_BASMALAH", "RULE_INT", "RULE_KALEMAH", "RULE_ALETTER", "RULE_AHARAKAH", "RULE_ATANWEEN", "RULE_ASHADDAH", "RULE_ALIGATURES", "RULE_ADIGIT", "RULE_ANONLETTER", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\u0631\\u062D\\u0645\\u0647'", "'\\u0623\\u0643\\u0631\\u0645\\u0647'", "'\\u0627\\u0644\\u0623\\u0648\\u0644'", "'\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A'", "'\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B'", "'\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631'", "'*'", "'('", "')'", "'-'", "'...'", "'\\u0627\\u0633\\u0645\\u0647'", "'\\u0644\\u0642\\u0628\\u0647'", "'\\u062A\\u0648\\u0641\\u064A'", "'\\u0627\\u0644\\u0644\\u0647'", "'\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645'", "'\\u0642\\u0627\\u0631\\u0626'", "'\\u0631\\u0627\\u0648'", "'\\u0639\\u0646'", "'\\u0637\\u0631\\u064A\\u0642'", "'\\u062A\\u0644\\u0627\\u0648\\u0629'", "'\\u0644'", "'\\u0645\\u0646'", "'\\u0642\\u064A\\u062F'", "'\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D'", "'\\u064A\\u0639\\u0646\\u064A'", "'\\u0648'", "'\\u0631\\u0645\\u0632'", "'\\u062D\\u0631\\u0641'", "'\\u0647\\u0648'", "'\\u0623\\u0648'", "'\\u0630\\u0627\\u062A\\u0647'", "'\\u062D\\u0631\\u0643\\u0629'", "'\\u0647\\u064A'", "'\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'", "'\\u0627\\u0644\\u0622\\u064A\\u0629'", "'\\u062E\\u0627\\u0644\\u0635'", "'\\u0645\\u0631\\u0643\\u0628'"
    };
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
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int RULE_AWORD=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__21=21;
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


        public InternalMatnParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMatnParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMatnParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMatn.g"; }


    	private MatnGrammarAccess grammarAccess;

    	public void setGrammarAccess(MatnGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMatnModel"
    // InternalMatn.g:53:1: entryRuleMatnModel : ruleMatnModel EOF ;
    public final void entryRuleMatnModel() throws RecognitionException {
        try {
            // InternalMatn.g:54:1: ( ruleMatnModel EOF )
            // InternalMatn.g:55:1: ruleMatnModel EOF
            {
             before(grammarAccess.getMatnModelRule()); 
            pushFollow(FOLLOW_1);
            ruleMatnModel();

            state._fsp--;

             after(grammarAccess.getMatnModelRule()); 
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
    // $ANTLR end "entryRuleMatnModel"


    // $ANTLR start "ruleMatnModel"
    // InternalMatn.g:62:1: ruleMatnModel : ( ( rule__MatnModel__MatnAssignment ) ) ;
    public final void ruleMatnModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:66:2: ( ( ( rule__MatnModel__MatnAssignment ) ) )
            // InternalMatn.g:67:2: ( ( rule__MatnModel__MatnAssignment ) )
            {
            // InternalMatn.g:67:2: ( ( rule__MatnModel__MatnAssignment ) )
            // InternalMatn.g:68:3: ( rule__MatnModel__MatnAssignment )
            {
             before(grammarAccess.getMatnModelAccess().getMatnAssignment()); 
            // InternalMatn.g:69:3: ( rule__MatnModel__MatnAssignment )
            // InternalMatn.g:69:4: rule__MatnModel__MatnAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MatnModel__MatnAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMatnModelAccess().getMatnAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatnModel"


    // $ANTLR start "entryRuleMatn"
    // InternalMatn.g:78:1: entryRuleMatn : ruleMatn EOF ;
    public final void entryRuleMatn() throws RecognitionException {
        try {
            // InternalMatn.g:79:1: ( ruleMatn EOF )
            // InternalMatn.g:80:1: ruleMatn EOF
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
    // InternalMatn.g:87:1: ruleMatn : ( ( rule__Matn__Group__0 ) ) ;
    public final void ruleMatn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:91:2: ( ( ( rule__Matn__Group__0 ) ) )
            // InternalMatn.g:92:2: ( ( rule__Matn__Group__0 ) )
            {
            // InternalMatn.g:92:2: ( ( rule__Matn__Group__0 ) )
            // InternalMatn.g:93:3: ( rule__Matn__Group__0 )
            {
             before(grammarAccess.getMatnAccess().getGroup()); 
            // InternalMatn.g:94:3: ( rule__Matn__Group__0 )
            // InternalMatn.g:94:4: rule__Matn__Group__0
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
    // InternalMatn.g:103:1: entryRuleMaktah : ruleMaktah EOF ;
    public final void entryRuleMaktah() throws RecognitionException {
        try {
            // InternalMatn.g:104:1: ( ruleMaktah EOF )
            // InternalMatn.g:105:1: ruleMaktah EOF
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
    // InternalMatn.g:112:1: ruleMaktah : ( ( rule__Maktah__Group__0 ) ) ;
    public final void ruleMaktah() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:116:2: ( ( ( rule__Maktah__Group__0 ) ) )
            // InternalMatn.g:117:2: ( ( rule__Maktah__Group__0 ) )
            {
            // InternalMatn.g:117:2: ( ( rule__Maktah__Group__0 ) )
            // InternalMatn.g:118:3: ( rule__Maktah__Group__0 )
            {
             before(grammarAccess.getMaktahAccess().getGroup()); 
            // InternalMatn.g:119:3: ( rule__Maktah__Group__0 )
            // InternalMatn.g:119:4: rule__Maktah__Group__0
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
    // InternalMatn.g:128:1: entryRuleBayt : ruleBayt EOF ;
    public final void entryRuleBayt() throws RecognitionException {
        try {
            // InternalMatn.g:129:1: ( ruleBayt EOF )
            // InternalMatn.g:130:1: ruleBayt EOF
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
    // InternalMatn.g:137:1: ruleBayt : ( ( rule__Bayt__Group__0 ) ) ;
    public final void ruleBayt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:141:2: ( ( ( rule__Bayt__Group__0 ) ) )
            // InternalMatn.g:142:2: ( ( rule__Bayt__Group__0 ) )
            {
            // InternalMatn.g:142:2: ( ( rule__Bayt__Group__0 ) )
            // InternalMatn.g:143:3: ( rule__Bayt__Group__0 )
            {
             before(grammarAccess.getBaytAccess().getGroup()); 
            // InternalMatn.g:144:3: ( rule__Bayt__Group__0 )
            // InternalMatn.g:144:4: rule__Bayt__Group__0
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
    // InternalMatn.g:153:1: entryRuleAWORDS : ruleAWORDS EOF ;
    public final void entryRuleAWORDS() throws RecognitionException {
        try {
            // InternalMatn.g:154:1: ( ruleAWORDS EOF )
            // InternalMatn.g:155:1: ruleAWORDS EOF
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
    // InternalMatn.g:162:1: ruleAWORDS : ( ( ( RULE_AWORD ) ) ( ( RULE_AWORD )* ) ) ;
    public final void ruleAWORDS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:166:2: ( ( ( ( RULE_AWORD ) ) ( ( RULE_AWORD )* ) ) )
            // InternalMatn.g:167:2: ( ( ( RULE_AWORD ) ) ( ( RULE_AWORD )* ) )
            {
            // InternalMatn.g:167:2: ( ( ( RULE_AWORD ) ) ( ( RULE_AWORD )* ) )
            // InternalMatn.g:168:3: ( ( RULE_AWORD ) ) ( ( RULE_AWORD )* )
            {
            // InternalMatn.g:168:3: ( ( RULE_AWORD ) )
            // InternalMatn.g:169:4: ( RULE_AWORD )
            {
             before(grammarAccess.getAWORDSAccess().getAWORDTerminalRuleCall()); 
            // InternalMatn.g:170:4: ( RULE_AWORD )
            // InternalMatn.g:170:5: RULE_AWORD
            {
            match(input,RULE_AWORD,FOLLOW_3); 

            }

             after(grammarAccess.getAWORDSAccess().getAWORDTerminalRuleCall()); 

            }

            // InternalMatn.g:173:3: ( ( RULE_AWORD )* )
            // InternalMatn.g:174:4: ( RULE_AWORD )*
            {
             before(grammarAccess.getAWORDSAccess().getAWORDTerminalRuleCall()); 
            // InternalMatn.g:175:4: ( RULE_AWORD )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_AWORD) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMatn.g:175:5: RULE_AWORD
            	    {
            	    match(input,RULE_AWORD,FOLLOW_3); 

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalMatn.g:186:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:190:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalMatn.g:191:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalMatn.g:191:2: ( ( rule__Person__Group__0 ) )
            // InternalMatn.g:192:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalMatn.g:193:3: ( rule__Person__Group__0 )
            // InternalMatn.g:193:4: rule__Person__Group__0
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
    // InternalMatn.g:203:1: ruleDouaa : ( ( rule__Douaa__Group__0 ) ) ;
    public final void ruleDouaa() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:207:2: ( ( ( rule__Douaa__Group__0 ) ) )
            // InternalMatn.g:208:2: ( ( rule__Douaa__Group__0 ) )
            {
            // InternalMatn.g:208:2: ( ( rule__Douaa__Group__0 ) )
            // InternalMatn.g:209:3: ( rule__Douaa__Group__0 )
            {
             before(grammarAccess.getDouaaAccess().getGroup()); 
            // InternalMatn.g:210:3: ( rule__Douaa__Group__0 )
            // InternalMatn.g:210:4: rule__Douaa__Group__0
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
    // InternalMatn.g:219:1: entryRuleIMAM : ruleIMAM EOF ;
    public final void entryRuleIMAM() throws RecognitionException {
        try {
            // InternalMatn.g:220:1: ( ruleIMAM EOF )
            // InternalMatn.g:221:1: ruleIMAM EOF
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
    // InternalMatn.g:228:1: ruleIMAM : ( ( rule__IMAM__Group__0 ) ) ;
    public final void ruleIMAM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:232:2: ( ( ( rule__IMAM__Group__0 ) ) )
            // InternalMatn.g:233:2: ( ( rule__IMAM__Group__0 ) )
            {
            // InternalMatn.g:233:2: ( ( rule__IMAM__Group__0 ) )
            // InternalMatn.g:234:3: ( rule__IMAM__Group__0 )
            {
             before(grammarAccess.getIMAMAccess().getGroup()); 
            // InternalMatn.g:235:3: ( rule__IMAM__Group__0 )
            // InternalMatn.g:235:4: rule__IMAM__Group__0
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
    // InternalMatn.g:244:1: entryRuleQaree : ruleQaree EOF ;
    public final void entryRuleQaree() throws RecognitionException {
        try {
            // InternalMatn.g:245:1: ( ruleQaree EOF )
            // InternalMatn.g:246:1: ruleQaree EOF
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
    // InternalMatn.g:253:1: ruleQaree : ( ( rule__Qaree__Group__0 ) ) ;
    public final void ruleQaree() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:257:2: ( ( ( rule__Qaree__Group__0 ) ) )
            // InternalMatn.g:258:2: ( ( rule__Qaree__Group__0 ) )
            {
            // InternalMatn.g:258:2: ( ( rule__Qaree__Group__0 ) )
            // InternalMatn.g:259:3: ( rule__Qaree__Group__0 )
            {
             before(grammarAccess.getQareeAccess().getGroup()); 
            // InternalMatn.g:260:3: ( rule__Qaree__Group__0 )
            // InternalMatn.g:260:4: rule__Qaree__Group__0
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
    // InternalMatn.g:269:1: entryRuleRawee : ruleRawee EOF ;
    public final void entryRuleRawee() throws RecognitionException {
        try {
            // InternalMatn.g:270:1: ( ruleRawee EOF )
            // InternalMatn.g:271:1: ruleRawee EOF
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
    // InternalMatn.g:278:1: ruleRawee : ( ( rule__Rawee__Group__0 ) ) ;
    public final void ruleRawee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:282:2: ( ( ( rule__Rawee__Group__0 ) ) )
            // InternalMatn.g:283:2: ( ( rule__Rawee__Group__0 ) )
            {
            // InternalMatn.g:283:2: ( ( rule__Rawee__Group__0 ) )
            // InternalMatn.g:284:3: ( rule__Rawee__Group__0 )
            {
             before(grammarAccess.getRaweeAccess().getGroup()); 
            // InternalMatn.g:285:3: ( rule__Rawee__Group__0 )
            // InternalMatn.g:285:4: rule__Rawee__Group__0
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
    // InternalMatn.g:294:1: entryRuleYokraaLah : ruleYokraaLah EOF ;
    public final void entryRuleYokraaLah() throws RecognitionException {
        try {
            // InternalMatn.g:295:1: ( ruleYokraaLah EOF )
            // InternalMatn.g:296:1: ruleYokraaLah EOF
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
    // InternalMatn.g:303:1: ruleYokraaLah : ( ( rule__YokraaLah__Alternatives ) ) ;
    public final void ruleYokraaLah() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:307:2: ( ( ( rule__YokraaLah__Alternatives ) ) )
            // InternalMatn.g:308:2: ( ( rule__YokraaLah__Alternatives ) )
            {
            // InternalMatn.g:308:2: ( ( rule__YokraaLah__Alternatives ) )
            // InternalMatn.g:309:3: ( rule__YokraaLah__Alternatives )
            {
             before(grammarAccess.getYokraaLahAccess().getAlternatives()); 
            // InternalMatn.g:310:3: ( rule__YokraaLah__Alternatives )
            // InternalMatn.g:310:4: rule__YokraaLah__Alternatives
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
    // InternalMatn.g:319:1: entryRuleTareek : ruleTareek EOF ;
    public final void entryRuleTareek() throws RecognitionException {
        try {
            // InternalMatn.g:320:1: ( ruleTareek EOF )
            // InternalMatn.g:321:1: ruleTareek EOF
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
    // InternalMatn.g:328:1: ruleTareek : ( ( rule__Tareek__Group__0 ) ) ;
    public final void ruleTareek() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:332:2: ( ( ( rule__Tareek__Group__0 ) ) )
            // InternalMatn.g:333:2: ( ( rule__Tareek__Group__0 ) )
            {
            // InternalMatn.g:333:2: ( ( rule__Tareek__Group__0 ) )
            // InternalMatn.g:334:3: ( rule__Tareek__Group__0 )
            {
             before(grammarAccess.getTareekAccess().getGroup()); 
            // InternalMatn.g:335:3: ( rule__Tareek__Group__0 )
            // InternalMatn.g:335:4: rule__Tareek__Group__0
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
    // InternalMatn.g:344:1: entryRuleKayd : ruleKayd EOF ;
    public final void entryRuleKayd() throws RecognitionException {
        try {
            // InternalMatn.g:345:1: ( ruleKayd EOF )
            // InternalMatn.g:346:1: ruleKayd EOF
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
    // InternalMatn.g:353:1: ruleKayd : ( ( rule__Kayd__Group__0 ) ) ;
    public final void ruleKayd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:357:2: ( ( ( rule__Kayd__Group__0 ) ) )
            // InternalMatn.g:358:2: ( ( rule__Kayd__Group__0 ) )
            {
            // InternalMatn.g:358:2: ( ( rule__Kayd__Group__0 ) )
            // InternalMatn.g:359:3: ( rule__Kayd__Group__0 )
            {
             before(grammarAccess.getKaydAccess().getGroup()); 
            // InternalMatn.g:360:3: ( rule__Kayd__Group__0 )
            // InternalMatn.g:360:4: rule__Kayd__Group__0
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
    // InternalMatn.g:369:1: entryRuleIstelah : ruleIstelah EOF ;
    public final void entryRuleIstelah() throws RecognitionException {
        try {
            // InternalMatn.g:370:1: ( ruleIstelah EOF )
            // InternalMatn.g:371:1: ruleIstelah EOF
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
    // InternalMatn.g:378:1: ruleIstelah : ( ( rule__Istelah__Group__0 ) ) ;
    public final void ruleIstelah() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:382:2: ( ( ( rule__Istelah__Group__0 ) ) )
            // InternalMatn.g:383:2: ( ( rule__Istelah__Group__0 ) )
            {
            // InternalMatn.g:383:2: ( ( rule__Istelah__Group__0 ) )
            // InternalMatn.g:384:3: ( rule__Istelah__Group__0 )
            {
             before(grammarAccess.getIstelahAccess().getGroup()); 
            // InternalMatn.g:385:3: ( rule__Istelah__Group__0 )
            // InternalMatn.g:385:4: rule__Istelah__Group__0
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
    // InternalMatn.g:394:1: entryRuleRamz : ruleRamz EOF ;
    public final void entryRuleRamz() throws RecognitionException {
        try {
            // InternalMatn.g:395:1: ( ruleRamz EOF )
            // InternalMatn.g:396:1: ruleRamz EOF
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
    // InternalMatn.g:403:1: ruleRamz : ( ( rule__Ramz__Group__0 ) ) ;
    public final void ruleRamz() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:407:2: ( ( ( rule__Ramz__Group__0 ) ) )
            // InternalMatn.g:408:2: ( ( rule__Ramz__Group__0 ) )
            {
            // InternalMatn.g:408:2: ( ( rule__Ramz__Group__0 ) )
            // InternalMatn.g:409:3: ( rule__Ramz__Group__0 )
            {
             before(grammarAccess.getRamzAccess().getGroup()); 
            // InternalMatn.g:410:3: ( rule__Ramz__Group__0 )
            // InternalMatn.g:410:4: rule__Ramz__Group__0
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
    // InternalMatn.g:419:1: entryRuleMawdee : ruleMawdee EOF ;
    public final void entryRuleMawdee() throws RecognitionException {
        try {
            // InternalMatn.g:420:1: ( ruleMawdee EOF )
            // InternalMatn.g:421:1: ruleMawdee EOF
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
    // InternalMatn.g:428:1: ruleMawdee : ( ( rule__Mawdee__Alternatives ) ) ;
    public final void ruleMawdee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:432:2: ( ( ( rule__Mawdee__Alternatives ) ) )
            // InternalMatn.g:433:2: ( ( rule__Mawdee__Alternatives ) )
            {
            // InternalMatn.g:433:2: ( ( rule__Mawdee__Alternatives ) )
            // InternalMatn.g:434:3: ( rule__Mawdee__Alternatives )
            {
             before(grammarAccess.getMawdeeAccess().getAlternatives()); 
            // InternalMatn.g:435:3: ( rule__Mawdee__Alternatives )
            // InternalMatn.g:435:4: rule__Mawdee__Alternatives
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
    // InternalMatn.g:444:1: entryRuleHarf : ruleHarf EOF ;
    public final void entryRuleHarf() throws RecognitionException {
        try {
            // InternalMatn.g:445:1: ( ruleHarf EOF )
            // InternalMatn.g:446:1: ruleHarf EOF
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
    // InternalMatn.g:453:1: ruleHarf : ( ( rule__Harf__Group__0 ) ) ;
    public final void ruleHarf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:457:2: ( ( ( rule__Harf__Group__0 ) ) )
            // InternalMatn.g:458:2: ( ( rule__Harf__Group__0 ) )
            {
            // InternalMatn.g:458:2: ( ( rule__Harf__Group__0 ) )
            // InternalMatn.g:459:3: ( rule__Harf__Group__0 )
            {
             before(grammarAccess.getHarfAccess().getGroup()); 
            // InternalMatn.g:460:3: ( rule__Harf__Group__0 )
            // InternalMatn.g:460:4: rule__Harf__Group__0
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
    // InternalMatn.g:469:1: entryRuleHarakah : ruleHarakah EOF ;
    public final void entryRuleHarakah() throws RecognitionException {
        try {
            // InternalMatn.g:470:1: ( ruleHarakah EOF )
            // InternalMatn.g:471:1: ruleHarakah EOF
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
    // InternalMatn.g:478:1: ruleHarakah : ( ( rule__Harakah__Group__0 ) ) ;
    public final void ruleHarakah() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:482:2: ( ( ( rule__Harakah__Group__0 ) ) )
            // InternalMatn.g:483:2: ( ( rule__Harakah__Group__0 ) )
            {
            // InternalMatn.g:483:2: ( ( rule__Harakah__Group__0 ) )
            // InternalMatn.g:484:3: ( rule__Harakah__Group__0 )
            {
             before(grammarAccess.getHarakahAccess().getGroup()); 
            // InternalMatn.g:485:3: ( rule__Harakah__Group__0 )
            // InternalMatn.g:485:4: rule__Harakah__Group__0
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
    // InternalMatn.g:494:1: entryRuleAyahStart : ruleAyahStart EOF ;
    public final void entryRuleAyahStart() throws RecognitionException {
        try {
            // InternalMatn.g:495:1: ( ruleAyahStart EOF )
            // InternalMatn.g:496:1: ruleAyahStart EOF
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
    // InternalMatn.g:503:1: ruleAyahStart : ( ( rule__AyahStart__Group__0 ) ) ;
    public final void ruleAyahStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:507:2: ( ( ( rule__AyahStart__Group__0 ) ) )
            // InternalMatn.g:508:2: ( ( rule__AyahStart__Group__0 ) )
            {
            // InternalMatn.g:508:2: ( ( rule__AyahStart__Group__0 ) )
            // InternalMatn.g:509:3: ( rule__AyahStart__Group__0 )
            {
             before(grammarAccess.getAyahStartAccess().getGroup()); 
            // InternalMatn.g:510:3: ( rule__AyahStart__Group__0 )
            // InternalMatn.g:510:4: rule__AyahStart__Group__0
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
    // InternalMatn.g:519:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // InternalMatn.g:520:1: ( rulePhrase EOF )
            // InternalMatn.g:521:1: rulePhrase EOF
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
    // InternalMatn.g:528:1: rulePhrase : ( ( rule__Phrase__Group__0 ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:532:2: ( ( ( rule__Phrase__Group__0 ) ) )
            // InternalMatn.g:533:2: ( ( rule__Phrase__Group__0 ) )
            {
            // InternalMatn.g:533:2: ( ( rule__Phrase__Group__0 ) )
            // InternalMatn.g:534:3: ( rule__Phrase__Group__0 )
            {
             before(grammarAccess.getPhraseAccess().getGroup()); 
            // InternalMatn.g:535:3: ( rule__Phrase__Group__0 )
            // InternalMatn.g:535:4: rule__Phrase__Group__0
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
    // InternalMatn.g:543:1: rule__Douaa__DAlternatives_0_0 : ( ( '\\u0631\\u062D\\u0645\\u0647' ) | ( '\\u0623\\u0643\\u0631\\u0645\\u0647' ) );
    public final void rule__Douaa__DAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:547:1: ( ( '\\u0631\\u062D\\u0645\\u0647' ) | ( '\\u0623\\u0643\\u0631\\u0645\\u0647' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMatn.g:548:2: ( '\\u0631\\u062D\\u0645\\u0647' )
                    {
                    // InternalMatn.g:548:2: ( '\\u0631\\u062D\\u0645\\u0647' )
                    // InternalMatn.g:549:3: '\\u0631\\u062D\\u0645\\u0647'
                    {
                     before(grammarAccess.getDouaaAccess().getDArabicLetterRehArabicLetterHahArabicLetterMeemArabicLetterHehKeyword_0_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getDouaaAccess().getDArabicLetterRehArabicLetterHahArabicLetterMeemArabicLetterHehKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMatn.g:554:2: ( '\\u0623\\u0643\\u0631\\u0645\\u0647' )
                    {
                    // InternalMatn.g:554:2: ( '\\u0623\\u0643\\u0631\\u0645\\u0647' )
                    // InternalMatn.g:555:3: '\\u0623\\u0643\\u0631\\u0645\\u0647'
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
    // InternalMatn.g:564:1: rule__YokraaLah__Alternatives : ( ( ruleQaree ) | ( ruleRawee ) | ( ruleIstelah ) );
    public final void rule__YokraaLah__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:568:1: ( ( ruleQaree ) | ( ruleRawee ) | ( ruleIstelah ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt3=1;
                }
                break;
            case 38:
                {
                alt3=2;
                }
                break;
            case 45:
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
                    // InternalMatn.g:569:2: ( ruleQaree )
                    {
                    // InternalMatn.g:569:2: ( ruleQaree )
                    // InternalMatn.g:570:3: ruleQaree
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
                    // InternalMatn.g:575:2: ( ruleRawee )
                    {
                    // InternalMatn.g:575:2: ( ruleRawee )
                    // InternalMatn.g:576:3: ruleRawee
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
                    // InternalMatn.g:581:2: ( ruleIstelah )
                    {
                    // InternalMatn.g:581:2: ( ruleIstelah )
                    // InternalMatn.g:582:3: ruleIstelah
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
    // InternalMatn.g:591:1: rule__Tareek__Alternatives_3 : ( ( ( rule__Tareek__Group_3_0__0 ) ) | ( ( rule__Tareek__Group_3_1__0 ) ) );
    public final void rule__Tareek__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:595:1: ( ( ( rule__Tareek__Group_3_0__0 ) ) | ( ( rule__Tareek__Group_3_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==57) ) {
                alt4=1;
            }
            else if ( (LA4_0==58) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMatn.g:596:2: ( ( rule__Tareek__Group_3_0__0 ) )
                    {
                    // InternalMatn.g:596:2: ( ( rule__Tareek__Group_3_0__0 ) )
                    // InternalMatn.g:597:3: ( rule__Tareek__Group_3_0__0 )
                    {
                     before(grammarAccess.getTareekAccess().getGroup_3_0()); 
                    // InternalMatn.g:598:3: ( rule__Tareek__Group_3_0__0 )
                    // InternalMatn.g:598:4: rule__Tareek__Group_3_0__0
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
                    // InternalMatn.g:602:2: ( ( rule__Tareek__Group_3_1__0 ) )
                    {
                    // InternalMatn.g:602:2: ( ( rule__Tareek__Group_3_1__0 ) )
                    // InternalMatn.g:603:3: ( rule__Tareek__Group_3_1__0 )
                    {
                     before(grammarAccess.getTareekAccess().getGroup_3_1()); 
                    // InternalMatn.g:604:3: ( rule__Tareek__Group_3_1__0 )
                    // InternalMatn.g:604:4: rule__Tareek__Group_3_1__0
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
    // InternalMatn.g:612:1: rule__Mawdee__Alternatives : ( ( '\\u0627\\u0644\\u0623\\u0648\\u0644' ) | ( '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' ) | ( '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' ) | ( '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' ) );
    public final void rule__Mawdee__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:616:1: ( ( '\\u0627\\u0644\\u0623\\u0648\\u0644' ) | ( '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' ) | ( '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' ) | ( '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMatn.g:617:2: ( '\\u0627\\u0644\\u0623\\u0648\\u0644' )
                    {
                    // InternalMatn.g:617:2: ( '\\u0627\\u0644\\u0623\\u0648\\u0644' )
                    // InternalMatn.g:618:3: '\\u0627\\u0644\\u0623\\u0648\\u0644'
                    {
                     before(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaAboveArabicLetterWawArabicLetterLamKeyword_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaAboveArabicLetterWawArabicLetterLamKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMatn.g:623:2: ( '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' )
                    {
                    // InternalMatn.g:623:2: ( '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' )
                    // InternalMatn.g:624:3: '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A'
                    {
                     before(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterNoonArabicLetterYehKeyword_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterNoonArabicLetterYehKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMatn.g:629:2: ( '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' )
                    {
                    // InternalMatn.g:629:2: ( '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' )
                    // InternalMatn.g:630:3: '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B'
                    {
                     before(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterLamArabicLetterThehKeyword_2()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterLamArabicLetterThehKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMatn.g:635:2: ( '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' )
                    {
                    // InternalMatn.g:635:2: ( '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' )
                    // InternalMatn.g:636:3: '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631'
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
    // InternalMatn.g:645:1: rule__Harf__Alternatives_2 : ( ( ( rule__Harf__Group_2_0__0 ) ) | ( ( rule__Harf__Group_2_1__0 ) ) );
    public final void rule__Harf__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:649:1: ( ( ( rule__Harf__Group_2_0__0 ) ) | ( ( rule__Harf__Group_2_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==50) ) {
                alt6=1;
            }
            else if ( (LA6_0==52) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMatn.g:650:2: ( ( rule__Harf__Group_2_0__0 ) )
                    {
                    // InternalMatn.g:650:2: ( ( rule__Harf__Group_2_0__0 ) )
                    // InternalMatn.g:651:3: ( rule__Harf__Group_2_0__0 )
                    {
                     before(grammarAccess.getHarfAccess().getGroup_2_0()); 
                    // InternalMatn.g:652:3: ( rule__Harf__Group_2_0__0 )
                    // InternalMatn.g:652:4: rule__Harf__Group_2_0__0
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
                    // InternalMatn.g:656:2: ( ( rule__Harf__Group_2_1__0 ) )
                    {
                    // InternalMatn.g:656:2: ( ( rule__Harf__Group_2_1__0 ) )
                    // InternalMatn.g:657:3: ( rule__Harf__Group_2_1__0 )
                    {
                     before(grammarAccess.getHarfAccess().getGroup_2_1()); 
                    // InternalMatn.g:658:3: ( rule__Harf__Group_2_1__0 )
                    // InternalMatn.g:658:4: rule__Harf__Group_2_1__0
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


    // $ANTLR start "rule__Matn__Group__0"
    // InternalMatn.g:666:1: rule__Matn__Group__0 : rule__Matn__Group__0__Impl rule__Matn__Group__1 ;
    public final void rule__Matn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:670:1: ( rule__Matn__Group__0__Impl rule__Matn__Group__1 )
            // InternalMatn.g:671:2: rule__Matn__Group__0__Impl rule__Matn__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMatn.g:678:1: rule__Matn__Group__0__Impl : ( RULE_BASMALAH ) ;
    public final void rule__Matn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:682:1: ( ( RULE_BASMALAH ) )
            // InternalMatn.g:683:1: ( RULE_BASMALAH )
            {
            // InternalMatn.g:683:1: ( RULE_BASMALAH )
            // InternalMatn.g:684:2: RULE_BASMALAH
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
    // InternalMatn.g:693:1: rule__Matn__Group__1 : rule__Matn__Group__1__Impl rule__Matn__Group__2 ;
    public final void rule__Matn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:697:1: ( rule__Matn__Group__1__Impl rule__Matn__Group__2 )
            // InternalMatn.g:698:2: rule__Matn__Group__1__Impl rule__Matn__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMatn.g:705:1: rule__Matn__Group__1__Impl : ( ( rule__Matn__NameAssignment_1 ) ) ;
    public final void rule__Matn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:709:1: ( ( ( rule__Matn__NameAssignment_1 ) ) )
            // InternalMatn.g:710:1: ( ( rule__Matn__NameAssignment_1 ) )
            {
            // InternalMatn.g:710:1: ( ( rule__Matn__NameAssignment_1 ) )
            // InternalMatn.g:711:2: ( rule__Matn__NameAssignment_1 )
            {
             before(grammarAccess.getMatnAccess().getNameAssignment_1()); 
            // InternalMatn.g:712:2: ( rule__Matn__NameAssignment_1 )
            // InternalMatn.g:712:3: rule__Matn__NameAssignment_1
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
    // InternalMatn.g:720:1: rule__Matn__Group__2 : rule__Matn__Group__2__Impl ;
    public final void rule__Matn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:724:1: ( rule__Matn__Group__2__Impl )
            // InternalMatn.g:725:2: rule__Matn__Group__2__Impl
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
    // InternalMatn.g:731:1: rule__Matn__Group__2__Impl : ( ( ( rule__Matn__MakatehAssignment_2 ) ) ( ( rule__Matn__MakatehAssignment_2 )* ) ) ;
    public final void rule__Matn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:735:1: ( ( ( ( rule__Matn__MakatehAssignment_2 ) ) ( ( rule__Matn__MakatehAssignment_2 )* ) ) )
            // InternalMatn.g:736:1: ( ( ( rule__Matn__MakatehAssignment_2 ) ) ( ( rule__Matn__MakatehAssignment_2 )* ) )
            {
            // InternalMatn.g:736:1: ( ( ( rule__Matn__MakatehAssignment_2 ) ) ( ( rule__Matn__MakatehAssignment_2 )* ) )
            // InternalMatn.g:737:2: ( ( rule__Matn__MakatehAssignment_2 ) ) ( ( rule__Matn__MakatehAssignment_2 )* )
            {
            // InternalMatn.g:737:2: ( ( rule__Matn__MakatehAssignment_2 ) )
            // InternalMatn.g:738:3: ( rule__Matn__MakatehAssignment_2 )
            {
             before(grammarAccess.getMatnAccess().getMakatehAssignment_2()); 
            // InternalMatn.g:739:3: ( rule__Matn__MakatehAssignment_2 )
            // InternalMatn.g:739:4: rule__Matn__MakatehAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__Matn__MakatehAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMatnAccess().getMakatehAssignment_2()); 

            }

            // InternalMatn.g:742:2: ( ( rule__Matn__MakatehAssignment_2 )* )
            // InternalMatn.g:743:3: ( rule__Matn__MakatehAssignment_2 )*
            {
             before(grammarAccess.getMatnAccess().getMakatehAssignment_2()); 
            // InternalMatn.g:744:3: ( rule__Matn__MakatehAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMatn.g:744:4: rule__Matn__MakatehAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Matn__MakatehAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalMatn.g:754:1: rule__Maktah__Group__0 : rule__Maktah__Group__0__Impl rule__Maktah__Group__1 ;
    public final void rule__Maktah__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:758:1: ( rule__Maktah__Group__0__Impl rule__Maktah__Group__1 )
            // InternalMatn.g:759:2: rule__Maktah__Group__0__Impl rule__Maktah__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMatn.g:766:1: rule__Maktah__Group__0__Impl : ( '*' ) ;
    public final void rule__Maktah__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:770:1: ( ( '*' ) )
            // InternalMatn.g:771:1: ( '*' )
            {
            // InternalMatn.g:771:1: ( '*' )
            // InternalMatn.g:772:2: '*'
            {
             before(grammarAccess.getMaktahAccess().getAsteriskKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMatn.g:781:1: rule__Maktah__Group__1 : rule__Maktah__Group__1__Impl rule__Maktah__Group__2 ;
    public final void rule__Maktah__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:785:1: ( rule__Maktah__Group__1__Impl rule__Maktah__Group__2 )
            // InternalMatn.g:786:2: rule__Maktah__Group__1__Impl rule__Maktah__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMatn.g:793:1: rule__Maktah__Group__1__Impl : ( '*' ) ;
    public final void rule__Maktah__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:797:1: ( ( '*' ) )
            // InternalMatn.g:798:1: ( '*' )
            {
            // InternalMatn.g:798:1: ( '*' )
            // InternalMatn.g:799:2: '*'
            {
             before(grammarAccess.getMaktahAccess().getAsteriskKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMatn.g:808:1: rule__Maktah__Group__2 : rule__Maktah__Group__2__Impl rule__Maktah__Group__3 ;
    public final void rule__Maktah__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:812:1: ( rule__Maktah__Group__2__Impl rule__Maktah__Group__3 )
            // InternalMatn.g:813:2: rule__Maktah__Group__2__Impl rule__Maktah__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMatn.g:820:1: rule__Maktah__Group__2__Impl : ( '*' ) ;
    public final void rule__Maktah__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:824:1: ( ( '*' ) )
            // InternalMatn.g:825:1: ( '*' )
            {
            // InternalMatn.g:825:1: ( '*' )
            // InternalMatn.g:826:2: '*'
            {
             before(grammarAccess.getMaktahAccess().getAsteriskKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMatn.g:835:1: rule__Maktah__Group__3 : rule__Maktah__Group__3__Impl rule__Maktah__Group__4 ;
    public final void rule__Maktah__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:839:1: ( rule__Maktah__Group__3__Impl rule__Maktah__Group__4 )
            // InternalMatn.g:840:2: rule__Maktah__Group__3__Impl rule__Maktah__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalMatn.g:847:1: rule__Maktah__Group__3__Impl : ( ( rule__Maktah__NameAssignment_3 ) ) ;
    public final void rule__Maktah__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:851:1: ( ( ( rule__Maktah__NameAssignment_3 ) ) )
            // InternalMatn.g:852:1: ( ( rule__Maktah__NameAssignment_3 ) )
            {
            // InternalMatn.g:852:1: ( ( rule__Maktah__NameAssignment_3 ) )
            // InternalMatn.g:853:2: ( rule__Maktah__NameAssignment_3 )
            {
             before(grammarAccess.getMaktahAccess().getNameAssignment_3()); 
            // InternalMatn.g:854:2: ( rule__Maktah__NameAssignment_3 )
            // InternalMatn.g:854:3: rule__Maktah__NameAssignment_3
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
    // InternalMatn.g:862:1: rule__Maktah__Group__4 : rule__Maktah__Group__4__Impl rule__Maktah__Group__5 ;
    public final void rule__Maktah__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:866:1: ( rule__Maktah__Group__4__Impl rule__Maktah__Group__5 )
            // InternalMatn.g:867:2: rule__Maktah__Group__4__Impl rule__Maktah__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMatn.g:874:1: rule__Maktah__Group__4__Impl : ( '(' ) ;
    public final void rule__Maktah__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:878:1: ( ( '(' ) )
            // InternalMatn.g:879:1: ( '(' )
            {
            // InternalMatn.g:879:1: ( '(' )
            // InternalMatn.g:880:2: '('
            {
             before(grammarAccess.getMaktahAccess().getLeftParenthesisKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMatn.g:889:1: rule__Maktah__Group__5 : rule__Maktah__Group__5__Impl rule__Maktah__Group__6 ;
    public final void rule__Maktah__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:893:1: ( rule__Maktah__Group__5__Impl rule__Maktah__Group__6 )
            // InternalMatn.g:894:2: rule__Maktah__Group__5__Impl rule__Maktah__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalMatn.g:901:1: rule__Maktah__Group__5__Impl : ( ( rule__Maktah__AbyatCountAssignment_5 ) ) ;
    public final void rule__Maktah__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:905:1: ( ( ( rule__Maktah__AbyatCountAssignment_5 ) ) )
            // InternalMatn.g:906:1: ( ( rule__Maktah__AbyatCountAssignment_5 ) )
            {
            // InternalMatn.g:906:1: ( ( rule__Maktah__AbyatCountAssignment_5 ) )
            // InternalMatn.g:907:2: ( rule__Maktah__AbyatCountAssignment_5 )
            {
             before(grammarAccess.getMaktahAccess().getAbyatCountAssignment_5()); 
            // InternalMatn.g:908:2: ( rule__Maktah__AbyatCountAssignment_5 )
            // InternalMatn.g:908:3: rule__Maktah__AbyatCountAssignment_5
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
    // InternalMatn.g:916:1: rule__Maktah__Group__6 : rule__Maktah__Group__6__Impl rule__Maktah__Group__7 ;
    public final void rule__Maktah__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:920:1: ( rule__Maktah__Group__6__Impl rule__Maktah__Group__7 )
            // InternalMatn.g:921:2: rule__Maktah__Group__6__Impl rule__Maktah__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalMatn.g:928:1: rule__Maktah__Group__6__Impl : ( ')' ) ;
    public final void rule__Maktah__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:932:1: ( ( ')' ) )
            // InternalMatn.g:933:1: ( ')' )
            {
            // InternalMatn.g:933:1: ( ')' )
            // InternalMatn.g:934:2: ')'
            {
             before(grammarAccess.getMaktahAccess().getRightParenthesisKeyword_6()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMatn.g:943:1: rule__Maktah__Group__7 : rule__Maktah__Group__7__Impl ;
    public final void rule__Maktah__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:947:1: ( rule__Maktah__Group__7__Impl )
            // InternalMatn.g:948:2: rule__Maktah__Group__7__Impl
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
    // InternalMatn.g:954:1: rule__Maktah__Group__7__Impl : ( ( ( rule__Maktah__AbyatAssignment_7 ) ) ( ( rule__Maktah__AbyatAssignment_7 )* ) ) ;
    public final void rule__Maktah__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:958:1: ( ( ( ( rule__Maktah__AbyatAssignment_7 ) ) ( ( rule__Maktah__AbyatAssignment_7 )* ) ) )
            // InternalMatn.g:959:1: ( ( ( rule__Maktah__AbyatAssignment_7 ) ) ( ( rule__Maktah__AbyatAssignment_7 )* ) )
            {
            // InternalMatn.g:959:1: ( ( ( rule__Maktah__AbyatAssignment_7 ) ) ( ( rule__Maktah__AbyatAssignment_7 )* ) )
            // InternalMatn.g:960:2: ( ( rule__Maktah__AbyatAssignment_7 ) ) ( ( rule__Maktah__AbyatAssignment_7 )* )
            {
            // InternalMatn.g:960:2: ( ( rule__Maktah__AbyatAssignment_7 ) )
            // InternalMatn.g:961:3: ( rule__Maktah__AbyatAssignment_7 )
            {
             before(grammarAccess.getMaktahAccess().getAbyatAssignment_7()); 
            // InternalMatn.g:962:3: ( rule__Maktah__AbyatAssignment_7 )
            // InternalMatn.g:962:4: rule__Maktah__AbyatAssignment_7
            {
            pushFollow(FOLLOW_10);
            rule__Maktah__AbyatAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMaktahAccess().getAbyatAssignment_7()); 

            }

            // InternalMatn.g:965:2: ( ( rule__Maktah__AbyatAssignment_7 )* )
            // InternalMatn.g:966:3: ( rule__Maktah__AbyatAssignment_7 )*
            {
             before(grammarAccess.getMaktahAccess().getAbyatAssignment_7()); 
            // InternalMatn.g:967:3: ( rule__Maktah__AbyatAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMatn.g:967:4: rule__Maktah__AbyatAssignment_7
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Maktah__AbyatAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalMatn.g:977:1: rule__Bayt__Group__0 : rule__Bayt__Group__0__Impl rule__Bayt__Group__1 ;
    public final void rule__Bayt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:981:1: ( rule__Bayt__Group__0__Impl rule__Bayt__Group__1 )
            // InternalMatn.g:982:2: rule__Bayt__Group__0__Impl rule__Bayt__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMatn.g:989:1: rule__Bayt__Group__0__Impl : ( ( rule__Bayt__RakmAssignment_0 ) ) ;
    public final void rule__Bayt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:993:1: ( ( ( rule__Bayt__RakmAssignment_0 ) ) )
            // InternalMatn.g:994:1: ( ( rule__Bayt__RakmAssignment_0 ) )
            {
            // InternalMatn.g:994:1: ( ( rule__Bayt__RakmAssignment_0 ) )
            // InternalMatn.g:995:2: ( rule__Bayt__RakmAssignment_0 )
            {
             before(grammarAccess.getBaytAccess().getRakmAssignment_0()); 
            // InternalMatn.g:996:2: ( rule__Bayt__RakmAssignment_0 )
            // InternalMatn.g:996:3: rule__Bayt__RakmAssignment_0
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
    // InternalMatn.g:1004:1: rule__Bayt__Group__1 : rule__Bayt__Group__1__Impl rule__Bayt__Group__2 ;
    public final void rule__Bayt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1008:1: ( rule__Bayt__Group__1__Impl rule__Bayt__Group__2 )
            // InternalMatn.g:1009:2: rule__Bayt__Group__1__Impl rule__Bayt__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMatn.g:1016:1: rule__Bayt__Group__1__Impl : ( '-' ) ;
    public final void rule__Bayt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1020:1: ( ( '-' ) )
            // InternalMatn.g:1021:1: ( '-' )
            {
            // InternalMatn.g:1021:1: ( '-' )
            // InternalMatn.g:1022:2: '-'
            {
             before(grammarAccess.getBaytAccess().getHyphenMinusKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMatn.g:1031:1: rule__Bayt__Group__2 : rule__Bayt__Group__2__Impl rule__Bayt__Group__3 ;
    public final void rule__Bayt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1035:1: ( rule__Bayt__Group__2__Impl rule__Bayt__Group__3 )
            // InternalMatn.g:1036:2: rule__Bayt__Group__2__Impl rule__Bayt__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMatn.g:1043:1: rule__Bayt__Group__2__Impl : ( ( ( rule__Bayt__SadrAssignment_2 ) ) ( ( rule__Bayt__SadrAssignment_2 )* ) ) ;
    public final void rule__Bayt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1047:1: ( ( ( ( rule__Bayt__SadrAssignment_2 ) ) ( ( rule__Bayt__SadrAssignment_2 )* ) ) )
            // InternalMatn.g:1048:1: ( ( ( rule__Bayt__SadrAssignment_2 ) ) ( ( rule__Bayt__SadrAssignment_2 )* ) )
            {
            // InternalMatn.g:1048:1: ( ( ( rule__Bayt__SadrAssignment_2 ) ) ( ( rule__Bayt__SadrAssignment_2 )* ) )
            // InternalMatn.g:1049:2: ( ( rule__Bayt__SadrAssignment_2 ) ) ( ( rule__Bayt__SadrAssignment_2 )* )
            {
            // InternalMatn.g:1049:2: ( ( rule__Bayt__SadrAssignment_2 ) )
            // InternalMatn.g:1050:3: ( rule__Bayt__SadrAssignment_2 )
            {
             before(grammarAccess.getBaytAccess().getSadrAssignment_2()); 
            // InternalMatn.g:1051:3: ( rule__Bayt__SadrAssignment_2 )
            // InternalMatn.g:1051:4: rule__Bayt__SadrAssignment_2
            {
            pushFollow(FOLLOW_3);
            rule__Bayt__SadrAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBaytAccess().getSadrAssignment_2()); 

            }

            // InternalMatn.g:1054:2: ( ( rule__Bayt__SadrAssignment_2 )* )
            // InternalMatn.g:1055:3: ( rule__Bayt__SadrAssignment_2 )*
            {
             before(grammarAccess.getBaytAccess().getSadrAssignment_2()); 
            // InternalMatn.g:1056:3: ( rule__Bayt__SadrAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_AWORD) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMatn.g:1056:4: rule__Bayt__SadrAssignment_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Bayt__SadrAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMatn.g:1065:1: rule__Bayt__Group__3 : rule__Bayt__Group__3__Impl rule__Bayt__Group__4 ;
    public final void rule__Bayt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1069:1: ( rule__Bayt__Group__3__Impl rule__Bayt__Group__4 )
            // InternalMatn.g:1070:2: rule__Bayt__Group__3__Impl rule__Bayt__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalMatn.g:1077:1: rule__Bayt__Group__3__Impl : ( '...' ) ;
    public final void rule__Bayt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1081:1: ( ( '...' ) )
            // InternalMatn.g:1082:1: ( '...' )
            {
            // InternalMatn.g:1082:1: ( '...' )
            // InternalMatn.g:1083:2: '...'
            {
             before(grammarAccess.getBaytAccess().getFullStopFullStopFullStopKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMatn.g:1092:1: rule__Bayt__Group__4 : rule__Bayt__Group__4__Impl ;
    public final void rule__Bayt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1096:1: ( rule__Bayt__Group__4__Impl )
            // InternalMatn.g:1097:2: rule__Bayt__Group__4__Impl
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
    // InternalMatn.g:1103:1: rule__Bayt__Group__4__Impl : ( ( ( rule__Bayt__AjozAssignment_4 ) ) ( ( rule__Bayt__AjozAssignment_4 )* ) ) ;
    public final void rule__Bayt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1107:1: ( ( ( ( rule__Bayt__AjozAssignment_4 ) ) ( ( rule__Bayt__AjozAssignment_4 )* ) ) )
            // InternalMatn.g:1108:1: ( ( ( rule__Bayt__AjozAssignment_4 ) ) ( ( rule__Bayt__AjozAssignment_4 )* ) )
            {
            // InternalMatn.g:1108:1: ( ( ( rule__Bayt__AjozAssignment_4 ) ) ( ( rule__Bayt__AjozAssignment_4 )* ) )
            // InternalMatn.g:1109:2: ( ( rule__Bayt__AjozAssignment_4 ) ) ( ( rule__Bayt__AjozAssignment_4 )* )
            {
            // InternalMatn.g:1109:2: ( ( rule__Bayt__AjozAssignment_4 ) )
            // InternalMatn.g:1110:3: ( rule__Bayt__AjozAssignment_4 )
            {
             before(grammarAccess.getBaytAccess().getAjozAssignment_4()); 
            // InternalMatn.g:1111:3: ( rule__Bayt__AjozAssignment_4 )
            // InternalMatn.g:1111:4: rule__Bayt__AjozAssignment_4
            {
            pushFollow(FOLLOW_3);
            rule__Bayt__AjozAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBaytAccess().getAjozAssignment_4()); 

            }

            // InternalMatn.g:1114:2: ( ( rule__Bayt__AjozAssignment_4 )* )
            // InternalMatn.g:1115:3: ( rule__Bayt__AjozAssignment_4 )*
            {
             before(grammarAccess.getBaytAccess().getAjozAssignment_4()); 
            // InternalMatn.g:1116:3: ( rule__Bayt__AjozAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_AWORD) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMatn.g:1116:4: rule__Bayt__AjozAssignment_4
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Bayt__AjozAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMatn.g:1126:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1130:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalMatn.g:1131:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMatn.g:1138:1: rule__Person__Group__0__Impl : ( ( rule__Person__NameAssignment_0 ) ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1142:1: ( ( ( rule__Person__NameAssignment_0 ) ) )
            // InternalMatn.g:1143:1: ( ( rule__Person__NameAssignment_0 ) )
            {
            // InternalMatn.g:1143:1: ( ( rule__Person__NameAssignment_0 ) )
            // InternalMatn.g:1144:2: ( rule__Person__NameAssignment_0 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_0()); 
            // InternalMatn.g:1145:2: ( rule__Person__NameAssignment_0 )
            // InternalMatn.g:1145:3: rule__Person__NameAssignment_0
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
    // InternalMatn.g:1153:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1157:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalMatn.g:1158:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMatn.g:1165:1: rule__Person__Group__1__Impl : ( ( rule__Person__Group_1__0 )? ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1169:1: ( ( ( rule__Person__Group_1__0 )? ) )
            // InternalMatn.g:1170:1: ( ( rule__Person__Group_1__0 )? )
            {
            // InternalMatn.g:1170:1: ( ( rule__Person__Group_1__0 )? )
            // InternalMatn.g:1171:2: ( rule__Person__Group_1__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_1()); 
            // InternalMatn.g:1172:2: ( rule__Person__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMatn.g:1172:3: rule__Person__Group_1__0
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
    // InternalMatn.g:1180:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1184:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalMatn.g:1185:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalMatn.g:1192:1: rule__Person__Group__2__Impl : ( ( rule__Person__Group_2__0 )? ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1196:1: ( ( ( rule__Person__Group_2__0 )? ) )
            // InternalMatn.g:1197:1: ( ( rule__Person__Group_2__0 )? )
            {
            // InternalMatn.g:1197:1: ( ( rule__Person__Group_2__0 )? )
            // InternalMatn.g:1198:2: ( rule__Person__Group_2__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_2()); 
            // InternalMatn.g:1199:2: ( rule__Person__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMatn.g:1199:3: rule__Person__Group_2__0
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
    // InternalMatn.g:1207:1: rule__Person__Group__3 : rule__Person__Group__3__Impl ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1211:1: ( rule__Person__Group__3__Impl )
            // InternalMatn.g:1212:2: rule__Person__Group__3__Impl
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
    // InternalMatn.g:1218:1: rule__Person__Group__3__Impl : ( ( rule__Person__Group_3__0 )? ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1222:1: ( ( ( rule__Person__Group_3__0 )? ) )
            // InternalMatn.g:1223:1: ( ( rule__Person__Group_3__0 )? )
            {
            // InternalMatn.g:1223:1: ( ( rule__Person__Group_3__0 )? )
            // InternalMatn.g:1224:2: ( rule__Person__Group_3__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_3()); 
            // InternalMatn.g:1225:2: ( rule__Person__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMatn.g:1225:3: rule__Person__Group_3__0
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
    // InternalMatn.g:1234:1: rule__Person__Group_1__0 : rule__Person__Group_1__0__Impl rule__Person__Group_1__1 ;
    public final void rule__Person__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1238:1: ( rule__Person__Group_1__0__Impl rule__Person__Group_1__1 )
            // InternalMatn.g:1239:2: rule__Person__Group_1__0__Impl rule__Person__Group_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMatn.g:1246:1: rule__Person__Group_1__0__Impl : ( '\\u0627\\u0633\\u0645\\u0647' ) ;
    public final void rule__Person__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1250:1: ( ( '\\u0627\\u0633\\u0645\\u0647' ) )
            // InternalMatn.g:1251:1: ( '\\u0627\\u0633\\u0645\\u0647' )
            {
            // InternalMatn.g:1251:1: ( '\\u0627\\u0633\\u0645\\u0647' )
            // InternalMatn.g:1252:2: '\\u0627\\u0633\\u0645\\u0647'
            {
             before(grammarAccess.getPersonAccess().getArabicLetterAlefArabicLetterSeenArabicLetterMeemArabicLetterHehKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMatn.g:1261:1: rule__Person__Group_1__1 : rule__Person__Group_1__1__Impl ;
    public final void rule__Person__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1265:1: ( rule__Person__Group_1__1__Impl )
            // InternalMatn.g:1266:2: rule__Person__Group_1__1__Impl
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
    // InternalMatn.g:1272:1: rule__Person__Group_1__1__Impl : ( ( rule__Person__EsmAssignment_1_1 ) ) ;
    public final void rule__Person__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1276:1: ( ( ( rule__Person__EsmAssignment_1_1 ) ) )
            // InternalMatn.g:1277:1: ( ( rule__Person__EsmAssignment_1_1 ) )
            {
            // InternalMatn.g:1277:1: ( ( rule__Person__EsmAssignment_1_1 ) )
            // InternalMatn.g:1278:2: ( rule__Person__EsmAssignment_1_1 )
            {
             before(grammarAccess.getPersonAccess().getEsmAssignment_1_1()); 
            // InternalMatn.g:1279:2: ( rule__Person__EsmAssignment_1_1 )
            // InternalMatn.g:1279:3: rule__Person__EsmAssignment_1_1
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
    // InternalMatn.g:1288:1: rule__Person__Group_2__0 : rule__Person__Group_2__0__Impl rule__Person__Group_2__1 ;
    public final void rule__Person__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1292:1: ( rule__Person__Group_2__0__Impl rule__Person__Group_2__1 )
            // InternalMatn.g:1293:2: rule__Person__Group_2__0__Impl rule__Person__Group_2__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMatn.g:1300:1: rule__Person__Group_2__0__Impl : ( '\\u0644\\u0642\\u0628\\u0647' ) ;
    public final void rule__Person__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1304:1: ( ( '\\u0644\\u0642\\u0628\\u0647' ) )
            // InternalMatn.g:1305:1: ( '\\u0644\\u0642\\u0628\\u0647' )
            {
            // InternalMatn.g:1305:1: ( '\\u0644\\u0642\\u0628\\u0647' )
            // InternalMatn.g:1306:2: '\\u0644\\u0642\\u0628\\u0647'
            {
             before(grammarAccess.getPersonAccess().getArabicLetterLamArabicLetterQafArabicLetterBehArabicLetterHehKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMatn.g:1315:1: rule__Person__Group_2__1 : rule__Person__Group_2__1__Impl ;
    public final void rule__Person__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1319:1: ( rule__Person__Group_2__1__Impl )
            // InternalMatn.g:1320:2: rule__Person__Group_2__1__Impl
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
    // InternalMatn.g:1326:1: rule__Person__Group_2__1__Impl : ( ( rule__Person__LakabAssignment_2_1 ) ) ;
    public final void rule__Person__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1330:1: ( ( ( rule__Person__LakabAssignment_2_1 ) ) )
            // InternalMatn.g:1331:1: ( ( rule__Person__LakabAssignment_2_1 ) )
            {
            // InternalMatn.g:1331:1: ( ( rule__Person__LakabAssignment_2_1 ) )
            // InternalMatn.g:1332:2: ( rule__Person__LakabAssignment_2_1 )
            {
             before(grammarAccess.getPersonAccess().getLakabAssignment_2_1()); 
            // InternalMatn.g:1333:2: ( rule__Person__LakabAssignment_2_1 )
            // InternalMatn.g:1333:3: rule__Person__LakabAssignment_2_1
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
    // InternalMatn.g:1342:1: rule__Person__Group_3__0 : rule__Person__Group_3__0__Impl rule__Person__Group_3__1 ;
    public final void rule__Person__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1346:1: ( rule__Person__Group_3__0__Impl rule__Person__Group_3__1 )
            // InternalMatn.g:1347:2: rule__Person__Group_3__0__Impl rule__Person__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMatn.g:1354:1: rule__Person__Group_3__0__Impl : ( '\\u062A\\u0648\\u0641\\u064A' ) ;
    public final void rule__Person__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1358:1: ( ( '\\u062A\\u0648\\u0641\\u064A' ) )
            // InternalMatn.g:1359:1: ( '\\u062A\\u0648\\u0641\\u064A' )
            {
            // InternalMatn.g:1359:1: ( '\\u062A\\u0648\\u0641\\u064A' )
            // InternalMatn.g:1360:2: '\\u062A\\u0648\\u0641\\u064A'
            {
             before(grammarAccess.getPersonAccess().getArabicLetterTehArabicLetterWawArabicLetterFehArabicLetterYehKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMatn.g:1369:1: rule__Person__Group_3__1 : rule__Person__Group_3__1__Impl ;
    public final void rule__Person__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1373:1: ( rule__Person__Group_3__1__Impl )
            // InternalMatn.g:1374:2: rule__Person__Group_3__1__Impl
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
    // InternalMatn.g:1380:1: rule__Person__Group_3__1__Impl : ( ( rule__Person__TowofiaAssignment_3_1 ) ) ;
    public final void rule__Person__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1384:1: ( ( ( rule__Person__TowofiaAssignment_3_1 ) ) )
            // InternalMatn.g:1385:1: ( ( rule__Person__TowofiaAssignment_3_1 ) )
            {
            // InternalMatn.g:1385:1: ( ( rule__Person__TowofiaAssignment_3_1 ) )
            // InternalMatn.g:1386:2: ( rule__Person__TowofiaAssignment_3_1 )
            {
             before(grammarAccess.getPersonAccess().getTowofiaAssignment_3_1()); 
            // InternalMatn.g:1387:2: ( rule__Person__TowofiaAssignment_3_1 )
            // InternalMatn.g:1387:3: rule__Person__TowofiaAssignment_3_1
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
    // InternalMatn.g:1396:1: rule__Douaa__Group__0 : rule__Douaa__Group__0__Impl rule__Douaa__Group__1 ;
    public final void rule__Douaa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1400:1: ( rule__Douaa__Group__0__Impl rule__Douaa__Group__1 )
            // InternalMatn.g:1401:2: rule__Douaa__Group__0__Impl rule__Douaa__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMatn.g:1408:1: rule__Douaa__Group__0__Impl : ( ( rule__Douaa__DAssignment_0 ) ) ;
    public final void rule__Douaa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1412:1: ( ( ( rule__Douaa__DAssignment_0 ) ) )
            // InternalMatn.g:1413:1: ( ( rule__Douaa__DAssignment_0 ) )
            {
            // InternalMatn.g:1413:1: ( ( rule__Douaa__DAssignment_0 ) )
            // InternalMatn.g:1414:2: ( rule__Douaa__DAssignment_0 )
            {
             before(grammarAccess.getDouaaAccess().getDAssignment_0()); 
            // InternalMatn.g:1415:2: ( rule__Douaa__DAssignment_0 )
            // InternalMatn.g:1415:3: rule__Douaa__DAssignment_0
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
    // InternalMatn.g:1423:1: rule__Douaa__Group__1 : rule__Douaa__Group__1__Impl ;
    public final void rule__Douaa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1427:1: ( rule__Douaa__Group__1__Impl )
            // InternalMatn.g:1428:2: rule__Douaa__Group__1__Impl
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
    // InternalMatn.g:1434:1: rule__Douaa__Group__1__Impl : ( '\\u0627\\u0644\\u0644\\u0647' ) ;
    public final void rule__Douaa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1438:1: ( ( '\\u0627\\u0644\\u0644\\u0647' ) )
            // InternalMatn.g:1439:1: ( '\\u0627\\u0644\\u0644\\u0647' )
            {
            // InternalMatn.g:1439:1: ( '\\u0627\\u0644\\u0644\\u0647' )
            // InternalMatn.g:1440:2: '\\u0627\\u0644\\u0644\\u0647'
            {
             before(grammarAccess.getDouaaAccess().getArabicLetterAlefArabicLetterLamArabicLetterLamArabicLetterHehKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMatn.g:1450:1: rule__IMAM__Group__0 : rule__IMAM__Group__0__Impl rule__IMAM__Group__1 ;
    public final void rule__IMAM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1454:1: ( rule__IMAM__Group__0__Impl rule__IMAM__Group__1 )
            // InternalMatn.g:1455:2: rule__IMAM__Group__0__Impl rule__IMAM__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMatn.g:1462:1: rule__IMAM__Group__0__Impl : ( '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' ) ;
    public final void rule__IMAM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1466:1: ( ( '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' ) )
            // InternalMatn.g:1467:1: ( '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' )
            {
            // InternalMatn.g:1467:1: ( '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' )
            // InternalMatn.g:1468:2: '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645'
            {
             before(grammarAccess.getIMAMAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaBelowArabicLetterMeemArabicLetterAlefArabicLetterMeemKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMatn.g:1477:1: rule__IMAM__Group__1 : rule__IMAM__Group__1__Impl rule__IMAM__Group__2 ;
    public final void rule__IMAM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1481:1: ( rule__IMAM__Group__1__Impl rule__IMAM__Group__2 )
            // InternalMatn.g:1482:2: rule__IMAM__Group__1__Impl rule__IMAM__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMatn.g:1489:1: rule__IMAM__Group__1__Impl : ( rulePerson ) ;
    public final void rule__IMAM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1493:1: ( ( rulePerson ) )
            // InternalMatn.g:1494:1: ( rulePerson )
            {
            // InternalMatn.g:1494:1: ( rulePerson )
            // InternalMatn.g:1495:2: rulePerson
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
    // InternalMatn.g:1504:1: rule__IMAM__Group__2 : rule__IMAM__Group__2__Impl ;
    public final void rule__IMAM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1508:1: ( rule__IMAM__Group__2__Impl )
            // InternalMatn.g:1509:2: rule__IMAM__Group__2__Impl
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
    // InternalMatn.g:1515:1: rule__IMAM__Group__2__Impl : ( ruleDouaa ) ;
    public final void rule__IMAM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1519:1: ( ( ruleDouaa ) )
            // InternalMatn.g:1520:1: ( ruleDouaa )
            {
            // InternalMatn.g:1520:1: ( ruleDouaa )
            // InternalMatn.g:1521:2: ruleDouaa
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
    // InternalMatn.g:1531:1: rule__Qaree__Group__0 : rule__Qaree__Group__0__Impl rule__Qaree__Group__1 ;
    public final void rule__Qaree__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1535:1: ( rule__Qaree__Group__0__Impl rule__Qaree__Group__1 )
            // InternalMatn.g:1536:2: rule__Qaree__Group__0__Impl rule__Qaree__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMatn.g:1543:1: rule__Qaree__Group__0__Impl : ( '\\u0642\\u0627\\u0631\\u0626' ) ;
    public final void rule__Qaree__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1547:1: ( ( '\\u0642\\u0627\\u0631\\u0626' ) )
            // InternalMatn.g:1548:1: ( '\\u0642\\u0627\\u0631\\u0626' )
            {
            // InternalMatn.g:1548:1: ( '\\u0642\\u0627\\u0631\\u0626' )
            // InternalMatn.g:1549:2: '\\u0642\\u0627\\u0631\\u0626'
            {
             before(grammarAccess.getQareeAccess().getArabicLetterQafArabicLetterAlefArabicLetterRehArabicLetterYehWithHamzaAboveKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMatn.g:1558:1: rule__Qaree__Group__1 : rule__Qaree__Group__1__Impl ;
    public final void rule__Qaree__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1562:1: ( rule__Qaree__Group__1__Impl )
            // InternalMatn.g:1563:2: rule__Qaree__Group__1__Impl
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
    // InternalMatn.g:1569:1: rule__Qaree__Group__1__Impl : ( rulePerson ) ;
    public final void rule__Qaree__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1573:1: ( ( rulePerson ) )
            // InternalMatn.g:1574:1: ( rulePerson )
            {
            // InternalMatn.g:1574:1: ( rulePerson )
            // InternalMatn.g:1575:2: rulePerson
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
    // InternalMatn.g:1585:1: rule__Rawee__Group__0 : rule__Rawee__Group__0__Impl rule__Rawee__Group__1 ;
    public final void rule__Rawee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1589:1: ( rule__Rawee__Group__0__Impl rule__Rawee__Group__1 )
            // InternalMatn.g:1590:2: rule__Rawee__Group__0__Impl rule__Rawee__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMatn.g:1597:1: rule__Rawee__Group__0__Impl : ( '\\u0631\\u0627\\u0648' ) ;
    public final void rule__Rawee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1601:1: ( ( '\\u0631\\u0627\\u0648' ) )
            // InternalMatn.g:1602:1: ( '\\u0631\\u0627\\u0648' )
            {
            // InternalMatn.g:1602:1: ( '\\u0631\\u0627\\u0648' )
            // InternalMatn.g:1603:2: '\\u0631\\u0627\\u0648'
            {
             before(grammarAccess.getRaweeAccess().getArabicLetterRehArabicLetterAlefArabicLetterWawKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMatn.g:1612:1: rule__Rawee__Group__1 : rule__Rawee__Group__1__Impl rule__Rawee__Group__2 ;
    public final void rule__Rawee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1616:1: ( rule__Rawee__Group__1__Impl rule__Rawee__Group__2 )
            // InternalMatn.g:1617:2: rule__Rawee__Group__1__Impl rule__Rawee__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMatn.g:1624:1: rule__Rawee__Group__1__Impl : ( rulePerson ) ;
    public final void rule__Rawee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1628:1: ( ( rulePerson ) )
            // InternalMatn.g:1629:1: ( rulePerson )
            {
            // InternalMatn.g:1629:1: ( rulePerson )
            // InternalMatn.g:1630:2: rulePerson
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
    // InternalMatn.g:1639:1: rule__Rawee__Group__2 : rule__Rawee__Group__2__Impl rule__Rawee__Group__3 ;
    public final void rule__Rawee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1643:1: ( rule__Rawee__Group__2__Impl rule__Rawee__Group__3 )
            // InternalMatn.g:1644:2: rule__Rawee__Group__2__Impl rule__Rawee__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalMatn.g:1651:1: rule__Rawee__Group__2__Impl : ( '\\u0639\\u0646' ) ;
    public final void rule__Rawee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1655:1: ( ( '\\u0639\\u0646' ) )
            // InternalMatn.g:1656:1: ( '\\u0639\\u0646' )
            {
            // InternalMatn.g:1656:1: ( '\\u0639\\u0646' )
            // InternalMatn.g:1657:2: '\\u0639\\u0646'
            {
             before(grammarAccess.getRaweeAccess().getArabicLetterAinArabicLetterNoonKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMatn.g:1666:1: rule__Rawee__Group__3 : rule__Rawee__Group__3__Impl ;
    public final void rule__Rawee__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1670:1: ( rule__Rawee__Group__3__Impl )
            // InternalMatn.g:1671:2: rule__Rawee__Group__3__Impl
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
    // InternalMatn.g:1677:1: rule__Rawee__Group__3__Impl : ( ( rule__Rawee__QareeAssignment_3 ) ) ;
    public final void rule__Rawee__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1681:1: ( ( ( rule__Rawee__QareeAssignment_3 ) ) )
            // InternalMatn.g:1682:1: ( ( rule__Rawee__QareeAssignment_3 ) )
            {
            // InternalMatn.g:1682:1: ( ( rule__Rawee__QareeAssignment_3 ) )
            // InternalMatn.g:1683:2: ( rule__Rawee__QareeAssignment_3 )
            {
             before(grammarAccess.getRaweeAccess().getQareeAssignment_3()); 
            // InternalMatn.g:1684:2: ( rule__Rawee__QareeAssignment_3 )
            // InternalMatn.g:1684:3: rule__Rawee__QareeAssignment_3
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
    // InternalMatn.g:1693:1: rule__Tareek__Group__0 : rule__Tareek__Group__0__Impl rule__Tareek__Group__1 ;
    public final void rule__Tareek__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1697:1: ( rule__Tareek__Group__0__Impl rule__Tareek__Group__1 )
            // InternalMatn.g:1698:2: rule__Tareek__Group__0__Impl rule__Tareek__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMatn.g:1705:1: rule__Tareek__Group__0__Impl : ( '\\u0637\\u0631\\u064A\\u0642' ) ;
    public final void rule__Tareek__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1709:1: ( ( '\\u0637\\u0631\\u064A\\u0642' ) )
            // InternalMatn.g:1710:1: ( '\\u0637\\u0631\\u064A\\u0642' )
            {
            // InternalMatn.g:1710:1: ( '\\u0637\\u0631\\u064A\\u0642' )
            // InternalMatn.g:1711:2: '\\u0637\\u0631\\u064A\\u0642'
            {
             before(grammarAccess.getTareekAccess().getArabicLetterTahArabicLetterRehArabicLetterYehArabicLetterQafKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMatn.g:1720:1: rule__Tareek__Group__1 : rule__Tareek__Group__1__Impl rule__Tareek__Group__2 ;
    public final void rule__Tareek__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1724:1: ( rule__Tareek__Group__1__Impl rule__Tareek__Group__2 )
            // InternalMatn.g:1725:2: rule__Tareek__Group__1__Impl rule__Tareek__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMatn.g:1732:1: rule__Tareek__Group__1__Impl : ( '\\u062A\\u0644\\u0627\\u0648\\u0629' ) ;
    public final void rule__Tareek__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1736:1: ( ( '\\u062A\\u0644\\u0627\\u0648\\u0629' ) )
            // InternalMatn.g:1737:1: ( '\\u062A\\u0644\\u0627\\u0648\\u0629' )
            {
            // InternalMatn.g:1737:1: ( '\\u062A\\u0644\\u0627\\u0648\\u0629' )
            // InternalMatn.g:1738:2: '\\u062A\\u0644\\u0627\\u0648\\u0629'
            {
             before(grammarAccess.getTareekAccess().getArabicLetterTehArabicLetterLamArabicLetterAlefArabicLetterWawArabicLetterTehMarbutaKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMatn.g:1747:1: rule__Tareek__Group__2 : rule__Tareek__Group__2__Impl rule__Tareek__Group__3 ;
    public final void rule__Tareek__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1751:1: ( rule__Tareek__Group__2__Impl rule__Tareek__Group__3 )
            // InternalMatn.g:1752:2: rule__Tareek__Group__2__Impl rule__Tareek__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMatn.g:1759:1: rule__Tareek__Group__2__Impl : ( ( rule__Tareek__NameAssignment_2 ) ) ;
    public final void rule__Tareek__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1763:1: ( ( ( rule__Tareek__NameAssignment_2 ) ) )
            // InternalMatn.g:1764:1: ( ( rule__Tareek__NameAssignment_2 ) )
            {
            // InternalMatn.g:1764:1: ( ( rule__Tareek__NameAssignment_2 ) )
            // InternalMatn.g:1765:2: ( rule__Tareek__NameAssignment_2 )
            {
             before(grammarAccess.getTareekAccess().getNameAssignment_2()); 
            // InternalMatn.g:1766:2: ( rule__Tareek__NameAssignment_2 )
            // InternalMatn.g:1766:3: rule__Tareek__NameAssignment_2
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
    // InternalMatn.g:1774:1: rule__Tareek__Group__3 : rule__Tareek__Group__3__Impl ;
    public final void rule__Tareek__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1778:1: ( rule__Tareek__Group__3__Impl )
            // InternalMatn.g:1779:2: rule__Tareek__Group__3__Impl
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
    // InternalMatn.g:1785:1: rule__Tareek__Group__3__Impl : ( ( rule__Tareek__Alternatives_3 ) ) ;
    public final void rule__Tareek__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1789:1: ( ( ( rule__Tareek__Alternatives_3 ) ) )
            // InternalMatn.g:1790:1: ( ( rule__Tareek__Alternatives_3 ) )
            {
            // InternalMatn.g:1790:1: ( ( rule__Tareek__Alternatives_3 ) )
            // InternalMatn.g:1791:2: ( rule__Tareek__Alternatives_3 )
            {
             before(grammarAccess.getTareekAccess().getAlternatives_3()); 
            // InternalMatn.g:1792:2: ( rule__Tareek__Alternatives_3 )
            // InternalMatn.g:1792:3: rule__Tareek__Alternatives_3
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
    // InternalMatn.g:1801:1: rule__Tareek__Group_3_0__0 : rule__Tareek__Group_3_0__0__Impl rule__Tareek__Group_3_0__1 ;
    public final void rule__Tareek__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1805:1: ( rule__Tareek__Group_3_0__0__Impl rule__Tareek__Group_3_0__1 )
            // InternalMatn.g:1806:2: rule__Tareek__Group_3_0__0__Impl rule__Tareek__Group_3_0__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMatn.g:1813:1: rule__Tareek__Group_3_0__0__Impl : ( ( rule__Tareek__SimpleAssignment_3_0_0 ) ) ;
    public final void rule__Tareek__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1817:1: ( ( ( rule__Tareek__SimpleAssignment_3_0_0 ) ) )
            // InternalMatn.g:1818:1: ( ( rule__Tareek__SimpleAssignment_3_0_0 ) )
            {
            // InternalMatn.g:1818:1: ( ( rule__Tareek__SimpleAssignment_3_0_0 ) )
            // InternalMatn.g:1819:2: ( rule__Tareek__SimpleAssignment_3_0_0 )
            {
             before(grammarAccess.getTareekAccess().getSimpleAssignment_3_0_0()); 
            // InternalMatn.g:1820:2: ( rule__Tareek__SimpleAssignment_3_0_0 )
            // InternalMatn.g:1820:3: rule__Tareek__SimpleAssignment_3_0_0
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
    // InternalMatn.g:1828:1: rule__Tareek__Group_3_0__1 : rule__Tareek__Group_3_0__1__Impl rule__Tareek__Group_3_0__2 ;
    public final void rule__Tareek__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1832:1: ( rule__Tareek__Group_3_0__1__Impl rule__Tareek__Group_3_0__2 )
            // InternalMatn.g:1833:2: rule__Tareek__Group_3_0__1__Impl rule__Tareek__Group_3_0__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMatn.g:1840:1: rule__Tareek__Group_3_0__1__Impl : ( '\\u0644' ) ;
    public final void rule__Tareek__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1844:1: ( ( '\\u0644' ) )
            // InternalMatn.g:1845:1: ( '\\u0644' )
            {
            // InternalMatn.g:1845:1: ( '\\u0644' )
            // InternalMatn.g:1846:2: '\\u0644'
            {
             before(grammarAccess.getTareekAccess().getArabicLetterLamKeyword_3_0_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMatn.g:1855:1: rule__Tareek__Group_3_0__2 : rule__Tareek__Group_3_0__2__Impl ;
    public final void rule__Tareek__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1859:1: ( rule__Tareek__Group_3_0__2__Impl )
            // InternalMatn.g:1860:2: rule__Tareek__Group_3_0__2__Impl
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
    // InternalMatn.g:1866:1: rule__Tareek__Group_3_0__2__Impl : ( ( rule__Tareek__RefAssignment_3_0_2 ) ) ;
    public final void rule__Tareek__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1870:1: ( ( ( rule__Tareek__RefAssignment_3_0_2 ) ) )
            // InternalMatn.g:1871:1: ( ( rule__Tareek__RefAssignment_3_0_2 ) )
            {
            // InternalMatn.g:1871:1: ( ( rule__Tareek__RefAssignment_3_0_2 ) )
            // InternalMatn.g:1872:2: ( rule__Tareek__RefAssignment_3_0_2 )
            {
             before(grammarAccess.getTareekAccess().getRefAssignment_3_0_2()); 
            // InternalMatn.g:1873:2: ( rule__Tareek__RefAssignment_3_0_2 )
            // InternalMatn.g:1873:3: rule__Tareek__RefAssignment_3_0_2
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
    // InternalMatn.g:1882:1: rule__Tareek__Group_3_1__0 : rule__Tareek__Group_3_1__0__Impl rule__Tareek__Group_3_1__1 ;
    public final void rule__Tareek__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1886:1: ( rule__Tareek__Group_3_1__0__Impl rule__Tareek__Group_3_1__1 )
            // InternalMatn.g:1887:2: rule__Tareek__Group_3_1__0__Impl rule__Tareek__Group_3_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMatn.g:1894:1: rule__Tareek__Group_3_1__0__Impl : ( ( rule__Tareek__Group_3_1_0__0 ) ) ;
    public final void rule__Tareek__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1898:1: ( ( ( rule__Tareek__Group_3_1_0__0 ) ) )
            // InternalMatn.g:1899:1: ( ( rule__Tareek__Group_3_1_0__0 ) )
            {
            // InternalMatn.g:1899:1: ( ( rule__Tareek__Group_3_1_0__0 ) )
            // InternalMatn.g:1900:2: ( rule__Tareek__Group_3_1_0__0 )
            {
             before(grammarAccess.getTareekAccess().getGroup_3_1_0()); 
            // InternalMatn.g:1901:2: ( rule__Tareek__Group_3_1_0__0 )
            // InternalMatn.g:1901:3: rule__Tareek__Group_3_1_0__0
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
    // InternalMatn.g:1909:1: rule__Tareek__Group_3_1__1 : rule__Tareek__Group_3_1__1__Impl ;
    public final void rule__Tareek__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1913:1: ( rule__Tareek__Group_3_1__1__Impl )
            // InternalMatn.g:1914:2: rule__Tareek__Group_3_1__1__Impl
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
    // InternalMatn.g:1920:1: rule__Tareek__Group_3_1__1__Impl : ( ( ( rule__Tareek__RefsAssignment_3_1_1 ) ) ( ( rule__Tareek__RefsAssignment_3_1_1 )* ) ) ;
    public final void rule__Tareek__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1924:1: ( ( ( ( rule__Tareek__RefsAssignment_3_1_1 ) ) ( ( rule__Tareek__RefsAssignment_3_1_1 )* ) ) )
            // InternalMatn.g:1925:1: ( ( ( rule__Tareek__RefsAssignment_3_1_1 ) ) ( ( rule__Tareek__RefsAssignment_3_1_1 )* ) )
            {
            // InternalMatn.g:1925:1: ( ( ( rule__Tareek__RefsAssignment_3_1_1 ) ) ( ( rule__Tareek__RefsAssignment_3_1_1 )* ) )
            // InternalMatn.g:1926:2: ( ( rule__Tareek__RefsAssignment_3_1_1 ) ) ( ( rule__Tareek__RefsAssignment_3_1_1 )* )
            {
            // InternalMatn.g:1926:2: ( ( rule__Tareek__RefsAssignment_3_1_1 ) )
            // InternalMatn.g:1927:3: ( rule__Tareek__RefsAssignment_3_1_1 )
            {
             before(grammarAccess.getTareekAccess().getRefsAssignment_3_1_1()); 
            // InternalMatn.g:1928:3: ( rule__Tareek__RefsAssignment_3_1_1 )
            // InternalMatn.g:1928:4: rule__Tareek__RefsAssignment_3_1_1
            {
            pushFollow(FOLLOW_21);
            rule__Tareek__RefsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTareekAccess().getRefsAssignment_3_1_1()); 

            }

            // InternalMatn.g:1931:2: ( ( rule__Tareek__RefsAssignment_3_1_1 )* )
            // InternalMatn.g:1932:3: ( rule__Tareek__RefsAssignment_3_1_1 )*
            {
             before(grammarAccess.getTareekAccess().getRefsAssignment_3_1_1()); 
            // InternalMatn.g:1933:3: ( rule__Tareek__RefsAssignment_3_1_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_KALEMAH) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMatn.g:1933:4: rule__Tareek__RefsAssignment_3_1_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Tareek__RefsAssignment_3_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMatn.g:1943:1: rule__Tareek__Group_3_1_0__0 : rule__Tareek__Group_3_1_0__0__Impl rule__Tareek__Group_3_1_0__1 ;
    public final void rule__Tareek__Group_3_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1947:1: ( rule__Tareek__Group_3_1_0__0__Impl rule__Tareek__Group_3_1_0__1 )
            // InternalMatn.g:1948:2: rule__Tareek__Group_3_1_0__0__Impl rule__Tareek__Group_3_1_0__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMatn.g:1955:1: rule__Tareek__Group_3_1_0__0__Impl : ( ( rule__Tareek__ComplexAssignment_3_1_0_0 ) ) ;
    public final void rule__Tareek__Group_3_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1959:1: ( ( ( rule__Tareek__ComplexAssignment_3_1_0_0 ) ) )
            // InternalMatn.g:1960:1: ( ( rule__Tareek__ComplexAssignment_3_1_0_0 ) )
            {
            // InternalMatn.g:1960:1: ( ( rule__Tareek__ComplexAssignment_3_1_0_0 ) )
            // InternalMatn.g:1961:2: ( rule__Tareek__ComplexAssignment_3_1_0_0 )
            {
             before(grammarAccess.getTareekAccess().getComplexAssignment_3_1_0_0()); 
            // InternalMatn.g:1962:2: ( rule__Tareek__ComplexAssignment_3_1_0_0 )
            // InternalMatn.g:1962:3: rule__Tareek__ComplexAssignment_3_1_0_0
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
    // InternalMatn.g:1970:1: rule__Tareek__Group_3_1_0__1 : rule__Tareek__Group_3_1_0__1__Impl ;
    public final void rule__Tareek__Group_3_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1974:1: ( rule__Tareek__Group_3_1_0__1__Impl )
            // InternalMatn.g:1975:2: rule__Tareek__Group_3_1_0__1__Impl
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
    // InternalMatn.g:1981:1: rule__Tareek__Group_3_1_0__1__Impl : ( '\\u0645\\u0646' ) ;
    public final void rule__Tareek__Group_3_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:1985:1: ( ( '\\u0645\\u0646' ) )
            // InternalMatn.g:1986:1: ( '\\u0645\\u0646' )
            {
            // InternalMatn.g:1986:1: ( '\\u0645\\u0646' )
            // InternalMatn.g:1987:2: '\\u0645\\u0646'
            {
             before(grammarAccess.getTareekAccess().getArabicLetterMeemArabicLetterNoonKeyword_3_1_0_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMatn.g:1997:1: rule__Kayd__Group__0 : rule__Kayd__Group__0__Impl rule__Kayd__Group__1 ;
    public final void rule__Kayd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2001:1: ( rule__Kayd__Group__0__Impl rule__Kayd__Group__1 )
            // InternalMatn.g:2002:2: rule__Kayd__Group__0__Impl rule__Kayd__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMatn.g:2009:1: rule__Kayd__Group__0__Impl : ( '\\u0642\\u064A\\u062F' ) ;
    public final void rule__Kayd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2013:1: ( ( '\\u0642\\u064A\\u062F' ) )
            // InternalMatn.g:2014:1: ( '\\u0642\\u064A\\u062F' )
            {
            // InternalMatn.g:2014:1: ( '\\u0642\\u064A\\u062F' )
            // InternalMatn.g:2015:2: '\\u0642\\u064A\\u062F'
            {
             before(grammarAccess.getKaydAccess().getArabicLetterQafArabicLetterYehArabicLetterDalKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMatn.g:2024:1: rule__Kayd__Group__1 : rule__Kayd__Group__1__Impl ;
    public final void rule__Kayd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2028:1: ( rule__Kayd__Group__1__Impl )
            // InternalMatn.g:2029:2: rule__Kayd__Group__1__Impl
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
    // InternalMatn.g:2035:1: rule__Kayd__Group__1__Impl : ( ( rule__Kayd__NameAssignment_1 ) ) ;
    public final void rule__Kayd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2039:1: ( ( ( rule__Kayd__NameAssignment_1 ) ) )
            // InternalMatn.g:2040:1: ( ( rule__Kayd__NameAssignment_1 ) )
            {
            // InternalMatn.g:2040:1: ( ( rule__Kayd__NameAssignment_1 ) )
            // InternalMatn.g:2041:2: ( rule__Kayd__NameAssignment_1 )
            {
             before(grammarAccess.getKaydAccess().getNameAssignment_1()); 
            // InternalMatn.g:2042:2: ( rule__Kayd__NameAssignment_1 )
            // InternalMatn.g:2042:3: rule__Kayd__NameAssignment_1
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
    // InternalMatn.g:2051:1: rule__Istelah__Group__0 : rule__Istelah__Group__0__Impl rule__Istelah__Group__1 ;
    public final void rule__Istelah__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2055:1: ( rule__Istelah__Group__0__Impl rule__Istelah__Group__1 )
            // InternalMatn.g:2056:2: rule__Istelah__Group__0__Impl rule__Istelah__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMatn.g:2063:1: rule__Istelah__Group__0__Impl : ( '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ) ;
    public final void rule__Istelah__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2067:1: ( ( '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ) )
            // InternalMatn.g:2068:1: ( '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' )
            {
            // InternalMatn.g:2068:1: ( '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' )
            // InternalMatn.g:2069:2: '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D'
            {
             before(grammarAccess.getIstelahAccess().getArabicLetterAlefArabicLetterSadArabicLetterTahArabicLetterLamArabicLetterAlefArabicLetterHahKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMatn.g:2078:1: rule__Istelah__Group__1 : rule__Istelah__Group__1__Impl rule__Istelah__Group__2 ;
    public final void rule__Istelah__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2082:1: ( rule__Istelah__Group__1__Impl rule__Istelah__Group__2 )
            // InternalMatn.g:2083:2: rule__Istelah__Group__1__Impl rule__Istelah__Group__2
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
    // InternalMatn.g:2090:1: rule__Istelah__Group__1__Impl : ( ( rule__Istelah__NameAssignment_1 ) ) ;
    public final void rule__Istelah__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2094:1: ( ( ( rule__Istelah__NameAssignment_1 ) ) )
            // InternalMatn.g:2095:1: ( ( rule__Istelah__NameAssignment_1 ) )
            {
            // InternalMatn.g:2095:1: ( ( rule__Istelah__NameAssignment_1 ) )
            // InternalMatn.g:2096:2: ( rule__Istelah__NameAssignment_1 )
            {
             before(grammarAccess.getIstelahAccess().getNameAssignment_1()); 
            // InternalMatn.g:2097:2: ( rule__Istelah__NameAssignment_1 )
            // InternalMatn.g:2097:3: rule__Istelah__NameAssignment_1
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
    // InternalMatn.g:2105:1: rule__Istelah__Group__2 : rule__Istelah__Group__2__Impl rule__Istelah__Group__3 ;
    public final void rule__Istelah__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2109:1: ( rule__Istelah__Group__2__Impl rule__Istelah__Group__3 )
            // InternalMatn.g:2110:2: rule__Istelah__Group__2__Impl rule__Istelah__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalMatn.g:2117:1: rule__Istelah__Group__2__Impl : ( '\\u064A\\u0639\\u0646\\u064A' ) ;
    public final void rule__Istelah__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2121:1: ( ( '\\u064A\\u0639\\u0646\\u064A' ) )
            // InternalMatn.g:2122:1: ( '\\u064A\\u0639\\u0646\\u064A' )
            {
            // InternalMatn.g:2122:1: ( '\\u064A\\u0639\\u0646\\u064A' )
            // InternalMatn.g:2123:2: '\\u064A\\u0639\\u0646\\u064A'
            {
             before(grammarAccess.getIstelahAccess().getArabicLetterYehArabicLetterAinArabicLetterNoonArabicLetterYehKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMatn.g:2132:1: rule__Istelah__Group__3 : rule__Istelah__Group__3__Impl rule__Istelah__Group__4 ;
    public final void rule__Istelah__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2136:1: ( rule__Istelah__Group__3__Impl rule__Istelah__Group__4 )
            // InternalMatn.g:2137:2: rule__Istelah__Group__3__Impl rule__Istelah__Group__4
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
    // InternalMatn.g:2144:1: rule__Istelah__Group__3__Impl : ( ( rule__Istelah__RefsAssignment_3 ) ) ;
    public final void rule__Istelah__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2148:1: ( ( ( rule__Istelah__RefsAssignment_3 ) ) )
            // InternalMatn.g:2149:1: ( ( rule__Istelah__RefsAssignment_3 ) )
            {
            // InternalMatn.g:2149:1: ( ( rule__Istelah__RefsAssignment_3 ) )
            // InternalMatn.g:2150:2: ( rule__Istelah__RefsAssignment_3 )
            {
             before(grammarAccess.getIstelahAccess().getRefsAssignment_3()); 
            // InternalMatn.g:2151:2: ( rule__Istelah__RefsAssignment_3 )
            // InternalMatn.g:2151:3: rule__Istelah__RefsAssignment_3
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
    // InternalMatn.g:2159:1: rule__Istelah__Group__4 : rule__Istelah__Group__4__Impl ;
    public final void rule__Istelah__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2163:1: ( rule__Istelah__Group__4__Impl )
            // InternalMatn.g:2164:2: rule__Istelah__Group__4__Impl
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
    // InternalMatn.g:2170:1: rule__Istelah__Group__4__Impl : ( ( rule__Istelah__Group_4__0 )* ) ;
    public final void rule__Istelah__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2174:1: ( ( ( rule__Istelah__Group_4__0 )* ) )
            // InternalMatn.g:2175:1: ( ( rule__Istelah__Group_4__0 )* )
            {
            // InternalMatn.g:2175:1: ( ( rule__Istelah__Group_4__0 )* )
            // InternalMatn.g:2176:2: ( rule__Istelah__Group_4__0 )*
            {
             before(grammarAccess.getIstelahAccess().getGroup_4()); 
            // InternalMatn.g:2177:2: ( rule__Istelah__Group_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==47) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMatn.g:2177:3: rule__Istelah__Group_4__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Istelah__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMatn.g:2186:1: rule__Istelah__Group_4__0 : rule__Istelah__Group_4__0__Impl rule__Istelah__Group_4__1 ;
    public final void rule__Istelah__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2190:1: ( rule__Istelah__Group_4__0__Impl rule__Istelah__Group_4__1 )
            // InternalMatn.g:2191:2: rule__Istelah__Group_4__0__Impl rule__Istelah__Group_4__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMatn.g:2198:1: rule__Istelah__Group_4__0__Impl : ( '\\u0648' ) ;
    public final void rule__Istelah__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2202:1: ( ( '\\u0648' ) )
            // InternalMatn.g:2203:1: ( '\\u0648' )
            {
            // InternalMatn.g:2203:1: ( '\\u0648' )
            // InternalMatn.g:2204:2: '\\u0648'
            {
             before(grammarAccess.getIstelahAccess().getArabicLetterWawKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMatn.g:2213:1: rule__Istelah__Group_4__1 : rule__Istelah__Group_4__1__Impl ;
    public final void rule__Istelah__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2217:1: ( rule__Istelah__Group_4__1__Impl )
            // InternalMatn.g:2218:2: rule__Istelah__Group_4__1__Impl
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
    // InternalMatn.g:2224:1: rule__Istelah__Group_4__1__Impl : ( ( rule__Istelah__RefsAssignment_4_1 ) ) ;
    public final void rule__Istelah__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2228:1: ( ( ( rule__Istelah__RefsAssignment_4_1 ) ) )
            // InternalMatn.g:2229:1: ( ( rule__Istelah__RefsAssignment_4_1 ) )
            {
            // InternalMatn.g:2229:1: ( ( rule__Istelah__RefsAssignment_4_1 ) )
            // InternalMatn.g:2230:2: ( rule__Istelah__RefsAssignment_4_1 )
            {
             before(grammarAccess.getIstelahAccess().getRefsAssignment_4_1()); 
            // InternalMatn.g:2231:2: ( rule__Istelah__RefsAssignment_4_1 )
            // InternalMatn.g:2231:3: rule__Istelah__RefsAssignment_4_1
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
    // InternalMatn.g:2240:1: rule__Ramz__Group__0 : rule__Ramz__Group__0__Impl rule__Ramz__Group__1 ;
    public final void rule__Ramz__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2244:1: ( rule__Ramz__Group__0__Impl rule__Ramz__Group__1 )
            // InternalMatn.g:2245:2: rule__Ramz__Group__0__Impl rule__Ramz__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMatn.g:2252:1: rule__Ramz__Group__0__Impl : ( '\\u0631\\u0645\\u0632' ) ;
    public final void rule__Ramz__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2256:1: ( ( '\\u0631\\u0645\\u0632' ) )
            // InternalMatn.g:2257:1: ( '\\u0631\\u0645\\u0632' )
            {
            // InternalMatn.g:2257:1: ( '\\u0631\\u0645\\u0632' )
            // InternalMatn.g:2258:2: '\\u0631\\u0645\\u0632'
            {
             before(grammarAccess.getRamzAccess().getArabicLetterRehArabicLetterMeemArabicLetterZainKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMatn.g:2267:1: rule__Ramz__Group__1 : rule__Ramz__Group__1__Impl rule__Ramz__Group__2 ;
    public final void rule__Ramz__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2271:1: ( rule__Ramz__Group__1__Impl rule__Ramz__Group__2 )
            // InternalMatn.g:2272:2: rule__Ramz__Group__1__Impl rule__Ramz__Group__2
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
    // InternalMatn.g:2279:1: rule__Ramz__Group__1__Impl : ( ( rule__Ramz__NameAssignment_1 ) ) ;
    public final void rule__Ramz__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2283:1: ( ( ( rule__Ramz__NameAssignment_1 ) ) )
            // InternalMatn.g:2284:1: ( ( rule__Ramz__NameAssignment_1 ) )
            {
            // InternalMatn.g:2284:1: ( ( rule__Ramz__NameAssignment_1 ) )
            // InternalMatn.g:2285:2: ( rule__Ramz__NameAssignment_1 )
            {
             before(grammarAccess.getRamzAccess().getNameAssignment_1()); 
            // InternalMatn.g:2286:2: ( rule__Ramz__NameAssignment_1 )
            // InternalMatn.g:2286:3: rule__Ramz__NameAssignment_1
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
    // InternalMatn.g:2294:1: rule__Ramz__Group__2 : rule__Ramz__Group__2__Impl rule__Ramz__Group__3 ;
    public final void rule__Ramz__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2298:1: ( rule__Ramz__Group__2__Impl rule__Ramz__Group__3 )
            // InternalMatn.g:2299:2: rule__Ramz__Group__2__Impl rule__Ramz__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalMatn.g:2306:1: rule__Ramz__Group__2__Impl : ( '\\u064A\\u0639\\u0646\\u064A' ) ;
    public final void rule__Ramz__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2310:1: ( ( '\\u064A\\u0639\\u0646\\u064A' ) )
            // InternalMatn.g:2311:1: ( '\\u064A\\u0639\\u0646\\u064A' )
            {
            // InternalMatn.g:2311:1: ( '\\u064A\\u0639\\u0646\\u064A' )
            // InternalMatn.g:2312:2: '\\u064A\\u0639\\u0646\\u064A'
            {
             before(grammarAccess.getRamzAccess().getArabicLetterYehArabicLetterAinArabicLetterNoonArabicLetterYehKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMatn.g:2321:1: rule__Ramz__Group__3 : rule__Ramz__Group__3__Impl rule__Ramz__Group__4 ;
    public final void rule__Ramz__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2325:1: ( rule__Ramz__Group__3__Impl rule__Ramz__Group__4 )
            // InternalMatn.g:2326:2: rule__Ramz__Group__3__Impl rule__Ramz__Group__4
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
    // InternalMatn.g:2333:1: rule__Ramz__Group__3__Impl : ( ( rule__Ramz__RefsAssignment_3 ) ) ;
    public final void rule__Ramz__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2337:1: ( ( ( rule__Ramz__RefsAssignment_3 ) ) )
            // InternalMatn.g:2338:1: ( ( rule__Ramz__RefsAssignment_3 ) )
            {
            // InternalMatn.g:2338:1: ( ( rule__Ramz__RefsAssignment_3 ) )
            // InternalMatn.g:2339:2: ( rule__Ramz__RefsAssignment_3 )
            {
             before(grammarAccess.getRamzAccess().getRefsAssignment_3()); 
            // InternalMatn.g:2340:2: ( rule__Ramz__RefsAssignment_3 )
            // InternalMatn.g:2340:3: rule__Ramz__RefsAssignment_3
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
    // InternalMatn.g:2348:1: rule__Ramz__Group__4 : rule__Ramz__Group__4__Impl ;
    public final void rule__Ramz__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2352:1: ( rule__Ramz__Group__4__Impl )
            // InternalMatn.g:2353:2: rule__Ramz__Group__4__Impl
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
    // InternalMatn.g:2359:1: rule__Ramz__Group__4__Impl : ( ( rule__Ramz__Group_4__0 )* ) ;
    public final void rule__Ramz__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2363:1: ( ( ( rule__Ramz__Group_4__0 )* ) )
            // InternalMatn.g:2364:1: ( ( rule__Ramz__Group_4__0 )* )
            {
            // InternalMatn.g:2364:1: ( ( rule__Ramz__Group_4__0 )* )
            // InternalMatn.g:2365:2: ( rule__Ramz__Group_4__0 )*
            {
             before(grammarAccess.getRamzAccess().getGroup_4()); 
            // InternalMatn.g:2366:2: ( rule__Ramz__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==47) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMatn.g:2366:3: rule__Ramz__Group_4__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Ramz__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalMatn.g:2375:1: rule__Ramz__Group_4__0 : rule__Ramz__Group_4__0__Impl rule__Ramz__Group_4__1 ;
    public final void rule__Ramz__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2379:1: ( rule__Ramz__Group_4__0__Impl rule__Ramz__Group_4__1 )
            // InternalMatn.g:2380:2: rule__Ramz__Group_4__0__Impl rule__Ramz__Group_4__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMatn.g:2387:1: rule__Ramz__Group_4__0__Impl : ( '\\u0648' ) ;
    public final void rule__Ramz__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2391:1: ( ( '\\u0648' ) )
            // InternalMatn.g:2392:1: ( '\\u0648' )
            {
            // InternalMatn.g:2392:1: ( '\\u0648' )
            // InternalMatn.g:2393:2: '\\u0648'
            {
             before(grammarAccess.getRamzAccess().getArabicLetterWawKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMatn.g:2402:1: rule__Ramz__Group_4__1 : rule__Ramz__Group_4__1__Impl ;
    public final void rule__Ramz__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2406:1: ( rule__Ramz__Group_4__1__Impl )
            // InternalMatn.g:2407:2: rule__Ramz__Group_4__1__Impl
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
    // InternalMatn.g:2413:1: rule__Ramz__Group_4__1__Impl : ( ( rule__Ramz__RefsAssignment_4_1 ) ) ;
    public final void rule__Ramz__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2417:1: ( ( ( rule__Ramz__RefsAssignment_4_1 ) ) )
            // InternalMatn.g:2418:1: ( ( rule__Ramz__RefsAssignment_4_1 ) )
            {
            // InternalMatn.g:2418:1: ( ( rule__Ramz__RefsAssignment_4_1 ) )
            // InternalMatn.g:2419:2: ( rule__Ramz__RefsAssignment_4_1 )
            {
             before(grammarAccess.getRamzAccess().getRefsAssignment_4_1()); 
            // InternalMatn.g:2420:2: ( rule__Ramz__RefsAssignment_4_1 )
            // InternalMatn.g:2420:3: rule__Ramz__RefsAssignment_4_1
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
    // InternalMatn.g:2429:1: rule__Harf__Group__0 : rule__Harf__Group__0__Impl rule__Harf__Group__1 ;
    public final void rule__Harf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2433:1: ( rule__Harf__Group__0__Impl rule__Harf__Group__1 )
            // InternalMatn.g:2434:2: rule__Harf__Group__0__Impl rule__Harf__Group__1
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
    // InternalMatn.g:2441:1: rule__Harf__Group__0__Impl : ( '\\u062D\\u0631\\u0641' ) ;
    public final void rule__Harf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2445:1: ( ( '\\u062D\\u0631\\u0641' ) )
            // InternalMatn.g:2446:1: ( '\\u062D\\u0631\\u0641' )
            {
            // InternalMatn.g:2446:1: ( '\\u062D\\u0631\\u0641' )
            // InternalMatn.g:2447:2: '\\u062D\\u0631\\u0641'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterHahArabicLetterRehArabicLetterFehKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMatn.g:2456:1: rule__Harf__Group__1 : rule__Harf__Group__1__Impl rule__Harf__Group__2 ;
    public final void rule__Harf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2460:1: ( rule__Harf__Group__1__Impl rule__Harf__Group__2 )
            // InternalMatn.g:2461:2: rule__Harf__Group__1__Impl rule__Harf__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMatn.g:2468:1: rule__Harf__Group__1__Impl : ( ( rule__Harf__NameAssignment_1 ) ) ;
    public final void rule__Harf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2472:1: ( ( ( rule__Harf__NameAssignment_1 ) ) )
            // InternalMatn.g:2473:1: ( ( rule__Harf__NameAssignment_1 ) )
            {
            // InternalMatn.g:2473:1: ( ( rule__Harf__NameAssignment_1 ) )
            // InternalMatn.g:2474:2: ( rule__Harf__NameAssignment_1 )
            {
             before(grammarAccess.getHarfAccess().getNameAssignment_1()); 
            // InternalMatn.g:2475:2: ( rule__Harf__NameAssignment_1 )
            // InternalMatn.g:2475:3: rule__Harf__NameAssignment_1
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
    // InternalMatn.g:2483:1: rule__Harf__Group__2 : rule__Harf__Group__2__Impl ;
    public final void rule__Harf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2487:1: ( rule__Harf__Group__2__Impl )
            // InternalMatn.g:2488:2: rule__Harf__Group__2__Impl
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
    // InternalMatn.g:2494:1: rule__Harf__Group__2__Impl : ( ( rule__Harf__Alternatives_2 ) ) ;
    public final void rule__Harf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2498:1: ( ( ( rule__Harf__Alternatives_2 ) ) )
            // InternalMatn.g:2499:1: ( ( rule__Harf__Alternatives_2 ) )
            {
            // InternalMatn.g:2499:1: ( ( rule__Harf__Alternatives_2 ) )
            // InternalMatn.g:2500:2: ( rule__Harf__Alternatives_2 )
            {
             before(grammarAccess.getHarfAccess().getAlternatives_2()); 
            // InternalMatn.g:2501:2: ( rule__Harf__Alternatives_2 )
            // InternalMatn.g:2501:3: rule__Harf__Alternatives_2
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
    // InternalMatn.g:2510:1: rule__Harf__Group_2_0__0 : rule__Harf__Group_2_0__0__Impl rule__Harf__Group_2_0__1 ;
    public final void rule__Harf__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2514:1: ( rule__Harf__Group_2_0__0__Impl rule__Harf__Group_2_0__1 )
            // InternalMatn.g:2515:2: rule__Harf__Group_2_0__0__Impl rule__Harf__Group_2_0__1
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
    // InternalMatn.g:2522:1: rule__Harf__Group_2_0__0__Impl : ( '\\u0647\\u0648' ) ;
    public final void rule__Harf__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2526:1: ( ( '\\u0647\\u0648' ) )
            // InternalMatn.g:2527:1: ( '\\u0647\\u0648' )
            {
            // InternalMatn.g:2527:1: ( '\\u0647\\u0648' )
            // InternalMatn.g:2528:2: '\\u0647\\u0648'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterHehArabicLetterWawKeyword_2_0_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMatn.g:2537:1: rule__Harf__Group_2_0__1 : rule__Harf__Group_2_0__1__Impl rule__Harf__Group_2_0__2 ;
    public final void rule__Harf__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2541:1: ( rule__Harf__Group_2_0__1__Impl rule__Harf__Group_2_0__2 )
            // InternalMatn.g:2542:2: rule__Harf__Group_2_0__1__Impl rule__Harf__Group_2_0__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMatn.g:2549:1: rule__Harf__Group_2_0__1__Impl : ( ( rule__Harf__ValuesAssignment_2_0_1 ) ) ;
    public final void rule__Harf__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2553:1: ( ( ( rule__Harf__ValuesAssignment_2_0_1 ) ) )
            // InternalMatn.g:2554:1: ( ( rule__Harf__ValuesAssignment_2_0_1 ) )
            {
            // InternalMatn.g:2554:1: ( ( rule__Harf__ValuesAssignment_2_0_1 ) )
            // InternalMatn.g:2555:2: ( rule__Harf__ValuesAssignment_2_0_1 )
            {
             before(grammarAccess.getHarfAccess().getValuesAssignment_2_0_1()); 
            // InternalMatn.g:2556:2: ( rule__Harf__ValuesAssignment_2_0_1 )
            // InternalMatn.g:2556:3: rule__Harf__ValuesAssignment_2_0_1
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
    // InternalMatn.g:2564:1: rule__Harf__Group_2_0__2 : rule__Harf__Group_2_0__2__Impl ;
    public final void rule__Harf__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2568:1: ( rule__Harf__Group_2_0__2__Impl )
            // InternalMatn.g:2569:2: rule__Harf__Group_2_0__2__Impl
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
    // InternalMatn.g:2575:1: rule__Harf__Group_2_0__2__Impl : ( ( rule__Harf__Group_2_0_2__0 )* ) ;
    public final void rule__Harf__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2579:1: ( ( ( rule__Harf__Group_2_0_2__0 )* ) )
            // InternalMatn.g:2580:1: ( ( rule__Harf__Group_2_0_2__0 )* )
            {
            // InternalMatn.g:2580:1: ( ( rule__Harf__Group_2_0_2__0 )* )
            // InternalMatn.g:2581:2: ( rule__Harf__Group_2_0_2__0 )*
            {
             before(grammarAccess.getHarfAccess().getGroup_2_0_2()); 
            // InternalMatn.g:2582:2: ( rule__Harf__Group_2_0_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==51) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMatn.g:2582:3: rule__Harf__Group_2_0_2__0
            	    {
            	    pushFollow(FOLLOW_28);
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
    // InternalMatn.g:2591:1: rule__Harf__Group_2_0_2__0 : rule__Harf__Group_2_0_2__0__Impl rule__Harf__Group_2_0_2__1 ;
    public final void rule__Harf__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2595:1: ( rule__Harf__Group_2_0_2__0__Impl rule__Harf__Group_2_0_2__1 )
            // InternalMatn.g:2596:2: rule__Harf__Group_2_0_2__0__Impl rule__Harf__Group_2_0_2__1
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
    // InternalMatn.g:2603:1: rule__Harf__Group_2_0_2__0__Impl : ( '\\u0623\\u0648' ) ;
    public final void rule__Harf__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2607:1: ( ( '\\u0623\\u0648' ) )
            // InternalMatn.g:2608:1: ( '\\u0623\\u0648' )
            {
            // InternalMatn.g:2608:1: ( '\\u0623\\u0648' )
            // InternalMatn.g:2609:2: '\\u0623\\u0648'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterAlefWithHamzaAboveArabicLetterWawKeyword_2_0_2_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMatn.g:2618:1: rule__Harf__Group_2_0_2__1 : rule__Harf__Group_2_0_2__1__Impl ;
    public final void rule__Harf__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2622:1: ( rule__Harf__Group_2_0_2__1__Impl )
            // InternalMatn.g:2623:2: rule__Harf__Group_2_0_2__1__Impl
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
    // InternalMatn.g:2629:1: rule__Harf__Group_2_0_2__1__Impl : ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) ) ;
    public final void rule__Harf__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2633:1: ( ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) ) )
            // InternalMatn.g:2634:1: ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) )
            {
            // InternalMatn.g:2634:1: ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) )
            // InternalMatn.g:2635:2: ( rule__Harf__ValuesAssignment_2_0_2_1 )
            {
             before(grammarAccess.getHarfAccess().getValuesAssignment_2_0_2_1()); 
            // InternalMatn.g:2636:2: ( rule__Harf__ValuesAssignment_2_0_2_1 )
            // InternalMatn.g:2636:3: rule__Harf__ValuesAssignment_2_0_2_1
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
    // InternalMatn.g:2645:1: rule__Harf__Group_2_1__0 : rule__Harf__Group_2_1__0__Impl rule__Harf__Group_2_1__1 ;
    public final void rule__Harf__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2649:1: ( rule__Harf__Group_2_1__0__Impl rule__Harf__Group_2_1__1 )
            // InternalMatn.g:2650:2: rule__Harf__Group_2_1__0__Impl rule__Harf__Group_2_1__1
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
    // InternalMatn.g:2657:1: rule__Harf__Group_2_1__0__Impl : ( '\\u0630\\u0627\\u062A\\u0647' ) ;
    public final void rule__Harf__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2661:1: ( ( '\\u0630\\u0627\\u062A\\u0647' ) )
            // InternalMatn.g:2662:1: ( '\\u0630\\u0627\\u062A\\u0647' )
            {
            // InternalMatn.g:2662:1: ( '\\u0630\\u0627\\u062A\\u0647' )
            // InternalMatn.g:2663:2: '\\u0630\\u0627\\u062A\\u0647'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterThalArabicLetterAlefArabicLetterTehArabicLetterHehKeyword_2_1_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMatn.g:2672:1: rule__Harf__Group_2_1__1 : rule__Harf__Group_2_1__1__Impl ;
    public final void rule__Harf__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2676:1: ( rule__Harf__Group_2_1__1__Impl )
            // InternalMatn.g:2677:2: rule__Harf__Group_2_1__1__Impl
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
    // InternalMatn.g:2683:1: rule__Harf__Group_2_1__1__Impl : ( ( rule__Harf__RefAssignment_2_1_1 ) ) ;
    public final void rule__Harf__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2687:1: ( ( ( rule__Harf__RefAssignment_2_1_1 ) ) )
            // InternalMatn.g:2688:1: ( ( rule__Harf__RefAssignment_2_1_1 ) )
            {
            // InternalMatn.g:2688:1: ( ( rule__Harf__RefAssignment_2_1_1 ) )
            // InternalMatn.g:2689:2: ( rule__Harf__RefAssignment_2_1_1 )
            {
             before(grammarAccess.getHarfAccess().getRefAssignment_2_1_1()); 
            // InternalMatn.g:2690:2: ( rule__Harf__RefAssignment_2_1_1 )
            // InternalMatn.g:2690:3: rule__Harf__RefAssignment_2_1_1
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
    // InternalMatn.g:2699:1: rule__Harakah__Group__0 : rule__Harakah__Group__0__Impl rule__Harakah__Group__1 ;
    public final void rule__Harakah__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2703:1: ( rule__Harakah__Group__0__Impl rule__Harakah__Group__1 )
            // InternalMatn.g:2704:2: rule__Harakah__Group__0__Impl rule__Harakah__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMatn.g:2711:1: rule__Harakah__Group__0__Impl : ( '\\u062D\\u0631\\u0643\\u0629' ) ;
    public final void rule__Harakah__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2715:1: ( ( '\\u062D\\u0631\\u0643\\u0629' ) )
            // InternalMatn.g:2716:1: ( '\\u062D\\u0631\\u0643\\u0629' )
            {
            // InternalMatn.g:2716:1: ( '\\u062D\\u0631\\u0643\\u0629' )
            // InternalMatn.g:2717:2: '\\u062D\\u0631\\u0643\\u0629'
            {
             before(grammarAccess.getHarakahAccess().getArabicLetterHahArabicLetterRehArabicLetterKafArabicLetterTehMarbutaKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMatn.g:2726:1: rule__Harakah__Group__1 : rule__Harakah__Group__1__Impl rule__Harakah__Group__2 ;
    public final void rule__Harakah__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2730:1: ( rule__Harakah__Group__1__Impl rule__Harakah__Group__2 )
            // InternalMatn.g:2731:2: rule__Harakah__Group__1__Impl rule__Harakah__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalMatn.g:2738:1: rule__Harakah__Group__1__Impl : ( ( rule__Harakah__NameAssignment_1 ) ) ;
    public final void rule__Harakah__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2742:1: ( ( ( rule__Harakah__NameAssignment_1 ) ) )
            // InternalMatn.g:2743:1: ( ( rule__Harakah__NameAssignment_1 ) )
            {
            // InternalMatn.g:2743:1: ( ( rule__Harakah__NameAssignment_1 ) )
            // InternalMatn.g:2744:2: ( rule__Harakah__NameAssignment_1 )
            {
             before(grammarAccess.getHarakahAccess().getNameAssignment_1()); 
            // InternalMatn.g:2745:2: ( rule__Harakah__NameAssignment_1 )
            // InternalMatn.g:2745:3: rule__Harakah__NameAssignment_1
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
    // InternalMatn.g:2753:1: rule__Harakah__Group__2 : rule__Harakah__Group__2__Impl rule__Harakah__Group__3 ;
    public final void rule__Harakah__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2757:1: ( rule__Harakah__Group__2__Impl rule__Harakah__Group__3 )
            // InternalMatn.g:2758:2: rule__Harakah__Group__2__Impl rule__Harakah__Group__3
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
    // InternalMatn.g:2765:1: rule__Harakah__Group__2__Impl : ( '\\u0647\\u064A' ) ;
    public final void rule__Harakah__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2769:1: ( ( '\\u0647\\u064A' ) )
            // InternalMatn.g:2770:1: ( '\\u0647\\u064A' )
            {
            // InternalMatn.g:2770:1: ( '\\u0647\\u064A' )
            // InternalMatn.g:2771:2: '\\u0647\\u064A'
            {
             before(grammarAccess.getHarakahAccess().getArabicLetterHehArabicLetterYehKeyword_2()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMatn.g:2780:1: rule__Harakah__Group__3 : rule__Harakah__Group__3__Impl ;
    public final void rule__Harakah__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2784:1: ( rule__Harakah__Group__3__Impl )
            // InternalMatn.g:2785:2: rule__Harakah__Group__3__Impl
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
    // InternalMatn.g:2791:1: rule__Harakah__Group__3__Impl : ( ( rule__Harakah__ValueAssignment_3 ) ) ;
    public final void rule__Harakah__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2795:1: ( ( ( rule__Harakah__ValueAssignment_3 ) ) )
            // InternalMatn.g:2796:1: ( ( rule__Harakah__ValueAssignment_3 ) )
            {
            // InternalMatn.g:2796:1: ( ( rule__Harakah__ValueAssignment_3 ) )
            // InternalMatn.g:2797:2: ( rule__Harakah__ValueAssignment_3 )
            {
             before(grammarAccess.getHarakahAccess().getValueAssignment_3()); 
            // InternalMatn.g:2798:2: ( rule__Harakah__ValueAssignment_3 )
            // InternalMatn.g:2798:3: rule__Harakah__ValueAssignment_3
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
    // InternalMatn.g:2807:1: rule__AyahStart__Group__0 : rule__AyahStart__Group__0__Impl rule__AyahStart__Group__1 ;
    public final void rule__AyahStart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2811:1: ( rule__AyahStart__Group__0__Impl rule__AyahStart__Group__1 )
            // InternalMatn.g:2812:2: rule__AyahStart__Group__0__Impl rule__AyahStart__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMatn.g:2819:1: rule__AyahStart__Group__0__Impl : ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ) ;
    public final void rule__AyahStart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2823:1: ( ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ) )
            // InternalMatn.g:2824:1: ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' )
            {
            // InternalMatn.g:2824:1: ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' )
            // InternalMatn.g:2825:2: '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'
            {
             before(grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterSeenArabicLetterWawArabicLetterRehArabicLetterTehMarbutaKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMatn.g:2834:1: rule__AyahStart__Group__1 : rule__AyahStart__Group__1__Impl rule__AyahStart__Group__2 ;
    public final void rule__AyahStart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2838:1: ( rule__AyahStart__Group__1__Impl rule__AyahStart__Group__2 )
            // InternalMatn.g:2839:2: rule__AyahStart__Group__1__Impl rule__AyahStart__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalMatn.g:2846:1: rule__AyahStart__Group__1__Impl : ( ( rule__AyahStart__SurahAssignment_1 ) ) ;
    public final void rule__AyahStart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2850:1: ( ( ( rule__AyahStart__SurahAssignment_1 ) ) )
            // InternalMatn.g:2851:1: ( ( rule__AyahStart__SurahAssignment_1 ) )
            {
            // InternalMatn.g:2851:1: ( ( rule__AyahStart__SurahAssignment_1 ) )
            // InternalMatn.g:2852:2: ( rule__AyahStart__SurahAssignment_1 )
            {
             before(grammarAccess.getAyahStartAccess().getSurahAssignment_1()); 
            // InternalMatn.g:2853:2: ( rule__AyahStart__SurahAssignment_1 )
            // InternalMatn.g:2853:3: rule__AyahStart__SurahAssignment_1
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
    // InternalMatn.g:2861:1: rule__AyahStart__Group__2 : rule__AyahStart__Group__2__Impl rule__AyahStart__Group__3 ;
    public final void rule__AyahStart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2865:1: ( rule__AyahStart__Group__2__Impl rule__AyahStart__Group__3 )
            // InternalMatn.g:2866:2: rule__AyahStart__Group__2__Impl rule__AyahStart__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMatn.g:2873:1: rule__AyahStart__Group__2__Impl : ( '\\u0627\\u0644\\u0622\\u064A\\u0629' ) ;
    public final void rule__AyahStart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2877:1: ( ( '\\u0627\\u0644\\u0622\\u064A\\u0629' ) )
            // InternalMatn.g:2878:1: ( '\\u0627\\u0644\\u0622\\u064A\\u0629' )
            {
            // InternalMatn.g:2878:1: ( '\\u0627\\u0644\\u0622\\u064A\\u0629' )
            // InternalMatn.g:2879:2: '\\u0627\\u0644\\u0622\\u064A\\u0629'
            {
             before(grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithMaddaAboveArabicLetterYehArabicLetterTehMarbutaKeyword_2()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMatn.g:2888:1: rule__AyahStart__Group__3 : rule__AyahStart__Group__3__Impl rule__AyahStart__Group__4 ;
    public final void rule__AyahStart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2892:1: ( rule__AyahStart__Group__3__Impl rule__AyahStart__Group__4 )
            // InternalMatn.g:2893:2: rule__AyahStart__Group__3__Impl rule__AyahStart__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalMatn.g:2900:1: rule__AyahStart__Group__3__Impl : ( ( rule__AyahStart__AyahAssignment_3 ) ) ;
    public final void rule__AyahStart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2904:1: ( ( ( rule__AyahStart__AyahAssignment_3 ) ) )
            // InternalMatn.g:2905:1: ( ( rule__AyahStart__AyahAssignment_3 ) )
            {
            // InternalMatn.g:2905:1: ( ( rule__AyahStart__AyahAssignment_3 ) )
            // InternalMatn.g:2906:2: ( rule__AyahStart__AyahAssignment_3 )
            {
             before(grammarAccess.getAyahStartAccess().getAyahAssignment_3()); 
            // InternalMatn.g:2907:2: ( rule__AyahStart__AyahAssignment_3 )
            // InternalMatn.g:2907:3: rule__AyahStart__AyahAssignment_3
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
    // InternalMatn.g:2915:1: rule__AyahStart__Group__4 : rule__AyahStart__Group__4__Impl ;
    public final void rule__AyahStart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2919:1: ( rule__AyahStart__Group__4__Impl )
            // InternalMatn.g:2920:2: rule__AyahStart__Group__4__Impl
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
    // InternalMatn.g:2926:1: rule__AyahStart__Group__4__Impl : ( ( rule__AyahStart__NameAssignment_4 ) ) ;
    public final void rule__AyahStart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2930:1: ( ( ( rule__AyahStart__NameAssignment_4 ) ) )
            // InternalMatn.g:2931:1: ( ( rule__AyahStart__NameAssignment_4 ) )
            {
            // InternalMatn.g:2931:1: ( ( rule__AyahStart__NameAssignment_4 ) )
            // InternalMatn.g:2932:2: ( rule__AyahStart__NameAssignment_4 )
            {
             before(grammarAccess.getAyahStartAccess().getNameAssignment_4()); 
            // InternalMatn.g:2933:2: ( rule__AyahStart__NameAssignment_4 )
            // InternalMatn.g:2933:3: rule__AyahStart__NameAssignment_4
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
    // InternalMatn.g:2942:1: rule__Phrase__Group__0 : rule__Phrase__Group__0__Impl rule__Phrase__Group__1 ;
    public final void rule__Phrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2946:1: ( rule__Phrase__Group__0__Impl rule__Phrase__Group__1 )
            // InternalMatn.g:2947:2: rule__Phrase__Group__0__Impl rule__Phrase__Group__1
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
    // InternalMatn.g:2954:1: rule__Phrase__Group__0__Impl : ( ( rule__Phrase__BasmalahAssignment_0 )? ) ;
    public final void rule__Phrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2958:1: ( ( ( rule__Phrase__BasmalahAssignment_0 )? ) )
            // InternalMatn.g:2959:1: ( ( rule__Phrase__BasmalahAssignment_0 )? )
            {
            // InternalMatn.g:2959:1: ( ( rule__Phrase__BasmalahAssignment_0 )? )
            // InternalMatn.g:2960:2: ( rule__Phrase__BasmalahAssignment_0 )?
            {
             before(grammarAccess.getPhraseAccess().getBasmalahAssignment_0()); 
            // InternalMatn.g:2961:2: ( rule__Phrase__BasmalahAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_BASMALAH) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMatn.g:2961:3: rule__Phrase__BasmalahAssignment_0
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
    // InternalMatn.g:2969:1: rule__Phrase__Group__1 : rule__Phrase__Group__1__Impl ;
    public final void rule__Phrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2973:1: ( rule__Phrase__Group__1__Impl )
            // InternalMatn.g:2974:2: rule__Phrase__Group__1__Impl
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
    // InternalMatn.g:2980:1: rule__Phrase__Group__1__Impl : ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) ) ;
    public final void rule__Phrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:2984:1: ( ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) ) )
            // InternalMatn.g:2985:1: ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) )
            {
            // InternalMatn.g:2985:1: ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) )
            // InternalMatn.g:2986:2: ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* )
            {
            // InternalMatn.g:2986:2: ( ( rule__Phrase__WordsAssignment_1 ) )
            // InternalMatn.g:2987:3: ( rule__Phrase__WordsAssignment_1 )
            {
             before(grammarAccess.getPhraseAccess().getWordsAssignment_1()); 
            // InternalMatn.g:2988:3: ( rule__Phrase__WordsAssignment_1 )
            // InternalMatn.g:2988:4: rule__Phrase__WordsAssignment_1
            {
            pushFollow(FOLLOW_3);
            rule__Phrase__WordsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getWordsAssignment_1()); 

            }

            // InternalMatn.g:2991:2: ( ( rule__Phrase__WordsAssignment_1 )* )
            // InternalMatn.g:2992:3: ( rule__Phrase__WordsAssignment_1 )*
            {
             before(grammarAccess.getPhraseAccess().getWordsAssignment_1()); 
            // InternalMatn.g:2993:3: ( rule__Phrase__WordsAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_AWORD) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMatn.g:2993:4: rule__Phrase__WordsAssignment_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Phrase__WordsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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


    // $ANTLR start "rule__MatnModel__MatnAssignment"
    // InternalMatn.g:3003:1: rule__MatnModel__MatnAssignment : ( ruleMatn ) ;
    public final void rule__MatnModel__MatnAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3007:1: ( ( ruleMatn ) )
            // InternalMatn.g:3008:2: ( ruleMatn )
            {
            // InternalMatn.g:3008:2: ( ruleMatn )
            // InternalMatn.g:3009:3: ruleMatn
            {
             before(grammarAccess.getMatnModelAccess().getMatnMatnParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMatn();

            state._fsp--;

             after(grammarAccess.getMatnModelAccess().getMatnMatnParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatnModel__MatnAssignment"


    // $ANTLR start "rule__Matn__NameAssignment_1"
    // InternalMatn.g:3018:1: rule__Matn__NameAssignment_1 : ( ruleAWORDS ) ;
    public final void rule__Matn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3022:1: ( ( ruleAWORDS ) )
            // InternalMatn.g:3023:2: ( ruleAWORDS )
            {
            // InternalMatn.g:3023:2: ( ruleAWORDS )
            // InternalMatn.g:3024:3: ruleAWORDS
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
    // InternalMatn.g:3033:1: rule__Matn__MakatehAssignment_2 : ( ruleMaktah ) ;
    public final void rule__Matn__MakatehAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3037:1: ( ( ruleMaktah ) )
            // InternalMatn.g:3038:2: ( ruleMaktah )
            {
            // InternalMatn.g:3038:2: ( ruleMaktah )
            // InternalMatn.g:3039:3: ruleMaktah
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
    // InternalMatn.g:3048:1: rule__Maktah__NameAssignment_3 : ( ruleAWORDS ) ;
    public final void rule__Maktah__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3052:1: ( ( ruleAWORDS ) )
            // InternalMatn.g:3053:2: ( ruleAWORDS )
            {
            // InternalMatn.g:3053:2: ( ruleAWORDS )
            // InternalMatn.g:3054:3: ruleAWORDS
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
    // InternalMatn.g:3063:1: rule__Maktah__AbyatCountAssignment_5 : ( RULE_INT ) ;
    public final void rule__Maktah__AbyatCountAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3067:1: ( ( RULE_INT ) )
            // InternalMatn.g:3068:2: ( RULE_INT )
            {
            // InternalMatn.g:3068:2: ( RULE_INT )
            // InternalMatn.g:3069:3: RULE_INT
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
    // InternalMatn.g:3078:1: rule__Maktah__AbyatAssignment_7 : ( ruleBayt ) ;
    public final void rule__Maktah__AbyatAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3082:1: ( ( ruleBayt ) )
            // InternalMatn.g:3083:2: ( ruleBayt )
            {
            // InternalMatn.g:3083:2: ( ruleBayt )
            // InternalMatn.g:3084:3: ruleBayt
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
    // InternalMatn.g:3093:1: rule__Bayt__RakmAssignment_0 : ( RULE_INT ) ;
    public final void rule__Bayt__RakmAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3097:1: ( ( RULE_INT ) )
            // InternalMatn.g:3098:2: ( RULE_INT )
            {
            // InternalMatn.g:3098:2: ( RULE_INT )
            // InternalMatn.g:3099:3: RULE_INT
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
    // InternalMatn.g:3108:1: rule__Bayt__SadrAssignment_2 : ( RULE_AWORD ) ;
    public final void rule__Bayt__SadrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3112:1: ( ( RULE_AWORD ) )
            // InternalMatn.g:3113:2: ( RULE_AWORD )
            {
            // InternalMatn.g:3113:2: ( RULE_AWORD )
            // InternalMatn.g:3114:3: RULE_AWORD
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
    // InternalMatn.g:3123:1: rule__Bayt__AjozAssignment_4 : ( RULE_AWORD ) ;
    public final void rule__Bayt__AjozAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3127:1: ( ( RULE_AWORD ) )
            // InternalMatn.g:3128:2: ( RULE_AWORD )
            {
            // InternalMatn.g:3128:2: ( RULE_AWORD )
            // InternalMatn.g:3129:3: RULE_AWORD
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
    // InternalMatn.g:3138:1: rule__Person__NameAssignment_0 : ( RULE_KALEMAH ) ;
    public final void rule__Person__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3142:1: ( ( RULE_KALEMAH ) )
            // InternalMatn.g:3143:2: ( RULE_KALEMAH )
            {
            // InternalMatn.g:3143:2: ( RULE_KALEMAH )
            // InternalMatn.g:3144:3: RULE_KALEMAH
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
    // InternalMatn.g:3153:1: rule__Person__EsmAssignment_1_1 : ( RULE_KALEMAH ) ;
    public final void rule__Person__EsmAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3157:1: ( ( RULE_KALEMAH ) )
            // InternalMatn.g:3158:2: ( RULE_KALEMAH )
            {
            // InternalMatn.g:3158:2: ( RULE_KALEMAH )
            // InternalMatn.g:3159:3: RULE_KALEMAH
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
    // InternalMatn.g:3168:1: rule__Person__LakabAssignment_2_1 : ( RULE_KALEMAH ) ;
    public final void rule__Person__LakabAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3172:1: ( ( RULE_KALEMAH ) )
            // InternalMatn.g:3173:2: ( RULE_KALEMAH )
            {
            // InternalMatn.g:3173:2: ( RULE_KALEMAH )
            // InternalMatn.g:3174:3: RULE_KALEMAH
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
    // InternalMatn.g:3183:1: rule__Person__TowofiaAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Person__TowofiaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3187:1: ( ( RULE_INT ) )
            // InternalMatn.g:3188:2: ( RULE_INT )
            {
            // InternalMatn.g:3188:2: ( RULE_INT )
            // InternalMatn.g:3189:3: RULE_INT
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
    // InternalMatn.g:3198:1: rule__Douaa__DAssignment_0 : ( ( rule__Douaa__DAlternatives_0_0 ) ) ;
    public final void rule__Douaa__DAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3202:1: ( ( ( rule__Douaa__DAlternatives_0_0 ) ) )
            // InternalMatn.g:3203:2: ( ( rule__Douaa__DAlternatives_0_0 ) )
            {
            // InternalMatn.g:3203:2: ( ( rule__Douaa__DAlternatives_0_0 ) )
            // InternalMatn.g:3204:3: ( rule__Douaa__DAlternatives_0_0 )
            {
             before(grammarAccess.getDouaaAccess().getDAlternatives_0_0()); 
            // InternalMatn.g:3205:3: ( rule__Douaa__DAlternatives_0_0 )
            // InternalMatn.g:3205:4: rule__Douaa__DAlternatives_0_0
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
    // InternalMatn.g:3213:1: rule__Rawee__QareeAssignment_3 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Rawee__QareeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3217:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalMatn.g:3218:2: ( ( RULE_KALEMAH ) )
            {
            // InternalMatn.g:3218:2: ( ( RULE_KALEMAH ) )
            // InternalMatn.g:3219:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getRaweeAccess().getQareeQareeCrossReference_3_0()); 
            // InternalMatn.g:3220:3: ( RULE_KALEMAH )
            // InternalMatn.g:3221:4: RULE_KALEMAH
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
    // InternalMatn.g:3232:1: rule__Tareek__NameAssignment_2 : ( RULE_KALEMAH ) ;
    public final void rule__Tareek__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3236:1: ( ( RULE_KALEMAH ) )
            // InternalMatn.g:3237:2: ( RULE_KALEMAH )
            {
            // InternalMatn.g:3237:2: ( RULE_KALEMAH )
            // InternalMatn.g:3238:3: RULE_KALEMAH
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
    // InternalMatn.g:3247:1: rule__Tareek__SimpleAssignment_3_0_0 : ( ( '\\u062E\\u0627\\u0644\\u0635' ) ) ;
    public final void rule__Tareek__SimpleAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3251:1: ( ( ( '\\u062E\\u0627\\u0644\\u0635' ) ) )
            // InternalMatn.g:3252:2: ( ( '\\u062E\\u0627\\u0644\\u0635' ) )
            {
            // InternalMatn.g:3252:2: ( ( '\\u062E\\u0627\\u0644\\u0635' ) )
            // InternalMatn.g:3253:3: ( '\\u062E\\u0627\\u0644\\u0635' )
            {
             before(grammarAccess.getTareekAccess().getSimpleArabicLetterKhahArabicLetterAlefArabicLetterLamArabicLetterSadKeyword_3_0_0_0()); 
            // InternalMatn.g:3254:3: ( '\\u062E\\u0627\\u0644\\u0635' )
            // InternalMatn.g:3255:4: '\\u062E\\u0627\\u0644\\u0635'
            {
             before(grammarAccess.getTareekAccess().getSimpleArabicLetterKhahArabicLetterAlefArabicLetterLamArabicLetterSadKeyword_3_0_0_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMatn.g:3266:1: rule__Tareek__RefAssignment_3_0_2 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Tareek__RefAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3270:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalMatn.g:3271:2: ( ( RULE_KALEMAH ) )
            {
            // InternalMatn.g:3271:2: ( ( RULE_KALEMAH ) )
            // InternalMatn.g:3272:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getTareekAccess().getRefYokraaLahCrossReference_3_0_2_0()); 
            // InternalMatn.g:3273:3: ( RULE_KALEMAH )
            // InternalMatn.g:3274:4: RULE_KALEMAH
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
    // InternalMatn.g:3285:1: rule__Tareek__ComplexAssignment_3_1_0_0 : ( ( '\\u0645\\u0631\\u0643\\u0628' ) ) ;
    public final void rule__Tareek__ComplexAssignment_3_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3289:1: ( ( ( '\\u0645\\u0631\\u0643\\u0628' ) ) )
            // InternalMatn.g:3290:2: ( ( '\\u0645\\u0631\\u0643\\u0628' ) )
            {
            // InternalMatn.g:3290:2: ( ( '\\u0645\\u0631\\u0643\\u0628' ) )
            // InternalMatn.g:3291:3: ( '\\u0645\\u0631\\u0643\\u0628' )
            {
             before(grammarAccess.getTareekAccess().getComplexArabicLetterMeemArabicLetterRehArabicLetterKafArabicLetterBehKeyword_3_1_0_0_0()); 
            // InternalMatn.g:3292:3: ( '\\u0645\\u0631\\u0643\\u0628' )
            // InternalMatn.g:3293:4: '\\u0645\\u0631\\u0643\\u0628'
            {
             before(grammarAccess.getTareekAccess().getComplexArabicLetterMeemArabicLetterRehArabicLetterKafArabicLetterBehKeyword_3_1_0_0_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalMatn.g:3304:1: rule__Tareek__RefsAssignment_3_1_1 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Tareek__RefsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3308:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalMatn.g:3309:2: ( ( RULE_KALEMAH ) )
            {
            // InternalMatn.g:3309:2: ( ( RULE_KALEMAH ) )
            // InternalMatn.g:3310:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getTareekAccess().getRefsTareekCrossReference_3_1_1_0()); 
            // InternalMatn.g:3311:3: ( RULE_KALEMAH )
            // InternalMatn.g:3312:4: RULE_KALEMAH
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
    // InternalMatn.g:3323:1: rule__Kayd__NameAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Kayd__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3327:1: ( ( RULE_KALEMAH ) )
            // InternalMatn.g:3328:2: ( RULE_KALEMAH )
            {
            // InternalMatn.g:3328:2: ( RULE_KALEMAH )
            // InternalMatn.g:3329:3: RULE_KALEMAH
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
    // InternalMatn.g:3338:1: rule__Istelah__NameAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Istelah__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3342:1: ( ( RULE_KALEMAH ) )
            // InternalMatn.g:3343:2: ( RULE_KALEMAH )
            {
            // InternalMatn.g:3343:2: ( RULE_KALEMAH )
            // InternalMatn.g:3344:3: RULE_KALEMAH
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
    // InternalMatn.g:3353:1: rule__Istelah__RefsAssignment_3 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Istelah__RefsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3357:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalMatn.g:3358:2: ( ( RULE_KALEMAH ) )
            {
            // InternalMatn.g:3358:2: ( ( RULE_KALEMAH ) )
            // InternalMatn.g:3359:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getIstelahAccess().getRefsYokraaLahCrossReference_3_0()); 
            // InternalMatn.g:3360:3: ( RULE_KALEMAH )
            // InternalMatn.g:3361:4: RULE_KALEMAH
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
    // InternalMatn.g:3372:1: rule__Istelah__RefsAssignment_4_1 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Istelah__RefsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3376:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalMatn.g:3377:2: ( ( RULE_KALEMAH ) )
            {
            // InternalMatn.g:3377:2: ( ( RULE_KALEMAH ) )
            // InternalMatn.g:3378:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getIstelahAccess().getRefsYokraaLahCrossReference_4_1_0()); 
            // InternalMatn.g:3379:3: ( RULE_KALEMAH )
            // InternalMatn.g:3380:4: RULE_KALEMAH
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
    // InternalMatn.g:3391:1: rule__Ramz__NameAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Ramz__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3395:1: ( ( RULE_KALEMAH ) )
            // InternalMatn.g:3396:2: ( RULE_KALEMAH )
            {
            // InternalMatn.g:3396:2: ( RULE_KALEMAH )
            // InternalMatn.g:3397:3: RULE_KALEMAH
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
    // InternalMatn.g:3406:1: rule__Ramz__RefsAssignment_3 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Ramz__RefsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3410:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalMatn.g:3411:2: ( ( RULE_KALEMAH ) )
            {
            // InternalMatn.g:3411:2: ( ( RULE_KALEMAH ) )
            // InternalMatn.g:3412:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getRamzAccess().getRefsYokraaLahCrossReference_3_0()); 
            // InternalMatn.g:3413:3: ( RULE_KALEMAH )
            // InternalMatn.g:3414:4: RULE_KALEMAH
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
    // InternalMatn.g:3425:1: rule__Ramz__RefsAssignment_4_1 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Ramz__RefsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3429:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalMatn.g:3430:2: ( ( RULE_KALEMAH ) )
            {
            // InternalMatn.g:3430:2: ( ( RULE_KALEMAH ) )
            // InternalMatn.g:3431:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getRamzAccess().getRefsYokraaLahCrossReference_4_1_0()); 
            // InternalMatn.g:3432:3: ( RULE_KALEMAH )
            // InternalMatn.g:3433:4: RULE_KALEMAH
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
    // InternalMatn.g:3444:1: rule__Harf__NameAssignment_1 : ( RULE_AWORD ) ;
    public final void rule__Harf__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3448:1: ( ( RULE_AWORD ) )
            // InternalMatn.g:3449:2: ( RULE_AWORD )
            {
            // InternalMatn.g:3449:2: ( RULE_AWORD )
            // InternalMatn.g:3450:3: RULE_AWORD
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
    // InternalMatn.g:3459:1: rule__Harf__ValuesAssignment_2_0_1 : ( RULE_AWORD ) ;
    public final void rule__Harf__ValuesAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3463:1: ( ( RULE_AWORD ) )
            // InternalMatn.g:3464:2: ( RULE_AWORD )
            {
            // InternalMatn.g:3464:2: ( RULE_AWORD )
            // InternalMatn.g:3465:3: RULE_AWORD
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
    // InternalMatn.g:3474:1: rule__Harf__ValuesAssignment_2_0_2_1 : ( RULE_AWORD ) ;
    public final void rule__Harf__ValuesAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3478:1: ( ( RULE_AWORD ) )
            // InternalMatn.g:3479:2: ( RULE_AWORD )
            {
            // InternalMatn.g:3479:2: ( RULE_AWORD )
            // InternalMatn.g:3480:3: RULE_AWORD
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
    // InternalMatn.g:3489:1: rule__Harf__RefAssignment_2_1_1 : ( ( RULE_AWORD ) ) ;
    public final void rule__Harf__RefAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3493:1: ( ( ( RULE_AWORD ) ) )
            // InternalMatn.g:3494:2: ( ( RULE_AWORD ) )
            {
            // InternalMatn.g:3494:2: ( ( RULE_AWORD ) )
            // InternalMatn.g:3495:3: ( RULE_AWORD )
            {
             before(grammarAccess.getHarfAccess().getRefHarfCrossReference_2_1_1_0()); 
            // InternalMatn.g:3496:3: ( RULE_AWORD )
            // InternalMatn.g:3497:4: RULE_AWORD
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
    // InternalMatn.g:3508:1: rule__Harakah__NameAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Harakah__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3512:1: ( ( RULE_KALEMAH ) )
            // InternalMatn.g:3513:2: ( RULE_KALEMAH )
            {
            // InternalMatn.g:3513:2: ( RULE_KALEMAH )
            // InternalMatn.g:3514:3: RULE_KALEMAH
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
    // InternalMatn.g:3523:1: rule__Harakah__ValueAssignment_3 : ( RULE_AWORD ) ;
    public final void rule__Harakah__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3527:1: ( ( RULE_AWORD ) )
            // InternalMatn.g:3528:2: ( RULE_AWORD )
            {
            // InternalMatn.g:3528:2: ( RULE_AWORD )
            // InternalMatn.g:3529:3: RULE_AWORD
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
    // InternalMatn.g:3538:1: rule__AyahStart__SurahAssignment_1 : ( RULE_INT ) ;
    public final void rule__AyahStart__SurahAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3542:1: ( ( RULE_INT ) )
            // InternalMatn.g:3543:2: ( RULE_INT )
            {
            // InternalMatn.g:3543:2: ( RULE_INT )
            // InternalMatn.g:3544:3: RULE_INT
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
    // InternalMatn.g:3553:1: rule__AyahStart__AyahAssignment_3 : ( RULE_INT ) ;
    public final void rule__AyahStart__AyahAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3557:1: ( ( RULE_INT ) )
            // InternalMatn.g:3558:2: ( RULE_INT )
            {
            // InternalMatn.g:3558:2: ( RULE_INT )
            // InternalMatn.g:3559:3: RULE_INT
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
    // InternalMatn.g:3568:1: rule__AyahStart__NameAssignment_4 : ( RULE_KALEMAH ) ;
    public final void rule__AyahStart__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3572:1: ( ( RULE_KALEMAH ) )
            // InternalMatn.g:3573:2: ( RULE_KALEMAH )
            {
            // InternalMatn.g:3573:2: ( RULE_KALEMAH )
            // InternalMatn.g:3574:3: RULE_KALEMAH
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
    // InternalMatn.g:3583:1: rule__Phrase__BasmalahAssignment_0 : ( RULE_BASMALAH ) ;
    public final void rule__Phrase__BasmalahAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3587:1: ( ( RULE_BASMALAH ) )
            // InternalMatn.g:3588:2: ( RULE_BASMALAH )
            {
            // InternalMatn.g:3588:2: ( RULE_BASMALAH )
            // InternalMatn.g:3589:3: RULE_BASMALAH
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
    // InternalMatn.g:3598:1: rule__Phrase__WordsAssignment_1 : ( RULE_AWORD ) ;
    public final void rule__Phrase__WordsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMatn.g:3602:1: ( ( RULE_AWORD ) )
            // InternalMatn.g:3603:2: ( RULE_AWORD )
            {
            // InternalMatn.g:3603:2: ( RULE_AWORD )
            // InternalMatn.g:3604:3: RULE_AWORD
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0100000000000000L});

}