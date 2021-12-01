package tema6.ejercicio9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class ApartadoB {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Introduce una fecha (dd/MM/yyyy): ");
        String cadenaFecha = scanner.nextLine();
        LocalDate fecha = LocalDate.parse(cadenaFecha, formatoFecha);

        System.out.print("Introduce un número de días a incrementar: ");
        int incremento = scanner.nextInt();

        LocalDate fechaIncrementada = fecha.plusDays(incremento);
        System.out.println("Fecha incrementada: " + fechaIncrementada.format(formatoFecha));

    }

}