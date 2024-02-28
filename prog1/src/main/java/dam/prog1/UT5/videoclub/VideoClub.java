package dam.prog1.UT5.videoclub;

import java.util.ArrayList;
import java.util.Collection;

public class VideoClub {
	
	Collection<Cliente> listaCliente = new ArrayList<>();
	Collection <Pelicula> listaPelicula;
	Collection <Prestamo> listaPrestamo;
	
	public VideoClub(ArrayList<Cliente> listaCliente, ArrayList<Pelicula> listaPelicula,
			ArrayList<Prestamo> listaPrestamo) {
		this.listaCliente = listaCliente;
		this.listaPelicula = listaPelicula;
		this.listaPrestamo = listaPrestamo;
	}

	/*
	 *Lista<String> archivos = new ArrayList<String> ();
	 *
	 * -----> parametro tipo <------
	 * 
	 * ArrayList<Empleado> archivos = new ArrayList<Empleado> ();
	 * 
	 * --Programación generica--
	 * 
	 * -Mayor sencillez de codigo
	 * -Reutilizacion de codigo en numerosos escenarios
	 * -Comprobacion de errores en tiempo de compilacion
	 * 
	 * 
	 * 
	 */
	
	
}
