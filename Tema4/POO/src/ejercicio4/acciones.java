package ejercicio4;

public class acciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SE CREAN 4 FRACCIONES
		Fraccion f1 = new Fraccion(1, 4);
		Fraccion f2 = new Fraccion(1, 2);
		Fraccion f3 = new Fraccion();
		Fraccion f4 = new Fraccion(4);

		// OPERACIONES ARITMETICAS CON ESAS FRACCIONES
		Fraccion suma = f1.suma(f2);
		Fraccion resta = f1.resta(f3);
		Fraccion producto = f1.multiplica(f4);
		Fraccion cociente = f1.dividir(f2);

		// MOSTRAR RESULTADOS

		System.out.println(f1 + " + " + f2 + " = " + suma);
		System.out.println(f1 + " - " + f3 + " = " + resta);
		System.out.println(f1 + " * " + f4 + " = " + producto);
		System.out.println(f1 + " / " + f2 + " = " + cociente);

	}

}
