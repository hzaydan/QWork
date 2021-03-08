package org.qwork.kernel.tools.fromxml;

import static org.qwork.kernel.utils.FormatPrint.p;
import static org.qwork.kernel.utils.Utf.u;

import org.qwork.kernel.data.QSurah;
import org.qwork.kernel.utils.TextLoop;

public class QCodeGen {
	
	
	private static void printSurahCode(QSurah surah) {
		p("\tprivate void surah%d() {",surah.getOrder());
		p("\t\tsurah(%d,\"%s\");", surah.getOrder(), u(surah.getName()));
		surah.getAyat().forEach(ayah -> {
			p("\t\tayah(%d,\"%s\");", ayah.getNb(), t(ayah.getTextWithPunctuation()));
		});
		p("\t}");
	}
	
	private static String t(String textWithPunctuation) {
		StringBuffer res = new StringBuffer();
		TextLoop.loop(textWithPunctuation, ch -> {
			if(ch == '\u0622') {
				res.append("\\u0621\\u0627");
			}
			else {
				res.append(u(ch));
			}
		});
		return res.toString();
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

