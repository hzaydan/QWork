package org.qwork.kernel.qworditerator;

import org.qwork.kernel.db.Q;
import org.qwork.kernel.db.QAyah;
import org.qwork.kernel.db.QSurah;
import org.qwork.kernel.utils.RemovePunctuation;

public class QWordIterator {
	
	private Q db;
	private boolean withPunctuation;
	
	private QSurah surah;
	private QAyah ayah;
	
	private int surahIndex;
	private int ayahIndex;
	
	private String[] ayahWords;
	private int wordIndex;
	
	public QWordIterator() {
		this(true);
	}
	
	public QWordIterator(boolean withPunctuation) {
		db = Q.db();
		this.withPunctuation = withPunctuation;
		doIndexOn(0,0);
	}
	
	private void doIndexOn(int surahIndex, int ayahIndex) {
		this.surahIndex = surahIndex;
		this.ayahIndex = ayahIndex;
		surah = db.getSurahs().get(surahIndex);
		ayah = surah.getAyat().get(ayahIndex);
		this.wordIndex = 0;
		ayahWords = ayah.getTextWithPunctuation().split(" ");
	}
	
	private boolean isLastWord() {
		return wordIndex == ayahWords.length - 1;
	}
	
	private boolean isLastAyah() {
		return ayahIndex == surah.getAyat().size() - 1;
	}
	
	private boolean isLastSurah() {
		return surahIndex == db.getSurahs().size() - 1;
	}
	
	public boolean hasNext() {
		if(isLastSurah() && isLastAyah() && isLastWord())
			return false;
		return true;
	}
	
	public void moveNext() {
		if(!isLastWord()) {
			wordIndex++;
		}
		else {
			if(!isLastAyah()) {
				ayahIndex++;
				ayah = surah.getAyat().get(ayahIndex);
				ayahWords = ayah.getTextWithPunctuation().split(" ");
				wordIndex = 0;
			}
			else {
				if(!isLastSurah()) {
					surahIndex++;
					surah = db.getSurahs().get(surahIndex);
					ayahIndex = 0;
					ayah = surah.getAyat().get(ayahIndex);
					ayahWords = ayah.getTextWithPunctuation().split(" ");
					wordIndex = 0;
				}
			}
		}
	}
	
	public int surahNb() {
		return surah.getOrder();
	}
	
	public int ayahNb() {
		return ayah.getNb();
	}
	
	public int wordNb() {
		return 1 + wordIndex;
	}
	
	public String word() {
		String wordWithPunctuation = ayahWords[wordIndex];
		if(withPunctuation)
			return wordWithPunctuation;
		return RemovePunctuation.appliedOn(wordWithPunctuation);
	}
}
