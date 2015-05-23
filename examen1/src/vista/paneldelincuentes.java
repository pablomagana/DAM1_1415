package vista;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import modelo.datos;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.List;

public class paneldelincuentes extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private datos datosObj=new datos();
	/**
	 * Create the panel.
	 */
	public paneldelincuentes() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 440, 328);
		add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(233, 36, 145, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(236, 89, 66, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(236, 145, 142, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(317, 89, 61, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(236, 199, 142, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Antecedetes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(236, 284, 142, 23);
		panel.add(btnNewButton);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(233, 11, 46, 14);
		panel.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(236, 64, 46, 14);
		panel.add(lblEdad);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(319, 64, 46, 14);
		panel.add(lblSexo);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(236, 120, 69, 14);
		panel.add(lblNacionalidad);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(236, 176, 46, 14);
		panel.add(lblDireccin);
		
		JLabel lblPoblacin = new JLabel("Poblaci\u00F3n");
		lblPoblacin.setBounds(236, 230, 46, 14);
		panel.add(lblPoblacin);
		
		textField_5 = new JTextField();
		textField_5.setBounds(236, 253, 142, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		String[] delincuentesnombres={"delincuente 1","delincuente 2","delincuente 3","delincuente 4","delincuente 5","delincuente 6","delincuente 7","delincuente 8","delincuente 9","delincuente 10"};
		
		JList list = new JList(delincuentesnombres);
		
		list.setBounds(0, 0, 1, 1);
		
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 11, 164, 296);
		panel.add(scrollPane);
		
	}
}
