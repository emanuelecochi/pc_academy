package it.pcacademy.corsojava.classi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class IOStreamFile {

	public static void main(String[] args) {
		
		try {
			
//			 URL url = new URL("www.google.com");
//			 InputStream site = url.openStream();
			
			// File inFile non contiene i dati ma il percorso dove trovarli
			File inFile = new File("text/text.txt");
			// Per scrivere in un file:
			// FileWriter writer = new FileWriter(inFile);
			// BufferedReader buf = new BufferedReader(new InputStreamReader(new FileInputStream(inFile)));
			BufferedReader buf = new BufferedReader(new FileReader(inFile));
			List<String> lines = new ArrayList<String>();
			String line = buf.readLine();
			while (line != null) {
				System.out.println(line);
				lines.add(line);
				line = buf.readLine();
			}
			buf.close();
		} catch (IOException e) {
			// stampa il messaggio di errore
			e.printStackTrace();
		}
		
	}

}
