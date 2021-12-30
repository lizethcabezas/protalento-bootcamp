package clase4;

import java.util.Scanner;

public class CicloForEjercicio {

	public static void main(String[] args) {
		//pedir al usuario la cantidad de registros a procesas
		//cargar en uun vectr de enteros los datos a ingresados por el usuario
		//y contar la cantidad de  los números pares 
		// contrar la cantidad de numero impares
		//sumar los números impares y pares
		//el prom de los valores ingresados
		
		int cantidadRegistros;
		int[] vector;
		int cantPares=0;
		int cantImpares=0;
		int sumaPares=0;
		int sumaImpares=0;
		double promedio;
		
		//0 Definit el tamaño del vector
		//1 cargar datos
		//2 procesamiento
		
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Ingrese la cantidad de registros");
			cantidadRegistros= teclado.nextInt();
		}while(cantidadRegistros<=0);
		
		vector = new int [cantidadRegistros];
		
		//carga de datos
		
		
		for(int i=0; i<cantidadRegistros; i++){
			System.out.println("Ingrese un dato:");
			int datoleido= teclado.nextInt();
			vector[i]=datoleido;
			
		}
		
		//procesamiento
		for(int dato:vector) {
			
			if(dato % 2==0) {
				cantImpares++;
				sumaPares+=dato;
			}else {
				cantImpares++;
				sumaImpares+=dato;
								
			}
		
		}
		promedio=(double)(sumaImpares+sumaImpares)/(cantImpares+cantPares);
		
		System.out.println(java.util.Arrays.toString(vector));
		//mostar los datos calculados
		System.out.println("Cantidad de registros:"+cantidadRegistros);
		System.out.println("Cantidad de pares:"+cantPares);
		System.out.println("Cantidad de impares:"+cantImpares);
		System.out.println("Suma de pares:"+sumaPares);
		System.out.println("Suma de impares:"+sumaImpares);
		System.out.println("Promedio:"+promedio);
		
		teclado.close();
	}	

}
