package ejercicios3;

public class ej10 {

	public static void main(String[] args) {
		/*Algoritmo que escriba las tablas de multiplicar del 1 al 10 usando esquemas for.*/
		
		
		int num=1, mul=1;
		
		for (int contador=1; contador<=100; contador++) 
		{
			int res = num * mul;
			
			
			System.out.println(num+" x "+mul+" = "+res);
			
			mul++;
			
			if (mul>10)
			{
				mul=1;
				num++;
			}
		}
		
		/*
		 * DE OTRA FORMA SERÍA:
		 * 
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i+" x "+j+" = "+i*j);
			}
		}
		*/
		
		
	}

}
