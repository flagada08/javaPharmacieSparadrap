package com.sparadrap.app.view;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;

import com.sparadrap.app.controller.Pharmacie;

import javax.swing.JTable;

public class FenetreHistoriqueAchat extends JPanel {
	private JTable tableHistoriqueAchats;

	/**
	 * Create the panel.
	 */
	public FenetreHistoriqueAchat() {
		initComposants();
	}
	
	public void tableauAchats() {
		
	}

	private void initComposants() {
		setBounds(50, 50, 600, 500);
		setBorder(new TitledBorder(null, "Historique des achats", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		tableHistoriqueAchats = new JTable();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(4)
					.addComponent(tableHistoriqueAchats, GroupLayout.PREFERRED_SIZE, 580, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(9)
					.addComponent(tableHistoriqueAchats, GroupLayout.PREFERRED_SIZE, 464, GroupLayout.PREFERRED_SIZE))
		);
		setLayout(groupLayout);
	}
}
