package clase4;

public class CicloFor {

	public static void main(String[] args) {
		float[] alturas_ = new float [2];
		alturas_[0] = 1;
		alturas_[1] = 2;
		
		float[] alturas = new float[]{1,   2};
		float aux = alturas[0];
		
		
		//ciclo for
		
		for(int i=0; i<alturas.length;i++) { 
			aux=alturas[i];
			System.out.println( "pos:"+i+ ", val: "+ aux);
		}
			
		System.out.println( "---------");
		
		for(int i=alturas.length -1; i>=0;i--) {
			System.out.println("post:"+i+", val:"+alturas[i]);
			
		}
	}
}
