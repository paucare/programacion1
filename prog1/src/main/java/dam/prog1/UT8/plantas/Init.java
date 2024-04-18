package dam.prog1.UT8.plantas;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;


public class Init {

	private static final String RUTA = "D:/Users/10184/Desktop/";

	public static void main(String[] args) {

		Path original = Paths.get(RUTA + "plantas.bin");
		Path aux = Paths.get(RUTA + "aux.bin");
		
		actualizarFichero(original);
		imprimirFichero(original);
		
	} // Aqui se acaba el main

	private static void actualizarFichero(Path original) {

		List<Planta> lista = new ArrayList<>();

		// Con FileInput
		// try (InputStream is = new FileInputStream(original);
		try (InputStream is = Files.newInputStream(original); // Es una clase abstracta no podemos hacer new
				ObjectInputStream ois = new ObjectInputStream(is);) {
			System.out.println("Comienzo de la lectura");
			for (;;) { // while true

				try {
					lista.add((Planta) ois.readObject());
				} catch (EOFException e) {
					System.out.println("Es el final del fichero");
					break;
				} catch (ClassNotFoundException e) {
					System.err.println("Error al obtener las plantas");
					break;
				}

			}
		}

		catch (IOException e) {
			System.err.println("Error en la lectura o escritura del fichero");
			e.printStackTrace();

		}

		// Actualizo los precios

		System.out.println("Actualizar precios...");

		for (Planta planta : lista) {
			// aplicar descuentos
			if (planta.getCantidad() < 10) {
				planta.setPrecio(planta.getPrecio() * 0.8);

			} else if (planta.getCantidad() <= 50) {
				planta.setPrecio(planta.getPrecio() * 0.7);

			} else {
				planta.setPrecio(planta.getPrecio() * 0.6);

			}
		}

		System.out.println("Se han actualizado los precios"); // No se ha volcado al fichero

		// El ultimo catch tiene que tener la excepción mas génerica

		try

		(OutputStream os = Files.newOutputStream(original); ObjectOutputStream oos = new ObjectOutputStream(os);) {

			System.out.println("Estoy empezando a escribir...");

			for (Planta planta : lista) {
				oos.writeObject(planta);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	} // Aqui se acaba el metodo de ActualizarFichero

	// Sobrecargamos el metodo

	private static void actualizarFichero(Path original, Path aux) {

		try (InputStream is = Files.newInputStream(original);
				ObjectInputStream ois = new ObjectInputStream(is);
				OutputStream os = Files.newOutputStream(aux);
				ObjectOutputStream oos = new ObjectOutputStream(os);) {
			System.out.println("Comienzo de la lectura");

			for (;;) { // while true

				try {

					Planta p1 = (Planta) (ois.readObject());

					if (p1.getCantidad() < 10) {
						p1.setPrecio(p1.getPrecio() * 0.8);

					} else if (p1.getCantidad() <= 50) {
						p1.setPrecio(p1.getPrecio() * 0.7);

					} else {
						p1.setPrecio(p1.getPrecio() * 0.6);

					}

					System.out.println("Se están volcando los datos en el fichero...");

					oos.writeObject(p1);

				} catch (EOFException e) {
					System.out.println("Es el final del fichero");
					break;
				} catch (ClassNotFoundException e) {
					System.err.println("Error al obtener las plantas");
					break;
				}
			}

		} catch (IOException e) {
			System.err.println("Error en la lectura o escritura del fichero");
			e.printStackTrace();
		}
	} // Aqui se acaba el metodo sobrecargado

	private static void imprimirFichero(Path file) {

		try (InputStream is = Files.newInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(is);
				OutputStream os = Files.newOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(os);) {
			
			while(true) {
				try {
				Planta planta = (Planta)ois.readObject();
				System.out.println(planta);
				
				}catch(EOFException e) {
					System.out.println("Es el final del fichero");
					break;
				} catch (ClassNotFoundException e) {
					System.err.println("Error al obtener las plantas");
					break;
				}
			}
			
		} catch (IOException e) {
			System.err.println("Error en la lectura o escritura del fichero");
			e.printStackTrace();
		}
	}

}
