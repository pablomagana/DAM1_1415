package vista;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import modelo.datos;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class paneldelincuentes extends JPanel {
	private JTextField nombredelincuente;
	private JTextField edaddelincuente;
	private JTextField nacionalidaddelincuente;
	private JTextField sexodelincuente;
	private JTextField direcciondelincuente;
	private JTextField poblaciondelincuente;
	private datos datosObj;
	private Iterator<String[]> infodelincuentes;
	private String[] delincuente;
	private JPanel panel3;
	/**
	 * Create the panel.
	 */
	public paneldelincuentes(JPanel card,datos datos) {
		setLayout(null);
		this.datosObj=datos;
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 440, 328);
		add(panel);
		panel.setLayout(null);
		
		nombredelincuente = new JTextField();
		nombredelincuente.setEditable(false);
		nombredelincuente.setBounds(236, 36, 145, 20);
		panel.add(nombredelincuente);
		nombredelincuente.setColumns(10);
		
		edaddelincuente = new JTextField();
		edaddelincuente.setEditable(false);
		edaddelincuente.setBounds(236, 89, 66, 20);
		panel.add(edaddelincuente);
		edaddelincuente.setColumns(10);
		
		nacionalidaddelincuente = new JTextField();
		nacionalidaddelincuente.setEditable(false);
		nacionalidaddelincuente.setBounds(236, 145, 142, 20);
		panel.add(nacionalidaddelincuente);
		nacionalidaddelincuente.setColumns(10);
		
		sexodelincuente = new JTextField();
		sexodelincuente.setEditable(false);
		sexodelincuente.setBounds(317, 89, 61, 20);
		panel.add(sexodelincuente);
		sexodelincuente.setColumns(10);
		
		direcciondelincuente = new JTextField();
		direcciondelincuente.setEditable(false);
		direcciondelincuente.setBounds(236, 199, 142, 20);
		panel.add(direcciondelincuente);
		direcciondelincuente.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(233, 11, 142, 14);
		panel.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(236, 64, 46, 14);
		panel.add(lblEdad);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(319, 64, 46, 14);
		panel.add(lblSexo);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(236, 120, 145, 14);
		panel.add(lblNacionalidad);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(236, 176, 142, 14);
		panel.add(lblDireccin);
		
		JLabel lblPoblacin = new JLabel("Poblaci\u00F3n");
		lblPoblacin.setBounds(236, 230, 145, 14);
		panel.add(lblPoblacin);
		
		poblaciondelincuente = new JTextField();
		poblaciondelincuente.setEditable(false);
		poblaciondelincuente.setBounds(236, 253, 142, 20);
		panel.add(poblaciondelincuente);
		poblaciondelincuente.setColumns(10);
		String[] delincuentesnombres=datosObj.getNombres().toArray(new String[datosObj.getNombres().size()]);
		
		JList list = new JList(delincuentesnombres);
		list.setBounds(0, 0, 1, 1);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				System.out.println(list.getSelectedValue());
				infodelincuentes = datos.getAllDelincuentes((String) list.getSelectedValue()).iterator();
				while(infodelincuentes.hasNext()){
					delincuente=infodelincuentes.next();
					nombredelincuente.setText(delincuente[0]);
					edaddelincuente.setText(delincuente[1]);
					sexodelincuente.setText(delincuente[2]);
					nacionalidaddelincuente.setText(delincuente[3]);
					direcciondelincuente.setText(delincuente[4]);
					poblaciondelincuente.setText(delincuente[5]);
				}
				
			}
		});
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 11, 164, 296);
		panel.add(scrollPane);
		
		JButton antecedentes= new JButton("Antecedetes >>");
		antecedentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel3=new panelAntecedentes(delincuente[6],datosObj,delincuente[0]);
				card.add(panel3, "panel3");
				String delincuenteSeleccionado=(String)list.getSelectedValue();
				CardLayout c=(CardLayout) card.getLayout();
				c.show(card, "panel3");
			}
		});
		antecedentes.setBounds(236, 284, 142, 23);
		panel.add(antecedentes);
	}
}
