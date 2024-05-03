package ejecutable;

/*
 * Leer dos números y una palabra, y si la palabra es:
a. triangulo: calculas el área
b. rectángulo: el perímetro y el área
c. circulo: la circunferencia con el primer dato y el área circulo con el segundo
 */

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		int num1 = 0, num2 = 0; String opcion;
		
		System.out.println("Introduzca el primer número");
		num1 = leer.nextInt();
		System.out.println("Introduzca el segundo número");
		num2= leer.nextInt();
		System.out.println("¿Qué operación quieres realizar? ¿triangulo, rectanculo o circulo?");
		opcion = leer.next();
		
		switch(opcion) {
		case "triangulo":
			double triangulo = num1 * num2 / 2;
			System.out.println("El área del triángulo es: " + triangulo);
			break;
		case "rectangulo":
			double arectangulo = num1 * num2;
			double prectangulo = num1*2 + num2*2;
			System.out.println("El perímetro del rectángulo es: " + prectangulo + " y el área " + arectangulo);
			break;
		case "circulo":
			double circulocircu = 2*Math.PI*num1;
			double circuloarea = Math.PI*num2;
			System.out.println("El área del circulo es: " + circuloarea + " y su circunferencia es: " + circulocircu);
			break;
		default:
			System.out.println("Esa opción no está disponible");
			
		}
		
		leer.close(); //Esto es para cerrar el scanner.
	}

}
