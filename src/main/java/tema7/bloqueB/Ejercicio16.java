package tema7.bloqueB;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> positivos = new ArrayList<>();
        ArrayList<Integer> negativos = new ArrayList<>();

        while(true) {
            System.out.print("Introduce un número (0 para salir): ");
            int numero = scanner.nextInt();
            if(numero == 0) {
                break;
            } else if (numero > 0) {
                positivos.add(numero);
            } else {
                negativos.add(numero);
            }
        }

        System.out.println("Media positivos: " + positivos.stream().mapToInt(i -> i).average().getAsDouble());
        System.out.println("Media negativos: " + negativos.stream().mapToInt(i -> i).average().getAsDouble());

    }
}
