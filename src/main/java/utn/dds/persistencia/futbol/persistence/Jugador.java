package utn.dds.persistencia.futbol.persistence;

import javax.persistence.*;
import java.util.List;

@Entity
public class Jugador {

  @Id
  @GeneratedValue
  private Long id;

  @Column
  private String nombre;

  @Column
  private String posicion;

  @OneToMany
  @JoinColumn(name = "mejor_jugador_id")
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

  public Long getId() {
    return id;
  }
}
