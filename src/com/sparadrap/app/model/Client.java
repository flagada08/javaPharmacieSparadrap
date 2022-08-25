package com.sparadrap.app.model;

import java.util.ArrayList;

public class Client extends Personne {
	private String dateNaissance;
	private ArrayList<Medicament> listeMedicaments;
	
	/**
	 * @return the dateNaissance
	 */
	public String getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
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
	 */
	public Client(String nom, String prenom, int numRue, String nomRue, int codePostal, String nomVille,
			int numTelephone, String email, String dateNaissance, ArrayList<Medicament> listeMedicaments) {
		super(nom, prenom, numRue, nomRue, codePostal, nomVille, numTelephone, email);
		this.dateNaissance = dateNaissance;
		this.listeMedicaments = listeMedicaments;
		System.out.println(getListeMedicaments());
	}

	@Override
	public String toString() {
		return "Client [dateNaissance=" + dateNaissance 
				+ " nom=" + super.getNom() 
				+ " prenom=" + super.getPrenom() 
				+ " medicament=" + getListeMedicaments() + "]";
	}
}
