package ejercicios;

import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {
		/*Programa que calcule el cambio que se debe devolver al usuario. Se pedirán por 
	teclado dos números, el precio del artículo y el importe introducido. Se devolverá el 
	número de monedas a entregar óptimo suponiendo que tenemos disponibilidad de 
	monedas infinita*/
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce el precio del artículo");
		double precio = teclado.nextDouble();
		
		System.out.println("Introduce el importe en euros");
		double importe = teclado.nextDouble();
		
		
		double cambio = importe-precio;
		System.out.println("el cambio a devolver es "+cambio);
		int rest = (int) Math.floor(cambio);
		
		int doseu = 0, uneu = 0;
		int c50 = 0, c20 = 0, c10 = 0, c5 = 0, c2 = 0, c1 = 0;
		
		
		doseu = rest/2;
		uneu = rest%2;
		
		rest=(int) ((cambio-rest)*100);
		
		c50 = rest%50;
		c20 = rest%20;
		c10 = rest%10;
		c5 = rest%5;
		c2 = rest%2;
		c1 = rest%1;
		
		System.out.println("El cambio en monedas: 2e "+doseu+" 1e "+uneu+" 50cent "+c50+
				" 20cent "+c20+" 10cent "+c10+" 5cent "+c5+" 2cent "+c2+" 1cent "+c1);
		
		teclado.close();
	}

}
