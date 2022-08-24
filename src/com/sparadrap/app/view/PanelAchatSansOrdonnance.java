package com.sparadrap.app.view;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sparadrap.app.model.Client;
import com.sparadrap.app.model.Medicament;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.text.DateFormatter;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
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
	
	public PanelAchatSansOrdonnance() {
		initComposants();
		createEvenements(
					tfNomClient, 
					tfPrenomClient, 
					ftfDateNaissanceClient, 
					dfDateNaissanceClient,
					cbChoixMédicaments
				);
	}
	
	/**
	 * Création du panel
	 */
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
		
		cbChoixMédicaments = new JComboBox();
		cbChoixMédicaments.setModel(new DefaultComboBoxModel(new String[] {"Choix Médicaments"}));
		
		btnValider = new JButton("Valider");
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNomClient)
							.addGap(118)
							.addComponent(tfNomClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPrenomClient)
							.addGap(103)
							.addComponent(tfPrenomClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblDateNaissanceClient)
							.addGap(50)
							.addComponent(ftfDateNaissanceClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblListeMedicaments)
							.addGap(120)
							.addComponent(cbChoixMédicaments, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(513, Short.MAX_VALUE)
					.addComponent(btnValider, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
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
					.addGap(271)
					.addComponent(btnValider)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
	
	private void createEvenements(
			JTextField tfNomClient, 
			JTextField tfPrenomClient, 
			JFormattedTextField ftfDateNaissanceClient, 
			SimpleDateFormat dfDateNaissanceClient,
			JComboBox<Medicament> cbChoixMédicaments
			) {
		btnValider.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String stringTfNomClient = tfNomClient.getText();
				String stringTfPrenomClient = tfPrenomClient.getText();
				String stringftfDateNaissanceClient = ftfDateNaissanceClient.getText();
				Client client = new Client(
							stringTfNomClient, 
							stringTfPrenomClient, 
							ERROR, 
							null, 
							ALLBITS, 
							null, 
							ABORT, 
							null, 
							stringftfDateNaissanceClient, 
							null
						);
				System.out.println(client);
			}
		});
	}
}
