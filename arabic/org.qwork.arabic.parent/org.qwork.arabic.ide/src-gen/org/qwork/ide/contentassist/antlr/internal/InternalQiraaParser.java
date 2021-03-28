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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_AWORD", "RULE_ALETTER", "RULE_KALEMAH", "RULE_AHARAKAH", "RULE_ADIGITS", "RULE_ADIGIT", "RULE_ASHADDAH", "RULE_ANONLETTER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'\\u062D\\u0631\\u0641'", "'\\u0647\\u0648'", "'\\u0623\\u0648'", "'\\u0630\\u0627\\u062A\\u0647'", "'\\u062D\\u0631\\u0643\\u0629'", "'\\u0647\\u064A'", "'\\u0642\\u0627\\u0631\\u0626'", "'\\u0631\\u0627\\u0648'", "'\\u0639\\u0646'", "'\\u0627\\u0633\\u0645\\u0647'", "'\\u0644\\u0642\\u0628\\u0647'", "'\\u062A\\u0648\\u0641\\u064A'", "'\\u0637\\u0631\\u064A\\u0642'", "'\\u0645\\u0646'"
    };
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

                if ( (LA1_0==19||LA1_0==23||(LA1_0>=25 && LA1_0<=26)||LA1_0==31) ) {
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


    // $ANTLR start "entryRuleHarf"
    // InternalQiraa.g:78:1: entryRuleHarf : ruleHarf EOF ;
    public final void entryRuleHarf() throws RecognitionException {
        try {
            // InternalQiraa.g:79:1: ( ruleHarf EOF )
            // InternalQiraa.g:80:1: ruleHarf EOF
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
    // InternalQiraa.g:87:1: ruleHarf : ( ( rule__Harf__Group__0 ) ) ;
    public final void ruleHarf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:91:2: ( ( ( rule__Harf__Group__0 ) ) )
            // InternalQiraa.g:92:2: ( ( rule__Harf__Group__0 ) )
            {
            // InternalQiraa.g:92:2: ( ( rule__Harf__Group__0 ) )
            // InternalQiraa.g:93:3: ( rule__Harf__Group__0 )
            {
             before(grammarAccess.getHarfAccess().getGroup()); 
            // InternalQiraa.g:94:3: ( rule__Harf__Group__0 )
            // InternalQiraa.g:94:4: rule__Harf__Group__0
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
    // InternalQiraa.g:103:1: entryRuleHarakah : ruleHarakah EOF ;
    public final void entryRuleHarakah() throws RecognitionException {
        try {
            // InternalQiraa.g:104:1: ( ruleHarakah EOF )
            // InternalQiraa.g:105:1: ruleHarakah EOF
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
    // InternalQiraa.g:112:1: ruleHarakah : ( ( rule__Harakah__Group__0 ) ) ;
    public final void ruleHarakah() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:116:2: ( ( ( rule__Harakah__Group__0 ) ) )
            // InternalQiraa.g:117:2: ( ( rule__Harakah__Group__0 ) )
            {
            // InternalQiraa.g:117:2: ( ( rule__Harakah__Group__0 ) )
            // InternalQiraa.g:118:3: ( rule__Harakah__Group__0 )
            {
             before(grammarAccess.getHarakahAccess().getGroup()); 
            // InternalQiraa.g:119:3: ( rule__Harakah__Group__0 )
            // InternalQiraa.g:119:4: rule__Harakah__Group__0
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


    // $ANTLR start "entryRuleQaree"
    // InternalQiraa.g:128:1: entryRuleQaree : ruleQaree EOF ;
    public final void entryRuleQaree() throws RecognitionException {
        try {
            // InternalQiraa.g:129:1: ( ruleQaree EOF )
            // InternalQiraa.g:130:1: ruleQaree EOF
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
    // InternalQiraa.g:137:1: ruleQaree : ( ( rule__Qaree__Group__0 ) ) ;
    public final void ruleQaree() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:141:2: ( ( ( rule__Qaree__Group__0 ) ) )
            // InternalQiraa.g:142:2: ( ( rule__Qaree__Group__0 ) )
            {
            // InternalQiraa.g:142:2: ( ( rule__Qaree__Group__0 ) )
            // InternalQiraa.g:143:3: ( rule__Qaree__Group__0 )
            {
             before(grammarAccess.getQareeAccess().getGroup()); 
            // InternalQiraa.g:144:3: ( rule__Qaree__Group__0 )
            // InternalQiraa.g:144:4: rule__Qaree__Group__0
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
    // InternalQiraa.g:153:1: entryRuleRawee : ruleRawee EOF ;
    public final void entryRuleRawee() throws RecognitionException {
        try {
            // InternalQiraa.g:154:1: ( ruleRawee EOF )
            // InternalQiraa.g:155:1: ruleRawee EOF
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
    // InternalQiraa.g:162:1: ruleRawee : ( ( rule__Rawee__Group__0 ) ) ;
    public final void ruleRawee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:166:2: ( ( ( rule__Rawee__Group__0 ) ) )
            // InternalQiraa.g:167:2: ( ( rule__Rawee__Group__0 ) )
            {
            // InternalQiraa.g:167:2: ( ( rule__Rawee__Group__0 ) )
            // InternalQiraa.g:168:3: ( rule__Rawee__Group__0 )
            {
             before(grammarAccess.getRaweeAccess().getGroup()); 
            // InternalQiraa.g:169:3: ( rule__Rawee__Group__0 )
            // InternalQiraa.g:169:4: rule__Rawee__Group__0
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


    // $ANTLR start "rulePerson"
    // InternalQiraa.g:179:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:183:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalQiraa.g:184:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalQiraa.g:184:2: ( ( rule__Person__Group__0 ) )
            // InternalQiraa.g:185:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalQiraa.g:186:3: ( rule__Person__Group__0 )
            // InternalQiraa.g:186:4: rule__Person__Group__0
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


    // $ANTLR start "entryRuleTareek"
    // InternalQiraa.g:195:1: entryRuleTareek : ruleTareek EOF ;
    public final void entryRuleTareek() throws RecognitionException {
        try {
            // InternalQiraa.g:196:1: ( ruleTareek EOF )
            // InternalQiraa.g:197:1: ruleTareek EOF
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
    // InternalQiraa.g:204:1: ruleTareek : ( ( rule__Tareek__Group__0 ) ) ;
    public final void ruleTareek() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:208:2: ( ( ( rule__Tareek__Group__0 ) ) )
            // InternalQiraa.g:209:2: ( ( rule__Tareek__Group__0 ) )
            {
            // InternalQiraa.g:209:2: ( ( rule__Tareek__Group__0 ) )
            // InternalQiraa.g:210:3: ( rule__Tareek__Group__0 )
            {
             before(grammarAccess.getTareekAccess().getGroup()); 
            // InternalQiraa.g:211:3: ( rule__Tareek__Group__0 )
            // InternalQiraa.g:211:4: rule__Tareek__Group__0
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


    // $ANTLR start "entryRulePhrase"
    // InternalQiraa.g:220:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // InternalQiraa.g:221:1: ( rulePhrase EOF )
            // InternalQiraa.g:222:1: rulePhrase EOF
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
    // InternalQiraa.g:229:1: rulePhrase : ( ( rule__Phrase__Group__0 ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:233:2: ( ( ( rule__Phrase__Group__0 ) ) )
            // InternalQiraa.g:234:2: ( ( rule__Phrase__Group__0 ) )
            {
            // InternalQiraa.g:234:2: ( ( rule__Phrase__Group__0 ) )
            // InternalQiraa.g:235:3: ( rule__Phrase__Group__0 )
            {
             before(grammarAccess.getPhraseAccess().getGroup()); 
            // InternalQiraa.g:236:3: ( rule__Phrase__Group__0 )
            // InternalQiraa.g:236:4: rule__Phrase__Group__0
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
    // InternalQiraa.g:244:1: rule__QiraaModel__Alternatives : ( ( ( rule__QiraaModel__HouroufAssignment_0 ) ) | ( ( rule__QiraaModel__QoraaAssignment_1 ) ) | ( ( rule__QiraaModel__TorokAssignment_2 ) ) | ( ( rule__QiraaModel__HarakatAssignment_3 ) ) | ( ( rule__QiraaModel__RowatAssignment_4 ) ) );
    public final void rule__QiraaModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:248:1: ( ( ( rule__QiraaModel__HouroufAssignment_0 ) ) | ( ( rule__QiraaModel__QoraaAssignment_1 ) ) | ( ( rule__QiraaModel__TorokAssignment_2 ) ) | ( ( rule__QiraaModel__HarakatAssignment_3 ) ) | ( ( rule__QiraaModel__RowatAssignment_4 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 31:
                {
                alt2=3;
                }
                break;
            case 23:
                {
                alt2=4;
                }
                break;
            case 26:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQiraa.g:249:2: ( ( rule__QiraaModel__HouroufAssignment_0 ) )
                    {
                    // InternalQiraa.g:249:2: ( ( rule__QiraaModel__HouroufAssignment_0 ) )
                    // InternalQiraa.g:250:3: ( rule__QiraaModel__HouroufAssignment_0 )
                    {
                     before(grammarAccess.getQiraaModelAccess().getHouroufAssignment_0()); 
                    // InternalQiraa.g:251:3: ( rule__QiraaModel__HouroufAssignment_0 )
                    // InternalQiraa.g:251:4: rule__QiraaModel__HouroufAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QiraaModel__HouroufAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQiraaModelAccess().getHouroufAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQiraa.g:255:2: ( ( rule__QiraaModel__QoraaAssignment_1 ) )
                    {
                    // InternalQiraa.g:255:2: ( ( rule__QiraaModel__QoraaAssignment_1 ) )
                    // InternalQiraa.g:256:3: ( rule__QiraaModel__QoraaAssignment_1 )
                    {
                     before(grammarAccess.getQiraaModelAccess().getQoraaAssignment_1()); 
                    // InternalQiraa.g:257:3: ( rule__QiraaModel__QoraaAssignment_1 )
                    // InternalQiraa.g:257:4: rule__QiraaModel__QoraaAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__QiraaModel__QoraaAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getQiraaModelAccess().getQoraaAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQiraa.g:261:2: ( ( rule__QiraaModel__TorokAssignment_2 ) )
                    {
                    // InternalQiraa.g:261:2: ( ( rule__QiraaModel__TorokAssignment_2 ) )
                    // InternalQiraa.g:262:3: ( rule__QiraaModel__TorokAssignment_2 )
                    {
                     before(grammarAccess.getQiraaModelAccess().getTorokAssignment_2()); 
                    // InternalQiraa.g:263:3: ( rule__QiraaModel__TorokAssignment_2 )
                    // InternalQiraa.g:263:4: rule__QiraaModel__TorokAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__QiraaModel__TorokAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getQiraaModelAccess().getTorokAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQiraa.g:267:2: ( ( rule__QiraaModel__HarakatAssignment_3 ) )
                    {
                    // InternalQiraa.g:267:2: ( ( rule__QiraaModel__HarakatAssignment_3 ) )
                    // InternalQiraa.g:268:3: ( rule__QiraaModel__HarakatAssignment_3 )
                    {
                     before(grammarAccess.getQiraaModelAccess().getHarakatAssignment_3()); 
                    // InternalQiraa.g:269:3: ( rule__QiraaModel__HarakatAssignment_3 )
                    // InternalQiraa.g:269:4: rule__QiraaModel__HarakatAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__QiraaModel__HarakatAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getQiraaModelAccess().getHarakatAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQiraa.g:273:2: ( ( rule__QiraaModel__RowatAssignment_4 ) )
                    {
                    // InternalQiraa.g:273:2: ( ( rule__QiraaModel__RowatAssignment_4 ) )
                    // InternalQiraa.g:274:3: ( rule__QiraaModel__RowatAssignment_4 )
                    {
                     before(grammarAccess.getQiraaModelAccess().getRowatAssignment_4()); 
                    // InternalQiraa.g:275:3: ( rule__QiraaModel__RowatAssignment_4 )
                    // InternalQiraa.g:275:4: rule__QiraaModel__RowatAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__QiraaModel__RowatAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getQiraaModelAccess().getRowatAssignment_4()); 

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


    // $ANTLR start "rule__Harf__Alternatives_2"
    // InternalQiraa.g:283:1: rule__Harf__Alternatives_2 : ( ( ( rule__Harf__Group_2_0__0 ) ) | ( ( rule__Harf__Group_2_1__0 ) ) );
    public final void rule__Harf__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:287:1: ( ( ( rule__Harf__Group_2_0__0 ) ) | ( ( rule__Harf__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
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
                    // InternalQiraa.g:288:2: ( ( rule__Harf__Group_2_0__0 ) )
                    {
                    // InternalQiraa.g:288:2: ( ( rule__Harf__Group_2_0__0 ) )
                    // InternalQiraa.g:289:3: ( rule__Harf__Group_2_0__0 )
                    {
                     before(grammarAccess.getHarfAccess().getGroup_2_0()); 
                    // InternalQiraa.g:290:3: ( rule__Harf__Group_2_0__0 )
                    // InternalQiraa.g:290:4: rule__Harf__Group_2_0__0
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
                    // InternalQiraa.g:294:2: ( ( rule__Harf__Group_2_1__0 ) )
                    {
                    // InternalQiraa.g:294:2: ( ( rule__Harf__Group_2_1__0 ) )
                    // InternalQiraa.g:295:3: ( rule__Harf__Group_2_1__0 )
                    {
                     before(grammarAccess.getHarfAccess().getGroup_2_1()); 
                    // InternalQiraa.g:296:3: ( rule__Harf__Group_2_1__0 )
                    // InternalQiraa.g:296:4: rule__Harf__Group_2_1__0
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
    // InternalQiraa.g:304:1: rule__Harf__Group__0 : rule__Harf__Group__0__Impl rule__Harf__Group__1 ;
    public final void rule__Harf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:308:1: ( rule__Harf__Group__0__Impl rule__Harf__Group__1 )
            // InternalQiraa.g:309:2: rule__Harf__Group__0__Impl rule__Harf__Group__1
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
    // InternalQiraa.g:316:1: rule__Harf__Group__0__Impl : ( '\\u062D\\u0631\\u0641' ) ;
    public final void rule__Harf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:320:1: ( ( '\\u062D\\u0631\\u0641' ) )
            // InternalQiraa.g:321:1: ( '\\u062D\\u0631\\u0641' )
            {
            // InternalQiraa.g:321:1: ( '\\u062D\\u0631\\u0641' )
            // InternalQiraa.g:322:2: '\\u062D\\u0631\\u0641'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterHahArabicLetterRehArabicLetterFehKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalQiraa.g:331:1: rule__Harf__Group__1 : rule__Harf__Group__1__Impl rule__Harf__Group__2 ;
    public final void rule__Harf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:335:1: ( rule__Harf__Group__1__Impl rule__Harf__Group__2 )
            // InternalQiraa.g:336:2: rule__Harf__Group__1__Impl rule__Harf__Group__2
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
    // InternalQiraa.g:343:1: rule__Harf__Group__1__Impl : ( ( rule__Harf__NameAssignment_1 ) ) ;
    public final void rule__Harf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:347:1: ( ( ( rule__Harf__NameAssignment_1 ) ) )
            // InternalQiraa.g:348:1: ( ( rule__Harf__NameAssignment_1 ) )
            {
            // InternalQiraa.g:348:1: ( ( rule__Harf__NameAssignment_1 ) )
            // InternalQiraa.g:349:2: ( rule__Harf__NameAssignment_1 )
            {
             before(grammarAccess.getHarfAccess().getNameAssignment_1()); 
            // InternalQiraa.g:350:2: ( rule__Harf__NameAssignment_1 )
            // InternalQiraa.g:350:3: rule__Harf__NameAssignment_1
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
    // InternalQiraa.g:358:1: rule__Harf__Group__2 : rule__Harf__Group__2__Impl ;
    public final void rule__Harf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:362:1: ( rule__Harf__Group__2__Impl )
            // InternalQiraa.g:363:2: rule__Harf__Group__2__Impl
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
    // InternalQiraa.g:369:1: rule__Harf__Group__2__Impl : ( ( rule__Harf__Alternatives_2 ) ) ;
    public final void rule__Harf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:373:1: ( ( ( rule__Harf__Alternatives_2 ) ) )
            // InternalQiraa.g:374:1: ( ( rule__Harf__Alternatives_2 ) )
            {
            // InternalQiraa.g:374:1: ( ( rule__Harf__Alternatives_2 ) )
            // InternalQiraa.g:375:2: ( rule__Harf__Alternatives_2 )
            {
             before(grammarAccess.getHarfAccess().getAlternatives_2()); 
            // InternalQiraa.g:376:2: ( rule__Harf__Alternatives_2 )
            // InternalQiraa.g:376:3: rule__Harf__Alternatives_2
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
    // InternalQiraa.g:385:1: rule__Harf__Group_2_0__0 : rule__Harf__Group_2_0__0__Impl rule__Harf__Group_2_0__1 ;
    public final void rule__Harf__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:389:1: ( rule__Harf__Group_2_0__0__Impl rule__Harf__Group_2_0__1 )
            // InternalQiraa.g:390:2: rule__Harf__Group_2_0__0__Impl rule__Harf__Group_2_0__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalQiraa.g:397:1: rule__Harf__Group_2_0__0__Impl : ( '\\u0647\\u0648' ) ;
    public final void rule__Harf__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:401:1: ( ( '\\u0647\\u0648' ) )
            // InternalQiraa.g:402:1: ( '\\u0647\\u0648' )
            {
            // InternalQiraa.g:402:1: ( '\\u0647\\u0648' )
            // InternalQiraa.g:403:2: '\\u0647\\u0648'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterHehArabicLetterWawKeyword_2_0_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalQiraa.g:412:1: rule__Harf__Group_2_0__1 : rule__Harf__Group_2_0__1__Impl rule__Harf__Group_2_0__2 ;
    public final void rule__Harf__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:416:1: ( rule__Harf__Group_2_0__1__Impl rule__Harf__Group_2_0__2 )
            // InternalQiraa.g:417:2: rule__Harf__Group_2_0__1__Impl rule__Harf__Group_2_0__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalQiraa.g:424:1: rule__Harf__Group_2_0__1__Impl : ( ( rule__Harf__ValuesAssignment_2_0_1 ) ) ;
    public final void rule__Harf__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:428:1: ( ( ( rule__Harf__ValuesAssignment_2_0_1 ) ) )
            // InternalQiraa.g:429:1: ( ( rule__Harf__ValuesAssignment_2_0_1 ) )
            {
            // InternalQiraa.g:429:1: ( ( rule__Harf__ValuesAssignment_2_0_1 ) )
            // InternalQiraa.g:430:2: ( rule__Harf__ValuesAssignment_2_0_1 )
            {
             before(grammarAccess.getHarfAccess().getValuesAssignment_2_0_1()); 
            // InternalQiraa.g:431:2: ( rule__Harf__ValuesAssignment_2_0_1 )
            // InternalQiraa.g:431:3: rule__Harf__ValuesAssignment_2_0_1
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
    // InternalQiraa.g:439:1: rule__Harf__Group_2_0__2 : rule__Harf__Group_2_0__2__Impl ;
    public final void rule__Harf__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:443:1: ( rule__Harf__Group_2_0__2__Impl )
            // InternalQiraa.g:444:2: rule__Harf__Group_2_0__2__Impl
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
    // InternalQiraa.g:450:1: rule__Harf__Group_2_0__2__Impl : ( ( rule__Harf__Group_2_0_2__0 )* ) ;
    public final void rule__Harf__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:454:1: ( ( ( rule__Harf__Group_2_0_2__0 )* ) )
            // InternalQiraa.g:455:1: ( ( rule__Harf__Group_2_0_2__0 )* )
            {
            // InternalQiraa.g:455:1: ( ( rule__Harf__Group_2_0_2__0 )* )
            // InternalQiraa.g:456:2: ( rule__Harf__Group_2_0_2__0 )*
            {
             before(grammarAccess.getHarfAccess().getGroup_2_0_2()); 
            // InternalQiraa.g:457:2: ( rule__Harf__Group_2_0_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalQiraa.g:457:3: rule__Harf__Group_2_0_2__0
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalQiraa.g:466:1: rule__Harf__Group_2_0_2__0 : rule__Harf__Group_2_0_2__0__Impl rule__Harf__Group_2_0_2__1 ;
    public final void rule__Harf__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:470:1: ( rule__Harf__Group_2_0_2__0__Impl rule__Harf__Group_2_0_2__1 )
            // InternalQiraa.g:471:2: rule__Harf__Group_2_0_2__0__Impl rule__Harf__Group_2_0_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalQiraa.g:478:1: rule__Harf__Group_2_0_2__0__Impl : ( '\\u0623\\u0648' ) ;
    public final void rule__Harf__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:482:1: ( ( '\\u0623\\u0648' ) )
            // InternalQiraa.g:483:1: ( '\\u0623\\u0648' )
            {
            // InternalQiraa.g:483:1: ( '\\u0623\\u0648' )
            // InternalQiraa.g:484:2: '\\u0623\\u0648'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterAlefWithHamzaAboveArabicLetterWawKeyword_2_0_2_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalQiraa.g:493:1: rule__Harf__Group_2_0_2__1 : rule__Harf__Group_2_0_2__1__Impl ;
    public final void rule__Harf__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:497:1: ( rule__Harf__Group_2_0_2__1__Impl )
            // InternalQiraa.g:498:2: rule__Harf__Group_2_0_2__1__Impl
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
    // InternalQiraa.g:504:1: rule__Harf__Group_2_0_2__1__Impl : ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) ) ;
    public final void rule__Harf__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:508:1: ( ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) ) )
            // InternalQiraa.g:509:1: ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) )
            {
            // InternalQiraa.g:509:1: ( ( rule__Harf__ValuesAssignment_2_0_2_1 ) )
            // InternalQiraa.g:510:2: ( rule__Harf__ValuesAssignment_2_0_2_1 )
            {
             before(grammarAccess.getHarfAccess().getValuesAssignment_2_0_2_1()); 
            // InternalQiraa.g:511:2: ( rule__Harf__ValuesAssignment_2_0_2_1 )
            // InternalQiraa.g:511:3: rule__Harf__ValuesAssignment_2_0_2_1
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
    // InternalQiraa.g:520:1: rule__Harf__Group_2_1__0 : rule__Harf__Group_2_1__0__Impl rule__Harf__Group_2_1__1 ;
    public final void rule__Harf__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:524:1: ( rule__Harf__Group_2_1__0__Impl rule__Harf__Group_2_1__1 )
            // InternalQiraa.g:525:2: rule__Harf__Group_2_1__0__Impl rule__Harf__Group_2_1__1
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
    // InternalQiraa.g:532:1: rule__Harf__Group_2_1__0__Impl : ( '\\u0630\\u0627\\u062A\\u0647' ) ;
    public final void rule__Harf__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:536:1: ( ( '\\u0630\\u0627\\u062A\\u0647' ) )
            // InternalQiraa.g:537:1: ( '\\u0630\\u0627\\u062A\\u0647' )
            {
            // InternalQiraa.g:537:1: ( '\\u0630\\u0627\\u062A\\u0647' )
            // InternalQiraa.g:538:2: '\\u0630\\u0627\\u062A\\u0647'
            {
             before(grammarAccess.getHarfAccess().getArabicLetterThalArabicLetterAlefArabicLetterTehArabicLetterHehKeyword_2_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalQiraa.g:547:1: rule__Harf__Group_2_1__1 : rule__Harf__Group_2_1__1__Impl ;
    public final void rule__Harf__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:551:1: ( rule__Harf__Group_2_1__1__Impl )
            // InternalQiraa.g:552:2: rule__Harf__Group_2_1__1__Impl
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
    // InternalQiraa.g:558:1: rule__Harf__Group_2_1__1__Impl : ( ( rule__Harf__RefAssignment_2_1_1 ) ) ;
    public final void rule__Harf__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:562:1: ( ( ( rule__Harf__RefAssignment_2_1_1 ) ) )
            // InternalQiraa.g:563:1: ( ( rule__Harf__RefAssignment_2_1_1 ) )
            {
            // InternalQiraa.g:563:1: ( ( rule__Harf__RefAssignment_2_1_1 ) )
            // InternalQiraa.g:564:2: ( rule__Harf__RefAssignment_2_1_1 )
            {
             before(grammarAccess.getHarfAccess().getRefAssignment_2_1_1()); 
            // InternalQiraa.g:565:2: ( rule__Harf__RefAssignment_2_1_1 )
            // InternalQiraa.g:565:3: rule__Harf__RefAssignment_2_1_1
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
    // InternalQiraa.g:574:1: rule__Harakah__Group__0 : rule__Harakah__Group__0__Impl rule__Harakah__Group__1 ;
    public final void rule__Harakah__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:578:1: ( rule__Harakah__Group__0__Impl rule__Harakah__Group__1 )
            // InternalQiraa.g:579:2: rule__Harakah__Group__0__Impl rule__Harakah__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQiraa.g:586:1: rule__Harakah__Group__0__Impl : ( '\\u062D\\u0631\\u0643\\u0629' ) ;
    public final void rule__Harakah__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:590:1: ( ( '\\u062D\\u0631\\u0643\\u0629' ) )
            // InternalQiraa.g:591:1: ( '\\u062D\\u0631\\u0643\\u0629' )
            {
            // InternalQiraa.g:591:1: ( '\\u062D\\u0631\\u0643\\u0629' )
            // InternalQiraa.g:592:2: '\\u062D\\u0631\\u0643\\u0629'
            {
             before(grammarAccess.getHarakahAccess().getArabicLetterHahArabicLetterRehArabicLetterKafArabicLetterTehMarbutaKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalQiraa.g:601:1: rule__Harakah__Group__1 : rule__Harakah__Group__1__Impl rule__Harakah__Group__2 ;
    public final void rule__Harakah__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:605:1: ( rule__Harakah__Group__1__Impl rule__Harakah__Group__2 )
            // InternalQiraa.g:606:2: rule__Harakah__Group__1__Impl rule__Harakah__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalQiraa.g:613:1: rule__Harakah__Group__1__Impl : ( ( rule__Harakah__NameAssignment_1 ) ) ;
    public final void rule__Harakah__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:617:1: ( ( ( rule__Harakah__NameAssignment_1 ) ) )
            // InternalQiraa.g:618:1: ( ( rule__Harakah__NameAssignment_1 ) )
            {
            // InternalQiraa.g:618:1: ( ( rule__Harakah__NameAssignment_1 ) )
            // InternalQiraa.g:619:2: ( rule__Harakah__NameAssignment_1 )
            {
             before(grammarAccess.getHarakahAccess().getNameAssignment_1()); 
            // InternalQiraa.g:620:2: ( rule__Harakah__NameAssignment_1 )
            // InternalQiraa.g:620:3: rule__Harakah__NameAssignment_1
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
    // InternalQiraa.g:628:1: rule__Harakah__Group__2 : rule__Harakah__Group__2__Impl rule__Harakah__Group__3 ;
    public final void rule__Harakah__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:632:1: ( rule__Harakah__Group__2__Impl rule__Harakah__Group__3 )
            // InternalQiraa.g:633:2: rule__Harakah__Group__2__Impl rule__Harakah__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalQiraa.g:640:1: rule__Harakah__Group__2__Impl : ( '\\u0647\\u064A' ) ;
    public final void rule__Harakah__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:644:1: ( ( '\\u0647\\u064A' ) )
            // InternalQiraa.g:645:1: ( '\\u0647\\u064A' )
            {
            // InternalQiraa.g:645:1: ( '\\u0647\\u064A' )
            // InternalQiraa.g:646:2: '\\u0647\\u064A'
            {
             before(grammarAccess.getHarakahAccess().getArabicLetterHehArabicLetterYehKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalQiraa.g:655:1: rule__Harakah__Group__3 : rule__Harakah__Group__3__Impl ;
    public final void rule__Harakah__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:659:1: ( rule__Harakah__Group__3__Impl )
            // InternalQiraa.g:660:2: rule__Harakah__Group__3__Impl
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
    // InternalQiraa.g:666:1: rule__Harakah__Group__3__Impl : ( ( rule__Harakah__ValueAssignment_3 ) ) ;
    public final void rule__Harakah__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:670:1: ( ( ( rule__Harakah__ValueAssignment_3 ) ) )
            // InternalQiraa.g:671:1: ( ( rule__Harakah__ValueAssignment_3 ) )
            {
            // InternalQiraa.g:671:1: ( ( rule__Harakah__ValueAssignment_3 ) )
            // InternalQiraa.g:672:2: ( rule__Harakah__ValueAssignment_3 )
            {
             before(grammarAccess.getHarakahAccess().getValueAssignment_3()); 
            // InternalQiraa.g:673:2: ( rule__Harakah__ValueAssignment_3 )
            // InternalQiraa.g:673:3: rule__Harakah__ValueAssignment_3
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


    // $ANTLR start "rule__Qaree__Group__0"
    // InternalQiraa.g:682:1: rule__Qaree__Group__0 : rule__Qaree__Group__0__Impl rule__Qaree__Group__1 ;
    public final void rule__Qaree__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:686:1: ( rule__Qaree__Group__0__Impl rule__Qaree__Group__1 )
            // InternalQiraa.g:687:2: rule__Qaree__Group__0__Impl rule__Qaree__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQiraa.g:694:1: rule__Qaree__Group__0__Impl : ( '\\u0642\\u0627\\u0631\\u0626' ) ;
    public final void rule__Qaree__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:698:1: ( ( '\\u0642\\u0627\\u0631\\u0626' ) )
            // InternalQiraa.g:699:1: ( '\\u0642\\u0627\\u0631\\u0626' )
            {
            // InternalQiraa.g:699:1: ( '\\u0642\\u0627\\u0631\\u0626' )
            // InternalQiraa.g:700:2: '\\u0642\\u0627\\u0631\\u0626'
            {
             before(grammarAccess.getQareeAccess().getArabicLetterQafArabicLetterAlefArabicLetterRehArabicLetterYehWithHamzaAboveKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalQiraa.g:709:1: rule__Qaree__Group__1 : rule__Qaree__Group__1__Impl ;
    public final void rule__Qaree__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:713:1: ( rule__Qaree__Group__1__Impl )
            // InternalQiraa.g:714:2: rule__Qaree__Group__1__Impl
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
    // InternalQiraa.g:720:1: rule__Qaree__Group__1__Impl : ( rulePerson ) ;
    public final void rule__Qaree__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:724:1: ( ( rulePerson ) )
            // InternalQiraa.g:725:1: ( rulePerson )
            {
            // InternalQiraa.g:725:1: ( rulePerson )
            // InternalQiraa.g:726:2: rulePerson
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
    // InternalQiraa.g:736:1: rule__Rawee__Group__0 : rule__Rawee__Group__0__Impl rule__Rawee__Group__1 ;
    public final void rule__Rawee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:740:1: ( rule__Rawee__Group__0__Impl rule__Rawee__Group__1 )
            // InternalQiraa.g:741:2: rule__Rawee__Group__0__Impl rule__Rawee__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQiraa.g:748:1: rule__Rawee__Group__0__Impl : ( '\\u0631\\u0627\\u0648' ) ;
    public final void rule__Rawee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:752:1: ( ( '\\u0631\\u0627\\u0648' ) )
            // InternalQiraa.g:753:1: ( '\\u0631\\u0627\\u0648' )
            {
            // InternalQiraa.g:753:1: ( '\\u0631\\u0627\\u0648' )
            // InternalQiraa.g:754:2: '\\u0631\\u0627\\u0648'
            {
             before(grammarAccess.getRaweeAccess().getArabicLetterRehArabicLetterAlefArabicLetterWawKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalQiraa.g:763:1: rule__Rawee__Group__1 : rule__Rawee__Group__1__Impl rule__Rawee__Group__2 ;
    public final void rule__Rawee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:767:1: ( rule__Rawee__Group__1__Impl rule__Rawee__Group__2 )
            // InternalQiraa.g:768:2: rule__Rawee__Group__1__Impl rule__Rawee__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalQiraa.g:775:1: rule__Rawee__Group__1__Impl : ( rulePerson ) ;
    public final void rule__Rawee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:779:1: ( ( rulePerson ) )
            // InternalQiraa.g:780:1: ( rulePerson )
            {
            // InternalQiraa.g:780:1: ( rulePerson )
            // InternalQiraa.g:781:2: rulePerson
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
    // InternalQiraa.g:790:1: rule__Rawee__Group__2 : rule__Rawee__Group__2__Impl rule__Rawee__Group__3 ;
    public final void rule__Rawee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:794:1: ( rule__Rawee__Group__2__Impl rule__Rawee__Group__3 )
            // InternalQiraa.g:795:2: rule__Rawee__Group__2__Impl rule__Rawee__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalQiraa.g:802:1: rule__Rawee__Group__2__Impl : ( '\\u0639\\u0646' ) ;
    public final void rule__Rawee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:806:1: ( ( '\\u0639\\u0646' ) )
            // InternalQiraa.g:807:1: ( '\\u0639\\u0646' )
            {
            // InternalQiraa.g:807:1: ( '\\u0639\\u0646' )
            // InternalQiraa.g:808:2: '\\u0639\\u0646'
            {
             before(grammarAccess.getRaweeAccess().getArabicLetterAinArabicLetterNoonKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalQiraa.g:817:1: rule__Rawee__Group__3 : rule__Rawee__Group__3__Impl ;
    public final void rule__Rawee__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:821:1: ( rule__Rawee__Group__3__Impl )
            // InternalQiraa.g:822:2: rule__Rawee__Group__3__Impl
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
    // InternalQiraa.g:828:1: rule__Rawee__Group__3__Impl : ( ( rule__Rawee__QareeAssignment_3 ) ) ;
    public final void rule__Rawee__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:832:1: ( ( ( rule__Rawee__QareeAssignment_3 ) ) )
            // InternalQiraa.g:833:1: ( ( rule__Rawee__QareeAssignment_3 ) )
            {
            // InternalQiraa.g:833:1: ( ( rule__Rawee__QareeAssignment_3 ) )
            // InternalQiraa.g:834:2: ( rule__Rawee__QareeAssignment_3 )
            {
             before(grammarAccess.getRaweeAccess().getQareeAssignment_3()); 
            // InternalQiraa.g:835:2: ( rule__Rawee__QareeAssignment_3 )
            // InternalQiraa.g:835:3: rule__Rawee__QareeAssignment_3
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
    // InternalQiraa.g:844:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:848:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalQiraa.g:849:2: rule__Person__Group__0__Impl rule__Person__Group__1
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
    // InternalQiraa.g:856:1: rule__Person__Group__0__Impl : ( ( rule__Person__NameAssignment_0 ) ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:860:1: ( ( ( rule__Person__NameAssignment_0 ) ) )
            // InternalQiraa.g:861:1: ( ( rule__Person__NameAssignment_0 ) )
            {
            // InternalQiraa.g:861:1: ( ( rule__Person__NameAssignment_0 ) )
            // InternalQiraa.g:862:2: ( rule__Person__NameAssignment_0 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_0()); 
            // InternalQiraa.g:863:2: ( rule__Person__NameAssignment_0 )
            // InternalQiraa.g:863:3: rule__Person__NameAssignment_0
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
    // InternalQiraa.g:871:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:875:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalQiraa.g:876:2: rule__Person__Group__1__Impl rule__Person__Group__2
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
    // InternalQiraa.g:883:1: rule__Person__Group__1__Impl : ( ( rule__Person__Group_1__0 )? ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:887:1: ( ( ( rule__Person__Group_1__0 )? ) )
            // InternalQiraa.g:888:1: ( ( rule__Person__Group_1__0 )? )
            {
            // InternalQiraa.g:888:1: ( ( rule__Person__Group_1__0 )? )
            // InternalQiraa.g:889:2: ( rule__Person__Group_1__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_1()); 
            // InternalQiraa.g:890:2: ( rule__Person__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQiraa.g:890:3: rule__Person__Group_1__0
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
    // InternalQiraa.g:898:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:902:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalQiraa.g:903:2: rule__Person__Group__2__Impl rule__Person__Group__3
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
    // InternalQiraa.g:910:1: rule__Person__Group__2__Impl : ( ( rule__Person__Group_2__0 )? ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:914:1: ( ( ( rule__Person__Group_2__0 )? ) )
            // InternalQiraa.g:915:1: ( ( rule__Person__Group_2__0 )? )
            {
            // InternalQiraa.g:915:1: ( ( rule__Person__Group_2__0 )? )
            // InternalQiraa.g:916:2: ( rule__Person__Group_2__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_2()); 
            // InternalQiraa.g:917:2: ( rule__Person__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalQiraa.g:917:3: rule__Person__Group_2__0
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
    // InternalQiraa.g:925:1: rule__Person__Group__3 : rule__Person__Group__3__Impl ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:929:1: ( rule__Person__Group__3__Impl )
            // InternalQiraa.g:930:2: rule__Person__Group__3__Impl
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
    // InternalQiraa.g:936:1: rule__Person__Group__3__Impl : ( ( rule__Person__Group_3__0 )? ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:940:1: ( ( ( rule__Person__Group_3__0 )? ) )
            // InternalQiraa.g:941:1: ( ( rule__Person__Group_3__0 )? )
            {
            // InternalQiraa.g:941:1: ( ( rule__Person__Group_3__0 )? )
            // InternalQiraa.g:942:2: ( rule__Person__Group_3__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_3()); 
            // InternalQiraa.g:943:2: ( rule__Person__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalQiraa.g:943:3: rule__Person__Group_3__0
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
    // InternalQiraa.g:952:1: rule__Person__Group_1__0 : rule__Person__Group_1__0__Impl rule__Person__Group_1__1 ;
    public final void rule__Person__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:956:1: ( rule__Person__Group_1__0__Impl rule__Person__Group_1__1 )
            // InternalQiraa.g:957:2: rule__Person__Group_1__0__Impl rule__Person__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQiraa.g:964:1: rule__Person__Group_1__0__Impl : ( '\\u0627\\u0633\\u0645\\u0647' ) ;
    public final void rule__Person__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:968:1: ( ( '\\u0627\\u0633\\u0645\\u0647' ) )
            // InternalQiraa.g:969:1: ( '\\u0627\\u0633\\u0645\\u0647' )
            {
            // InternalQiraa.g:969:1: ( '\\u0627\\u0633\\u0645\\u0647' )
            // InternalQiraa.g:970:2: '\\u0627\\u0633\\u0645\\u0647'
            {
             before(grammarAccess.getPersonAccess().getArabicLetterAlefArabicLetterSeenArabicLetterMeemArabicLetterHehKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalQiraa.g:979:1: rule__Person__Group_1__1 : rule__Person__Group_1__1__Impl ;
    public final void rule__Person__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:983:1: ( rule__Person__Group_1__1__Impl )
            // InternalQiraa.g:984:2: rule__Person__Group_1__1__Impl
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
    // InternalQiraa.g:990:1: rule__Person__Group_1__1__Impl : ( ( rule__Person__EsmAssignment_1_1 ) ) ;
    public final void rule__Person__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:994:1: ( ( ( rule__Person__EsmAssignment_1_1 ) ) )
            // InternalQiraa.g:995:1: ( ( rule__Person__EsmAssignment_1_1 ) )
            {
            // InternalQiraa.g:995:1: ( ( rule__Person__EsmAssignment_1_1 ) )
            // InternalQiraa.g:996:2: ( rule__Person__EsmAssignment_1_1 )
            {
             before(grammarAccess.getPersonAccess().getEsmAssignment_1_1()); 
            // InternalQiraa.g:997:2: ( rule__Person__EsmAssignment_1_1 )
            // InternalQiraa.g:997:3: rule__Person__EsmAssignment_1_1
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
    // InternalQiraa.g:1006:1: rule__Person__Group_2__0 : rule__Person__Group_2__0__Impl rule__Person__Group_2__1 ;
    public final void rule__Person__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1010:1: ( rule__Person__Group_2__0__Impl rule__Person__Group_2__1 )
            // InternalQiraa.g:1011:2: rule__Person__Group_2__0__Impl rule__Person__Group_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQiraa.g:1018:1: rule__Person__Group_2__0__Impl : ( '\\u0644\\u0642\\u0628\\u0647' ) ;
    public final void rule__Person__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1022:1: ( ( '\\u0644\\u0642\\u0628\\u0647' ) )
            // InternalQiraa.g:1023:1: ( '\\u0644\\u0642\\u0628\\u0647' )
            {
            // InternalQiraa.g:1023:1: ( '\\u0644\\u0642\\u0628\\u0647' )
            // InternalQiraa.g:1024:2: '\\u0644\\u0642\\u0628\\u0647'
            {
             before(grammarAccess.getPersonAccess().getArabicLetterLamArabicLetterQafArabicLetterBehArabicLetterHehKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQiraa.g:1033:1: rule__Person__Group_2__1 : rule__Person__Group_2__1__Impl ;
    public final void rule__Person__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1037:1: ( rule__Person__Group_2__1__Impl )
            // InternalQiraa.g:1038:2: rule__Person__Group_2__1__Impl
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
    // InternalQiraa.g:1044:1: rule__Person__Group_2__1__Impl : ( ( rule__Person__LakabAssignment_2_1 ) ) ;
    public final void rule__Person__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1048:1: ( ( ( rule__Person__LakabAssignment_2_1 ) ) )
            // InternalQiraa.g:1049:1: ( ( rule__Person__LakabAssignment_2_1 ) )
            {
            // InternalQiraa.g:1049:1: ( ( rule__Person__LakabAssignment_2_1 ) )
            // InternalQiraa.g:1050:2: ( rule__Person__LakabAssignment_2_1 )
            {
             before(grammarAccess.getPersonAccess().getLakabAssignment_2_1()); 
            // InternalQiraa.g:1051:2: ( rule__Person__LakabAssignment_2_1 )
            // InternalQiraa.g:1051:3: rule__Person__LakabAssignment_2_1
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
    // InternalQiraa.g:1060:1: rule__Person__Group_3__0 : rule__Person__Group_3__0__Impl rule__Person__Group_3__1 ;
    public final void rule__Person__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1064:1: ( rule__Person__Group_3__0__Impl rule__Person__Group_3__1 )
            // InternalQiraa.g:1065:2: rule__Person__Group_3__0__Impl rule__Person__Group_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalQiraa.g:1072:1: rule__Person__Group_3__0__Impl : ( '\\u062A\\u0648\\u0641\\u064A' ) ;
    public final void rule__Person__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1076:1: ( ( '\\u062A\\u0648\\u0641\\u064A' ) )
            // InternalQiraa.g:1077:1: ( '\\u062A\\u0648\\u0641\\u064A' )
            {
            // InternalQiraa.g:1077:1: ( '\\u062A\\u0648\\u0641\\u064A' )
            // InternalQiraa.g:1078:2: '\\u062A\\u0648\\u0641\\u064A'
            {
             before(grammarAccess.getPersonAccess().getArabicLetterTehArabicLetterWawArabicLetterFehArabicLetterYehKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQiraa.g:1087:1: rule__Person__Group_3__1 : rule__Person__Group_3__1__Impl ;
    public final void rule__Person__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1091:1: ( rule__Person__Group_3__1__Impl )
            // InternalQiraa.g:1092:2: rule__Person__Group_3__1__Impl
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
    // InternalQiraa.g:1098:1: rule__Person__Group_3__1__Impl : ( ( rule__Person__TowofiaAssignment_3_1 ) ) ;
    public final void rule__Person__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1102:1: ( ( ( rule__Person__TowofiaAssignment_3_1 ) ) )
            // InternalQiraa.g:1103:1: ( ( rule__Person__TowofiaAssignment_3_1 ) )
            {
            // InternalQiraa.g:1103:1: ( ( rule__Person__TowofiaAssignment_3_1 ) )
            // InternalQiraa.g:1104:2: ( rule__Person__TowofiaAssignment_3_1 )
            {
             before(grammarAccess.getPersonAccess().getTowofiaAssignment_3_1()); 
            // InternalQiraa.g:1105:2: ( rule__Person__TowofiaAssignment_3_1 )
            // InternalQiraa.g:1105:3: rule__Person__TowofiaAssignment_3_1
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


    // $ANTLR start "rule__Tareek__Group__0"
    // InternalQiraa.g:1114:1: rule__Tareek__Group__0 : rule__Tareek__Group__0__Impl rule__Tareek__Group__1 ;
    public final void rule__Tareek__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1118:1: ( rule__Tareek__Group__0__Impl rule__Tareek__Group__1 )
            // InternalQiraa.g:1119:2: rule__Tareek__Group__0__Impl rule__Tareek__Group__1
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
    // InternalQiraa.g:1126:1: rule__Tareek__Group__0__Impl : ( '\\u0637\\u0631\\u064A\\u0642' ) ;
    public final void rule__Tareek__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1130:1: ( ( '\\u0637\\u0631\\u064A\\u0642' ) )
            // InternalQiraa.g:1131:1: ( '\\u0637\\u0631\\u064A\\u0642' )
            {
            // InternalQiraa.g:1131:1: ( '\\u0637\\u0631\\u064A\\u0642' )
            // InternalQiraa.g:1132:2: '\\u0637\\u0631\\u064A\\u0642'
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
    // InternalQiraa.g:1141:1: rule__Tareek__Group__1 : rule__Tareek__Group__1__Impl rule__Tareek__Group__2 ;
    public final void rule__Tareek__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1145:1: ( rule__Tareek__Group__1__Impl rule__Tareek__Group__2 )
            // InternalQiraa.g:1146:2: rule__Tareek__Group__1__Impl rule__Tareek__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalQiraa.g:1153:1: rule__Tareek__Group__1__Impl : ( ( rule__Tareek__NameAssignment_1 ) ) ;
    public final void rule__Tareek__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1157:1: ( ( ( rule__Tareek__NameAssignment_1 ) ) )
            // InternalQiraa.g:1158:1: ( ( rule__Tareek__NameAssignment_1 ) )
            {
            // InternalQiraa.g:1158:1: ( ( rule__Tareek__NameAssignment_1 ) )
            // InternalQiraa.g:1159:2: ( rule__Tareek__NameAssignment_1 )
            {
             before(grammarAccess.getTareekAccess().getNameAssignment_1()); 
            // InternalQiraa.g:1160:2: ( rule__Tareek__NameAssignment_1 )
            // InternalQiraa.g:1160:3: rule__Tareek__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tareek__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTareekAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalQiraa.g:1168:1: rule__Tareek__Group__2 : rule__Tareek__Group__2__Impl ;
    public final void rule__Tareek__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1172:1: ( rule__Tareek__Group__2__Impl )
            // InternalQiraa.g:1173:2: rule__Tareek__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tareek__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalQiraa.g:1179:1: rule__Tareek__Group__2__Impl : ( ( rule__Tareek__Group_2__0 )? ) ;
    public final void rule__Tareek__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1183:1: ( ( ( rule__Tareek__Group_2__0 )? ) )
            // InternalQiraa.g:1184:1: ( ( rule__Tareek__Group_2__0 )? )
            {
            // InternalQiraa.g:1184:1: ( ( rule__Tareek__Group_2__0 )? )
            // InternalQiraa.g:1185:2: ( rule__Tareek__Group_2__0 )?
            {
             before(grammarAccess.getTareekAccess().getGroup_2()); 
            // InternalQiraa.g:1186:2: ( rule__Tareek__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalQiraa.g:1186:3: rule__Tareek__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tareek__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTareekAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Tareek__Group_2__0"
    // InternalQiraa.g:1195:1: rule__Tareek__Group_2__0 : rule__Tareek__Group_2__0__Impl rule__Tareek__Group_2__1 ;
    public final void rule__Tareek__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1199:1: ( rule__Tareek__Group_2__0__Impl rule__Tareek__Group_2__1 )
            // InternalQiraa.g:1200:2: rule__Tareek__Group_2__0__Impl rule__Tareek__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Tareek__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tareek__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tareek__Group_2__0"


    // $ANTLR start "rule__Tareek__Group_2__0__Impl"
    // InternalQiraa.g:1207:1: rule__Tareek__Group_2__0__Impl : ( '\\u0645\\u0646' ) ;
    public final void rule__Tareek__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1211:1: ( ( '\\u0645\\u0646' ) )
            // InternalQiraa.g:1212:1: ( '\\u0645\\u0646' )
            {
            // InternalQiraa.g:1212:1: ( '\\u0645\\u0646' )
            // InternalQiraa.g:1213:2: '\\u0645\\u0646'
            {
             before(grammarAccess.getTareekAccess().getArabicLetterMeemArabicLetterNoonKeyword_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTareekAccess().getArabicLetterMeemArabicLetterNoonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tareek__Group_2__0__Impl"


    // $ANTLR start "rule__Tareek__Group_2__1"
    // InternalQiraa.g:1222:1: rule__Tareek__Group_2__1 : rule__Tareek__Group_2__1__Impl ;
    public final void rule__Tareek__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1226:1: ( rule__Tareek__Group_2__1__Impl )
            // InternalQiraa.g:1227:2: rule__Tareek__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tareek__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tareek__Group_2__1"


    // $ANTLR start "rule__Tareek__Group_2__1__Impl"
    // InternalQiraa.g:1233:1: rule__Tareek__Group_2__1__Impl : ( ( rule__Tareek__RefAssignment_2_1 ) ) ;
    public final void rule__Tareek__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1237:1: ( ( ( rule__Tareek__RefAssignment_2_1 ) ) )
            // InternalQiraa.g:1238:1: ( ( rule__Tareek__RefAssignment_2_1 ) )
            {
            // InternalQiraa.g:1238:1: ( ( rule__Tareek__RefAssignment_2_1 ) )
            // InternalQiraa.g:1239:2: ( rule__Tareek__RefAssignment_2_1 )
            {
             before(grammarAccess.getTareekAccess().getRefAssignment_2_1()); 
            // InternalQiraa.g:1240:2: ( rule__Tareek__RefAssignment_2_1 )
            // InternalQiraa.g:1240:3: rule__Tareek__RefAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Tareek__RefAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTareekAccess().getRefAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tareek__Group_2__1__Impl"


    // $ANTLR start "rule__Phrase__Group__0"
    // InternalQiraa.g:1249:1: rule__Phrase__Group__0 : rule__Phrase__Group__0__Impl rule__Phrase__Group__1 ;
    public final void rule__Phrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1253:1: ( rule__Phrase__Group__0__Impl rule__Phrase__Group__1 )
            // InternalQiraa.g:1254:2: rule__Phrase__Group__0__Impl rule__Phrase__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalQiraa.g:1261:1: rule__Phrase__Group__0__Impl : ( ( rule__Phrase__WordsAssignment_0 ) ) ;
    public final void rule__Phrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1265:1: ( ( ( rule__Phrase__WordsAssignment_0 ) ) )
            // InternalQiraa.g:1266:1: ( ( rule__Phrase__WordsAssignment_0 ) )
            {
            // InternalQiraa.g:1266:1: ( ( rule__Phrase__WordsAssignment_0 ) )
            // InternalQiraa.g:1267:2: ( rule__Phrase__WordsAssignment_0 )
            {
             before(grammarAccess.getPhraseAccess().getWordsAssignment_0()); 
            // InternalQiraa.g:1268:2: ( rule__Phrase__WordsAssignment_0 )
            // InternalQiraa.g:1268:3: rule__Phrase__WordsAssignment_0
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
    // InternalQiraa.g:1276:1: rule__Phrase__Group__1 : rule__Phrase__Group__1__Impl ;
    public final void rule__Phrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1280:1: ( rule__Phrase__Group__1__Impl )
            // InternalQiraa.g:1281:2: rule__Phrase__Group__1__Impl
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
    // InternalQiraa.g:1287:1: rule__Phrase__Group__1__Impl : ( ( rule__Phrase__Group_1__0 )* ) ;
    public final void rule__Phrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1291:1: ( ( ( rule__Phrase__Group_1__0 )* ) )
            // InternalQiraa.g:1292:1: ( ( rule__Phrase__Group_1__0 )* )
            {
            // InternalQiraa.g:1292:1: ( ( rule__Phrase__Group_1__0 )* )
            // InternalQiraa.g:1293:2: ( rule__Phrase__Group_1__0 )*
            {
             before(grammarAccess.getPhraseAccess().getGroup_1()); 
            // InternalQiraa.g:1294:2: ( rule__Phrase__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_WS) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalQiraa.g:1294:3: rule__Phrase__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Phrase__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalQiraa.g:1303:1: rule__Phrase__Group_1__0 : rule__Phrase__Group_1__0__Impl rule__Phrase__Group_1__1 ;
    public final void rule__Phrase__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1307:1: ( rule__Phrase__Group_1__0__Impl rule__Phrase__Group_1__1 )
            // InternalQiraa.g:1308:2: rule__Phrase__Group_1__0__Impl rule__Phrase__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalQiraa.g:1315:1: rule__Phrase__Group_1__0__Impl : ( RULE_WS ) ;
    public final void rule__Phrase__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1319:1: ( ( RULE_WS ) )
            // InternalQiraa.g:1320:1: ( RULE_WS )
            {
            // InternalQiraa.g:1320:1: ( RULE_WS )
            // InternalQiraa.g:1321:2: RULE_WS
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
    // InternalQiraa.g:1330:1: rule__Phrase__Group_1__1 : rule__Phrase__Group_1__1__Impl ;
    public final void rule__Phrase__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1334:1: ( rule__Phrase__Group_1__1__Impl )
            // InternalQiraa.g:1335:2: rule__Phrase__Group_1__1__Impl
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
    // InternalQiraa.g:1341:1: rule__Phrase__Group_1__1__Impl : ( ( rule__Phrase__WordsAssignment_1_1 ) ) ;
    public final void rule__Phrase__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1345:1: ( ( ( rule__Phrase__WordsAssignment_1_1 ) ) )
            // InternalQiraa.g:1346:1: ( ( rule__Phrase__WordsAssignment_1_1 ) )
            {
            // InternalQiraa.g:1346:1: ( ( rule__Phrase__WordsAssignment_1_1 ) )
            // InternalQiraa.g:1347:2: ( rule__Phrase__WordsAssignment_1_1 )
            {
             before(grammarAccess.getPhraseAccess().getWordsAssignment_1_1()); 
            // InternalQiraa.g:1348:2: ( rule__Phrase__WordsAssignment_1_1 )
            // InternalQiraa.g:1348:3: rule__Phrase__WordsAssignment_1_1
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


    // $ANTLR start "rule__QiraaModel__HouroufAssignment_0"
    // InternalQiraa.g:1357:1: rule__QiraaModel__HouroufAssignment_0 : ( ruleHarf ) ;
    public final void rule__QiraaModel__HouroufAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1361:1: ( ( ruleHarf ) )
            // InternalQiraa.g:1362:2: ( ruleHarf )
            {
            // InternalQiraa.g:1362:2: ( ruleHarf )
            // InternalQiraa.g:1363:3: ruleHarf
            {
             before(grammarAccess.getQiraaModelAccess().getHouroufHarfParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHarf();

            state._fsp--;

             after(grammarAccess.getQiraaModelAccess().getHouroufHarfParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QiraaModel__HouroufAssignment_0"


    // $ANTLR start "rule__QiraaModel__QoraaAssignment_1"
    // InternalQiraa.g:1372:1: rule__QiraaModel__QoraaAssignment_1 : ( ruleQaree ) ;
    public final void rule__QiraaModel__QoraaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1376:1: ( ( ruleQaree ) )
            // InternalQiraa.g:1377:2: ( ruleQaree )
            {
            // InternalQiraa.g:1377:2: ( ruleQaree )
            // InternalQiraa.g:1378:3: ruleQaree
            {
             before(grammarAccess.getQiraaModelAccess().getQoraaQareeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQaree();

            state._fsp--;

             after(grammarAccess.getQiraaModelAccess().getQoraaQareeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QiraaModel__QoraaAssignment_1"


    // $ANTLR start "rule__QiraaModel__TorokAssignment_2"
    // InternalQiraa.g:1387:1: rule__QiraaModel__TorokAssignment_2 : ( ruleTareek ) ;
    public final void rule__QiraaModel__TorokAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1391:1: ( ( ruleTareek ) )
            // InternalQiraa.g:1392:2: ( ruleTareek )
            {
            // InternalQiraa.g:1392:2: ( ruleTareek )
            // InternalQiraa.g:1393:3: ruleTareek
            {
             before(grammarAccess.getQiraaModelAccess().getTorokTareekParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTareek();

            state._fsp--;

             after(grammarAccess.getQiraaModelAccess().getTorokTareekParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QiraaModel__TorokAssignment_2"


    // $ANTLR start "rule__QiraaModel__HarakatAssignment_3"
    // InternalQiraa.g:1402:1: rule__QiraaModel__HarakatAssignment_3 : ( ruleHarakah ) ;
    public final void rule__QiraaModel__HarakatAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1406:1: ( ( ruleHarakah ) )
            // InternalQiraa.g:1407:2: ( ruleHarakah )
            {
            // InternalQiraa.g:1407:2: ( ruleHarakah )
            // InternalQiraa.g:1408:3: ruleHarakah
            {
             before(grammarAccess.getQiraaModelAccess().getHarakatHarakahParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleHarakah();

            state._fsp--;

             after(grammarAccess.getQiraaModelAccess().getHarakatHarakahParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QiraaModel__HarakatAssignment_3"


    // $ANTLR start "rule__QiraaModel__RowatAssignment_4"
    // InternalQiraa.g:1417:1: rule__QiraaModel__RowatAssignment_4 : ( ruleRawee ) ;
    public final void rule__QiraaModel__RowatAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1421:1: ( ( ruleRawee ) )
            // InternalQiraa.g:1422:2: ( ruleRawee )
            {
            // InternalQiraa.g:1422:2: ( ruleRawee )
            // InternalQiraa.g:1423:3: ruleRawee
            {
             before(grammarAccess.getQiraaModelAccess().getRowatRaweeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRawee();

            state._fsp--;

             after(grammarAccess.getQiraaModelAccess().getRowatRaweeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QiraaModel__RowatAssignment_4"


    // $ANTLR start "rule__Harf__NameAssignment_1"
    // InternalQiraa.g:1432:1: rule__Harf__NameAssignment_1 : ( RULE_AWORD ) ;
    public final void rule__Harf__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1436:1: ( ( RULE_AWORD ) )
            // InternalQiraa.g:1437:2: ( RULE_AWORD )
            {
            // InternalQiraa.g:1437:2: ( RULE_AWORD )
            // InternalQiraa.g:1438:3: RULE_AWORD
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
    // InternalQiraa.g:1447:1: rule__Harf__ValuesAssignment_2_0_1 : ( RULE_ALETTER ) ;
    public final void rule__Harf__ValuesAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1451:1: ( ( RULE_ALETTER ) )
            // InternalQiraa.g:1452:2: ( RULE_ALETTER )
            {
            // InternalQiraa.g:1452:2: ( RULE_ALETTER )
            // InternalQiraa.g:1453:3: RULE_ALETTER
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
    // InternalQiraa.g:1462:1: rule__Harf__ValuesAssignment_2_0_2_1 : ( RULE_ALETTER ) ;
    public final void rule__Harf__ValuesAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1466:1: ( ( RULE_ALETTER ) )
            // InternalQiraa.g:1467:2: ( RULE_ALETTER )
            {
            // InternalQiraa.g:1467:2: ( RULE_ALETTER )
            // InternalQiraa.g:1468:3: RULE_ALETTER
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
    // InternalQiraa.g:1477:1: rule__Harf__RefAssignment_2_1_1 : ( ( RULE_AWORD ) ) ;
    public final void rule__Harf__RefAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1481:1: ( ( ( RULE_AWORD ) ) )
            // InternalQiraa.g:1482:2: ( ( RULE_AWORD ) )
            {
            // InternalQiraa.g:1482:2: ( ( RULE_AWORD ) )
            // InternalQiraa.g:1483:3: ( RULE_AWORD )
            {
             before(grammarAccess.getHarfAccess().getRefHarfCrossReference_2_1_1_0()); 
            // InternalQiraa.g:1484:3: ( RULE_AWORD )
            // InternalQiraa.g:1485:4: RULE_AWORD
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
    // InternalQiraa.g:1496:1: rule__Harakah__NameAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Harakah__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1500:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:1501:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:1501:2: ( RULE_KALEMAH )
            // InternalQiraa.g:1502:3: RULE_KALEMAH
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
    // InternalQiraa.g:1511:1: rule__Harakah__ValueAssignment_3 : ( RULE_AHARAKAH ) ;
    public final void rule__Harakah__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1515:1: ( ( RULE_AHARAKAH ) )
            // InternalQiraa.g:1516:2: ( RULE_AHARAKAH )
            {
            // InternalQiraa.g:1516:2: ( RULE_AHARAKAH )
            // InternalQiraa.g:1517:3: RULE_AHARAKAH
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


    // $ANTLR start "rule__Rawee__QareeAssignment_3"
    // InternalQiraa.g:1526:1: rule__Rawee__QareeAssignment_3 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Rawee__QareeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1530:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:1531:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:1531:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:1532:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getRaweeAccess().getQareeQareeCrossReference_3_0()); 
            // InternalQiraa.g:1533:3: ( RULE_KALEMAH )
            // InternalQiraa.g:1534:4: RULE_KALEMAH
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
    // InternalQiraa.g:1545:1: rule__Person__NameAssignment_0 : ( RULE_KALEMAH ) ;
    public final void rule__Person__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1549:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:1550:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:1550:2: ( RULE_KALEMAH )
            // InternalQiraa.g:1551:3: RULE_KALEMAH
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
    // InternalQiraa.g:1560:1: rule__Person__EsmAssignment_1_1 : ( RULE_KALEMAH ) ;
    public final void rule__Person__EsmAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1564:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:1565:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:1565:2: ( RULE_KALEMAH )
            // InternalQiraa.g:1566:3: RULE_KALEMAH
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
    // InternalQiraa.g:1575:1: rule__Person__LakabAssignment_2_1 : ( RULE_KALEMAH ) ;
    public final void rule__Person__LakabAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1579:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:1580:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:1580:2: ( RULE_KALEMAH )
            // InternalQiraa.g:1581:3: RULE_KALEMAH
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
    // InternalQiraa.g:1590:1: rule__Person__TowofiaAssignment_3_1 : ( RULE_ADIGITS ) ;
    public final void rule__Person__TowofiaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1594:1: ( ( RULE_ADIGITS ) )
            // InternalQiraa.g:1595:2: ( RULE_ADIGITS )
            {
            // InternalQiraa.g:1595:2: ( RULE_ADIGITS )
            // InternalQiraa.g:1596:3: RULE_ADIGITS
            {
             before(grammarAccess.getPersonAccess().getTowofiaADIGITSTerminalRuleCall_3_1_0()); 
            match(input,RULE_ADIGITS,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getTowofiaADIGITSTerminalRuleCall_3_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Tareek__NameAssignment_1"
    // InternalQiraa.g:1605:1: rule__Tareek__NameAssignment_1 : ( RULE_KALEMAH ) ;
    public final void rule__Tareek__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1609:1: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:1610:2: ( RULE_KALEMAH )
            {
            // InternalQiraa.g:1610:2: ( RULE_KALEMAH )
            // InternalQiraa.g:1611:3: RULE_KALEMAH
            {
             before(grammarAccess.getTareekAccess().getNameKALEMAHTerminalRuleCall_1_0()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getTareekAccess().getNameKALEMAHTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tareek__NameAssignment_1"


    // $ANTLR start "rule__Tareek__RefAssignment_2_1"
    // InternalQiraa.g:1620:1: rule__Tareek__RefAssignment_2_1 : ( ( RULE_KALEMAH ) ) ;
    public final void rule__Tareek__RefAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1624:1: ( ( ( RULE_KALEMAH ) ) )
            // InternalQiraa.g:1625:2: ( ( RULE_KALEMAH ) )
            {
            // InternalQiraa.g:1625:2: ( ( RULE_KALEMAH ) )
            // InternalQiraa.g:1626:3: ( RULE_KALEMAH )
            {
             before(grammarAccess.getTareekAccess().getRefTareekCrossReference_2_1_0()); 
            // InternalQiraa.g:1627:3: ( RULE_KALEMAH )
            // InternalQiraa.g:1628:4: RULE_KALEMAH
            {
             before(grammarAccess.getTareekAccess().getRefTareekKALEMAHTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_KALEMAH,FOLLOW_2); 
             after(grammarAccess.getTareekAccess().getRefTareekKALEMAHTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getTareekAccess().getRefTareekCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tareek__RefAssignment_2_1"


    // $ANTLR start "rule__Phrase__WordsAssignment_0"
    // InternalQiraa.g:1639:1: rule__Phrase__WordsAssignment_0 : ( RULE_AWORD ) ;
    public final void rule__Phrase__WordsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1643:1: ( ( RULE_AWORD ) )
            // InternalQiraa.g:1644:2: ( RULE_AWORD )
            {
            // InternalQiraa.g:1644:2: ( RULE_AWORD )
            // InternalQiraa.g:1645:3: RULE_AWORD
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
    // InternalQiraa.g:1654:1: rule__Phrase__WordsAssignment_1_1 : ( RULE_AWORD ) ;
    public final void rule__Phrase__WordsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQiraa.g:1658:1: ( ( RULE_AWORD ) )
            // InternalQiraa.g:1659:2: ( RULE_AWORD )
            {
            // InternalQiraa.g:1659:2: ( RULE_AWORD )
            // InternalQiraa.g:1660:3: RULE_AWORD
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000086880002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000012L});

}