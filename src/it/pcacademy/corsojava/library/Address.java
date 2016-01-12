package it.pcacademy.corsojava.library;

public class Address {

	private String indirizzo;
	private String frazione;
	private String cap;
	
	public Address(String indirizzo, String frazione, String cap) {
		super();
		this.indirizzo = indirizzo;
		this.frazione = frazione;
		this.cap = cap;
	}
	public String getIndirizzo() {
		return this.indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getFrazione() {
		return this.frazione;
	}
	public void setFrazione(String frazione) {
		this.frazione = frazione;
	}
	public String getCap() {
		return this.cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	
}
