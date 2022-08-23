package com.sparadrap.app.view;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import javax.swing.JLabel;
import javax.swing.JComboBox;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class FenetreAchat extends JPanel {
	private PanelAchatSansOrdonnance pAchatSansOrdonnance = new PanelAchatSansOrdonnance();
	private PanelAchatAvecOrdonnance pAchatAvecOrdonnance = new PanelAchatAvecOrdonnance();
	private JLabel lblTypeAchat;
	private JComboBox cbTypeAchat;
	private String[] sCbTypeAchat = {
			"Choix du type d'achat", 
			"Achat sans ordonnance", 
			"Achat avec ordonnance"
			};

	public FenetreAchat() {
		initComponents();
		createEvents(pAchatSansOrdonnance, pAchatAvecOrdonnance);
	}
	
	/**
	 * Create the panel.
	 */
	private void initComponents() {
		
		setBounds(50, 50, 600, 500);
		setBorder(new TitledBorder(null, "Achat", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		lblTypeAchat = new JLabel();
		cbTypeAchat = new JComboBox(sCbTypeAchat);
		
		JButton btnValider = new JButton("Valider");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(cbTypeAchat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(513)
					.addComponent(btnValider))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(cbTypeAchat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(424)
					.addComponent(btnValider))
		);
		setLayout(groupLayout);
	}
	
	private void createEvents(PanelAchatSansOrdonnance pAchatSansOrdonnance, PanelAchatAvecOrdonnance pAchatAvecOrdonnance) {
		this.pAchatSansOrdonnance = pAchatSansOrdonnance;
		this.pAchatAvecOrdonnance = pAchatAvecOrdonnance;
		cbTypeAchat.addItemListener(new ItemListener() {			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String string = (String) cbTypeAchat.getSelectedItem();
				
				if(e.getSource() == cbTypeAchat) {
					lblTypeAchat.setText("[" + cbTypeAchat.getSelectedItem() + "]");
				}
				if(string == cbTypeAchat.getItemAt(1)) {
					add(pAchatSansOrdonnance);
					System.out.println(pAchatSansOrdonnance);
					remove(pAchatAvecOrdonnance);
					revalidate();
					repaint();
				} else if(string == cbTypeAchat.getItemAt(2)) {
					add(pAchatAvecOrdonnance);
					remove(pAchatSansOrdonnance);
					revalidate();
					repaint();
				} else {
					remove(pAchatSansOrdonnance);
					remove(pAchatAvecOrdonnance);
					revalidate();
					repaint();
				}
				
			}
		});	
	}
	
}
