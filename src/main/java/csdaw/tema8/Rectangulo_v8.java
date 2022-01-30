package csdaw.tema8;

public class Rectangulo_v8 extends Figura2D_v8 {

    public Rectangulo_v8(double ancho, double alto, String nombre) {
        super(ancho, alto, nombre);
    }

    public Rectangulo_v8(double altoancho, String nombre) {
        super(altoancho, nombre);
    }

    public boolean esCuadrado() {
        return getAncho() == getAlto();
    }
}
