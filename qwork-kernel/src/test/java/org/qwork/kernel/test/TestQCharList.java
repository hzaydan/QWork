package org.qwork.kernel.test;

import org.qwork.kernel.tools.frompdf.QCharList;
import org.qwork.kernel.utils.Utf;

public class TestQCharList {
	
	public static void main(String[] args) {
		System.out.println(QCharList.mainChars());
		System.out.println(QCharList.puncChars());
		System.out.println(Utf.u('آ'));
		System.out.println(Utf.u('ء'));
		System.out.println(Utf.u('ا'));
	}
}
