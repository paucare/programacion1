package dam.prog1.UT8.ejercicios;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class CancionPirata {

	private static final String RUTA = "D:/Users/10184/Desktop/";

	public static void main(String[] args) {

		String rutaArchivo = RUTA + "cancionPirata.dat";
		// Path aux = Paths.get(RUTA + "aux.bin");

		escribir(rutaArchivo);
		imprimir(rutaArchivo);

	} // Aqui se acaba el main

	private static void escribir(String file) {

		try (FileOutputStream fos = new FileOutputStream (file); ObjectOutputStream oos = new ObjectOutputStream(fos);) {

					String cadena = ("Con diez cañones por banda,\n"+ 
					"viento en popa a toda vela,\n"+
					"no corta el mar, sino vuela" + " un velero bergantín.");

					oos.writeObject(cadena);

				} catch (EOFException e) {
					System.out.println("Es el final del fichero");
					
		} catch (IOException e) {
			System.err.println("Error en la lectura o escritura del fichero");
			e.printStackTrace();
		}
	}



	private static void imprimir(String file) {

		try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis);) {

				try {
					String cadena = (String) ois.readObject();
					System.out.println(cadena);
					
				} catch (ClassNotFoundException e) {
					System.err.println("Error al obtener las cadenas");
				}
			

		} catch (IOException e) {
			System.err.println("Error en la lectura o escritura del fichero");
			e.printStackTrace();
		}
	}
}
