package org.qwork.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.qwork.services.ArabicGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArabicParser extends AbstractInternalAntlrParser {
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

        public InternalArabicParser(TokenStream input, ArabicGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ArabicGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalArabic.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalArabic.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalArabic.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalArabic.g:71:1: ruleModel returns [EObject current=null] : ( (lv_phrases_0_0= rulePhrase ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_phrases_0_0 = null;



        	enterRule();

        try {
            // InternalArabic.g:77:2: ( ( (lv_phrases_0_0= rulePhrase ) )+ )
            // InternalArabic.g:78:2: ( (lv_phrases_0_0= rulePhrase ) )+
            {
            // InternalArabic.g:78:2: ( (lv_phrases_0_0= rulePhrase ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_BASMALAH && LA1_0<=RULE_AWORD)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalArabic.g:79:3: (lv_phrases_0_0= rulePhrase )
            	    {
            	    // InternalArabic.g:79:3: (lv_phrases_0_0= rulePhrase )
            	    // InternalArabic.g:80:4: lv_phrases_0_0= rulePhrase
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getPhrasesPhraseParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_phrases_0_0=rulePhrase();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"phrases",
            	    					lv_phrases_0_0,
            	    					"org.qwork.Arabic.Phrase");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePhrase"
    // InternalArabic.g:100:1: entryRulePhrase returns [EObject current=null] : iv_rulePhrase= rulePhrase EOF ;
    public final EObject entryRulePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhrase = null;


        try {
            // InternalArabic.g:100:47: (iv_rulePhrase= rulePhrase EOF )
            // InternalArabic.g:101:2: iv_rulePhrase= rulePhrase EOF
            {
             newCompositeNode(grammarAccess.getPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhrase=rulePhrase();

            state._fsp--;

             current =iv_rulePhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhrase"


    // $ANTLR start "rulePhrase"
    // InternalArabic.g:107:1: rulePhrase returns [EObject current=null] : ( ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+ ) ;
    public final EObject rulePhrase() throws RecognitionException {
        EObject current = null;

        Token lv_basmalah_0_0=null;
        Token lv_words_1_0=null;


        	enterRule();

        try {
            // InternalArabic.g:113:2: ( ( ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+ ) )
            // InternalArabic.g:114:2: ( ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+ )
            {
            // InternalArabic.g:114:2: ( ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+ )
            // InternalArabic.g:115:3: ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+
            {
            // InternalArabic.g:115:3: ( (lv_basmalah_0_0= RULE_BASMALAH ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_BASMALAH) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalArabic.g:116:4: (lv_basmalah_0_0= RULE_BASMALAH )
                    {
                    // InternalArabic.g:116:4: (lv_basmalah_0_0= RULE_BASMALAH )
                    // InternalArabic.g:117:5: lv_basmalah_0_0= RULE_BASMALAH
                    {
                    lv_basmalah_0_0=(Token)match(input,RULE_BASMALAH,FOLLOW_4); 

                    					newLeafNode(lv_basmalah_0_0, grammarAccess.getPhraseAccess().getBasmalahBASMALAHTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPhraseRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"basmalah",
                    						lv_basmalah_0_0 != null,
                    						"org.qwork.Arabic.BASMALAH");
                    				

                    }


                    }
                    break;

            }

            // InternalArabic.g:133:3: ( (lv_words_1_0= RULE_AWORD ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_AWORD) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalArabic.g:134:4: (lv_words_1_0= RULE_AWORD )
            	    {
            	    // InternalArabic.g:134:4: (lv_words_1_0= RULE_AWORD )
            	    // InternalArabic.g:135:5: lv_words_1_0= RULE_AWORD
            	    {
            	    lv_words_1_0=(Token)match(input,RULE_AWORD,FOLLOW_5); 

            	    					newLeafNode(lv_words_1_0, grammarAccess.getPhraseAccess().getWordsAWORDTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getPhraseRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"words",
            	    						lv_words_1_0,
            	    						"org.qwork.Arabic.AWORD");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhrase"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000022L});

}