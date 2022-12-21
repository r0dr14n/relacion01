package ejercicios3;

import java.util.Scanner;

public class ej17 {

	public static void main(String[] args) {
		/*Implementar el ejercicio 7 de la práctica 2, introduciendo un esquema do-while, de 
	forma que el usuario decida cuando quiere salir del programa*/
		
		Scanner teclado = new Scanner (System.in);
		
		int cerrar=1;
		
		do {
			
			System.out.println("Inserta el primer número");
			double num1 = teclado.nextDouble();
			
			System.out.println("Inserta el segundo número");
			double num2 = teclado.nextDouble();
			
			
			System.out.println("1: Suma");
			System.out.println("2: Resta");
			System.out.println("3: Multiplicación");
			System.out.println("4: División");
			System.out.println("5: Raíz");
			System.out.println("Selecciona una operación a realizar");
			int oper = teclado.nextInt();
			
			if (oper==1)
			{
				System.out.printf("%.2f + %.2f = %.2f",num1,num2,num1+num2);
			}
			else if (oper==2)
			{
				System.out.printf("%.2f + %.2f = %.2f",num1,num2,num1-num2);
			}
			else if (oper==3)
			{
				System.out.printf("%.2f + %.2f = %.2f",num1,num2,num1*num2);
			}
			else if (oper==4)
			{
				System.out.printf("%.2f + %.2f = %.2f",num1,num2,num1/num2);
			}
			else if (oper==5)
			{
				System.out.printf("%.2f + %.2f = %.2f",num1,num2,Math.pow(num1,num2));
			}
			
			teclado.nextLine();
				
			System.out.println("\nSi no desea seguir operando escriba '0'\nEn caso contrario introduzca cualquier otro número");
			cerrar = teclado.nextInt();
			
		} while (cerrar!=0);
		
		System.out.println("Se cerro el programa");
		
		
		
		
		/*
		switch (oper) // %.2f
		{
			case "suma":
				System.out.printf("El resultado es %.2f",num1+num2);
				break;
			
			case "resta":
				System.out.printf("El resultado es %.2f",num1-num2);
				break;
			
			case "multiplicacion":
				System.out.printf("El resultado es %.2f",num1*num2);
				break;
			
			case "division":
				System.out.printf("El resultado es %.2f",num1/num2);
				break;
			
			case "raiz":
				num1 = Math.sqrt(num1);
				System.out.printf("El resultado es %.2f",Math.pow(num1, num2));
				break;
			
			default:
				System.out.println("Opción incorrecta");
		}
		*/
		
		
				
		teclado.close();
		
		
		
		
		
		
		
	}

}
