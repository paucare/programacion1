package dam.prog1.UT8.ejercicios;

import java.io.FileInputStream;
import java.io.IOException;

public class NumerosReales {

	private static final String RUTA = ("C:/Users/bepol/Desktop/");

	public static void main(String[] args) {

		double suma = 0, media = 0;
		int contador = 0;

		try (FileInputStream file = new FileInputStream(RUTA + "NumerosReales.txt");) {

			boolean fileEnds = false;

			while (!fileEnds) {

				int inputByte = file.read();

				if (inputByte != -1) {
					suma += inputByte;
					contador++;

					if (contador != 0) {
						media = suma / contador;
					} else {
						System.out.println("El archivo esta vacío");
					}
				} else {
					fileEnds = true;
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