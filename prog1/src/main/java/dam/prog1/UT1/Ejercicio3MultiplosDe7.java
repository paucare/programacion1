package Alessandro.Alonso.Dam.tema1;

import java.util.Scanner;

public class Ejercicio3MultiplosDe7 {

	public static void main(String[] args) {
		
		
	// Pedimos que se introduzca el número
		
		System.out.print("Introduce un número aleatorio");
		
		Scanner sc = new Scanner(System.in);
		
	// Operaciones
		
	int numeroIntroducido;
	
	numeroIntroducido= sc.nextInt();
	
	String resultado = numeroIntroducido % 7 == 0 ? "El numero es multiplo de 7" : "El numero no es multiplo de 7";
	
	// System.out.println(numeroIntroducido % 7==0? "El numero es multiplo de 7" : "El numero no es multiplo de 7");
	
	System.out.println(resultado);
	
	//otra manera
	
	/* boolean resultado; 
	
	resultado = num%7==0;
	
	System.out.println(resultado ? "El numero es multiplo de 7" : "El numero no es multiplo de 7";
	
	*/
	
	
	sc.close();
		
	}

}
