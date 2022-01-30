package csdaw.tema6.ejercicio7;

public class Circulo {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }

    public double calcularSuperficie() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularDiametro() {
        return 2 * radio;
    }
}
