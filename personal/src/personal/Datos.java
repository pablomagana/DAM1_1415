package personal;

import java.awt.EventQueue;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.Canvas;

public class Datos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField direccion;
	private JTextField email;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Datos frame = new Datos();
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
	public Datos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\pablo\\Pictures\\ROBOT\\ROBOT2.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		Panel izquierda = new Panel();
		contentPane.add(izquierda);
		izquierda.setLayout(null);
		
		Panel derecha = new Panel();
		contentPane.add(derecha);
		derecha.setLayout(null);
		
		//panel de la derecha
		JLabel nombre = new JLabel("nombre");
		nombre.setBounds(10, 99, 82, 14);
		izquierda.add(nombre);
		
		JLabel apellidos = new JLabel("apellidos");
		apellidos.setBounds(10, 133, 82, 14);
		izquierda.add(apellidos);
		
		textField = new JTextField();
		textField.setBounds(102, 96, 100, 20);
		izquierda.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(102, 130, 100, 20);
		izquierda.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDireccin = new JLabel("direcci\u00F3n");
		lblDireccin.setBounds(10, 170, 82, 14);
		izquierda.add(lblDireccin);
		
		JLabel lblCorreoElectronico = new JLabel("email");
		lblCorreoElectronico.setBounds(10, 206, 31, 20);
		izquierda.add(lblCorreoElectronico);
		
		direccion = new JTextField();
		direccion.setBounds(102, 167, 100, 20);
		izquierda.add(direccion);
		direccion.setColumns(10);
		
		email = new JTextField();
		email.setBounds(102, 206, 100, 20);
		izquierda.add(email);
		email.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 11, 70, 70);
		izquierda.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\pablo\\Pictures\\ROBOT\\ROBOT4.jpg"));
		
		
		//panel de la derecha
		JLabel edad = new JLabel("edad");
		edad.setBounds(10, 96, 46, 14);
		derecha.add(edad);
		
		JButton generarFicha = new JButton("generar ficha");
		generarFicha.setBounds(10, 158, 196, 23);
		derecha.add(generarFicha);
		
		JButton borrar = new JButton("borrar");
		borrar.setBounds(10, 203, 196, 23);
		derecha.add(borrar);
		
		JCheckBox conducir = new JCheckBox("permiso de conducir");
		conducir.setBounds(10, 128, 200, 23);
		derecha.add(conducir);
		
		JComboBox comboEdad = new JComboBox();
		Object[] edades=new Object[83];
		for(int i=0;i<edades.length;i++){
			edades[i]=i+18;
		}
		comboEdad.setModel(new DefaultComboBoxModel(edades));
		comboEdad.setBounds(102, 93, 49, 20);
		derecha.add(comboEdad);
		
		JLabel github = new JLabel("perfil github");
		github.setBounds(10, 55, 86, 14);
		derecha.add(github);
		
		textField_4 = new JTextField();
		textField_4.setBounds(102, 52, 100, 20);
		derecha.add(textField_4);
		textField_4.setColumns(10);
		
	}
	public void pasardatos(int i){
		/*onombre=;
		oapellidos=;
		odireccion=;
		oemail=;
		ogithud=;
		ocomboEdad=;
		oconducir=*/
	}
}
