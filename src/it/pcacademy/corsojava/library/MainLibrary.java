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

			List<TreeMap<String, String>> libraryMapLazio = new ArrayList<TreeMap<String, String>>();
			String line = buf.readLine();
			String[] titleItems = line.replace('\"', ' ').split(",");
			System.out.println(titleItems.length);
			//StringSplitLibrary infoArray = new StringSplitLibrary();
			line = buf.readLine();

			while (line != null) {
				TreeMap<String, String> map = new TreeMap<String, String>();
				for (int i = 0; i < titleItems.length; i++) {
					String item = StringSplitLibrary.split(line, titleItems.length)[i];
					if (item == null)
						item = "";
					map.put(titleItems[i].trim(), item.trim());
					if (i == titleItems.length - 1)
						libraryMapLazio.add(map);
				}
				line = buf.readLine();
			}
			buf.close();
			
//			for (TreeMap<String, String> listLibrary : libraryMapLazio) {
//				for (Entry<String,String> e: listLibrary.entrySet()) {
//					System.out.println(e.getKey() + ": " + e.getValue());
//				}
//			}

			List<Library> libraryList = new ArrayList<Library>();
			for (TreeMap<String, String> data : libraryMapLazio) {
				Library library = new Library();
				// Address
				short[] cap = new short[5];
				for (int i = 0; i < data.get("cap").length(); i++) {
					cap[i] = (short) Integer.parseInt(String.valueOf(data.get("cap").charAt(i)));
				}
				Address address = new Address(data.get("indirizzo"), data.get("frazione"), cap);
				library.setIndirizzo(address);
				// Location
				Location location = new Location(data.get("latitudine"), data.get("longitudine"));
				library.setPosizione(location);
				// Phone
				Phone phone = new Phone("","");
				if (!data.get("telefono").isEmpty()) {
				phone.setPrefix(data.get("telefono").substring(0, data.get("telefono").indexOf(" ")));
				phone.setNumber(data.get("telefono").substring(data.get("telefono").indexOf(" ")+1, data.get("telefono").length())); 
				}
				library.setTelefono(phone);
				// Email
				Email email = new Email("","");
				if (!data.get("email").isEmpty()) {
				email.setUsername(data.get("email").substring(0, data.get("email").indexOf("@")));
				email.setDomain(data.get("email").substring(data.get("email").indexOf("@")+1, data.get("email").length())); 
				}
				library.setEmail(email);
				
				libraryList.add(library);
			}

			for (Library lib : libraryList) {
				lib.getIndirizzo().printAdress();
				lib.getPosizione().printLocation();
				lib.getTelefono().printPhone();
				lib.getEmail().printEmail();
				System.out.println();
			}

		} catch (Exception e) {
			// stampa il messaggio di errore
			e.printStackTrace();
		}

	}

}
