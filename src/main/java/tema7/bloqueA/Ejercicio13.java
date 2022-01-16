package tema7.bloqueA;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio13 {

    static String[][] agenda = {
            {"Marta", "666111222"},
            {"Miguel", "981981981"},
            {"Ana", "900900900"},
            {"Daniel", "+34881000001"}
    };

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un nombre: ");
        String nombre = scanner.next();

        try {
            String numero = encontrarNumero(nombre);
            System.out.println("Su número de teléfono es: " + numero);
        } catch (NoSuchElementException nsee) {
            System.out.println(nsee.getMessage());
        }

    }

    public static String encontrarNumero(String nombre) {
        for(int i=0; i<agenda.length; i++) {
            if(agenda[i][0].equals(nombre)) {
                return agenda[i][1];
            }
        }
        throw new NoSuchElementException("No se ha encontrado el nombre en la agenda");
    }
}
