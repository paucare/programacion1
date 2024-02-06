package programacion.dam1.UT5.ejercicio3001;

public class Cliente {
	private String nombre; 
	private String numCuenta;
	private double saldo;
	
	public Cliente(String nombre, String numCuenta, double saldo) {
		this.nombre = nombre;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Generar ToString, HashCode, Equals
	
	@Override 
	public String toString(){
		return "Cliente [Nombre: " + nombre]
		
	}
	
	
}
