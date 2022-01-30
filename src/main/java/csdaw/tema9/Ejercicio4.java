package csdaw.tema9;

import csdaw.tema8.Figura2D_v8;
import csdaw.tema8.Rectangulo_v8;
import csdaw.tema8.TrianColor_v8;
import csdaw.tema8.Triangulo_v8;

import java.util.ArrayList;

public class Ejercicio4 {

    public static void main(String[] args) {
        ArrayList<Figura2D_v8> figuras = new ArrayList<>();
        figuras.add(new TrianColor_v8(10, 10, "Estilo", "Color", "Nombre"));
        figuras.add(new TrianColor_v8(5, 10, "Estilo", "Color", "Nombre"));
        figuras.add(new TrianColor_v8(10, 3, "Estilo", "Color", "Nombre"));
        figuras.add(new Triangulo_v8("Estilo", 10, 5, "Nombre"));
        figuras.add(new Triangulo_v8("Estilo", 2, 5, "Nombre"));
        figuras.add(new Triangulo_v8("Estilo", 8, 5, "Nombre"));
        figuras.add(new Rectangulo_v8(15, 30, "Nombre"));
        figuras.add(new Rectangulo_v8(15, 10, "Nombre"));
        figuras.add(new Rectangulo_v8(15, 5, "Nombre"));

        double areaTotal = 0;
        for (Figura2D_v8 figura : figuras) {
            if(figura instanceof TrianColor_v8) areaTotal += ((TrianColor_v8)figura).area();
            if(figura instanceof Triangulo_v8) areaTotal += ((Triangulo_v8)figura).area();
            if(figura instanceof Rectangulo_v8) areaTotal += figura.getAlto() * figura.getAncho();
            /*
                Como no todas tienen implementado el método area(), hay que tratar de diferente manera a cada instancia
                para poder calcular el área del rectángulo en caso de que hubiera figuras de tipo rectángulo
             */
        }

        int rectangulos = 0;
        int triangulos = 0;
        for (Figura2D_v8 figura : figuras) {
            if(figura instanceof TrianColor_v8 || figura instanceof Triangulo_v8) triangulos++;
            if(figura instanceof Rectangulo_v8) rectangulos++;
        } // Se debería aprovechar el for anterior para este apartado, pero lo separo por mantener algo más de orden
    }
}
