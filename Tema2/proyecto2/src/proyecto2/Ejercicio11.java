/*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de 
 *los 5 primeros números enteros
  a partir de uno que se introduce por teclado.*/

package proyecto2;
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    
	    System.out.print("Introduzca un número: ");
	    int numeroIntroducido=s.nextInt();

	    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
	      System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
	    }
	    s.close();
	  }

	

}
