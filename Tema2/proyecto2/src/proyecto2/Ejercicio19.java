/*Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado. El carácter con
el que se pinta la pirámide también se debe pedir por teclado*/
package proyecto2;
import java.util.Scanner;
public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		Scanner sm=new Scanner(System.in);
		System.out.println("Vamos Hacer una piramide con la altura que introduzca y el relleno que quiera.");
		System.out.println("Introduzca la altura");
		int altura=sn.nextInt();
		System.out.println("Introduzca el relleno");
		String relleno=sm.nextLine();
		
		int planta = 1;
	    int longitudDeLinea = 1;
	    int espacios = altura-1;
	    
	    while (planta <= altura) {
	      
	      // pon espacios
	      for (int i = 1; i <= espacios; i++) {
	        System.out.print(" ");
	      }

	      // pon la línea
	      for (int i = 1; i <= longitudDeLinea; i++) {
	        System.out.print(relleno);
	      }

	      System.out.println();

	      planta++;
	      espacios--;
	      longitudDeLinea += 2;
	      sn.close();
	      sm.close();
	    }
	}

}
