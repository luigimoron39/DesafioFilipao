import java.util.Scanner;
public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner Nom = new Scanner(System.in);
			    Scanner Exp = new Scanner(System.in);
			    System.out.println("Ingrese el nombre del Heroe:");
			    final String nombre = Nom.nextLine();
			    System.out.println("Ingrese la experiencia del Heroe");
			    int ex = Exp.nextInt();
				String nivel;

			    if(ex <= 1000) {
			          nivel = "ferro";
			        System.out.println("O Heroi " +nombre+ " esta en el nivel de " +nivel );
			     }else if((ex > 1000) && (ex <= 2000)) {
				          nivel = "bronze";
				        System.out.println("O Heroi " +nombre+ " esta en el nivel de " +nivel );
			     }else if((ex > 2000) && (ex <= 6000)) {
			          nivel = "prata";
			        System.out.println("O Heroi " +nombre+ " esta en el nivel de " +nivel );
			     }else if((ex > 7000) && (ex <= 8000)) {
			          nivel = "platina";
			        System.out.println("O Heroi " +nombre+ " esta en el nivel de " +nivel );
			     }else if((ex > 8000) && (ex <= 9000)) {
			          nivel = "ascendente";
			        System.out.println("O Heroi " +nombre+ " esta en el nivel de " +nivel );
			     }else if((ex > 9000) && (ex <= 10000)) {
			          nivel = "inmortal";
			        System.out.println("O Heroi " +nombre+ " esta en el nivel de " +nivel );
			     }else if(ex >= 10001) {
			          nivel = "radiante";
			        System.out.println("O Heroi " +nombre+ " esta en el nivel de " +nivel );   
		          }
				  //System.out.println("O Heroi " +nombre+ " esta en el nivel de " +nivel );
				  Nom.close();
				  Exp.close();
		 }
			
}


