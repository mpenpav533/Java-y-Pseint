/*Realiza el control de acceso a una caja fuerte. La combinaci�n ser� un n�mero de 4 cifras. El programa nos
pedir� la combinaci�n para abrirla. Si no acertamos, se nos mostrar� el mensaje �Lo siento, esa no es la
combinaci�n� y si acertamos se nos dir� �La caja fuerte se ha abierto satisfactoriamente�. Tendremos cuatro
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
			System.out.println("Dime la combinaci�n de la caja fuerte.");
			 num=sn.nextInt();
			 cont++;
			 if(num!=pasw) {
				 System.out.println("Lo siento, esa no es la combinaci�n");					 
			 }else if (num==pasw) {
				 System.out.println("La caja fuerte se ha abierto satisfactoriamente");
			 }
		}while(cont!=4&&num!=pasw);
	sn.close();	
	}

}
