package tema8;

import java.time.LocalDate;

public class Asalariado extends Trabajador {

    private double salarioFinal;
    private int horasExtra;

    public Asalariado(String id, String nombre, LocalDate fechaNacimiento, double salarioBase) {
        super(id, nombre, fechaNacimiento, salarioBase);
        this.horasExtra = 0;
        this.salarioFinal = salarioBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public void calcularSalarioFinal(double precioHoraExtra) {
        double importeHorasExtra = horasExtra * precioHoraExtra;
        salarioFinal = getSalarioBase() + importeHorasExtra;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "Asalariado{" +
                "salarioFinal=" + salarioFinal +
                ", horasExtra=" + horasExtra +
                '}';
    }
}
