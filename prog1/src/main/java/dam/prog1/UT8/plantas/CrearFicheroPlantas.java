package dam.prog1.UT8.plantas;

import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CrearFicheroPlantas {

	private static final String RUTA = "D:/Users/10184/Desktop/";

	public static void main(String[] args) {
		
		Path file = Paths.get(RUTA + "plantas.bin");
		
		try (OutputStream os = Files.newOutputStream(file); 
			ObjectOutputStream oos = new ObjectOutputStream(os);) {
			System.out.println("Comienzo a escribir el fichero...");
			oos.writeObject(new Planta(1, "Camelia", "Camellia japonica", 9.95, 28));
			oos.writeObject(new Planta(2, "Mimosa", "Acacia dealbata", 9.95, 16));
			oos.writeObject(new Planta(3, "Hortensia", "Hydrangea macrophylla", 19.5, 4));
			oos.writeObject(new Planta(4, "Acebo", "Ilex Aquifolium", 18, 55));
			oos.writeObject(new Planta(5, "Lirio", "Iris germanica", 3, 36));
			oos.writeObject(new Planta(6, "MadreSelva", "Loricena japonica", 2.25, 40));
			oos.writeObject(new Planta(7, "Cala", "Zantedschia", 8.90, 9));
			oos.writeObject(new Planta(8, "Tejo", "Taxus", 16.5, 5));
			oos.writeObject(new Planta(9, "Romero", "Salvia", 4.5, 68));
			oos.writeObject(new Planta(10, "Azalea", "ubducyn", 10, 20));

			

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace(); // Imprimir la pila de errores que se ha ido acumulando
		}
	}
}
