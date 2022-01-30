package csdaw.tema9;

import java.util.Scanner;

public class Consola {

    public static int leerEntero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe un número entero: ");
        return scanner.nextInt();
    }

    public static int leerEntero(String texto) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(texto);
        return scanner.nextInt();
    }

    public static int leerEntero(String texto, int min, int max) {
        System.out.printf(texto + " (%d-%d)", min, max);
        return leerEntero(min, max);
    }

    public static int leerEntero(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        if(result > min && result < max) {
            return result;
        } else {
            System.out.printf("Número fuera de rango. inténtalo de nuevo: (%d-%d)", min, max);
            return leerEntero(min, max);
        }
    }
}
