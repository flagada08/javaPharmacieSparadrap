package com.sparadrap.app.model;

import java.util.ArrayList;
import java.util.Date;

public class Ordonnance {
	private Date date;
	private Medecin medecin;
	private Client patient;
	private ArrayList<Medicament> listeMedicamentsOrdonnances;
	private Specialiste specialiste;
	/**
	 * @param date
	 * @param medecin
	 * @param patient
	 * @param listeMedicaments
	 * @param specialiste
	 */
	public Ordonnance(Date date, Medecin medecin, Client patient, ArrayList<Medicament> listeMedicamentsOrdonnances,
			Specialiste specialiste) {
		super();
		this.date = date;
		this.medecin = medecin;
		this.patient = patient;
		this.listeMedicamentsOrdonnances = listeMedicamentsOrdonnances;
		this.specialiste = specialiste;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
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
	 * @return the patient
	 */
	public Client getPatient() {
		return patient;
	}
	/**
	 * @param patient the patient to set
	 */
	public void setPatient(Client patient) {
		this.patient = patient;
	}
	/**
	 * @return the listeMedicaments
	 */
	public ArrayList<Medicament> getListeMedicaments() {
		return listeMedicamentsOrdonnances;
	}
	/**
	 * @param listeMedicaments the listeMedicaments to set
	 */
	public void setListeMedicaments(ArrayList<Medicament> listeMedicamentsOrdonnances) {
		this.listeMedicamentsOrdonnances = listeMedicamentsOrdonnances;
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
}
