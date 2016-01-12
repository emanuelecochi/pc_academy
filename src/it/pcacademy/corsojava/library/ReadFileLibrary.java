package it.pcacademy.corsojava.library;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ReadFileLibrary {

	public static void main(String[] args) {
		
		try {
			// File inFile non contiene i dati ma il percorso dove trovarli
			File inputFile = new File("file/elencobibliotechelazio2014.csv");
			BufferedReader buf = new BufferedReader(new FileReader(inputFile));	
			
			List<String[]> libraryLazio = new ArrayList<String[]>();
			String line = buf.readLine();
			ReadFileLibrary infoArray = new ReadFileLibrary();
			
			while (line != null) {
				libraryLazio.add(infoArray.split(line, 16));
				line = buf.readLine();
			}
			buf.close();
			for (String[] library : libraryLazio) {
				System.out.println(Arrays.toString(library));
			}
				
		} catch (Exception e) {
			// stampa il messaggio di errore
			e.printStackTrace();
		}
		
	}

	
	public String[] split(String text, int columns) {
		String[] dataArray = new String[columns];
		String[] dataRawArray = text.split(",");
		int numberQuotesItemRaw = 0;
		int iArray = 0;
		int positionQuotes = 0;
		for (int iRawArray = 0; iRawArray < dataRawArray.length; iRawArray++) {
			for (int iChar = 0; iChar < dataRawArray[iRawArray].length(); iChar++) {
				if(dataRawArray[iRawArray].charAt(iChar) == '\"') {
					numberQuotesItemRaw++;
				}
			}
			
			if (numberQuotesItemRaw == 2 || dataRawArray[iRawArray].isEmpty()) {
				dataArray[iArray] = dataRawArray[iRawArray];
				iArray++;
			}
			else if(numberQuotesItemRaw == 1) {
				positionQuotes++;
				if (positionQuotes == 1)
					dataArray[iArray] = dataRawArray[iRawArray];
				else if (positionQuotes == 2) {
					dataArray[iArray] += dataRawArray[iRawArray];	
					positionQuotes = 0;
					iArray++;
				}
			}
			else if(numberQuotesItemRaw == 0 && !dataRawArray[iRawArray].isEmpty()) {
				dataArray[iArray] += dataRawArray[iRawArray];
			}
			
			numberQuotesItemRaw = 0;
		}
		
		return dataArray;
	}
	
}
