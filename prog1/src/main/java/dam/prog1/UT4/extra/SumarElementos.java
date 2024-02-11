package dam.prog1.UT4.extra;
import java.util.Scanner;

public class SumarElementos {
	public static void main (String[] args) {
		
		
		Scanner enter = new Scanner(System.in);
		System.out.println("Este programa suma los elementos de un array");
		System.out.println("Introduce el tamaño del array");
		
		int size = enter.nextInt();
		int sum=0;
		
		int[] numbers = new int[size];
		
		System.out.println("Introduce los elementos del array:"); 
		
		for( int i = 0;i < size;i++) {
			//Syso ("Elemento" + (i+1) + ":");
			numbers[i] = enter.nextInt();			
		}
		
		for(int num : numbers) {
			sum += num;
		}
		
		System.out.println("La suma es: " + sum);
		
		enter.close();
	}
	

}
