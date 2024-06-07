package dam.prog1.UT9.repasoII.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dam.prog1.UT9.repasoII.util.DBConnection;

public class EjemploDaoMySQL {
	private final String SELECT_ALL = "SELECT id,name,countryCode,district,population FROM city LIMIT 10;";
	
	public List<Object> getAll(){
		
		List<Object> list = new ArrayList<>();
		System.out.println("Obteniendo todas");
		Connection con = DBConnection.getInstance().getConnection();
		if(con!=null) {
			try {
				//PreparedStatement st = con.prepareStatement(SELECT_ALL);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(SELECT_ALL);
				while(rs.next()) {
					Object o = null;
					list.add(o);
				}
			} catch (SQLException e) {
				System.out.println("Fallo al obtener las ciudades");
				e.printStackTrace();
			}
			
		}else {
			System.out.println("Fallo al obtener la conexion");
		}
		System.out.println("Ciudades obtenidas con exito");
		return list;
	}
}
