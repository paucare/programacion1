package dam.prog1.UT5.ejercicioPersonas;

public class InitLista {

	public static void main(String[] args) {

		Lista lista = new Lista();

		Persona p1 = new Persona("Miquella", 20);
		Persona p2 = new Persona("Malenia", 20);
		Persona p3 = new Persona("Radagon", 50);
		
		System.out.println(lista.isEmpty());
		System.out.println("La lista esta vacia");
		
		lista.insertAtBegin(p1);
		lista.insertAtEnd(p2);
		lista.insertAtEnd(p3);
		
		System.out.println(lista.isEmpty());
		System.out.println();
		System.out.println("La lista no esta vacia");
		
		System.out.println("Los elementos de la lista son: ");
		lista.print();
		
		System.out.println();
		
		lista.clearList2();
		
		System.out.println(lista.isEmpty());

	}

}
