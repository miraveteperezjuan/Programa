package ejecutable;

import java.util.Scanner;

public class PruebaString3Equals {

	public static void main(String[] args) {
		
		
		Scanner leer = new Scanner(System.in);
		String nombre = null;
		nombre = leer.next(); 
		
		if (nombre.equals("juan")) //ningun string es igual uno con otro. dos objetos de la misma clase 
			//siempre se comparan con equals. tambien se podria hacer nombre1 y nombre 2, se podria hacer eso if (nombre1.equals(nombre2)) si se qiere comparar 
		System.out.println ("Son iguales");
		else
		System.out.println ("Son distintos");

	}

}
