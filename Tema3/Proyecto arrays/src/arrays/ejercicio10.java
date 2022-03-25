/*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los
almacene en un array. El programa debe ser capaz de pasar todos los números pares a las
primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas
restantes. Utiliza arrays auxiliares si es necesario.*/
package arrays;

public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[20];
		int i;
		int nume=0;
		for(i=0;i<21;i++) {
			nume=(int)(Math.random()*100);
			if(nume%2==0) {
				num[i]=nume;
			}else {
								
			}
		}

	}

}
