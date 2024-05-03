package ejercicios;
import java.util.Scanner;

/*
 * @author: Juan Manuel Miravete Pérez del Corral - DAM
 * @version: 1.0
 * 
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		String usuario, contra;
		System.out.println("Introduzca el nombre de usuario:");
		usuario = leer.next();
		
		if (usuario.equals("sara")){
			System.out.println("Introduzca la contraseña:");
			contra = leer.next();
		if (contra.equals("sarita"))
			System.out.println("Contraseña correcta. Bienvenido a la aplicación");
		else
			System.out.println("Contraseña incorrecta");
		} else 
			System.out.println("Usuario incorrecto");
		
		leer.close();
	}

}
