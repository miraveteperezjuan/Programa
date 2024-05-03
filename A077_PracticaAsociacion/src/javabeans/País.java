package javabeans;

import java.util.Objects;

public class País {

	private int IdCountry;
	private String name;
	private Region region;
	
	
	public País() {
		super();
	}


	public País(int idCountry, String name, Region region) {
		super();
		IdCountry = idCountry;
		this.name = name;
		this.region = region;
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


	public Region getRegion() {
		return region;
	}


	public void setRegion(Region region) {
		this.region = region;
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
		País other = (País) obj;
		return IdCountry == other.IdCountry;
	}


	@Override
	public String toString() {
		return "País [IdCountry=" + IdCountry + ", name=" + name + ", region=" + region + "]";
	}
	
	
	
}
