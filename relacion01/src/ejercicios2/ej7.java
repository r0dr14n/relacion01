package ejercicios2;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		/*Algoritmo que determine si un año dado es bisiesto o no, teniendo en cuenta que son
	años bisiestos los múltiplos de 4, excepto los que son también múltiplos de 100 pero a su vez no
	lo son de 400*/
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce el año para conocer si es bisiesto");
		int anio = teclado.nextInt();
		
		
		if (anio%4==0||(anio%100==0&&anio%400!=0))
			System.out.println("El año "+anio+" es bisiesto");
		else
			System.out.println("El año "+anio+" no es bisiesto");
		
		teclado.close();
		
	}

}
