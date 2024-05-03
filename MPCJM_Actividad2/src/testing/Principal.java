package testing;

import java.time.LocalDateTime;
import java.time.Month;


import javabeans.Fiesta;

public class Principal {

	public static void main(String[] args) {
		
		LocalDateTime fechaHora1 = LocalDateTime.of(2023, Month.DECEMBER, 28, 22, 30);
		LocalDateTime fechaHora2 = LocalDateTime.of(2023, Month.DECEMBER, 30, 20, 00);
		LocalDateTime fechaHora3 = LocalDateTime.of(2023, Month.DECEMBER, 26, 17, 00);
		
		Fiesta fiesta1 = new Fiesta();
		fiesta1.setTipoFiesta("Disfraces");
		fiesta1.setBebidas(50);
		fiesta1.setBocadillos(20);
		fiesta1.setDireccion("Calle Alfonso, 33");
		fiesta1.setFechaHora(fechaHora1);
		fiesta1.setInvitados(10);
		
		
		//añadir a cuatro personas a la fiesta 1.
		fiesta1.invitar();
		fiesta1.invitar();
		fiesta1.invitar();
		fiesta1.invitar();
		
		Fiesta fiesta2 = new Fiesta("Cumpleaños", "Calle Don Jaime, 23", 30, 60, 15, fechaHora2);
		
		//quitar a dos personas de la fiesta 2.
		fiesta2.cancelarInvitacion();
		fiesta2.cancelarInvitacion();
		
		System.out.println("Fiesta 1:\n" + fiesta1.toString());
        System.out.println("Precio de la Fiesta 1: " + fiesta1.precioFiesta() + "€");
        
        System.out.println("\nFiesta 2:\n" + fiesta2.toString());
        System.out.println("Precio de la Fiesta 2: " + fiesta2.precioFiesta() + "€");
        
        
        Fiesta fiesta3 = new Fiesta();
        fiesta3.setTipoFiesta("Infantil");
		fiesta3.setBebidas(60);
		fiesta3.setBocadillos(40);
		fiesta3.setDireccion("Paseo Independencia, 2");
		fiesta3.setFechaHora(fechaHora3);
		fiesta3.setInvitados(25);
		
		System.out.println("\nPrecio de la Fiesta 3: " + fiesta3.precioFiesta() + "€");
		System.out.println(fiesta3.getTipoFiesta());
		System.out.println(fiesta3.getDireccion());
		System.out.println(fiesta3.getBocadillos());
		System.out.println(fiesta3.getBebidas());
		System.out.println(fiesta3.getInvitados());
		System.out.println(fiesta3.getFechaHora());
		fiesta3.invitar();
		fiesta3.invitar();
		fiesta3.cancelarInvitacion();
        
	}
	
}
