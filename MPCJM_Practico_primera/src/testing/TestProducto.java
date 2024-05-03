package testing;

import javabeans.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto p1 = new Producto();
		
		p1.setNumeroProducto(1);
		p1.setDescripcion("Camiseta");
		p1.setPrecioUnitario(19);
		p1.setCantidadStock(100);
		p1.setTalla("M");
		p1.setColor("Blanco");
		
		System.out.println(p1.getNumeroProducto());
		System.out.println(p1.getDescripcion());
		System.out.println(p1.getPrecioUnitario());
		System.out.println(p1.getCantidadStock());
		System.out.println(p1.getTalla());
		System.out.println(p1.getColor());
		
		Producto p2 = new Producto(2,"Camisa",25,75,"L","Azul Marino");
		
		System.out.println(p2.getNumeroProducto());
		System.out.println(p2.getDescripcion());
		System.out.println(p2.getPrecioUnitario());
		System.out.println(p2.getCantidadStock());
		System.out.println(p2.getTalla());
		System.out.println(p2.getColor());
		
		Producto p3 = new Producto(3,"Camiseta",14,20,"S","Negra");
		System.out.println(p3.toString());
		
		Producto p4 = new Producto(4,"Sudadera",25,100,"XL","Roja");
		System.out.println(p4.toString());
		
		//prueba de metodos IVA, aumentarStock y disminuir
		
		System.out.println("Precio con IVA (21%) del artículo 1: " + p1.precioConIva(21));
		System.out.println("Precio con IVA (21%) del artículo 2: " + p2.precioConIva(21));
		System.out.println("Precio con IVA (21%) del artículo 3: " + p3.precioConIva(21));
		System.out.println("Precio con IVA (21%) del artículo 4: " + p4.precioConIva(21));
		
		p1.aumentarStock(5);
		p2.aumentarStock(10);
		p3.aumentarStock(20);
		p4.aumentarStock(10);
		
		System.out.println("Stock aumentado del artículo 1: " + p1.getCantidadStock());
		System.out.println("Stock aumentado del artículo 2: " + p2.getCantidadStock());
		System.out.println("Stock aumentado del artículo 3: " + p3.getCantidadStock());
		System.out.println("Stock aumentado del artículo 4: " + p4.getCantidadStock());
		
		boolean resultado1, resultado2, resultado3, resultado4;
		resultado1 = p1.disminuirStock(2);
		resultado2 = p2.disminuirStock(5);
		resultado3 = p3.disminuirStock(50);
		resultado4 = p4.disminuirStock(7);
		
		System.out.println("Stock disminuido del artículo 1: " + p1.getCantidadStock());
		System.out.println("Operación de disminuirStock exitosa: " + resultado1);
		System.out.println("Stock disminuido del artículo 2: " + p2.getCantidadStock());
		System.out.println("Operación de disminuirStock exitosa: " + resultado2);
		System.out.println("Stock disminuido del artículo 3: " + p3.getCantidadStock());
		System.out.println("Operación de disminuirStock exitosa: " + resultado3);
		System.out.println("Stock disminuido del artículo 4: " + p4.getCantidadStock());
		System.out.println("Operación de bajar exitosa: " + resultado4);
		
		Producto[] productos = {
				new Producto(1, "Camiseta", 19, 100, "XS", "Azul"),
                new Producto(2, "Camisa", 25, 75, "S", "Gris"),
                new Producto(3, "Camiseta", 14, 20, "L", "Blanco"),
                new Producto(4, "Sudadera", 25, 100, "XXL", "Blanco")
		};
		
		 for (Producto camisa: productos) { //este for recorre el array y permite ver todas las tallas
	            System.out.println("Precio aplicado por cambio de talla de " + camisa.getDescripcion() + " " + camisa.getTalla() + ": " + camisa.precioAplicado()+ "€");
	        }


}
	
}
