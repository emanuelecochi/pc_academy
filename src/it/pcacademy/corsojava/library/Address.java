package it.pcacademy.corsojava.library;

import java.util.Arrays;

public class Address {

	private String indirizzo;
	private String frazione;
	private short[] cap;
	
	public Address(String indirizzo, String frazione, short[] cap) {
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
	public short[] getCap() {
		return this.cap;
	}
	public void setCap(short[] cap) {
		this.cap = cap;
	}
	
	public String stringCAP(short[] cap) {
		String CAP = "";
		for (int i = 0; i < cap.length; i++) {
			CAP += cap[i];
		}
		return CAP;
		
	}
	
	public void printAdress() {
		System.out.print("Indirizzo: " + this.getIndirizzo() + " Frazione: " + this.getFrazione() + " CAP: " + stringCAP(this.getCap()) + " ");
	}
	
}
