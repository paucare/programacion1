package dam.prog1.UT5.ejerciciosClase;

public class InitPilaGenerica {

	public static void main(String[] args) {
		PilaGenerica <Integer> pila = new PilaGenerica<>();
		
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
