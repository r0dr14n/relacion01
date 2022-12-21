package ejercicios3;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		/*Algoritmo que cuente cuántos múltiplos de 7 hay entre dos enteros dados por el 
	usuario*/
		
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número entero (1/2)");
		int num1 = teclado.nextInt();
			
		System.out.println("Introduce un número entero (2/2)");
		int num2 = teclado.nextInt();
		
		/*int menor= num1, mayor = num2;
		if (num2<num1) {
			menor=num2;
			mayor=num1;
		}
		while (menor<mayor) {
			if (menor%7==0) {
				System.out.println(menor);
			}
			menor++;
		}*/
		
		while(num1<num2)
		{
			if (num1%7==0)
			{
			System.out.println(num1);
			}
			num1++;
		}
		
		while(num2<num1)
		{
			if (num2%7==0)
			{
			System.out.println(num2);
			}
			num2++;
		}
	
		System.out.println("Operación terminada");
		
		
		teclado.close();
		
	}

}
