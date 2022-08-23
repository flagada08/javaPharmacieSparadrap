package com.sparadrap.app.view;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sparadrap.app.model.Medicament;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;

public class PanelAchatSansOrdonnance extends JPanel {
	private JTextField tfNomClient;
	private JTextField tfPrenomClient;
	private JTextField tfDateNaissanceClient;
	private JComboBox<Medicament> cbChoixMédicaments;
	/**
	 * Create the panel.
	 */
	public PanelAchatSansOrdonnance() {
		components();
	}
	private void components() {
		setBounds(0, 0, 600, 500);
		setBorder(new TitledBorder(null, "Achat sans Ordonnance", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JLabel lblNomClient = new JLabel("Nom du client");
		lblNomClient.setBounds(16, 57, 108, 14);
		
		tfNomClient = new JTextField();
		tfNomClient.setBounds(142, 54, 86, 20);
		tfNomClient.setColumns(10);
		
		JLabel lblPrenomClient = new JLabel("Prénom du client");
		lblPrenomClient.setBounds(16, 98, 108, 14);
		
		tfPrenomClient = new JTextField();
		tfPrenomClient.setBounds(142, 95, 86, 20);
		tfPrenomClient.setColumns(10);
				
		JLabel lblDateNaissanceClient = new JLabel("Date de Naissance du client");
		lblDateNaissanceClient.setBounds(16, 300, 179, 14);
		
		tfDateNaissanceClient = new JTextField();
		tfDateNaissanceClient.setBounds(213, 297, 86, 20);
		tfDateNaissanceClient.setColumns(10);
				
		JLabel lblListeMedicaments = new JLabel("Médicaments");
		lblListeMedicaments.setBounds(338, 344, 108, 14);
		
		cbChoixMédicaments = new JComboBox();
		cbChoixMédicaments.setBounds(456, 341, 103, 20);
		cbChoixMédicaments.setModel(new DefaultComboBoxModel(new String[] {"Choix Médicaments"}));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDateNaissanceClient)
								.addComponent(lblListeMedicaments))
							.addGap(50))
						.addComponent(lblPrenomClient)
						.addComponent(lblNomClient))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(tfPrenomClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGroup(Alignment.TRAILING, groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(cbChoixMédicaments, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfDateNaissanceClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(tfNomClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(150, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomClient)
						.addComponent(tfNomClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPrenomClient)
						.addComponent(tfPrenomClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDateNaissanceClient)
						.addComponent(tfDateNaissanceClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblListeMedicaments)
						.addComponent(cbChoixMédicaments, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(160, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
}
