package ejercicios;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		/*Programa Java que lee un número entero por teclado y obtiene y muestra por pantalla 
		el doble y el triple de ese número*/

		int num;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un numero entero");
		num = teclado.nextInt();
		
		System.out.printf("El numero es %d, el doble es %d, y el triple es %d",num,num*2,num*3);
		
		teclado.close();
		
	}

}
