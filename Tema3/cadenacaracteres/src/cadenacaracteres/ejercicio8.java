package cadenacaracteres;
import java.util.Scanner;
public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		String frase;
		String palindroma="";
		String sinespacios;
		System.out.println("Introduce una frase y te indicaremos si esa frase es palindroma.");
		frase=sn.nextLine();
		
		sinespacios=frase.replace(" ", "");
		for(int i=sinespacios.length()-1; i>=0; i--) {
			
			palindroma=palindroma+sinespacios.charAt(i);
		}
		if(palindroma.equals(sinespacios)) {
			System.out.println("La frase introducida es palindroma.");
			
		}else {
			System.out.println("La frase introducida no es palindroma");
		}
		sn.close();
		//System.out.println(palindroma);
	}

}
