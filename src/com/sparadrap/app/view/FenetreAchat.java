package com.sparadrap.app.view;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class FenetreAchat extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public FenetreAchat() {
		setBounds(0, 0, 700, 700);
		setBorder(new TitledBorder(null, "Achat", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblTypeAchat = new JLabel("Type d'achat");
		
		JComboBox cbTypeAchat = new JComboBox();
		cbTypeAchat.setModel(new DefaultComboBoxModel(new String[] {"Choix du type d'achat", "Achat sans ordonnance", "Achat avec ordonnance"}));
		
		JLabel lblNomClient = new JLabel("Nom du client");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblPrenomClient = new JLabel("Prénom du client");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblAdresseClient = new JLabel("Adresse du client");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblTelephoneClient = new JLabel("Téléphone du client");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblEmailClient = new JLabel("Email du client");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblNumSecuSocialClient = new JLabel("Numéro de sécurité social du client");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lblDateNaissanceClient = new JLabel("Date de Naissance du client");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JComboBox cbChoixMutuelle = new JComboBox();
		cbChoixMutuelle.setModel(new DefaultComboBoxModel(new String[] {"Choix Mutuelle"}));
		
		JLabel lblMutuelleDuClient = new JLabel("Mutuelle du client");
		
		JLabel lblMedecinClient = new JLabel("Médecin du client");
		
		JComboBox cbChoixMedecin = new JComboBox();
		cbChoixMedecin.setModel(new DefaultComboBoxModel(new String[] {"Choix Médecin"}));
		
		JLabel lblSpecialiste = new JLabel("Spécialiste (opt)");
		
		JComboBox cbChoixSpecialite = new JComboBox();
		cbChoixSpecialite.setModel(new DefaultComboBoxModel(new String[] {"Choix Spécialité"}));
		
		JLabel lblOrdonnance = new JLabel("Ordonnance");
		
		JComboBox cbChoixOrdonnance = new JComboBox();
		cbChoixOrdonnance.setModel(new DefaultComboBoxModel(new String[] {"Choix Ordonnance"}));
		
		JLabel lblListeMedicaments = new JLabel("Médicaments");
		
		JComboBox cbChoixMédicaments = new JComboBox();
		cbChoixMédicaments.setModel(new DefaultComboBoxModel(new String[] {"Choix Médicaments"}));
		
		JButton button = new JButton("New button");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(cbTypeAchat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(111)
							.addComponent(lblTypeAchat))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lblDateNaissanceClient, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNumSecuSocialClient, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
								.addComponent(lblMutuelleDuClient, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(button)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(cbChoixMutuelle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(29)
										.addComponent(lblListeMedicaments, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(cbChoixMédicaments, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNomClient, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
								.addComponent(lblAdresseClient, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
								.addComponent(lblTelephoneClient, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
								.addComponent(lblPrenomClient, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
								.addComponent(lblEmailClient, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(110)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblOrdonnance, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(cbChoixOrdonnance, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblMedecinClient, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(cbChoixMedecin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblSpecialiste, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(cbChoixSpecialite, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))))))
					.addGap(90))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(cbTypeAchat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTypeAchat))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomClient)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMedecinClient)
						.addComponent(cbChoixMedecin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblPrenomClient)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblSpecialiste))
						.addComponent(cbChoixSpecialite, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblOrdonnance))
						.addComponent(cbChoixOrdonnance, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblAdresseClient)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelephoneClient)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmailClient)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumSecuSocialClient)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDateNaissanceClient)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(cbChoixMédicaments, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblListeMedicaments))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblMutuelleDuClient)
							.addComponent(cbChoixMutuelle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
					.addComponent(button)
					.addContainerGap())
		);
		setLayout(groupLayout);

	}
}
