package vista;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import modelo.datos;

public class panelAntecedentes extends JPanel {
	JEditorPane cuadroantecedentes;
	
	
	public panelAntecedentes(String antecedentes,datos datos,String nombredelincuente) {
		setLayout(null);
		
		JLabel antecedentesText = new JLabel("Antecedentes");
		antecedentesText.setBounds(32, 27, 89, 14);
		add(antecedentesText);
		
		cuadroantecedentes = new JEditorPane();
		cuadroantecedentes.setBounds(32, 63, 349, 149);
		cuadroantecedentes.setText(antecedentes);
		add(cuadroantecedentes);
		
		JButton salvar = new JButton("Salvar >>");
		salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				datos.actualizarAntecedentes(cuadroantecedentes.getText(), nombredelincuente);
			}
		});
		salvar.setBounds(32, 241, 89, 23);
		add(salvar);

	}
	
}
