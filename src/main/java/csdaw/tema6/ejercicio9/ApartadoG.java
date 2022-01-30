package csdaw.tema6.ejercicio9;

import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class ApartadoG {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un año (yyyy):");
        int yearInt = scanner.nextInt();
        LocalDate localDate = LocalDate.of(yearInt, 1, 1);

        int domingos = 0;
        for(int i = localDate.getDayOfYear(); i <= Year.of(yearInt).length(); i++) {
            if(localDate.getDayOfWeek().getValue() == 7) {
                domingos++;
            }
            localDate = localDate.plusDays(1);
        }

        System.out.printf("En el año %d hay %d domingos", yearInt, domingos);

    }

}
