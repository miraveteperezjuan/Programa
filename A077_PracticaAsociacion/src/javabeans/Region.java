package javabeans;

import java.util.Objects;

public class Region {
	
	private int IdCountry;
	private String name;
	
	
	public Region() {
		super();
	}

	public Region(int idCountry, String name) {
		super();
		IdCountry = idCountry;
		this.name = name;
	}

	public int getIdCountry() {
		return IdCountry;
	}

	public void setIdCountry(int idCountry) {
		IdCountry = idCountry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(IdCountry);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		return IdCountry == other.IdCountry;
	}

	@Override
	public String toString() {
		return "Region [IdCountry=" + IdCountry + ", name=" + name + "]";
	}
	
	

}
