package javabeans;

import java.util.Objects;

public class Pilotos {
	
	private String nombre;
	private String apellido;
	private String edad;
	private int titulos;
	private Equipos equipos;
	
	public Pilotos() {
		super();
	}

	public Pilotos(String nombre, String apellido, String edad, int titulos, Equipos equipos) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.titulos = titulos;
		this.equipos = equipos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public int getTitulos() {
		return titulos;
	}

	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}

	public Equipos getEquipos() {
		return equipos;
	}

	public void setEquipos(Equipos equipos) {
		this.equipos = equipos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pilotos other = (Pilotos) obj;
		return Objects.equals(apellido, other.apellido);
	}

	@Override
	public String toString() {
		return "Pilotos [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", titulos=" + titulos
				+ ", equipos=" + equipos + "]";
	}
	
	

}
