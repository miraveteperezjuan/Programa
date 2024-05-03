package testing;

import modelo.javabeans.Banco;
import modelo.javabeans.Cuenta;
import modelo.javabeans.Oficina;

public class TestCuenta {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(1000, "Ahorro", 1000, 
						new Oficina(1, "Marques", "Madrid", 
						new Banco(1, "BBVA", 1_000_000)));
		
		Banco ban1 = new Banco (1, "BBVA", 1_000_000);
		Oficina of1 = new Oficina(1, "Marques", "Madrid", ban1);
		Cuenta cu1 = new Cuenta(1000, "Ahorro", 1000, of1);
		
		System.out.println(cu1.getSaldo());
		System.out.println(cu1.getOficina().getNombre().substring(0,3)); //Esto es para que me saque los tres primeros caracteres.
		
	}

}
