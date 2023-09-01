package utn.dds.persistencia.futbol.persistence.tienda;

import javax.persistence.*;

@Entity
@Table(name = "kits_de_mates")
public class KitDeMate extends Producto {

  @Enumerated
  private Material material;
  @Column(name = "funda")
  private boolean incluyeFunda;

  public Material getMaterial() {
    return material;
  }

  public boolean getIncluyeFunda() {
    return incluyeFunda;
  }

  public void setMaterial(Material material) {
    this.material = material;
  }

  public void setIncluyeFunda(boolean incluyeFunda) {
    this.incluyeFunda = incluyeFunda;
  }


}
