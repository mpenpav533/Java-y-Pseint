package funciones;
import java.util.Scanner;
public class comprobar {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un numero.");
		System.out.println("Comprobaremos varias operaciones con él.");
		int num=sn.nextInt();
			
		//comprobar funcion capicua
		System.out.println("Vamos a comprobar si es capicua");
		System.out.println("");
		
		boolean result=funciones.ejercicios_del_1_al_8.esCapicua(num);
		
		if(result==true) {
			System.out.println("--El numero insertado es capicuo.--");
		}else {
			System.out.println("--El numero insertado no es capicuo.--");
		}
		//System.out.print(result);
		System.out.println("");
		//comprobar funcion primo
		System.out.println("Vamos a comprobar si es primo.");
		System.out.println("");
		boolean r=funciones.ejercicios_del_1_al_8.esPrimo(num);
		if(r==true) {
			System.out.println("--El numero insertado es primo.--");
		}else {
			System.out.println("--El numero insertado no es primo.--");
		}
		//System.out.println(r);
		
		//comprobar funcion potencia
		System.out.println("");
		System.out.println("Para la siguiente comprobacion, necesitaremos que introduzca un numero que ejerza como exponente pata calcular la potencia");
		
		int expo=sn.nextInt();
		
		double resu=funciones.ejercicios_del_1_al_8.potencia(num, expo);
		System.out.println("--El resultado de la operacion: "+num+"^"+expo+"="+resu);
		
		//Mostrar el numero invertido
		System.out.println("");
		int mostrar=funciones.ejercicios_del_1_al_8.invertido(num);
		System.out.println("El numero de forma invertida es el siguiente:"+mostrar);
		
		//comprobrar el numero de digitos que tiene el numero
		System.out.println("");
		System.out.println("Contaremos el numero de digitos que tiene el numero introducido anteriormente.");
		int digito=funciones.ejercicios_del_1_al_8.numerodigitos(num);
		System.out.println(digito);
	}

}
