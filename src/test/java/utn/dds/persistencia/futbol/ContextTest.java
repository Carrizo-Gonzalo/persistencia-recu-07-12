package utn.dds.persistencia.futbol;


import io.github.flbulgarelli.jpa.extras.test.SimplePersistenceTest;
import org.junit.jupiter.api.Test;
import utn.dds.persistencia.futbol.persistence.Equipo;
import utn.dds.persistencia.futbol.persistence.Jugador;
import utn.dds.persistencia.futbol.persistence.RepositorioJugadores;

import static org.junit.jupiter.api.Assertions.*;

public class ContextTest implements SimplePersistenceTest {

  // ===========================================
  // Ojo, ¡esto no es un test propiamente dicho!
  // ===========================================
  RepositorioJugadores repo = new RepositorioJugadores();

  @Test
  public void testInsertarYTraerTodos() {
    Jugador dani = new Jugador();
    dani.setNombre("Dani");
    dani.setPosicion("11");

    // ok, cumplio nuestras expectativas
    // creó el modelo

    // pero no se insertó? por qué?
    // EH AHORA SI?
    repo.registrar(dani);

    // generó el id, pero aun así no el insert? por qué?
    assertNotNull(dani.getId());

    // esto fuerza a que JPA mande a la base de datos las operaciones
    // pendientes. Será buena idea?
    // NO. En general hibernate es mas inteligente que vos.
    // entityManager().flush(); ESTA MAL (en principio)

    // pero entonces, tendremos a dani? dará 0? dará 1?
    // hará un select?
    assertEquals(1, repo.todos().size());
  }

   @Test
  public void testInsertarYTraerUno() {
    Jugador dani = new Jugador();
    dani.setNombre("Dani");
    dani.setPosicion("11");

    // ok, cumplio nuestras expectativas
    // creó el modelo

    // pero no se insertó? por qué?
    // EH AHORA SI?
    repo.registrar(dani);

    // generó el id, pero aun así no el insert? por qué?
    assertNotNull(dani.getId());

    // pero entonces, tendremos a dani? dará un objeto no nulo o null?
     // hará ahora un select?
    assertNotNull(repo.buscar(dani.getId()));
  }

  @Test
  void persistirEquipo() {
    var equipo = new Equipo();

    entityManager().persist(equipo);

    assertNotNull(
        entityManager().find(Equipo.class, equipo.getId())
    );
  }
}
