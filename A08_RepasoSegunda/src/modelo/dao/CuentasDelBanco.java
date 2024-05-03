package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Banco;
import modelo.javabeans.Cuenta;
import modelo.javabeans.Oficina;

public class CuentasDelBanco implements IntCuentasBanco{
	
	private ArrayList<Cuenta> lista;
	
	public CuentasDelBanco() {
		lista = new ArrayList<Cuenta>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		Banco ban1 = new Banco (1, "BBVA", 1_000_000);
		Oficina of1 = new Oficina(1, "Marques", "Madrid", ban1);
		Oficina of2 = new Oficina(2, "Sucursal 33", "Sevilla", ban1);
		lista.add(new Cuenta (1000, "Ahorro", 1000, of1));
		lista.add(new Cuenta (1001, "Ahorro", 1000, of1));
		lista.add(new Cuenta (1002, "Ahorro", 1000, of1));
		lista.add(new Cuenta (1003, "Ahorro", 1000, of1));
		
		lista.add(new Cuenta (2000, "Ahorro", 1000, of2));
		lista.add(new Cuenta (2001, "Ahorro", 1000, of2));
		lista.add(new Cuenta (2002, "Ahorro", 1000, of2));
		lista.add(new Cuenta (2003, "Ahorro", 1000, of2));
	}

	@Override
	public boolean alta(Cuenta cuenta) {
		if (lista.contains(cuenta))
			return false;
		else
			return lista.add(cuenta);
	}

	@Override
	public boolean modificar(Cuenta cuenta) {
		int pos = lista.indexOf(cuenta);
		if (pos != -1) {
			lista.set(pos, cuenta);
			return true;
		}
		return false;
	}

	@Override
	public boolean eliminar(int numeroCuenta) {
		Cuenta cuenta = buscarUna(numeroCuenta);
		if (cuenta != null)
			return eliminar(cuenta);
		else
			return false;
	}

	@Override
	public boolean eliminar(Cuenta cuenta) {
		return lista.remove(cuenta);
	}

	@Override
	public Cuenta buscarUna(int numeroCuenta) {
			for (Cuenta cuenta: lista) {
			if (cuenta.getIdCuenta() == numeroCuenta)
				return cuenta;
		}
			return null;
	}

	@Override
	public ArrayList<Cuenta> todas() {
		return null;
	}

	@Override
	public ArrayList<Cuenta> buscarPorOficina(int idOficina) {
		ArrayList<Cuenta> aux = new ArrayList<Cuenta>();
		for (Cuenta cuenta: lista) { //el for es para leer la listas
			if (cuenta.getOficina().getIdOficina() == idOficina)
				aux.add(cuenta);
		}
			return aux;
	}

	@Override
	public ArrayList<Cuenta> buscarPorBanco(int idBanco) {
		ArrayList<Cuenta> aux = new ArrayList<Cuenta>();
		for (Cuenta cuenta: lista) {
			if (cuenta.getOficina().getBanco().getIdBanco() == idBanco)
				aux.add(cuenta);
		}
			return aux;
	}
}

