package dam.prog1.UT5.ejercicioPersonas;

public class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	/**
	 * Método que calcula qué persona es la de mayor edad
	 * @param p1 Persona 1
	 * @param p2 Persona 2
	 * @return la persona mayor o null en caso de no recibir alguna de las personas
	 */
	public static Persona mayor(Persona p1, Persona p2) {
		if(p1 != null && p2 != null) {			
			return p1.getEdad() > p2.getEdad() ? p1 : p2;
		}
		return null;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return nombre + " tiene " + edad + " años";
	}
}
