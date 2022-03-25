/*Escribe un programa que dados dos números, uno real (base) y un entero positivo(exponente), saque por
pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido. No
se deben utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5, se deberán mostrar
2
1,
 22
, 23
, 24 y 25
.*/
package proyecto2;
import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Vamos a calcular todas las potencias de una base hasta el exponente que indique.");
		
		System.out.println("Dime una base");
		double base=sn.nextInt();
		
		System.out.println("Dime el exponente final");
		int exponentefinal=sn.nextInt();
		
		for(int i=1;i<=exponentefinal;i++) {
			double potencia=1;
			int exponente=i;
			
			for(int r=1;r<exponente;r++) {
				potencia*=base;
			}
			System.out.println(base+"^"+i+"="+potencia);
		}
		sn.close();	

	}

}
