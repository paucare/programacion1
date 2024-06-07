package dam.prog1.UT5.examenMarzo;

public class Pila {
	/*
	 * Desarrolla un programa que implemente una pila.
	 * El programa deberá incluir los siguientes métodos:
	*/
	private Nodo cima;
	private int tam;
	
		
	public boolean isEmpty() {
		return tam==0;
	}
	
	//Obtener el Tamaño
	public int size() {
		return tam;
	}
	
	//Insertar
	
	public void push(Integer info) {
		Nodo nuevo = new Nodo(info);
		if(isEmpty()) {
			cima = nuevo;
		} else {
			nuevo.setSig(nuevo);
			cima = nuevo;
			tam++;
		}
	}
	//Extraer
	public void pop() {
		if(!isEmpty()) {
			Nodo borrar = cima;
			cima = cima.getSig();
			borrar.setSig(null);
			tam--;
		}		
	}
	//Peek
	public Integer peek() {
		if(isEmpty()) {
		return cima.getInfo();
		}
		return null;
	}
	
	//Imprimir
	public void print() {
		System.out.println("La pila contiene: ");
		if(isEmpty()) {
			
			Nodo aux = cima;
			System.out.println("......cima.....");
			System.out.println("---------------");
			while(aux.getSig()!=null) {
				System.out.println(aux.getInfo());
				aux = aux.getSig();
			}
			System.out.println("---------------");
		}
	}
	 

}
