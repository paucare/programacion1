package dam1.tema2;
/*4. Pedir un número entero entre 0 
y 9.999 e indicar cuántas cifras tiene.*/

import java.util.Scanner;

public class Halloween4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num; //digito;
		do {
			System.out.println("Introduce un numero entre 0 y 9.999:");
			num = read.nextInt();
			int contador = 0; // Poniendo contador aquí seria accesible para todo el bucle
			if ((num >= 0 && num <= 9999)) { // Tiene que estar dentro de ese rango
				while (num > 0) {
					//digito = num % 10;
					num /= 10; // num = num /10
					contador++;
				}
				System.out.println("El numero introducido tiene " + contador + " cifra(s)");
			}

			else {
				System.out.println("Introduce un numero valido");
			}
		} while (num >= 0 || num <= 9999); // Se tiene que cumplir una cosa o la otra

		read.close();
	}


}
