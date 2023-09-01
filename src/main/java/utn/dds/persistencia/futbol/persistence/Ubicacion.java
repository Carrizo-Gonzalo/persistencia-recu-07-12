package utn.dds.persistencia.futbol.persistence;

import javax.persistence.Embeddable;

@Embeddable
// notar que no tiene id
public class Ubicacion {

  private Double latitud;
  private Double longitud;

  public double getLatitud() {
    return latitud;
  }

  public double getLongitud() {
    return longitud;
  }
}
