/*Escribe un programa que lea una lista de diez números y determine cuántos 
 * son positivos, y cuántos son negativos.*/
package proyecto2;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int neg=0;
		int pos=0;
		System.out.println("Dime 10 numeros enteros");
		for(int i=0;i<10;i++) {
			int num=sn.nextInt();
			
			if(num<0) {
				neg++;
			
			}else {
				pos++;
sn.close();	}
		}
		System.out.println("Los numeros positivos son: "+ pos);
		System.out.println("Los numeros negativos son: "+ neg);
	}
	

}
