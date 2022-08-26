package com.sparadrap.app.view;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.sparadrap.app.controller.Pharmacie;

import javax.swing.JLabel;
import javax.swing.JComboBox;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Color;

/**
 * @author User-05
 */
public class FenetreAchat extends JPanel {
	
	PanelAchatSansOrdonnance pAchatSansOrdonnance = new PanelAchatSansOrdonnance();
	PanelAchatAvecOrdonnance pAchatAvecOrdonnance = new PanelAchatAvecOrdonnance();
	private JLabel lblTypeAchat;
	private JComboBox cbTypeAchat;
	private String[] tabScbTypeAchat = {"Choix du type d'achat", "Achat sans ordonnance", "Achat avec ordonnance"};

	/**
	 * Création du panel
	 */
	public FenetreAchat() {
		initComposants();
		createEvenements();
	}

	private void createEvenements() {
		cbTypeAchat.addItemListener(new ItemListener() {			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String string = (String) cbTypeAchat.getSelectedItem();
				
				if(e.getSource() == cbTypeAchat) {
					lblTypeAchat.setText("[" + cbTypeAchat.getSelectedItem() + "]");
				}
				
				if(string == cbTypeAchat.getItemAt(1)) {
					add(pAchatSansOrdonnance);
					remove(pAchatAvecOrdonnance);
					revalidate();
					repaint();
				} else if(string == cbTypeAchat.getItemAt(2)) {
					add(pAchatAvecOrdonnance);
					remove(pAchatSansOrdonnance);
					revalidate();
					repaint();
				} else {
					lblTypeAchat.setText("[Sélectionner le type d'achat]");
					remove(pAchatSansOrdonnance);
					remove(pAchatAvecOrdonnance);
					revalidate();
					repaint();
				}
				
			}
		});			
	}

	private void initComposants() {
		setBounds(50, 50, 600, 500);
		setBorder(new TitledBorder(null, "Achat", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		lblTypeAchat = new JLabel("[Sélectionner le type d'achat]");
		lblTypeAchat.setForeground(new Color(0, 102, 0));
		lblTypeAchat.setFont(new Font("Cooper Black", Font.PLAIN, 17));
		cbTypeAchat = new JComboBox(tabScbTypeAchat);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(cbTypeAchat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblTypeAchat))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbTypeAchat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTypeAchat))
					.addGap(447))
		);
		setLayout(groupLayout);		
	}
		
}
