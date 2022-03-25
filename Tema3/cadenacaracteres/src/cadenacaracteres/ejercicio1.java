package cadenacaracteres;
import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Introduce dos palabras e indicaremos cual es la mas corta. ");
		System.out.print("Primera palabra: ");
		String cad1=sn.next();
		System.out.print("Segunda palabra: ");
		String cad2=sn.next();
		int num1=cad1.length();
		int  num2=cad2.length();
		if (num1<num2){
			
			System.out.println("La palabra, "+"''"+cad1+"''"+ ", es la más corta");
			
		}else {
			if (num2<num1) {
				
				System.out.println("La palabra, "+ "''" +cad2+ "''" + ", es la más corta.");
				
			}else {
				System.out.println("Las dos palabras introducidas tiene la misma cantidad de caracteres.");
			}
		}
	sn.close();
	}
	

}
