package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;


public class datos {
	
	//SQL
	private static String USUARIOS="SELECT usuario FROM delincuentes";
	//	
	private Connection conexion=null;
	private Statement sql = null;
	private ResultSet resultados = null;
	
	
	public datos(){
		this.conexion=conexionBD.getConexion();
	}
	
	public ArrayList<String[]> getUsuarios(){
		//creo arrayList para almacenar resultado de la consulta
		ArrayList<String[]> usuarios=new ArrayList<String[]>();
		
		try{
			//sentencia sql
			this.sql = this.conexion.createStatement();
			this.resultados = sql.executeQuery(USUARIOS);
					
			//Recorremos los resultados y los almacenamos en un ArrayList
			String[] delincuente=new String[7];
			
			while( resultados.next() ) {
				delincuente[0]=resultados.getString("nombre");
				delincuente[1]=resultados.getString("edad");
				delincuente[2]=resultados.getString("sexo");
				delincuente[3]=resultados.getString("nacionalidad");
				delincuente[4]=resultados.getString("direccion");
				delincuente[5]=resultados.getString("pobcion");
				delincuente[6]=resultados.getString("antecedentes");
				usuarios.add(delincuente);
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
