/*
 * generated by Xtext 2.25.0
 */
grammar InternalQAyahStart;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.qwork.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.qwork.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.qwork.services.QAyahStartGrammarAccess;

}
@parser::members {
	private QAyahStartGrammarAccess grammarAccess;

	public void setGrammarAccess(QAyahStartGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleAyahStartModel
entryRuleAyahStartModel
:
{ before(grammarAccess.getAyahStartModelRule()); }
	 ruleAyahStartModel
{ after(grammarAccess.getAyahStartModelRule()); } 
	 EOF 
;

// Rule AyahStartModel
ruleAyahStartModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		(
			{ before(grammarAccess.getAyahStartModelAccess().getAyatAssignment()); }
			(rule__AyahStartModel__AyatAssignment)
			{ after(grammarAccess.getAyahStartModelAccess().getAyatAssignment()); }
		)
		(
			{ before(grammarAccess.getAyahStartModelAccess().getAyatAssignment()); }
			(rule__AyahStartModel__AyatAssignment)*
			{ after(grammarAccess.getAyahStartModelAccess().getAyatAssignment()); }
		)
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAyahStart
entryRuleAyahStart
:
{ before(grammarAccess.getAyahStartRule()); }
	 ruleAyahStart
{ after(grammarAccess.getAyahStartRule()); } 
	 EOF 
;

// Rule AyahStart
ruleAyahStart 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAyahStartAccess().getGroup()); }
		(rule__AyahStart__Group__0)
		{ after(grammarAccess.getAyahStartAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePhrase
entryRulePhrase
:
{ before(grammarAccess.getPhraseRule()); }
	 rulePhrase
{ after(grammarAccess.getPhraseRule()); } 
	 EOF 
;

// Rule Phrase
rulePhrase 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPhraseAccess().getGroup()); }
		(rule__Phrase__Group__0)
		{ after(grammarAccess.getPhraseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AyahStart__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AyahStart__Group__0__Impl
	rule__AyahStart__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AyahStart__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterSeenArabicLetterWawArabicLetterRehArabicLetterTehMarbutaKeyword_0()); }
	'\u0627\u0644\u0633\u0648\u0631\u0629'
	{ after(grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterSeenArabicLetterWawArabicLetterRehArabicLetterTehMarbutaKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AyahStart__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AyahStart__Group__1__Impl
	rule__AyahStart__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AyahStart__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAyahStartAccess().getSurahAssignment_1()); }
	(rule__AyahStart__SurahAssignment_1)
	{ after(grammarAccess.getAyahStartAccess().getSurahAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AyahStart__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AyahStart__Group__2__Impl
	rule__AyahStart__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AyahStart__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithMaddaAboveArabicLetterYehArabicLetterTehMarbutaKeyword_2()); }
	'\u0627\u0644\u0622\u064A\u0629'
	{ after(grammarAccess.getAyahStartAccess().getArabicLetterAlefArabicLetterLamArabicLetterAlefWithMaddaAboveArabicLetterYehArabicLetterTehMarbutaKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AyahStart__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AyahStart__Group__3__Impl
	rule__AyahStart__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AyahStart__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAyahStartAccess().getAyahAssignment_3()); }
	(rule__AyahStart__AyahAssignment_3)
	{ after(grammarAccess.getAyahStartAccess().getAyahAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AyahStart__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AyahStart__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AyahStart__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAyahStartAccess().getNameAssignment_4()); }
	(rule__AyahStart__NameAssignment_4)
	{ after(grammarAccess.getAyahStartAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Phrase__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Phrase__Group__0__Impl
	rule__Phrase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Phrase__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPhraseAccess().getBasmalahAssignment_0()); }
	(rule__Phrase__BasmalahAssignment_0)?
	{ after(grammarAccess.getPhraseAccess().getBasmalahAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Phrase__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Phrase__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Phrase__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getPhraseAccess().getWordsAssignment_1()); }
		(rule__Phrase__WordsAssignment_1)
		{ after(grammarAccess.getPhraseAccess().getWordsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getPhraseAccess().getWordsAssignment_1()); }
		(rule__Phrase__WordsAssignment_1)*
		{ after(grammarAccess.getPhraseAccess().getWordsAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AyahStartModel__AyatAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAyahStartModelAccess().getAyatAyahStartParserRuleCall_0()); }
		ruleAyahStart
		{ after(grammarAccess.getAyahStartModelAccess().getAyatAyahStartParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AyahStart__SurahAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAyahStartAccess().getSurahINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getAyahStartAccess().getSurahINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AyahStart__AyahAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAyahStartAccess().getAyahINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getAyahStartAccess().getAyahINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AyahStart__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAyahStartAccess().getNameKALEMAHTerminalRuleCall_4_0()); }
		RULE_KALEMAH
		{ after(grammarAccess.getAyahStartAccess().getNameKALEMAHTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Phrase__BasmalahAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPhraseAccess().getBasmalahBASMALAHTerminalRuleCall_0_0()); }
		RULE_BASMALAH
		{ after(grammarAccess.getPhraseAccess().getBasmalahBASMALAHTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Phrase__WordsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPhraseAccess().getWordsAWORDTerminalRuleCall_1_0()); }
		RULE_AWORD
		{ after(grammarAccess.getPhraseAccess().getWordsAWORDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_BASMALAH : '\u0628\u0650\u0633\u0652\u0645\u0650 \u0627\u0644\u0644\u0651\u064E\u0647\u0650 \u0627\u0644\u0631\u0651\u064E\u062D\u0652\u0645\u064E\u0646\u0650 \u0627\u0644\u0631\u0651\u064E\u062D\u0650\u064A\u0645\u0650';

RULE_AWORD : (RULE_ALETTER|RULE_AHARAKAH|RULE_ATANWEEN|RULE_ASHADDAH)+;

fragment RULE_ALIGATURES : '\uFDF0'..'\uFDFD';

fragment RULE_ALETTER : '\u0621'..'\u064A';

fragment RULE_ADIGIT : '\u0660'..'\u0669';

fragment RULE_ATANWEEN : '\u064B'..'\u064D';

fragment RULE_AHARAKAH : ('\u064E'..'\u0650'|'\u0652');

fragment RULE_ASHADDAH : '\u0651';

fragment RULE_ANONLETTER : ('\u0600'..'\u0620'|'\u064B'..'\u06FF');

RULE_KALEMAH : '"' ( options {greedy=false;} : . )*'"';

RULE_SL_COMMENT : 'deactivated';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
