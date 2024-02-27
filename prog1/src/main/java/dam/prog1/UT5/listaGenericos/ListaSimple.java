package dam.prog1.UT5.listaGenericos;

public class ListaSimple implements Lista {

	private Nodo<T> primero;
	private int tam;

	public static void main(String[] args) {

		Lista lista = new ListaSimple();

	}

	@Override
	public boolean isEmpty() {
		return tam == 0; // expresión booleana que devuelve true si se cumple la condición
	}

	@Override
	public T getFirst() {
		T person = null;

		if (!isEmpty()) {
			person = primero.getInfo();
		}
		return person;

	}

	@Override
	public T getLast() {
		T person = null;
		if (!isEmpty()) { // entonces recorro la lista hasta el ultimo
			Nodo<T> aux = primero;
			while (aux.getSig() != null) {
				aux = (aux.getSig());
			}
			return aux.getInfo();
		}
		return person;
	}

	@Override
	public void insertAtBegin(T info) {

		Nodo<T> nuevo = new Nodo<T>(info);

		if (!isEmpty()) {
			nuevo.setSig(primero); // el nodo nuevo apuntando al primero

		}
		primero = nuevo;
		tam++;
	}

	@Override
	public void insertAtEnd(T info) {
		Nodo<T> nuevo = new Nodo<T>(info);
		// Si el nodo está vacio? Hacemos la pregunta primero
		if (primero == null) {
			primero = nuevo;
		} else {
			Nodo<T> aux = primero;
			aux = primero.getSig();
			while (aux.getSig() != null) {
				aux = aux.getSig(); // Recorrer la lista
			}
			aux.setSig(nuevo);

		}
		tam++;
	}

	@Override
	public void insertAtPosition(T info, int index) {
		if (index >= tam) {
			System.out.println("Valor no valido, valor maximo: " + tam);
		} else {
			if (index == 0) {
				insertAtBegin(info);
			} else {
				Nodo<T> nuevo = new Nodo<T>(info);
				Nodo<T> aux = primero.getSig();
				Nodo<T> anterior = primero;

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

	public void insertAtPosition2(T info, int index) {
		// opciones
		// inserto al ppio
		// inserto en una posición
		if (index >= 0 && index <= tam) {
			Nodo<T> nuevo = new Nodo<T>(info);
			Nodo<T> aux = primero;
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
	public boolean containsInfo(T info) {

		Nodo<T> aux = primero;

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
	public T getElementAt(int index) {
		Nodo<T> aux = primero;
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
	public boolean removeByInfo(T info) {

		return false;
	}

	@Override
	public T removeAt(int index) {
		
			
		

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
