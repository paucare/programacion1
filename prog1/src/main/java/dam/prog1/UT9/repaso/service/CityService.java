package dam.prog1.UT9.repaso.service;

import java.util.List;
import dam.prog1.UT9.repaso.model.City;
import dam.prog1.UT9.repaso.repository.CityRepository;


public class CityService {
	
	public List<City> getAll(){
		return CityRepository.getInstance().getAll();
	}
	public City getById(int id) {
		return CityRepository.getInstance().getById(id);
	}
	public boolean create(City city) {
		return CityRepository.getInstance().create(city);
	}
	public boolean update(City city) {
		return CityRepository.getInstance().update(city);
	}
	public boolean delete(int id) {
		return CityRepository.getInstance().delete(id);
	}

}
