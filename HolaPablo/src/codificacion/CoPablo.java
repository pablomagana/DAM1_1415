package codificacion;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
public class CoPablo extends JFrame implements ActionListener{
	private Container contenedor;
	public JButton codificar;
	public JButton decodificar;
	public JTextArea escribir;
	public JTextArea texto;
	Pablo p=new Pablo();
	public static void main(String[] args){
		new CoPablo();
	}
	
	public CoPablo(){
		contenedor=getContentPane();
		contenedor.setLayout(null);
		setTitle("Codificador y decodificador de textos");//asignar titulo a la ventana
		setSize(500,400);//tama�o de la ventana
		setLocationRelativeTo(null);//situar la ventana en centro pantalla
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		codificar=new JButton();
		decodificar=new JButton();
		codificar.setText("codificar");
		decodificar.setText("decodificar");
		codificar.setBounds(106, 160, 100, 23);
		decodificar.setBounds(288, 160, 100, 23);
		codificar.addActionListener(this);
		decodificar.addActionListener(this);
		
		escribir=new JTextArea();
		escribir.setBounds(50, 50, 400, 100);
		
		contenedor.add(codificar);
		contenedor.add(decodificar);
		contenedor.add(escribir);
		
		texto = new JTextArea("no se ha codificado nada todavia");
		texto.setBackground(Color.WHITE);
		
		texto.setBounds(50, 216, 395, 100);
		contenedor.add(texto);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent evento){
		if(evento.getSource()==codificar){
		texto.setText(p.codificar(escribir.getText()));
		contenedor.add(texto);
		}
		if(evento.getSource()==decodificar){
		texto.setText(p.decodificar(escribir.getText()));
		contenedor.add(texto);
		}
	}
}
