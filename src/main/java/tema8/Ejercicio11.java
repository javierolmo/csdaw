package tema8;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ejercicio11 {

    public static void main(String[] args) {

        ArrayList<Asalariado> asalariados = new ArrayList<>();
        ArrayList<ConsultorExterno> consultorExternos = new ArrayList<>();

        // Creación de asalariados
        asalariados.add(new Asalariado("1", "Nombre1", LocalDate.parse("1990-01-01"), 1000));
        asalariados.add(new Asalariado("2", "Nombre2", LocalDate.parse("1990-01-01"), 2000));
        asalariados.add(new Asalariado("3", "Nombre3", LocalDate.parse("1990-01-01"), 3000));

        // Creación de consultores
        consultorExternos.add(new ConsultorExterno("4", "Nombre4", LocalDate.parse("1990-01-01")));
        consultorExternos.add(new ConsultorExterno("5", "Nombre5", LocalDate.parse("1990-01-01")));
        consultorExternos.add(new ConsultorExterno("6", "Nombre6", LocalDate.parse("1990-01-01")));

        // Modificar horas extras/trabajadas
        asalariados.get(0).setHorasExtra(30);
        asalariados.get(1).setHorasExtra(20);
        asalariados.get(2).setHorasExtra(10);
        consultorExternos.get(0).setHorasTrabajadas(50);
        consultorExternos.get(1).setHorasTrabajadas(40);
        consultorExternos.get(2).setHorasTrabajadas(30);

        // Modificar precio hora extra / trabajada
        asalariados.get(0).calcularSalarioFinal(20);
        asalariados.get(1).calcularSalarioFinal(20);
        asalariados.get(2).calcularSalarioFinal(20);
        consultorExternos.get(0).calcularSalarioFinal(100);
        consultorExternos.get(1).calcularSalarioFinal(100);
        consultorExternos.get(2).calcularSalarioFinal(100);

        // Calcular coste final
        double costeTotal = 0;

        for (Asalariado asalariado : asalariados) {
            costeTotal += asalariado.getSalarioFinal();
            System.out.println(asalariado.toString());
        }

        for (ConsultorExterno consultorExterno : consultorExternos) {
            costeTotal += consultorExterno.getSalarioFinal();
            System.out.println(consultorExterno.toString());
        }
        System.out.println("Coste total: " + costeTotal);

        /*
            Si tuviéramos un array con empleados de ambos tipos podríamos calcular el coste final de todos los salarios
            recorriendo un único array.
         */


    }


}
