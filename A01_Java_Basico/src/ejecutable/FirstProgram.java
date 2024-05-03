package ejecutable;

public class FirstProgram {
// todo va en argumentos "main" todo va dentro de esas cosas.
// Main es un metodo println tiene parentesis pero lo que lleva un punto por delante y por detras atributo. Si lleva parentesis es un metodo. args es atributo. 
// un metodo apegado al ultimo caracter va apegado al ultimo parenteesis de abre. y args cierra por tanto mal.
// String es una clase por ejemplo. Lo que va en minusculas y no tiene parentesis es atributo. Las clases siempre hay que ponerlas en mayus
	
	public static void main (String[] args) { //lo que va en parentesis es el metodo y args es el atributo.
		int num1 = 0, num2 = 18, num3 = 7;
		double real1 = 12.89, real2 = 1.932;
		char letra = 'c'; //Se utiliza poco porque de normal aunque sea para un caracter se utiliza el string
		boolean esiste = false; 
		String nombre = "Elmo";
		
		System.out.println ("Hola me llamo: " + nombre);
		System.out.println ("Elmo es" + esiste);
		System.out.println (letra);
		System.out.println (real1 + real2);
		System.out.println (num1 / num2 + num3);
	}
}
 