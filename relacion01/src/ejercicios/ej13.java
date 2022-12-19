package ejercicios;

import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {
		/*Programa que calcula el número de la suerte de una persona a partir de su fecha de 
		nacimiento.*/
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce el dia de tu fecha de nacimiento para conocer tu numero de la suerte");
		int dnum = teclado.nextInt();
		
		System.out.println("Introduce el mes de tu fecha de nacimiento para conocer tu numero de la suerte");
		int mnum = teclado.nextInt();
		
		System.out.println("Introduce el año de tu fecha de nacimiento para conocer tu numero de la suerte");
		int fnum = teclado.nextInt();
		
		int numero=dnum+mnum+fnum;
		
		double num1 = (double) Math.floor(numero/1000);
		double num2 = (double) Math.floor(numero/100);
		double num3 = (double) Math.floor(numero/10);
		double num4 = (double) Math.floor(numero/1);
		
		
		double nump1 = (num2*100)-num1*1000;
		nump1 = nump1/100;

		double nump2 = (num3*10)-num2*100;
		nump2 = nump2/10;
		
		double nump3 = (num4*1)-num3*10;
		
		int fnum1 = (int) num1;
		int fnum2 = (int) nump1;
		int fnum3 = (int) nump2;
		int fnum4 = (int) nump3;
		
		double numsuerte1 =fnum1+fnum2+fnum3+fnum4;
		
		
		System.out.println("El número de la suerte es "+numsuerte1);
			
		teclado.close();
		
	}

}
