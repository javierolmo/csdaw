package csdaw.tema9.ejercicio9;

import java.time.LocalDate;

public abstract class Paciente {

    private String nombre;
    private LocalDate fechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public abstract double facturar();
}
