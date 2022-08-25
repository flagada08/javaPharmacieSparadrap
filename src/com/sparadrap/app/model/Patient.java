package com.sparadrap.app.model;

import java.util.ArrayList;

public class Patient extends Client {
	
	private int numSecuSocial;
	private Mutuelle mutuelle;
	private Medecin medecin;
	private Specialiste specialiste;
	private Ordonnance ordonnance;
	
	/**
	 * @return the numSecuSocial
	 */
	public int getNumSecuSocial() {
		return numSecuSocial;
	}

	/**
	 * @param numSecuSocial the numSecuSocial to set
	 */
	public void setNumSecuSocial(int numSecuSocial) {
		this.numSecuSocial = numSecuSocial;
	}

	/**
	 * @return the mutuelle
	 */
	public Mutuelle getMutuelle() {
		return mutuelle;
	}

	/**
	 * @param mutuelle the mutuelle to set
	 */
	public void setMutuelle(Mutuelle mutuelle) {
		this.mutuelle = mutuelle;
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
	 * @return the ordonnance
	 */
	public Ordonnance getOrdonnance() {
		return ordonnance;
	}

	/**
	 * @param ordonnance the ordonnance to set
	 */
	public void setOrdonnance(Ordonnance ordonnance) {
		this.ordonnance = ordonnance;
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param numRue
	 * @param nomRue
	 * @param codePostal
	 * @param nomVille
	 * @param numTelephone
	 * @param email
	 * @param dateNaissance
	 * @param listeMedicaments
	 * @param numSecuSocial
	 * @param mutuelle
	 * @param medecin
	 * @param specialiste
	 * @param ordonnance
	 */
	public Patient(String nom, String prenom, int numRue, String nomRue, int codePostal, String nomVille,
			int numTelephone, String email, String dateNaissance, ArrayList<Medicament> listeMedicaments,
			int numSecuSocial, Mutuelle mutuelle, Medecin medecin, Specialiste specialiste, Ordonnance ordonnance) {
		super(nom, prenom, numRue, nomRue, codePostal, nomVille, numTelephone, email, dateNaissance, listeMedicaments);
		this.numSecuSocial = numSecuSocial;
		this.mutuelle = mutuelle;
		this.medecin = medecin;
		this.specialiste = specialiste;
		this.ordonnance = ordonnance;
	}

	@Override
	public String toString() {
		return "Patient [nom=" + super.getNom() + ", prenom=" + super.getPrenom() + ", numSecuSocial=" + getNumSecuSocial() + ", mutuelle=" + getMutuelle() + ", medecin=" + getMedecin()
				+ ", specialiste=" + getSpecialiste() + ", ordonnance=" + getOrdonnance() + "]";
	}
}
