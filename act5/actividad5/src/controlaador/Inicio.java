package controlaador;

import modelo.conexionBD;
import vista.*;

public class Inicio {
	
	
	public static void main(String[] args) {
		
		conexionBD objetoConexion;
		
		objetoConexion=new conexionBD("localhost","gamesbd","root","22545194");
		
		if(objetoConexion.connectBD()==true){
			System.out.println("correcto");
		}
		else{ System.out.println("error");
		}
		//se crea una ventana nueva y se hace visible
		act ventana=new act();
		ventana.setVisible(true);

	}

}
