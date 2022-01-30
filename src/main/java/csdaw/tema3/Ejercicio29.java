package csdaw.tema3;

import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int idCliente = 0;
        int mayorVenta = 0; // Número más alto de entradas compradas por un mismo cliente

        System.out.print("Introduce la cantidad de entradas disponibles: ");
        int entradas = scanner.nextInt();
        System.out.println("----------------------------");

        while (entradas > 0) {
            idCliente++;
            System.out.print("Cliente " + idCliente + ": Cuántas entradas quiere comprar? (restantes: " + entradas + ")");
            int solicitudEntradas = scanner.nextInt();

            if (solicitudEntradas > 10) {
                System.out.println("No puedes comprar más de 10 entradas");
            } else if (solicitudEntradas > entradas) {
                System.out.println("No quedan tantas entradas");
            } else {
                entradas = entradas - solicitudEntradas;
                if(solicitudEntradas > mayorVenta) {
                    mayorVenta = solicitudEntradas;
                }
            }
        }

        System.out.println();
        System.out.println("Se han vendido todas las entradas");
        System.out.println("Mayor venta: " + mayorVenta);
    }
}
