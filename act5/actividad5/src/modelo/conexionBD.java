package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexionBD {
	
//datos de la conexion
	static final String mysql_controler="com.mysql.jdbc.Driver";

//datos de la base de datos
	private String host;
	private String basedatos;
	private String user;
	private String password;
	
//conexion
 	private Connection conexion = null;
	
	public conexionBD(String host,String basedatos,String user,String password){
		this.host=host;
		this.basedatos=basedatos;
		this.user=user;
		this.password=password;
	}
	private boolean connectBD(){
		//carga controlador para la conexion else return false
		try{
			Class.forName(mysql_controler);
			//conectar a bd
			conexion= DriverManager.getConnection("jdbc:mysql://"+this.host+"/"+this.basedatos,this.user,this.password);
		} catch (SQLException e1) {
			e1.printStackTrace();
			return false;
		}catch(ClassNotFoundException e2){
			e2.printStackTrace();
			return false;
		}
		return true;
	}
	
	public Connection getConexion(){
		return this.conexion;
	}

}
