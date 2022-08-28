package com.sparadrap.app.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author User-05
 */
public class FenetrePrincipale extends JFrame {

	private JPanel contentPane;
	
	private JLabel lblAccueil;
	
	private JButton btnAcceuil;
	private JButton btnAchat;
	private JButton btnHistoriqueAchats;
	private JButton btnHistoriqueOrdonnances;
	private JButton btnDetailsClient;
	private JButton btnQuitter;
	
	private FenetreAchat fAchat = new FenetreAchat();

	/**
	 * Création de la frame principale
	 */
	public FenetrePrincipale() {
		initComposants();
		createEvenements();
	}
	
	private void createEvenements() {
		btnAcceuil.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1) {
					contentPane.remove(fAchat);
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
					contentPane.add(fAchat);
					contentPane.remove(lblAccueil);
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
	}
	
	private void initComposants() {		
		setIconImage(Toolkit.getDefaultToolkit().getImage(FenetrePrincipale.class.getResource("/com/sparadrap/resources/sparadrap_512.png")));
		setTitle("PHARMACIE SPARADRAP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnAcceuil = new JButton("Accueil");
		
		btnAchat = new JButton("Achat");
		
		btnHistoriqueOrdonnances = new JButton("Historique des ordonnances");
		
		btnHistoriqueAchats = new JButton("Historique des achats");
		
		btnDetailsClient = new JButton("Détails client");
		
		btnQuitter = new JButton("Quitter");
		
		lblAccueil = new JLabel("PHARMACIE SPARADRAP");
		lblAccueil.setBorder(new TitledBorder(null, "Accueil", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblAccueil.setForeground(new Color(0, 102, 0));
		lblAccueil.setIcon(new ImageIcon(FenetrePrincipale.class.getResource("/com/sparadrap/resources/sparadrap_512.png")));
		lblAccueil.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccueil.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAccueil.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(31)
					.addComponent(btnAcceuil)
					.addGap(5)
					.addComponent(btnAchat)
					.addGap(5)
					.addComponent(btnHistoriqueOrdonnances)
					.addGap(5)
					.addComponent(btnHistoriqueAchats)
					.addGap(5)
					.addComponent(btnDetailsClient)
					.addGap(72))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(75)
					.addComponent(lblAccueil))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(597, Short.MAX_VALUE)
					.addComponent(btnQuitter)
					.addContainerGap())
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
						.addComponent(btnDetailsClient))
					.addGap(5)
					.addComponent(lblAccueil)
					.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
					.addComponent(btnQuitter)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
	
}
