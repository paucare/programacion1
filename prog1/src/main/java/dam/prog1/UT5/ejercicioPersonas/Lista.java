package dam.prog1.UT5.ejercicioPersonas;

public class Lista implements ListaRepository {

	// Atributos
	private Nodo primero;
	private int tam;

	// Constructor
	public Lista() {

		primero = null;

		tam = 0;

	}

	@Override
	public boolean isEmpty() {

		return tam == 0; // expresión booleana que devuelve true si se cumple la condición
	}

	@Override
	public Persona getFirst() {

		Persona persona = null;

		if (!isEmpty()) {
			persona = primero.getInfo();
		}
		return persona;

	}

	@Override
	public Persona getLast() {

		Persona person = null;

		if (!isEmpty()) { // entonces recorro la lista hasta el ultimo

			Nodo aux = primero;

			while (aux.getSig() != null) {

				aux = aux.getSig();
			}

			person = aux.getInfo();
		}

		return person;
	}

	@Override
	public void insertAtBegin(Persona info) {

		Nodo nuevo = new Nodo(info);

		if (!isEmpty()) {
			nuevo.setSig(primero); // el nodo nuevo apuntando al primero

		}
		primero = nuevo;
		tam++;
	}

	@Override
	public void insertAtEnd(Persona info) {
		Nodo nuevo = new Nodo(info);
		// Si el nodo está vacio? Hacemos la pregunta primero
		if (primero == null) {
			primero = nuevo;
		} else {
			Nodo aux = primero;
			while (aux.getSig() != null) {
				aux = aux.getSig(); // Recorrer la lista
			}
			aux.setSig(nuevo);

		}
		tam++;
	}

	@Override
	public void insertAtPosition(Persona info, int index) {
		if (index >= tam) {
			System.out.println("Valor no valido, valor maximo: " + tam);

		} else if (index == 0) {

			insertAtBegin(info);

		} else {
			Nodo nuevo = new Nodo(info);
			Nodo aux = primero;
			/*
			 * Nodo aux = primero.getSig(); Nodo anterior = primero;
			 * 
			 * for (int i = 0; i < index; i++) { aux = aux.getSig(); anterior =
			 * anterior.getSig(); }
			 * 
			 * anterior.setSig(nuevo); nuevo.setSig(aux);
			 */

			for (int i = 0; i < index - 1; i++) {
				aux = aux.getSig();
			}

			Nodo Siguiente = aux.getSig();
			aux.setSig(nuevo);
			nuevo.setSig(Siguiente);
			tam++;
		}
	}

	public void insertAtPosition2(Persona info, int index) {
		// opciones
		// inserto al ppio
		// inserto en una posición
		if (index >= 0 && index <= tam) {
			Nodo nuevo = new Nodo(info);
			Nodo aux = primero;
			if (index == 0) {
				nuevo.setSig(primero);
				primero = nuevo;
			} else {

				for (int i = 1; i < index; i++) {
					aux = aux.getSig();
				}
				nuevo.setSig(aux.getSig());
				aux.setSig(nuevo);
			}
			tam++;
		}

	}

	@Override
	public boolean containsInfo(Persona info) {

		Nodo aux = primero;

		while (aux != null) {

			if (aux.getInfo().equals(info)) {

				return true;
			}

			aux = aux.getSig();

		}

		return false;

	}

	@Override
	public Persona getElementAt(int index) {
		Nodo aux = primero;
		if (index >= tam || index < 0) {
			return null;

		} else {
			for (int i = 0; i < index; i++) {
				aux = aux.getSig();
			}
		}
		return aux != null ? aux.getInfo() : null;
	}

	public Persona getElementAt2(int index) {
		Nodo aux = primero;
		if (index >= tam || index < 0) {
			return null;
		} else {
			for (int i = 0; i < index; i++) {
				aux = aux.getSig();
			}
			return aux.getInfo();
		}
	}

	@Override
	public boolean removeByInfo(Persona info) {

		boolean resultado = false;

		Nodo borrar = new Nodo(info);

		if (!isEmpty()) {

			if (primero.getInfo().equals(info)) {

				borrar = primero;

				primero = primero.getSig();

				borrar.setSig(null);

				tam--;
				return true;

			} else {

				Nodo aux = primero;
				Nodo siguiente = aux.getSig();

				while (siguiente != null) {
					if (!siguiente.getInfo().equals(info)) {

						aux.setSig(siguiente.getSig());
						tam--;
						return true;

					}

					aux = siguiente;

					siguiente = siguiente.getSig();

					return false;

				}
			}
		}

		return resultado;
	}

	@Override
	public Persona removeAt(int index) {

		if (!isEmpty()) {

			if (index >= tam || index < 0) {

				return null;

			} else if (index == 0) {

				Nodo borrar = primero;
				primero = primero.getSig();
				borrar.setSig(null);
				tam--;

			} else if (index == tam) {
				
				Nodo aux = primero;
				for(int i=0;i<index-1;i++) {
					aux= aux.getSig();
				}
				aux.setSig(null);
				tam--;

			} else {

				Nodo aux = primero;
				Nodo siguiente = aux.getSig(); 

				for(int i=0;i<index-1;i++) {
					aux=siguiente;
					siguiente=siguiente.getSig();
					}
				
					aux.setSig(siguiente.getSig());
					tam--;

				}
			}
		
			return null;
		}

	@Override
	public void print() {
		if(isEmpty()) {
			System.out.println("La lista esta vacia");
		} else {
			Nodo aux = primero;
			
			while(aux!=null) {
				System.out.println(aux.getInfo());
				aux=aux.getSig();
			}
		}

	}

	@Override
	public boolean clearList() { // version hiper simplificado
		primero = null;
		return isEmpty();
		
	}
	
	public boolean clearList2() {
		if(isEmpty()) {
			return true;
		}
		removeAt(0);
		return clearList2();
	}
	
	public boolean clearList3() { // version mia (no se si funciona)
		
		if(isEmpty()) {
			
			return true;
			
		}else {
		
		Nodo aux = primero.getSig();
		primero=null;
		Nodo borrar= aux.getSig();
		
		while(borrar!=null) {
			aux.setSig(null);
			borrar=borrar.getSig();
			aux=borrar;
		}
		
		return true;
		}
		
	}

	@Override
	public int size() {
		return tam;
	}

}
