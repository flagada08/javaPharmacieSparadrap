package com.sparadrap.app.model;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFormattedTextField;

public class Client extends Personne {
	private String dateNaissance;
	private ArrayList<Medicament> listeMedicaments;
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
	 * @param medicament
	 */
	public Client(String nom, String prenom, int numRue, String nomRue, int codePostal, String nomVille,
			int numTelephone, String email, String dateNaissance, ArrayList<Medicament> listeMedicaments) {
		super(nom, prenom, numRue, nomRue, codePostal, nomVille, numTelephone, email);
		this.dateNaissance = dateNaissance;
		this.listeMedicaments = listeMedicaments;
	}
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
	 * @return the medicament
	 */
	public ArrayList<Medicament> getMedicament() {
		return listeMedicaments;
	}
	/**
	 * @param medicament the medicament to set
	 */
	public void setMedicament(ArrayList<Medicament> listeMedicaments) {
		this.listeMedicaments = listeMedicaments;
	}
	@Override
	public String toString() {
		return "Client [dateNaissance=" + dateNaissance 
				+ " nom=" + super.getNom() 
				+ " prenom=" + super.getPrenom() 
				+ " medicament=" + getMedicament() + "]";
	}
}
