/*Realiza un programa que pida la temperatura media que ha hecho en cada mes de un
determinado año y que muestre a continuación un diagrama de barras horizontales con
esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier 
otro carácter*/
package arrays;
import java.util.Scanner;
public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		double[] mes=new double[12];
		int i;
		System.out.println("Dime la temperatura media de cada mes de un año en concreto.");
		for(i=0; i <12;i++) {
			mes[i]=sn.nextDouble();
		}
		System.out.println("La temperatura es la siguiente.");
		for(i=0;i<12;i++) {
			System.out.print(mes[i]);
			for(int p=0;p<mes[i];p++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
sn.close();
	}

}
