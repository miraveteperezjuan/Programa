package repaso;

public class Fuerza {
	
	private double masa;
	private double aceleracion;
	
	public double fuerzaEjercida() { //esto es un metodo propio
		return masa * aceleracion;
	}

	public Fuerza(double masa, double aceleracion) {
		super();
		this.masa = masa;
		this.aceleracion = aceleracion;
	}

	public Fuerza() {
		super();
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getAceleracion() {
		return aceleracion;
	}

	public void setAceleracion(double aceleracion) {
		this.aceleracion = aceleracion;
	}

	@Override
	public String toString() {
		return "Fuerza [masa=" + masa + ", aceleracion=" + aceleracion + "]";
	}
	
	
	
	

}
