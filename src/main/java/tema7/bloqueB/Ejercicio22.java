package tema7.bloqueB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio22 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i=0; i<10000; i++) {
            numeros.add(new Random().nextInt(6) + 1);
        }
        System.out.println("Números: " + numeros);

        ArrayList<Integer> frecuencias = new ArrayList<>();
        frecuencias.add(Collections.frequency(numeros, 1));
        frecuencias.add(Collections.frequency(numeros, 2));
        frecuencias.add(Collections.frequency(numeros, 3));
        frecuencias.add(Collections.frequency(numeros, 4));
        frecuencias.add(Collections.frequency(numeros, 5));
        frecuencias.add(Collections.frequency(numeros, 6));
        System.out.println("Frecuencias: " + frecuencias);

        int frecMinima = Collections.min(frecuencias);
        int frecMaxima = Collections.max(frecuencias);
        System.out.println("Diferencia máxima entre frecuencias: " + (frecMaxima-frecMinima));

    }


}
