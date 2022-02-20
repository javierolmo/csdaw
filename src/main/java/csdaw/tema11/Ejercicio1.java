package csdaw.tema11;

import csdaw.tema11.pClasesApoyo.pMates.Calculadora;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio1 {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        ArrayList<Integer> enteros = new ArrayList<>();
        enteros.addAll(Arrays.asList(1, 2, 3, 4, 5));
        calculadora.enteros = enteros;

        //calculadora.sumar();
        //No se puede acceer a este método ya que es privado. Sólo sería accesible desde la clase Calculadora

        //calculadora.menor();
        //No se puede acceder a este método ya que es protected. Sólo sería accesible desde el mismo paquete o desde una subclase

        double media = calculadora.media();
        System.out.println("Media = " + media);
        // Accesible sin ningún problema

    }
}
