package Alessandro.Alonso.Dam.tema1;

import java.util.Scanner;

public class Ejercicio5Gravedad {

	public static void main(String[] args) {
		 
		//Pedir peso
		
		Scanner leer = new Scanner(System.in);	
		System.out.print("Introduce tu peso en Kg");
		
		// Operaciones
		
		double weight = leer.nextDouble();
		final double g = 9.8;
		final double gL= 1.62;
		
		System.out.print("Tu peso en la luna seria " + (weight/g) * gL + "Kg");
		
		leer.close();
		
	}

}
