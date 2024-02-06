package dam1.tema2;

	public class Personas {
		// nombre, edad , estatura

		private String nombre;
		private byte edad;
		private double altura;

	// Constructor
	public Personas (String nombre, byte edad, double altura) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		// this.atributo = parametro;
	}
// Esto estaria dentro del main
	Personas p1 = new Personas(Alejandra, 18, 1.65);
	Personas p2= new Personas(Joaquin, 19, 1.78);

	// Sobreescribir un constructor
	public Personas (String nombre) {
		
		this.nombre = nombre;
		edad=18;
		altura=1.5;
		//De esta manera edad y altura tienen este valor por defecto
	}

	Personas p3 = new Persona(Clara); // se llama al segundo constructor
	Personas p23 = new Personas(Paul, 35, 1.79); // se llama al primer constructor
	// Se pueden llamar a varios constructores

	//GETTER & SETTER
	
	String getNombre() {
		return nombre;
	}
	
	setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	p2.setNombre(Emilio);	// Le cambiamos el nombre a p2
	p2.getNombre(p23.getNombre) // Le das valores de p23 sin saber nada de p23
	
}
