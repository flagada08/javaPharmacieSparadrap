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
import com.sparadrap.app.model.Specialite;

public class Pharmacie {
	private static ArrayList<Achat> listeAchats = new ArrayList<Achat>();
	private static ArrayList<Client> listeClients = new ArrayList<Client>();
	private static ArrayList<Patient> listePatients = new ArrayList<Patient>();
	private static ArrayList<Mutuelle> listeMutuelles = new ArrayList<Mutuelle>();
	private static ArrayList<Medecin> listeMedecins = new ArrayList<Medecin>();
	private static ArrayList<Medicament> listeMedicaments = new ArrayList<Medicament>();
	private static ArrayList<Medicament> listeMedicamentsClient = new ArrayList<Medicament>();
	private static ArrayList<Medicament> listeMedicamentsPatient = new ArrayList<Medicament>();
	private static ArrayList<Ordonnance> listeOrdonnances = new ArrayList<Ordonnance>();
	private static Medecin medecin1 = new Medecin(
			"testNomMedecin1", 
			"testPrenomMedecin1", 
			1, 
			"rue du test", 
			12345, 
			"testCity1", 
			1234567890, 
			"testMedecin1@test.st", 
			12345678, 
			listePatients, 
			listeOrdonnances, 
			Specialite.GYNECO
		);
	private static Medecin medecin2 = new Medecin(
			"testNomMedecin2", 
			"testPrenomMedecin2", 
			1, 
			"rue du test", 
			12345, 
			"testCity2", 
			1234567890, 
			"testMedecin1@test.st", 
			12345678, 
			listePatients, 
			listeOrdonnances, 
			Specialite.CARDIO
			);
	private static Mutuelle mutuelle1 = new Mutuelle(
			"testMutuelle1", 
			"testCity1", 
			11, 
			1234567890, 
			"testMutuelle1@test.st", 
			50
		);
	private static Mutuelle mutuelle2 = new Mutuelle(
			"testMutuelle2", 
			"testCity2", 
			11, 
			1234567890, 
			"testMutuelle2@test.st", 
			50
		);
	
	/**
	 * @return the listeAchats
	 */
	public static ArrayList<Achat> getListeAchats() {
		return listeAchats;
	}
	
	/**
	 * @param listeAchats the listeAchats to set
	 */
	public void setListeAchats(ArrayList<Achat> pListeAchats) {
		listeAchats = pListeAchats;
	}
	
	/**
	 * @return the listeClients
	 */
	public static ArrayList<Client> getListeClients() {
		return listeClients;
	}

	/**
	 * @param listeClients the listeClients to set
	 */
	public void setListeClients(ArrayList<Client> pListeClients) {
		listeClients = pListeClients;
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
	public void setListePatients(ArrayList<Patient> pListePatients) {
		listePatients = pListePatients;
	}

	/**
	 * @return the listeMutuelles
	 */
	public static ArrayList<Mutuelle> getListeMutuelles() {
		return listeMutuelles;
	}

	/**
	 * @param pListeMutuelles the listeMutuelles to set
	 */
	public static void setListeMutuelles(ArrayList<Mutuelle> pListeMutuelles) {
		Pharmacie.listeMutuelles = pListeMutuelles;
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
	public void setListeMedecins(ArrayList<Medecin> pListeMedecins) {
		listeMedecins = pListeMedecins;
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
	public static void setListeMedicaments(ArrayList<Medicament> listeMedicaments) {
		Pharmacie.listeMedicaments = listeMedicaments;
	}

	/**
	 * @return the listeMedicamentsClient
	 */
	public static ArrayList<Medicament> getListeMedicamentsClient() {
		return listeMedicamentsClient;
	}

	/**
	 * @param listeMedicamentsClient the listeMedicamentsClient to set
	 */
	public static void setListeMedicamentsClient(ArrayList<Medicament> listeMedicamentsClient) {
		Pharmacie.listeMedicamentsClient = listeMedicamentsClient;
	}

	/**
	 * @return the listeMedicaments
	 */
	public static ArrayList<Medicament> getListeMedicamentsPatient() {
		return listeMedicamentsPatient;
	}

	/**
	 * @param listeMedicaments the listeMedicaments to set
	 */
	public static void setListeMedicamentsPatient(ArrayList<Medicament> pListeMedicamentsPatient) {
		listeMedicamentsPatient = pListeMedicamentsPatient;
	}

	/**
	 * @return the ordonnance
	 */
	public static ArrayList<Ordonnance> getListeOrdonnances() {
		return listeOrdonnances;
	}

	/**
	 * @param ordonnance the ordonnance to set
	 */
	public static void setListeOrdonnances(ArrayList<Ordonnance> pListeOrdonnances) {
		listeOrdonnances = pListeOrdonnances;
	}

	public Pharmacie() {
		
	}
	
	public static void ajoutAchat(Achat achat) {
		getListeAchats().add(achat);
	}
	
	public static void ajoutClient(Client client) {
		getListeClients().add(client);
//		getListeClients().add(new Client(
//					"testNomClient1", 
//					"testPrenomClient1", 
//					1, 
//					"rue du test", 
//					12345, 
//					"testCity1", 
//					1234567890 , 
//					"testClient1@test.st", 
//					"31/12/1234", 
//					null
//				));
//		getListeClients().add(new Client(
//					"testNomClient2", 
//					"testPrenomClient2", 
//					2, 
//					"rue du test", 
//					12345, 
//					"testCity2", 
//					1234567890 , 
//					"testClient2@test.st", 
//					"31/12/1234",
//					null
//				));
//		getListeClients().add(new Client(
//					"testNomClient3", 
//					"testPrenomClient3", 
//					3, 
//					"rue du test", 
//					12345, 
//					"testCity3", 
//					1234567890 , 
//					"testClient3@test.st", 
//					"31/12/1234", 
//					null
//				));
	}
	
	public static void ajoutPatient() {
//		getListePatients().add(new Patient(
//					"testNomPatient1", 
//					"testPrenomPatient1", 
//					1, 
//					"rue du test", 
//					12345, 
//					"testCity1", 
//					1234567890, 
//					"testPatient1@test.st", 
//					"31/12/1234", 
//					1234567890123456L, 
//					mutuelle1, 
//					medecin1,
//					getListeOrdonnances(), 
//					null
//				));
	}
	
	public static void ajoutMedecin() {
		getListeMedecins().add(medecin1);
		getListeMedecins().add(medecin2);
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
	
	public static void ajoutMutuelle() {
		getListeMutuelles().add(mutuelle1);
		getListeMutuelles().add(mutuelle2);
	}

	@Override
	public String toString() {
		return "Pharmacie ["
				+ "getListeClients()=" + getListeClients()
				+ "\ngetListePatients()=" + getListePatients() 
				+ "\ngetListeMedecins()=" + getListeMedecins()
				+ "\ngetListeMedicaments()=" + getListeMedicaments() 
				+ "]";
	}
	
}
