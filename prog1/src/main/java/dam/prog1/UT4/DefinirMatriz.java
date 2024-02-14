package dam.prog1.UT4;

import java.util.Random;

public class DefinirMatriz {

	public static final int FILAS_DEF = 4;

	// public static void main(String[] args) {

	private static int[] ejercicio1() {

		System.out.println("Ejercicio 1");
		Random random = new Random();

		// Generar
		int[][] matriz;
		int columnas = random.nextInt(6) + 10;
		matriz = new int[FILAS_DEF][columnas];
		System.out.println("Tiene" + columnas + "columnas");

		// Cargar
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[0].length; c++) {
				//rellenar aleatorio
				matriz[f][c] = random.nextInt(9) + 1;
			}
		}

		// Imprimir
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[0].length; c++) {
				// imprimir
				System.out.print(matriz[f][c] + " ");

			}
			
			System.out.println();
		}
		 int [] arraySumaColumnas = new int[matriz.length];
		 
		
		return arraySumaColumnas;

	}
	
	private static int ejercicio2(int[] arr){
		System.out.println("ejercicio 2");
		int max=0;
		
		
		return max;
	}

	public static void main(String[] args) {
		
		int [] miArray = ejercicio1();
		//int[][] matrizQueRecojeEjercicio1 = generarMatrizValores();
		ejercicio2(ejercicio1());
	}

}
