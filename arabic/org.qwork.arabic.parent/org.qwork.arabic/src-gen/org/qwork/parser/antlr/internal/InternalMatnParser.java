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
import org.qwork.services.MatnGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMatnParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BASMALAH", "RULE_INT", "RULE_AWORD", "RULE_KALEMAH", "RULE_ALETTER", "RULE_AHARAKAH", "RULE_ATANWEEN", "RULE_ASHADDAH", "RULE_ALIGATURES", "RULE_ADIGIT", "RULE_ANONLETTER", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'('", "')'", "'-'", "'...'", "'\\u0627\\u0633\\u0645\\u0647'", "'\\u0644\\u0642\\u0628\\u0647'", "'\\u062A\\u0648\\u0641\\u064A'", "'\\u0631\\u062D\\u0645\\u0647'", "'\\u0623\\u0643\\u0631\\u0645\\u0647'", "'\\u0627\\u0644\\u0644\\u0647'", "'\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645'", "'\\u0642\\u0627\\u0631\\u0626'", "'\\u0631\\u0627\\u0648'", "'\\u0639\\u0646'", "'\\u0637\\u0631\\u064A\\u0642'", "'\\u062A\\u0644\\u0627\\u0648\\u0629'", "'\\u062E\\u0627\\u0644\\u0635'", "'\\u0644'", "'\\u0645\\u0631\\u0643\\u0628'", "'\\u0645\\u0646'", "'\\u0642\\u064A\\u062F'", "'\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D'", "'\\u064A\\u0639\\u0646\\u064A'", "'\\u0648'", "'\\u0631\\u0645\\u0632'", "'\\u0627\\u0644\\u0623\\u0648\\u0644'", "'\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A'", "'\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B'", "'\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631'", "'\\u062D\\u0631\\u0641'", "'\\u0647\\u0648'", "'\\u0623\\u0648'", "'\\u0630\\u0627\\u062A\\u0647'", "'\\u062D\\u0631\\u0643\\u0629'", "'\\u0647\\u064A'", "'\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'", "'\\u0627\\u0644\\u0622\\u064A\\u0629'"
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
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int RULE_AWORD=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__21=21;
    public static final int RULE_BASMALAH=4;
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

        public InternalMatnParser(TokenStream input, MatnGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MatnModel";
       	}

       	@Override
       	protected MatnGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMatnModel"
    // InternalMatn.g:64:1: entryRuleMatnModel returns [EObject current=null] : iv_ruleMatnModel= ruleMatnModel EOF ;
    public final EObject entryRuleMatnModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatnModel = null;


        try {
            // InternalMatn.g:64:50: (iv_ruleMatnModel= ruleMatnModel EOF )
            // InternalMatn.g:65:2: iv_ruleMatnModel= ruleMatnModel EOF
            {
             newCompositeNode(grammarAccess.getMatnModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatnModel=ruleMatnModel();

            state._fsp--;

             current =iv_ruleMatnModel; 
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
    // $ANTLR end "entryRuleMatnModel"


    // $ANTLR start "ruleMatnModel"
    // InternalMatn.g:71:1: ruleMatnModel returns [EObject current=null] : ( (lv_matn_0_0= ruleMatn ) ) ;
    public final EObject ruleMatnModel() throws RecognitionException {
        EObject current = null;

        EObject lv_matn_0_0 = null;



        	enterRule();

        try {
            // InternalMatn.g:77:2: ( ( (lv_matn_0_0= ruleMatn ) ) )
            // InternalMatn.g:78:2: ( (lv_matn_0_0= ruleMatn ) )
            {
            // InternalMatn.g:78:2: ( (lv_matn_0_0= ruleMatn ) )
            // InternalMatn.g:79:3: (lv_matn_0_0= ruleMatn )
            {
            // InternalMatn.g:79:3: (lv_matn_0_0= ruleMatn )
            // InternalMatn.g:80:4: lv_matn_0_0= ruleMatn
            {

            				newCompositeNode(grammarAccess.getMatnModelAccess().getMatnMatnParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_matn_0_0=ruleMatn();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMatnModelRule());
            				}
            				set(
            					current,
            					"matn",
            					lv_matn_0_0,
            					"org.qwork.Matn.Matn");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleMatnModel"


    // $ANTLR start "entryRuleMatn"
    // InternalMatn.g:100:1: entryRuleMatn returns [EObject current=null] : iv_ruleMatn= ruleMatn EOF ;
    public final EObject entryRuleMatn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatn = null;


        try {
            // InternalMatn.g:100:45: (iv_ruleMatn= ruleMatn EOF )
            // InternalMatn.g:101:2: iv_ruleMatn= ruleMatn EOF
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
    // InternalMatn.g:107:1: ruleMatn returns [EObject current=null] : (this_BASMALAH_0= RULE_BASMALAH ( (lv_name_1_0= ruleAWORDS ) ) ( (lv_makateh_2_0= ruleMaktah ) )+ ) ;
    public final EObject ruleMatn() throws RecognitionException {
        EObject current = null;

        Token this_BASMALAH_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_makateh_2_0 = null;



        	enterRule();

        try {
            // InternalMatn.g:113:2: ( (this_BASMALAH_0= RULE_BASMALAH ( (lv_name_1_0= ruleAWORDS ) ) ( (lv_makateh_2_0= ruleMaktah ) )+ ) )
            // InternalMatn.g:114:2: (this_BASMALAH_0= RULE_BASMALAH ( (lv_name_1_0= ruleAWORDS ) ) ( (lv_makateh_2_0= ruleMaktah ) )+ )
            {
            // InternalMatn.g:114:2: (this_BASMALAH_0= RULE_BASMALAH ( (lv_name_1_0= ruleAWORDS ) ) ( (lv_makateh_2_0= ruleMaktah ) )+ )
            // InternalMatn.g:115:3: this_BASMALAH_0= RULE_BASMALAH ( (lv_name_1_0= ruleAWORDS ) ) ( (lv_makateh_2_0= ruleMaktah ) )+
            {
            this_BASMALAH_0=(Token)match(input,RULE_BASMALAH,FOLLOW_3); 

            			newLeafNode(this_BASMALAH_0, grammarAccess.getMatnAccess().getBASMALAHTerminalRuleCall_0());
            		
            // InternalMatn.g:119:3: ( (lv_name_1_0= ruleAWORDS ) )
            // InternalMatn.g:120:4: (lv_name_1_0= ruleAWORDS )
            {
            // InternalMatn.g:120:4: (lv_name_1_0= ruleAWORDS )
            // InternalMatn.g:121:5: lv_name_1_0= ruleAWORDS
            {

            					newCompositeNode(grammarAccess.getMatnAccess().getNameAWORDSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
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

            // InternalMatn.g:138:3: ( (lv_makateh_2_0= ruleMaktah ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMatn.g:139:4: (lv_makateh_2_0= ruleMaktah )
            	    {
            	    // InternalMatn.g:139:4: (lv_makateh_2_0= ruleMaktah )
            	    // InternalMatn.g:140:5: lv_makateh_2_0= ruleMaktah
            	    {

            	    					newCompositeNode(grammarAccess.getMatnAccess().getMakatehMaktahParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // InternalMatn.g:161:1: entryRuleMaktah returns [EObject current=null] : iv_ruleMaktah= ruleMaktah EOF ;
    public final EObject entryRuleMaktah() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaktah = null;


        try {
            // InternalMatn.g:161:47: (iv_ruleMaktah= ruleMaktah EOF )
            // InternalMatn.g:162:2: iv_ruleMaktah= ruleMaktah EOF
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
    // InternalMatn.g:168:1: ruleMaktah returns [EObject current=null] : (otherlv_0= '*' otherlv_1= '*' otherlv_2= '*' ( (lv_name_3_0= ruleAWORDS ) ) otherlv_4= '(' ( (lv_abyatCount_5_0= RULE_INT ) ) otherlv_6= ')' ( (lv_abyat_7_0= ruleBayt ) )+ ) ;
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
            // InternalMatn.g:174:2: ( (otherlv_0= '*' otherlv_1= '*' otherlv_2= '*' ( (lv_name_3_0= ruleAWORDS ) ) otherlv_4= '(' ( (lv_abyatCount_5_0= RULE_INT ) ) otherlv_6= ')' ( (lv_abyat_7_0= ruleBayt ) )+ ) )
            // InternalMatn.g:175:2: (otherlv_0= '*' otherlv_1= '*' otherlv_2= '*' ( (lv_name_3_0= ruleAWORDS ) ) otherlv_4= '(' ( (lv_abyatCount_5_0= RULE_INT ) ) otherlv_6= ')' ( (lv_abyat_7_0= ruleBayt ) )+ )
            {
            // InternalMatn.g:175:2: (otherlv_0= '*' otherlv_1= '*' otherlv_2= '*' ( (lv_name_3_0= ruleAWORDS ) ) otherlv_4= '(' ( (lv_abyatCount_5_0= RULE_INT ) ) otherlv_6= ')' ( (lv_abyat_7_0= ruleBayt ) )+ )
            // InternalMatn.g:176:3: otherlv_0= '*' otherlv_1= '*' otherlv_2= '*' ( (lv_name_3_0= ruleAWORDS ) ) otherlv_4= '(' ( (lv_abyatCount_5_0= RULE_INT ) ) otherlv_6= ')' ( (lv_abyat_7_0= ruleBayt ) )+
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMaktahAccess().getAsteriskKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMaktahAccess().getAsteriskKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMaktahAccess().getAsteriskKeyword_2());
            		
            // InternalMatn.g:188:3: ( (lv_name_3_0= ruleAWORDS ) )
            // InternalMatn.g:189:4: (lv_name_3_0= ruleAWORDS )
            {
            // InternalMatn.g:189:4: (lv_name_3_0= ruleAWORDS )
            // InternalMatn.g:190:5: lv_name_3_0= ruleAWORDS
            {

            					newCompositeNode(grammarAccess.getMaktahAccess().getNameAWORDSParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_4=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getMaktahAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMatn.g:211:3: ( (lv_abyatCount_5_0= RULE_INT ) )
            // InternalMatn.g:212:4: (lv_abyatCount_5_0= RULE_INT )
            {
            // InternalMatn.g:212:4: (lv_abyatCount_5_0= RULE_INT )
            // InternalMatn.g:213:5: lv_abyatCount_5_0= RULE_INT
            {
            lv_abyatCount_5_0=(Token)match(input,RULE_INT,FOLLOW_8); 

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

            otherlv_6=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getMaktahAccess().getRightParenthesisKeyword_6());
            		
            // InternalMatn.g:233:3: ( (lv_abyat_7_0= ruleBayt ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_INT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMatn.g:234:4: (lv_abyat_7_0= ruleBayt )
            	    {
            	    // InternalMatn.g:234:4: (lv_abyat_7_0= ruleBayt )
            	    // InternalMatn.g:235:5: lv_abyat_7_0= ruleBayt
            	    {

            	    					newCompositeNode(grammarAccess.getMaktahAccess().getAbyatBaytParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // InternalMatn.g:256:1: entryRuleBayt returns [EObject current=null] : iv_ruleBayt= ruleBayt EOF ;
    public final EObject entryRuleBayt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBayt = null;


        try {
            // InternalMatn.g:256:45: (iv_ruleBayt= ruleBayt EOF )
            // InternalMatn.g:257:2: iv_ruleBayt= ruleBayt EOF
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
    // InternalMatn.g:263:1: ruleBayt returns [EObject current=null] : ( ( (lv_rakm_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_sadr_2_0= RULE_AWORD ) )+ otherlv_3= '...' ( (lv_ajoz_4_0= RULE_AWORD ) )+ ) ;
    public final EObject ruleBayt() throws RecognitionException {
        EObject current = null;

        Token lv_rakm_0_0=null;
        Token otherlv_1=null;
        Token lv_sadr_2_0=null;
        Token otherlv_3=null;
        Token lv_ajoz_4_0=null;


        	enterRule();

        try {
            // InternalMatn.g:269:2: ( ( ( (lv_rakm_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_sadr_2_0= RULE_AWORD ) )+ otherlv_3= '...' ( (lv_ajoz_4_0= RULE_AWORD ) )+ ) )
            // InternalMatn.g:270:2: ( ( (lv_rakm_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_sadr_2_0= RULE_AWORD ) )+ otherlv_3= '...' ( (lv_ajoz_4_0= RULE_AWORD ) )+ )
            {
            // InternalMatn.g:270:2: ( ( (lv_rakm_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_sadr_2_0= RULE_AWORD ) )+ otherlv_3= '...' ( (lv_ajoz_4_0= RULE_AWORD ) )+ )
            // InternalMatn.g:271:3: ( (lv_rakm_0_0= RULE_INT ) ) otherlv_1= '-' ( (lv_sadr_2_0= RULE_AWORD ) )+ otherlv_3= '...' ( (lv_ajoz_4_0= RULE_AWORD ) )+
            {
            // InternalMatn.g:271:3: ( (lv_rakm_0_0= RULE_INT ) )
            // InternalMatn.g:272:4: (lv_rakm_0_0= RULE_INT )
            {
            // InternalMatn.g:272:4: (lv_rakm_0_0= RULE_INT )
            // InternalMatn.g:273:5: lv_rakm_0_0= RULE_INT
            {
            lv_rakm_0_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBaytAccess().getHyphenMinusKeyword_1());
            		
            // InternalMatn.g:293:3: ( (lv_sadr_2_0= RULE_AWORD ) )+
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
            	    // InternalMatn.g:294:4: (lv_sadr_2_0= RULE_AWORD )
            	    {
            	    // InternalMatn.g:294:4: (lv_sadr_2_0= RULE_AWORD )
            	    // InternalMatn.g:295:5: lv_sadr_2_0= RULE_AWORD
            	    {
            	    lv_sadr_2_0=(Token)match(input,RULE_AWORD,FOLLOW_11); 

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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getBaytAccess().getFullStopFullStopFullStopKeyword_3());
            		
            // InternalMatn.g:315:3: ( (lv_ajoz_4_0= RULE_AWORD ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_AWORD) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMatn.g:316:4: (lv_ajoz_4_0= RULE_AWORD )
            	    {
            	    // InternalMatn.g:316:4: (lv_ajoz_4_0= RULE_AWORD )
            	    // InternalMatn.g:317:5: lv_ajoz_4_0= RULE_AWORD
            	    {
            	    lv_ajoz_4_0=(Token)match(input,RULE_AWORD,FOLLOW_12); 

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
    // $ANTLR end "ruleBayt"


    // $ANTLR start "entryRuleAWORDS"
    // InternalMatn.g:337:1: entryRuleAWORDS returns [String current=null] : iv_ruleAWORDS= ruleAWORDS EOF ;
    public final String entryRuleAWORDS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAWORDS = null;


        try {
            // InternalMatn.g:337:46: (iv_ruleAWORDS= ruleAWORDS EOF )
            // InternalMatn.g:338:2: iv_ruleAWORDS= ruleAWORDS EOF
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
    // InternalMatn.g:344:1: ruleAWORDS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AWORD_0= RULE_AWORD )+ ;
    public final AntlrDatatypeRuleToken ruleAWORDS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_AWORD_0=null;


        	enterRule();

        try {
            // InternalMatn.g:350:2: ( (this_AWORD_0= RULE_AWORD )+ )
            // InternalMatn.g:351:2: (this_AWORD_0= RULE_AWORD )+
            {
            // InternalMatn.g:351:2: (this_AWORD_0= RULE_AWORD )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_AWORD) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMatn.g:352:3: this_AWORD_0= RULE_AWORD
            	    {
            	    this_AWORD_0=(Token)match(input,RULE_AWORD,FOLLOW_12); 

            	    			current.merge(this_AWORD_0);
            	    		

            	    			newLeafNode(this_AWORD_0, grammarAccess.getAWORDSAccess().getAWORDTerminalRuleCall());
            	    		

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
    // InternalMatn.g:364:1: rulePerson[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )? ) ;
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
            // InternalMatn.g:370:2: ( ( ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )? ) )
            // InternalMatn.g:371:2: ( ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )? )
            {
            // InternalMatn.g:371:2: ( ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )? )
            // InternalMatn.g:372:3: ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )?
            {
            // InternalMatn.g:372:3: ( (lv_name_0_0= RULE_KALEMAH ) )
            // InternalMatn.g:373:4: (lv_name_0_0= RULE_KALEMAH )
            {
            // InternalMatn.g:373:4: (lv_name_0_0= RULE_KALEMAH )
            // InternalMatn.g:374:5: lv_name_0_0= RULE_KALEMAH
            {
            lv_name_0_0=(Token)match(input,RULE_KALEMAH,FOLLOW_13); 

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

            // InternalMatn.g:390:3: (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMatn.g:391:4: otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getPersonAccess().getArabicLetterAlefArabicLetterSeenArabicLetterMeemArabicLetterHehKeyword_1_0());
                    			
                    // InternalMatn.g:395:4: ( (lv_esm_2_0= RULE_KALEMAH ) )
                    // InternalMatn.g:396:5: (lv_esm_2_0= RULE_KALEMAH )
                    {
                    // InternalMatn.g:396:5: (lv_esm_2_0= RULE_KALEMAH )
                    // InternalMatn.g:397:6: lv_esm_2_0= RULE_KALEMAH
                    {
                    lv_esm_2_0=(Token)match(input,RULE_KALEMAH,FOLLOW_15); 

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

            // InternalMatn.g:414:3: (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMatn.g:415:4: otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getArabicLetterLamArabicLetterQafArabicLetterBehArabicLetterHehKeyword_2_0());
                    			
                    // InternalMatn.g:419:4: ( (lv_lakab_4_0= RULE_KALEMAH ) )
                    // InternalMatn.g:420:5: (lv_lakab_4_0= RULE_KALEMAH )
                    {
                    // InternalMatn.g:420:5: (lv_lakab_4_0= RULE_KALEMAH )
                    // InternalMatn.g:421:6: lv_lakab_4_0= RULE_KALEMAH
                    {
                    lv_lakab_4_0=(Token)match(input,RULE_KALEMAH,FOLLOW_16); 

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

            // InternalMatn.g:438:3: (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMatn.g:439:4: otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getPersonAccess().getArabicLetterTehArabicLetterWawArabicLetterFehArabicLetterYehKeyword_3_0());
                    			
                    // InternalMatn.g:443:4: ( (lv_towofia_6_0= RULE_INT ) )
                    // InternalMatn.g:444:5: (lv_towofia_6_0= RULE_INT )
                    {
                    // InternalMatn.g:444:5: (lv_towofia_6_0= RULE_INT )
                    // InternalMatn.g:445:6: lv_towofia_6_0= RULE_INT
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
    // InternalMatn.g:467:1: ruleDouaa[EObject in_current] returns [EObject current=in_current] : ( ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) ) otherlv_1= '\\u0627\\u0644\\u0644\\u0647' ) ;
    public final EObject ruleDouaa(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_d_0_1=null;
        Token lv_d_0_2=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMatn.g:473:2: ( ( ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) ) otherlv_1= '\\u0627\\u0644\\u0644\\u0647' ) )
            // InternalMatn.g:474:2: ( ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) ) otherlv_1= '\\u0627\\u0644\\u0644\\u0647' )
            {
            // InternalMatn.g:474:2: ( ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) ) otherlv_1= '\\u0627\\u0644\\u0644\\u0647' )
            // InternalMatn.g:475:3: ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) ) otherlv_1= '\\u0627\\u0644\\u0644\\u0647'
            {
            // InternalMatn.g:475:3: ( ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) ) )
            // InternalMatn.g:476:4: ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) )
            {
            // InternalMatn.g:476:4: ( (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' ) )
            // InternalMatn.g:477:5: (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' )
            {
            // InternalMatn.g:477:5: (lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647' | lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            else if ( (LA9_0==30) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMatn.g:478:6: lv_d_0_1= '\\u0631\\u062D\\u0645\\u0647'
                    {
                    lv_d_0_1=(Token)match(input,29,FOLLOW_17); 

                    						newLeafNode(lv_d_0_1, grammarAccess.getDouaaAccess().getDArabicLetterRehArabicLetterHahArabicLetterMeemArabicLetterHehKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDouaaRule());
                    						}
                    						setWithLastConsumed(current, "d", lv_d_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMatn.g:489:6: lv_d_0_2= '\\u0623\\u0643\\u0631\\u0645\\u0647'
                    {
                    lv_d_0_2=(Token)match(input,30,FOLLOW_17); 

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

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

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
    // InternalMatn.g:510:1: entryRuleIMAM returns [EObject current=null] : iv_ruleIMAM= ruleIMAM EOF ;
    public final EObject entryRuleIMAM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIMAM = null;


        try {
            // InternalMatn.g:510:45: (iv_ruleIMAM= ruleIMAM EOF )
            // InternalMatn.g:511:2: iv_ruleIMAM= ruleIMAM EOF
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
    // InternalMatn.g:517:1: ruleIMAM returns [EObject current=null] : (otherlv_0= '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' this_Person_1= rulePerson[$current] this_Douaa_2= ruleDouaa[$current] ) ;
    public final EObject ruleIMAM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Person_1 = null;

        EObject this_Douaa_2 = null;



        	enterRule();

        try {
            // InternalMatn.g:523:2: ( (otherlv_0= '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' this_Person_1= rulePerson[$current] this_Douaa_2= ruleDouaa[$current] ) )
            // InternalMatn.g:524:2: (otherlv_0= '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' this_Person_1= rulePerson[$current] this_Douaa_2= ruleDouaa[$current] )
            {
            // InternalMatn.g:524:2: (otherlv_0= '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' this_Person_1= rulePerson[$current] this_Douaa_2= ruleDouaa[$current] )
            // InternalMatn.g:525:3: otherlv_0= '\\u0627\\u0644\\u0625\\u0645\\u0627\\u0645' this_Person_1= rulePerson[$current] this_Douaa_2= ruleDouaa[$current]
            {
            otherlv_0=(Token)match(input,32,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getIMAMAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaBelowArabicLetterMeemArabicLetterAlefArabicLetterMeemKeyword_0());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getIMAMRule());
            			}
            			newCompositeNode(grammarAccess.getIMAMAccess().getPersonParserRuleCall_1());
            		
            pushFollow(FOLLOW_18);
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
    // InternalMatn.g:555:1: entryRuleQaree returns [EObject current=null] : iv_ruleQaree= ruleQaree EOF ;
    public final EObject entryRuleQaree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQaree = null;


        try {
            // InternalMatn.g:555:46: (iv_ruleQaree= ruleQaree EOF )
            // InternalMatn.g:556:2: iv_ruleQaree= ruleQaree EOF
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
    // InternalMatn.g:562:1: ruleQaree returns [EObject current=null] : (otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current] ) ;
    public final EObject ruleQaree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Person_1 = null;



        	enterRule();

        try {
            // InternalMatn.g:568:2: ( (otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current] ) )
            // InternalMatn.g:569:2: (otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current] )
            {
            // InternalMatn.g:569:2: (otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current] )
            // InternalMatn.g:570:3: otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current]
            {
            otherlv_0=(Token)match(input,33,FOLLOW_14); 

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
    // InternalMatn.g:589:1: entryRuleRawee returns [EObject current=null] : iv_ruleRawee= ruleRawee EOF ;
    public final EObject entryRuleRawee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRawee = null;


        try {
            // InternalMatn.g:589:46: (iv_ruleRawee= ruleRawee EOF )
            // InternalMatn.g:590:2: iv_ruleRawee= ruleRawee EOF
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
    // InternalMatn.g:596:1: ruleRawee returns [EObject current=null] : (otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) ) ;
    public final EObject ruleRawee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Person_1 = null;



        	enterRule();

        try {
            // InternalMatn.g:602:2: ( (otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) ) )
            // InternalMatn.g:603:2: (otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) )
            {
            // InternalMatn.g:603:2: (otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) )
            // InternalMatn.g:604:3: otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRaweeAccess().getArabicLetterRehArabicLetterAlefArabicLetterWawKeyword_0());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getRaweeRule());
            			}
            			newCompositeNode(grammarAccess.getRaweeAccess().getPersonParserRuleCall_1());
            		
            pushFollow(FOLLOW_19);
            this_Person_1=rulePerson(current);

            state._fsp--;


            			current = this_Person_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,35,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getRaweeAccess().getArabicLetterAinArabicLetterNoonKeyword_2());
            		
            // InternalMatn.g:623:3: ( (otherlv_3= RULE_KALEMAH ) )
            // InternalMatn.g:624:4: (otherlv_3= RULE_KALEMAH )
            {
            // InternalMatn.g:624:4: (otherlv_3= RULE_KALEMAH )
            // InternalMatn.g:625:5: otherlv_3= RULE_KALEMAH
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
    // InternalMatn.g:640:1: entryRuleYokraaLah returns [EObject current=null] : iv_ruleYokraaLah= ruleYokraaLah EOF ;
    public final EObject entryRuleYokraaLah() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYokraaLah = null;


        try {
            // InternalMatn.g:640:50: (iv_ruleYokraaLah= ruleYokraaLah EOF )
            // InternalMatn.g:641:2: iv_ruleYokraaLah= ruleYokraaLah EOF
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
    // InternalMatn.g:647:1: ruleYokraaLah returns [EObject current=null] : (this_Qaree_0= ruleQaree | this_Rawee_1= ruleRawee | this_Istelah_2= ruleIstelah ) ;
    public final EObject ruleYokraaLah() throws RecognitionException {
        EObject current = null;

        EObject this_Qaree_0 = null;

        EObject this_Rawee_1 = null;

        EObject this_Istelah_2 = null;



        	enterRule();

        try {
            // InternalMatn.g:653:2: ( (this_Qaree_0= ruleQaree | this_Rawee_1= ruleRawee | this_Istelah_2= ruleIstelah ) )
            // InternalMatn.g:654:2: (this_Qaree_0= ruleQaree | this_Rawee_1= ruleRawee | this_Istelah_2= ruleIstelah )
            {
            // InternalMatn.g:654:2: (this_Qaree_0= ruleQaree | this_Rawee_1= ruleRawee | this_Istelah_2= ruleIstelah )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt10=1;
                }
                break;
            case 34:
                {
                alt10=2;
                }
                break;
            case 43:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMatn.g:655:3: this_Qaree_0= ruleQaree
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
                    // InternalMatn.g:664:3: this_Rawee_1= ruleRawee
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
                    // InternalMatn.g:673:3: this_Istelah_2= ruleIstelah
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
    // InternalMatn.g:685:1: entryRuleTareek returns [EObject current=null] : iv_ruleTareek= ruleTareek EOF ;
    public final EObject entryRuleTareek() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTareek = null;


        try {
            // InternalMatn.g:685:47: (iv_ruleTareek= ruleTareek EOF )
            // InternalMatn.g:686:2: iv_ruleTareek= ruleTareek EOF
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
    // InternalMatn.g:692:1: ruleTareek returns [EObject current=null] : (otherlv_0= '\\u0637\\u0631\\u064A\\u0642' otherlv_1= '\\u062A\\u0644\\u0627\\u0648\\u0629' ( (lv_name_2_0= RULE_KALEMAH ) ) ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) ) ) ;
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
            // InternalMatn.g:698:2: ( (otherlv_0= '\\u0637\\u0631\\u064A\\u0642' otherlv_1= '\\u062A\\u0644\\u0627\\u0648\\u0629' ( (lv_name_2_0= RULE_KALEMAH ) ) ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) ) ) )
            // InternalMatn.g:699:2: (otherlv_0= '\\u0637\\u0631\\u064A\\u0642' otherlv_1= '\\u062A\\u0644\\u0627\\u0648\\u0629' ( (lv_name_2_0= RULE_KALEMAH ) ) ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) ) )
            {
            // InternalMatn.g:699:2: (otherlv_0= '\\u0637\\u0631\\u064A\\u0642' otherlv_1= '\\u062A\\u0644\\u0627\\u0648\\u0629' ( (lv_name_2_0= RULE_KALEMAH ) ) ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) ) )
            // InternalMatn.g:700:3: otherlv_0= '\\u0637\\u0631\\u064A\\u0642' otherlv_1= '\\u062A\\u0644\\u0627\\u0648\\u0629' ( (lv_name_2_0= RULE_KALEMAH ) ) ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getTareekAccess().getArabicLetterTahArabicLetterRehArabicLetterYehArabicLetterQafKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTareekAccess().getArabicLetterTehArabicLetterLamArabicLetterAlefArabicLetterWawArabicLetterTehMarbutaKeyword_1());
            		
            // InternalMatn.g:708:3: ( (lv_name_2_0= RULE_KALEMAH ) )
            // InternalMatn.g:709:4: (lv_name_2_0= RULE_KALEMAH )
            {
            // InternalMatn.g:709:4: (lv_name_2_0= RULE_KALEMAH )
            // InternalMatn.g:710:5: lv_name_2_0= RULE_KALEMAH
            {
            lv_name_2_0=(Token)match(input,RULE_KALEMAH,FOLLOW_21); 

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

            // InternalMatn.g:726:3: ( ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) ) | ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==38) ) {
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
                    // InternalMatn.g:727:4: ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) )
                    {
                    // InternalMatn.g:727:4: ( ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) ) )
                    // InternalMatn.g:728:5: ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) ) otherlv_4= '\\u0644' ( (otherlv_5= RULE_KALEMAH ) )
                    {
                    // InternalMatn.g:728:5: ( (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' ) )
                    // InternalMatn.g:729:6: (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' )
                    {
                    // InternalMatn.g:729:6: (lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635' )
                    // InternalMatn.g:730:7: lv_simple_3_0= '\\u062E\\u0627\\u0644\\u0635'
                    {
                    lv_simple_3_0=(Token)match(input,38,FOLLOW_22); 

                    							newLeafNode(lv_simple_3_0, grammarAccess.getTareekAccess().getSimpleArabicLetterKhahArabicLetterAlefArabicLetterLamArabicLetterSadKeyword_3_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTareekRule());
                    							}
                    							setWithLastConsumed(current, "simple", lv_simple_3_0 != null, "\u062E\u0627\u0644\u0635");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,39,FOLLOW_14); 

                    					newLeafNode(otherlv_4, grammarAccess.getTareekAccess().getArabicLetterLamKeyword_3_0_1());
                    				
                    // InternalMatn.g:746:5: ( (otherlv_5= RULE_KALEMAH ) )
                    // InternalMatn.g:747:6: (otherlv_5= RULE_KALEMAH )
                    {
                    // InternalMatn.g:747:6: (otherlv_5= RULE_KALEMAH )
                    // InternalMatn.g:748:7: otherlv_5= RULE_KALEMAH
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
                    // InternalMatn.g:761:4: ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ )
                    {
                    // InternalMatn.g:761:4: ( ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+ )
                    // InternalMatn.g:762:5: ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' ) ( (otherlv_8= RULE_KALEMAH ) )+
                    {
                    // InternalMatn.g:762:5: ( ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646' )
                    // InternalMatn.g:763:6: ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) ) otherlv_7= '\\u0645\\u0646'
                    {
                    // InternalMatn.g:763:6: ( (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' ) )
                    // InternalMatn.g:764:7: (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' )
                    {
                    // InternalMatn.g:764:7: (lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628' )
                    // InternalMatn.g:765:8: lv_complex_6_0= '\\u0645\\u0631\\u0643\\u0628'
                    {
                    lv_complex_6_0=(Token)match(input,40,FOLLOW_23); 

                    								newLeafNode(lv_complex_6_0, grammarAccess.getTareekAccess().getComplexArabicLetterMeemArabicLetterRehArabicLetterKafArabicLetterBehKeyword_3_1_0_0_0());
                    							

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getTareekRule());
                    								}
                    								setWithLastConsumed(current, "complex", lv_complex_6_0 != null, "\u0645\u0631\u0643\u0628");
                    							

                    }


                    }

                    otherlv_7=(Token)match(input,41,FOLLOW_14); 

                    						newLeafNode(otherlv_7, grammarAccess.getTareekAccess().getArabicLetterMeemArabicLetterNoonKeyword_3_1_0_1());
                    					

                    }

                    // InternalMatn.g:782:5: ( (otherlv_8= RULE_KALEMAH ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_KALEMAH) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMatn.g:783:6: (otherlv_8= RULE_KALEMAH )
                    	    {
                    	    // InternalMatn.g:783:6: (otherlv_8= RULE_KALEMAH )
                    	    // InternalMatn.g:784:7: otherlv_8= RULE_KALEMAH
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTareekRule());
                    	    							}
                    	    						
                    	    otherlv_8=(Token)match(input,RULE_KALEMAH,FOLLOW_24); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getTareekAccess().getRefsTareekCrossReference_3_1_1_0());
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
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
    // InternalMatn.g:801:1: entryRuleKayd returns [EObject current=null] : iv_ruleKayd= ruleKayd EOF ;
    public final EObject entryRuleKayd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKayd = null;


        try {
            // InternalMatn.g:801:45: (iv_ruleKayd= ruleKayd EOF )
            // InternalMatn.g:802:2: iv_ruleKayd= ruleKayd EOF
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
    // InternalMatn.g:808:1: ruleKayd returns [EObject current=null] : (otherlv_0= '\\u0642\\u064A\\u062F' ( (lv_name_1_0= RULE_KALEMAH ) ) ) ;
    public final EObject ruleKayd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMatn.g:814:2: ( (otherlv_0= '\\u0642\\u064A\\u062F' ( (lv_name_1_0= RULE_KALEMAH ) ) ) )
            // InternalMatn.g:815:2: (otherlv_0= '\\u0642\\u064A\\u062F' ( (lv_name_1_0= RULE_KALEMAH ) ) )
            {
            // InternalMatn.g:815:2: (otherlv_0= '\\u0642\\u064A\\u062F' ( (lv_name_1_0= RULE_KALEMAH ) ) )
            // InternalMatn.g:816:3: otherlv_0= '\\u0642\\u064A\\u062F' ( (lv_name_1_0= RULE_KALEMAH ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getKaydAccess().getArabicLetterQafArabicLetterYehArabicLetterDalKeyword_0());
            		
            // InternalMatn.g:820:3: ( (lv_name_1_0= RULE_KALEMAH ) )
            // InternalMatn.g:821:4: (lv_name_1_0= RULE_KALEMAH )
            {
            // InternalMatn.g:821:4: (lv_name_1_0= RULE_KALEMAH )
            // InternalMatn.g:822:5: lv_name_1_0= RULE_KALEMAH
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
    // InternalMatn.g:842:1: entryRuleIstelah returns [EObject current=null] : iv_ruleIstelah= ruleIstelah EOF ;
    public final EObject entryRuleIstelah() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIstelah = null;


        try {
            // InternalMatn.g:842:48: (iv_ruleIstelah= ruleIstelah EOF )
            // InternalMatn.g:843:2: iv_ruleIstelah= ruleIstelah EOF
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
    // InternalMatn.g:849:1: ruleIstelah returns [EObject current=null] : (otherlv_0= '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* ) ;
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
            // InternalMatn.g:855:2: ( (otherlv_0= '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* ) )
            // InternalMatn.g:856:2: (otherlv_0= '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* )
            {
            // InternalMatn.g:856:2: (otherlv_0= '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* )
            // InternalMatn.g:857:3: otherlv_0= '\\u0627\\u0635\\u0637\\u0644\\u0627\\u062D' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )*
            {
            otherlv_0=(Token)match(input,43,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getIstelahAccess().getArabicLetterAlefArabicLetterSadArabicLetterTahArabicLetterLamArabicLetterAlefArabicLetterHahKeyword_0());
            		
            // InternalMatn.g:861:3: ( (lv_name_1_0= RULE_KALEMAH ) )
            // InternalMatn.g:862:4: (lv_name_1_0= RULE_KALEMAH )
            {
            // InternalMatn.g:862:4: (lv_name_1_0= RULE_KALEMAH )
            // InternalMatn.g:863:5: lv_name_1_0= RULE_KALEMAH
            {
            lv_name_1_0=(Token)match(input,RULE_KALEMAH,FOLLOW_25); 

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

            otherlv_2=(Token)match(input,44,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getIstelahAccess().getArabicLetterYehArabicLetterAinArabicLetterNoonArabicLetterYehKeyword_2());
            		
            // InternalMatn.g:883:3: ( (otherlv_3= RULE_KALEMAH ) )
            // InternalMatn.g:884:4: (otherlv_3= RULE_KALEMAH )
            {
            // InternalMatn.g:884:4: (otherlv_3= RULE_KALEMAH )
            // InternalMatn.g:885:5: otherlv_3= RULE_KALEMAH
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIstelahRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_KALEMAH,FOLLOW_26); 

            					newLeafNode(otherlv_3, grammarAccess.getIstelahAccess().getRefsYokraaLahCrossReference_3_0());
            				

            }


            }

            // InternalMatn.g:896:3: (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==45) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMatn.g:897:4: otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) )
            	    {
            	    otherlv_4=(Token)match(input,45,FOLLOW_14); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIstelahAccess().getArabicLetterWawKeyword_4_0());
            	    			
            	    // InternalMatn.g:901:4: ( (otherlv_5= RULE_KALEMAH ) )
            	    // InternalMatn.g:902:5: (otherlv_5= RULE_KALEMAH )
            	    {
            	    // InternalMatn.g:902:5: (otherlv_5= RULE_KALEMAH )
            	    // InternalMatn.g:903:6: otherlv_5= RULE_KALEMAH
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIstelahRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_KALEMAH,FOLLOW_26); 

            	    						newLeafNode(otherlv_5, grammarAccess.getIstelahAccess().getRefsYokraaLahCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMatn.g:919:1: entryRuleRamz returns [EObject current=null] : iv_ruleRamz= ruleRamz EOF ;
    public final EObject entryRuleRamz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRamz = null;


        try {
            // InternalMatn.g:919:45: (iv_ruleRamz= ruleRamz EOF )
            // InternalMatn.g:920:2: iv_ruleRamz= ruleRamz EOF
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
    // InternalMatn.g:926:1: ruleRamz returns [EObject current=null] : (otherlv_0= '\\u0631\\u0645\\u0632' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* ) ;
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
            // InternalMatn.g:932:2: ( (otherlv_0= '\\u0631\\u0645\\u0632' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* ) )
            // InternalMatn.g:933:2: (otherlv_0= '\\u0631\\u0645\\u0632' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* )
            {
            // InternalMatn.g:933:2: (otherlv_0= '\\u0631\\u0645\\u0632' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )* )
            // InternalMatn.g:934:3: otherlv_0= '\\u0631\\u0645\\u0632' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u064A\\u0639\\u0646\\u064A' ( (otherlv_3= RULE_KALEMAH ) ) (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )*
            {
            otherlv_0=(Token)match(input,46,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRamzAccess().getArabicLetterRehArabicLetterMeemArabicLetterZainKeyword_0());
            		
            // InternalMatn.g:938:3: ( (lv_name_1_0= RULE_KALEMAH ) )
            // InternalMatn.g:939:4: (lv_name_1_0= RULE_KALEMAH )
            {
            // InternalMatn.g:939:4: (lv_name_1_0= RULE_KALEMAH )
            // InternalMatn.g:940:5: lv_name_1_0= RULE_KALEMAH
            {
            lv_name_1_0=(Token)match(input,RULE_KALEMAH,FOLLOW_25); 

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

            otherlv_2=(Token)match(input,44,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getRamzAccess().getArabicLetterYehArabicLetterAinArabicLetterNoonArabicLetterYehKeyword_2());
            		
            // InternalMatn.g:960:3: ( (otherlv_3= RULE_KALEMAH ) )
            // InternalMatn.g:961:4: (otherlv_3= RULE_KALEMAH )
            {
            // InternalMatn.g:961:4: (otherlv_3= RULE_KALEMAH )
            // InternalMatn.g:962:5: otherlv_3= RULE_KALEMAH
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRamzRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_KALEMAH,FOLLOW_26); 

            					newLeafNode(otherlv_3, grammarAccess.getRamzAccess().getRefsYokraaLahCrossReference_3_0());
            				

            }


            }

            // InternalMatn.g:973:3: (otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==45) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMatn.g:974:4: otherlv_4= '\\u0648' ( (otherlv_5= RULE_KALEMAH ) )
            	    {
            	    otherlv_4=(Token)match(input,45,FOLLOW_14); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRamzAccess().getArabicLetterWawKeyword_4_0());
            	    			
            	    // InternalMatn.g:978:4: ( (otherlv_5= RULE_KALEMAH ) )
            	    // InternalMatn.g:979:5: (otherlv_5= RULE_KALEMAH )
            	    {
            	    // InternalMatn.g:979:5: (otherlv_5= RULE_KALEMAH )
            	    // InternalMatn.g:980:6: otherlv_5= RULE_KALEMAH
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRamzRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_KALEMAH,FOLLOW_26); 

            	    						newLeafNode(otherlv_5, grammarAccess.getRamzAccess().getRefsYokraaLahCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMatn.g:996:1: entryRuleMawdee returns [String current=null] : iv_ruleMawdee= ruleMawdee EOF ;
    public final String entryRuleMawdee() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMawdee = null;


        try {
            // InternalMatn.g:996:46: (iv_ruleMawdee= ruleMawdee EOF )
            // InternalMatn.g:997:2: iv_ruleMawdee= ruleMawdee EOF
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
    // InternalMatn.g:1003:1: ruleMawdee returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\u0627\\u0644\\u0623\\u0648\\u0644' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' | kw= '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' ) ;
    public final AntlrDatatypeRuleToken ruleMawdee() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMatn.g:1009:2: ( (kw= '\\u0627\\u0644\\u0623\\u0648\\u0644' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' | kw= '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' ) )
            // InternalMatn.g:1010:2: (kw= '\\u0627\\u0644\\u0623\\u0648\\u0644' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' | kw= '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' )
            {
            // InternalMatn.g:1010:2: (kw= '\\u0627\\u0644\\u0623\\u0648\\u0644' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A' | kw= '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B' | kw= '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt15=1;
                }
                break;
            case 48:
                {
                alt15=2;
                }
                break;
            case 49:
                {
                alt15=3;
                }
                break;
            case 50:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMatn.g:1011:3: kw= '\\u0627\\u0644\\u0623\\u0648\\u0644'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithHamzaAboveArabicLetterWawArabicLetterLamKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMatn.g:1017:3: kw= '\\u0627\\u0644\\u062B\\u0627\\u0646\\u064A'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterNoonArabicLetterYehKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMatn.g:1023:3: kw= '\\u0627\\u0644\\u062B\\u0627\\u0644\\u062B'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMawdeeAccess().getArabicLetterAlefArabicLetterLamArabicLetterThehArabicLetterAlefArabicLetterLamArabicLetterThehKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMatn.g:1029:3: kw= '\\u0627\\u0644\\u0623\\u062E\\u064A\\u0631'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

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
    // InternalMatn.g:1038:1: entryRuleHarf returns [EObject current=null] : iv_ruleHarf= ruleHarf EOF ;
    public final EObject entryRuleHarf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHarf = null;


        try {
            // InternalMatn.g:1038:45: (iv_ruleHarf= ruleHarf EOF )
            // InternalMatn.g:1039:2: iv_ruleHarf= ruleHarf EOF
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
    // InternalMatn.g:1045:1: ruleHarf returns [EObject current=null] : (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) ) ;
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
            // InternalMatn.g:1051:2: ( (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) ) )
            // InternalMatn.g:1052:2: (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) )
            {
            // InternalMatn.g:1052:2: (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) )
            // InternalMatn.g:1053:3: otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHarfAccess().getArabicLetterHahArabicLetterRehArabicLetterFehKeyword_0());
            		
            // InternalMatn.g:1057:3: ( (lv_name_1_0= RULE_AWORD ) )
            // InternalMatn.g:1058:4: (lv_name_1_0= RULE_AWORD )
            {
            // InternalMatn.g:1058:4: (lv_name_1_0= RULE_AWORD )
            // InternalMatn.g:1059:5: lv_name_1_0= RULE_AWORD
            {
            lv_name_1_0=(Token)match(input,RULE_AWORD,FOLLOW_27); 

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

            // InternalMatn.g:1075:3: ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            else if ( (LA17_0==54) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMatn.g:1076:4: (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* )
                    {
                    // InternalMatn.g:1076:4: (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* )
                    // InternalMatn.g:1077:5: otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )*
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getHarfAccess().getArabicLetterHehArabicLetterWawKeyword_2_0_0());
                    				
                    // InternalMatn.g:1081:5: ( (lv_values_3_0= RULE_AWORD ) )
                    // InternalMatn.g:1082:6: (lv_values_3_0= RULE_AWORD )
                    {
                    // InternalMatn.g:1082:6: (lv_values_3_0= RULE_AWORD )
                    // InternalMatn.g:1083:7: lv_values_3_0= RULE_AWORD
                    {
                    lv_values_3_0=(Token)match(input,RULE_AWORD,FOLLOW_28); 

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

                    // InternalMatn.g:1099:5: (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==53) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMatn.g:1100:6: otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) )
                    	    {
                    	    otherlv_4=(Token)match(input,53,FOLLOW_3); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getHarfAccess().getArabicLetterAlefWithHamzaAboveArabicLetterWawKeyword_2_0_2_0());
                    	    					
                    	    // InternalMatn.g:1104:6: ( (lv_values_5_0= RULE_AWORD ) )
                    	    // InternalMatn.g:1105:7: (lv_values_5_0= RULE_AWORD )
                    	    {
                    	    // InternalMatn.g:1105:7: (lv_values_5_0= RULE_AWORD )
                    	    // InternalMatn.g:1106:8: lv_values_5_0= RULE_AWORD
                    	    {
                    	    lv_values_5_0=(Token)match(input,RULE_AWORD,FOLLOW_28); 

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
                    	    break loop16;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalMatn.g:1125:4: (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) )
                    {
                    // InternalMatn.g:1125:4: (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) )
                    // InternalMatn.g:1126:5: otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) )
                    {
                    otherlv_6=(Token)match(input,54,FOLLOW_3); 

                    					newLeafNode(otherlv_6, grammarAccess.getHarfAccess().getArabicLetterThalArabicLetterAlefArabicLetterTehArabicLetterHehKeyword_2_1_0());
                    				
                    // InternalMatn.g:1130:5: ( (otherlv_7= RULE_AWORD ) )
                    // InternalMatn.g:1131:6: (otherlv_7= RULE_AWORD )
                    {
                    // InternalMatn.g:1131:6: (otherlv_7= RULE_AWORD )
                    // InternalMatn.g:1132:7: otherlv_7= RULE_AWORD
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
    // InternalMatn.g:1149:1: entryRuleHarakah returns [EObject current=null] : iv_ruleHarakah= ruleHarakah EOF ;
    public final EObject entryRuleHarakah() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHarakah = null;


        try {
            // InternalMatn.g:1149:48: (iv_ruleHarakah= ruleHarakah EOF )
            // InternalMatn.g:1150:2: iv_ruleHarakah= ruleHarakah EOF
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
    // InternalMatn.g:1156:1: ruleHarakah returns [EObject current=null] : (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AWORD ) ) ) ;
    public final EObject ruleHarakah() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalMatn.g:1162:2: ( (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AWORD ) ) ) )
            // InternalMatn.g:1163:2: (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AWORD ) ) )
            {
            // InternalMatn.g:1163:2: (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AWORD ) ) )
            // InternalMatn.g:1164:3: otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AWORD ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getHarakahAccess().getArabicLetterHahArabicLetterRehArabicLetterKafArabicLetterTehMarbutaKeyword_0());
            		
            // InternalMatn.g:1168:3: ( (lv_name_1_0= RULE_KALEMAH ) )
            // InternalMatn.g:1169:4: (lv_name_1_0= RULE_KALEMAH )
            {
            // InternalMatn.g:1169:4: (lv_name_1_0= RULE_KALEMAH )
            // InternalMatn.g:1170:5: lv_name_1_0= RULE_KALEMAH
            {
            lv_name_1_0=(Token)match(input,RULE_KALEMAH,FOLLOW_29); 

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

            otherlv_2=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getHarakahAccess().getArabicLetterHehArabicLetterYehKeyword_2());
            		
            // InternalMatn.g:1190:3: ( (lv_value_3_0= RULE_AWORD ) )
            // InternalMatn.g:1191:4: (lv_value_3_0= RULE_AWORD )
            {
            // InternalMatn.g:1191:4: (lv_value_3_0= RULE_AWORD )
            // InternalMatn.g:1192:5: lv_value_3_0= RULE_AWORD
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
    // InternalMatn.g:1212:1: entryRuleAyahStart returns [EObject current=null] : iv_ruleAyahStart= ruleAyahStart EOF ;
    public final EObject entryRuleAyahStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAyahStart = null;


        try {
            // InternalMatn.g:1212:50: (iv_ruleAyahStart= ruleAyahStart EOF )
            // InternalMatn.g:1213:2: iv_ruleAyahStart= ruleAyahStart EOF
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
    // InternalMatn.g:1219:1: ruleAyahStart returns [EObject current=null] : (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) ) ;
    public final EObject ruleAyahStart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_surah_1_0=null;
        Token otherlv_2=null;
        Token lv_ayah_3_0=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalMatn.g:1225:2: ( (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) ) )
            // InternalMatn.g:1226:2: (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) )
            {
            // InternalMatn.g:1226:2: (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) )
            // InternalMatn.g:1227:3: otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterSeenArabicLetterWawArabicLetterRehArabicLetterTehMarbutaKeyword_0());
            		
            // InternalMatn.g:1231:3: ( (lv_surah_1_0= RULE_INT ) )
            // InternalMatn.g:1232:4: (lv_surah_1_0= RULE_INT )
            {
            // InternalMatn.g:1232:4: (lv_surah_1_0= RULE_INT )
            // InternalMatn.g:1233:5: lv_surah_1_0= RULE_INT
            {
            lv_surah_1_0=(Token)match(input,RULE_INT,FOLLOW_30); 

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

            otherlv_2=(Token)match(input,58,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithMaddaAboveArabicLetterYehArabicLetterTehMarbutaKeyword_2());
            		
            // InternalMatn.g:1253:3: ( (lv_ayah_3_0= RULE_INT ) )
            // InternalMatn.g:1254:4: (lv_ayah_3_0= RULE_INT )
            {
            // InternalMatn.g:1254:4: (lv_ayah_3_0= RULE_INT )
            // InternalMatn.g:1255:5: lv_ayah_3_0= RULE_INT
            {
            lv_ayah_3_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

            // InternalMatn.g:1271:3: ( (lv_name_4_0= RULE_KALEMAH ) )
            // InternalMatn.g:1272:4: (lv_name_4_0= RULE_KALEMAH )
            {
            // InternalMatn.g:1272:4: (lv_name_4_0= RULE_KALEMAH )
            // InternalMatn.g:1273:5: lv_name_4_0= RULE_KALEMAH
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
    // InternalMatn.g:1293:1: entryRulePhrase returns [EObject current=null] : iv_rulePhrase= rulePhrase EOF ;
    public final EObject entryRulePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhrase = null;


        try {
            // InternalMatn.g:1293:47: (iv_rulePhrase= rulePhrase EOF )
            // InternalMatn.g:1294:2: iv_rulePhrase= rulePhrase EOF
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
    // InternalMatn.g:1300:1: rulePhrase returns [EObject current=null] : ( ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+ ) ;
    public final EObject rulePhrase() throws RecognitionException {
        EObject current = null;

        Token lv_basmalah_0_0=null;
        Token lv_words_1_0=null;


        	enterRule();

        try {
            // InternalMatn.g:1306:2: ( ( ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+ ) )
            // InternalMatn.g:1307:2: ( ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+ )
            {
            // InternalMatn.g:1307:2: ( ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+ )
            // InternalMatn.g:1308:3: ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+
            {
            // InternalMatn.g:1308:3: ( (lv_basmalah_0_0= RULE_BASMALAH ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_BASMALAH) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMatn.g:1309:4: (lv_basmalah_0_0= RULE_BASMALAH )
                    {
                    // InternalMatn.g:1309:4: (lv_basmalah_0_0= RULE_BASMALAH )
                    // InternalMatn.g:1310:5: lv_basmalah_0_0= RULE_BASMALAH
                    {
                    lv_basmalah_0_0=(Token)match(input,RULE_BASMALAH,FOLLOW_3); 

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

            // InternalMatn.g:1326:3: ( (lv_words_1_0= RULE_AWORD ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_AWORD) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMatn.g:1327:4: (lv_words_1_0= RULE_AWORD )
            	    {
            	    // InternalMatn.g:1327:4: (lv_words_1_0= RULE_AWORD )
            	    // InternalMatn.g:1328:5: lv_words_1_0= RULE_AWORD
            	    {
            	    lv_words_1_0=(Token)match(input,RULE_AWORD,FOLLOW_12); 

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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0400000000000000L});

}