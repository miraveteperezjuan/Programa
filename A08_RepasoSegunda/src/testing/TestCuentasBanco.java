package testing;

import modelo.dao.CuentasDelBanco;
import modelo.javabeans.Cuenta;

public class TestCuentasBanco {
	
	private static CuentasDelBanco cCuentas;
	
	static { //tengo una variable del tipo dao.
		cCuentas = new CuentasDelBanco();
	}

	public static void main(String[] args) {
		//alta
		//todos();
		//porOficina;
		//porBanco
		//alta();
		//alta();
	}
	
	public static void todos() {
		for (Cuenta cuenta: cCuentas.todas()) {
			System.out.println(cuenta);
		}
	}
	
	public static void PorOficina() {
		for (Cuenta cuenta: cCuentas.buscarPorOficina(1)) {
			System.out.println(cuenta);
		}
	}
	
	public static void PorBanco() {
		for (Cuenta cuenta: cCuentas.buscarPorBanco(1)) {
			System.out.println(cuenta);
		}
	}
	
	public static void alta() {
		//ya sabemos como es.
	}
	
	
}
