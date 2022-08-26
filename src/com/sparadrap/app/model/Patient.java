package com.sparadrap.app.model;

import java.util.ArrayList;

public class Patient extends Client {
	
	private long numSecuSocial;
	private ArrayList<Mutuelle> listeMutuelles = new ArrayList<Mutuelle>();
	private ArrayList<Medecin> listeMedecins = new ArrayList<Medecin>();
	private Medecin medecin;
	private Specialiste specialiste;
	private Ordonnance ordonnance;
	
	/**
	 * @return the numSecuSocial
	 */
	public long getNumSecuSocial() {
		return numSecuSocial;
	}

	/**
	 * @param numSecuSocial the numSecuSocial to set
	 */
	public void setNumSecuSocial(long numSecuSocial) {
		this.numSecuSocial = numSecuSocial;
	}

	/**
	 * @return the listeMutuelles
	 */
	public ArrayList<Mutuelle> getListeMutuelles() {
		return listeMutuelles;
	}

	/**
	 * @param listeMutuelles the listeMutuelles to set
	 */
	public void setListeMutuelles(ArrayList<Mutuelle> listeMutuelles) {
		this.listeMutuelles = listeMutuelles;
	}

	/**
	 * @return the listeMedecins
	 */
	public ArrayList<Medecin> getListeMedecins() {
		return listeMedecins;
	}

	/**
	 * @param listeMedecins the listeMedecins to set
	 */
	public void setListeMedecins(ArrayList<Medecin> listeMedecins) {
		this.listeMedecins = listeMedecins;
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
			long numSecuSocial, ArrayList<Mutuelle> ListeMutuelles, ArrayList<Medecin> listeMedecins, Medecin medecin, Specialiste specialiste, Ordonnance ordonnance) {
		super(nom, prenom, numRue, nomRue, codePostal, nomVille, numTelephone, email, dateNaissance, listeMedicaments);
		this.numSecuSocial = numSecuSocial;
		this.listeMutuelles = ListeMutuelles;
		this.listeMedecins = listeMedecins;
		this.medecin = medecin;
		this.specialiste = specialiste;
		this.ordonnance = ordonnance;
	}

	@Override
	public String toString() {
		return "Patient [nom=" + super.getNom() 
				+ ", prenom=" + super.getPrenom() 
				+ ", numSecuSocial=" + getNumSecuSocial() 
				+ ", mutuelle=" + getListeMutuelles() 
				+ ", medecin=" + getListeMedecins()
				+ ", specialiste=" + getSpecialiste() 
				+ ", ordonnance=" + getOrdonnance() + "]";
	}
}
