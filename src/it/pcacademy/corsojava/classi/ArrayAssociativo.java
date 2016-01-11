package it.pcacademy.corsojava.classi;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayAssociativo {
	
	public static void main(String[] args) {
		
		Map<String, String> color = new HashMap<String, String>();
		color.put("rosso", "red");
		color.put("verde", "green");
		color.put("blu", "blue");
		for ( Entry<String, String> e : color.entrySet()) {
			if (e.getKey().equals("verde"))
				System.out.println("la chiave è: " + e.getKey() + ", e il valore è: " + e.getValue());
		}
		
		//System.out.println(color);
}
}
