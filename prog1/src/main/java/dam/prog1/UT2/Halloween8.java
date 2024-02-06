package dam1.tema2;

/*8. Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente. */

//falta revisar 

import java.util.Scanner;

public class Halloween8 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int horas, minutos, segundos;

		System.out.println("Horas: ");
		horas = read.nextInt();

		System.out.println("Minutos: ");
		minutos = read.nextInt();

		System.out.println("Segundos: ");
		segundos = read.nextInt() + 1; // segundos = read.nextInt() + 1;

		// segundos++;

		// transformo

		horas += minutos / 60; // horas = minutos + minutos/60

		minutos %= 60; // minutos = minutos%60

		minutos += segundos / 60;

		segundos %= 60;

		System.out.println("La hora en el segundo siguiente es " + horas + ":" + minutos + ":" + segundos + ".");

		read.close();

	}
}

/*
 * System.out.print("Ingresa la hora: "); int hora = read.nextInt();
 * 
 * System.out.print("Ingresa los minutos: "); int minutos = read.nextInt();
 * 
 * System.out.print("Ingresa los segundos: "); int segundos = read.nextInt();
 * 
 * if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0
 * && segundos <= 59) { segundos++;
 * 
 * if (segundos == 60){ segundos = 0; minutos++;
 * 
 * } if (minutos == 60) { minutos = 0; hora++;
 * 
 * }if (hora == 24) { hora = 0; }
 * 
 * System.out.println("La hora siguiente es: " + hora + ":" + minutos + ":" +
 * segundos); } else {
 * System.out.println("Hora, minutos o segundos fuera de rango."); }
 * 
 */
