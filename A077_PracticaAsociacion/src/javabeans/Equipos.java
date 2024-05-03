package javabeans;

import java.util.Objects;

public class Equipos {
	
	private int IdEquipo;
	private String nombre;
	private String motor;
	private String principalSponsor;
	private Categorias categorias;
	private Pilotos pilotos;
	
	public Equipos() {
		super();
	}

	public Equipos(int idEquipo, String nombre, String motor, String principalSponsor, Categorias categorias,
			Pilotos pilotos) {
		super();
		IdEquipo = idEquipo;
		this.nombre = nombre;
		this.motor = motor;
		this.principalSponsor = principalSponsor;
		this.categorias = categorias;
		this.pilotos = pilotos;
	}

	public int getIdEquipo() {
		return IdEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		IdEquipo = idEquipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getPrincipalSponsor() {
		return principalSponsor;
	}

	public void setPrincipalSponsor(String principalSponsor) {
		this.principalSponsor = principalSponsor;
	}

	public Categorias getCategorias() {
		return categorias;
	}

	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}

	public Pilotos getPilotos() {
		return pilotos;
	}

	public void setPilotos(Pilotos pilotos) {
		this.pilotos = pilotos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(IdEquipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipos other = (Equipos) obj;
		return IdEquipo == other.IdEquipo;
	}

	@Override
	public String toString() {
		return "Equipos [IdEquipo=" + IdEquipo + ", nombre=" + nombre + ", motor=" + motor + ", principalSponsor="
				+ principalSponsor + ", categorias=" + categorias + ", pilotos=" + pilotos + "]";
	}
	
	

}
