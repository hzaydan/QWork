package org.qwork.kernel.test;

import static org.qwork.kernel.utils.FormatPrint._p;
import static org.qwork.kernel.utils.FormatPrint.o;
import static org.qwork.kernel.utils.FormatPrint.p;

import java.util.Scanner;

import org.qwork.kernel.utils.Pdf;
import org.qwork.kernel.utils.RemovePunctuation;

public class TestPdf {
	
	public static void main(String[] args) {
		var pdfHandle = Pdf.loadPdf("QuranPdf/04_v5.pdf");
		if(pdfHandle != null) {
			Scanner scan = new Scanner(System.in);
			boolean exit = false;
			do {
				p("You have a pdf of %d pages", pdfHandle.getNumberOfPages());
				p("Set attributes [page, x, y, width, height]:");
				_p("page:");int page = scan.nextInt();
				_p("x:");int x = scan.nextInt();
				_p("y:");int y = scan.nextInt();
				_p("width:");int width = scan.nextInt();
				_p("height:");int height = scan.nextInt();
				_p("remove punctuations:");boolean removePunctuations = scan.nextBoolean();
				String text = Pdf.extractTextByArea(pdfHandle, page, x, y, width, height);
				if(removePunctuations)
					text = RemovePunctuation.appliedOn(text);
				o(text);
				o("");
				_p("exit:");exit = scan.nextBoolean();
			}
			while(exit != true);
			scan.close();
			Pdf.closePdf(pdfHandle);
		}
	}
	
}
