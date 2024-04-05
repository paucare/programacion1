package dam.prog1.UT8;

import java.io.*;
import java.util.*;

public class AccesoFicheros {

	// InputStreamReader Importante!!

	public static void main(String[] args) {

		LeerFicheros accediendo = new LeerFicheros();

		//accediendo.lee();
		
		EscribirFicheros escribiendo = new EscribirFicheros();
		escribiendo.escribir();

	}
}

class LeerFicheros {

	public void lee() {

		try {

			FileReader entrada = new FileReader("D:/Users/10184/Desktop/EjerciciosFicheros/ejemplo.txt");

			int c = 0;

			while (c != -1) {
				c = entrada.read();
				char letra = (char) c;
				System.out.print(letra);
			}

			entrada.close();

		} catch (IOException e) {

			System.out.println("El fichero no se ha encontrado");
		}
		/*
		 * finally { entrada.close(); }
		 */

	}
}

class EscribirFicheros {

	public void escribir() {
		try {
			
			FileWriter salida = new FileWriter("D:/Users/10184/Desktop/EjerciciosFicheros/ejemplo.txt", true);
			Scanner sc = new Scanner(System.in);
				
			String input="";
			while(!input.equals("-1")) {
				System.out.println("Escribe...");
				input = sc.nextLine();
				salida.write(input + "\n");
			}
			salida.close();
			sc.close();
			
		} catch (IOException e) {
			System.out.println("El fichero no se ha encontrado");
		}
	}
}
