package org.qwork.kernel.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Pdf {

	private static void extractTextAndClose(PDDocument pd, String textFilePath) {
		try {
			System.out.println("pages: " + pd.getNumberOfPages());
			System.out.println("encrypted: " + pd.isEncrypted());
			
			PDFTextStripper stripper = new PDFTextStripper();
			File output = new File(textFilePath);
			BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output), "UTF-8"));
			stripper.writeText(pd, wr);

			pd.close();

			wr.flush();
			wr.close();

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void extractTextFromInputStream(InputStream input , String textFilePath) {
		try {
			PDDocument pd = PDDocument.load(input);
			extractTextAndClose(pd, textFilePath);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void extractTextFromFile(String pdfFilePath, String textFilePath) {
		try {
			File input = new File(pdfFilePath);
			PDDocument pd = PDDocument.load(input);
			extractTextAndClose(pd, textFilePath);

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void extractTextFromResource(String pdfResourcePath, String textFilePath) {
		try {
			InputStream input = Resource.asStream(pdfResourcePath);
			PDDocument pd = PDDocument.load(input);
			extractTextAndClose(pd, textFilePath);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
