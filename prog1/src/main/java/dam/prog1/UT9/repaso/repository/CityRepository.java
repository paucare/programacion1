package repaso.examen.UT8_UT9.repository;

import java.util.List;

import repaso.examen.UT8_UT9.dao.city.CityDao;
import repaso.examen.UT8_UT9.dao.city.CityDaoFiles;
import repaso.examen.UT8_UT9.model.City;

public class CityRepository {
	
	private static CityRepository instance = null;
	private CityDao dao;
	
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
