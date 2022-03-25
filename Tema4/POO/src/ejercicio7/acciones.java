package ejercicio7;

import java.util.Scanner;

public class acciones {

	static int num = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Disco[] disco = new Disco[100];
		int res;
		for (int i = 0; i < num; i++) {
			disco[i] = new Disco();
		}

		do {
			System.out.println("COLECCION DE DISCOS");
			System.out.println("===================");
			System.out.println("1. Listado.");
			System.out.println("2. Nuevo Disco.");
			System.out.println("3. Modificar.");
			System.out.println("4. Borrar.");
			System.out.println("5. Salir.");

			System.out.print("Elige una opcion(1,2,3,4,5):");
			res = sn.nextInt();
			int cont;
			String codigoIntro, autorIntro, tituloIntro, generoIntro,duracionstring;
			int duracionIntro;
			int libre;
			int modi;
			int borra;
			switch (res) {
			case 1:
				System.out.println("\nListado");
				System.out.println("===========");
				for (int i = 0; i < num; i++) {
					if (!disco[i].getCodigo().equalsIgnoreCase("LIBRE")) {
						System.out.println(disco[i]);
					}

				}
				break;
			case 2:
				System.out.println("\n Nuevo Disco");
				System.out.println("=============");
				libre = -1;
				do {
					libre++;
				} while (!disco[libre].getCodigo().equalsIgnoreCase("LIBRE"));
				sn.nextLine();
				System.out.print("\nCodigo:");
				codigoIntro = sn.nextLine();
				System.out.print("\nAutor:");
				autorIntro = sn.nextLine();
				System.out.print("\nTitulo:");
				tituloIntro = sn.nextLine();
				System.out.print("\nGenero:");
				generoIntro = sn.nextLine();
				System.out.print("\nDuracion:");
				duracionIntro = sn.nextInt();

				disco[libre].setCodigo(codigoIntro);
				disco[libre].setAutor(autorIntro);
				disco[libre].setTitulo(tituloIntro);
				disco[libre].setGenero(generoIntro);
				disco[libre].setDuracion(duracionIntro);
				break;
			case 3:

				System.out.println("\nModificar");
				System.out.println("===========");
				System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
				sn.nextLine();
				codigoIntro = sn.nextLine();
				modi = -1;
				do {
					modi++;
				} while (!((disco[modi].getCodigo()).equals(codigoIntro)));
				System.out.println("Introduce los nuevos datos o pulsa INTRO para saltarlo.");
				System.out.println("Codigo: "+disco[modi].getCodigo());
				System.out.print("Introduce el nuevo codigo.");
				codigoIntro = sn.nextLine();
				if (!codigoIntro.equals("")) {
					disco[modi].setCodigo(codigoIntro);
				}
				
				System.out.println("Autor: "+disco[modi].getAutor());
				System.out.print("Introduce el nuevo autor.");
				autorIntro = sn.nextLine();
				if (!autorIntro.equals("")) {
					disco[modi].setAutor(autorIntro);
				}
				
				System.out.println("Titulo: "+disco[modi].getTitulo());
				System.out.print("Introduce el nuevo titulo.");
				tituloIntro = sn.nextLine();
				if (!tituloIntro.equals("")) {
					disco[modi].setTitulo(tituloIntro);
				}
				
				System.out.println("Genero: "+disco[modi].getGenero());
				System.out.print("Introduce el nuevo genero.");
				generoIntro = sn.nextLine();
				if(!generoIntro.equals("")) {
		        	disco[modi].setGenero(generoIntro);
		        }
				
				System.out.println("Duracion: "+disco[modi].getDuracion());
				System.out.print("Introduce la nueva duracion.");
				duracionstring = sn.nextLine();
				if(!duracionstring.equals("")) {
		        	disco[modi].setDuracion(Integer.parseInt(duracionstring));
		        }
				break;
			case 4:
				sn.nextLine();
				System.out.println("\nBorrar");
				System.out.println("===========");
				System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
				codigoIntro = sn.nextLine();
				borra = -1;
				do {
					borra++;
				} while (!((disco[borra].getCodigo()).equals(codigoIntro)));
				disco[borra].setCodigo("LIBRE");
				System.out.println("Disco borrado");
				break;

			}
		} while (res!=5);
	}

}
