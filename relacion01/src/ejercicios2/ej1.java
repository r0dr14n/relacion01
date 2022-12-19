package ejercicios2;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		/*Algoritmo que pida dos enteros y que indique el mayor y el menor, o si ambos son 
		iguales*/
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número entero");
		int num1 = teclado.nextInt();
		
		System.out.println("Introduce otro número entero");
		int num2 = teclado.nextInt();
		
		if (num1>num2)
		{
			System.out.println(num1+" es mayor que "+num2);
		}
		else if (num1<num2) 
		{
			System.out.println(num2+" es menor que "+num1);
		}
		else
		{
			System.out.println(num1+" y "+num2+" son iguales");
		}
		
		teclado.close();
		
	}

}
