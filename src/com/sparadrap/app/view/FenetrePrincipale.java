package com.sparadrap.app.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.TitledBorder;

public class FenetrePrincipale extends JFrame {

	private JPanel contentPane;
	private JLabel lblAccueil;
	private JButton btnAcceuil;
	private JButton btnAchat;
	private JButton btnHistoriqueAchats;
	private JButton btnHistoriqueOrdonnances;
	private JButton btnDetailsClient;
	private FenetreAchat fAchat = new FenetreAchat();

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
		createEvents(fAchat);
	}

	private void initComponents() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FenetrePrincipale.class.getResource("/com/sparadrap/resources/sparadrap_512.png")));
		setTitle("PHARMACIE SPARADRAP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnAcceuil = new JButton("Accueil");
		
		btnAchat = new JButton("Achat");
		
		btnHistoriqueAchats = new JButton("Historique des achats");
		
		btnHistoriqueOrdonnances = new JButton("Historique des ordonnances");
		
		btnDetailsClient = new JButton("Détails client");
		
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
							.addComponent(btnDetailsClient)
							.addGap(7))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lblAccueil, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
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
						.addComponent(btnDetailsClient))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblAccueil, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(17))
		);
		contentPane.setLayout(gl_contentPane);
	}
	/**
	 * @param pfAchat
	 */
	private void createEvents(FenetreAchat pfAchat) {
		fAchat = pfAchat;

		btnAchat.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1) {
					System.out.println(pfAchat);
					contentPane.add(pfAchat);
					contentPane.remove(lblAccueil);
					contentPane.revalidate();
					contentPane.repaint();
				}
			}
		});
		btnAcceuil.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1) {
					System.out.println(lblAccueil);
					contentPane.remove(pfAchat);
					contentPane.add(lblAccueil);
//					contentPane.revalidate();
					contentPane.repaint();
				}
			}
		});
	}
}
