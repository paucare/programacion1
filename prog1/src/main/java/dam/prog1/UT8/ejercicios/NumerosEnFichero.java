package dam.prog1.UT8.ejercicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class NumerosEnFichero {
	/*
	 * EJERCICIO 3. Grabar en el fichero números.dat una serie de números enteros no
	 * negativos introducidos por teclado. La serie acabará cuando escribamos un -1.
	 * Abrir de nuevo números.dat para lectura y leer todos los números hasta el
	 * final del fichero., mostrándolos por pantalla y copiándolos en un segundo
	 * fichero numerosCopia.dat
	 */
	static Scanner sc = new Scanner(System.in);

	private static final String RUTA = "D:/Users/10184/Desktop/";

	public static void main(String[] args) {

		try (FileOutputStream file = new FileOutputStream(RUTA + "numeros.dat");) {

			boolean inputEnds = false;

			System.out.println("Introduce los numeros a copiar. Se acaba si introduces un -1.");

			while (!inputEnds) {
				int number = sc.nextInt();
				
				if (number == -1) {
					inputEnds = true;
				} else {
					if(number>=0) {
				file.write(number);
					}
				}
			}

		} catch (IOException e) {
			System.out.println("Error de E/S");
			e.printStackTrace();
		}
		Copy();
		System.out.println("Se ha copiado el fichero");

	}

	private static void Copy() {
		try (FileInputStream readFile = new FileInputStream(RUTA + "numeros.dat");
				FileOutputStream copyFile = new FileOutputStream(RUTA + "numerosCopia.dat");) {

			boolean fileEnds = false;

			int inputByte = 0;

			while (!fileEnds) {
				
				inputByte = readFile.read();

				if (inputByte == -1) {
					fileEnds = true;
				} else {
					System.out.println(inputByte);
					copyFile.write(inputByte);
				}
			}
		} catch (IOException e) {
			System.out.println("Error de E/S");
		}
	}
}
