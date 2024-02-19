package dam.prog1.UT3.ejercicio1;

public class Cuentas {
	
	//atributos 
	
	private String titular;
	private double cantidad;

	//constructor
	public Cuentas (String titular, double cantidad) {
		this.titular=titular;
		this.cantidad=cantidad;
	}
	
	//metodos
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular=titular;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad){
		this.cantidad=cantidad;
	}

	//toString para mostrarlo todo como una cadena
	@Override
	public String toString() {
		return "Nombre del titular: " + titular + "Cantidad de la cuenta : " + cantidad;
	}

	public void ingresar(double cantidad) { //para las clases vecinas no hace falta poner public
		if (cantidad > 0) {
		this.cantidad += cantidad; //this.cantidad es la cantidad que tiene ese atributo	
		} 
	}
	
	public void retirar(double cantidad) {
		if(cantidad > this.cantidad) {
			this.cantidad=0;
		}
		else {
			this.cantidad-= cantidad;
		}
	}
	
	
	
	
	

}
