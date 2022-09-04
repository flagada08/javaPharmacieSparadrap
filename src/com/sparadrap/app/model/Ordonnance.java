package com.sparadrap.app.model;

import java.util.ArrayList;
import java.util.Date;

public class Ordonnance {
	private Date date;
	private Medecin medecin;
	private Patient patient;
	private ArrayList<Medicament> listeMedicamentsOrdonnances;
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
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	/**
	 * @return the listeMedicamentsOrdonnances
	 */
	public ArrayList<Medicament> getListeMedicamentsOrdonnances() {
		return listeMedicamentsOrdonnances;
	}
	/**
	 * @param listeMedicamentsOrdonnances the listeMedicamentsOrdonnances to set
	 */
	public void setListeMedicamentsOrdonnances(ArrayList<Medicament> listeMedicamentsOrdonnances) {
		this.listeMedicamentsOrdonnances = listeMedicamentsOrdonnances;
	}
	/**
	 * @param date
	 * @param medecin
	 * @param patient
	 * @param listeMedicamentsOrdonnances
	 */
	public Ordonnance(Date date, Medecin medecin, Patient patient, ArrayList<Medicament> listeMedicamentsOrdonnances) {
		super();
		this.setDate(date);
		this.setMedecin(medecin);
		this.setPatient(patient);
		this.setListeMedicamentsOrdonnances(listeMedicamentsOrdonnances);
	}
	@Override
	public String toString() {
		return getMedecin().getNom() + ", " + getPatient().getNom();
	}
}
