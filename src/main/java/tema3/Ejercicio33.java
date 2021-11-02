package tema3;

import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        int decimal = scanner.nextInt();
        System.out.print("Introduce la base destino: ");
        int base = scanner.nextInt();
        int exponente = 0;

        long binario = 0;

        while (decimal > 0) {
            binario += (decimal % base) * Math.pow(10, exponente);
            decimal /= base;
            exponente++;
        }
        System.out.println("Base" + base +": " + binario);
    }

}
