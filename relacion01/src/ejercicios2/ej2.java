package ejercicios2;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		/*Algoritmo que pida 3 números e indique cual es el menor de los tres*/
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número entero");
		int num1 = teclado.nextInt();

		System.out.println("Introduce otro número entero");
		int num2 = teclado.nextInt();
		
		System.out.println("Introduce otro número entero");
		int num3 = teclado.nextInt();
		
		
		if (num1>num2&&num2>num3)
		{
			System.out.println(num3+" es el menor ");
		}
		else if (num1<num2&&num2<num3)
		{
			System.out.println(num1+" es el menor");
		}
		else if (num1>num2&&num2<num3)
		{
			System.out.println(num2+" es el menor");
		}
		else if (num1<num2&&num2>num3)
		{
			if (num1>num3)
			{
				System.out.println(num3+" es el menor");
			}
			else
			{
				System.out.println(num1+" es el menor");
			}
			
		}
		else
		{
			System.out.println(num1+" "+num2+" "+num3+" son iguales");
		}
		
		teclado.close();
		
	}

}
