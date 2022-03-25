package cadenacaracteres;
import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		String pista;
		int numpista=0;
		
		String introduccion = new String("Este es el juego de acierta la contraseña, el primer jugador introducirá la contraseña"
				+" y el segundo jugador intentará adivinarla");
		System.out.println(introduccion);
		System.out.print("Jugador 1 introduzca la contraseña: ");
		String jugador1=sn.next();
		System.out.print("Jugador 2 intenta adivinarla: ");
		String jugador2=sn.next();
		if(jugador1.equals(jugador2)==true) {
			System.out.println("¡¡ENHORABUENA!! HAS GANADO A LA PRIMERA");
		
		}else {
			while((jugador1.equals(jugador2)==false)) {
				System.out.println("¡¡Incorrecto!!");
				if(numpista==0) {
					System.out.println("Si desea una pista introduzca, si, si no la desea introduzca, no.");
					pista=sn.next();
					
					if((pista.equals("si") )) {
						
						System.out.println("Elige entre las dos opciones: ");
						System.out.println("1.numero de caracteres de la palabra y saber el primer y el ultimo caracter. ");
						System.out.println("2.Indicar si la palabra es mayor o menor alfabéticamente respecto a la contraseña");
						
						int opcion=sn.nextInt();
						if(opcion==1) {
							System.out.println("El numero de caracteres es, "+jugador1.length()+". La primera letra es, "+jugador1.charAt(0)+" y la ultima es, "+jugador1.charAt(jugador1.length()-1));
						}else {
							System.out.println("En mantenimiento");
						}
						
					}
					numpista++;
				}
				System.out.print("Vuelve a introducir tu palabra: ");
				jugador2=sn.next();
			}
			
		}
		
		System.out.println("¡¡Has acertado!!");
		sn.close();
	}
}
