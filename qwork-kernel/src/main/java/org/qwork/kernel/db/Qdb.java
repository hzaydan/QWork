package org.qwork.kernel.db;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.qwork.kernel.db.jaxb.HolyQuran;

public class Qdb {
	
	private static HolyQuran CannotBeLoaded = null;
	
	private QChapter[] chapters;

	public QChapter[] getChapters() {
		return chapters;
	}

	public void setChapters(QChapter[] chapters) {
		this.chapters = chapters;
	}

	public HolyQuran load() {
		try {
			Unmarshaller un = JAXBContext.newInstance(HolyQuran.class).createUnmarshaller();
			InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("QuranDb/HolyQuran.xml");
			HolyQuran qdb = (HolyQuran) un.unmarshal(in);
			return qdb;
		}
		catch (Exception e) {
			e.printStackTrace();
			return CannotBeLoaded;
		}
	}
}
