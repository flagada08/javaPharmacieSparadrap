package com.sparadrap.app.model;

import java.util.Date;

import com.sparadrap.app.exception.PharmaException;

public class Achat {
	private Date dateAchat;
	private Client client;
	private Patient patient;
	private Medecin medecin;
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
	public void setDateAchat(Date dateAchat) throws PharmaException {
		if(dateAchat == null) throw new PharmaException("La date est null");
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
	 * @param medicament
	 * @param ordonnance
	 * @throws PharmaException 
	 */
	public Achat(Date dateAchat, Client client, Patient patient, Medecin medecin, Ordonnance ordonnance) throws PharmaException {
		super();
		this.setDateAchat(dateAchat);
		this.client = client;
		this.patient = patient;
		this.medecin = medecin;
	}
	@Override
	public String toString() {
		return "Achat ["
				+ "\n" + getDateAchat() 
				+ "\n" + getClient() 
				+ "\n" + getPatient() 
				+ "\n" + getMedecin() 
				+ "\n" + getOrdonnance() 
				+ "\n]";
	}
}
