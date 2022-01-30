package csdaw.tema6.ejercicio8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EjemplarLibro {

    private String titulo;
    private LocalDate fechaAdquisicion;
    private int numeroEjemplar;
    private boolean prestado;

    public EjemplarLibro (String titulo) {
        this.titulo = titulo;
        this.fechaAdquisicion = LocalDate.now();
        this.numeroEjemplar = 1;
        this.prestado = false;
    }

    public EjemplarLibro (EjemplarLibro ejemplarLibro) {
        this.titulo = ejemplarLibro.getTitulo();
        this.fechaAdquisicion = ejemplarLibro.getFechaAdquisicion();
        this.numeroEjemplar = ejemplarLibro.getNumeroEjemplar() + 1;
        this.prestado = ejemplarLibro.isPrestado();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public int getNumeroEjemplar() {
        return numeroEjemplar;
    }

    public void setNumeroEjemplar(int numeroEjemplar) {
        this.numeroEjemplar = numeroEjemplar;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public boolean prestar() {
        if (prestado) {
            return false;
        } else {
            prestado = true;
            return true;
        }
    }

    public boolean devolver() {
        if (prestado) {
            prestado = false;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return titulo + " (" + fechaAdquisicion.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + ") [" + numeroEjemplar + "]";
    }
}
