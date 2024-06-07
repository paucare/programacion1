package dam.prog1.UT9.repaso.dao.city;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dam.prog1.UT9.repaso.model.City;
import dam.prog1.UT9.repaso.util.BDConnection;

public class CityDaoMySQL implements CityDao {
	
	private final String SELECT_ALL="SELECT id,name,countryCode,district,population FROM city LIMIT 10;";
	private final String SELECT_BY_ID="SELECT id,name,countryCode,district,population FROM city WHERE id=?;";
	//Esta bd incrementa el id por si sola
	private final String CREATE="INSERT INTO city(name,countryCode,district,population VALUES(?,?,?,?);";
	private final String UPDATE="UPDATE city SET name=? countryCode=? district=? population=? WHERE id=?;";
	private final String DELETE="DELETE FROM city WHERE ID=?;";
	

	@Override
	public List<City> getAll() {
		
		List<City> cities = new ArrayList<>();
		System.out.println("Getting cities...");
		Connection con = BDConnection.getInstance().getConnection();
		if(con!=null) {
			try {
				PreparedStatement stmt = con.prepareStatement(SELECT_ALL);
				
				ResultSet rs = stmt.executeQuery();
				
				while(rs.next()) {
					City c = new City(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getLong(5));
					cities.add(c);
				}
				
			}catch(SQLException e) {
				e.printStackTrace();
				System.out.println("Error while trying to get the cities...");
			}
		}else {
			System.out.println("Could not establish connection...");
		}
		
		System.out.println("Success retrieving cities...");
		
		return cities;
	}

	@Override
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
			}
		}else {
			System.out.println("Could not establish connection...");
		}
		
		System.out.println("Success retrieving cities...");
		
		return c;
	}

	@Override
	public boolean create(City city) {
		
		boolean result=false;
		System.out.println("Getting city...");
		Connection con = BDConnection.getInstance().getConnection();
		if(con!=null) {
			try (PreparedStatement stmt = con.prepareStatement(CREATE);){
				stmt.setString(1, city.getName());
				stmt.setString(2, city.getCountryCode());
				stmt.setString(3, city.getDistrict());
				stmt.setLong(4, city.getPopulation());
				
				int affectedRows= stmt.executeUpdate();
				if(affectedRows==1) {
					System.out.println("City insert successful...");
					result=true;
				} else {
					System.out.println("City was not inserted...");
				}				
			}catch(SQLException e) {
				e.printStackTrace();
				System.out.println("Error while trying to insert the city...");
			}
		} else {
			System.out.println("Could not establish connection...");
		}
		
		System.out.println("Success retrieving city...");
		return result;
	}

	@Override
	public boolean update(City city) {
		boolean result=false;
		System.out.println("Updating city...");
		Connection con = BDConnection.getInstance().getConnection();
		if(con!=null) {
			try(PreparedStatement stmt = con.prepareStatement(UPDATE);){
				stmt.setString(1, city.getName());
				stmt.setString(2, city.getCountryCode());
				stmt.setString(3, city.getDistrict());
				stmt.setLong(4, city.getPopulation());
				stmt.setInt(5, city.getId());
				
				int affectedRows = stmt.executeUpdate();
				
				if(affectedRows==1) {
					System.out.println("City update successful...");
					result=true;
				} else {
					System.out.println("City was not updated...");
				}	
				
			} catch(SQLException e) {
				e.printStackTrace();
				System.out.println("Error while trying to update the city...");
			}
			
			System.out.println("Success retrieving city...");
			return result;
			
		}
		return result;
	}

	@Override
	public boolean delete(int id) {
		boolean result=false;
		System.out.println("Deleting city...");
		Connection con = BDConnection.getInstance().getConnection();
		if(con!=null) {
			try (PreparedStatement stmt = con.prepareStatement(DELETE);){
				stmt.setInt(1, id);
				
				int affectedRows= stmt.executeUpdate();
				if(affectedRows==1) {
					System.out.println("City deleted successful...");
					result=true;
				} else {
					System.out.println("City was not deleted...");
				}				
			}catch(SQLException e) {
				e.printStackTrace();
				System.out.println("Error while trying to insert the city...");
			}
		} else {
			System.out.println("Could not establish connection...");
		}
		
		System.out.println("Success retrieving city...");
	
		return result;
	}

}
