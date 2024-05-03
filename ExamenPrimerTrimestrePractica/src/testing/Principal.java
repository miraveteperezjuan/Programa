package testing;

import javabeans.Producto;

public class Principal {

	public static void main(String[] args) {

		Producto p3 = new Producto(3,"Camiseta",14,20,"S","Negra");
		System.out.println(p3.toString());
		
		Producto p4 = new Producto(4,"Sudadera",25,100,"XL","Roja");
		System.out.println(p4.toString());
		
	
		System.out.println(p4.precioConIva(21));

	}

}
