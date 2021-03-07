package org.qwork.kernel.db;

import java.util.ArrayList;
import java.util.List;

public class QSurah {

	private String name;
	private Integer order;
	private List<QAyah> ayat = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public List<QAyah> getAyat() {
		return ayat;
	}

	public void setAyat(List<QAyah> ayat) {
		this.ayat = ayat;
	}

}
