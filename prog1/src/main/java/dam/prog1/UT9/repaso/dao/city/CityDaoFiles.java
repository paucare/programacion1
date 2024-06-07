package dam.prog1.UT9.repaso.dao.city;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import dam.prog1.UT9.repaso.model.City;

public class CityDaoFiles implements CityDao {

	private final String DELIMITER = ";";
	private final String nameFile = "Cities.txt";
	private final Path path = Paths.get("C:/Users/bepol/Desktop" + nameFile);

	@Override
	public List<City> getAll() {
		List<City> cities = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8);) {
			System.out.println("Getting the cities...");
			String line;

			while ((line = br.readLine()) != null) {
				City c = parseCity(line);
				cities.add(c);
			}

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error while getting cities...");
		}

		return cities;
	}

	@Override
	public City getById(int id) {
		City c = null;
		try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {

			System.out.println("Getting a city...");
			String line;
			while ((line = br.readLine()) != null) {
				c = parseCity(line);
				if (c.getId() == id && c != null) {
					System.out.println("City found...");
					return c;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error while getting the city");
		}

		return c;
	}

	@Override
	public boolean create(City city) {

		return false;
	}

	@Override
	public boolean update(City city) {

		return false;
	}

	@Override
	public boolean delete(int id) {

		return false;
	}

	private City parseCity(String line) {

		String[] splits = line.split(DELIMITER);

		int id = 0;
		String name = null, countryCode = null, district = null;
		long population = 0;

		for (String item : splits) {

			String[] keyAndVal = item.split("=");
			String key = keyAndVal[0].trim();
			String value = keyAndVal.length > 1 ? keyAndVal[1].trim() : " ";

			switch (key) {
			case "id":
				id = value.isEmpty() ? 0 : Integer.valueOf(id);
				break;
			case "name":
				name = value;
				break;
			case "countryCode":
				countryCode = value;
				break;
			case "district":
				district = value;
				break;
			case "population":
				population = value.isEmpty() ? 0 : Long.valueOf(population);
				break;
			}

		}

		return new City(id, name, countryCode, district, population);
	}

}
