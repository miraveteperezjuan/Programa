package modelo.javabean;

import java.util.Objects;

public abstract class Persona {
	
	/*
	 * Cuando un miembro de una clase es declarado como "protected", significa que ese miembro es accesible
	 * desde la misma clase, desde las clases derivadas (subclases), y, también desde otras 
	 * clases dentro del mismo paquete (en algunos lenguajes). 
	 * 
	 */

	protected String nif;
	protected String nombre;
	protected String direccion;
	protected String telefono;
	
	//Constructor con todo
	
	public Persona(String nif, String nombre, String direccion, String telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	//constructor vacío
	
	public Persona(){
		super();
	}

	//get y set
	
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
 
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	//equals y hashCode con el NIF. Determinan si dos objetos son iguales comparando sus NIF.

	@Override
	public int hashCode() {
		return Objects.hash(nif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(nif, other.nif);
	}
	
	//Método propio. Llamamos a p que es la perosna a la que vamos a llamar. El this hace referencia a la perosna que va a realizar la llamada. 
	
	public String llamar(Persona p) {
		return this.nombre + "llamando a" + p.getNombre();
	}
	
	//Método llamado trabajar que es publico y abstracto y cualquier clase que lo tenga puede utilizarlo. Abstracto porque no tiene una implementación definida.
	public abstract String trabajar();

	
	//toString con todo
	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]";
	}

}
