package csdaw.tema10.ejercicio13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio13 {

    static Hotel hotel = new Hotel();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while(true) {
            System.out.println("Menú del hotel:");
            System.out.println("1. Check-in");
            System.out.println("2. Check-out");
            System.out.println("3. Listado");
            System.out.println("4. Salir");
            System.out.print("Elige una opción (1-4): ");

            int eleccion = scanner.nextInt();
            switch (eleccion) {
                case 1: checkIn(); break;
                case 2: checkOut(); break;
                case 3: System.out.println(hotel); break;
                case 4: return;
                default:
                    System.out.println("Opción incorrecta");
            }
        }

    }

    public static void checkIn() {
        System.out.print("Elige habitación (0-17): ");
        int habitacion = scanner.nextInt();
        boolean resultado = hotel.checkIn(habitacion, LocalDate.now());
        if(resultado) {
            System.out.println("Check-in realizado con éxito!");
        } else {
            System.out.println("La habitación no existe o está ocupada.");
        }
        System.out.println();
    }

    public static void checkOut() {
        System.out.print("Elige habitación (0-17): ");
        int habitacion = scanner.nextInt();
        System.out.print("Fecha de salida (dd/MM/yyyy): ");
        String fechaSalidaString = scanner.next();
        double resultado = hotel.checkOut(habitacion, LocalDate.parse(fechaSalidaString, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        if(resultado >= 0) {
            System.out.println("Check-out realizado con éxito!");
            System.out.println("Total: " + resultado);
        } else {
            System.out.println("La habitación no existe o está libre.");
        }
        System.out.println();
    }

}
