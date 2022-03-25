package ejercicio2;

public class Contador {
	private int cont;

	// CONSTRUCTOR POR DEFECTO
	public Contador() {
		super();
	}

	//CONSTRUCTOR CON PARAMETROS
	public Contador(int cont) {
		super();
		if (cont < 0) {
			this.cont = 0;
		} else {
			this.cont = cont;
		}
	}
	//CONSTRUCTOR COPIA
	public Contador(Contador copia) {
		cont = copia.cont;
	}

	
	//GETTER Y SETTER
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	//METODO INCREMENTA
	public int incrementa() {
		cont++;
		return cont;
		
	}
	
	//METODO DECREMENTA
	public int decrementa() {
		if(cont<=0) {
			cont=0;
		}else {
			cont--;
		}
		return cont;
	}
	
	
}
