package org.qwork.kernel.test;

import org.qwork.kernel.utils.Pdf;

public class TestPdf {
	
	public static void main(String[] args) {
		Pdf.extractTextFromResource("QuranPdf/18.pdf", "18.txt");
	}
	
}
