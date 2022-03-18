package csdaw.tema10.ejercicio13_v2;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class HabitacionSuite extends Habitacion {

    public HabitacionSuite(int numero) {
        super(numero);
    }

    @Override
    public double checkOut(LocalDate fechaSalida) {
        long dias = DAYS.between(super.fechaEntrada, fechaSalida);
        boolean estanciaLarga = dias >= 10;
        double total = dias * 200;
        if(estanciaLarga) total *= 0.80;
        return total;
    }
}
