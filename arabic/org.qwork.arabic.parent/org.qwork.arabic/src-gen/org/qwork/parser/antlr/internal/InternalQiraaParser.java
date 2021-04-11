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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_KALEMAH", "RULE_BASMALAH", "RULE_INT", "RULE_AWORD", "RULE_ALETTER", "RULE_AHARAKAH", "RULE_ATANWEEN", "RULE_ASHADDAH", "RULE_ALIGATURES", "RULE_ADIGIT", "RULE_ANONLETTER", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\u0645\\u0631\\u062C\\u0639'", "'\\u0645\\u0628\\u0646\\u064A'", "'\\u0639\\u0644\\u0649'", "'\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647'", "'\\u0627\\u0646\\u062A\\u0647\\u0649'", "'\\u0642\\u0648\\u0644\\u0647'", "'\\u0645\\u0639\\u0646\\u0627\\u0647'", "'\\u0642\\u0631\\u0623'", "'\\u0628'", "'\\u0641\\u064A'", "'*'", "'('", "')'", "'-'", "'...'", "'\\u0627\\u0633\\u0645\\u0647'", "'\\u0644\\u0642\\u0628\\u0647'", "'\\u062A\\u0648\\u0641\\u064A'", "'\\u0631\\u062D\\u0645\\u0647'", "'\\u0623\\u0643\\u0631\\u0645\\u0647'", "'\\u0627\\u0644\\u0644\\u0647'", "'\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645'", "'\\u0642\\u0627\\u0631\\u0626'", "'\\u0631\\u0627\\u0648'", "'\\u0639\\u0646'", "'\\u0637\\u0631\\u064A\\u0642'", "'\\u062A\\u0644\\u0627\\u0648\\u0629'", "'\\u062E\\u0627\\u0644\\u0635'", "'\\u0644'", "'\\u0645\\u0631\\u0643\\u0628'", "'\\u0645\\u0646'", "'\\u0642\\u064A\\u062F'", "'\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D'", "'\\u064A\\u0639\\u0646\\u064A'", "'\\u0648'", "'\\u0631\\u0645\\u0632'", "'\\u062A\\u0639\\u0627\\u0644\\u0649'", "'\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639'", "'\\u0627\\u0644\\u0623\\u0648\\u0644'", "'\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A'", "'\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B'", "'\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631'", "'\\u062D\\u0631\\u0641'", "'\\u0647\\u0648'", "'\\u0623\\u0648'", "'\\u0630\\u0627\\u062A\\u0647'", "'\\u062D\\u0631\\u0643\\u0629'", "'\\u0647\\u064A'", "'\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'", "'\\u0627\\u0644\\u0622\\u064A\\u0629'"
    };
    public static final int T__50=50;
    public static final int RULE_KALEMAH=4;
    public static final int T__59=59;
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
    public static final int RULE_ID=16;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int RULE_AWORD=7;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
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
    // InternalQiraa.g:71:1: ruleQiraaModel returns [EObject current=null] : ( (lv_marjee_0_0= ruleMarjeh ) )* ;
    public final EObject ruleQiraaModel() throws RecognitionException {
        EObject current = null;

        EObject lv_marjee_0_0 = null;



        	enterRule();

        try {
            // InternalQiraa.g:77:2: ( ( (lv_marjee_0_0= ruleMarjeh ) )* )
            // InternalQiraa.g:78:2: ( (lv_marjee_0_0= ruleMarjeh ) )*
            {
            // InternalQiraa.g:78:2: ( (lv_marjee_0_0= ruleMarjeh ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQiraa.g:79:3: (lv_marjee_0_0= ruleMarjeh )
            	    {
            	    // InternalQiraa.g:79:3: (lv_marjee_0_0= ruleMarjeh )
            	    // InternalQiraa.g:80:4: lv_marjee_0_0= ruleMarjeh
            	    {

            	    				newCompositeNode(grammarAccess.getQiraaModelAccess().getMarjeeMarjehParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_marjee_0_0=ruleMarjeh();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getQiraaModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"marjee",
            	    					lv_marjee_0_0,
            	    					"org.qwork.Qiraa.Marjeh");
            	    				afterParserOrEnumRuleCall();
            	    			

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


    // $ANTLR start "entryRuleMarjeh"
    // InternalQiraa.g:100:1: entryRuleMarjeh returns [EObject current=null] : iv_ruleMarjeh= ruleMarjeh EOF ;
    public final EObject entryRuleMarjeh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarjeh = null;


        try {
            // InternalQiraa.g:100:47: (iv_ruleMarjeh= ruleMarjeh EOF )
            // InternalQiraa.g:101:2: iv_ruleMarjeh= ruleMarjeh EOF
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
    // InternalQiraa.g:107:1: ruleMarjeh returns [EObject current=null] : (otherlv_0= '\\u0645\\u0631\\u062C\\u0639' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0645\\u0628\\u0646\\u064A' otherlv_3= '\\u0639\\u0644\\u0649' ( ( ruleAWORDS ) ) otherlv_5= '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647' ( (lv_romoz_6_0= ruleRamz ) )* ( (lv_tafsil_7_0= ruleTafsil ) )+ otherlv_8= '\\u0627\\u0646\\u062A\\u0647\\u0649' ) ;
    public final EObject ruleMarjeh() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_romoz_6_0 = null;

        EObject lv_tafsil_7_0 = null;



        	enterRule();

        try {
            // InternalQiraa.g:113:2: ( (otherlv_0= '\\u0645\\u0631\\u062C\\u0639' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0645\\u0628\\u0646\\u064A' otherlv_3= '\\u0639\\u0644\\u0649' ( ( ruleAWORDS ) ) otherlv_5= '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647' ( (lv_romoz_6_0= ruleRamz ) )* ( (lv_tafsil_7_0= ruleTafsil ) )+ otherlv_8= '\\u0627\\u0646\\u062A\\u0647\\u0649' ) )
            // InternalQiraa.g:114:2: (otherlv_0= '\\u0645\\u0631\\u062C\\u0639' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0645\\u0628\\u0646\\u064A' otherlv_3= '\\u0639\\u0644\\u0649' ( ( ruleAWORDS ) ) otherlv_5= '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647' ( (lv_romoz_6_0= ruleRamz ) )* ( (lv_tafsil_7_0= ruleTafsil ) )+ otherlv_8= '\\u0627\\u0646\\u062A\\u0647\\u0649' )
            {
            // InternalQiraa.g:114:2: (otherlv_0= '\\u0645\\u0631\\u062C\\u0639' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0645\\u0628\\u0646\\u064A' otherlv_3= '\\u0639\\u0644\\u0649' ( ( ruleAWORDS ) ) otherlv_5= '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647' ( (lv_romoz_6_0= ruleRamz ) )* ( (lv_tafsil_7_0= ruleTafsil ) )+ otherlv_8= '\\u0627\\u0646\\u062A\\u0647\\u0649' )
            // InternalQiraa.g:115:3: otherlv_0= '\\u0645\\u0631\\u062C\\u0639' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0645\\u0628\\u0646\\u064A' otherlv_3= '\\u0639\\u0644\\u0649' ( ( ruleAWORDS ) ) otherlv_5= '\\u062A\\u0641\\u0635\\u064A\\u0644\\u0647' ( (lv_romoz_6_0= ruleRamz ) )* ( (lv_tafsil_7_0= ruleTafsil ) )+ otherlv_8= '\\u0627\\u0646\\u062A\\u0647\\u0649'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMarjehAccess().getArabicLetterMeemArabicLetterRehArabicLetterJeemArabicLetterAinKeyword_0());
            		
            // InternalQiraa.g:119:3: ( (lv_name_1_0= RULE_KALEMAH ) )
            // InternalQiraa.g:120:4: (lv_name_1_0= RULE_KALEMAH )
            {
            // InternalQiraa.g:120:4: (lv_name_1_0= RULE_KALEMAH )
            // InternalQiraa.g:121:5: lv_name_1_0= RULE_KALEMAH
            {
            lv_name_1_0=(Token)match(input,RULE_KALEMAH,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMarjehAccess().getArabicLetterMeemArabicLetterBehArabicLetterNoonArabicLetterYehKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMarjehAccess().getArabicLetterAinArabicLetterLamArabicLetterAlefMaksuraKeyword_3());
            		
            // InternalQiraa.g:145:3: ( ( ruleAWORDS ) )
            // InternalQiraa.g:146:4: ( ruleAWORDS )
            {
            // InternalQiraa.g:146:4: ( ruleAWORDS )
            // InternalQiraa.g:147:5: ruleAWORDS
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMarjehRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMarjehAccess().getMatnMatnCrossReference_4_0());
            				
            pushFollow(FOLLOW_8);
            ruleAWORDS();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getMarjehAccess().getArabicLetterTehArabicLetterFehArabicLetterSadArabicLetterYehArabicLetterLamArabicLetterHehKeyword_5());
            		
            // InternalQiraa.g:165:3: ( (lv_romoz_6_0= ruleRamz ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==56) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalQiraa.g:166:4: (lv_romoz_6_0= ruleRamz )
            	    {
            	    // InternalQiraa.g:166:4: (lv_romoz_6_0= ruleRamz )
            	    // InternalQiraa.g:167:5: lv_romoz_6_0= ruleRamz
            	    {

            	    					newCompositeNode(grammarAccess.getMarjehAccess().getRomozRamzParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_romoz_6_0=ruleRamz();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMarjehRule());
            	    					}
            	    					add(
            	    						current,
            	    						"romoz",
            	    						lv_romoz_6_0,
            	    						"org.qwork.OsolQiraa.Ramz");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalQiraa.g:184:3: ( (lv_tafsil_7_0= ruleTafsil ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalQiraa.g:185:4: (lv_tafsil_7_0= ruleTafsil )
            	    {
            	    // InternalQiraa.g:185:4: (lv_tafsil_7_0= ruleTafsil )
            	    // InternalQiraa.g:186:5: lv_tafsil_7_0= ruleTafsil
            	    {

            	    					newCompositeNode(grammarAccess.getMarjehAccess().getTafsilTafsilParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_tafsil_7_0=ruleTafsil();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMarjehRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tafsil",
            	    						lv_tafsil_7_0,
            	    						"org.qwork.Qiraa.Tafsil");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            otherlv_8=(Token)match(input,25,FOLLOW_2); 

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


    // $ANTLR start "entryRuleTafsil"
    // InternalQiraa.g:211:1: entryRuleTafsil returns [EObject current=null] : iv_ruleTafsil= ruleTafsil EOF ;
    public final EObject entryRuleTafsil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTafsil = null;


        try {
            // InternalQiraa.g:211:47: (iv_ruleTafsil= ruleTafsil EOF )
            // InternalQiraa.g:212:2: iv_ruleTafsil= ruleTafsil EOF
            {
             newCompositeNode(grammarAccess.getTafsilRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTafsil=ruleTafsil();

            state._fsp--;

             current =iv_ruleTafsil; 
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
    // $ANTLR end "entryRuleTafsil"


    // $ANTLR start "ruleTafsil"
    // InternalQiraa.g:218:1: ruleTafsil returns [EObject current=null] : (otherlv_0= '\\u0642\\u0648\\u0644\\u0647' ( (lv_nass_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0645\\u0639\\u0646\\u0627\\u0647' ( (lv_kedah_3_0= ruleKaaedah ) ) ) ;
    public final EObject ruleTafsil() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nass_1_0=null;
        Token otherlv_2=null;
        EObject lv_kedah_3_0 = null;



        	enterRule();

        try {
            // InternalQiraa.g:224:2: ( (otherlv_0= '\\u0642\\u0648\\u0644\\u0647' ( (lv_nass_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0645\\u0639\\u0646\\u0627\\u0647' ( (lv_kedah_3_0= ruleKaaedah ) ) ) )
            // InternalQiraa.g:225:2: (otherlv_0= '\\u0642\\u0648\\u0644\\u0647' ( (lv_nass_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0645\\u0639\\u0646\\u0627\\u0647' ( (lv_kedah_3_0= ruleKaaedah ) ) )
            {
            // InternalQiraa.g:225:2: (otherlv_0= '\\u0642\\u0648\\u0644\\u0647' ( (lv_nass_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0645\\u0639\\u0646\\u0627\\u0647' ( (lv_kedah_3_0= ruleKaaedah ) ) )
            // InternalQiraa.g:226:3: otherlv_0= '\\u0642\\u0648\\u0644\\u0647' ( (lv_nass_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0645\\u0639\\u0646\\u0627\\u0647' ( (lv_kedah_3_0= ruleKaaedah ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTafsilAccess().getArabicLetterQafArabicLetterWawArabicLetterLamArabicLetterHehKeyword_0());
            		
            // InternalQiraa.g:230:3: ( (lv_nass_1_0= RULE_KALEMAH ) )
            // InternalQiraa.g:231:4: (lv_nass_1_0= RULE_KALEMAH )
            {
            // InternalQiraa.g:231:4: (lv_nass_1_0= RULE_KALEMAH )
            // InternalQiraa.g:232:5: lv_nass_1_0= RULE_KALEMAH
            {
            lv_nass_1_0=(Token)match(input,RULE_KALEMAH,FOLLOW_11); 

            					newLeafNode(lv_nass_1_0, grammarAccess.getTafsilAccess().getNassKALEMAHTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTafsilRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nass",
            						lv_nass_1_0,
            						"org.qwork.Arabic.KALEMAH");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getTafsilAccess().getArabicLetterMeemArabicLetterAinArabicLetterNoonArabicLetterAlefArabicLetterHehKeyword_2());
            		
            // InternalQiraa.g:252:3: ( (lv_kedah_3_0= ruleKaaedah ) )
            // InternalQiraa.g:253:4: (lv_kedah_3_0= ruleKaaedah )
            {
            // InternalQiraa.g:253:4: (lv_kedah_3_0= ruleKaaedah )
            // InternalQiraa.g:254:5: lv_kedah_3_0= ruleKaaedah
            {

            					newCompositeNode(grammarAccess.getTafsilAccess().getKedahKaaedahParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_kedah_3_0=ruleKaaedah();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTafsilRule());
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
    // $ANTLR end "ruleTafsil"


    // $ANTLR start "entryRuleKaaedah"
    // InternalQiraa.g:275:1: entryRuleKaaedah returns [EObject current=null] : iv_ruleKaaedah= ruleKaaedah EOF ;
    public final EObject entryRuleKaaedah() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKaaedah = null;


        try {
            // InternalQiraa.g:275:48: (iv_ruleKaaedah= ruleKaaedah EOF )
            // InternalQiraa.g:276:2: iv_ruleKaaedah= ruleKaaedah EOF
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
    // InternalQiraa.g:282:1: ruleKaaedah returns [EObject current=null] : (otherlv_0= '\\u0642\\u0631\\u0623' ( (otherlv_1= RULE_KALEMAH ) ) otherlv_2= '\\u0628' ( (otherlv_3= RULE_KALEMAH ) ) otherlv_4= '\\u0641\\u064A' ( (lv_harf_5_0= ruleHarfQuran ) ) ) ;
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
            // InternalQiraa.g:288:2: ( (otherlv_0= '\\u0642\\u0631\\u0623' ( (otherlv_1= RULE_KALEMAH ) ) otherlv_2= '\\u0628' ( (otherlv_3= RULE_KALEMAH ) ) otherlv_4= '\\u0641\\u064A' ( (lv_harf_5_0= ruleHarfQuran ) ) ) )
            // InternalQiraa.g:289:2: (otherlv_0= '\\u0642\\u0631\\u0623' ( (otherlv_1= RULE_KALEMAH ) ) otherlv_2= '\\u0628' ( (otherlv_3= RULE_KALEMAH ) ) otherlv_4= '\\u0641\\u064A' ( (lv_harf_5_0= ruleHarfQuran ) ) )
            {
            // InternalQiraa.g:289:2: (otherlv_0= '\\u0642\\u0631\\u0623' ( (otherlv_1= RULE_KALEMAH ) ) otherlv_2= '\\u0628' ( (otherlv_3= RULE_KALEMAH ) ) otherlv_4= '\\u0641\\u064A' ( (lv_harf_5_0= ruleHarfQuran ) ) )
            // InternalQiraa.g:290:3: otherlv_0= '\\u0642\\u0631\\u0623' ( (otherlv_1= RULE_KALEMAH ) ) otherlv_2= '\\u0628' ( (otherlv_3= RULE_KALEMAH ) ) otherlv_4= '\\u0641\\u064A' ( (lv_harf_5_0= ruleHarfQuran ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getKaaedahAccess().getArabicLetterQafArabicLetterRehArabicLetterAlefWithHamzaAboveKeyword_0());
            		
            // InternalQiraa.g:294:3: ( (otherlv_1= RULE_KALEMAH ) )
            // InternalQiraa.g:295:4: (otherlv_1= RULE_KALEMAH )
            {
            // InternalQiraa.g:295:4: (otherlv_1= RULE_KALEMAH )
            // InternalQiraa.g:296:5: otherlv_1= RULE_KALEMAH
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKaaedahRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_KALEMAH,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getKaaedahAccess().getRefsYokraaLahWaRamzCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getKaaedahAccess().getArabicLetterBehKeyword_2());
            		
            // InternalQiraa.g:311:3: ( (otherlv_3= RULE_KALEMAH ) )
            // InternalQiraa.g:312:4: (otherlv_3= RULE_KALEMAH )
            {
            // InternalQiraa.g:312:4: (otherlv_3= RULE_KALEMAH )
            // InternalQiraa.g:313:5: otherlv_3= RULE_KALEMAH
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKaaedahRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_KALEMAH,FOLLOW_14); 

            					newLeafNode(otherlv_3, grammarAccess.getKaaedahAccess().getKaydKaydCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getKaaedahAccess().getArabicLetterFehArabicLetterYehKeyword_4());
            		
            // InternalQiraa.g:328:3: ( (lv_harf_5_0= ruleHarfQuran ) )
            // InternalQiraa.g:329:4: (lv_harf_5_0= ruleHarfQuran )
            {
            // InternalQiraa.g:329:4: (lv_harf_5_0= ruleHarfQuran )
            // InternalQiraa.g:330:5: lv_harf_5_0= ruleHarfQuran
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
            						"org.qwork.OsolQiraa.HarfQuran");
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


    // $ANTLR start "entryRuleMatn"
    // InternalQiraa.g:351:1: entryRuleMatn returns [EObject current=null] : iv_ruleMatn= ruleMatn EOF ;
    public final EObject entryRuleMatn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatn = null;


        try {
            // InternalQiraa.g:351:45: (iv_ruleMatn= ruleMatn EOF )
            // InternalQiraa.g:352:2: iv_ruleMatn= ruleMatn EOF
            {
             newCompositeNode(grammarAccess.getMatnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatn=ruleMatn();

            state._fsp--;

             current =iv_ruleMatn; 
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
    // $ANTLR end "entryRuleMatn"


    // $ANTLR start "ruleMatn"
    // InternalQiraa.g:358:1: ruleMatn returns [EObject current=null] : (this_BASMALAH_0= RULE_BASMALAH ( (lv_name_1_0= ruleAWORDS ) ) ( (lv_makateh_2_0= ruleMaktah ) )+ ) ;
    public final EObject ruleMatn() throws RecognitionException {
        EObject current = null;

        Token this_BASMALAH_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_makateh_2_0 = null;



        	enterRule();

        try {
            // InternalQiraa.g:364:2: ( (this_BASMALAH_0= RULE_BASMALAH ( (lv_name_1_0= ruleAWORDS ) ) ( (lv_makateh_2_0= ruleMaktah ) )+ ) )
            // InternalQiraa.g:365:2: (this_BASMALAH_0= RULE_BASMALAH ( (lv_name_1_0= ruleAWORDS ) ) ( (lv_makateh_2_0= ruleMaktah ) )+ )
            {
            // InternalQiraa.g:365:2: (this_BASMALAH_0= RULE_BASMALAH ( (lv_name_1_0= ruleAWORDS ) ) ( (lv_makateh_2_0= ruleMaktah ) )+ )
            // InternalQiraa.g:366:3: this_BASMALAH_0= RULE_BASMALAH ( (lv_name_1_0= ruleAWORDS ) ) ( (lv_makateh_2_0= ruleMaktah ) )+
            {
            this_BASMALAH_0=(Token)match(input,RULE_BASMALAH,FOLLOW_7); 

            			newLeafNode(this_BASMALAH_0, grammarAccess.getMatnAccess().getBASMALAHTerminalRuleCall_0());
            		
            // InternalQiraa.g:370:3: ( (lv_name_1_0= ruleAWORDS ) )
            // InternalQiraa.g:371:4: (lv_name_1_0= ruleAWORDS )
            {
            // InternalQiraa.g:371:4: (lv_name_1_0= ruleAWORDS )
            // InternalQiraa.g:372:5: lv_name_1_0= ruleAWORDS
            {

            					newCompositeNode(grammarAccess.getMatnAccess().getNameAWORDSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleAWORDS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatnRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.qwork.Matn.AWORDS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQiraa.g:389:3: ( (lv_makateh_2_0= ruleMaktah ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==31) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalQiraa.g:390:4: (lv_makateh_2_0= ruleMaktah )
            	    {
            	    // InternalQiraa.g:390:4: (lv_makateh_2_0= ruleMaktah )
            	    // InternalQiraa.g:391:5: lv_makateh_2_0= ruleMaktah
            	    {

            	    					newCompositeNode(grammarAccess.getMatnAccess().getMakatehMaktahParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_makateh_2_0=ruleMaktah();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMatnRule());
            	    					}
            	    					add(
            	    						current,
            	    						"makateh",
            	    						lv_makateh_2_0,
            	    						"org.qwork.Matn.Maktah");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // $ANTLR end "ruleMatn"


    // $ANTLR start "entryRuleMaktah"
    // InternalQiraa.g:412:1: entryRuleMaktah returns [EObject current=null] : iv_ruleMaktah= ruleMaktah EOF ;
    public final EObject entryRuleMaktah() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaktah = null;


        try {
            // InternalQiraa.g:412:47: (iv_ruleMaktah= ruleMaktah EOF )
            // InternalQiraa.g:413:2: iv_ruleMaktah= ruleMaktah EOF
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
    // InternalQiraa.g:419:1: ruleMaktah returns [EObject current=null] : (otherlv_0= '*' otherlv_1= '*' otherlv_2= '*' ( (lv_name_3_0= ruleAWORDS ) ) otherlv_4= '(' ( (lv_abyatCount_5_0= RULE_INT ) ) otherlv_6= ')' ( (lv_abyat_7_0= ruleBayt ) )+ ) ;
    public final EObject ruleMaktah() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_abyatCount_5_0=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_abyat_7_0 = null;



        	enterRule();

        try {
            // InternalQiraa.g:425:2: ( (otherlv_0= '*' otherlv_1= '*' otherlv_2= '*' ( (lv_name_3_0= ruleAWORDS ) ) otherlv_4= '(' ( (lv_abyatCount_5_0= RULE_INT ) ) otherlv_6= ')' ( (lv_abyat_7_0= ruleBayt ) )+ ) )
            // InternalQiraa.g:426:2: (otherlv_0= '*' otherlv_1= '*' otherlv_2= '*' ( (lv_name_3_0= ruleAWORDS ) ) otherlv_4= '(' ( (lv_abyatCount_5_0= RULE_INT ) ) otherlv_6= ')' ( (lv_abyat_7_0= ruleBayt ) )+ )
            {
            // InternalQiraa.g:426:2: (otherlv_0= '*' otherlv_1= '*' otherlv_2= '*' ( (lv_name_3_0= ruleAWORDS ) ) otherlv_4= '(' ( (lv_abyatCount_5_0= RULE_INT ) ) otherlv_6= ')' ( (lv_abyat_7_0= ruleBayt ) )+ )
            // InternalQiraa.g:427:3: otherlv_0= '*' otherlv_1= '*' otherlv_2= '*' ( (lv_name_3_0= ruleAWORDS ) ) otherlv_4= '(' ( (lv_abyatCount_5_0= RULE_INT ) ) otherlv_6= ')' ( (lv_abyat_7_0= ruleBayt ) )+
            {
            otherlv_0=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMaktahAccess().getAsteriskKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getMaktahAccess().getAsteriskKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMaktahAccess().getAsteriskKeyword_2());
            		
            // InternalQiraa.g:439:3: ( (lv_name_3_0= ruleAWORDS ) )
            // InternalQiraa.g:440:4: (lv_name_3_0= ruleAWORDS )
            {
            // InternalQiraa.g:440:4: (lv_name_3_0= ruleAWORDS )
            // InternalQiraa.g:441:5: lv_name_3_0= ruleAWORDS
            {

            					newCompositeNode(grammarAccess.getMaktahAccess().getNameAWORDSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_3_0=ruleAWORDS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaktahRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.qwork.Matn.AWORDS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getMaktahAccess().getLeftParenthesisKeyword_4());
            		
            // InternalQiraa.g:462:3: ( (lv_abyatCount_5_0= RULE_INT ) )
            // InternalQiraa.g:463:4: (lv_abyatCount_5_0= RULE_INT )
            {
            // InternalQiraa.g:463:4: (lv_abyatCount_5_0= RULE_INT )
            // InternalQiraa.g:464:5: lv_abyatCount_5_0= RULE_INT
            {
            lv_abyatCount_5_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_abyatCount_5_0, grammarAccess.getMaktahAccess().getAbyatCountINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaktahRule());
            					}
            					setWithLastConsumed(
            						current,
            						"abyatCount",
            						lv_abyatCount_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getMaktahAccess().getRightParenthesisKeyword_6());
            		
            // InternalQiraa.g:484:3: ( (lv_abyat_7_0= ruleBayt ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalQiraa.g:485:4: (lv_abyat_7_0= ruleBayt )
            	    {
            	    // InternalQiraa.g:485:4: (lv_abyat_7_0= ruleBayt )
            	    // InternalQiraa.g:486:5: lv_abyat_7_0= ruleBayt
            	    {

            	    					newCompositeNode(grammarAccess.getMaktahAccess().getAbyatBaytParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_abyat_7_0=ruleBayt();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMaktahRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abyat",
            	    						lv_abyat_7_0,
            	    						"org.qwork.Matn.Bayt");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // $ANTLR end "ruleMaktah"


    // $ANTLR start "entryRuleBayt"
    // InternalQiraa.g:507:1: entryRuleBayt returns [EObject current=null] : iv_ruleBayt= ruleBayt EOF ;
    public final EObject entryRuleBayt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBayt = null;


        try {
            // InternalQiraa.g:507:45: (iv_ruleBayt= ruleBayt EOF )
            // InternalQiraa.g:508:2: iv_ruleBayt= ruleBayt EOF
            {
             newCompositeNode(grammarAccess.getBaytRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBayt=ruleBayt();

            state._fsp--;

             current =iv_ruleBayt; 
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
    // $ANTLR end "entryRuleBayt"


    // $ANTLR start "ruleBayt"
    // InternalQiraa.g:514:1: ruleBayt returns [EObject current=null] : ( ( (lv_rakm_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_sadr_2_0= RULE_AWORD ) )+ otherlv_3= '...' ( (lv_ajoz_4_0= RULE_AWORD ) )+ ) ;
    public final EObject ruleBayt() throws RecognitionException {
        EObject current = null;

        Token lv_rakm_0_0=null;
        Token otherlv_1=null;
        Token lv_sadr_2_0=null;
        Token otherlv_3=null;
        Token lv_ajoz_4_0=null;


        	enterRule();

        try {
            // InternalQiraa.g:520:2: ( ( ( (lv_rakm_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_sadr_2_0= RULE_AWORD ) )+ otherlv_3= '...' ( (lv_ajoz_4_0= RULE_AWORD ) )+ ) )
            // InternalQiraa.g:521:2: ( ( (lv_rakm_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_sadr_2_0= RULE_AWORD ) )+ otherlv_3= '...' ( (lv_ajoz_4_0= RULE_AWORD ) )+ )
            {
            // InternalQiraa.g:521:2: ( ( (lv_rakm_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_sadr_2_0= RULE_AWORD ) )+ otherlv_3= '...' ( (lv_ajoz_4_0= RULE_AWORD ) )+ )
            // InternalQiraa.g:522:3: ( (lv_rakm_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_sadr_2_0= RULE_AWORD ) )+ otherlv_3= '...' ( (lv_ajoz_4_0= RULE_AWORD ) )+
            {
            // InternalQiraa.g:522:3: ( (lv_rakm_0_0= RULE_INT ) )
            // InternalQiraa.g:523:4: (lv_rakm_0_0= RULE_INT )
            {
            // InternalQiraa.g:523:4: (lv_rakm_0_0= RULE_INT )
            // InternalQiraa.g:524:5: lv_rakm_0_0= RULE_INT
            {
            lv_rakm_0_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_rakm_0_0, grammarAccess.getBaytAccess().getRakmINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBaytRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rakm",
            						lv_rakm_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getBaytAccess().getHyphenMinusKeyword_1());
            		
            // InternalQiraa.g:544:3: ( (lv_sadr_2_0= RULE_AWORD ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_AWORD) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalQiraa.g:545:4: (lv_sadr_2_0= RULE_AWORD )
            	    {
            	    // InternalQiraa.g:545:4: (lv_sadr_2_0= RULE_AWORD )
            	    // InternalQiraa.g:546:5: lv_sadr_2_0= RULE_AWORD
            	    {
            	    lv_sadr_2_0=(Token)match(input,RULE_AWORD,FOLLOW_22); 

            	    					newLeafNode(lv_sadr_2_0, grammarAccess.getBaytAccess().getSadrAWORDTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getBaytRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"sadr",
            	    						lv_sadr_2_0,
            	    						"org.qwork.Arabic.AWORD");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_3=(Token)match(input,35,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getBaytAccess().getFullStopFullStopFullStopKeyword_3());
            		
            // InternalQiraa.g:566:3: ( (lv_ajoz_4_0= RULE_AWORD ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_AWORD) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalQiraa.g:567:4: (lv_ajoz_4_0= RULE_AWORD )
            	    {
            	    // InternalQiraa.g:567:4: (lv_ajoz_4_0= RULE_AWORD )
            	    // InternalQiraa.g:568:5: lv_ajoz_4_0= RULE_AWORD
            	    {
            	    lv_ajoz_4_0=(Token)match(input,RULE_AWORD,FOLLOW_23); 

            	    					newLeafNode(lv_ajoz_4_0, grammarAccess.getBaytAccess().getAjozAWORDTerminalRuleCall_4_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getBaytRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"ajoz",
            	    						lv_ajoz_4_0,
            	    						"org.qwork.Arabic.AWORD");
            	    				

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
    // $ANTLR end "ruleBayt"


    // $ANTLR start "entryRuleAWORDS"
    // InternalQiraa.g:588:1: entryRuleAWORDS returns [String current=null] : iv_ruleAWORDS= ruleAWORDS EOF ;
    public final String entryRuleAWORDS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAWORDS = null;


        try {
            // InternalQiraa.g:588:46: (iv_ruleAWORDS= ruleAWORDS EOF )
            // InternalQiraa.g:589:2: iv_ruleAWORDS= ruleAWORDS EOF
            {
             newCompositeNode(grammarAccess.getAWORDSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAWORDS=ruleAWORDS();

            state._fsp--;

             current =iv_ruleAWORDS.getText(); 
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
    // $ANTLR end "entryRuleAWORDS"


    // $ANTLR start "ruleAWORDS"
    // InternalQiraa.g:595:1: ruleAWORDS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AWORD_0= RULE_AWORD )+ ;
    public final AntlrDatatypeRuleToken ruleAWORDS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_AWORD_0=null;


        	enterRule();

        try {
            // InternalQiraa.g:601:2: ( (this_AWORD_0= RULE_AWORD )+ )
            // InternalQiraa.g:602:2: (this_AWORD_0= RULE_AWORD )+
            {
            // InternalQiraa.g:602:2: (this_AWORD_0= RULE_AWORD )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_AWORD) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalQiraa.g:603:3: this_AWORD_0= RULE_AWORD
            	    {
            	    this_AWORD_0=(Token)match(input,RULE_AWORD,FOLLOW_23); 

            	    			current.merge(this_AWORD_0);
            	    		

            	    			newLeafNode(this_AWORD_0, grammarAccess.getAWORDSAccess().getAWORDTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // $ANTLR end "ruleAWORDS"


    // $ANTLR start "rulePerson"
    // InternalQiraa.g:615:1: rulePerson[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )? ) ;
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
            // InternalQiraa.g:621:2: ( ( ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )? ) )
            // InternalQiraa.g:622:2: ( ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )? )
            {
            // InternalQiraa.g:622:2: ( ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )? )
            // InternalQiraa.g:623:3: ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )?
            {
            // InternalQiraa.g:623:3: ( (lv_name_0_0= RULE_KALEMAH ) )
            // InternalQiraa.g:624:4: (lv_name_0_0= RULE_KALEMAH )
            {
            // InternalQiraa.g:624:4: (lv_name_0_0= RULE_KALEMAH )
            // InternalQiraa.g:625:5: lv_name_0_0= RULE_KALEMAH
            {
            lv_name_0_0=(Token)match(input,RULE_KALEMAH,FOLLOW_24); 

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

            // InternalQiraa.g:641:3: (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQiraa.g:642:4: otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getPersonAccess().getArabicLetterAlefArabicLetterSeenArabicLetterMeemArabicLetterHehKeyword_1_0());
                    			
                    // InternalQiraa.g:646:4: ( (lv_esm_2_0= RULE_KALEMAH ) )
                    // InternalQiraa.g:647:5: (lv_esm_2_0= RULE_KALEMAH )
                    {
                    // InternalQiraa.g:647:5: (lv_esm_2_0= RULE_KALEMAH )
                    // InternalQiraa.g:648:6: lv_esm_2_0= RULE_KALEMAH
                    {
                    lv_esm_2_0=(Token)match(input,RULE_KALEMAH,FOLLOW_25); 

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

            // InternalQiraa.g:665:3: (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQiraa.g:666:4: otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getArabicLetterLamArabicLetterQafArabicLetterBehArabicLetterHehKeyword_2_0());
                    			
                    // InternalQiraa.g:670:4: ( (lv_lakab_4_0= RULE_KALEMAH ) )
                    // InternalQiraa.g:671:5: (lv_lakab_4_0= RULE_KALEMAH )
                    {
                    // InternalQiraa.g:671:5: (lv_lakab_4_0= RULE_KALEMAH )
                    // InternalQiraa.g:672:6: lv_lakab_4_0= RULE_KALEMAH
                    {
                    lv_lakab_4_0=(Token)match(input,RULE_KALEMAH,FOLLOW_26); 

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

            // InternalQiraa.g:689:3: (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalQiraa.g:690:4: otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getPersonAccess().getArabicLetterTehArabicLetterWawArabicLetterFehArabicLetterYehKeyword_3_0());
                    			
                    // InternalQiraa.g:694:4: ( (lv_towofia_6_0= RULE_INT ) )
                    // InternalQiraa.g:695:5: (lv_towofia_6_0= RULE_INT )
                    {
                    // InternalQiraa.g:695:5: (lv_towofia_6_0= RULE_INT )
                    // InternalQiraa.g:696:6: lv_towofia_6_0= RULE_INT
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
    // InternalQiraa.g:718:1: ruleDouaa[EObject in_current] returns [EObject current=in_current] : ( ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) ) otherlv_1= '\\u0627\\u0644\\u0644\\u0647' ) ;
    public final EObject ruleDouaa(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_d_0_1=null;
        Token lv_d_0_2=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalQiraa.g:724:2: ( ( ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) ) otherlv_1= '\\u0627\\u0644\\u0644\\u0647' ) )
            // InternalQiraa.g:725:2: ( ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) ) otherlv_1= '\\u0627\\u0644\\u0644\\u0647' )
            {
            // InternalQiraa.g:725:2: ( ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) ) otherlv_1= '\\u0627\\u0644\\u0644\\u0647' )
            // InternalQiraa.g:726:3: ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) ) otherlv_1= '\\u0627\\u0644\\u0644\\u0647'
            {
            // InternalQiraa.g:726:3: ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) )
            // InternalQiraa.g:727:4: ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) )
            {
            // InternalQiraa.g:727:4: ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) )
            // InternalQiraa.g:728:5: (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' )
            {
            // InternalQiraa.g:728:5: (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            else if ( (LA12_0==40) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalQiraa.g:729:6: lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647'
                    {
                    lv_d_0_1=(Token)match(input,39,FOLLOW_27); 

                    						newLeafNode(lv_d_0_1, grammarAccess.getDouaaAccess().getDArabicLetterRehArabicLetterHahArabicLetterMeemArabicLetterHehKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDouaaRule());
                    						}
                    						setWithLastConsumed(current, "d", lv_d_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalQiraa.g:740:6: lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647'
                    {
                    lv_d_0_2=(Token)match(input,40,FOLLOW_27); 

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

            otherlv_1=(Token)match(input,41,FOLLOW_2); 

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
    // InternalQiraa.g:761:1: entryRuleIMAM returns [EObject current=null] : iv_ruleIMAM= ruleIMAM EOF ;
    public final EObject entryRuleIMAM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIMAM = null;


        try {
            // InternalQiraa.g:761:45: (iv_ruleIMAM= ruleIMAM EOF )
            // InternalQiraa.g:762:2: iv_ruleIMAM= ruleIMAM EOF
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
    // InternalQiraa.g:768:1: ruleIMAM returns [EObject current=null] : (otherlv_0= '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' this_Person_1= rulePerson[$current] this_Douaa_2= ruleDouaa[$current] ) ;
    public final EObject ruleIMAM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Person_1 = null;

        EObject this_Douaa_2 = null;



        	enterRule();

        try {
            // InternalQiraa.g:774:2: ( (otherlv_0= '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' this_Person_1= rulePerson[$current] this_Douaa_2= ruleDouaa[$current] ) )
            // InternalQiraa.g:775:2: (otherlv_0= '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' this_Person_1= rulePerson[$current] this_Douaa_2= ruleDouaa[$current] )
            {
            // InternalQiraa.g:775:2: (otherlv_0= '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' this_Person_1= rulePerson[$current] this_Douaa_2= ruleDouaa[$current] )
            // InternalQiraa.g:776:3: otherlv_0= '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' this_Person_1= rulePerson[$current] this_Douaa_2= ruleDouaa[$current]
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIMAMAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaBelowArabicLetterMeemArabicLetterAlefArabicLetterMeemKeyword_0());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getIMAMRule());
            			}
            			newCompositeNode(grammarAccess.getIMAMAccess().getPersonParserRuleCall_1());
            		
            pushFollow(FOLLOW_28);
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
    // InternalQiraa.g:806:1: entryRuleQaree returns [EObject current=null] : iv_ruleQaree= ruleQaree EOF ;
    public final EObject entryRuleQaree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQaree = null;


        try {
            // InternalQiraa.g:806:46: (iv_ruleQaree= ruleQaree EOF )
            // InternalQiraa.g:807:2: iv_ruleQaree= ruleQaree EOF
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
    // InternalQiraa.g:813:1: ruleQaree returns [EObject current=null] : (otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current] ) ;
    public final EObject ruleQaree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Person_1 = null;



        	enterRule();

        try {
            // InternalQiraa.g:819:2: ( (otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current] ) )
            // InternalQiraa.g:820:2: (otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current] )
            {
            // InternalQiraa.g:820:2: (otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current] )
            // InternalQiraa.g:821:3: otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current]
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

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
    // InternalQiraa.g:840:1: entryRuleRawee returns [EObject current=null] : iv_ruleRawee= ruleRawee EOF ;
    public final EObject entryRuleRawee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRawee = null;


        try {
            // InternalQiraa.g:840:46: (iv_ruleRawee= ruleRawee EOF )
            // InternalQiraa.g:841:2: iv_ruleRawee= ruleRawee EOF
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
    // InternalQiraa.g:847:1: ruleRawee returns [EObject current=null] : (otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) ) ;
    public final EObject ruleRawee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Person_1 = null;



        	enterRule();

        try {
            // InternalQiraa.g:853:2: ( (otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) ) )
            // InternalQiraa.g:854:2: (otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) )
            {
            // InternalQiraa.g:854:2: (otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) )
            // InternalQiraa.g:855:3: otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRaweeAccess().getArabicLetterRehArabicLetterAlefArabicLetterWawKeyword_0());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getRaweeRule());
            			}
            			newCompositeNode(grammarAccess.getRaweeAccess().getPersonParserRuleCall_1());
            		
            pushFollow(FOLLOW_29);
            this_Person_1=rulePerson(current);

            state._fsp--;


            			current = this_Person_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRaweeAccess().getArabicLetterAinArabicLetterNoonKeyword_2());
            		
            // InternalQiraa.g:874:3: ( (otherlv_3= RULE_KALEMAH ) )
            // InternalQiraa.g:875:4: (otherlv_3= RULE_KALEMAH )
            {
            // InternalQiraa.g:875:4: (otherlv_3= RULE_KALEMAH )
            // InternalQiraa.g:876:5: otherlv_3= RULE_KALEMAH
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
    // InternalQiraa.g:891:1: entryRuleYokraaLah returns [EObject current=null] : iv_ruleYokraaLah= ruleYokraaLah EOF ;
    public final EObject entryRuleYokraaLah() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYokraaLah = null;


        try {
            // InternalQiraa.g:891:50: (iv_ruleYokraaLah= ruleYokraaLah EOF )
            // InternalQiraa.g:892:2: iv_ruleYokraaLah= ruleYokraaLah EOF
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
    // InternalQiraa.g:898:1: ruleYokraaLah returns [EObject current=null] : (this_Qaree_0= ruleQaree | this_Rawee_1= ruleRawee | this_Istelah_2= ruleIstelah ) ;
    public final EObject ruleYokraaLah() throws RecognitionException {
        EObject current = null;

        EObject this_Qaree_0 = null;

        EObject this_Rawee_1 = null;

        EObject this_Istelah_2 = null;



        	enterRule();

        try {
            // InternalQiraa.g:904:2: ( (this_Qaree_0= ruleQaree | this_Rawee_1= ruleRawee | this_Istelah_2= ruleIstelah ) )
            // InternalQiraa.g:905:2: (this_Qaree_0= ruleQaree | this_Rawee_1= ruleRawee | this_Istelah_2= ruleIstelah )
            {
            // InternalQiraa.g:905:2: (this_Qaree_0= ruleQaree | this_Rawee_1= ruleRawee | this_Istelah_2= ruleIstelah )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt13=1;
                }
                break;
            case 44:
                {
                alt13=2;
                }
                break;
            case 53:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalQiraa.g:906:3: this_Qaree_0= ruleQaree
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
                    // InternalQiraa.g:915:3: this_Rawee_1= ruleRawee
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
                    // InternalQiraa.g:924:3: this_Istelah_2= ruleIstelah
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
    // InternalQiraa.g:936:1: entryRuleTareek returns [EObject current=null] : iv_ruleTareek= ruleTareek EOF ;
    public final EObject entryRuleTareek() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTareek = null;


        try {
            // InternalQiraa.g:936:47: (iv_ruleTareek= ruleTareek EOF )
            // InternalQiraa.g:937:2: iv_ruleTareek= ruleTareek EOF
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
    // InternalQiraa.g:943:1: ruleTareek returns [EObject current=null] : (otherlv_0= '\\u0637\\u0631\\u064A\\u0642' otherlv_1= '\\u062A\\u0644\\u0627\\u0648\\u0629' ( (lv_name_2_0= RULE_KALEMAH ) ) ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) ) ) ;
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
            // InternalQiraa.g:949:2: ( (otherlv_0= '\\u0637\\u0631\\u064A\\u0642' otherlv_1= '\\u062A\\u0644\\u0627\\u0648\\u0629' ( (lv_name_2_0= RULE_KALEMAH ) ) ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) ) ) )
            // InternalQiraa.g:950:2: (otherlv_0= '\\u0637\\u0631\\u064A\\u0642' otherlv_1= '\\u062A\\u0644\\u0627\\u0648\\u0629' ( (lv_name_2_0= RULE_KALEMAH ) ) ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) ) )
            {
            // InternalQiraa.g:950:2: (otherlv_0= '\\u0637\\u0631\\u064A\\u0642' otherlv_1= '\\u062A\\u0644\\u0627\\u0648\\u0629' ( (lv_name_2_0= RULE_KALEMAH ) ) ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) ) )
            // InternalQiraa.g:951:3: otherlv_0= '\\u0637\\u0631\\u064A\\u0642' otherlv_1= '\\u062A\\u0644\\u0627\\u0648\\u0629' ( (lv_name_2_0= RULE_KALEMAH ) ) ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getTareekAccess().getArabicLetterTahArabicLetterRehArabicLetterYehArabicLetterQafKeyword_0());
            		
            otherlv_1=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTareekAccess().getArabicLetterTehArabicLetterLamArabicLetterAlefArabicLetterWawArabicLetterTehMarbutaKeyword_1());
            		
            // InternalQiraa.g:959:3: ( (lv_name_2_0= RULE_KALEMAH ) )
            // InternalQiraa.g:960:4: (lv_name_2_0= RULE_KALEMAH )
            {
            // InternalQiraa.g:960:4: (lv_name_2_0= RULE_KALEMAH )
            // InternalQiraa.g:961:5: lv_name_2_0= RULE_KALEMAH
            {
            lv_name_2_0=(Token)match(input,RULE_KALEMAH,FOLLOW_31); 

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

            // InternalQiraa.g:977:3: ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==48) ) {
                alt15=1;
            }
            else if ( (LA15_0==50) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalQiraa.g:978:4: ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) )
                    {
                    // InternalQiraa.g:978:4: ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) )
                    // InternalQiraa.g:979:5: ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) )
                    {
                    // InternalQiraa.g:979:5: ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) )
                    // InternalQiraa.g:980:6: (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' )
                    {
                    // InternalQiraa.g:980:6: (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' )
                    // InternalQiraa.g:981:7: lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635'
                    {
                    lv_simple_3_0=(Token)match(input,48,FOLLOW_32); 

                    							newLeafNode(lv_simple_3_0, grammarAccess.getTareekAccess().getSimpleArabicLetterKhahArabicLetterAlefArabicLetterLamArabicLetterSadKeyword_3_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTareekRule());
                    							}
                    							setWithLastConsumed(current, "simple", lv_simple_3_0 != null, "\u062E\u0627\u0644\u0635");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,49,FOLLOW_4); 

                    					newLeafNode(otherlv_4, grammarAccess.getTareekAccess().getArabicLetterLamKeyword_3_0_1());
                    				
                    // InternalQiraa.g:997:5: ( (otherlv_5= RULE_KALEMAH ) )
                    // InternalQiraa.g:998:6: (otherlv_5= RULE_KALEMAH )
                    {
                    // InternalQiraa.g:998:6: (otherlv_5= RULE_KALEMAH )
                    // InternalQiraa.g:999:7: otherlv_5= RULE_KALEMAH
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
                    // InternalQiraa.g:1012:4: ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ )
                    {
                    // InternalQiraa.g:1012:4: ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ )
                    // InternalQiraa.g:1013:5: ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+
                    {
                    // InternalQiraa.g:1013:5: ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' )
                    // InternalQiraa.g:1014:6: ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646'
                    {
                    // InternalQiraa.g:1014:6: ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) )
                    // InternalQiraa.g:1015:7: (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' )
                    {
                    // InternalQiraa.g:1015:7: (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' )
                    // InternalQiraa.g:1016:8: lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628'
                    {
                    lv_complex_6_0=(Token)match(input,50,FOLLOW_33); 

                    								newLeafNode(lv_complex_6_0, grammarAccess.getTareekAccess().getComplexArabicLetterMeemArabicLetterRehArabicLetterKafArabicLetterBehKeyword_3_1_0_0_0());
                    							

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getTareekRule());
                    								}
                    								setWithLastConsumed(current, "complex", lv_complex_6_0 != null, "\u0645\u0631\u0643\u0628");
                    							

                    }


                    }

                    otherlv_7=(Token)match(input,51,FOLLOW_4); 

                    						newLeafNode(otherlv_7, grammarAccess.getTareekAccess().getArabicLetterMeemArabicLetterNoonKeyword_3_1_0_1());
                    					

                    }

                    // InternalQiraa.g:1033:5: ( (otherlv_8= RULE_KALEMAH ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_KALEMAH) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalQiraa.g:1034:6: (otherlv_8= RULE_KALEMAH )
                    	    {
                    	    // InternalQiraa.g:1034:6: (otherlv_8= RULE_KALEMAH )
                    	    // InternalQiraa.g:1035:7: otherlv_8= RULE_KALEMAH
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTareekRule());
                    	    							}
                    	    						
                    	    otherlv_8=(Token)match(input,RULE_KALEMAH,FOLLOW_34); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getTareekAccess().getRefsTareekCrossReference_3_1_1_0());
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
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
    // InternalQiraa.g:1052:1: entryRuleKayd returns [EObject current=null] : iv_ruleKayd= ruleKayd EOF ;
    public final EObject entryRuleKayd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKayd = null;


        try {
            // InternalQiraa.g:1052:45: (iv_ruleKayd= ruleKayd EOF )
            // InternalQiraa.g:1053:2: iv_ruleKayd= ruleKayd EOF
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
    // InternalQiraa.g:1059:1: ruleKayd returns [EObject current=null] : (otherlv_0= '\\u0642\\u064A\\u062F' ( (lv_name_1_0= RULE_KALEMAH ) ) ) ;
    public final EObject ruleKayd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalQiraa.g:1065:2: ( (otherlv_0= '\\u0642\\u064A\\u062F' ( (lv_name_1_0= RULE_KALEMAH ) ) ) )
            // InternalQiraa.g:1066:2: (otherlv_0= '\\u0642\\u064A\\u062F' ( (lv_name_1_0= RULE_KALEMAH ) ) )
            {
            // InternalQiraa.g:1066:2: (otherlv_0= '\\u0642\\u064A\\u062F' ( (lv_name_1_0= RULE_KALEMAH ) ) )
            // InternalQiraa.g:1067:3: otherlv_0= '\\u0642\\u064A\\u062F' ( (lv_name_1_0= RULE_KALEMAH ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getKaydAccess().getArabicLetterQafArabicLetterYehArabicLetterDalKeyword_0());
            		
            // InternalQiraa.g:1071:3: ( (lv_name_1_0= RULE_KALEMAH ) )
            // InternalQiraa.g:1072:4: (lv_name_1_0= RULE_KALEMAH )
            {
            // InternalQiraa.g:1072:4: (lv_name_1_0= RULE_KALEMAH )
            // InternalQiraa.g:1073:5: lv_name_1_0= RULE_KALEMAH
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
    // InternalQiraa.g:1093:1: entryRuleIstelah returns [EObject current=null] : iv_ruleIstelah= ruleIstelah EOF ;
    public final EObject entryRuleIstelah() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIstelah = null;


        try {
            // InternalQiraa.g:1093:48: (iv_ruleIstelah= ruleIstelah EOF )
            // InternalQiraa.g:1094:2: iv_ruleIstelah= ruleIstelah EOF
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
    // InternalQiraa.g:1100:1: ruleIstelah returns [EObject current=null] : (otherlv_0= '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* ) ;
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
            // InternalQiraa.g:1106:2: ( (otherlv_0= '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* ) )
            // InternalQiraa.g:1107:2: (otherlv_0= '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* )
            {
            // InternalQiraa.g:1107:2: (otherlv_0= '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* )
            // InternalQiraa.g:1108:3: otherlv_0= '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )*
            {
            otherlv_0=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIstelahAccess().getArabicLetterAlefArabicLetterSadArabicLetterTahArabicLetterLamArabicLetterAlefArabicLetterHahKeyword_0());
            		
            // InternalQiraa.g:1112:3: ( (lv_name_1_0= RULE_KALEMAH ) )
            // InternalQiraa.g:1113:4: (lv_name_1_0= RULE_KALEMAH )
            {
            // InternalQiraa.g:1113:4: (lv_name_1_0= RULE_KALEMAH )
            // InternalQiraa.g:1114:5: lv_name_1_0= RULE_KALEMAH
            {
            lv_name_1_0=(Token)match(input,RULE_KALEMAH,FOLLOW_35); 

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

            otherlv_2=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getIstelahAccess().getArabicLetterYehArabicLetterAinArabicLetterNoonArabicLetterYehKeyword_2());
            		
            // InternalQiraa.g:1134:3: ( (otherlv_3= RULE_KALEMAH ) )
            // InternalQiraa.g:1135:4: (otherlv_3= RULE_KALEMAH )
            {
            // InternalQiraa.g:1135:4: (otherlv_3= RULE_KALEMAH )
            // InternalQiraa.g:1136:5: otherlv_3= RULE_KALEMAH
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIstelahRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_KALEMAH,FOLLOW_36); 

            					newLeafNode(otherlv_3, grammarAccess.getIstelahAccess().getRefsYokraaLahCrossReference_3_0());
            				

            }


            }

            // InternalQiraa.g:1147:3: (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==55) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalQiraa.g:1148:4: otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) )
            	    {
            	    otherlv_4=(Token)match(input,55,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIstelahAccess().getArabicLetterWawKeyword_4_0());
            	    			
            	    // InternalQiraa.g:1152:4: ( (otherlv_5= RULE_KALEMAH ) )
            	    // InternalQiraa.g:1153:5: (otherlv_5= RULE_KALEMAH )
            	    {
            	    // InternalQiraa.g:1153:5: (otherlv_5= RULE_KALEMAH )
            	    // InternalQiraa.g:1154:6: otherlv_5= RULE_KALEMAH
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIstelahRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_KALEMAH,FOLLOW_36); 

            	    						newLeafNode(otherlv_5, grammarAccess.getIstelahAccess().getRefsYokraaLahCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalQiraa.g:1170:1: entryRuleRamz returns [EObject current=null] : iv_ruleRamz= ruleRamz EOF ;
    public final EObject entryRuleRamz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRamz = null;


        try {
            // InternalQiraa.g:1170:45: (iv_ruleRamz= ruleRamz EOF )
            // InternalQiraa.g:1171:2: iv_ruleRamz= ruleRamz EOF
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
    // InternalQiraa.g:1177:1: ruleRamz returns [EObject current=null] : (otherlv_0= '\\u0631\\u0645\\u0632' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* ) ;
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
            // InternalQiraa.g:1183:2: ( (otherlv_0= '\\u0631\\u0645\\u0632' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* ) )
            // InternalQiraa.g:1184:2: (otherlv_0= '\\u0631\\u0645\\u0632' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* )
            {
            // InternalQiraa.g:1184:2: (otherlv_0= '\\u0631\\u0645\\u0632' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* )
            // InternalQiraa.g:1185:3: otherlv_0= '\\u0631\\u0645\\u0632' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )*
            {
            otherlv_0=(Token)match(input,56,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRamzAccess().getArabicLetterRehArabicLetterMeemArabicLetterZainKeyword_0());
            		
            // InternalQiraa.g:1189:3: ( (lv_name_1_0= RULE_KALEMAH ) )
            // InternalQiraa.g:1190:4: (lv_name_1_0= RULE_KALEMAH )
            {
            // InternalQiraa.g:1190:4: (lv_name_1_0= RULE_KALEMAH )
            // InternalQiraa.g:1191:5: lv_name_1_0= RULE_KALEMAH
            {
            lv_name_1_0=(Token)match(input,RULE_KALEMAH,FOLLOW_35); 

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

            otherlv_2=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRamzAccess().getArabicLetterYehArabicLetterAinArabicLetterNoonArabicLetterYehKeyword_2());
            		
            // InternalQiraa.g:1211:3: ( (otherlv_3= RULE_KALEMAH ) )
            // InternalQiraa.g:1212:4: (otherlv_3= RULE_KALEMAH )
            {
            // InternalQiraa.g:1212:4: (otherlv_3= RULE_KALEMAH )
            // InternalQiraa.g:1213:5: otherlv_3= RULE_KALEMAH
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRamzRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_KALEMAH,FOLLOW_36); 

            					newLeafNode(otherlv_3, grammarAccess.getRamzAccess().getRefsYokraaLahCrossReference_3_0());
            				

            }


            }

            // InternalQiraa.g:1224:3: (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==55) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalQiraa.g:1225:4: otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) )
            	    {
            	    otherlv_4=(Token)match(input,55,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRamzAccess().getArabicLetterWawKeyword_4_0());
            	    			
            	    // InternalQiraa.g:1229:4: ( (otherlv_5= RULE_KALEMAH ) )
            	    // InternalQiraa.g:1230:5: (otherlv_5= RULE_KALEMAH )
            	    {
            	    // InternalQiraa.g:1230:5: (otherlv_5= RULE_KALEMAH )
            	    // InternalQiraa.g:1231:6: otherlv_5= RULE_KALEMAH
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRamzRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_KALEMAH,FOLLOW_36); 

            	    						newLeafNode(otherlv_5, grammarAccess.getRamzAccess().getRefsYokraaLahCrossReference_4_1_0());
            	    					

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
    // $ANTLR end "ruleRamz"


    // $ANTLR start "entryRuleHarfQuran"
    // InternalQiraa.g:1247:1: entryRuleHarfQuran returns [EObject current=null] : iv_ruleHarfQuran= ruleHarfQuran EOF ;
    public final EObject entryRuleHarfQuran() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHarfQuran = null;


        try {
            // InternalQiraa.g:1247:50: (iv_ruleHarfQuran= ruleHarfQuran EOF )
            // InternalQiraa.g:1248:2: iv_ruleHarfQuran= ruleHarfQuran EOF
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
    // InternalQiraa.g:1254:1: ruleHarfQuran returns [EObject current=null] : ( ( (lv_word_0_0= RULE_AWORD ) ) otherlv_1= '\\u0645\\u0646' otherlv_2= '\\u0642\\u0648\\u0644\\u0647' otherlv_3= '\\u062A\\u0639\\u0627\\u0644\\u0649' ( (otherlv_4= RULE_KALEMAH ) ) (otherlv_5= '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' ( (lv_mawdee_6_0= ruleMawdee ) ) )? ) ;
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
            // InternalQiraa.g:1260:2: ( ( ( (lv_word_0_0= RULE_AWORD ) ) otherlv_1= '\\u0645\\u0646' otherlv_2= '\\u0642\\u0648\\u0644\\u0647' otherlv_3= '\\u062A\\u0639\\u0627\\u0644\\u0649' ( (otherlv_4= RULE_KALEMAH ) ) (otherlv_5= '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' ( (lv_mawdee_6_0= ruleMawdee ) ) )? ) )
            // InternalQiraa.g:1261:2: ( ( (lv_word_0_0= RULE_AWORD ) ) otherlv_1= '\\u0645\\u0646' otherlv_2= '\\u0642\\u0648\\u0644\\u0647' otherlv_3= '\\u062A\\u0639\\u0627\\u0644\\u0649' ( (otherlv_4= RULE_KALEMAH ) ) (otherlv_5= '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' ( (lv_mawdee_6_0= ruleMawdee ) ) )? )
            {
            // InternalQiraa.g:1261:2: ( ( (lv_word_0_0= RULE_AWORD ) ) otherlv_1= '\\u0645\\u0646' otherlv_2= '\\u0642\\u0648\\u0644\\u0647' otherlv_3= '\\u062A\\u0639\\u0627\\u0644\\u0649' ( (otherlv_4= RULE_KALEMAH ) ) (otherlv_5= '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' ( (lv_mawdee_6_0= ruleMawdee ) ) )? )
            // InternalQiraa.g:1262:3: ( (lv_word_0_0= RULE_AWORD ) ) otherlv_1= '\\u0645\\u0646' otherlv_2= '\\u0642\\u0648\\u0644\\u0647' otherlv_3= '\\u062A\\u0639\\u0627\\u0644\\u0649' ( (otherlv_4= RULE_KALEMAH ) ) (otherlv_5= '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' ( (lv_mawdee_6_0= ruleMawdee ) ) )?
            {
            // InternalQiraa.g:1262:3: ( (lv_word_0_0= RULE_AWORD ) )
            // InternalQiraa.g:1263:4: (lv_word_0_0= RULE_AWORD )
            {
            // InternalQiraa.g:1263:4: (lv_word_0_0= RULE_AWORD )
            // InternalQiraa.g:1264:5: lv_word_0_0= RULE_AWORD
            {
            lv_word_0_0=(Token)match(input,RULE_AWORD,FOLLOW_33); 

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

            otherlv_1=(Token)match(input,51,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getHarfQuranAccess().getArabicLetterMeemArabicLetterNoonKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getHarfQuranAccess().getArabicLetterQafArabicLetterWawArabicLetterLamArabicLetterHehKeyword_2());
            		
            otherlv_3=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getHarfQuranAccess().getArabicLetterTehArabicLetterAinArabicLetterAlefArabicLetterLamArabicLetterAlefMaksuraKeyword_3());
            		
            // InternalQiraa.g:1292:3: ( (otherlv_4= RULE_KALEMAH ) )
            // InternalQiraa.g:1293:4: (otherlv_4= RULE_KALEMAH )
            {
            // InternalQiraa.g:1293:4: (otherlv_4= RULE_KALEMAH )
            // InternalQiraa.g:1294:5: otherlv_4= RULE_KALEMAH
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHarfQuranRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_KALEMAH,FOLLOW_39); 

            					newLeafNode(otherlv_4, grammarAccess.getHarfQuranAccess().getAyahAyahStartCrossReference_4_0());
            				

            }


            }

            // InternalQiraa.g:1305:3: (otherlv_5= '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' ( (lv_mawdee_6_0= ruleMawdee ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==58) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalQiraa.g:1306:4: otherlv_5= '\\u0627\\u0644\\u0645\\u0648\\u0636\\u0639' ( (lv_mawdee_6_0= ruleMawdee ) )
                    {
                    otherlv_5=(Token)match(input,58,FOLLOW_40); 

                    				newLeafNode(otherlv_5, grammarAccess.getHarfQuranAccess().getArabicLetterAlefArabicLetterLamArabicLetterMeemArabicLetterWawArabicLetterDadArabicLetterAinKeyword_5_0());
                    			
                    // InternalQiraa.g:1310:4: ( (lv_mawdee_6_0= ruleMawdee ) )
                    // InternalQiraa.g:1311:5: (lv_mawdee_6_0= ruleMawdee )
                    {
                    // InternalQiraa.g:1311:5: (lv_mawdee_6_0= ruleMawdee )
                    // InternalQiraa.g:1312:6: lv_mawdee_6_0= ruleMawdee
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
                    							"org.qwork.OsolQiraa.Mawdee");
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
    // InternalQiraa.g:1334:1: entryRuleMawdee returns [String current=null] : iv_ruleMawdee= ruleMawdee EOF ;
    public final String entryRuleMawdee() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMawdee = null;


        try {
            // InternalQiraa.g:1334:46: (iv_ruleMawdee= ruleMawdee EOF )
            // InternalQiraa.g:1335:2: iv_ruleMawdee= ruleMawdee EOF
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
    // InternalQiraa.g:1341:1: ruleMawdee returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u0627\\u0644\\u0623\\u0648\\u0644' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' | kw= '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' ) ;
    public final AntlrDatatypeRuleToken ruleMawdee() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalQiraa.g:1347:2: ( (kw= '\\u0627\\u0644\\u0623\\u0648\\u0644' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' | kw= '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' ) )
            // InternalQiraa.g:1348:2: (kw= '\\u0627\\u0644\\u0623\\u0648\\u0644' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' | kw= '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' )
            {
            // InternalQiraa.g:1348:2: (kw= '\\u0627\\u0644\\u0623\\u0648\\u0644' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' | kw= '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt19=1;
                }
                break;
            case 60:
                {
                alt19=2;
                }
                break;
            case 61:
                {
                alt19=3;
                }
                break;
            case 62:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalQiraa.g:1349:3: kw= '\\u0627\\u0644\\u0623\\u0648\\u0644'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaAboveArabicLetterWawArabicLetterLamKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQiraa.g:1355:3: kw= '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterNoonArabicLetterYehKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalQiraa.g:1361:3: kw= '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterLamArabicLetterThehKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalQiraa.g:1367:3: kw= '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

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
    // InternalQiraa.g:1376:1: entryRuleHarf returns [EObject current=null] : iv_ruleHarf= ruleHarf EOF ;
    public final EObject entryRuleHarf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHarf = null;


        try {
            // InternalQiraa.g:1376:45: (iv_ruleHarf= ruleHarf EOF )
            // InternalQiraa.g:1377:2: iv_ruleHarf= ruleHarf EOF
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
    // InternalQiraa.g:1383:1: ruleHarf returns [EObject current=null] : (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) ) ;
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
            // InternalQiraa.g:1389:2: ( (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) ) )
            // InternalQiraa.g:1390:2: (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) )
            {
            // InternalQiraa.g:1390:2: (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) )
            // InternalQiraa.g:1391:3: otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getHarfAccess().getArabicLetterHahArabicLetterRehArabicLetterFehKeyword_0());
            		
            // InternalQiraa.g:1395:3: ( (lv_name_1_0= RULE_AWORD ) )
            // InternalQiraa.g:1396:4: (lv_name_1_0= RULE_AWORD )
            {
            // InternalQiraa.g:1396:4: (lv_name_1_0= RULE_AWORD )
            // InternalQiraa.g:1397:5: lv_name_1_0= RULE_AWORD
            {
            lv_name_1_0=(Token)match(input,RULE_AWORD,FOLLOW_41); 

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

            // InternalQiraa.g:1413:3: ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==64) ) {
                alt21=1;
            }
            else if ( (LA21_0==66) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalQiraa.g:1414:4: (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* )
                    {
                    // InternalQiraa.g:1414:4: (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* )
                    // InternalQiraa.g:1415:5: otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )*
                    {
                    otherlv_2=(Token)match(input,64,FOLLOW_7); 

                    					newLeafNode(otherlv_2, grammarAccess.getHarfAccess().getArabicLetterHehArabicLetterWawKeyword_2_0_0());
                    				
                    // InternalQiraa.g:1419:5: ( (lv_values_3_0= RULE_AWORD ) )
                    // InternalQiraa.g:1420:6: (lv_values_3_0= RULE_AWORD )
                    {
                    // InternalQiraa.g:1420:6: (lv_values_3_0= RULE_AWORD )
                    // InternalQiraa.g:1421:7: lv_values_3_0= RULE_AWORD
                    {
                    lv_values_3_0=(Token)match(input,RULE_AWORD,FOLLOW_42); 

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

                    // InternalQiraa.g:1437:5: (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==65) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalQiraa.g:1438:6: otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) )
                    	    {
                    	    otherlv_4=(Token)match(input,65,FOLLOW_7); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getHarfAccess().getArabicLetterAlefWithHamzaAboveArabicLetterWawKeyword_2_0_2_0());
                    	    					
                    	    // InternalQiraa.g:1442:6: ( (lv_values_5_0= RULE_AWORD ) )
                    	    // InternalQiraa.g:1443:7: (lv_values_5_0= RULE_AWORD )
                    	    {
                    	    // InternalQiraa.g:1443:7: (lv_values_5_0= RULE_AWORD )
                    	    // InternalQiraa.g:1444:8: lv_values_5_0= RULE_AWORD
                    	    {
                    	    lv_values_5_0=(Token)match(input,RULE_AWORD,FOLLOW_42); 

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
                    	    break loop20;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalQiraa.g:1463:4: (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) )
                    {
                    // InternalQiraa.g:1463:4: (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) )
                    // InternalQiraa.g:1464:5: otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) )
                    {
                    otherlv_6=(Token)match(input,66,FOLLOW_7); 

                    					newLeafNode(otherlv_6, grammarAccess.getHarfAccess().getArabicLetterThalArabicLetterAlefArabicLetterTehArabicLetterHehKeyword_2_1_0());
                    				
                    // InternalQiraa.g:1468:5: ( (otherlv_7= RULE_AWORD ) )
                    // InternalQiraa.g:1469:6: (otherlv_7= RULE_AWORD )
                    {
                    // InternalQiraa.g:1469:6: (otherlv_7= RULE_AWORD )
                    // InternalQiraa.g:1470:7: otherlv_7= RULE_AWORD
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
    // InternalQiraa.g:1487:1: entryRuleHarakah returns [EObject current=null] : iv_ruleHarakah= ruleHarakah EOF ;
    public final EObject entryRuleHarakah() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHarakah = null;


        try {
            // InternalQiraa.g:1487:48: (iv_ruleHarakah= ruleHarakah EOF )
            // InternalQiraa.g:1488:2: iv_ruleHarakah= ruleHarakah EOF
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
    // InternalQiraa.g:1494:1: ruleHarakah returns [EObject current=null] : (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AWORD ) ) ) ;
    public final EObject ruleHarakah() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalQiraa.g:1500:2: ( (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AWORD ) ) ) )
            // InternalQiraa.g:1501:2: (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AWORD ) ) )
            {
            // InternalQiraa.g:1501:2: (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AWORD ) ) )
            // InternalQiraa.g:1502:3: otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AWORD ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHarakahAccess().getArabicLetterHahArabicLetterRehArabicLetterKafArabicLetterTehMarbutaKeyword_0());
            		
            // InternalQiraa.g:1506:3: ( (lv_name_1_0= RULE_KALEMAH ) )
            // InternalQiraa.g:1507:4: (lv_name_1_0= RULE_KALEMAH )
            {
            // InternalQiraa.g:1507:4: (lv_name_1_0= RULE_KALEMAH )
            // InternalQiraa.g:1508:5: lv_name_1_0= RULE_KALEMAH
            {
            lv_name_1_0=(Token)match(input,RULE_KALEMAH,FOLLOW_43); 

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

            otherlv_2=(Token)match(input,68,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getHarakahAccess().getArabicLetterHehArabicLetterYehKeyword_2());
            		
            // InternalQiraa.g:1528:3: ( (lv_value_3_0= RULE_AWORD ) )
            // InternalQiraa.g:1529:4: (lv_value_3_0= RULE_AWORD )
            {
            // InternalQiraa.g:1529:4: (lv_value_3_0= RULE_AWORD )
            // InternalQiraa.g:1530:5: lv_value_3_0= RULE_AWORD
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
    // InternalQiraa.g:1550:1: entryRuleAyahStart returns [EObject current=null] : iv_ruleAyahStart= ruleAyahStart EOF ;
    public final EObject entryRuleAyahStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAyahStart = null;


        try {
            // InternalQiraa.g:1550:50: (iv_ruleAyahStart= ruleAyahStart EOF )
            // InternalQiraa.g:1551:2: iv_ruleAyahStart= ruleAyahStart EOF
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
    // InternalQiraa.g:1557:1: ruleAyahStart returns [EObject current=null] : (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) ) ;
    public final EObject ruleAyahStart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_surah_1_0=null;
        Token otherlv_2=null;
        Token lv_ayah_3_0=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalQiraa.g:1563:2: ( (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) ) )
            // InternalQiraa.g:1564:2: (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) )
            {
            // InternalQiraa.g:1564:2: (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) )
            // InternalQiraa.g:1565:3: otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterSeenArabicLetterWawArabicLetterRehArabicLetterTehMarbutaKeyword_0());
            		
            // InternalQiraa.g:1569:3: ( (lv_surah_1_0= RULE_INT ) )
            // InternalQiraa.g:1570:4: (lv_surah_1_0= RULE_INT )
            {
            // InternalQiraa.g:1570:4: (lv_surah_1_0= RULE_INT )
            // InternalQiraa.g:1571:5: lv_surah_1_0= RULE_INT
            {
            lv_surah_1_0=(Token)match(input,RULE_INT,FOLLOW_44); 

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

            otherlv_2=(Token)match(input,70,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithMaddaAboveArabicLetterYehArabicLetterTehMarbutaKeyword_2());
            		
            // InternalQiraa.g:1591:3: ( (lv_ayah_3_0= RULE_INT ) )
            // InternalQiraa.g:1592:4: (lv_ayah_3_0= RULE_INT )
            {
            // InternalQiraa.g:1592:4: (lv_ayah_3_0= RULE_INT )
            // InternalQiraa.g:1593:5: lv_ayah_3_0= RULE_INT
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

            // InternalQiraa.g:1609:3: ( (lv_name_4_0= RULE_KALEMAH ) )
            // InternalQiraa.g:1610:4: (lv_name_4_0= RULE_KALEMAH )
            {
            // InternalQiraa.g:1610:4: (lv_name_4_0= RULE_KALEMAH )
            // InternalQiraa.g:1611:5: lv_name_4_0= RULE_KALEMAH
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
    // InternalQiraa.g:1631:1: entryRulePhrase returns [EObject current=null] : iv_rulePhrase= rulePhrase EOF ;
    public final EObject entryRulePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhrase = null;


        try {
            // InternalQiraa.g:1631:47: (iv_rulePhrase= rulePhrase EOF )
            // InternalQiraa.g:1632:2: iv_rulePhrase= rulePhrase EOF
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
    // InternalQiraa.g:1638:1: rulePhrase returns [EObject current=null] : ( ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+ ) ;
    public final EObject rulePhrase() throws RecognitionException {
        EObject current = null;

        Token lv_basmalah_0_0=null;
        Token lv_words_1_0=null;


        	enterRule();

        try {
            // InternalQiraa.g:1644:2: ( ( ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+ ) )
            // InternalQiraa.g:1645:2: ( ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+ )
            {
            // InternalQiraa.g:1645:2: ( ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+ )
            // InternalQiraa.g:1646:3: ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+
            {
            // InternalQiraa.g:1646:3: ( (lv_basmalah_0_0= RULE_BASMALAH ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_BASMALAH) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalQiraa.g:1647:4: (lv_basmalah_0_0= RULE_BASMALAH )
                    {
                    // InternalQiraa.g:1647:4: (lv_basmalah_0_0= RULE_BASMALAH )
                    // InternalQiraa.g:1648:5: lv_basmalah_0_0= RULE_BASMALAH
                    {
                    lv_basmalah_0_0=(Token)match(input,RULE_BASMALAH,FOLLOW_7); 

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

            // InternalQiraa.g:1664:3: ( (lv_words_1_0= RULE_AWORD ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_AWORD) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalQiraa.g:1665:4: (lv_words_1_0= RULE_AWORD )
            	    {
            	    // InternalQiraa.g:1665:4: (lv_words_1_0= RULE_AWORD )
            	    // InternalQiraa.g:1666:5: lv_words_1_0= RULE_AWORD
            	    {
            	    lv_words_1_0=(Token)match(input,RULE_AWORD,FOLLOW_23); 

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
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0100000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0100000006000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x7800000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});

}