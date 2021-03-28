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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_AWORD", "RULE_ALETTER", "RULE_KALEMAH", "RULE_AHARAKAH", "RULE_ADIGITS", "RULE_WS", "RULE_ADIGIT", "RULE_ASHADDAH", "RULE_ANONLETTER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'\\u062D\\u0631\\u0641'", "'\\u0647\\u0648'", "'\\u0623\\u0648'", "'\\u0630\\u0627\\u062A\\u0647'", "'\\u062D\\u0631\\u0643\\u0629'", "'\\u0647\\u064A'", "'\\u0642\\u0627\\u0631\\u0626'", "'\\u0631\\u0627\\u0648'", "'\\u0639\\u0646'", "'\\u0627\\u0633\\u0645\\u0647'", "'\\u0644\\u0642\\u0628\\u0647'", "'\\u062A\\u0648\\u0641\\u064A'", "'\\u0637\\u0631\\u064A\\u0642'", "'\\u0645\\u0646'"
    };
    public static final int RULE_AHARAKAH=7;
    public static final int RULE_STRING=15;
    public static final int RULE_ANONLETTER=12;
    public static final int RULE_SL_COMMENT=17;
    public static final int T__19=19;
    public static final int RULE_KALEMAH=6;
    public static final int RULE_ASHADDAH=11;
    public static final int RULE_ALETTER=5;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=13;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_ADIGITS=8;
    public static final int RULE_ADIGIT=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=14;
    public static final int T__29=29;
    public static final int RULE_AWORD=4;
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
    // InternalQiraa.g:71:1: ruleQiraaModel returns [EObject current=null] : ( ( (lv_hourouf_0_0= ruleHarf ) ) | ( (lv_qoraa_1_0= ruleQaree ) ) | ( (lv_torok_2_0= ruleTareek ) ) | ( (lv_harakat_3_0= ruleHarakah ) ) | ( (lv_rowat_4_0= ruleRawee ) ) )* ;
    public final EObject ruleQiraaModel() throws RecognitionException {
        EObject current = null;

        EObject lv_hourouf_0_0 = null;

        EObject lv_qoraa_1_0 = null;

        EObject lv_torok_2_0 = null;

        EObject lv_harakat_3_0 = null;

        EObject lv_rowat_4_0 = null;



        	enterRule();

        try {
            // InternalQiraa.g:77:2: ( ( ( (lv_hourouf_0_0= ruleHarf ) ) | ( (lv_qoraa_1_0= ruleQaree ) ) | ( (lv_torok_2_0= ruleTareek ) ) | ( (lv_harakat_3_0= ruleHarakah ) ) | ( (lv_rowat_4_0= ruleRawee ) ) )* )
            // InternalQiraa.g:78:2: ( ( (lv_hourouf_0_0= ruleHarf ) ) | ( (lv_qoraa_1_0= ruleQaree ) ) | ( (lv_torok_2_0= ruleTareek ) ) | ( (lv_harakat_3_0= ruleHarakah ) ) | ( (lv_rowat_4_0= ruleRawee ) ) )*
            {
            // InternalQiraa.g:78:2: ( ( (lv_hourouf_0_0= ruleHarf ) ) | ( (lv_qoraa_1_0= ruleQaree ) ) | ( (lv_torok_2_0= ruleTareek ) ) | ( (lv_harakat_3_0= ruleHarakah ) ) | ( (lv_rowat_4_0= ruleRawee ) ) )*
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    alt1=1;
                    }
                    break;
                case 25:
                    {
                    alt1=2;
                    }
                    break;
                case 31:
                    {
                    alt1=3;
                    }
                    break;
                case 23:
                    {
                    alt1=4;
                    }
                    break;
                case 26:
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalQiraa.g:79:3: ( (lv_hourouf_0_0= ruleHarf ) )
            	    {
            	    // InternalQiraa.g:79:3: ( (lv_hourouf_0_0= ruleHarf ) )
            	    // InternalQiraa.g:80:4: (lv_hourouf_0_0= ruleHarf )
            	    {
            	    // InternalQiraa.g:80:4: (lv_hourouf_0_0= ruleHarf )
            	    // InternalQiraa.g:81:5: lv_hourouf_0_0= ruleHarf
            	    {

            	    					newCompositeNode(grammarAccess.getQiraaModelAccess().getHouroufHarfParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_hourouf_0_0=ruleHarf();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQiraaModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"hourouf",
            	    						lv_hourouf_0_0,
            	    						"org.qwork.Qiraa.Harf");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalQiraa.g:99:3: ( (lv_qoraa_1_0= ruleQaree ) )
            	    {
            	    // InternalQiraa.g:99:3: ( (lv_qoraa_1_0= ruleQaree ) )
            	    // InternalQiraa.g:100:4: (lv_qoraa_1_0= ruleQaree )
            	    {
            	    // InternalQiraa.g:100:4: (lv_qoraa_1_0= ruleQaree )
            	    // InternalQiraa.g:101:5: lv_qoraa_1_0= ruleQaree
            	    {

            	    					newCompositeNode(grammarAccess.getQiraaModelAccess().getQoraaQareeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_qoraa_1_0=ruleQaree();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQiraaModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"qoraa",
            	    						lv_qoraa_1_0,
            	    						"org.qwork.Qiraa.Qaree");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalQiraa.g:119:3: ( (lv_torok_2_0= ruleTareek ) )
            	    {
            	    // InternalQiraa.g:119:3: ( (lv_torok_2_0= ruleTareek ) )
            	    // InternalQiraa.g:120:4: (lv_torok_2_0= ruleTareek )
            	    {
            	    // InternalQiraa.g:120:4: (lv_torok_2_0= ruleTareek )
            	    // InternalQiraa.g:121:5: lv_torok_2_0= ruleTareek
            	    {

            	    					newCompositeNode(grammarAccess.getQiraaModelAccess().getTorokTareekParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_torok_2_0=ruleTareek();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQiraaModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"torok",
            	    						lv_torok_2_0,
            	    						"org.qwork.Qiraa.Tareek");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalQiraa.g:139:3: ( (lv_harakat_3_0= ruleHarakah ) )
            	    {
            	    // InternalQiraa.g:139:3: ( (lv_harakat_3_0= ruleHarakah ) )
            	    // InternalQiraa.g:140:4: (lv_harakat_3_0= ruleHarakah )
            	    {
            	    // InternalQiraa.g:140:4: (lv_harakat_3_0= ruleHarakah )
            	    // InternalQiraa.g:141:5: lv_harakat_3_0= ruleHarakah
            	    {

            	    					newCompositeNode(grammarAccess.getQiraaModelAccess().getHarakatHarakahParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_harakat_3_0=ruleHarakah();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQiraaModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"harakat",
            	    						lv_harakat_3_0,
            	    						"org.qwork.Qiraa.Harakah");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalQiraa.g:159:3: ( (lv_rowat_4_0= ruleRawee ) )
            	    {
            	    // InternalQiraa.g:159:3: ( (lv_rowat_4_0= ruleRawee ) )
            	    // InternalQiraa.g:160:4: (lv_rowat_4_0= ruleRawee )
            	    {
            	    // InternalQiraa.g:160:4: (lv_rowat_4_0= ruleRawee )
            	    // InternalQiraa.g:161:5: lv_rowat_4_0= ruleRawee
            	    {

            	    					newCompositeNode(grammarAccess.getQiraaModelAccess().getRowatRaweeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_rowat_4_0=ruleRawee();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQiraaModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rowat",
            	    						lv_rowat_4_0,
            	    						"org.qwork.Qiraa.Rawee");
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


    // $ANTLR start "entryRuleHarf"
    // InternalQiraa.g:182:1: entryRuleHarf returns [EObject current=null] : iv_ruleHarf= ruleHarf EOF ;
    public final EObject entryRuleHarf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHarf = null;


        try {
            // InternalQiraa.g:182:45: (iv_ruleHarf= ruleHarf EOF )
            // InternalQiraa.g:183:2: iv_ruleHarf= ruleHarf EOF
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
    // InternalQiraa.g:189:1: ruleHarf returns [EObject current=null] : (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_ALETTER ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) ) ;
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
            // InternalQiraa.g:195:2: ( (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_ALETTER ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) ) )
            // InternalQiraa.g:196:2: (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_ALETTER ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) )
            {
            // InternalQiraa.g:196:2: (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_ALETTER ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) )
            // InternalQiraa.g:197:3: otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_ALETTER ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHarfAccess().getArabicLetterHahArabicLetterRehArabicLetterFehKeyword_0());
            		
            // InternalQiraa.g:201:3: ( (lv_name_1_0= RULE_AWORD ) )
            // InternalQiraa.g:202:4: (lv_name_1_0= RULE_AWORD )
            {
            // InternalQiraa.g:202:4: (lv_name_1_0= RULE_AWORD )
            // InternalQiraa.g:203:5: lv_name_1_0= RULE_AWORD
            {
            lv_name_1_0=(Token)match(input,RULE_AWORD,FOLLOW_5); 

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

            // InternalQiraa.g:219:3: ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_ALETTER ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) )
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
                    // InternalQiraa.g:220:4: (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_ALETTER ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) ) )* )
                    {
                    // InternalQiraa.g:220:4: (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_ALETTER ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) ) )* )
                    // InternalQiraa.g:221:5: otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_ALETTER ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getHarfAccess().getArabicLetterHehArabicLetterWawKeyword_2_0_0());
                    				
                    // InternalQiraa.g:225:5: ( (lv_values_3_0= RULE_ALETTER ) )
                    // InternalQiraa.g:226:6: (lv_values_3_0= RULE_ALETTER )
                    {
                    // InternalQiraa.g:226:6: (lv_values_3_0= RULE_ALETTER )
                    // InternalQiraa.g:227:7: lv_values_3_0= RULE_ALETTER
                    {
                    lv_values_3_0=(Token)match(input,RULE_ALETTER,FOLLOW_7); 

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

                    // InternalQiraa.g:243:5: (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==21) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalQiraa.g:244:6: otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_ALETTER ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_6); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getHarfAccess().getArabicLetterAlefWithHamzaAboveArabicLetterWawKeyword_2_0_2_0());
                    	    					
                    	    // InternalQiraa.g:248:6: ( (lv_values_5_0= RULE_ALETTER ) )
                    	    // InternalQiraa.g:249:7: (lv_values_5_0= RULE_ALETTER )
                    	    {
                    	    // InternalQiraa.g:249:7: (lv_values_5_0= RULE_ALETTER )
                    	    // InternalQiraa.g:250:8: lv_values_5_0= RULE_ALETTER
                    	    {
                    	    lv_values_5_0=(Token)match(input,RULE_ALETTER,FOLLOW_7); 

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
                    	    break loop2;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalQiraa.g:269:4: (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) )
                    {
                    // InternalQiraa.g:269:4: (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) )
                    // InternalQiraa.g:270:5: otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_4); 

                    					newLeafNode(otherlv_6, grammarAccess.getHarfAccess().getArabicLetterThalArabicLetterAlefArabicLetterTehArabicLetterHehKeyword_2_1_0());
                    				
                    // InternalQiraa.g:274:5: ( (otherlv_7= RULE_AWORD ) )
                    // InternalQiraa.g:275:6: (otherlv_7= RULE_AWORD )
                    {
                    // InternalQiraa.g:275:6: (otherlv_7= RULE_AWORD )
                    // InternalQiraa.g:276:7: otherlv_7= RULE_AWORD
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
    // InternalQiraa.g:293:1: entryRuleHarakah returns [EObject current=null] : iv_ruleHarakah= ruleHarakah EOF ;
    public final EObject entryRuleHarakah() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHarakah = null;


        try {
            // InternalQiraa.g:293:48: (iv_ruleHarakah= ruleHarakah EOF )
            // InternalQiraa.g:294:2: iv_ruleHarakah= ruleHarakah EOF
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
    // InternalQiraa.g:300:1: ruleHarakah returns [EObject current=null] : (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AHARAKAH ) ) ) ;
    public final EObject ruleHarakah() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalQiraa.g:306:2: ( (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AHARAKAH ) ) ) )
            // InternalQiraa.g:307:2: (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AHARAKAH ) ) )
            {
            // InternalQiraa.g:307:2: (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AHARAKAH ) ) )
            // InternalQiraa.g:308:3: otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AHARAKAH ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getHarakahAccess().getArabicLetterHahArabicLetterRehArabicLetterKafArabicLetterTehMarbutaKeyword_0());
            		
            // InternalQiraa.g:312:3: ( (lv_name_1_0= RULE_KALEMAH ) )
            // InternalQiraa.g:313:4: (lv_name_1_0= RULE_KALEMAH )
            {
            // InternalQiraa.g:313:4: (lv_name_1_0= RULE_KALEMAH )
            // InternalQiraa.g:314:5: lv_name_1_0= RULE_KALEMAH
            {
            lv_name_1_0=(Token)match(input,RULE_KALEMAH,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getHarakahAccess().getArabicLetterHehArabicLetterYehKeyword_2());
            		
            // InternalQiraa.g:334:3: ( (lv_value_3_0= RULE_AHARAKAH ) )
            // InternalQiraa.g:335:4: (lv_value_3_0= RULE_AHARAKAH )
            {
            // InternalQiraa.g:335:4: (lv_value_3_0= RULE_AHARAKAH )
            // InternalQiraa.g:336:5: lv_value_3_0= RULE_AHARAKAH
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


    // $ANTLR start "entryRuleQaree"
    // InternalQiraa.g:356:1: entryRuleQaree returns [EObject current=null] : iv_ruleQaree= ruleQaree EOF ;
    public final EObject entryRuleQaree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQaree = null;


        try {
            // InternalQiraa.g:356:46: (iv_ruleQaree= ruleQaree EOF )
            // InternalQiraa.g:357:2: iv_ruleQaree= ruleQaree EOF
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
    // InternalQiraa.g:363:1: ruleQaree returns [EObject current=null] : (otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current] ) ;
    public final EObject ruleQaree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Person_1 = null;



        	enterRule();

        try {
            // InternalQiraa.g:369:2: ( (otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current] ) )
            // InternalQiraa.g:370:2: (otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current] )
            {
            // InternalQiraa.g:370:2: (otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current] )
            // InternalQiraa.g:371:3: otherlv_0= '\\u0642\\u0627\\u0631\\u0626' this_Person_1= rulePerson[$current]
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

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
    // InternalQiraa.g:390:1: entryRuleRawee returns [EObject current=null] : iv_ruleRawee= ruleRawee EOF ;
    public final EObject entryRuleRawee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRawee = null;


        try {
            // InternalQiraa.g:390:46: (iv_ruleRawee= ruleRawee EOF )
            // InternalQiraa.g:391:2: iv_ruleRawee= ruleRawee EOF
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
    // InternalQiraa.g:397:1: ruleRawee returns [EObject current=null] : (otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) ) ;
    public final EObject ruleRawee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Person_1 = null;



        	enterRule();

        try {
            // InternalQiraa.g:403:2: ( (otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) ) )
            // InternalQiraa.g:404:2: (otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) )
            {
            // InternalQiraa.g:404:2: (otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) )
            // InternalQiraa.g:405:3: otherlv_0= '\\u0631\\u0627\\u0648' this_Person_1= rulePerson[$current] otherlv_2= '\\u0639\\u0646' ( (otherlv_3= RULE_KALEMAH ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

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
            		
            otherlv_2=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRaweeAccess().getArabicLetterAinArabicLetterNoonKeyword_2());
            		
            // InternalQiraa.g:424:3: ( (otherlv_3= RULE_KALEMAH ) )
            // InternalQiraa.g:425:4: (otherlv_3= RULE_KALEMAH )
            {
            // InternalQiraa.g:425:4: (otherlv_3= RULE_KALEMAH )
            // InternalQiraa.g:426:5: otherlv_3= RULE_KALEMAH
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


    // $ANTLR start "rulePerson"
    // InternalQiraa.g:442:1: rulePerson[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_ADIGITS ) ) )? ) ;
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
            // InternalQiraa.g:448:2: ( ( ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_ADIGITS ) ) )? ) )
            // InternalQiraa.g:449:2: ( ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_ADIGITS ) ) )? )
            {
            // InternalQiraa.g:449:2: ( ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_ADIGITS ) ) )? )
            // InternalQiraa.g:450:3: ( (lv_name_0_0= RULE_KALEMAH ) ) (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )? (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )? (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_ADIGITS ) ) )?
            {
            // InternalQiraa.g:450:3: ( (lv_name_0_0= RULE_KALEMAH ) )
            // InternalQiraa.g:451:4: (lv_name_0_0= RULE_KALEMAH )
            {
            // InternalQiraa.g:451:4: (lv_name_0_0= RULE_KALEMAH )
            // InternalQiraa.g:452:5: lv_name_0_0= RULE_KALEMAH
            {
            lv_name_0_0=(Token)match(input,RULE_KALEMAH,FOLLOW_12); 

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

            // InternalQiraa.g:468:3: (otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalQiraa.g:469:4: otherlv_1= '\\u0627\\u0633\\u0645\\u0647' ( (lv_esm_2_0= RULE_KALEMAH ) )
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getPersonAccess().getArabicLetterAlefArabicLetterSeenArabicLetterMeemArabicLetterHehKeyword_1_0());
                    			
                    // InternalQiraa.g:473:4: ( (lv_esm_2_0= RULE_KALEMAH ) )
                    // InternalQiraa.g:474:5: (lv_esm_2_0= RULE_KALEMAH )
                    {
                    // InternalQiraa.g:474:5: (lv_esm_2_0= RULE_KALEMAH )
                    // InternalQiraa.g:475:6: lv_esm_2_0= RULE_KALEMAH
                    {
                    lv_esm_2_0=(Token)match(input,RULE_KALEMAH,FOLLOW_13); 

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

            // InternalQiraa.g:492:3: (otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQiraa.g:493:4: otherlv_3= '\\u0644\\u0642\\u0628\\u0647' ( (lv_lakab_4_0= RULE_KALEMAH ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getArabicLetterLamArabicLetterQafArabicLetterBehArabicLetterHehKeyword_2_0());
                    			
                    // InternalQiraa.g:497:4: ( (lv_lakab_4_0= RULE_KALEMAH ) )
                    // InternalQiraa.g:498:5: (lv_lakab_4_0= RULE_KALEMAH )
                    {
                    // InternalQiraa.g:498:5: (lv_lakab_4_0= RULE_KALEMAH )
                    // InternalQiraa.g:499:6: lv_lakab_4_0= RULE_KALEMAH
                    {
                    lv_lakab_4_0=(Token)match(input,RULE_KALEMAH,FOLLOW_14); 

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

            // InternalQiraa.g:516:3: (otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_ADIGITS ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalQiraa.g:517:4: otherlv_5= '\\u062A\\u0648\\u0641\\u064A' ( (lv_towofia_6_0= RULE_ADIGITS ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getPersonAccess().getArabicLetterTehArabicLetterWawArabicLetterFehArabicLetterYehKeyword_3_0());
                    			
                    // InternalQiraa.g:521:4: ( (lv_towofia_6_0= RULE_ADIGITS ) )
                    // InternalQiraa.g:522:5: (lv_towofia_6_0= RULE_ADIGITS )
                    {
                    // InternalQiraa.g:522:5: (lv_towofia_6_0= RULE_ADIGITS )
                    // InternalQiraa.g:523:6: lv_towofia_6_0= RULE_ADIGITS
                    {
                    lv_towofia_6_0=(Token)match(input,RULE_ADIGITS,FOLLOW_2); 

                    						newLeafNode(lv_towofia_6_0, grammarAccess.getPersonAccess().getTowofiaADIGITSTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersonRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"towofia",
                    							lv_towofia_6_0,
                    							"org.qwork.Arabic.ADIGITS");
                    					

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


    // $ANTLR start "entryRuleTareek"
    // InternalQiraa.g:544:1: entryRuleTareek returns [EObject current=null] : iv_ruleTareek= ruleTareek EOF ;
    public final EObject entryRuleTareek() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTareek = null;


        try {
            // InternalQiraa.g:544:47: (iv_ruleTareek= ruleTareek EOF )
            // InternalQiraa.g:545:2: iv_ruleTareek= ruleTareek EOF
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
    // InternalQiraa.g:551:1: ruleTareek returns [EObject current=null] : (otherlv_0= '\\u0637\\u0631\\u064A\\u0642' ( (lv_name_1_0= RULE_KALEMAH ) ) (otherlv_2= '\\u0645\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) )? ) ;
    public final EObject ruleTareek() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalQiraa.g:557:2: ( (otherlv_0= '\\u0637\\u0631\\u064A\\u0642' ( (lv_name_1_0= RULE_KALEMAH ) ) (otherlv_2= '\\u0645\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) )? ) )
            // InternalQiraa.g:558:2: (otherlv_0= '\\u0637\\u0631\\u064A\\u0642' ( (lv_name_1_0= RULE_KALEMAH ) ) (otherlv_2= '\\u0645\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) )? )
            {
            // InternalQiraa.g:558:2: (otherlv_0= '\\u0637\\u0631\\u064A\\u0642' ( (lv_name_1_0= RULE_KALEMAH ) ) (otherlv_2= '\\u0645\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) )? )
            // InternalQiraa.g:559:3: otherlv_0= '\\u0637\\u0631\\u064A\\u0642' ( (lv_name_1_0= RULE_KALEMAH ) ) (otherlv_2= '\\u0645\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTareekAccess().getArabicLetterTahArabicLetterRehArabicLetterYehArabicLetterQafKeyword_0());
            		
            // InternalQiraa.g:563:3: ( (lv_name_1_0= RULE_KALEMAH ) )
            // InternalQiraa.g:564:4: (lv_name_1_0= RULE_KALEMAH )
            {
            // InternalQiraa.g:564:4: (lv_name_1_0= RULE_KALEMAH )
            // InternalQiraa.g:565:5: lv_name_1_0= RULE_KALEMAH
            {
            lv_name_1_0=(Token)match(input,RULE_KALEMAH,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTareekAccess().getNameKALEMAHTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTareekRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.qwork.Arabic.KALEMAH");
            				

            }


            }

            // InternalQiraa.g:581:3: (otherlv_2= '\\u0645\\u0646' ( (otherlv_3= RULE_KALEMAH ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalQiraa.g:582:4: otherlv_2= '\\u0645\\u0646' ( (otherlv_3= RULE_KALEMAH ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getTareekAccess().getArabicLetterMeemArabicLetterNoonKeyword_2_0());
                    			
                    // InternalQiraa.g:586:4: ( (otherlv_3= RULE_KALEMAH ) )
                    // InternalQiraa.g:587:5: (otherlv_3= RULE_KALEMAH )
                    {
                    // InternalQiraa.g:587:5: (otherlv_3= RULE_KALEMAH )
                    // InternalQiraa.g:588:6: otherlv_3= RULE_KALEMAH
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTareekRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_KALEMAH,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getTareekAccess().getRefTareekCrossReference_2_1_0());
                    					

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
    // $ANTLR end "ruleTareek"


    // $ANTLR start "entryRulePhrase"
    // InternalQiraa.g:604:1: entryRulePhrase returns [EObject current=null] : iv_rulePhrase= rulePhrase EOF ;
    public final EObject entryRulePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhrase = null;


        try {
            // InternalQiraa.g:604:47: (iv_rulePhrase= rulePhrase EOF )
            // InternalQiraa.g:605:2: iv_rulePhrase= rulePhrase EOF
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
    // InternalQiraa.g:611:1: rulePhrase returns [EObject current=null] : ( ( (lv_words_0_0= RULE_AWORD ) ) (this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) ) )* ) ;
    public final EObject rulePhrase() throws RecognitionException {
        EObject current = null;

        Token lv_words_0_0=null;
        Token this_WS_1=null;
        Token lv_words_2_0=null;


        	enterRule();

        try {
            // InternalQiraa.g:617:2: ( ( ( (lv_words_0_0= RULE_AWORD ) ) (this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) ) )* ) )
            // InternalQiraa.g:618:2: ( ( (lv_words_0_0= RULE_AWORD ) ) (this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) ) )* )
            {
            // InternalQiraa.g:618:2: ( ( (lv_words_0_0= RULE_AWORD ) ) (this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) ) )* )
            // InternalQiraa.g:619:3: ( (lv_words_0_0= RULE_AWORD ) ) (this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) ) )*
            {
            // InternalQiraa.g:619:3: ( (lv_words_0_0= RULE_AWORD ) )
            // InternalQiraa.g:620:4: (lv_words_0_0= RULE_AWORD )
            {
            // InternalQiraa.g:620:4: (lv_words_0_0= RULE_AWORD )
            // InternalQiraa.g:621:5: lv_words_0_0= RULE_AWORD
            {
            lv_words_0_0=(Token)match(input,RULE_AWORD,FOLLOW_17); 

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

            // InternalQiraa.g:637:3: (this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_WS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalQiraa.g:638:4: this_WS_1= RULE_WS ( (lv_words_2_0= RULE_AWORD ) )
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_4); 

            	    				newLeafNode(this_WS_1, grammarAccess.getPhraseAccess().getWSTerminalRuleCall_1_0());
            	    			
            	    // InternalQiraa.g:642:4: ( (lv_words_2_0= RULE_AWORD ) )
            	    // InternalQiraa.g:643:5: (lv_words_2_0= RULE_AWORD )
            	    {
            	    // InternalQiraa.g:643:5: (lv_words_2_0= RULE_AWORD )
            	    // InternalQiraa.g:644:6: lv_words_2_0= RULE_AWORD
            	    {
            	    lv_words_2_0=(Token)match(input,RULE_AWORD,FOLLOW_17); 

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
            	    break loop8;
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000086880002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000202L});

}