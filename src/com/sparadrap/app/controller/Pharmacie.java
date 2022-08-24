package com.sparadrap.app.controller;

import java.util.ArrayList;

import com.sparadrap.app.model.Client;
import com.sparadrap.app.model.Medecin;
import com.sparadrap.app.model.Patient;
import com.sparadrap.app.model.Specialiste;

public class Pharmacie {
	private int stockMedicament;
	private Client client;
	private ArrayList<Client> listeClients;
	private ArrayList<Patient> listePatients;
	private ArrayList<Medecin> listeMedecins;
	private ArrayList<Specialiste> listeSpecialistes;
	/**
	 * @param stockMedicament
	 * @param listeClients
	 * @param listePatient
	 * @param listeMedecins
	 * @param listeSpecialiste
	 */
	public Pharmacie(int stockMedicament, Client client, ArrayList<Client> listeClients, ArrayList<Patient> listePatients,
			ArrayList<Medecin> listeMedecins, ArrayList<Specialiste> listeSpecialistes) {
		super();
		this.stockMedicament = stockMedicament;
		this.client = client;
		this.listeClients = listeClients;
		this.listePatients = listePatients;
		this.listeMedecins = listeMedecins;
		this.listeSpecialistes = listeSpecialistes;
	}
	/**
	 * @return the stockMedicament
	 */
	public int getStockMedicament() {
		return stockMedicament;
	}
	/**
	 * @param stockMedicament the stockMedicament to set
	 */
	public void setStockMedicament(int stockMedicament) {
		this.stockMedicament = stockMedicament;
	}
	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}
	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
		client = new Client("test", null, 0, null, 0, null, 0, null, null, null);
	}
	/**
	 * @return the listeClients
	 */
	public ArrayList<Client> getListeClients() {
		return listeClients;
	}
	/**
	 * @param listeClients the listeClients to set
	 */
	public void setListeClients(ArrayList<Client> listeClients) {
		this.listeClients = listeClients;
		listeClients.add(client);
	}
	/**
	 * @return the listePatient
	 */
	public ArrayList<Patient> getListePatients() {
		return listePatients;
	}
	/**
	 * @param listePatient the listePatient to set
	 */
	public void setListePatients(ArrayList<Patient> listePatients) {
		this.listePatients = listePatients;
	}
	/**
	 * @return the listeMedecins
	 */
	public ArrayList<Medecin> getListeMedecins() {
		return listeMedecins;
	}
	/**
	 * @param listeMedecins the listeMedecins to set
	 */
	public void setListeMedecins(ArrayList<Medecin> listeMedecins) {
		this.listeMedecins = listeMedecins;
	}
	/**
	 * @return the listeSpecialiste
	 */
	public ArrayList<Specialiste> getListeSpecialistes() {
		return listeSpecialistes;
	}
	/**
	 * @param listeSpecialiste the listeSpecialiste to set
	 */
	public void setListeSpecialistes(ArrayList<Specialiste> listeSpecialistes) {
		this.listeSpecialistes = listeSpecialistes;
	}
	@Override
	public String toString() {
		return "Pharmacie [stockMedicament=" + stockMedicament + ", client=" + client + ", listeClients=" + listeClients
				+ ", listePatients=" + listePatients + ", listeMedecins=" + listeMedecins + ", listeSpecialistes="
				+ listeSpecialistes + ", getStockMedicament()=" + getStockMedicament() + ", getClient()=" + getClient()
				+ ", getListeClients()=" + getListeClients() + ", getListePatients()=" + getListePatients()
				+ ", getListeMedecins()=" + getListeMedecins() + ", getListeSpecialistes()=" + getListeSpecialistes()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
