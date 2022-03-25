package cadenacaracteres;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		String nombre, sinVocales="";
		System.out.println("Introduce tu nombre");
		nombre=sn.nextLine();
		
		for(int i = 0 ;i<nombre.length();i++) {
			char c=nombre.charAt(i);
			
			if(!esVocal(c)) {
				sinVocales= sinVocales + c;
			}
		}
		
		System.out.println(sinVocales);
		sn.close();
		
	}

	static boolean esVocal( char c) {
		boolean result;
		String vocales="aáeéiíoóuú";
		c=Character.toLowerCase(c);
		if(vocales.indexOf(c) == -1) {
			result=false;//no es una vocal
		}else {
			result=true;//es una vocal
		}
		return result;
	}
}
