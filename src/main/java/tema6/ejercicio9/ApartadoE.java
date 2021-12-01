package tema6.ejercicio9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class ApartadoE {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una fecha (dd/MM/yyyy): ");
        String fechaString = scanner.nextLine();
        LocalDate fecha = LocalDate.parse(fechaString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("Dia de la semana: " + fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
    }

}
