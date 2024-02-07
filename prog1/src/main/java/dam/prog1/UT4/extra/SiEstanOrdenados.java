package dam.prog1.UT4.extra;

import java.util.Scanner;

public class SiEstanOrdenados {

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
	}

}
