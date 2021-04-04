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
import org.qwork.services.QAyahStartGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQAyahStartParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_KALEMAH", "RULE_AWORD", "RULE_WS", "RULE_ALETTER", "RULE_ADIGIT", "RULE_AHARAKAH", "RULE_ASHADDAH", "RULE_ANONLETTER", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'", "'\\u0627\\u0644\\u0622\\u064A\\u0629'"
    };
    public static final int RULE_AHARAKAH=10;
    public static final int RULE_STRING=14;
    public static final int RULE_ANONLETTER=12;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__19=19;
    public static final int RULE_KALEMAH=5;
    public static final int T__18=18;
    public static final int RULE_ASHADDAH=11;
    public static final int RULE_ALETTER=8;
    public static final int EOF=-1;
    public static final int RULE_ID=13;
    public static final int RULE_WS=7;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_ADIGIT=9;
    public static final int RULE_INT=4;
    public static final int RULE_AWORD=6;
    public static final int RULE_ML_COMMENT=15;

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

        public InternalQAyahStartParser(TokenStream input, QAyahStartGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AyahStartModel";
       	}

       	@Override
       	protected QAyahStartGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAyahStartModel"
    // InternalQAyahStart.g:64:1: entryRuleAyahStartModel returns [EObject current=null] : iv_ruleAyahStartModel= ruleAyahStartModel EOF ;
    public final EObject entryRuleAyahStartModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAyahStartModel = null;


        try {
            // InternalQAyahStart.g:64:55: (iv_ruleAyahStartModel= ruleAyahStartModel EOF )
            // InternalQAyahStart.g:65:2: iv_ruleAyahStartModel= ruleAyahStartModel EOF
            {
             newCompositeNode(grammarAccess.getAyahStartModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAyahStartModel=ruleAyahStartModel();

            state._fsp--;

             current =iv_ruleAyahStartModel; 
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
    // $ANTLR end "entryRuleAyahStartModel"


    // $ANTLR start "ruleAyahStartModel"
    // InternalQAyahStart.g:71:1: ruleAyahStartModel returns [EObject current=null] : ( (lv_ayat_0_0= ruleAyahStart ) )+ ;
    public final EObject ruleAyahStartModel() throws RecognitionException {
        EObject current = null;

        EObject lv_ayat_0_0 = null;



        	enterRule();

        try {
            // InternalQAyahStart.g:77:2: ( ( (lv_ayat_0_0= ruleAyahStart ) )+ )
            // InternalQAyahStart.g:78:2: ( (lv_ayat_0_0= ruleAyahStart ) )+
            {
            // InternalQAyahStart.g:78:2: ( (lv_ayat_0_0= ruleAyahStart ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQAyahStart.g:79:3: (lv_ayat_0_0= ruleAyahStart )
            	    {
            	    // InternalQAyahStart.g:79:3: (lv_ayat_0_0= ruleAyahStart )
            	    // InternalQAyahStart.g:80:4: lv_ayat_0_0= ruleAyahStart
            	    {

            	    				newCompositeNode(grammarAccess.getAyahStartModelAccess().getAyatAyahStartParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_ayat_0_0=ruleAyahStart();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getAyahStartModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"ayat",
            	    					lv_ayat_0_0,
            	    					"org.qwork.QAyahStart.AyahStart");
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
    // $ANTLR end "ruleAyahStartModel"


    // $ANTLR start "entryRuleAyahStart"
    // InternalQAyahStart.g:100:1: entryRuleAyahStart returns [EObject current=null] : iv_ruleAyahStart= ruleAyahStart EOF ;
    public final EObject entryRuleAyahStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAyahStart = null;


        try {
            // InternalQAyahStart.g:100:50: (iv_ruleAyahStart= ruleAyahStart EOF )
            // InternalQAyahStart.g:101:2: iv_ruleAyahStart= ruleAyahStart EOF
            {
             newCompositeNode(grammarAccess.getAyahStartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAyahStart=ruleAyahStart();

            state._fsp--;

             current =iv_ruleAyahStart; 
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
    // $ANTLR end "entryRuleAyahStart"


    // $ANTLR start "ruleAyahStart"
    // InternalQAyahStart.g:107:1: ruleAyahStart returns [EObject current=null] : (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) ) ;
    public final EObject ruleAyahStart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_surah_1_0=null;
        Token otherlv_2=null;
        Token lv_ayah_3_0=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalQAyahStart.g:113:2: ( (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) ) )
            // InternalQAyahStart.g:114:2: (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) )
            {
            // InternalQAyahStart.g:114:2: (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) )
            // InternalQAyahStart.g:115:3: otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterSeenArabicLetterWawArabicLetterRehArabicLetterTehMarbutaKeyword_0());
            		
            // InternalQAyahStart.g:119:3: ( (lv_surah_1_0= RULE_INT ) )
            // InternalQAyahStart.g:120:4: (lv_surah_1_0= RULE_INT )
            {
            // InternalQAyahStart.g:120:4: (lv_surah_1_0= RULE_INT )
            // InternalQAyahStart.g:121:5: lv_surah_1_0= RULE_INT
            {
            lv_surah_1_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            					newLeafNode(lv_surah_1_0, grammarAccess.getAyahStartAccess().getSurahINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAyahStartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"surah",
            						lv_surah_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithMaddaAboveArabicLetterYehArabicLetterTehMarbutaKeyword_2());
            		
            // InternalQAyahStart.g:141:3: ( (lv_ayah_3_0= RULE_INT ) )
            // InternalQAyahStart.g:142:4: (lv_ayah_3_0= RULE_INT )
            {
            // InternalQAyahStart.g:142:4: (lv_ayah_3_0= RULE_INT )
            // InternalQAyahStart.g:143:5: lv_ayah_3_0= RULE_INT
            {
            lv_ayah_3_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_ayah_3_0, grammarAccess.getAyahStartAccess().getAyahINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAyahStartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ayah",
            						lv_ayah_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalQAyahStart.g:159:3: ( (lv_name_4_0= RULE_KALEMAH ) )
            // InternalQAyahStart.g:160:4: (lv_name_4_0= RULE_KALEMAH )
            {
            // InternalQAyahStart.g:160:4: (lv_name_4_0= RULE_KALEMAH )
            // InternalQAyahStart.g:161:5: lv_name_4_0= RULE_KALEMAH
            {
            lv_name_4_0=(Token)match(input,RULE_KALEMAH,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getAyahStartAccess().getNameKALEMAHTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAyahStartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.qwork.Arabic.KALEMAH");
            				

            }


            }


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
    // $ANTLR end "ruleAyahStart"


    // $ANTLR start "entryRulePhrase"
    // InternalQAyahStart.g:181:1: entryRulePhrase returns [EObject current=null] : iv_rulePhrase= rulePhrase EOF ;
    public final EObject entryRulePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhrase = null;


        try {
            // InternalQAyahStart.g:181:47: (iv_rulePhrase= rulePhrase EOF )
            // InternalQAyahStart.g:182:2: iv_rulePhrase= rulePhrase EOF
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
    // InternalQAyahStart.g:188:1: rulePhrase returns [EObject current=null] : ( ( (lv_words_0_0= RULE_AWORD ) ) (this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) ) )* ) ;
    public final EObject rulePhrase() throws RecognitionException {
        EObject current = null;

        Token lv_words_0_0=null;
        Token this_WS_1=null;
        Token lv_words_2_0=null;


        	enterRule();

        try {
            // InternalQAyahStart.g:194:2: ( ( ( (lv_words_0_0= RULE_AWORD ) ) (this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) ) )* ) )
            // InternalQAyahStart.g:195:2: ( ( (lv_words_0_0= RULE_AWORD ) ) (this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) ) )* )
            {
            // InternalQAyahStart.g:195:2: ( ( (lv_words_0_0= RULE_AWORD ) ) (this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) ) )* )
            // InternalQAyahStart.g:196:3: ( (lv_words_0_0= RULE_AWORD ) ) (this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) ) )*
            {
            // InternalQAyahStart.g:196:3: ( (lv_words_0_0= RULE_AWORD ) )
            // InternalQAyahStart.g:197:4: (lv_words_0_0= RULE_AWORD )
            {
            // InternalQAyahStart.g:197:4: (lv_words_0_0= RULE_AWORD )
            // InternalQAyahStart.g:198:5: lv_words_0_0= RULE_AWORD
            {
            lv_words_0_0=(Token)match(input,RULE_AWORD,FOLLOW_7); 

            					newLeafNode(lv_words_0_0, grammarAccess.getPhraseAccess().getWordsAWORDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhraseRule());
            					}
            					addWithLastConsumed(
            						current,
            						"words",
            						lv_words_0_0,
            						"org.qwork.Arabic.AWORD");
            				

            }


            }

            // InternalQAyahStart.g:214:3: (this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_WS) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalQAyahStart.g:215:4: this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) )
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_8); 

            	    				newLeafNode(this_WS_1, grammarAccess.getPhraseAccess().getWSTerminalRuleCall_1_0());
            	    			
            	    // InternalQAyahStart.g:219:4: ( (lv_words_2_0= RULE_AWORD ) )
            	    // InternalQAyahStart.g:220:5: (lv_words_2_0= RULE_AWORD )
            	    {
            	    // InternalQAyahStart.g:220:5: (lv_words_2_0= RULE_AWORD )
            	    // InternalQAyahStart.g:221:6: lv_words_2_0= RULE_AWORD
            	    {
            	    lv_words_2_0=(Token)match(input,RULE_AWORD,FOLLOW_7); 

            	    						newLeafNode(lv_words_2_0, grammarAccess.getPhraseAccess().getWordsAWORDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPhraseRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"words",
            	    							lv_words_2_0,
            	    							"org.qwork.Arabic.AWORD");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});

}