package csdaw.tema3;

import java.util.Scanner;

public class Ejercicio32 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        int decimal = scanner.nextInt();
        int exponente = 0;
        long binario = 0;

        while (decimal > 0) {
            binario += (decimal % 2) * Math.pow(10, exponente);
            decimal /= 2;
            exponente++;
        }
        System.out.println("Binario: " + binario);
    }

}
