
public class Vehiculos {
	private String marca;
	private String matricula;
	private int numKm;
	private String fechaMatriculacion;
	private String descripcion;
	private double precio;
	private String nombrePropietario;
	private String dniPropietario;

	/**
	 * 
	 */
	public Vehiculos() {
		super();
	}

	public Vehiculos(String marca, String matricula, int numKm, String fechaMatriculacion, String descripcion,
			double precio, String nombrePropietario, String dniPropietario) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.numKm = numKm;
		this.fechaMatriculacion = fechaMatriculacion;
		this.descripcion = descripcion;
		this.precio = precio;
		this.nombrePropietario = nombrePropietario;
		this.dniPropietario = dniPropietario;
	}

	public Vehiculos(Vehiculos transporte) {
		super();
		this.marca = transporte.marca;
		this.matricula = transporte.matricula;
		this.numKm = transporte.numKm;
		this.fechaMatriculacion = transporte.fechaMatriculacion;
		this.descripcion = transporte.descripcion;
		this.precio = transporte.precio;
		this.nombrePropietario = transporte.nombrePropietario;
		this.dniPropietario = transporte.dniPropietario;

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumKm() {
		return numKm;
	}

	public void setNumKm(int numKm) {
		this.numKm = numKm;
	}

	public String getFechaMatriculacion() {
		return fechaMatriculacion;
	}

	public void setFechaMatriculacion(String fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

	public String getDniPropietario() {
		return dniPropietario;
	}

	public void setDniPropietario(String dniPropietario) {
		this.dniPropietario = dniPropietario;
	}

	public int getAnios(String fechamat) {
		
		int fecha=Integer.parseInt(fechamat);
		int anioActual=2022;
		int cont=0;
		if(fecha<anioActual) {
			for(int i=fecha;i<=anioActual;i++) {
				cont++;
			}
		}else if(fecha==anioActual) {
			return cont;
		}else {
			return cont;
		}
		return cont;
	}
}
