package csdaw.tema7.bloqueB;

import csdaw.tema7.bloqueA.Primitiva;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio17 {

    static Scanner scanner = new Scanner(System.in);

    public static void programa1() {
        Primitiva2 primitiva = new Primitiva2();
        System.out.println("El boleto premiado es: " + primitiva.getResultado());
        ArrayList<Integer> boleto = new ArrayList<>();

        System.out.println("Introduce tu boleto:");
        for(int i=1; i<=Primitiva.NUMEROS_BOLETO; i++) {
            System.out.printf("%dº número (1-49): ", i);
            boleto.add(scanner.nextInt());
        }

        System.out.println("-------------------------------------");
        System.out.println("Aciertos: " + primitiva.comprobarAciertos(boleto));

    }

    public static void programa2() {
        Primitiva2 primitiva = new Primitiva2();
        int[] frecuenciaAciertos = new int[Primitiva.NUMEROS_BOLETO+1];
        System.out.println("Combinación ganadora: " + primitiva.getResultado());
        System.out.println("Simulando boletos aleatorios:");
        for (int i=1; i<=1000; i++) {
            ArrayList<Integer> boleto = primitiva.boletoAleatorio();
            int aciertos = primitiva.comprobarAciertos(boleto);
            frecuenciaAciertos[aciertos] = frecuenciaAciertos[aciertos]+1;
            System.out.printf("Boleto aleatorio #%d (%s). Aciertos: %d\n", i, boleto, aciertos);
        }

        System.out.println("--------------------------------------");
        for(int i=0; i<=Primitiva2.NUMEROS_BOLETO; i++) {
            System.out.printf("Frecuencia %d aciertos: %d\n", i, frecuenciaAciertos[i]);
        }
    }

    public static void programa3() {
        Primitiva2 primitiva = new Primitiva2();
        boolean parar = false;
        int contador = 0;
        System.out.println("Combinación ganadora: " + primitiva.getResultado());
        System.out.println("Simulando boletos aleatorios:");
        do {
            contador++;
            ArrayList<Integer> boleto = primitiva.boletoAleatorio();
            int aciertos = primitiva.comprobarAciertos(boleto);
            System.out.printf("Boleto aleatorio #%d (%s). Aciertos: %d\n", contador, boleto, aciertos);
            parar = (aciertos == 6);
        } while (!parar);
    }

    public static void main(String[] args) {
        //programa1();
        //programa2();
        programa3();
    }

}
