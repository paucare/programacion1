package dam.prog1.UT5.examenMarzo;

public class Contenedor<T> {

	private int tam;
	private T[] objetos;
	
	@SuppressWarnings("unchecked")
	public Contenedor() {
		this.tam = 0;
		this.objetos = (T[]) new Object[0];
	}
	
	@SuppressWarnings("unchecked")
	public void insertarAlPrincipio(T a) {

			T[] o = (T[]) new Object[tam + 1];
			
			for (int i = 0; i < tam; i++) {
				o[i + 1] = objetos[i];
			}
			
			o[0]= a;
			
			objetos = o;
		
			tam++;

	}
	
	@SuppressWarnings("unchecked")
	public void insertarAlFinal(T a) {
		
		T[] o = (T[]) new Object[tam + 1];
		
		for(int i = 0; i < tam;i++) {
			o[i] = objetos[i];
		}
		
		o[tam] = a;
		
		objetos = o;
		
		tam++;
	}

	@SuppressWarnings("unchecked")
	public T extraerDelPrincipio() {
		
		T a = null;
		
		if(tam > 0) {
		
		T[] o = (T[]) new Object[tam - 1];
		
		a = objetos[0];
		
		for(int i = 1; i < tam; i++) {
			o[i-1] = objetos[i];
		}
		objetos = o;
		tam--;
		
		}
		
		return a;
	}
	
	@SuppressWarnings("unchecked")
	public T extraerDelFinal() {
		
		T a = null;
		
		if(tam > 0) {
		
		a = objetos[tam - 1];
		
		T[] o = (T[]) new Object[tam - 1];
		
		for(int i = 0;i < tam - 1;i++) {
			o[i] = objetos[i];
		}
		objetos = o;
		tam--;
		
		}
		return a;
	}

	@Override
	public String toString() {
		/*
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0;i < tam; i++) {
			sb.append(objetos[i]);
			if(i < tam - 1) {
				sb.append(", ");
			}
		}
		
		sb.append("] ");
		return sb.toString();
		*/
	
		    String resultado = "[";

		    for (int i = 0; i < tam; i++) {
		        resultado += objetos[i];
		        if (i < tam - 1) {
		            resultado += ", ";
		        }
		    }

		    resultado += "]";
		    
		    return resultado;
		}

		
	}
	
