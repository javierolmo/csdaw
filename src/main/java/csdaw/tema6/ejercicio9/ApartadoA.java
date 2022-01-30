package csdaw.tema6.ejercicio9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static java.time.temporal.ChronoUnit.DAYS;

public class ApartadoA {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu fecha de nacimiento (dd/MM/yyyy): ");
        String cadenaFecha = scanner.nextLine();
        LocalDate fecha = LocalDate.parse(cadenaFecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        long dias = DAYS.between(fecha, LocalDate.now());
        System.out.println("Han pasado " + dias + " días");

    }

}
