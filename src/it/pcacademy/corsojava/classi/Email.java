package it.pcacademy.corsojava.classi;

import javax.swing.*;

public class Email {

	// Rendo private userName, domain e number per non renderle accessibili
	// dall'esterno ma solo attraverso i loro metodi
	private String userName = null;
	private String domain = null;
	private char[] number = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	// Rendo privata usernameTest così non è possibile modificarla ma solo
	// leggerla
	private boolean usernameTest = true;

	// Imposta il nome che non deve iniziare con un numero
	public void setUserName(String userName) {
		if (!userName.isEmpty()) {
			testUserName: for (int i = 0; i < number.length; i++) {
				if (userName.charAt(0) == number[i]) {
					JOptionPane.showMessageDialog(null,"L'username \"" + userName + "\" inserito non può iniziare con un numero", "Errore", 0);
					usernameTest = false;
					break testUserName;
				} else
					usernameTest = true;
			}
		} else {
			JOptionPane.showMessageDialog(null,"L'username non può essere vuoto", "Errore", 0);
			this.userName = null;
			usernameTest = false;
		}
		if (usernameTest)
			this.userName = userName;
	}

	// Imposta il dominio
	public void setDomain(String domain) {
		// Il dominio deve essere scritto in minuscolo quindi uso il metodo
		// della stringa toLowerCase() e deve contenere il . ma non la @
		if (!domain.isEmpty()) {
			if (!domain.contains("@") && domain.contains(".") && !domain.startsWith(".") && !domain.startsWith(" ")) {
				this.domain = domain.toLowerCase();
			} else
				JOptionPane.showMessageDialog(null,"Il dominio \"" + domain + "\" non è corretto\n"
						+ "deve contenere il . ma non la @, non può iniziare con lo spazio o il \"punto\"", "Errore", 0);
		}
		else
			JOptionPane.showMessageDialog(null,"Il dominio \"" + domain + "\" non è corretto\n"
					+ "non può essere vuoto", "Errore", 0);
	}

	// Restituisce il dominio
	public String getDomain() {
		return this.domain;
	}

	// Restituisce l'username
	public String getUserName() {
		return this.userName;
	}

	// Restituisce l'email
	public String getEmail() {
			return this.userName + "@" + this.domain;
	}

}
