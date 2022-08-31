package com.sparadrap.app.model;

import java.util.ArrayList;

import com.sparadrap.app.exception.PharmaException;

public class Patient extends Client {
	
	private long numSecuSocial;
	private Medecin medecin;
	private Mutuelle mutuelle;
	private ArrayList<Ordonnance> listeOrdonnances = new ArrayList<Ordonnance>();
	
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
	 * @param numSecuSocial
	 * @param mutuelle
	 * @param medecin
	 * @param listeOrdonnances
	 * @param listeMedicamentsClient
	 * @throws PharmaException 
	 */
	public Patient(String nom, String prenom, int numRue, String nomRue, int codePostal, String nomVille, int numTelephone, String email, 
			String dateNaissance, long numSecuSocial, Mutuelle mutuelle, Medecin medecin, ArrayList<Ordonnance> listeOrdonnances, 
			ArrayList<Medicament> listeMedicamentsClient) throws PharmaException {
		super(nom, prenom, numRue, nomRue, codePostal, nomVille, numTelephone, email, dateNaissance, listeMedicamentsClient);
		this.numSecuSocial = numSecuSocial;
		this.mutuelle = mutuelle;
		this.medecin = medecin;
		this.listeOrdonnances = listeOrdonnances;
	}

	@Override
	public String toString() {
		return "Patient ["
				+ "\nnom=" + super.getNom() 
				+ "\nprenom=" + super.getPrenom() 
				+ "\ndateNaissance=" + super.getDateNaissance() 
				+ "\nmedicament=" + super.getListeMedicamentsClient() 
				+ "\nnumTelephone=" + super.getNumTelephone() 
				+ "\nnumRue=" + super.getNumRue() 
				+ "\nadresse=" + super.getNomRue() 
				+ "\nnumSecuSocial=" + getNumSecuSocial() 
				+ "\nmutuelle=" + getMutuelle() 
				+ "\nmedecin=" + getMedecin() 
				+ "\nordonnance=" + getOrdonnance() 
				+ "\n]";
	}
}
