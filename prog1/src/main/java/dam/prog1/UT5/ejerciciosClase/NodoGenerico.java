package dam.prog1.UT5.ejerciciosClase;

public class NodoGenerico<T> {
		
		private T info;
		private NodoGenerico<T> sig;
	 
		public NodoGenerico(T info) {
			this.info = info;
			this.sig = null;
		}
	 
		public T getInfo() {
			return info;
		}
	 
		public void setInfo(T info) {
			this.info = info;
		}
	 
		public NodoGenerico<T> getSig() {
			return sig;
		}
	 
		public void setSig(NodoGenerico<T> sig) {
			this.sig = sig;
		}
	 
		@Override
		public String toString() {
			return info.toString();
		}
	 
	}

