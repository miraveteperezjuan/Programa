package ejecutable;

import java.util.Scanner;

//Leer por consola la letra correspondiente al sexo “H” o “h” para Hombre y “M” o “m” para mujer, y Escribir el literal correspondiente

public class ejercicio04y05 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		String opcion;
		System.out.println("Dime el sexo");
		opcion = leer.next();
		
		switch(opcion) { //un caso por letra. Aqui no funciona la variable or o and. Ponerlo uno por uno o toodo seguido.
		case "H": case "h":
			System.out.println("Hombre");
			break;
		case "M": case "m":
			System.out.println("Mujer");
			break;
		case "E": case "e":
			System.out.println("No binario");
			break;
		default:
			System.out.println("No lo has introducido bien");

	}
		
	}

}
