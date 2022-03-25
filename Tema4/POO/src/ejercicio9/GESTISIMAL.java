package ejercicio9;

public class GESTISIMAL {
	private String codigo="LIBRE";
	private String descripcion;
	private double precioVenta;
	private int stock;
	/**
	 * @param codigo
	 * @param descripcion
	 * @param precioVenta
	 * @param stock
	 */
	
	public GESTISIMAL(String codigo, String descripcion, double precioVenta, int stock) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}
	/**
	 * 
	 */
	public GESTISIMAL() {
		super();
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		String salida="-Codigo: "+this.codigo;
		salida+="\n-Descripcion: "+this.descripcion;
		salida+="\n-Precio de Venta: "+this.precioVenta;
		salida+="\n-Stock:"+this.stock;
		return salida;
	}
	
	
}
