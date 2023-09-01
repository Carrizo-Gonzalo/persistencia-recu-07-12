package utn.dds.persistencia.futbol.persistence;


import io.github.flbulgarelli.jpa.extras.simple.WithSimplePersistenceUnit;

import java.util.List;

public class RepositorioJugadores implements WithSimplePersistenceUnit {

  public void registrar(Jugador jugador) {
    entityManager().persist(jugador);
  }


  public List<Jugador> todos() {
    return entityManager()
        .createQuery("from Jugador", Jugador.class)
        .getResultList();
  }

  public List<Jugador> filtrarPorNombre(String nombre) {
    return entityManager()
        .createQuery("from Jugador where nombre = :nombre", Jugador.class)
        .setParameter("nombre", nombre)
        .getResultList();
  }

}
