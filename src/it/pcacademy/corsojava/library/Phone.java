package it.pcacademy.corsojava.library;

public class Phone {

	private String prefix;
	private String number;
	
	public Phone(String prefix, String number) {
		super();
		this.prefix = prefix;
		this.number = number;
	}
	
	public String getPrefix() {
		return this.prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getNumber() {
		return this.number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void printPhone() {
		System.out.print("Prefisso: " + this.getPrefix() + " Numero: " + this.getNumber() + " ");
	}
	
}
