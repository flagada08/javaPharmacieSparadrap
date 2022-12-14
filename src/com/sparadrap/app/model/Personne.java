package com.sparadrap.app.model;

import com.sparadrap.app.exception.PharmaException;

public abstract class Personne {
	
	private String nom;
	private String prenom;
	private int numRue;
	private String nomRue;
	private int codePostal;
	private String nomVille;
	private int numTelephone;
	private String email;
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 * @throws PharmaException 
	 * Exception perso
	 */
	public void setNom(String nom) throws PharmaException {
		if(nom == null || nom.trim().isEmpty()) throw new PharmaException("Nom obligatoire");
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 * @throws PharmaException 
	 * Exception perso
	 */
	public void setPrenom(String prenom) throws PharmaException {
		if(prenom == null || prenom.trim().isEmpty()) throw new PharmaException("Prénom obligatoire");
		this.prenom = prenom;
	}
	/**
	 * @return the numRue
	 */
	public int getNumRue() {
		return numRue;
	}
	/**
	 * @param numRue the numRue to set
	 */
	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}
	/**
	 * @return the nomRue
	 */
	public String getNomRue() {
		return nomRue;
	}
	/**
	 * @param nomRue the nomRue to set
	 */
	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}
	/**
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}
	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	/**
	 * @return the nomVille
	 */
	public String getNomVille() {
		return nomVille;
	}
	/**
	 * @param nomVille the nomVille to set
	 */
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	/**
	 * @return the numTelephone
	 */
	public int getNumTelephone() {
		return numTelephone;
	}
	/**
	 * @param numTelephone the numTelephone to set
	 */
	public void setNumTelephone(int numTelephone) {
		this.numTelephone = numTelephone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @throws PharmaException
	 * Exception perso
	 */
	public Personne(String nom, String prenom, int numRue, String nomRue, int codePostal, String nomVille,
			int numTelephone, String email) throws PharmaException {
		super();
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setNumRue(numRue);
		this.setNomRue(nomRue);
		this.setCodePostal(codePostal);
		this.setNomVille(nomVille);
		this.setNumTelephone(numTelephone);
		this.setEmail(email);
	}
	
	@Override
	public abstract String toString();
	
}
