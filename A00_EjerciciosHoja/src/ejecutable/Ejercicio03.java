package ejecutable;

import java.util.Scanner;

public class Ejercicio03 {
	
public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		int radio = 0;
		
		System.out.println("Introduzca el primer número");
		radio = leer.nextInt();
		
		double circunferencia = 2*Math.PI*radio;
		double area = Math.PI*radio;
		
		System.out.println("La circunferencia es: " + circunferencia);
		System.out.println("El area es: " + area);
		
}

}
