/*Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.*/
package proyecto2;
import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		Scanner sm=new Scanner(System.in);
	System.out.println("Vamos hacer una piramide hueca, para ello tiene que dar la altura y el relleno");

	System.out.println("Dime la altura");
	int alturaintro=sn.nextInt();
		
	System.out.println("Dime el relleno");
	String relleno=sm.nextLine();
		
	 int altura = 1;
	 int i = 0;
	 int espaciodelante = alturaintro - 1;
	 int espaciosinternos = 0;
	
	 while (altura<alturaintro) {
		 for(i=1;i<=espaciodelante;i++) {
			 System.out.println(" ");
		 }
		 System.out.println(relleno);
		 for (i = 1; i < espaciosinternos; i++) {
		        System.out.print(" ");
		 }
		 if(altura>1) {
			 System.out.println(relleno);
		 }
		 System.out.println();
	      altura++;
	      espaciodelante--;
	      espaciosinternos += 2;
	 }
	 for (i = 1; i < altura*2; i++) {
	      System.out.print(relleno);
	    }
	 
	 

	}

}
