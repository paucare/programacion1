package ejercicios1601;
import java.util.Random;
/*
 * Dado un array de 50 números entre 1 y 100, aleatorios, 
 * escribir una lista ordenada con los valores que no aparecen en el array.
 * 
 */
public class Ejercicio7 {
	public static void main(String[]args) {
		final int TOTAL_ELEMENTOS=50;
		int []numeros = new int [TOTAL_ELEMENTOS];
		Random r= new Random();
		
		for (int i=0; i<numeros.length;i++) {
			numeros[i]=r.nextInt(1,100)+1; // tambien .nextInt(1.101)
			System.out.println();
		}
		
		//imprimir los numeros que no estén en ese array 
		for(int i=1;i<100;i++) {
			System.out.println(i);
			
		}
		
	}

}
