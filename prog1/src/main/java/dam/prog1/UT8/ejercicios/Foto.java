package dam.prog1.UT8.ejercicios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Foto {

	private static final String RUTA = "D:/Users/10184/Desktop/";

	public static void main(String[] args) {
		int contador = 0;
		int[] dataInput = new int[7871];

		try (FileInputStream archivo = new FileInputStream(RUTA + "radahn.jpg");) {

			boolean fileEnds = false;

			while (!fileEnds) {

				int inputByte = archivo.read();
				if (inputByte != -1) {
					dataInput[contador] = inputByte;
					System.out.println(inputByte);
					contador++;
				}
				if (inputByte == -1) {
						fileEnds = true;
				}

			}

		} catch (IOException e) {
			System.out.println("Error de E/S");
			e.printStackTrace();
		} //Aqui se acaba el try/catch

		System.out.println("El numero de lecturas es " + contador);
		
		createFile(dataInput);

	}// Aqui se acaba el main

	static void createFile(int newFileData[]) {

		try (FileOutputStream newFile = new FileOutputStream(RUTA + "radahnCopia.jpg");) {
			
			for(int i=0;i<newFileData.length;i++) {
				newFile.write(newFileData[i]);
			}
			
			
		} catch (IOException e) {

			System.out.println("Se ha producido un error");
		}

	}
}
