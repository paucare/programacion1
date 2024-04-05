package dam.prog1.UT8;

import java.io.*;

public class EjemploFile {
	
	public static void main(String[] args) {
		
		//String ruta="Primavera.txt";
		
		//Creamos objeto de la clase File
		
		File archivo = new File("D:/Users/10184/Desktop/FicherosProg/Primavera.txt");
		
		File archivoRenombrado = new File("D:/Users/10184/Desktop/FicherosProg/PrimaveraTrompetera.txt");
		
		
		//1 informacion
		
		//nombre del fichero
		System.out.println("nombre: " + archivo.getName());
		//ruta absoluta
		System.out.println("ruta absoluta: "+ archivo.getAbsolutePath());
		//tamaño
		System.out.println("tamaño : "+ archivo.length());
		
		//2 comprobar
		
		//si es directorio o si es archivo
		
		
		/*System.out.println("Es directorio: "+ archivo.isDirectory());
		//si es archivo 
		System.out.println("Es archivo: "+ archivo.isFile());
		*/
		
		if(archivo.isDirectory()) {
			System.out.println("Es un directorio");
		}
		else if(archivo.isFile()) {
			System.out.println("Es un fichero");
		}
		else {
			System.out.println("El archivo no existe");
		}
		//3 si existe cambiar el nombre
		if(archivo.exists()) {
			if(archivo.renameTo(archivoRenombrado)) {
				System.out.println("El archivo ha sido renombrado a" + archivoRenombrado.getName());
				System.out.println("Nueva ruta absoluta " + archivoRenombrado.getAbsolutePath());
			}

		}
	}
	

}
