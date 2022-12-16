package ejercicios;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		/* Programa que lee por teclado el valor del radio de una circunferencia y calcula y 
		muestra por pantalla la longitud y el área de la circunferencia. Longitud de la 
		circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2*/

		double radio;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce el radio");
		radio = teclado.nextFloat();
		
		double longitud = 2*3.14*radio;
		double area = (3.14*(radio*radio));
				
		System.out.printf("La longitud de la circunferencia es "+longitud+" y el área es "+area);
		
		teclado.close();
	}

}
