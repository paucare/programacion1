package dam.prog1.UT5.ejerciciosClase;

import dam.prog1.UT5.ejercicioPersonas.Nodo;

public class Pila {
	
	public Integer pop() {
		if(!isEmpty()) {
			Nodo borrar=cima; //creo ese nodo para almacenar lo que voy a borrar
			cima=cima.getSig();
			borrar.setSig(null);
			tam--;
			return borrar.getInfo;
		}
		return null;
	}
	
	public Integer peak();
	

}
