package javabeans;

public class Producto {
	
	private int numeroProducto;
	private String descripcion;
	private double precioUnitario;
	private int cantidadStock;
	private String talla;
	private String color;
	
	public Producto() {
		super();
	}
	
	public Producto(int numeroProducto, String descripcion, double precioUnitario, int cantidadStock, String talla,
			String color) {
		super();
		this.numeroProducto = numeroProducto;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.cantidadStock = cantidadStock;
		this.talla = talla;
		this.color = color;
	}
	
	public int getNumeroProducto() {
		return numeroProducto;
	}
	public void setNumeroProducto(int numeroProducto) {
		this.numeroProducto = numeroProducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public int getCantidadStock() {
		return cantidadStock;
	}
	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double precioConIva(int iva) {
		return precioUnitario * (1 + iva/100); //devolver el 21 porciento de IVA. 
	}
	
	public void aumentarStock(int cantidad) {
		cantidad++;
	}
	
	public boolean disminuirStock(int cantidad) {
		if (cantidadStock - cantidad < 0) {
			return false;
		}else cantidadStock -= cantidad;
			return true;
	}
	
	public double PrecioAplicado(){
		switch (talla) {
		case "XS":
            return precioUnitario;
		case "S": case "M": 
			return precioUnitario * (1 + 3 / 100);
		case "L": case "XL": 
			return precioUnitario * (1 + 3 / 100);	
		case "XXL": case "XXXL":
			return precioUnitario * (1 + 4 / 100);
		default:
			return precioUnitario;
		}
	}

	@Override
	public String toString() {
		return "Producto [numeroProducto=" + numeroProducto + ", descripcion=" + descripcion + ", precioUnitario="
				+ precioUnitario + ", cantidadStock=" + cantidadStock + ", talla=" + talla + ", color=" + color + "]";
	}
	

	

}
