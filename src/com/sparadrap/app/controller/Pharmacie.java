package com.sparadrap.app.controller;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
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
	 * Serial ID pour la création du fichier de sauvegarde
	 */
	private static final long serialVersionUID = 4911578787997441779L;
	
	/**
	 * Attributs de la classe composée des listes qui seront alimentées
	 * par la saisie utilisateur
	 */
	private ArrayList<Achat> listeAchats = new ArrayList<Achat>();
	private ArrayList<Client> listeClients = new ArrayList<Client>();
	private ArrayList<Patient> listePatients = new ArrayList<Patient>();
	private ArrayList<Mutuelle> listeMutuelles = new ArrayList<Mutuelle>();
	private ArrayList<Medecin> listeMedecins = new ArrayList<Medecin>();
	private ArrayList<Medicament> listeMedicaments = new ArrayList<Medicament>();
	private ArrayList<Medicament> listeMedicamentsVendus = new ArrayList<Medicament>();
	private ArrayList<Ordonnance> listeOrdonnances = new ArrayList<Ordonnance>();
	
	public long getSerialVersionUID() {
		return serialVersionUID;
	}

	/**
	 * @return the listeAchats
	 */
	public ArrayList<Achat> getListeAchats() {
		return listeAchats;
	}
	
	/**
	 * @param pListeAchats the listeAchats to set
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
	 * @param pListeClients the listeClients to set
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
	 * @param pListePatients the listePatients to set
	 */
	public void setListePatients(ArrayList<Patient> pListePatients) {
		listePatients = pListePatients;
	}

	/**
	 * @return the listeMutuelles
	 */
	public ArrayList<Mutuelle> getListeMutuelles() {
		return listeMutuelles;
	}

	/**
	 * @param pListeMutuelles the listeMutuelles to set
	 */
	public void setListeMutuelles(ArrayList<Mutuelle> pListeMutuelles) {
		listeMutuelles = pListeMutuelles;
	}

	/**
	 * @return the listeMedecins
	 */
	public ArrayList<Medecin> getListeMedecins() {
		return listeMedecins;
	}

	/**
	 * @param pListeMedecins the listeMedecins to set
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
	 * @param pListeMedicaments the listeMedicaments to set
	 */
	public void setListeMedicaments(ArrayList<Medicament> pListeMedicaments) {
		listeMedicaments = pListeMedicaments;
	}

	/**
	 * @return the listeMedicamentsVendus
	 */
	public ArrayList<Medicament> getListeMedicamentsVendus() {
		return listeMedicamentsVendus;
	}

	/**
	 * @param pListeMedicamentsVendus the listeMedicamentsVendus to set
	 */
	public void setListeMedicamentsVendus(ArrayList<Medicament> pListeMedicamentsVendus) {
		listeMedicamentsVendus = pListeMedicamentsVendus;
	}

	/**
	 * @return the listeOrdonnances
	 */
	public ArrayList<Ordonnance> getListeOrdonnances() {
		return listeOrdonnances;
	}

	/**
	 * @param pListeOrdonnances the listeOrdonnances to set
	 */
	public void setListeOrdonnances(ArrayList<Ordonnance> pListeOrdonnances) {
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
	
	/**
	 * @param achat
	 * Ajout dynamique d'un achat et ses exceptions
	 * @throws PharmaException
	 * Exception perso
	 */
	public void ajoutAchat(Achat achat) throws PharmaException {
		getListeAchats().add(achat);
	}
	
	/**
	 * @param client
	 * Ajout dynamique d'un client et ses exceptions, ainsi qu'une simulation
	 * de données déjà stockées dans l'appli
	 * @throws PharmaException
	 * Exception perso
	 */
	public void ajoutClient(Client client) throws PharmaException {
		getListeClients().add(client);
	}
	
	public void bddClient() throws PharmaException {
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
	
/**
 * @param patient
 * Ajout dynamique d'un patient et ses exceptions, ainsi qu'une simulation
 * de données déjà stockées dans l'appli
 * @throws PharmaException
 * Exception perso
 */
	public void ajoutPatient(Patient patient) throws PharmaException {
		getListePatients().add(patient);
	}
	
	public void bddPatient() throws PharmaException {
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
				new ArrayList<Medicament>()
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
	
	/**
	 * @throws PharmaException
	 * Ajout d'une simulation de BDD médecins, crée au lancement de l'application 
	 * (voir le point d'entrée Main)
	 */
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
	
	public void ajoutOrdonnance() throws PharmaException {
		getListeOrdonnances().add(new Ordonnance(
					new Date(), 
					new Medecin(
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
						), 
					new Patient(
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
							new Mutuelle(
									"testMutuelle1", 
									"testCity1", 
									11, 
									1234567890, 
									"testMutuelle1@test.st", 
									50
								), 
							new Medecin(
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
								),
							getListeOrdonnances(), 
							getListeMedicaments()
						), 
					null
				));
	}
	
	/**
	 * Ajout d'une simulation de BDD médicaments, crée au lancement de l'application 
	 * (voir le point d'entrée Main)
	 */
	public void ajoutMedicament() {
		getListeMedicaments().add(new Medicament(
					"testMedoc1", 
					"testCatégorie1", 
					10, 
					new Date(), 
					50
				));
		getListeMedicaments().add(new Medicament(
					"testMedoc2", 
					"testCatégorie2", 
					5, 
					new Date(), 
					100
				));
		getListeMedicaments().add(new Medicament(
					"testMedoc3", 
					"testCatégorie3", 
					25, 
					new Date(), 
					150
				));
	}
	
	/**
	 * @param listeMedicamentsClients
	 * Fonction qui permet d'ajouté à une liste, le total des médicaments vendus par la pharmacie
	 */
	public void ajoutMedicamentVendu(ArrayList<Medicament> listeMedicamentsClients) {
		getListeMedicamentsVendus().addAll(listeMedicamentsClients);
	}
	
	/**
	 * Ajout d'une simulation de BDD Mutuelles, crée au lancement de l'application 
	 * (voir le point d'entrée Main)
	 */
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
					22, 
					1234567890, 
					"testMutuelle2@test.st", 
					30
				));
		getListeMutuelles().add(new Mutuelle(
				"testMutuelle3", 
				"testCity3", 
				33, 
				1234567890, 
				"testMutuelle2@test.st", 
				70
				));
	}
	
	/**
	 * Return d'un toString pour rendre les données utilisables sur des vues et utiliser les données
	 */
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
