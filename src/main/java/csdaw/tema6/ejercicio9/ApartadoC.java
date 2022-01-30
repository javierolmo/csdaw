package csdaw.tema6.ejercicio9;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.SECONDS;

public class ApartadoC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Leer y convertir primera hora
        System.out.print("Introduce la primera hora (HH:mm:ss): ");
        String stringHora1 = scanner.nextLine();
        LocalTime hora1 = LocalTime.parse(stringHora1, timeFormatter);

        // Leer y convertir segunda hora
        System.out.print("Introduce la segunda hora (HH:mm:ss): ");
        String stringHora2 = scanner.nextLine();
        LocalTime hora2 = LocalTime.parse(stringHora1, timeFormatter);

        // Calcular intervalo
        long intervaloSegundos = SECONDS.between(hora1, hora2);
        System.out.println("Hay un intervalo de " + intervaloSegundos + " segundos");


    }
}
