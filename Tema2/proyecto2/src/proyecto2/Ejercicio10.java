/*Escribe un programa que calcule la media de un conjunto de n�meros positivos introducidos por teclado. A
priori, el programa no sabe cu�ntos n�meros se introducir�n. El usuario indicar� que ha terminado de
introducir los datos cuando meta un n�mero negativo.*/
package proyecto2;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int suma=0;
		int cont=0;
		double result=0;
		System.out.println("Inserta los numero que quieras y calculamos la media");
		do { 
			Scanner sn=new Scanner(System.in);
			 x=sn.nextInt();
			 if(x>=0) {
				 cont++;
			sn.close(); }
			 suma=suma+x;
		}while(x>=0);
		
		result=suma/cont;
		System.out.println("La media de los numeros insertados es :"+result);
	
	}
	
}
