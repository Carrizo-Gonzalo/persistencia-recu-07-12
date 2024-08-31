package utn.dds.persistencia.futbol.persistence.tienda;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "productos")
public abstract class Producto {

  @Id
  @GeneratedValue
  private Long id;

  // jamas en la vida en ningun lenguaje
  // de programacion
  private Double precio;
  private String descripcion;

  public void setPrecio(Double precio) {
    this.precio = precio;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public Double getPrecio() {
    return precio;
  }

}
