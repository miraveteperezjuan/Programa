package test;

import javabeans.Libro;

public class TestIgualdad {

	public static void main(String[] args) {
		
		Libro libro = new Libro(1, "hhh", "jjj","hahah" ,201);
		Libro libro2 = new Libro(2, "hhh", "jjj","hahah" ,201);
		Libro libro3 = libro; //libro 2 no apunta a ningun sitio. al decir libro 2, es igual a libro. el igual 
		//de libro se lo trae abajo a libro2.
		
		System.out.println(libro.equals(libro3)); //libro 2 entra al metodo y el libro es quien invoca al metodo.
		System.out.println(libro.hashCode());
		System.out.println(libro2.hashCode());
		
		if (libro.hashCode() == libro2.hashCode())
			System.out.println("Los dos son iguales");
		else 
			System.out.println("No son iguales");
		
		//todas las clases que implementan list tiran de equals.
		//todas las que tiran de set, tiran de hashcode.
	}

}
 