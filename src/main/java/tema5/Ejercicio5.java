package tema5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Introduce un número del 1 al 20: ");
            int numero = scanner.nextInt();

            if(!esValido(numero)) {
                System.out.println("El número introducido no es válido");
                return;
            }

            int resultado = calcularFactorial(numero);
            System.out.println("El factorial es: " + resultado);
            System.out.println("------------------------------------------");

        }



    }

    public static boolean esValido(int numero) {
        if (numero < 1 || numero > 20) {
            return false;
        } else {
            return true;
        }
    }

    public static int calcularFactorial(int numero) {
        int resultado = 1;
        for (int i=1; i <= numero; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }



}
