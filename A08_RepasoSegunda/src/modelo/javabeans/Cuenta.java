package modelo.javabeans;

import java.util.Objects;

public class Cuenta {
	
	private int IdCuenta;
	private String tipoCuenta;
	private double Saldo;
	private Oficina oficina;
	
	public Cuenta() {
		super();
	}

	public Cuenta(int idCuenta, String tipoCuenta, double saldo, Oficina oficina) {
		super();
		IdCuenta = idCuenta;
		this.tipoCuenta = tipoCuenta;
		Saldo = saldo;
		this.oficina = oficina;
	}

	public int getIdCuenta() {
		return IdCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		IdCuenta = idCuenta;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}

	@Override
	public int hashCode() {
		return Objects.hash(IdCuenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return IdCuenta == other.IdCuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [IdCuenta=" + IdCuenta + ", tipoCuenta=" + tipoCuenta + ", Saldo=" + Saldo + ", oficina="
				+ oficina + "]";
	}
	
	public void aumentarSaldo(double cantidad) {
		Saldo+=cantidad;
	}
	
	public boolean disminuirSaldo(double cantidad) {
		if (cantidad > Saldo)
			return false;
		
		Saldo-= cantidad;
		return true;
	}
	
}
