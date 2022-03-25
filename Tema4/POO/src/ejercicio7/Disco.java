package ejercicio7;

public class Disco {
	
	private String codigo="LIBRE", autor, titulo,genero;
	private int duracion;
	
	public Disco() {}

	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
		super();
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}
	
	public Disco(Disco copia) {
		codigo=copia.codigo;
		autor=copia.autor;
		titulo=copia.titulo;
		genero=copia.genero;
		duracion=copia.duracion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Codigo: " + codigo + "\n Autor:" + autor + "\n Titulo:" + titulo + "\n Genero:" + genero
				+ "\n Duracion: " + duracion;
	}
	
}
