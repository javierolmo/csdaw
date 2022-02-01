package csdaw.tema9.ejercicio9;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.YEARS;

public class PacienteRevision extends Paciente {

    private LocalDate fechaUltimaVisita;

    public LocalDate getFechaUltimaVisita() {
        return fechaUltimaVisita;
    }

    public void setFechaUltimaVisita(LocalDate fechaUltimaVisita) {
        this.fechaUltimaVisita = fechaUltimaVisita;
    }

    @Override
    public double facturar() {
        return YEARS.between(this.getFechaNacimiento(), LocalDate.now()) >= 65? 30: 50;
    }
}
