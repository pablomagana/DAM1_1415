package vista;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;

import modelo.datos;
import modelo.policia;

public class panelPrincipal extends JPanel {
	
	private JPasswordField passwordField;
	private String password=null;
	private Iterator<String[]> user;
	private JButton logout;
	private JButton login;

	/**
	 * Create the panel.
	 */
	public panelPrincipal(JPanel card,datos datosusuarios) {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 5, 440, 328);
		add(panel);
		panel.setLayout(null);
		
		JComboBox usuarios = new JComboBox();
		ArrayList<String[]> u = datosusuarios.getUsuarios();
		for(int i=0;i<u.size();i++){
			usuarios.addItem(u.get(i)[0]);
		}
		usuarios.setBounds(32, 47, 139, 20);
		panel.add(usuarios);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(32, 78, 139, 20);
		panel.add(passwordField);
		
		login = new JButton("Log in");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(passwordField.getPassword()!=null)password=new String(passwordField.getPassword());
				user=datosusuarios.getUsuarios().iterator();
				if(!password.equals(null)){
					while(user.hasNext()){
						String[] linea=user.next();
						if(linea[0].equals(usuarios.getSelectedItem().toString())  && linea[1].equals(password)){
							policia.usuariovalido=linea[0];
							policia.contrasenavalida=linea[1];
							usuarios.setEnabled(false);
							passwordField.setEnabled(false);
							login.setEnabled(false);
							logout.setEnabled(true);
							//CardLayout ca=(CardLayout) card.getLayout();
							//ca.show(card, "panel2");
						}
					}
				}else{
					JOptionPane.showMessageDialog(null, "Error! Falta introducir contraseña");
				}
				
			}
		});
		login.setBounds(32, 156, 139, 23);
		panel.add(login);
		
		logout = new JButton("Log out");
		logout.setEnabled(false);
		logout.setBounds(32, 189, 139, 23);
		logout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				policia.usuariovalido=null;
				policia.contrasenavalida=null;
				usuarios.setEnabled(true);
				passwordField.setEnabled(true);
				logout.setEnabled(false);
				login.setEnabled(true);
			}
		});
		panel.add(logout);

	}

}
