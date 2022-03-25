/*Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa nos
pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la
combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
oportunidades para abrir la caja fuerte.*/
package proyecto2;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont=0;
		int pasw=1234;
		int num;
		Scanner sn=new Scanner(System.in);
		do {
			System.out.println("Dime la combinación de la caja fuerte.");
			 num=sn.nextInt();
			 cont++;
			 if(num!=pasw) {
				 System.out.println("Lo siento, esa no es la combinación");					 
			 }else if (num==pasw) {
				 System.out.println("La caja fuerte se ha abierto satisfactoriamente");
			 }
		}while(cont!=4&&num!=pasw);
	sn.close();	
	}

}
