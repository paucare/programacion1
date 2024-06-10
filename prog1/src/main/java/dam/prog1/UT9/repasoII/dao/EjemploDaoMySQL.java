package dam.prog1.UT9.repasoII.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dam.prog1.UT9.repaso.model.City;
import dam.prog1.UT9.repaso.util.BDConnection;
import dam.prog1.UT9.repasoII.util.DBConnection;

public class EjemploDaoMySQL {
	private final String SELECT_ALL = "SELECT id,name,countryCode,district,population FROM city LIMIT 10;";
	private final String SELECT_BY_ID = "SELECT id,name,countryCode,district,population FROM city WHERE id = ?;";
	private final String CREATE = "INSERT INTO city(name,countryCode,district,population) VALUES(?,?,?,?);";
	private final String UPDATE = "UPDATE city SET name=? countryCode = ? district = ? population = ? WHERE	 id = ?";
	private final String DELETE = "DELETE FROM city WHERE id = ?";

	public List<City> getAll() {

		List<City> list = new ArrayList<>();
		System.out.println("Obteniendo todas");
		Connection con = DBConnection.getInstance().getConnection();
		if (con != null) {
			try {
				// PreparedStatement st = con.prepareStatement(SELECT_ALL);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(SELECT_ALL);
				while (rs.next()) {
					City c = new City(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getLong(5));
					list.add(c);
				}
			} catch (SQLException e) {
				System.out.println("Fallo al obtener las ciudades");
				e.printStackTrace();
			} finally {
				DBConnection.getInstance().destroyConnection();
			}

		} else {
			System.out.println("Fallo al obtener la conexion");
		}
		System.out.println("Ciudades obtenidas con exito");
		return list;
	}

	public City getById(int id) {
		
		City c=null;
		System.out.println("Getting city...");
		//1
		Connection con = BDConnection.getInstance().getConnection();
		if(con!=null) {
			try {
				//2
				PreparedStatement stmt = con.prepareStatement(SELECT_BY_ID);
				stmt.setLong(1, id);
				//3
				ResultSet rs = stmt.executeQuery();
				//4
				while(rs.next()) {
				 c = new City(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getLong(5));
				}
				
			}catch(SQLException e) {
				e.printStackTrace();
				System.out.println("Error while trying to get the city...");
			}finally {
				DBConnection.getInstance().destroyConnection();
			}
		}else {
			System.out.println("Could not establish connection...");
		}
		
		System.out.println("Success retrieving cities...");
		
		return c;
	}
	
	public boolean createCity(City c) {
		boolean result = false;
		System.out.println("Creating a city");
		
		Connection con = DBConnection.getInstance().getConnection();
		if(con!=null) {
			try {
				
				PreparedStatement st = con.prepareStatement(CREATE);
				st.setString(1, c.getName());
				st.setString(2, c.getDistrict());
				st.setString(3, c.getCountryCode());
				st.setLong(4, c.getPopulation());
				int affectedRows = st.executeUpdate();
				
				if(affectedRows == 1){
					System.out.println("City created succesfully");
					result = true;	
				} else {
					System.out.println("City not created");
				}
				
			}catch(SQLException e) {
				e.printStackTrace();
				System.out.println("Error while creating the city");
			}finally {
				DBConnection.getInstance().destroyConnection();
			}
			
		}else {
			System.out.println("Error while getting the connection");
		}
		
		return result;
	}
	
	public boolean updateCity(City c) {
		boolean result = false;
		
		System.out.println("Updating a city");
		Connection con = DBConnection.getInstance().getConnection();
		
		if(con!=null) {
			try {
				PreparedStatement st = con.prepareStatement(UPDATE);
				st.setString(1,c.getName());
				st.setString(2,c.getCountryCode());
				st.setString(3,c.getDistrict());
				st.setLong(4,c.getPopulation());
				st.setLong(5, c.getId());
				
				int affectedRows = st.executeUpdate();
				if(affectedRows == 1) {
					System.out.println("City updated succesfully");
					result = true;
				}  else {
					System.out.println("City not updated");
				}
				
			}catch(SQLException e){
				e.printStackTrace();
				System.out.println("Error while updating the city");
			} finally {
				DBConnection.getInstance().destroyConnection();
			}
			
		} else {
			System.out.println("Error while getting the connection");
		}
		
		return result;
	}
	
	public boolean deleteCity(int id) {
		boolean result = false;
		System.out.println("Deleting a city");
		
		Connection con = DBConnection.getInstance().getConnection();
		
		if(con!=null) {
			try {
				PreparedStatement st = con.prepareStatement(DELETE);
				st.setLong(1, id);
				int affectedRows = st.executeUpdate();
				if(affectedRows == 1) {
					System.out.println("City deleted succesfully");
					result = true;
				} else {
					System.out.println("City not deleted");
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error while deleting the city");
			} finally {
				DBConnection.getInstance().destroyConnection();
			}
			
		} else {
			System.out.println("Error while getting the connection");
		}
		
		return result;
	}

}
