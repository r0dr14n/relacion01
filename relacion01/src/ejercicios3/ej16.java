package ejercicios3;

public class ej16 {

	public static void main(String[] args) {
		/*Algoritmo que pida dos números naturales e imprimir su cociente entero por el 
	método de las restas sucesivas.*/
		
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número");
		int num = teclado.nextInt();
		
		
		System.out.println(num);
		num-=num;
		
		
		
		
	}

}
