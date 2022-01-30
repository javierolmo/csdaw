package csdaw.tema9;

public class Ejercicio8 {

    public static void main(String[] args) {

        int entero1 = Consola.leerEntero();
        System.out.println("entero1: " + entero1);
        System.out.println("-----------------------------");

        int entero2 = Consola.leerEntero("Introduce entero2: ");
        System.out.println("entero2: " + entero2);
        System.out.println("-----------------------------");

        int entero3 = Consola.leerEntero("Introduce entero3: ", 1, 5);
        System.out.println("entero3: " + entero3);
        System.out.println("-----------------------------");


    }
}
