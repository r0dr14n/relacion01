package ejercicios2;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		/*Algoritmo que pida tres números distintos de tipo float e indique cual es el que ocupa la
		posición central si los tres se ordenasen*/

			Scanner teclado = new Scanner (System.in);
			
			System.out.println("Introduce el primer número");
			float num1 = teclado.nextFloat(); // 10
			
			System.out.println("Introduce el segundo número");
			float num2 = teclado.nextFloat(); // 8
			
			System.out.println("Introduce el tercer número");
			float num3 = teclado.nextFloat(); // 6
			
			
			if (num1>num2&&num2>num3)
			{
				System.out.println(num2+" es el central ");
			}
			else if (num2<num1&&num1<num3)
			{
				System.out.println(num1+" es el central");
			}
			else if (num1>num3&&num3>num2)
			{
				System.out.println(num3+" es el central");
			}
			else if (num1<num2&&num2<num3)
			{
				System.out.println(num2+" es el central ");
			}
			else if (num2>num1&&num1>num3)
			{
				System.out.println(num1+" es el central");
			}
			else if (num1<num3&&num3<num2)
			{
				System.out.println(num3+" es el central");
			}
			else
			{
				System.out.println(num1+" "+num2+" "+num3+" son iguales");
			}
			teclado.close();
			
	}

}
