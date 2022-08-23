package com.sparadrap.app.view;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sparadrap.app.model.Medecin;
import com.sparadrap.app.model.Medicament;
import com.sparadrap.app.model.Mutuelle;
import com.sparadrap.app.model.Ordonnance;
import com.sparadrap.app.model.Specialite;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;

public class PanelAchatAvecOrdonnance extends JPanel {
	private JTextField tfAdresseClient;
	private JTextField tfTelephoneClient;
	private JTextField tfEmailClient;
	private JTextField tfNumSecuSocialClient;
	private JComboBox<Medecin> cbChoixMedecin;
	private JComboBox<Specialite> cbChoixSpecialite;
	private JComboBox<Ordonnance> cbChoixOrdonnance;
	private JComboBox<Mutuelle> cbChoixMutuelle;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * Create the panel.
	 */
	public PanelAchatAvecOrdonnance() {
		components();
	}
	private void components() {
		setBounds(0, 0, 600, 500);
		setBorder(new TitledBorder(null, "Achat avec Ordonnance", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JLabel lblAdresseClient = new JLabel("Adresse du client");
		lblAdresseClient.setBounds(16, 142, 108, 14);
		
		tfAdresseClient = new JTextField();
		tfAdresseClient.setBounds(142, 139, 86, 20);
		tfAdresseClient.setColumns(10);
		
		JLabel lblTelephoneClient = new JLabel("Téléphone du client");
		lblTelephoneClient.setBounds(16, 186, 108, 14);
		
		tfTelephoneClient = new JTextField();
		tfTelephoneClient.setBounds(142, 183, 86, 20);
		tfTelephoneClient.setColumns(10);
		
		JLabel lblEmailClient = new JLabel("Email du client");
		lblEmailClient.setBounds(16, 224, 108, 14);
		
		tfEmailClient = new JTextField();
		tfEmailClient.setBounds(142, 221, 86, 20);
		tfEmailClient.setColumns(10);
		
		JLabel lblNumSecuSocialClient = new JLabel("Numéro de sécurité social du client");
		lblNumSecuSocialClient.setBounds(16, 262, 179, 14);
		
		tfNumSecuSocialClient = new JTextField();
		tfNumSecuSocialClient.setBounds(213, 259, 86, 20);
		tfNumSecuSocialClient.setColumns(10);
		
		cbChoixMutuelle = new JComboBox();
		cbChoixMutuelle.setBounds(213, 341, 96, 20);
		cbChoixMutuelle.setModel(new DefaultComboBoxModel(new String[] {"Choix Mutuelle"}));
		
		JLabel lblMutuelleDuClient = new JLabel("Mutuelle du client");
		lblMutuelleDuClient.setBounds(16, 344, 179, 14);
		
		JLabel lblMedecinClient = new JLabel("Médecin du client");
		lblMedecinClient.setBounds(338, 57, 108, 14);
		
		cbChoixMedecin = new JComboBox<>();
		cbChoixMedecin.setBounds(464, 54, 95, 20);
		cbChoixMedecin.setModel(new DefaultComboBoxModel(new String[] {"Choix Médecin"}));
		
		JLabel lblSpecialiste = new JLabel("Spécialiste (opt)");
		lblSpecialiste.setBounds(338, 98, 108, 14);
		
		cbChoixSpecialite = new JComboBox();
		cbChoixSpecialite.setBounds(464, 95, 95, 20);
		cbChoixSpecialite.setModel(new DefaultComboBoxModel(new String[] {"Choix Spécialité"}));
		
		JLabel lblOrdonnance = new JLabel("Ordonnance");
		lblOrdonnance.setBounds(338, 142, 108, 14);
		
		cbChoixOrdonnance = new JComboBox();
		cbChoixOrdonnance.setBounds(464, 139, 95, 20);
		cbChoixOrdonnance.setModel(new DefaultComboBoxModel(new String[] {"Choix Ordonnance"}));
		
		JLabel lblNomClient = new JLabel("Nom du client");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblPrenomClient = new JLabel("Prénom du client");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblDateNaissanceClient = new JLabel("Date de Naissance du client");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblListeMedicaments = new JLabel("Médicaments");
		
		JComboBox cbChoixMédicaments = new JComboBox();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEmailClient)
						.addComponent(lblAdresseClient)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNumSecuSocialClient)
								.addComponent(lblMutuelleDuClient))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(cbChoixMutuelle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfNumSecuSocialClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNomClient, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
									.addGap(118)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblPrenomClient, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
									.addGap(103)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblDateNaissanceClient, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
									.addGap(50)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblTelephoneClient)
										.addComponent(lblListeMedicaments, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
									.addGap(89)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(tfTelephoneClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(cbChoixMédicaments, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
										.addComponent(tfAdresseClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(tfEmailClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addGap(83)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMedecinClient)
								.addComponent(lblOrdonnance)
								.addComponent(lblSpecialiste))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(cbChoixSpecialite, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(cbChoixMedecin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(cbChoixOrdonnance, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNomClient)
						.addComponent(lblOrdonnance)
						.addComponent(cbChoixOrdonnance, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPrenomClient)
						.addComponent(lblMedecinClient)
						.addComponent(cbChoixMedecin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDateNaissanceClient)
						.addComponent(lblSpecialiste)
						.addComponent(cbChoixSpecialite, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbChoixMédicaments, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblListeMedicaments))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfTelephoneClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelephoneClient))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAdresseClient)
						.addComponent(tfAdresseClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmailClient)
						.addComponent(tfEmailClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumSecuSocialClient)
						.addComponent(tfNumSecuSocialClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMutuelleDuClient)
						.addComponent(cbChoixMutuelle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(66, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
}
