package dam1.tema2;
/* 2. Desarrolla un programa que lea números hasta 
 *que se den cinco ceros y escriba después la suma
 *de los números leídos. 
 *Introduciendo: 1 3 5 0 4 0 6 7 –1 0 0 8 0 Da como salida: 33 
 */

import java.util.Scanner;

public class Halloween2 {

	public static void main(String[] args) { //Esto es el main 
		Scanner read = new Scanner(System.in); //Declaramos el scanner 
		int num,total=0, zero=0; // Declaracion de variables
		
		do{
			System.out.println("Introduce un número"); //Al meter el syso aqui me pregunta cada vez que se inice un bucle
			num = read.nextInt(); // Aqui le decimos que vamos a introducir dicha variable
			total += num; // Esto es lo mismo que decir total = total * num
			if(num==0) { // Este bucle sirve para si metemos un cero que añada 1 al contador zero
				zero++; //Esto incrementa en 1 el contador de ceros 
			}
		
		}while(zero <5); // Esta condicion termina el bucle en el momento que el contador zero llegue a 5
		System.out.println("El total ha sido " + total); // Imprimimos por pantalla el resultado de la suma
		read.close();
	}

}
