package org.qwork.kernel.search;

public class QSearchResult {
	private int surahNb;
	private String surahName;
	private int ayahNb;
	private String ayahText;

	public int getSurahNb() {
		return surahNb;
	}

	public void setSurahNb(int surahNb) {
		this.surahNb = surahNb;
	}

	public String getSurahName() {
		return surahName;
	}

	public void setSurahName(String surahName) {
		this.surahName = surahName;
	}

	public int getAyahNb() {
		return ayahNb;
	}

	public void setAyahNb(int ayahNb) {
		this.ayahNb = ayahNb;
	}

	public String getAyahText() {
		return ayahText;
	}

	public void setAyahText(String ayahText) {
		this.ayahText = ayahText;
	}

	@Override
	public String toString() {
		return "QSearchResult [surahNb=" + surahNb + ", surahName=" + surahName + ", ayahNb=" + ayahNb + ", ayahText="
				+ ayahText + "]";
	}

}
