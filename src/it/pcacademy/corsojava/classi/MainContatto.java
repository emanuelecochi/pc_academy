package it.pcacademy.corsojava.classi;

import javax.swing.JOptionPane;

public class MainContatto {

	public static void main(String[] args) {
		
		// Creo un oggetto c1 di tipo Contatto al momento vuoto
		Contatto c1 = new Contatto();
		// Creo un oggetto e1 di tipo Email al momento vuoto
		Email e1 = new Email();
		// Creo le stringhe firstName, lastName, userName, domain e le inizializzo a null
		String firstName, lastName, userName, domain = null;
		
		// Attraverso una finestra permetto l'inserimento del nome finchè non viene inserito correttamente
		while (c1.getFirstName() == null){
			firstName = JOptionPane.showInputDialog("Inserisci il tuo nome");
			c1.setFirstName(firstName);
		}

		// Attraverso una finestra permetto l'inserimento del cognome finchè non viene inserito correttamente
		while (c1.getLastName() == null){
			lastName = JOptionPane.showInputDialog("Inserisci il tuo cognome");
			c1.setLastName(lastName);
		}
			
	    // Attraverso una finestra permetto l'inserimento dell'username finchè non viene inserito correttamente
		while (e1.getUserName() == null) {
			userName = JOptionPane.showInputDialog("Inserisci il tuo username");	
			e1.setUserName(userName);
		}
		
	    // Attraverso una finestra permetto l'inserimento dominio finchè non viene inserito correttamente
		while (e1.getDomain() == null) {
			domain = JOptionPane.showInputDialog("Inserisci il tuo dominio");
			e1.setDomain(domain);
		}
		
		// Ora che ho definito gli attributi username e dominio dell'oggetto e1, passo e1 al campo email dell'oggetto c1
		// attraverso il metodo setEmail della classe Contatto
		c1.setEmail(e1);
		
		// Stampo in una finestra i dati di nome, cognome e email 
		JOptionPane.showMessageDialog(null, "Nome: " + c1.getFirstName() + "\nCognome: " + c1.getLastName() + "\nEmail: " + c1.getEmail());

	}

}
