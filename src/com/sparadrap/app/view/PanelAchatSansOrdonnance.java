package com.sparadrap.app.view;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sparadrap.app.controller.Pharmacie;
import com.sparadrap.app.model.Achat;
import com.sparadrap.app.model.Client;
import com.sparadrap.app.model.Medicament;

import javax.swing.DefaultComboBoxModel;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author User-05
 */
public class PanelAchatSansOrdonnance extends JPanel {
	
	private JTextField tfNomClient;
	private JTextField tfPrenomClient;
	
	private JFormattedTextField ftfDateNaissanceClient;
	private SimpleDateFormat dfDateNaissanceClient;
	private DateFormatter dformatterDateNaissanceClient;
		
	private JLabel lblSelectionMedicamentTitre;
	private JLabel lblSelectionMedicament;
	
	protected JButton btnValider;
	
	private JComboBox<Medicament> cbChoixMedicament;
	
	private ArrayList<Achat> listeAchats = new ArrayList<Achat>();
	private ArrayList<Client> listeClients = new ArrayList<Client>();
	private ArrayList<Medicament> listeMedicamentsClient = new ArrayList<Medicament>();
	
	private Achat achat;
	private Client client;
	private Medicament medicament;
	protected int medicIndex;
	
	/**
	 * Création du panel
	 */
	public PanelAchatSansOrdonnance() {
		initComposants();
		createEvenements();
	}
	
	public void changePanels(JPanel component_to_add, JPanel component_to_remove){
		  this.remove(component_to_remove);
		  this.add(component_to_add);
		}
		
	private void createEvenements() {
				
		cbChoixMedicament.addItemListener(new ItemListener() {			
			@Override
			public void itemStateChanged(ItemEvent e) {	
				if(e.getStateChange() == ItemEvent.SELECTED) {
					medicament = (Medicament) cbChoixMedicament.getSelectedItem();					
					listeMedicamentsClient.add(medicament);
					lblSelectionMedicament.setText("[" + listeMedicamentsClient + "]");
				}
				
			}
		});
		
		btnValider.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				client = new Client(
						tfNomClient.getText(), 
						tfPrenomClient.getText(), 
						0, 
						null, 
						0, 
						null, 
						0, 
						null, 
						ftfDateNaissanceClient.getText(), 
						listeMedicamentsClient
						);
				achat = new Achat(
						new Date(), 
						client, 
						null, 
						null, 
						null
						);
				if(e.getSource() == btnValider) {
					listeClients.add(client);
					listeAchats.add(achat);
					Pharmacie.ajoutClient(client);
					Pharmacie.ajoutAchat(achat);
					new JOptionPane();
					JOptionPane.showMessageDialog(null, Pharmacie.getListeClients(), "Liste clients", 1);
					JOptionPane.showMessageDialog(null, Pharmacie.getListeAchats(), "Liste achats", 1);
					JOptionPane.showMessageDialog(null, listeMedicamentsClient, "Liste Médicaments Clients", 1);
				}
			}
		});
		
		lblSelectionMedicament.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				medicIndex = listeMedicamentsClient.size() -1;				
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
		
		cbChoixMedicament = new JComboBox<Medicament>();
		cbChoixMedicament.setModel(new DefaultComboBoxModel(new String[] {"Choix Médicament"}));
		for(Medicament medoc : Pharmacie.getListeMedicaments()) {
			cbChoixMedicament.addItem(medoc);
		}
		
		btnValider = new JButton("Valider");
		
		lblSelectionMedicamentTitre = new JLabel("Médicaments séléctionnés");
		
		lblSelectionMedicament = new JLabel("[Sélectionner un médicament]");
		
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
					.addComponent(cbChoixMedicament, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblSelectionMedicamentTitre)
					.addGap(58)
					.addComponent(lblSelectionMedicament))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(519)
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
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(lblListeMedicaments))
						.addComponent(cbChoixMedicament, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSelectionMedicamentTitre)
						.addComponent(lblSelectionMedicament))
					.addGap(238)
					.addComponent(btnValider))
		);
		setLayout(groupLayout);
	}
}
