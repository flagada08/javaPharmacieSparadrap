package com.sparadrap.app.controller;

import java.awt.EventQueue;
import java.io.Serializable;
import javax.swing.UIManager;

import com.sparadrap.app.view.FenetrePrincipale;

/**
 * @author User-05
 */
public class Main implements Serializable {	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8989197673410509830L;
	/**
	 * Création de la Pharmacie dans le point d'entrée de l'application
	 */
	private static Pharmacie pharmacieSparadrap = new Pharmacie();

	/**
	 * getter de la Pharmacie
	 * @return the pharmacieSparadrap
	 */
	public static Pharmacie getPharmacie() {
		return pharmacieSparadrap;
	}

	public static void main(String[] args) {
		/**
		 * Appels aux fonctions de la pharmacie afin d'alimenter l'application en données
		 * pour simuler la BDD d'une pharmacie
		 */
		try {
			getPharmacie().ajoutMedicament();
			getPharmacie().ajoutMutuelle();
			getPharmacie().ajoutMedecin();
			getPharmacie().ajoutOrdonnance();
			getPharmacie().bddClient();
			getPharmacie().bddPatient();
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				/**
				 * Appel de la frame principale qui contient toutes les vues de l'application
				 * par superposition de panels dans cette dernière, ainsi que l'utilisation du 
				 * setter de visibilité
				 */
				try {
					FenetrePrincipale frame = new FenetrePrincipale();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
