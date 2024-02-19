package dam.prog1.UT3.ejercicio1;
import java.util.Scanner;

public class Ejercicio1CuentaBancaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//Se pueden declarar variables de tipo objeto
		
		Cuentas c001 = new Cuentas("Oscar",1000); 
		
		// Cuentas c010 = new Cuentas ("Alicia","Jimenez",589); Constructor 2 con apellidos
		
		// System.out.println(c010.toString());
		
		System.out.println("Cuanto quieres ingresar en la cuenta C0001?");
		
		// Usariamos el set para en vez de "ingresar" seria "tener"
		
		double cantidad= sc.nextDouble();
		
		c001.ingresar(cantidad);
		System.out.println(c001.getCantidad());
		
		// borramos el double 
		//c001.setCantidad(sc.nextdouble());
		
		System.out.println(c001.getTitular());
		
		
		sc.close();
		
		
	}

}
