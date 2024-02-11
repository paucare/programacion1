package dam.prog1.UT4.ejercicios1601;

import java.util.Scanner;
import java.util.Random;

public class EjercicioAhorcado {
	
	public static void main(String[] args) {
		
		String [] words = new String[4];
		words[0]="santuario";
		words[1]="enlace";
		words[2]="fuego";
		words[3]="ceniza";
		
		//Instacia de objeto de la clase Random
		
		Random random = new Random();
		
		// Obtener un indice aleatorio del array words 
		
		int wordsIndex = random.nextInt(words.length);
		
		char [] letters = separar(words[wordsIndex]);
		
		int attLeft = 7;
		
		
		boolean[] lettersGuessed = new boolean[letters.length];
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Este es el juego el ahorcado");
		System.out.println("La palabra tiene " + letters.length + " letras.");
		
		//Bucle principal
		
		while(attLeft > 0 && !todasAdivinadas(lettersGuessed)) {
			System.out.println("\nIntentos restantes: " + attLeft);
			System.out.print("Palabra: ");
			//metodo para mostrar los espacios
			mostrarLetras(letters, lettersGuessed); // metodo( array de char, array de booleanos);
			System.out.print("\nIntroduce una letra: ");
			char letter = enter.next().charAt(0);
			
			//funcion para ver si la letra está en la palabra
			
			boolean oneGuessed=false; // asumimos que letter no esta en la palabra
			
				for(int i=0;i < letters.length;i++) {
					if(letter==letters[i]) { //
						lettersGuessed[i]=true;
						oneGuessed=true;
					}
				}
				if(!oneGuessed) {
						attLeft--;
						System.out.println(letter + " no está en la palabra");
						
					}
							
		}// Aqui se acaba el bucle principal
		
		if(todasAdivinadas(lettersGuessed)) {
			System.out.println("Has ganado! La palabra era: " + String.valueOf(letters));
		} else {
			System.out.println("Oh no! Te has quedado sin intentos. La palabra era: " + String.valueOf(letters));
		}
		
		enter.close();
	
	}
	
	// Este metodo separa la palabra en un array de characters
	
	private static char[] separar(String ranWord){
		char [] letters = new char[ranWord.length()];
		for(int i=0;i < ranWord.length();i++) {
			letters[i] = ranWord.charAt(i);
		}
		return letters;
	}
	
	//Este metodo comprueba si se han adivinado todas las letras, 
	//Una de las condiciones necesarias para parar el juego
	
	private static boolean todasAdivinadas(boolean[] lettGsd) {
		
		for(boolean letter: lettGsd) {
			if (!letter) { //Si en algun momento letter es falso el valor que devuelve sera falso
				return false;
			}
		}
		
		return true;
		}
	
	//Este metodo muestra o espacios o letras 
	
	private static void mostrarLetras(char[] letter, boolean[] lettGsd) {
		for(int i=0;i < letter.length;i++) {
			if(lettGsd[i]) {
				System.out.print(letter[i]);
			}
			else {
				System.out.print("_");
			}
			System.out.print(" ");
		
		}
	}
	
}
