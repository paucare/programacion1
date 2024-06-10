package dam.prog1.UT5.examenMarzo;

import java.util.Random;

public class GestionRegistro {
	
	public static final String[] DESCRIPCIONES = {
			"Reparación de techo", "Cambio de tuberías", "Instalación eléctrica",
	        "Pintura de fachada", "Reparación de ventanas"
	};
	
	private static final Random RAND = new Random();
	
	public static Registro generarRegistroAleatorio() {
		String descripcion = DESCRIPCIONES[RAND.nextInt(DESCRIPCIONES.length)];
		double presupuesto = RAND.nextDouble(1899.00) + 101.00;
		
		return new Registro(descripcion,presupuesto);
	}
	
	public static Pila generarRegistros(int cantidad) {
		
		Pila pila = new Pila();
		for(int i = 0;i < cantidad;i++) {
			pila.push(generarRegistroAleatorio());
		}
		return pila;
	}
	
	public static void procesarRegistros(Pila pila) {
		int contador= 0;
		double total = 0.0;
		
		while(!pila.isEmpty()) {
			Registro r = pila.peek();
			System.out.println("Procesando: " + r.getDescripcion());
			pila.pop();
			
			if(r.getPresupuesto() < 300) {
				contador++;
			}
			
			Math.round(total += r.getPresupuesto());
		}
		
		System.out.println("El numero de registros cuyo presupuestoe es inferior a 300 es: " + contador);
		System.out.println("El presupuesto total asciende a: " + total);
		
	}

}
