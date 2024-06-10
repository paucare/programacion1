package dam.prog1.UT5.examenMarzo;

import java.util.Random;

public class Ejercicio4 {
	/*
	 * Implementar con tipos genéricos, una clase llamada Contenedor, 
	 * donde podremos guardar tantos objetos como deseemos. 
	 * Para ello usaremos un array, que inicialmente tendrá tamaño 0, y se ira 
	 * redimensionando según añadamos o eliminemos elementos.
	 * La clase, además de constructor y toString tendrá los siguientes métodos:	
	 * Void insertarAlPpio (Tnuevo)	
	 * Void insertarAlFinal (T nuevo)
	 * T extraerDelPpio()	
	 * T extraerDelFinal()
	 * 
	 * Se deberá desarrollar un programa principal que genere varios objetos 
	 * (por ejemplo números enteros) y sean almacenados en un objeto de tipo Contenedor.
	 * Y luego pruebe los métodos de la clase con una instrucción de cada tipo y 
	 * la visualización de todo el contenedor cada vez que se modifique. 
	 */
	
	public static void main(String[] args) {
		
	Contenedor<Integer> cont = new Contenedor<>();
	Random rand = new Random();

	cont.insertarAlPrincipio(rand.nextInt(10) + 1);
	System.out.println("Contenedor: " + cont.toString());
	cont.insertarAlFinal(rand.nextInt(10)+1);
	System.out.println("Contenedor: " + cont.toString());
	Integer a = cont.extraerDelPrincipio();
	System.out.println("Se ha eliminado: " + a);
	System.out.println("Contenedor: " + cont.toString());
	Integer b = cont.extraerDelFinal();
	System.out.println("Se ha eliminado: " + b);
	System.out.println("Contenedor: " + cont.toString());
	
	while((rand.nextInt(10) +1) != 9) {
		cont.insertarAlFinal(rand.nextInt(100) + 1);
	}
	System.out.println(cont.toString());
	}
}
