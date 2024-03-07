package dam.prog1.UT5.ejerciciosClase;

import java.util.HashSet;
import java.util.Scanner;

public class EjercicioHashSet {

	public static void main(String[] args) {
	HashSet<Integer> conjunto = new HashSet <>();
	int n;
	Scanner sc = new Scanner(System.in);
	
	//Para que tenga 5 elementos 
	
	do{
		System.out.println("Dame el valor" + conjunto.size()+1 + ":");
		n=sc.nextInt();
		if(!conjunto.add(n))
			System.out.println("Este valor ya existe");
	}while(conjunto.size()<5);
	
	//Calculo la suma 
	
	Integer suma= Integer.valueOf(0);
	
	for(Integer i : conjunto) {
		suma+=1;
	}
	System.out.println("La suma de todos ellos es :" + suma);
		sc.close();
	}

}
