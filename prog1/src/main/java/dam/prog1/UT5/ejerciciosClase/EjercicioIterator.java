package dam.prog1.UT5.ejerciciosClase;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioIterator {
	public static void main(String[] args) {
		
		int n;
		Integer numero; // auxiliar para avanzar en el arrayList con los valores que tiene;
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arrListEnteros = new ArrayList<>();
		System.out.println("¿Cuantos elementos quieres en array?");
		n=sc.nextInt();
		for (int i=1;i <10;i++) {
			arrListEnteros.add(i);
		}
		//Recorrido a
		System.out.println("Recorrido con for each");
		for(Integer dato : arrListEnteros) {
			System.out.println(dato);
		}
		//Recorrido b
		System.out.println("Recorro con iterator indicandole el tipo de objeto");
		
		Iterator<Integer> itr = arrListEnteros.iterator();
		
		while(itr.hasNext()) {
			//numero = itr.next();
			System.out.println(itr.next());
	    }
	
		//recorrido c Debe eliminar numeros pares
		System.out.println("Recorro con iterator y no indicando el tipo de objeto");
		Iterator<Integer> it = arrListEnteros.iterator();
		while(it.hasNext()) {
			numero = (Integer) it.next();
			if(numero%2==0) {
				it.remove();
				//System.out.println("Estas borrando el ..." + it.next());
			}
		}
	
		//Recorrido d Vuelvo a imprimir con for each
		for(Integer item:arrListEnteros) {
			System.out.println(item);
		}
		sc.close();
		
	}
}
