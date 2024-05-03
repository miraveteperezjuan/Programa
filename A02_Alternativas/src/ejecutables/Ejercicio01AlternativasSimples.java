package ejecutables;

import java.util.Scanner;

public class Ejercicio01AlternativasSimples {

	public static void main(String[] args) {
		int edad = 0;
		Scanner leer = new Scanner(System.in);

		System.out.println("Introduce tu edad: ");
		edad = leer.nextInt();
		
		if (edad >= 18) //Si quiero meter cualquier cosa dentro del If será a través de llaves.
			System.out.println("Eres mayor de 18");
		
		System.out.println("Con el Else");
			
		if (edad >= 18) //si en la rama del else se pone debajo o lo que sea a través de llaves no sale o si sale
			System.out.println("Eres mayor de 18");
		else {
			System.out.println("Eres menor de 18");
			System.out.println("A beber agua");
		}
		
		System.out.println("Fin de programa");
	}
}