package cadenacaracteres;
import java.util.Arrays;
import java.util.Scanner;
public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra1, palabra2;
		Scanner sn=new Scanner(System.in);
		System.out.println("Introduce dos palabras y veremos si son anagramas.");
		System.out.print("Escribe una palabra:");
		palabra1=sn.nextLine();
		palabra1=palabra1.toLowerCase();
		System.out.println("");
		System.out.print("Escribe la segunda palabra:");
		palabra2=sn.nextLine();
		palabra2=palabra2.toLowerCase();
		if(palabra1.length()!=palabra2.length()) {
			System.out.println("No son anagramas.");
		}else {
			char p1[]= palabra1.toCharArray();
			char p2[]= palabra2.toCharArray();
			Arrays.sort(p1);
			Arrays.sort(p2);
			if(Arrays.equals(p1, p2)) {
				System.out.println("Son anagramas.");
			}else {
				System.out.println("No son anagramas.");
			}
		}
		sn.close();
	}

}
