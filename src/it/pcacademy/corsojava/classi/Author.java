package it.pcacademy.corsojava.classi;

public class Author {
	
	private String name = null;
	private String lastName = null;
	private int numberBooks = 0;
	
	public Author(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;	
	}

	public String getName() {
		return this.name;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getNumberBooks() {
		return this.numberBooks;
	}
	
	protected void addNumberBooks() {
		this.numberBooks++;	
	}
	
	protected void cancelBook() {
		this.numberBooks--;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}

