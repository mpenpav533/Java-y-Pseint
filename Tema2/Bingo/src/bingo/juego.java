package bingo;
import java.util.Scanner;

public class juego {
	static String carton1[][]=new String[3][5];
	static String carton2[][]=new String[3][5];
	static boolean validarCarton1[] = new boolean[3]; 
	static boolean validarCarton2[] = new boolean[3]; 
	static boolean bola[] = new boolean[50];
	static int aleatorio;
	static int i;
	static int dinerojd1=0;
	static int dinerojd2=0;
	static int linea=100;
	static int bingo=500;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		Scanner sm=new Scanner(System.in);
 //intcarton para poner aleatorio los numeros de los cartones
		intcarton();
// comienzo para imprimir el comienzo del juego
		comienzo();
		String tecla=sn.next();

		while(dinerojd1<600 && dinerojd2<600) {
			//empezamos mostrando los cartones
			cartones();
			//sacamos bola
			System.out.println("Pulsa la tecla s para sacar bola:");
			String p=sm.next();
			bola();
			//comprobamos la jugada
			jugada();
		}
		
		
		sn.close();
	}
	//Aleatoriedad de los cartones
	public static void intcarton() {
		//aleatoriedad de los cartones
		/*for (int i=0; i<3; i++) {
			carton1[i][0]=(int)Math.floor(Math.random()*9+1)+"";
			carton1[i][1]=(int)Math.floor(Math.random()*9+10)+"";
			carton1[i][2]=(int)Math.floor(Math.random()*9+20)+"";
			carton1[i][3]=(int)Math.floor(Math.random()*9+30)+"";
			carton1[i][4]=(int)Math.floor(Math.random()*9+40)+"";
			
			validarCarton1[i] = false;
		}

		for (int i=0; i<3; i++) {
			carton2[i][0]=(int)Math.floor(Math.random()*9+1)+"";
			carton2[i][1]=(int)Math.floor(Math.random()*9+10)+"";
			carton2[i][2]=(int)Math.floor(Math.random()*9+20)+"";
			carton2[i][3]=(int)Math.floor(Math.random()*9+30)+"";
			carton2[i][4]=(int)Math.floor(Math.random()*9+40)+"";
			*
			
			validarCarton2[i] = false;
		}
		*/
		int num=10;
		for (int j=0;j<3;j++) {
			carton1[j][0]=(int)Math.floor(Math.random()*9+1)+"";
			carton2[j][0]=(int)Math.floor(Math.random()*9+1)+"";
			/*validarCarton1[j] = false;
			validarCarton2[j] = false;*/
		}
		for (int i=1; i<5; i++) {
			for (int j=0;j<3;j++) {
				carton1[j][i]=(int)Math.floor(Math.random()*9+num)+"";	
				carton2[j][i]=(int)Math.floor(Math.random()*9+num)+"";
				/*validarCarton1[j] = false;
				validarCarton2[j] = false;*/
			}
			num+=10;
				
			
		}
		validarCarton1[i] = false;
		validarCarton2[i] = false;
			
	}
	//Motrar el comienzo
