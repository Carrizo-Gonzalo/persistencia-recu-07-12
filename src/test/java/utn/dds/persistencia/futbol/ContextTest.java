package utn.dds.persistencia.futbol;


import io.github.flbulgarelli.jpa.extras.test.SimplePersistenceTest;
import org.junit.jupiter.api.Test;
import utn.dds.persistencia.futbol.persistence.Equipo;
import utn.dds.persistencia.futbol.persistence.Jugador;
import utn.dds.persistencia.futbol.persistence.tienda.Producto;
import utn.dds.persistencia.futbol.persistence.tienda.Remera;

import static org.junit.jupiter.api.Assertions.*;

public class ContextTest implements SimplePersistenceTest {

  // ===========================================
  // Ojo, ¡esto no es un test propiamente dicho!
  // ===========================================

  @Test
  void testDeProducto() {
    Producto remera = new Remera();
    remera.setDescripcion("remera de mangas cortas");

    Equipo equipo = new Equipo();
    equipo.agregarProducto(remera);

    entityManager().persist(remera);
    entityManager().persist(equipo);

    entityManager().clear();

    // equipo = entityManager().find()
    // equipo.getProductos()
  }


  @Test
  public void test() {
    Jugador dani = new Jugador();
    dani.setNombre("Dani");
    dani.setPosicion("11");

    assertNull(dani.getId());

    entityManager().persist(dani); // hago persistible a dani

    assertNotNull(dani.getId());
  }
}
