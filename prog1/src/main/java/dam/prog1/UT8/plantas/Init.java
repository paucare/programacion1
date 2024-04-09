package dam.prog1.UT8.plantas;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class Init {
	
	private static final String RUTA = "D:/Users/10184/Desktop/";
	
		public static void main(String[] args) {
			
			Path original = Paths.get(RUTA + "plantas.bin");
			Path aux=Paths.get(RUTA + "aux.bin");
			
			//Actualizar Fichero(original);
			//ImprimirFichero(original);
		}
		
	private static void actualizarFichero (Path original) {
		
		List <Planta> lista = new ArrayList<>(); 
		
		try(InputStream is = Files.newInputStream(original);
		ObjectInputStream ois =new ObjectInputStream(is);)
		{
			System.out.println("Comienzo de la lectura");
			for(;;) { // while true
				lista.add((Planta) ois.readObject());
			}
		}
		catch(exception e) {
			
		}
		
	}
}
	



