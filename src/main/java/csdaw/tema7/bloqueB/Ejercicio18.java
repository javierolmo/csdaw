package csdaw.tema7.bloqueB;

import java.util.ArrayList;

public class Ejercicio18 {

    private static final int NUMERO = 99925123;

    public static void main(String[] args) {
        System.out.println("Calculando los divisores de " + NUMERO + "...");
        ArrayList<Integer> result = calcularDivisores(NUMERO);
        System.out.println(result);
    }

    public static ArrayList<Integer> calcularDivisores(int numero) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=1; i<=numero; i++) {
            if(numero % i == 0) result.add(i);
        }
        return result;
    }
}
