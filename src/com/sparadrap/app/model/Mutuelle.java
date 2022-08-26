package com.sparadrap.app.model;

public class Mutuelle {
	private String nom;
	private String siege;
	private int departement;
	private int numTelephone;
	private String email;
	private int tauxRemboursement;
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the siege
	 */
	public String getSiege() {
		return siege;
	}
	/**
	 * @param siege the siege to set
	 */
	public void setSiege(String siege) {
		this.siege = siege;
	}
	/**
	 * @return the departement
	 */
	public int getDepartement() {
		return departement;
	}
	/**
	 * @param departement the departement to set
	 */
	public void setDepartement(int departement) {
		this.departement = departement;
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
	 * @return the tauxRemboursement
	 */
	public int getTauxRemboursement() {
		return tauxRemboursement;
	}
	/**
	 * @param tauxRemboursement the tauxRemboursement to set
	 */
	public void setTauxRemboursement(int tauxRemboursement) {
		this.tauxRemboursement = tauxRemboursement;
	}
	/**
	 * @param nom
	 * @param siege
	 * @param departement
	 * @param numTelephone
	 * @param email
	 * @param tauxRemboursement
	 */
	public Mutuelle(String nom, String siege, int departement, int numTelephone, String email, int tauxRemboursement) {
		super();
		this.nom = nom;
		this.siege = siege;
		this.departement = departement;
		this.numTelephone = numTelephone;
		this.email = email;
		this.tauxRemboursement = tauxRemboursement;
	}
	@Override
	public String toString() {
		return "Mutuelle [getNom()=" + getNom() 
				+ ", getSiege()=" + getSiege() 
				+ ", getDepartement()=" + getDepartement() 
				+ ", getNumTelephone()=" + getNumTelephone()
				+ ", getEmail()=" + getEmail() 
				+ ", getTauxRemboursement()=" + getTauxRemboursement() + "]";
	}
}
