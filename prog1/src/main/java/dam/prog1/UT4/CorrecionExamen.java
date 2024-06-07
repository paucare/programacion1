package dam.prog1.UT4;

import java.util.*;

public class CorrecionExamen {

	private static final int DIM_COL = 10;

	public static void main(String[] args) {
		
		int[][] matriz = ejercicio1();
		System.out.println(" ");
		
		int[] array = ejercicio2(matriz);
		System.out.println(" ");
		
		ejercicio3(matriz, array);
		System.out.println(" ");
		
		ejercicio4();
		System.out.println(" ");
		
		ejercicioExtra(array);
	}
	
	//Faltaría implementar un metodo para mostrar array con un mensaje

	private static int[][] ejercicio1() {
		System.out.println("Ejercicio 1");

		// Instancia de la clase Random
		Random rand = new Random();
		// filasAleatorio= rand.nextInt(5) + 6; rand.nextInt(5,11)
		int filasAleatorio = rand.nextInt(6) + 6;

		System.out.println("Numero de filas: " + filasAleatorio);

		// Crear matriz
		int[][] matriz = new int[filasAleatorio][DIM_COL];

		// Cargar matriz
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[0].length; c++) {
				matriz[f][c] = rand.nextInt(7) + 1;
			}
		}
		// Mostrar matriz
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[0].length; c++) {
				System.out.print(matriz[f][c] + " ");
			}
			System.out.println();
		}
		
		return matriz;
	}

	private static int[] ejercicio2(int[][] mat) {

		System.out.println("Ejercicio 2");

		// Declaramos el array que se va a devolver
		int[] nuevoArray = new int[mat.length];

		int suma = 0;

		// Cargamos el array
		for (int f = 0; f < mat.length; f++) {
			suma = 0;
			for (int c = 0; c < mat[0].length; c++) {
				suma += mat[f][c];
			}
			nuevoArray[f] = suma;
		}

		// Mostramos el array
		for (int f = 0; f < mat.length; f++) {
			System.out.print(nuevoArray[f] + " ");
		}
		return nuevoArray;
	}

	private static int[] ejercicio3(int[][] mat, int[] array) {

		System.out.println("Ejercicio 3");

		int filas = mat.length;
		int[] subArray = new int[mat[0].length];

		int indiceMayor = 0;
		int valorMaximo = 0;

		/*
		 * Correción de alejandra int indiceMayor=0; for (int i=1;
		 * i<arrSuma.length;i++){ if(arrSuma[IndiceMayor] < arrSuma[i]){ indiceMayor =
		 * i; Syso la posicion mayor es indiceMayor
		 * 
		 * int [] arrMayor = mat[indiceMayor]; Esto es algo como el paso por referencia
		 */

		// Buscamos la suma maxima
		for (int f = 0; f < filas; f++) {
			if (valorMaximo == array[f]) {
				System.out.println("Habiendo dos arrays iguales el primero tiene el indice " + f);
			} else if (array[f] > valorMaximo) {
				valorMaximo = array[f];
				indiceMayor = f;
			}
		}

		// Mostramos el subArray
		for (int c = 0; c < mat[indiceMayor].length; c++) {
			subArray[c] = mat[indiceMayor][c];
			System.out.print(subArray[c] + " ");
		}
		return subArray;
	}

	private static void ejercicio4() {
		System.out.println("Ejercicio 4");
		Random rand = new Random();
		int[][] matriz;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime filas");
		int filas = sc.nextInt();
		System.out.println("Dime columnas");
		int columnas = sc.nextInt();

		matriz = new int[filas][columnas];
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[0].length; c++) {
				matriz[f][c] = rand.nextInt(5) + 5;
			}

		}
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[0].length; c++) {
				System.out.print(matriz[f][c] + " ");
			}
			System.out.println();
		}

		// Intercambio

		/*
		 * for(int c=0;c<columnas;c++) { int aux=matriz[0][0];
		 * matriz[0][0]=matriz[0][1]; matriz[0][1]=aux; }
		 */
		// Lo mismo con un array
		int[] array = matriz[0];
		matriz[0] = matriz[1];
		matriz[1] = array;

		// Impresión de matriz intercambiada
		System.out.println();
		System.out.println("Matriz intercambiada");
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[0].length; c++) {
				System.out.print(matriz[f][c] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
/*
 * Ejercicio EXTRA. 
 * Se otorgará un punto extra con la conclusión de este punto que se evaluará siempre 
 * y cuando el resto de los puntos estén resueltos. 
 * Desarrolla un método llamado ejercicioExtra que reciba el array unidimensional devuelto por el ejercicio3
 *  y devuelva otro array unidimiensional con los mismos elementos pero ordenados de menor a mayor. 
 *  El array que se recibe por parámetros NO SE PUEDE MODIFICAR
 */
	private static int[] ejercicioExtra(int[] arr) {
		System.out.println("Ejercicio 5");

		// Copiamos el array en otro nuevo (para trastear)
		int[] arrCopia = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrCopia[i] = arr[i];
		}
		//Ordenamos

		int indiceActual = 0;
		int[] arrayOrdenado = new int[arr.length];
		
		while (indiceActual < arrCopia.length) {
			int indiceMenor = 0;
			
			for (int i = 1; i < arrCopia.length; i++) {
				if (arrCopia[i] < arrCopia[indiceMenor]) {
					indiceMenor = i;
				}
			}
			
			//Cambiamos los elementos.
			
			arrayOrdenado[indiceActual] = arrCopia[indiceMenor];
			arrCopia[indiceMenor] = Integer.MAX_VALUE;
	
			indiceActual++;
		}
		
		//Aqui falta llamar al metodo mostrarArrat y primero
		//se muestra el ordenado y luego el original
		return arrayOrdenado;
	}

}
