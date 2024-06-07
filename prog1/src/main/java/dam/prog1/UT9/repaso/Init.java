package repaso.examen.UT8_UT9;

import java.util.List;
import java.util.Scanner;

import repaso.examen.UT8_UT9.model.City;
import repaso.examen.UT8_UT9.service.CityService;

public class Init {

	static Scanner sc = new Scanner(System.in);
	static CityService cs = new CityService();

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
    	int option = -1;
    	do {
    	display();
    	option = sc.nextInt();
    	sc.nextLine();
    	if(option>0) {
    		menuHandler(option);
    	}
    	if(option==0) {
    		System.out.println("Exiting the program...");
    	}
    	}while(option!=0);
    	
    	
    }

	private static void menuHandler(int option) {
		switch(option) {
		case 1: showAllCities();break;
		case 2: showOneCity();break;
		case 3: createACity();break;
		case 4: updateACity(); break;
		case 5: deleteACity();break;
		default: System.out.println("Option not valid");break;
		}
	}

	private static void deleteACity() {
		
		
	}

	private static void updateACity() {
		
	}

	private static void createACity() {
	    System.out.println("Enter the city data");
	    System.out.println("Enter the id:");
	    int id = sc.nextInt();
	    sc.nextLine();
	    System.out.println("Enter the name:");
	    String name = sc.nextLine();
	    System.out.println("Enter the country code:");
	    String countryCode = sc.nextLine();
	    System.out.println("Enter the district:");
	    String district = sc.nextLine();
	    System.out.println("Enter the population:");
	    long population = sc.nextLong();
	    City c = new City(id, name, countryCode, district, population);
	    cs.create(c);
	    System.out.println("You inserted a new city");
	}


	private static void showOneCity() {
		System.out.println("Enter the id you look for");
		int id = sc.nextInt();
		sc.nextLine();
		City c = cs.getById(id);
		System.out.println(c);
		
	}

	private static void showAllCities() {
		List<City> cities = cs.getAll();
		for(City element : cities) {
			System.out.println(element);
		}
		
	}

	public static void display() {
		System.out.println("Menu");
		System.out.println("Select an option, please.");
		System.out.println("0. Exit");
		System.out.println("1. Get All Cities");
		System.out.println("2. Get City by Id");
		System.out.println("3. Insert a City");
		System.out.println("4. Update a city");
		System.out.println("5. Delete a city");
	}
}
