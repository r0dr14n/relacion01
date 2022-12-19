package ejercicios2;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		/*Algoritmo que pida los parámetros (a, b y c de tipo double) de dos rectas, 
		correspondientes a su ecuación implícita (ax + by + c = 0), e indique si son coincidentes, 
		paralelas o secantes. En el caso de que sean secantes, hay que indicar si son 
		perpendiculares o no*/
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce el primer parámetro A");
		double pa1 = teclado.nextDouble();
		
		System.out.println("Introduce el segundo parámetro A");
		double pa2 = teclado.nextDouble();
		
		System.out.println("Introduce el primer parámetro B");
		double pb1 = teclado.nextDouble();
		
		System.out.println("Introduce el segundo parámetro B");
		double pb2 = teclado.nextDouble();
		
		System.out.println("Introduce el primer parámetro C");
		double pc1 = teclado.nextDouble();
		
		System.out.println("Introduce el segundo parámetro C");
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
