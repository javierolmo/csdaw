package csdaw.tema8;

import java.time.LocalDate;

public class ConsultorExterno extends Trabajador {

    private int horasTrabajadas;
    private double salarioFinal;

    public ConsultorExterno(String id, String nombre, LocalDate fechaNacimiento) {
        super(id, nombre, fechaNacimiento, 0);
        this.horasTrabajadas = 0;
        this.salarioFinal = 0;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void calcularSalarioFinal(double costeHoraExtra) {
        salarioFinal = costeHoraExtra * horasTrabajadas;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "ConsultorExterno{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", salarioFinal=" + salarioFinal +
                '}';
    }
}
