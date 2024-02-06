package dam1.tema2;

/* 5. Pedir un número entero entre 0 y 9.999 
y mostrarlo con las cifras al revés.  */

import java.util.Scanner;

public class Halloween5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num, digito; // Declaración de variables
		do {
			System.out.println("Introduce un numero entre 0 y 9.999:");
			num = read.nextInt();
			if ((num >= 0 && num <= 9999)) { 		// El num introducido tiene que estar dentro de este rango
				int numeroAlReves = 0;
				System.out.println("Las cifras de este digito al reves serían:");
				while (num > 0) { 				// Este bucle es el que ejecuta la inversion
					digito = num % 10; 		// Recogemos la ultima cifra del numero como resto
					numeroAlReves = (numeroAlReves * 10) + digito; // Movemos una cifra a la izquierda
					num /= 10; 			//Recortamos una cifra del numero original
				}
				System.out.println("El numero al reves seria " + numeroAlReves); //Salida por pantalla
			} else {
				System.out.println("Introduce un numero valido"); //Caso erroneo
			}

		} while (num >= 0 || num <= 9999); // Si se cumple una u otra seguira ejecutandose
		read.close();
	}
}
