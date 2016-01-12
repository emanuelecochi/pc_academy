package it.pcacademy.corsojava.library;

public class Email {

	private String username;
	private String domain;
	
	
	
	public Email(String username, String domain) {
		super();
		this.username = username;
		this.domain = domain;
	}
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDomain() {
		return this.domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

	
}
