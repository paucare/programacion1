package dam.prog1.UT3.nuevoPaquete;

public class Personas {
	
	private String name;
	private int age;
	
	public Personas(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public static Personas olderPerson(Personas p1, Personas p2){
		if(p1.age >= p2.age) {
			return p1;
		}
		else {
			return p2;
		}
		
	}
	
}

	// per1.mayorEdad(--- //Se puede invocar el metodo estatico desde un objeto.
	// Persona1.mayorEdad(---)//Se puede invocar el metodo estatico desde el nombre de la clase.



