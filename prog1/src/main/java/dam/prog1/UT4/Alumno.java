package dam1.tema4;
public class Alumno {
		
		private String nombre;
		private	int edad;
		
		//constructor
		public Alumno(String nombre, int edad) {
			this.nombre = nombre;
			this.edad = edad;
		}
	 
		//getter y setters
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
		
		
	}
