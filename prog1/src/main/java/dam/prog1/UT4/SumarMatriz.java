package dam.prog1.UT4;

import java.util.Scanner;
import java.util.Random;

public class SumarMatriz {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		System.out.println("Introduce el numero de filas:");
		int filas = read.nextInt();
		System.out.println("Introduce el numero de columnas");
		int columnas = read.nextInt();

		Random rand = new Random();

		int[][] matriz = new int[filas][columnas];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(10) + 1;
			}
		}

		int[] sumaFilas = sumarFilas(matriz);
		mostrarSuma(sumaFilas);
		read.close();
	}

	private static int[] sumarFilas(int[][] mat) {
		int[] sumaFilas = new int[mat.length];
		for (int i = 0; i < mat.length; i++) {
			int suma = 0;
			for (int j = 0; j < mat[i].length; j++) {
				suma += mat[i][j];
			}
			sumaFilas[i] = suma;
		}
		return sumaFilas;
	}

	private static void mostrarSuma(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Suma de fila " + i + ": " + arr[i]);

		}

	}
}
