package dam.prog1.UT9.repasoII.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import dam.prog1.UT9.repaso.model.City;

public class EjemploDaoFiles {
	private final String DELIMITER = ";";
	private final String nameFile= "Cities.txt";
	private final Path path = Paths.get("C:/Users/bepol/Desktop" + nameFile);
	
	public List<City> getCities(){
		
		List<City> cities = new ArrayList<>();
		try(BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8);){
			System.out.println("Leyendo ciudades");
			String line;
			while((line=br.readLine())!=null) {
				City c = parseCity(line);
				cities.add(c);
			}
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("Error al leer el fichero");
		}
		
		return cities;
	}
	public City getCity(int id){
		City c = null;
		try(BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8);){
			System.out.println("Buscando ciudad");
			String line;
			while((line = br.readLine())!=null) {
				c = parseCity(line);
				if(c.getId()==id && c != null) {
					System.out.println("City found");
					return c;
				}
				
			}
		}catch(IOException e) {
			System.out.println("Error al leer el fichero");	
		}
		
		return null;
	}
	
	public City parseCity(String line) {
		
		String[] lines =  line.split(DELIMITER);
		
		int id =0;
		String name= null, countryCode=null, district = null;
		long population = 0;
		
		for(String item : lines) {
			String[] keyVal = item.split("=");
			String key = keyVal[0].trim();
			String value = keyVal.length > 1 ? keyVal[1].trim() : " ";
			
			switch(key) {
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
	
		return new City(id,name,countryCode,district,population);
	}

}
