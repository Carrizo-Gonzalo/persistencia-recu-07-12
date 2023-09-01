package utn.dds.persistencia.futbol.persistence.auditoria;

import java.time.LocalDate;
import java.util.Date;

public interface Auditable {

  LocalDate getUltimaModificacion();

  boolean esSospechoso();

}
