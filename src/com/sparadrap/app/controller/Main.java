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
	 * 
	 */
	private static final long serialVersionUID = -8989197673410509830L;
	private static Pharmacie pharmacie = new Pharmacie();

	/**
	 * @return the pharmacie
	 */
	public static Pharmacie getPharmacie() {
		return pharmacie;
	}

	public static void main(String[] args) {
		try {
			getPharmacie().ajoutMedicament();
			getPharmacie().ajoutMutuelle();
			getPharmacie().ajoutMedecin();
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetrePrincipale frame = new FenetrePrincipale();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
