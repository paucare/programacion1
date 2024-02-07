package dam.prog1.UT4.ejercicios1601;

import java.util.Scanner;

/*
 *  Dado un array de números enteros, realiza un programa que indique si está 
ordenado o no. 
 * */

public class Ejercicio3 {
	public static void main(String[] args) {
		
Scanner enter = new Scanner(System.in);
		
		//Ingresar tamaño del array 
		System.out.println("Introduce el tamaño que tendrá el array");
		int size = enter.nextInt();
		
		//Crear array 
		
		int[] numeros = new int[size];
		System.out.println("Introduce los numeros del array");
		
		//Bucle for para recorrer el array e introducir los numeros
		
		for(int i = 0; i < size;i++) {
			numeros[i] = enter.nextInt();
		}
		
		
		int anterior = 0;
		for (int num : numeros) {
			if (num > anterior) {
				
				System.out.println("El array está ordenado"); // Va a imprimir cuatro veces que el array está ordenado
			} else {
				System.out.println("El array no está ordenado");
			}
			anterior = num;
			
		}
			enter.close();
		/*
		// Verificamos si el array esta ordenado
		if(estaOrdenado(numeros)) {
			System.out.println("Está ordenado");
		}
		else {
			System.out.println("No está ordenado");
		}
		*/
	
	}
}
