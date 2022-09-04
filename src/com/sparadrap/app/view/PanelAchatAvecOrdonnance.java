package com.sparadrap.app.view;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sparadrap.app.exception.PharmaException;
import com.sparadrap.app.model.Achat;
import com.sparadrap.app.model.Client;
import com.sparadrap.app.model.Medecin;
import com.sparadrap.app.model.Medicament;
import com.sparadrap.app.model.Mutuelle;
import com.sparadrap.app.model.Ordonnance;
import com.sparadrap.app.model.Patient;
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
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 * @author User-05
 */
public class PanelAchatAvecOrdonnance extends JPanel {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1385861351598316832L;
	
	/**
	 * Attributs de classe
	 */
	private JTextField tfNomPatient;
	private JTextField tfPrenomPatient;
	
	private JFormattedTextField ftfDateNaissancePatient;
	private SimpleDateFormat dfDateNaissancePatient;
	private DateFormatter dformatterDateNaissancePatient;
	
	private JTextField tfNumRue;
	private JTextField tfAdressePatient;
	private JTextField tfCpPatient;
	private String txtTfCpPatient;
	private int intTfCpPatient;
	private JTextField tfNomVille;
	
	private JTextField tfTelephonePatient;
	private String txtTfTelephonePatient;
	private int intTfTelephonePatient;
	
	private JTextField tfEmailPatient;
	
	private JTextField tfNumSecuSocialPatient;
	private String txtTfNumSecuSocialPatient;
	private long intTfNumSecuSocialPatient;
	
	private JLabel lblSelectionMedicamentTitre;
	private JLabel lblSelectionMedicament;
	
	private JButton btnValider;
	
	private JComboBox<Medicament> cbChoixMedicament;
	private JComboBox<Mutuelle> cbChoixMutuelle;
	private JComboBox<Medecin> cbChoixMedecin;
	private JComboBox<Ordonnance> cbChoixOrdonnance;
	
	private ArrayList<Medicament> listeMedicamentsPatient = new ArrayList<>();
	private ArrayList<Ordonnance> listeOrdonnancesPatient = new ArrayList<>();
	
	private Achat achat;
	private Client client;
	private Patient patient;
	private Medicament medicament;
	private Mutuelle mutuelle; 
	private Medecin medecin; 
	private Ordonnance ordonnance; 
	protected String selectionMedicament;
	
	/**
	 * Constructeur du JPanel
	 */
	public PanelAchatAvecOrdonnance() {
		initComposants();
		createEvenements();
	}
	