public static void comienzo() {
		System.out.println("******BINGO IES MARTÍNEZ MONTAÑÉS******");
		for (int i=0;i<16;i++) {
			System.out.print(" ");
		}
		System.out.println("PREMIOS");
		for (int i=0;i<15;i++) {
			System.out.print(" ");
		}
		System.out.println("Línea: 100 $");
		for (int i=0;i<15;i++) {
			System.out.print(" ");
		}
		System.out.println("Bingo: 500 $");
		System.out.println("Pulsa la tecla s para continuar:");
	}
	//tirar la bola
	public static void bola() {
		
		
		//String s=sn.nextLine();
		aleatorio=(int)Math.floor(Math.random()*(49-1)+1);
		//Comprueba hasta que encuentre un valor a false, es dcir, una bola que no ha salido
		do{
			
			aleatorio=(int)Math.floor(Math.random()*(49-1)+1);
			
			}while(bola[aleatorio]);
		//Damos valor para comprobar en futuras veces que esa bola ya ha salido
		bola[aleatorio] = true;
		
		System.out.println("Ha salido el número "+aleatorio);
		
	}
	//mostar los cartones
	public static void cartones(){
		/*Para mostrar los cartones*/
		
		for (int i=0; i<20;i++) {
			System.out.print("-");
			
		}System.out.println();
		
		for (int i=0;i<5;i++) {
			System.out.print(" ");
		}
		//monstramos el carton del jugador 1 y comprobamos si tiene linea o bingo
		System.out.println("Jugador 1");
		for (int i=0; i<20;i++) {
			
			System.out.print("-");
			
		}System.out.println();

		for (int i=0;i<carton1.length;i++) {
			
			for(int j=0; j<carton1[0].length;j++) {
				System.out.print(carton1[i][j]+" | ");
			}
			System.out.println();
		}
		lineajd1();
		bingojd1();
		//monstramos el carton del jugador 2 y comprobamos si tiene linea o bingo
		for (int i=0; i<20;i++) {
			System.out.print("-");
			
		}System.out.println();
		for (int i=0;i<5;i++) {
			System.out.print(" ");
		}
		System.out.println("Jugador 2");
		for (int i=0; i<20;i++) {
			
			System.out.print("-");
			
		}System.out.println();
		for (int i=0;i<carton2.length;i++) {
			
			for(int j=0; j<carton2[0].length;j++) {
				System.out.print(carton2[i][j]+" | ");
			}
			System.out.println();
			
		}
		lineajd2();
		bingojd2();
		//si algun jugador ha cantado alguna de las dos cosas comprobamos el dinero e imprimimos el total de cada uno
		if(dinerojd1!=0||dinerojd2!=0) {
			dineroacu();
		}
		
	}
	//Hacer la jugada
	public static void jugada() {
// comprobamos si el numero sacado esta en los cartones de los jugadores
		for(int i=0;i<carton1.length;i++) {
			for(int j=0; j<carton1[0].length;j++) {
				if ((aleatorio+"").equals(carton1[i][j])) {
					carton1[i][j]="X";
				}
			}
		}
		for(int i=0;i<carton2.length;i++) {
			for(int j=0; j<carton2[0].length;j++) {
				if ((aleatorio+"").equals(carton2[i][j])) {
					carton2[i][j]="X";
						
				}
			}
		}
		
	}
	//comprobar si jugador uno ha hecho linea
	public static void lineajd1() {
		boolean esLinea = false;
		//Comprobamos si anteriormente ha sacado alguna linea
		for (int i=0; i<validarCarton1.length;i++) {
			if(validarCarton1[i]) {
				esLinea= true;
			}
		}
	//comprobamos la linea
		for (int i=0; i<3;i++) {
			if (carton1[i][0]=="X" && carton1[i][1]=="X"&& carton1[i][2]=="X"&& carton1[i][3]=="X"&& carton1[i][4]=="X") {
				
				//Si no ha sacado linea con anterioridad, mostramos el mensaje
				if(!esLinea) {
					System.out.println("El jugador 1 ha cantado Línea.");
					dinerojd1=dinerojd1+linea;
				}
				
				validarCarton1[i] = true;
			}
		}
		
	}
	//comprobar si jugador dos ha hecho linea
	public static void lineajd2() {
		boolean esLinea = false;
		//Comprobamos si anteriormente ha sacado alguna linea
		for (int i=0; i<validarCarton2.length;i++) {
			if(validarCarton2[i]) {
				esLinea= true;
			}
		}
//comprobamos la linea
		for (int i=0; i<3;i++) {
			if (carton2[i][0]=="X" && carton2[i][1]=="X" && carton2[i][2]=="X" && carton2[i][3]=="X" && carton2[i][4]=="X") {
				
				//Si no ha sacado linea con anterioridad, mostramos el mensaje
				if(!esLinea) {
					System.out.println("El jugador 2 ha cantado Línea.");
					dinerojd2 = dinerojd2 + linea;
				}
				
				validarCarton2[i] = true;
			}
		}
	}
	//ver dinero acumulado de los dos jugadores
	public static void dineroacu() {
		System.out.println("Dinero acumulado");
		System.out.println("-----------------");
		System.out.println("Jugador 1: "+ dinerojd1 + "$");
		System.out.println("Jugador 2: "+ dinerojd2 + "$");
	}
	//comprobar si jugador 2 ha hecho bingo
	public static void bingojd2() {
		boolean esBingo= true;
		for(int i = 0 ; i < validarCarton2.length ; i++) {
			//Si hay alguno linea que no haya sido cantada, no hay bingo
			if(!validarCarton2[i]) {
				esBingo = false;
			}
		}
		
		if(esBingo) {
			System.out.println("El jugador 2 ha cantado Bingo");
			dinerojd2 = dinerojd2 + bingo;
		}
		
	}
	//comprobar si jugador 1 ha hecho bingo
	public static void bingojd1() {
		boolean esBingo = true;
		
		for(int i = 0 ; i < validarCarton1.length ; i++) {
			//Si hay alguno linea que no haya sido cantada, no hay bingo
			if(!validarCarton1[i]) {
				esBingo = false;
			}
		}
		
		if(esBingo) {
			System.out.println("El jugador 1 ha cantado Bingo");
			dinerojd1 = dinerojd1 + bingo;
		}
	}
}