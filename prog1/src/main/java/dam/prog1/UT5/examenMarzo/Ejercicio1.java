package dam.prog1.UT5.examenMarzo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Desarrolla un programa que almacene los números del 0 al 10 en alguna
		 * colección de java que será recorrida de varias formas para imprimir los
		 * elemento por pantalla.
		 */

		ArrayList<Integer> enteros = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			enteros.add(i);
		}

		// a) con un for each
		System.out.println("\n Recorrido con for each");
		for (int item : enteros) {
			System.out.println(item);
		}
		// b) con un iterador indicando el tipo de objeto del iterador
		System.out.println("\n Iterator indicado");
		Iterator<Integer> it = enteros.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		/*
		 * c) con un iterador sin indicar el tipo de objeto del iterador para borrar los
		 * números que sean múltiplos de 3
		 */

		System.out.println("\n Iterator sin indicar tipo de dato y eliminando multiplos de 3");
		Iterator itr = enteros.iterator();
		Integer numero;
		while (itr.hasNext()) {
			numero = (Integer) itr.next();
			if (numero % 3 == 0) {
				itr.remove();
			}
		}

		// d) De nuevo un recorrido con foreach.
		System.out.println("\n Segundo recorrido con for each");
		for (int item : enteros) {
			System.out.println(item);

		}
	}
}
