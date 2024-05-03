package modelo.javabean;

/*
 * 10-4-2024
 * 
 * Yo heredo de una clase abstracta (animal) y esta puede tener metodos y atributos.
 * 
 * Una clase abstracta llevada al extremo, es un interface. 
 * Un interface es un tipo de fichero public interface nombre.
 * Dentro de un interface es que todos los metodos son publicos y abtractos. todos. 
 * 
 * publico y abstracto significa tipo_dato nombreMetodo y tiene o no (lista de parametros);
 * 
 * como todos son publicos y abastractos de alli se quita el abstract y al poner interface no hace falta ponerle nada de nada.
 * public static final nombre = long nombre = 1l; extens solo de una clase. SOLO hay herencia simple. 
 * Nosotros solo heredamos de una clase y de esta manera tambien se puede implements todos los interfaces que quiera y que me hagan falta y necesite.
 * 
 * hay un metodo que es comparablem otro serializable, otro runnable, otro que se llama list, set, map...
 * comparable solo tiene un metodo que se llama compareTo. 
 * serializable no tinee metodos tiene solo el serialVersion que es un atributo.
 * runnable solo tiene un metodo. que se llama run()
 * list - tiene un monton de metodos
 * set - tiene los mismos que list pero menos.
 * map - tiene otro monton de metodos
 * 
 * 
 *	yo tengo un interface que es List<E> Se pone e de elemento.
 *	Esta clase lo impleneta unas clases que son abstractas. LLamadas AbstractCollect. Y este lo implementa a list<e>
 *
 * por abajo aparecen las clases concretas. como por ejemplo arraylist, linkedList, y otros dos 
 * vector, stack.
 * 
 * list aporta todos los metodos de cualquier coleccion que implementa a list. por tanto, array, linked, vector y stack tienen los mismos metodos que list.
 * 
 * Por la propiedad de la herencia puedo hacer lo siguiente, 
 * 
 * 
 */

/*

10-4-2024
Voy a explicar el concepto de herencia utilizando clases abstractas e interfaces.
Clases abstractas:
Son clases que pueden tener métodos y atributos, pero no pueden ser instanciadas directamente.
Interfaces:
Son como clases abstractas extremadamente puras.
Un interface es un tipo de archivo definido con la palabra clave interface.
Dentro de un interface, todos los métodos son públicos y abstractos.
Esto significa que no necesitamos escribir public abstract antes de los métodos, solo su firma.
Al usar interface, automáticamente todos los métodos se consideran públicos y abstractos.
Herencia en Java:
En Java, solo se permite herencia simple, es decir, una clase puede heredar de una sola clase, pero puede implementar múltiples interfaces.
Interfaces predefinidas:
En Java, hay varias interfaces predefinidas con un propósito específico:
Comparable: Define un método compareTo para comparar objetos.
Serializable: No tiene métodos, solo un atributo serialVersion.
Runnable: Define el método run para ejecutar una tarea.
List, Set, Map, etc.: Interfaces que definen métodos para diferentes tipos de colecciones de datos.
Implementación de interfaces:
Por ejemplo, List<E> es una interfaz que define métodos para listas de elementos.
Esta interfaz es implementada por clases abstractas como AbstractCollection, que a su vez implementa List<E>.
Clases concretas:
Debajo de estas clases abstractas, encontramos clases concretas como ArrayList, LinkedList, Vector y Stack.
Estas clases concretas implementan los métodos definidos en las interfaces mencionadas anteriormente.
Beneficios de la herencia e implementación de interfaces:
Debido a la herencia, las clases concretas heredan los métodos definidos en las interfaces y las clases abstractas.
Esto proporciona consistencia en el comportamiento, ya que todas las clases implementan los mismos métodos definidos en las interfaces.
¡La herencia y las interfaces son fundamentales en Java para lograr la reutilización de código y la coherencia en el diseño de programas!
*/

public class Perro extends AbstractAnimal {

	//Una interfaz es una clase abstracta a nivel maximo porque todos los metodos son abstractos
	
	
	private String raza;
	
	public Perro(){ //invoco al contructor vacio de mi padre
		super();
	}

	public Perro(String especie, int patas, String nombre, String raza) {
		super(especie, patas, nombre);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", especie=" + especie + ", patas=" + patas + ", nombre=" + nombre + "]";
	}
	
	//se puede redefinir metodos y declararlos abastractos. Metodos mios + los de mi padre.

	//esto son los metodos del padre porque nos obligan y nos obligan lo que tengo que hacer
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "yo digo guau";
	}

	@Override
	public String medioLocomocion() {
		// TODO Auto-generated method stub
		return "Normalmente lo mio es correr";
	}

	@Override
	public String saludo() {
		// TODO Auto-generated method stub
		return "Soy un" + raza + "me llamo " + nombre + "y digo hola";
	}
	
	public boolean darLaPata() {
		return true;
	}
	
	//En herencia el de arriba puede ser concreto y heredar de el. 

}
