package clase3;

import java.util.Scanner;

public class EjercicioIF {

	public static void main(String[] args) {
		// DETERMINAR DADO 3 NUM CUAL ES EL MAYOR
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese el número 1: ");
		double num1 = teclado.nextInt();
		System.out.println("Ingrese el número 2: ");
		int num2 = teclado.nextInt();
		System.out.println("Ingrese el número 3: ");
		int num3 = teclado.nextInt();
		
		
		if((num1> num2)&&(num1>num3)) {
			System.out.println("El número mayor es"+num1);		
		}else if((num2>num3)&& (num2>num3)){	
			System.out.println("El número mayor es"+num2);
		}else if((num3>num1)&& (num3>num1)){
			System.out.println("El número mayor es"+num3);						
		}else {
			System.out.println("son iguales");
		}
		teclado.close();
	}

}
