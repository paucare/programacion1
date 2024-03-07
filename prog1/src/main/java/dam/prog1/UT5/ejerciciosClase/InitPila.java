package dam.prog1.UT5.ejerciciosClase;

public class InitPila {

	public static void main(String[] args) {
		Pila pila = new Pila();
		
		pila.push(1);
		Integer num= pila.peak();
		System.out.println("El valor que esrá en la cima es " + num);
		
		boolean vacia;
		System.out.println(vacia=pila.isEmpty());
		
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(1);
		
		pila.print();
		
		//Sacamos uno
		
		pila.pop();
		pila.print();
	}

}
