package cadenacaracteres;
import java.util.Scanner;
public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		
		char[] conj1= {'e', 'i','k','m', 'p' ,'q', 'r', 's','t','u', 'v'};
		char[] conj2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
		char[] codificado;
		String texto;
		System.out.println("Introduce un texto para codificarlo.");
		texto=sn.nextLine();
		texto=texto.toLowerCase();//ponemos en minuscula para que este igual qu las arrays
		codificado=new char[texto.length()];//hacemos que la arrays sea del mismo tamaño
		for (int i=0 ; i< texto.length();i++) {
			codificado[i]= codifica(conj1,conj2,texto.charAt(i));
			
		}
		texto=String.valueOf(codificado);
		System.out.println(texto);
		sn.close();
	}

	public static char codifica(char conj1[], char conj2[], char c) {
		// TODO Auto-generated method stub
		final String conjunto1=String.valueOf(conj1);
		char codificado;
		int pos = conjunto1.indexOf(c);
		if(pos== -1) {
			codificado=c;
		}else {
			codificado=conj2[pos];
		}
		return codificado;
	}

}
