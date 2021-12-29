package pruebas;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in); 
		
		
		System.out.println("Ingrese el valor de a: ");
		int a = teclado.nextInt();//leer un dato entero
		System.out.println("Ingrese el valor de b: ");
		int b = teclado.nextInt();
		int suma= a + b;
		
		
		System.out.println("La suma es = " + suma);
		
		teclado.close();
	
	}

}
