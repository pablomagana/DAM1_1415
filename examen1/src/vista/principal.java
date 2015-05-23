package vista;

import javax.swing.JFrame;
import javax.swing.JToolBar;

import java.awt.BorderLayout;

import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class principal extends JFrame{
	private JPanel card;
	public principal(){
		getContentPane().setLayout(null);
		setTitle("actividad 5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 382);
		
		JPanel panel1=new panelPrincipal();
		JPanel panel2=new paneldelincuentes();
		card=new JPanel();
		getContentPane().add(card);
		card.setBounds(0, 23, 422, 320);
		card.setLayout(new CardLayout(0, 0));
		card.add(panel1,"panel1");
		card.add(panel2,"panel2");
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 422, 24);
		getContentPane().add(menuBar);
		
		JMenuItem principal = new JMenuItem("principal");
		menuBar.add(principal);
		principal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c=(CardLayout) card.getLayout();
				c.show(card, "panel1");
				
			}
		});
		
		JMenuItem delincuentes = new JMenuItem("delincuentes");
		menuBar.add(delincuentes);
		delincuentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c=(CardLayout) card.getLayout();
				c.show(card, "panel2");
				
			}
		});
		
	
		
	}
}
