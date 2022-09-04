package com.sparadrap.app.view;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.sparadrap.app.model.Client;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;

import static com.sparadrap.app.controller.Main.*;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class FenetreDetailsClient extends JPanel {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1486694773058359057L;
	private JComboBox<Client> cbChoixClient;
	private JLabel lblSelectionClient;

	/**
	 * Constructeur du JPanel.
	 */
	public FenetreDetailsClient() {
		initComposants();
		createEvenements();
	}
	
	private void createEvenements() {
		cbChoixClient.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {				
				if(e.getStateChange() == ItemEvent.SELECTED) {
					lblSelectionClient.setText("[" + cbChoixClient.getSelectedItem() + "]");
				}
			}
		});
	}

	/**
	 * Create the panel.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initComposants() {
		setBounds(50, 50, 700, 500);
		setBorder(new TitledBorder(null, "Détails Client", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		cbChoixClient = new JComboBox<Client>();
		cbChoixClient.setModel(new DefaultComboBoxModel(new String[] {"Choix du client"}));
		for(Client client : getPharmacie().getListeClients()) {
			System.out.println(client.getNom());
			cbChoixClient.addItem(client);
		}
		
		lblSelectionClient = new JLabel("[Sélectionner un client]");
		lblSelectionClient.setForeground(new Color(0, 102, 0));
		lblSelectionClient.setFont(new Font("Dialog", Font.PLAIN, 17));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(cbChoixClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblSelectionClient)
					.addContainerGap(338, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(cbChoixClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblSelectionClient))
					.addContainerGap(464, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
}
