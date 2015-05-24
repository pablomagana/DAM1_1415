package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;


public class datos {
		
	private Connection conexion=null;
	private Statement sql = null;
	private ResultSet resultados = null;
	
	
	public datos(){
		this.conexion=conexionBD.getConexion();
	}
	
	public ArrayList<String[]> getAllDelincuentes(String nombreDelincuenteBuscado){
		//creo arrayList para almacenar resultado de la consulta
		ArrayList<String[]> usuarios=new ArrayList<String[]>();
		
		try{
			//sentencia sql
			this.sql = this.conexion.createStatement();
			this.resultados = sql.executeQuery("select * from delincuentes where nombre='"+nombreDelincuenteBuscado+"'");
					
			//Recorremos los resultados y los almacenamos en un ArrayList
			
			
			while( resultados.next() ) {
				String[] delincuente=new String[7];
				delincuente[0]=resultados.getString("nombre");
				delincuente[1]=resultados.getString("edad");
				delincuente[2]=resultados.getString("sexo");
				delincuente[3]=resultados.getString("nacionalidad");
				delincuente[4]=resultados.getString("direccion");
				delincuente[5]=resultados.getString("poblacion");
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
	public ArrayList<String> getNombres(){
		//creo arrayList para almacenar resultado de la consulta
		ArrayList<String> usuarios=new ArrayList<String>();
		
		try{
			//sentencia sql
			this.sql = this.conexion.createStatement();
			this.resultados = sql.executeQuery("select nombre from delincuentes");
					
			//Recorremos los resultados y los almacenamos en un ArrayList
			
			while( resultados.next() ) {
				usuarios.add(resultados.getString("nombre"));
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
	public ArrayList<String[]> getUsuarios(){
		//creo arrayList para almacenar resultado de la consulta
		ArrayList<String[]> usuarios=new ArrayList<String[]>();
		
		try{
			//sentencia sql
			this.sql = this.conexion.createStatement();
			this.resultados = sql.executeQuery("select * from usuarios");
					
			//Recorremos los resultados y los almacenamos en un ArrayList
			
			while( resultados.next() ) {
				String[] delincuente=new String[2];
				delincuente[0]=resultados.getString("usuario");
				delincuente[1]=resultados.getString("pass");
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
	public void actualizarAntecedentes(String antecedentes,String nombredelincuente){
		try{
			//sentencia sql
			this.sql = this.conexion.createStatement();
			sql.executeUpdate("update delincuentes set antecedentes='"+antecedentes+"' where nombre='"+nombredelincuente+"'");
					
						
		}catch( SQLException excepcionSql ) {
			excepcionSql.printStackTrace();
		}finally{
			try{
				sql.close();
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
			}
		}
	}
}
