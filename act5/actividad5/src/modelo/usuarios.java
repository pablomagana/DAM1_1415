package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;


public class usuarios {
	
	//SQL
	private static String USUARIOS="SELECT usuario FROM corredores";
	//	
	private Connection conexion=null;
	private Statement sql = null;
	private ResultSet resultados = null;
	
	
	public usuarios(){
		this.conexion=conexionBD.getConexion();
	}
	
	public ArrayList<String> getUsuarios(){
		//creo arrayList para almacenar resultado de la consulta
		ArrayList<String> usuarios=new ArrayList<String>();
		try{
			//sentencia sql
			this.sql = this.conexion.createStatement();
			this.resultados = sql.executeQuery(USUARIOS);
					
			//Recorremos los resultados y los almacenamos en un ArrayList
			
			while( resultados.next() ) {
				usuarios.add(resultados.getString("usuario"));
			}
			
		}catch( SQLException excepcionSql ) {
			excepcionSql.printStackTrace();
		}finally{
			try{
				resultados.close();
				sql.close();
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
			}
		}
		return usuarios;
	}
}
