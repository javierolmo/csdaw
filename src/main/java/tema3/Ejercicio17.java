package tema3;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i=1; i<=9; i++) {

            // Leer entrada del usuario
            System.out.print("Introduce la nota del módulo #"+i+": ");
            double nota = scanner.nextDouble();

            // Validación de la nota. Si se sale de rango, decremento el índice para repetir la misma iteración del for
            // y no avanzar a la siguiente.
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida");
                i--;
            } else {

                // Comprobar si es suspenso. Si al menos una nota es suspenso no se puede ir a la FCT por lo que no haría
                // falta comprobar las demás
                if (nota < 5) {
                    System.out.println("El alumno no puede ir a la FCT, ha suspendido la asignatura "+i);
                    break;
                }

                // En caso de que se introduzca la última y llegue a este punto, se puede confirmar que el alumno puede ir
                // a la FCT:
                if (i == 9) {
                    System.out.println("El alumno puede ir a la FCT");
                }

            }


        }

    }

}
