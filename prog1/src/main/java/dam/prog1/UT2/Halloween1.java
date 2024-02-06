package dam1.tema2;

/*1. Desarrolla un programa que lea números
 * hasta que se introduzca 
 * un número negativo y 
 * después indique si se ha dado el 
 * mismo número dos veces consecutivas: 
 */

import java.util.Scanner;

public class Halloween1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num, last = 0; // Integer.MIN_VALUE;
		boolean repeat = false;
		do {
			System.out.println("Introduce un número positivo");
			num = read.nextInt();
			if(num != last){ //Con esto te cubres de si num es mayor o menor que last
				last = num;
			}else if(num==last){
				repeat = true;
			}
		} while (num > 0);

		if (!repeat) { // Para que la condición sea valida se tiene que usar ==
			System.out.println("No se ha repetido ningún valor introducido de forma consecutiva");
		}else {
			System.out.println("Se ha repetido por lo menos un valor introducido de forma consecutiva");
		} 

		read.close();
	}

}
