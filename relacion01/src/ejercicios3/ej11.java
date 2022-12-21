package ejercicios3;

import java.util.Iterator;

public class ej11 {

	public static void main(String[] args) {
		/*Algoritmo que escriba las tablas de multiplicar del 1 al 10 usando esquemas while*/
		
		
		int num=1, mul=1, contador=0;
		
		while (contador<100) 
		{
			int res = num * mul;
			
			contador++;
			
			System.out.println(num+" x "+mul+" = "+res);
			
			mul++;
			
			if (mul>10)
			{
				mul=1;
				num++;
			}
		}
		
	}

}
