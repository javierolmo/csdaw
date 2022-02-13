package csdaw.tema10.ejercicio11;

public interface Saltador_v2 {

    int saltarAltura();

    /*
        Al añadir este método, la clase TriAtleta al implementar esta interfaz, da error por no tener
        descrito el método nuevo.
        Al escribir una implementación por defecto, evitamos este problema, aunque se puede
        sobreescribir en la clase para modificar su comportamiento.
     */
    default boolean saltaPertiga(int alturaCM) {
        return false;
    }

}
