package org.qwork.kernel.test;

import org.qwork.kernel.data.Q;

public class TestPrintAyat {

	public static void main(String[] args) throws Exception {
		Q.data().getSurahs().stream().forEach(
			chapter -> {
				chapter.getAyat().stream().forEach(
					ayah -> {
						System.out.println(
							String.format("%s %d %s %d \"%s %s(%d)\"","السورة",chapter.getOrder(),"الآية",ayah.getNb(), chapter.getName(), text(ayah.getText(), 4), ayah.getNb())
						);
					}
				);
				System.out.println();
			}
		);
	}

	private static String text(String text, int maxWord) {
		if(text.startsWith("بسم الله الرحمن الرحيم ")) {
			text = text.substring("بسم الله الرحمن الرحيم ".length());
		}
		String[] splits = text.split("[ ]");
		String res = "";
		int n = Math.min(splits.length, maxWord);
		for(int i = 0; i < n; i++) {
			if(splits[i].isEmpty())
				continue;
			res += splits[i];
			if(i  < n - 1)
				res += " ";
		}
		res += "..الآية";
		return res;
	}

}
