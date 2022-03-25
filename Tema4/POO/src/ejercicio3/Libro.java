package ejercicio3;

public class Libro {
	private String titulo;
	private String autor;
	private int numEjemplares;
	private int numEjemplaresPrestados;

	// CONSTRUCTOR POR DEFECTO
	public Libro() {
		super();
	}

	// CONSTRUCTOR CON PARAMETROS
	public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}

	// GETTERS Y SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public int getNumEjemplaresPrestador() {
		return numEjemplaresPrestados;
	}

	public void setNumEjemplaresPrestador(int numEjemplaresPrestados) {
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}

	// METODO PRESTAMO
	public boolean prestamo() {
		boolean prestamo = true;
		if (numEjemplares <= 0) {
			return prestamo = false;
		} else {
			numEjemplaresPrestados ++;
			numEjemplares--;
		}

		return prestamo;

	}

	
	//METODO DEVOLUCION
	public boolean devolucion() {
		boolean devolucion=true;
		
		if (numEjemplaresPrestados <= 0) {
			return devolucion = false;
		} else {
			numEjemplaresPrestados --;
			numEjemplares++;
		}
		
		
		return devolucion;
	}

	@Override
	public String toString() {
		return "Libro se llama " + titulo + ",con el autor" + autor + ", tiene " + numEjemplares
				+ " ejemplares y estan prestados" + numEjemplaresPrestados;
	}
	
	
}
