 package Alessandro.Alonso.Dam.tema1;

import java.util.Scanner;

public class HolaMundo { // public es un modificador de acceso 

public static void main (String[]args) {
	
	System.out.println("Hola. ¿Como te llamas?:");

	//sc es el objeto de la clase Scanner
	
	Scanner escribir = new Scanner(System.in);
	
	// Recoger valor de entrada
	
	String nombre=escribir.nextLine();
	
	System.out.println(" Hola, " + nombre);
	
	escribir.close();
	
	
	}

}
