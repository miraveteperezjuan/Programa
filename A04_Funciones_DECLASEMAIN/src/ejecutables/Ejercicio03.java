package ejecutables;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		//primero definir variables
		Scanner leer = new Scanner(System.in);
		String nombre = null, ap1 = null, ap2 = null; //se pone null para marcar que el campo está vacio.
		String genero = null;
		double sumaSalarios = 0, salario = 0;
		int hombres = 0, mujeres = 0;
		
		//cuerpo del ejercicio
		nombre = leer.next();
		while (!nombre.equalsIgnoreCase("Fin")) { //si nombre es igual a fin no entrara nunca y aparecera eso y si pongo otra cosa guay
			//Si el nombre no es igual a fin entrara con la mierda del signo de exclamacion sino sera al reves
			ap1 = leer.next();
			ap2 = leer.next();
			salario = leer.nextDouble();
			genero = leer.next();
			
			switch(genero) {
			case "M": case "m": //Esto es para sumar una mujer o un hombre para lo de abajo
				mujeres++;
			case "H": case "h":
				hombres++;
			}
			
			System.out.println(nombreCompleto(nombre, ap1, ap2));
			System.out.println(literalgenero(genero));
			System.out.println(tiposalario(salario));
			
			sumaSalarios += salario;
			nombre = leer.next(); //Esto es para que se vuelva a reepetir desde el principio.
			
		}
		
		//estadisticas
		System.out.println("Estadisticas:");
		System.out.println("Suma de salarios: " + sumaSalarios);
		System.out.println("Hombres: " + hombres);
		System.out.println("Mujeres: " + mujeres);
		
		//leer.close(); //Para cerrar el scanner siempre se pone la variable que va dentro del scanner y luego close.
		
		leer.close();
		
	}
	
	public static String nombreCompleto(String nombre, String ap1, String ap2) {
		
		
		return ap1.toUpperCase() + " " + ap2.toUpperCase() + ", " + nombre.toUpperCase(); //devuelve el valor convertido en mayusculas.
		
		
	}
	
public static String tiposalario(double salario) { //si no se devuelve nada seria void. 
	//Si no string. Luego el nombre del metodo y luego el parametro y si no tiene seria parentesis parentesis
		
		//los rangos no entran en los swich
		
		String literal = null; //null apunta que no va a ningun sitio, mucho mejor que poner la doble comilla
		
		if (salario < 20_000)
			literal = "Salario bajo";
		else if (salario >= 20_000 && salario <= 40_000)
			literal = "Salario medio";
		else if (salario > 40_000 && salario <= 70_000)
			literal = "Salario alto";
		else
			literal = "Salario muy alto";
		
		return literal;
		
	}
	
	public static String literalgenero(String genero) { //Se cambia a string para que lo lea y esté chachi
		String literal = null;
		
		switch (genero) {
		case "M": case "m": //poner una comilla y no dos.
			literal = "mujer";
			break;
		case "H": case "h": //poner una comilla y no dos.
			literal = "hombre";
			break;
		default: 
			literal = "No es nada";
		}
		return literal;
	}
}
