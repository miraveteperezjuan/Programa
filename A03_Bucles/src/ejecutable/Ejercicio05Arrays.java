package ejecutable;

public class Ejercicio05Arrays {

	public static void main(String[] args) {
		
		/*
		 * Array es un campo simple o compuesto que se repite N veces en memoria.
		 * En java se define primero el tipo...int, char, boolean, string...cualquier tipo. [] nombrearray = {y poner aqui lo que queramos para que lo recorra}
		 * La posicion empieza en 0 no en 1. Es decir que si tengo 8 elementos va a leer 7 elementos.
		 * 
		 */

		
		int [] numeros = {2,3,4,5,6,7,8}; //lo de los corchetes son los elementos de un array y en la linea 27 en vez de numero le gusta poner ele.
		
		for (int i = 0; i < numeros.length; i++) { //el numeros lent es preguntar si uno es menor que siete por ejemplo
			
			System.out.println (i + " -> " + numeros[i] );
			
		}
		
		//System.out.println ("El valor de i " + i); //para que tuviera sentido tendria que estar declarada o dentro de los corchetes.
		System.out.println (numeros.length); //esto hace que me lea todo el array.
		System.out.println ("Recorrer sin posicion");
		
		for (int numero: numeros) { //este for empezara en la posicion 0 y a traves de esta variable le podre hacer pregutaas
			// el int es determinar de que tipo es el array. double, int...o lo que sea. lo mismo que el comienzo del array linea 15. el ultimo es el nombre del array, lo que se itera.
			//y el numero de enmedio con los puntos es como quieres que se llame aqui durante el bucle a cada variable/entero de los que hay arriba.
			
			System.out.println ("El número contiene: " + numero);
			
		}
	// la primera vez me enseña en la posicion en la que está cada numero pero en la segunda vez no me lo dice. directamente me dice lo que hay en la posicion.
		// estor for siempre se hacen en la convicion de cuando estén llenos, si esta sin completar te puedes llevar sorpresa.
	}

}
 