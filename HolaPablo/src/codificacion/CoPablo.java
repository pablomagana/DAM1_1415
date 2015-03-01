package codificacion;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
public class CoPablo extends JFrame implements ActionListener{
	
	private Container contenedor;
	public JButton codificar;
	public JButton decodificar;
	public JTextArea texto;
	public JTextArea escribir;
	Pablo p=new Pablo();
	public static void main(String[] args){
		CoPablo c=new CoPablo();
		//Pablo p=new Pablo();//esta linea no funciona
	}
	
	public CoPablo(){
		contenedor=getContentPane();
		contenedor.setLayout(null);
		setTitle("Codificador y decodificador de textos");//asignar titulo a la ventana
		setSize(500,400);//tamaño de la ventana
		setLocationRelativeTo(null);//situar la ventana en centro pantalla
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		codificar=new JButton();
		decodificar=new JButton();
		codificar.setText("codificar");
		decodificar.setText("decodificar");
		codificar.setBounds(50, 160, 100, 23);
		decodificar.setBounds(200, 160, 100, 23);
		codificar.addActionListener(this);
		decodificar.addActionListener(this);
		
		texto=new JTextArea();
		texto.setText("");
		texto.setBounds(50, 200, 400, 100);
		
		escribir=new JTextArea();
		escribir.setBounds(50, 50, 400, 100);
		
		contenedor.add(codificar);
		contenedor.add(decodificar);
		contenedor.add(escribir);
		contenedor.add(texto);	
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent evento){
		if(evento.getSource()==codificar){
			texto.insert("",0);
			texto.insert(p.codificar(escribir.getText()),0);
		}
		if(evento.getSource()==decodificar){
			texto.insert("",0);
			texto.insert(p.decodificar(escribir.getText()),0);
		}
	}
	
}
