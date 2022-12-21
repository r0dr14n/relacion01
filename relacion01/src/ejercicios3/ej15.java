package ejercicios3;

import java.util.Scanner;

public class ej15 {

	public static void main(String[] args) {
		/*Algoritmo que pida un número natural y determine si es primo o no*/
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número");
		int num = teclado.nextInt();
		
		
		if (num%num==0 && num%1==0 && num%2!=0)
		{
			System.out.println("Es un número primo");
		}
		else
		{
			System.out.println("No es un número primo");
		}
		
	}

}
