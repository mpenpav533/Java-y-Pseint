/*Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.*/
package proyecto2;

public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Números primos entre 2 y 100: ");

	    boolean esPrimo = true;

	    for (int n = 2; n <= 100; n++) {

	     
	      esPrimo = true;
	      for (int i = 2; i < n; i++) {
	        if (n % i == 0) {
	          esPrimo = false;
	        }
	      }

	      
	      if (esPrimo) {
	        System.out.print(n + " ");
	      }
	    }
	    System.out.println();

	}

}
