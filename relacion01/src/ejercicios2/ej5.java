package ejercicios2;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		/*Dadas dos casillas de un tablero de ajedrez por la fila y columna que ocupan, comprobar
		si están en la misma fila, columna, o en la misma diagonal. */

			
			Scanner teclado = new Scanner (System.in);
			
			System.out.println("Introduce la fila de la primera pieza");
			int fila1 = teclado.nextInt();
			
			System.out.println("Introduce la columna de la primera pieza");
			int columna1 = teclado.nextInt();
			
			System.out.println("Introduce la fila de la segunda pieza");
			int fila2 = teclado.nextInt();
			
			System.out.println("Introduce la columna de la segunda pieza");
			int columna2 = teclado.nextInt();
			
			
			if (fila1==fila2&&columna1==columna2)
			{
				System.out.println("Se encuentran en la misma casilla");
			}
			else if (fila1!=fila2&&columna1==columna2)
			{
				System.out.println("Se encuentran en la misma columna");
			}
			else if (fila1==fila2&&columna1!=columna2)
			{
				System.out.println("Se encuentran en la misma fila");
			}
			else
			{
				System.out.println("No se encuentran ni en la misma fila ni en la misma columna");
			}
			
			teclado.close();
	}

}
