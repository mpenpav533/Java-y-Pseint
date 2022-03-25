/*Muestra la tabla de multiplicar de un número introducido por teclado.*/
package proyecto2;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int num=0;
		System.out.println("Inserte el numero del que quiere saber la tabla de multiplicar.");
		int mult=sn.nextInt();
		while(num!=11) {
			System.out.println(num+"*"+mult+"="+num*mult);
			num++;
			
			
		}
		
sn.close();
	}

}
