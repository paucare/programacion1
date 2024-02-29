package dam.prog1.UT5.videoclub;

public class Cliente {
	
	private static int cont_id=1;
	
	String numerocarnet;
	String nombre;
	
	public Cliente(String nombre) {
		this.nombre=nombre;	
	}

	public String getNumerocarnet() {
		return numerocarnet;
	}

	public void setNumerocarnet(String numerocarnet) {
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
