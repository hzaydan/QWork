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
import org.qwork.services.QiraaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQiraaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_KALEMAH", "RULE_INT", "RULE_AWORD", "RULE_ALETTER", "RULE_AHARAKAH", "RULE_WS", "RULE_ADIGIT", "RULE_ASHADDAH", "RULE_ANONLETTER", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'\\u0642\\u0627\\u0631\\u0626'", "'\\u0631\\u0627\\u0648'", "'\\u0639\\u0646'", "'\\u0627\\u0633\\u0645\\u0647'", "'\\u0644\\u0642\\u0628\\u0647'", "'\\u062A\\u0648\\u0641\\u064A'", "'\\u0631\\u062D\\u0645\\u0647'", "'\\u0623\\u0643\\u0631\\u0645\\u0647'", "'\\u0627\\u0644\\u0644\\u0647'", "'\\u0637\\u0631\\u064A\\u0642'", "'\\u062A\\u0644\\u0627\\u0648\\u0629'", "'\\u062E\\u0627\\u0644\\u0635'", "'\\u0644'", "'\\u0645\\u0631\\u0643\\u0628'", "'\\u0645\\u0646'", "'\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645'", "'\\u0645\\u0631\\u062C\\u0639'", "'\\u0644\\u0644\\u0625\\u0645\\u0627\\u0645'", "'\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647'", "'\\u0627\\u0646\\u062A\\u0647\\u0649'", "'\\u0642\\u0648\\u0644\\u0647'", "'\\u0645\\u0639\\u0646\\u0627\\u0647'", "'\\u0642\\u064A\\u062F'", "'\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D'", "'\\u064A\\u0639\\u0646\\u064A'", "'\\u0648'", "'\\u0631\\u0645\\u0632'", "'\\u0642\\u0631\\u0623'", "'\\u0628'", "'\\u0641\\u064A'", "'\\u062A\\u0639\\u0627\\u0644\\u0649'", "'\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639'", "'\\u0627\\u0644\\u0623\\u0648\\u0644'", "'\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A'", "'\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B'", "'\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631'", "'\\u062D\\u0631\\u0641'", "'\\u0647\\u0648'", "'\\u0623\\u0648'", "'\\u0630\\u0627\\u062A\\u0647'", "'\\u062D\\u0631\\u0643\\u0629'", "'\\u0647\\u064A'", "'\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'", "'\\u0627\\u0644\\u0622\\u064A\\u0629'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_KALEMAH=4;
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
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int RULE_AWORD=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_AHARAKAH=8;
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
    public static final int RULE_ALETTER=7;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
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

        public InternalQiraaParser(TokenStream input, QiraaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "QiraaModel";
       	}

       	@Override
       	protected QiraaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleQiraaModel"
    // InternalQiraa.g:64:1: entryRuleQiraaModel returns [EObject current=null] : iv_ruleQiraaModel= ruleQiraaModel EOF ;
    public final EObject entryRuleQiraaModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQiraaModel = null;


        try {
            // InternalQiraa.g:64:51: (iv_ruleQiraaModel= ruleQiraaModel EOF )
            // InternalQiraa.g:65:2: iv_ruleQiraaModel= ruleQiraaModel EOF
            {
             newCompositeNode(grammarAccess.getQiraaModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQiraaModel=ruleQiraaModel();

            state._fsp--;

             current =iv_ruleQiraaModel; 
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
    // $ANTLR end "entryRuleQiraaModel"


    // $ANTLR start "ruleQiraaModel"
    // InternalQiraa.g:71:1: ruleQiraaModel returns [EObject current=null] : ( ( (lv_qoraa_0_0= ruleQaree ) ) | ( (lv_torok_1_0= ruleTareek ) ) | ( (lv_rowat_2_0= ruleRawee ) ) | ( (lv_imams_3_0= ruleIMAM ) ) | ( (lv_marjee_4_0= ruleMarjeh ) ) | ( (lv_istelahat_5_0= ruleIstelah ) ) | ( (lv_koyod_6_0= ruleKayd ) ) )* ;
    public final EObject ruleQiraaModel() throws RecognitionException {
        EObject current = null;

        EObject lv_qoraa_0_0 = null;

        EObject lv_torok_1_0 = null;

        EObject lv_rowat_2_0 = null;

        EObject lv_imams_3_0 = null;

        EObject lv_marjee_4_0 = null;

        EObject lv_istelahat_5_0 = null;

        EObject lv_koyod_6_0 = null;



        	enterRule();

        try {
            // InternalQiraa.g:77:2: ( ( ( (lv_qoraa_0_0= ruleQaree ) ) | ( (lv_torok_1_0= ruleTareek ) ) | ( (lv_rowat_2_0= ruleRawee ) ) | ( (lv_imams_3_0= ruleIMAM ) ) | ( (lv_marjee_4_0= ruleMarjeh ) ) | ( (lv_istelahat_5_0= ruleIstelah ) ) | ( (lv_koyod_6_0= ruleKayd ) ) )* )
            // InternalQiraa.g:78:2: ( ( (lv_qoraa_0_0= ruleQaree ) ) | ( (lv_torok_1_0= ruleTareek ) ) | ( (lv_rowat_2_0= ruleRawee ) ) | ( (lv_imams_3_0= ruleIMAM ) ) | ( (lv_marjee_4_0= ruleMarjeh ) ) | ( (lv_istelahat_5_0= ruleIstelah ) ) | ( (lv_koyod_6_0= ruleKayd ) ) )*
            {
            // InternalQiraa.g:78:2: ( ( (lv_qoraa_0_0= ruleQaree ) ) | ( (lv_torok_1_0= ruleTareek ) ) | ( (lv_rowat_2_0= ruleRawee ) ) | ( (lv_imams_3_0= ruleIMAM ) ) | ( (lv_marjee_4_0= ruleMarjeh ) ) | ( (lv_istelahat_5_0= ruleIstelah ) ) | ( (lv_koyod_6_0= ruleKayd ) ) )*
            loop1:
            do {
                int alt1=8;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    alt1=1;
                    }
                    break;
                case 27:
                    {
                    alt1=2;
                    }
                    break;
                case 19:
                    {
                    alt1=3;
                    }
                    break;
                case 33:
                    {
                    alt1=4;
                    }
                    break;
                case 34:
                    {
                    alt1=5;
                    }
                    break;
                case 41:
                    {
                    alt1=6;
                    }
                    break;
                case 40:
                    {
                    alt1=7;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalQiraa.g:79:3: ( (lv_qoraa_0_0= ruleQaree ) )
            	    {
            	    // InternalQiraa.g:79:3: ( (lv_qoraa_0_0= ruleQaree ) )
            	    // InternalQiraa.g:80:4: (lv_qoraa_0_0= ruleQaree )
            	    {
            	    // InternalQiraa.g:80:4: (lv_qoraa_0_0= ruleQaree )
            	    // InternalQiraa.g:81:5: lv_qoraa_0_0= ruleQaree
            	    {

            	    					newCompositeNode(grammarAccess.getQiraaModelAccess().getQoraaQareeParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_qoraa_0_0=ruleQaree();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQiraaModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"qoraa",
            	    						lv_qoraa_0_0,
            	    						"org.qwork.Qiraa.Qaree");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalQiraa.g:99:3: ( (lv_torok_1_0= ruleTareek ) )
            	    {
            	    // InternalQiraa.g:99:3: ( (lv_torok_1_0= ruleTareek ) )
            	    // InternalQiraa.g:100:4: (lv_torok_1_0= ruleTareek )
            	    {
            	    // InternalQiraa.g:100:4: (lv_torok_1_0= ruleTareek )
            	    // InternalQiraa.g:101:5: lv_torok_1_0= ruleTareek
            	    {

            	    					newCompositeNode(grammarAccess.getQiraaModelAccess().getTorokTareekParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_torok_1_0=ruleTareek();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQiraaModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"torok",
            	    						lv_torok_1_0,
            	    						"org.qwork.Qiraa.Tareek");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalQiraa.g:119:3: ( (lv_rowat_2_0= ruleRawee ) )
            	    {
            	    // InternalQiraa.g:119:3: ( (lv_rowat_2_0= ruleRawee ) )
            	    // InternalQiraa.g:120:4: (lv_rowat_2_0= ruleRawee )
            	    {
            	    // InternalQiraa.g:120:4: (lv_rowat_2_0= ruleRawee )
            	    // InternalQiraa.g:121:5: lv_rowat_2_0= ruleRawee
            	    {

            	    					newCompositeNode(grammarAccess.getQiraaModelAccess().getRowatRaweeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_rowat_2_0=ruleRawee();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQiraaModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rowat",
            	    						lv_rowat_2_0,
            	    						"org.qwork.Qiraa.Rawee");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalQiraa.g:139:3: ( (lv_imams_3_0= ruleIMAM ) )
            	    {
            	    // InternalQiraa.g:139:3: ( (lv_imams_3_0= ruleIMAM ) )
            	    // InternalQiraa.g:140:4: (lv_imams_3_0= ruleIMAM )
            	    {
            	    // InternalQiraa.g:140:4: (lv_imams_3_0= ruleIMAM )
            	    // InternalQiraa.g:141:5: lv_imams_3_0= ruleIMAM
            	    {

            	    					newCompositeNode(grammarAccess.getQiraaModelAccess().getImamsIMAMParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imams_3_0=ruleIMAM();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQiraaModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imams",
            	    						lv_imams_3_0,
            	    						"org.qwork.Qiraa.IMAM");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalQiraa.g:159:3: ( (lv_marjee_4_0= ruleMarjeh ) )
            	    {
            	    // InternalQiraa.g:159:3: ( (lv_marjee_4_0= ruleMarjeh ) )
            	    // InternalQiraa.g:160:4: (lv_marjee_4_0= ruleMarjeh )
            	    {
            	    // InternalQiraa.g:160:4: (lv_marjee_4_0= ruleMarjeh )
            	    // InternalQiraa.g:161:5: lv_marjee_4_0= ruleMarjeh
            	    {

            	    					newCompositeNode(grammarAccess.getQiraaModelAccess().getMarjeeMarjehParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_marjee_4_0=ruleMarjeh();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQiraaModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"marjee",
            	    						lv_marjee_4_0,
            	    						"org.qwork.Qiraa.Marjeh");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalQiraa.g:179:3: ( (lv_istelahat_5_0= ruleIstelah ) )
            	    {
            	    // InternalQiraa.g:179:3: ( (lv_istelahat_5_0= ruleIstelah ) )
            	    // InternalQiraa.g:180:4: (lv_istelahat_5_0= ruleIstelah )
            	    {
            	    // InternalQiraa.g:180:4: (lv_istelahat_5_0= ruleIstelah )
            	    // InternalQiraa.g:181:5: lv_istelahat_5_0= ruleIstelah
            	    {

            	    					newCompositeNode(grammarAccess.getQiraaModelAccess().getIstelahatIstelahParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_istelahat_5_0=ruleIstelah();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQiraaModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"istelahat",
            	    						lv_istelahat_5_0,
            	    						"org.qwork.Qiraa.Istelah");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalQiraa.g:199:3: ( (lv_koyod_6_0= ruleKayd ) )
            	    {
            	    // InternalQiraa.g:199:3: ( (lv_koyod_6_0= ruleKayd ) )
            	    // InternalQiraa.g:200:4: (lv_koyod_6_0= ruleKayd )
            	    {
            	    // InternalQiraa.g:200:4: (lv_koyod_6_0= ruleKayd )
            	    // InternalQiraa.g:201:5: lv_koyod_6_0= ruleKayd
            	    {

            	    					newCompositeNode(grammarAccess.getQiraaModelAccess().getKoyodKaydParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_koyod_6_0=ruleKayd();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQiraaModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"koyod",
            	    						lv_koyod_6_0,
            	    						"org.qwork.Qiraa.Kayd");
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
    // $ANTLR end "ruleQiraaModel"


    // $ANTLR start "entryRuleQaree"
    // InternalQiraa.g:222:1: entryRuleQaree returns [EObject current=null] : iv_ruleQaree= ruleQaree EOF ;
    public final EObject entryRuleQaree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQaree = null;


        try {
            // InternalQiraa.g:222:46: (iv_ruleQaree= ruleQaree EOF )
            // InternalQiraa.g:223:2: iv_ruleQaree= ruleQaree EOF
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
    // InternalQiraa.g:229:1: ruleQaree returns [EObject current=null] : (otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current] ) ;
    public final EObject ruleQaree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Person_1 = null;



        	enterRule();

        try {
            // InternalQiraa.g:235:2: ( (otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current] ) )
            // InternalQiraa.g:236:2: (otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current] )
            {
            // InternalQiraa.g:236:2: (otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current] )
            // InternalQiraa.g:237:3: otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current]
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

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
    // InternalQiraa.g:256:1: entryRuleRawee returns [EObject current=null] : iv_ruleRawee= ruleRawee EOF ;
    public final EObject entryRuleRawee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRawee = null;


        try {
            // InternalQiraa.g:256:46: (iv_ruleRawee= ruleRawee EOF )
            // InternalQiraa.g:257:2: iv_ruleRawee= ruleRawee EOF
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
    // InternalQiraa.g:263:1: ruleRawee returns [EObject current=null] : (otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) ) ;
    public final EObject ruleRawee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Person_1 = null;



        	enterRule();

        try {
            // InternalQiraa.g:269:2: ( (otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) ) )
            // InternalQiraa.g:270:2: (otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) )
            {
            // InternalQiraa.g:270:2: (otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) )
            // InternalQiraa.g:271:3: otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRaweeAccess().getArabicLetterRehArabicLetterAlefArabicLetterWawKeyword_0());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getRaweeRule());
            			}
            			newCompositeNode(grammarAccess.getRaweeAccess().getPersonParserRuleCall_1());
            		
            pushFollow(FOLLOW_5);
            this_Person_1=rulePerson(current);

            state._fsp--;


            			current = this_Person_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRaweeAccess().getArabicLetterAinArabicLetterNoonKeyword_2());
            		
            // InternalQiraa.g:290:3: ( (otherlv_3= RULE_KALEMAH ) )
            // InternalQiraa.g:291:4: (otherlv_3= RULE_KALEMAH )
            {
            // InternalQiraa.g:291:4: (otherlv_3= RULE_KALEMAH )
            // InternalQiraa.g:292:5: otherlv_3= RULE_KALEMAH
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
    // InternalQiraa.g:307:1: entryRuleYokraaLah returns [EObject current=null] : iv_ruleYokraaLah= ruleYokraaLah EOF ;
    public final EObject entryRuleYokraaLah() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYokraaLah = null;


        try {
            // InternalQiraa.g:307:50: (iv_ruleYokraaLah= ruleYokraaLah EOF )
            // InternalQiraa.g:308:2: iv_ruleYokraaLah= ruleYokraaLah EOF
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
    // InternalQiraa.g:314:1: ruleYokraaLah returns [EObject current=null] : (this_Qaree_0= ruleQaree | this_Rawee_1= ruleRawee | this_Istelah_2= ruleIstelah ) ;
    public final EObject ruleYokraaLah() throws RecognitionException {
        EObject current = null;

        EObject this_Qaree_0 = null;

        EObject this_Rawee_1 = null;

        EObject this_Istelah_2 = null;



        	enterRule();

        try {
            // InternalQiraa.g:320:2: ( (this_Qaree_0= ruleQaree | this_Rawee_1= ruleRawee | this_Istelah_2= ruleIstelah ) )
            // InternalQiraa.g:321:2: (this_Qaree_0= ruleQaree | this_Rawee_1= ruleRawee | this_Istelah_2= ruleIstelah )
            {
            // InternalQiraa.g:321:2: (this_Qaree_0= ruleQaree | this_Rawee_1= ruleRawee | this_Istelah_2= ruleIstelah )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 41:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQiraa.g:322:3: this_Qaree_0= ruleQaree
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
                    // InternalQiraa.g:331:3: this_Rawee_1= ruleRawee
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
                    // InternalQiraa.g:340:3: this_Istelah_2= ruleIstelah
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


    // $ANTLR start "rulePerson"
    // InternalQiraa.g:353:1: rulePerson[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )? ) ;
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
            // InternalQiraa.g:359:2: ( ( ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )? ) )
            // InternalQiraa.g:360:2: ( ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )? )
            {
            // InternalQiraa.g:360:2: ( ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )? )
            // InternalQiraa.g:361:3: ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )?
            {
            // InternalQiraa.g:361:3: ( (lv_name_0_0= RULE_KALEMAH ) )
            // InternalQiraa.g:362:4: (lv_name_0_0= RULE_KALEMAH )
            {
            // InternalQiraa.g:362:4: (lv_name_0_0= RULE_KALEMAH )
            // InternalQiraa.g:363:5: lv_name_0_0= RULE_KALEMAH
            {
            lv_name_0_0=(Token)match(input,RULE_KALEMAH,FOLLOW_6); 

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

            // InternalQiraa.g:379:3: (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQiraa.g:380:4: otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getPersonAccess().getArabicLetterAlefArabicLetterSeenArabicLetterMeemArabicLetterHehKeyword_1_0());
                    			
                    // InternalQiraa.g:384:4: ( (lv_esm_2_0= RULE_KALEMAH ) )
                    // InternalQiraa.g:385:5: (lv_esm_2_0= RULE_KALEMAH )
                    {
                    // InternalQiraa.g:385:5: (lv_esm_2_0= RULE_KALEMAH )
                    // InternalQiraa.g:386:6: lv_esm_2_0= RULE_KALEMAH
                    {
                    lv_esm_2_0=(Token)match(input,RULE_KALEMAH,FOLLOW_7); 

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

            // InternalQiraa.g:403:3: (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalQiraa.g:404:4: otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getArabicLetterLamArabicLetterQafArabicLetterBehArabicLetterHehKeyword_2_0());
                    			
                    // InternalQiraa.g:408:4: ( (lv_lakab_4_0= RULE_KALEMAH ) )
                    // InternalQiraa.g:409:5: (lv_lakab_4_0= RULE_KALEMAH )
                    {
                    // InternalQiraa.g:409:5: (lv_lakab_4_0= RULE_KALEMAH )
                    // InternalQiraa.g:410:6: lv_lakab_4_0= RULE_KALEMAH
                    {
                    lv_lakab_4_0=(Token)match(input,RULE_KALEMAH,FOLLOW_8); 

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

            // InternalQiraa.g:427:3: (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQiraa.g:428:4: otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getPersonAccess().getArabicLetterTehArabicLetterWawArabicLetterFehArabicLetterYehKeyword_3_0());
                    			
                    // InternalQiraa.g:432:4: ( (lv_towofia_6_0= RULE_INT ) )
                    // InternalQiraa.g:433:5: (lv_towofia_6_0= RULE_INT )
                    {
                    // InternalQiraa.g:433:5: (lv_towofia_6_0= RULE_INT )
                    // InternalQiraa.g:434:6: lv_towofia_6_0= RULE_INT
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
    // InternalQiraa.g:456:1: ruleDouaa[EObject in_current] returns [EObject current=in_current] : ( ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) ) otherlv_1= '\\u0627\\u0644\\u0644\\u0647' ) ;
    public final EObject ruleDouaa(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_d_0_1=null;
        Token lv_d_0_2=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalQiraa.g:462:2: ( ( ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) ) otherlv_1= '\\u0627\\u0644\\u0644\\u0647' ) )
            // InternalQiraa.g:463:2: ( ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) ) otherlv_1= '\\u0627\\u0644\\u0644\\u0647' )
            {
            // InternalQiraa.g:463:2: ( ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) ) otherlv_1= '\\u0627\\u0644\\u0644\\u0647' )
            // InternalQiraa.g:464:3: ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) ) otherlv_1= '\\u0627\\u0644\\u0644\\u0647'
            {
            // InternalQiraa.g:464:3: ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) )
            // InternalQiraa.g:465:4: ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) )
            {
            // InternalQiraa.g:465:4: ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) )
            // InternalQiraa.g:466:5: (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' )
            {
            // InternalQiraa.g:466:5: (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalQiraa.g:467:6: lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647'
                    {
                    lv_d_0_1=(Token)match(input,24,FOLLOW_10); 

                    						newLeafNode(lv_d_0_1, grammarAccess.getDouaaAccess().getDArabicLetterRehArabicLetterHahArabicLetterMeemArabicLetterHehKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDouaaRule());
                    						}
                    						setWithLastConsumed(current, "d", lv_d_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalQiraa.g:478:6: lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647'
                    {
                    lv_d_0_2=(Token)match(input,25,FOLLOW_10); 

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


    // $ANTLR start "entryRuleTareek"
    // InternalQiraa.g:499:1: entryRuleTareek returns [EObject current=null] : iv_ruleTareek= ruleTareek EOF ;
    public final EObject entryRuleTareek() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTareek = null;


        try {
            // InternalQiraa.g:499:47: (iv_ruleTareek= ruleTareek EOF )
            // InternalQiraa.g:500:2: iv_ruleTareek= ruleTareek EOF
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
    // InternalQiraa.g:506:1: ruleTareek returns [EObject current=null] : (otherlv_0= '\\u0637\\u0631\\u064A\\u0642' otherlv_1= '\\u062A\\u0644\\u0627\\u0648\\u0629' ( (lv_name_2_0= RULE_KALEMAH ) ) ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) ) ) ;
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
            // InternalQiraa.g:512:2: ( (otherlv_0= '\\u0637\\u0631\\u064A\\u0642' otherlv_1= '\\u062A\\u0644\\u0627\\u0648\\u0629' ( (lv_name_2_0= RULE_KALEMAH ) ) ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) ) ) )
            // InternalQiraa.g:513:2: (otherlv_0= '\\u0637\\u0631\\u064A\\u0642' otherlv_1= '\\u062A\\u0644\\u0627\\u0648\\u0629' ( (lv_name_2_0= RULE_KALEMAH ) ) ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) ) )
            {
            // InternalQiraa.g:513:2: (otherlv_0= '\\u0637\\u0631\\u064A\\u0642' otherlv_1= '\\u062A\\u0644\\u0627\\u0648\\u0629' ( (lv_name_2_0= RULE_KALEMAH ) ) ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) ) )
            // InternalQiraa.g:514:3: otherlv_0= '\\u0637\\u0631\\u064A\\u0642' otherlv_1= '\\u062A\\u0644\\u0627\\u0648\\u0629' ( (lv_name_2_0= RULE_KALEMAH ) ) ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTareekAccess().getArabicLetterTahArabicLetterRehArabicLetterYehArabicLetterQafKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTareekAccess().getArabicLetterTehArabicLetterLamArabicLetterAlefArabicLetterWawArabicLetterTehMarbutaKeyword_1());
            		
            // InternalQiraa.g:522:3: ( (lv_name_2_0= RULE_KALEMAH ) )
            // InternalQiraa.g:523:4: (lv_name_2_0= RULE_KALEMAH )
            {
            // InternalQiraa.g:523:4: (lv_name_2_0= RULE_KALEMAH )
            // InternalQiraa.g:524:5: lv_name_2_0= RULE_KALEMAH
            {
            lv_name_2_0=(Token)match(input,RULE_KALEMAH,FOLLOW_12); 

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

            // InternalQiraa.g:540:3: ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            else if ( (LA8_0==31) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalQiraa.g:541:4: ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) )
                    {
                    // InternalQiraa.g:541:4: ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) )
                    // InternalQiraa.g:542:5: ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) )
                    {
                    // InternalQiraa.g:542:5: ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) )
                    // InternalQiraa.g:543:6: (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' )
                    {
                    // InternalQiraa.g:543:6: (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' )
                    // InternalQiraa.g:544:7: lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635'
                    {
                    lv_simple_3_0=(Token)match(input,29,FOLLOW_13); 

                    							newLeafNode(lv_simple_3_0, grammarAccess.getTareekAccess().getSimpleArabicLetterKhahArabicLetterAlefArabicLetterLamArabicLetterSadKeyword_3_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTareekRule());
                    							}
                    							setWithLastConsumed(current, "simple", lv_simple_3_0 != null, "\u062E\u0627\u0644\u0635");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,30,FOLLOW_4); 

                    					newLeafNode(otherlv_4, grammarAccess.getTareekAccess().getArabicLetterLamKeyword_3_0_1());
                    				
                    // InternalQiraa.g:560:5: ( (otherlv_5= RULE_KALEMAH ) )
                    // InternalQiraa.g:561:6: (otherlv_5= RULE_KALEMAH )
                    {
                    // InternalQiraa.g:561:6: (otherlv_5= RULE_KALEMAH )
                    // InternalQiraa.g:562:7: otherlv_5= RULE_KALEMAH
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
                    // InternalQiraa.g:575:4: ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ )
                    {
                    // InternalQiraa.g:575:4: ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ )
                    // InternalQiraa.g:576:5: ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+
                    {
                    // InternalQiraa.g:576:5: ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' )
                    // InternalQiraa.g:577:6: ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646'
                    {
                    // InternalQiraa.g:577:6: ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) )
                    // InternalQiraa.g:578:7: (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' )
                    {
                    // InternalQiraa.g:578:7: (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' )
                    // InternalQiraa.g:579:8: lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628'
                    {
                    lv_complex_6_0=(Token)match(input,31,FOLLOW_14); 

                    								newLeafNode(lv_complex_6_0, grammarAccess.getTareekAccess().getComplexArabicLetterMeemArabicLetterRehArabicLetterKafArabicLetterBehKeyword_3_1_0_0_0());
                    							

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getTareekRule());
                    								}
                    								setWithLastConsumed(current, "complex", lv_complex_6_0 != null, "\u0645\u0631\u0643\u0628");
                    							

                    }


                    }

                    otherlv_7=(Token)match(input,32,FOLLOW_4); 

                    						newLeafNode(otherlv_7, grammarAccess.getTareekAccess().getArabicLetterMeemArabicLetterNoonKeyword_3_1_0_1());
                    					

                    }

                    // InternalQiraa.g:596:5: ( (otherlv_8= RULE_KALEMAH ) )+
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
                    	    // InternalQiraa.g:597:6: (otherlv_8= RULE_KALEMAH )
                    	    {
                    	    // InternalQiraa.g:597:6: (otherlv_8= RULE_KALEMAH )
                    	    // InternalQiraa.g:598:7: otherlv_8= RULE_KALEMAH
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTareekRule());
                    	    							}
                    	    						
                    	    otherlv_8=(Token)match(input,RULE_KALEMAH,FOLLOW_15); 

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


    // $ANTLR start "entryRuleIMAM"
    // InternalQiraa.g:615:1: entryRuleIMAM returns [EObject current=null] : iv_ruleIMAM= ruleIMAM EOF ;
    public final EObject entryRuleIMAM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIMAM = null;


        try {
            // InternalQiraa.g:615:45: (iv_ruleIMAM= ruleIMAM EOF )
            // InternalQiraa.g:616:2: iv_ruleIMAM= ruleIMAM EOF
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
    // InternalQiraa.g:622:1: ruleIMAM returns [EObject current=null] : (otherlv_0= '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' this_Person_1= rulePerson[$current] this_Douaa_2= ruleDouaa[$current] ) ;
    public final EObject ruleIMAM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Person_1 = null;

        EObject this_Douaa_2 = null;



        	enterRule();

        try {
            // InternalQiraa.g:628:2: ( (otherlv_0= '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' this_Person_1= rulePerson[$current] this_Douaa_2= ruleDouaa[$current] ) )
            // InternalQiraa.g:629:2: (otherlv_0= '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' this_Person_1= rulePerson[$current] this_Douaa_2= ruleDouaa[$current] )
            {
            // InternalQiraa.g:629:2: (otherlv_0= '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' this_Person_1= rulePerson[$current] this_Douaa_2= ruleDouaa[$current] )
            // InternalQiraa.g:630:3: otherlv_0= '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' this_Person_1= rulePerson[$current] this_Douaa_2= ruleDouaa[$current]
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIMAMAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaBelowArabicLetterMeemArabicLetterAlefArabicLetterMeemKeyword_0());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getIMAMRule());
            			}
            			newCompositeNode(grammarAccess.getIMAMAccess().getPersonParserRuleCall_1());
            		
            pushFollow(FOLLOW_16);
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


    // $ANTLR start "entryRuleMarjeh"
    // InternalQiraa.g:660:1: entryRuleMarjeh returns [EObject current=null] : iv_ruleMarjeh= ruleMarjeh EOF ;
    public final EObject entryRuleMarjeh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarjeh = null;


        try {
            // InternalQiraa.g:660:47: (iv_ruleMarjeh= ruleMarjeh EOF )
            // InternalQiraa.g:661:2: iv_ruleMarjeh= ruleMarjeh EOF
            {
             newCompositeNode(grammarAccess.getMarjehRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMarjeh=ruleMarjeh();

            state._fsp--;

             current =iv_ruleMarjeh; 
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
    // $ANTLR end "entryRuleMarjeh"


    // $ANTLR start "ruleMarjeh"
    // InternalQiraa.g:667:1: ruleMarjeh returns [EObject current=null] : (otherlv_0= '\\u0645\\u0631\\u062C\\u0639' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0644\\u0644\\u0625\\u0645\\u0627\\u0645' ( (otherlv_3= RULE_KALEMAH ) ) this_Douaa_4= ruleDouaa[$current] otherlv_5= '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647' ( (lv_romoz_6_0= ruleRamz ) )* ( (lv_makateh_7_0= ruleMaktah ) )+ otherlv_8= '\\u0627\\u0646\\u062A\\u0647\\u0649' ) ;
    public final EObject ruleMarjeh() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject this_Douaa_4 = null;

        EObject lv_romoz_6_0 = null;

        EObject lv_makateh_7_0 = null;



        	enterRule();

        try {
            // InternalQiraa.g:673:2: ( (otherlv_0= '\\u0645\\u0631\\u062C\\u0639' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0644\\u0644\\u0625\\u0645\\u0627\\u0645' ( (otherlv_3= RULE_KALEMAH ) ) this_Douaa_4= ruleDouaa[$current] otherlv_5= '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647' ( (lv_romoz_6_0= ruleRamz ) )* ( (lv_makateh_7_0= ruleMaktah ) )+ otherlv_8= '\\u0627\\u0646\\u062A\\u0647\\u0649' ) )
            // InternalQiraa.g:674:2: (otherlv_0= '\\u0645\\u0631\\u062C\\u0639' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0644\\u0644\\u0625\\u0645\\u0627\\u0645' ( (otherlv_3= RULE_KALEMAH ) ) this_Douaa_4= ruleDouaa[$current] otherlv_5= '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647' ( (lv_romoz_6_0= ruleRamz ) )* ( (lv_makateh_7_0= ruleMaktah ) )+ otherlv_8= '\\u0627\\u0646\\u062A\\u0647\\u0649' )
            {
            // InternalQiraa.g:674:2: (otherlv_0= '\\u0645\\u0631\\u062C\\u0639' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0644\\u0644\\u0625\\u0645\\u0627\\u0645' ( (otherlv_3= RULE_KALEMAH ) ) this_Douaa_4= ruleDouaa[$current] otherlv_5= '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647' ( (lv_romoz_6_0= ruleRamz ) )* ( (lv_makateh_7_0= ruleMaktah ) )+ otherlv_8= '\\u0627\\u0646\\u062A\\u0647\\u0649' )
            // InternalQiraa.g:675:3: otherlv_0= '\\u0645\\u0631\\u062C\\u0639' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0644\\u0644\\u0625\\u0645\\u0627\\u0645' ( (otherlv_3= RULE_KALEMAH ) ) this_Douaa_4= ruleDouaa[$current] otherlv_5= '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647' ( (lv_romoz_6_0= ruleRamz ) )* ( (lv_makateh_7_0= ruleMaktah ) )+ otherlv_8= '\\u0627\\u0646\\u062A\\u0647\\u0649'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMarjehAccess().getArabicLetterMeemArabicLetterRehArabicLetterJeemArabicLetterAinKeyword_0());
            		
            // InternalQiraa.g:679:3: ( (lv_name_1_0= RULE_KALEMAH ) )
            // InternalQiraa.g:680:4: (lv_name_1_0= RULE_KALEMAH )
            {
            // InternalQiraa.g:680:4: (lv_name_1_0= RULE_KALEMAH )
            // InternalQiraa.g:681:5: lv_name_1_0= RULE_KALEMAH
            {
            lv_name_1_0=(Token)match(input,RULE_KALEMAH,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMarjehAccess().getNameKALEMAHTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMarjehRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.qwork.Arabic.KALEMAH");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMarjehAccess().getArabicLetterLamArabicLetterLamArabicLetterAlefWithHamzaBelowArabicLetterMeemArabicLetterAlefArabicLetterMeemKeyword_2());
            		
            // InternalQiraa.g:701:3: ( (otherlv_3= RULE_KALEMAH ) )
            // InternalQiraa.g:702:4: (otherlv_3= RULE_KALEMAH )
            {
            // InternalQiraa.g:702:4: (otherlv_3= RULE_KALEMAH )
            // InternalQiraa.g:703:5: otherlv_3= RULE_KALEMAH
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMarjehRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_KALEMAH,FOLLOW_16); 

            					newLeafNode(otherlv_3, grammarAccess.getMarjehAccess().getRefIMAMCrossReference_3_0());
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMarjehRule());
            			}
            			newCompositeNode(grammarAccess.getMarjehAccess().getDouaaParserRuleCall_4());
            		
            pushFollow(FOLLOW_18);
            this_Douaa_4=ruleDouaa(current);

            state._fsp--;


            			current = this_Douaa_4;
            			afterParserOrEnumRuleCall();
            		
            otherlv_5=(Token)match(input,36,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getMarjehAccess().getArabicLetterTehArabicLetterFehArabicLetterSadArabicLetterYehArabicLetterLamArabicLetterHehKeyword_5());
            		
            // InternalQiraa.g:729:3: ( (lv_romoz_6_0= ruleRamz ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==44) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalQiraa.g:730:4: (lv_romoz_6_0= ruleRamz )
            	    {
            	    // InternalQiraa.g:730:4: (lv_romoz_6_0= ruleRamz )
            	    // InternalQiraa.g:731:5: lv_romoz_6_0= ruleRamz
            	    {

            	    					newCompositeNode(grammarAccess.getMarjehAccess().getRomozRamzParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_romoz_6_0=ruleRamz();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMarjehRule());
            	    					}
            	    					add(
            	    						current,
            	    						"romoz",
            	    						lv_romoz_6_0,
            	    						"org.qwork.Qiraa.Ramz");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalQiraa.g:748:3: ( (lv_makateh_7_0= ruleMaktah ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==38) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalQiraa.g:749:4: (lv_makateh_7_0= ruleMaktah )
            	    {
            	    // InternalQiraa.g:749:4: (lv_makateh_7_0= ruleMaktah )
            	    // InternalQiraa.g:750:5: lv_makateh_7_0= ruleMaktah
            	    {

            	    					newCompositeNode(grammarAccess.getMarjehAccess().getMakatehMaktahParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_makateh_7_0=ruleMaktah();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMarjehRule());
            	    					}
            	    					add(
            	    						current,
            	    						"makateh",
            	    						lv_makateh_7_0,
            	    						"org.qwork.Qiraa.Maktah");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_8=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMarjehAccess().getArabicLetterAlefArabicLetterNoonArabicLetterTehArabicLetterHehArabicLetterAlefMaksuraKeyword_8());
            		

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
    // $ANTLR end "ruleMarjeh"


    // $ANTLR start "entryRuleMaktah"
    // InternalQiraa.g:775:1: entryRuleMaktah returns [EObject current=null] : iv_ruleMaktah= ruleMaktah EOF ;
    public final EObject entryRuleMaktah() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaktah = null;


        try {
            // InternalQiraa.g:775:47: (iv_ruleMaktah= ruleMaktah EOF )
            // InternalQiraa.g:776:2: iv_ruleMaktah= ruleMaktah EOF
            {
             newCompositeNode(grammarAccess.getMaktahRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaktah=ruleMaktah();

            state._fsp--;

             current =iv_ruleMaktah; 
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
    // $ANTLR end "entryRuleMaktah"


    // $ANTLR start "ruleMaktah"
    // InternalQiraa.g:782:1: ruleMaktah returns [EObject current=null] : (otherlv_0= '\\u0642\\u0648\\u0644\\u0647' ( (lv_nass_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0645\\u0639\\u0646\\u0627\\u0647' ( (lv_kedah_3_0= ruleKaaedah ) ) ) ;
    public final EObject ruleMaktah() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nass_1_0=null;
        Token otherlv_2=null;
        EObject lv_kedah_3_0 = null;



        	enterRule();

        try {
            // InternalQiraa.g:788:2: ( (otherlv_0= '\\u0642\\u0648\\u0644\\u0647' ( (lv_nass_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0645\\u0639\\u0646\\u0627\\u0647' ( (lv_kedah_3_0= ruleKaaedah ) ) ) )
            // InternalQiraa.g:789:2: (otherlv_0= '\\u0642\\u0648\\u0644\\u0647' ( (lv_nass_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0645\\u0639\\u0646\\u0627\\u0647' ( (lv_kedah_3_0= ruleKaaedah ) ) )
            {
            // InternalQiraa.g:789:2: (otherlv_0= '\\u0642\\u0648\\u0644\\u0647' ( (lv_nass_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0645\\u0639\\u0646\\u0627\\u0647' ( (lv_kedah_3_0= ruleKaaedah ) ) )
            // InternalQiraa.g:790:3: otherlv_0= '\\u0642\\u0648\\u0644\\u0647' ( (lv_nass_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0645\\u0639\\u0646\\u0627\\u0647' ( (lv_kedah_3_0= ruleKaaedah ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMaktahAccess().getArabicLetterQafArabicLetterWawArabicLetterLamArabicLetterHehKeyword_0());
            		
            // InternalQiraa.g:794:3: ( (lv_nass_1_0= RULE_KALEMAH ) )
            // InternalQiraa.g:795:4: (lv_nass_1_0= RULE_KALEMAH )
            {
            // InternalQiraa.g:795:4: (lv_nass_1_0= RULE_KALEMAH )
            // InternalQiraa.g:796:5: lv_nass_1_0= RULE_KALEMAH
            {
            lv_nass_1_0=(Token)match(input,RULE_KALEMAH,FOLLOW_21); 

            					newLeafNode(lv_nass_1_0, grammarAccess.getMaktahAccess().getNassKALEMAHTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaktahRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nass",
            						lv_nass_1_0,
            						"org.qwork.Arabic.KALEMAH");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getMaktahAccess().getArabicLetterMeemArabicLetterAinArabicLetterNoonArabicLetterAlefArabicLetterHehKeyword_2());
            		
            // InternalQiraa.g:816:3: ( (lv_kedah_3_0= ruleKaaedah ) )
            // InternalQiraa.g:817:4: (lv_kedah_3_0= ruleKaaedah )
            {
            // InternalQiraa.g:817:4: (lv_kedah_3_0= ruleKaaedah )
            // InternalQiraa.g:818:5: lv_kedah_3_0= ruleKaaedah
            {

            					newCompositeNode(grammarAccess.getMaktahAccess().getKedahKaaedahParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_kedah_3_0=ruleKaaedah();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaktahRule());
            					}
            					add(
            						current,
            						"kedah",
            						lv_kedah_3_0,
            						"org.qwork.Qiraa.Kaaedah");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleMaktah"


    // $ANTLR start "entryRuleKayd"
    // InternalQiraa.g:839:1: entryRuleKayd returns [EObject current=null] : iv_ruleKayd= ruleKayd EOF ;
    public final EObject entryRuleKayd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKayd = null;


        try {
            // InternalQiraa.g:839:45: (iv_ruleKayd= ruleKayd EOF )
            // InternalQiraa.g:840:2: iv_ruleKayd= ruleKayd EOF
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
    // InternalQiraa.g:846:1: ruleKayd returns [EObject current=null] : (otherlv_0= '\\u0642\\u064A\\u062F' ( (lv_name_1_0= RULE_KALEMAH ) ) ) ;
    public final EObject ruleKayd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalQiraa.g:852:2: ( (otherlv_0= '\\u0642\\u064A\\u062F' ( (lv_name_1_0= RULE_KALEMAH ) ) ) )
            // InternalQiraa.g:853:2: (otherlv_0= '\\u0642\\u064A\\u062F' ( (lv_name_1_0= RULE_KALEMAH ) ) )
            {
            // InternalQiraa.g:853:2: (otherlv_0= '\\u0642\\u064A\\u062F' ( (lv_name_1_0= RULE_KALEMAH ) ) )
            // InternalQiraa.g:854:3: otherlv_0= '\\u0642\\u064A\\u062F' ( (lv_name_1_0= RULE_KALEMAH ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getKaydAccess().getArabicLetterQafArabicLetterYehArabicLetterDalKeyword_0());
            		
            // InternalQiraa.g:858:3: ( (lv_name_1_0= RULE_KALEMAH ) )
            // InternalQiraa.g:859:4: (lv_name_1_0= RULE_KALEMAH )
            {
            // InternalQiraa.g:859:4: (lv_name_1_0= RULE_KALEMAH )
            // InternalQiraa.g:860:5: lv_name_1_0= RULE_KALEMAH
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
    // InternalQiraa.g:880:1: entryRuleIstelah returns [EObject current=null] : iv_ruleIstelah= ruleIstelah EOF ;
    public final EObject entryRuleIstelah() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIstelah = null;


        try {
            // InternalQiraa.g:880:48: (iv_ruleIstelah= ruleIstelah EOF )
            // InternalQiraa.g:881:2: iv_ruleIstelah= ruleIstelah EOF
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
    // InternalQiraa.g:887:1: ruleIstelah returns [EObject current=null] : (otherlv_0= '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* ) ;
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
            // InternalQiraa.g:893:2: ( (otherlv_0= '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* ) )
            // InternalQiraa.g:894:2: (otherlv_0= '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* )
            {
            // InternalQiraa.g:894:2: (otherlv_0= '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* )
            // InternalQiraa.g:895:3: otherlv_0= '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )*
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIstelahAccess().getArabicLetterAlefArabicLetterSadArabicLetterTahArabicLetterLamArabicLetterAlefArabicLetterHahKeyword_0());
            		
            // InternalQiraa.g:899:3: ( (lv_name_1_0= RULE_KALEMAH ) )
            // InternalQiraa.g:900:4: (lv_name_1_0= RULE_KALEMAH )
            {
            // InternalQiraa.g:900:4: (lv_name_1_0= RULE_KALEMAH )
            // InternalQiraa.g:901:5: lv_name_1_0= RULE_KALEMAH
            {
            lv_name_1_0=(Token)match(input,RULE_KALEMAH,FOLLOW_23); 

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

            otherlv_2=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getIstelahAccess().getArabicLetterYehArabicLetterAinArabicLetterNoonArabicLetterYehKeyword_2());
            		
            // InternalQiraa.g:921:3: ( (otherlv_3= RULE_KALEMAH ) )
            // InternalQiraa.g:922:4: (otherlv_3= RULE_KALEMAH )
            {
            // InternalQiraa.g:922:4: (otherlv_3= RULE_KALEMAH )
            // InternalQiraa.g:923:5: otherlv_3= RULE_KALEMAH
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIstelahRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_KALEMAH,FOLLOW_24); 

            					newLeafNode(otherlv_3, grammarAccess.getIstelahAccess().getRefsYokraaLahCrossReference_3_0());
            				

            }


            }

            // InternalQiraa.g:934:3: (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==43) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQiraa.g:935:4: otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) )
            	    {
            	    otherlv_4=(Token)match(input,43,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIstelahAccess().getArabicLetterWawKeyword_4_0());
            	    			
            	    // InternalQiraa.g:939:4: ( (otherlv_5= RULE_KALEMAH ) )
            	    // InternalQiraa.g:940:5: (otherlv_5= RULE_KALEMAH )
            	    {
            	    // InternalQiraa.g:940:5: (otherlv_5= RULE_KALEMAH )
            	    // InternalQiraa.g:941:6: otherlv_5= RULE_KALEMAH
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIstelahRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_KALEMAH,FOLLOW_24); 

            	    						newLeafNode(otherlv_5, grammarAccess.getIstelahAccess().getRefsYokraaLahCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalQiraa.g:957:1: entryRuleRamz returns [EObject current=null] : iv_ruleRamz= ruleRamz EOF ;
    public final EObject entryRuleRamz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRamz = null;


        try {
            // InternalQiraa.g:957:45: (iv_ruleRamz= ruleRamz EOF )
            // InternalQiraa.g:958:2: iv_ruleRamz= ruleRamz EOF
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
    // InternalQiraa.g:964:1: ruleRamz returns [EObject current=null] : (otherlv_0= '\\u0631\\u0645\\u0632' ( (lv_name_1_0= RULE_AWORD ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* ) ;
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
            // InternalQiraa.g:970:2: ( (otherlv_0= '\\u0631\\u0645\\u0632' ( (lv_name_1_0= RULE_AWORD ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* ) )
            // InternalQiraa.g:971:2: (otherlv_0= '\\u0631\\u0645\\u0632' ( (lv_name_1_0= RULE_AWORD ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* )
            {
            // InternalQiraa.g:971:2: (otherlv_0= '\\u0631\\u0645\\u0632' ( (lv_name_1_0= RULE_AWORD ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* )
            // InternalQiraa.g:972:3: otherlv_0= '\\u0631\\u0645\\u0632' ( (lv_name_1_0= RULE_AWORD ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )*
            {
            otherlv_0=(Token)match(input,44,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getRamzAccess().getArabicLetterRehArabicLetterMeemArabicLetterZainKeyword_0());
            		
            // InternalQiraa.g:976:3: ( (lv_name_1_0= RULE_AWORD ) )
            // InternalQiraa.g:977:4: (lv_name_1_0= RULE_AWORD )
            {
            // InternalQiraa.g:977:4: (lv_name_1_0= RULE_AWORD )
            // InternalQiraa.g:978:5: lv_name_1_0= RULE_AWORD
            {
            lv_name_1_0=(Token)match(input,RULE_AWORD,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRamzAccess().getNameAWORDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRamzRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.qwork.Arabic.AWORD");
            				

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRamzAccess().getArabicLetterYehArabicLetterAinArabicLetterNoonArabicLetterYehKeyword_2());
            		
            // InternalQiraa.g:998:3: ( (otherlv_3= RULE_KALEMAH ) )
            // InternalQiraa.g:999:4: (otherlv_3= RULE_KALEMAH )
            {
            // InternalQiraa.g:999:4: (otherlv_3= RULE_KALEMAH )
            // InternalQiraa.g:1000:5: otherlv_3= RULE_KALEMAH
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRamzRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_KALEMAH,FOLLOW_24); 

            					newLeafNode(otherlv_3, grammarAccess.getRamzAccess().getRefsYokraaLahCrossReference_3_0());
            				

            }


            }

            // InternalQiraa.g:1011:3: (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==43) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQiraa.g:1012:4: otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) )
            	    {
            	    otherlv_4=(Token)match(input,43,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRamzAccess().getArabicLetterWawKeyword_4_0());
            	    			
            	    // InternalQiraa.g:1016:4: ( (otherlv_5= RULE_KALEMAH ) )
            	    // InternalQiraa.g:1017:5: (otherlv_5= RULE_KALEMAH )
            	    {
            	    // InternalQiraa.g:1017:5: (otherlv_5= RULE_KALEMAH )
            	    // InternalQiraa.g:1018:6: otherlv_5= RULE_KALEMAH
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRamzRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_KALEMAH,FOLLOW_24); 

            	    						newLeafNode(otherlv_5, grammarAccess.getRamzAccess().getRefsYokraaLahCrossReference_4_1_0());
            	    					

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


    // $ANTLR start "entryRuleKaaedah"
    // InternalQiraa.g:1034:1: entryRuleKaaedah returns [EObject current=null] : iv_ruleKaaedah= ruleKaaedah EOF ;
    public final EObject entryRuleKaaedah() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKaaedah = null;


        try {
            // InternalQiraa.g:1034:48: (iv_ruleKaaedah= ruleKaaedah EOF )
            // InternalQiraa.g:1035:2: iv_ruleKaaedah= ruleKaaedah EOF
            {
             newCompositeNode(grammarAccess.getKaaedahRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKaaedah=ruleKaaedah();

            state._fsp--;

             current =iv_ruleKaaedah; 
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
    // $ANTLR end "entryRuleKaaedah"


    // $ANTLR start "ruleKaaedah"
    // InternalQiraa.g:1041:1: ruleKaaedah returns [EObject current=null] : (otherlv_0= '\\u0642\\u0631\\u0623' ( (otherlv_1= RULE_KALEMAH ) ) otherlv_2= '\\u0628' ( (otherlv_3= RULE_KALEMAH ) ) otherlv_4= '\\u0641\\u064A' ( (lv_harf_5_0= ruleHarfQuran ) ) ) ;
    public final EObject ruleKaaedah() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_harf_5_0 = null;



        	enterRule();

        try {
            // InternalQiraa.g:1047:2: ( (otherlv_0= '\\u0642\\u0631\\u0623' ( (otherlv_1= RULE_KALEMAH ) ) otherlv_2= '\\u0628' ( (otherlv_3= RULE_KALEMAH ) ) otherlv_4= '\\u0641\\u064A' ( (lv_harf_5_0= ruleHarfQuran ) ) ) )
            // InternalQiraa.g:1048:2: (otherlv_0= '\\u0642\\u0631\\u0623' ( (otherlv_1= RULE_KALEMAH ) ) otherlv_2= '\\u0628' ( (otherlv_3= RULE_KALEMAH ) ) otherlv_4= '\\u0641\\u064A' ( (lv_harf_5_0= ruleHarfQuran ) ) )
            {
            // InternalQiraa.g:1048:2: (otherlv_0= '\\u0642\\u0631\\u0623' ( (otherlv_1= RULE_KALEMAH ) ) otherlv_2= '\\u0628' ( (otherlv_3= RULE_KALEMAH ) ) otherlv_4= '\\u0641\\u064A' ( (lv_harf_5_0= ruleHarfQuran ) ) )
            // InternalQiraa.g:1049:3: otherlv_0= '\\u0642\\u0631\\u0623' ( (otherlv_1= RULE_KALEMAH ) ) otherlv_2= '\\u0628' ( (otherlv_3= RULE_KALEMAH ) ) otherlv_4= '\\u0641\\u064A' ( (lv_harf_5_0= ruleHarfQuran ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getKaaedahAccess().getArabicLetterQafArabicLetterRehArabicLetterAlefWithHamzaAboveKeyword_0());
            		
            // InternalQiraa.g:1053:3: ( (otherlv_1= RULE_KALEMAH ) )
            // InternalQiraa.g:1054:4: (otherlv_1= RULE_KALEMAH )
            {
            // InternalQiraa.g:1054:4: (otherlv_1= RULE_KALEMAH )
            // InternalQiraa.g:1055:5: otherlv_1= RULE_KALEMAH
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKaaedahRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_KALEMAH,FOLLOW_26); 

            					newLeafNode(otherlv_1, grammarAccess.getKaaedahAccess().getRefsYokraaLahWaRamzCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getKaaedahAccess().getArabicLetterBehKeyword_2());
            		
            // InternalQiraa.g:1070:3: ( (otherlv_3= RULE_KALEMAH ) )
            // InternalQiraa.g:1071:4: (otherlv_3= RULE_KALEMAH )
            {
            // InternalQiraa.g:1071:4: (otherlv_3= RULE_KALEMAH )
            // InternalQiraa.g:1072:5: otherlv_3= RULE_KALEMAH
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKaaedahRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_KALEMAH,FOLLOW_27); 

            					newLeafNode(otherlv_3, grammarAccess.getKaaedahAccess().getKaydKaydCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,47,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getKaaedahAccess().getArabicLetterFehArabicLetterYehKeyword_4());
            		
            // InternalQiraa.g:1087:3: ( (lv_harf_5_0= ruleHarfQuran ) )
            // InternalQiraa.g:1088:4: (lv_harf_5_0= ruleHarfQuran )
            {
            // InternalQiraa.g:1088:4: (lv_harf_5_0= ruleHarfQuran )
            // InternalQiraa.g:1089:5: lv_harf_5_0= ruleHarfQuran
            {

            					newCompositeNode(grammarAccess.getKaaedahAccess().getHarfHarfQuranParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_harf_5_0=ruleHarfQuran();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKaaedahRule());
            					}
            					set(
            						current,
            						"harf",
            						lv_harf_5_0,
            						"org.qwork.Qiraa.HarfQuran");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleKaaedah"


    // $ANTLR start "entryRuleHarfQuran"
    // InternalQiraa.g:1110:1: entryRuleHarfQuran returns [EObject current=null] : iv_ruleHarfQuran= ruleHarfQuran EOF ;
    public final EObject entryRuleHarfQuran() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHarfQuran = null;


        try {
            // InternalQiraa.g:1110:50: (iv_ruleHarfQuran= ruleHarfQuran EOF )
            // InternalQiraa.g:1111:2: iv_ruleHarfQuran= ruleHarfQuran EOF
            {
             newCompositeNode(grammarAccess.getHarfQuranRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHarfQuran=ruleHarfQuran();

            state._fsp--;

             current =iv_ruleHarfQuran; 
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
    // $ANTLR end "entryRuleHarfQuran"


    // $ANTLR start "ruleHarfQuran"
    // InternalQiraa.g:1117:1: ruleHarfQuran returns [EObject current=null] : ( ( (lv_word_0_0= RULE_AWORD ) ) otherlv_1= '\\u0645\\u0646' otherlv_2= '\\u0642\\u0648\\u0644\\u0647' otherlv_3= '\\u062A\\u0639\\u0627\\u0644\\u0649' ( (otherlv_4= RULE_KALEMAH ) ) (otherlv_5= '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' ( (lv_mawdee_6_0= ruleMawdee ) ) )? ) ;
    public final EObject ruleHarfQuran() throws RecognitionException {
        EObject current = null;

        Token lv_word_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_mawdee_6_0 = null;



        	enterRule();

        try {
            // InternalQiraa.g:1123:2: ( ( ( (lv_word_0_0= RULE_AWORD ) ) otherlv_1= '\\u0645\\u0646' otherlv_2= '\\u0642\\u0648\\u0644\\u0647' otherlv_3= '\\u062A\\u0639\\u0627\\u0644\\u0649' ( (otherlv_4= RULE_KALEMAH ) ) (otherlv_5= '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' ( (lv_mawdee_6_0= ruleMawdee ) ) )? ) )
            // InternalQiraa.g:1124:2: ( ( (lv_word_0_0= RULE_AWORD ) ) otherlv_1= '\\u0645\\u0646' otherlv_2= '\\u0642\\u0648\\u0644\\u0647' otherlv_3= '\\u062A\\u0639\\u0627\\u0644\\u0649' ( (otherlv_4= RULE_KALEMAH ) ) (otherlv_5= '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' ( (lv_mawdee_6_0= ruleMawdee ) ) )? )
            {
            // InternalQiraa.g:1124:2: ( ( (lv_word_0_0= RULE_AWORD ) ) otherlv_1= '\\u0645\\u0646' otherlv_2= '\\u0642\\u0648\\u0644\\u0647' otherlv_3= '\\u062A\\u0639\\u0627\\u0644\\u0649' ( (otherlv_4= RULE_KALEMAH ) ) (otherlv_5= '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' ( (lv_mawdee_6_0= ruleMawdee ) ) )? )
            // InternalQiraa.g:1125:3: ( (lv_word_0_0= RULE_AWORD ) ) otherlv_1= '\\u0645\\u0646' otherlv_2= '\\u0642\\u0648\\u0644\\u0647' otherlv_3= '\\u062A\\u0639\\u0627\\u0644\\u0649' ( (otherlv_4= RULE_KALEMAH ) ) (otherlv_5= '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' ( (lv_mawdee_6_0= ruleMawdee ) ) )?
            {
            // InternalQiraa.g:1125:3: ( (lv_word_0_0= RULE_AWORD ) )
            // InternalQiraa.g:1126:4: (lv_word_0_0= RULE_AWORD )
            {
            // InternalQiraa.g:1126:4: (lv_word_0_0= RULE_AWORD )
            // InternalQiraa.g:1127:5: lv_word_0_0= RULE_AWORD
            {
            lv_word_0_0=(Token)match(input,RULE_AWORD,FOLLOW_14); 

            					newLeafNode(lv_word_0_0, grammarAccess.getHarfQuranAccess().getWordAWORDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHarfQuranRule());
            					}
            					setWithLastConsumed(
            						current,
            						"word",
            						lv_word_0_0,
            						"org.qwork.Arabic.AWORD");
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getHarfQuranAccess().getArabicLetterMeemArabicLetterNoonKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getHarfQuranAccess().getArabicLetterQafArabicLetterWawArabicLetterLamArabicLetterHehKeyword_2());
            		
            otherlv_3=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getHarfQuranAccess().getArabicLetterTehArabicLetterAinArabicLetterAlefArabicLetterLamArabicLetterAlefMaksuraKeyword_3());
            		
            // InternalQiraa.g:1155:3: ( (otherlv_4= RULE_KALEMAH ) )
            // InternalQiraa.g:1156:4: (otherlv_4= RULE_KALEMAH )
            {
            // InternalQiraa.g:1156:4: (otherlv_4= RULE_KALEMAH )
            // InternalQiraa.g:1157:5: otherlv_4= RULE_KALEMAH
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHarfQuranRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_KALEMAH,FOLLOW_30); 

            					newLeafNode(otherlv_4, grammarAccess.getHarfQuranAccess().getAyahAyahStartCrossReference_4_0());
            				

            }


            }

            // InternalQiraa.g:1168:3: (otherlv_5= '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' ( (lv_mawdee_6_0= ruleMawdee ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==49) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalQiraa.g:1169:4: otherlv_5= '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' ( (lv_mawdee_6_0= ruleMawdee ) )
                    {
                    otherlv_5=(Token)match(input,49,FOLLOW_31); 

                    				newLeafNode(otherlv_5, grammarAccess.getHarfQuranAccess().getArabicLetterAlefArabicLetterLamArabicLetterMeemArabicLetterWawArabicLetterDadArabicLetterAinKeyword_5_0());
                    			
                    // InternalQiraa.g:1173:4: ( (lv_mawdee_6_0= ruleMawdee ) )
                    // InternalQiraa.g:1174:5: (lv_mawdee_6_0= ruleMawdee )
                    {
                    // InternalQiraa.g:1174:5: (lv_mawdee_6_0= ruleMawdee )
                    // InternalQiraa.g:1175:6: lv_mawdee_6_0= ruleMawdee
                    {

                    						newCompositeNode(grammarAccess.getHarfQuranAccess().getMawdeeMawdeeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_mawdee_6_0=ruleMawdee();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHarfQuranRule());
                    						}
                    						set(
                    							current,
                    							"mawdee",
                    							lv_mawdee_6_0,
                    							"org.qwork.Qiraa.Mawdee");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleHarfQuran"


    // $ANTLR start "entryRuleMawdee"
    // InternalQiraa.g:1197:1: entryRuleMawdee returns [String current=null] : iv_ruleMawdee= ruleMawdee EOF ;
    public final String entryRuleMawdee() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMawdee = null;


        try {
            // InternalQiraa.g:1197:46: (iv_ruleMawdee= ruleMawdee EOF )
            // InternalQiraa.g:1198:2: iv_ruleMawdee= ruleMawdee EOF
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
    // InternalQiraa.g:1204:1: ruleMawdee returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u0627\\u0644\\u0623\\u0648\\u0644' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' | kw= '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' ) ;
    public final AntlrDatatypeRuleToken ruleMawdee() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalQiraa.g:1210:2: ( (kw= '\\u0627\\u0644\\u0623\\u0648\\u0644' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' | kw= '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' ) )
            // InternalQiraa.g:1211:2: (kw= '\\u0627\\u0644\\u0623\\u0648\\u0644' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' | kw= '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' )
            {
            // InternalQiraa.g:1211:2: (kw= '\\u0627\\u0644\\u0623\\u0648\\u0644' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' | kw= '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt14=1;
                }
                break;
            case 51:
                {
                alt14=2;
                }
                break;
            case 52:
                {
                alt14=3;
                }
                break;
            case 53:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalQiraa.g:1212:3: kw= '\\u0627\\u0644\\u0623\\u0648\\u0644'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaAboveArabicLetterWawArabicLetterLamKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQiraa.g:1218:3: kw= '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterNoonArabicLetterYehKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalQiraa.g:1224:3: kw= '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterLamArabicLetterThehKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalQiraa.g:1230:3: kw= '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

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
    // InternalQiraa.g:1239:1: entryRuleHarf returns [EObject current=null] : iv_ruleHarf= ruleHarf EOF ;
    public final EObject entryRuleHarf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHarf = null;


        try {
            // InternalQiraa.g:1239:45: (iv_ruleHarf= ruleHarf EOF )
            // InternalQiraa.g:1240:2: iv_ruleHarf= ruleHarf EOF
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
    // InternalQiraa.g:1246:1: ruleHarf returns [EObject current=null] : (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_ALETTER ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) ) ;
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
            // InternalQiraa.g:1252:2: ( (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_ALETTER ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) ) )
            // InternalQiraa.g:1253:2: (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_ALETTER ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) )
            {
            // InternalQiraa.g:1253:2: (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_ALETTER ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) )
            // InternalQiraa.g:1254:3: otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_ALETTER ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getHarfAccess().getArabicLetterHahArabicLetterRehArabicLetterFehKeyword_0());
            		
            // InternalQiraa.g:1258:3: ( (lv_name_1_0= RULE_AWORD ) )
            // InternalQiraa.g:1259:4: (lv_name_1_0= RULE_AWORD )
            {
            // InternalQiraa.g:1259:4: (lv_name_1_0= RULE_AWORD )
            // InternalQiraa.g:1260:5: lv_name_1_0= RULE_AWORD
            {
            lv_name_1_0=(Token)match(input,RULE_AWORD,FOLLOW_32); 

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

            // InternalQiraa.g:1276:3: ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_ALETTER ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==55) ) {
                alt16=1;
            }
            else if ( (LA16_0==57) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalQiraa.g:1277:4: (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_ALETTER ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) ) )* )
                    {
                    // InternalQiraa.g:1277:4: (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_ALETTER ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) ) )* )
                    // InternalQiraa.g:1278:5: otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_ALETTER ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) ) )*
                    {
                    otherlv_2=(Token)match(input,55,FOLLOW_33); 

                    					newLeafNode(otherlv_2, grammarAccess.getHarfAccess().getArabicLetterHehArabicLetterWawKeyword_2_0_0());
                    				
                    // InternalQiraa.g:1282:5: ( (lv_values_3_0= RULE_ALETTER ) )
                    // InternalQiraa.g:1283:6: (lv_values_3_0= RULE_ALETTER )
                    {
                    // InternalQiraa.g:1283:6: (lv_values_3_0= RULE_ALETTER )
                    // InternalQiraa.g:1284:7: lv_values_3_0= RULE_ALETTER
                    {
                    lv_values_3_0=(Token)match(input,RULE_ALETTER,FOLLOW_34); 

                    							newLeafNode(lv_values_3_0, grammarAccess.getHarfAccess().getValuesALETTERTerminalRuleCall_2_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getHarfRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"values",
                    								lv_values_3_0,
                    								"org.qwork.Arabic.ALETTER");
                    						

                    }


                    }

                    // InternalQiraa.g:1300:5: (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==56) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalQiraa.g:1301:6: otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) )
                    	    {
                    	    otherlv_4=(Token)match(input,56,FOLLOW_33); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getHarfAccess().getArabicLetterAlefWithHamzaAboveArabicLetterWawKeyword_2_0_2_0());
                    	    					
                    	    // InternalQiraa.g:1305:6: ( (lv_values_5_0= RULE_ALETTER ) )
                    	    // InternalQiraa.g:1306:7: (lv_values_5_0= RULE_ALETTER )
                    	    {
                    	    // InternalQiraa.g:1306:7: (lv_values_5_0= RULE_ALETTER )
                    	    // InternalQiraa.g:1307:8: lv_values_5_0= RULE_ALETTER
                    	    {
                    	    lv_values_5_0=(Token)match(input,RULE_ALETTER,FOLLOW_34); 

                    	    								newLeafNode(lv_values_5_0, grammarAccess.getHarfAccess().getValuesALETTERTerminalRuleCall_2_0_2_1_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getHarfRule());
                    	    								}
                    	    								addWithLastConsumed(
                    	    									current,
                    	    									"values",
                    	    									lv_values_5_0,
                    	    									"org.qwork.Arabic.ALETTER");
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalQiraa.g:1326:4: (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) )
                    {
                    // InternalQiraa.g:1326:4: (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) )
                    // InternalQiraa.g:1327:5: otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) )
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_25); 

                    					newLeafNode(otherlv_6, grammarAccess.getHarfAccess().getArabicLetterThalArabicLetterAlefArabicLetterTehArabicLetterHehKeyword_2_1_0());
                    				
                    // InternalQiraa.g:1331:5: ( (otherlv_7= RULE_AWORD ) )
                    // InternalQiraa.g:1332:6: (otherlv_7= RULE_AWORD )
                    {
                    // InternalQiraa.g:1332:6: (otherlv_7= RULE_AWORD )
                    // InternalQiraa.g:1333:7: otherlv_7= RULE_AWORD
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
    // InternalQiraa.g:1350:1: entryRuleHarakah returns [EObject current=null] : iv_ruleHarakah= ruleHarakah EOF ;
    public final EObject entryRuleHarakah() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHarakah = null;


        try {
            // InternalQiraa.g:1350:48: (iv_ruleHarakah= ruleHarakah EOF )
            // InternalQiraa.g:1351:2: iv_ruleHarakah= ruleHarakah EOF
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
    // InternalQiraa.g:1357:1: ruleHarakah returns [EObject current=null] : (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AHARAKAH ) ) ) ;
    public final EObject ruleHarakah() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalQiraa.g:1363:2: ( (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AHARAKAH ) ) ) )
            // InternalQiraa.g:1364:2: (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AHARAKAH ) ) )
            {
            // InternalQiraa.g:1364:2: (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AHARAKAH ) ) )
            // InternalQiraa.g:1365:3: otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AHARAKAH ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHarakahAccess().getArabicLetterHahArabicLetterRehArabicLetterKafArabicLetterTehMarbutaKeyword_0());
            		
            // InternalQiraa.g:1369:3: ( (lv_name_1_0= RULE_KALEMAH ) )
            // InternalQiraa.g:1370:4: (lv_name_1_0= RULE_KALEMAH )
            {
            // InternalQiraa.g:1370:4: (lv_name_1_0= RULE_KALEMAH )
            // InternalQiraa.g:1371:5: lv_name_1_0= RULE_KALEMAH
            {
            lv_name_1_0=(Token)match(input,RULE_KALEMAH,FOLLOW_35); 

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

            otherlv_2=(Token)match(input,59,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getHarakahAccess().getArabicLetterHehArabicLetterYehKeyword_2());
            		
            // InternalQiraa.g:1391:3: ( (lv_value_3_0= RULE_AHARAKAH ) )
            // InternalQiraa.g:1392:4: (lv_value_3_0= RULE_AHARAKAH )
            {
            // InternalQiraa.g:1392:4: (lv_value_3_0= RULE_AHARAKAH )
            // InternalQiraa.g:1393:5: lv_value_3_0= RULE_AHARAKAH
            {
            lv_value_3_0=(Token)match(input,RULE_AHARAKAH,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getHarakahAccess().getValueAHARAKAHTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHarakahRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.qwork.Arabic.AHARAKAH");
            				

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
    // InternalQiraa.g:1413:1: entryRuleAyahStart returns [EObject current=null] : iv_ruleAyahStart= ruleAyahStart EOF ;
    public final EObject entryRuleAyahStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAyahStart = null;


        try {
            // InternalQiraa.g:1413:50: (iv_ruleAyahStart= ruleAyahStart EOF )
            // InternalQiraa.g:1414:2: iv_ruleAyahStart= ruleAyahStart EOF
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
    // InternalQiraa.g:1420:1: ruleAyahStart returns [EObject current=null] : (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) ) ;
    public final EObject ruleAyahStart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_surah_1_0=null;
        Token otherlv_2=null;
        Token lv_ayah_3_0=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalQiraa.g:1426:2: ( (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) ) )
            // InternalQiraa.g:1427:2: (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) )
            {
            // InternalQiraa.g:1427:2: (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) )
            // InternalQiraa.g:1428:3: otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterSeenArabicLetterWawArabicLetterRehArabicLetterTehMarbutaKeyword_0());
            		
            // InternalQiraa.g:1432:3: ( (lv_surah_1_0= RULE_INT ) )
            // InternalQiraa.g:1433:4: (lv_surah_1_0= RULE_INT )
            {
            // InternalQiraa.g:1433:4: (lv_surah_1_0= RULE_INT )
            // InternalQiraa.g:1434:5: lv_surah_1_0= RULE_INT
            {
            lv_surah_1_0=(Token)match(input,RULE_INT,FOLLOW_37); 

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

            otherlv_2=(Token)match(input,61,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithMaddaAboveArabicLetterYehArabicLetterTehMarbutaKeyword_2());
            		
            // InternalQiraa.g:1454:3: ( (lv_ayah_3_0= RULE_INT ) )
            // InternalQiraa.g:1455:4: (lv_ayah_3_0= RULE_INT )
            {
            // InternalQiraa.g:1455:4: (lv_ayah_3_0= RULE_INT )
            // InternalQiraa.g:1456:5: lv_ayah_3_0= RULE_INT
            {
            lv_ayah_3_0=(Token)match(input,RULE_INT,FOLLOW_4); 

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

            // InternalQiraa.g:1472:3: ( (lv_name_4_0= RULE_KALEMAH ) )
            // InternalQiraa.g:1473:4: (lv_name_4_0= RULE_KALEMAH )
            {
            // InternalQiraa.g:1473:4: (lv_name_4_0= RULE_KALEMAH )
            // InternalQiraa.g:1474:5: lv_name_4_0= RULE_KALEMAH
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
    // InternalQiraa.g:1494:1: entryRulePhrase returns [EObject current=null] : iv_rulePhrase= rulePhrase EOF ;
    public final EObject entryRulePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhrase = null;


        try {
            // InternalQiraa.g:1494:47: (iv_rulePhrase= rulePhrase EOF )
            // InternalQiraa.g:1495:2: iv_rulePhrase= rulePhrase EOF
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
    // InternalQiraa.g:1501:1: rulePhrase returns [EObject current=null] : ( ( (lv_words_0_0= RULE_AWORD ) ) (this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) ) )* ) ;
    public final EObject rulePhrase() throws RecognitionException {
        EObject current = null;

        Token lv_words_0_0=null;
        Token this_WS_1=null;
        Token lv_words_2_0=null;


        	enterRule();

        try {
            // InternalQiraa.g:1507:2: ( ( ( (lv_words_0_0= RULE_AWORD ) ) (this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) ) )* ) )
            // InternalQiraa.g:1508:2: ( ( (lv_words_0_0= RULE_AWORD ) ) (this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) ) )* )
            {
            // InternalQiraa.g:1508:2: ( ( (lv_words_0_0= RULE_AWORD ) ) (this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) ) )* )
            // InternalQiraa.g:1509:3: ( (lv_words_0_0= RULE_AWORD ) ) (this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) ) )*
            {
            // InternalQiraa.g:1509:3: ( (lv_words_0_0= RULE_AWORD ) )
            // InternalQiraa.g:1510:4: (lv_words_0_0= RULE_AWORD )
            {
            // InternalQiraa.g:1510:4: (lv_words_0_0= RULE_AWORD )
            // InternalQiraa.g:1511:5: lv_words_0_0= RULE_AWORD
            {
            lv_words_0_0=(Token)match(input,RULE_AWORD,FOLLOW_38); 

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

            // InternalQiraa.g:1527:3: (this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_WS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalQiraa.g:1528:4: this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) )
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_25); 

            	    				newLeafNode(this_WS_1, grammarAccess.getPhraseAccess().getWSTerminalRuleCall_1_0());
            	    			
            	    // InternalQiraa.g:1532:4: ( (lv_words_2_0= RULE_AWORD ) )
            	    // InternalQiraa.g:1533:5: (lv_words_2_0= RULE_AWORD )
            	    {
            	    // InternalQiraa.g:1533:5: (lv_words_2_0= RULE_AWORD )
            	    // InternalQiraa.g:1534:6: lv_words_2_0= RULE_AWORD
            	    {
            	    lv_words_2_0=(Token)match(input,RULE_AWORD,FOLLOW_38); 

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
            	    break loop17;
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000306080C0002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000104000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000106000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x003C000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000202L});

}