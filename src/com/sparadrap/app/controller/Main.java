package com.sparadrap.app.controller;

import java.awt.EventQueue;

import javax.swing.UIManager;

import com.sparadrap.app.view.FenetrePrincipale;

/**
 * @author User-05
 */
public class Main {
	
	public static void main(String[] args) {
		try {
			Pharmacie.ajoutMedicament();
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
