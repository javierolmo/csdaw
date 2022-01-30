package csdaw.tema5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el límite inferior:");
        int limInferior = scanner.nextInt();
        System.out.print("Introduce el límite superior:");
        int limSuperior = scanner.nextInt();
        int x = aleatorio(limInferior, limSuperior);
        System.out.println("El número aleatorio generado es: "+x);

    }

    /**
     * Método para generar número aleatorio en un rango.
     * @param min límite inferior del rango
     * @param max límite superior del rango
     * @return número aleatorio dentro de rango o -1 si los parámetros son incorrectos
     */
    public static int aleatorio (int min, int max) {
        if (min <= 0 || min >= max) {
            return -1;
        } else {
            return new Random().nextInt(max - min) + min;
        }
    }

}
