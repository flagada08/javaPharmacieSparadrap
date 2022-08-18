package com.sparadrap.app.model;

import java.util.ArrayList;

public class Medecin extends Personne{
	private int numAgrement;
	private ArrayList<Patient> listePatients;
	private ArrayList<Ordonnance> listOrdonnances;
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
	 * @param listPatients
	 * @param listOrdonnances
	 */
	public Medecin(String nom, String prenom, int numRue, String nomRue, int codePostal, String nomVille,
			int numTelephone, String email, int numAgrement, ArrayList<Patient> listPatients,
			ArrayList<Ordonnance> listOrdonnances) {
		super(nom, prenom, numRue, nomRue, codePostal, nomVille, numTelephone, email);
		this.numAgrement = numAgrement;
		this.listePatients = listPatients;
		this.listOrdonnances = listOrdonnances;
	}
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
	public ArrayList<Patient> getListPatients() {
		return listePatients;
	}
	/**
	 * @param listPatients the listPatients to set
	 */
	public void setListPatients(ArrayList<Patient> listPatients) {
		this.listePatients = listPatients;
	}
	/**
	 * @return the listOrdonnances
	 */
	public ArrayList<Ordonnance> getListOrdonnances() {
		return listOrdonnances;
	}
	/**
	 * @param listOrdonnances the listOrdonnances to set
	 */
	public void setListOrdonnances(ArrayList<Ordonnance> listOrdonnances) {
		this.listOrdonnances = listOrdonnances;
	}
}
