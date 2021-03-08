package org.qwork.kernel.utils;

public class CharDistinction {

	public static boolean isPunctuationChar(char ch) {
		return 
				(ch >= '\u0600' && ch <= '\u061F') ||
				(ch >= '\u063B' && ch <= '\u063F') ||
				(ch >= '\u064B' && ch <= '\u065E') ||
				(ch >= '\u066A' && ch <= '\u06FF')
		;
	}

}
