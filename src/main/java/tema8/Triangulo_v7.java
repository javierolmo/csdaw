package tema8;

public class Triangulo_v7 extends Figura2D_v7 {

    public String estilo;

    public Triangulo_v7() {
        super();
        this.estilo = null;
    }

    public Triangulo_v7(double altoancho) {
        super(altoancho);
        this.estilo = "igualBaseAltura";
    }

    public Triangulo_v7(String estilo, double alto, double ancho) {
        super(ancho, alto);
        this.estilo = estilo;
    }

    public Triangulo_v7(Triangulo_v7 triangulo_v7) {
        this.setAlto(triangulo_v7.getAlto());
        this.setAncho(triangulo_v7.getAncho());
        this.estilo = triangulo_v7.estilo;
    }

    public double area() {
        return getAncho() * getAlto() / 2;
    }

    public void verEstilo() {
        System.out.printf("Estilo: %s \n", estilo);
    }

}
