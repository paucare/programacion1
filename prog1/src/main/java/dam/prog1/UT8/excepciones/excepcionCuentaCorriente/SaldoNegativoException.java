package dam.prog1.UT8.excepciones.excepcionCuentaCorriente;

public class SaldoNegativoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaldoNegativoException(double saldo) {
		super("La cuenta se ha quedado en numeros rojos (" + Double.toString(saldo)+")");
	}
	
	
	

}
