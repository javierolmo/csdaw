package csdaw.tema10.ejercicio13_v2;

import java.time.LocalDate;
import java.time.Month;

import static java.time.temporal.ChronoUnit.DAYS;

public class HabitacionDoble extends Habitacion {

    public HabitacionDoble(int numero) {
        super(numero);
    }

    @Override
    public double checkOut(LocalDate fechaSalida) {
        long dias = DAYS.between(super.fechaEntrada, fechaSalida);
        boolean tarifaVerano =
                fechaSalida.getMonth().equals(Month.APRIL) ||
                        fechaSalida.getMonth().equals(Month.JULY) ||
                        fechaSalida.getMonth().equals(Month.AUGUST);
        double total = dias * 100;
        if(tarifaVerano) total *= 1.20;
        return total;
    }
}
