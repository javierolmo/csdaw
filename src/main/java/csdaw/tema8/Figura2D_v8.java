package csdaw.tema8;

public class Figura2D_v8 {

    private double ancho;
    private double alto;
    private String nombre;

    public Figura2D_v8() {
        this.alto = 0;
        this.ancho = 0;
        this.nombre = null;
    }

    public Figura2D_v8(double ancho, double alto, String nombre) {
        this.ancho = ancho;
        this.alto = alto;
        this.nombre = nombre;
    }

    public Figura2D_v8(double altoancho, String nombre) {
        this.ancho = altoancho;
        this.alto = altoancho;
        this.nombre = nombre;
    }

    public Figura2D_v8(Figura2D_v8 figura2D_v7) {
        this.alto = figura2D_v7.alto;
        this.ancho = figura2D_v7.ancho;
        this.nombre = getNombre();
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
