package tema3;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int totalVentas = 0;
        int salarioMayorVendedor = 0;
        int recordVentas = 0;


        while(true) {
            contador++;

            // Lectura de datos
            System.out.println("Vendedor "+contador+":");
            System.out.print("Sueldo base: ");
            int sueldoBase = scanner.nextInt();
            System.out.print("Horas extra: ");
            int horasExtra = scanner.nextInt();
            System.out.print("Ventas: ");
            int ventas = scanner.nextInt();

            // Calcular sueldo
            int plusPorVentas = 0;
            if(ventas > 30) {
                plusPorVentas = 1300;
            } else if (ventas > 20) {
                plusPorVentas = 1000;
            } else if (ventas > 10) {
                plusPorVentas = 500;
            }
            int sueldo = sueldoBase + horasExtra*100 + plusPorVentas;

            // Incremento ventas
            totalVentas += ventas;

            // Compruebo si es el vendedor con mas ventas, y en caso afirmativo guardo sus datos
            if (ventas > recordVentas) {
                recordVentas = ventas;
                salarioMayorVendedor = sueldo;
            }

            // Continuar ejecición?
            System.out.print("Continuar ejecución? (S/N)");
            String continuar = scanner.next();
            if (continuar.equals("S")) {
                System.out.println("-----------------------------");
            } else {
                break;
            }

        }

        // Imprimir resumen
        System.out.println();
        System.out.println("Total de ventas: "+totalVentas);
        System.out.println("Salario del vendedor con más ventas: " + salarioMayorVendedor);

    }


}
