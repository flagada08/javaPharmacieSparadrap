package com.sparadrap.app.view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;

import com.sparadrap.app.model.Achat;

import static com.sparadrap.app.controller.Main.*;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.UIManager;

public class FenetreHistoriqueAchat extends JPanel {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4320530602281803769L;
	
	private ArrayList<Achat> listeAchats;
	private JTable tableHistoriqueAchats;
	private Object[][] dataAchats;
	private String[] nomColonnes = {"Date achat", "Nom client", "Prénom client", "Date de naissance", "Médicaments achetés", "Médecin"};
    private JScrollPane scrollpane;


	/**
	 * Constructeur du JPanel.
	 */
	public FenetreHistoriqueAchat() {
		initComposants();
	}
	
	/**
	 * Fonction qui rempli et créer le contenu du JTable.
	 */
	public void tableauAchats() {
		listeAchats = getPharmacie().getListeAchats();
		dataAchats = new Object[listeAchats.size()][6];
		int i = 0;
		for (Achat objetAchat : listeAchats) {
			dataAchats[i][0] = objetAchat.getDateAchat();
			dataAchats[i][1] = objetAchat.getClient().getNom().toUpperCase();
			dataAchats[i][2] = objetAchat.getClient().getPrenom();
			dataAchats[i][3] = objetAchat.getClient().getDateNaissance();
			dataAchats[i][4] = objetAchat.getClient().getListeMedicamentsClient();
			dataAchats[i][5] = objetAchat.getPatient().getMedecin();
			i++;
		}
		tableHistoriqueAchats = new JTable(dataAchats, nomColonnes);
		scrollpane = new JScrollPane(tableHistoriqueAchats);
		tableHistoriqueAchats.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));
	}
	
	/**
	 * Create the panel.
	 */
	private void initComposants() {
		setBounds(50, 50, 700, 500);
		setBorder(new TitledBorder(null, "Historique des achats", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		tableauAchats();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollpane, GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollpane, GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
	}
}
