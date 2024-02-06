package dam.prog1.UT4.ejercicios1601;

public class EjercicioEncontrarMaximoElemento {

	public static void main(String[] args) {
		// Declaramos el array

		int[] numbers = { 12, 45, 8, 23, 67, 32, 5, 18 };

		// Inicializamos una variable para guardar el valor maximo

		int maxElement = findMaxElement(numbers);

		// Enseñamos el resultado por pantalla
		System.out.println("El elemento mayor del array es: " + maxElement);
	}

	// Metodo para encontrar el elemento mayor
	private static int findMaxElement(int[] array) {
		// Iteramos a traves del array
		int max = array[0]; // asumimos que el primer elemento sera el mayor

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i]; // Se actualiza el valor maximo cuando encuentra
				// un elemento mas grande
			}
		}
		return max;

	}
}
