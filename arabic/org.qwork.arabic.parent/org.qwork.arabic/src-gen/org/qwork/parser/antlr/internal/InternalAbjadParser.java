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
import org.qwork.services.AbjadGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAbjadParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_AWORD", "RULE_KALEMAH", "RULE_INT", "RULE_BASMALAH", "RULE_ALETTER", "RULE_AHARAKAH", "RULE_ATANWEEN", "RULE_ASHADDAH", "RULE_ALIGATURES", "RULE_ADIGIT", "RULE_ANONLETTER", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\u062D\\u0631\\u0641'", "'\\u0647\\u0648'", "'\\u0623\\u0648'", "'\\u0630\\u0627\\u062A\\u0647'", "'\\u062D\\u0631\\u0643\\u0629'", "'\\u0647\\u064A'", "'\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629'", "'\\u0627\\u0644\\u0622\\u064A\\u0629'"
    };
    public static final int RULE_BASMALAH=7;
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int RULE_AWORD=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAbjadParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAbjadParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAbjadParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAbjad.g"; }



     	private AbjadGrammarAccess grammarAccess;

        public InternalAbjadParser(TokenStream input, AbjadGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AbjadModel";
       	}

       	@Override
       	protected AbjadGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAbjadModel"
    // InternalAbjad.g:64:1: entryRuleAbjadModel returns [EObject current=null] : iv_ruleAbjadModel= ruleAbjadModel EOF ;
    public final EObject entryRuleAbjadModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbjadModel = null;


        try {
            // InternalAbjad.g:64:51: (iv_ruleAbjadModel= ruleAbjadModel EOF )
            // InternalAbjad.g:65:2: iv_ruleAbjadModel= ruleAbjadModel EOF
            {
             newCompositeNode(grammarAccess.getAbjadModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbjadModel=ruleAbjadModel();

            state._fsp--;

             current =iv_ruleAbjadModel; 
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
    // $ANTLR end "entryRuleAbjadModel"


    // $ANTLR start "ruleAbjadModel"
    // InternalAbjad.g:71:1: ruleAbjadModel returns [EObject current=null] : ( ( (lv_hourouf_0_0= ruleHarf ) ) | ( (lv_harakat_1_0= ruleHarakah ) ) )* ;
    public final EObject ruleAbjadModel() throws RecognitionException {
        EObject current = null;

        EObject lv_hourouf_0_0 = null;

        EObject lv_harakat_1_0 = null;



        	enterRule();

        try {
            // InternalAbjad.g:77:2: ( ( ( (lv_hourouf_0_0= ruleHarf ) ) | ( (lv_harakat_1_0= ruleHarakah ) ) )* )
            // InternalAbjad.g:78:2: ( ( (lv_hourouf_0_0= ruleHarf ) ) | ( (lv_harakat_1_0= ruleHarakah ) ) )*
            {
            // InternalAbjad.g:78:2: ( ( (lv_hourouf_0_0= ruleHarf ) ) | ( (lv_harakat_1_0= ruleHarakah ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }
                else if ( (LA1_0==25) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAbjad.g:79:3: ( (lv_hourouf_0_0= ruleHarf ) )
            	    {
            	    // InternalAbjad.g:79:3: ( (lv_hourouf_0_0= ruleHarf ) )
            	    // InternalAbjad.g:80:4: (lv_hourouf_0_0= ruleHarf )
            	    {
            	    // InternalAbjad.g:80:4: (lv_hourouf_0_0= ruleHarf )
            	    // InternalAbjad.g:81:5: lv_hourouf_0_0= ruleHarf
            	    {

            	    					newCompositeNode(grammarAccess.getAbjadModelAccess().getHouroufHarfParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_hourouf_0_0=ruleHarf();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbjadModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"hourouf",
            	    						lv_hourouf_0_0,
            	    						"org.qwork.Abjad.Harf");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAbjad.g:99:3: ( (lv_harakat_1_0= ruleHarakah ) )
            	    {
            	    // InternalAbjad.g:99:3: ( (lv_harakat_1_0= ruleHarakah ) )
            	    // InternalAbjad.g:100:4: (lv_harakat_1_0= ruleHarakah )
            	    {
            	    // InternalAbjad.g:100:4: (lv_harakat_1_0= ruleHarakah )
            	    // InternalAbjad.g:101:5: lv_harakat_1_0= ruleHarakah
            	    {

            	    					newCompositeNode(grammarAccess.getAbjadModelAccess().getHarakatHarakahParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_harakat_1_0=ruleHarakah();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbjadModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"harakat",
            	    						lv_harakat_1_0,
            	    						"org.qwork.Abjad.Harakah");
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
    // $ANTLR end "ruleAbjadModel"


    // $ANTLR start "entryRuleHarf"
    // InternalAbjad.g:122:1: entryRuleHarf returns [EObject current=null] : iv_ruleHarf= ruleHarf EOF ;
    public final EObject entryRuleHarf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHarf = null;


        try {
            // InternalAbjad.g:122:45: (iv_ruleHarf= ruleHarf EOF )
            // InternalAbjad.g:123:2: iv_ruleHarf= ruleHarf EOF
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
    // InternalAbjad.g:129:1: ruleHarf returns [EObject current=null] : (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) ) ;
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
            // InternalAbjad.g:135:2: ( (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) ) )
            // InternalAbjad.g:136:2: (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) )
            {
            // InternalAbjad.g:136:2: (otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) ) )
            // InternalAbjad.g:137:3: otherlv_0= '\\u062D\\u0631\\u0641' ( (lv_name_1_0= RULE_AWORD ) ) ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHarfAccess().getArabicLetterHahArabicLetterRehArabicLetterFehKeyword_0());
            		
            // InternalAbjad.g:141:3: ( (lv_name_1_0= RULE_AWORD ) )
            // InternalAbjad.g:142:4: (lv_name_1_0= RULE_AWORD )
            {
            // InternalAbjad.g:142:4: (lv_name_1_0= RULE_AWORD )
            // InternalAbjad.g:143:5: lv_name_1_0= RULE_AWORD
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

            // InternalAbjad.g:159:3: ( (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* ) | (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAbjad.g:160:4: (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* )
                    {
                    // InternalAbjad.g:160:4: (otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )* )
                    // InternalAbjad.g:161:5: otherlv_2= '\\u0647\\u0648' ( (lv_values_3_0= RULE_AWORD ) ) (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )*
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_4); 

                    					newLeafNode(otherlv_2, grammarAccess.getHarfAccess().getArabicLetterHehArabicLetterWawKeyword_2_0_0());
                    				
                    // InternalAbjad.g:165:5: ( (lv_values_3_0= RULE_AWORD ) )
                    // InternalAbjad.g:166:6: (lv_values_3_0= RULE_AWORD )
                    {
                    // InternalAbjad.g:166:6: (lv_values_3_0= RULE_AWORD )
                    // InternalAbjad.g:167:7: lv_values_3_0= RULE_AWORD
                    {
                    lv_values_3_0=(Token)match(input,RULE_AWORD,FOLLOW_6); 

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

                    // InternalAbjad.g:183:5: (otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==23) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalAbjad.g:184:6: otherlv_4= '\\u0623\\u0648' ( (lv_values_5_0= RULE_AWORD ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_4); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getHarfAccess().getArabicLetterAlefWithHamzaAboveArabicLetterWawKeyword_2_0_2_0());
                    	    					
                    	    // InternalAbjad.g:188:6: ( (lv_values_5_0= RULE_AWORD ) )
                    	    // InternalAbjad.g:189:7: (lv_values_5_0= RULE_AWORD )
                    	    {
                    	    // InternalAbjad.g:189:7: (lv_values_5_0= RULE_AWORD )
                    	    // InternalAbjad.g:190:8: lv_values_5_0= RULE_AWORD
                    	    {
                    	    lv_values_5_0=(Token)match(input,RULE_AWORD,FOLLOW_6); 

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
                    	    break loop2;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalAbjad.g:209:4: (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) )
                    {
                    // InternalAbjad.g:209:4: (otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) ) )
                    // InternalAbjad.g:210:5: otherlv_6= '\\u0630\\u0627\\u062A\\u0647' ( (otherlv_7= RULE_AWORD ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_4); 

                    					newLeafNode(otherlv_6, grammarAccess.getHarfAccess().getArabicLetterThalArabicLetterAlefArabicLetterTehArabicLetterHehKeyword_2_1_0());
                    				
                    // InternalAbjad.g:214:5: ( (otherlv_7= RULE_AWORD ) )
                    // InternalAbjad.g:215:6: (otherlv_7= RULE_AWORD )
                    {
                    // InternalAbjad.g:215:6: (otherlv_7= RULE_AWORD )
                    // InternalAbjad.g:216:7: otherlv_7= RULE_AWORD
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
    // InternalAbjad.g:233:1: entryRuleHarakah returns [EObject current=null] : iv_ruleHarakah= ruleHarakah EOF ;
    public final EObject entryRuleHarakah() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHarakah = null;


        try {
            // InternalAbjad.g:233:48: (iv_ruleHarakah= ruleHarakah EOF )
            // InternalAbjad.g:234:2: iv_ruleHarakah= ruleHarakah EOF
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
    // InternalAbjad.g:240:1: ruleHarakah returns [EObject current=null] : (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AWORD ) ) ) ;
    public final EObject ruleHarakah() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalAbjad.g:246:2: ( (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AWORD ) ) ) )
            // InternalAbjad.g:247:2: (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AWORD ) ) )
            {
            // InternalAbjad.g:247:2: (otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AWORD ) ) )
            // InternalAbjad.g:248:3: otherlv_0= '\\u062D\\u0631\\u0643\\u0629' ( (lv_name_1_0= RULE_KALEMAH ) ) otherlv_2= '\\u0647\\u064A' ( (lv_value_3_0= RULE_AWORD ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getHarakahAccess().getArabicLetterHahArabicLetterRehArabicLetterKafArabicLetterTehMarbutaKeyword_0());
            		
            // InternalAbjad.g:252:3: ( (lv_name_1_0= RULE_KALEMAH ) )
            // InternalAbjad.g:253:4: (lv_name_1_0= RULE_KALEMAH )
            {
            // InternalAbjad.g:253:4: (lv_name_1_0= RULE_KALEMAH )
            // InternalAbjad.g:254:5: lv_name_1_0= RULE_KALEMAH
            {
            lv_name_1_0=(Token)match(input,RULE_KALEMAH,FOLLOW_8); 

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

            otherlv_2=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getHarakahAccess().getArabicLetterHehArabicLetterYehKeyword_2());
            		
            // InternalAbjad.g:274:3: ( (lv_value_3_0= RULE_AWORD ) )
            // InternalAbjad.g:275:4: (lv_value_3_0= RULE_AWORD )
            {
            // InternalAbjad.g:275:4: (lv_value_3_0= RULE_AWORD )
            // InternalAbjad.g:276:5: lv_value_3_0= RULE_AWORD
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
    // InternalAbjad.g:296:1: entryRuleAyahStart returns [EObject current=null] : iv_ruleAyahStart= ruleAyahStart EOF ;
    public final EObject entryRuleAyahStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAyahStart = null;


        try {
            // InternalAbjad.g:296:50: (iv_ruleAyahStart= ruleAyahStart EOF )
            // InternalAbjad.g:297:2: iv_ruleAyahStart= ruleAyahStart EOF
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
    // InternalAbjad.g:303:1: ruleAyahStart returns [EObject current=null] : (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) ) ;
    public final EObject ruleAyahStart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_surah_1_0=null;
        Token otherlv_2=null;
        Token lv_ayah_3_0=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalAbjad.g:309:2: ( (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) ) )
            // InternalAbjad.g:310:2: (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) )
            {
            // InternalAbjad.g:310:2: (otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) ) )
            // InternalAbjad.g:311:3: otherlv_0= '\\u0627\\u0644\\u0633\\u0648\\u0631\\u0629' ( (lv_surah_1_0= RULE_INT ) ) otherlv_2= '\\u0627\\u0644\\u0622\\u064A\\u0629' ( (lv_ayah_3_0= RULE_INT ) ) ( (lv_name_4_0= RULE_KALEMAH ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterSeenArabicLetterWawArabicLetterRehArabicLetterTehMarbutaKeyword_0());
            		
            // InternalAbjad.g:315:3: ( (lv_surah_1_0= RULE_INT ) )
            // InternalAbjad.g:316:4: (lv_surah_1_0= RULE_INT )
            {
            // InternalAbjad.g:316:4: (lv_surah_1_0= RULE_INT )
            // InternalAbjad.g:317:5: lv_surah_1_0= RULE_INT
            {
            lv_surah_1_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithMaddaAboveArabicLetterYehArabicLetterTehMarbutaKeyword_2());
            		
            // InternalAbjad.g:337:3: ( (lv_ayah_3_0= RULE_INT ) )
            // InternalAbjad.g:338:4: (lv_ayah_3_0= RULE_INT )
            {
            // InternalAbjad.g:338:4: (lv_ayah_3_0= RULE_INT )
            // InternalAbjad.g:339:5: lv_ayah_3_0= RULE_INT
            {
            lv_ayah_3_0=(Token)match(input,RULE_INT,FOLLOW_7); 

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

            // InternalAbjad.g:355:3: ( (lv_name_4_0= RULE_KALEMAH ) )
            // InternalAbjad.g:356:4: (lv_name_4_0= RULE_KALEMAH )
            {
            // InternalAbjad.g:356:4: (lv_name_4_0= RULE_KALEMAH )
            // InternalAbjad.g:357:5: lv_name_4_0= RULE_KALEMAH
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
    // InternalAbjad.g:377:1: entryRulePhrase returns [EObject current=null] : iv_rulePhrase= rulePhrase EOF ;
    public final EObject entryRulePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhrase = null;


        try {
            // InternalAbjad.g:377:47: (iv_rulePhrase= rulePhrase EOF )
            // InternalAbjad.g:378:2: iv_rulePhrase= rulePhrase EOF
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
    // InternalAbjad.g:384:1: rulePhrase returns [EObject current=null] : ( ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+ ) ;
    public final EObject rulePhrase() throws RecognitionException {
        EObject current = null;

        Token lv_basmalah_0_0=null;
        Token lv_words_1_0=null;


        	enterRule();

        try {
            // InternalAbjad.g:390:2: ( ( ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+ ) )
            // InternalAbjad.g:391:2: ( ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+ )
            {
            // InternalAbjad.g:391:2: ( ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+ )
            // InternalAbjad.g:392:3: ( (lv_basmalah_0_0= RULE_BASMALAH ) )? ( (lv_words_1_0= RULE_AWORD ) )+
            {
            // InternalAbjad.g:392:3: ( (lv_basmalah_0_0= RULE_BASMALAH ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_BASMALAH) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAbjad.g:393:4: (lv_basmalah_0_0= RULE_BASMALAH )
                    {
                    // InternalAbjad.g:393:4: (lv_basmalah_0_0= RULE_BASMALAH )
                    // InternalAbjad.g:394:5: lv_basmalah_0_0= RULE_BASMALAH
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

            // InternalAbjad.g:410:3: ( (lv_words_1_0= RULE_AWORD ) )+
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
            	    // InternalAbjad.g:411:4: (lv_words_1_0= RULE_AWORD )
            	    {
            	    // InternalAbjad.g:411:4: (lv_words_1_0= RULE_AWORD )
            	    // InternalAbjad.g:412:5: lv_words_1_0= RULE_AWORD
            	    {
            	    lv_words_1_0=(Token)match(input,RULE_AWORD,FOLLOW_11); 

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
    // $ANTLR end "rulePhrase"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});

}