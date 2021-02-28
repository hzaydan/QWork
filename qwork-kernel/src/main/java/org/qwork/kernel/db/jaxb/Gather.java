package org.qwork.kernel.db.jaxb;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Gather {
	
	private static String nb(int n) {
		String res = Integer.valueOf(n).toString();
		if(n < 10) {
			res = "00" + res;
		}
		else
			if(n < 100) {
				res = "0" + res;
			}
		return res;
	}
	
	public static void main(String[] args) throws Exception {
		PrintStream ps = new PrintStream("HolyQuran.xml", "UTF-8");
		ps.println("<HolyQuran>");
		for(int i  = 1; i <= 114; i++) {
			String resourcePath = "QuranDb/Arabic-1/Chapter" + nb(i) + ".xml";
			InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(resourcePath);
			BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"));
			for(int k = 1; k < 10; k++)
				br.readLine();
			String line = null;
			while((line = br.readLine()) != null) {
				ps.println(line);
			}
		}
		ps.println("</HolyQuran>");
		ps.flush();
		ps.close();
	}
}