	/**
	 * Fonction qui vide les composants et réinitialise la liste des médicaments
	 * pour le prochain patient qui sera renseigné
	 */
	public void resetComposants() {
		tfNomPatient.setText("");
		tfPrenomPatient.setText("");
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
				txtTfTelephonePatient = tfTelephonePatient.getText();
				intTfTelephonePatient = Integer.parseInt(txtTfTelephonePatient);
				txtTfNumSecuSocialPatient = tfNumSecuSocialPatient.getText();
				intTfNumSecuSocialPatient = Long.parseLong(txtTfNumSecuSocialPatient);
				txtTfCpPatient = tfCpPatient.getText();
				intTfCpPatient = Integer.parseInt(txtTfCpPatient);

				mutuelle = (Mutuelle) cbChoixMutuelle.getSelectedItem();
				medecin = (Medecin) cbChoixMedecin.getSelectedItem();
				ordonnance = (Ordonnance) cbChoixOrdonnance.getSelectedItem();
				try {
					client = new Client(
							tfNomPatient.getText(), 
							tfPrenomPatient.getText(), 
							0, 
							null, 
							0, 
							null, 
							0, 
							null, 
							ftfDateNaissancePatient.getText(), 
							listeMedicamentsPatient
							);
				} catch (PharmaException e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
				
				try {
					patient = new Patient(
							tfNomPatient.getText(), 
							tfPrenomPatient.getText(), 
							0, 
							tfAdressePatient.getText(), 
							intTfCpPatient, 
							tfNomVille.getText(), 
							intTfTelephonePatient, 
							tfEmailPatient.getText(), 
							ftfDateNaissancePatient.getText(), 
							intTfNumSecuSocialPatient, 
							mutuelle, 
							medecin, 
							listeOrdonnancesPatient, 
							listeMedicamentsPatient
							);
				} catch (PharmaException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				try {
					achat = new Achat(
							new Date(), 
							client, 
							patient, 
							medecin,
							ordonnance
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
					
					// Diminution du stock de médicaments à chaque achats
					if(medicament.getStock() > 0)
						medicament.setStock(medicament.getStock()-1);
					
					JOptionPane.showMessageDialog( 
								null, 
								"Achat ajouté\n" 
								+ "\nNom du patient : " + tfNomPatient.getText().toUpperCase() 
								+ "\nPrénom : " + tfPrenomPatient.getText() 
								+ "\nmedecin : " + medecin 
								+ "\nMédicament(s) acheté(s) : " + listeMedicamentsPatient, 
								"ACHAT", 1
							);
//					
//					JOptionPane.showMessageDialog(null, getPharmacie().getListePatients());
					
					resetComposants();
//				}
			}
		});
	}
	
	/**
	 * Création du panel
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initComposants() {
		setBounds(0, 0, 700, 500);
		setBorder(new TitledBorder(null, "Achat avec Ordonnance", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblAdressePatient = new JLabel("Adresse du client");
		
		tfNumRue = new JTextField();
		tfNumRue.setText("Num");
		tfNumRue.setColumns(10);
		
		tfAdressePatient = new JTextField();
		tfAdressePatient.setText("Rue");
		tfAdressePatient.setColumns(10);
		
		tfCpPatient = new JTextField();
		tfCpPatient.setText("CP");
		tfCpPatient.setColumns(10);
		
		tfNomVille = new JTextField();
		tfNomVille.setText("Commune");
		tfNomVille.setColumns(10);
		
		JLabel lblTelephonePatient = new JLabel("Téléphone du client");
		
		tfTelephonePatient = new JTextField();
		tfTelephonePatient.setColumns(10);
		
		JLabel lblEmailPatient = new JLabel("Email du client");
		
		tfEmailPatient = new JTextField();
		tfEmailPatient.setColumns(10);
		
		JLabel lblNumSecuSocialPatient = new JLabel("Numéro de sécurité social du client");
		
		tfNumSecuSocialPatient = new JTextField();
		tfNumSecuSocialPatient.setColumns(10);
		
		JLabel lblMutuelleDuPatient = new JLabel("Mutuelle du client");
		
		cbChoixMutuelle = new JComboBox<Mutuelle>();
		cbChoixMutuelle.setModel(new DefaultComboBoxModel(new String[] {"Choix Mutuelle"}));
		for(Mutuelle mutuelle : getPharmacie().getListeMutuelles()) {
			System.out.println(mutuelle.getNom() + mutuelle.getSiege());
			cbChoixMutuelle.addItem(mutuelle);
		}
		
		JLabel lblMedecinPatient = new JLabel("Médecin du client");
		
		cbChoixMedecin = new JComboBox<Medecin>();
		cbChoixMedecin.setModel(new DefaultComboBoxModel(new String[] {"Choix Médecin"}));
		for(Medecin medecin : getPharmacie().getListeMedecins()) {
			System.out.println(medecin.getNom());
			cbChoixMedecin.addItem(medecin);
		}
		
		JLabel lblOrdonnance = new JLabel("Ordonnance");
		
		cbChoixOrdonnance = new JComboBox<Ordonnance>();
		cbChoixOrdonnance.setModel(new DefaultComboBoxModel(new String[] {"Choix Ordonnance"}));
		for(Ordonnance ordonnance : getPharmacie().getListeOrdonnances()) {
			System.out.println(ordonnance.getDate());
			cbChoixOrdonnance.addItem(ordonnance);
		}
		
		JLabel lblNomPatient = new JLabel("Nom du client");
		
		tfNomPatient = new JTextField();
		tfNomPatient.setColumns(10);
		
		JLabel lblPrenomPatient = new JLabel("Prénom du client");
		
		tfPrenomPatient = new JTextField();
		tfPrenomPatient.setColumns(10);
		
		JLabel lblDateNaissancePatient = new JLabel("Date de Naissance du client");
		
		dfDateNaissancePatient = new SimpleDateFormat("dd/MM/yyyy");
		dformatterDateNaissancePatient = new DateFormatter(dfDateNaissancePatient);
		ftfDateNaissancePatient = new JFormattedTextField(dformatterDateNaissancePatient);
		ftfDateNaissancePatient.setColumns(10);
		ftfDateNaissancePatient.setValue(new Date());
		
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
					.addComponent(lblNomPatient)
					.addGap(118)
					.addComponent(tfNomPatient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(62)
					.addComponent(lblOrdonnance)
					.addGap(41)
					.addComponent(cbChoixOrdonnance, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblPrenomPatient)
					.addGap(103)
					.addComponent(tfPrenomPatient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(62)
					.addComponent(lblMedecinPatient)
					.addGap(18)
					.addComponent(cbChoixMedecin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblDateNaissancePatient)
					.addGap(50)
					.addComponent(ftfDateNaissancePatient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(263))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblListeMedicaments)
					.addGap(120)
					.addComponent(cbChoixMedicament, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblTelephonePatient)
					.addGap(89)
					.addComponent(tfTelephonePatient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblAdressePatient)
					.addGap(51)
					.addComponent(tfNumRue, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tfAdressePatient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tfCpPatient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tfNomVille, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblEmailPatient)
					.addGap(115)
					.addComponent(tfEmailPatient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblNumSecuSocialPatient)
					.addGap(18)
					.addComponent(tfNumSecuSocialPatient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblMutuelleDuPatient)
					.addGap(100)
					.addComponent(cbChoixMutuelle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblSelectionMedicamentTitre)
					.addGap(58)
					.addComponent(lblSelectionMedicament))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(609)
					.addComponent(btnValider, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNomPatient))
						.addComponent(tfNomPatient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblOrdonnance))
						.addComponent(cbChoixOrdonnance, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblPrenomPatient))
						.addComponent(tfPrenomPatient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblMedecinPatient))
						.addComponent(cbChoixMedecin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblDateNaissancePatient))
						.addComponent(ftfDateNaissancePatient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
							.addComponent(lblTelephonePatient))
						.addComponent(tfTelephonePatient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblAdressePatient))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(tfAdressePatient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(tfNumRue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(tfCpPatient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(tfNomVille, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblEmailPatient))
						.addComponent(tfEmailPatient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNumSecuSocialPatient))
						.addComponent(tfNumSecuSocialPatient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblMutuelleDuPatient))
						.addComponent(cbChoixMutuelle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(25)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSelectionMedicamentTitre)
						.addComponent(lblSelectionMedicament))
					.addGap(48)
					.addComponent(btnValider))
		);
		setLayout(groupLayout);
	}
}
