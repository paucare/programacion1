package dam.prog1.UT5.ejerciciosClase;

public class Cola<T> {
	
	//null <-- ultimo <-- penultimo <--nodo_n <-- segundo <--primero
	
	// el ultimo se encola y el primero se desencola
	
	private NodoGenerico<T> primero;
	private NodoGenerico<T> ultimo;
	
	private int tam;
	
	//el constructor sería opcional
	
	public Cola() {
		primero = ultimo = null;
		tam=0;
	}
	
	public int size() {
		return tam;
	}
	
	public boolean isEmpty() {
		return tam==0;
	}
	
	public void enqueue(T info) {
		NodoGenerico <T> nuevo = new NodoGenerico<>(info);
		
		if(isEmpty()) {
			primero=ultimo=nuevo;
		}else {
			ultimo.setSig(nuevo);
			ultimo=nuevo;
		}
		tam++;
	}
	
	public T dequeue() {
		if (!isEmpty()) {
			T info = primero.getInfo();
			primero= primero.getSig();
			tam--;
			return info;
		}
		return null;	
	}
	
	//Igual pero con el nodo entero no con la información
	public T dequeue2() {
		if (!isEmpty()) {
			NodoGenerico<T> aux=primero;
			primero= primero.getSig();
			tam--;
			return aux.getInfo();
		}
		return null;	
	}
	
	//Lo mismo que el peak
	public T front() {
		if (!isEmpty()) {
			return primero.getInfo();
		}
		return null;
	}
	
	public void printCutre(){
		System.out.println("La cola tiene ");
		if(!isEmpty()) {
			NodoGenerico<T> aux = primero;
			while(aux!=null) {
				System.out.println(aux.getInfo());
				aux = aux.getSig(); //avanzo
			}
		} else {
			System.out.println("Vacia");
		}
	}
	
	public void printComplejo(){
		System.out.println("La cola contiene: ");
		if(!isEmpty()){
			System.out.println("Ultimo -->");
			printElement(primero);
			System.out.println("");
		}
		
	}
}
