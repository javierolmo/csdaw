package tema5;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce número: ");
        int numero = scanner.nextInt();

        int divisores = cantidadDivisores(numero);
        System.out.println("El número de divisores es " + divisores);

    }

    /**
     *
     * @param numero
     * @return
     */
    public static int cantidadDivisores(int numero) {
        if (numero < 0) {
            return 0;
        } else {
            int divisores = 0;
            for (int i = 1; i <= numero; i++) {
                if(numero % i == 0) {
                    divisores++;
                }
            }
            return divisores;
        }
    }
}
