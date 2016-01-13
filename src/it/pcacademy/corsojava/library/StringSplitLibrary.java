package it.pcacademy.corsojava.library;

public class StringSplitLibrary {
	
	public static String[] split(String stringTextext, int numberItems) {
		String[] dataArray = new String[numberItems];
		String[] dataRawArray = stringTextext.split(",");
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
				dataArray[iArray] = dataRawArray[iRawArray].replace('\"', ' ').trim();
				iArray++;
			}
			else if(numberQuotesItemRaw == 1) {
				positionQuotes++;
				if (positionQuotes == 1)
					dataArray[iArray] = dataRawArray[iRawArray].replace('\"', ' ').trim();
				else if (positionQuotes == 2) {
					dataArray[iArray] += dataRawArray[iRawArray].replace('\"', ' ').trim();	
					positionQuotes = 0;
					iArray++;
				}
			}
			else if(numberQuotesItemRaw == 0 && !dataRawArray[iRawArray].isEmpty()) {
				dataArray[iArray] += dataRawArray[iRawArray].replace('\"', ' ').trim();
			}
			
			numberQuotesItemRaw = 0;
		}
		
		return dataArray;
	}
	
}
