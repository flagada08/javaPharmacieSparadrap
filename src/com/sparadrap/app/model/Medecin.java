package com.sparadrap.app.model;

import java.util.ArrayList;

import com.sparadrap.app.exception.PharmaException;

public class Medecin extends Personne{
	private int numAgrement;
	private ArrayList<Patient> listePatients;
	private ArrayList<Ordonnance> listeOrdonnances;
	private Specialite specialite;
	/**
	 * @return the numAgrement
	 */
	public int getNumAgrement() {
		return numAgrement;
	}
	/**
	 * @param numAgrement the numAgrement to set
	 */
	public void setNumAgrement(int numAgrement) {
		this.numAgrement = numAgrement;
	}
	/**
	 * @return the listPatients
	 */
	public ArrayList<Patient> getListePatients() {
		return listePatients;
	}
	/**
	 * @param listePatients the listePatients to set
	 */
	public void setListePatients(ArrayList<Patient> listePatients) {
		this.listePatients = listePatients;
	}
	/**
	 * @return the listOrdonnances
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
	 * @return the specialite
	 */
	public Specialite getSpecialite() {
		return specialite;
	}
	/**
	 * @param specialite the specialite to set
	 */
	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
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
	 * @param numAgrement
	 * @param listePatients
	 * @param listeOrdonnances
	 * @param specialite
	 * @throws PharmaException 
	 * Exception perso
	 */
	public Medecin(String nom, String prenom, int numRue, String nomRue, int codePostal, String nomVille,
			int numTelephone, String email, int numAgrement, ArrayList<Patient> listePatients,
			ArrayList<Ordonnance> listeOrdonnances, Specialite specialite) throws PharmaException {
		super(nom, prenom, numRue, nomRue, codePostal, nomVille, numTelephone, email);
		this.numAgrement = numAgrement;
		this.listePatients = listePatients;
		this.listeOrdonnances = listeOrdonnances;
		this.specialite = specialite;
	}
	@Override
	public String toString() {
		return super.getNom() + ", " + getSpecialite();
	}
}
