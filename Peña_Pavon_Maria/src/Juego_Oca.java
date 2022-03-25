import java.util.Scanner;

public class Juego_Oca {

	public static int TAMCIRCUITO = 11;
	public static int fichaJ1=0;
	public static int fichaJ2=0;
	public static int minDado;
	public static int maxDado;
	public static int tirada1;
	public static int tirada2;
	public static String nomJ1;
	public static String nomJ2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);

		System.out.println("¡BIENVENIDO A LA CARRERA DEL SIGLO!");
		System.out.println("¿Cual es el numero minimo del dado?");
		minDado = sn.nextInt();
		System.out.println("¿Cual es el numero maximo del dado?");
		maxDado = sn.nextInt();
		sn.nextLine();
		System.out.println("¿Cual es el nombre del jugador 1?");
		nomJ1 = sn.nextLine();
		System.out.println("¿Cual es el nombre del jugador 2?");
		nomJ2 = sn.nextLine();
		while (nomJ1.equalsIgnoreCase(nomJ2)) {
			System.out.println(
					"Lo siento has introducido el mismo nombre que el jugador 1.\n Vuelve a introducir un nombre ");
			nomJ2 = sn.nextLine();
		}
		System.out.println("¡COMENCEMOS A JUGAR!");
		pintaPista(fichaJ1, fichaJ2);
		
		while (EsGanador(nomJ1, nomJ2, fichaJ1, fichaJ2).equalsIgnoreCase("")) {
			
			System.out.println("Pulsa cualquier tecla para la siguiente ronda");
			String tecla=sn.nextLine();
			
			System.out.println("Turno para el jugador 1 "+ nomJ1);
			
			tirada1=tiraDados(minDado,maxDado);
			System.out.println("Ha sacado un "+tirada1+" en la primera tirada.");
			
			tirada2=tiraDados(minDado,maxDado);
			System.out.println("Ha sacado un "+tirada2+" en la primera tirada.");
			System.out.println("");
			
			if(!sumaDeNumerosEsPrimo(tirada1,tirada2)) {
				System.out.println("TIRADA NO VALIDA");
				System.out.println("No suma puntos ya que la suma de los dos numeros NO ES PRIMO");
			}else {
				System.out.println("TIRADA VALIDA");
				fichaJ1+=tirada1+tirada2;
			}
			pintaPista(fichaJ1, fichaJ2);
			
			System.out.println(imprimeComoVaLaCarrera(nomJ1, nomJ2, fichaJ1, fichaJ2));
			
			if(EsGanador(nomJ1, nomJ2, fichaJ1, fichaJ2).equalsIgnoreCase(nomJ1)) {
				
				System.out.println("JUGADOR GANADOR: "+EsGanador(nomJ1, nomJ2, fichaJ1, fichaJ2));
				break;
				
			}else {
				System.out.println(EsGanador(nomJ1, nomJ2, fichaJ1, fichaJ2));
				
				System.out.println("Turno para el jugador 2 "+ nomJ2);
				tirada1=tiraDados(minDado,maxDado);
				System.out.println("Ha sacado un "+tirada1+" en la primera tirada.");
				tirada2=tiraDados(minDado,maxDado);
				System.out.println("Ha sacado un "+tirada2+" en la primera tirada.");
				System.out.println("");
				if(!sumaDeNumerosEsPrimo(tirada1,tirada2)) {
					System.out.println("TIRADA NO VALIDA");
					System.out.println("No suma puntos ya que la suma de los dos numeros NO ES PRIMO");
				}else {
					System.out.println("TIRADA VALIDA");
					fichaJ2+=tirada1+tirada2;
				}
				pintaPista(fichaJ1, fichaJ2);
				System.out.println(imprimeComoVaLaCarrera(nomJ1, nomJ2, fichaJ1, fichaJ2));
				if(EsGanador(nomJ1, nomJ2, fichaJ1, fichaJ2).equalsIgnoreCase(nomJ2)) {
					System.out.println("JUGADOR GANADOR: "+EsGanador(nomJ1, nomJ2, fichaJ1, fichaJ2));
					break;
					
				}else {
					System.out.println(EsGanador(nomJ1, nomJ2, fichaJ1, fichaJ2));
				}
				
			}
			
			
			
		sn.close();	
		} 
	}

	public static int tiraDados(int minDado, int maxDado) {
		int tirada;

		tirada = (int) (Math.random() * (maxDado - minDado) + minDado);

		return tirada;
	}

	public static boolean sumaDeNumerosEsPrimo(int tirada1, int tirada2) {

		boolean suma;
		int resultado = tirada1 + tirada2;
		int contador = 0;
		for (int i = 2; i < resultado; i++) {
			if ((resultado % i) == 0) {

				contador++;
			}
		}
		if (contador < 2) {
			suma = true;

		} else {
			suma = false;
		}
		return suma;
	}

	public static void pintaPista(int fichaJ1, int fichaJ2) {
		int i;

		for (i = 1; i <= TAMCIRCUITO; i++) {
			System.out.print("\t" + i + "\t");

			
		}
		System.out.println("");
		if(fichaJ1==0) {
			System.out.println("J1");
		}
		if(fichaJ2==0) {
			System.out.println("J2");
		}
		
		for (i = 1; i <= TAMCIRCUITO; i++) {
			if (fichaJ1 == i) {
				System.out.print("\t" + "J1" + "\t");
			} else {
				System.out.print("\t" + "  " + "\t");
			}
		}
		System.out.println("");
		for (i = 1; i <= TAMCIRCUITO; i++) {
			if (fichaJ2 == i) {
				System.out.print("\t" + "J2" + "\t");
			} else {
				System.out.print("\t" + " " + "\t");
			}
		}
		System.out.println("");
	}

	public static String imprimeComoVaLaCarrera(String nomJ1, String nomJ2, int fichaJ1, int fichaJ2) {

		if (fichaJ1 > fichaJ2) {
			return "Va ganando el jugador " + nomJ1;
		} else if (fichaJ2 > fichaJ1) {
			return "Va ganando el jugador " + nomJ2;
		}
		return "¡Van empatados!";
	}

	public static String EsGanador(String nomJ1, String nomJ2, int fichaJ1, int fichaJ2) {
		if (fichaJ1 >= TAMCIRCUITO) {
			return  nomJ1;
		} else if (fichaJ2 >= TAMCIRCUITO) {
			return nomJ2;
		}else {
			return "";
		}
		
	}
	
}
