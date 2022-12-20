package ejercicios2;

import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		/*Dado el sueldo bruto de un trabajador y su número de hijos, realizar un algoritmo que 
		calcule los impuestos que debe pagar según la siguiente tabla de tramos*/
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el sueldo bruto");
		float sueldo = teclado.nextFloat();
		
		System.out.println("Introduce el numero de hijos");
		int numh = teclado.nextInt();
		
		int impuesto=0;
		float impuestofinal=0;
		
		
		if (sueldo>=0&&sueldo<=1000)
		{
			System.out.println("Impuesto del 0% y descuento no aplicable");
		}
		else if (sueldo>1000&&sueldo<=1600)
		{
			impuesto=5;
			
			if (numh>=1&&numh<=10)
			{
				impuesto=impuesto-numh;
			}
			else if (numh>=11)
			{
				impuesto=impuesto-10;
			}
			
			impuestofinal=(impuesto*sueldo/100);
			
			System.out.println("Impuesto del "+impuesto+"%.");
			System.out.println("Impuestos a pagar "+impuestofinal);
		}
		else if (sueldo>1600&&sueldo<=3000)
		{
			impuesto=10;
			
			if (numh>=1&&numh<=10)
			{
				impuesto=impuesto-numh;
			}
			else if (numh>=11)
			{
				impuesto=impuesto-10;
			}
			
			impuestofinal=(impuesto*sueldo/100);
			
			System.out.println("Impuesto del "+impuesto+"%.");
			System.out.println("Impuestos a pagar "+impuestofinal);
		}
		else if (sueldo>3000&&sueldo<=4600)
		{
			impuesto=15;
			
			if (numh>=1&&numh<=10)
			{
				impuesto=impuesto-numh;
			}
			else if (numh>=11)
			{
				impuesto=impuesto-10;
			}
			
			impuestofinal=(impuesto*sueldo/100);
			
			System.out.println("Impuesto del "+impuesto+"%.");
			System.out.println("Impuestos a pagar "+impuestofinal);
		}
		else if (sueldo>4600)
		{
			impuesto=20;
			
			if (numh>=1&&numh<=10)
			{
				impuesto=impuesto-numh;
			}
			else if (numh>=11)
			{
				impuesto=impuesto-10;
			}
			
			impuestofinal=(impuesto*sueldo/100);
			
			System.out.println("Impuesto del "+impuesto+"%.");
			System.out.println("Impuestos a pagar "+impuestofinal);
		}
		else
		{
			System.out.println("No se admiten números negativos");
		}
			
		teclado.close();
		
	}

}
