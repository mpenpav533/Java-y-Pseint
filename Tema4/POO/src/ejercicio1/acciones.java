package ejercicio1;

import java.util.Scanner;

public class acciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);

		// creacion de la cuenta1
		Cuenta cuenta1 = new Cuenta();

		// introduccion de valores de cuenta1

		System.out.println("Introduce los valores que se piden de la cuenta.");
		System.out.print("Nombre del cliente: ");
		String nombre = sn.nextLine();
		cuenta1.setNombre_Cliente(nombre);
		System.out.print("Numero de la cuenta: ");
		String num = sn.nextLine();
		cuenta1.setNum_Cuenta(num);
		System.out.print("Tipo de interes: ");
		double inte = sn.nextDouble();
		cuenta1.setTipo_Interes(inte);
		System.out.print("Saldo: ");
		double sald = sn.nextDouble();
		cuenta1.setSaldo(sald);

		// MOSTRAR LOS VALORES DE CUENTA1
		System.out.println("Mostramos la informacion introducida.");

		System.out.println("Nombre del cliente: " + cuenta1.getNombre_Cliente());

		System.out.println("Numero de la cuenta: " + cuenta1.getNum_Cuenta());

		System.out.println("Tipo de interes: " + cuenta1.getTipo_Interes());

		System.out.println("Saldo: " + cuenta1.getSaldo());

		// CREACION DE CUENTA2 CON PARAMETROS
		Cuenta cuenta2 = new Cuenta("Juan Fernández Rubio", "1234567890", 1.75, 300);

		// CREACION DE CUENTA3 COMO COPIA
		Cuenta cuenta3 = new Cuenta(cuenta1);

		// REALIZAR UN INGRESO Y MOSTRAR
		System.out.println("Vamos a realizar un ingreso en cuenta1");
		cuenta1.ingreso(300);
		System.out.println("Su saldo actual es:" + cuenta1.getSaldo());

		// MOSTRAR DATOS DE CUENTA2
		System.out.println("Mostramos la informacion de la cuenta dos.");

		System.out.println("Nombre del cliente: " + cuenta2.getNombre_Cliente());

		System.out.println("Numero de la cuenta: " + cuenta2.getNum_Cuenta());

		System.out.println("Tipo de interes: " + cuenta2.getTipo_Interes());

		System.out.println("Saldo: " + cuenta2.getSaldo());

		// MOSTAR DATOS CUENTA3

		System.out.println("Mostramos la informacion de la cuenta3.");

		System.out.println("Nombre del cliente: " + cuenta3.getNombre_Cliente());

		System.out.println("Numero de la cuenta: " + cuenta3.getNum_Cuenta());

		System.out.println("Tipo de interes: " + cuenta3.getTipo_Interes());

		System.out.println("Saldo: " + cuenta3.getSaldo());

		// TRANSFERENCIA DE CUENTA3 A CUENTA2 DE DIEZ EUROS

		System.out.println("Realizamos una transferencia de la cuenta3 a cuenta2.");
		cuenta3.transferencia(cuenta2, 10);
		System.out.println("El saldo actual de cuenta2 es:" + cuenta2.getSaldo());

		// MOSTRAR SALDO CUENTA3

		System.out.println("El saldo actual de cuenta3 es:" + cuenta3.getSaldo());
sn.close();
	}

}
