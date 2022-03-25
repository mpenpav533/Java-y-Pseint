package funciones;

public class ejercicios_del_1_al_8 {

public static boolean esPrimo(int num) {
	/* esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y
	falso en caso contrario.*/
	
	boolean esPrimo=true;


	for(int i=2;i<num;i++) {
		if(num%i==0) {
			esPrimo=false;
			
		}
	}
	return esPrimo;
}

public static boolean esCapicua(int num) {
	//esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa
	//y falso en caso contrario.
	boolean esCapicua;
	
	
	if(num==funciones.ejercicios_del_1_al_8.invertido( num)) {
		esCapicua=true;
	}else {
		esCapicua=false;
 		
	}
	return esCapicua;
	
}


public static int invertido(int num) {
	//voltea: Le da la vuelta a un número
	int invertido=0, resto;
	
	while(num>0) {
		resto= num%10;
		invertido=invertido*10+resto;
		num/=10;
	}
	return invertido;
	
}
                                       
public static double potencia(int num, int expo) {
	//potencia: Dada una base y un exponente devuelve la potencia.
	
	return Math.pow(num, expo);


}


public static int numerodigitos(int num) {
//digitos: Cuenta el número de dígitos de un número entero.

	if (num == 0) {
	      return 1;
	    } else {
	      int n = 0;
	      while (num > 0) {
	        num = num / 10;
	        n++;
	      }
	      return n;
	    }
}
}