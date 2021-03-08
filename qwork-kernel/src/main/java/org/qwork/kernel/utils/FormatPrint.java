package org.qwork.kernel.utils;

public class FormatPrint {

	public static void p(String str, Object ... params) {
		String toprint = String.format(str, params);
		System.out.println(toprint);
	}

}
