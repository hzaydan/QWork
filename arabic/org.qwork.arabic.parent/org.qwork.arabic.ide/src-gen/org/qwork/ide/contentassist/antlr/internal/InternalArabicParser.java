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
import org.qwork.services.ArabicGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArabicParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BASMALAH", "RULE_AWORD", "RULE_ALETTER", "RULE_AHARAKAH", "RULE_ATANWEEN", "RULE_ASHADDAH", "RULE_ALIGATURES", "RULE_ADIGIT", "RULE_ANONLETTER", "RULE_KALEMAH", "RULE_SL_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_BASMALAH=4;
    public static final int RULE_AHARAKAH=7;
    public static final int RULE_STRING=17;
    public static final int RULE_ANONLETTER=12;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_KALEMAH=13;
    public static final int RULE_ASHADDAH=9;
    public static final int RULE_ALETTER=6;
    public static final int RULE_ATANWEEN=8;
    public static final int EOF=-1;
    public static final int RULE_ALIGATURES=10;
    public static final int RULE_ID=15;
    public static final int RULE_WS=19;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_ADIGIT=11;
    public static final int RULE_INT=16;
    public static final int RULE_AWORD=5;
    public static final int RULE_ML_COMMENT=18;

    // delegates
    // delegators


        public InternalArabicParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalArabicParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalArabicParser.tokenNames; }
    public String getGrammarFileName() { return "InternalArabic.g"; }


    	private ArabicGrammarAccess grammarAccess;

    	public void setGrammarAccess(ArabicGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalArabic.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalArabic.g:54:1: ( ruleModel EOF )
            // InternalArabic.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalArabic.g:62:1: ruleModel : ( ( ( rule__Model__PhrasesAssignment ) ) ( ( rule__Model__PhrasesAssignment )* ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArabic.g:66:2: ( ( ( ( rule__Model__PhrasesAssignment ) ) ( ( rule__Model__PhrasesAssignment )* ) ) )
            // InternalArabic.g:67:2: ( ( ( rule__Model__PhrasesAssignment ) ) ( ( rule__Model__PhrasesAssignment )* ) )
            {
            // InternalArabic.g:67:2: ( ( ( rule__Model__PhrasesAssignment ) ) ( ( rule__Model__PhrasesAssignment )* ) )
            // InternalArabic.g:68:3: ( ( rule__Model__PhrasesAssignment ) ) ( ( rule__Model__PhrasesAssignment )* )
            {
            // InternalArabic.g:68:3: ( ( rule__Model__PhrasesAssignment ) )
            // InternalArabic.g:69:4: ( rule__Model__PhrasesAssignment )
            {
             before(grammarAccess.getModelAccess().getPhrasesAssignment()); 
            // InternalArabic.g:70:4: ( rule__Model__PhrasesAssignment )
            // InternalArabic.g:70:5: rule__Model__PhrasesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Model__PhrasesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPhrasesAssignment()); 

            }

            // InternalArabic.g:73:3: ( ( rule__Model__PhrasesAssignment )* )
            // InternalArabic.g:74:4: ( rule__Model__PhrasesAssignment )*
            {
             before(grammarAccess.getModelAccess().getPhrasesAssignment()); 
            // InternalArabic.g:75:4: ( rule__Model__PhrasesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_BASMALAH && LA1_0<=RULE_AWORD)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalArabic.g:75:5: rule__Model__PhrasesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__PhrasesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPhrasesAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePhrase"
    // InternalArabic.g:85:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // InternalArabic.g:86:1: ( rulePhrase EOF )
            // InternalArabic.g:87:1: rulePhrase EOF
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
    // InternalArabic.g:94:1: rulePhrase : ( ( rule__Phrase__Group__0 ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArabic.g:98:2: ( ( ( rule__Phrase__Group__0 ) ) )
            // InternalArabic.g:99:2: ( ( rule__Phrase__Group__0 ) )
            {
            // InternalArabic.g:99:2: ( ( rule__Phrase__Group__0 ) )
            // InternalArabic.g:100:3: ( rule__Phrase__Group__0 )
            {
             before(grammarAccess.getPhraseAccess().getGroup()); 
            // InternalArabic.g:101:3: ( rule__Phrase__Group__0 )
            // InternalArabic.g:101:4: rule__Phrase__Group__0
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


    // $ANTLR start "rule__Phrase__Group__0"
    // InternalArabic.g:109:1: rule__Phrase__Group__0 : rule__Phrase__Group__0__Impl rule__Phrase__Group__1 ;
    public final void rule__Phrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArabic.g:113:1: ( rule__Phrase__Group__0__Impl rule__Phrase__Group__1 )
            // InternalArabic.g:114:2: rule__Phrase__Group__0__Impl rule__Phrase__Group__1
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
    // InternalArabic.g:121:1: rule__Phrase__Group__0__Impl : ( ( rule__Phrase__BasmalahAssignment_0 )? ) ;
    public final void rule__Phrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArabic.g:125:1: ( ( ( rule__Phrase__BasmalahAssignment_0 )? ) )
            // InternalArabic.g:126:1: ( ( rule__Phrase__BasmalahAssignment_0 )? )
            {
            // InternalArabic.g:126:1: ( ( rule__Phrase__BasmalahAssignment_0 )? )
            // InternalArabic.g:127:2: ( rule__Phrase__BasmalahAssignment_0 )?
            {
             before(grammarAccess.getPhraseAccess().getBasmalahAssignment_0()); 
            // InternalArabic.g:128:2: ( rule__Phrase__BasmalahAssignment_0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_BASMALAH) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalArabic.g:128:3: rule__Phrase__BasmalahAssignment_0
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
    // InternalArabic.g:136:1: rule__Phrase__Group__1 : rule__Phrase__Group__1__Impl ;
    public final void rule__Phrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArabic.g:140:1: ( rule__Phrase__Group__1__Impl )
            // InternalArabic.g:141:2: rule__Phrase__Group__1__Impl
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
    // InternalArabic.g:147:1: rule__Phrase__Group__1__Impl : ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) ) ;
    public final void rule__Phrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArabic.g:151:1: ( ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) ) )
            // InternalArabic.g:152:1: ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) )
            {
            // InternalArabic.g:152:1: ( ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* ) )
            // InternalArabic.g:153:2: ( ( rule__Phrase__WordsAssignment_1 ) ) ( ( rule__Phrase__WordsAssignment_1 )* )
            {
            // InternalArabic.g:153:2: ( ( rule__Phrase__WordsAssignment_1 ) )
            // InternalArabic.g:154:3: ( rule__Phrase__WordsAssignment_1 )
            {
             before(grammarAccess.getPhraseAccess().getWordsAssignment_1()); 
            // InternalArabic.g:155:3: ( rule__Phrase__WordsAssignment_1 )
            // InternalArabic.g:155:4: rule__Phrase__WordsAssignment_1
            {
            pushFollow(FOLLOW_3);
            rule__Phrase__WordsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getWordsAssignment_1()); 

            }

            // InternalArabic.g:158:2: ( ( rule__Phrase__WordsAssignment_1 )* )
            // InternalArabic.g:159:3: ( rule__Phrase__WordsAssignment_1 )*
            {
             before(grammarAccess.getPhraseAccess().getWordsAssignment_1()); 
            // InternalArabic.g:160:3: ( rule__Phrase__WordsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_AWORD) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalArabic.g:160:4: rule__Phrase__WordsAssignment_1
            	    {
            	    pushFollow(FOLLOW_3);
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


    // $ANTLR start "rule__Model__PhrasesAssignment"
    // InternalArabic.g:170:1: rule__Model__PhrasesAssignment : ( rulePhrase ) ;
    public final void rule__Model__PhrasesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArabic.g:174:1: ( ( rulePhrase ) )
            // InternalArabic.g:175:2: ( rulePhrase )
            {
            // InternalArabic.g:175:2: ( rulePhrase )
            // InternalArabic.g:176:3: rulePhrase
            {
             before(grammarAccess.getModelAccess().getPhrasesPhraseParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPhrasesPhraseParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PhrasesAssignment"


    // $ANTLR start "rule__Phrase__BasmalahAssignment_0"
    // InternalArabic.g:185:1: rule__Phrase__BasmalahAssignment_0 : ( RULE_BASMALAH ) ;
    public final void rule__Phrase__BasmalahAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArabic.g:189:1: ( ( RULE_BASMALAH ) )
            // InternalArabic.g:190:2: ( RULE_BASMALAH )
            {
            // InternalArabic.g:190:2: ( RULE_BASMALAH )
            // InternalArabic.g:191:3: RULE_BASMALAH
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
    // InternalArabic.g:200:1: rule__Phrase__WordsAssignment_1 : ( RULE_AWORD ) ;
    public final void rule__Phrase__WordsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArabic.g:204:1: ( ( RULE_AWORD ) )
            // InternalArabic.g:205:2: ( RULE_AWORD )
            {
            // InternalArabic.g:205:2: ( RULE_AWORD )
            // InternalArabic.g:206:3: RULE_AWORD
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});

}