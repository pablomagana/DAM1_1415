package vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Choice;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class panelPrincipal extends JPanel {
	private JPasswordField contrasena;

	/**
	 * Create the panel.
	 */
	public panelPrincipal() {
		setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\pablo\\Pictures\\ROBOT\\ROBOT4.jpg"));
		label.setBounds(28, 42, 100, 100);
		add(label);
		
		JComboBox usuario = new JComboBox();
		usuario.setModel(new DefaultComboBoxModel(new String[] {"pamaub", "unpama", "maubpa"}));
		usuario.setBounds(28, 173, 100, 20);
		add(usuario);
		
		contrasena = new JPasswordField();
		contrasena.setToolTipText("");
		contrasena.setBounds(28, 204, 100, 20);
		add(contrasena);
		
		JButton validar = new JButton("Sing in");
		validar.setBounds(28, 266, 100, 23);
		add(validar);
		
		JButton btnNewButton_1 = new JButton("Sing up");
		btnNewButton_1.setBounds(28, 235, 100, 23);
		add(btnNewButton_1);
		
		JButton botonjuegos = new JButton("Juegos >");
		botonjuegos.setBounds(233, 42, 171, 23);
		add(botonjuegos);
		
		JButton botonperfil = new JButton("Perfil >");
		botonperfil.setBounds(233, 81, 171, 23);
		add(botonperfil);

	}
}
