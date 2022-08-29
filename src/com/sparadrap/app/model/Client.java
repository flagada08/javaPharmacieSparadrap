package com.sparadrap.app.model;

public class Client extends Personne {
	private String dateNaissance;
	private Medicament medicament;
	
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
	public Medicament getMedicament() {
		return medicament;
	}

	/**
	 * @param medicament the medicament to set
	 */
	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
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
			int numTelephone, String email, String dateNaissance, Medicament medicament) {
		super(nom, prenom, numRue, nomRue, codePostal, nomVille, numTelephone, email);
		this.dateNaissance = dateNaissance;
		this.medicament = medicament;
	}

	@Override
	public String toString() {
		return "Client ["
				+ "\nnom=" + super.getNom() 
				+ "\nprenom=" + super.getPrenom() 
				+ "\ndateNaissance=" + getDateNaissance() 
				+ "\nmedicament=" + getMedicament() 
				+ "\n]";
	}
}
