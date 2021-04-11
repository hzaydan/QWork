/*
 * generated by Xtext 2.25.0
 */
package org.qwork.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class QAyahStartGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class AyahStartModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.qwork.QAyahStart.AyahStartModel");
		private final Assignment cAyatAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cAyatAyahStartParserRuleCall_0 = (RuleCall)cAyatAssignment.eContents().get(0);
		
		//AyahStartModel:
		//    ayat+=AyahStart+
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ayat+=AyahStart+
		public Assignment getAyatAssignment() { return cAyatAssignment; }
		
		//AyahStart
		public RuleCall getAyatAyahStartParserRuleCall_0() { return cAyatAyahStartParserRuleCall_0; }
	}
	public class AyahStartElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.qwork.QAyahStart.AyahStart");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cArabicLetterAlefArabicLetterLamArabicLetterSeenArabicLetterWawArabicLetterRehArabicLetterTehMarbutaKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSurahAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSurahINTTerminalRuleCall_1_0 = (RuleCall)cSurahAssignment_1.eContents().get(0);
		private final Keyword cArabicLetterAlefArabicLetterLamArabicLetterAlefWithMaddaAboveArabicLetterYehArabicLetterTehMarbutaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAyahAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAyahINTTerminalRuleCall_3_0 = (RuleCall)cAyahAssignment_3.eContents().get(0);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameKALEMAHTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		
		//AyahStart:
		//    'السورة' surah=INT 'الآية' ayah=INT name=KALEMAH
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'السورة' surah=INT 'الآية' ayah=INT name=KALEMAH
		public Group getGroup() { return cGroup; }
		
		//'السورة'
		public Keyword getArabicLetterAlefArabicLetterLamArabicLetterSeenArabicLetterWawArabicLetterRehArabicLetterTehMarbutaKeyword_0() { return cArabicLetterAlefArabicLetterLamArabicLetterSeenArabicLetterWawArabicLetterRehArabicLetterTehMarbutaKeyword_0; }
		
		//surah=INT
		public Assignment getSurahAssignment_1() { return cSurahAssignment_1; }
		
		//INT
		public RuleCall getSurahINTTerminalRuleCall_1_0() { return cSurahINTTerminalRuleCall_1_0; }
		
		//'الآية'
		public Keyword getArabicLetterAlefArabicLetterLamArabicLetterAlefWithMaddaAboveArabicLetterYehArabicLetterTehMarbutaKeyword_2() { return cArabicLetterAlefArabicLetterLamArabicLetterAlefWithMaddaAboveArabicLetterYehArabicLetterTehMarbutaKeyword_2; }
		
		//ayah=INT
		public Assignment getAyahAssignment_3() { return cAyahAssignment_3; }
		
		//INT
		public RuleCall getAyahINTTerminalRuleCall_3_0() { return cAyahINTTerminalRuleCall_3_0; }
		
		//name=KALEMAH
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//KALEMAH
		public RuleCall getNameKALEMAHTerminalRuleCall_4_0() { return cNameKALEMAHTerminalRuleCall_4_0; }
	}
	
	
	private final AyahStartModelElements pAyahStartModel;
	private final AyahStartElements pAyahStart;
	
	private final Grammar grammar;
	
	private final ArabicGrammarAccess gaArabic;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public QAyahStartGrammarAccess(GrammarProvider grammarProvider,
			ArabicGrammarAccess gaArabic,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaArabic = gaArabic;
		this.gaTerminals = gaTerminals;
		this.pAyahStartModel = new AyahStartModelElements();
		this.pAyahStart = new AyahStartElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.qwork.QAyahStart".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public ArabicGrammarAccess getArabicGrammarAccess() {
		return gaArabic;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//AyahStartModel:
	//    ayat+=AyahStart+
	//;
	public AyahStartModelElements getAyahStartModelAccess() {
		return pAyahStartModel;
	}
	
	public ParserRule getAyahStartModelRule() {
		return getAyahStartModelAccess().getRule();
	}
	
	//AyahStart:
	//    'السورة' surah=INT 'الآية' ayah=INT name=KALEMAH
	//;
	public AyahStartElements getAyahStartAccess() {
		return pAyahStart;
	}
	
	public ParserRule getAyahStartRule() {
		return getAyahStartAccess().getRule();
	}
	
	//Model:
	//    phrases+=Phrase+;
	public ArabicGrammarAccess.ModelElements getModelAccess() {
		return gaArabic.getModelAccess();
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Phrase:
	//    basmalah?=BASMALAH? words+=AWORD+;
	public ArabicGrammarAccess.PhraseElements getPhraseAccess() {
		return gaArabic.getPhraseAccess();
	}
	
	public ParserRule getPhraseRule() {
		return getPhraseAccess().getRule();
	}
	
	//terminal BASMALAH:
	//    'بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ'
	//;
	public TerminalRule getBASMALAHRule() {
		return gaArabic.getBASMALAHRule();
	}
	
	//terminal AWORD:
	//    (ALETTER|AHARAKAH|ATANWEEN|ASHADDAH)+
	//;
	public TerminalRule getAWORDRule() {
		return gaArabic.getAWORDRule();
	}
	
	//terminal fragment ALIGATURES:
	//    '\uFDF0' ..'\uFDFD'
	//;
	public TerminalRule getALIGATURESRule() {
		return gaArabic.getALIGATURESRule();
	}
	
	//terminal fragment ALETTER:
	//    '\u0621' ..'\u064a'
	//;
	public TerminalRule getALETTERRule() {
		return gaArabic.getALETTERRule();
	}
	
	//terminal fragment ADIGIT:
	//    '\u0660' .. '\u0669'
	//;
	public TerminalRule getADIGITRule() {
		return gaArabic.getADIGITRule();
	}
	
	//terminal fragment ATANWEEN:
	//    '\u064b' .. '\u064d'
	//;
	public TerminalRule getATANWEENRule() {
		return gaArabic.getATANWEENRule();
	}
	
	//terminal fragment AHARAKAH:
	//    '\u064e' .. '\u0650' | '\u0652'
	//;
	public TerminalRule getAHARAKAHRule() {
		return gaArabic.getAHARAKAHRule();
	}
	
	//terminal fragment ASHADDAH:
	//    '\u0651'
	//;
	public TerminalRule getASHADDAHRule() {
		return gaArabic.getASHADDAHRule();
	}
	
	//terminal fragment ANONLETTER:
	//    ('\u0600' .. '\u0620') | ('\u064b' .. '\u06ff')
	//;
	public TerminalRule getANONLETTERRule() {
		return gaArabic.getANONLETTERRule();
	}
	
	//terminal KALEMAH:
	//    '"' -> '"'
	//;
	public TerminalRule getKALEMAHRule() {
		return gaArabic.getKALEMAHRule();
	}
	
	//@Override
	//terminal SL_COMMENT:
	//    'deactivated';
	public TerminalRule getSL_COMMENTRule() {
		return gaArabic.getSL_COMMENTRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
