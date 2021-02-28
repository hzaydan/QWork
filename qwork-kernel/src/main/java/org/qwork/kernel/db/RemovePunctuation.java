package org.qwork.kernel.db;

public class RemovePunctuation {

	private static boolean isPunctuationChar(char ch) {
		return 
				(ch >= '\u0600' && ch <= '\u061F') ||
				(ch >= '\u063B' && ch <= '\u063F') ||
				(ch >= '\u064B' && ch <= '\u065E') ||
				(ch >= '\u066A' && ch <= '\u06FF')
		;
	}
	
	public static String appliedOn(String text) {
		StringBuffer res = new StringBuffer();
		for(int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if(!isPunctuationChar(ch))
				res.append(ch);
		}
		return res.toString();
	}

}
