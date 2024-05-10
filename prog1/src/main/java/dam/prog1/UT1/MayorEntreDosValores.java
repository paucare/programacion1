package Alessandro.Alonso.Dam.tema1;

import java.util.Scanner;

public class MayorEntreDosValores {

	public static void main(String[]args) { 
	
	int A, B;
	Scanner escribir = new Scanner(System.in);
	
	
	//Pedir valor A
	
	System.out.print("Dame el valor de A: ");
	
	//Lectura del valor A
	 
	A=escribir.nextInt();
	
	//Pedir valor B
	
	System.out.print("Dame el valor de B: ");
	
	// Lectura del valor B
	
	B=escribir.nextInt();
	
	escribir.close();
	
	if (A>B) {
		
		System.out.println("A es mayor que B");
		
	} else if (B>A) {
		
		System.out.println("B es mayor que A");
	
	} else
		
		System.out.println("A es igual que B");
	
	}
	
		
}
	
