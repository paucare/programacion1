package dam.prog1.UT5.ejercicioPersonas;

public class Nodo {
		
		private Persona info;
		private Nodo sig;
		
		public Nodo(Persona info) {
			this.info = info;
		}
		public Persona getInfo() {
			return info;
		}
		public void setInfo(Persona info) {
			this.info = info;
		}	
		
		public Nodo getSig() {
			return sig;
		}
		public void setSig(Nodo sig) {
			this.sig = sig;
		}
		
		public String toPersona() {
			return "Nodo [info=" + info + ", sig=" + sig + "]";
		}
	 
}
