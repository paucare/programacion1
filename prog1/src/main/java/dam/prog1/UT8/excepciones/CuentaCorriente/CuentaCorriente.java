package dam.prog1.UT8.excepciones.CuentaCorriente;

public class CuentaCorriente {

	private String propietario;
	private double saldo;
	
	public CuentaCorriente(String propietario, double saldo) {
		this.propietario = propietario;
		this.saldo = saldo;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresarDinero(double cantidad){
		this.saldo+=cantidad;
	}
	
	public void restarDinero(double cantidad) throws SaldoNegativoException {
		this.saldo-=cantidad;
		if(saldo<0) {
			throw new SaldoNegativoException(saldo);
		}
	}
}
