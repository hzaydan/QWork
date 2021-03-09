package org.qwork.kernel.utils;

import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.InputStream;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class Pdf {

	public static PDDocument loadPdf(InputStream input) {
		try {
			PDDocument pd = PDDocument.load(input);
			return pd;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static PDDocument loadPdf(String pdfResourcePath) {
		try {
			InputStream input = Resource.asStream(pdfResourcePath);
			PDDocument pd = PDDocument.load(input);
			return pd;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static PDDocument loadPdf(File pdfFile) {
		try {
			PDDocument pd = PDDocument.load(pdfFile);
			return pd;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static void closePdf(PDDocument pd) {
		try {
			pd.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static String extractTextByArea(PDDocument pd, int page, int x, int y, int width, int height) {
		try {
			PDFTextStripperByArea textStripper = new PDFTextStripperByArea();
	        Rectangle2D rect = new java.awt.geom.Rectangle2D.Float(x, y, width, height);
	        textStripper.addRegion("region", rect);


	        PDPage docPage = pd.getPage(page);

	        textStripper.extractRegions(docPage);

	        String textForRegion = textStripper.getTextForRegion("region");
	        
	        return textForRegion;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
		
}
