package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;


public class act extends JFrame {

	public act() {
		setTitle("actividad 5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		
		JMenuBar menu = new JMenuBar();
		setJMenuBar(menu);//aplicar menu
		
		JMenu principal = new JMenu("principal");
		menu.add(principal);
		
		JMenu juegos = new JMenu("perfil");
		menu.add(juegos);
		
		JMenu menu_1 = new JMenu("principal");
		menu.add(menu_1);
		
		JPanel panelinferior= new panelPrincipal();
		setContentPane(panelinferior);//aplicar panel a la ventana
	}

}
