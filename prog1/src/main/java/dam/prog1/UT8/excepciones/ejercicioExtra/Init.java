package dam.prog1.UT8.excepciones.ejercicioExtra;

import java.util.Scanner;

public class Init {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int edad= 0;
		try {
			edad = pideEdad();
		} catch (EdadNoValidaException e) {
			System.err.println(e.getMessage());
		}
	}

	private static int pideEdad() throws EdadNoValidaException{
		//Edad comprendida entre 18-65
		System.out.println("Introduce la edad");
		int edad= sc.nextInt();
		if(edad >= 18 || edad <= 65) {
			throw new EdadNoValidaException("Edad no valida");
		}
		return edad;
	}

}
