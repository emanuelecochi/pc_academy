package it.pcacademy.corsojava.classi;

import javax.swing.JOptionPane;

public class Contatto {

	// Rendo private firstName, lastName e email per non renderle accessibili
	// dall'esterno ma solo attraverso i loro metodi
	private String firstName = null;
	private String lastName = null;
	private Email email = null;
	
	// Imposta il nome
	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.startsWith(" "))
			this.firstName = firstName;	
		else
			JOptionPane.showMessageDialog(null, "Il nome non può essere vuoto", "Errore", 0);
	}
	
	// Imposta il cognome
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.startsWith(" "))
			this.lastName = lastName;
		else
			JOptionPane.showMessageDialog(null, "Il cognome non può essere vuoto", "Errore", 0);		
	}
	
	// Imposta la mail
	public void setEmail(Email email) {
		this.email = email;
	}
	
	// Restituisce il nome
	public String getFirstName() {
		return firstName;
	}
	
	// Restituisce il cognome
	public String getLastName() {
		return lastName;
	}
	
	// Restituisce l'email
	public String getEmail() {
		return this.email.getEmail();
	}	
}
