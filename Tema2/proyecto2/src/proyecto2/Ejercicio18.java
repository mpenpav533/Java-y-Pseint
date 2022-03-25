/*Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por
teclado y validados como distintos, el programa debe empezar por el menor de los enteros introducidos e ir
incrementando de 7 en 7.*/
package proyecto2;
import java.util.Scanner;
public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Dime dos numeros enteros y distintos.");
		System.out.println("Primer numero");
		int num1=sn.nextInt();
		System.out.println("Segundo numero");
		int num2=sn.nextInt();
		int i;
		if(num1!=num2) {
			if(num1<num2) {
				System.out.println("Los numeros comprendidos entre "+num1+" y "+num2+" es: ");
				for(i =num1;i<=num2;i+=7) {
					System.out.print(i+" ");
				}
				
			}else if(num2<num1) {
				System.out.print("Los numeros comprendidos entre "+num2+" y "+num1+" es: ");
				for(i =num2;i<=num1;i+=7) {
					System.out.print(i+" ");
				}
				
			}
			
		}else {
			System.out.println("Los numeros no son distintos");
		}
sn.close();
	}

}
