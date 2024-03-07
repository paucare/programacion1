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
	 
		public NodoGenerico getSig() {
			return sig;
		}
	 
		public void setSig(NodoGenerico sig) {
			this.sig = sig;
		}
	 
		@Override
		public String toString() {
			return info.toString();
		}
	 
	}

