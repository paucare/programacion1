package dam.prog1.UT5.examenMarzo;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		Crea una aplicación para gestionar una serie de Registros de Peticiones de Obras
		Urgentes de la Diputación. 
		Cuando un usuario cumplimenta un Registro, al entregarlo el bedel de turno va apilando
		dichos registros en una bandeja que tienen para dicho propósito.
		La información que contendrá cada Registro será: 
	• Descripción de petición y presupuesto obra urgente.
	• Implementa una aplicación que genere de forma aleatoria 10 registros.
	• Procesa 4 de los registros anteriores.
	• Vuelve a generar de forma aleatoria otros 5 registros.
	• Procesa todos los registros de la pila.
	• Muestra como resultado final:
	
	Cuántos registros tienen un presupuesto inferior a 300 euros o 
	a cuánto asciende el presupuesto total de estos registros.
		 */
		
		Pila registros = new Pila();

		//10 registros aleatorios
		
		Pila pila10 = GestionRegistro.generarRegistros(10);
		
		//Llenamos la pila principal
		while(!pila10.isEmpty()) {
			registros.push(pila10.peek());
			pila10.pop();
		}
		
		System.out.println("Generados 10 registros aleatorios");
		
		//Procesar 4 registros
		System.out.println("Procesando 4 registros");
		Pila procesar = new Pila();
		
		for(int i = 0; i < 4;i++) {
			if(!registros.isEmpty()) {
				Registro r = registros.peek();
				procesar.push(r);
				registros.pop();
			}
		}
		
		GestionRegistro.procesarRegistros(procesar);
		
		//5 registros aleatorios
		
		Pila pila5 = GestionRegistro.generarRegistros(5);
		while(!pila5.isEmpty()) {
			registros.push(pila5.peek());
			pila5.pop();
		}
		System.out.println("Generados 5 registros");
		
		
		GestionRegistro.procesarRegistros(registros);
		
	}
}
