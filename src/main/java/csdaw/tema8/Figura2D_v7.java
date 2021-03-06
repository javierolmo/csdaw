package csdaw.tema8;

public class Figura2D_v7 {

    private double ancho;
    private double alto;

    public Figura2D_v7() {
        this.alto = 0;
        this.ancho = 0;
    }

    public Figura2D_v7(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public Figura2D_v7(double altoancho) {
        this.ancho = altoancho;
        this.alto = altoancho;
    }

    public Figura2D_v7(Figura2D_v7 figura2D_v7) {
        this.alto = figura2D_v7.alto;
        this.ancho = figura2D_v7.ancho;
    }

    public void verDim() {
        System.out.printf("Ancho: %.2f | Alto: %.2f\n", ancho, alto);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
}
