package proyecto2;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sn=new Scanner(System.in);
		System.out.println("Dime un numero y te diré los digitos que tiene");
		int num=sn.nextInt();
		while (num<0) {
			System.out.println("El numero introducido es negativo, por favor vuelva a introducir otro numero.");
			 num=sn.nextInt();
		}
		if (num>=1000 && num<=9999) {
			System.out.println(num+" tiene 4 digitos.");
		}else {
			if(num>=100 && num<=999) {
				System.out.println(num+" tiene 3 digitos.");
			}else {
				if(num>=10 && num<=99) {
					System.out.println(num+" tiene 2 digitos.");
				}else {
					if (num>=1 && num<=9) {
						System.out.println(num+" tiene 1 digito.");
					}
				}
			}
		}
sn.close();
	}

}
