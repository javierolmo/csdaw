package csdaw.tema9;

import csdaw.tema8.Asalariado;
import csdaw.tema8.ConsultorExterno;
import csdaw.tema8.Trabajador;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ejercicio7 {

    public static void main(String[] args) {

        ArrayList<Trabajador> trabajadores = new ArrayList<>();

        // Creación de asalariados
        trabajadores.add(new Asalariado("1", "Nombre1", LocalDate.parse("1990-01-01"), 1000));
        trabajadores.add(new Asalariado("2", "Nombre2", LocalDate.parse("1990-01-01"), 2000));
        trabajadores.add(new Asalariado("3", "Nombre3", LocalDate.parse("1990-01-01"), 3000));

        // Creación de consultores
        trabajadores.add(new ConsultorExterno("4", "Nombre4", LocalDate.parse("1990-01-01")));
        trabajadores.add(new ConsultorExterno("5", "Nombre5", LocalDate.parse("1990-01-01")));
        trabajadores.add(new ConsultorExterno("6", "Nombre6", LocalDate.parse("1990-01-01")));

        for (Trabajador trabajador : trabajadores) {
            if(trabajador instanceof Asalariado) {
                Asalariado asalariado = (Asalariado) trabajador;
                asalariado.setHorasExtra(asalariado.getHorasExtra() + 1);
            } else if(trabajador instanceof ConsultorExterno) {
                ConsultorExterno consultorExterno = (ConsultorExterno) trabajador;
                consultorExterno.setHorasTrabajadas(consultorExterno.getHorasTrabajadas() + 1);
            }
        }

        for (Trabajador trabajador : trabajadores) {
            if(trabajador instanceof Asalariado) {
                Asalariado asalariado = (Asalariado) trabajador;
                asalariado.calcularSalarioFinal(20);
            } else if(trabajador instanceof ConsultorExterno) {
                ConsultorExterno consultorExterno = (ConsultorExterno) trabajador;
                consultorExterno.calcularSalarioFinal(100);
            }
        }

        double gasto = 0;
        for (Trabajador trabajador : trabajadores) {
            if(trabajador instanceof Asalariado) {
                Asalariado asalariado = (Asalariado) trabajador;
                gasto += asalariado.getSalarioFinal();
            } else if(trabajador instanceof ConsultorExterno) {
                ConsultorExterno consultorExterno = (ConsultorExterno) trabajador;
                gasto += consultorExterno.getSalarioFinal();
            }
        }

        System.out.printf("Gasto final: %.2f", gasto);

    }
}
