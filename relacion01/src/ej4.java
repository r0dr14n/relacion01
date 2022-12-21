import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		/*Algoritmo que escriba los números impares comprendidos entre dos enteros 
	introducidos por el usuario*/
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número (1/2):");
		int num1 = teclado.nextInt();
		
		System.out.println("Introduce un número (2/2):");
		int num2 = teclado.nextInt();
		
		
		if ((num1%2==0)&&(num2%2==0))
		{
			num1+=1;
			num2+=1;
			
			while (num1<num2)
			{
				System.out.println(num1);
				num1+=2;
			}
			
			while (num1>num2)
			{
				System.out.println(num2);
				num2+=2;
			}
			
		}
		
		else if ((num1%2!=0)&&(num2%2!=0))
		{
			while (num1<num2)
			{
				System.out.println(num1);
				num1+=2;
			}
			
			while (num1>num2)
			{
				System.out.println(num2);
				num2+=2;
			}
		}
		
		else if ((num1%2==0)&&(num2%2!=0))
		{
			num1+=1;
			
			while (num1<num2)
			{
				System.out.println(num1);
				num1+=2;
			}
			
			while (num1>num2)
			{
				System.out.println(num2);
				num2+=2;
			}
			
		}
		
		if ((num1%2!=0)&&(num2%2==0))
		{
			num2+=1;
			
			while (num1<num2)
			{
				System.out.println(num1);
				num1+=2;
			}
			
			while (num1>num2)
			{
				System.out.println(num2);
				num2+=2;
			}
			
		}
		
		teclado.close();
		
	}

}
