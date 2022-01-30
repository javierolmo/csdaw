package csdaw.tema8;

public class Triangulo_v3 extends Figura2D_v3 {

    public String estilo;

    public Triangulo_v3(String estilo, double alto, double ancho) {
        super();
        this.estilo = estilo;
        this.setAlto(alto);
        this.setAncho(ancho);
    }

    public double area() {
        return getAncho() * getAlto() / 2;
    }

    public void verEstilo() {
        System.out.printf("Estilo: %s \n", estilo);
    }

}
