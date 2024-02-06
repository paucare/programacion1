package dam.prog1.UT4;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// variables
		boolean seRepite;
		int contador = 0, last = 0;
		Scanner read = new Scanner(System.in);
		// array
		int[] numeros = { 1, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 8, 9, 9, 5, 2, 6, 8, 9, 0 };
		// for para recorrer el array
		int n= read.nextInt();
		for (int i = 0; i < numeros.length; i++) {
			if (n != last) {
				last = n;
			} else if (n == last) {
				contador++;
			}
		}
		System.out.println("Se repite un numero " + contador + " veces");
	}
}
