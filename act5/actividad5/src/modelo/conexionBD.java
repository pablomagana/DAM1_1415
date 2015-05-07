package modelo;

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
			DriverManager.getConnection("jdbc:mysql://"+this.host+"/"+this.basedatos,this.user,this.password);
		} catch (SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
