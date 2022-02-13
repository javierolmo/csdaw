package csdaw.tema10.ejercicio9;

public class BallenaAzul implements Nadador {

    private int edad;

    public BallenaAzul (int edad) {
        this.edad = edad;
    }

    @Override
    public int nadar(int metros) {
        int velocidadKMH = 0;
        if(edad >= 5) {
            velocidadKMH = 10;
        } else {
            velocidadKMH = 13;
        }
        double velocidadMS = velocidadKMH / 3.6; // Transformo velocidad a m/s
        return (int) (metros / velocidadMS);
    }
}
