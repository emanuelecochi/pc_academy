package it.pcacademy.corsojava.library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainLibrary {

	public static void main(String[] args) {
		
		try {
			// File inFile non contiene i dati ma il percorso dove trovarli
			File inputFile = new File("file/elencobibliotechelazio2014.csv");
			BufferedReader buf = new BufferedReader(new FileReader(inputFile));	
			
			List<String[]> libraryArrayLazio = new ArrayList<String[]>();
			String line = buf.readLine();
			StringSplitLibrary infoArray = new StringSplitLibrary();
			
			while (line != null) {
				libraryArrayLazio.add(infoArray.split(line, 16));
				line = buf.readLine();
			}
			buf.close();
			for (String[] library : libraryArrayLazio) {
				System.out.println(Arrays.toString(library));
			}
			
			List<Library> libraryList = new ArrayList<Library>();
			for (String[] data: libraryArrayLazio) {
				Library library = new Library();
//				short[] cap = new short[5];
//				for (int i = 0; i < data[8].length(); i++) {
//					cap[i] = (short)Integer.parseInt(String.valueOf(data[9].charAt(i)));
//				}
				Address address = new Address(data[7], data[8], data[9]);
				library.setIndirizzo(address);
				libraryList.add(library);
			}
			
			for (Library i : libraryList) {
				System.out.println(i.getIndirizzo().getCap());
			}
			
		} catch (Exception e) {
			// stampa il messaggio di errore
			e.printStackTrace();
		}
		


	}

}
