package ficha;

/*
    Realizar un programa que se le introduzca una nota (un valor entero entre 0 y 10) y nos muestre por pantalla la nota
    final en texto con la siguiente equivalencia: Muy deficiente (0, 1, 2). Insuficiente (3, 4), Aprobado (5, 6),
    Notable (7, 8) y Sobresaliente (9, 10)
*/

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Leer nota
        System.out.print("Introduce la nota: ");
        int nota = scanner.nextInt();

        // Dar resultado
        switch (nota) {
            case 0:
            case 1:
            case 2:
                System.out.println("Muy deficiente");
                break;
            case 3:
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
            case 6:
                System.out.println("Aprobado");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
        }

    }



}
