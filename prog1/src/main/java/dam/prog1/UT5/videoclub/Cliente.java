package dam.prog1.UT5.videoclub;

public class Cliente {
	
	private static int cont_id=1;
	
	int numerocarnet;
	String nombre;
	
	public Cliente(String nombre) {
		numerocarnet = cont_id++;
		this.nombre=nombre;	
	}

	public int getNumerocarnet() {
		return numerocarnet;
	}

	public void setNumerocarnet(int numerocarnet) {
		this.numerocarnet = numerocarnet;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/*
	 * String nombre
	 * String nCarnet
	 * int identificador = 0;
	 * string final IDPREFIX = "cli_+"
	 * 
	 * public Cliente (String nombre){
	 * 
	 * 
	 * 
	 */
	

}
