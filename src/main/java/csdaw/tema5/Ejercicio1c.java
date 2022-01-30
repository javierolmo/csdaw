package csdaw.tema5;

import java.util.Scanner;

public class Ejercicio1c {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el límite inferior: ");
        int limInferior = scanner.nextInt();
        System.out.print("Introduce el límite superior: ");
        int limSuperior = scanner.nextInt();

        int suma = sumaIntervalo(limInferior, limSuperior);
        System.out.println("La suma de los números del intervalo es: " + suma);

    }

    public static int sumaIntervalo(int min, int max) {
        if (max < min || min < 0 || max < 0) {
            return -1;
        } else {
            int suma = 0;
            for(int i = min+1; i < max; i++) {
                suma += i;
            }
            return suma;
        }
    }
}
