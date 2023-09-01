package utn.dds.persistencia.futbol.persistence;

import utn.dds.persistencia.futbol.persistence.auditoria.Auditable;
import utn.dds.persistencia.futbol.persistence.tienda.KitDeMate;
import utn.dds.persistencia.futbol.persistence.tienda.Producto;
import utn.dds.persistencia.futbol.persistence.tienda.Remera;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "equipos")
public class Equipo implements Auditable, Competitivo {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;

  private String nombre;

  @Column(name = "afiliados")
  private Long cantidadAfiliados;

  @Enumerated(EnumType.ORDINAL)
  private Liga liga;

  @OneToMany
  @JoinColumn(name = "equipo_id")
  private List<Producto> productosEnTienda = new ArrayList<>();

  @Column(name = "ultima_modificacion")
  private LocalDate ultimaModificacion;

  @Embedded
  private Ubicacion ubicacionSede;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void agregarProducto(Producto producto) {
    this.productosEnTienda.add(producto);
  }

  public Long getCantidadAfiliados() {
    return cantidadAfiliados;
  }

  public void setCantidadAfiliados(Long cantidadAfiliados) {
    this.cantidadAfiliados = cantidadAfiliados;
  }

  public Ubicacion getUbicacionSede() {
    return ubicacionSede;
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

  @Override
  public boolean esDeAltoRendimiento() {
    return cantidadAfiliados > 10000;
  }
}
