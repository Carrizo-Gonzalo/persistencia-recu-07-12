package utn.dds.persistencia.futbol.persistence;

import java.util.List;

public class Jugador {

	private String nombre;
	private String posicion;

	// los partidos en que recibió el premio
	// a "la figura del partido"
	private List<Partido> mejoresPartidos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

}
