# Hoja de ruta

1. Enums simples (`@Enumerated`): `Liga`
2. Herencia (`@Inheritance`)
     2.1 `Product`: `JOINED`
     2.2 `Difusion`: `SINGLE_TABLE`
3. Polimorfismo que no necesita mapeo de herencia: `Auditable`
4. `@ElementCollection`: `frasesCelebres`
5. `enum`s polimórficos: `Difusión` (ver rama `futbol-extendido-herencia-alternativa-enums`)
6. Embebibles `@OneToOne`: `Ubicacion`
7. Embebibles `@OneToMany` con `@ElementCollection`: `Lesion`es 
8. Bags: `Formacion.jugadores`
9. Listas (`@OrderColumn`): `Partido.goles`

# Corolario

- No es lo mismo embeber que enumerar
- No es lo mismo no persistir (`@Transient`) que enumerar o embeber
- Enumerar puede ser una alternativa al mapeo de herencia
- Embeber (al menos, en `JPA`) **no** es alternativa al mapeo de herencia (de hecho, es incompatible)
- Lo que hace que una relación `.*ToMany` (también vale para los `@ElementCollection`) sea una bolsa o una lista (o un conjunto) es su mapeo y no (solo) su tipado.