package test;

public class Cadenas011 {

	public static void main(String[] args) {

		String cadenas = "Hola soy Juan";
		String nombre = "Juan";
		System.out.println(cadenas.length()); //me dice cuantos caracteres hay
		System.out.println(cadenas.charAt(1)); //me devuelve la posicion del caracter
		System.out.println(cadenas.compareTo("Ilo"));//esto lo que hace es comparar. compara el objeto que tiene cadenas con lo que le llega aqui
		//si cadenas es menor de lo que meto en el compare da -1 si es igual 0 y si es mayor posiitvo.
		//primero espacios, luego numeros, luego mayusculas y luego mnusculas
		System.out.println(nombre.equals("Manuel"));
		System.out.println(cadenas.indexOf("soy"));//para saber la posicion
		System.out.println(cadenas.contains("Hola")); //si la palabra hola se encuentra en el string. Es un boolean que me dice si esta o no.
		System.out.println(cadenas.toUpperCase().contains("SOY"));
		System.out.println(cadenas.startsWith("Hola"));
		System.out.println(cadenas.endsWith("Juan"));
		//todos estos metodos son de objeto o de instancia y se necesita simpere que haya una variable string
		
		String [] palabras = cadenas.split(" "); //cada vez que esto detecta un espacio lo que hace es separar y recorrer el array.
		System.out.println(palabras.length); //te dice las palabras que hay dentro.
		for (String palabra: palabras) {
			System.out.println(palabra);
		}
		//esto son los metodos static. Esto son metodos de clase, no de objeto. Se pueden invocar desde la base
		String numero = String.valueOf(12); //el value para trasnmitir a string
		System.out.println(numero);
		
		
		
		
	}

}
