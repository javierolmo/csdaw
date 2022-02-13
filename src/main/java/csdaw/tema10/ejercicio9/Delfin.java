package csdaw.tema10.ejercicio9;

import java.util.Random;

public class Delfin implements Nadador {

    @Override
    public int nadar(int metros) {
        int velocidadKMH = new Random().nextInt(30)+ 40; // Velocidad aleatoria km/h
        double velocidadMS = velocidadKMH / 3.6; // Transformo velocidad a m/s
        return (int) (metros / velocidadMS);
    }

}
