package org.qwork.kernel.utils;

public class Utf {
	
	public static String u(char ch) {
		return "\\u" + Integer.toHexString(ch | 0x10000).substring(1);
	}
	
	public static String u(String str) {
		StringBuffer res = new StringBuffer();
		for(int i = 0; i < str.length(); i++) {
			res.append(u(str.charAt(i)));
		}
		return res.toString();
	}

}
