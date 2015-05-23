package controlador;

import modelo.conexionBD;
import vista.principal;

public class main {
	
	public static void main(String[] args) {
		conexionBD objetoConexion;
		
		objetoConexion=new conexionBD("localhost","delincuentes","root","22545194");
		
		objetoConexion.connectBD();
		
		principal ventana=new principal();
		ventana.setVisible(true);
	}
}
