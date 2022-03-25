package cadenacaracteres;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> palabras= new ArrayList<String>();
		Scanner sn=new Scanner(System.in);
		String palabra;
		System.out.println("Introducir una frase palabra a palabra.");
		do {
			palabra=sn.nextLine();
			if(!(palabra.equalsIgnoreCase("fin"))){
			palabras.add(palabra);
			Iterator<String> finalIterator= palabras.iterator();
			while(finalIterator.hasNext()) {
				String elemento = finalIterator.next();
				System.out.print(elemento+" ");
				
			}
			System.out.println("");
			System.out.println("Vuelve a introducir una palabra");
			}
		}while(!(palabra.equalsIgnoreCase("fin")));
		System.out.println("Se acabo");
		sn.close();
	}

}
