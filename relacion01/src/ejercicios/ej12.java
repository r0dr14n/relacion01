package ejercicios;

import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		/*. Programa que lea un número entero INT de 5 cifras y muestre sus cifras desde el 
	principio como en el ejemplo*/

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número entero de 5 cifras");
		int num = teclado.nextInt();
		
		
		double num1 = (double) Math.floor(num/10000);
		double num2 = (double) Math.floor(num/1000);
		double num3 = (double) Math.floor(num/100);
		double num4 = (double) Math.floor(num/10);
		double num5 = (double) Math.floor(num/1);
		
		int nump1 = (int) num1;
		int nump2 = (int) num2;
		int nump3 = (int) num3;
		int nump4 = (int) num4;
		int nump5 = (int) num5;
		
		System.out.printf("El resultado sería "+nump1+" "+nump2+" "+nump3+" "+nump4+" "+nump5);
		
		teclado.close();
	}

}
