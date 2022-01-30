package csdaw.tema8;

public class Triangulo_v6 extends Figura2D_v6 {

    public String estilo;

    public Triangulo_v6() {
        super();
        this.estilo = null;
    }

    public Triangulo_v6(double altoancho) {
        super(altoancho);
        this.estilo = "igualBaseAltura";
    }

    public Triangulo_v6(String estilo, double alto, double ancho) {
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
