package test;

import java.util.ArrayList;
import java.util.List;

import javabeans.Libro;

public class BusquedasDeLibrosArrayList {

	public static void main(String[] args) {
		List<Libro> libros = new ArrayList<Libro>();
		
		//aqui lo que tenemos es un repositorio de libros en Memoria.
		libros.add(new Libro(1L, "Deportes", "Juan", "Paraninfo", 123)); 
		libros.add(new Libro(2L, "Arte", "Elmi", "Paraninfo", 14)); 
		libros.add(new Libro(3L, "Caza", "Manu", "Editorial", 521)); 
		libros.add(new Libro(4L, "Sabendas", "Lester", "Planeta", 7893));
		
		/**
		 * Buscar un libro, pero me dan solo el ISBN.
		 * FindById. (recibe un long isbn y te responde con un libro. Si el libro no existe deberia de volver nulo)
		 */
		
		long isbnBuscar = 3;
		//el size nos dice cuantos hay
		boolean existe = false;
		for(int i = 0; i<libros.size() ;i++) {
			if(libros.get(i).getIsbn() == isbnBuscar) {//los get son una variable que apunta al objeto que estamos apuntando.
				System.out.println("El libro buscado es: " + libros.get(i));
				existe = true;
				break;
			}
		}
		if (!existe) //para saber si el libro buscado existe o no existe. Si no existe se mete al if.
			System.out.println("Este libro no existe");
		
		//forma 2 de buscar uno
		System.out.println("Parte dos de buscar");
		Libro libroABuscar = new Libro();
		libroABuscar.setIsbn(isbnBuscar);
		int pos = libros.indexOf(libroABuscar); //dime la posicion en memoria de libro a buscar. IndexOf siempre se marcara con lo del -1
		
		if (pos != -1) //esto significa que lo ha encontrado porque si posicion es distinta de -1
			System.out.println("Libro buscado = :" + libros.get(pos));
		else
			System.out.println("Libro no encuentro");
		
		/**
		 * Buscar libros por editorial.
		 * Los vamos a meter en otra coleccion para un tratamiento posterior.
		 * Los almaceno para que en un proceso posterior los pueda pintar.
		 */
		
		ArrayList<Libro> aux = new ArrayList<Libro>();
		
		for (Libro libro: libros) { //el array list original tiene Libro, a cada uno le llamo libro que vaya encontrando que es como se llama la clase
			//libros es la coleccion
			if (libro.getEditorial().equals("Paraninfo")) //si la editorial de libro es igual que planeta lo añado al auxiliar.
				aux.add(libro); //para encontrar el libro. alñado el libro al auxiliar y luego le doy a verlo.
		}
		System.out.println("Pintar los libros de una editorial solicitada por consola");
		
		for(Libro libro: aux)
			System.out.println(libro); //el de arriba los busca y este los pinta.
		
	}

}
