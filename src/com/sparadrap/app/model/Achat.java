package com.sparadrap.app.model;

import java.util.Date;
import java.util.ArrayList;

public class Achat {
	private Date dateAchat;
	private Client client;
	private Patient patient;
	private Medecin medecin;
	private Specialiste specialiste;
	private Medicament medicament;
	private ArrayList<Ordonnance> listeOrdonnances;
	private ArrayList<Medicament> listeMedicaments;
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
	public ArrayList<Ordonnance> getListeOrdonnances() {
		return listeOrdonnances;
	}
	/**
	 * @param listeOrdonnances the listeOrdonnances to set
	 */
	public void setListeOrdonnances(ArrayList<Ordonnance> listeOrdonnances) {
		this.listeOrdonnances = listeOrdonnances;
	}
	/**
	 * @return the listeMedicaments
	 */
	public ArrayList<Medicament> getListeMedicaments() {
		return listeMedicaments;
	}
	/**
	 * @param listeMedicaments the listeMedicaments to set
	 */
	public void setListeMedicaments(ArrayList<Medicament> listeMedicaments) {
		this.listeMedicaments = listeMedicaments;
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
			Medicament medicament, ArrayList<Ordonnance> listeOrdonnances, ArrayList<Medicament> listeMedicaments) {
		super();
		this.dateAchat = dateAchat;
		this.client = client;
		this.patient = patient;
		this.medecin = medecin;
		this.specialiste = specialiste;
		this.medicament = medicament;
		this.listeOrdonnances = listeOrdonnances;
		this.listeMedicaments = listeMedicaments;
	}
	@Override
	public String toString() {
		return "Achat [getDateAchat()=" + getDateAchat() 
				+ ", getClient()=" + getClient() 
				+ ", getPatient()=" + getPatient() 
				+ ", getMedecin()=" + getMedecin() 
				+ ", getSpecialiste()=" + getSpecialiste()
				+ ", getMedicament()=" + getMedicament()
				+ ", getListeOrdonnances()=" + getListeOrdonnances() 
				+ ", getListeMedicaments()=" + getListeMedicaments() + "]";
	}
}
