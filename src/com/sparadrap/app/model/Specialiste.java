package com.sparadrap.app.model;

import java.util.ArrayList;

public class Specialiste extends Medecin{
	private Specialite specialite;
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
	 * @param specialite
	 */
	public Specialiste(String nom, String prenom, int numRue, String nomRue, int codePostal, String nomVille,
			int numTelephone, String email, int numAgrement, ArrayList<Patient> listPatients,
			ArrayList<Ordonnance> listOrdonnances, Specialite specialite) {
		super(nom, prenom, numRue, nomRue, codePostal, nomVille, numTelephone, email, numAgrement, listPatients,
				listOrdonnances);
		this.specialite = specialite;
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
}
