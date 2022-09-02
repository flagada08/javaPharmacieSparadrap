package com.sparadrap.app.view;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;

import com.sparadrap.app.model.Achat;

import static com.sparadrap.app.controller.Main.*;

import java.util.ArrayList;

import javax.swing.JTable;

public class FenetreHistoriqueAchat extends JPanel {
	private ArrayList<Achat> listeAchats;
	private JTable tableHistoriqueAchats;
	private Object[][] dataAchats;
	private String[] nomColonnes = {"Date achat", "Nom client", "Prénom client", "Date de naissance", "Médicaments achetés"};

	/**
	 * Create the panel.
	 */
	public FenetreHistoriqueAchat() {
		initComposants();
	}
	
	public void tableauAchats() {
		listeAchats = getPharmacie().getListeAchats();
		dataAchats = new Object[listeAchats.size()][5];
		int i = 0;
		for (Achat objet : listeAchats) {
			dataAchats[i][0] = objet.getDateAchat();
			dataAchats[i][1] = objet.getPatient().getNom();
			dataAchats[i][2] = objet.getPatient().getPrenom();
			dataAchats[i][3] = objet.getPatient().getDateNaissance();
			dataAchats[i][4] = objet.getPatient().getListeMedicamentsClient();
			i++;
		}
		tableHistoriqueAchats = new JTable(dataAchats, nomColonnes);
	}

	private void initComposants() {
		setBounds(50, 50, 600, 500);
		setBorder(new TitledBorder(null, "Historique des achats", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		tableauAchats();
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
