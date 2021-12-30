package clase4;

public class CicloWhile {

	public static void main(String[] args) {
		
		short []edades=new short [] {10,5,25}; //lenght 	= 3, pos:0,1,2	
		
		
		// definido i por fuera 
		
		int i = 0;
		
		while(i<edades.length) {
			System.out.println("post:"+i+",val: "+edades[i]);
			
			i++;
		}
		i=edades.length-1; //se inicialia en 3
		while(i>= 0); 
		
			System.out.println("post:"+i+",val: "+edades[i]);
	}

}
