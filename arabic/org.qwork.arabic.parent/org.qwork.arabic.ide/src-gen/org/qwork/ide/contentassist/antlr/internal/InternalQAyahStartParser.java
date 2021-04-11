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
import org.qwork.services.QAyahStartGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQAyahStartParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_KALEMAH", "RULE_BASMALAH", "RULE_AWORD", "RULE_ALETTER", "RULE_AHARAKAH", "RULE_ATANWEEN", "RULE_ASHADDAH", "RULE_ALIGATURES", "RULE_ADIGIT", "RULE_ANONLETTER", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'", "'\\u0627\\u0644\\u0622\\u064A\\u0629'"
    };
    public static final int RULE_BASMALAH=6;
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
    public static final int RULE_INT=4;
    public static final int RULE_AWORD=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalQAyahStartParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQAyahStartParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQAyahStartParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQAyahStart.g"; }


    	private QAyahStartGrammarAccess grammarAccess;

    	public void setGrammarAccess(QAyahStartGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleAyahStartModel"
    // InternalQAyahStart.g:53:1: entryRuleAyahStartModel : ruleAyahStartModel EOF ;
    public final void entryRuleAyahStartModel() throws RecognitionException {
        try {
            // InternalQAyahStart.g:54:1: ( ruleAyahStartModel EOF )
            // InternalQAyahStart.g:55:1: ruleAyahStartModel EOF
            {
             before(grammarAccess.getAyahStartModelRule()); 
            pushFollow(FOLLOW_1);
            ruleAyahStartModel();

            state._fsp--;

             after(grammarAccess.getAyahStartModelRule()); 
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
    // $ANTLR end "entryRuleAyahStartModel"


    // $ANTLR start "ruleAyahStartModel"
    // InternalQAyahStart.g:62:1: ruleAyahStartModel : ( ( ( rule__AyahStartModel__AyatAssignment ) ) ( ( rule__AyahStartModel__AyatAssignment )* ) ) ;
    public final void ruleAyahStartModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:66:2: ( ( ( ( rule__AyahStartModel__AyatAssignment ) ) ( ( rule__AyahStartModel__AyatAssignment )* ) ) )
            // InternalQAyahStart.g:67:2: ( ( ( rule__AyahStartModel__AyatAssignment ) ) ( ( rule__AyahStartModel__AyatAssignment )* ) )
            {
            // InternalQAyahStart.g:67:2: ( ( ( rule__AyahStartModel__AyatAssignment ) ) ( ( rule__AyahStartModel__AyatAssignment )* ) )
            // InternalQAyahStart.g:68:3: ( ( rule__AyahStartModel__AyatAssignment ) ) ( ( rule__AyahStartModel__AyatAssignment )* )
            {
            // InternalQAyahStart.g:68:3: ( ( rule__AyahStartModel__AyatAssignment ) )
            // InternalQAyahStart.g:69:4: ( rule__AyahStartModel__AyatAssignment )
            {
             before(grammarAccess.getAyahStartModelAccess().getAyatAssignment()); 
            // InternalQAyahStart.g:70:4: ( rule__AyahStartModel__AyatAssignment )
            // InternalQAyahStart.g:70:5: rule__AyahStartModel__AyatAssignment
            {
            pushFollow(FOLLOW_3);
            rule__AyahStartModel__AyatAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAyahStartModelAccess().getAyatAssignment()); 

            }

            // InternalQAyahStart.g:73:3: ( ( rule__AyahStartModel__AyatAssignment )* )
            // InternalQAyahStart.g:74:4: ( rule__AyahStartModel__AyatAssignment )*
            {
             before(grammarAccess.getAyahStartModelAccess().getAyatAssignment()); 
            // InternalQAyahStart.g:75:4: ( rule__AyahStartModel__AyatAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQAyahStart.g:75:5: rule__AyahStartModel__AyatAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__AyahStartModel__AyatAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getAyahStartModelAccess().getAyatAssignment()); 

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
    // $ANTLR end "ruleAyahStartModel"


    // $ANTLR start "entryRuleAyahStart"
    // InternalQAyahStart.g:85:1: entryRuleAyahStart : ruleAyahStart EOF ;
    public final void entryRuleAyahStart() throws RecognitionException {
        try {
            // InternalQAyahStart.g:86:1: ( ruleAyahStart EOF )
            // InternalQAyahStart.g:87:1: ruleAyahStart EOF
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
    // InternalQAyahStart.g:94:1: ruleAyahStart : ( ( rule__AyahStart__Group__0 ) ) ;
    public final void ruleAyahStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:98:2: ( ( ( rule__AyahStart__Group__0 ) ) )
            // InternalQAyahStart.g:99:2: ( ( rule__AyahStart__Group__0 ) )
            {
            // InternalQAyahStart.g:99:2: ( ( rule__AyahStart__Group__0 ) )
            // InternalQAyahStart.g:100:3: ( rule__AyahStart__Group__0 )
            {
             before(grammarAccess.getAyahStartAccess().getGroup()); 
            // InternalQAyahStart.g:101:3: ( rule__AyahStart__Group__0 )
            // InternalQAyahStart.g:101:4: rule__AyahStart__Group__0
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
    // InternalQAyahStart.g:110:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // InternalQAyahStart.g:111:1: ( rulePhrase EOF )
            // InternalQAyahStart.g:112:1: rulePhrase EOF
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
    // InternalQAyahStart.g:119:1: rulePhrase : ( ( rule__Phrase__Group__0 ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:123:2: ( ( ( rule__Phrase__Group__0 ) ) )
            // InternalQAyahStart.g:124:2: ( ( rule__Phrase__Group__0 ) )
            {
            // InternalQAyahStart.g:124:2: ( ( rule__Phrase__Group__0 ) )
            // InternalQAyahStart.g:125:3: ( rule__Phrase__Group__0 )
            {
             before(grammarAccess.getPhraseAccess().getGroup()); 
            // InternalQAyahStart.g:126:3: ( rule__Phrase__Group__0 )
            // InternalQAyahStart.g:126:4: rule__Phrase__Group__0
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


    // $ANTLR start "rule__AyahStart__Group__0"
    // InternalQAyahStart.g:134:1: rule__AyahStart__Group__0 : rule__AyahStart__Group__0__Impl rule__AyahStart__Group__1 ;
    public final void rule__AyahStart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:138:1: ( rule__AyahStart__Group__0__Impl rule__AyahStart__Group__1 )
            // InternalQAyahStart.g:139:2: rule__AyahStart__Group__0__Impl rule__AyahStart__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalQAyahStart.g:146:1: rule__AyahStart__Group__0__Impl : ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ) ;
    public final void rule__AyahStart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:150:1: ( ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ) )
            // InternalQAyahStart.g:151:1: ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' )
            {
            // InternalQAyahStart.g:151:1: ( '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' )
            // InternalQAyahStart.g:152:2: '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'
            {
             before(grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterSeenArabicLetterWawArabicLetterRehArabicLetterTehMarbutaKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalQAyahStart.g:161:1: rule__AyahStart__Group__1 : rule__AyahStart__Group__1__Impl rule__AyahStart__Group__2 ;
    public final void rule__AyahStart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:165:1: ( rule__AyahStart__Group__1__Impl rule__AyahStart__Group__2 )
            // InternalQAyahStart.g:166:2: rule__AyahStart__Group__1__Impl rule__AyahStart__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalQAyahStart.g:173:1: rule__AyahStart__Group__1__Impl : ( ( rule__AyahStart__SurahAssignment_1 ) ) ;
    public final void rule__AyahStart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:177:1: ( ( ( rule__AyahStart__SurahAssignment_1 ) ) )
            // InternalQAyahStart.g:178:1: ( ( rule__AyahStart__SurahAssignment_1 ) )
            {
            // InternalQAyahStart.g:178:1: ( ( rule__AyahStart__SurahAssignment_1 ) )
            // InternalQAyahStart.g:179:2: ( rule__AyahStart__SurahAssignment_1 )
            {
             before(grammarAccess.getAyahStartAccess().getSurahAssignment_1()); 
            // InternalQAyahStart.g:180:2: ( rule__AyahStart__SurahAssignment_1 )
            // InternalQAyahStart.g:180:3: rule__AyahStart__SurahAssignment_1
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
    // InternalQAyahStart.g:188:1: rule__AyahStart__Group__2 : rule__AyahStart__Group__2__Impl rule__AyahStart__Group__3 ;
    public final void rule__AyahStart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:192:1: ( rule__AyahStart__Group__2__Impl rule__AyahStart__Group__3 )
            // InternalQAyahStart.g:193:2: rule__AyahStart__Group__2__Impl rule__AyahStart__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalQAyahStart.g:200:1: rule__AyahStart__Group__2__Impl : ( '\\u0627\\u0644\\u0622\\u064A\\u0629' ) ;
    public final void rule__AyahStart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:204:1: ( ( '\\u0627\\u0644\\u0622\\u064A\\u0629' ) )
            // InternalQAyahStart.g:205:1: ( '\\u0627\\u0644\\u0622\\u064A\\u0629' )
            {
            // InternalQAyahStart.g:205:1: ( '\\u0627\\u0644\\u0622\\u064A\\u0629' )
            // InternalQAyahStart.g:206:2: '\\u0627\\u0644\\u0622\\u064A\\u0629'
            {
             before(grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithMaddaAboveArabicLetterYehArabicLetterTehMarbutaKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalQAyahStart.g:215:1: rule__AyahStart__Group__3 : rule__AyahStart__Group__3__Impl rule__AyahStart__Group__4 ;
    public final void rule__AyahStart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:219:1: ( rule__AyahStart__Group__3__Impl rule__AyahStart__Group__4 )
            // InternalQAyahStart.g:220:2: rule__AyahStart__Group__3__Impl rule__AyahStart__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalQAyahStart.g:227:1: rule__AyahStart__Group__3__Impl : ( ( rule__AyahStart__AyahAssignment_3 ) ) ;
    public final void rule__AyahStart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:231:1: ( ( ( rule__AyahStart__AyahAssignment_3 ) ) )
            // InternalQAyahStart.g:232:1: ( ( rule__AyahStart__AyahAssignment_3 ) )
            {
            // InternalQAyahStart.g:232:1: ( ( rule__AyahStart__AyahAssignment_3 ) )
            // InternalQAyahStart.g:233:2: ( rule__AyahStart__AyahAssignment_3 )
            {
             before(grammarAccess.getAyahStartAccess().getAyahAssignment_3()); 
            // InternalQAyahStart.g:234:2: ( rule__AyahStart__AyahAssignment_3 )
            // InternalQAyahStart.g:234:3: rule__AyahStart__AyahAssignment_3
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
    // InternalQAyahStart.g:242:1: rule__AyahStart__Group__4 : rule__AyahStart__Group__4__Impl ;
    public final void rule__AyahStart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:246:1: ( rule__AyahStart__Group__4__Impl )
            // InternalQAyahStart.g:247:2: rule__AyahStart__Group__4__Impl
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
    // InternalQAyahStart.g:253:1: rule__AyahStart__Group__4__Impl : ( ( rule__AyahStart__NameAssignment_4 ) ) ;
    public final void rule__AyahStart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:257:1: ( ( ( rule__AyahStart__NameAssignment_4 ) ) )
            // InternalQAyahStart.g:258:1: ( ( rule__AyahStart__NameAssignment_4 ) )
            {
            // InternalQAyahStart.g:258:1: ( ( rule__AyahStart__NameAssignment_4 ) )
            // InternalQAyahStart.g:259:2: ( rule__AyahStart__NameAssignment_4 )
            {
             before(grammarAccess.getAyahStartAccess().getNameAssignment_4()); 
            // InternalQAyahStart.g:260:2: ( rule__AyahStart__NameAssignment_4 )
            // InternalQAyahStart.g:260:3: rule__AyahStart__NameAssignment_4
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
    // InternalQAyahStart.g:269:1: rule__Phrase__Group__0 : rule__Phrase__Group__0__Impl rule__Phrase__Group__1 ;
    public final void rule__Phrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:273:1: ( rule__Phrase__Group__0__Impl rule__Phrase__Group__1 )
            // InternalQAyahStart.g:274:2: rule__Phrase__Group__0__Impl rule__Phrase__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalQAyahStart.g:281:1: rule__Phrase__Group__0__Impl : ( ( rule__Phrase__BasmalahAssignment_0 )? ) ;
    public final void rule__Phrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:285:1: ( ( ( rule__Phrase__BasmalahAssignment_0 )? ) )
            // InternalQAyahStart.g:286:1: ( ( rule__Phrase__BasmalahAssignment_0 )? )
            {
            // InternalQAyahStart.g:286:1: ( ( rule__Phrase__BasmalahAssignment_0 )? )
            // InternalQAyahStart.g:287:2: ( rule__Phrase__BasmalahAssignment_0 )?
            {
             before(grammarAccess.getPhraseAccess().getBasmalahAssignment_0()); 
            // InternalQAyahStart.g:288:2: ( rule__Phrase__BasmalahAssignment_0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_BASMALAH) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalQAyahStart.g:288:3: rule__Phrase__BasmalahAssignment_0
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
    // InternalQAyahStart.g:296:1: rule__Phrase__Group__1 : rule__Phrase__Group__1__Impl ;
    public final void rule__Phrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:300:1: ( rule__Phrase__Group__1__Impl )
            // InternalQAyahStart.g:301:2: rule__Phrase__Group__1__Impl
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
    // InternalQAyahStart.g:307:1: rule__Phrase__Group__1__Impl : ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) ) ;
    public final void rule__Phrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:311:1: ( ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) ) )
            // InternalQAyahStart.g:312:1: ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) )
            {
            // InternalQAyahStart.g:312:1: ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) )
            // InternalQAyahStart.g:313:2: ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* )
            {
            // InternalQAyahStart.g:313:2: ( ( rule__Phrase__WordsAssignment_1 ) )
            // InternalQAyahStart.g:314:3: ( rule__Phrase__WordsAssignment_1 )
            {
             before(grammarAccess.getPhraseAccess().getWordsAssignment_1()); 
            // InternalQAyahStart.g:315:3: ( rule__Phrase__WordsAssignment_1 )
            // InternalQAyahStart.g:315:4: rule__Phrase__WordsAssignment_1
            {
            pushFollow(FOLLOW_8);
            rule__Phrase__WordsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getWordsAssignment_1()); 

            }

            // InternalQAyahStart.g:318:2: ( ( rule__Phrase__WordsAssignment_1 )* )
            // InternalQAyahStart.g:319:3: ( rule__Phrase__WordsAssignment_1 )*
            {
             before(grammarAccess.getPhraseAccess().getWordsAssignment_1()); 
            // InternalQAyahStart.g:320:3: ( rule__Phrase__WordsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_AWORD) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalQAyahStart.g:320:4: rule__Phrase__WordsAssignment_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Phrase__WordsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "rule__AyahStartModel__AyatAssignment"
    // InternalQAyahStart.g:330:1: rule__AyahStartModel__AyatAssignment : ( ruleAyahStart ) ;
    public final void rule__AyahStartModel__AyatAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:334:1: ( ( ruleAyahStart ) )
            // InternalQAyahStart.g:335:2: ( ruleAyahStart )
            {
            // InternalQAyahStart.g:335:2: ( ruleAyahStart )
            // InternalQAyahStart.g:336:3: ruleAyahStart
            {
             before(grammarAccess.getAyahStartModelAccess().getAyatAyahStartParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAyahStart();

            state._fsp--;

             after(grammarAccess.getAyahStartModelAccess().getAyatAyahStartParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AyahStartModel__AyatAssignment"


    // $ANTLR start "rule__AyahStart__SurahAssignment_1"
    // InternalQAyahStart.g:345:1: rule__AyahStart__SurahAssignment_1 : ( RULE_INT ) ;
    public final void rule__AyahStart__SurahAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:349:1: ( ( RULE_INT ) )
            // InternalQAyahStart.g:350:2: ( RULE_INT )
            {
            // InternalQAyahStart.g:350:2: ( RULE_INT )
            // InternalQAyahStart.g:351:3: RULE_INT
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
    // InternalQAyahStart.g:360:1: rule__AyahStart__AyahAssignment_3 : ( RULE_INT ) ;
    public final void rule__AyahStart__AyahAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:364:1: ( ( RULE_INT ) )
            // InternalQAyahStart.g:365:2: ( RULE_INT )
            {
            // InternalQAyahStart.g:365:2: ( RULE_INT )
            // InternalQAyahStart.g:366:3: RULE_INT
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
    // InternalQAyahStart.g:375:1: rule__AyahStart__NameAssignment_4 : ( RULE_KALEMAH ) ;
    public final void rule__AyahStart__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:379:1: ( ( RULE_KALEMAH ) )
            // InternalQAyahStart.g:380:2: ( RULE_KALEMAH )
            {
            // InternalQAyahStart.g:380:2: ( RULE_KALEMAH )
            // InternalQAyahStart.g:381:3: RULE_KALEMAH
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
    // InternalQAyahStart.g:390:1: rule__Phrase__BasmalahAssignment_0 : ( RULE_BASMALAH ) ;
    public final void rule__Phrase__BasmalahAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:394:1: ( ( RULE_BASMALAH ) )
            // InternalQAyahStart.g:395:2: ( RULE_BASMALAH )
            {
            // InternalQAyahStart.g:395:2: ( RULE_BASMALAH )
            // InternalQAyahStart.g:396:3: RULE_BASMALAH
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
    // InternalQAyahStart.g:405:1: rule__Phrase__WordsAssignment_1 : ( RULE_AWORD ) ;
    public final void rule__Phrase__WordsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQAyahStart.g:409:1: ( ( RULE_AWORD ) )
            // InternalQAyahStart.g:410:2: ( RULE_AWORD )
            {
            // InternalQAyahStart.g:410:2: ( RULE_AWORD )
            // InternalQAyahStart.g:411:3: RULE_AWORD
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000082L});

}