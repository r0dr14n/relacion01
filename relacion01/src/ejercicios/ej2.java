package ejercicios;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		/* Programa Java que lea un nombre y muestre por pantalla: “Buenos dias 
		nombre_introducido”*/
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		
		System.out.println("Introduce tu nombre");
		nombre = teclado.next();
				
		System.out.printf("Buenos dias %s",nombre);
		
		teclado.close();
	}

}
