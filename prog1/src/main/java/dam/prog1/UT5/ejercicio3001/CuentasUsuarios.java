package programacion.dam1.UT5.ejercicio3001;
import java.util.*;

public class CuentasUsuarios {

	public static void main(String[] args) {
		
		//Crear clase que construya clientes; Instanciar clientes
		//Crear una coleccion para esos objetos Clientes;
			//No tiene sentido repetir clientes 
			//Vamos a hacer muchas operaciones de agrear y/o borrar? Operaciones
			//de lectura? tiene que estar ordenados?
		//Agregar objetos a esa coleccion;
		//Recorrer la coleccion
		
		Cliente cl1 = new Cliente ("Enrique Iglesias","0001",2000000.00);
		Cliente cl2 = new Cliente ("Rafael Nadal","0002",20000200.00);
		Cliente cl3 = new Cliente ("Carmen Lomana","0003",3000000.00);
		Cliente cl4 = new Cliente ("David Bisbal","0004",10000000.00);
		
		Set <Cliente> clientesbanco = new HashSet<>();
		
		clientesbanco.add(cl1);
		clientesbanco.add(cl2);
		clientesbanco.add(cl3);
		clientesbanco.add(cl4);
		
		//No necesitamos la posición podemos usar un for each para 
		// recorrer la coleccion
		
		System.out.println(clientesbanco.toString());
		
		//for each
		for (Cliente cliente : clientesbanco) {
			System.out.println(cliente.getNombre() + " " + cliente.getNumCuenta())
			;
		}
	}

}
