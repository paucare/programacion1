package dam.prog1.UT5.listaGenericos;

public class Nodo<T> {
		
		private T info;
		private Nodo<T> sig;
		
		
		
		public Nodo(T info) {
			this.info = info;
		}
		public T getInfo() {
			return info;
		}
		public void setInfo(T info) {
			this.info = info;
		}	
		
		public Nodo<T> getSig() {
			return sig;
		}
		public void setSig(Nodo<T> sig) {
			this.sig = sig;
		}
		
		public String toPersona() {
			return "Nodo<T> [info=" + info + ", sig=" + sig + "]";
		}
	 
}
