package dam.prog1.UT4.ejercicioArrayObjetos;
import java.util.Random;
import java.util.Scanner;

public class MainAlumnos {
	
	public final static String[] nombres = {"Alejandra","Candela","Vega","Sergio"};
	public final static int TAM_ARRAY = 20; 
	public static void main(String[] args) {
		/*
		 * Crear un array de 20 Alumnos -De
		 * cada alumno necesitamos saber nombre y edad Los nombres estarán comprendidos
		 * entre {"Alejandra","Candela","Vega","Sergio"} La edad estará comprendida
		 * entre 10 y 15 años
		 * 
		 * 
		 * 
		 * Se necesitará la clase Alumno y se generarán objetos de forma aleatoria con
		 * esos nombres y edades Después se preguntará por un nombre y una edad y ... se
		 * buscará cuántas veces se repite.
		 * 
		 */
		
		
		Alumno[] alumnos = new Alumno[TAM_ARRAY];
		
		//Instancia de la clase Random 
		Random random = new Random();
		
		//Bucle for para recorrer y rellenar el array 
		for(int i=0;i < alumnos.length;i++) {
			
			String nombreAleatorio = nombres[random.nextInt(nombres.length)];
			// 						nombres[Indice]
			int edadAleatoria = random.nextInt(6)+10;
			// (int)(Math.random()*6) +10;
			
			alumnos[i] = new Alumno(nombreAleatorio, edadAleatoria);
		}
			
		//Imprimir los alumnos generados
			System.out.println("Los alumnos son: ");
			for(Alumno alumno: alumnos) {
				System.out.println("Nombre: " + alumno.getNombre() + " Edad: " + alumno.getEdad());
			}
			
		//Preguntar por un nombre y una edad
			
		int contador = 0;
		/*
		String nombreBuscado= "Alejandra"
		int edadBuscada= 12;
		*/
		Scanner enter = new Scanner(System.in);
		System.out.println("Introduce el nombre que buscas");
		String nombreBuscado = enter.nextLine();
		System.out.println("Introduce la edad que buscas");
		int edadBuscada = enter.nextInt();
		
		   for (Alumno alumno : alumnos) {
	            if (alumno.getNombre().equals(nombreBuscado) && alumno.getEdad() == edadBuscada) {
	                contador++;
	            }
	        }
		
		   System.out.println("El nombre " + nombreBuscado + " con la edad " + edadBuscada + " se repite " + contador + " veces.");
		   
		   enter.close();
		}
	}


