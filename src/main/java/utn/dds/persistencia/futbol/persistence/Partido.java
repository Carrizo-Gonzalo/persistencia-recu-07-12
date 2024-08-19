package utn.dds.persistencia.futbol.persistence;

import java.time.LocalDateTime;
import java.util.Calendar;

public class Partido {

	private LocalDateTime fecha;
	private Integer cantidadEspectadores;

	private Formacion local;
	private Formacion visitante;

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public Integer getCantidadEspectadores() {
		return cantidadEspectadores;
	}

	public void setCantidadEspectadores(Integer cantidadEspectadores) {
		this.cantidadEspectadores = cantidadEspectadores;
	}

	public Formacion ganador() {
		if (local.getGoles().compareTo(visitante.getGoles()) > 0) {
			return local;
		} else {
			return visitante;
		}
	}

}
