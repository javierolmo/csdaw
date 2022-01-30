package csdaw.tema9;

import csdaw.tema8.Figura2D_v8;
import csdaw.tema8.Triangulo_v8;

public class Ejercicio1 {

    public static void main(String[] args) {
        Figura2D_v8 triangulo = new Triangulo_v8("isósceles", 5, 10, "Triángulo1");
        triangulo.verDim();
        System.out.println("Área: " + ((Triangulo_v8) triangulo).area());
        // Figura2D no tiene un método para cálculo del área, así que utilizamos el de la clase hija
    }

}
