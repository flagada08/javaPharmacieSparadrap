package com.sparadrap.app.model;

import java.util.ArrayList;

public class Patient extends Client {
	
	private long numSecuSocial;
	private ArrayList<Mutuelle> listeMutuelles = new ArrayList<Mutuelle>();
	private ArrayList<Medecin> listeMedecins = new ArrayList<Medecin>();
	private ArrayList<Ordonnance> listeOrdonnances = new ArrayList<Ordonnance>();
	private Medecin medecin;
	private Specialiste specialiste;
	
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
	public ArrayList<Ordonnance> getOrdonnance() {
		return listeOrdonnances;
	}

	/**
	 * @param ordonnance the ordonnance to set
	 */
	public void setOrdonnance(ArrayList<Ordonnance> ordonnance) {
		this.listeOrdonnances = ordonnance;
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
	 * @param medicament 
	 * @param numSecuSocial
	 * @param mutuelle
	 * @param medecin
	 * @param specialiste
	 * @param ordonnance
	 */
	public Patient(String nom, String prenom, int numRue, String nomRue, int codePostal, String nomVille, int numTelephone, String email, 
			String dateNaissance, ArrayList<Medicament> listeMedicaments, long numSecuSocial, ArrayList<Mutuelle> ListeMutuelles, 
			ArrayList<Medecin> listeMedecins, Medecin medecin, Specialiste specialiste, ArrayList<Ordonnance> listeOrdonnances, Medicament medicament) {
		super(nom, prenom, numRue, nomRue, codePostal, nomVille, numTelephone, email, dateNaissance, medicament);
		this.numSecuSocial = numSecuSocial;
		this.listeMutuelles = ListeMutuelles;
		this.listeMedecins = listeMedecins;
		this.medecin = medecin;
		this.specialiste = specialiste;
		this.listeOrdonnances = listeOrdonnances;
	}

	@Override
	public String toString() {
		return "Patient ["
				+ "\nnom=" + super.getNom() 
				+ "\nprenom=" + super.getPrenom() 
				+ "\ndateNaissance=" + super.getDateNaissance() 
				+ "\nmedicament=" + super.getMedicament() 
				+ "\nnumTelephone=" + super.getNumTelephone() 
				+ "\nnumRue=" + super.getNumRue() 
				+ "\nadresse=" + super.getNomRue() 
				+ "\nnumSecuSocial=" + getNumSecuSocial() 
				+ "\nmutuelle=" + getListeMutuelles() 
				+ "\nmedecin=" + getListeMedecins()
				+ "\nspecialiste=" + getSpecialiste() 
				+ "\nordonnance=" + getOrdonnance() 
				+ "\n]";
	}
}
