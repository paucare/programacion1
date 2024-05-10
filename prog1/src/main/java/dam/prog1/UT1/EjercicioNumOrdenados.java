package Alessandro.Alonso.Dam.tema1;

import java.util.Scanner;

public class EjercicioNumOrdenados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1=0, num2=0, num3=0;
		
		for(int i=1; i <= 3; i ++) {
		
		System.out.println("Dame el numero" + i + ": ");
		int input = sc.nextInt();
			if(i == 1){
				num1= input;
				
			}else if(i == 2){
				num2=input;
		
			}else{
				num3=input;
				}	
		}

		if (num1 < num2 && num2 < num3) {

		System.out.println("Estan ordenados de forma ascendente");

		}

		else if (num1 > num2 && num2 > num3) {

		System.out.println("Estan ordenados de forma descendente");

		}

		else if (num1 == num2 && num2 == num3){

		System.out.println("Son iguales");

		}
		
	sc.close();
			
	}
}