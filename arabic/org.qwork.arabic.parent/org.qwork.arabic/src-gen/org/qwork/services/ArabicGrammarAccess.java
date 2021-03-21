/*
 * generated by Xtext 2.24.0
 */
package org.qwork.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ArabicGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.qwork.Arabic.Model");
		private final Assignment cPhrasesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cPhrasesPhraseParserRuleCall_0 = (RuleCall)cPhrasesAssignment.eContents().get(0);
		
		//Model:
		//	phrases+=Phrase+;
		@Override public ParserRule getRule() { return rule; }
		
		//phrases+=Phrase+
		public Assignment getPhrasesAssignment() { return cPhrasesAssignment; }
		
		//Phrase
		public RuleCall getPhrasesPhraseParserRuleCall_0() { return cPhrasesPhraseParserRuleCall_0; }
	}
	public class PhraseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.qwork.Arabic.Phrase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cWordsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cWordsATEXTTerminalRuleCall_0_0 = (RuleCall)cWordsAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cWSTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Assignment cWordsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cWordsATEXTTerminalRuleCall_1_1_0 = (RuleCall)cWordsAssignment_1_1.eContents().get(0);
		
		//Phrase:
		//	words+=ATEXT (WS words+=ATEXT)*;
		@Override public ParserRule getRule() { return rule; }
		
		//words+=ATEXT (WS words+=ATEXT)*
		public Group getGroup() { return cGroup; }
		
		//words+=ATEXT
		public Assignment getWordsAssignment_0() { return cWordsAssignment_0; }
		
		//ATEXT
		public RuleCall getWordsATEXTTerminalRuleCall_0_0() { return cWordsATEXTTerminalRuleCall_0_0; }
		
		//(WS words+=ATEXT)*
		public Group getGroup_1() { return cGroup_1; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_1_0() { return cWSTerminalRuleCall_1_0; }
		
		//words+=ATEXT
		public Assignment getWordsAssignment_1_1() { return cWordsAssignment_1_1; }
		
		//ATEXT
		public RuleCall getWordsATEXTTerminalRuleCall_1_1_0() { return cWordsATEXTTerminalRuleCall_1_1_0; }
	}
	
	
	private final ModelElements pModel;
	private final PhraseElements pPhrase;
	private final TerminalRule tATEXT;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ArabicGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pPhrase = new PhraseElements();
		this.tATEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.qwork.Arabic.ATEXT");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.qwork.Arabic".equals(grammar.getName())) {
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
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	phrases+=Phrase+;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Phrase:
	//	words+=ATEXT (WS words+=ATEXT)*;
	public PhraseElements getPhraseAccess() {
		return pPhrase;
	}
	
	public ParserRule getPhraseRule() {
		return getPhraseAccess().getRule();
	}
	
	//terminal ATEXT:
	//	'\\u0600'..'\\u06ff'+;
	public TerminalRule getATEXTRule() {
		return tATEXT;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
