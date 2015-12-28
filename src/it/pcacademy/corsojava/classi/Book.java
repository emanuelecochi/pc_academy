package it.pcacademy.corsojava.classi;

public class Book {
	
	private String title = null;
	private Author author = null;
	private String year = null;
	private String description = null;
	
	public Book(String title, Author author, String year, String description) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.description = description;
		this.author.addNumberBooks();
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public Author getAuthor() {
		return this.author;
	}
	
	public String getDescription() {
		return description;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void changeAuthor(Author author) {
		if (author != null) {
			this.author.cancelBook();
			this.author = author;
			this.author.addNumberBooks();
		}
	}
	
}
