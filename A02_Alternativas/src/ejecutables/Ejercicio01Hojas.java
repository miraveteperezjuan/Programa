package ejecutables;

import java.util.Scanner;

public class Ejercicio01Hojas {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca el primer número");
		int lado1 = leer.nextInt();
		
		System.out.println("Introduzca el segundo número");
		int lado2 = leer.nextInt();
		
		System.out.println("Introduzca el tercer número");
		int lado3 = leer.nextInt();
		
		if (lado3 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
			if (lado1 == lado2 && lado2 == lado3)
				System.out.println("Es equilátero");
			else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
			    System.out.println("Es isosceles");
			else
				System.out.println("Escaleno");
		}
		else {
			System.out.println("No es válido");
		}
		leer.close();

	}

}