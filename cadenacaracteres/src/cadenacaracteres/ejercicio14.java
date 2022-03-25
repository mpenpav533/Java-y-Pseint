package cadenacaracteres;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabrainicial, palabrafinal;
		Scanner sn=new Scanner(System.in);
		char anagrama[];
		
		do {
			System.out.println("El jugador 1 introducirá una palabra o frase,"
					+"\ny mostraremos un anagrama, el jugador 2 intentara adivinarla ");
			System.out.println("Jugador 1, Introduce una palabra o frase:");
			palabrainicial=sn.nextLine();
			
			
		}while(palabrainicial.isEmpty());
		anagrama=palabrainicial.toCharArray();
		int tamanio=palabrainicial.length();
		for(int numcambio=0; numcambio<tamanio;numcambio++) {
			int i = (int) (Math.random()*tamanio);
			int j = (int) (Math.random()*tamanio);
			char auxiliar = anagrama[i];
			anagrama[i]=anagrama[j];
			anagrama[j]=auxiliar;
		}
		String anagramatermi= String.copyValueOf(anagrama);
		System.out.println("Jugador 2, intenta adivinar de donde viene este anagrama:  "+anagramatermi);
		do {
			System.out.println("Cual es el original");
			palabrafinal=sn.nextLine();
			
		}while(!palabrainicial.equals(palabrafinal));
		System.out.println("MUY BIEN! LO HAS ADIVINADO!");
		sn.close();
	}

}
