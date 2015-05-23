package vista;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;

import modelo.datos;
import modelo.policia;

public class panelPrincipal extends JPanel {
	private datos datosusuarios=new datos();
	private JPasswordField passwordField;
	private Iterator<String[]> user;

	/**
	 * Create the panel.
	 */
	public panelPrincipal() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 5, 440, 328);
		add(panel);
		panel.setLayout(null);
		
		JComboBox usuarios = new JComboBox();
		usuarios.setBounds(32, 47, 139, 20);
		panel.add(usuarios);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(32, 78, 139, 20);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String password=new String(passwordField.getPassword());
				user=datosusuarios.getUsuarios().iterator();
				String nombreuser;
				String passuser;
				while(user.hasNext()){
					nombreuser=user.next()[0];
					passuser=user.next()[1];
					if(nombreuser==usuarios.getSelectedItem() && passuser==password){
						policia.usuariovalido=nombreuser;
						policia.contrasenavalida=passuser;
						
					}
				}
			}
		});
		btnNewButton.setBounds(32, 156, 139, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Log out");
		btnNewButton_1.setBounds(32, 189, 139, 23);
		panel.add(btnNewButton_1);

	}

}
