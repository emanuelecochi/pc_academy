package it.pcacademy.corsojava.library;

public class Phone {

	private short[] prefix = new short[2];
	private short[] number = new short[10];
	
	public short[] getPrefix() {
		return this.prefix;
	}
	public void setPrefix(short[] prefix) {
		this.prefix = prefix;
	}
	public short[] getNumber() {
		return this.number;
	}
	public void setNumber(short[] number) {
		this.number = number;
	}
	
}
