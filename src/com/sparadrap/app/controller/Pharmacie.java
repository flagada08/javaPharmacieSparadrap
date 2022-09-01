package com.sparadrap.app.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import com.sparadrap.app.exception.PharmaException;
import com.sparadrap.app.model.Achat;
import com.sparadrap.app.model.Client;
import com.sparadrap.app.model.Medecin;
import com.sparadrap.app.model.Medicament;
import com.sparadrap.app.model.Mutuelle;
import com.sparadrap.app.model.Ordonnance;
import com.sparadrap.app.model.Patient;
import com.sparadrap.app.model.Specialite;

public class Pharmacie implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3950418334702262358L;
	private static ArrayList<Achat> listeAchats = new ArrayList<Achat>();
	private static ArrayList<Client> listeClients = new ArrayList<Client>();
	private static ArrayList<Patient> listePatients = new ArrayList<Patient>();
	private static ArrayList<Mutuelle> listeMutuelles = new ArrayList<Mutuelle>();
	private static ArrayList<Medecin> listeMedecins = new ArrayList<Medecin>();
	private static ArrayList<Medicament> listeMedicaments = new ArrayList<Medicament>();
	private static ArrayList<Medicament> listeMedicamentsVendus = new ArrayList<Medicament>();
	private static ArrayList<Ordonnance> listeOrdonnances = new ArrayList<Ordonnance>();
	
	/**
	 * @return the listeAchats
	 */
	public ArrayList<Achat> getListeAchats() {
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
	public ArrayList<Client> getListeClients() {
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
	public ArrayList<Patient> getListePatients() {
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
	public ArrayList<Medicament> getListeMedicaments() {
		return listeMedicaments;
	}

	/**
	 * @param listeMedicaments the listeMedicaments to set
	 */
	public static void setListeMedicaments(ArrayList<Medicament> listeMedicaments) {
		Pharmacie.listeMedicaments = listeMedicaments;
	}

	/**
	 * @return the listeMedicamentsVendus
	 */
	public ArrayList<Medicament> getListeMedicamentsVendus() {
		return listeMedicamentsVendus;
	}

	/**
	 * @param listeMedicamentsVendus the listeMedicamentsVendus to set
	 */
	public static void setListeMedicamentsVendus(ArrayList<Medicament> listeMedicamentsVendus) {
		Pharmacie.listeMedicamentsVendus = listeMedicamentsVendus;
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
	
//	public void sauveFichier(Object objet) {
//		//écriture
//		try {
//		       FileOutputStream fileOut = new FileOutputStream("Sauvegarde");
//		       ObjectOutputStream out = new ObjectOutputStream(fileOut);
//		       out.writeObject(objet);
//		       out.close();
//		       fileOut.close();
//		       System.out.println("\nSerialisation terminée avec succès...\n");
//		 
//		     } catch (FileNotFoundException e) {
//		       e.printStackTrace();
//		     } catch (IOException e) {
//		       e.printStackTrace();
//		     }
//	}
//	
//	public static void chargeFichier(String string) {
//		//lecture
//	    Object obj = null;
//	    try {
//	      FileInputStream fileIn = new FileInputStream(string);
//	      ObjectInputStream ois = new ObjectInputStream(fileIn);
//	      obj = ois.readObject();
//	      ois.close();
//	      fileIn.close();
//	    } catch (FileNotFoundException e) {
//	      e.printStackTrace();
//	    } catch (IOException e) {
//	      e.printStackTrace();
//	    } catch (ClassNotFoundException e) {
//	      // TODO Auto-generated catch block
//	       e.printStackTrace();
//	    }
//
//	    System.out.println("Lire les données: \n");
//	    
//	      System.out.println(obj);
//	}
	
	public void ajoutAchat(Achat achat) throws PharmaException {
		getListeAchats().add(achat);
		getListeAchats().add(new Achat(new Date(),
					new Client(
							"testNomClient1", 
							"testPrenomClient1", 
							0, 
							null, 
							0, 
							null,
							0,
							null,
							null, 
							getListeMedicaments()), 
					null, 
					null, 
					null
				));
	}
	
	public void ajoutClient(Client client) throws PharmaException {
		getListeClients().add(client);
		getListeClients().add(new Client(
					"testNomClient1", 
					"testPrenomClient1", 
					1, 
					"rue du test", 
					12345, 
					"testCity1", 
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
					"testCity2", 
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
					"testCity3", 
					1234567890 , 
					"testClient3@test.st", 
					"31/12/1234", 
					getListeMedicaments()
				));
	}
	
	public void ajoutPatient(Patient patient) throws PharmaException {
		getListePatients().add(patient);
		getListePatients().add(new Patient(
					"testNomPatient1", 
					"testPrenomPatient1", 
					1, 
					"rue du test", 
					12345, 
					"testCity1", 
					1234567890, 
					"testPatient1@test.st", 
					"31/12/1234", 
					1234567890123456L, 
					null, 
					null,
					getListeOrdonnances(), 
					null
				));
		getListePatients().add(new Patient(
					"testNomPatient2", 
					"testPrenomPatient2", 
					1, 
					"rue du test", 
					12345, 
					"testCity2", 
					1234567890, 
					"testPatient1@test.st", 
					"31/12/1234", 
					1234567890123456L, 
					null, 
					null,
					getListeOrdonnances(), 
					null
				));
		getListePatients().add(new Patient(
					"testNomPatient3", 
					"testPrenomPatient3", 
					1, 
					"rue du test", 
					12345, 
					"testCity3", 
					1234567890, 
					"testPatient1@test.st", 
					"31/12/1234", 
					1234567890123456L, 
					null, 
					null,
					getListeOrdonnances(), 
					null
				));
	}
	
	public void ajoutMedecin() throws PharmaException {
		getListeMedecins().add(new Medecin(
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
				));
		getListeMedecins().add(new Medecin(
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
				));
		getListeMedecins().add(new Medecin(
					"testNomMedecin3", 
					"testPrenomMedecin3", 
					1, 
					"rue du test", 
					12345, 
					"testCity3", 
					1234567890, 
					"testMedecin1@test.st", 
					12345678, 
					listePatients, 
					listeOrdonnances, 
					Specialite.DERMATO
				));
	}
	
	public void ajoutMedicament() {
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
	
	public void ajoutMedicamentVendu(ArrayList<Medicament> listeMedicamentsClients) {
		getListeMedicamentsVendus().addAll(listeMedicamentsClients);
	}
	
	public void ajoutMutuelle() {
		getListeMutuelles().add(new Mutuelle(
					"testMutuelle1", 
					"testCity1", 
					11, 
					1234567890, 
					"testMutuelle1@test.st", 
					50
				));
		getListeMutuelles().add(new Mutuelle(
					"testMutuelle2", 
					"testCity2", 
					11, 
					1234567890, 
					"testMutuelle2@test.st", 
					50
				));
		getListeMutuelles().add(new Mutuelle(
				"testMutuelle3", 
				"testCity3", 
				11, 
				1234567890, 
				"testMutuelle2@test.st", 
				50
				));
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
