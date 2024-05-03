package javabeans;

/**
 * @author JUAN MANUEL MIRAVETE PÉREZ DEL CORRAL
 * @version 1.0
 * @since 19-1-2024
 */

public class Producto {
	
	private int numeroProducto;
	private String descripcion;
	private double precioUnitario;
	private int cantidadStock;
	private String talla;
	private String color;
	
	//CONSTRUCTOR VACIO
	
	public Producto() {
		super();
	}
	
	//CONSTRUCTOR TOTAL
	
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
	
	//LOS SET Y GETTERS DE CADA UNO DE LOS PARÁMETROS
	
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
		return precioUnitario * (1 + (double) iva/100);
	}
	
	public void aumentarStock(int cantidad) {
        cantidadStock += cantidad;
    }
	
	 public boolean disminuirStock(int cantidad) {
		 if (cantidadStock - cantidad < 0) { //si cantidad de stock - cantidad es menor que cero devuelve falso.
		        return false;
		    } else {
		        cantidadStock -= cantidad;
		        return true;
		    }
	 }
	
	public double precioAplicado(){
		switch (talla) {
		case "XS":
            return precioUnitario;
		case "S": case "M": 
			return precioUnitario * 1.03;//ejemplo 100*1.03 = 103
		case "L": case "XL": 
			return precioUnitario * 1.03;	
		case "XXL": case "XXXL":
			return precioUnitario * 1.04;
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
