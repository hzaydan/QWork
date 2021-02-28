package org.qwork.kernel.test;

import org.qwork.kernel.db.Qdb;
import org.qwork.kernel.db.jaxb.HolyQuran;

public class TestServices {
	
	public static void main(String[] args) {
		Qdb qdb = new Qdb();
		HolyQuran Q = qdb.load();
		System.out.println(Q.getSurah().get(0).getAyah().get(0).getValue().getBytes());
	}

}
