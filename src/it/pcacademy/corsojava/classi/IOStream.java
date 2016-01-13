package it.pcacademy.corsojava.classi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class IOStream {

	public static void main(String[] args) {
		try {
			// System.in è un InputStream, ha il metodo read() che purtroppo 
			// legge un byte per volta, quindi si usa InputStreamReader che sarà  usato
			// da BufferReader
			InputStreamReader isr = new InputStreamReader(System.in);
			// BufferedRead permette di leggere le righe di testo (stringhe) ma vuole
			// come input un InputStreamReader, per questo si crea isr
			BufferedReader buf = new BufferedReader(isr);
			System.out.println("Inserisci un testo");
			String txt = buf.readLine();
			while (txt != null && (!txt.equals("END"))) {
				System.out.println("Hai inserito: " + txt);
				txt = buf.readLine();
			}
		} catch (IOException e) {
			// stampa il messaggio di errore
			e.printStackTrace();
		}
		
	}

}
