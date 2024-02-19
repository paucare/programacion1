package dam.prog1.UT4;

import java.util.*;

public class CorrecionExamen {
	
	private static final int DIM_COL=10;

	public static void main(String[] args) {
		int[][] matriz = ejercicio1();
		System.out.println(" ");
		int[] array = ejercicio2(matriz);
		System.out.println(" ");
		ejercicio3(matriz, array);
	}

	private static int[][] ejercicio1() {
		System.out.println("Ejercicio 1");
		
		// Instancia de la clase Random
		Random rand = new Random();
		// filasAleatorio= rand.nextInt(5) + 6; rand.nextInt(5,11)
		int filasAleatorio = rand.nextInt(6) + 6;

		System.out.println("Numero de filas: " + filasAleatorio);

		// Crear matriz
		int[][] matriz = new int[filasAleatorio][DIM_COL];

		// Cargar matriz
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[0].length; c++) {
				matriz[f][c] = rand.nextInt(7) + 1;
			}
		}
		// Mostrar matriz
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[0].length; c++) {
				System.out.print(matriz[f][c] + " ");
			}
			System.out.println();
		}
		return matriz;
	}

	private static int[] ejercicio2(int[][] mat) {
		
		System.out.println("Ejercicio 2");
		
		// Declaramos el array que se va a devolver
		int[] nuevoArray = new int[mat.length];

		int suma = 0;

		// Cargamos el array
		for (int f = 0; f < mat.length; f++) {
			suma = 0;
			for (int c = 0; c < mat[0].length; c++) {
				suma += mat[f][c];
			}
			nuevoArray[f] = suma;
		}

		// Mostramos el array
		for (int f = 0; f < mat.length; f++) {
			System.out.print(nuevoArray[f] + " ");
		}
		return nuevoArray;
	}

	private static int[] ejercicio3(int[][] mat, int[] array) {
		
		System.out.println("Ejercicio 3");
		
		int filas = mat.length;
		int[] subArray = new int[mat[0].length];

		int indiceMayor = 0;
		int valorMaximo = 0;
		
		/*
		 * Correción de alejandra 
		 * int indiceMayor=0;
		 * for (int i=1; i<arrSuma.length;i++){
		 * if(arrSuma[IndiceMayor] < arrSuma[i]){
		 *  indiceMayor = i;
		 * Syso la posicion mayor es indiceMayor
		 * 
		 * int [] arrMayor = mat[indiceMayor]; Esto es algo como el paso por referencia 
		 */

		// Buscamos la suma maxima
		for (int f = 0; f < filas; f++) {
			if (valorMaximo == array[f]) {
				System.out.println("Habiendo dos arrays iguales el primero tiene el indice " + f);
			} else if (array[f] > valorMaximo) {
				valorMaximo = array[f];
				indiceMayor = f;
			}
		}

		// Mostramos el subArray
		for (int c = 0; c < mat[indiceMayor].length; c++) {
			subArray[c] = mat[indiceMayor][c];
			System.out.print(subArray[c] + " ");
		}
		return subArray;
	}
	
	/*
	 * En otra clase 
	 */
	
}
