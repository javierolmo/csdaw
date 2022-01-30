package csdaw.tema8;

public class Triangulo_v5 extends Figura2D_v5 {

    public String estilo;

    public Triangulo_v5() {
        super();
        this.estilo = null;
    }

    public Triangulo_v5(double altoancho) {
        super(altoancho);
        this.estilo = "igualBaseAltura";
    }

    public Triangulo_v5(String estilo, double alto, double ancho) {
        super(ancho, alto);
        this.estilo = estilo;
    }

    public double area() {
        return getAncho() * getAlto() / 2;
    }

    public void verEstilo() {
        System.out.printf("Estilo: %s \n", estilo);
    }

}
