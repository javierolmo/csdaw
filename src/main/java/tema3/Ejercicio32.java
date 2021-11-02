package tema3;

import java.util.Scanner;

public class Ejercicio32 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        int decimal = scanner.nextInt();
        long binario = 0;

        while (decimal > 0) {
            binario += decimal % 2;
            binario *= 10;
            decimal /= 2;
        }
        System.out.println("Binario: " + binario);
    }

}
