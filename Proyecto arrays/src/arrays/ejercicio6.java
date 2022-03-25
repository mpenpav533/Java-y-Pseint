/*Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota
los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición
1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
posición 0. Finalmente, muestra el contenido del array*/
package arrays;
import java.util.Scanner;
public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[15];
		
		Scanner sn=new Scanner(System.in);
		System.out.println("Dime 15 numeros y lo almacenaremos.");
		int i;
		
		int aux;
		for (i=0;i<15;i++) {
			num[i]=sn.nextInt();
			 
		}
		int j;
		aux=num[14];
		for(j=14;j>0;j--) {
			
			num[j]=num[j-1];
		}
		num[0]=aux;
		for(int k=0;k<15;k++) {
			System.out.println(num[k]);
		}
		sn.close();
	}

}
