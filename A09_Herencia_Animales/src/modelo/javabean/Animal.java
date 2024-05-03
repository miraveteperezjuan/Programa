package modelo.javabean;

import java.util.Objects;

public class Animal {
	
	protected String especie;
	protected int patas;
	protected String nombre;
	
	/* 
	 * 
	 * Cuando un miembro de una clase es declarado como "protected", significa que ese miembro es accesible
	 *  desde la misma clase, desde las clases derivadas (subclases) y también desde otras 
	 *  clases dentro del mismo paquete (en algunos lenguajes). 
	 */
	
	public Animal(String especie, int patas, String nombre) {
		super();
		this.especie = especie;
		this.patas = patas;
		this.nombre = nombre;
	}

	public Animal() {
		super();
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(especie);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(especie, other.especie);
	}

	@Override
	public String toString() {
		return "Animal [especie=" + especie + ", patas=" + patas + ", nombre=" + nombre + "]";
	}

	public String sonido(){
		return "Soy un animal generido y rujo";
	}
	
	public String medioLocomocion(){
		return "Soy un animal generido y tengo muchos medios para moverme";
	}

	public String nombrecillo() {
		return "Soy un animal generido de esta especie y me llamo " + nombre;
	}
	

}
