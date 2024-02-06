package dam1.tema2;

import java.util.Scanner;

public class PotenciaSinMathPow {

	public static void main(String[] args) {

		// Declaramos Scanner

		Scanner read = new Scanner(System.in);

		// Introducimos los valores

		System.out.println("Introduce la base de una potencia");

		double base = read.nextDouble();

		System.out.println("Introduce el exponente");

		int power = read.nextInt();

		double result = 1.0;

		// Operaciones

		// Si el exponente es 0

		if (power == 0) {

			System.out.println("El resultado de una potencia elevada a 0 es " + (int)result); //Se puede poner 1 entre las comillas

		// Si el exponente es positivo

		} else if (power > 0) {

			for (int i = 1; i <= power; i++) {

				result *= base; // result = result * base

			}
			System.out.println("El resultado de la potencia es " + (int)result);

		// Si el exponente es negativo

		} else {

			for(int i = -1; i >= power; i-- ){ //{int i = 1; i <= -power; i++

				result /= base; // result = result / base;

			}
			System.out.println("El resultado de la potencia es " + result);
		}

		// Cerramos el escaner
		
		read.close();
	}

}
