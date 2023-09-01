package utn.dds.persistencia.futbol.persistence;

import utn.dds.persistencia.futbol.persistence.difusion.Difusion;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "partidos")
public class Partido implements Competitivo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private LocalDate fecha;
  @Column(name = "espectadores")
  private Integer cantidadEspectadores;

  @ManyToOne
  private Formacion local;
  @ManyToOne
  private Formacion visitante;

  @ManyToMany
  @JoinTable(name = "goleadores")
  @OrderColumn(name = "ranking")
  private List<Jugador> goleadores = new ArrayList<>();

  @OneToOne
  private Difusion difusion;

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

  public void registrarGol(Jugador jugador, Formacion formacion) {
    formacion.setGoles(formacion.getGoles() + 1);
    goleadores.add(jugador);
  }

  public Formacion ganador() {
    if (local.getGoles().compareTo(visitante.getGoles()) > 0) {
      return local;
    } else {
      return visitante;
    }
  }

  public List<Jugador> getGoleadores() {
    return goleadores;
  }

  public Long getId() {
    return id;
  }

  @Override
  public boolean esDeAltoRendimiento() {
    return cantidadEspectadores > 100000;
  }

}
