package com.sparadrap.app.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;

public class FenetrePrincipale extends JFrame {

	private JPanel contentPane;
	private JButton btnAcceuil;
	private JButton btnAchat;
	private JButton btnHistoriqueAchats;
	private JButton btnHistoriqueOrdonnances;
	private JButton btnDétailsClient;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetrePrincipale frame = new FenetrePrincipale();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FenetrePrincipale() {
		initComponents();
		createEvents();
	}

	private void initComponents() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FenetrePrincipale.class.getResource("/com/sparadrap/resources/sparadrap_512.png")));
		setTitle("PHARMACIE SPARADRAP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 618);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnAcceuil = new JButton("Accueil");
		
		btnAchat = new JButton("Achat");
		
		btnHistoriqueAchats = new JButton("Historique des achats");
		
		btnHistoriqueOrdonnances = new JButton("Historique des ordonnances");
		
		btnDétailsClient = new JButton("Détails client");
		
		JLabel lblNewLabel = new JLabel("PHARMACIE SPARADRAP");
		lblNewLabel.setForeground(new Color(0, 102, 0));
		lblNewLabel.setIcon(new ImageIcon(FenetrePrincipale.class.getResource("/com/sparadrap/resources/sparadrap_512.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnAcceuil)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAchat)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnHistoriqueAchats)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnHistoriqueOrdonnances)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDétailsClient)
							.addGap(7))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAcceuil)
						.addComponent(btnAchat)
						.addComponent(btnHistoriqueAchats)
						.addComponent(btnHistoriqueOrdonnances)
						.addComponent(btnDétailsClient))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(95))
		);
		contentPane.setLayout(gl_contentPane);
	}

	private void createEvents() {
		// TODO Auto-generated method stub
		
	}
}
