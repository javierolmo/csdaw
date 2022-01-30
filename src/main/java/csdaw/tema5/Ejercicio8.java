package csdaw.tema5;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura del primer número
        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();

        // Lectura del segundo número
        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        // Calcular número de divisores de cada número
        int divisoresNumero1 = Ejercicio6.cantidadDivisores(numero1);
        int divisoresNumero2 = Ejercicio6.cantidadDivisores(numero2);

        // Sacar por pantalla la cantidad de divisores de cada número
        System.out.println("Numero1: " + divisoresNumero1 + " divisores. || Número 2: " + divisoresNumero2 + " divisores");

        // Resultado
        if (divisoresNumero1 > divisoresNumero2) {
            System.out.println("El número 1 tiene más divisores");
        } else if (divisoresNumero1 < divisoresNumero2) {
            System.out.println("El número 2 tiene más divisores");
        } else {
            System.out.println("Ambos números tienen la misma cantidad de divisores");
        }
    }
}
