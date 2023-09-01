package utn.dds.persistencia.futbol.persistence.difusion;

import jdk.jfr.Experimental;
import utn.dds.persistencia.futbol.persistence.Partido;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TV")
public class TVPublica extends Difusion {

  private String canal;

  @Override
  public void iniciarDifusion(Partido partido) {
    // TODO Auto-generated method stub

  }

  @Override
  public void finalizarDifusion(Partido partido) {
    // TODO Auto-generated method stub

  }

}
