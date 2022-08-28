package com.sparadrap.app.controller;

import java.util.ArrayList;
import java.util.Date;

import com.sparadrap.app.model.Achat;
import com.sparadrap.app.model.Client;
import com.sparadrap.app.model.Medecin;
import com.sparadrap.app.model.Medicament;
import com.sparadrap.app.model.Mutuelle;
import com.sparadrap.app.model.Ordonnance;
import com.sparadrap.app.model.Patient;
import com.sparadrap.app.model.Specialiste;

public class Pharmacie {
	private static ArrayList<Client> listeClients = new ArrayList<Client>();
	private static ArrayList<Patient> listePatients = new ArrayList<Patient>();
	private static ArrayList<Mutuelle> listeMutuelles = new ArrayList<Mutuelle>();
	private static ArrayList<Medecin> listeMedecins = new ArrayList<Medecin>();
	private static ArrayList<Specialiste> listeSpecialistes = new ArrayList<Specialiste>();
	private static ArrayList<Medicament> listeMedicaments = new ArrayList<Medicament>();
	private static ArrayList<Achat> listeAchats = new ArrayList<Achat>();
	private static Ordonnance ordonnance;
	
	/**
	 * @return the listeClients
	 */
	public static ArrayList<Client> getListeClients() {
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
	public static ArrayList<Patient> getListePatients() {
		return listePatients;
	}

	/**
	 * @param listePatients the listePatients to set
	 */
	public void setListePatients(ArrayList<Patient> plistePatients) {
		listePatients = plistePatients;
	}

	/**
	 * @return the listeMutuelles
	 */
	public static ArrayList<Mutuelle> getListeMutuelles() {
		return listeMutuelles;
	}

	/**
	 * @param listeMutuelles the listeMutuelles to set
	 */
	public static void setListeMutuelles(ArrayList<Mutuelle> listeMutuelles) {
		Pharmacie.listeMutuelles = listeMutuelles;
	}

	/**
	 * @return the listeMedecins
	 */
	public static ArrayList<Medecin> getListeMedecins() {
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
	public static void setListeMedicaments(ArrayList<Medicament> plisteMedicaments) {
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
	 * @return the ordonnance
	 */
	public static Ordonnance getOrdonnance() {
		return ordonnance;
	}

	/**
	 * @param ordonnance the ordonnance to set
	 */
	public static void setOrdonnance(Ordonnance ordonnance) {
		Pharmacie.ordonnance = ordonnance;
	}

	public Pharmacie() {
		
	}
	
	public static void ajoutClient() {
		getListeClients().add(new Client(
					"testNomClient1", 
					"testPrenomClient1", 
					1, 
					"rue du test", 
					12345, 
					"testCity", 
					1234567890 , 
					"testClient1@test.st", 
					"31/12/1234", 
					getListeMedicaments()
				));
		getListeClients().add(new Client(
					"testNomClient2", 
					"testPrenomClient2", 
					2, 
					"rue du test", 
					12345, 
					"testCity", 
					1234567890 , 
					"testClient2@test.st", 
					"31/12/1234", 
					getListeMedicaments()
				));
		getListeClients().add(new Client(
					"testNomClient3", 
					"testPrenomClient3", 
					3, 
					"rue du test", 
					12345, 
					"testCity", 
					1234567890 , 
					"testClient3@test.st", 
					"31/12/1234", 
					getListeMedicaments()
				));
	}
	
	public static void ajoutPatient() {
		getListePatients().add(new Patient(
					"testNomPatient1", 
					"testPrenomClient1", 
					1, 
					"rue du test", 
					12345, 
					"testCity", 
					1234567890, 
					"testPatient1@test.st", 
					"31/12/1234", 
					getListeMedicaments(), 
					1234567890, 
					getListeMutuelles(), 
					getListeMedecins(),
					null,
					null, 
					getOrdonnance()
				));
	}
	
	public static void ajoutMedicament() {
		getListeMedicaments().add(new Medicament(
					"testMedoc1", 
					null, 
					10, 
					new Date(), 
					50
				));
		getListeMedicaments().add(new Medicament(
					"testMedoc2", 
					null, 
					5, 
					new Date(), 
					100
				));
		getListeMedicaments().add(new Medicament(
					"testMedoc3", 
					null, 
					25, 
					new Date(), 
					150
				));
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
