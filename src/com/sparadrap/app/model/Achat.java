package com.sparadrap.app.model;

import java.util.Date;

public class Achat {
	private Date dateAchat;
	private Client client;
	private Patient patient;
	private Medecin medecin;
	private Specialiste specialiste;
	private Medicament medicament;
	private Ordonnance ordonnance;
	/**
	 * @return the dateAchat
	 */
	public Date getDateAchat() {
		return dateAchat;
	}
	/**
	 * @param dateAchat the dateAchat to set
	 */
	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}
	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}
	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	/**
	 * @return the patient
	 */
	public Patient getPatient() {
		return patient;
	}
	/**
	 * @param patient the patient to set
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	/**
	 * @return the medecin
	 */
	public Medecin getMedecin() {
		return medecin;
	}
	/**
	 * @param medecin the medecin to set
	 */
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	/**
	 * @return the medicaments
	 */
	public Medicament getMedicament() {
		return medicament;
	}
	/**
	 * @param medicaments the medicaments to set
	 */
	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
	}
	/**
	 * @return the specialiste
	 */
	public Specialiste getSpecialiste() {
		return specialiste;
	}
	/**
	 * @param specialiste the specialiste to set
	 */
	public void setSpecialiste(Specialiste specialiste) {
		this.specialiste = specialiste;
	}
	/**
	 * @return the listeOrdonnances
	 */
	public Ordonnance getOrdonnance() {
		return ordonnance;
	}
	/**
	 * @param listeOrdonnances the listeOrdonnances to set
	 */
	public void setOrdonnance(Ordonnance ordonnance) {
		this.ordonnance = ordonnance;
	}
	
	/**
	 * @param dateAchat
	 * @param client
	 * @param patient
	 * @param medecin
	 * @param specialiste
	 * @param listeOrdonnances
	 * @param listeMedicaments
	 */
	public Achat(Date dateAchat, Client client, Patient patient, Medecin medecin, Specialiste specialiste,
			Medicament medicament, Ordonnance ordonnance) {
		super();
		this.dateAchat = dateAchat;
		this.client = client;
		this.patient = patient;
		this.medecin = medecin;
		this.specialiste = specialiste;
		this.medicament = medicament;
	}
	@Override
	public String toString() {
		return "Achat ["
				+ "\n" + getDateAchat() 
				+ "\n" + getClient() 
				+ "\n" + getPatient() 
				+ "\n" + getMedecin() 
				+ "\n" + getSpecialiste()
				+ "\n" + getMedicament()
				+ "\n" + getOrdonnance() 
				+ "\n]";
	}
}
