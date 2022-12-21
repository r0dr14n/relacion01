package ejercicios3;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		/*Algoritmo que calcule el factorial de un número entero introducido por el usuario.*/

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número para calcular su factorial");
		int n = teclado.nextInt();
		
				
		
		int factorial = 1;
				
		
		int i=1;
		while(i<=n) {
			factorial *= i;
			i++;
		}
		
		System.out.print(n+"! = "+factorial);
		
		teclado.close();
		
	}

}
