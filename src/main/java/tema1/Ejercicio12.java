package tema1;

/*

    Introduciendo dos fechas (dia, mes, año) hacer un programa que nos diga cuál de las dos es mayor (agrupa las
    condiciones de día, mes y año en una sola sentencia condicional). Suponemos que se introducen fechas válidas y no
    empleamos las clases de fecha Java.

*/

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Leer fecha 1
        System.out.println("FECHA 1:");
        System.out.print("Introduce día: ");
        int dia1 = scanner.nextInt();
        System.out.print("Introduce mes: ");
        int mes1 = scanner.nextInt();
        System.out.print("Introduce año: ");
        int anho1 = scanner.nextInt();
        System.out.println("\n");

        // Leer fecha 2
        System.out.println("FECHA 2:");
        System.out.print("Introduce día: ");
        int dia2 = scanner.nextInt();
        System.out.print("Introduce mes: ");
        int mes2 = scanner.nextInt();
        System.out.print("Introduce año: ");
        int anho2 = scanner.nextInt();

        // Comparar fechas
        int fecha1 = anho1*10000 + mes1*100 + dia1;
        int fecha2 = anho2*10000 + mes2*100 + dia2;
        System.out.println("Fecha1: " + fecha1 + " | Fecha2: " + fecha2);
        if (fecha1 > fecha2) {
            System.out.println("La fecha 1 es mayor");
        } else if (fecha1 < fecha2) {
            System.out.println("La fecha 2 es mayor");
        } else {
            System.out.println("Las fechas son iguales");
        }


    }

}
