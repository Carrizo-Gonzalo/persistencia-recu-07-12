package utn.dds.persistencia.futbol.persistence.tienda;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cuadros_firmados")
public class CuadroFirmado extends Producto {

  private String firmante;
  @Column(name = "marco")
  private boolean conMarco;

  public String getFirmante() {
    return firmante;
  }

  public boolean getConMarco() {
    return conMarco;
  }

  public void setFirmante(String firmante) {
    this.firmante = firmante;
  }

  public void setConMarco(boolean conMarco) {
    this.conMarco = conMarco;
  }


}
