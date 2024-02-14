package dam.prog1.UT4.ejercicios1601;

/**
 * Desarrolla un programa que ordene los índices de un array de enteros, 
 * en función del contenido de cada elemento del array, 
 * de mayor a menor, es decir, hay que almacenar en otro array 
 * el índice del array original, en función del contenido del último.  
 */

public class Ejercicio6 {
	
	public static void main(String[]args) {
		int [] array = {2,80,54,4,1,0,34,78,100,9};
		int []solucion = new int [array.length];
		int num= 0;
		int mayor= -99999999;
		for(int o=0; o < solucion.length;o++) {
			System.out.println("|" + array[o] + "|");
		}
		System.out.println("");
		while(num<array.length) {
			//Recoge el numero más alto del array
			for(int i=0;i<array.length;i++) {
				if(mayor<=array[i]) {
					mayor=array[i];
				}
			}
			//Rellena el array nuevo con los numeros mas altos
			solucion[num]=mayor;
			//Cambiemos el numero mas alto para que no lo vuelva a recoger
			for(int j=0;j<array.length;j++) {
				if(mayor==array[j]) {
					array[j]=-99999999;
					mayor=-99999999;
				}
			//Cambiamos la posicion del array solucion
				num++;
			//Comprobar solución
				for(int z=0;z<solucion.length;z++) {
					System.out.println("|" + array[z] + "|");
				}
			}
				
			
			
		}
		
	}
	
	

}
