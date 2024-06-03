package dam.prog1.UT5.ejercicioPersonas;

public class InitLista {

	public static void main(String[] args) {

		Lista lista = new Lista();

		Persona p1 = new Persona("Miquella", 20);
		Persona p2 = new Persona("Malenia", 20);
		Persona p3 = new Persona("Radagon", 50);
		Persona p4 = new Persona("Ranni",25);
		
		lista.insertAtBegin(p1);
		lista.insertAtEnd(p2);
		lista.insertAtEnd(p3);
		lista.insertAtEnd(p4);
		
		boolean resultado = lista.isEmpty();
		System.out.println("¿Esta vacía? " + resultado);
		
		System.out.println("Los elementos de la lista son: ");
		lista.print();
		
		System.out.println();
		
		lista.clearList3();
		
		System.out.println(lista.size());
		System.out.println(lista.isEmpty());
		

	}

}
