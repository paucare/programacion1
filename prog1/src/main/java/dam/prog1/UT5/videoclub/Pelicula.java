package dam.prog1.UT5.videoclub;

public class Pelicula {
	
	private static int cont_id=1;
	
	int codigo;
	String titulo;
	String id;
	
	public Pelicula(String titulo) {
		codigo = cont_id++;
		this.titulo=titulo;	
		this.id="peli " + codigo; 
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	/*
	 * String titulo
	 * String static cod;
	 * int identificador = 0;
	 * string final IDPREFIX = "peli_+"
	 * 
	 * public Pelicula (String nombre){
	 * 
	 * this.titulo=titulo;
	 * this.cod=IDPREFIX + identificador++;
	 * }
	 * 
	 */

}
