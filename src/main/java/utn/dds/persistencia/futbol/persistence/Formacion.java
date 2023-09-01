package utn.dds.persistencia.futbol.persistence;

import utn.dds.persistencia.futbol.persistence.auditoria.Auditable;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "formaciones")
public class Formacion implements Auditable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Long goles;

  @ManyToOne
  private Equipo equipo;

  @ManyToMany
  @JoinTable(name = "miembros")
  private List<Jugador> jugadores = new ArrayList<Jugador>();

  @Column(name = "ultima_modificacion")
  private LocalDate ultimaModificacion;

  public Equipo getEquipo() {
    return equipo;
  }

  public void setEquipo(Equipo equipo) {
    this.equipo = equipo;
  }

  public Collection<Jugador> getJugadores() {
    return jugadores;
  }

  public void setJugadores(List<Jugador> jugadores) {
    this.jugadores = jugadores;
  }

  public Long getGoles() {
    return goles;
  }

  public void setGoles(Long goles) {
    this.goles = goles;
  }

  public Long getId() {
    return id;
  }

  @Override
  public LocalDate getUltimaModificacion() {
    return ultimaModificacion;
  }

  @Override
  public boolean esSospechoso() {
    // TODO
    return false;
  }

}
