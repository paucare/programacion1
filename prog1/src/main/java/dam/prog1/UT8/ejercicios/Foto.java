package dam.prog1.UT8.ejercicios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Foto {

	private static final String RUTA = "D:/Users/10184/Desktop/";
	
	public static void main(String[] args) {
		int contador=0;
		int[] dataInput = new int [7871]; 

		try (FileInputStream archivo = new FileInputStream(RUTA + "radahn.jpg");) {

			boolean fileEnds = false;

			while (!fileEnds) {

				int inputByte = archivo.read();

				if (inputByte == -1) 
					fileEnds = true;
				System.out.println(inputByte);
				contador++;
				
				//dataInput[contador]=
			}
			
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error de E/S");
			e.printStackTrace();
		}
		System.out.println(contador);
		
	

	}

}
