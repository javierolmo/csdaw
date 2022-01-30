package csdaw.tema7.bloqueA;

public class Ejercicio2 {

    public static void main(String[] args) {

        TemperaturaMeses temperaturaMeses = new TemperaturaMeses();
        temperaturaMeses.llenarArrayAleatorio();
        temperaturaMeses.mostrarArray();
        System.out.println("Temperatura media: " + temperaturaMeses.calcularTemperaturaMedia());
        System.out.println("Meses de más de 30 grados: " + temperaturaMeses.mesesMasDe30Grados().toString());
        System.out.println("Existe mes mayor de  30 grados (con break): " + temperaturaMeses.existeMesMayor30ConBreak());
        System.out.println("Existe mes mayor de  30 grados (sin break): " + temperaturaMeses.existeMesMayor30SinBreak());
        System.out.println("Repetidos: " + temperaturaMeses.temperaturasDuplicadas());

    }

}
