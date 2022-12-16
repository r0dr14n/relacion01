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
		
		
		double num1 = (double) Math.floor(fnum/1000); //1
		double num2 = (double) Math.floor(fnum/100); //19
		double num3 = (double) Math.floor(fnum/10); //199
		double num4 = (double) Math.floor(fnum/1); //1998
		
		
		
		double nump1 = num1*1000-(num2*100);
		nump1 = Math.floor(nump1/1000);

		double nump2 = num2*100-(num3*10);
		nump2 = nump2/10;
		
		double nump3 = num3*10-(num4*1);
		
		int fnum1 = (int) num1;
		int fnum2 = (int) nump1;
		int fnum3 = (int) nump2;
		int fnum4 = (int) nump3;
		int fnum5 = (int) dnum;
		int fnum6 = (int) mnum;
		
		double numsuerte1 =(fnum1+fnum2)+(fnum3+fnum4)+(fnum5+fnum6); //26
		
		if (numsuerte1>10)
		{
			double nums1 = Math.floor(numsuerte1/10); //2.0
			double nums2 = (nums1*10)-numsuerte1; //20-26= 6.0
			
			int numv1 = (int) nums1;
			int numv2 = (int) nums2;
			
			int numsuerte2 =numv1+numv2;
			
			System.out.println("El número de la suerte es "+numsuerte1);
		}
		else if (numsuerte1<=10)
		{
			System.out.println("El número de la suerte es "+numsuerte1);
		}
		
	}

}
