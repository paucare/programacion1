package dam.prog1.UT9.repaso.repository;

import java.util.List;

import dam.prog1.UT9.repaso.dao.city.*;
import dam.prog1.UT9.repaso.model.City;


public class CityRepository {
	
	private static CityRepository instance = null;
	private CityDaoFiles dao;
	
	public static synchronized CityRepository getInstance() {
		if(instance==null) {
			instance = new CityRepository();
		}
		return instance;
	}
	
	private CityRepository() {
		this.dao = new CityDaoFiles();
	}
	public List<City> getAll(){
		return dao.getAll();
	}
	public City getById(int id) {
		return dao.getById(id);
	}
	public boolean create(City city) {
		return dao.create(city);
	}
	public boolean update(City city) {
		return dao.update(city);
	}
	public boolean delete(int id) {
		return dao.delete(id);
	}

}
