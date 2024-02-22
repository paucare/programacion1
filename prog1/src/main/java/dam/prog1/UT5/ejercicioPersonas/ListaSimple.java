package dam.prog1.UT5.ejercicioPersonas;

public class ListaSimple implements Lista {

	private Nodo primero;
	private int tam;

	public static void main(String[] args) {

		Lista lista = new ListaSimple();

	}

	@Override
	public boolean isEmpty() {
		return tam == 0; // expresión booleana que devuelve true si se cumple la condición
	}

	@Override
	public Persona getFirst() {
		Persona person = null;

		if (!isEmpty()) {
			person = primero.getInfo();
		}
		return person;

	}

	@Override
	public Persona getLast() {
		Persona person = null;
		if (!isEmpty()) { // entonces recorro la lista hasta el ultimo
			Nodo aux = primero;
			while (aux.getSig() != null) {
				aux = (aux.getSig());
			}
			return aux.getInfo();
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
			aux = primero.getSig();
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
		} else {
			if (index == 0) {
				insertAtBegin(info);
			} else {
				Nodo nuevo = new Nodo(info);
				Nodo aux = primero.getSig();
				Nodo anterior = primero;

				for (int i = 0; i < index; i++) {
					aux = aux.getSig();
					anterior = anterior.getSig();
				}

				anterior.setSig(nuevo);
				nuevo.setSig(aux);
				tam++;
			}
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

		if (aux.getInfo().equals(info)) {

			while (aux != null) {
				if (aux.getInfo().equals(info)) {
					return true;
				}
				aux = aux.getSig();
			}

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

	@Override
	public boolean removeByInfo(Persona info) {

		return false;
	}

	@Override
	public Persona removeAt(int index) {
		
			
		

		return null;
	}

	@Override
	public void print() {

	}

	@Override
	public boolean clearList() { // version hiper simplificado
			primero = null;
			return isEmpty();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
