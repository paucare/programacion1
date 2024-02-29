package dam.prog1.UT5.videoclub;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class VideoClubconHash {
	
	private Set<Cliente> listaCliente;
	private Set<Pelicula> listaPelicula;
	private Set<Prestamo> listaPrestamos;
	
	
	
	public VideoClubconHash() {
		this.listaCliente = new HashSet<>();
		this.listaPelicula = new HashSet<>();
		this.listaPrestamos = new HashSet<>();
	}
	
	public boolean addCliente(Cliente cli) {
		return listaCliente.add(cli);
	}
	
	public boolean addPeliculas(Pelicula p) {
		return listaPelicula.add(p);
	}
	
	public boolean addPrestamo( Prestamo pres) {
		return listaPrestamos.add(pres);
	}
	
	
}
