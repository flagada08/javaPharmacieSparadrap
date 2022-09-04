package com.sparadrap.app.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;

import com.sparadrap.app.model.Medicament;

import java.awt.Font;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import static com.sparadrap.app.controller.Main.*;

/**
 * @author User-05
 */
public class FenetrePrincipale extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2582978062442606895L;

	private JPanel contentPane;
	
	private JLabel lblAccueil;
	
	private JButton btnAcceuil;
	private JButton btnAchat;
	private JButton btnHistoriqueAchats;
	private JButton btnHistoriqueOrdonnances;
	private JButton btnDetailsClient;
	
	private FenetreAchat fAchat;
	private FenetreHistoriqueAchat fHistoriqueAchat;
	private FenetreDetailsClient fDetailsClient;
	private JButton btnQuitter;
	private JButton btnTotalMedoc;

	/**
	 * Constructeur de la JFrame.
	 */
	public FenetrePrincipale() {
		contentPane = new JPanel();
		fAchat = new FenetreAchat();
		fHistoriqueAchat = new FenetreHistoriqueAchat();
		fDetailsClient = new FenetreDetailsClient();
		initComposants();
		createEvenements();
	}
	
	private void createEvenements() {
		btnAcceuil.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1) {
					contentPane.remove(fAchat);
					contentPane.remove(fHistoriqueAchat);
					contentPane.remove(fDetailsClient);
					contentPane.add(lblAccueil);
					contentPane.revalidate();
					contentPane.repaint();
				}
			}
		});

		btnAchat.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1) {
					contentPane.remove(lblAccueil);
					contentPane.remove(fHistoriqueAchat);
					contentPane.remove(fDetailsClient);
					contentPane.remove(fAchat);
					contentPane.add(fAchat = new FenetreAchat());
					contentPane.revalidate();
					contentPane.repaint();
				}
			}
		});
		
		btnHistoriqueAchats.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1) {
					contentPane.remove(fAchat);
					contentPane.remove(lblAccueil);
					contentPane.remove(fHistoriqueAchat);
					contentPane.remove(fDetailsClient);
					contentPane.add(fHistoriqueAchat = new FenetreHistoriqueAchat());
					contentPane.revalidate();
					contentPane.repaint();
				}
			}
		});
		
		btnDetailsClient.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1) {
					contentPane.remove(fAchat);
					contentPane.remove(lblAccueil);
					contentPane.remove(fHistoriqueAchat);
					contentPane.remove(fDetailsClient);
					contentPane.add(fDetailsClient = new FenetreDetailsClient());
					contentPane.revalidate();
					contentPane.repaint();
				}
			}
		});
		
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});	
		
		btnTotalMedoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Medicament> listeTotalMedocVendus = getPharmacie().getListeMedicamentsVendus();
				JOptionPane.showMessageDialog(null, "Total médicaments vendus\n" + listeTotalMedocVendus, "Médicaments Vendus", 1);
			}
		});
	}
	
	/**
	 * Création de la frame principale
	 */
	private void initComposants() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FenetrePrincipale.class.getResource("/com/sparadrap/resources/sparadrap_512.png")));
		setTitle("PHARMACIE SPARADRAP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 700);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnAcceuil = new JButton("Accueil");
		
		btnAchat = new JButton("Achat");
		
		btnHistoriqueOrdonnances = new JButton("Historique des ordonnances");
		btnHistoriqueOrdonnances.setEnabled(false);
		
		btnHistoriqueAchats = new JButton("Historique des achats");
		
		btnDetailsClient = new JButton("Détails client");
		
		lblAccueil = new JLabel("PHARMACIE SPARADRAP");
		lblAccueil.setBorder(new TitledBorder(null, "Accueil", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblAccueil.setForeground(new Color(0, 102, 0));
		lblAccueil.setIcon(new ImageIcon(FenetrePrincipale.class.getResource("/com/sparadrap/resources/sparadrap_512.png")));
		lblAccueil.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccueil.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAccueil.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		
		JButton btnDetailsPatient = new JButton("Details Patient");
		btnDetailsPatient.setEnabled(false);
		
		btnQuitter = new JButton("Quitter");
		
		btnTotalMedoc = new JButton("Total des médicaments vendus");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(74)
					.addComponent(btnAcceuil)
					.addGap(5)
					.addComponent(btnAchat)
					.addGap(5)
					.addComponent(btnHistoriqueOrdonnances)
					.addGap(5)
					.addComponent(btnHistoriqueAchats)
					.addGap(5)
					.addComponent(btnDetailsClient)
					.addGap(5)
					.addComponent(btnDetailsPatient))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(135)
					.addComponent(lblAccueil)
					.addContainerGap(135, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnTotalMedoc)
					.addPreferredGap(ComponentPlacement.RELATED, 623, Short.MAX_VALUE)
					.addComponent(btnQuitter)
					.addGap(5))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAcceuil)
						.addComponent(btnAchat)
						.addComponent(btnHistoriqueOrdonnances)
						.addComponent(btnHistoriqueAchats)
						.addComponent(btnDetailsClient)
						.addComponent(btnDetailsPatient))
					.addGap(5)
					.addComponent(lblAccueil)
					.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnQuitter)
						.addComponent(btnTotalMedoc))
					.addGap(6))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
