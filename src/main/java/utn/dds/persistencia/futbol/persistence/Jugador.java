package utn.dds.persistencia.futbol.persistence;

import utn.dds.persistencia.futbol.persistence.auditoria.Auditable;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "jugadores")
public class Jugador implements Auditable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nombre;
  private String posicion;

  @Column(name = "ultima_modificacion")
  private LocalDate ultimaModificacion;

  public String getNombre() {
    return nombre;
  }

  @ElementCollection
  @Column(name = "frase")
  @CollectionTable(name = "frases_celebres")
  private List<String> frasesCelebres = new ArrayList<>();

  @ElementCollection
  @CollectionTable(name = "lesiones")
  private List<Lesion> lesiones = new ArrayList<>();

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
