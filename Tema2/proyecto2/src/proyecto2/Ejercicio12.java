/*Escribe un programa que muestre los n primeros términos de la serie de 
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 
 * 1 y el resto se calcula sumando los dos anteriores, por lo que tendríamos
 * que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El 
 * número n se debe introducir por teclado.*/
package proyecto2;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int num;
		System.out.println("Vamos a mostrar los n primeros numeros de la serie de Fibonacci.");
		System.out.println("Dime n:");
		num=sn.nextInt();
		switch (num) {
		case 1:
			System.out.println("0");
			break;
		case 2:
			System.out.println("0 1");
			break;
		default:
			System.out.print("0 1");
			int serie=0;
			int mas=1;
			int otro;
			while(num>2) {
				otro=serie;
				serie=mas;
				mas=otro+mas;
				System.out.print(" "+ mas);
				num--;
			}
			System.out.println("Dime una base y un exponente, los dos enteros positivos");
			System.out.println("Introduce una base");
			int base;
			base=sn.nextInt();
			System.out.println("Introduce un exponente");
			int exponente;
			exponente=sn.nextInt();
			if(base<0 ||exponente<0) {
				
			}
		}
sn.close();		
	}

}
