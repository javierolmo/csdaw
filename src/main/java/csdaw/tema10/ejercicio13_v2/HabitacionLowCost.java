package csdaw.tema10.ejercicio13_v2;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class HabitacionLowCost extends Habitacion {

    public HabitacionLowCost(int numero) {
        super(numero);
    }

    @Override
    public double checkOut(LocalDate fechaSalida) {
        if(super.ocupada) return -1;
        long dias = DAYS.between(super.fechaEntrada, fechaSalida);
        return dias * 50;
    }
}
