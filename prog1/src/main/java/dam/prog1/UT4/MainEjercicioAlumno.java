package dam.prog1.UT4;

public class MainEjercicioAlumno {
	public static void main(String[]args) {
		
	AlumnoController gestor = new AlumnoController();
	
	//gestor.printAlumnos();
	
	Alumno a1= new Alumno("Alejandra", 23);
	Alumno a2= new Alumno("Luis Eduardo",32);
	
	gestor.addAlumnos(a1);
	gestor.addAlumnos(a2);
	gestor.printAlumnos();
	}
}
