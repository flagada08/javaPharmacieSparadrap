package com.sparadrap.app.controller;

import java.util.ArrayList;
import java.util.Date;

import com.sparadrap.app.model.Achat;
import com.sparadrap.app.model.Client;
import com.sparadrap.app.model.Medecin;
import com.sparadrap.app.model.Medicament;
import com.sparadrap.app.model.Patient;
import com.sparadrap.app.model.Specialiste;

public class Pharmacie {
	private static ArrayList<Client> listeClients = new ArrayList<Client>();
	private static ArrayList<Patient> listePatients = new ArrayList<Patient>();
	private static ArrayList<Medecin> listeMedecins = new ArrayList<Medecin>();
	private static ArrayList<Specialiste> listeSpecialistes = new ArrayList<Specialiste>();
	private static ArrayList<Medicament> listeMedicaments = new ArrayList<Medicament>();
	private static ArrayList<Achat> listeAchats = new ArrayList<Achat>();
	
	/**
	 * @return the listeClients
	 */
	public ArrayList<Client> getListeClients() {
		return listeClients;
	}

	/**
	 * @param listeClients the listeClients to set
	 */
	public void setListeClients(ArrayList<Client> plisteClients) {
		listeClients = plisteClients;
	}

	/**
	 * @return the listePatients
	 */
	public ArrayList<Patient> getListePatients() {
		return listePatients;
	}

	/**
	 * @param listePatients the listePatients to set
	 */
	public void setListePatients(ArrayList<Patient> plistePatients) {
		listePatients = plistePatients;
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
	public void setListeMedecins(ArrayList<Medecin> plisteMedecins) {
		listeMedecins = plisteMedecins;
	}

	/**
	 * @return the listeSpecialistes
	 */
	public ArrayList<Specialiste> getListeSpecialistes() {
		return listeSpecialistes;
	}

	/**
	 * @param listeSpecialistes the listeSpecialistes to set
	 */
	public void setListeSpecialistes(ArrayList<Specialiste> plisteSpecialistes) {
		listeSpecialistes = plisteSpecialistes;
	}

	/**
	 * @return the listeMedicaments
	 */
	public static ArrayList<Medicament> getListeMedicaments() {
		return listeMedicaments;
	}

	/**
	 * @param listeMedicaments the listeMedicaments to set
	 */
	public void setListeMedicaments(ArrayList<Medicament> plisteMedicaments) {
		listeMedicaments = plisteMedicaments;
	}

	/**
	 * @return the listeAchats
	 */
	public ArrayList<Achat> getListeAchats() {
		return listeAchats;
	}

	/**
	 * @param listeAchats the listeAchats to set
	 */
	public void setListeAchats(ArrayList<Achat> plisteAchats) {
		listeAchats = plisteAchats;
	}

	/**
	 * @param medicament
	 * @param listeClients
	 * @param listePatients
	 * @param listeMedecins
	 * @param listeSpecialistes
	 * @param listeMedicaments
	 */
	public Pharmacie(ArrayList<Client> plisteClients, ArrayList<Patient> plistePatients,
			ArrayList<Medecin> plisteMedecins, ArrayList<Specialiste> plisteSpecialistes,
			ArrayList<Medicament> plisteMedicaments) {
		super();
		listeClients = plisteClients;
		listePatients = plistePatients;
		listeMedecins = plisteMedecins;
		listeSpecialistes = plisteSpecialistes;
		listeMedicaments = plisteMedicaments;
	}
	
	public static void ajoutMedicament() {
		getListeMedicaments().add(new Medicament("testMedoc1", null, 10, new Date(), 50));
		getListeMedicaments().add(new Medicament("testMedoc2", null, 5, new Date(), 100));
		getListeMedicaments().add(new Medicament("testMedoc3", null, 25, new Date(), 150));
	}

	@Override
	public String toString() {
		return "Pharmacie [getListeClients()=" + getListeClients()
				+ ", getListePatients()=" + getListePatients() 
				+ ", getListeMedecins()=" + getListeMedecins()
				+ ", getListeSpecialistes()=" + getListeSpecialistes() 
				+ ", getListeMedicaments()=" + getListeMedicaments() + "]";
	}
	
}
