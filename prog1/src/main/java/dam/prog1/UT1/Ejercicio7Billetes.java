package Alessandro.Alonso.Dam.tema1;

import java.util.Scanner;

public class Ejercicio7Billetes {

	public static void main(String[] args) {
		
		// Pedimos los billetes
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("¿Cuanto dinero quieres retirar?");
		
		// Operaciones
		
		int dinero = leer.nextInt();
		
		int billetes500 = (dinero/ 500);
		dinero %= 500;
		
		int billetes200 = (dinero/ 200);
		dinero %= 200;
		
		int billetes100 = (dinero /100);
		dinero %= 100;
		
		int billetes50 = (dinero / 50);
		
		dinero %= 50;
		
		int billetes20 = (dinero / 20);
		
		dinero %= 20;
		
		int billetes10 = (dinero / 10);
		
		dinero %=10;
		
		int billetes5 = (dinero/5);
		dinero %= 5;
		
		System.out.println("billetes de 500: " + billetes500);
		System.out.println("billetes de 200: " + billetes200);
		if(billetes100 != 0) {
				System.out.println("billetes de 100: " + billetes100);
		}
		System.out.println("billetes de 50: " + billetes50);
		System.out.println("billetes de 20: " + billetes20);
		if(billetes10 != 0) {
				System.out.println("billetes de 10: " + billetes10);
		}
		System.out.println("billetes de 5:  " + billetes5);
		
		leer.close();
	

	}

}
