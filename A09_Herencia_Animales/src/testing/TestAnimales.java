package testing;

import java.util.ArrayList;
import java.util.List;

import modelo.javabean.Animal;
import modelo.javabean.Gato;

public class TestAnimales {

	public static void main(String[] args){
		Animal animal = new Animal("Una", 4, "Juancho");
		
		System.out.println("Esto es un animal");
		System.out.println(animal.sonido());
		System.out.println(animal.nombrecillo());
		System.out.println(animal.medioLocomocion());
		
		
		Gato gato = new Gato("Fekux", 4, "Patillas ", 7);
		System.out.println(gato.sonido());
		System.out.println(gato.nombrecillo());
		System.out.println(gato.medioLocomocion());
		gato.perderVidas(2);
		System.out.println(gato.getVidas());
		
		
		System.out.println("Esto es de rarito");

		Animal g2 = new Gato("Felix Silvestre", 4, "Sonia", 6); //todo se me ejecuta en lo que aparece en la derecha
		//en herencia a los elementos del padre se le llama poliformifoco a este se le llama de la misma forma. una sola llamada, sonido, saludo etcetc, es polimorfo.
		//si es new gato o lo que fue este ejecutara esto u lo otro.
		//en java una variable siempre es lo que pone en la izquierda.
		//cuando es de una clase y veo un punto veo los atributos y clases de a mi izquierda.
		System.out.println(g2.sonido());
		System.out.println(g2.nombrecillo());
		System.out.println(g2.medioLocomocion());
		((Gato)g2).perderVidas(2); //primero la clase donde esta el metodo, el objeto y se pone la funcion a realizar.
		System.out.println(((Gato)g2).getVidas()); //se repite lo mismo para que salga reflejado, sino se raya
		
		//si creo una array de animal puedo meter variables de perro y gato
		
		List<Animal> animales = new ArrayList<Animal>();
		animales.add(g2);
		animales.add(animal);
		animales.add(gato);
		
		
		System.out.println("Esto es la lista de animales");
		for (Animal ele: animales) {
			System.out.println(ele.sonido());
			System.out.println(ele.medioLocomocion());
		}
		
	}
	
	
}
