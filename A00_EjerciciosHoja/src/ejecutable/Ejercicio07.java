package ejecutable;

import java.util.Scanner;

/*
 * Leemos un número y si es:
a. 1: Escribimos “uno”
b. 2: escribimos “dos”
c. 3: escribimos “Tres”
d. Cualquier otro número, escribimos “Otro número
 */

public class Ejercicio07 {

	public static void main(String[] args) {

		Scanner leer = new Scanner (System.in);
		String opcion = null;
		System.out.println("Escribe un número del uno al cuatro");
		opcion = leer.next();
		
		switch(opcion) {
		case "1":
			System.out.println("UNO");
			break; //esta palabra es que una vez que se cumple se para. En la última opción no hce falta poner nada
		case "2":
			System.out.println("DOS");
			break;
		case "3":
			System.out.println("TRES");
			break;
		case "4":
			System.out.println("CUATRO");
			break;
		default:
			System.out.println("Es otro número");

	}

}
	
}
