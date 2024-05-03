package ejecutables;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		char [] generos = {'h','H','m','M','e'};
		
		for (int i=0; i < generos.length; i++) { //empiezo en 0 y luego la longitud de i hata el final, y luego incrementar de uno en uno para que vaya uno por uno.
			System.out.println(generos[i] + " - " + literalgenero(generos[i])); //generos representa cada uno de ellos.
			// cuando la posicion si importa utilzizar este porque de esta manera puedo marcar los rangos que quiero dodne empiece y de donde acabe.
		}
		for (char genero: generos) { //cuando la posicion no importa este.
			System.out.println(genero + " - " + literalgenero(genero));
		}
	}

	
	public static String literalgenero(char genero) {
		String literal = null;
		
		switch (genero) {
		case 'M': case 'm': //poner una comilla y no dos.
			literal = "mujer";
			break;
		case 'H': case 'h': //poner una comilla y no dos.
			literal = "hombre";
			break;
		default: 
			literal = "No es nada";
		}
		
		return literal; //esto lo devuelve cuando esta lleno
	}
}
