package test;

import java.util.ArrayList;

import javabeans.Libro;

public class TestLibroArrayList {

	public static void main(String[] args) {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		//pintamos los libros
		libros.add(new Libro(1L, "Deportes", "Juan", "Paraninfo", 123)); 
		libros.add(new Libro(2L, "Arte", "Elmi", "Cuarzo", 14)); 
		libros.add(new Libro(3L, "Caza", "Manu", "Editorial", 521)); 
		libros.add(new Libro(4L, "Sabendas", "Lester", "Cosain", 7893));
		
		
		for (Libro libro: libros) { //recorre todo el array en todas las posiciones
			System.out.println(libro);
		}
		
		System.out.println("Libro en posición 2: " + libros.get(2));
		
		Libro lib = (new Libro(4L, "Sabendas", "Lester", "Cosain", 7893));
		//modificar un libro por otro.
		int posicion = libros.indexOf(lib); //esto lo que hace es que cambia de sitio con el de arriba. si es posicion distinto a -1 apunta al nuevo.
		if(posicion != -1)
			libros.set(posicion, lib);
		for (Libro libro: libros) { //recorre todo el array en todas las posiciones
			System.out.println(libro);
		}
		libros.remove(lib); //esto lo que hace es cargarselo el numero 4.
		for (Libro libro: libros) { //recorre todo el array en todas las posiciones
			System.out.println(libro);
		}
		
		//el unoL es para indicar que es un long
		//el new se va a la memoria y crea un libro con todos los datos que le damos.
		 
	}

}
