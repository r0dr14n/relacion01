package ejercicios;

import java.util.Scanner;

public class ej15 {

	public static void main(String[] args) {
		/*Programa para pasar de grados centígrados a grados Kelvin*/
		
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce la temperatura en grados centígrados");
		double gcent = teclado.nextDouble();
		
		double gkelvin = gcent*274.15;
		
		System.out.println("La temperatura en grados kelvin es "+gkelvin);
		
		teclado.close();
		
	}

}
