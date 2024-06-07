package dam.prog1.UT9.repaso.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConnection {
	
	private static BDConnection instance = null;
	private Connection con = null;
	private final String NAME="world";
	private final String URL="jdbc:mysql://localhost:3306/" + NAME;
	private final String USER="root";
	private final String PASS="";
	
	public static synchronized BDConnection getInstance() {
		if(instance==null) {
			instance = new BDConnection();
		}
		return instance;
	}
	public BDConnection() {
		System.out.println("Trying to connect...");
	
			try {
				this.con=DriverManager.getConnection(URL,USER,PASS);
				System.out.println("Connection made...");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error while trying to connect...");
			}
			
	}
	
	public Connection getConnection() {
		return con;
	}
	public void destroyConnection() {
		System.out.println("Closing database connection...");
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could not close the connection");
		} finally {
			instance=null;
		}
	}
	

}
