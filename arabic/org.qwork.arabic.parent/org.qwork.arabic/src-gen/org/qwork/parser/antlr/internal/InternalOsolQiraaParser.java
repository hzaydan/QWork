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
import org.qwork.services.OsolQiraaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOsolQiraaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_KALEMAH", "RULE_INT", "RULE_AWORD", "RULE_BASMALAH", "RULE_ALETTER", "RULE_AHARAKAH", "RULE_ATANWEEN", "RULE_ASHADDAH", "RULE_ALIGATURES", "RULE_ADIGIT", "RULE_ANONLETTER", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\u0627\\u0633\\u0645\\u0647'", "'\\u0644\\u0642\\u0628\\u0647'", "'\\u062A\\u0648\\u0641\\u064A'", "'\\u0631\\u062D\\u0645\\u0647'", "'\\u0623\\u0643\\u0631\\u0645\\u0647'", "'\\u0627\\u0644\\u0644\\u0647'", "'\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645'", "'\\u0642\\u0627\\u0631\\u0626'", "'\\u0631\\u0627\\u0648'", "'\\u0639\\u0646'", "'\\u0637\\u0631\\u064A\\u0642'", "'\\u062A\\u0644\\u0627\\u0648\\u0629'", "'\\u062E\\u0627\\u0644\\u0635'", "'\\u0644'", "'\\u0645\\u0631\\u0643\\u0628'", "'\\u0645\\u0646'", "'\\u0642\\u064A\\u062F'", "'\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D'", "'\\u064A\\u0639\\u0646\\u064A'", "'\\u0648'", "'\\u0631\\u0645\\u0632'", "'\\u0627\\u0644\\u0623\\u0648\\u0644'", "'\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A'", "'\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B'", "'\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631'", "'\\u062D\\u0631\\u0641'", "'\\u0647\\u0648'", "'\\u0623\\u0648'", "'\\u0630\\u0627\\u062A\\u0647'", "'\\u062D\\u0631\\u0643\\u0629'", "'\\u0647\\u064A'", "'\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'", "'\\u0627\\u0644\\u0622\\u064A\\u0629'"
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

        public InternalOsolQiraaParser(TokenStream input, OsolQiraaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "OsolQiraaModel";
       	}

       	@Override
       	protected OsolQiraaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleOsolQiraaModel"
    // InternalOsolQiraa.g:64:1: entryRuleOsolQiraaModel returns [EObject current=null] : iv_ruleOsolQiraaModel= ruleOsolQiraaModel EOF ;
    public final EObject entryRuleOsolQiraaModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOsolQiraaModel = null;


        try {
            // InternalOsolQiraa.g:64:55: (iv_ruleOsolQiraaModel= ruleOsolQiraaModel EOF )
            // InternalOsolQiraa.g:65:2: iv_ruleOsolQiraaModel= ruleOsolQiraaModel EOF
            {
             newCompositeNode(grammarAccess.getOsolQiraaModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOsolQiraaModel=ruleOsolQiraaModel();

            state._fsp--;

             current =iv_ruleOsolQiraaModel; 
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
    // $ANTLR end "entryRuleOsolQiraaModel"


    // $ANTLR start "ruleOsolQiraaModel"
    // InternalOsolQiraa.g:71:1: ruleOsolQiraaModel returns [EObject current=null] : ( ( (lv_qoraa_0_0= ruleQaree ) ) | ( (lv_torok_1_0= ruleTareek ) ) | ( (lv_rowat_2_0= ruleRawee ) ) | ( (lv_imams_3_0= ruleIMAM ) ) | ( (lv_istelahat_4_0= ruleIstelah ) ) | ( (lv_koyod_5_0= ruleKayd ) ) )* ;
    public final EObject ruleOsolQiraaModel() throws RecognitionException {
        EObject current = null;

        EObject lv_qoraa_0_0 = null;

        EObject lv_torok_1_0 = null;

        EObject lv_rowat_2_0 = null;

        EObject lv_imams_3_0 = null;

        EObject lv_istelahat_4_0 = null;

        EObject lv_koyod_5_0 = null;



        	enterRule();

        try {
            // InternalOsolQiraa.g:77:2: ( ( ( (lv_qoraa_0_0= ruleQaree ) ) | ( (lv_torok_1_0= ruleTareek ) ) | ( (lv_rowat_2_0= ruleRawee ) ) | ( (lv_imams_3_0= ruleIMAM ) ) | ( (lv_istelahat_4_0= ruleIstelah ) ) | ( (lv_koyod_5_0= ruleKayd ) ) )* )
            // InternalOsolQiraa.g:78:2: ( ( (lv_qoraa_0_0= ruleQaree ) ) | ( (lv_torok_1_0= ruleTareek ) ) | ( (lv_rowat_2_0= ruleRawee ) ) | ( (lv_imams_3_0= ruleIMAM ) ) | ( (lv_istelahat_4_0= ruleIstelah ) ) | ( (lv_koyod_5_0= ruleKayd ) ) )*
            {
            // InternalOsolQiraa.g:78:2: ( ( (lv_qoraa_0_0= ruleQaree ) ) | ( (lv_torok_1_0= ruleTareek ) ) | ( (lv_rowat_2_0= ruleRawee ) ) | ( (lv_imams_3_0= ruleIMAM ) ) | ( (lv_istelahat_4_0= ruleIstelah ) ) | ( (lv_koyod_5_0= ruleKayd ) ) )*
            loop1:
            do {
                int alt1=7;
                switch ( input.LA(1) ) {
                case 28:
                    {
                    alt1=1;
                    }
                    break;
                case 31:
                    {
                    alt1=2;
                    }
                    break;
                case 29:
                    {
                    alt1=3;
                    }
                    break;
                case 27:
                    {
                    alt1=4;
                    }
                    break;
                case 38:
                    {
                    alt1=5;
                    }
                    break;
                case 37:
                    {
                    alt1=6;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalOsolQiraa.g:79:3: ( (lv_qoraa_0_0= ruleQaree ) )
            	    {
            	    // InternalOsolQiraa.g:79:3: ( (lv_qoraa_0_0= ruleQaree ) )
            	    // InternalOsolQiraa.g:80:4: (lv_qoraa_0_0= ruleQaree )
            	    {
            	    // InternalOsolQiraa.g:80:4: (lv_qoraa_0_0= ruleQaree )
            	    // InternalOsolQiraa.g:81:5: lv_qoraa_0_0= ruleQaree
            	    {

            	    					newCompositeNode(grammarAccess.getOsolQiraaModelAccess().getQoraaQareeParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_qoraa_0_0=ruleQaree();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOsolQiraaModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"qoraa",
            	    						lv_qoraa_0_0,
            	    						"org.qwork.OsolQiraa.Qaree");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOsolQiraa.g:99:3: ( (lv_torok_1_0= ruleTareek ) )
            	    {
            	    // InternalOsolQiraa.g:99:3: ( (lv_torok_1_0= ruleTareek ) )
            	    // InternalOsolQiraa.g:100:4: (lv_torok_1_0= ruleTareek )
            	    {
            	    // InternalOsolQiraa.g:100:4: (lv_torok_1_0= ruleTareek )
            	    // InternalOsolQiraa.g:101:5: lv_torok_1_0= ruleTareek
            	    {

            	    					newCompositeNode(grammarAccess.getOsolQiraaModelAccess().getTorokTareekParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_torok_1_0=ruleTareek();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOsolQiraaModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"torok",
            	    						lv_torok_1_0,
            	    						"org.qwork.OsolQiraa.Tareek");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOsolQiraa.g:119:3: ( (lv_rowat_2_0= ruleRawee ) )
            	    {
            	    // InternalOsolQiraa.g:119:3: ( (lv_rowat_2_0= ruleRawee ) )
            	    // InternalOsolQiraa.g:120:4: (lv_rowat_2_0= ruleRawee )
            	    {
            	    // InternalOsolQiraa.g:120:4: (lv_rowat_2_0= ruleRawee )
            	    // InternalOsolQiraa.g:121:5: lv_rowat_2_0= ruleRawee
            	    {

            	    					newCompositeNode(grammarAccess.getOsolQiraaModelAccess().getRowatRaweeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_rowat_2_0=ruleRawee();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOsolQiraaModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rowat",
            	    						lv_rowat_2_0,
            	    						"org.qwork.OsolQiraa.Rawee");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalOsolQiraa.g:139:3: ( (lv_imams_3_0= ruleIMAM ) )
            	    {
            	    // InternalOsolQiraa.g:139:3: ( (lv_imams_3_0= ruleIMAM ) )
            	    // InternalOsolQiraa.g:140:4: (lv_imams_3_0= ruleIMAM )
            	    {
            	    // InternalOsolQiraa.g:140:4: (lv_imams_3_0= ruleIMAM )
            	    // InternalOsolQiraa.g:141:5: lv_imams_3_0= ruleIMAM
            	    {

            	    					newCompositeNode(grammarAccess.getOsolQiraaModelAccess().getImamsIMAMParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imams_3_0=ruleIMAM();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOsolQiraaModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imams",
            	    						lv_imams_3_0,
            	    						"org.qwork.OsolQiraa.IMAM");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalOsolQiraa.g:159:3: ( (lv_istelahat_4_0= ruleIstelah ) )
            	    {
            	    // InternalOsolQiraa.g:159:3: ( (lv_istelahat_4_0= ruleIstelah ) )
            	    // InternalOsolQiraa.g:160:4: (lv_istelahat_4_0= ruleIstelah )
            	    {
            	    // InternalOsolQiraa.g:160:4: (lv_istelahat_4_0= ruleIstelah )
            	    // InternalOsolQiraa.g:161:5: lv_istelahat_4_0= ruleIstelah
            	    {

            	    					newCompositeNode(grammarAccess.getOsolQiraaModelAccess().getIstelahatIstelahParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_istelahat_4_0=ruleIstelah();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOsolQiraaModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"istelahat",
            	    						lv_istelahat_4_0,
            	    						"org.qwork.OsolQiraa.Istelah");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalOsolQiraa.g:179:3: ( (lv_koyod_5_0= ruleKayd ) )
            	    {
            	    // InternalOsolQiraa.g:179:3: ( (lv_koyod_5_0= ruleKayd ) )
            	    // InternalOsolQiraa.g:180:4: (lv_koyod_5_0= ruleKayd )
            	    {
            	    // InternalOsolQiraa.g:180:4: (lv_koyod_5_0= ruleKayd )
            	    // InternalOsolQiraa.g:181:5: lv_koyod_5_0= ruleKayd
            	    {

            	    					newCompositeNode(grammarAccess.getOsolQiraaModelAccess().getKoyodKaydParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_koyod_5_0=ruleKayd();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOsolQiraaModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"koyod",
            	    						lv_koyod_5_0,
            	    						"org.qwork.OsolQiraa.Kayd");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "ruleOsolQiraaModel"


    // $ANTLR start "rulePerson"
    // InternalOsolQiraa.g:203:1: rulePerson[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )? ) ;
    public final EObject rulePerson(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_esm_2_0=null;
        Token otherlv_3=null;
        Token lv_lakab_4_0=null;
        Token otherlv_5=null;
        Token lv_towofia_6_0=null;


        	enterRule();

        try {
            // InternalOsolQiraa.g:209:2: ( ( ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )? ) )
            // InternalOsolQiraa.g:210:2: ( ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )? )
            {
            // InternalOsolQiraa.g:210:2: ( ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )? )
            // InternalOsolQiraa.g:211:3: ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )?
            {
            // InternalOsolQiraa.g:211:3: ( (lv_name_0_0= RULE_KALEMAH ) )
            // InternalOsolQiraa.g:212:4: (lv_name_0_0= RULE_KALEMAH )
            {
            // InternalOsolQiraa.g:212:4: (lv_name_0_0= RULE_KALEMAH )
            // InternalOsolQiraa.g:213:5: lv_name_0_0= RULE_KALEMAH
            {
            lv_name_0_0=(Token)match(input,RULE_KALEMAH,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPersonAccess().getNameKALEMAHTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.qwork.Arabic.KALEMAH");
            				

            }


            }

            // InternalOsolQiraa.g:229:3: (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalOsolQiraa.g:230:4: otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getPersonAccess().getArabicLetterAlefArabicLetterSeenArabicLetterMeemArabicLetterHehKeyword_1_0());
                    			
                    // InternalOsolQiraa.g:234:4: ( (lv_esm_2_0= RULE_KALEMAH ) )
                    // InternalOsolQiraa.g:235:5: (lv_esm_2_0= RULE_KALEMAH )
                    {
                    // InternalOsolQiraa.g:235:5: (lv_esm_2_0= RULE_KALEMAH )
                    // InternalOsolQiraa.g:236:6: lv_esm_2_0= RULE_KALEMAH
                    {
                    lv_esm_2_0=(Token)match(input,RULE_KALEMAH,FOLLOW_6); 

                    						newLeafNode(lv_esm_2_0, grammarAccess.getPersonAccess().getEsmKALEMAHTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersonRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"esm",
                    							lv_esm_2_0,
                    							"org.qwork.Arabic.KALEMAH");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOsolQiraa.g:253:3: (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOsolQiraa.g:254:4: otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getArabicLetterLamArabicLetterQafArabicLetterBehArabicLetterHehKeyword_2_0());
                    			
                    // InternalOsolQiraa.g:258:4: ( (lv_lakab_4_0= RULE_KALEMAH ) )
                    // InternalOsolQiraa.g:259:5: (lv_lakab_4_0= RULE_KALEMAH )
                    {
                    // InternalOsolQiraa.g:259:5: (lv_lakab_4_0= RULE_KALEMAH )
                    // InternalOsolQiraa.g:260:6: lv_lakab_4_0= RULE_KALEMAH
                    {
                    lv_lakab_4_0=(Token)match(input,RULE_KALEMAH,FOLLOW_7); 

                    						newLeafNode(lv_lakab_4_0, grammarAccess.getPersonAccess().getLakabKALEMAHTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersonRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lakab",
                    							lv_lakab_4_0,
                    							"org.qwork.Arabic.KALEMAH");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOsolQiraa.g:277:3: (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOsolQiraa.g:278:4: otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getPersonAccess().getArabicLetterTehArabicLetterWawArabicLetterFehArabicLetterYehKeyword_3_0());
                    			
                    // InternalOsolQiraa.g:282:4: ( (lv_towofia_6_0= RULE_INT ) )
                    // InternalOsolQiraa.g:283:5: (lv_towofia_6_0= RULE_INT )
                    {
                    // InternalOsolQiraa.g:283:5: (lv_towofia_6_0= RULE_INT )
                    // InternalOsolQiraa.g:284:6: lv_towofia_6_0= RULE_INT
                    {
                    lv_towofia_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_towofia_6_0, grammarAccess.getPersonAccess().getTowofiaINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersonRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"towofia",
                    							lv_towofia_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "ruleDouaa"
    // InternalOsolQiraa.g:306:1: ruleDouaa[EObject in_current] returns [EObject current=in_current] : ( ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) ) otherlv_1= '\\u0627\\u0644\\u0644\\u0647' ) ;
    public final EObject ruleDouaa(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_d_0_1=null;
        Token lv_d_0_2=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOsolQiraa.g:312:2: ( ( ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) ) otherlv_1= '\\u0627\\u0644\\u0644\\u0647' ) )
            // InternalOsolQiraa.g:313:2: ( ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) ) otherlv_1= '\\u0627\\u0644\\u0644\\u0647' )
            {
            // InternalOsolQiraa.g:313:2: ( ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) ) otherlv_1= '\\u0627\\u0644\\u0644\\u0647' )
            // InternalOsolQiraa.g:314:3: ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) ) otherlv_1= '\\u0627\\u0644\\u0644\\u0647'
            {
            // InternalOsolQiraa.g:314:3: ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) )
            // InternalOsolQiraa.g:315:4: ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) )
            {
            // InternalOsolQiraa.g:315:4: ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) )
            // InternalOsolQiraa.g:316:5: (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' )
            {
            // InternalOsolQiraa.g:316:5: (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalOsolQiraa.g:317:6: lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647'
                    {
                    lv_d_0_1=(Token)match(input,24,FOLLOW_9); 

                    						newLeafNode(lv_d_0_1, grammarAccess.getDouaaAccess().getDArabicLetterRehArabicLetterHahArabicLetterMeemArabicLetterHehKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDouaaRule());
                    						}
                    						setWithLastConsumed(current, "d", lv_d_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalOsolQiraa.g:328:6: lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647'
                    {
                    lv_d_0_2=(Token)match(input,25,FOLLOW_9); 

                    						newLeafNode(lv_d_0_2, grammarAccess.getDouaaAccess().getDArabicLetterAlefWithHamzaAboveArabicLetterKafArabicLetterRehArabicLetterMeemArabicLetterHehKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDouaaRule());
                    						}
                    						setWithLastConsumed(current, "d", lv_d_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDouaaAccess().getArabicLetterAlefArabicLetterLamArabicLetterLamArabicLetterHehKeyword_1());
            		

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
    // $ANTLR end "ruleDouaa"


    // $ANTLR start "entryRuleIMAM"
    // InternalOsolQiraa.g:349:1: entryRuleIMAM returns [EObject current=null] : iv_ruleIMAM= ruleIMAM EOF ;
    public final EObject entryRuleIMAM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIMAM = null;


        try {
            // InternalOsolQiraa.g:349:45: (iv_ruleIMAM= ruleIMAM EOF )
            // InternalOsolQiraa.g:350:2: iv_ruleIMAM= ruleIMAM EOF
            {
             newCompositeNode(grammarAccess.getIMAMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIMAM=ruleIMAM();

            state._fsp--;

             current =iv_ruleIMAM; 
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
    // $ANTLR end "entryRuleIMAM"


    // $ANTLR start "ruleIMAM"
    // InternalOsolQiraa.g:356:1: ruleIMAM returns [EObject current=null] : (otherlv_0= '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' this_Person_1= rulePerson[$current] this_Douaa_2= ruleDouaa[$current] ) ;
    public final EObject ruleIMAM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Person_1 = null;

        EObject this_Douaa_2 = null;



        	enterRule();

        try {
            // InternalOsolQiraa.g:362:2: ( (otherlv_0= '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' this_Person_1= rulePerson[$current] this_Douaa_2= ruleDouaa[$current] ) )
            // InternalOsolQiraa.g:363:2: (otherlv_0= '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' this_Person_1= rulePerson[$current] this_Douaa_2= ruleDouaa[$current] )
            {
            // InternalOsolQiraa.g:363:2: (otherlv_0= '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' this_Person_1= rulePerson[$current] this_Douaa_2= ruleDouaa[$current] )
            // InternalOsolQiraa.g:364:3: otherlv_0= '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' this_Person_1= rulePerson[$current] this_Douaa_2= ruleDouaa[$current]
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getIMAMAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaBelowArabicLetterMeemArabicLetterAlefArabicLetterMeemKeyword_0());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getIMAMRule());
            			}
            			newCompositeNode(grammarAccess.getIMAMAccess().getPersonParserRuleCall_1());
            		
            pushFollow(FOLLOW_10);
            this_Person_1=rulePerson(current);

            state._fsp--;


            			current = this_Person_1;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getIMAMRule());
            			}
            			newCompositeNode(grammarAccess.getIMAMAccess().getDouaaParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_Douaa_2=ruleDouaa(current);

            state._fsp--;


            			current = this_Douaa_2;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleIMAM"


    // $ANTLR start "entryRuleQaree"
    // InternalOsolQiraa.g:394:1: entryRuleQaree returns [EObject current=null] : iv_ruleQaree= ruleQaree EOF ;
    public final EObject entryRuleQaree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQaree = null;


        try {
            // InternalOsolQiraa.g:394:46: (iv_ruleQaree= ruleQaree EOF )
            // InternalOsolQiraa.g:395:2: iv_ruleQaree= ruleQaree EOF
            {
             newCompositeNode(grammarAccess.getQareeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQaree=ruleQaree();

            state._fsp--;

             current =iv_ruleQaree; 
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
    // $ANTLR end "entryRuleQaree"


    // $ANTLR start "ruleQaree"
    // InternalOsolQiraa.g:401:1: ruleQaree returns [EObject current=null] : (otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current] ) ;
    public final EObject ruleQaree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Person_1 = null;



        	enterRule();

        try {
            // InternalOsolQiraa.g:407:2: ( (otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current] ) )
            // InternalOsolQiraa.g:408:2: (otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current] )
            {
            // InternalOsolQiraa.g:408:2: (otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current] )
            // InternalOsolQiraa.g:409:3: otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current]
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getQareeAccess().getArabicLetterQafArabicLetterAlefArabicLetterRehArabicLetterYehWithHamzaAboveKeyword_0());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getQareeRule());
            			}
            			newCompositeNode(grammarAccess.getQareeAccess().getPersonParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Person_1=rulePerson(current);

            state._fsp--;


            			current = this_Person_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleQaree"


    // $ANTLR start "entryRuleRawee"
    // InternalOsolQiraa.g:428:1: entryRuleRawee returns [EObject current=null] : iv_ruleRawee= ruleRawee EOF ;
    public final EObject entryRuleRawee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRawee = null;


        try {
            // InternalOsolQiraa.g:428:46: (iv_ruleRawee= ruleRawee EOF )
            // InternalOsolQiraa.g:429:2: iv_ruleRawee= ruleRawee EOF
            {
             newCompositeNode(grammarAccess.getRaweeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRawee=ruleRawee();

            state._fsp--;

             current =iv_ruleRawee; 
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
    // $ANTLR end "entryRuleRawee"


    // $ANTLR start "ruleRawee"
    // InternalOsolQiraa.g:435:1: ruleRawee returns [EObject current=null] : (otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) ) ;
    public final EObject ruleRawee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Person_1 = null;



        	enterRule();

        try {
            // InternalOsolQiraa.g:441:2: ( (otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) ) )
            // InternalOsolQiraa.g:442:2: (otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) )
            {
            // InternalOsolQiraa.g:442:2: (otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) )
            // InternalOsolQiraa.g:443:3: otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRaweeAccess().getArabicLetterRehArabicLetterAlefArabicLetterWawKeyword_0());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getRaweeRule());
            			}
            			newCompositeNode(grammarAccess.getRaweeAccess().getPersonParserRuleCall_1());
            		
            pushFollow(FOLLOW_11);
            this_Person_1=rulePerson(current);

            state._fsp--;


            			current = this_Person_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRaweeAccess().getArabicLetterAinArabicLetterNoonKeyword_2());
            		
            // InternalOsolQiraa.g:462:3: ( (otherlv_3= RULE_KALEMAH ) )
            // InternalOsolQiraa.g:463:4: (otherlv_3= RULE_KALEMAH )
            {
            // InternalOsolQiraa.g:463:4: (otherlv_3= RULE_KALEMAH )
            // InternalOsolQiraa.g:464:5: otherlv_3= RULE_KALEMAH
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRaweeRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_KALEMAH,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getRaweeAccess().getQareeQareeCrossReference_3_0());
            				

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
    // $ANTLR end "ruleRawee"


    // $ANTLR start "entryRuleYokraaLah"
    // InternalOsolQiraa.g:479:1: entryRuleYokraaLah returns [EObject current=null] : iv_ruleYokraaLah= ruleYokraaLah EOF ;
    public final EObject entryRuleYokraaLah() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYokraaLah = null;


        try {
            // InternalOsolQiraa.g:479:50: (iv_ruleYokraaLah= ruleYokraaLah EOF )
            // InternalOsolQiraa.g:480:2: iv_ruleYokraaLah= ruleYokraaLah EOF
            {
             newCompositeNode(grammarAccess.getYokraaLahRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleYokraaLah=ruleYokraaLah();

            state._fsp--;

             current =iv_ruleYokraaLah; 
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
    // $ANTLR end "entryRuleYokraaLah"


    // $ANTLR start "ruleYokraaLah"
    // InternalOsolQiraa.g:486:1: ruleYokraaLah returns [EObject current=null] : (this_Qaree_0= ruleQaree | this_Rawee_1= ruleRawee | this_Istelah_2= ruleIstelah ) ;
    public final EObject ruleYokraaLah() throws RecognitionException {
        EObject current = null;

        EObject this_Qaree_0 = null;

        EObject this_Rawee_1 = null;

        EObject this_Istelah_2 = null;



        	enterRule();

        try {
            // InternalOsolQiraa.g:492:2: ( (this_Qaree_0= ruleQaree | this_Rawee_1= ruleRawee | this_Istelah_2= ruleIstelah ) )
            // InternalOsolQiraa.g:493:2: (this_Qaree_0= ruleQaree | this_Rawee_1= ruleRawee | this_Istelah_2= ruleIstelah )
            {
            // InternalOsolQiraa.g:493:2: (this_Qaree_0= ruleQaree | this_Rawee_1= ruleRawee | this_Istelah_2= ruleIstelah )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 38:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalOsolQiraa.g:494:3: this_Qaree_0= ruleQaree
                    {

                    			newCompositeNode(grammarAccess.getYokraaLahAccess().getQareeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Qaree_0=ruleQaree();

                    state._fsp--;


                    			current = this_Qaree_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOsolQiraa.g:503:3: this_Rawee_1= ruleRawee
                    {

                    			newCompositeNode(grammarAccess.getYokraaLahAccess().getRaweeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rawee_1=ruleRawee();

                    state._fsp--;


                    			current = this_Rawee_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOsolQiraa.g:512:3: this_Istelah_2= ruleIstelah
                    {

                    			newCompositeNode(grammarAccess.getYokraaLahAccess().getIstelahParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Istelah_2=ruleIstelah();

                    state._fsp--;


                    			current = this_Istelah_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleYokraaLah"


    // $ANTLR start "entryRuleTareek"
    // InternalOsolQiraa.g:524:1: entryRuleTareek returns [EObject current=null] : iv_ruleTareek= ruleTareek EOF ;
    public final EObject entryRuleTareek() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTareek = null;


        try {
            // InternalOsolQiraa.g:524:47: (iv_ruleTareek= ruleTareek EOF )
            // InternalOsolQiraa.g:525:2: iv_ruleTareek= ruleTareek EOF
            {
             newCompositeNode(grammarAccess.getTareekRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTareek=ruleTareek();

            state._fsp--;

             current =iv_ruleTareek; 
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
    // $ANTLR end "entryRuleTareek"


    // $ANTLR start "ruleTareek"
    // InternalOsolQiraa.g:531:1: ruleTareek returns [EObject current=null] : (otherlv_0= '\\u0637\\u0631\\u064A\\u0642' otherlv_1= '\\u062A\\u0644\\u0627\\u0648\\u0629' ( (lv_name_2_0= RULE_KALEMAH ) ) ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) ) ) ;
    public final EObject ruleTareek() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_simple_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_complex_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalOsolQiraa.g:537:2: ( (otherlv_0= '\\u0637\\u0631\\u064A\\u0642' otherlv_1= '\\u062A\\u0644\\u0627\\u0648\\u0629' ( (lv_name_2_0= RULE_KALEMAH ) ) ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) ) ) )
            // InternalOsolQiraa.g:538:2: (otherlv_0= '\\u0637\\u0631\\u064A\\u0642' otherlv_1= '\\u062A\\u0644\\u0627\\u0648\\u0629' ( (lv_name_2_0= RULE_KALEMAH ) ) ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) ) )
            {
            // InternalOsolQiraa.g:538:2: (otherlv_0= '\\u0637\\u0631\\u064A\\u0642' otherlv_1= '\\u062A\\u0644\\u0627\\u0648\\u0629' ( (lv_name_2_0= RULE_KALEMAH ) ) ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) ) )
            // InternalOsolQiraa.g:539:3: otherlv_0= '\\u0637\\u0631\\u064A\\u0642' otherlv_1= '\\u062A\\u0644\\u0627\\u0648\\u0629' ( (lv_name_2_0= RULE_KALEMAH ) ) ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTareekAccess().getArabicLetterTahArabicLetterRehArabicLetterYehArabicLetterQafKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTareekAccess().getArabicLetterTehArabicLetterLamArabicLetterAlefArabicLetterWawArabicLetterTehMarbutaKeyword_1());
            		
            // InternalOsolQiraa.g:547:3: ( (lv_name_2_0= RULE_KALEMAH ) )
            // InternalOsolQiraa.g:548:4: (lv_name_2_0= RULE_KALEMAH )
            {
            // InternalOsolQiraa.g:548:4: (lv_name_2_0= RULE_KALEMAH )
            // InternalOsolQiraa.g:549:5: lv_name_2_0= RULE_KALEMAH
            {
            lv_name_2_0=(Token)match(input,RULE_KALEMAH,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTareekAccess().getNameKALEMAHTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTareekRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.qwork.Arabic.KALEMAH");
            				

            }


            }

            // InternalOsolQiraa.g:565:3: ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            else if ( (LA8_0==35) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalOsolQiraa.g:566:4: ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) )
                    {
                    // InternalOsolQiraa.g:566:4: ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) )
                    // InternalOsolQiraa.g:567:5: ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) )
                    {
                    // InternalOsolQiraa.g:567:5: ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) )
                    // InternalOsolQiraa.g:568:6: (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' )
                    {
                    // InternalOsolQiraa.g:568:6: (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' )
                    // InternalOsolQiraa.g:569:7: lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635'
                    {
                    lv_simple_3_0=(Token)match(input,33,FOLLOW_14); 

                    							newLeafNode(lv_simple_3_0, grammarAccess.getTareekAccess().getSimpleArabicLetterKhahArabicLetterAlefArabicLetterLamArabicLetterSadKeyword_3_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTareekRule());
                    							}
                    							setWithLastConsumed(current, "simple", lv_simple_3_0 != null, "\u062E\u0627\u0644\u0635");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,34,FOLLOW_5); 

                    					newLeafNode(otherlv_4, grammarAccess.getTareekAccess().getArabicLetterLamKeyword_3_0_1());
                    				
                    // InternalOsolQiraa.g:585:5: ( (otherlv_5= RULE_KALEMAH ) )
                    // InternalOsolQiraa.g:586:6: (otherlv_5= RULE_KALEMAH )
                    {
                    // InternalOsolQiraa.g:586:6: (otherlv_5= RULE_KALEMAH )
                    // InternalOsolQiraa.g:587:7: otherlv_5= RULE_KALEMAH
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTareekRule());
                    							}
                    						
                    otherlv_5=(Token)match(input,RULE_KALEMAH,FOLLOW_2); 

                    							newLeafNode(otherlv_5, grammarAccess.getTareekAccess().getRefYokraaLahCrossReference_3_0_2_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOsolQiraa.g:600:4: ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ )
                    {
                    // InternalOsolQiraa.g:600:4: ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ )
                    // InternalOsolQiraa.g:601:5: ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+
                    {
                    // InternalOsolQiraa.g:601:5: ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' )
                    // InternalOsolQiraa.g:602:6: ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646'
                    {
                    // InternalOsolQiraa.g:602:6: ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) )
                    // InternalOsolQiraa.g:603:7: (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' )
                    {
                    // InternalOsolQiraa.g:603:7: (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' )
                    // InternalOsolQiraa.g:604:8: lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628'
                    {
                    lv_complex_6_0=(Token)match(input,35,FOLLOW_15); 

                    								newLeafNode(lv_complex_6_0, grammarAccess.getTareekAccess().getComplexArabicLetterMeemArabicLetterRehArabicLetterKafArabicLetterBehKeyword_3_1_0_0_0());
                    							

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getTareekRule());
                    								}
                    								setWithLastConsumed(current, "complex", lv_complex_6_0 != null, "\u0645\u0631\u0643\u0628");
                    							

                    }


                    }

                    otherlv_7=(Token)match(input,36,FOLLOW_5); 

                    						newLeafNode(otherlv_7, grammarAccess.getTareekAccess().getArabicLetterMeemArabicLetterNoonKeyword_3_1_0_1());
                    					

                    }

                    // InternalOsolQiraa.g:621:5: ( (otherlv_8= RULE_KALEMAH ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_KALEMAH) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalOsolQiraa.g:622:6: (otherlv_8= RULE_KALEMAH )
                    	    {
                    	    // InternalOsolQiraa.g:622:6: (otherlv_8= RULE_KALEMAH )
                    	    // InternalOsolQiraa.g:623:7: otherlv_8= RULE_KALEMAH
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTareekRule());
                    	    							}
                    	    						
                    	    otherlv_8=(Token)match(input,RULE_KALEMAH,FOLLOW_16); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getTareekAccess().getRefsTareekCrossReference_3_1_1_0());
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }


                    }
                    break;

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
    // $ANTLR end "ruleTareek"


    // $ANTLR start "entryRuleKayd"
    // InternalOsolQiraa.g:640:1: entryRuleKayd returns [EObject current=null] : iv_ruleKayd= ruleKayd EOF ;
    public final EObject entryRuleKayd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKayd = null;


        try {
            // InternalOsolQiraa.g:640:45: (iv_ruleKayd= ruleKayd EOF )
            // InternalOsolQiraa.g:641:2: iv_ruleKayd= ruleKayd EOF
            {
             newCompositeNode(grammarAccess.getKaydRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKayd=ruleKayd();

            state._fsp--;

             current =iv_ruleKayd; 
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
    // $ANTLR end "entryRuleKayd"


    // $ANTLR start "ruleKayd"
    // InternalOsolQiraa.g:647:1: ruleKayd returns [EObject current=null] : (otherlv_0= '\\u0642\\u064A\\u062F' ( (lv_name_1_0= RULE_KALEMAH ) ) ) ;
    public final EObject ruleKayd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalOsolQiraa.g:653:2: ( (otherlv_0= '\\u0642\\u064A\\u062F' ( (lv_name_1_0= RULE_KALEMAH ) ) ) )
            // InternalOsolQiraa.g:654:2: (otherlv_0= '\\u0642\\u064A\\u062F' ( (lv_name_1_0= RULE_KALEMAH ) ) )
            {
            // InternalOsolQiraa.g:654:2: (otherlv_0= '\\u0642\\u064A\\u062F' ( (lv_name_1_0= RULE_KALEMAH ) ) )
            // InternalOsolQiraa.g:655:3: otherlv_0= '\\u0642\\u064A\\u062F' ( (lv_name_1_0= RULE_KALEMAH ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getKaydAccess().getArabicLetterQafArabicLetterYehArabicLetterDalKeyword_0());
            		
            // InternalOsolQiraa.g:659:3: ( (lv_name_1_0= RULE_KALEMAH ) )
            // InternalOsolQiraa.g:660:4: (lv_name_1_0= RULE_KALEMAH )
            {
            // InternalOsolQiraa.g:660:4: (lv_name_1_0= RULE_KALEMAH )
            // InternalOsolQiraa.g:661:5: lv_name_1_0= RULE_KALEMAH
            {
            lv_name_1_0=(Token)match(input,RULE_KALEMAH,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getKaydAccess().getNameKALEMAHTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKaydRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleKayd"


    // $ANTLR start "entryRuleIstelah"
    // InternalOsolQiraa.g:681:1: entryRuleIstelah returns [EObject current=null] : iv_ruleIstelah= ruleIstelah EOF ;
    public final EObject entryRuleIstelah() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIstelah = null;


        try {
            // InternalOsolQiraa.g:681:48: (iv_ruleIstelah= ruleIstelah EOF )
            // InternalOsolQiraa.g:682:2: iv_ruleIstelah= ruleIstelah EOF
            {
             newCompositeNode(grammarAccess.getIstelahRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIstelah=ruleIstelah();

            state._fsp--;

             current =iv_ruleIstelah; 
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
    // $ANTLR end "entryRuleIstelah"


    // $ANTLR start "ruleIstelah"
    // InternalOsolQiraa.g:688:1: ruleIstelah returns [EObject current=null] : (otherlv_0= '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* ) ;
    public final EObject ruleIstelah() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalOsolQiraa.g:694:2: ( (otherlv_0= '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* ) )
            // InternalOsolQiraa.g:695:2: (otherlv_0= '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* )
            {
            // InternalOsolQiraa.g:695:2: (otherlv_0= '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* )
            // InternalOsolQiraa.g:696:3: otherlv_0= '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )*
            {
            otherlv_0=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getIstelahAccess().getArabicLetterAlefArabicLetterSadArabicLetterTahArabicLetterLamArabicLetterAlefArabicLetterHahKeyword_0());
            		
            // InternalOsolQiraa.g:700:3: ( (lv_name_1_0= RULE_KALEMAH ) )
            // InternalOsolQiraa.g:701:4: (lv_name_1_0= RULE_KALEMAH )
            {
            // InternalOsolQiraa.g:701:4: (lv_name_1_0= RULE_KALEMAH )
            // InternalOsolQiraa.g:702:5: lv_name_1_0= RULE_KALEMAH
            {
            lv_name_1_0=(Token)match(input,RULE_KALEMAH,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIstelahAccess().getNameKALEMAHTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIstelahRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.qwork.Arabic.KALEMAH");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getIstelahAccess().getArabicLetterYehArabicLetterAinArabicLetterNoonArabicLetterYehKeyword_2());
            		
            // InternalOsolQiraa.g:722:3: ( (otherlv_3= RULE_KALEMAH ) )
            // InternalOsolQiraa.g:723:4: (otherlv_3= RULE_KALEMAH )
            {
            // InternalOsolQiraa.g:723:4: (otherlv_3= RULE_KALEMAH )
            // InternalOsolQiraa.g:724:5: otherlv_3= RULE_KALEMAH
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIstelahRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_KALEMAH,FOLLOW_18); 

            					newLeafNode(otherlv_3, grammarAccess.getIstelahAccess().getRefsYokraaLahCrossReference_3_0());
            				

            }


            }

            // InternalOsolQiraa.g:735:3: (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==40) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOsolQiraa.g:736:4: otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) )
            	    {
            	    otherlv_4=(Token)match(input,40,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIstelahAccess().getArabicLetterWawKeyword_4_0());
            	    			
            	    // InternalOsolQiraa.g:740:4: ( (otherlv_5= RULE_KALEMAH ) )
            	    // InternalOsolQiraa.g:741:5: (otherlv_5= RULE_KALEMAH )
            	    {
            	    // InternalOsolQiraa.g:741:5: (otherlv_5= RULE_KALEMAH )
            	    // InternalOsolQiraa.g:742:6: otherlv_5= RULE_KALEMAH
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIstelahRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_KALEMAH,FOLLOW_18); 

            	    						newLeafNode(otherlv_5, grammarAccess.getIstelahAccess().getRefsYokraaLahCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleIstelah"


    // $ANTLR start "entryRuleRamz"
    // InternalOsolQiraa.g:758:1: entryRuleRamz returns [EObject current=null] : iv_ruleRamz= ruleRamz EOF ;
    public final EObject entryRuleRamz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRamz = null;


        try {
            // InternalOsolQiraa.g:758:45: (iv_ruleRamz= ruleRamz EOF )
            // InternalOsolQiraa.g:759:2: iv_ruleRamz= ruleRamz EOF
            {
             newCompositeNode(grammarAccess.getRamzRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRamz=ruleRamz();

            state._fsp--;

             current =iv_ruleRamz; 
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
    // $ANTLR end "entryRuleRamz"


    // $ANTLR start "ruleRamz"
    // InternalOsolQiraa.g:765:1: ruleRamz returns [EObject current=null] : (otherlv_0= '\\u0631\\u0645\\u0632' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* ) ;
    public final EObject ruleRamz() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalOsolQiraa.g:771:2: ( (otherlv_0= '\\u0631\\u0645\\u0632' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* ) )
            // InternalOsolQiraa.g:772:2: (otherlv_0= '\\u0631\\u0645\\u0632' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* )
            {
            // InternalOsolQiraa.g:772:2: (otherlv_0= '\\u0631\\u0645\\u0632' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* )
            // InternalOsolQiraa.g:773:3: otherlv_0= '\\u0631\\u0645\\u0632' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )*
            {
            otherlv_0=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRamzAccess().getArabicLetterRehArabicLetterMeemArabicLetterZainKeyword_0());
            		
            // InternalOsolQiraa.g:777:3: ( (lv_name_1_0= RULE_KALEMAH ) )
            // InternalOsolQiraa.g:778:4: (lv_name_1_0= RULE_KALEMAH )
            {
            // InternalOsolQiraa.g:778:4: (lv_name_1_0= RULE_KALEMAH )
            // InternalOsolQiraa.g:779:5: lv_name_1_0= RULE_KALEMAH
            {
            lv_name_1_0=(Token)match(input,RULE_KALEMAH,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRamzAccess().getNameKALEMAHTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRamzRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.qwork.Arabic.KALEMAH");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRamzAccess().getArabicLetterYehArabicLetterAinArabicLetterNoonArabicLetterYehKeyword_2());
            		
            // InternalOsolQiraa.g:799:3: ( (otherlv_3= RULE_KALEMAH ) )
            // InternalOsolQiraa.g:800:4: (otherlv_3= RULE_KALEMAH )
            {
            // InternalOsolQiraa.g:800:4: (otherlv_3= RULE_KALEMAH )
            // InternalOsolQiraa.g:801:5: otherlv_3= RULE_KALEMAH
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRamzRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_KALEMAH,FOLLOW_18); 

            					newLeafNode(otherlv_3, grammarAccess.getRamzAccess().getRefsYokraaLahCrossReference_3_0());
            				

            }


            }

            // InternalOsolQiraa.g:812:3: (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==40) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalOsolQiraa.g:813:4: otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) )
            	    {
            	    otherlv_4=(Token)match(input,40,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRamzAccess().getArabicLetterWawKeyword_4_0());
            	    			
            	    // InternalOsolQiraa.g:817:4: ( (otherlv_5= RULE_KALEMAH ) )
            	    // InternalOsolQiraa.g:818:5: (otherlv_5= RULE_KALEMAH )
            	    {
            	    // InternalOsolQiraa.g:818:5: (otherlv_5= RULE_KALEMAH )
            	    // InternalOsolQiraa.g:819:6: otherlv_5= RULE_KALEMAH
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRamzRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_KALEMAH,FOLLOW_18); 

            	    						newLeafNode(otherlv_5, grammarAccess.getRamzAccess().getRefsYokraaLahCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleRamz"


    // $ANTLR start "entryRuleMawdee"
    // InternalOsolQiraa.g:835:1: entryRuleMawdee returns [String current=null] : iv_ruleMawdee= ruleMawdee EOF ;
    public final String entryRuleMawdee() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMawdee = null;


        try {
            // InternalOsolQiraa.g:835:46: (iv_ruleMawdee= ruleMawdee EOF )
            // InternalOsolQiraa.g:836:2: iv_ruleMawdee= ruleMawdee EOF
            {
             newCompositeNode(grammarAccess.getMawdeeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMawdee=ruleMawdee();

            state._fsp--;

             current =iv_ruleMawdee.getText(); 
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
    // $ANTLR end "entryRuleMawdee"


    // $ANTLR start "ruleMawdee"
    // InternalOsolQiraa.g:842:1: ruleMawdee returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u0627\\u0644\\u0623\\u0648\\u0644' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' | kw= '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' ) ;
    public final AntlrDatatypeRuleToken ruleMawdee() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOsolQiraa.g:848:2: ( (kw= '\\u0627\\u0644\\u0623\\u0648\\u0644' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' | kw= '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' ) )
            // InternalOsolQiraa.g:849:2: (kw= '\\u0627\\u0644\\u0623\\u0648\\u0644' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' | kw= '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' )
            {
            // InternalOsolQiraa.g:849:2: (kw= '\\u0627\\u0644\\u0623\\u0648\\u0644' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' | kw= '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt11=1;
                }
                break;
            case 43:
                {
                alt11=2;
                }
                break;
            case 44:
                {
                alt11=3;
                }
                break;
            case 45:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalOsolQiraa.g:850:3: kw= '\\u0627\\u0644\\u0623\\u0648\\u0644'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaAboveArabicLetterWawArabicLetterLamKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOsolQiraa.g:856:3: kw= '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterNoonArabicLetterYehKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOsolQiraa.g:862:3: kw= '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterLamArabicLetterThehKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOsolQiraa.g:868:3: kw= '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaAboveArabicLetterKhahArabicLetterYehArabicLetterRehKeyword_3());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleMawdee"


    // $ANTLR start "entryRuleHarf"
    // InternalOsolQiraa.g:877:1: entryRuleHarf returns [EObject current=null] : iv_ruleHarf= ruleHarf EOF ;
    public final EObject entryRuleHarf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHarf = null;


        try {
            // InternalOsolQiraa.g:877:45: (iv_ruleHarf= ruleHarf EOF )
            // InternalOsolQiraa.g:878:2: iv_ruleHarf= ruleHarf EOF
            {
             newCompositeNode(grammarAccess.getHarfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHarf=ruleHarf();

            state._fsp--;

             current =iv_ruleHarf; 
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
    // $ANTLR end "entryRuleHarf"


    // $ANTLR start "ruleHarf"
    // InternalOsolQiraa.g:884:1: ruleHarf returns [EObject current=null] : (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) ) ;
    public final EObject ruleHarf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalOsolQiraa.g:890:2: ( (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) ) )
            // InternalOsolQiraa.g:891:2: (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) )
            {
            // InternalOsolQiraa.g:891:2: (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) )
            // InternalOsolQiraa.g:892:3: otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getHarfAccess().getArabicLetterHahArabicLetterRehArabicLetterFehKeyword_0());
            		
            // InternalOsolQiraa.g:896:3: ( (lv_name_1_0= RULE_AWORD ) )
            // InternalOsolQiraa.g:897:4: (lv_name_1_0= RULE_AWORD )
            {
            // InternalOsolQiraa.g:897:4: (lv_name_1_0= RULE_AWORD )
            // InternalOsolQiraa.g:898:5: lv_name_1_0= RULE_AWORD
            {
            lv_name_1_0=(Token)match(input,RULE_AWORD,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getHarfAccess().getNameAWORDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHarfRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.qwork.Arabic.AWORD");
            				

            }


            }

            // InternalOsolQiraa.g:914:3: ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==47) ) {
                alt13=1;
            }
            else if ( (LA13_0==49) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalOsolQiraa.g:915:4: (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* )
                    {
                    // InternalOsolQiraa.g:915:4: (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* )
                    // InternalOsolQiraa.g:916:5: otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )*
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_19); 

                    					newLeafNode(otherlv_2, grammarAccess.getHarfAccess().getArabicLetterHehArabicLetterWawKeyword_2_0_0());
                    				
                    // InternalOsolQiraa.g:920:5: ( (lv_values_3_0= RULE_AWORD ) )
                    // InternalOsolQiraa.g:921:6: (lv_values_3_0= RULE_AWORD )
                    {
                    // InternalOsolQiraa.g:921:6: (lv_values_3_0= RULE_AWORD )
                    // InternalOsolQiraa.g:922:7: lv_values_3_0= RULE_AWORD
                    {
                    lv_values_3_0=(Token)match(input,RULE_AWORD,FOLLOW_21); 

                    							newLeafNode(lv_values_3_0, grammarAccess.getHarfAccess().getValuesAWORDTerminalRuleCall_2_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getHarfRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"values",
                    								lv_values_3_0,
                    								"org.qwork.Arabic.AWORD");
                    						

                    }


                    }

                    // InternalOsolQiraa.g:938:5: (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==48) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalOsolQiraa.g:939:6: otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) )
                    	    {
                    	    otherlv_4=(Token)match(input,48,FOLLOW_19); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getHarfAccess().getArabicLetterAlefWithHamzaAboveArabicLetterWawKeyword_2_0_2_0());
                    	    					
                    	    // InternalOsolQiraa.g:943:6: ( (lv_values_5_0= RULE_AWORD ) )
                    	    // InternalOsolQiraa.g:944:7: (lv_values_5_0= RULE_AWORD )
                    	    {
                    	    // InternalOsolQiraa.g:944:7: (lv_values_5_0= RULE_AWORD )
                    	    // InternalOsolQiraa.g:945:8: lv_values_5_0= RULE_AWORD
                    	    {
                    	    lv_values_5_0=(Token)match(input,RULE_AWORD,FOLLOW_21); 

                    	    								newLeafNode(lv_values_5_0, grammarAccess.getHarfAccess().getValuesAWORDTerminalRuleCall_2_0_2_1_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getHarfRule());
                    	    								}
                    	    								addWithLastConsumed(
                    	    									current,
                    	    									"values",
                    	    									lv_values_5_0,
                    	    									"org.qwork.Arabic.AWORD");
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalOsolQiraa.g:964:4: (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) )
                    {
                    // InternalOsolQiraa.g:964:4: (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) )
                    // InternalOsolQiraa.g:965:5: otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) )
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_19); 

                    					newLeafNode(otherlv_6, grammarAccess.getHarfAccess().getArabicLetterThalArabicLetterAlefArabicLetterTehArabicLetterHehKeyword_2_1_0());
                    				
                    // InternalOsolQiraa.g:969:5: ( (otherlv_7= RULE_AWORD ) )
                    // InternalOsolQiraa.g:970:6: (otherlv_7= RULE_AWORD )
                    {
                    // InternalOsolQiraa.g:970:6: (otherlv_7= RULE_AWORD )
                    // InternalOsolQiraa.g:971:7: otherlv_7= RULE_AWORD
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getHarfRule());
                    							}
                    						
                    otherlv_7=(Token)match(input,RULE_AWORD,FOLLOW_2); 

                    							newLeafNode(otherlv_7, grammarAccess.getHarfAccess().getRefHarfCrossReference_2_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleHarf"


    // $ANTLR start "entryRuleHarakah"
    // InternalOsolQiraa.g:988:1: entryRuleHarakah returns [EObject current=null] : iv_ruleHarakah= ruleHarakah EOF ;
    public final EObject entryRuleHarakah() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHarakah = null;


        try {
            // InternalOsolQiraa.g:988:48: (iv_ruleHarakah= ruleHarakah EOF )
            // InternalOsolQiraa.g:989:2: iv_ruleHarakah= ruleHarakah EOF
            {
             newCompositeNode(grammarAccess.getHarakahRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHarakah=ruleHarakah();

            state._fsp--;

             current =iv_ruleHarakah; 
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
    // $ANTLR end "entryRuleHarakah"


    // $ANTLR start "ruleHarakah"
    // InternalOsolQiraa.g:995:1: ruleHarakah returns [EObject current=null] : (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AWORD ) ) ) ;
    public final EObject ruleHarakah() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalOsolQiraa.g:1001:2: ( (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AWORD ) ) ) )
            // InternalOsolQiraa.g:1002:2: (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AWORD ) ) )
            {
            // InternalOsolQiraa.g:1002:2: (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AWORD ) ) )
            // InternalOsolQiraa.g:1003:3: otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AWORD ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getHarakahAccess().getArabicLetterHahArabicLetterRehArabicLetterKafArabicLetterTehMarbutaKeyword_0());
            		
            // InternalOsolQiraa.g:1007:3: ( (lv_name_1_0= RULE_KALEMAH ) )
            // InternalOsolQiraa.g:1008:4: (lv_name_1_0= RULE_KALEMAH )
            {
            // InternalOsolQiraa.g:1008:4: (lv_name_1_0= RULE_KALEMAH )
            // InternalOsolQiraa.g:1009:5: lv_name_1_0= RULE_KALEMAH
            {
            lv_name_1_0=(Token)match(input,RULE_KALEMAH,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getHarakahAccess().getNameKALEMAHTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHarakahRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.qwork.Arabic.KALEMAH");
            				

            }


            }

            otherlv_2=(Token)match(input,51,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getHarakahAccess().getArabicLetterHehArabicLetterYehKeyword_2());
            		
            // InternalOsolQiraa.g:1029:3: ( (lv_value_3_0= RULE_AWORD ) )
            // InternalOsolQiraa.g:1030:4: (lv_value_3_0= RULE_AWORD )
            {
            // InternalOsolQiraa.g:1030:4: (lv_value_3_0= RULE_AWORD )
            // InternalOsolQiraa.g:1031:5: lv_value_3_0= RULE_AWORD
            {
            lv_value_3_0=(Token)match(input,RULE_AWORD,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getHarakahAccess().getValueAWORDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHarakahRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.qwork.Arabic.AWORD");
            				

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
    // $ANTLR end "ruleHarakah"


    // $ANTLR start "entryRuleAyahStart"
    // InternalOsolQiraa.g:1051:1: entryRuleAyahStart returns [EObject current=null] : iv_ruleAyahStart= ruleAyahStart EOF ;
    public final EObject entryRuleAyahStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAyahStart = null;


        try {
            // InternalOsolQiraa.g:1051:50: (iv_ruleAyahStart= ruleAyahStart EOF )
            // InternalOsolQiraa.g:1052:2: iv_ruleAyahStart= ruleAyahStart EOF
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
    // InternalOsolQiraa.g:1058:1: ruleAyahStart returns [EObject current=null] : (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) ) ;
    public final EObject ruleAyahStart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_surah_1_0=null;
        Token otherlv_2=null;
        Token lv_ayah_3_0=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalOsolQiraa.g:1064:2: ( (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) ) )
            // InternalOsolQiraa.g:1065:2: (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) )
            {
            // InternalOsolQiraa.g:1065:2: (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) )
            // InternalOsolQiraa.g:1066:3: otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterSeenArabicLetterWawArabicLetterRehArabicLetterTehMarbutaKeyword_0());
            		
            // InternalOsolQiraa.g:1070:3: ( (lv_surah_1_0= RULE_INT ) )
            // InternalOsolQiraa.g:1071:4: (lv_surah_1_0= RULE_INT )
            {
            // InternalOsolQiraa.g:1071:4: (lv_surah_1_0= RULE_INT )
            // InternalOsolQiraa.g:1072:5: lv_surah_1_0= RULE_INT
            {
            lv_surah_1_0=(Token)match(input,RULE_INT,FOLLOW_23); 

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

            otherlv_2=(Token)match(input,53,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithMaddaAboveArabicLetterYehArabicLetterTehMarbutaKeyword_2());
            		
            // InternalOsolQiraa.g:1092:3: ( (lv_ayah_3_0= RULE_INT ) )
            // InternalOsolQiraa.g:1093:4: (lv_ayah_3_0= RULE_INT )
            {
            // InternalOsolQiraa.g:1093:4: (lv_ayah_3_0= RULE_INT )
            // InternalOsolQiraa.g:1094:5: lv_ayah_3_0= RULE_INT
            {
            lv_ayah_3_0=(Token)match(input,RULE_INT,FOLLOW_5); 

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

            // InternalOsolQiraa.g:1110:3: ( (lv_name_4_0= RULE_KALEMAH ) )
            // InternalOsolQiraa.g:1111:4: (lv_name_4_0= RULE_KALEMAH )
            {
            // InternalOsolQiraa.g:1111:4: (lv_name_4_0= RULE_KALEMAH )
            // InternalOsolQiraa.g:1112:5: lv_name_4_0= RULE_KALEMAH
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
    // InternalOsolQiraa.g:1132:1: entryRulePhrase returns [EObject current=null] : iv_rulePhrase= rulePhrase EOF ;
    public final EObject entryRulePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhrase = null;


        try {
            // InternalOsolQiraa.g:1132:47: (iv_rulePhrase= rulePhrase EOF )
            // InternalOsolQiraa.g:1133:2: iv_rulePhrase= rulePhrase EOF
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
    // InternalOsolQiraa.g:1139:1: rulePhrase returns [EObject current=null] : ( ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+ ) ;
    public final EObject rulePhrase() throws RecognitionException {
        EObject current = null;

        Token lv_basmalah_0_0=null;
        Token lv_words_1_0=null;


        	enterRule();

        try {
            // InternalOsolQiraa.g:1145:2: ( ( ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+ ) )
            // InternalOsolQiraa.g:1146:2: ( ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+ )
            {
            // InternalOsolQiraa.g:1146:2: ( ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+ )
            // InternalOsolQiraa.g:1147:3: ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+
            {
            // InternalOsolQiraa.g:1147:3: ( (lv_basmalah_0_0= RULE_BASMALAH ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_BASMALAH) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOsolQiraa.g:1148:4: (lv_basmalah_0_0= RULE_BASMALAH )
                    {
                    // InternalOsolQiraa.g:1148:4: (lv_basmalah_0_0= RULE_BASMALAH )
                    // InternalOsolQiraa.g:1149:5: lv_basmalah_0_0= RULE_BASMALAH
                    {
                    lv_basmalah_0_0=(Token)match(input,RULE_BASMALAH,FOLLOW_19); 

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

            // InternalOsolQiraa.g:1165:3: ( (lv_words_1_0= RULE_AWORD ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_AWORD) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalOsolQiraa.g:1166:4: (lv_words_1_0= RULE_AWORD )
            	    {
            	    // InternalOsolQiraa.g:1166:4: (lv_words_1_0= RULE_AWORD )
            	    // InternalOsolQiraa.g:1167:5: lv_words_1_0= RULE_AWORD
            	    {
            	    lv_words_1_0=(Token)match(input,RULE_AWORD,FOLLOW_24); 

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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000060B8000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000042L});

}