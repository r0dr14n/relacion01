package ejercicios3;

import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {
		/*Algoritmo que pida el alto y el ancho de un rectángulo (número entero) e imprima 
		un rectángulo de asteriscos*/
		
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Programa que realiza un cuadrado");
		
		System.out.println("Introduce el alto del cuadrado");
		int alto = teclado.nextInt();
		
		System.out.println("Introduce el ancho del cuadrado");
		int ancho = teclado.nextInt();
		
		
		for (int i = 0; i < alto; i++) {
			System.out.println(" ");
			for (int j = 0; j < ancho; j++) {
				System.out.println(" *");	
			}
		}
		
		
	}


}
