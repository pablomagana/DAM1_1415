package modelo;

public class conexionBD {
//datos de la conexion
	static final String mysql_controler="com.mysql.jdbc.Driver";

//datos de la base de datos
	private String url;
	private String basedatos;
	private String user;
	private String password;
	
	public conexionBD(String url,String basedatos,String user,String password){
		this.url=url;
		this.basedatos=basedatos;
		this.user=user;
		this.password=password;
	}
	private boolean connectBD(){
		//carga controlador para la conexion else return false
		try{
			Class.forName(mysql_controler);
			return true;
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
			return false;
		}
	}

}
