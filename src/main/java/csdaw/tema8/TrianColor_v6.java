package csdaw.tema8;

public class TrianColor_v6 extends Triangulo_v6 {

    private String color;

    public TrianColor_v6(double alto, double ancho, String estilo, String color) {
        super(estilo, alto, ancho);
        this.color = color;
    }
}
