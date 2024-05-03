package modelo.dao;

import java.util.List;

import modelo.javabean.Persona;

public interface InstitutoDao {
	
	 /**
     * @param Dar de alta a un persona
     * @return Si la persona no existe se dará de alta sino null.
     */
	
	boolean alta(Persona persona);
	
	/**
     * @param Eliminar a uno
     * @return Se retorna con un boolean en el cual si se elimina, y si no lo contrario.
     */
	
	boolean eliminar(Persona persona);
	
	/**
     * @param Buscar a uno
     * @return Se localiza a un empleado específico
     */
	
	Persona buscarUna (String nif);
	
	/**
     * @param Buscar a todos
     * @return Se localizan a todos los profes, alumnos y admis
     */
	
	List<Persona> buscartodas();
	
	/**
     * @param Buscar a una persona por su tipo si es profe, alumno o admin
     * @return En el caso de buscar profesores, devolverá a todos los profesores
     */
	
	
	List<Persona> buscarPersonasPorTipo(String tipoPersona);

}
