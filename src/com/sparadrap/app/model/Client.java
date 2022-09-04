package com.sparadrap.app.model;

import java.util.ArrayList;

import com.sparadrap.app.exception.PharmaException;

public class Client extends Personne {
	private String dateNaissance;
	private ArrayList<Medicament> listeMedicamentsClient;
	
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
	 * @return the listeMedicamentsClient
	 */
	public ArrayList<Medicament> getListeMedicamentsClient() {
		return listeMedicamentsClient;
	}

	/**
	 * @param listeMedicamentsClient the listeMedicaments to set
	 */
	public void setListeMedicamentsClient(ArrayList<Medicament> listeMedicamentsClient) {
		this.listeMedicamentsClient = listeMedicamentsClient;
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
	 * @param listeMedicamentsClient
	 * @throws PharmaException 
	 * Exception perso
	 */
	public Client(String nom, String prenom, int numRue, String nomRue, int codePostal, String nomVille,
			int numTelephone, String email, String dateNaissance, ArrayList<Medicament> listeMedicamentsClient) throws PharmaException {
		super(nom, prenom, numRue, nomRue, codePostal, nomVille, numTelephone, email);
		this.setDateNaissance(dateNaissance);
		this.setListeMedicamentsClient(listeMedicamentsClient);
	}

	@Override
	public String toString() {
		return super.getNom() 
			 + ", " + super.getPrenom();
	}
}
