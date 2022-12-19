package ejercicios2;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		/*Algoritmo que pida tres números de tipo entero y compruebe si es posible que exista un
		triángulo con esas dimensiones*/
			
			
			Scanner teclado = new Scanner (System.in);

			System.out.println("Introduce la longitud del primer lado");
			int lado1 = teclado.nextInt();
			
			System.out.println("Introduce la longitud del segundo lado");
			int lado2 = teclado.nextInt();
			
			System.out.println("Introduce la longitud del tercer lado");
			int lado3 = teclado.nextInt();
			
			if ((lado1+lado2)>lado3||(lado2+lado3)>lado1||(lado3+lado1)>lado2)
			{
				System.out.println("El triangulo es posible");
			}
			else
			{
				System.out.println("El triangulo no es posible");
			}
			
			teclado.close();
	}

}
