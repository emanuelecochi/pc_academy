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
			
			// File FileRead non contiene i dati ma il percorso dove trovarli, � un file 
			// utilizzato per leggere il contenuto
			File FileRead = new File("file/words.txt");
			// File FileWrite non contiene i dati ma il percorso dove trovarli, � un file 
			// utilizzato per scrivere del testo
			File FileWrite = new File("file/hello.txt");
			// Per scrivere in un file:
			FileWriter writer = new FileWriter(FileWrite);
			writer.write("hello");
			writer.flush();
			 
			// Per leggere un file 
			// BufferedReader buf = new BufferedReader(new InputStreamReader(new FileInputStream(FileRead)));
			BufferedReader buf = new BufferedReader(new FileReader(FileRead));
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
