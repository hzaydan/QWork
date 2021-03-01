package org.qwork.kernel.db;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.qwork.kernel.db.jaxb.Ayah;
import org.qwork.kernel.db.jaxb.HolyQuran;
import org.qwork.kernel.db.jaxb.Surah;

public class Qdb {
	
	private static HolyQuran CannotBeLoaded = null;
	
	private Qdb() {
		
	}
	
	private static Qdb db = load();
	
	public final static Qdb db() {
		return db;
	}
	
	private List<QChapter> chapters = new ArrayList<>();

	public List<QChapter> getChapters() {
		return chapters;
	}
	
	public void setChapters(List<QChapter> chapters) {
		this.chapters = chapters;
	}
	
	public static HolyQuran loadFromXml() {
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
	
	public static Qdb load() {
		Qdb res = new Qdb();
		HolyQuran Q = loadFromXml();
		res.setChapters(Q.getSurah().stream().map(Qdb::map).collect(Collectors.toList()));
		return res;
	}
	
	public static QChapter map(Surah surah) {
		QChapter res = new QChapter();
		res.setName(surah.getName());
		res.setOrder(surah.getId());
		res.setAyat(surah.getAyah().stream().map(Qdb::map).collect(Collectors.toList()));
		return res;
	}
	
	public static QAyah map(Ayah ayah) {
		QAyah res = new QAyah();
		res.setNb(ayah.getNb());
		res.setTextWithPunctuation(ayah.getValue());
		res.setText(RemovePunctuation.appliedOn(ayah.getValue()));
		return res;
	}
	
}