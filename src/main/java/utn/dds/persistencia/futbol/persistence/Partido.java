package utn.dds.persistencia.futbol.persistence;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

@Entity
public class Partido {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private LocalDate fecha;

	@Column
	private Integer cantidadEspectadores;

	@ManyToOne
	private Formacion local;

	@ManyToOne
	private Formacion visitante;

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
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
