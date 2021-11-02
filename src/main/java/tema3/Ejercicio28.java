package tema3;

import java.util.Scanner;

public class Ejercicio28 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroMayor;
        int numeroMenor;

        int suma = 0;
        int producto = 1;
        int cantidadNumeros = 0;


        // Leer datos introducidos por el usuario
        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        // Identificar cuál es el mayor y cuál el menor
        if (numero1 > numero2) {
            numeroMayor = numero1;
            numeroMenor = numero2;
        } else {
            numeroMayor = numero2;
            numeroMenor = numero1;
        }

        // Iterar entre ambos números (no incluidos, de ahí el numeroMenor+1)
        for(int i = numeroMenor+1; i < numeroMayor; i++) {

            // Si es par, utilizarlo para los cálculos
            if (i % 2 == 0) {
                suma += i;
                producto *= i;
                cantidadNumeros++;
                System.out.println("Se ha procesado el número " + i);  // Esto no lo pide el ejercicio, es sólo para seguir la traza
            }

        }

        // Imprimir resumen
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);
        System.out.println("Media: " + (suma/cantidadNumeros));


    }

}
