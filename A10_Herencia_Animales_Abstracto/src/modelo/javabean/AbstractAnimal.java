package modelo.javabean;

import java.util.Objects;

public abstract class AbstractAnimal { //ojo con lo de poner abastract muy importante
	
	protected String especie;
	protected int patas;
	protected String nombre;
	
	public AbstractAnimal(String especie, int patas, String nombre) {
		super();
		this.especie = especie;
		this.patas = patas;
		this.nombre = nombre;
	}

	public AbstractAnimal() {
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
		AbstractAnimal other = (AbstractAnimal) obj;
		return Objects.equals(especie, other.especie);
	}
	//El tu string ya no valdría para nada ya que no se podrá ejecutar en la vida
	
	
	/*@Override
	public String toString() {
		return "Animal [especie=" + especie + ", patas=" + patas + ", nombre=" + nombre + "]";
	}
*/
	public abstract String sonido();
	
	public abstract String medioLocomocion();

	public abstract String saludo();
	
	// Una clase abstracta debe tener unos contructores porque el construye sus partes.
	
	// Tiene datos privados sigue teniendo la clase principal donde están los datos.
	
	// a los que hereda de el aporta sus get y set.

}
