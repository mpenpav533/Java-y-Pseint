package cadenacaracteres;
import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int espacios=0;
		String frase;
		System.out.println("Introduce una frase y te diremos cuantos espacios en blanco tiene.");
		
		frase=sn.nextLine();
		
		for(int i=0;i<frase.length();i++) {
			
			if(frase.charAt(i)==' ') {
				
				espacios++;
				
			}
			
		}
		System.out.println("La frase tiene "+espacios+" espacios.");
		sn.close();}

}
