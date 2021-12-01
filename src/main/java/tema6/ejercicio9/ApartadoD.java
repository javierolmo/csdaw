package tema6.ejercicio9;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.YEARS;

public class ApartadoD {

    public static void main(String[] args) {

        int contadorBisiestos = 0;

        for(int i=1; i <=LocalDate.now().getYear(); i++) {
            if(LocalDate.of(i, 1, 1).isLeapYear()) {
                contadorBisiestos++;
            }
        }

        System.out.println("Cantidad de años bisiestos: " + contadorBisiestos);
    }

}
