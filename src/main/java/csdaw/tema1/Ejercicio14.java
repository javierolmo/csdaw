package csdaw.tema1;

/*
    Diseña un algoritmo capaz de obtener la letra del DNI a partir del número del DNI. Consiste en dividir dicho número
    entre 23 y tomar el resto de la división asignándole la letra correspondiente según la siguiente tabla (Hacer con
    switch, no empleando ni arrays ni string)
*/

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Leer DNI
        System.out.print("Introduce el DNI: ");
        int dni = scanner.nextInt();

        // Calcular letra
        char letraDNI = calcularLetraDNI(dni);
        System.out.println("La letra es: " + letraDNI);

    }

    /**
     * Calcula la letra del dni a partir del número
     * @param dni número del dni
     * @return letra del dni
     */
    private static char calcularLetraDNI(int dni) {
        int resto = dni % 23;
        switch (resto) {
            case 0: return 'T';
            case 1: return 'R';
            case 2: return 'W';
            case 3: return 'A';
            case 4: return 'G';
            case 5: return 'M';
            case 6: return 'Y';
            case 7: return 'F';
            case 8: return 'P';
            case 9: return 'D';
            case 10: return 'X';
            case 11: return 'B';
            case 12: return 'N';
            case 13: return 'J';
            case 14: return 'Z';
            case 15: return 'S';
            case 16: return 'Q';
            case 17: return 'V';
            case 18: return 'H';
            case 19: return 'L';
            case 20: return 'C';
            case 21: return 'K';
            case 22: return 'E';
            default: return '?';
        }
    }
}
