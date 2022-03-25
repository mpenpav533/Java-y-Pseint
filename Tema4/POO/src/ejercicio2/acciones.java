package ejercicio2;

public class acciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CREAMOS EL OBJETO CONTADOR
		Contador contador = new Contador();
		// ASIGNAMOS UN VALOR
		contador.setCont(5);
		// INCREMENTAMOS EL CONTADOR
		System.out.println("El valor actual del contador es: " + contador.getCont());
		System.out.println("Incrementamos el valor del contador");
		contador.incrementa();
		
		// MOSTRAMOS EL VALOR DESPUES DEL INCREMENTO
		System.out.println("El valor actual del contador es: " + contador.getCont());
		
		// INCREMENTAMOS EL VALOR DOS VECES
		System.out.println("Incrementamos de nuevo el valor, esta vez en dos");
		for (int i = 0; i < 2; i++) {
			contador.incrementa();
		}
		// MOSTRAMOS EL VALOR DESPUES DEL INCREMENTO
		System.out.println("El valor actual del contador 1 es: " + contador.getCont());

		// DECREMENTAMOS EL VALOR DEL CONTADOR

		System.out.println("Decrementamos  el valor en uno.");
		contador.decrementa();

		// MOSTRAMOS EL VALOR DESPUES DEL INCREMENTO
		System.out.println("El valor actual del contador 1 es: " + contador.getCont());

		//CREAMOS EL OBJETO CONTADOR2
		Contador contador2= new Contador(10);
		
		//INCREMENTAMOS Y DECREMENTAMOS EL OBJETO CONTADOR2
		
		// INCREMENTAMOS EL CONTADOR
		System.out.println("El valor actual del contador 2 es: " + contador2.getCont());
		System.out.println("Incrementamos el valor del contador 2");
		contador2.incrementa();
				
		// MOSTRAMOS EL VALOR DESPUES DEL INCREMENTO
		System.out.println("El valor actual del contador 2 es: " + contador2.getCont());
		
		// DECREMENTAMOS EL VALOR DEL CONTADOR

		System.out.println("Decrementamos  el valor en uno.");
		contador2.decrementa();

		// MOSTRAMOS EL VALOR DESPUES DEL INCREMENTO
		System.out.println("El valor actual del contador 2 es: " + contador2.getCont());
		
		//CREAMOS EL CONTADOR3 SIENDO UNA COPIA DEL CONTADOR2
		
		Contador contador3=new Contador(contador2);
		
		//MOSTRAMOS EL VALOR DEL CONTADOR3
		
		System.out.println("El valor actual del contador 3 es: " + contador3.getCont());
	}

}
