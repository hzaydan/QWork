package org.qwork.kernel.search;

import java.util.ArrayList;
import java.util.List;

import org.qwork.kernel.db.Qdb;

public class QSearchService {
	
	public static List<QSearchResult> search(String part, int maxResults) {
		
		List<QSearchResult> res = new ArrayList<>();
		
		Qdb.db().getSurahs().stream().takeWhile(ch -> res.size() < maxResults).forEach(
			chapter -> {
				chapter.getAyat().stream().takeWhile(a -> res.size() < maxResults).forEach(
					ayah -> {
						if(ayah.getText().contains(part)) {
							QSearchResult r = new QSearchResult();
							r.setAyahNb(ayah.getNb());
							r.setAyahText(ayah.getTextWithPunctuation());
							r.setSurahNb(chapter.getOrder());
							r.setSurahName(chapter.getName());
							res.add(r);
						}
					}
				);
			}
		);
		
		return res;
	}

}
