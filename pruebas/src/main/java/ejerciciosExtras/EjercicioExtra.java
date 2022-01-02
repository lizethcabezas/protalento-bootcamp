package ejerciciosExtras;

import java.util.Scanner;

public class EjercicioExtra {

	public static void main(String[] args) {
		double suman=0;
		int cantalum;
		int cantnot;
		double promd=0;
		double masalta = 0;
		double masBaja=0;
		int alumno = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de alumnos");
			cantalum=teclado.nextInt();
		
		System.out.println("Ingrese la cantidad notas");
			cantnot=teclado.nextInt();
	
		String [] nombres = new String [cantalum];
		String [] apellidos = new String [cantalum];
		double[][]  notas = new double[cantnot][cantalum] ;
		
		
		for (int i=0; i<cantalum;i++) {
			System.out.println("Ingrese nombre alumno "+(i+1));
			nombres[i]=teclado.next();
			System.out.println("Ingrese apellido del  alumno "+(i+1));
			apellidos[i]=teclado.next();
			
			for (int j=0; j<cantnot;j++) {
				System.out.println("ingrese la nota "+(j+1) + "del alumno " +( i+1));
				notas[j][i]=teclado.nextInt();
				suman+=notas[j][i];
				promd=suman/cantnot;
			}
			if (promd>=7) {
				System.out.println("El estudiante "+nombres[i]+apellidos[i]+ "ha sido promocionado");
			}else {
				System.out.println("El estudiante "+nombres[i]+apellidos[i]+ "no ha sido promocionado");
				}
				if (promd>masalta){
					masalta=promd;
					alumno=i;
				if (promd < masBaja) {
					masBaja = promd;
					alumno = i;
				}
					
			}
		System.out.println("el promedio del alumno "+ i +"es "+ promd);
		System.out.printf("\nNota promedio más alta: %.2f\n", masalta);
		System.out.printf("\nNota promedio más alta: %.2f\n", masBaja);	
		
			
			
		}
		teclado.close();
	} 
	
	
}