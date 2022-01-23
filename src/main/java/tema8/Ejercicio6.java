package tema8;

public class Ejercicio6 {

    public static void main(String[] args) {
        TrianColor_v6 triangulo = new TrianColor_v6(10, 5, "TrianColor", "rojo");
        triangulo.verEstilo();
        triangulo.verDim();
        double area = triangulo.area();
        System.out.printf("Área del triangulo: %.2f", area);
    }
}
