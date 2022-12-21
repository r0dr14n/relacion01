package ejercicios3;

public class ej12 {

	public static void main(String[] args) {
		/*/Algoritmo que escriba las tablas de multiplicar del 1 al 10 usando esquemas do while*/
		
		
		int num=1, mul=1, contador=0;
		
		do {
			int res = num * mul;
			
			contador++;
			
			System.out.println(num+" x "+mul+" = "+res);
			
			mul++;
			
			if (mul>10)
			{
				mul=1;
				num++;
			}
		} while (contador<100);
		
		
		
		
		
		
	}

}
