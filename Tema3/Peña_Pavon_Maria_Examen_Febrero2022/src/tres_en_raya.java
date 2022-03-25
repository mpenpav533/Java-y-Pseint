import java.util.Scanner;

public class tres_en_raya {
	public static int x1 = -1, x2 = -1, x3 = -1, o1 = -1, o2 = -1, o3 = -1;
	public static char[] tablero = {0,1,2,3,4,5,6,7,8};
	public static String movimiento;
	public static String sinespacios;
	public static int movimientom;
	public static int usuario;
	public static int maquina;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("¡Juguemos al tres en raya!");
		imprimeTablero();
		String respuesta = "n";
		while (respuesta.equalsIgnoreCase("n")) {
			boolean programa;
			boolean usuario;
			do {
				imprimeTablero();
				System.out.println("¡Tu turno!");
				movimiento = sn.nextLine();
				while (conviertePosicionMovimiento(movimiento) == -1) {
					System.out.println("Movimiento erroneo");
					System.out.println("Elige donde quieres colorar tu ficha:");
					movimiento = sn.nextLine();

				}
				System.out.println("Movimiento valido");

				programa = ganaPrograma(x1, x2, x3);
				usuario = ganaUsuario(o1, o2, o3);

				System.out.println("Turno de la maquina");
				

			} while (programa == false || usuario == false);

			System.out.println("Otra partida?(s/n)");
			respuesta = sn.next();
		}

	}

	public static void imprimeTablero() {
		for (int i = 0; i < 9; i++) {
			System.out.println(tablero[i]);
		}

	}

	public static int mueveFichaAleatoria(char[] tablero) {
		int minimo = 0, maximo = 8;

		movimientom = (int) (Math.random() * (maximo - minimo + 1) + minimo);

		if (tablero[movimientom] == 'O' && tablero[movimientom] == 'X') {
			movimientom = (int) (Math.random() * (maximo - minimo + 1) + minimo);
			if (tablero[movimientom] != 'O' && tablero[movimientom] != 'X') {
				if (o1 != -1 && x1 == -1) {
					x1 = movimientom;
					return x1;
				} else if (o2 != -1 && x2 == -1) {
					x2 = movimientom;
					return x2;
				} else if (o3 != -1 && x3 == -1) {
					x3 = movimientom;
					return x3;
				}

			}
		}
		return -1;

	}

	public static int conviertePosicionMovimiento(String movimiento) {
		int arribaIzquierda = 0, arribaCentro = 1, arribaDerecha = 2, centroIzquierda = 3, centroCentro = 4,
				centroDerecha = 5, abajoIzquierda = 6, abajoCentro = 7, abajoDerecha = 8;
		int movimientoj;
		for (int i = 0; i < movimiento.length(); i++) {
			if (movimiento.charAt(i) != ' ') {
				sinespacios += movimiento.charAt(i);
			}
		}
		if (sinespacios.equalsIgnoreCase("arribaizquierda")) {
			movimientoj = arribaIzquierda;
		} else if (sinespacios.equalsIgnoreCase("arribacentro")) {
			movimientoj = arribaCentro;

		} else if (sinespacios.equalsIgnoreCase("arribaDerecha")) {
			movimientoj = arribaDerecha;

		} else if (sinespacios.equalsIgnoreCase("centroIzquierda")) {
			movimientoj = centroIzquierda;

		} else if (sinespacios.equalsIgnoreCase("centroCentro")) {
			movimientoj = centroCentro;

		} else if (sinespacios.equalsIgnoreCase("centroDerecha")) {
			movimientoj = centroDerecha;

		} else if (sinespacios.equalsIgnoreCase("abajoIzquierda")) {
			movimientoj = abajoIzquierda;

		} else if (sinespacios.equalsIgnoreCase("abajoCentro")) {
			movimientoj = abajoCentro;

		} else if (sinespacios.equalsIgnoreCase("abajoDerecha")) {
			movimientoj = abajoDerecha;

		} else {
			movimientoj = -1;
		}
		if (o1 == -1) {
			o1 = movimientoj;

		} else if (x1 != -1 && o2 == -1) {
			o2 = movimientoj;
		} else if (x2 != -1 && o3 == -1) {
			o3 = movimientoj;
		}
		return movimientoj;

	}

	public static boolean usuarioMueveFicha(String movimiento, char[] tablero) {
		boolean mueve = false;

		if (tablero[conviertePosicionMovimiento(movimiento)] != 'O'
				&& tablero[conviertePosicionMovimiento(movimiento)] != 'X') {
			mueve = true;
			return mueve;
		}

		return mueve;

	}

	public static boolean ganaPrograma(int x1, int x2, int x3) {
		boolean gana = false;
		if ((x1 == 1 || x1 == 0 || x1 == 2) && (x2 == 1 || x2 == 0 || x2 == 2) && (x3 == 1 || x3 == 0 || x3 == 2)) {
			gana = true;
			return gana;
		} else if ((x1 == 3 || x1 == 4 || x1 == 5) && (x2 == 3 || x2 == 4 || x2 == 5)
				&& (x3 == 3 || x3 == 4 || x3 == 5)) {
			gana = true;
			return gana;
		} else if ((x1 == 6 || x1 == 7 || x1 == 8) && (x2 == 6 || x2 == 7 || x2 == 8)
				&& (x3 == 6 || x3 == 7 || x3 == 8)) {
			gana = true;
			return gana;
		} else if ((x1 == 0 || x1 == 3 || x1 == 6) && (x2 == 0 || x2 == 3 || x2 == 6)
				&& (x3 == 0 || x3 == 3 || x3 == 6)) {
			gana = true;
			return gana;
		} else if ((x1 == 1 || x1 == 4 || x1 == 7) && (x2 == 1 || x2 == 4 || x2 == 7)
				&& (x3 == 1 || x3 == 4 || x3 == 7)) {
			gana = true;
			return gana;
		} else if ((x1 == 5 || x1 == 8 || x1 == 2) && (x2 == 5 || x2 == 8 || x2 == 2)
				&& (x3 == 5 || x3 == 8 || x3 == 2)) {
			gana = true;
			return gana;
		} else if ((x1 == 4 || x1 == 0 || x1 == 8) && (x2 == 4 || x2 == 0 || x2 == 8)
				&& (x3 == 4 || x3 == 0 || x3 == 8)) {
			gana = true;
			return gana;
		} else if ((x1 == 4 || x1 == 6 || x1 == 2) && (x2 == 4 || x2 == 6 || x2 == 2)
				&& (x3 == 4 || x3 == 6 || x3 == 2)) {
			gana = true;
			return gana;
		}
		return gana;
	}

	public static boolean ganaUsuario(int o1, int o2, int o3) {
		boolean gana = false;
		if ((o1 == 1 || o1 == 0 || o1 == 2) && (o2 == 1 || o2 == 0 || o2 == 2) && (o3 == 1 || o3 == 0 || o3 == 2)) {
			gana = true;
			return gana;
		} else if ((o1 == 3 || o1 == 4 || o1 == 5) && (o2 == 3 || o2 == 4 || o2 == 5)
				&& (o3 == 3 || o3 == 4 || o3 == 5)) {
			gana = true;
			return gana;
		} else if ((o1 == 6 || o1 == 7 || o1 == 8) && (o2 == 6 || o2 == 7 || o2 == 8)
				&& (o3 == 6 || o3 == 7 || o3 == 8)) {
			gana = true;
			return gana;
		} else if ((o1 == 0 || o1 == 3 || o1 == 6) && (o2 == 0 || o2 == 3 || o2 == 6)
				&& (o3 == 0 || o3 == 3 || o3 == 6)) {
			gana = true;
			return gana;
		} else if ((o1 == 1 || o1 == 4 || o1 == 7) && (o2 == 1 || o2 == 4 || o2 == 7)
				&& (o3 == 1 || o3 == 4 || o3 == 7)) {
			gana = true;
			return gana;
		} else if ((o1 == 5 || o1 == 8 || o1 == 2) && (o2 == 5 || o2 == 8 || o2 == 2)
				&& (o3 == 5 || o3 == 8 || o3 == 2)) {
			gana = true;
			return gana;
		} else if ((o1 == 4 || o1 == 0 || o1 == 8) && (o2 == 4 || o2 == 0 || o2 == 8)
				&& (o3 == 4 || o3 == 0 || o3 == 8)) {
			gana = true;
			return gana;
		} else if ((o1 == 4 || o1 == 6 || o1 == 2) && (o2 == 4 || o2 == 6 || o2 == 2)
				&& (o3 == 4 || o3 == 6 || o3 == 2)) {
			gana = true;
			return gana;
		}
		return gana;
	}
}
