package it.pcacademy.corsojava.library;

public class Location {

	private String latitudine;
	private String longitudine;
	
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
	
	
}
