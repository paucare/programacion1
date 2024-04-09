package dam.prog1.UT8.plantas;

import java.io.*;

public class CrearFicheroPlantas {
	
	private static final String RUTA="D:/Users/10184/Desktop";
	
	public static void main(String[] args) {
		
		Path file = Path.get(RUTA + "plantas.bin");
		
		try()OutputStream oos = new OutputStream(file);
				();)
		{
	
		}
		System.out.println("Comienzo a escribir en el fichero...");
	}
	catch (IOException e) {
		System.out.println()
		e.printStackTrace();	
	}

}
