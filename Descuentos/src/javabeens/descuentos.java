package javabeens;

import java.util.Scanner;

public class descuentos {
	
	public static void main(String[] args) {
		
		String marca;
		Scanner leer = new Scanner (System.in);
		System.out.println("Introduce la marca");
		marca = leer.next();
		switch(marca) {
		case "nike", "dunkin":
			System.out.println("BBVA - 10%");
			break;
		case "booking":
			System.out.println("BBVA - 4%");
			break;
		case "goiko":
			System.out.println("BBVA - 15%, Mapfre - 20%");
			break;
		case "iryo":
			System.out.println("BBVA - 12%");
			break;
		default:
            System.out.println("Marca no reconocida");
		}
		
		leer.close();
		
	}

}
