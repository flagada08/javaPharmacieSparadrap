package com.sparadrap.app.view;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sparadrap.app.exception.PharmaException;
import com.sparadrap.app.model.Achat;
import com.sparadrap.app.model.Client;
import com.sparadrap.app.model.Medicament;
import com.sparadrap.app.model.Patient;

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

import static com.sparadrap.app.controller.Main.*;

import java.awt.event.ActionEvent;

/**
 * @author User-05
 */
public class PanelAchatSansOrdonnance extends JPanel {
		
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2909415582367966966L;
	
	/**
	 * Attributs de classe
	 */
	private JTextField tfNomClient;
	private JTextField tfPrenomClient;
	
	private JFormattedTextField ftfDateNaissanceClient;
	private SimpleDateFormat dfDateNaissanceClient;
	private DateFormatter dformatterDateNaissanceClient;
		
	private JLabel lblSelectionMedicamentTitre;
	private JLabel lblSelectionMedicament;
	
	protected JButton btnValider;
	
	private JComboBox<Medicament> cbChoixMedicament;
	private ArrayList<Medicament> listeMedicamentsClient = new ArrayList<Medicament>();
	
	private Achat achat;
	private Client client;
	private Patient patient;
	private Medicament medicament;
	protected int medicIndex;
	
	/**
	 * Constructeur du JPanel.
	 */
	public PanelAchatSansOrdonnance() {
		initComposants();
		createEvenements();
	}
	
	/**
	 * Fonction qui vide les composants et réinitialise la liste des médicaments
	 * pour le prochain patient qui sera renseigné
	 */
	public void resetComposants() {
		tfNomClient.setText("");
		tfPrenomClient.setText("");
		lblSelectionMedicament.setText("");
		listeMedicamentsClient = new ArrayList<Medicament>();
	}
	
	private void createEvenements() {
		
		cbChoixMedicament.addItemListener(new ItemListener() {			
			@Override
			public void itemStateChanged(ItemEvent e) {	
				if(e.getStateChange() == ItemEvent.SELECTED) {
					medicament = (Medicament) cbChoixMedicament.getSelectedItem();
					listeMedicamentsClient.add(medicament);
					lblSelectionMedicament.setText(listeMedicamentsClient.toString());
				}
			}
		});

		btnValider.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
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
				} catch (PharmaException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
					JOptionPane.showMessageDialog(null, e2.getMessage());
				}
				try {
					patient = new Patient(
							tfNomClient.getText(), 
							tfPrenomClient.getText(), 
							0, 
							null, 
							0, 
							null, 
							0, 
							null, 
							null, 
							0, 
							null, 
							null, 
							null, 
							null
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
							null, 
							null
							);
				} catch (PharmaException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
//				if(e.getSource() == btnValider) {
					try {
						getPharmacie().ajoutClient(client);
					} catch (PharmaException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						getPharmacie().ajoutAchat(achat);
					} catch (PharmaException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					getPharmacie().ajoutMedicamentVendu(listeMedicamentsClient);
					
//					getPharmacie().sauveFichier(getPharmacie());
					
					// Diminution du stock de médicaments à chaque achats
					if(medicament.getStock() > 0)
					medicament.setStock(medicament.getStock()-1);
					
					JOptionPane.showMessageDialog(
								null, 
								"Achat ajouté\n" 
								+ "\nNom du client : " + tfNomClient.getText().toUpperCase() 
								+ "\nPrénom : " + tfPrenomClient.getText() 
								+ "\nMédicament(s) acheté(s) : " + listeMedicamentsClient, 
								"ACHAT", 1
							);
//					
//					JOptionPane.showMessageDialog(null, getPharmacie().getListeClients());
				
					resetComposants();
//				}
			}
		});
		
//		lblSelectionMedicament.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				medicIndex = listeMedicamentsClient.size() -1;				
//			}
//		});
	}
	
	/**
	 * Création du panel
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initComposants() {	
		setBounds(0, 0, 700, 500);
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
		for(Medicament medoc : getPharmacie().getListeMedicaments()) {
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
					.addGap(240)
					.addComponent(btnValider))
		);
		setLayout(groupLayout);
	}
}
