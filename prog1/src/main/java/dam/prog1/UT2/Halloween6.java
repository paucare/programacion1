package dam1.tema2;

/* 6. Pedir un número entero entre 0 y 9.999, decir si es capicúa. */

import java.util.Scanner;

public class Halloween6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num, digito, numOriginal = 0;
		do {
			System.out.println("Introduce un numero entre 0 y 9.999:");
			num = read.nextInt();
			numOriginal = num;
			if ((num >= 0 && num <= 9999)) {
				int numeroAlReves = 0;
				while (num > 0) {
					digito = num % 10;
					numeroAlReves = (numeroAlReves * 10) + digito;
					num /= 10;
				}
				if (numOriginal == numeroAlReves) {
					System.out.println("El numero es capicua");

				} else {

					System.out.println("El numero no es capicua");
				}

			} else {
				System.out.println("Introduce un valor válido");
			}

		} while (num >= 0 || num <= 9999);
		read.close();
	}
}