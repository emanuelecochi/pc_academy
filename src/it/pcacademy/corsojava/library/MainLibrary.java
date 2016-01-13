package it.pcacademy.corsojava.library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map.Entry;

public class MainLibrary {

	public static void main(String[] args) {

		try {
			// File inFile non contiene i dati ma il percorso dove trovarli
			File inputFile = new File("file/elencobibliotechelazio2014.csv");
			File outputFile = new File("file/result.txt");
			//FileWriter fileOut = new FileWriter(outputFile);
			BufferedReader buf = new BufferedReader(new FileReader(inputFile));

			List<TreeMap<String, String>> libraryMapLazio = new ArrayList<TreeMap<String, String>>();
			String line = buf.readLine();
			String[] titleItems = line.replace('\"', ' ').split(",");
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
				// Other info
				library.setComune(data.get("comune"));
				library.setProvincia(data.get("provincia"));
				library.setDenominazione(data.get("denominazione"));
				library.setTipologiaFunzionale(data.get("tipologia funzionale"));
				library.setDenominazione(data.get("denominazione ente"));
				library.setOBR(data.get("OBR"));
				library.setSistemaBibliotecario(data.get("Sistema bibliotecario"));
				
				libraryList.add(library);
			}
			
//			PrintStream out = new PrintStream(new FileOutputStream(outputFile));
//			System.setOut(out);
			
//			for (Library lib : libraryList) {
//				lib.printLibrary();
//				lib.getIndirizzo().printAdress();
//				lib.getPosizione().printLocation();
//				lib.getTelefono().printPhone();
//				lib.getEmail().printEmail();
//				System.out.println();
//			}
			
			List<Library> libFilter = libraryList
							  .stream()
							  .filter(w-> w.getComune().equals("Roma") && 
									  w.getIndirizzo().stringCAP(w.getIndirizzo().getCap()).equals("00187"))
							  .collect(Collectors.toList());
			
			for (Library filter : libFilter) {
				filter.printLibrary();
				filter.getIndirizzo().printAdress();
				filter.getPosizione().printLocation();
				filter.getTelefono().printPhone();
				filter.getEmail().printEmail();
				System.out.println();
			}
			
//			Location a = new Location("10", "5");
//			Location b = new Location("10", "5");
//			System.out.println(Location.distance(a, b));
			
		} catch (Exception e) {
			// stampa il messaggio di errore
			e.printStackTrace();
		}

	}

}
