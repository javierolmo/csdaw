package csdaw.tema3;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean ordenados = true;
        int ultimoNumero = 0;

        while (true) {
            System.out.print("Introduce un numero: ");
            int numeroIntroducido = scanner.nextInt();

            if (numeroIntroducido == 0) {
                System.out.println("Se detiene la ejecucion al haber introducido un 0");
                break;
            } else if(numeroIntroducido < ultimoNumero) {
                System.out.println("Se detiene la ejecucion al haber introducido un numero menor al anterior (" + numeroIntroducido + " < " + ultimoNumero+" )");
                ordenados = false;
                break;
            } else {
                ultimoNumero = numeroIntroducido;
            }
        }

        if(ordenados) {
            System.out.println("Los numeros estan ordenados");
        } else {
            System.out.println("Los numeros no estan ordenados");
        }
    }

}
