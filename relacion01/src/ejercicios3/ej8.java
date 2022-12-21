package ejercicios3;

import java.util.Random;
import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		/*Programa que pide un número del 1 al 10 hasta que el usuario acierte el número 
	definido en el programa*/
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número del 1 al 10");
		int num = teclado.nextInt();
		
		Random random = new Random ();
		int r = random.nextInt(10)+1; 
		
		
		if (r == num)
		{
			System.out.println("Acertaste, el número es "+r+" y tu número es "+num);
		}
		
		while (num!=r)
		{
			if (num<1 && num>10)
			{
				System.out.println("El número debe estar comprendido del 1 al 10");
			}
			else if (r == num)
			{
				System.out.println("Acertaste, el número es "+r+" y tu número es "+num);
			}
			else if (r != num)
			{
				System.out.println("Incorrecto, prueba a introducir otro número");
				num = teclado.nextInt();
			}
		}
	
		System.out.println("Acertaste, el número es "+r+" y tu número es "+num);
		
	}

}
