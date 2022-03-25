/*Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.*/
package proyecto2;
import java.util.Scanner;
public class ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Dime una base y un exponente, los dos enteros positivos");
		System.out.println("Introduce una base");
		int base;
		base=sn.nextInt();
		System.out.println("Introduce un exponente");
		int exponente;
		exponente=sn.nextInt();
		double potencia=1;
		if(base>0 ||exponente>0) {
			for(int i=0;i<exponente;i++) {
			potencia*=base;
			}
		}else {
			System.out.println("Ha introducido algun numero incorrecto");
		}
		System.out.println(base+"^"+exponente+"="+ potencia);
		sn.close();
	}

}
