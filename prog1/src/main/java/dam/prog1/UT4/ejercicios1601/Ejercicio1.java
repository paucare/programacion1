package dam.prog1.UT4.ejercicios1601;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		/*
		 * int [] datos = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		 * 
		 * 
		 * int contador=0; Scanner leer = new Scanner(System.in);
		 * System.out.println("Dame el numero a buscar: "); int numAbuscar =
		 * leer.nextInt();
		 * 
		 * for (int i=0;i<datos.length;i++) {
		 * 
		 * if(datos[i]==numAbuscar) { contador++; } }
		 * System.out.println("El numero se ha encontrado " + contador + " veces");
		 */

		int contador = 0;
		int[] datos = new int[20];
		// System.out.println(numAleatorio); variable de control
		for (int i = 0; i < datos.length; i++) {
			int numAleatorio = (int) (Math.random() * 31 + 20);
			datos[i] = numAleatorio;
			System.out.print(datos[i] + " ");

		}
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Dame el numero a buscar: ");
		int numAbuscar = sc.nextInt();
		//for each
		for(int contenido:datos) {
			if (contenido==numAbuscar) {
				contador++;
			}
		}
		System.out.println("El numero se ha encontrado " + contador + " veces");

		sc.close();
	}
}
