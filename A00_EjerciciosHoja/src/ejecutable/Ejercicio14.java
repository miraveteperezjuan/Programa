package ejecutable;

/*
 * Escribir los números múltiplos de 3 y de 7, que hay entre el 1 y el 250. Y además escribir al final,
cuántos de los 250 son:
a. Múltiplos de 3 y de 7.
b. Cuantos hay múltiplos de 3
c. Cuantos hay múltiplos de 7.
d. Cuantos no son múltiplos de ni de 3 ni de 7.
Ojo la suma de todos NO da 250. Tened en cuenta que por ejemplo el número 21, es múltiplo de 3 y 7 , por
tanto lo es de 3 y lo es de 7.
Recordar que un número es múltiplo de otro cuando al dividirlos su resto es cero.
 */

public class Ejercicio14 {

	public static void main(String[] args) {
		
	int leidos = 0, multi3 = 0, multi7 = 0, distinto = 0,  multi21 = 0;
		
		for (int i = 250; i >= 1; i++) {
			System.out.println (i);
			leidos++;
			
			if (i%3 == 0 && i%7 == 0){ //poner todo y dara guay
				multi21++;
			}else if (i%3 == 0) {
				multi3++;
			}else if (i%7 == 0) {
				multi7++;
			}else{
				distinto++;
			}
		}
		
		System.out.println ("Numeros leidos: " + leidos);
		System.out.println ("De ambos: " + multi21);
		System.out.println ("Son múltiplos de 7: " + multi3);
		System.out.println ("Son múltiplos de 3: " + multi7);
		System.out.println ("No son multiplos: " + distinto);

	}

}
