package csdaw.tema8;

public class Ejercicio5 {

    public static void main(String[] args) {
        Triangulo_v5 triangulo = new Triangulo_v5(10);
        triangulo.verEstilo();
        triangulo.verDim();
        double area = triangulo.area();
        System.out.printf("Área del triangulo: %.2f", area);
    }

}
