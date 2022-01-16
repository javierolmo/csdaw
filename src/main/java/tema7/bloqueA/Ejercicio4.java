package tema7.bloqueA;

import java.util.Arrays;

public class Ejercicio4 {

    public static void main(String[] args) {

        TemperaturaMeses temperaturaMeses = new TemperaturaMeses();
        temperaturaMeses.llenarArrayEj4();
        temperaturaMeses.mostrarArrayConNombresMeses();
        temperaturaMeses.mostrarTemperaturaMaxima();
        System.out.println("Mes más frio: " + temperaturaMeses.mesMasFrio());
        System.out.println("Valores desplazados: " + Arrays.toString(temperaturaMeses.obtenerValoresDesplazados()));
    }


}
