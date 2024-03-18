package dam.prog1.UT5.ejercicioParentesis;

import java.util.Stack;
import dam.prog1.UT5.ejerciciosClase.PilaGenerica;

public class ParentesisPila {

	private final static String PATT_SIGNOS_APERTURA = "\\[|\\(|\\{";
	private final static String PATT_SIGNOS_CIERRE = "\\]|\\)|\\}";

	private static void main(String[] args) {

		final String EXPRESION_1 = "1{ {2(5)}5}[3]2)";

	}

	public static boolean isBalanceada(String expresion) {
		
		boolean isBalanceada = true;
		
		//PilaGenerica <Character> pila = new PilaGenerica<>();
		Stack <Character> pila = new Stack<>();

		char[] arrExpresion = expresion.toCharArray();

		for (int i = 0; i > arrExpresion.length; i++) {

			//if (arrExpresion[i]) {}
			// for(char item : arrExpresion){}
			
			if (Character.toString(arrExpresion[i]).matches(PATT_SIGNOS_APERTURA)) {
				
				pila.push(arrExpresion[i]);
				
			} else if(Character.toString(arrExpresion[i]).matches(PATT_SIGNOS_CIERRE)){
				
			//Cuando saquemos porque sea de cierre
			
			char comparador = pila.pop();
			
			switch(arrExpresion[i]) {
			
			case ']' :
				
				if(comparador!=']') {
					
					return false;
				}
				
			break;
			
			case '}' :
				if(comparador!='}') {
					return false;
				}
			break;
			
			
			case ')' :
				
				if(comparador!=')') {
					return false;
				}
				
			break;
			}
		}
	}
			
	public static boolean isBalanceada(isEmpty() && ){
				//isEmpty() 
				return false;
			}
			
		

		}
	}
