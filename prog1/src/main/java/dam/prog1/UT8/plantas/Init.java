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

import javax.imageio.IIOException;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Init {

	private static final String RUTA = "D:/Users/10184/Desktop/";

	public static void main(String[] args) {

		Path original = Paths.get(RUTA + "plantas.bin");
		Path aux = Paths.get(RUTA + "aux.bin");

		// Actualizar Fichero(original);
		// ImprimirFichero(original);
	}

	private static void actualizarFichero(Path original) {

		List<Planta> lista = new ArrayList<>();

		try (InputStream is = Files.newInputStream(original); ObjectInputStream ois = new ObjectInputStream(is);) {
			System.out.println("Comienzo de la lectura");
			for (;;) { // while true

				try {
					lista.add((Planta) ois.readObject());
				} catch (EOFException e) {
					System.out.println("Es el final del fichero");
					break;
				} catch (ClassNotFoundException e) {
					System.out.println("Error al obtener las plantas");
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

		System.out.println("Se han actualizado los precios");

		// El ultimo catch tiene que tener la excepción mas génerica

		try

		(OutputStream os = Files.newOutputStream(original); ObjectOutputStream oos = new ObjectOutputStream(os);) {

		System.out.println("Estoy empezando a escribir...");
		
		for(Planta planta : lista) {
			oos.writeObject(planta);
		}

		} catch (IOException e) {
			e.printStackTrace();
		}
	} // Aqui se acaba el metodo de ActualizarFichero

}
