package ejercicio8;

public class Pizza {
	private String tamanio;
	private String tipo;
	private String estado;
	private static int numPedidas = 0;
	private static int numServidas = 0;

	public Pizza() {
		super();
		Pizza.numPedidas++;
	}

	/**
	 * @param tamanio
	 * @param tipo
	 * @param estado
	 */
	public Pizza(String tamanio, String tipo) {
		super();
		this.tamanio = tamanio;
		this.tipo = tipo;
		this.estado = "pedida";
		Pizza.numPedidas++;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public static int getNumPedidas() {
		return numPedidas;
	}

	public static void setNumPedidas(int numPedidas) {
		Pizza.numPedidas = numPedidas;
	}

	public static int getNumServidas() {
		return numServidas;
	}

	public static void setNumServidas(int numServidas) {
		Pizza.numServidas = numServidas;
	}

	public void sirve() {
		if (this.estado.equals("pedida")) {
			this.estado = "servida";
			Pizza.numServidas++;
		}else {
			System.out.println("Esta pizza ya esta servida.");
		}
	}

	@Override
	public String toString() {
		return "Pizza " + tipo + " " + tamanio + ", " + estado;
	}

}
