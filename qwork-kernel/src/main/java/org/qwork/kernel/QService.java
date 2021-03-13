package org.qwork.kernel;

import java.util.List;

import org.qwork.kernel.search.QSearchResult;
import org.qwork.kernel.search.QSearchService;

public class QService {
	
	public List<QSearchResult> search(String part, int maxResults) {
		return QSearchService.search(part, maxResults);
	}

}
