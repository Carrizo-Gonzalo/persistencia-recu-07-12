package utn.dds.persistencia.futbol.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Jugador {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String nombre;

	@Column
	private String posicion;

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

	public Long getId() {
		return id;
	}
}
