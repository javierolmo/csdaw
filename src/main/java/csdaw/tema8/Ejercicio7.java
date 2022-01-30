package csdaw.tema8;

public class Ejercicio7 {

    public static void main(String[] args) {

        Triangulo_v7 triangulo1 = new Triangulo_v7("isósceles", 10, 5);
        Triangulo_v7 triangulo2 = new Triangulo_v7(triangulo1);

        System.out.println("Área triángulo1: " + triangulo1.area());
        System.out.println("Área triángulo2: " + triangulo2.area());

    }
}
