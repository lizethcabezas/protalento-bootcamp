package clase4;

public class Arrays {

	public static void main(String[] args) {
		// crear vector
		int []edades = new int [2];// un vector de 3 posiiones--0,1
		//asi se inicializa[0,0,0]
		
		//cargar un vector
		edades[0]=5;
		edades[1]=10;
		
		
		
		//atributo lenght
		
		int tamanio = edades.length; //tamaño del vector
		
		//acceder al ultimo elemento
		
		int edad=edades[tamanio-1];
		//edades[0];
		
	}

}
