package it.pcacademy.corsojava.library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MainLibrary {

	public static void main(String[] args) {
		
		try {
			// File inFile non contiene i dati ma il percorso dove trovarli
			File inputFile = new File("file/elencobibliotechelazio2014.csv");
			BufferedReader buf = new BufferedReader(new FileReader(inputFile));	
			
			List<TreeMap<String, String>> libraryArrayLazio = new ArrayList<TreeMap<String, String>>();
			String line = buf.readLine();
			String[] titleItems = line.split(",");
			System.out.println(titleItems.length);
			StringSplitLibrary infoArray = new StringSplitLibrary();
			line = buf.readLine();
			
			while (line != null) {
				TreeMap<String, String> map = new TreeMap<String, String>();
				for (int i = 0; i < titleItems.length; i++) {
					map.put(titleItems[i], infoArray.split(line, titleItems.length)[i]);
					if (i == titleItems.length-1)
						libraryArrayLazio.add(map);
				}
				line = buf.readLine();
			}
			buf.close();
			for (TreeMap<String, String> listLibrary : libraryArrayLazio) {
				for (Entry<String,String> e: listLibrary.entrySet()) {
					System.out.println(e.getKey() + ": " + e.getValue());
				}
			}
			
//			List<Library> libraryList = new ArrayList<Library>();
//			for (String[] data: libraryArrayLazio) {
//				Library library = new Library();
////				short[] cap = new short[5];
////				for (int i = 0; i < data[8].length(); i++) {
////					cap[i] = (short)Integer.parseInt(String.valueOf(data[9].charAt(i)));
////				}
//				Address address = new Address(data[7], data[8], data[9]);
//				library.setIndirizzo(address);
//				libraryList.add(library);
//			}
//			
//			for (Library i : libraryList) {
//				System.out.println(i.getIndirizzo().getCap());
//			}
			
		} catch (Exception e) {
			// stampa il messaggio di errore
			e.printStackTrace();
		}
		


	}

}
