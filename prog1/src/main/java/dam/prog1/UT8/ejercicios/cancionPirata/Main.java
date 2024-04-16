package dam.prog1.UT8.ejercicios.cancionPirata;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {

	private static final String RUTA = "D:/Users/10184/Desktop/";

	public static void main(String[] args) {

		Path original = Paths.get(RUTA + "cancionPirata.dat");
		// Path aux = Paths.get(RUTA + "aux.bin");
		

	} // Aqui se acaba el main

	private static void Escribir(Path file) {

		try(InputStream is = Files.newInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(is);
				OutputStream os = Files.newOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(os);) {

			while (true) {
				try {
					
					String cadena = new String();

				} catch (EOFException e) {
					System.out.println("Es el final del fichero");
					break;
				}
			}

		} catch (IOException e) {
			System.err.println("Error en la lectura o escritura del fichero");
			e.printStackTrace();
		}
	}
}
