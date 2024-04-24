package dam.prog1.UT8.ejercicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopiaDe {

	static Scanner sc = new Scanner(System.in);

	private static final String RUTA = "D:/Users/10184/Desktop/";

	public static void main(String[] args) {

		System.out.println("¿Que archivo quieres copiar?");
		String nombre = sc.nextLine();

		try (FileInputStream file = new FileInputStream(RUTA + nombre);
				FileOutputStream copyFile = new FileOutputStream(RUTA + "copia_de _" + nombre);) {

			boolean fileEnds = false;

			while (!fileEnds) {

				int inputByte = file.read();
				
				//Primero la comprobacion
				if (inputByte == -1) {
					fileEnds = true;
				//Luego la escritura
				} else {
					copyFile.write(inputByte);
				}

			}
			

		} catch (IOException e) {
			System.out.println("Error de E/S");
			e.printStackTrace();

		} finally {
			sc.close();
		}
		
			System.out.println("Se ha copiado el fichero");

	}

}
