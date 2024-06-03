package dam.prog1.UT5.ejerciciosClase;

public class Pila {
	
		// la vamos hacer estricta para un objeto
		 
		private Nodo cima;
		private int tam;
	 
		public int size() {
			return tam;
		}
	 
		public boolean isEmpty() {
			return cima == null;
		}
	 
		// este le usamos para meter en la pila
		public void push(Integer info) {
	 
			Nodo nuevo = new Nodo(info);
	 
			if (isEmpty()) {
	 
				cima = nuevo;
				tam++;
			} else {
				// aqui decimos que el nuevo.setSig va a ser la cima
				nuevo.setSig(cima);
				cima = nuevo;
				tam++;
			}
	 
		}
		
		// esto es para sacar de la pila
		 
		public Integer pop() {
	 
			if (isEmpty()) {
				return null;
			} else {
	 
				// acabamos de crear el nodo para almacenar lo que voy a borrar
				Nodo borrar = cima;
	 
				// estamos indicando que la nueva cima es el siguiente a cima
	 
				cima = cima.getSig();
	 
			}
			return tam;
		}
	 
		// sacamos si no esta vacia la lista
		public Integer pop2() {
	 
			if (!isEmpty()) {
				// acabamos de crear el nodo para almacenar lo que voy a borrar
				Nodo borrar = cima;
	 
				// estamos indicando que la nueva cima es el siguiente a cima
	 
				cima = cima.getSig();
				//estamos diciendo que que borrar mire a null
				borrar.setSig(null);
				tam--;
	 
				return borrar.getInfo();
			}
	 
			return null;
		}
		public Integer peek () {
			
			if (!isEmpty()) {
				return cima.getInfo();
			}
			return null;
		}
		public void print () {
			System.out.println("la pila contiene:");
			if(!isEmpty()) {
				
				Nodo aux = cima;
				System.out.println("......cima.....");
				System.out.println("---------------");
				while (aux.getSig()!=null) {
					System.out.println(aux.getInfo());
					
					aux =aux.getSig();
				}
				System.out.println("-----------");
			}
		}
	 
	}
