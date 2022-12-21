package ejercicios3;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		/*Algoritmo que imprima la tabla de multiplicar correspondiente a un número 
	comprendido entre uno y diez, introducido por el usuario, usando un esquema for*/
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número para mostrar la tabla de multiplicar");
		int num = teclado.nextInt();
		
		if (num>=1&&num<=10)
		{
			for (int contador=1; contador<=10; contador++)
			{
				int res=num*contador;
				System.out.printf("%d x %d = %d\n",num,contador,res);
			}
		}
		else
		{
			System.out.println("El número debe estar entre el 1 y el 10");
		}
		
		teclado.close();
		
	}

}
