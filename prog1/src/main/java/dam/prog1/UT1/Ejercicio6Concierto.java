package Alessandro.Alonso.Dam.tema1;

import java.util.Scanner;

public class Ejercicio6Concierto {

	public static void main(String[] args) {
		
	// Pedimos la duración del concierto
		
	Scanner leer = new Scanner(System.in);
	
	System.out.println("¿Cuantos segundos duró el concierto?");
	
	// Operaciones
	
	int tiempo = leer.nextInt();
	
	int horas = (tiempo / 3600);
	
	tiempo %= 3600;
	
	int minutos = (tiempo / 60);
	
	tiempo %= 60;
	
	int segundos = (tiempo);
	
	System.out.println("Ese numero equivale a " + horas + ":" + minutos + ":" + segundos);
	
	leer.close();

		
	}

}
