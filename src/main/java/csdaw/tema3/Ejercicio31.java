package csdaw.tema3;

import java.util.Scanner;

public class Ejercicio31 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int numero28 = 0;
        int numero29 = 0;
        int numero30 = 0;
        int suma = 0;

        for(int i=1; i<=30; i++) {

            System.out.print("Introduce el " + i + "º número: ");
            int num = scanner.nextInt();

            if(num >= 0 && num <= 1000) {
                switch (i) {
                    case 1: numero1 = num; break;
                    case 2: numero2 = num; break;
                    case 3: numero3 = num; break;
                    case 28: numero28 = num; break;
                    case 29: numero29 = num; break;
                    case 30: numero30 = num; break;
                }
                suma += num;
            } else {
                System.out.println("Error. Debe de estar en el rango 0-1000. Vuelve a intentarlo");
                i--;
            }

        }

        // Imprimir en función de si la suma es par o impar
        System.out.print("La suma es " + suma);
        if (suma % 2 == 0) {
            System.out.println(" (par)");
            System.out.println("Los tres primeros números fueron: " + numero1 + ", " + numero2 + ", " + numero3);
        } else {
            System.out.println(" (impar)");
            System.out.println("Los tres últimos números fueron: " + numero28 + ", " + numero29 + ", " + numero30);
        }

    }

}
