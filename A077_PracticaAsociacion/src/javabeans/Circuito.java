package javabeans;

import java.util.Objects;

public class Circuito {
	
	private int IdCircuito;
	private String nombre;
	private int laps;
	private String modalidad;
	private País pais;
	
	public Circuito() {
		super();
	}

	public Circuito(int idCircuito, String nombre, int laps, String modalidad, País pais) {
		super();
		IdCircuito = idCircuito;
		this.nombre = nombre;
		this.laps = laps;
		this.modalidad = modalidad;
		this.pais = pais;
	}

	public int getIdCircuito() {
		return IdCircuito;
	}

	public void setIdCircuito(int idCircuito) {
		IdCircuito = idCircuito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLaps() {
		return laps;
	}

	public void setLaps(int laps) {
		this.laps = laps;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public País getPais() {
		return pais;
	}

	public void setPais(País pais) {
		this.pais = pais;
	}

	@Override
	public int hashCode() {
		return Objects.hash(IdCircuito);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circuito other = (Circuito) obj;
		return IdCircuito == other.IdCircuito;
	}

	@Override
	public String toString() {
		return "Circuito [IdCircuito=" + IdCircuito + ", nombre=" + nombre + ", laps=" + laps + ", modalidad="
				+ modalidad + ", pais=" + pais + "]";
	}
	

}
