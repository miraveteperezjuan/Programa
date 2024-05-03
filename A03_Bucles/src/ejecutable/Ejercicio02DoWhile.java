package ejecutable;

import java.util.Scanner;

public class Ejercicio02DoWhile {
	
	/*
	 *   contar y sumar los números introduccido por teclado hasta sacar un número negativo.
	 *   Este metodo es otra forma para hacerlo. pero a tomas no le gusta mucho.
	 *   
	 *   JAVA NUNCA DICE DE HACER EL DO WHILE. DICE DE HACER FOR O WHILE PERO NUNCA DO WHILE.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		int numeroleido = 0, suma = 0, cuantos = 0;
		
		System.out.println ("Introduzca los números:");
		
		do { //hay que preguntar dos veces una en el do y la otra en el while. Pyton no lo tinee por ejemplo
			numeroleido = leer.nextInt();
			if (numeroleido >= 0) {
				cuantos++;
				suma += numeroleido;
			}
			
		} while (numeroleido >= 0);
			
		System.out.println ("Estadisticas");
		System.out.println ("Suma de numerosleidos: " + suma);
		System.out.println ("Numeros Procesados: " + cuantos);
	}
	
}