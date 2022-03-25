package cadenacaracteres;
import java.util.Scanner;
public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		String invertido="";
		String frase;
		System.out.println("Introduce una frase y automaticamente se invertirá.");
		frase=sn.nextLine();
		for(int i=frase.length()-1 ; i>=0; i-- ) {
		
			invertido=invertido+frase.charAt(i);
		}
		System.out.println("La frase invertida es: "+invertido+".");
sn.close();	}

}
