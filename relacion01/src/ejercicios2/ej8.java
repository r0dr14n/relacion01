package ejercicios2;

import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		/*Escribir un programa que implemente una pequeña calculadora con switch-case. El
	programa pedirá al usuario los operandos (a y b) y la operación a realizar: suma, resta,
	multiplicación, división, raíz cuadrada del primer número y elevar el primer número al
	segundo. En función de la opción seleccionada se realizará una de las operaciones
	aritméticas.*/

		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("Introduce el primer número");
		double num1 = teclado.nextDouble();
		
		System.out.println("Introduce el segundo número");
		double num2 = teclado.nextDouble();
		
		teclado.nextLine();
		
		System.out.println("Introduce la operacion a realizar");
		String oper = teclado.nextLine();		
		
		
		switch (oper)
		{
			case "suma":
				System.out.printf("El resultado es %f",num1+num2);
			break;
			
			case "resta":
				System.out.printf("El resultado es %f",num1-num2);
			break;
			
			case "multiplicacion":
				System.out.printf("El resultado es %f",num1*num2);
			break;
			
			case "division":
				System.out.printf("El resultado es %f",num1/num2);
			break;
			
			case "raiz":
				num1 = Math.sqrt(num1);
				
				System.out.printf("El resultado es %f",Math.pow(num1, num2));
		}
				
		teclado.close();
		
	}

}
