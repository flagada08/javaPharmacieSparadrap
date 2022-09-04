package com.sparadrap.app.model;

import java.util.Date;

public class Medicament {
	
	private String nom;
	private String categorie;
	private int prix;
	private Date date;
	private int stock;
	
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
	 * @return the categorie
	 */
	public String getCategorie() {
		return categorie;
	}
	
	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	/**
	 * @return the prix
	 */
	public int getPrix() {
		return prix;
	}
	
	/**
	 * @param prix the prix to set
	 */
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}
	
	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	/**
	 * @param nom
	 * @param categorie
	 * @param prix
	 * @param date
	 * @param stock
	 */
	public Medicament(String nom, String categorie, int prix, Date date, int stock) {
		super();
		this.setNom(nom);
		this.setCategorie(categorie);
		this.setPrix(prix);
		this.setDate(date);
		this.setStock(stock);
	}
	
	@Override
	public String toString() {
		return getNom() + "=" + getPrix() + "€" + ", stock : " + stock;
	}
	
}
