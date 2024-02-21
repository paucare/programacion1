package dam.prog1.UT5.ejercicioPersonas;

public class ListaHermanaTorpe implements Lista {

	private Nodo primero;
	// No tiene tamaño

	// No tiene contador de tamaño ni esta factorizada

	private static void main(String[] args) {
		
		Lista lista = new ListaHermanaTorpe();
		
		//Tema 3 compatibilidad entre tipos java;
	}

	public ListaHermanaTorpe(Nodo primero) {
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean clearList() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
