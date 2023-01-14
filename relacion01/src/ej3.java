import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		/*Algoritmo que imprima la tabla de multiplicar correspondiente a un número 
	comprendido entre uno y diez, introducido por el usuario, usando un esquema do 
	while. Nota: En los tres ejercicios anteriores, el programa ha de controlar mediante 
	un esquema do-while, que el número está comprendido entre 1 y 10.*/
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número para mostrar la tabla de multiplicar");
		int num = teclado.nextInt();
		
		int contador=0;
		
		if (num>=1&&num<=10)
		{
			do {
				int res=num*++contador;
				System.out.printf("%d x %d = %d\n",num,contador,res);
			} while (contador<10);
		}
		else
		{
			System.out.println("El número debe estar entre el 1 y el 10");
		}
		teclado.close();
	}

}
