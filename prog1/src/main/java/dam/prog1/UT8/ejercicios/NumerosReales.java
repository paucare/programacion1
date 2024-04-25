package dam.prog1.UT8.ejercicios;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class NumerosReales {

	private static final String RUTA = ("D:/Users/10184/Desktop/");

	public static void main(String[] args) {

		double suma = 0, media = 0;
		double contador = 0;

		try (Scanner sc = new Scanner(new FileReader(RUTA + "NumerosReales.txt"));) {

			while (sc.hasNext()) {

				double inputByte = sc.nextDouble();
				if (inputByte != -1) {
					
					suma += inputByte;
					contador++;

					if (contador != 0) {
						media = suma / contador;
					} else {
						System.out.println("El archivo esta vacío");
					}
				} 
			}	

		} catch (IOException e) {
			System.out.println("Error de E/S");
			e.printStackTrace();

		} 
		
		System.out.println("La suma es " + suma);
		System.out.println("La media es " + media);
	}

}
