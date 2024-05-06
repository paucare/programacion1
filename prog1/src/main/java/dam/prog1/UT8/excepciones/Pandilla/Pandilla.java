package dam.prog1.UT8.excepciones.Pandilla;

import java.util.ArrayList;

public class Pandilla {
	
	private int capacidad;
	private ArrayList<Amigo> listaDeAmigos; 
	
	public Pandilla(int capacidad) {
		this.capacidad = capacidad;
		this.listaDeAmigos = new ArrayList<>();
	}
	
	public int size() {
		return listaDeAmigos.size();
	}

	public void addAmigo(Amigo a) throws PandillaCompletaException, NoMeGustaTuNombreException {
	 
	  if(listaDeAmigos.size() == capacidad) {
		  
		  throw new PandillaCompletaException();
		  
	  }else if( a.getNombre().charAt(a.getNombre().length()-1) == 's') {
		  
		  throw new NoMeGustaTuNombreException();
	  
	  }
	  else {
		  listaDeAmigos.add(a);
		  System.out.println("Amigo añadido: " + a.getNombre());
		  
	  }
	}
	

}
