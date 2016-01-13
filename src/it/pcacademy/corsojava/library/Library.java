package it.pcacademy.corsojava.library;

import java.net.URL;

public class Library {

	private String comune = "";
	private String provincia = "";
	private String denominazione = "";
	private String tipologiaFunzionale = "";
	private String denominazioneEnte = "";
	private String sistemaBibliotecario = "";
	private String OBR = "";
	private Address indirizzo;
	private Location posizione;
	private Phone telefono;
	private Phone fax;
	private Email email;
	private URL url;
	
	
	
	public String getOBR() {
		return this.OBR;
	}
	public void setOBR(String oBR) {
		this.OBR = oBR;
	}
	public String getComune() {
		return this.comune;
	}
	public void setComune(String comune) {
		this.comune = comune;
	}
	public String getProvincia() {
		return this.provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDenominazione() {
		return this.denominazione;
	}
	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}
	public String getTipologiaFunzionale() {
		return this.tipologiaFunzionale;
	}
	public void setTipologiaFunzionale(String tipologiaFunzionale) {
		this.tipologiaFunzionale = tipologiaFunzionale;
	}
	public String getDenominazioneEnte() {
		return this.denominazioneEnte;
	}
	public void setDenominazioneEnte(String denominazioneEnte) {
		this.denominazioneEnte = denominazioneEnte;
	}
	public String getSistemaBibliotecario() {
		return this.sistemaBibliotecario;
	}
	public void setSistemaBibliotecario(String sistemaBibliotecario) {
		this.sistemaBibliotecario = sistemaBibliotecario;
	}
	public Address getIndirizzo() {
		return this.indirizzo;
	}
	public void setIndirizzo(Address indirizzo) {
		this.indirizzo = indirizzo;
	}
	public Location getPosizione() {
		return this.posizione;
	}
	public void setPosizione(Location posizione) {
		this.posizione = posizione;
	}
	public Phone getTelefono() {
		return this.telefono;
	}
	public void setTelefono(Phone telefono) {
		this.telefono = telefono;
	}
	public Phone getFax() {
		return this.fax;
	}
	public void setFax(Phone fax) {
		this.fax = fax;
	}
	public Email getEmail() {
		return this.email;
	}
	public void setEmail(Email email) {
		this.email = email;
	}
	
	public URL getUrl() {
		return this.url;
	}
	public void setUrl(URL url) {
		this.url = url;
	}
	
	public void printLibrary() {
		System.out.print("Comune: " + this.getComune() + " Provincia: " + this.getProvincia() + " Denominazione: " + this.getDenominazione()
						+ " Tipologia funzionale: " + this.getTipologiaFunzionale() + " Denominazione ente: " + this.getDenominazioneEnte()
						+ " OBR: " + this.getOBR() + " Sistema bibliotecario: " + this.getSistemaBibliotecario() + " ");
	}
}
