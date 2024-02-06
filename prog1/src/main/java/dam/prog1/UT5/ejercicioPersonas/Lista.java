package dam.prog1.UT5.ejercicioPersonas;

public interface Lista {
		
	/**
	 * Comprueba si la lista está o no vacía
	 * @return true si la lista está vacía.
	 */
	public boolean isEmpty();
	
	/**
	 * Devuelve la información del primer elemento
	 * @return la info del primer elemento o Integer.MIN_VALUE si no lo encuentra.
	 */
	public Persona getFirst();
	
	/**
	 * Obtiene el último elemento de la lista
	 * @return la información del último elemento de la lista o Integer.MIN_VALUE si no lo encuentra.
	 */
	public Persona getLast();
	
	/**
	 * Inserta al inicio de la lista
	 * @param info información para almacenar
	 */
	public void insertAtBegin(Persona info);
	
	/**
	 * Inserta al final de la lista
	 * @param info información para almacenar
	 */
	public void insertAtEnd(Persona info);
	

	/**
	 * Inserta en una posición determinada de la lista
	 * @param info información para almacenar
	 * @param index posición de la lista donde se va a insertar
	 */
	public void insertAtPosition(Persona info, int index);
	
	/**
	 * Comprueba que un elemento exista dentro de la lista
	 * @param info información a buscar
	 * @return true si el elemento existe en la lista
	 */
	public boolean containsInfo(Persona info);
	
	
	/**
	 * Obtiene información de un elemento dada una posición en la lista
	 * @param index posición en la lista
	 * @return el contenido del nodo en esa posición o null en caso de que no exista
	 */
	public Persona getElementAt(int index);
	
	/**
	 * Elimina el nodo que contenga el valor indicado
	 * @param info información del nodo a borrar
	 * @return true si se ha eliminado correctamente
	 */
	public boolean removeByInfo(Persona info);
	
	/**
	 * Elimina el nodo en la posición indicada
	 * @param index posición del nodo a borrar
	 * @return la persona en caso de que sea posible o null en caso de no serlo.
	 */
	public Persona removeAt(int index);
	
	/**
	 * Imprime la información de la lista
	 */
	public void print();

	
	/**
	 * Vacía la lista
	 * @return true si se ha podido vaciar correctamente
	 */
	public boolean clearList();
	
	/**
	 * Obtiene el número de elementos de la lista
	 * @return número de elementos de lista
	 */
	public int size();
	

}
