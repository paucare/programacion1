package dam.prog1.UT5.videoclub;

import java.util.ArrayList;
import java.util.Collection;

public class VideoClub {
	
	private Collection<Cliente> listaCliente;
	private ArrayList <Pelicula> listaPelicula;
	private Collection <Prestamo> listaPrestamo;
	
	public VideoClub() {
		this.listaCliente = listaCliente = new ArrayList<>();;
		this.listaPelicula = listaPelicula = new ArrayList<>();;
		this.listaPrestamo = listaPrestamo = new ArrayList<>();;
	}
	
	public boolean addCliente2(Cliente cli) {
		boolean dentroLista=false;
		for(Cliente item : listaCliente) {
			if(item.getNumerocarnet().equals(cli.getNumerocarnet())){
				dentroLista = true;
				break;
			}
			if(!dentroLista) {
				listaCliente.add(cli);
			}
		}
	}
	
	public Pelicula buscarPelicula(String cod) {
		Pelicula peli = null;
		
		for(int i=0;i<listaPelicula.size();i++) {
			if(listaPelicula.get(i).getCodigo().equals(cod)){
				peli=listaPelicula.get(i);
				break
			}
				return peli; 
			}
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
