package ejercicios;

import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		/*Programa que lee un número de 3 cifras y muestra sus cifras por separado*/
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número de 3 cifras");
		int num = teclado.nextInt();
		
		
		double num1 = (double) Math.floor(num/100);
		
		double nump1 = num1*100;
		double nump2 = (double) Math.floor(num/10);
		
		double num2 = (double) Math.floor((num-nump1)/10);
		double num3 = (double) num-(nump2*10);
		
		int p_num1 = (int) num1;
		int p_num2 = (int) num2;
		int p_num3 = (int) num3;
		
		
		System.out.printf("Los números separados serían "+p_num1+" "+p_num2+" "+p_num3);
		
		teclado.close();
	}

}
