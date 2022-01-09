package tema7;

import java.util.Arrays;

public class Ejercicio3 {


    public static void main(String[] args) {

        TemperaturaMeses temperaturaMeses = new TemperaturaMeses();
        temperaturaMeses.llenarArrayAleatorioSinDuplicados();
        temperaturaMeses.mostrarArray();
        System.out.println("Temperaturas duplicadas: " + temperaturaMeses.temperaturasDuplicadas());

    }



}
