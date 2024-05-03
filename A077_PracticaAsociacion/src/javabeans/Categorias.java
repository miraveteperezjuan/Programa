package javabeans;

import java.util.Objects;
import java.util.List;

public class Categorias {
	
	private int IdCategoria;
	private String categoria;
	private List<Circuito> circuito;
	
	public Categorias() {
		super();
	}

	public Categorias(int idCategoria, String categoria, List<Circuito> circuito) {
		super();
		IdCategoria = idCategoria;
		this.categoria = categoria;
		this.circuito = circuito;
	}

	public int getIdCategoria() {
		return IdCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		IdCategoria = idCategoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<Circuito> getCircuito() {
		return circuito;
	}

	public void setCircuito(List<Circuito> circuito) {
		this.circuito = circuito;
	}

	@Override
	public int hashCode() {
		return Objects.hash(IdCategoria);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categorias other = (Categorias) obj;
		return IdCategoria == other.IdCategoria;
	}

	@Override
	public String toString() {
		return "Categorias [IdCategoria=" + IdCategoria + ", categoria=" + categoria + ", circuito=" + circuito + "]";
	}
	
	
	
}
