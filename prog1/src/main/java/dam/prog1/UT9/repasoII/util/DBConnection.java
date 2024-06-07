package dam.prog1.UT9.repasoII.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static DBConnection instance= null;
	private Connection con = null;
	private final String NAME = "nombre";
	private final String URL = "url"+ NAME;
	private final String USER = "user";
	private final String PASS = "pass";
	
	public static DBConnection getInstance() {
		if(instance==null) {
			instance = new DBConnection();
		}
		return instance;
	}
	
	public DBConnection(){
		System.out.println("Estableciendo conexión");
		try {
			con = DriverManager.getConnection(URL,USER,PASS);
			System.out.println("Conexión establecida");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Fallo al establecer la conexión");
		}
	}
	
	public Connection getConnection() {
		return con;
	}
	
	public void destroyConnection() {
		System.out.println("Cerrando conexión");
		try {
			con.close();
			System.out.println("Conexión cerrada");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Fallo al cerrar la conexión");
		} finally{
			instance = null;
		}
	}

}
