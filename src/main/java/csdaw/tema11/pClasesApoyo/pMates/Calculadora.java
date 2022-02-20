package csdaw.tema11.pClasesApoyo.pMates;

import java.util.ArrayList;

public class Calculadora {

    public ArrayList<Integer> enteros;

    private int sumar() {
        int suma = 0;
        for (Integer entero : enteros) {
            suma += entero;
        }
        return suma;
    }

    protected int menor() {
        int menor = enteros.get(0);
        for (Integer entero : enteros) {
            if(entero < menor) menor = entero;
        }
        return menor;
    }

    public double media() {
        return sumar() / enteros.size();
    }

}
