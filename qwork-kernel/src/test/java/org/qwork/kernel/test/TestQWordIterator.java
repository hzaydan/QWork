package org.qwork.kernel.test;

import org.qwork.kernel.qworditerator.QWordIterator;

public class TestQWordIterator {

	public static void main(String[] args) throws Exception {
		QWordIterator iterator = new QWordIterator(false);
		while(iterator.hasNext()) {
			if(iterator.surahNb() == 100) {
				String currentWordInfo = String.format("SurahNb: %d, AyahNb: %d, WordNb: %d, Word: %s", iterator.surahNb(), iterator.ayahNb(), iterator.wordNb(), iterator.word());
				System.out.println(currentWordInfo);
			}
			iterator.moveNext();
		}
	}

}
