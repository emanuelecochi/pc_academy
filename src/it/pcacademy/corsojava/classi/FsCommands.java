package it.pcacademy.corsojava.classi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FsCommands {

	public static void main(String[] args) throws IOException {
		// creo un oggetto path
		Path path = null;
		// creo una stringa che contiene il path
		String pathString = null;
		// creo command che contiene la stringa inserita da console
		String command = null;
		// creo startCommand che contiene solo il comando
		String startCommand = null;
		// crea un oggetto file
		File dir = null;
		int i = 0;
		System.out.println("File System Commands\n");
		while (true) {
			// leggo la stringa da console ed elimina spazio iniziale e finale
			Scanner s = new Scanner(System.in);
			command = ((s.nextLine().toString()).trim());
			// prendo solo la prima parola, ossia il comando
			if (command.indexOf(' ') != -1) {
				startCommand = command.substring(0,command.indexOf(' '));
				// prendo la seconda parte, ossia il path
				pathString = command.substring(command.indexOf(' ')+1, command.length());
				// sostituisco tutti \ con doppio \\ perchè con uno solo la
				// stringa da errore in quanto si aspetta un carattere speciale
				if (pathString.contains("\\")) {
					pathString = pathString.replace("\\", "\\\\");
					// aggiorno path con pathString
					path = Paths.get(pathString);
				}
			}
			else 
				startCommand = command.substring(0,command.length());
			System.out.println();
			switch (startCommand) {
			case "help":
				System.out.println("CD - il comando change directory utile per spostarsi all'interno del filesystem");
				System.out.println("COUNT - il comando count conta gli elementi all'interno di una certa directory");
				System.out.println("DIR - il comando mostra i nomi di tutti i file all'interno di una certa directory");
				System.out.println("RM - il comando cancella file o cartelle in una directory");
				System.out.println("MKDIRS - il comando è utile per creare una nuova directory in un certo path");
				System.out.println("WGET - il comando è utile per leggere da una sorgete remota, per effettuare il download da una URL");
				System.out.println();
				break;
			case "cd":
				if (pathString != null) {
					if (command.charAt(3) != ' ') {
						System.out.println("Change directory!");
						System.out.println(path.toString());
						System.out.println();
						// aggiorno il file dir convertendo il percorso dato in un percorso astratto
						dir = new File(path.toString());
					} 
				} else {
					System.out.println("Inserire prima un path\n");
				}
				break;
			case "count":
				i = 1;
				if (pathString != null) {
					System.out.println("Count!");
					// conto i file presente nel path del file dir
					System.out.println("Il numero di file nella directory sono: " + dir.listFiles().length);
					System.out.println();
				} else {
					System.out.println("Inserire prima un path\n");
				}
				break;
			case "dir":
				i = 1;
				if (pathString != null) {
					// stampo i nomi di tutti i file presente nel path
					for (File list: dir.listFiles()) {
						System.out.println(i + " " + list.getName());
						i++;
					}
					System.out.println();
				} else {
					System.out.println("Inserire prima un path\n");
				}
				break;
			case "rm":
				if (pathString != null) {
				dir = new File(path.toString());
				// cancello il file (path presente nell'oggetto file dir)s
				if (dir.delete())
					System.out.println("File cancellato\n");
				else
					System.out.println("File non cancellato\n");
				} else {
					System.out.println("Inserire prima un path\n");
				}
				break;
			case "mkdirs":
				if (pathString != null) {
					dir = new File(path.toString());
					// creo una nuova cartella nel path definito in console (file dir)
					if (dir.mkdirs()) {
						System.out.println("Directory creata");
					}
				} else {
					System.out.println("Inserire prima un path\n");
				}
				break;
			case "wget":
				if (pathString != null) {
					// creo URL da salvare
					URL oracle = new URL(pathString);
					// creo un BufferReader utilizzato per salvare lo stream proveniente da URL
					BufferedReader in = new BufferedReader(
							new InputStreamReader(oracle.openStream()));
					String inputLine;
					FileOutputStream fileStream = new FileOutputStream("InputURL.html");
					while ((inputLine = in.readLine()) != null) {
						//System.out.println(inputLine);
						fileStream.write(inputLine.getBytes());
					}
					System.out.println("File salvato");
					in.close();
					fileStream.flush();
					fileStream.close();		
				}
		        break;
			default:
				System.out.println("Comando non riconosciuto - digita help per info\n");
				break;
			}
		}
	}	
}
 	 
/*
 * System.out.format("toString: %s%n", path.toString()); System.out.format(
 * "getFileName: %s%n", path.getFileName()); System.out.format(
 * "getName(0): %s%n", path.getName(0)); System.out.format("getNameCount: %d%n",
 * path.getNameCount()); System.out.format("subpath(0,2): %s%n",
 * path.subpath(0,2)); System.out.format("getParent: %s%n", path.getParent());
 * System.out.format("getRoot: %s%n", path.getRoot());
 */
