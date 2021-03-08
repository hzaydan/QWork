package org.qwork.kernel.tools.frompdf;

import java.util.LinkedHashSet;
import java.util.Set;

import org.qwork.kernel.data.Q;
import org.qwork.kernel.data.QAyah;
import org.qwork.kernel.utils.CharDistinction;
import org.qwork.kernel.utils.TextLoop;

public class QCharList {
	
	private static Set<Character> mainChars = new LinkedHashSet<>();
	private static Set<Character> puncChars = new LinkedHashSet<>();
	
	public static Set<Character> mainChars() { return mainChars; }
	public static Set<Character> puncChars() { return puncChars; }
	
	static {
		gatherChars();
	}
	
	private static void gatherChars() {
		
		Q.data().getSurahs().forEach(surah->{
			surah.getAyat().forEach(ayah->{
				gatherChars(ayah);
			});
		});
	}

	private static void gatherChars(QAyah ayah) {
		gatherChars(ayah.getTextWithPunctuation(), mainChars, puncChars);
	}

	private static void gatherChars(String text, Set<Character> mainChars, Set<Character> puncChars) {
		TextLoop.loop(text, ch -> {
			if(CharDistinction.isPunctuationChar(ch))
				puncChars.add(ch);
			else
				mainChars.add(ch);
		});
	}
}
