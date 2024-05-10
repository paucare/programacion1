package Alessandro.Alonso.Dam.tema1;

import java.util.Scanner;

public class CalculadoraSimple {

	public static void main(String[] args) {
		
		// Crear variable para recoger la información
		
		Scanner escribir = new Scanner(System.in);
		
		int operador1, operador2;
		double total;
		
		
		// Pedir valores al usuario 
		
		
		System.out.print("Dame el valor de A: ");
		
		 
		operador1 =escribir.nextInt();
		
		
		System.out.print("Dame el valor de B: ");
		
		
		operador2 =escribir.nextInt();
		
		
		//Operaciones
		
		//Sumar
		
		
		//total= operador1 + operador2;
		System.out.println( operador1 + "+"+ operador2 + "=" +((double)operador1 + operador2));
		
		//Restar
		
		total= operador1 - operador2;
		System.out.println( operador1 + "-"+ operador2+ "=" +total);
	
		//Multiplicar
		
		
		total= operador1 * operador2;
		System.out.println( operador1 + "*"+ operador2+ "=" +total);
		
		//Dividir
		
		total=(double) operador1 / operador2;
		System.out.println( operador1 + "/"+ operador2+ "=" +total);
		
		escribir.close();

	}

}
