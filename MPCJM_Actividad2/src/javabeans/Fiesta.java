package javabeans;

import java.time.LocalDateTime;

/*
 * @author: Juan Manuel Miravete Pérez del Corral
 * @version: 1.0
 */

public class Fiesta {
	
	private String tipoFiesta;
	private String direccion;
	private int bocadillos;
	private int bebidas;
	private int invitados;
	private LocalDateTime fechaHora;
	
	public Fiesta(String tipoFiesta, String direccion, int bocadillos, int bebidas, int invitados, LocalDateTime fechaHora) {
		super();
		this.tipoFiesta = tipoFiesta;
		this.direccion = direccion;
		this.bocadillos = bocadillos;
		this.bebidas = bebidas;
		this.invitados = invitados;
		this.fechaHora = fechaHora;
	}
	
	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getTipoFiesta() {
		return tipoFiesta;
	}

	public void setTipoFiesta(String tipoFiesta) {
		this.tipoFiesta = tipoFiesta;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getBocadillos() {
		return bocadillos;
	}

	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}

	public int getBebidas() {
		return bebidas;
	}

	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}

	public int getInvitados() {
		return invitados;
	}

	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}

	public Fiesta() {
		super();
	}

	  public String toString() {
	        return "Fiesta: " +
	                tipoFiesta + 
	                ", bocadillos = " + bocadillos +
	                ", bebidas = " + bebidas +
	                ", invitados = " + invitados +
	                ", fecha = " + fechaHora;
	    }
	
	public void tipoFiesta() {
		
	}
	
	public void invitar() {
		invitados++;
	}
	
	public void cancelarInvitacion() {
		if (invitados > 0) {
			invitados--;
		}
	}
	
	public double precioFiesta() {
		return (5*invitados) + (2 * bebidas) + (3 * bocadillos);
	}

}
