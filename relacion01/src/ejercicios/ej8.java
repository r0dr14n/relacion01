package ejercicios;

import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		/*Programa que calcula el volumen de una esfera*/
		// 3/4*PI*radio^3;
		
		Scanner teclado = new Scanner (System.in);
		
		double radio;
		
		System.out.println("Introduce radio");
		radio = teclado.nextDouble();
		
		double cubo = Math.pow(radio, 3);
		
		double volumen = 3/4*(3.14*cubo);
		
		System.out.println("El volumen es "+volumen);
		
		teclado.close();
		
	}

}
