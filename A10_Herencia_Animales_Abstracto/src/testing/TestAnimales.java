package testing;



import java.util.LinkedList;
import java.util.List;

import modelo.javabean.AbstractAnimal;
import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Gato;
import modelo.javabean.Perro;
import modelo.javabean.Persona;
import modelo.javabean.Profesor;

public class TestAnimales {

	public static void main(String[] args){
		/*AbstractAnimal animal = new AbstractAnimal("Una", 4, "Juancho"); //el primer principio de una clase abstracta es hacer un new
		
		System.out.println("Esto es un animal");
		System.out.println(animal.sonido());
		System.out.println(animal.nombrecillo());
		System.out.println(animal.medioLocomocion());
		
		*/
		Gato gato = new Gato("Fekux", 4, "Patillas ", 7);
		System.out.println(gato.sonido());
		System.out.println(gato.saludo());
		System.out.println(gato.medioLocomocion());
		gato.perderVidas(2);
		System.out.println(gato.getVidas());
		
		
		System.out.println("Esto es el perro");

		Perro perro = new Perro("Can Hobors", 4, "Sultan", "Galgo");
		System.out.println(perro.sonido());
		System.out.println(perro.saludo());
		System.out.println(perro.medioLocomocion());
		System.out.println(perro.darLaPata());
		
		AbstractAnimal p2 = new Perro("Can Hobors", 4, "Jerusalen", "Salchicha");
		//te complicar la vida porque con la p2, 

		
		
		//si creo una array de animal puedo meter variables de perro y gato
		
		List<AbstractAnimal> zoo = new LinkedList<>(); //con esto la variable y metodos son los mismos y todo funciona igual.
		
		
		//en un arraylist de animal me entran las variables de cualquier tipo de la superclase y de todas las clases inferiores.
		//yo voy a tener una coleccion de animales. voy a meter del padre del abstracto
		
		zoo.add(p2); //variable de tipo abastracto que hace un perro
		zoo.add(gato); 
		zoo.add(perro);
		
		System.out.println("Esto es la lista de animales");
		for (AbstractAnimal ele: zoo) { //recorro elemento elemento la colección y yo de cada uno vere su sonido y su medio de locomocion. Estos son los polimorficos.
			System.out.println(ele.sonido());
			System.out.println(ele.medioLocomocion());
			if (ele instanceof Perro) //si es una instancia de perro, entonces
				System.out.println(((Perro)ele).darLaPata()); //esto tiene que salir true true dos veces.
			else if (ele instanceof Gato)
				System.out.println(((Gato)ele).getVidas()); //cuando demos cuando esten los datos saldran las vidas.
			//instanceof solo sirve para clase no para int double o string.
			//esto se hace en contadas ocasiones.
		}	
		
		/*
		 for (Persona per: personas) {
		        if (tipoPersona.equalsIgnoreCase("Profesor") && per instanceof Profesor)
		            aux.add(per);
		        else if (tipoPersona.equalsIgnoreCase("Alumno") && per instanceof Alumno)
		        	aux.add(per);
		        else if (tipoPersona.equalsIgnoreCase("Administrativo") && per instanceof Administrativo) {
		        	aux.add(per);
		        }
		    }
		    return aux;
		*/
		/*
		 *  if (else intanceof Perro)
		 *  
		 *  o
		 *  
		 *  if (ele intanceof Gato)
		 *  
		 *  Lo qe no se puede preguntar nunca es decir a la primera de cambio if (ele intanceof Abstract)
		 *  si esto es el superpadre esto te da error. es imposble porque es abstracto y no puede haber instancia.
		 */
		
	}
	
	
}
