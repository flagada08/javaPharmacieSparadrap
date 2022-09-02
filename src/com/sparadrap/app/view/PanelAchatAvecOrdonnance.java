package com.sparadrap.app.view;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sparadrap.app.controller.Pharmacie;
import com.sparadrap.app.exception.PharmaException;
import com.sparadrap.app.model.Achat;
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
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

import static com.sparadrap.app.controller.Main.*;

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
	private String txtTfTelephoneClient;
	private int intTfTelephoneClient;
	
	private JTextField tfEmailClient;
	
	private JTextField tfNumSecuSocialClient;
	private String txtTfNumSecuSocialClient;
	private long intTfNumSecuSocialClient;
	
	private JLabel lblSelectionMedicamentTitre;
	private JLabel lblSelectionMedicament;
	
	private JButton btnValider;
	
	private JComboBox<Medecin> cbChoixMedecin;
	private JComboBox<Specialite> cbChoixSpecialite;
	private JComboBox<Ordonnance> cbChoixOrdonnance;
	private JComboBox<Mutuelle> cbChoixMutuelle;
	
	private JComboBox<Medicament> cbChoixMedicament;
	private ArrayList<Medicament> listeMedicamentsPatient = new ArrayList<>();
	
	private Achat achat;
	private Client client;
	private Patient patient;
	private Medicament medicament;
	private Mutuelle mutuelle; 
	private Medecin medecin; 
	protected String selectionMedicament;
	
	/**
	 * Création du panel
	 */
	public PanelAchatAvecOrdonnance() {
		initComposants();
		createEvenements();
	}
	
	public void resetComposants() {
		tfNomClient.setText("");
		tfPrenomClient.setText("");
		lblSelectionMedicament.setText("");
		listeMedicamentsPatient = new ArrayList<Medicament>();
	}

	private void createEvenements() {
				
		cbChoixMedicament.addItemListener(new ItemListener() {			
			@Override
			public void itemStateChanged(ItemEvent e) {				
				if(e.getStateChange() == ItemEvent.SELECTED) {
					medicament = (Medicament) cbChoixMedicament.getSelectedItem();					
					listeMedicamentsPatient.add(medicament);
					lblSelectionMedicament.setText("[" + listeMedicamentsPatient + "]");
				}
			}
		});
		
		btnValider.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtTfTelephoneClient = tfTelephoneClient.getText();
				intTfTelephoneClient = Integer.parseInt(txtTfTelephoneClient);
				txtTfNumSecuSocialClient = tfNumSecuSocialClient.getText();
				intTfNumSecuSocialClient = Long.parseLong(txtTfNumSecuSocialClient);

				mutuelle = (Mutuelle) cbChoixMutuelle.getSelectedItem();
				medecin = (Medecin) cbChoixMedecin.getSelectedItem();
				client = client = new Client(
						tfNomClient.getText(), 
						tfPrenomClient.getText(), 
						0, 
						null, 
						0, 
						null, 
						0, 
						null, 
						ftfDateNaissanceClient.getText(), 
						listeMedicamentsPatient
						);
				try {
					patient = new Patient(
							tfNomClient.getText(), 
							tfPrenomClient.getText(), 
							0, 
							tfAdresseClient.getText(), 
							ALLBITS, 
							null, 
							intTfTelephoneClient, 
							null, 
							ftfDateNaissanceClient.getText(), 
							intTfNumSecuSocialClient, 
							mutuelle, 
							medecin, 
							null, 
							listeMedicamentsPatient
							);
				} catch (PharmaException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				try {
					achat = new Achat(
							new Date(), 
							null, 
							patient, 
							null,
							null
							);
				} catch (PharmaException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
//				if(e.getSource() == btnValider) {
					try {
						getPharmacie().ajoutAchat(achat);
					} catch (PharmaException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					try {
						getPharmacie().ajoutPatient(patient);
					} catch (PharmaException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					getPharmacie().ajoutMedicamentVendu(listeMedicamentsPatient);
					
					JOptionPane.showMessageDialog(null, "Achat ajouté : " + listeMedicamentsPatient, "Achat", 1);
					
					resetComposants();
//				}
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
		
		JLabel lblMutuelleDuClient = new JLabel("Mutuelle du client");
		
		cbChoixMutuelle = new JComboBox<Mutuelle>();
		cbChoixMutuelle.setModel(new DefaultComboBoxModel(new String[] {"Choix Mutuelle"}));
		for(Mutuelle mutuelle : Pharmacie.getListeMutuelles()) {
			System.out.println(mutuelle.getNom() + mutuelle.getSiege());
			cbChoixMutuelle.addItem(mutuelle);
		}
		
		JLabel lblMedecinClient = new JLabel("Médecin du client");
		
		cbChoixMedecin = new JComboBox<Medecin>();
		cbChoixMedecin.setModel(new DefaultComboBoxModel(new String[] {"Choix Médecin"}));
		for(Medecin medecin : Pharmacie.getListeMedecins()) {
			System.out.println(medecin.getNom());
			cbChoixMedecin.addItem(medecin);
		}
		
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
		
		cbChoixMedicament = new JComboBox<Medicament>();
		cbChoixMedicament.setModel(new DefaultComboBoxModel(new String[] {"Choix Médicament"}));
		for(Medicament medoc : getPharmacie().getListeMedicaments()) {
			System.out.println(medoc.getNom() + medoc.getPrix());
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
					.addComponent(cbChoixMedicament, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
						.addComponent(cbChoixMedicament, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
					.addGap(46)
					.addComponent(btnValider))
		);
		setLayout(groupLayout);
	}
}
