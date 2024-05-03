package ejecutable;

import java.util.Scanner;

public class PruebaString5Scanner {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		
		String nombre = leer.nextLine(); //el next coge hasta el primer token. hasta el blanco. El nextline recupera todo y hasta que das al enter. Coge todo.
		System.out.println ("Me han escrito: " + nombre);
		
		int i = leer.nextInt(); //por cada scaneer se necesitara uno de estos.
		System.out.println ("Me han escrito: " + i);//la clase escaner lo crearon para recibir un int o un dable 
		//o lo que sea y te lo pasan con lo que te lo han pasado.

	}

}
