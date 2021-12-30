package clase3;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in); 
		//Le esta diciendo a mi clase/archivo voy a poder ingresar datos
		//Ingrese una contraseña y su usuario
		//Si contraseña ="1234" y usuario =admin=>"ok"
		//de lo contrario "fail"
		
		String usuario;
		String contrasenia;
		usuario="jose";
		contrasenia="12345";
		
		if(usuario=="admin" && contrasenia== "1234"){
			System.out.println("ok");
		}else {
			System.out.println("fail");
		}
		if(usuario=="admin") {
			if(contrasenia=="1234") {
				System.out.println("Ok");				
			}else {
				System.out.println("fail");				
			}		
		}else {
			System.out.println("fail");
		}
			
				
	}

}
