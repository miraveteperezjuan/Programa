package ejecutable;

import java.util.Scanner;

/* 
 * Pedimos por pantalla un nombre y una contraseña:
a. si el nombre coincide con “elmo”, preguntamos por la contraseña y si coincide con “elmito”, escribimos el
mensaje “usuario y contraseña correctas, bienvenido a la aplicación”
b. Si el nombre NO es “elmo” Escribimos usuario incorrecto”
c. Si el nombre es correcto y la contraseña NO, Escribimos “contraseña incorrecta"
 */

public class Ejercicio09 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		String usuario, contra;
		System.out.println("Nombre de usuario");
		usuario = leer.next();
		
		if (usuario.equals("elmo")){ //NO SE PUEDE UTILIZAR == NI COSAS DE ESAS PARA COMPRARAR CADENAS DE TEXTO
			System.out.println("Introduzca la contraseña:");
			contra = leer.next();
		if (contra.equals("elmito")) //PARA HACER LA COMPARACION DE QUE QUIERO UN IGUAL TENDRE QUE AGREGAR AL ATRIBUTO EL TEMA DE EQUALS.
			System.out.println("Contraseña correcta. Bienvenido a la app");
		else
			System.out.println("Contraseña incorrecta");
		}else 
			System.out.println("Usuario incorrecto");
		
		leer.close();
	}

}
