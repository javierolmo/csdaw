package tema1;

import java.util.Scanner;

/*
    Realizar un programa que se le introduzcan DIA, MES y AÑO, que calcule el día siguiente. Suponemos que los valores
    son correctos, sin emplear las clases de fechas de Java.

    Hay que hacer un tratamiento diferente según sea fin de año, fin de mes, o un día no fin de año.
 */

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Leer día
        System.out.println("Introduce día: ");
        int dia = scanner.nextInt();

        // Leer mes
        System.out.println("Introduce mes: ");
        int mes = scanner.nextInt();

        // Leer año
        System.out.println("Introduce año: ");
        int anho = scanner.nextInt();

        // Calcular número máximo de días del mes introducido
        int maxDias = calcularDuracionMes(mes, anho);

        // Incrementar un día:
        dia++;

        // Comprobar desbordamiento en los días
        if (dia > maxDias) {
            dia = 1;
            mes++;
        }

        // Comprobar desbordamiento en los meses
        if (mes > 12) {
            mes = 1;
            anho++;
        }

        System.out.println("Resultado tras incrementar un día: " + dia + "/" + mes + "/" + anho);

    }

    /**
     * Comprueba si el año proporcionado como argumento es o no bisiesto y devuelve la respuesta como resultado
     * @param anho año que se desea analizar
     */
    private static boolean esBisiesto(int anho) {
        return (anho % 4 == 0) && ((anho % 100 != 0) || (anho % 400 == 0));
    }

    /**
     * Calcula el número de días que posee el mes especificado
     * @param mes mes del año
     * @param anho año
     * @return número de días
     */
    private static int calcularDuracionMes(int mes, int anho) {

        boolean bisiesto = esBisiesto(anho);

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if(bisiesto) return 29;
                else return 28;
            default:
                System.out.println("ERROR");
                return 0;
        }

    }
}
