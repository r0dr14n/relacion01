package ejercicios;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		/*Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado*/

		Scanner teclado = new Scanner (System.in);
		
		double vel;
		
		System.out.println("Introduce la velocidad en Km/h");
		vel = teclado.nextDouble();
		
		double met = vel*0.2778;
		
		System.out.println("La velocidad en metros por segundo es "+met);
		
		teclado.close();
	}

}
