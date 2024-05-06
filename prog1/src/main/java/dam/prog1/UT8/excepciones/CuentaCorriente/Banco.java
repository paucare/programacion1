package dam.prog1.UT8.excepciones.CuentaCorriente;

public class Banco {

	public static void main(String[] args) {
		
		CuentaCorriente cc = new CuentaCorriente("Manolo",100.00);
		
		try {
		cc.restarDinero(10);
		System.out.println("Saldo actual: " + cc.getSaldo());
		cc.restarDinero(200);
		
		} catch(SaldoNegativoException e) {
			System.err.println(e.getMessage());
			System.err.println("Error 133. - Pongase en contacto con el banco");
		}

	}

}
