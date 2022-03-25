/*Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos diga
cuantos números se han introducido, la media de los impares y el mayor de los pares. El número negativo
sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo.*/
package proyecto2;
import java.util.Scanner;
public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int cont=1;
		int suma=0;
		double media;
		int mayor=0,impar=0;
		Scanner sn=new Scanner(System.in);
		System.out.println("Introduce todos los numero que quieras, cuando introduzcas uno negativo, mostrará cuantos hay, la media de los impares y el mayor de los pares");
		num=sn.nextInt();
		for(int i=1;num>0;i++) {
			num=sn.nextInt();
			cont++;
			if(num%2!=0) {
				suma=suma+num;
				impar++;
			}
			if(num%2==0) {
			
				if(num>mayor) {
					mayor=num;
				}
			}
			
		}
		cont--;
		media=suma/impar;
		System.out.println("El total de numeros introducidos es:"+ cont);
		System.out.println("La media de los impares es:" +media);
		System.out.println("El mayor de los pares es: "+ mayor);
		sn.close();
		
	}

}
