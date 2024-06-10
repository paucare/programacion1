package dam.prog1.UT2;

import java.util.Scanner;

public class examenDAW {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		System.out.println("Introduce un numero");
		int resultado=1,par = 2;
		int num = read.nextInt();
		
		if(num == 0) {
			resultado = 1;
			System.out.println("El resultado es " + resultado);
		}
		
		else if(num%2==0) {
			for(int i = 1; i <= num; i++){
				resultado *= par; // resultado = resultado * par;
				par = par +2;
			}
			System.out.println("El doble factorial de " + num + "es " + resultado);
		}
		
		read.close();
	}	
}

/*
Scanner read = new Scanner(System.in);
int num = 0, digito = 0, suma = 0;
String cadena = "";

System.out.println("Introduce un numero positivo");
num = read.nextInt();
if (num > 0) {
	while (num > 0) {
		digito = num % 10;
		if (digito % 2 == 0) {
			suma += digito;
			cadena = cadena + " " + digito;
			
		}
			num /=10;
	}
	System.out.println("Los digitos pares son: " + cadena);
	System.out.println("La suma de los digitos pares es: " + suma );
	
} else {
	System.out.println("Introduce un número válido");
}
	
read.close();
*/