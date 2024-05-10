package Alessandro.Alonso.Dam.tema1;

import java.util.Scanner;

public class Ejercicio4Bisiesto {
	
	public static void main(String[] args) {

	//Introducir el año 
	
	Scanner leer = new Scanner(System.in);	
	System.out.print("Introduce un año");
	
	//Operaciones
	
	int year = leer.nextInt();
	
	if(year % 100 == 0 && year % 400 == 0)
		System.out.println("El año introducido es secular");
	else if(year % 4 == 0)
		System.out.println("El año introducido es bisiesto");
	else
		System.out.println("El año introducido no es bisiesto");
	
	leer.close();
	
	}

}
