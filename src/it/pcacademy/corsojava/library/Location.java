package it.pcacademy.corsojava.library;

public class Location {

	private String latitudine = "";
	private String longitudine = "";
	
	public Location(String latitudine, String longitudine) {
		super();
		this.latitudine = latitudine;
		this.longitudine = longitudine;
	}
	public String getLatitudine() {
		return this.latitudine;
	}
	public void setLatitudine(String latitudine) {
		this.latitudine = latitudine;
	}
	public String getLongitudine() {
		return this.longitudine;
	}
	public void setLongitudine(String longitudine) {
		this.longitudine = longitudine;
	}
	
	public void printLocation() {
		
		System.out.print("Latitudine: " + this.getLatitudine() + " Longitudine: " + this.getLongitudine() + " ");
	}
	
	public static double distance(Location A, Location B) {
		double dis = -1;
		if (!A.getLatitudine().equals("") && !A.getLongitudine().equals("")) {
			if (!B.getLatitudine().equals("") && !B.getLongitudine().equals("")) {
				double latA = Double.parseDouble(A.getLatitudine());
				double lonA = Double.parseDouble(A.getLongitudine());
				double latB = Double.parseDouble(B.getLatitudine());
				double lonB = Double.parseDouble(B.getLongitudine());
				dis = Math.sqrt((latA*latA+latB*latB)+(lonA*lonA+lonB*lonB));
			}
		}
		return dis;
	}
	
}
