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

class Qdb {
	
	private static HolyQuran CannotBeLoaded = null;
	
	private Qdb() {
		
	}
	
	private List<QSurah> surahs = new ArrayList<>();

	public List<QSurah> getSurahs() {
		return surahs;
	}
	
	public void setSurahs(List<QSurah> surahs) {
		this.surahs = surahs;
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
		res.setSurahs(Q.getSurah().stream().map(Qdb::map).collect(Collectors.toList()));
		return res;
	}
	
	public static QSurah map(Surah surah) {
		QSurah res = new QSurah();
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
