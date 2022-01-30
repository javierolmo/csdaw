package csdaw.tema8;

import java.util.ArrayList;

public class Ejercicio8 {

    public static void main(String[] args) {

        ArrayList<Rectangulo_v8> listaRectangulos = new ArrayList<>();
        listaRectangulos.add(new Rectangulo_v8(10, 5, "Rectangulo"));
        listaRectangulos.add(new Rectangulo_v8(10, "Cuadrado"));
        listaRectangulos.add(new Rectangulo_v8(15, 10, "Rectangulo"));
        listaRectangulos.add(new Rectangulo_v8(15, "Cuadrado"));

        long cuadrados = listaRectangulos.stream().map(Rectangulo_v8::esCuadrado).count();
        System.out.printf("Hay %d cuadrados", cuadrados);

        TrianColor_v8 trianColor_v8 = new TrianColor_v8(10, 5, "isósceles", "rojo", "Triángulo Isósceles");
        System.out.println("Área del triángulo: " + trianColor_v8.area());

    }

}
