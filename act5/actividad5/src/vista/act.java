package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.CardLayout;


public class act extends JFrame {
	
	//ventana principal
	
	public act() {
		setTitle("actividad 5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 400);
		
		//creo el menu horizontal superior
		
		JMenuBar menu = new JMenuBar();
		setJMenuBar(menu);//aplico menu
		
		//añado botones al menu
		
		JMenu principal = new JMenu("principal");
		menu.add(principal);
		
		JMenu juegos = new JMenu("perfil");
		menu.add(juegos);
		
		JMenu menu_1 = new JMenu("principal");
		menu.add(menu_1);
		getContentPane().setLayout(null);
		
		
		
		//añado el panel creado el otra clase a la ventana principal
		
		JPanel panelinferior= new PanelPrincipal();
		//setContentPane(panelinferior);//aplicar panel a la ventana

		JPanel panelCard = new JPanel();
		panelCard.setBounds(0, 0, 374, 340);
		getContentPane().add(panelCard);
		panelCard.setLayout(new CardLayout(0, 0));
		panelCard.add(panelinferior,"panelinferior");
	}
}
