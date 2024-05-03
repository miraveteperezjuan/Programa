package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Formula1;

public interface Formula1Dao {
	
	boolean alta (Formula1 Formula1);
	boolean delete (int Id);
	boolean delete (Formula1 Id);
	boolean update (Formula1 Formula1);
	Formula1 buscarUno (int Id);
	ArrayList<Formula1> buscarTodos();
}
