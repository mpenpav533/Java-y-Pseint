/*Realiza un programa que sume los 100 números siguientes a un número entero y positivo introducido por
teclado. Se debe comprobar que el dato introducido es correcto (que es un número positivo).*/
package proyecto2;
import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int num,suma;
		System.out.println("Introduce un numero entero positivo.");
		num=sn.nextInt();
		suma=0;
		if(num>0) {
			suma=num+1;
			
			for(int i=0;i<101;i++) {
				
				suma=suma+i;
				System.out.println(suma);
			}
			System.out.println("La suma de los 100 numeros siguientes es: "+suma);
		}else {
			System.out.println("El numero introducido no es entero y positivo");
		}
		sn.close();	}

}
