package ejercicios2;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		/*Algoritmo que pida los parámetros (a, b y c de tipo double) de dos rectas, 
		correspondientes a su ecuación implícita (ax + by + c = 0), e indique si son coincidentes, 
		paralelas o secantes. En el caso de que sean secantes, hay que indicar si son 
		perpendiculares o no*/
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce el parámetro A");
		double pa = teclado.nextDouble();
		
		System.out.println("Introduce el parámetro B");
		double pb = teclado.nextDouble();
		
		System.out.println("Introduce el parámetro C");
		double pc = teclado.nextDouble();
		
		
		if (pa/pa!=pb/pb)
		{
			System.out.println("Son secantes");
			
			if (pa/pb!=-pb/pa)
			{
				System.out.println("y perpendiculares");
			}
		}
		else if (pa/pa==pb/pb)
		{
				System.out.println("Son paralelas");
			
			if (pa/pa==pb/pb&&pb/pb==pc/pc)
			{
				System.out.println("y coincidentes");
			}
		}
		
		
		teclado.close();
		
	}

}
