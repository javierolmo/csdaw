package csdaw.tema10.ejercicio10;

import csdaw.tema10.ejercicio9.BallenaAzul;
import csdaw.tema10.ejercicio9.Delfin;
import csdaw.tema10.ejercicio9.Nadador;
import csdaw.tema10.ejercicio9.TriAtleta;

import java.util.ArrayList;

public class Ejercicio10 {

    public static void main(String[] args) {
        ArrayList<Nadador> nadadores = new ArrayList<>();
        nadadores.add(new Delfin());
        nadadores.add(new BallenaAzul(3));
        nadadores.add(new TriAtleta(30, false));

        System.out.println("Tiempo necesario en recorrer 1km:");
        for (Nadador nadador : nadadores) {
            System.out.printf("%s: %d segundos\n", nadador.getClass().getSimpleName(), nadador.nadar(1000));
        }
    }

}
