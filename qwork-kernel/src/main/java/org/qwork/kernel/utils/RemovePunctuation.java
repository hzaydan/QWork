package org.qwork.kernel.utils;

public class RemovePunctuation {

	public static String appliedOn(String text) {
		StringBuffer res = new StringBuffer();
		TextLoop.loop(text, ch -> {
			if(!CharDistinction.isPunctuationChar(ch))
				res.append(ch);
		});
		return res.toString();
	}

}
