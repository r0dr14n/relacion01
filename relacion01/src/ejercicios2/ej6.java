package ejercicios2;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		/*Algoritmo que pida los parámetros (a, b y c de tipo double) de dos rectas, 
		correspondientes a su ecuación implícita (ax + by + c = 0), e indique si son coincidentes, 
		paralelas o secantes. En el caso de que sean secantes, hay que indicar si son 
		perpendiculares o no*/
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce la recta 1:");
		System.out.println("A1 ");
		double pa1 = teclado.nextDouble();
		System.out.println("B1 ");
		double pb1 = teclado.nextDouble();
		System.out.println("C1 ");
		double pc1 = teclado.nextDouble();
		
		System.out.println("Introduce la recta 2:");
		System.out.println("A2 ");
		double pa2 = teclado.nextDouble();
		System.out.println("B2 ");
		double pb2 = teclado.nextDouble();
		System.out.println("C2 ");
		double pc2 = teclado.nextDouble();
		
		
		if (pa1/pa2!=pb1/pb2)
		{
			System.out.println("Son secantes");
			
			if (pa1/pb1!=-pb2/pa2)
			{
				System.out.println("y perpendiculares");
			}
		}
		else if (pa1/pa2==pb1/pb2)
		{
				System.out.println("Son paralelas");
			
			if (pa1/pa2==pb1/pb2&&pb1/pb2==pc1/pc2)
			{
				System.out.println("y coincidentes");
			}
		}
		
		teclado.close();
		
	}

}
