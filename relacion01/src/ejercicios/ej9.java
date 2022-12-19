package ejercicios;

import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		/*Programa que calcula el área de un triángulo a partir de la longitud de sus lados*/
		
		Scanner teclado = new Scanner (System.in);

		System.out.println("Introduce la longitud del lado 1");
		double l1 = teclado.nextDouble();
		
		System.out.println("Introduce la longitud del lado 2");
		double l2 = teclado.nextDouble();
		
		System.out.println("Introduce la longitud del lado 3");
		double l3 = teclado.nextDouble();
		
		double area = ((l1+l2+l3)/2*((l1+l2+l3)/2-l1)*((l1+l2+l3)/2-l2)*((l1+l2+l3)/2-l3));

		area= Math.sqrt(area);
		
		System.out.println("El área del triangulo es "+area);
		
		teclado.close();
		
	}

}
