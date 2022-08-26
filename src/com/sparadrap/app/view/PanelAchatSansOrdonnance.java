package com.sparadrap.app.view;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sparadrap.app.controller.Pharmacie;
import com.sparadrap.app.model.Achat;
import com.sparadrap.app.model.Client;
import com.sparadrap.app.model.Medicament;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.text.DateFormatter;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;

/**
 * @author User-05
 */
public class PanelAchatSansOrdonnance extends JPanel {
	
	private JTextField tfNomClient;
	private JTextField tfPrenomClient;
	private JFormattedTextField ftfDateNaissanceClient;
	private SimpleDateFormat dfDateNaissanceClient;
	private DateFormatter dformatterDateNaissanceClient;
	private JButton btnValider;
	private JComboBox<Medicament> cbChoixMédicaments;
	private ArrayList<Achat> listeAchats = new ArrayList<>();
	private JLabel lblSelectionMedicament;
	private JLabel lblSelectionMedicamentTitre;
	protected Medicament medicament;
	protected Client client;
	
	/**
	 * Création du panel
	 */
	public PanelAchatSansOrdonnance() {
		Pharmacie.ajoutMedicament();
		initComposants();
		createEvenements();
	}
	
	private void createEvenements() {
		Medicament selectionMedicament = (Medicament) cbChoixMédicaments.getSelectedItem();
		cbChoixMédicaments.addItemListener(new ItemListener() {			
			@Override
			public void itemStateChanged(ItemEvent e) {				
				if(e.getSource() == cbChoixMédicaments) {
					lblSelectionMedicament.setText("[" + cbChoixMédicaments.getSelectedItem() + "]");
				}
			}
		});
		btnValider.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cbChoixMédicaments.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						lblSelectionMedicament.setText(selectionMedicament.toString());
					}
				});
				if(e.getSource() == btnValider) {
					client = new Client(
						tfNomClient.getText(), 
						tfPrenomClient.getText(), 
						ERROR, 
						null, 
						ALLBITS, 
						null, 
						ABORT, 
						null, 
						ftfDateNaissanceClient.getText(), 
						null
					);
					System.out.println(client);
					listeAchats.add(new Achat(null, client, null, null, null, selectionMedicament, null, null));
					System.out.println(listeAchats);
					System.out.println(selectionMedicament);
				}
			}
		});
	}

	private void initComposants() {		
		setBounds(0, 0, 600, 500);
		setBorder(new TitledBorder(null, "Achat sans Ordonnance", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblNomClient = new JLabel("Nom du client");
		
		tfNomClient = new JTextField();
		
		tfNomClient.setColumns(10);
		
		JLabel lblPrenomClient = new JLabel("Prénom du client");
		
		tfPrenomClient = new JTextField();
		tfPrenomClient.setColumns(10);
				
		JLabel lblDateNaissanceClient = new JLabel("Date de Naissance du client");
		
		dfDateNaissanceClient = new SimpleDateFormat("dd/MM/yyyy");
		dformatterDateNaissanceClient = new DateFormatter(dfDateNaissanceClient);
		ftfDateNaissanceClient = new JFormattedTextField(dformatterDateNaissanceClient);
		ftfDateNaissanceClient.setColumns(10);
		ftfDateNaissanceClient.setValue(new Date());
				
		JLabel lblListeMedicaments = new JLabel("Médicaments");
		
		cbChoixMédicaments = new JComboBox<Medicament>();
		
		for(Medicament medoc : Pharmacie.getListeMedicaments()) {
			System.out.println(medoc.getNom() + medoc.getPrix());
			cbChoixMédicaments.addItem(medoc);
		}
		
		btnValider = new JButton("Valider");
		
		lblSelectionMedicament = new JLabel("[Sélectionner un médicament]");
		
		lblSelectionMedicamentTitre = new JLabel("Médicaments séléctionnés");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblNomClient)
					.addGap(118)
					.addComponent(tfNomClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblPrenomClient)
					.addGap(103)
					.addComponent(tfPrenomClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblDateNaissanceClient)
					.addGap(50)
					.addComponent(ftfDateNaissanceClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblListeMedicaments)
					.addGap(120)
					.addComponent(cbChoixMédicaments, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblSelectionMedicamentTitre)
					.addGap(58)
					.addComponent(lblSelectionMedicament))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(513)
					.addComponent(btnValider))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNomClient))
						.addComponent(tfNomClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblPrenomClient))
						.addComponent(tfPrenomClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblDateNaissanceClient))
						.addComponent(ftfDateNaissanceClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblListeMedicaments))
						.addComponent(cbChoixMédicaments, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSelectionMedicamentTitre)
						.addComponent(lblSelectionMedicament))
					.addGap(235)
					.addComponent(btnValider))
		);
		setLayout(groupLayout);
	}
}
