package dam.prog1.UT5.ejercicioPersonas;

public class ListaTorpe implements ListaRepository {

	private Nodo primero;
	// No tiene tamaño

	// No tiene contador de tamaño ni esta factorizada

	private static void main(String[] args) {
		
		ListaRepository lista = new ListaTorpe();
		
		//Tema 3 compatibilidad entre tipos java;
	}

	public ListaTorpe(Nodo primero) {
		this.primero = primero;
	}

	@Override
	public boolean isEmpty() {
		return primero == null;
	}

	@Override
	public Persona getFirst() {
		Persona person = null;
		if(!isEmpty()) {
			person= primero.getInfo();
		}
		return person;
	}

	@Override
	public Persona getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertAtBegin(Persona info) {
		
		Nodo nuevo = new Nodo(info);
			
			if(primero==null) {
				primero=nuevo;
		}else {
			nuevo.setSig(primero);
			primero=nuevo;

		}
	}

	@Override
	public void insertAtEnd(Persona info) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertAtPosition(Persona info, int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean containsInfo(Persona info) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Persona getElementAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeByInfo(Persona info) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Persona removeAt(int index) {
		
		return null;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean clearList() {
		if(!isEmpty()) {
			System.out.println("Borrado...");
			while(size() != 0) {
				removeAt(0); // va borrando el primero 
				System.out.println("Fin del borrado");
				
			}
		}
		return isEmpty();
	}
	public boolean clearList2() {
		if(isEmpty()) { // CASO BASE --> LISTA VACÍA
			return true;
		}
		removeAt(0); // ELIMINO EL PRIMERO DE LA LISTA 
		return clearList2();
	}

	@Override
	public int size() {
		int contador =0;
		Nodo aux= primero;
		// recorrido de toda la lista
		while(aux!=null) {
			contador++;
			aux=aux.getSig();
		}
		
		return contador;
	}

}
