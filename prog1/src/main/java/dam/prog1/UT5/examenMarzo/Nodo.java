package dam.prog1.UT5.examenMarzo;

public class Nodo {
	private Registro info;
	private Nodo sig;
	
	public Nodo(Registro info) {
		this.info = info;
		this.sig = null;
	}

	public Registro getInfo() {
		return info;
	}

	public void setInfo(Registro info) {
		this.info = info;
	}

	public Nodo getSig() {
		return sig;
	}

	public void setSig(Nodo sig) {
		this.sig = sig;
	}
	
}
