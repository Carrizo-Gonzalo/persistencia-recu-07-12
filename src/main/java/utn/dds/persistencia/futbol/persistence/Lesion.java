package utn.dds.persistencia.futbol.persistence;

import javax.persistence.Embeddable;
import java.time.LocalDate;
import java.util.Date;

@Embeddable
public class Lesion {

  private LocalDate fecha;
  private String descripción;

  public Lesion(LocalDate fecha, String descripción) {
    this.fecha = fecha;
    this.descripción = descripción;
  }

  public LocalDate getFecha() {
    return fecha;
  }

  public String getDescripción() {
    return descripción;
  }


}
