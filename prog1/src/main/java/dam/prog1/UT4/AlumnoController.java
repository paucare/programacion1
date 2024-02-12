package dam.prog1.UT4;

public class AlumnoController {
	
	private final int TAM_ARRAY=30;
	private Alumno[] arrayAlumnos;
	
	//constructor
	public AlumnoController() {
		this.arrayAlumnos = new Alumno [TAM_ARRAY];
	}
	
	public void addAlumnos(Alumno al) {
		int index=0; //es un contador
		while(arrayAlumnos[index]!=null) {
			index++;
		}
		arrayAlumnos[index]=al;
	}
	public void addAlumnos(Alumno al, int index){
		arrayAlumnos[index]=al;
	}
		
	public void printAlumnos() {
		
		//for(int i=0; i<arrayAlumnos.length; i++) {
		for(int i=0; i<TAM_ARRAY; i++) {
			//---
			if(arrayAlumnos[i]!=null){
			System.out.println(arrayAlumnos[i].getNombre()+ " " + arrayAlumnos[i].getEdad());
		} 
		
	}
	}
	
}

