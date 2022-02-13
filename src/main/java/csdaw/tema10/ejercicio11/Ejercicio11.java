package csdaw.tema10.ejercicio11;

public class Ejercicio11 {

    public static void main(String[] args) {

        TriAtleta_v2 triAtleta_v2 = new TriAtleta_v2(30, true);
        TriAtleta_v2b triAtleta_v2b = new TriAtleta_v2b(30, true);

        System.out.println("Salto de 100cm:");
        System.out.printf("Triatleta v2: %b | Triatleta v2b: %b\n", triAtleta_v2.saltaPertiga(100), triAtleta_v2b.saltaPertiga(100));

        System.out.println("Salto de 550cm:");
        System.out.printf("Triatleta v2: %b | Triatleta v2b: %b\n", triAtleta_v2.saltaPertiga(550), triAtleta_v2b.saltaPertiga(550));

        System.out.println("Salto de 560cm:");
        System.out.printf("Triatleta v2: %b | Triatleta v2b: %b\n", triAtleta_v2.saltaPertiga(560), triAtleta_v2b.saltaPertiga(560));

        System.out.println("Salto de 580cm:");
        System.out.printf("Triatleta v2: %b | Triatleta v2b: %b\n", triAtleta_v2.saltaPertiga(580), triAtleta_v2b.saltaPertiga(580));

        System.out.println("Salto de 700cm:");
        System.out.printf("Triatleta v2: %b | Triatleta v2b: %b\n", triAtleta_v2.saltaPertiga(700), triAtleta_v2b.saltaPertiga(700));


    }

}
