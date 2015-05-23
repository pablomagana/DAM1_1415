package vista;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panelAntecedentes extends JPanel {

	/**
	 * Create the panel.
	 */
	public panelAntecedentes() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Antecedentes");
		lblNewLabel_1.setBounds(32, 27, 89, 14);
		add(lblNewLabel_1);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(32, 63, 349, 194);
		add(editorPane);
		
		JButton btnNewButton = new JButton("Salvar >>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(32, 278, 89, 23);
		add(btnNewButton);

	}
}
