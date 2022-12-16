package ejercicios;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		/*Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud 
		de la hipotenusa según el teorema de Pitágoras*/ 
		//suma de catetos al cuadrado
		
		Scanner teclado = new Scanner (System.in);
		
		double cat1, cat2;
		
		System.out.println("Introduce la longitud del cateto 1");
		cat1 = teclado.nextDouble();
		
		System.out.println("Introduce la longitud del cateto 2");
		cat2 = teclado.nextDouble();
		
		double triangulo = (cat1+cat2)*(cat1+cat2);
		
		System.out.println("La longitud de la hipotenusa es "+triangulo);
		
		teclado.close();
	}

}
