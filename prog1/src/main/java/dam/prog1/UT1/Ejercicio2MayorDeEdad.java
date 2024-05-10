package Alessandro.Alonso.Dam.tema1;

import java.util.Scanner;

public class Ejercicio2MayorDeEdad {

	public static void main(String[] args) {
		
		//Pedir valor al usuario y escribir valor al usuario
		
		System.out.print("Introduce tu edad, por favor.");
		
		Scanner escribir = new Scanner(System.in);
		
		// Leer informacion en el objeto scanner 
		
		byte edad;
		
		edad = escribir.nextByte();
		
		String resultado= edad >= 18 ? "Usted es mayor de edad" : "Usted es menor de edad";
		
		System.out.println(resultado);
		
		escribir.close();	

	}

}
