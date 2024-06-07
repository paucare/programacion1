package dam.prog1.UT9.repaso.dao.city;

import java.util.List;

import dam.prog1.UT9.repaso.model.City;

public interface CityDao {
		
	public List<City> getAll();
	public City getById(int id);
	public boolean create(City city);
	public boolean update(City city);
	public boolean delete(int id);
}
