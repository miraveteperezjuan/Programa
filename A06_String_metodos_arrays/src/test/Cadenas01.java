package test;

import java.util.ArrayList;

public class Cadenas01 {

	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<String>(); //lo de dentro de los arrays son elementos
		//esto crea un array dentro.
		
		//la menera de representar un conjunto de repositorio de objetos de una clase en memoria es a través de colecciones
		// la cole mas simple es arraylist.
		nombres.add("Juan");
		nombres.add("Manuel"); //el add añade y admite repetidos. el size me dice cuantos hay y el get le damos la posicion de memoria y me dice que está
		nombres.add("Elmo");
		nombres.add("Orejitas");
		nombres.add("Piggel");
		
		//el metodo size nos dice cuantos string hay dentro.
		System.out.println("Cuantos hay : " + nombres.size());
		System.out.println("Leyendo con for i");
		//la otra manera de recorrer el array. necesito saber la posicion de memoria
		for(int i= 0; i< nombres.size(); i++) {
			System.out.println(nombres.get(i)); //asi te recorres el array entero.
		}
		
		//el otro for te recorre hasta el size
		System.out.println("Leyendo con for each");
		for(String nombre: nombres) {
			System.out.println(nombre);
		}
		
		System.out.println(nombres.get(1)); //esto te dice la posición y sirve para recorrer el array de la posicion de memoria para saber donde esta
		//si el get se pone en posicion incorreca salta el error gordo
		
		//como sabemos la posicion de memoria de un objeto
		int posicion = nombres.indexOf("Elmo"); //te dice en la posicion en la quqe se encuentra mientras que el indexlast del ultimo que ve.
		
		if (posicion != -1) //se hace el if para que no crash
		System.out.println(nombres.get(posicion)); //si no lo encuentra pondre -1
		else 
			System.out.println("Este contenido no existe");
	
		//el index busca siempre el primero. nunca se va a tener dos iguales
		
		//como hago para impedir que haya dos string iguales
		System.out.println(nombres.contains("Manuel")); //esto devuelve un bolean. Si lo encuentra true y si no false. Si existe o no existe.
		/**
		 * add unico con contains. pregunto si existe y si no existe lo añado.
		 */
		if (!nombres.contains("Elmo")) //con esto impido. solo quiero saber si esta o no.
			nombres.add("Elmo");
		//modificar, cambiar un objeto por otro.
		
		nombres.set(3, "Nene"); //comeinza desde el 1 no desde el 0
		
		nombres.remove(0);  //si le digo la posicion con numero igual.
		//nombres.clear();//esto lo deja vario.
		
		//el isEmpty te dice si esta vario o no en bolean el espacio
		
		for(String nombre: nombres) {
			System.out.println(nombre);
		}
		
		System.out.println(nombres);
		
	}

}
