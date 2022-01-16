package tema7.bloqueA;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

    static Scanner scanner = new Scanner(System.in);

    public static void programa1() {
        Primitiva primitiva = new Primitiva();
        System.out.println(Arrays.toString(primitiva.getResultado()));  // Mostrar resultado antes de elegir los números para facilitar testeo
        int[] boleto = new int[Primitiva.NUMEROS_BOLETO];

        System.out.println("Introduce tu boleto:");
        for(int i=1; i<=Primitiva.NUMEROS_BOLETO; i++) {
            System.out.printf("%dº número (1-49): ", i);
            boleto[i-1] = scanner.nextInt();
        }

        System.out.println("-------------------------------------");
        System.out.println("Aciertos: " + primitiva.comprobarAciertos(boleto));

    }

    public static void programa2() {
        Primitiva primitiva = new Primitiva();
        int[] frecuenciaAciertos = new int[Primitiva.NUMEROS_BOLETO+1];
        System.out.println("Combinación ganadora: " + Arrays.toString(primitiva.getResultado()));
        System.out.println("Simulando boletos aleatorios:");
        for (int i=1; i<=1000; i++) {
            int[] boleto = primitiva.boletoAleatorio();
            int aciertos = primitiva.comprobarAciertos(boleto);
            frecuenciaAciertos[aciertos] = frecuenciaAciertos[aciertos]+1;
            System.out.printf("Boleto aleatorio #%d (%s). Aciertos: %d\n", i, Arrays.toString(boleto), aciertos);
        }

        System.out.println("--------------------------------------");
        for(int i=0; i<=Primitiva.NUMEROS_BOLETO; i++) {
            System.out.printf("Frecuencia %d aciertos: %d\n", i, frecuenciaAciertos[i]);
        }
    }

    public static void programa3() {
        Primitiva primitiva = new Primitiva();
        boolean parar = false;
        int contador = 0;
        System.out.println("Combinación ganadora: " + Arrays.toString(primitiva.getResultado()));
        System.out.println("Simulando boletos aleatorios:");
        do {
            contador++;
            int[] boleto = primitiva.boletoAleatorio();
            int aciertos = primitiva.comprobarAciertos(boleto);
            System.out.printf("Boleto aleatorio #%d (%s). Aciertos: %d\n", contador, Arrays.toString(boleto), aciertos);
            parar = (aciertos == 6);
        } while (!parar);
    }

    public static void main(String[] args) {
        // programa1();
        programa2();
        //programa3();
    }

}
