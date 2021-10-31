package tema3;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {

        int total = 0;
        int numerosIntroducidos = 0;
        Scanner scanner = new Scanner(System.in);

        while (numerosIntroducidos < 15) {

            System.out.print("Introduce un número (introducidos: " + numerosIntroducidos + ", máx: 15): ");
            int numeroIntroducido = scanner.nextInt();
            numerosIntroducidos++;

            // Validación: si el número es > 1000 salir del bucle
            if (numeroIntroducido > 1000) {
                System.out.println("El número introducido es mayor que 1.000, se detiene la ejecución");
                break;
            } else {
                total += numeroIntroducido;
            }

        }

        System.out.println("El total es de: " + total);

    }
}
