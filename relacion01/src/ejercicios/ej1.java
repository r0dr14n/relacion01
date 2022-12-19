package ejercicios;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		// TODO Programa Java que lea dos números enteros por teclado y los muestre por pantalla
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Introduce un numero: ");
		num1 = teclado.nextInt();
		
		System.out.println("Introduce otro numero: ");
		num2 = teclado.nextInt();
		
		
		System.out.printf("El primer numero es %d, y el segundo numero es %d",num1,num2);
		
		teclado.close();
		
	}

}
