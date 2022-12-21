package ejercicios3;

import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		/*Algoritmo que pida 10 números por teclado, después de pedirlos deberá indicar 
	cuanto eran positivos, cuantos eran negativos y cuantos eran cero*/
		
		
		//CON BUCLE WHILE
		
		Scanner teclado = new Scanner (System.in);
		
		
		int i=1;
		int cont=0;
		
		while (i==1)
		{
			System.out.println("Introduce un número entero");
			int num = teclado.nextInt();
			
			if (num==0)
			{
				System.err.println(num+" es cero");
			}
			else if (num<0)
			{
				System.out.println(num+" es negativo");
			}
			else if (num>0)
			{
				System.out.println(num+" es positivo");
			}
			
			cont++;
			
			if (cont>=10)
			{
				i=0;
			}
		}
		
		System.out.println("Operación completada");
			
		
		
		
		
		/*
		 * CON CONDICIONALES
		 * 
		System.out.println("Introduce un número (1/10)");
		int num1 = teclado.nextInt();
		
		System.out.println("Introduce un número (2/10)");
		int num2 = teclado.nextInt();
		
		System.out.println("Introduce un número (3/10)");
		int num3 = teclado.nextInt();
		
		System.out.println("Introduce un número (4/10)");
		int num4 = teclado.nextInt();
		
		System.out.println("Introduce un número (5/10)");
		int num5 = teclado.nextInt();
		
		System.out.println("Introduce un número (6/10)");
		int num6 = teclado.nextInt();
		
		System.out.println("Introduce un número (7/10)");
		int num7 = teclado.nextInt();
		
		System.out.println("Introduce un número (8/10)");
		int num8 = teclado.nextInt();
		
		System.out.println("Introduce un número (9/10)");
		int num9 = teclado.nextInt();
		
		System.out.println("Introduce un número (10/10)");
		int num10 = teclado.nextInt();
		
		
		
		if (num1>0)
			System.out.println(num1+" es positivo");
		else if (num1==0)
			System.out.println(num1+" es cero");
		else
			System.out.println(num1+" es negativo");
		
		if (num2>0)
			System.out.println(num2+" es positivo");
		else if (num2==0)
			System.out.println(num2+" es cero");
		else
			System.out.println(num2+" es negativo");
		
		if (num3>0)
			System.out.println(num3+" es positivo");
		else if (num3==0)
			System.out.println(num3+" es cero");
		else
			System.out.println(num3+" es negativo");
		
		if (num4>0)
			System.out.println(num4+" es positivo");
		else if (num4==0)
			System.out.println(num4+" es cero");
		else
			System.out.println(num4+" es negativo");
		
		if (num5>0)
			System.out.println(num5+" es positivo");
		else if (num5==0)
			System.out.println(num5+" es cero");
		else
			System.out.println(num5+" es negativo");
		
		if (num6>0)
			System.out.println(num6+" es positivo");
		else if (num6==0)
			System.out.println(num6+" es cero");
		else
			System.out.println(num6+" es negativo");
		
		if (num7>0)
			System.out.println(num7+" es positivo");
		else if (num7==0)
			System.out.println(num7+" es cero");
		else
			System.out.println(num7+" es negativo");
		
		if (num8>0)
			System.out.println(num8+" es positivo");
		else if (num8==0)
			System.out.println(num8+" es cero");
		else
			System.out.println(num8+" es negativo");
		
		if (num9>0)
			System.out.println(num9+" es positivo");
		else if (num9==0)
			System.out.println(num9+" es cero");
		else
			System.out.println(num9+" es negativo");
		
		if (num10>0)
			System.out.println(num10+" es positivo");
		else if (num10==0)
			System.out.println(num10+" es cero");
		else
			System.out.println(num10+" es negativo");
		*/
			
	}

}
