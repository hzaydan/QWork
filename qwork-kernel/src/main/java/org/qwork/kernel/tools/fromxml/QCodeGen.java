package org.qwork.kernel.tools.fromxml;

import org.qwork.kernel.data.QSurah;

public class QCodeGen {
	
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
	
	private static void p(String str, Object ... params) {
		String toprint = String.format(str, params);
		System.out.println(toprint);
	}
	
	private static void printSurahCode(QSurah surah) {
		p("\tprivate void surah%d() {",surah.getOrder());
		p("\t\tsurah(%d,\"%s\");", surah.getOrder(), u(surah.getName()));
		surah.getAyat().forEach(ayah -> {
			p("\t\tayah(%d,\"%s\");", ayah.getNb(), u(ayah.getTextWithPunctuation()));
		});
		p("\t}");
	}
	
	public static void main(String[] args) {
		p("\tstatic {");
		for(int i = 1; i <= 114; i++) {
			p("\t\tdata.surah%d();", i);
		}
		p("\t}");
		QXml.load().getSurahs().forEach(surah -> {
			printSurahCode(surah);
		});
	}
}

