
package negocio;
import java.util.Scanner;
public class PruebaF1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PruebaF1 c = new PruebaF1();
		c.saberRanking();

	}
	int victoria=0;
	int derrota=0;
	String mensaje = "El ranking del heroe es: ";
	
	public void ingresarDatos() {
		Scanner vic = new Scanner(System.in);
		System.out.println("Ingrese la cantida de Victorias: ");
		victoria= vic.nextInt();
		Scanner der= new Scanner(System.in);
		System.out.println("Ingrese la cantida de Perdidas: ");
		derrota= der.nextInt();
		vic.close();
		der.close();
	}
	
	public int saberVictoria(int victoria, int derrota) {
		int saldo = victoria - derrota;
		return saldo; 
	}
	
	public void saberRanking() {
		this.ingresarDatos();
		this.analisaranking();
	}
	
	public void analisaranking() {
		int result = this.saberVictoria(victoria, derrota);
		 if( result < 10 ){
	            System.out.println(mensaje + "ferro");    
	        }else if( (result > 10) && (result < 21) ){
	        	System.out.println(mensaje + "bronze");
	        }else if( (result > 20) && (result < 51) ){
	        	System.out.println(mensaje + "prata");
	        }else if( (result > 50) && (result < 81) ){
	        	System.out.println(mensaje + "ouro");    
	        }else if( (result > 80) && (result < 91) ){
	        	System.out.println(mensaje + "diamante");
	        }else if( (result > 90) && (result < 101) ){
	        	System.out.println(mensaje + "lendario");
	        }else if(result > 100){
	        	System.out.println(mensaje + "imortal");
	        }
	}

}
