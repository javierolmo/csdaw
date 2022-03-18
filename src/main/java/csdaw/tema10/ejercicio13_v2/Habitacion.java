package csdaw.tema10.ejercicio13_v2;

import java.time.LocalDate;

public abstract class Habitacion {

    public int numero;
    public boolean ocupada;
    public LocalDate fechaEntrada;

    public Habitacion(int numero) {
        this.numero = numero;
        this.ocupada = false;
        this.fechaEntrada = null;
    }

    public boolean checkIn(LocalDate fechaEntrada) {
        if(ocupada == true) {
            return false;
        } else {
            this.ocupada = true;
            this.fechaEntrada = fechaEntrada;
            return true;
        }
    }

    public abstract double checkOut(LocalDate fechaSalida);
}
