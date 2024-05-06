package dam.prog1.UT8.excepciones.EdadNegativa;

import java.util.Scanner;

public class PedirEdad {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Introduce la edad: ");
			
			int edad= sc.nextInt();
			if (edad <0) {
				throw new ExcepcionEdadNegativa();
			} else {
				System.out.println("Edad recogida");
			}
			
		} catch(ExcepcionEdadNegativa e) {
			System.out.println(e);
		}
		finally {
			sc.close();
		}

	}

}
