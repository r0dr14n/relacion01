package ejercicios;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		/* Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La 
		fórmula correspondiente es: F = 32 + ( 9 * C / 5)*/

		double temp, res;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce una temperatura en Grados centígrados");
		temp = teclado.nextDouble();
		
		res=32+(9*temp/5);
		
		System.out.println("La temperatura en Fahrenheit es "+res);
	
		teclado.close();
	}

}
