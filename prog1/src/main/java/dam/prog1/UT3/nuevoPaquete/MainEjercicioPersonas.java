package dam.prog1.UT3.nuevoPaquete;

public class MainEjercicioPersonas {

	public static void main(String[] args) {
		
		Personas p1 = new Personas("Alessandro",23);
		Personas p2 = new Personas("Elena", 20);
		
		System.out.println("La persona mayor es " + Personas.olderPerson(p1, p2).getName());
		
		//Concatenacion de metodos
		
		//No termino de entender porque aquí los atributos no son estáticos 
	
	}

}
