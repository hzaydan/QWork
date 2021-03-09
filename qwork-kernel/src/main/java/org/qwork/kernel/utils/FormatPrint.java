package org.qwork.kernel.utils;

public class FormatPrint {
	
	public static void _o(String str) {
		System.out.print(str);
	}
	
	public static void o(String str) {
		System.out.println(str);
	}

	public static void _p(String str, Object ... params) {
		String toprint = String.format(str, params);
		System.out.print(toprint);
	}
	
	public static void p(String str, Object ... params) {
		String toprint = String.format(str, params);
		System.out.println(toprint);
	}

}
