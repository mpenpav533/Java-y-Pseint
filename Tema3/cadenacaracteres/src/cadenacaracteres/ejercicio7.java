package cadenacaracteres;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn= new Scanner(System.in);
		int veces=0, posicion;
		System.out.println("Introduce una frase y una palabra.");
		System.out.print("La frase:");
		String frase=sn.nextLine();
		System.out.print("La palabra:");
		String palabra=sn.next();
		posicion = frase.indexOf(palabra);
		while(posicion != -1) {
			veces++;
			posicion = frase.indexOf(palabra, posicion+1);
		}
		if(veces == 0) {
			System.out.println("La palabra, "+palabra+ " no se encuentra en la frase");
			
		}else {
			System.out.println("La palabra, "+palabra+" se encuentra "+veces+" veces.");
		}
		sn.close();
	}

}
