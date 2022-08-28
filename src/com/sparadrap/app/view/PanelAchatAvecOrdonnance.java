package com.sparadrap.app.view;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sparadrap.app.controller.Pharmacie;
import com.sparadrap.app.model.Client;
import com.sparadrap.app.model.Medecin;
import com.sparadrap.app.model.Medicament;
import com.sparadrap.app.model.Mutuelle;
import com.sparadrap.app.model.Ordonnance;
import com.sparadrap.app.model.Patient;
import com.sparadrap.app.model.Specialite;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.text.DateFormatter;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

/**
 * @author User-05
 */
public class PanelAchatAvecOrdonnance extends JPanel {
	
	private JTextField tfNomClient;
	private JTextField tfPrenomClient;
	
	private JFormattedTextField ftfDateNaissanceClient;
	private SimpleDateFormat dfDateNaissanceClient;
	private DateFormatter dformatterDateNaissanceClient;
	
	private JTextField tfAdresseClient;
	private JTextField tfTelephoneClient;
	private JTextField tfEmailClient;
	private JTextField tfNumSecuSocialClient;
	
	private JLabel lblSelectionMedicamentTitre;
	private JLabel lblSelectionMedicament;
	
	private JButton btnValider;
	
	private JComboBox<Medecin> cbChoixMedecin;
	private JComboBox<Specialite> cbChoixSpecialite;
	private JComboBox<Medicament> cbChoixMédicaments;
	private JComboBox<Ordonnance> cbChoixOrdonnance;
	private JComboBox<Mutuelle> cbChoixMutuelle;
	private Medicament Medicament = new Medicament(null, null, 0, null, 0);
	
	/**
	 * Création du panel
	 */
	public PanelAchatAvecOrdonnance() {
		initComposants();
		createEvenements();
	}

	private void createEvenements() {
		Medicament = (Medicament) cbChoixMédicaments.getSelectedItem();
		
		cbChoixMédicaments.addItemListener(new ItemListener() {			
			@Override
			public void itemStateChanged(ItemEvent e) {				
				if(e.getSource() == cbChoixMédicaments) {
					lblSelectionMedicament.setText("[" + cbChoixMédicaments.getSelectedItem() + "]");
				}
			}
		});
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnValider) {
					Client patient = new Patient(
						tfNomClient.getText(), 
						tfPrenomClient.getText(), 
						ERROR, 
						null, 
						ALLBITS, 
						null, 
						ABORT, 
						null, 
						ftfDateNaissanceClient.getText(), 
						null, 
						0, 
						null, 
						null, 
						null, 
						null, 
						null
					);
					System.out.println(patient);
					System.out.println(Medicament);
				}
			}
		});
	}

	private void initComposants() {
		setBounds(0, 0, 600, 500);
		setBorder(new TitledBorder(null, "Achat avec Ordonnance", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblAdresseClient = new JLabel("Adresse du client");
		
		tfAdresseClient = new JTextField();
		tfAdresseClient.setColumns(10);
		
		JLabel lblTelephoneClient = new JLabel("Téléphone du client");
		
		tfTelephoneClient = new JTextField();
		tfTelephoneClient.setColumns(10);
		
		JLabel lblEmailClient = new JLabel("Email du client");
		
		tfEmailClient = new JTextField();
		tfEmailClient.setColumns(10);
		
		JLabel lblNumSecuSocialClient = new JLabel("Numéro de sécurité social du client");
		
		tfNumSecuSocialClient = new JTextField();
		tfNumSecuSocialClient.setColumns(10);
		
		cbChoixMutuelle = new JComboBox();
		cbChoixMutuelle.setModel(new DefaultComboBoxModel(new String[] {"Choix Mutuelle"}));
		
		JLabel lblMutuelleDuClient = new JLabel("Mutuelle du client");
		
		JLabel lblMedecinClient = new JLabel("Médecin du client");
		
		cbChoixMedecin = new JComboBox<>();
		cbChoixMedecin.setModel(new DefaultComboBoxModel(new String[] {"Choix Médecin"}));
		
		JLabel lblSpecialiste = new JLabel("Spécialiste (opt)");
		
		cbChoixSpecialite = new JComboBox();
		cbChoixSpecialite.setModel(new DefaultComboBoxModel(new String[] {"Choix Spécialité"}));
		
		JLabel lblOrdonnance = new JLabel("Ordonnance");
		
		cbChoixOrdonnance = new JComboBox();
		cbChoixOrdonnance.setModel(new DefaultComboBoxModel(new String[] {"Choix Ordonnance"}));
		
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
		
		lblSelectionMedicamentTitre = new JLabel("Médicaments séléctionnés");
		
		lblSelectionMedicament = new JLabel("[Sélectionner un médicament]");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblNomClient)
					.addGap(118)
					.addComponent(tfNomClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(62)
					.addComponent(lblOrdonnance)
					.addGap(41)
					.addComponent(cbChoixOrdonnance, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblPrenomClient)
					.addGap(103)
					.addComponent(tfPrenomClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(62)
					.addComponent(lblMedecinClient)
					.addGap(18)
					.addComponent(cbChoixMedecin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblDateNaissanceClient)
					.addGap(50)
					.addComponent(ftfDateNaissanceClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(62)
					.addComponent(lblSpecialiste)
					.addGap(23)
					.addComponent(cbChoixSpecialite, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblListeMedicaments)
					.addGap(120)
					.addComponent(cbChoixMédicaments, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblTelephoneClient)
					.addGap(89)
					.addComponent(tfTelephoneClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblAdresseClient)
					.addGap(100)
					.addComponent(tfAdresseClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblEmailClient)
					.addGap(115)
					.addComponent(tfEmailClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblNumSecuSocialClient)
					.addGap(18)
					.addComponent(tfNumSecuSocialClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblMutuelleDuClient)
					.addGap(100)
					.addComponent(cbChoixMutuelle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
						.addComponent(tfNomClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblOrdonnance))
						.addComponent(cbChoixOrdonnance, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblPrenomClient))
						.addComponent(tfPrenomClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblMedecinClient))
						.addComponent(cbChoixMedecin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblDateNaissanceClient))
						.addComponent(ftfDateNaissanceClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblSpecialiste))
						.addComponent(cbChoixSpecialite, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(lblListeMedicaments))
						.addComponent(cbChoixMédicaments, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblTelephoneClient))
						.addComponent(tfTelephoneClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblAdresseClient))
						.addComponent(tfAdresseClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblEmailClient))
						.addComponent(tfEmailClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNumSecuSocialClient))
						.addComponent(tfNumSecuSocialClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblMutuelleDuClient))
						.addComponent(cbChoixMutuelle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(25)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSelectionMedicamentTitre)
						.addComponent(lblSelectionMedicament))
					.addGap(38)
					.addComponent(btnValider))
		);
		setLayout(groupLayout);
	}
}
