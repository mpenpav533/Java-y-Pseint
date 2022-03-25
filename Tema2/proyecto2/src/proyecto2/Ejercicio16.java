/*Escribe un programa que diga si un número introducido por teclado es o no primo. Un número primo es
aquel que sólo es divisible entre él mismo y la unidad.*/
package proyecto2;
import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Dime un numero y veremos si es primo o no.");
		int num=sn.nextInt();
		int contador=0;
		for(int i=2; i<num;i++) {
			if((num%i)==0) { 
				
				contador++;
			}
			
		}
		
		if(contador<2) {
			System.out.println("El "+num+" es un numero primo");
		}else {
			System.out.println("El "+num+" no es un numero primo");
		}
		
sn.close();
	}

}
