package org.qwork.kernel.utils;

import java.util.function.Consumer;

public class TextLoop {
	
	public static void loop(String text, Consumer<Character> method) {
		for(int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			method.accept(ch);
		}		
	}
}
