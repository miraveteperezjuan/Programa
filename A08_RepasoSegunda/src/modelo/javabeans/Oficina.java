package modelo.javabeans;

import java.util.Objects;

public class Oficina {
	
	private int IdOficina;
	private String nombre;
	private String direccion;
	private Banco banco;
	
	public Oficina(int idOficina, String nombre, String direccion, Banco banco) {
		super();
		IdOficina = idOficina;
		this.nombre = nombre;
		this.direccion = direccion;
		this.banco = banco;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Oficina() {
		super();
	}

	public int getIdOficina() {
		return IdOficina;
	}

	public void setIdOficina(int idOficina) {
		IdOficina = idOficina;
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

	@Override
	public int hashCode() {
		return Objects.hash(IdOficina);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oficina other = (Oficina) obj;
		return IdOficina == other.IdOficina;
	}

	@Override
	public String toString() {
		return "Oficina [IdOficina=" + IdOficina + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
}
