package dam.prog1.UT4;

import java.util.Random;

public class SelectionSortAlgorithm {

	public static void main(String[] arg) {
		Integer[] array = crearArray();
		Integer[] arraySorted = selectionSort(array);
		mostrarArray(array);
		System.out.println();
		mostrarArray(arraySorted);
	}

	public static Integer[] crearArray() {

		Random rand = new Random();
		int columnasAleatorio = rand.nextInt(5) + 5;
		Integer[] arr = new Integer[columnasAleatorio];

		for (int i = 0; i < columnasAleatorio; i++) {
			arr[i] = rand.nextInt(5) + 6;
		}

		return arr;
	}
	/*
	 * Desarrolla un método llamado ejercicioExtra que reciba el array
	 * unidimensional devuelto por el ejercicio3 y devuelva otro array
	 * unidimiensional con los mismos elementos pero ordenados de menor a mayor. El
	 * array que se recibe por parámetros NO SE PUEDE MODIFICAR
	 */

	public static Integer[] selectionSort(Integer[] arrayOriginal) {

		// Copiamos
		Integer[] array = new Integer[arrayOriginal.length];

		for (int i = 0; i < arrayOriginal.length; i++) {
			array[i] = arrayOriginal[i];
		}

		// Buscamos indices

		for (int i = 0; i < array.length; i++) {
			int minIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			// Cambiamos
			int store = array[i];
			array[i] = array[minIndex];
			array[minIndex]= store; 
		}

		return array;
	}

	public static <T> void mostrarArray(T[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
	}
}
