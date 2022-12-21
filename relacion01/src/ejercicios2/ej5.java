package ejercicios2;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		/*Dadas dos casillas de un tablero de ajedrez por la fila y columna que ocupan, comprobar
		si están en la misma fila, columna, o en la misma diagonal.*/

			
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce la fila de la primera pieza");
		int fila1 = teclado.nextInt();
		
		System.out.println("Introduce la columna de la primera pieza");
		int col1 = teclado.nextInt();
		
		System.out.println("Introduce la fila de la segunda pieza");
		int fila2 = teclado.nextInt();
		
		System.out.println("Introduce la columna de la segunda pieza");
		int col2 = teclado.nextInt();
		
		
		System.out.println("Algoritmo que calcula si las piezas del ajedrez están"
				+ " en la misma fila, columna o diagonal");
		
		System.out.println("Fila (pieza 1):");
		fila1 = teclado.nextInt();
		System.out.println("Columna (pieza 1):");
		col1 = teclado.nextInt();
		
		System.out.println("Fila (pieza 2):");
		fila2 = teclado.nextInt();
		System.out.println("Columna (pieza 2):");
		col2 = teclado.nextInt();
		
		
		if (fila1 <1 || fila1 >8 || fila2 <1 || fila2 >8 ||
			col1 <1 || col1 >8 || col2 <1 || col2 >8) {
			System.out.println("Posición de pieza incorrecta");
			System.exit(0);
		}
		
		if (fila1==fila2 && col1 == col2) {
			System.out.println("Están en la misma casilla");
		} else if (fila1 == fila2) {
			System.out.println("Las piezas están en la misma fila");
		} else if (col1 == col2) {
			System.out.println("Están en la misma columna");
		} else if ((col1-fila1 == col2-fila2) || (fila1+col1 == fila2+col2)){
			System.out.println("Están en la misma diagonal ");
		} else {
			System.out.println("No están en la misma fila, ni es la misma columna,"
					+ "ni en la misma diagonal");
		}
		
		teclado.close();
		
	}

}
